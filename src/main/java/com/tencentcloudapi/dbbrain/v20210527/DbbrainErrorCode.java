package com.tencentcloudapi.dbbrain.v20210527;
public enum DbbrainErrorCode {
     /* Error with CAM signature/authentication. */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun operation, which means the DryRun parameter is passed in yet the request will still be successful. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /*  */
     FAILEDOPERATION_SEGMENTLOADING("FailedOperation.SegmentLoading"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Incorrect parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Incorrect parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Missing parameter. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Error with CAM authentication. */
     OPERATIONDENIED_USERHASNOSTRATEGY("OperationDenied.UserHasNoStrategy"),
     
     /* The number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Insufficient resource. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* The resources have been sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* The operation is unauthorized. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Unknown parameter. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* Unsupported operation. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
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

