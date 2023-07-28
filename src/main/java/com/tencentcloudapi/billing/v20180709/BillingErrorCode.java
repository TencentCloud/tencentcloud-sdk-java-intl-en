package com.tencentcloudapi.billing.v20180709;
public enum BillingErrorCode {
    // No permission.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Invalid App ID.
     FAILEDOPERATION_INVALIDAPPID("FailedOperation.InvalidAppId"),
     
    // Payment failed. Please contact Tencent Cloud to resolve this issue.
     FAILEDOPERATION_PAYPRICEERROR("FailedOperation.PayPriceError"),
     
    // Failed to get the number of data entries.
     FAILEDOPERATION_QUERYCOUNTFAILED("FailedOperation.QueryCountFailed"),
     
    // Summary is being built. Please try again later.
     FAILEDOPERATION_SUMMARYDATANOTREADY("FailedOperation.SummaryDataNotReady"),
     
    // This cost allocation tag key does not exist.
     FAILEDOPERATION_TAGKEYNOTEXIST("FailedOperation.TagKeyNotExist"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Gateway error.
     INTERNALERROR_GATEWAYERROR("InternalError.GatewayError"),
     
    // Undefined exception.
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The account does not have CAM permission.
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth"),
     
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

