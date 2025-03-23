package com.tencentcloudapi.lighthouse.v20200324;
public enum LighthouseErrorCode {
    // Error with CAM signature/authentication.
     AUTHFAILURE("AuthFailure"),
     
    // This region is not open yet. Please select another one.
     AUTHFAILURE_INVALIDREGION("AuthFailure.InvalidRegion"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Failed to create the image.
     FAILEDOPERATION_CREATEBLUEPRINTFAILED("FailedOperation.CreateBlueprintFailed"),
     
    // Failed to create the cloud disks.
     FAILEDOPERATION_CREATEDISKSFAILED("FailedOperation.CreateDisksFailed"),
     
    // Failed to create the instance.
     FAILEDOPERATION_CREATEINSTANCESFAILED("FailedOperation.CreateInstancesFailed"),
     
    // Failed to create the key pair.
     FAILEDOPERATION_CREATEKEYPAIRFAILED("FailedOperation.CreateKeyPairFailed"),
     
    // Failed to delete the key pair.
     FAILEDOPERATION_DELETEKEYPAIRFAILED("FailedOperation.DeleteKeyPairFailed"),
     
    // Failed to query the image. Try again later.
     FAILEDOPERATION_DESCRIBEBLUEPRINTSFAILED("FailedOperation.DescribeBlueprintsFailed"),
     
    // 
     FAILEDOPERATION_DESCRIBEBUNDLEDISCOUNTFAILED("FailedOperation.DescribeBundleDiscountFailed"),
     
    // 
     FAILEDOPERATION_DESCRIBEBUNDLESFAILED("FailedOperation.DescribeBundlesFailed"),
     
    // An error occurred when querying the instance status.
     FAILEDOPERATION_DESCRIBEINSTANCESTATUS("FailedOperation.DescribeInstanceStatus"),
     
    // Failed to query the instance configuration adjustment.
     FAILEDOPERATION_DESCRIBEINSTANCESMODIFICATIONERROR("FailedOperation.DescribeInstancesModificationError"),
     
    // An error occurred when querying whether the instance is returnable.
     FAILEDOPERATION_DESCRIBEINSTANCESRETURNABLEERROR("FailedOperation.DescribeInstancesReturnableError"),
     
    // Failed to query traffic packages.
     FAILEDOPERATION_DESCRIBEINSTANCESTRAFFICPACKAGESFAILED("FailedOperation.DescribeInstancesTrafficPackagesFailed"),
     
    // The query returns contents that do not meet the requirement.
     FAILEDOPERATION_DESCRIBERESOURCESRETURNABLEERROR("FailedOperation.DescribeResourcesReturnableError"),
     
    // Unable to terminate the resource. Please retry later.
     FAILEDOPERATION_DESTROYRESOURCESFAILED("FailedOperation.DestroyResourcesFailed"),
     
    // Failed to manipulate the firewall rule.
     FAILEDOPERATION_FIREWALLRULESOPERATIONFAILED("FailedOperation.FirewallRulesOperationFailed"),
     
    // Failed to import the key pair.
     FAILEDOPERATION_IMPORTKEYPAIRFAILED("FailedOperation.ImportKeyPairFailed"),
     
    // Failed to manipulate the instance.
     FAILEDOPERATION_INSTANCEOPERATIONFAILED("FailedOperation.InstanceOperationFailed"),
     
    // 
     FAILEDOPERATION_INSUFFICIENTBALANCE("FailedOperation.InsufficientBalance"),
     
    // The command is not found.
     FAILEDOPERATION_INVALIDCOMMANDNOTFOUND("FailedOperation.InvalidCommandNotFound"),
     
    // Failed to return the resource.
     FAILEDOPERATION_ISOLATERESOURCESFAILED("FailedOperation.IsolateResourcesFailed"),
     
    // Failed to change the instance bundle.
     FAILEDOPERATION_MODIFYINSTANCESBUNDLEFAILED("FailedOperation.ModifyInstancesBundleFailed"),
     
    // Failed to change the resource attribute. Try again later...
     FAILEDOPERATION_MODIFYRESOURCESATTRIBUTEFAILED("FailedOperation.ModifyResourcesAttributeFailed"),
     
    // Unable to renew the resource
     FAILEDOPERATION_RENEWRESOURCESFAILED("FailedOperation.RenewResourcesFailed"),
     
    // A request error occurred.
     FAILEDOPERATION_REQUESTERROR("FailedOperation.RequestError"),
     
    // Failed to manipulate the snapshot.
     FAILEDOPERATION_SNAPSHOTOPERATIONFAILED("FailedOperation.SnapshotOperationFailed"),
     
    // Failed to call the billing gateway service. Please try again later.
     FAILEDOPERATION_TRADECALLBILLINGGATEWAYFAILED("FailedOperation.TradeCallBillingGatewayFailed"),
     
    // Failed to query the price.
     FAILEDOPERATION_TRADEGETPRICEFAILED("FailedOperation.TradeGetPriceFailed"),
     
    // The operation failed. The custom image could not be created.
     FAILEDOPERATION_UNABLETOCREATEBLUEPRINT("FailedOperation.UnableToCreateBlueprint"),
     
    // Failed to create the instance
     FAILEDOPERATION_UNABLETOCREATEINSTANCES("FailedOperation.UnableToCreateInstances"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // The disk query returned invalid content.
     INTERNALERROR_DESCRIBEDISKSRETURNABLEERROR("InternalError.DescribeDisksReturnableError"),
     
    // Failed to query the instance status. Please try again later.
     INTERNALERROR_DESCRIBEINSTANCESTATUS("InternalError.DescribeInstanceStatus"),
     
    // Failed to query whether the configuration of the instance can be modified.
     INTERNALERROR_DESCRIBEINSTANCESMODIFICATION("InternalError.DescribeInstancesModification"),
     
    // Failed to query whether the configuration of the instance can be modified.
     INTERNALERROR_DESCRIBEINSTANCESMODIFICATIONERROR("InternalError.DescribeInstancesModificationError"),
     
    // Failed to query whether the instance can be returned.
     INTERNALERROR_DESCRIBEINSTANCESRETURNABLEERROR("InternalError.DescribeInstancesReturnableError"),
     
    // An error occurred while querying the instance traffic package.
     INTERNALERROR_DESCRIBEINSTANCESTRAFFICPACKAGESFAILED("InternalError.DescribeInstancesTrafficPackagesFailed"),
     
    // Error querying the resource
     INTERNALERROR_DESCRIBERESOURCESRETURNABLEERROR("InternalError.DescribeResourcesReturnableError"),
     
    // Failed to get the snapshot quota lock.
     INTERNALERROR_GETSNAPSHOTALLOCQUOTALOCKERROR("InternalError.GetSnapshotAllocQuotaLockError"),
     
    // Failed to find this API
     INTERNALERROR_INVALIDACTIONNOTFOUND("InternalError.InvalidActionNotFound"),
     
    // The package price is incorrect.
     INTERNALERROR_INVALIDBUNDLEPRICE("InternalError.InvalidBundlePrice"),
     
    // The command is not found.
     INTERNALERROR_INVALIDCOMMANDNOTFOUND("InternalError.InvalidCommandNotFound"),
     
    // There was an error in the request.
     INTERNALERROR_REQUESTERROR("InternalError.RequestError"),
     
    // Failed to call billing gateway service
     INTERNALERROR_TRADECALLBILLINGGATEWAYFAILED("InternalError.TradeCallBillingGatewayFailed"),
     
    // Failed to get the price.
     INTERNALERROR_TRADEGETPRICEFAILED("InternalError.TradeGetPriceFailed"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The package and the image do not match.
     INVALIDPARAMETER_BUNDLEANDBLUEPRINTNOTMATCH("InvalidParameter.BundleAndBlueprintNotMatch"),
     
    // Undefined service package ID.
     INVALIDPARAMETER_BUNDLEIDNOTFOUND("InvalidParameter.BundleIdNotFound"),
     
    // Parameters conflicted.
     INVALIDPARAMETER_CONFLICT("InvalidParameter.Conflict"),
     
    // Invalid parameter: the number of `Values` in the `Filter` parameter exceeds the allowed maximum number.
     INVALIDPARAMETER_FILTERVALUELIMITEXCEEDED("InvalidParameter.FilterValueLimitExceeded"),
     
    // Invalid parameter: the firewall rule is duplicated.
     INVALIDPARAMETER_FIREWALLRULESDUPLICATED("InvalidParameter.FirewallRulesDuplicated"),
     
    // Invalid parameter: the firewall rule already exists.
     INVALIDPARAMETER_FIREWALLRULESEXIST("InvalidParameter.FirewallRulesExist"),
     
    // Invalid parameter: the `Filter` parameter is invalid.
     INVALIDPARAMETER_INVALIDFILTER("InvalidParameter.InvalidFilter"),
     
    // Invalid parameter: the value of `Name` in the `Filter` parameter is invalid.
     INVALIDPARAMETER_INVALIDFILTERINVALIDKEY("InvalidParameter.InvalidFilterInvalidKey"),
     
    // Invalid parameter: the value of `Name` in the `Filter` parameter is not a string.
     INVALIDPARAMETER_INVALIDFILTERINVALIDNAMENOTSTR("InvalidParameter.InvalidFilterInvalidNameNotStr"),
     
    // Invalid parameter: the `Values` in the `Filter` parameter is not a list.
     INVALIDPARAMETER_INVALIDFILTERINVALIDVALUESNOTLIST("InvalidParameter.InvalidFilterInvalidValuesNotList"),
     
    // Invalid parameter: the `Filter` parameter is not a dictionary.
     INVALIDPARAMETER_INVALIDFILTERNOTDICT("InvalidParameter.InvalidFilterNotDict"),
     
    // Invalid parameter: there are unsupported `Name` values in the `Filter` parameter.
     INVALIDPARAMETER_INVALIDFILTERNOTSUPPORTEDNAME("InvalidParameter.InvalidFilterNotSupportedName"),
     
    // Please specify at least one attribute to modify.
     INVALIDPARAMETER_MUSTSPECIFYONEATTRIBUTETOMODIFY("InvalidParameter.MustSpecifyOneAttributeToModify"),
     
    // Invalid parameter: only one attribute can be modified at a time.
     INVALIDPARAMETER_ONLYALLOWMODIFYONEATTRIBUTE("InvalidParameter.OnlyAllowModifyOneAttribute"),
     
    // Invalid parameter: the parameters conflict.
     INVALIDPARAMETER_PARAMETERCONFLICT("InvalidParameter.ParameterConflict"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The configuration of this instance does not meet the requirements of the specified image.
     INVALIDPARAMETERVALUE_BLUEPRINTCONFIGNOTMATCH("InvalidParameterValue.BlueprintConfigNotMatch"),
     
    // The image ID is invalid, as instance reinstallation does not allow switching the OS type.
     INVALIDPARAMETERVALUE_BLUEPRINTID("InvalidParameterValue.BlueprintId"),
     
    // Invalid parameter value: the image ID format is invalid.
     INVALIDPARAMETERVALUE_BLUEPRINTIDMALFORMED("InvalidParameterValue.BlueprintIdMalformed"),
     
    // The package and the image do not match.
     INVALIDPARAMETERVALUE_BUNDLEANDBLUEPRINTNOTMATCH("InvalidParameterValue.BundleAndBlueprintNotMatch"),
     
    // The selected package does not support the OS of the image.
     INVALIDPARAMETERVALUE_BUNDLENOTSUPPORTBLUEPRINTPLATFORM("InvalidParameterValue.BundleNotSupportBlueprintPlatform"),
     
    // The ID format of the CCN instance is invalid.
     INVALIDPARAMETERVALUE_CCNIDMALFORMED("InvalidParameterValue.CcnIdMalformed"),
     
    // The client token is too long.
     INVALIDPARAMETERVALUE_CLIENTTOKENTOOLONG("InvalidParameterValue.ClientTokenTooLong"),
     
    // The AZ of cloud disk does not match the AZ of instance. 
     INVALIDPARAMETERVALUE_DISKINSTANCEZONENOTMATCH("InvalidParameterValue.DiskInstanceZoneNotMatch"),
     
    // The disk name is too long.
     INVALIDPARAMETERVALUE_DISKNAMETOOLONG("InvalidParameterValue.DiskNameTooLong"),
     
    // The disk size has changed.
     INVALIDPARAMETERVALUE_DISKSIZENOTMATCH("InvalidParameterValue.DiskSizeNotMatch"),
     
    // The parameter `KeyName` already exists and is duplicate.
     INVALIDPARAMETERVALUE_DUPLICATEPARAMETERVALUE("InvalidParameterValue.DuplicateParameterValue"),
     
    // Invalid parameter value: duplicate values are not allowed.
     INVALIDPARAMETERVALUE_DUPLICATED("InvalidParameterValue.Duplicated"),
     
    // The length of the firewall rule description exceeds the limit.
     INVALIDPARAMETERVALUE_FIREWALLRULEDESCRIPTIONTOOLONG("InvalidParameterValue.FirewallRuleDescriptionTooLong"),
     
    // Invalid parameter value: the instance ID format is invalid.
     INVALIDPARAMETERVALUE_INSTANCEIDMALFORMED("InvalidParameterValue.InstanceIdMalformed"),
     
    // Invalid parameter value: the length of the instance name exceeds the upper limit.
     INVALIDPARAMETERVALUE_INSTANCENAMETOOLONG("InvalidParameterValue.InstanceNameTooLong"),
     
    // The image ID is invalid.
     INVALIDPARAMETERVALUE_INVALIDBLUEPRINTID("InvalidParameterValue.InvalidBlueprintId"),
     
    // The type of the image OS is invalid.
     INVALIDPARAMETERVALUE_INVALIDBLUEPRINTPLATFORMTYPE("InvalidParameterValue.InvalidBlueprintPlatformType"),
     
    // Invalid image status value
     INVALIDPARAMETERVALUE_INVALIDBLUEPRINTSTATE("InvalidParameterValue.InvalidBlueprintState"),
     
    // The image type is invalid.
     INVALIDPARAMETERVALUE_INVALIDBLUEPRINTTYPE("InvalidParameterValue.InvalidBlueprintType"),
     
    // Invalid package parameter.
     INVALIDPARAMETERVALUE_INVALIDBUNDLE("InvalidParameterValue.InvalidBundle"),
     
    // The console display type is invalid.
     INVALIDPARAMETERVALUE_INVALIDCONSOLEDISPLAYTYPES("InvalidParameterValue.InvalidConsoleDisplayTypes"),
     
    // The current instance expiration time cannot be earlier than the cloud disk expiration time.
     INVALIDPARAMETERVALUE_INVALIDCURINSTANCEDEADLINE("InvalidParameterValue.InvalidCurInstanceDeadline"),
     
    // Invalid parameter value: the disk ID format is invalid.
     INVALIDPARAMETERVALUE_INVALIDDISKIDMALFORMED("InvalidParameterValue.InvalidDiskIdMalformed"),
     
    // Invalid cloud disk type.
     INVALIDPARAMETERVALUE_INVALIDDISKTYPE("InvalidParameterValue.InvalidDiskType"),
     
    // The value of setting whether to use the default key pair for login is incorrect.
     INVALIDPARAMETERVALUE_INVALIDINSTANCELOGINKEYPAIRPERMITLOGIN("InvalidParameterValue.InvalidInstanceLoginKeyPairPermitLogin"),
     
    // Invalid parametric value: the IP address format is invalid.
     INVALIDPARAMETERVALUE_INVALIDIPFORMAT("InvalidParameterValue.InvalidIpFormat"),
     
    // Invalid parametric value.
     INVALIDPARAMETERVALUE_INVALIDKEYPAIRNAMEEMPTY("InvalidParameterValue.InvalidKeyPairNameEmpty"),
     
    // The key pair name is invalid.
     INVALIDPARAMETERVALUE_INVALIDKEYPAIRNAMEINCLUDEILLEGALCHAR("InvalidParameterValue.InvalidKeyPairNameIncludeIllegalChar"),
     
    // The parameter length is invalid.
     INVALIDPARAMETERVALUE_INVALIDKEYPAIRNAMETOOLONG("InvalidParameterValue.InvalidKeyPairNameTooLong"),
     
    // Invalid package combination.
     INVALIDPARAMETERVALUE_INVALIDPARAMETERCOMBINATION("InvalidParameterValue.InvalidParameterCombination"),
     
    // The password in the parameter is invalid.
     INVALIDPARAMETERVALUE_INVALIDPASSWORD("InvalidParameterValue.InvalidPassword"),
     
    // Incorrect quota resource name.
     INVALIDPARAMETERVALUE_INVALIDRESOURCEQUOTARESOURCENAME("InvalidParameterValue.InvalidResourceQuotaResourceName"),
     
    // Invalid scene ID
     INVALIDPARAMETERVALUE_INVALIDSCENEIDMALFORMED("InvalidParameterValue.InvalidSceneIdMalformed"),
     
    // Invalid `Zone` value.
     INVALIDPARAMETERVALUE_INVALIDZONE("InvalidParameterValue.InvalidZone"),
     
    // Invalid parametric value: the key pair ID format is invalid.
     INVALIDPARAMETERVALUE_KEYPAIRIDMALFORMED("InvalidParameterValue.KeyPairIdMalformed"),
     
    // The public key of this key pair already exists in the system and cannot be reused.
     INVALIDPARAMETERVALUE_KEYPAIRPUBLICKEYDUPLICATED("InvalidParameterValue.KeyPairPublicKeyDuplicated"),
     
    // The format of the specified public key is incorrect.
     INVALIDPARAMETERVALUE_KEYPAIRPUBLICKEYMALFORMED("InvalidParameterValue.KeyPairPublicKeyMalformed"),
     
    // Invalid parametric value: the number of parameter values exceeds the upper limit.
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // Invalid parametric value: it cannot be negative.
     INVALIDPARAMETERVALUE_NEGATIVE("InvalidParameterValue.Negative"),
     
    // It is not allowed to change the OS type.
     INVALIDPARAMETERVALUE_NOTALLOWTOCHANGEPLATFORMTYPE("InvalidParameterValue.NotAllowToChangePlatformType"),
     
    // Invalid parametric value: it is not within the valid range.
     INVALIDPARAMETERVALUE_OUTOFRANGE("InvalidParameterValue.OutOfRange"),
     
    // The instance OS does not support this file system.
     INVALIDPARAMETERVALUE_PLATFORMTYPENOTSUPPORTFILESYSTEM("InvalidParameterValue.PlatformTypeNotSupportFileSystem"),
     
    // The instance OS does not support the specified mount point.
     INVALIDPARAMETERVALUE_PLATFORMTYPENOTSUPPORTMOUNTPOINT("InvalidParameterValue.PlatformTypeNotSupportMountPoint"),
     
    // The region does not exist.
     INVALIDPARAMETERVALUE_REGIONNOTFOUND("InvalidParameterValue.RegionNotFound"),
     
    // The regions do not match.
     INVALIDPARAMETERVALUE_REGIONNOTMATCH("InvalidParameterValue.RegionNotMatch"),
     
    // Unsupported region.
     INVALIDPARAMETERVALUE_REGIONNOTSUPPORTED("InvalidParameterValue.RegionNotSupported"),
     
    // The region is unavailable.
     INVALIDPARAMETERVALUE_REGIONUNAVAILABLE("InvalidParameterValue.RegionUnavailable"),
     
    // Invalid parametric value: the snapshot ID format is invalid.
     INVALIDPARAMETERVALUE_SNAPSHOTIDMALFORMED("InvalidParameterValue.SnapshotIdMalformed"),
     
    // Invalid parametric value: the length of the snapshot name exceeds the upper limit.
     INVALIDPARAMETERVALUE_SNAPSHOTNAMETOOLONG("InvalidParameterValue.SnapshotNameTooLong"),
     
    // The length of the parameter value exceeds the upper limit.
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
    // Invalid AZ.
     INVALIDPARAMETERVALUE_ZONEINVALID("InvalidParameterValue.ZoneInvalid"),
     
    // Reached the quota limit.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Failed to attach the disk: Reached the upper limit of attached data disks
     LIMITEXCEEDED_ATTACHDATADISKQUOTALIMITEXCEEDED("LimitExceeded.AttachDataDiskQuotaLimitExceeded"),
     
    // Failed to create the custom image: Reached the upper limit of custom image quota.
     LIMITEXCEEDED_BLUEPRINTQUOTALIMITEXCEEDED("LimitExceeded.BlueprintQuotaLimitExceeded"),
     
    // Failed to create the image: Insufficient quota.
     LIMITEXCEEDED_DISKQUOTALIMITEXCEEDED("LimitExceeded.DiskQuotaLimitExceeded"),
     
    // The firewall rule quota is exceeded.
     LIMITEXCEEDED_FIREWALLRULESLIMITEXCEEDED("LimitExceeded.FirewallRulesLimitExceeded"),
     
    // Run out of the instance quota.
     LIMITEXCEEDED_INSTANCEQUOTALIMITEXCEEDED("LimitExceeded.InstanceQuotaLimitExceeded"),
     
    // Reached the upper limit of resources can be returned
     LIMITEXCEEDED_ISOLATERESOURCESLIMITEXCEEDED("LimitExceeded.IsolateResourcesLimitExceeded"),
     
    // The key pair quota is exceeded.
     LIMITEXCEEDED_KEYPAIRLIMITEXCEEDED("LimitExceeded.KeyPairLimitExceeded"),
     
    // The snapshot quota is exceeded.
     LIMITEXCEEDED_SNAPSHOTQUOTALIMITEXCEEDED("LimitExceeded.SnapshotQuotaLimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // `Period` or `CurInstanceDeadline` is required. 
     MISSINGPARAMETER_MISSINGPARAMETERPERIODCURINSTANCEDEADLINE("MissingParameter.MissingParameterPeriodCurInstanceDeadline"),
     
    // This instance does not support upgrading packages.
     OPERATIONDENIED_BUNDLENOTSUPPORTMODIFY("OperationDenied.BundleNotSupportModify"),
     
    // The disk is being created.
     OPERATIONDENIED_DISKCREATING("OperationDenied.DiskCreating"),
     
    // The disk is being manipulated. Try again later.
     OPERATIONDENIED_DISKOPERATIONINPROGRESS("OperationDenied.DiskOperationInProgress"),
     
    // The cloud disk type of the disk does not support this operation.
     OPERATIONDENIED_DISKUSAGENOTSUPPORTOPERATION("OperationDenied.DiskUsageNotSupportOperation"),
     
    // It is not allowed to manipulate this instance, as it is being created.
     OPERATIONDENIED_INSTANCECREATING("OperationDenied.InstanceCreating"),
     
    // It is not allowed to manipulate this instance, as the last operation is still in progress.
     OPERATIONDENIED_INSTANCEOPERATIONINPROGRESS("OperationDenied.InstanceOperationInProgress"),
     
    // Creating snapshot is not allowed.
     OPERATIONDENIED_OPERATIONDENIEDCREATESNAPSHOT("OperationDenied.OperationDeniedCreateSnapshot"),
     
    // Instances using storage packages do not support snapshot creation.
     OPERATIONDENIED_OPERATIONDENIEDCREATESNAPSHOTFORSTORAGEBUNDLE("OperationDenied.OperationDeniedCreateSnapshotForStorageBundle"),
     
    // The key pair is in use.
     RESOURCEINUSE_KEYPAIRINUSE("ResourceInUse.KeyPairInUse"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The image ID does not exist.
     RESOURCENOTFOUND_BLUEPRINTIDNOTFOUND("ResourceNotFound.BlueprintIdNotFound"),
     
    // The specified image does not exist. Please check whether the `BlueprintId` of the image is correct.
     RESOURCENOTFOUND_BLUEPRINTNOTFOUND("ResourceNotFound.BlueprintNotFound"),
     
    // The disk ID does not exist.
     RESOURCENOTFOUND_DISKIDNOTFOUND("ResourceNotFound.DiskIdNotFound"),
     
    // The disk does not exist.
     RESOURCENOTFOUND_DISKNOTFOUND("ResourceNotFound.DiskNotFound"),
     
    // The firewall does not exist.
     RESOURCENOTFOUND_FIREWALLNOTFOUND("ResourceNotFound.FirewallNotFound"),
     
    // The firewall rule does not exist.
     RESOURCENOTFOUND_FIREWALLRULESNOTFOUND("ResourceNotFound.FirewallRulesNotFound"),
     
    // 
     RESOURCENOTFOUND_FIREWALLTEMPLATENOTFOUND("ResourceNotFound.FirewallTemplateNotFound"),
     
    // There are no data disks mounted to the instance.
     RESOURCENOTFOUND_INSTANCEDATADISKNOTFOUND("ResourceNotFound.InstanceDataDiskNotFound"),
     
    // The instance ID does not exist.
     RESOURCENOTFOUND_INSTANCEIDNOTFOUND("ResourceNotFound.InstanceIdNotFound"),
     
    // The instance does not exist.
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
    // The key pair ID does not exist.
     RESOURCENOTFOUND_KEYIDNOTFOUND("ResourceNotFound.KeyIdNotFound"),
     
    // 
     RESOURCENOTFOUND_KEYPAIRNOTFOUND("ResourceNotFound.KeyPairNotFound"),
     
    // The custom image does not exist.
     RESOURCENOTFOUND_PRIVATEBLUEPRINTNOTFOUND("ResourceNotFound.PrivateBlueprintNotFound"),
     
    // The service role does not exist. Please add it to the account.
     RESOURCENOTFOUND_ROLENOTFOUND("ResourceNotFound.RoleNotFound"),
     
    // Scene ID not found.
     RESOURCENOTFOUND_SCENEIDNOTFOUND("ResourceNotFound.SceneIdNotFound"),
     
    // The snapshot ID does not exist.
     RESOURCENOTFOUND_SNAPSHOTIDNOTFOUND("ResourceNotFound.SnapshotIdNotFound"),
     
    // The snapshot does not exist.
     RESOURCENOTFOUND_SNAPSHOTNOTFOUND("ResourceNotFound.SnapshotNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The image resource is not available.
     RESOURCEUNAVAILABLE_BLUEPRINTUNAVAILABLE("ResourceUnavailable.BlueprintUnavailable"),
     
    // The package is not available.
     RESOURCEUNAVAILABLE_BUNDLEUNAVAILABLE("ResourceUnavailable.BundleUnavailable"),
     
    // 
     RESOURCESSOLDOUT_BUNDLESOLDOUT("ResourcesSoldOut.BundleSoldOut"),
     
    // There is no available configuration in the package.
     RESOURCESSOLDOUT_PURCHASESOURCEHASNOBUNDLECONFIGS("ResourcesSoldOut.PurchaseSourceHasNoBundleConfigs"),
     
    // There is no available configuration in the package.
     RESOURCESSOLDOUT_ZONESHASNOBUNDLECONFIGS("ResourcesSoldOut.ZonesHasNoBundleConfigs"),
     
    // MFA has expired.
     UNAUTHORIZEDOPERATION_MFAEXPIRED("UnauthorizedOperation.MFAExpired"),
     
    // MFA does not exist.
     UNAUTHORIZEDOPERATION_MFANOTFOUND("UnauthorizedOperation.MFANotFound"),
     
    // No permission
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
    // 
     UNAUTHORIZEDOPERATION_TOKENINVALID("UnauthorizedOperation.TokenInvalid"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Unable to associate with CCN: there is no instance in this region
     UNSUPPORTEDOPERATION_ATTACHCCNCONDITIONUNSATISFIED("UnsupportedOperation.AttachCcnConditionUnsatisfied"),
     
    // Failed to associate the CCN instance. Please check the CCN status and try again later.
     UNSUPPORTEDOPERATION_ATTACHCCNFAILED("UnsupportedOperation.AttachCcnFailed"),
     
    // The current status of the image does not support this operation.
     UNSUPPORTEDOPERATION_BLUEPRINTCURSTATEINVALID("UnsupportedOperation.BlueprintCurStateInvalid"),
     
    // The image is in use, so this operation is not supported.
     UNSUPPORTEDOPERATION_BLUEPRINTOCCUPIED("UnsupportedOperation.BlueprintOccupied"),
     
    // The CCN instance is already associated, and reassociation is not supported.
     UNSUPPORTEDOPERATION_CCNALREADYATTACHED("UnsupportedOperation.CcnAlreadyAttached"),
     
    // No CCN instance has been associated yet, so this operation is not supported.
     UNSUPPORTEDOPERATION_CCNNOTATTACHED("UnsupportedOperation.CcnNotAttached"),
     
    // Failed to query the status of the associated CCN instance. Please try again later.
     UNSUPPORTEDOPERATION_DESCRIBECCNATTACHEDINSTANCESFAILED("UnsupportedOperation.DescribeCcnAttachedInstancesFailed"),
     
    // Failed to unassociate the CCN instance. Please check the CCN status and try again later.
     UNSUPPORTEDOPERATION_DETACHCCNFAILED("UnsupportedOperation.DetachCcnFailed"),
     
    // The disk is busy.
     UNSUPPORTEDOPERATION_DISKBUSY("UnsupportedOperation.DiskBusy"),
     
    // Unsupported operation: the last operation of the disk has not been completed.
     UNSUPPORTEDOPERATION_DISKLATESTOPERATIONUNFINISHED("UnsupportedOperation.DiskLatestOperationUnfinished"),
     
    // The firewall is busy.
     UNSUPPORTEDOPERATION_FIREWALLBUSY("UnsupportedOperation.FirewallBusy"),
     
    // The specified firewall version number does not match the current version.
     UNSUPPORTEDOPERATION_FIREWALLVERSIONMISMATCH("UnsupportedOperation.FirewallVersionMismatch"),
     
    // Unsupported operation: the instance has expired.
     UNSUPPORTEDOPERATION_INSTANCEEXPIRED("UnsupportedOperation.InstanceExpired"),
     
    // The password can not be set upon creation of a LinuxUnix instance.
     UNSUPPORTEDOPERATION_INSTANCELINUXUNIXCREATINGNOTSUPPORTPASSWORD("UnsupportedOperation.InstanceLinuxUnixCreatingNotSupportPassword"),
     
    // The disk's status does not support this operation.
     UNSUPPORTEDOPERATION_INVALIDDISKSTATE("UnsupportedOperation.InvalidDiskState"),
     
    // Unsupported operation: the instance status is invalid.
     UNSUPPORTEDOPERATION_INVALIDINSTANCESTATE("UnsupportedOperation.InvalidInstanceState"),
     
    // Unsupported operation: the snapshot status is invalid.
     UNSUPPORTEDOPERATION_INVALIDSNAPSHOTSTATE("UnsupportedOperation.InvalidSnapshotState"),
     
    // Unsupported operation: one key pair cannot be bound to the same instance repeatedly.
     UNSUPPORTEDOPERATION_KEYPAIRBINDDUPLICATE("UnsupportedOperation.KeyPairBindDuplicate"),
     
    // Unsupported operation: the `KeyPair` has a binding relationship with the image. Before performing this operation, please delete the custom image bound to the key pair.
     UNSUPPORTEDOPERATION_KEYPAIRBINDTOBLUEPRINTS("UnsupportedOperation.KeyPairBindToBlueprints"),
     
    // Unsupported operation: key pairs that are not bound to instances cannot be unbound from instances.
     UNSUPPORTEDOPERATION_KEYPAIRNOTBOUNDTOINSTANCE("UnsupportedOperation.KeyPairNotBoundToInstance"),
     
    // Unsupported operation: the last operation of the instance has not been completed.
     UNSUPPORTEDOPERATION_LATESTOPERATIONUNFINISHED("UnsupportedOperation.LatestOperationUnfinished"),
     
    // The shared image does not support this operation.
     UNSUPPORTEDOPERATION_NOTSUPPORTSHAREDBLUEPRINT("UnsupportedOperation.NotSupportSharedBlueprint"),
     
    // 
     UNSUPPORTEDOPERATION_OPERATIONOFFLINE("UnsupportedOperation.OperationOffline"),
     
    // Terminating a resource in the resource center failed.
     UNSUPPORTEDOPERATION_POSTDESTROYRESOURCEFAILED("UnsupportedOperation.PostDestroyResourceFailed"),
     
    // Failed to reapply to associate a CCN instance. Please check the CCN status and try again later.
     UNSUPPORTEDOPERATION_RESETATTACHCCNFAILED("UnsupportedOperation.ResetAttachCcnFailed"),
     
    // The resource cannot be returned.
     UNSUPPORTEDOPERATION_RESOURCENOTRETURNABLE("UnsupportedOperation.ResourceNotReturnable"),
     
    // The snapshot is busy.
     UNSUPPORTEDOPERATION_SNAPSHOTBUSY("UnsupportedOperation.SnapshotBusy"),
     
    // System busy
     UNSUPPORTEDOPERATION_SYSTEMBUSY("UnsupportedOperation.SystemBusy"),
     
    // TAT agent on the instance is not online.
     UNSUPPORTEDOPERATION_TATAGENTNOTONLINE("UnsupportedOperation.TatAgentNotOnline"),
     
    // Windows instances do not support binding key pairs.
     UNSUPPORTEDOPERATION_WINDOWSNOTALLOWTOASSOCIATEKEYPAIR("UnsupportedOperation.WindowsNotAllowToAssociateKeyPair"),
     
    // SSH key pair is not available for Windows instances
     UNSUPPORTEDOPERATION_WINDOWSNOTSUPPORTKEYPAIR("UnsupportedOperation.WindowsNotSupportKeyPair");
     
    private String value;
    private LighthouseErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

