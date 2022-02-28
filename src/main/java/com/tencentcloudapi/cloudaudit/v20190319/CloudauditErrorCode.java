package com.tencentcloudapi.cloudaudit.v20190319;
public enum CloudauditErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The alias already exists.
     INVALIDPARAMETERVALUE_ALIASALREADYEXISTS("InvalidParameterValue.AliasAlreadyExists"),
     
    // The maximum number of tracking sets has been exceeded.
     LIMITEXCEEDED_OVERAMOUNT("LimitExceeded.OverAmount");
     
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

