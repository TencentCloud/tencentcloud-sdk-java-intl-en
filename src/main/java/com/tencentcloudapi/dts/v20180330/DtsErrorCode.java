package com.tencentcloudapi.dts.v20180330;
public enum DtsErrorCode {
    // This operation is prohibited.
     FAILEDOPERATION_NOTALLOWOPERATION("FailedOperation.NotAllowOperation"),
     
    // Failed to start the task.
     FAILEDOPERATION_STARTJOBFAILED("FailedOperation.StartJobFailed"),
     
    // This operation cannot be performed due to status conflict.
     FAILEDOPERATION_STATUSINCONFLICT("FailedOperation.StatusInConflict"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // Failed to create the async task.
     INTERNALERROR_ADDTASKERROR("InternalError.AddTaskError"),
     
    // CGW system error.
     INTERNALERROR_CGWSYSTEMERROR("InternalError.CgwSystemError"),
     
    // Failed to access the database on the DTS platform.
     INTERNALERROR_DATABASEERROR("InternalError.DatabaseError"),
     
    // Migration tasks are in conflict.
     INTERNALERROR_DUPLICATEJOB("InternalError.DuplicateJob"),
     
    // Locks are in conflict.
     INTERNALERROR_LOCKERROR("InternalError.LockError"),
     
    // Communication protocol error.
     INTERNALERROR_PROTOCOLERROR("InternalError.ProtocolError"),
     
    // A parameter error occurred.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The instance does not exist.
     INVALIDPARAMETER_INSTANCENOTFOUND("InvalidParameter.InstanceNotFound"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
    // The number of idle migration tasks exceeds the limit.
     LIMITEXCEEDED_MAXUNUSEDJOBS("LimitExceeded.MaxUnusedJobs"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // This operation cannot be performed.
     OPERATIONDENIED_OPERATIONDENIED("OperationDenied.OperationDenied"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The migration task does not exist.
     RESOURCENOTFOUND_JOBNOTEXIST("ResourceNotFound.JobNotExist"),
     
    // The instance is not found.
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
    // Verification failed. Insufficient permissions.
     UNAUTHORIZEDOPERATION_NOTENOUGHPRIVILEGES("UnauthorizedOperation.NotEnoughPrivileges"),
     
    // Unsupported operation
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // The current instance type does not support this operation.
     UNSUPPORTEDOPERATION_ACTIONNOTSUPPORT("UnsupportedOperation.ActionNotSupport");
     
    private String value;
    private DtsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

