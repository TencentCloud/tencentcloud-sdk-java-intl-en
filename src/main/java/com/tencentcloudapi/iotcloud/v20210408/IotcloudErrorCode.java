package com.tencentcloudapi.iotcloud.v20210408;
public enum IotcloudErrorCode {
    // You cannot create devices as allowlist authentication is not enabled. IoT Hub will create devices automatically by the names carried during authentication.
     FAILEDOPERATION_TIDWHITELISTNOTOPEN("FailedOperation.TidWhiteListNotOpen"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 
     INVALIDPARAMETERVALUE_CACERTINVALID("InvalidParameterValue.CACertInvalid"),
     
    // CA certificate mismatch.
     INVALIDPARAMETERVALUE_CACERTNOTMATCH("InvalidParameterValue.CACertNotMatch"),
     
    // Invalid format. `DefinedPsk` must be a Base64 string.
     INVALIDPARAMETERVALUE_DEFINEDPSKNOTBASE64("InvalidParameterValue.DefinedPskNotBase64"),
     
    // The device already exists.
     INVALIDPARAMETERVALUE_DEVICEALREADYEXIST("InvalidParameterValue.DeviceAlreadyExist"),
     
    // Unsupported product type.
     INVALIDPARAMETERVALUE_PRODUCTTYPENOTSUPPORT("InvalidParameterValue.ProductTypeNotSupport"),
     
    // 
     LIMITEXCEEDED_CAALREADYBINDPRODUCT("LimitExceeded.CAAlreadyBindProduct"),
     
    // 
     LIMITEXCEEDED_CAREPEAT("LimitExceeded.CARepeat"),
     
    // Device quantity exceeded the limit.
     LIMITEXCEEDED_DEVICEEXCEEDLIMIT("LimitExceeded.DeviceExceedLimit"),
     
    // 
     RESOURCENOTFOUND_CACERTNOTEXIST("ResourceNotFound.CACertNotExist"),
     
    // The device does not exist.
     RESOURCENOTFOUND_DEVICENOTEXIST("ResourceNotFound.DeviceNotExist"),
     
    // The product does not exist.
     RESOURCENOTFOUND_PRODUCTNOTEXIST("ResourceNotFound.ProductNotExist"),
     
    // Unable to delete this device as gateway devices have been bound to it.
     UNAUTHORIZEDOPERATION_DEVICEHASALREADYBINDGATEWAY("UnauthorizedOperation.DeviceHasAlreadyBindGateway"),
     
    // The device is not enabled.
     UNAUTHORIZEDOPERATION_DEVICEISNOTENABLED("UnauthorizedOperation.DeviceIsNotEnabled"),
     
    // There are still devices under this product.
     UNAUTHORIZEDOPERATION_DEVICESEXISTUNDERPRODUCT("UnauthorizedOperation.DevicesExistUnderProduct"),
     
    // There are still devices bound to this device.
     UNAUTHORIZEDOPERATION_GATEWAYHASBINDEDDEVICES("UnauthorizedOperation.GatewayHasBindedDevices"),
     
    // You cannot create a LoRa device under this product type.
     UNAUTHORIZEDOPERATION_PRODUCTCANTHAVELORADEVICE("UnauthorizedOperation.ProductCantHaveLoRaDevice"),
     
    // You cannot create a general device under a NB-IoT product.
     UNAUTHORIZEDOPERATION_PRODUCTCANTHAVENORMALDEVICE("UnauthorizedOperation.ProductCantHaveNormalDevice"),
     
    // You can create only LoRa devices under this product type.
     UNAUTHORIZEDOPERATION_PRODUCTCANTHAVENOTLORADEVICE("UnauthorizedOperation.ProductCantHaveNotLoRaDevice"),
     
    // The product does not support key authentication.
     UNAUTHORIZEDOPERATION_PRODUCTNOTSUPPORTPSK("UnauthorizedOperation.ProductNotSupportPSK"),
     
    // Device OTA update is in progress.
     UNSUPPORTEDOPERATION_DEVICEOTATASKINPROGRESS("UnsupportedOperation.DeviceOtaTaskInProgress"),
     
    // Unable to delete this gateway product as sub-products have been bound to it.
     UNSUPPORTEDOPERATION_GATEWAYPRODUCTHASBINDEDPRODUCT("UnsupportedOperation.GatewayProductHasBindedProduct"),
     
    // Unable to delete this product as gateway devices have been bound to it.
     UNSUPPORTEDOPERATION_PRODUCTHASBINDGATEWAY("UnsupportedOperation.ProductHasBindGateway"),
     
    // Unable to delete this product as gateway products have been bound to it.
     UNSUPPORTEDOPERATION_PRODUCTHASBINDEDGATEWAYPRODUCT("UnsupportedOperation.ProductHasBindedGatewayProduct"),
     
    // You cannot create devices under a suite token product.
     UNSUPPORTEDOPERATION_SUITETOKENNOCREATE("UnsupportedOperation.SuiteTokenNoCreate");
     
    private String value;
    private IotcloudErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

