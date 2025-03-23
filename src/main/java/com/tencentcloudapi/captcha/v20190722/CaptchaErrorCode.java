package com.tencentcloudapi.captcha.v20190722;
public enum CaptchaErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Authentication failed.
     UNAUTHORIZEDOPERATION_ERRAUTH("UnauthorizedOperation.ErrAuth"),
     
    // Operation not authorized/No valid package/The account is overdue
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized");
     
    private String value;
    private CaptchaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

