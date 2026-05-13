package com.tencentcloudapi.lke.v20231130;
public enum LkeErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Missing required parameters. */
     MISSINGPARAMETER("MissingParameter");
     
    private String value;
    private LkeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

