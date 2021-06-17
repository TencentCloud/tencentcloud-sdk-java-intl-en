package com.tencentcloudapi.ip.v20210409;
public enum IpErrorCode {
    // CAM signature/authentication error. Please try again later.
     AUTHFAILURE("AuthFailure"),
     
    // The email address has already been registered.
     FAILEDOPERATION_MAILISREGISTERED("FailedOperation.MailIsRegistered"),
     
    // Internal error. Please try again later.
     INTERNALERROR("InternalError"),
     
    // A parameter error occurred.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private IpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

