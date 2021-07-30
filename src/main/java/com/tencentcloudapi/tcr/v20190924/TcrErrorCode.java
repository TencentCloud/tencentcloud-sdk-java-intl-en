package com.tencentcloudapi.tcr.v20190924;
public enum TcrErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed
     FAILEDOPERATION("FailedOperation"),
     
    // Internal error. Please check and try again.
     INTERNALERROR("InternalError"),
     
    // Database error. Please check and try again.
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // Target conflicts.
     INTERNALERROR_ERRCONFLICT("InternalError.ErrConflict"),
     
    // The target does not exist.
     INTERNALERROR_ERRNOTEXIST("InternalError.ErrNotExist"),
     
    // The resource already exists.
     INTERNALERROR_ERRORCONFLICT("InternalError.ErrorConflict"),
     
    // The resource quota is exceeded.
     INTERNALERROR_ERROROVERLIMIT("InternalError.ErrorOverLimit"),
     
    // 
     INTERNALERROR_ERRORTCRUNAUTHORIZED("InternalError.ErrorTcrUnauthorized"),
     
    // Unknown error.
     INTERNALERROR_UNKNOWN("InternalError.Unknown"),
     
    // Parameter error. Please check and try again.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The instance name already exists.
     INVALIDPARAMETER_ERRORNAMEEXISTS("InvalidParameter.ErrorNameExists"),
     
    // Invalid instance name. Its format is incorrect or it has been reserved.
     INVALIDPARAMETER_ERRORREGISTRYNAME("InvalidParameter.ErrorRegistryName"),
     
    // The instance can bind up to 10 Tencent Cloud tags.
     INVALIDPARAMETER_ERRORTAGOVERLIMIT("InvalidParameter.ErrorTagOverLimit"),
     
    // Invalid TCR request.
     INVALIDPARAMETER_ERRORTCRINVALIDPARAMETER("InvalidParameter.ErrorTcrInvalidParameter"),
     
    // Creating instance is not supported in this region.
     INVALIDPARAMETER_UNSUPPORTEDREGION("InvalidParameter.UnsupportedRegion"),
     
    // Missing parameters. Please check and try again.
     MISSINGPARAMETER("MissingParameter"),
     
    // The resource of the TCR instance was not found.
     RESOURCENOTFOUND_TCRRESOURCENOTFOUND("ResourceNotFound.TcrResourceNotFound"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter error. Please check and try again.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TcrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

