package com.tencentcloudapi.iotcloud.v20210408;
public enum IotcloudErrorCode {
    // The operation failed as the account has been suspended due to overdue payments.
     FAILEDOPERATION_ACCOUNTISOLATED("FailedOperation.AccountIsolated"),
     
    // This device has been transferred and cannot be created again.
     FAILEDOPERATION_ALREADYDISTRIBUTIONDEVICE("FailedOperation.AlreadyDistributionDevice"),
     
    // You cannot create devices as allowlist authentication is not enabled. IoT Hub will create devices automatically by the names carried during authentication.
     FAILEDOPERATION_TIDWHITELISTNOTOPEN("FailedOperation.TidWhiteListNotOpen"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // An internal database error occurred.
     INTERNALERROR_DBOPERATIONERROR("InternalError.DBOperationError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Incorrect CA certificate content.
     INVALIDPARAMETERVALUE_CACERTINVALID("InvalidParameterValue.CACertInvalid"),
     
    // CA certificate mismatch.
     INVALIDPARAMETERVALUE_CACERTNOTMATCH("InvalidParameterValue.CACertNotMatch"),
     
    // Invalid format. `DefinedPsk` must be a Base64 string.
     INVALIDPARAMETERVALUE_DEFINEDPSKNOTBASE64("InvalidParameterValue.DefinedPskNotBase64"),
     
    // The device already exists.
     INVALIDPARAMETERVALUE_DEVICEALREADYEXIST("InvalidParameterValue.DeviceAlreadyExist"),
     
    // This product name already exists.
     INVALIDPARAMETERVALUE_PRODUCTALREADYEXIST("InvalidParameterValue.ProductAlreadyExist"),
     
    // Unsupported product type.
     INVALIDPARAMETERVALUE_PRODUCTTYPENOTSUPPORT("InvalidParameterValue.ProductTypeNotSupport"),
     
    // This TID product already exists.
     INVALIDPARAMETERVALUE_TIDPRODUCTALREADYEXIST("InvalidParameterValue.TidProductAlreadyExist"),
     
    // Unable to operate because the CA certificate is already bound to a product.
     LIMITEXCEEDED_CAALREADYBINDPRODUCT("LimitExceeded.CAAlreadyBindProduct"),
     
    // The certificate name already exists.
     LIMITEXCEEDED_CACERTNAMEREPEAT("LimitExceeded.CACertNameRepeat"),
     
    // The CA certificate already exists.
     LIMITEXCEEDED_CAREPEAT("LimitExceeded.CARepeat"),
     
    // Device quantity exceeded the limit.
     LIMITEXCEEDED_DEVICEEXCEEDLIMIT("LimitExceeded.DeviceExceedLimit"),
     
    // The number of products exceeds the limit.
     LIMITEXCEEDED_PRODUCTEXCEEDLIMIT("LimitExceeded.ProductExceedLimit"),
     
    // The CA certificate does not exist.
     RESOURCENOTFOUND_CACERTNOTEXIST("ResourceNotFound.CACertNotExist"),
     
    // The device does not exist.
     RESOURCENOTFOUND_DEVICENOTEXIST("ResourceNotFound.DeviceNotExist"),
     
    // The device shadow does not exist.
     RESOURCENOTFOUND_DEVICESHADOWNOTEXIST("ResourceNotFound.DeviceShadowNotExist"),
     
    // The product does not exist.
     RESOURCENOTFOUND_PRODUCTNOTEXIST("ResourceNotFound.ProductNotExist"),
     
    // The TSL model does not exist.
     RESOURCENOTFOUND_THINGMODELNOTEXIST("ResourceNotFound.ThingModelNotExist"),
     
    // There is already a TID application for this product, so it cannot be deleted.
     UNAUTHORIZEDOPERATION_DELETETIDFAIL("UnauthorizedOperation.DeleteTidFail"),
     
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
     
    // This feature has been disabled for the product.
     UNAUTHORIZEDOPERATION_PRODUCTISFORBIDDEN("UnauthorizedOperation.ProductIsForbidden"),
     
    // The product does not support key authentication.
     UNAUTHORIZEDOPERATION_PRODUCTNOTSUPPORTPSK("UnauthorizedOperation.ProductNotSupportPSK"),
     
    // The user identity is not verified.
     UNAUTHORIZEDOPERATION_USERNOTAUTHENTICAED("UnauthorizedOperation.UserNotAuthenticaed"),
     
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

