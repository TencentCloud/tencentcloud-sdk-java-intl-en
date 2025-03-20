package com.tencentcloudapi.tdid.v20210519;
public enum TdidErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Insufficient permissions. */
     FAILEDOPERATION_INVALIDAUTH("FailedOperation.InvalidAuth"),
     
     /* Operation failed. */
     FAILEDOPERATION_OPERATIONEXCEPTION("FailedOperation.OperationException"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Server error. */
     INTERNALERROR_SERVEREXCEPTION("InternalError.ServerException"),
     
     /* Internal service error. */
     INTERNALERROR_SERVICEERROR("InternalError.ServiceError"),
     
     /* Service error. */
     INTERNALERROR_SERVICEPANIC("InternalError.ServicePanic"),
     
     /* Unknown error. */
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Parameter error. */
     INVALIDPARAMETERVALUE_ILLEGALVALUE("InvalidParameterValue.IllegalValue"),
     
     /* Missing parameter. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* The resource doesn’t exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Unsupported operation. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TdidErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

