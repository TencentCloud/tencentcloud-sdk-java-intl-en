package com.tencentcloudapi.hunyuan.v20230901;
public enum HunyuanErrorCode {
     /* Request timeout at the engine layer. try again later. */
     FAILEDOPERATION_ENGINEREQUESTTIMEOUT("FailedOperation.EngineRequestTimeout"),
     
     /* Internal error at the engine layer. try again later. */
     FAILEDOPERATION_ENGINESERVERERROR("FailedOperation.EngineServerError"),
     
     /* Request exceeds the limit at the engine layer. try again later. */
     FAILEDOPERATION_ENGINESERVERLIMITEXCEEDED("FailedOperation.EngineServerLimitExceeded"),
     
     /* The remaining free resource package quota is exhausted. purchase a resource pack or enable post-payment. */
     FAILEDOPERATION_FREERESOURCEPACKEXHAUSTED("FailedOperation.FreeResourcePackExhausted"),
     
     /* The remaining resource package quota is exhausted. purchase a resource pack or enable post-payment. */
     FAILEDOPERATION_RESOURCEPACKEXHAUSTED("FailedOperation.ResourcePackExhausted"),
     
     /* The service is not activated. go to the console to apply for a trial. */
     FAILEDOPERATION_SERVICENOTACTIVATED("FailedOperation.ServiceNotActivated"),
     
     /* User proactively stopped services. */
     FAILEDOPERATION_SERVICESTOP("FailedOperation.ServiceStop"),
     
     /* Service suspended due to overdue payments. */
     FAILEDOPERATION_SERVICESTOPARREARS("FailedOperation.ServiceStopArrears"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Model does not exist. */
     INVALIDPARAMETERVALUE_MODEL("InvalidParameterValue.Model"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded");
     
    private String value;
    private HunyuanErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

