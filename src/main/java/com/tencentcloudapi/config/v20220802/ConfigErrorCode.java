package com.tencentcloudapi.config.v20220802;
public enum ConfigErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Account group does not exist. */
     RESOURCENOTFOUND_ACCOUNTGROUPISNOTEXIST("ResourceNotFound.AccountGroupIsNotExist"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND_RESOURCENOTEXIST("ResourceNotFound.ResourceNotExist"),
     
     /* The rule does not exist. */
     RESOURCENOTFOUND_RULEISNOTEXIST("ResourceNotFound.RuleIsNotExist");
     
    private String value;
    private ConfigErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

