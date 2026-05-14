package com.tencentcloudapi.mna.v20210119;
public enum MnaErrorCode {
     /* Transaction process exception */
     FAILEDOPERATION_TRANSACTIONEXCEPTION("FailedOperation.TransactionException"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Request controller encounters an error. */
     INTERNALERROR_CONTROLREQUESTERROR("InternalError.ControlRequestError"),
     
     /* cos Cloud Object Storage request error. */
     INTERNALERROR_COSREQUESTERROR("InternalError.CosRequestError"),
     
     /* Device key already exists. */
     INTERNALERROR_DUPLICATEDATAKEY("InternalError.DuplicateDataKey"),
     
     /* Device name already exists. */
     INTERNALERROR_DUPLICATEDEVICENAME("InternalError.DuplicateDeviceName"),
     
     /* File read/write exception. */
     INTERNALERROR_FILEIOERROR("InternalError.FileIOError"),
     
     /* Monitor data request error. */
     INTERNALERROR_MONITORDATAREQUESTERROR("InternalError.MonitorDataRequestError"),
     
     /* Zhiyan traffic data request error. */
     INTERNALERROR_NETWORKINFOREQUESTERROR("InternalError.NetworkInfoRequestError"),
     
     /* Preset key not created. */
     INTERNALERROR_UNDEFINEDENCRYPTEDKEY("InternalError.UndefinedEncryptedKey"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The device does not exist or is currently unavailable. */
     OPERATIONDENIED_DEVICENOTFOUND("OperationDenied.DeviceNotFound"),
     
     /* SN already exists */
     OPERATIONDENIED_DUPLICATESN("OperationDenied.DuplicateSN"),
     
     /* Hardware corresponding to SN has been activated */
     OPERATIONDENIED_HARDWAREHASACTIVATED("OperationDenied.HardwareHasActivated"),
     
     /* The hardware corresponding to the input SN does not exist. */
     OPERATIONDENIED_HARDWARENOTEXIST("OperationDenied.HardwareNotExist"),
     
     /* Invalid request, might be replay attack or forged attack. */
     OPERATIONDENIED_ILLEGALREQUEST("OperationDenied.IllegalRequest"),
     
     /* Insufficient balance */
     OPERATIONDENIED_INSUFFICIENTBALANCE("OperationDenied.InsufficientBalance"),
     
     /* Interconnection rule CIDR overlap */
     OPERATIONDENIED_L3CIDROVERLAP("OperationDenied.L3CidrOverLap"),
     
     /* Number of interconnection rules exceeds the maximum limit of 150 */
     OPERATIONDENIED_L3CONNECTIONOVERSIZE("OperationDenied.L3ConnectionOverSize"),
     
     /* The resource package has been modified or renewed */
     OPERATIONDENIED_MODIFIEDORRENEWED("OperationDenied.ModifiedOrRenewed"),
     
     /* No Payment Permission */
     OPERATIONDENIED_NOTALLOWEDTOPAY("OperationDenied.NotAllowedToPay"),
     
     /* Repeat purchase */
     OPERATIONDENIED_REPEATPURCHASE("OperationDenied.RepeatPurchase"),
     
     /* Truncation is enabled */
     OPERATIONDENIED_TRUNCFLAGON("OperationDenied.TruncFlagOn"),
     
     /* Not identity verified */
     OPERATIONDENIED_UNAUTHORIZEDUSER("OperationDenied.UnauthorizedUser"),
     
     /* The current account is not yet registered as a manufacturer. */
     OPERATIONDENIED_VENDORNOTREGISTER("OperationDenied.VendorNotRegister"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Service permission not verified */
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
     /* Live stream service not activated */
     UNAUTHORIZEDOPERATION_UNOPENEDLIVESERVICE("UnauthorizedOperation.UnopenedLiveService");
     
    private String value;
    private MnaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

