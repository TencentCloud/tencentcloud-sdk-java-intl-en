package com.tencentcloudapi.dlc.v20210125;
public enum DlcErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // The operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Another request is being processed. Try again later.
     FAILEDOPERATION_ANOTHERREQUESTPROCESSING("FailedOperation.AnotherRequestProcessing"),
     
    // The HTTP client request failed.
     FAILEDOPERATION_HTTPCLIENTDOREQUESTFAILED("FailedOperation.HttpClientDoRequestFailed"),
     
    // No permission.
     FAILEDOPERATION_NOPERMISSION("FailedOperation.NoPermission"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // A database error occurred.
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // The parameter is incorrect.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The data engine name is invalid.
     INVALIDPARAMETER_INVALIDDATAENGINENAME("InvalidParameter.InvalidDataEngineName"),
     
    // The fault tolerance policy is invalid.
     INVALIDPARAMETER_INVALIDFAILURETOLERANCE("InvalidParameter.InvalidFailureTolerance"),
     
    // Invalid maximum number of results.
     INVALIDPARAMETER_INVALIDMAXRESULTS("InvalidParameter.InvalidMaxResults"),
     
    // The CAM role arn is invalid.
     INVALIDPARAMETER_INVALIDROLEARN("InvalidParameter.InvalidRoleArn"),
     
    // SQL parsing failed.
     INVALIDPARAMETER_INVALIDSQL("InvalidParameter.InvalidSQL"),
     
    // The number of SQL statements does not meet the specification.
     INVALIDPARAMETER_INVALIDSQLNUM("InvalidParameter.InvalidSQLNum"),
     
    // The `SparkAppParam` is invalid.
     INVALIDPARAMETER_INVALIDSPARKAPPPARAM("InvalidParameter.InvalidSparkAppParam"),
     
    // The storage location is incorrect.
     INVALIDPARAMETER_INVALIDSTORELOCATION("InvalidParameter.InvalidStoreLocation"),
     
    // The `taskid` is invalid.
     INVALIDPARAMETER_INVALIDTASKID("InvalidParameter.InvalidTaskId"),
     
    // The task type is invalid.
     INVALIDPARAMETER_INVALIDTASKTYPE("InvalidParameter.InvalidTaskType"),
     
    // The task has ended and cannot be canceled.
     INVALIDPARAMETER_TASKALREADYFINISHED("InvalidParameter.TaskAlreadyFinished"),
     
    // The parameter value is incorrect.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit is reached.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The result path was not found.
     RESOURCENOTFOUND_RESULTOUTPUTPATHNOTFOUND("ResourceNotFound.ResultOutputPathNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The account balance is insufficient to run the SQL task.
     RESOURCEUNAVAILABLE_BALANCEINSUFFICIENT("ResourceUnavailable.BalanceInsufficient"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unauthorized engine operation by a sub-user.
     UNAUTHORIZEDOPERATION_OPERATECOMPUTINGENGINE("UnauthorizedOperation.OperateComputingEngine"),
     
    // The sub-user does not have permission to use the compute engine.
     UNAUTHORIZEDOPERATION_USECOMPUTINGENGINE("UnauthorizedOperation.UseComputingEngine"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private DlcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

