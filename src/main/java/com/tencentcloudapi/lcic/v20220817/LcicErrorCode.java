package com.tencentcloudapi.lcic.v20220817;
public enum LcicErrorCode {
    // Class status error. The class has already started.
     FAILEDOPERATION_CLASSSTARTED("FailedOperation.ClassStarted"),
     
    // A class session cannot be longer than five hours.
     FAILEDOPERATION_CLASSTOOLONG("FailedOperation.ClassTooLong"),
     
    // The user origin ID already exists.
     FAILEDOPERATION_ORIGINIDEXISTS("FailedOperation.OriginIdExists"),
     
    // The class has not ended.
     FAILEDOPERATION_ROOMNOTEND("FailedOperation.RoomNotEnd"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The end time cannot be earlier than the current time.
     INVALIDPARAMETER_ENDTIME("InvalidParameter.EndTime"),
     
    // `SdkAppId` is incorrect.
     INVALIDPARAMETER_SDKAPPID("InvalidParameter.SdkAppId"),
     
    // The start time cannot be earlier than the current time.
     INVALIDPARAMETER_STARTTIME("InvalidParameter.StartTime"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // Insufficient storage space.
     RESOURCEINSUFFICIENT_RECORD("ResourceInsufficient.Record"),
     
    // Failed to enter the class. Please check your resource usage in the console.
     RESOURCEINSUFFICIENT_ROOM("ResourceInsufficient.Room"),
     
    // The file does not exist.
     RESOURCENOTFOUND_DOCUMENT("ResourceNotFound.Document"),
     
    // The room does not exist.
     RESOURCENOTFOUND_ROOM("ResourceNotFound.Room"),
     
    // The user does not exist.
     RESOURCENOTFOUND_USER("ResourceNotFound.User"),
     
    // Getting room data. Please wait.
     RESOURCEUNAVAILABLE_ROOMSTATISTICS("ResourceUnavailable.RoomStatistics");
     
    private String value;
    private LcicErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

