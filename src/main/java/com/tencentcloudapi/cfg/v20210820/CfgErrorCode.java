package com.tencentcloudapi.cfg.v20210820;
public enum CfgErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Unauthorized CAM operation. */
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
     /* DryRun operation means the request will be successful, but the DryRun parameter is passed. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameters are missing */
     MISSINGPARAMETER("MissingParameter"),
     
     /* The operation is rejected. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* Resources are occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Insufficient resources. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* Resources do not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Resources are sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Unknown parameter. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CfgErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

