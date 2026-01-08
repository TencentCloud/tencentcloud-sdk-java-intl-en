package com.tencentcloudapi.mqtt.v20240516;
public enum MqttErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Transaction exception. */
     FAILEDOPERATION_CALLTRADE("FailedOperation.CallTrade"),
     
     /* Policy priority is duplicated. */
     FAILEDOPERATION_DUPLICATEAUTHORIZATIONIDORPRIORITY("FailedOperation.DuplicateAuthorizationIdOrPriority"),
     
     /* DuplicatePolicy */
     FAILEDOPERATION_DUPLICATEPOLICY("FailedOperation.DuplicatePolicy"),
     
     /* DuplicatePriority */
     FAILEDOPERATION_DUPLICATEPRIORITY("FailedOperation.DuplicatePriority"),
     
     /* FailedOperation.InstanceNotReady */
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
     /* The authorization policy does not support being disabled. */
     FAILEDOPERATION_NOTSUPPORTDISABLEAUTHORIZATIONPOLICY("FailedOperation.NotSupportDisableAuthorizationPolicy"),
     
     /* InstanceTypeNotMatch */
     INVALIDPARAMETER_INSTANCETYPENOTMATCH("InvalidParameter.InstanceTypeNotMatch"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* PublicNetworkInvalidParameterValue */
     INVALIDPARAMETERVALUE_PUBLICNETWORKINVALIDPARAMETERVALUE("InvalidParameterValue.PublicNetworkInvalidParameterValue"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Authorization policy not found. */
     RESOURCENOTFOUND_AUTHORIZATIONPOLICY("ResourceNotFound.AuthorizationPolicy"),
     
     /* ResourceNotFound.Instance */
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
     /* ResourceNotFound.Message */
     RESOURCENOTFOUND_MESSAGE("ResourceNotFound.Message"),
     
     /* ResourceNotFound.Role */
     RESOURCENOTFOUND_ROLE("ResourceNotFound.Role"),
     
     /* ResourceNotFound.Topic */
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
     /* Username not found. */
     RESOURCENOTFOUND_USERNAME("ResourceNotFound.Username"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* UnsupportedOperation.ResourceAlreadyExists */
     UNSUPPORTEDOPERATION_RESOURCEALREADYEXISTS("UnsupportedOperation.ResourceAlreadyExists");
     
    private String value;
    private MqttErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

