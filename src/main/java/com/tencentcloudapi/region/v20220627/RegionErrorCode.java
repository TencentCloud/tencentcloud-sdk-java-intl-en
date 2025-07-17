package com.tencentcloudapi.region.v20220627;
public enum RegionErrorCode {
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter error. */
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
     /* Too many and frequent requests. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private RegionErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

