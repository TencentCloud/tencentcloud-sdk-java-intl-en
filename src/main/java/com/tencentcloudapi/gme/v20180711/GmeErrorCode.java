package com.tencentcloudapi.gme.v20180711;
public enum GmeErrorCode {
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Operation not allowed as your account is in arrears.
     FAILEDOPERATION_USERFEENEGATIVE("FailedOperation.UserFeeNegative"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid date.
     INVALIDPARAMETER_DATEINVALID("InvalidParameter.DateInvalid"),
     
    // 
     INVALIDPARAMETER_DATEOUTOFSIXTYDAYS("InvalidParameter.DateOutOfSixtyDays"),
     
    // Incorrect tag.
     INVALIDPARAMETER_TAGKEY("InvalidParameter.TagKey"),
     
    // Incorrect query time range.
     INVALIDPARAMETER_TIMERANGEERROR("InvalidParameter.TimeRangeError"),
     
    // The number of created applications has reached the upper limit.
     LIMITEXCEEDED_APPLICATION("LimitExceeded.Application"),
     
    // Parameter missing.
     MISSINGPARAMETER("MissingParameter"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // Incorrect application ID.
     RESOURCENOTFOUND_BIZIDISNOTFOUND("ResourceNotFound.BizidIsNotFound"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Application creation is not authorized.
     UNAUTHORIZEDOPERATION_CREATEAPPDENIED("UnauthorizedOperation.CreateAppDenied"),
     
    // Unverified user.
     UNAUTHORIZEDOPERATION_UNREALNAMEAUTH("UnauthorizedOperation.UnRealNameAuth"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Operation unsupported.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private GmeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

