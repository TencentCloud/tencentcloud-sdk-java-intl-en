package com.tencentcloudapi.gse.v20191112;
public enum GseErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // The resource is unauthorized.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // An internal error occurred.
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // The number of server fleets exceeds the upper limit.
     LIMITEXCEEDED_FLEETLIMITEXCEEDED("LimitExceeded.FleetLimitExceeded"),
     
    // The number of servers exceeds the upper limit.
     LIMITEXCEEDED_INSTANCELIMITEXCEEDED("LimitExceeded.InstanceLimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied
     OPERATIONDENIED("OperationDenied"),
     
    // Request exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // The service is not activated.
     UNAUTHORIZEDOPERATION_SERVICENOTOPENED("UnauthorizedOperation.ServiceNotOpened"),
     
    // Unknown parameter error
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private GseErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

