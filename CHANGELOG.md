# __1.11.156__ __2017-06-27__
## __AWS Service Catalog__
  - ### Features
    - Proper tagging of resources is critical to post-launch operations such as billing, cost allocation, and resource management. By using Service Catalog's TagOption Library, administrators can define a library of re-usable TagOptions that conform to company standards, and associate these with Service Catalog portfolios and products. Learn how to move your current tags to the new library, create new TagOptions, and view and associate your library items with portfolios and products. Understand how to ensure that the right tags are created on products launched through Service Catalog and how to provide users with defined selectable tags.

# __1.11.155__ __2017-06-23__
## __AWS Lambda__
  - ### Features
    - The Lambda Invoke API will now throw new exception InvalidRuntimeException (status code 502) for invokes with deprecated runtimes.

# __1.11.154__ __2017-06-22__
## __AWS CodePipeline__
  - ### Features
    - A new API, ListPipelineExecutions, enables you to retrieve summary information about the most recent executions in a pipeline, including pipeline execution ID, status, start time, and last updated time. You can request information for a maximum of 100 executions. Pipeline execution data is available for the most recent 12 months of activity.

## __AWS Database Migration Service__
  - ### Features
    - Added tagging for DMS certificates.

## __Amazon Lightsail__
  - ### Features
    - This release adds a new nextPageToken property to the result of the GetOperationsForResource API. Developers can now get the next set of items in a list by making subsequent calls to GetOperationsForResource API with the token from the previous call. This release also deprecates the nextPageCount property, which previously returned null (use the nextPageToken property instead). This release also deprecates the customImageName property on the CreateInstancesRequest class, which was previously ignored by the API.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports multivalue answers in response to DNS queries, which lets you route traffic approximately randomly to multiple resources, such as web servers. Create one multivalue answer record for each resource and, optionally, associate an Amazon Route 53 health check with each record, and Amazon Route 53 responds to DNS queries with up to eight healthy records.

## __Elastic Load Balancing__
  - ### Features
    - Add retry error state to InstanceInService waiter for ElasticLoadBalancer

# __1.11.153__ __2017-06-21__
## __AWS WAF__
  - ### Features
    - You can now create, edit, update, and delete a new type of WAF rule with a rate tracking component.

## __AWS WAF Regional__
  - ### Features
    - You can now create, edit, update, and delete a new type of WAF rule with a rate tracking component.

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Amazon DynamoDB Accelerator (DAX) is a fully managed, highly available, in-memory cache for DynamoDB that delivers up to a 10x performance improvement - from milliseconds to microseconds - even at millions of requests per second. DAX does all the heavy lifting required to add in-memory acceleration to your DynamoDB tables, without requiring developers to manage cache invalidation, data population, or cluster management.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding hierarchy support to the SSM Parameter Store API. Added support tor tagging. New APIs: GetParameter - retrieves one parameter, DeleteParameters - deletes multiple parameters (max number 10), GetParametersByPath - retrieves parameters located in the hierarchy. Updated APIs: PutParameter - added ability to enforce parameter value by applying regex (AllowedPattern), DescribeParameters - modified to support Tag filtering.

# __1.11.152__ __2017-06-20__
## __Amazon WorkDocs__
  - ### Features
    - This release provides a new API to retrieve the activities performed by WorkDocs users.

# __1.11.151__ __2017-06-19__
## __AWS Organizations__
  - ### Features
    - Improvements to Exception Modeling

# __1.11.150__ __2017-06-16__
## __AWS X-Ray__
  - ### Features
    - Add a response time histogram to the services in response of GetServiceGraph API.

# __1.11.149__ __2017-06-15__
## __AWS IoT__
  - ### Features
    - Revert the last release: remove CertificatePem from DescribeCertificate API.

## __AWS Service Catalog__
  - ### Features
    - Added ProvisioningArtifactSummaries to DescribeProductAsAdmin's output to show the provisioning artifacts belong to the product. Allow filtering by SourceProductId in SearchProductsAsAdmin for AWS Marketplace products. Added a verbose option to DescribeProvisioningArtifact to display the CloudFormation template used to create the provisioning artifact.Added DescribeProvisionedProduct API. Changed the type of ProvisionedProduct's Status to be distinct from Record's Status. New ProvisionedProduct's Status are AVAILABLE, UNDER_CHANGE, TAINTED, ERROR. Changed Record's Status set of values to CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED.

## __Amazon EC2__
  - ### Features
    - Adds API to describe Amazon FPGA Images (AFIs) available to customers, which includes public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.

## __Amazon EC2 Container Service__
  - ### Features
    - Added support for cpu, memory, and memory reservation container overrides on the RunTask and StartTask APIs.

# __1.11.148__ __2017-06-14__
## __Amazon CloudDirectory__
  - ### Features
    - Documentation update for Cloud Directory

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of read and write throughput capacity for DynamoDB tables and global secondary indexes.

# __1.11.147__ __2017-06-13__
## __AWS Config__
  - ### Features
    - With this release AWS Config supports the Amazon CloudWatch alarm resource type.

# __1.11.146__ __2017-06-12__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - API Update for RDS: this update enables copy-on-write, a new Aurora MySQL Compatible Edition feature that allows users to restore their database, and support copy of TDE enabled snapshot cross region.

# __1.11.145__ __2017-06-09__
## __AWS OpsWorks__
  - ### Features
    - Tagging Support for AWS OpsWorks Stacks

# __1.11.144__ __2017-06-08__
## __AWS IoT__
  - ### Features
    - In addition to using certificate ID, AWS IoT customers can now obtain the description of a certificate with the certificate PEM.

