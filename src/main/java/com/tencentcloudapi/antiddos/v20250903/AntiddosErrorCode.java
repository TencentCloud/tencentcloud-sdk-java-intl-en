package com.tencentcloudapi.antiddos.v20250903;
public enum AntiddosErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded");
     
    private String value;
    private AntiddosErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

