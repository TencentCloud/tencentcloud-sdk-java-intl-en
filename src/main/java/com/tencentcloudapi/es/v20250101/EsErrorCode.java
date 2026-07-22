package com.tencentcloudapi.es.v20250101;
public enum EsErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private EsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