## __Amazon Pinpoint__
  - ### Features
    - Starting today Amazon Pinpoint adds SMS Text and Email Messaging support in addition to Mobile Push Notifications, providing developers, product managers and marketers with multi-channel messaging capabilities to drive user engagement in their applications. Pinpoint also enables backend services and applications to message users directly and provides advanced user and app analytics to understand user behavior and messaging performance.

## __Amazon Rekognition__
  - ### Features
    - API Update for AmazonRekognition: Adding RecognizeCelebrities API

# __1.11.143__ __2017-06-07__
## __AWS CodeBuild__
  - ### Features
    - Add support to APIs for privileged containers. This change would allow performing privileged operations like starting the Docker daemon inside builds possible in custom docker images.

## __AWS Greengrass__
  - ### Features
    - AWS Greengrass is software that lets you run local compute, messaging, and device state synchronization for connected devices in a secure way. With AWS Greengrass, connected devices can run AWS Lambda functions, keep device data in sync, and communicate with other devices securely even when not connected to the Internet. Using AWS Lambda, Greengrass ensures your IoT devices can respond quickly to local events, operate with intermittent connections, and minimize the cost of transmitting IoT data to the cloud.

# __1.11.142__ __2017-06-06__
## __AWS Certificate Manager__
  - ### Features
    - Documentation update for AWS Certificate Manager.

## __AWS IoT__
  - ### Features
    - Update client side validation for SalesForce action.

## __Amazon CloudFront__
  - ### Features
    - Doc update to fix incorrect prefix in S3OriginConfig

# __1.11.141__ __2017-06-05__
## __AWS IoT__
  - ### Features
    -  Added Salesforce action to IoT Rules Engine.

## __Amazon AppStream__
  - ### Features
    - AppStream 2.0 Custom Security Groups allows you to easily control what network resources your streaming instances and images have access to. You can assign up to 5 security groups per Fleet to control the inbound and outbound network access to your streaming instances to specific IP ranges, network protocols, or ports.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug where a bucket's region is not marshalled from a 301 error response if it includes a body. Fixes [#1151](https://github.com/aws/aws-sdk-java/issues/1151).

## __Auto Scaling__
  - ### Features
    - Autoscaling resource model update.

# __1.11.140__ __2017-06-02__
## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics publishes error messages CloudWatch logs in case of application misconfigurations

## __Amazon S3__
  - ### Bugfixes
    - Fixes bug where TransferManager#download fails when requesterPays is enabled on GetObjectRequest. https://github.com/aws/aws-sdk-java/issues/1175

## __Amazon WorkDocs__
  - ### Features
    - This release includes new APIs to manage tags and custom metadata on resources and also new APIs to add and retrieve comments at the document level.

# __1.11.139__ __2017-06-01__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy has improved how it manages connections to GitHub accounts and repositories. You can now create and store up to 25 connections to GitHub accounts in order to associate AWS CodeDeploy applications with GitHub repositories. Each connection can support multiple repositories. You can create connections to up to 25 different GitHub accounts, or create more than one connection to a single account. The ListGitHubAccountTokenNames command has been introduced to retrieve the names of stored connections to GitHub accounts that you have created. The name of the connection to GitHub used for an AWS CodeDeploy application is also included in the ApplicationInfo structure.  Two new fields, lastAttemptedDeployment and lastSuccessfulDeployment, have been added to DeploymentGroupInfo to improve the handling of deployment group information in the AWS CodeDeploy console. Information about these latest deployments can also be retrieved using the GetDeploymentGroup and BatchGetDeployment group requests. Also includes a region update  (us-gov-west-1).

## __Amazon Cognito Identity Provider__
  - ### Features
    - Added support within Amazon Cognito User Pools for 1) a customizable hosted UI for user sign up and sign in and 2) integration of external identity providers.

## __Amazon Lex Model Building Service__
  - ### Features
    - Updated documentation and added examples for Amazon Lex Model Building Service.

## __Elastic Load Balancing__
  - ### Features
    - Update the existing DescribeRules API to support pagination.

# __1.11.138__ __2017-05-31__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Amazon RDS customers can now easily and quickly stop and start their DB instances.

# __1.11.137__ __2017-05-30__
## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory has launched support for Typed Links, enabling customers to create object-to-object relationships that are not hierarchical in nature. Typed Links enable customers to quickly query for data along these relationships. Customers can also enforce referential integrity using Typed Links, ensuring data in use is not inadvertently deleted.

# __1.11.136__ __2017-05-25__
## __Amazon AppStream__
  - ### Features
    - Support added for persistent user storage, backed by S3.

## __Amazon Rekognition__
  - ### Features
    - Updated the CompareFaces API response to include orientation information, unmatched faces, landmarks, pose, and quality of the compared faces.

# __1.11.135__ __2017-05-24__
## __AWS Identity and Access Management (IAM)__
  - ### Features
    - The unique ID and access key lengths were extended from 32 to 128

## __AWS Security Token Service (STS)__
  - ### Features
    - The unique ID and access key lengths were extended from 32 to 128.

## __AWS Storage Gateway__
  - ### Features
    - Two Storage Gateway data types, Tape and TapeArchive, each have a new response element, TapeUsedInBytes. This element helps you manage your virtual tapes. By using TapeUsedInBytes, you can see the amount of data written to each virtual tape.

# __1.11.134__ __2017-05-23__
## __AWS Database Migration Service__
  - ### Features
    - This release adds support for using Amazon S3 and Amazon DynamoDB as targets for database migration, and using MongoDB as a source for database migration. For more information, see the AWS Database Migration Service documentation.

# __1.11.133__ __2017-05-22__
## __AWS Resource Groups Tagging API__
  - ### Features
    - You can now specify the number of resources returned per page in GetResources operation, as an optional parameter, to easily manage the list of resources returned by your queries.

