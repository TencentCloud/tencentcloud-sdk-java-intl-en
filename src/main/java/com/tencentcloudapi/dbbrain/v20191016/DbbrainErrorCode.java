package com.tencentcloudapi.dbbrain.v20191016;
public enum DbbrainErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied
     OPERATIONDENIED("OperationDenied"),
     
    // CAM authentication error
     OPERATIONDENIED_USERHASNOSTRATEGY("OperationDenied.UserHasNoStrategy"),
     
    // Request exceeded the frequency limit
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation
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

