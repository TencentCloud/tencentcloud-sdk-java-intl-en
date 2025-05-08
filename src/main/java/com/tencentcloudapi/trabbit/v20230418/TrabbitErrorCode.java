package com.tencentcloudapi.trabbit.v20230418;
public enum TrabbitErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun operation means the request will be successful, but the DryRun parameter is passed. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Invalid Filter */
     INVALIDFILTER("InvalidFilter"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameters are missing */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Region error. */
     REGIONERROR("RegionError"),
     
     /* Request limit exceeded. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Insufficient resources. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Resources are sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TrabbitErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

