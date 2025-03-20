package com.tencentcloudapi.car.v20220110;
public enum CarErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Application creation failed. */
     FAILEDOPERATION_APPLICATIONCREATEFAIL("FailedOperation.ApplicationCreateFail"),
     
     /* Application lock failed. */
     FAILEDOPERATION_APPLICATIONLOCKFAIL("FailedOperation.ApplicationLockFail"),
     
     /* Application does not exist. */
     FAILEDOPERATION_APPLICATIONNOTFIND("FailedOperation.ApplicationNotFind"),
     
     /* Concurrency quota not requested or request timed out. */
     FAILEDOPERATION_LOCKTIMEOUT("FailedOperation.LockTimeout"),
     
     /* Failed to find the path. */
     FAILEDOPERATION_PATHNOTFOUND("FailedOperation.PathNotFound"),
     
     /* Processing timed out. */
     FAILEDOPERATION_PROCESSTIMEOUT("FailedOperation.ProcessTimeout"),
     
     /* The request of the current `UserId` is being processed. Try again later. */
     FAILEDOPERATION_SLOWDOWN("FailedOperation.SlowDown"),
     
     /* Version lock failed. */
     FAILEDOPERATION_VERSIONLOCKFAIL("FailedOperation.VersionLockFail"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* JSON parsing error. */
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* [Multi-person Interaction] The number of persons corresponding to a role exceeds the limit. */
     LIMITEXCEEDED_ROLE("LimitExceeded.Role"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The number of applications exceeds the limit. */
     OPERATIONDENIED_APPLICATIONLIMITEXCEEDED("OperationDenied.ApplicationLimitExceeded"),
     
     /* Version is being created. */
     OPERATIONDENIED_VERSIONCREATING("OperationDenied.VersionCreating"),
     
     /* The number of versions exceeds the limit. */
     OPERATIONDENIED_VERSIONLIMITEXCEEDED("OperationDenied.VersionLimitExceeded"),
     
     /* No available concurrency quota. */
     RESOURCENOTFOUND_NOIDLE("ResourceNotFound.NoIdle"),
     
     /* Unable to find the session. */
     RESOURCENOTFOUND_SESSIONNOTFOUND("ResourceNotFound.SessionNotFound"),
     
     /* Failed to access the concurrency instance. */
     RESOURCEUNAVAILABLE_ACCESSFAILED("ResourceUnavailable.AccessFailed"),
     
     /* It is being initialized. */
     RESOURCEUNAVAILABLE_INITIALIZATION("ResourceUnavailable.Initialization"),
     
     /* The session is being terminated. */
     UNSUPPORTEDOPERATION_STOPPING("UnsupportedOperation.Stopping");
     
    private String value;
    private CarErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

