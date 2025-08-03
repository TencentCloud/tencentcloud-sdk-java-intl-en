package com.tencentcloudapi.bi.v20220105;
public enum BiErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Internal error. */
     INTERNALERROR_INTERNAL("InternalError.Internal"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Report embedding error. */
     INVALIDPARAMETER_EMBED("InvalidParameter.Embed"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* The required parameter is missing. */
     MISSINGPARAMETER_MISSINGPARAM("MissingParameter.MissingParam"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Too many and frequent requests. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Permission error. */
     UNAUTHORIZEDOPERATION_AUTHORIZE("UnauthorizedOperation.Authorize"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* Default business exception. */
     UNSUPPORTEDOPERATION_BIERROR("UnsupportedOperation.BIError");
     
    private String value;
    private BiErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

