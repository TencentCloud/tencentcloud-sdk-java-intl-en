package com.tencentcloudapi.ctsdb.v20230202;
public enum CtsdbErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private CtsdbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

