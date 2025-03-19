package com.tencentcloudapi.asr.v20190614;
public enum AsrErrorCode {
    // Authentication error occurred.
     AUTHFAILURE_INVALIDAUTHORIZATION("AuthFailure.InvalidAuthorization"),
     
    // Authentication error occurred.
     FAILEDOPERATION_CHECKAUTHINFOFAILED("FailedOperation.CheckAuthInfoFailed"),
     
    // Failed to download the audio file.
     FAILEDOPERATION_ERRORDOWNFILE("FailedOperation.ErrorDownFile"),
     
    // Recognition failed.
     FAILEDOPERATION_ERRORRECOGNIZE("FailedOperation.ErrorRecognize"),
     
    // Incorrect task ID.
     FAILEDOPERATION_NOSUCHTASK("FailedOperation.NoSuchTask"),
     
    // Services are stopped due to overdue payments. Top up your Tencent Cloud account first.
     FAILEDOPERATION_SERVICEISOLATE("FailedOperation.ServiceIsolate"),
     
    // The resource package is used up. Purchase a new one or enable post-payment.
     FAILEDOPERATION_USERHASNOAMOUNT("FailedOperation.UserHasNoAmount"),
     
    // The resource package is used up. Enable post-payment or purchase a new resource package.
     FAILEDOPERATION_USERHASNOFREEAMOUNT("FailedOperation.UserHasNoFreeAmount"),
     
    // The service is not enabled. Enable it in the Tencent Cloud ASR console.
     FAILEDOPERATION_USERNOTREGISTERED("FailedOperation.UserNotRegistered"),
     
    // Failed to download the audio file.
     INTERNALERROR_ERRORDOWNFILE("InternalError.ErrorDownFile"),
     
    // Failed to access the database.
     INTERNALERROR_FAILACCESSDATABASE("InternalError.FailAccessDatabase"),
     
    // Failed to access Redis.
     INTERNALERROR_FAILACCESSREDIS("InternalError.FailAccessRedis"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Parameters are missing
     MISSINGPARAMETER("MissingParameter"),
     
    // Requests are sent too frequently.
     REQUESTLIMITEXCEEDED_UINLIMITEXCEEDED("RequestLimitExceeded.UinLimitExceeded"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private AsrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

