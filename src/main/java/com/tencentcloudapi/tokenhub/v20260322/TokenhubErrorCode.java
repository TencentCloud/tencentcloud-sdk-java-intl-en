package com.tencentcloudapi.tokenhub.v20260322;
public enum TokenhubErrorCode {
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* InvalidParameter.InvalidParameter */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* InvalidParameterValue.InvalidParameterValue */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
     /* MissingParameter.MissingParameter */
     MISSINGPARAMETER_MISSINGPARAMETER("MissingParameter.MissingParameter"),
     
     /* ResourceNotFound.GlossaryNotFound */
     RESOURCENOTFOUND_GLOSSARYNOTFOUND("ResourceNotFound.GlossaryNotFound"),
     
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

