package com.tencentcloudapi.quota.v20241204;
public enum QuotaErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Alarm rule does not exist. */
     RESOURCENOTFOUND_ALARMNOTEXIST("ResourceNotFound.AlarmNotExist"),
     
     /* Member not in organization. */
     RESOURCENOTFOUND_MEMBERNOTEXIST("ResourceNotFound.MemberNotExist"),
     
     /* Product is not exist. */
     RESOURCENOTFOUND_PRODUCTNOTEXIST("ResourceNotFound.ProductNotExist"),
     
     /* UserQuota is not exist. */
     RESOURCENOTFOUND_USERQUOTANOTEXIST("ResourceNotFound.UserQuotaNotExist"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Alarm name is exist. */
     UNSUPPORTEDOPERATION_ALARMISEXIST("UnsupportedOperation.AlarmIsExist");
     
    private String value;
    private QuotaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

