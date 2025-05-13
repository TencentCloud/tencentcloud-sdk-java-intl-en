package com.tencentcloudapi.tbaas.v20180416;
public enum TbaasErrorCode {
     /* The block does not exist. */
     FAILEDOPERATION_FABRICBLOCKNOEXIST("FailedOperation.FabricBlockNoExist"),
     
     /* Contract call failed. */
     FAILEDOPERATION_FABRICCHAINCODEINVOKEFAILED("FailedOperation.FabricChaincodeInvokeFailed"),
     
     /* The contract does not exist. */
     FAILEDOPERATION_FABRICCHAINCODENOEXIST("FailedOperation.FabricChaincodeNoExist"),
     
     /* Contract query failed. */
     FAILEDOPERATION_FABRICCHAINCODEQUERYFAILED("FailedOperation.FabricChaincodeQueryFailed"),
     
     /* The transaction does not exist. */
     FAILEDOPERATION_FABRICTRANSACTIONNOEXIST("FailedOperation.FabricTransactionNoExist"),
     
     /* User has no access permission. */
     FAILEDOPERATION_INVALIDAUTH("FailedOperation.InvalidAuth"),
     
     /* Internal error. please try again later or contact technical personnel. */
     INTERNALERROR_SERVERERROR("InternalError.ServerError");
     
    private String value;
    private TbaasErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

