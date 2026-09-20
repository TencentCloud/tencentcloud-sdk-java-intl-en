package com.tencentcloudapi.captcha.v20190722;
public enum CaptchaErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Request not authorized by CAM. */
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Authentication failed. */
     UNAUTHORIZEDOPERATION_ERRAUTH("UnauthorizedOperation.ErrAuth"),
     
     /* Operation not authorized/No valid package/The account is overdue */
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

