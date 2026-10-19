package com.tencentcloudapi.dbbrain.v20210527;
public enum DbbrainErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun operation means the request will be successful, but the DryRun parameter is passed. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Instance audit is not enabled. */
     FAILEDOPERATION_AUDITNOTOPENED("FailedOperation.AuditNotOpened"),
     
     /* Commercial audit status is not enabled on the paas side. */
     FAILEDOPERATION_PAASAUDITNOTOPENED("FailedOperation.PaasAuditNotOpened"),
     
     /* Data loading */
     FAILEDOPERATION_SEGMENTLOADING("FailedOperation.SegmentLoading"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Database operation failed. */
     INTERNALERROR_DBOPERATIONFAILED("InternalError.DbOperationFailed"),
     
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* Invalid Filter */
     INVALIDFILTER("InvalidFilter"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.InvalidParameter */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* Invalid parameter combination */
     INVALIDPARAMETERCOMBINATION("InvalidParameterCombination"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* InvalidParameterValue.InvalidParameterValue */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* MissingParameter.MissingParameter */
     MISSINGPARAMETER_MISSINGPARAMETER("MissingParameter.MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* CAM authentication error. */
     OPERATIONDENIED_USERHASNOSTRATEGY("OperationDenied.UserHasNoStrategy"),
     
     /* Region error */
     REGIONERROR("RegionError"),
     
     /* The number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Insufficient resources. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Resources have been sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* UnauthorizedOperation.UnauthorizedOperation */
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDOPERATION("UnauthorizedOperation.UnauthorizedOperation"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* Audit logs within the time range downloaded */
     UNSUPPORTEDOPERATION_HASDUPLICATEDTASK("UnsupportedOperation.HasDuplicatedTask");
     
    private String value;
    private DbbrainErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