# __1.11.132__ __2017-05-18__
## __Amazon Athena__
  - ### Features
    - This release adds support for Amazon Athena. Amazon Athena is an interactive query service that makes it easy to analyze data in Amazon S3 using standard SQL. Athena is serverless, so there is no infrastructure to manage, and you pay only for the queries that you run.

## __Amazon Lightsail__
  - ### Features
    - This release adds new APIs that make it easier to set network port configurations on Lightsail instances. Developers can now make a single request to both open and close public ports on an instance using the PutInstancePublicPorts operation.

# __1.11.131__ __2017-05-17__
## __Amazon CloudWatch Events__
  - ### Features
    - Various CloudWatch Events documentation updates.

## __Amazon CloudWatch Logs__
  - ### Features
    - Various CloudWatch Logs documentation updates.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new German voice "Vicki"

## __Auto Scaling__
  - ### Features
    - Various Auto Scaling documentation updates

# __1.11.130__ __2017-05-16__
## __AWS CodeDeploy__
  - ### Features
    - This release introduces the previousRevision field in the responses to the GetDeployment and BatchGetDeployments actions. previousRevision provides information about the application revision that was deployed to the deployment group before the most recent successful deployment.  Also, the fileExistsBehavior parameter has been added for CreateDeployment action requests. In the past, if the AWS CodeDeploy agent detected files in a target location that weren't part of the application revision from the most recent successful deployment, it would fail the current deployment by default. This new parameter provides options for how the agent handles these files: fail the deployment, retain the content, or overwrite the content.

## __AWS Key Management Service (KMS)__
  - ### Features
    - Update documentation for KMS.

