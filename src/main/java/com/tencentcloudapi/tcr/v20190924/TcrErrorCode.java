package com.tencentcloudapi.tcr.v20190924;
public enum TcrErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed
     FAILEDOPERATION("FailedOperation"),
     
    // Database error
     FAILEDOPERATION_DBERROR("FailedOperation.DbError"),
     
    // Dependency exception.
     FAILEDOPERATION_DEPENDENCEERROR("FailedOperation.DependenceError"),
     
    // A null is returned for `Core`.
     FAILEDOPERATION_EMPTYCOREBODY("FailedOperation.EmptyCoreBody"),
     
    // An error occurred while obtaining the database data.
     FAILEDOPERATION_ERRORGETDBDATAERROR("FailedOperation.ErrorGetDBDataError"),
     
    // Invalid request header.
     FAILEDOPERATION_ERRORTCRINVALIDMEDIATYPE("FailedOperation.ErrorTcrInvalidMediaType"),
     
    // TCR instance resource conflict.
     FAILEDOPERATION_ERRORTCRRESOURCECONFLICT("FailedOperation.ErrorTcrResourceConflict"),
     
    // No permission for TCR operation.
     FAILEDOPERATION_ERRORTCRUNAUTHORIZED("FailedOperation.ErrorTcrUnauthorized"),
     
    // An error occurs while obtaining the database data.
     FAILEDOPERATION_GETDBDATAERROR("FailedOperation.GetDBDataError"),
     
    // An error occurred while obtaining the security group policy.
     FAILEDOPERATION_GETSECURITYPOLICYFAIL("FailedOperation.GetSecurityPolicyFail"),
     
    // An error occurs while obtaining TcrClient.
     FAILEDOPERATION_GETTCRCLIENT("FailedOperation.GetTcrClient"),
     
    // The operation is canceled.
     FAILEDOPERATION_OPERATIONCANCEL("FailedOperation.OperationCancel"),
     
    // Prerequisites not met.
     FAILEDOPERATION_PRECONDITIONFAILED("FailedOperation.PreconditionFailed"),
     
    // The transaction failed.
     FAILEDOPERATION_TRADEFAILED("FailedOperation.TradeFailed"),
     
    // Failed to verify the repository name.
     FAILEDOPERATION_VALIDATEREGISTRYNAMEFAIL("FailedOperation.ValidateRegistryNameFail"),
     
    // An error occurred while verifying available regions.
     FAILEDOPERATION_VALIDATESUPPORTEDREGIONFAIL("FailedOperation.ValidateSupportedRegionFail"),
     
    // Internal error. Please check and try again.
     INTERNALERROR("InternalError"),
     
    // Database error. Please check and try again.
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // Target conflicts.
     INTERNALERROR_ERRCONFLICT("InternalError.ErrConflict"),
     
    // The target does not exist.
     INTERNALERROR_ERRNOTEXIST("InternalError.ErrNotExist"),
     
    // The resource already exists.
     INTERNALERROR_ERRORCONFLICT("InternalError.ErrorConflict"),
     
    // The resource quota is exceeded.
     INTERNALERROR_ERROROVERLIMIT("InternalError.ErrorOverLimit"),
     
    // Internal error with the TCR instance.
     INTERNALERROR_ERRORTCRINTERNAL("InternalError.ErrorTcrInternal"),
     
    // Invalid request header
     INTERNALERROR_ERRORTCRINVALIDMEDIATYPE("InternalError.ErrorTcrInvalidMediaType"),
     
    // TCR instance resource conflict.
     INTERNALERROR_ERRORTCRRESOURCECONFLICT("InternalError.ErrorTcrResourceConflict"),
     
    // No permission for TCR operation.
     INTERNALERROR_ERRORTCRUNAUTHORIZED("InternalError.ErrorTcrUnauthorized"),
     
    // Unknown error.
     INTERNALERROR_UNKNOWN("InternalError.Unknown"),
     
    // Parameter error. Please check and try again.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The instance name already exists.
     INVALIDPARAMETER_ERRORNAMEEXISTS("InvalidParameter.ErrorNameExists"),
     
    // Invalid instance name.
     INVALIDPARAMETER_ERRORNAMEILLEGAL("InvalidParameter.ErrorNameIllegal"),
     
    // The instance name is reserved.
     INVALIDPARAMETER_ERRORNAMERESERVED("InvalidParameter.ErrorNameReserved"),
     
    // Invalid instance name. Its format is incorrect or it has been reserved.
     INVALIDPARAMETER_ERRORREGISTRYNAME("InvalidParameter.ErrorRegistryName"),
     
    // The instance can bind up to 10 Tencent Cloud tags.
     INVALIDPARAMETER_ERRORTAGOVERLIMIT("InvalidParameter.ErrorTagOverLimit"),
     
    // Invalid TCR request.
     INVALIDPARAMETER_ERRORTCRINVALIDPARAMETER("InvalidParameter.ErrorTcrInvalidParameter"),
     
    // The replicated instance already exists.
     INVALIDPARAMETER_REPLICATIONEXISTS("InvalidParameter.ReplicationExists"),
     
    // Creating instance is not supported in this region.
     INVALIDPARAMETER_UNSUPPORTEDREGION("InvalidParameter.UnsupportedRegion"),
     
    // Missing parameters. Please check and try again.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // Reached the upper limit of quota.
     OPERATIONDENIED_QUOTAOVERLIMIT("OperationDenied.QuotaOverLimit"),
     
    // Exceptional instance status.
     RESOURCEINSUFFICIENT_ERRORINSTANCENOTRUNNING("ResourceInsufficient.ErrorInstanceNotRunning"),
     
    // The VPC DNS resolution status is abnormal or the resolution is not deleted.
     RESOURCEINSUFFICIENT_ERRORVPCDNSSTATUS("ResourceInsufficient.ErrorVpcDnsStatus"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource of the TCR instance was not found.
     RESOURCENOTFOUND_TCRRESOURCENOTFOUND("ResourceNotFound.TcrResourceNotFound"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 
     UNAUTHORIZEDOPERATION_ERRORTCRUNAUTHORIZED("UnauthorizedOperation.ErrorTcrUnauthorized"),
     
    // Unknown parameter error. Please check and try again.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TcrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

