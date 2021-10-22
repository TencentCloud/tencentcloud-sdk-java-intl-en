package com.tencentcloudapi.cloudaudit.v20190319;
public enum CloudauditErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private CloudauditErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

