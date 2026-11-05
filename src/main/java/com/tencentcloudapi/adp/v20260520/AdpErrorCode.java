package com.tencentcloudapi.adp.v20260520;
public enum AdpErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private AdpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

