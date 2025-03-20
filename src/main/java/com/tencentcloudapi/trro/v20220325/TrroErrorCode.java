package com.tencentcloudapi.trro.v20220325;
public enum TrroErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Missing required parameters. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private TrroErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

