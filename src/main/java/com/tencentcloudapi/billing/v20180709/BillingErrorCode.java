package com.tencentcloudapi.billing.v20180709;
public enum BillingErrorCode {
     /* No permission. */
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* The proxy payment device cannot be downgraded. */
     FAILEDOPERATION_AGENTPAYDEALCANNOTDOWN("FailedOperation.AgentPayDealCannotDown"),
     
     /* The account balance is insufficient. */
     FAILEDOPERATION_BALANCEINSUFFICIENT("FailedOperation.BalanceInsufficient"),
     
     /* Invalid App ID. */
     FAILEDOPERATION_INVALIDAPPID("FailedOperation.InvalidAppId"),
     
     /* Order status error. Only unpaid orders support payment. */
     FAILEDOPERATION_INVALIDDEAL("FailedOperation.InvalidDeal"),
     
     /* Vouchers are not available. */
     FAILEDOPERATION_INVALIDVOUCHER("FailedOperation.InvalidVoucher"),
     
     /* Orders purchased together must be paid simultaneously. */
     FAILEDOPERATION_NEEDPAYTOGETER("FailedOperation.NeedPayTogeter"),
     
     /* Package orders must be purchased together. */
     FAILEDOPERATION_NEEDPAYTOGETHER("FailedOperation.NeedPayTogether"),
     
     /* The quantity exceeds the maximum limit. */
     FAILEDOPERATION_NUMLIMITERROR("FailedOperation.NumLimitError"),
     
     /* Payment failed. Please contact Tencent Cloud to resolve this issue. */
     FAILEDOPERATION_PAYPRICEERROR("FailedOperation.PayPriceError"),
     
     /* Payment succeeded but shipment failed. Please contact the cloud platform staff for handling. */
     FAILEDOPERATION_PAYSUCCDELIVERFAILED("FailedOperation.PaySuccDeliverFailed"),
     
     /* Failed to get the number of data entries. */
     FAILEDOPERATION_QUERYCOUNTFAILED("FailedOperation.QueryCountFailed"),
     
     /* Summary is being built. Please try again later. */
     FAILEDOPERATION_SUMMARYDATANOTREADY("FailedOperation.SummaryDataNotReady"),
     
     /* This cost allocation tag key does not exist. */
     FAILEDOPERATION_TAGKEYNOTEXIST("FailedOperation.TagKeyNotExist"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Database operation failed. */
     INTERNALERROR_DBOPERATERROR("InternalError.DbOperatError"),
     
     /* Gateway error. */
     INTERNALERROR_GATEWAYERROR("InternalError.GatewayError"),
     
     /* An internal system error occurred. */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* Undefined exception. */
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* A parameter error occurred. */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The account does not have CAM permission. */
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth"),
     
     /* Due to account security upgrade, purchase cloud resources requires complete real-name information. */
     UNAUTHORIZEDOPERATION_CERTIFICATIONNEEDUPGRADE("UnauthorizedOperation.CertificationNeedUpgrade"),
     
     /* The account has not been real-name authenticated, and payment failed. */
     UNAUTHORIZEDOPERATION_NOTCERTIFICATION("UnauthorizedOperation.NotCertification"),
     
     /* Operation unsupported. */
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

