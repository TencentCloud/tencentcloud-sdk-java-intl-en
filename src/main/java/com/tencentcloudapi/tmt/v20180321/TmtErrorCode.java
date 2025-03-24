package com.tencentcloudapi.tmt.v20180321;
public enum TmtErrorCode {
     /*  */
     FAILEDOPERATION_ERRORUSERAREA("FailedOperation.ErrorUserArea"),
     
     /*  */
     FAILEDOPERATION_LANGUAGERECOGNITIONERR("FailedOperation.LanguageRecognitionErr"),
     
     /* The free quota for this month is used up. To continue to use the service, you need to upgrade to a paid account in the TMT console. */
     FAILEDOPERATION_NOFREEAMOUNT("FailedOperation.NoFreeAmount"),
     
     /*  */
     FAILEDOPERATION_REQUESTAILABERR("FailedOperation.RequestAiLabErr"),
     
     /* The service is suspended due to overdue payments. Top up your account first. */
     FAILEDOPERATION_SERVICEISOLATE("FailedOperation.ServiceIsolate"),
     
     /*  */
     FAILEDOPERATION_STOPUSING("FailedOperation.StopUsing"),
     
     /* The service is not activated. Activate it in the TMT console first. */
     FAILEDOPERATION_USERNOTREGISTERED("FailedOperation.UserNotRegistered"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Backend service timeout. Please try again later. */
     INTERNALERROR_BACKENDTIMEOUT("InternalError.BackendTimeout"),
     
     /*  */
     INTERNALERROR_ERRORGETROUTE("InternalError.ErrorGetRoute"),
     
     /* Unknown error. */
     INTERNALERROR_ERRORUNKNOWN("InternalError.ErrorUnknown"),
     
     /* Request failed. */
     INTERNALERROR_REQUESTFAILED("InternalError.RequestFailed"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER_MISSINGPARAMETER("InvalidParameter.MissingParameter"),
     
     /*  */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is reached. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* The request frequency limit is reached. */
     LIMITEXCEEDED_LIMITEDACCESSFREQUENCY("LimitExceeded.LimitedAccessFrequency"),
     
     /* Missing parameter. */
     MISSINGPARAMETER("MissingParameter"),
     
     /*  */
     REQUESTLIMITEXCEEDED_UINLIMITEXCEEDED("RequestLimitExceeded.UinLimitExceeded"),
     
     /* Incorrect name entered in the `Action` field. */
     UNAUTHORIZEDOPERATION_ACTIONNOTFOUND("UnauthorizedOperation.ActionNotFound"),
     
     /* Unsupported operation. */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* The text length limit (2,000 characters) for a request is reached. */
     UNSUPPORTEDOPERATION_TEXTTOOLONG("UnsupportedOperation.TextTooLong"),
     
     /* Unsupported target language. Please refer to the supported language list. */
     UNSUPPORTEDOPERATION_UNSUPPORTEDTARGETLANGUAGE("UnsupportedOperation.UnSupportedTargetLanguage"),
     
     /* Unsupported language. Please refer to the supported language list. */
     UNSUPPORTEDOPERATION_UNSUPPORTEDLANGUAGE("UnsupportedOperation.UnsupportedLanguage"),
     
     /* Unsupported source language. Please refer to the supported language list. */
     UNSUPPORTEDOPERATION_UNSUPPORTEDSOURCELANGUAGE("UnsupportedOperation.UnsupportedSourceLanguage");
     
    private String value;
    private TmtErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

