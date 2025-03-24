package com.tencentcloudapi.ssm.v20190923;
public enum SsmErrorCode {
     /* Error with CAM signature/authentication. */
     AUTHFAILURE("AuthFailure"),
     
     /* `DryRun` Operation. It means that the request would have succeeded, but the `DryRun` parameter was used. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* KMS operation failed. */
     FAILEDOPERATION_ACCESSKMSERROR("FailedOperation.AccessKmsError"),
     
     /* The rotation is prohibited. */
     FAILEDOPERATION_ROTATIONFORBIDDEN("FailedOperation.RotationForbidden"),
     
     /* An internal error occurred. */
     INTERNALERROR("InternalError"),
     
     /* Incorrect parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* The parameter value is invalid. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The tag keys are duplicated. */
     INVALIDPARAMETERVALUE_TAGKEYSDUPLICATED("InvalidParameterValue.TagKeysDuplicated"),
     
     /* The tag key or tag value does not exist. */
     INVALIDPARAMETERVALUE_TAGSNOTEXISTED("InvalidParameterValue.TagsNotExisted"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Missing parameter. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Reached the upper limit of access keys. */
     OPERATIONDENIED_ACCESSKEYOVERLIMIT("OperationDenied.AccessKeyOverLimit"),
     
     /* It is not allowed to manually update credentials with automatic rotation enabled. */
     OPERATIONDENIED_AUTOROTATEDRESOURCE("OperationDenied.AutoRotatedResource"),
     
     /* The role does not exist. */
     OPERATIONDENIED_ROLENOTEXIST("OperationDenied.RoleNotExist"),
     
     /* The secret is not owned by the current account.  */
     OPERATIONDENIED_UINNOTMATCH("OperationDenied.UinNotMatch"),
     
     /* The number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is in use. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* The Secret name already exists. */
     RESOURCEINUSE_SECRETEXISTS("ResourceInUse.SecretExists"),
     
     /* The Version ID already exists. */
     RESOURCEINUSE_VERSIONIDEXISTS("ResourceInUse.VersionIdExists"),
     
     /* Insufficient resource. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* The secret does not exist. */
     RESOURCENOTFOUND_SECRETNOTEXIST("ResourceNotFound.SecretNotExist"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* The service is not purchased. */
     RESOURCEUNAVAILABLE_NOTPURCHASED("ResourceUnavailable.NotPurchased"),
     
     /* The Secret is disabled. */
     RESOURCEUNAVAILABLE_RESOURCEDISABLED("ResourceUnavailable.ResourceDisabled"),
     
     /* The Secret is in `PendingDelete` status. */
     RESOURCEUNAVAILABLE_RESOURCEPENDINGDELETED("ResourceUnavailable.ResourcePendingDeleted"),
     
     /* The credential has not been initialized. */
     RESOURCEUNAVAILABLE_RESOURCEUNINITIALIZED("ResourceUnavailable.ResourceUninitialized"),
     
     /* The resources have been sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* The operation is unauthorized. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Failed to access KMS. */
     UNAUTHORIZEDOPERATION_ACCESSKMSERROR("UnauthorizedOperation.AccessKmsError"),
     
     /* Unknown parameter. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* Unsupported operation. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private SsmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

