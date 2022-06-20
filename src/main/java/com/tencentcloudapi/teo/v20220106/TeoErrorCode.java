package com.tencentcloudapi.teo.v20220106;
public enum TeoErrorCode {
    // Internal error. 
     INTERNALERROR("InternalError"),
     
    // Server error.
     INTERNALERROR_BACKENDERROR("InternalError.BackendError"),
     
    // Failed to get configuration
     INTERNALERROR_DOMAINCONFIG("InternalError.DomainConfig"),
     
    // Failed to generate an upload link.
     INTERNALERROR_FAILEDTOGENERATEURL("InternalError.FailedToGenerateUrl"),
     
    // Server error.
     INTERNALERROR_QUOTASYSTEM("InternalError.QuotaSystem"),
     
    // The domain name does not exist or not belong to this account.
     INVALIDPARAMETER_DOMAINNOTFOUND("InvalidParameter.DomainNotFound"),
     
    // Invalid parameter
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
    // Resource error
     INVALIDPARAMETER_TARGET("InvalidParameter.Target"),
     
    // Failed to create the task
     INVALIDPARAMETER_TASKNOTGENERATED("InvalidParameter.TaskNotGenerated"),
     
    // Invalid file upload link.
     INVALIDPARAMETER_UPLOADURL("InvalidParameter.UploadUrl"),
     
    // Reached the upper limit of resource number
     LIMITEXCEEDED_BATCHQUOTA("LimitExceeded.BatchQuota"),
     
    // Reached the daily upper limit of resource number
     LIMITEXCEEDED_DAILYQUOTA("LimitExceeded.DailyQuota"),
     
    // 
     OPERATIONDENIED("OperationDenied"),
     
    // 
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // CAM is not authorized.
     UNAUTHORIZEDOPERATION_CAMUNAUTHORIZED("UnauthorizedOperation.CamUnauthorized"),
     
    // 
     UNAUTHORIZEDOPERATION_DOMAINEMPTY("UnauthorizedOperation.DomainEmpty"),
     
    // The sub-account is not authorized for the operation. Please add permissions first.
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission");
     
    private String value;
    private TeoErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

