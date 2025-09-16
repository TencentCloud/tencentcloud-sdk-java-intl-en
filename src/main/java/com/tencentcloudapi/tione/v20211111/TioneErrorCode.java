package com.tencentcloudapi.tione.v20211111;
public enum TioneErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Cloud Access Management (CAM) system exception. */
     AUTHFAILURE_CAMEXCEPTION("AuthFailure.CamException"),
     
     /* Unauthorized operation. */
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Failed to access the API Gateway. Please try again. */
     FAILEDOPERATION_APIGATEWAYQUERYFAILED("FailedOperation.ApiGatewayQueryFailed"),
     
     /* Failed to access the billing module. */
     FAILEDOPERATION_BILLINGQUERYFAILED("FailedOperation.BillingQueryFailed"),
     
     /* Cluster access failed. */
     FAILEDOPERATION_CLUSTERQUERYFAILED("FailedOperation.ClusterQueryFailed"),
     
     /* Duplicated name. */
     FAILEDOPERATION_DUPLICATENAME("FailedOperation.DuplicateName"),
     
     /* Database execution error. */
     FAILEDOPERATION_EXECDATABASEFAIL("FailedOperation.ExecDatabaseFail"),
     
     /* Tag operation failed. */
     FAILEDOPERATION_EXECTAGFAIL("FailedOperation.ExecTagFail"),
     
     /* No permissions. */
     FAILEDOPERATION_NOPERMISSION("FailedOperation.NoPermission"),
     
     /* The operation is not allowed. */
     FAILEDOPERATION_NOTALLOW("FailedOperation.NotAllow"),
     
     /* Database query error. */
     FAILEDOPERATION_QUERYDATABASEFAIL("FailedOperation.QueryDatabaseFail"),
     
     /* Failed to query the tag service. */
     FAILEDOPERATION_QUERYTAGFAIL("FailedOperation.QueryTagFail"),
     
     /* Failed to access the key service. Please try again. */
     FAILEDOPERATION_STSQUERYFAILED("FailedOperation.StsQueryFailed"),
     
     /* Unknown instance specifications. */
     FAILEDOPERATION_UNKNOWNINSTANCETYPE("FailedOperation.UnknownInstanceType"),
     
     /* Data parsing failed. */
     FAILEDOPERATION_UNMARSHALDATA("FailedOperation.UnmarshalData"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Invalid name. */
     INVALIDPARAMETERVALUE_BADNAME("InvalidParameterValue.BadName"),
     
     /* Error of missing parameters. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Insufficient balance. Failed to create or update. */
     OPERATIONDENIED_BALANCEINSUFFICIENT("OperationDenied.BalanceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private TioneErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

