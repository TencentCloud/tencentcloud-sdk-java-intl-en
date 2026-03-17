package com.tencentcloudapi.tcsas.v20250106;
public enum TcsasErrorCode {
     /* FailedOperation.NoAccessPermission */
     FAILEDOPERATION_NOACCESSPERMISSION("FailedOperation.NoAccessPermission"),
     
     /* FailedOperation.PackageAlreadyExpired */
     FAILEDOPERATION_PACKAGEALREADYEXPIRED("FailedOperation.PackageAlreadyExpired"),
     
     /* Incorrect parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* InvalidParameterValue.InvalidMNPId */
     INVALIDPARAMETERVALUE_INVALIDMNPID("InvalidParameterValue.InvalidMNPId"),
     
     /* InvalidParameterValue.InvalidPlatformId */
     INVALIDPARAMETERVALUE_INVALIDPLATFORMID("InvalidParameterValue.InvalidPlatformId"),
     
     /* Unknow parameter error. */
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private TcsasErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

