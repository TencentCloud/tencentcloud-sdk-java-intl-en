package com.tencentcloudapi.pts.v20210728;
public enum PtsErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* The current request is not authorized by CAM. */
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Failed to obtain tags. */
     FAILEDOPERATION_ACCESSTAGFAIL("FailedOperation.AccessTagFail"),
     
     /* Failed to query database. */
     FAILEDOPERATION_DBQUERYFAILED("FailedOperation.DbQueryFailed"),
     
     /* Failed to create database record. */
     FAILEDOPERATION_DBRECORDCREATEFAILED("FailedOperation.DbRecordCreateFailed"),
     
     /* Failed to update database record. */
     FAILEDOPERATION_DBRECORDUPDATEFAILED("FailedOperation.DbRecordUpdateFailed"),
     
     /* The job status is not running. */
     FAILEDOPERATION_JOBSTATUSNOTRUNNING("FailedOperation.JobStatusNotRunning"),
     
     /* No task in the job. */
     FAILEDOPERATION_NOTASKSINJOB("FailedOperation.NoTasksInJob"),
     
     /* The current environment does not support. */
     FAILEDOPERATION_NOTSUPPORTEDINENV("FailedOperation.NotSupportedInEnv"),
     
     /* The resource does not exist. */
     FAILEDOPERATION_RESOURCENOTFOUND("FailedOperation.ResourceNotFound"),
     
     /* Failed to send request. */
     FAILEDOPERATION_SENDREQUEST("FailedOperation.SendRequest"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Insufficient resources. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private PtsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

