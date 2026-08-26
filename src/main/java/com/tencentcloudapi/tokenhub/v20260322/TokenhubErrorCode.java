package com.tencentcloudapi.tokenhub.v20260322;
public enum TokenhubErrorCode {
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* InvalidParameter.InvalidParameter */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* InvalidParameterValue.InvalidParameterValue */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* MissingParameter.MissingParameter */
     MISSINGPARAMETER_MISSINGPARAMETER("MissingParameter.MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* ResourceNotFound.GlossaryNotFound */
     RESOURCENOTFOUND_GLOSSARYNOTFOUND("ResourceNotFound.GlossaryNotFound"),
     
     /* ResourceNotFound.ResourceNotFound */
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
     /* UnauthorizedOperation.UnauthorizedOperation */
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDOPERATION("UnauthorizedOperation.UnauthorizedOperation");
     
    private String value;
    private TokenhubErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

