package com.tencentcloudapi.monitor.v20230616;
public enum MonitorErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.Param */
     INVALIDPARAMETER_PARAM("InvalidParameter.Param"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private MonitorErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

