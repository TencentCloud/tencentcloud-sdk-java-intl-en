package com.tencentcloudapi.tcr.v20190924;
public enum TcrErrorCode {
    // Internal error. Please check and try again.
     INTERNALERROR("InternalError"),
     
    // Database error. Please check and try again.
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // Parameter error. Please check and try again.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Missing parameters. Please check and try again.
     MISSINGPARAMETER("MissingParameter"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter error. Please check and try again.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TcrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

