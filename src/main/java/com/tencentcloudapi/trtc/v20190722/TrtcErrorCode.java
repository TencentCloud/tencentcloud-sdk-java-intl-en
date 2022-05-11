package com.tencentcloudapi.trtc.v20190722;
public enum TrtcErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // Identity verification has not been completed, so this operation is not allowed.
     AUTHFAILURE_UNREALNAMEAUTHENTICATED("AuthFailure.UnRealNameAuthenticated"),
     
    // CAM authentication failed.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // Unsupported operation.
     AUTHFAILURE_UNSUPPORTEDOPERATION("AuthFailure.UnsupportedOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Unsupported on-cloud recording method.
     FAILEDOPERATION_CRUNSUPPORTMETHOD("FailedOperation.CRUnsupportMethod"),
     
    // Maximum number of concurrent on-cloud recording tasks reached. Contact us to raise the limit.
     FAILEDOPERATION_RESTRICTEDCONCURRENCY("FailedOperation.RestrictedConcurrency"),
     
    // The room does not exist.
     FAILEDOPERATION_ROOMNOTEXIST("FailedOperation.RoomNotExist"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // On-cloud recording internal error.
     INTERNALERROR_CRINTERNALERROR("InternalError.CRInternalError"),
     
    // Failed to query the room.
     INTERNALERROR_GETROOMCACHEIPERROR("InternalError.GetRoomCacheIpError"),
     
    // Failed to get room information.
     INTERNALERROR_GETROOMFROMCACHEERROR("InternalError.GetRoomFromCacheError"),
     
    // Parameter value is out of range.
     INVALIDPARAMETER_OUTOFRANGE("InvalidParameter.OutOfRange"),
     
    // `RoomId` is incorrect.
     INVALIDPARAMETER_ROOMID("InvalidParameter.RoomId"),
     
    // `SdkAppId` is incorrect.
     INVALIDPARAMETER_SDKAPPID("InvalidParameter.SdkAppId"),
     
    // `UserIds` is incorrect.
     INVALIDPARAMETER_USERIDS("InvalidParameter.UserIds"),
     
    // Invalid RoomId.
     INVALIDPARAMETERVALUE_ROOMID("InvalidParameterValue.RoomId"),
     
    // `AccessKey` parameter missing.
     MISSINGPARAMETER_ACCESSKEY("MissingParameter.AccessKey"),
     
    // `Bucket` parameter missing.
     MISSINGPARAMETER_BUCKET("MissingParameter.Bucket"),
     
    // `CloudStorage` parameter missing.
     MISSINGPARAMETER_CLOUDSTORAGE("MissingParameter.CloudStorage"),
     
    // `RecordMode` parameter missing.
     MISSINGPARAMETER_RECORDMODE("MissingParameter.RecordMode"),
     
    // `RecordParams` parameter missing.
     MISSINGPARAMETER_RECORDPARAMS("MissingParameter.RecordParams"),
     
    // `Region` parameter missing.
     MISSINGPARAMETER_REGION("MissingParameter.Region"),
     
    // `RoomId` is missing.
     MISSINGPARAMETER_ROOMID("MissingParameter.RoomId"),
     
    // `SdkAppId` is missing.
     MISSINGPARAMETER_SDKAPPID("MissingParameter.SdkAppId"),
     
    // `SecretKey` parameter missing.
     MISSINGPARAMETER_SECRETKEY("MissingParameter.SecretKey"),
     
    // `StorageParams` parameter missing.
     MISSINGPARAMETER_STORAGEPARAMS("MissingParameter.StorageParams"),
     
    // `StreamType` parameter missing.
     MISSINGPARAMETER_STREAMTYPE("MissingParameter.StreamType"),
     
    // `TaskId` parameter missing.
     MISSINGPARAMETER_TASKID("MissingParameter.TaskId"),
     
    // Missing `UserId` parameter.
     MISSINGPARAMETER_USERID("MissingParameter.UserId"),
     
    // `UserIds` is missing.
     MISSINGPARAMETER_USERIDS("MissingParameter.UserIds"),
     
    // `UserSig` parameter missing.
     MISSINGPARAMETER_USERSIG("MissingParameter.UserSig"),
     
    // `Vendor` parameter missing.
     MISSINGPARAMETER_VENDOR("MissingParameter.Vendor"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // No permission to manipulate `SdkAppId`.
     UNAUTHORIZEDOPERATION_SDKAPPID("UnauthorizedOperation.SdkAppId");
     
    private String value;
    private TrtcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

