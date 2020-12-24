package com.amazonaws.services.dynamodbv2.datamodeling.util;

import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Caio Northfleet (caio.northfleet@aquiris.com.br)
 * @since 19/08/2016
 */
class FieldUtils {
  private static final Logger logger = LoggerFactory.getLogger(FieldUtils.class);

  private static final String GETTER_PREFIX = "get";

  /**
   * Retrieve the field name of the provided class whose getter method has the given annotation.
   *
   * @param clazz           The field class.
   * @param annotationClass The annotation class.
   * @return the field name or null if no field was found with the given annotation.
   */
  public static <T, A extends Annotation> String getFieldName(Class<T> clazz,
                                                              Class<A> annotationClass) {
    Method[] entityMethods = clazz.getMethods();
    for (Method entityMethod : entityMethods) {
      if (entityMethod.getName().startsWith(GETTER_PREFIX)
          && entityMethod.isAnnotationPresent(annotationClass)) {
        return discoverFieldName(annotationClass, entityMethod);
      }
    }
    return null;
  }

  /**
   * Retrieve the field name and value of the provided entity whose getter method has the given
   * annotation. Note this method only works for String fields.
   *
   * @param entity          The field entity.
   * @param annotationClass The annotation class.
   * @return the field name and value or null if no field was found with the given annotation.
   */
  public static <T, A extends Annotation> Pair<String, String> getFieldNameAndValue(
      T entity, Class<A> annotationClass) {
    Method[] entityMethods = entity.getClass().getMethods();
    for (Method entityMethod : entityMethods) {
      if (entityMethod.getName().startsWith(GETTER_PREFIX)
          && entityMethod.isAnnotationPresent(annotationClass)) {
        try {
          Object value = entityMethod.invoke(entity);
          if (value != null && value instanceof String) {
            String attributeName = discoverFieldName(annotationClass, entityMethod);
            if (attributeName != null) {
              return Pair.of(attributeName, (String) value);
            }
          }
        } catch (IllegalAccessException ex) {
          logger.debug("Reflection fail", ex);
          break;
        } catch (InvocationTargetException ex) {
          logger.debug("Reflection fail", ex);
          break;
        }
      }
    }
    return null;
  }

  /**
   * Checks whether or not the field of the given entity has a getter which is annotated with
   * provided annotation.
   *
   * @param entity          The field entity.
   * @param field           The field.
   * @param annotationClass The annotation class.
   * @return whether or not the given entity field is annotated with the provided annotation.
   */
  public static <T, A extends Annotation> boolean isFieldGetterAnnotatedWith(
      T entity, Field field, Class<A> annotationClass) {
    Method[] entityMethods = entity.getClass().getMethods();
    for (Method entityMethod : entityMethods) {
      if (entityMethod.getName().startsWith(GETTER_PREFIX)
          && entityMethod.isAnnotationPresent(annotationClass)
          && field.getName().equals(removePrefixFromGetterMethod(entityMethod.getName()))) {
        return true;
      }
    }
    return false;
  }

  private static <A extends Annotation> String discoverFieldName(Class<A> annotationClass,
                                                                 Method getterMethod) {
    try {
      Method attributeNameMethod = annotationClass.getMethod("attributeName");
      A annotation = getterMethod.getAnnotation(annotationClass);
      Object attributeName = attributeNameMethod.invoke(annotation);
      if (attributeName != null && attributeName instanceof String
          && !((String) attributeName).isEmpty()) {
        return (String) attributeName;
      } else {
        return removePrefixFromGetterMethod(getterMethod.getName());
      }
    } catch (NoSuchMethodException ex) {
      logger.debug("Reflection fail", ex);
    } catch (IllegalAccessException ex) {
      logger.debug("Reflection fail", ex);
    } catch (InvocationTargetException ex) {
      logger.debug("Reflection fail", ex);
    }
    return null;
  }

  private static String removePrefixFromGetterMethod(String string) {
    char[] chars = string.substring(GETTER_PREFIX.length()).toCharArray();
    chars[0] = Character.toLowerCase(chars[0]);
    return new String(chars);
  }
}
