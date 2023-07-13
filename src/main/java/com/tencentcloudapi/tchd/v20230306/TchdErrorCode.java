package com.tencentcloudapi.tchd.v20230306;
public enum TchdErrorCode {
    // 
     INTERNALERROR("InternalError"),
     
    // 
     INVALIDPARAMETER("InvalidParameter"),
     
    // 
     INVALIDPARAMETERVALUE("InvalidParameterValue");
     
    private String value;
    private TchdErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

