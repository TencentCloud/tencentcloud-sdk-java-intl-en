package com.tencentcloudapi.ams.v20201229;
public enum AmsErrorCode {
     /* `DryRun` Operation. It means that the request would have succeeded, but the `DryRun` parameter was used. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* The operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* An internal error occurred. */
     INTERNALERROR("InternalError"),
     
     /* The parameter is incorrect. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* The parameter value is incorrect. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* The parameter is missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* The operation was denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is in use. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* The resource is insufficient. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* The resources have been sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* The operation is unauthorized. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Operation not authorized/Invalid package/Account overdue */
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized"),
     
     /* The parameter is unknown. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private AmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

