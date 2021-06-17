package com.tencentcloudapi.billing.v20180709;
public enum BillingErrorCode {
    // Summary is being built. Please try again later.
     FAILEDOPERATION_SUMMARYDATANOTREADY("FailedOperation.SummaryDataNotReady"),
     
    // This cost allocation tag key does not exist.
     FAILEDOPERATION_TAGKEYNOTEXIST("FailedOperation.TagKeyNotExist"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Gateway error.
     INTERNALERROR_GATEWAYERROR("InternalError.GatewayError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Operation unsupported.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private BillingErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

