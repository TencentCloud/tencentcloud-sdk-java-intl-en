package com.tencentcloudapi.message.v20181225;
public enum MessageErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER_("InvalidParameter."),
     
     /* Message type does not exist. */
     INVALIDPARAMETER_MSGTYPENOTEXIST("InvalidParameter.MsgTypeNotExist"),
     
     /* The user does not exist. */
     INVALIDPARAMETER_USERNOTEXIST("InvalidParameter.UserNotExist");
     
    private String value;
    private MessageErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

