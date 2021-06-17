package com.tencentcloudapi.ssm.v20190923;
public enum SsmErrorCode {
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // KMS operation failed.
     FAILEDOPERATION_ACCESSKMSERROR("FailedOperation.AccessKmsError"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // The parameter value is invalid.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The tag keys are duplicated.
     INVALIDPARAMETERVALUE_TAGKEYSDUPLICATED("InvalidParameterValue.TagKeysDuplicated"),
     
    // The tag key or tag value does not exist.
     INVALIDPARAMETERVALUE_TAGSNOTEXISTED("InvalidParameterValue.TagsNotExisted"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // The Secret name already exists.
     RESOURCEINUSE_SECRETEXISTS("ResourceInUse.SecretExists"),
     
    // The Version ID already exists.
     RESOURCEINUSE_VERSIONIDEXISTS("ResourceInUse.VersionIdExists"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The service is not purchased.
     RESOURCEUNAVAILABLE_NOTPURCHASED("ResourceUnavailable.NotPurchased"),
     
    // The Secret is disabled.
     RESOURCEUNAVAILABLE_RESOURCEDISABLED("ResourceUnavailable.ResourceDisabled"),
     
    // The Secret is in `PendingDelete` status.
     RESOURCEUNAVAILABLE_RESOURCEPENDINGDELETED("ResourceUnavailable.ResourcePendingDeleted"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
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