## __AWS Step Functions__
  - ### Bugfixes
    - Fixes [Issue 1150]( https://github.com/aws/aws-sdk-java/issues/1150) by preserving explicit null values for InputPath, OutputPath, and ResultPath.

## __Amazon GameLift__
  - ### Features
    - Allow developers to specify how metrics are grouped in CloudWatch for their GameLift fleets. Developers can also specify how many concurrent game sessions activate on a per-instance basis.

## __Amazon Inspector__
  - ### Features
    - Adds ability to produce an assessment report that includes detailed and comprehensive results of a specified assessment run.

## __Amazon S3__
  - ### Bugfixes
    - All API methods in AmazonS3Client now call beforeClientExecution in the RequestHandler2 interface.

# __1.11.129__ __2017-05-15__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - UpdateAssociation API now supports updating document name and targets of an association. GetAutomationExecution API can return FailureDetails as an optional field to the StepExecution Object, which contains failure type, failure stage as well as other failure related information for a failed step.

# __1.11.128__ __2017-05-11__
## __AWS Organizations__
  - ### Features
    - AWS Organizations APIs that return an Account object now include the email address associated with the account's root user.

## __Amazon Lex Model Building Service__
  - ### Features
    - Releasing new DeleteBotVersion, DeleteIntentVersion and DeleteSlotTypeVersion APIs.

## __Elastic Load Balancing__
  - ### Features
    - Add a new API to allow customers to describe their account limits, such as load balancer limit, target group limit etc.

# __1.11.127__ __2017-05-09__
## __AWS SDK for Java__
  - ### Features
    - This change includes documentation updates for Amazon Workspaces and AWS CodeStar

# __1.11.126__ __2017-05-04__
## __AWS Lambda__
  - ### Features
    - Support for UpdateFunctionCode DryRun option

## __AWS Marketplace Entitlement Service__
  - ### Features
    - AWS Marketplace Entitlement Service enables AWS Marketplace sellers to determine the capacity purchased by their customers.

## __AWS Organizations__
  - ### Bugfixes
    - Updated model classes to match AWS Organizations API [specification](http://docs.aws.amazon.com/organizations/latest/APIReference/Welcome.html). This includes the following updates to the model objects:

      #### Renamed Operation
      * `AWSOrganizations.enableFullControl` renamed to `AWSOrganizations.enableAllFeatures`
        * Previously this operation would never have completed successfully.

      #### Operation Exceptions Changed
      * `AWSOrganizations.acceptHandshake`
         * Exceptions Removed:
            * `AlreadyInOrganizationException` 
            * `ConstraintViolationException`
            * `OrganizationFromDifferentSellerOfRecordException`
         * Exceptions Added:
            * `HandshakeConstraintViolationException` (new to model)
            * `HandshakeAlreadyInStateException` (new to model)
            * `ConcurrentModificationException`
      * `AWSOrganizations.cancelHandshake`
         * Exception Added:
            * `HandshakeAlreadyInStateException` (new to model)
      * `AWSOrganizations.declineHandshake`
         * Exception Added:
            * `HandshakeAlreadyInStateException` (new to model)
      * `AWSOrganizations.createOrganization`
         * Exception Removed:
            * `PaymentInstrumentRequiredException` 
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.createPolicy`
         * Exception Added:
            * `MalformedPolicyDocumentException`
      * `AWSOrganizations.moveAccount`
         * Exception Added:
            * `DuplicateAccountException`
      * `AWSOrganizations.inviteAccountToOrganization`
         * Exceptions Removed:
            * `ConstraintViolationException`
            * `InvitationsDisabledDuringOrganizationModeChangeException`
         * Exception Added:
            * `HandshakeConstraintViolationException`
      * `AWSOrganizations.leaveOrganization`
         * Exception Removed:
            * `AccountCannotLeaveOrganizationException`
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.removeAccountFromOrganization`
         * Exception Removed:
            * `AccountCannotLeaveOrganizationException`
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.updatePolicy`
         * Exception Added:
            * `ConstraintViolationException`

      #### Deprecated Exceptions
      The following exceptions are no longer in use and have been deprecated:
      * `AccountCannotLeaveOrganizationException`
      * `FullControlAlreadyEnabledException`
      * `PaymentInstrumentRequiredException`
      * `OrganizationFromDifferentSellerOfRecordException`
      * `InvitationsDisabledDuringOrganizationModeChangeException`

      #### Model Changes
      * `mode` property on `Organization` object renamed to `featureSet`
      * `mode` property on `CreateOrganizationRequest` object renamed to `featureSet`
      * Enum `ActionType` values renamed:
        * `ENABLE_FULL_CONTROL` renamed to `ENABLE_ALL_FEATURES`
        * `APPROVE_FULL_CONTROL` renamed to `APPROVE_ALL_FEATURES`
      * Enum `OrganizationMode` removed

## __Amazon EC2 Container Service__
  - ### Features
    - Exposes container instance registration time in ECS:DescribeContainerInstances.

## __Amazon Relational Database Service (RDS)__
  - ### Bugfixes
    - Fixed the DBInstanceAvailable waiter. Previously it would always throw a NullPointerException.

## __Amazon S3__
  - ### Features
    - Added the ability to specify a filter to `TransferManager`'s `downloadDirectory` operation.

  - ### Bugfixes
    - Fixed possible security issue in `TransferManager`s `downloadDirectory` operation where files could be downloaded to a directory outside the destination directory if the key contained relative paths.

# __1.11.125__ __2017-04-28__
## __AWS Cloud Formation__
  - ### Features
    - API update for CloudFormation: New optional parameter ClientRequestToken which can be used as an idempotency token to safely retry certain operations as well as tagging StackEvents.

## __Amazon Import/Export Snowball__
  - ### Features
    - The Snowball API has a new exception that can be thrown for list operation requests.

## __Amazon Rekognition__
  - ### Features
    - Fix for missing file type check

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - The DescribeDBClusterSnapshots API now returns a SourceDBClusterSnapshotArn field which identifies the source DB cluster snapshot of a copied snapshot.

## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Adding server-side encryption (SSE) support to SQS by integrating with AWS KMS; adding new queue attributes to SQS CreateQueue, SetQueueAttributes and GetQueueAttributes APIs to support SSE.

# __1.11.124__ __2017-04-26__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - With Amazon Relational Database Service (Amazon RDS) running MySQL or Amazon Aurora, you can now authenticate to your DB instance using IAM database authentication.

# __1.11.123__ __2017-04-21__
## __AWS SDK for Java__
  - ### Features
    - Added the ability to override the proxy authentication methods used for requests.

## __Amazon AppStream__
  - ### Features
    - The new feature named "Default Internet Access" will enable Internet access from AppStream 2.0 instances - image builders and fleet instances. Admins will check a flag either through AWS management console for AppStream 2.0 or through API while creating an image builder or while creating/updating a fleet.

## __Amazon Kinesis__
  - ### Features
    - Adds a new waiter, StreamNotExists, to Kinesis.

## __Amazon S3__
  - ### Bugfixes
    - Fix bug to make standard AmazonS3ClientBuilder use S3CredentialsProviderChain instead of DefaultAWSCredentialsProviderChain.

# __1.11.122__ __2017-04-20__
## __AWS Device Farm__
  - ### Features
    - API Update for AWS Device Farm: Support for Deals and Promotions 

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect.

## __AWS Key Management Service (KMS)__
  - ### Features
    - Doc-only update for Key Management Service (KMS): Update docs for GrantConstraints and GenerateRandom

## __Amazon Route 53__
  - ### Features
    - SDK documentation now includes examples for ChangeResourceRecordSets for all types of resource record set, such as weighted, alias, and failover.

## __Amazon Route 53 Domains__
  - ### Features
    - Adding examples and other documentation updates.

## __Elastic Load Balancing__
  - ### Features
    - Adding LoadBalancersDeleted waiter for Elasticloadbalancingv2

# __1.11.121__ __2017-04-19__
## __AWS CodeStar__
  - ### Features
    - AWS CodeStar is a cloud-based service for creating, managing, and working with software development projects on AWS. An AWS CodeStar project creates and integrates AWS services for your project development toolchain. AWS CodeStar also manages the permissions required for project users.

## __AWS Identity and Access Management (IAM)__
  - ### Features
    - This changes introduces a new IAM role type, Service Linked Role, which works like a normal role but must be managed via services' control. 

## __AWS Lambda__
  - ### Features
    - Lambda integration with AWS X-Ray service to enable customers to enable tracing for the Lambda functions and send trace information to the AWS X-Ray service.

## __Amazon API Gateway__
  - ### Features
    - Add support for "embed" property.

## __Amazon EC2__
  - ### Features
    - Adds support for creating an Amazon FPGA Image (AFI) from a specified design checkpoint (DCP).

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex is a service for building conversational interfaces into any application using voice and text.

## __Amazon Polly__
  - ### Features
    - API Update for Amazon Polly: Add support for speech marks

## __Amazon Rekognition__
  - ### Features
    - Given an image, the API detects explicit or suggestive adult content in the image and returns a list of corresponding labels with confidence scores, as well as a taxonomy (parent-child relation) for each label.

# __1.11.120__ __2017-04-18__
## __AWS Lambda__
  - ### Features
    - You can use tags to group and filter your Lambda functions, making it easier to analyze them for billing allocation purposes. For more information, see Tagging Lambda Functions.  You can now write or upgrade your Lambda functions using Python version 3.6. For more information, see Programming Model for Authoring Lambda Functions in Python. Note: Features will be rolled out in the US regions on 4/19.

# __1.11.119__ __2017-04-11__
## __AWS Batch__
  - ### Features
    - API Update for AWS Batch: Customer provided AMI for MANAGED Compute Environment 

## __AWS OpsWorks__
  - ### Features
    - Cloudwatch Logs agent configuration can now be attached to OpsWorks Layers using CreateLayer and UpdateLayer. OpsWorks will then automatically install and manage the CloudWatch Logs agent on the instances part of the OpsWorks Layer.

## __Amazon API Gateway__
  - ### Features
    - API Gateway request validators

## __Amazon GameLift__
  - ### Features
    - Allows developers to utilize an improved workflow when calling our Queues API and introduces a new feature that allows developers to specify a maximum allowable latency per Queue.

## __Amazon S3__
  - ### Bugfixes
    - Fix a race condition that can occur with multiple calls to `CopyMonitor#setFuture` and `UploadMonitor#setFuture` that can cause an infinite loop in `AbstractTransfer#waitForCompletion`.

      This fixes [#1102](https://github.com/aws/aws-sdk-java/issues/1102)

# __1.11.118__ __2017-04-07__
## __Amazon Redshift__
  - ### Features
    - This update adds the GetClusterCredentials API which is used to get temporary login credentials to the cluster. AccountWithRestoreAccess now has a new member AccountAlias, this is the identifier of the AWS support account authorized to restore the specified snapshot. This is added to support the feature where the customer can share their snapshot with the Amazon Redshift Support Account without having to manually specify the AWS Redshift Service account ID on the AWS Console/API.

# __1.11.117__ __2017-04-06__
## __Elastic Load Balancing__
  - ### Features
    - Adds support for a new host-header condition in CreateRule and ModifyRule

# __1.11.116__ __2017-04-05__
## __Amazon ElastiCache__
  - ### Features
    - ElastiCache added support for testing the Elasticache Multi-AZ feature with Automatic Failover.

# __1.11.115__ __2017-04-04__
## __Amazon CloudWatch__
  - ### Features
    - Amazon Web Services announced the immediate availability of two additional alarm configuration rules for Amazon CloudWatch Alarms. The first rule is for configuring missing data treatment. Customers have the options to treat missing data as alarm threshold breached, alarm threshold not breached, maintain alarm state and the current default treatment. The second rule is for alarms based on percentiles metrics that can trigger unnecassarily if the percentile is calculated from a small number of samples. The new rule can treat percentiles with low sample counts as same as missing data. If the first rule is enabled, the same treatment will be applied when an alarm encounters a percentile with low sample counts.

# __1.11.114__ __2017-04-03__
## __Amazon Lex__
  - ### Features
    - Adds support to PostContent for speech input

# __1.11.113__ __2017-03-31__
## __Amazon CloudDirectory__
  - ### Features
    - ListObjectAttributes now supports filtering by facet.

# __1.11.112__ __2017-03-30__
## __AWS Cloud Formation__
  - ### Features
    - Adding paginators for ListExports and ListImports

## __AWS Resource Groups Tagging API__
  - ### Features
    - Resource Groups Tagging APIs can help you organize your resources and enable you to simplify resource management, access management, and cost allocation.

## __AWS Storage Gateway__
  - ### Features
    - File gateway mode in AWS Storage gateway provides access to objects in S3 as files on a Network File System (NFS) mount point. Once a file share is created, any changes made externally to the S3 bucket will not be reflected by the gateway. Using the cache refresh feature in this update, the customer can trigger an on-demand scan of the keys in their S3 bucket and refresh the file namespace cached on the gateway. It takes as an input the fileShare ARN and refreshes the cache for only that file share. Additionally there is new functionality on file gateway that allows you configure what squash options they would like on their file share, this allows a customer to configure their gateway to not squash root permissions. This can be done by setting options in NfsOptions for CreateNfsFileShare and UpdateNfsFileShare APIs.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now supports user configurable HTTP Read and Keep-Alive Idle Timeouts for your Custom Origin Servers

# __1.11.111__ __2017-03-28__
## __AWS Batch__
  - ### Features
    - Customers can now provide a retryStrategy as part of the RegisterJobDefinition and SubmitJob API calls. The retryStrategy object has a number value for attempts. This is the number of non successful executions before a job is considered FAILED. In addition, the JobDetail object now has an attempts field and shows all execution attempts.

## __Amazon EC2__
  - ### Features
    - Customers can now tag their Amazon EC2 Instances and Amazon EBS Volumes at the time of their creation. You can do this from the EC2 Instance launch wizard or through the RunInstances or CreateVolume APIs. By tagging resources at the time of creation, you can eliminate the need to run custom tagging scripts after resource creation. In addition, you can now set resource-level permissions on the CreateVolume, CreateTags, DeleteTags, and the RunInstances APIs. This allows you to implement stronger security policies by giving you more granular control over which users and groups have access to these APIs. You can also enforce the use of tagging and control what tag keys and values are set on your resources. When you combine tag usage and resource-level IAM policies together, you can ensure your instances and volumes are properly secured upon creation and achieve more accurate cost allocation reporting. These new features are provided at no additional cost. 

# __1.11.110__ __2017-03-27__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated validation rules for SendCommand and RegisterTaskWithMaintenanceWindow APIs.

# __1.11.109__ __2017-03-23__
## __AWS CloudTrail__
  - ### Features
    - Doc-only Update for CloudTrail: Add required parameters for GetEventSelectors and PutEventSelectors

## __Application Auto Scaling__
  - ### Features
    - Application AutoScaling is launching support for a new target resource (AppStream 2.0 Fleets) as a scalable target.

# __1.11.108__ __2017-03-22__
## __AWS Application Discovery Service__
  - ### Features
    - Adds export configuration options to the AWS Discovery Service API.

## __AWS Lambda__
  - ### Features
    - Adds support for new runtime Node.js v6.10 for AWS Lambda service

## __Elastic Load Balancing__
  - ### Features
    - Adding waiters for Elastic Load Balancing V2

# __1.11.107__ __2017-03-21__
## __AWS Direct Connect__
  - ### Deprecations
    - Deprecated DescribeConnectionLoa, DescribeInterconnectLoa, AllocateConnectionOnInterconnect and DescribeConnectionsOnInterconnect operations in favor of DescribeLoa, DescribeLoa, AllocateHostedConnection and DescribeHostedConnections respectively.

# __1.11.106__ __2017-03-20__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - This update adds a new data set, us_sales_and_use_tax_records, which enables AWS Marketplace sellers to programmatically access to their U.S. Sales and Use Tax report data.

## __AWS SDK for Java__
  - ### Bugfixes
    - `XMLStreamException`s encountered during XML response parsing that are caused by `IOException` are now wrapped in `IOException` before being thrown so that they are passed to the configured retry policies.

      This fixes [#1068](https://github.com/aws/aws-sdk-java/issues/1068).

## __Amazon API Gateway__
  - ### Bugfixes
    - Fix a bug that forced all requests to have an `Accept` header value of `application/json`.

## __Amazon EC2__
  - ### Deprecations
    - Deprecated no-args `revokeSecurityGroupIngress` method on `AmazonEC2` which will always fail. Fixes [#1059](https://github.com/aws/aws-sdk-java/issues/1059).

## __Amazon Pinpoint__
  - ### Features
    - Amazon Pinpoint User Segmentation * Added ability to segment endpoints by user attributes in addition to endpoint attributes.

      Amazon Pinpoint Event Stream Preview * Added functionality to publish raw app analytics and campaign events data as events streams to Kinesis and Kinesis Firehose * The feature provides developers with increased flexibility of exporting raw events to S3, Redshift, Elasticsearch using a Kinesis Firehose stream or enable real time event processing use cases using a Kinesis stream.

## __Amazon S3__
  - ### Bugfixes
    - Add the `sequencer` property to `S3ObjectEntity`.
    - Correctly unwraps nested levels of ExecutionException. Fixes [#1046](https://github.com/aws/aws-sdk-java/issues/1046).
    - Remove unnecessary call to `File#deleteOnExit()` in `MultiFileOutputStream`. This avoids leaking memory during long running applications that use `AmazonS3EncryptionClient#uploadObject`.

  - ### Deprecations
    - Deprecate the `S3ObjectEntity(String key, Long size, String eTag, String versionId)` constructor in favor of `S3ObjectEntity(String key, Long size, String eTag, String versionId, String sequencer)`.

## __Core__
  - ### Bugfixes
    - Adding `shutdown` to service waiters so that running `ExecutorService` can be shutdown from the client. Fixes [#1056](https://github.com/aws/aws-sdk-java/issues/1056). For example :

      ```java
      final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();
      try {
          ec2.waiters().instanceExists().runAsync(
              new WaiterParameters<>(new DescribeInstancesRequest()), 
              new WaiterHandler() {...}
          );
      } finally {
          ec2.shutdown(); //this will now shutdown the waiters as well as the client    
      }
      ```

# __1.11.105__ __2017-03-13__
## __AWS Device Farm__
  - ### Features
    - Network shaping allows users to simulate network connections and conditions while testing their Android, iOS, and web apps with AWS Device Farm.

## __Amazon CloudWatch Events__
  - ### Features
    - This update extends Target Data Type for configuring Target behavior during invocation.

# __1.11.104__ __2017-03-10__
## __Amazon EMR__
  - ### Features
    - This release includes support for instance fleets in Amazon EMR.

# __1.11.103__ __2017-03-09__
## __Amazon API Gateway__
  - ### Features
    - API Gateway has added support for ACM certificates on custom domain names. Both Amazon-issued certificates and uploaded third-part certificates are supported.

## __Amazon CloudDirectory__
  - ### Features
    - Introduces a new Cloud Directory API that enables you to retrieve all available parent paths for any type of object (a node, leaf node, policy node, and index node) in a hierarchy.

# __1.11.102__ __2017-03-08__
## __Core__
  - ### Bugfixes
    - Removing @JsonIgnore annotation introduced in 1.11.101 from Enum helper setters on models (eg https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-ecs/src/main/java/com/amazonaws/services/ecs/model/PortMapping.java#L351) as this caused a regression that affected some waiters.

# __1.11.101__ __2017-03-08__
## __AWS SDK for Java__
  - ### Features
    - The service models are no longer included with individual SDK client modules. This reduces the overall size of the SDK JARs as they can be quite large. For users wishing to inspect them, the model files may still be found in the [aws-java-sdk-models](./aws-java-sdk-models) module.

## __AWS Step Functions__
  - ### Bugfixes
    - Fixed an issue where a ChoiceState with no Default transition was throwing a NPE during validation.

## __Amazon WorkDocs__
  - ### Features
    - **(New Service)** The Administrative SDKs for Amazon WorkDocs provides full administrator level access to WorkDocs site resources, allowing developers to integrate their applications to manage WorkDocs users, content and permissions programmatically

# __1.11.100__ __2017-03-07__
## __Amazon RDS__
  - ### Features
    - Add support to using encrypted clusters as cross-region replication masters.
    - Update CopyDBClusterSnapshot API to support encrypted cross region copy of Aurora cluster snapshots.

# __1.11.99__ __2017-03-06__
## __AWS Budgets__
  - ### Features
    - When creating or editing a budget via the AWS Budgets API you can define notifications that are sent to subscribers when the actual or forecasted value for cost or usage exceeds the notificationThreshold associated with the budget notification object. Starting today, the maximum allowed value for the notificationThreshold was raised from 100 to 300. This change was made to give you more flexibility when setting budget notifications.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - OpsWorks for Chef Automate has added a new field "AssociatePublicIpAddress" to the CreateServer request, "CloudFormationStackArn" to the Server model and "TERMINATED" server state.

## __Amazon S3__
  - ### Features
    - Add improved detection of end-of-stream for object input streams and improved logging when the stream is aborted.

  - ### Bugfixes
    - Fix a bug in `TransferManager` where the Requester Pays flag set on a `CopyObjectRequest` or `PutObjectRequest` was not being preserved in the multipart copy or upload requests if the original request was promoted to multipart.

# __1.11.98__ __2017-02-27__
## __AWS Organizations__
  - ### Features
    - **(New Service)** AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an organization and centrally manage your accounts and their resources.

## __Amazon DynamoDB__
  - ### Features
    - Time to Live (TTL) is a feature that allows you to define when items in a table expire and can be purged from the database, so that you don't have to track expired data and delete it manually. With TTL enabled on a DynamoDB table, you can set a timestamp for deletion on a per-item basis, allowing you to limit storage usage to only those records that are relevant.

## __Amazon Identity and Access Management__
  - ### Features
    - This release adds support for AWS Organizations service control policies (SCPs) to SimulatePrincipalPolicy operation. If there are SCPs associated with the simulated user's account, their effect on the result is captured in the OrganizationDecisionDetail element in the EvaluationResult.

## __Amazon Mechanical Turk__
  - ### Features
    - **(New Service)** Amazon Mechanical Turk is a web service that provides an on-demand, scalable, human workforce to complete jobs that humans can do better than computers, for example, recognizing objects in photos.

# __1.11.97__ __2017-02-24__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixes a **serious regression** introduced in 1.11.94 where an overridden Content-Type was not being respected. This can cause issues with Amazon CloudSearch Domains, see [Issue [#1034](https://github.com/aws/aws-sdk-java/issues/1034)](https://github.com/aws/aws-sdk-java/issues/1034) for more details.

## __Amazon Elasticsearch Service__
  - ### Features
    - Added three new API calls to existing Amazon Elasticsearch service to expose Amazon Elasticsearch imposed limits to customers

# __1.11.96__ __2017-02-23__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed bug reported in [Issue #1018](https://github.com/aws/aws-sdk-java/issues/1018) where CRC32 was not always calculated correctly.

## __Amazon EC2__
  - ### Features
    - New EC2 I3 instance type

# __1.11.95__ __2017-02-22__
## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk adds support for creating and managing custom platform.

## __Amazon Cloud Directory__
  - ### Features
    - ListObjectAttributes documentation updated based on forum feedback

## __Amazon GameLift__
  - ### Features
    - Allow developers to configure global queues for creating GameSessions. Allow PlayerData on PlayerSessions to store player-specific data.

## __Amazon Route 53__
  - ### Features
    - Added support for operations CreateVPCAssociationAuthorization and DeleteVPCAssociationAuthorization to throw a ConcurrentModification error when a conflicting modification occurs in parallel to the authorizations in place for a given hosted zone.

# __1.11.94__ __2017-02-22__
## __AWS SDK for Java__
  - ### Features
    - Major refactoring of marshallers for all JSON based services. This may have different performance characteristics than previous releases.

## __Amazon EC2__
  - ### Features
    - Added the billingProduct parameter to the RegisterImage API.

# __1.11.93__ __2017-02-17__
## __AWS Direct Connect__
  - ### Features
    - This update will introduce the ability for Direct Connect customers to take advantage of Link Aggregation (LAG). This allows you to bundle many individual physical interfaces into a single logical interface, referred to as a LAG. This makes administration much simpler as the majority of configuration is done on the LAG while you are free to add or remove physical interfaces from the bundle as bandwidth demand increases or decreases. A concrete example of the simplification added by LAG is that customers need only a single BGP session as opposed to one session per physical connection.

# __1.11.92__ __2017-02-16__
## __AWS Config__
  - ### Features
    - AWS Config now supports a new test mode for the PutEvaluations API. Set the TestMode parameter to true in your custom rule to verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.

## __Amazon Cognito Identity__
  - ### Features
    - Allow createIdentityPool and updateIdentityPool API to set server side token check value on identity pool.

# __1.11.91__ __2017-02-15__
## __AWS Key Management Service__
  - ### Features
    - This release of AWS Key Management Service introduces the ability to tag keys. Tagging keys can help you organize your keys and track your KMS costs in the cost allocation report. This release also increases the maximum length of a key ID to accommodate ARNs that include a long key alias.

## __AWS SDK for Java for OSGi__
  - ### Bugfixes
    - Fixing [Issue #979](https://github.com/aws/aws-sdk-java/issues/979) by including the jmespath-java module in the OSGi bundle.

## __Amazon Glacier__
  - ### Features
    - Introduce `ArchiveTransferManaggerBuilder`. This builder allows using references to `AmazonGlacier`, `AmazonSNS` and AmazonSQS` rather than the concrete implementations.

  - ### Deprecations
    - Deprecate all constructors for `ArchiveTransferManager`.

# __1.11.90__ __2017-02-14__
## __Amazon EC2__
  - ### Features
    - Adds support for the new Modify Volumes apis.

# __1.11.89__ __2017-02-10__
## __AWS Storage Gateway__
  - ### Features
    - File gateway mode in AWS Storage gateway provides access to objects in S3 as files on a Network File System (NFS) mount point. This is done by creating Nfs file shares using existing APIs CreateNfsFileShare. Using the feature in this update, the customer can restrict the clients that have read/write access to the gateway by specifying the list of clients as a list of IP addresses or CIDR blocks. This list can be specified using the API CreateNfsFileShare while creating new file shares, or UpdateNfsFileShare while update existing file shares. To find out the list of clients that have access, the existing API DescribeNfsFileShare will now output the list of clients that have access.

# __1.11.88__ __2017-02-09__
## __Amazon EC2__
  - ### Features
    - This feature allows customers to associate an IAM profile to running instances that do not have any.

## __Amazon Rekognition__
  - ### Features
    - DetectFaces and IndexFaces operations now return an estimate of the age of the face as an age range.

# __1.11.87__ __2017-02-08__
## __Amazon Lex__
  - ### Features
    - **(NewService)** Amazon Lex is a service for building conversational interactions into any application using voice or text.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug in `TransferManager` where the [`TransferManager#copy`](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/transfer/TransferManager.html#copy-com.amazonaws.services.s3.model.CopyObjectRequest-) method was retrieving the metadata for the latest version of the source object even when supplying a specific version via `CopyObjectRequest#withSourceVersionId`.

      This fixes Issue [#1009](https://github.com/aws/aws-sdk-java/issues/1009).
    - Fix an integer overflow bug in [`LegacyS3ProgressListener`](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/model/LegacyS3ProgressListener.html). Note that this class is deprecated and users are discouraged from using it.

      This fixes Issue [#1008](https://github.com/aws/aws-sdk-java/issues/1008).

# __1.11.86__ __2017-01-26__
## __AWS CodeDeploy__
  - ### Features
    - This release of AWS CodeDeploy introduces support for blue/green deployments. In a blue/green deployment, the current set of instances in a deployment group is replaced by new instances that have the latest application revision installed on them. After traffic is rerouted behind a load balancer to the replacement instances, the original instances can be terminated automatically or kept running for other uses.

## __AWS Step Functions__
  - ### Features
    - Initial release of a fluent builder API to create state machine JSON documents.

## __Amazon CloudDirectory__
  - ### Features
    - **(New Service)** Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of cloud-scale web, mobile and IoT applications. This guide describes the Cloud Directory operations that you can call programatically and includes detailed information on data types and errors. For information about AWS Directory Services features, see [AWS Directory Service](https://aws.amazon.com/directoryservice/) and the [AWS Directory Service Administration Guide](http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds instance health check functionality to replace unhealthy EC2 Spot fleet instances with fresh ones.

## __Amazon Relational Database Service__
  - ### Features
    - Snapshot Engine Version Upgrade

## __Amazon S3__
  - ### Features
    - Adding [builder](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/AmazonS3EncryptionClientBuilder.java) for AmazonS3EncryptionClient.
    - Adding `disableParallelDownloads` option to [TransferManagerBuilder](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManagerBuilder.java#L400).

  - ### Deprecations
    - Constructors on the AmazonS3EncryptionClient have been deprecated in favor of using the AmazonS3EncryptionClientBuilder.

# __1.11.85__ __2017-01-25__
## __Amazon Relational Database Service__
  - ### Features
    - Cross Region Read Replica Copying

## __Elastic Load Balancing__
  - ### Features
    - Application Load Balancers now support native Internet Protocol version 6 (IPv6) in an Amazon Virtual Private Cloud (VPC). With this ability, clients can now connect to the Application Load Balancer in a dual-stack mode via either IPv4 or IPv6.

# __1.11.84__ __2017-01-24__
## __AWS CodeCommit__
  - ### Features
    - Now includes the option to view the differences between a commit and its parent commit.

## __AWS SDK for Java__
  - ### Features
    - Adding ability to set custom endpoint and signing region on client builders. For example

      ```java
      AmazonSNS client = AmazonSNSClientBuilder.standard().withEndpointConfiguration(new EndpointConfiguration("http://sns-custom-endpoint.amazon.com", "us-east-1")).build();
      ```
      _NB: This should only be used if a custom endpoint is required, the recommended approach for configuring a client is via set/withRegion on the builder_
    - Bundled dependency of AWS SDK jar available as a new maven module 'aws-java-sdk-bundle'. This module includes all service and dependent JARs with third-party libraries relocated to different namespaces.

  - ### Deprecations
    - Deprecating `com.amazonaws.regions.Region.createClient`, clients should be created via their builder implementation for example:

      ```java
      AmazonSNSClientBuilder.standard().withRegion(region).build();
      ```
    - Deprecating client constructors & mutation methods on clients (eg `setRegion`) in favor of creating a client via the client builders. The following mechanism for creating clients is deprecated:

      ```java
      AmazonSNSClient client = new AmazonSNSClient(clientConfiguration); //client constructor is deprecated
      client.setRegion(RegionUtils.getRegion("us-east-1"));              //mutating the client via setRegion is deprecated
      ```

      Clients should now be constructed using the builder:

      ```java
      AmazonSNS client = AmazonSNSClientBuilder.standard().withClientConfiguration(clientConfiguration).withRegion("us-east-1").build();
      ```

## __Amazon EC2 Container Service__
  - ### Features
    - Now supports a state for container instances that can be used to drain a container instance in preparation for maintenance or cluster scale down.

## __Amazon S3__
  - ### Deprecations
    - Deprecating constructors and mutable methods (eg `setConfiguration()`) on [TransferManager](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java) in favor of creating via the builder for example:

      ```java
      TransferManager tm = TransferManagerBuilder.standard().withS3Client(s3Client).build();
      ```

# __1.11.83__ __2017-01-20__
## __AWS Certificate Manager__
  - ### Features
    - Updated response elements for DescribeCertificate API in support of managed renewal.

# __1.11.82__ __2017-01-20__
## __Amazon DynamoDB__
  - ### Deprecations
    - Deprecating [waitForActiveOrDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForActiveOrDelete--) and [waitForAllActiveOrDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForAllActiveOrDelete--) methods in Table class which can give incorrect results if they are called immediatedly after creating or deleting a table. This is due to dynamoDb operations being eventually consistent and might take a few seconds to propagate the new status. Use [waitForActive](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForActive--) and [waitForDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForDelete--) instead.

