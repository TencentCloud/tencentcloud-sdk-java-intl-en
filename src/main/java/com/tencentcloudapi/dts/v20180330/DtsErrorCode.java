package com.tencentcloudapi.dts.v20180330;
public enum DtsErrorCode {
    // The current user is not allowed to perform this operation as the authentication failed.
     AUTHFAILURE_UNAUTHORIZEDOPERATIONERROR("AuthFailure.UnauthorizedOperationError"),
     
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
     
    // Internal scheduling system error.
     INTERNALERROR_CELERYERROR("InternalError.CeleryError"),
     
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
     
    // 
     INTERNALERROR_UNDEFINEDERROR("InternalError.UndefinedError"),
     
    // Unknown internal error.
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // A parameter error occurred.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Parameter value error.
     INVALIDPARAMETER_BIZINVALIDPARAMETERVALUEERROR("InvalidParameter.BizInvalidParameterValueError"),
     
    // The instance does not exist.
     INVALIDPARAMETER_INSTANCENOTFOUND("InvalidParameter.InstanceNotFound"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
    // The number of idle migration tasks exceeds the limit.
     LIMITEXCEEDED_MAXUNUSEDJOBS("LimitExceeded.MaxUnusedJobs"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // Task operation failure.
     OPERATIONDENIED_JOBOPERATIONDENIEDERROR("OperationDenied.JobOperationDeniedError"),
     
    // DTS does not support the current migration type.
     OPERATIONDENIED_MIGRATESERVICESUPPORTERROR("OperationDenied.MigrateServiceSupportError"),
     
    // This operation cannot be performed.
     OPERATIONDENIED_OPERATIONDENIED("OperationDenied.OperationDenied"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // Resource not found.
     RESOURCENOTFOUND_BIZRESOURCENOTFOUNDERROR("ResourceNotFound.BizResourceNotFoundError"),
     
    // The migration task does not exist.
     RESOURCENOTFOUND_JOBNOTEXIST("ResourceNotFound.JobNotExist"),
     
    // The instance is not found.
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
    // Verification failed. Insufficient permissions.
     UNAUTHORIZEDOPERATION_NOTENOUGHPRIVILEGES("UnauthorizedOperation.NotEnoughPrivileges"),
     
    // Unsupported operation
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
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

