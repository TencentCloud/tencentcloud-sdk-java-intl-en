package com.tencentcloudapi.tms.v20201229;
public enum TmsErrorCode {
    // Request timeout.
     INTERNALERROR_ERRTEXTTIMEOUT("InternalError.ErrTextTimeOut"),
     
    // Incorrect action.
     INVALIDPARAMETER_ERRACTION("InvalidParameter.ErrAction"),
     
    // The text in the request is too long.
     INVALIDPARAMETER_ERRTEXTCONTENTLEN("InvalidParameter.ErrTextContentLen"),
     
    // Unsupported text type. The base64-encoded text is required.
     INVALIDPARAMETER_ERRTEXTCONTENTTYPE("InvalidParameter.ErrTextContentType"),
     
    // InvalidParameter.ParameterError
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
    // 
     INVALIDPARAMETERVALUE_ERRFILECONTENT("InvalidParameterValue.ErrFileContent"),
     
    // The text in the request is too long.
     INVALIDPARAMETERVALUE_ERRTEXTCONTENTLEN("InvalidParameterValue.ErrTextContentLen"),
     
    // The text in the request is in the incorrect format (base64-encoded text is required).
     INVALIDPARAMETERVALUE_ERRTEXTCONTENTTYPE("InvalidParameterValue.ErrTextContentType"),
     
    // Not authorized for this API
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized");
     
    private String value;
    private TmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

