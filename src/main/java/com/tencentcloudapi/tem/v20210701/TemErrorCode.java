package com.tencentcloudapi.tem.v20210701;
public enum TemErrorCode {
    // Failed to create the service.
     INTERNALERROR_CREATESERVICEERROR("InternalError.CreateServiceError");
     
    private String value;
    private TemErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

