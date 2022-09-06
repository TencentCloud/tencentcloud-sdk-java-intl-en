package com.tencentcloudapi.car.v20220110;
public enum CarErrorCode {
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Concurrency quota not requested or request timed out.
     FAILEDOPERATION_LOCKTIMEOUT("FailedOperation.LockTimeout"),
     
    // Processing timed out.
     FAILEDOPERATION_PROCESSTIMEOUT("FailedOperation.ProcessTimeout"),
     
    // Too frequent access.
     FAILEDOPERATION_SLOWDOWN("FailedOperation.SlowDown"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // JSON parsing error.
     INVALIDPARAMETER_JSONPARSEERROR("InvalidParameter.JsonParseError"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
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

