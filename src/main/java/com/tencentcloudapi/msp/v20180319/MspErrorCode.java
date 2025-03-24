package com.tencentcloudapi.msp.v20180319;
public enum MspErrorCode {
     /* Incorrect parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private MspErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

