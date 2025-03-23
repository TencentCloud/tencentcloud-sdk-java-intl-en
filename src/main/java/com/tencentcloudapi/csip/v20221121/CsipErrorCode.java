package com.tencentcloudapi.csip.v20221121;
public enum CsipErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // The request would have succeeded, but the DryRun parameter was used.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // An internal error occurs.
     INTERNALERROR("InternalError"),
     
    // 
     INVALIDFILTER("InvalidFilter"),
     
    // The parameter is incorrect.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Decrypt error
     INVALIDPARAMETER_DECRYPTERROR("InvalidParameter.DecryptError"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit is reached.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameters.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // 
     REGIONERROR("RegionError"),
     
    // Too many requests.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // Occupied resource
     RESOURCEINUSE("ResourceInUse"),
     
    // Resources are insufficient.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource doesn't exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The resources have been sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 
     UNAUTHORIZEDOPERATION_CLOUDAUDIT("UnauthorizedOperation.CloudAudit"),
     
    // 
     UNAUTHORIZEDOPERATION_COS("UnauthorizedOperation.Cos"),
     
    // The parameter is unknown.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // The operation is not supported.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CsipErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

