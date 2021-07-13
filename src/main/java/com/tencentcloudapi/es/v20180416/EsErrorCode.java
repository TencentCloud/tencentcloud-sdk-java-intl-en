package com.tencentcloudapi.es.v20180416;
public enum EsErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Unauthorized operation.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnAuthorizedOperation"),
     
    // An error occurred with the cluster resource quota limit.
     FAILEDOPERATION_CLUSTERRESOURCELIMITERROR("FailedOperation.ClusterResourceLimitError"),
     
    // Failed to query the number of disks of the node
     FAILEDOPERATION_DISKCOUNTPARAMERROR("FailedOperation.DiskCountParamError"),
     
    // Incorrect cluster status
     FAILEDOPERATION_ERRORCLUSTERSTATE("FailedOperation.ErrorClusterState"),
     
    // No credit card or PayPal account is linked to the current account. Unable to make a payment.
     FAILEDOPERATION_NOPAYMENT("FailedOperation.NoPayment"),
     
    // Unverified user.
     FAILEDOPERATION_NOTAUTHENTICATED("FailedOperation.NotAuthenticated"),
     
    // Cannot adjust the node configuration and disk capacity reversely.
     FAILEDOPERATION_UNSUPPORTREVERSEREGULATIONNODETYPEANDDISK("FailedOperation.UnsupportReverseRegulationNodeTypeAndDisk"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // Insufficient account balance.
     RESOURCEINSUFFICIENT_BALANCE("ResourceInsufficient.Balance"),
     
    // Insufficient number of remaining subnet IPs.
     RESOURCEINSUFFICIENT_SUBNET("ResourceInsufficient.Subnet"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private EsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

