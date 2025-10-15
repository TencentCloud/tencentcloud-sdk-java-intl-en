package com.tencentcloudapi.wedata.v20250806;
public enum WedataErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Client ip is unauthorized. */
     INVALIDPARAMETER_CLIENTIPNOTAUTHORIZED("InvalidParameter.ClientIpNotAuthorized"),
     
     /* Missing Servlet Request Parameter */
     INVALIDPARAMETER_MISSINGREQUESTPARAMETER("InvalidParameter.MissingRequestParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Alarm rule name is duplicate. */
     INVALIDPARAMETERVALUE_RULENAMEREPEATED("InvalidParameterValue.RuleNameRepeated"),
     
     /* Param Validation Error */
     INVALIDPARAMETERVALUE_VALIDATIONERROR("InvalidParameterValue.ValidationError"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameter missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private WedataErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

