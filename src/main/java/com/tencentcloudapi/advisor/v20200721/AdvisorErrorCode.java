package com.tencentcloudapi.advisor.v20200721;
public enum AdvisorErrorCode {
    // Internal error
     INTERNALERROR("InternalError"),
     
    // The dependent db encountered an error.
     INTERNALERROR_DEPENDSDB("InternalError.DependsDb"),
     
    // System error
     INTERNALERROR_SYSTEM("InternalError.System"),
     
    // Parameter error
     INVALIDPARAMETER("InvalidParameter"),
     
    // Parameter error
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // Parameter value error
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private AdvisorErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

