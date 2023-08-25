package com.tencentcloudapi.car.v20220110;
public enum CarErrorCode {
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Concurrency quota not requested or request timed out.
     FAILEDOPERATION_LOCKTIMEOUT("FailedOperation.LockTimeout"),
     
    // Failed to find the path.
     FAILEDOPERATION_PATHNOTFOUND("FailedOperation.PathNotFound"),
     
    // Processing timed out.
     FAILEDOPERATION_PROCESSTIMEOUT("FailedOperation.ProcessTimeout"),
     
    // The request for the current `UserId` is being processed. Try again later.
     FAILEDOPERATION_SLOWDOWN("FailedOperation.SlowDown"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // JSON parsing error.
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The number of roles in a **multi-person interaction** scenario exceeds the limit.
     LIMITEXCEEDED_ROLE("LimitExceeded.Role"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // No available concurrency quota.
     RESOURCENOTFOUND_NOIDLE("ResourceNotFound.NoIdle"),
     
    // Unable to find the session.
     RESOURCENOTFOUND_SESSIONNOTFOUND("ResourceNotFound.SessionNotFound"),
     
    // Failed to access the concurrency instance.
     RESOURCEUNAVAILABLE_ACCESSFAILED("ResourceUnavailable.AccessFailed"),
     
    // The instance is being initialized.
     RESOURCEUNAVAILABLE_INITIALIZATION("ResourceUnavailable.Initialization"),
     
    // The session is being terminated.
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

