package com.tencentcloudapi.rum.v20210622;
public enum RumErrorCode {
    // Error with CAM signature/authentication.
     AUTHFAILURE("AuthFailure"),
     
    // `DryRun` Operation. It means that the request would have succeeded, but the `DryRun` parameter was used.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // CLS call failed.
     FAILEDOPERATION_CLSCALLFAIL("FailedOperation.ClsCallFail"),
     
    // Exceptional data operation.
     FAILEDOPERATION_DATABASEEXCEPTION("FailedOperation.DataBaseException"),
     
    // Exceptional third-party dependency.
     FAILEDOPERATION_INFRASTRUCTUREERROR("FailedOperation.InfrastructureError"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // The operation was denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The instance does not exist.
     RESOURCENOTFOUND_NOINSTANCE("ResourceNotFound.NoInstance"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The resources have been sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private RumErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

