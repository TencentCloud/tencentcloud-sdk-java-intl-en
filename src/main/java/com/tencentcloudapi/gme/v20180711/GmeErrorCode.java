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
     
    // The entered query date range is longer than 60 days.
     INVALIDPARAMETER_DATEOUTOFSIXTYDAYS("InvalidParameter.DateOutOfSixtyDays"),
     
    // Incorrect tag.
     INVALIDPARAMETER_TAGKEY("InvalidParameter.TagKey"),
     
    // Incorrect query time range.
     INVALIDPARAMETER_TIMERANGEERROR("InvalidParameter.TimeRangeError"),
     
    // Invalid BizId.
     INVALIDPARAMETERVALUE_INVALIDBIZID("InvalidParameterValue.InvalidBizId"),
     
    // Invalid RecordMode.
     INVALIDPARAMETERVALUE_INVALIDRECORDMODE("InvalidParameterValue.InvalidRecordMode"),
     
    // Invalid RoomId.
     INVALIDPARAMETERVALUE_INVALIDROOMID("InvalidParameterValue.InvalidRoomId"),
     
    // Incorrect blocklist/allowlist format.
     INVALIDPARAMETERVALUE_INVALIDSUBSCRIBERECORDUSERIDS("InvalidParameterValue.InvalidSubscribeRecordUserIds"),
     
    // The number of entries on the allowlist exceeds 20.
     INVALIDPARAMETERVALUE_INVALIDSUBSCRIBEUSERIDS("InvalidParameterValue.InvalidSubscribeUserIds"),
     
    // Invalid taskid.
     INVALIDPARAMETERVALUE_INVALIDTASKID("InvalidParameterValue.InvalidTaskId"),
     
    // The number of entries on the blocklist exceeds 20.
     INVALIDPARAMETERVALUE_INVALIDUNSUBSCRIBEUSERIDS("InvalidParameterValue.InvalidUNSubscribeUserIds"),
     
    // The number of created applications has reached the upper limit.
     LIMITEXCEEDED_APPLICATION("LimitExceeded.Application"),
     
    // Parameter missing.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The task already exists.
     RESOURCEINUSE_TASKINUSE("ResourceInUse.TaskInUse"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // Incorrect application ID.
     RESOURCENOTFOUND_BIZIDISNOTFOUND("ResourceNotFound.BizidIsNotFound"),
     
    // The room does not exist.
     RESOURCENOTFOUND_ROOMNOTFOUND("ResourceNotFound.RoomNotFound"),
     
    // The task ID does not exist.
     RESOURCENOTFOUND_TASKNOTFOUND("ResourceNotFound.TaskNotFound"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Application creation is not authorized.
     UNAUTHORIZEDOPERATION_CREATEAPPDENIED("UnauthorizedOperation.CreateAppDenied"),
     
    // Unverified user.
     UNAUTHORIZEDOPERATION_UNREALNAMEAUTH("UnauthorizedOperation.UnRealNameAuth"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Operation unsupported.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // The recording service is not activated.
     UNSUPPORTEDOPERATION_SERVICENOTOPENED("UnsupportedOperation.ServiceNotOpened");
     
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

