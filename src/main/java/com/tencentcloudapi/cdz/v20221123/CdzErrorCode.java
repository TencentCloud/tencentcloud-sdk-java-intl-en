package com.tencentcloudapi.cdz.v20221123;
public enum CdzErrorCode {
     /* The cloud dedicated zone does not exist. */
     RESOURCENOTFOUND_CDZIDNOTFOUND("ResourceNotFound.CdzIdNotFound");
     
    private String value;
    private CdzErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

