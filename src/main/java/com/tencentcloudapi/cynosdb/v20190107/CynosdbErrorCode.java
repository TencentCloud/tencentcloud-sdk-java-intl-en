package com.tencentcloudapi.cynosdb.v20190107;
public enum CynosdbErrorCode {
    // Operation failed
     FAILEDOPERATION("FailedOperation"),
     
    // Batch query failed
     FAILEDOPERATION_BATCHGETINSTANCEERROR("FailedOperation.BatchGetInstanceError"),
     
    // Failed to bind a resource pack
     FAILEDOPERATION_BINDSOURCEPACKAGEERROR("FailedOperation.BindSourcePackageError"),
     
    // Failed to get permissions. Please try again later. If the problem persists, please contact customer service.
     FAILEDOPERATION_CAMCHECKRESOURCEERROR("FailedOperation.CamCheckResourceError"),
     
    // Authentication failed. Please try again later. If the problem persists, please contact customer service.
     FAILEDOPERATION_CAMSIGANDAUTHERROR("FailedOperation.CamSigAndAuthError"),
     
    // Failed to create the order and make a payment.
     FAILEDOPERATION_CREATEORDER("FailedOperation.CreateOrder"),
     
    // Failed to create a resource pack
     FAILEDOPERATION_CREATESOURCEPACKAGEERROR("FailedOperation.CreateSourcePackageError"),
     
    // Failed to access the database. Please try again later. If the problem persists, please contact customer service.
     FAILEDOPERATION_DATABASEACCESSERROR("FailedOperation.DatabaseAccessError"),
     
    // Failed to create a task. Try again later. If the problem persists, contact customer service.
     FAILEDOPERATION_FLOWCREATEERROR("FailedOperation.FlowCreateError"),
     
    // The task flow does not exist.
     FAILEDOPERATION_FLOWNOTFOUNDERROR("FailedOperation.FlowNotFoundError"),
     
    // Failed to query the backup policy. Please try again later. If the problem persists, please contact customer service.
     FAILEDOPERATION_GETBACKUPSTRATEGYERROR("FailedOperation.GetBackupStrategyError"),
     
    // Failed to query the network information of the access group
     FAILEDOPERATION_GETNETSERVICEINFOERROR("FailedOperation.GetNetServiceInfoError"),
     
    // Failed to query the details of a read-write instance
     FAILEDOPERATION_GETOSSINFOERROR("FailedOperation.GetOssInfoError"),
     
    // Insufficient account balance
     FAILEDOPERATION_INSUFFICIENTBALANCE("FailedOperation.InsufficientBalance"),
     
    // Operation failed. Try again later. If the problem persists, contact customer service.
     FAILEDOPERATION_OPERATIONFAILEDERROR("FailedOperation.OperationFailedError"),
     
    // Failed to query the consumption details of a resource pack
     FAILEDOPERATION_QUERYSOURCEPACKAGEDETAILERROR("FailedOperation.QuerySourcePackageDetailError"),
     
    // Failed to query the resource pack
     FAILEDOPERATION_QUERYSOURCEPACKAGEERROR("FailedOperation.QuerySourcePackageError"),
     
    // Failed to query specifications.
     FAILEDOPERATION_QUERYSPECBYSPECCODEERROR("FailedOperation.QuerySpecBySpecCodeError"),
     
    // Failed to refund the resource pack
     FAILEDOPERATION_REFUNDSOURCEPACKAGEERROR("FailedOperation.RefundSourcePackageError"),
     
    // Failed to create the order and make a payment. Please try again later. If the problem persists, please contact customer service.
     FAILEDOPERATION_TRADECREATEORDERERROR("FailedOperation.TradeCreateOrderError"),
     
    // Failed to unbind the resource pack
     FAILEDOPERATION_UNBINDSOURCEPACKAGEERROR("FailedOperation.UnBindSourcePackageError"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Failed to query the database.
     INTERNALERROR_DBOPERATIONFAILED("InternalError.DbOperationFailed"),
     
    // Failed to get the security group information.
     INTERNALERROR_GETSECURITYGROUPDETAILFAILED("InternalError.GetSecurityGroupDetailFailed"),
     
    // Failed to get the subnet.
     INTERNALERROR_GETSUBNETFAILED("InternalError.GetSubnetFailed"),
     
    // Failed to get the VPC.
     INTERNALERROR_GETVPCFAILED("InternalError.GetVpcFailed"),
     
    // Network error
     INTERNALERROR_HTTPERROR("InternalError.HttpError"),
     
    // An exception occurred while executing the HTTP request.
     INTERNALERROR_INTERNALHTTPSERVERERROR("InternalError.InternalHttpServerError"),
     
    // Failed to query instances by security group.
     INTERNALERROR_LISTINSTANCEFAILED("InternalError.ListInstanceFailed"),
     
    // Public network operation failed.
     INTERNALERROR_OPERATEWANFAIL("InternalError.OperateWanFail"),
     
    // Unsupported operation.
     INTERNALERROR_OPERATIONNOTSUPPORT("InternalError.OperationNotSupport"),
     
    // Failed to query the database.
     INTERNALERROR_QUERYDATABASEFAILED("InternalError.QueryDatabaseFailed"),
     
    // Internal service error
     INTERNALERROR_SERVICEERROR("InternalError.ServiceError"),
     
    // Internal system error.
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // Unknown internal error.
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // This API was not found.
     INVALIDPARAMETER_CONTROLLERNOTFOUNDERROR("InvalidParameter.ControllerNotFoundError"),
     
    // Parameter passing error.
     INVALIDPARAMETER_EXCEPTIONPARAM("InvalidParameter.ExceptionParam"),
     
    // Unknown parameter. Please check whether the parameter is valid.
     INVALIDPARAMETER_INVALIDPARAMETERERROR("InvalidParameter.InvalidParameterError"),
     
    // The current instance cannot be isolated.
     INVALIDPARAMETER_ISOLATENOTALLOWED("InvalidParameter.IsolateNotAllowed"),
     
    // The account already exists.
     INVALIDPARAMETERVALUE_ACCOUNTALREADYEXISTERROR("InvalidParameterValue.AccountAlreadyExistError"),
     
    // The account already exists.
     INVALIDPARAMETERVALUE_ACCOUNTEXIST("InvalidParameterValue.AccountExist"),
     
    // The instance doesn’t have an account.
     INVALIDPARAMETERVALUE_ACCOUNTNOTEXISTERROR("InvalidParameterValue.AccountNotExistError"),
     
    // No cluster found.
     INVALIDPARAMETERVALUE_CLUSTERNOTFOUND("InvalidParameterValue.ClusterNotFound"),
     
    // Unsupported instance type.
     INVALIDPARAMETERVALUE_DBTYPENOTFOUND("InvalidParameterValue.DBTypeNotFound"),
     
    // The cluster type must be serverless.
     INVALIDPARAMETERVALUE_DBMODENOTSERVERLESSERROR("InvalidParameterValue.DbModeNotServerlessError"),
     
    // No order ID found.
     INVALIDPARAMETERVALUE_DEALNAMENOTFOUND("InvalidParameterValue.DealNameNotFound"),
     
    // Taskflow ID doesn’t exist.
     INVALIDPARAMETERVALUE_FLOWNOTFOUND("InvalidParameterValue.FlowNotFound"),
     
    // The instance name contains invalid characters.
     INVALIDPARAMETERVALUE_ILLEGALINSTANCENAME("InvalidParameterValue.IllegalInstanceName"),
     
    // Invalid sort by field.
     INVALIDPARAMETERVALUE_ILLEGALORDERBY("InvalidParameterValue.IllegalOrderBy"),
     
    // The password does not meet the requirement.
     INVALIDPARAMETERVALUE_ILLEGALPASSWORD("InvalidParameterValue.IllegalPassword"),
     
    // The instance does not exist.
     INVALIDPARAMETERVALUE_INSTANCENOTFOUND("InvalidParameterValue.InstanceNotFound"),
     
    // The operation is not allowed for system account.
     INVALIDPARAMETERVALUE_INTERNALACCOUNT("InvalidParameterValue.InternalAccount"),
     
    // Invalid instance version.
     INVALIDPARAMETERVALUE_INVALIDDBVERSION("InvalidParameterValue.InvalidDBVersion"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUEERROR("InvalidParameterValue.InvalidParameterValueError"),
     
    // The password is invalid.
     INVALIDPARAMETERVALUE_INVALIDPASSWORDVALUEERROR("InvalidParameterValue.InvalidPasswordValueError"),
     
    // The region is invalid.
     INVALIDPARAMETERVALUE_INVALIDREGIONIDERROR("InvalidParameterValue.InvalidRegionIdError"),
     
    // Invalid instance specification.
     INVALIDPARAMETERVALUE_INVALIDSPEC("InvalidParameterValue.InvalidSpec"),
     
    // Invalid AZ
     INVALIDPARAMETERVALUE_INVALIDZONEIDERROR("InvalidParameterValue.InvalidZoneIdError"),
     
    // These two parameters cannot be set at the same time.
     INVALIDPARAMETERVALUE_PARAMBOTHSETERROR("InvalidParameterValue.ParamBothSetError"),
     
    // Incorrect parameter.
     INVALIDPARAMETERVALUE_PARAMERROR("InvalidParameterValue.ParamError"),
     
    // Invalid parameter value
     INVALIDPARAMETERVALUE_PARAMETEROUTRANGEERROR("InvalidParameterValue.ParameterOutRangeError"),
     
    // This operation is not allowed for monthly-subscribed instances.
     INVALIDPARAMETERVALUE_PREPAYPAYMODEERROR("InvalidParameterValue.PrePayPayModeError"),
     
    // The `ProjectId` was not found.
     INVALIDPARAMETERVALUE_PROJECTIDNOTFOUND("InvalidParameterValue.ProjectIdNotFound"),
     
    // The selected region and AZ are unavailable.
     INVALIDPARAMETERVALUE_REGIONZONEUNAVAILABLE("InvalidParameterValue.RegionZoneUnavailable"),
     
    // No related storage pool found.
     INVALIDPARAMETERVALUE_STORAGEPOOLNOTFOUND("InvalidParameterValue.StoragePoolNotFound"),
     
    // The selected subnet could not be found.
     INVALIDPARAMETERVALUE_SUBNETNOTFOUND("InvalidParameterValue.SubnetNotFound"),
     
    // No data found
     INVALIDPARAMETERVALUE_VALUENOTFOUND("InvalidParameterValue.ValueNotFound"),
     
    // The selected VPC could not be found.
     INVALIDPARAMETERVALUE_VPCNOTFOUND("InvalidParameterValue.VpcNotFound"),
     
    // The node count in the cluster exceeds the maximum limit.
     LIMITEXCEEDED_CLUSTERINSTANCELIMIT("LimitExceeded.ClusterInstanceLimit"),
     
    // The number of instances exceeds the limit.
     LIMITEXCEEDED_USERINSTANCELIMIT("LimitExceeded.UserInstanceLimit"),
     
    // Failed to verify permissions
     OPERATIONDENIED_CAMDENIEDERROR("OperationDenied.CamDeniedError"),
     
    // The current cluster does not allow the operation.
     OPERATIONDENIED_CLUSTEROPNOTALLOWEDERROR("OperationDenied.ClusterOpNotAllowedError"),
     
    // For the cluster in this status, the operation is not allowed.
     OPERATIONDENIED_CLUSTERSTATUSDENIEDERROR("OperationDenied.ClusterStatusDeniedError"),
     
    // You do not have the permission to operate this resource.
     OPERATIONDENIED_INSTANCEACCESSDENIEDERROR("OperationDenied.InstanceAccessDeniedError"),
     
    // For the instance in this status, the operation is not allowed.
     OPERATIONDENIED_INSTANCESTATUSDENIEDERROR("OperationDenied.InstanceStatusDeniedError"),
     
    // The instance is not running.
     OPERATIONDENIED_INSTANCESTATUSLIMITERROR("OperationDenied.InstanceStatusLimitError"),
     
    // Insufficient account balance.
     OPERATIONDENIED_INSUFFICIENTBALANCEERROR("OperationDenied.InsufficientBalanceError"),
     
    // For the serverless cluster in this status, the operation is not allowed.
     OPERATIONDENIED_SERVERLESSCLUSTERSTATUSDENIED("OperationDenied.ServerlessClusterStatusDenied"),
     
    // For the serverless instance in this status, the operation is not allowed.
     OPERATIONDENIED_SERVERLESSINSTANCESTATUSDENIED("OperationDenied.ServerlessInstanceStatusDenied"),
     
    // The task conflict check failed.
     OPERATIONDENIED_TASKCONFLICTERROR("OperationDenied.TaskConflictError"),
     
    // This type of specification is unavailable.
     OPERATIONDENIED_UNSUPPORTSALESPECERROR("OperationDenied.UnSupportSaleSpecError"),
     
    // You need to verify your identity to make a purchase.
     OPERATIONDENIED_USERNOTAUTHENTICATEDERROR("OperationDenied.UserNotAuthenticatedError"),
     
    // Serverless is not supported on this version.
     OPERATIONDENIED_VERSIONNOTSUPPORTERROR("OperationDenied.VersionNotSupportError"),
     
    // The cluster does not exist.
     RESOURCENOTFOUND_CLUSTERNOTFOUNDERROR("ResourceNotFound.ClusterNotFoundError"),
     
    // The instance does not exist.
     RESOURCENOTFOUND_INSTANCENOTFOUNDERROR("ResourceNotFound.InstanceNotFoundError"),
     
    // The resource corresponding to the parameter does not exist.
     RESOURCENOTFOUND_RESOURCEERROR("ResourceNotFound.ResourceError"),
     
    // Failed to lock the instance, so the operation cannot be performed temporarily.
     RESOURCEUNAVAILABLE_INSTANCELOCKFAIL("ResourceUnavailable.InstanceLockFail"),
     
    // The instance is exceptional, so the operation cannot be performed temporarily.
     RESOURCEUNAVAILABLE_INSTANCESTATUSABNORMAL("ResourceUnavailable.InstanceStatusAbnormal"),
     
    // Users who haven't completed identity verification can’t make purchases.
     UNAUTHORIZEDOPERATION_NOTREALNAMEACCOUNT("UnauthorizedOperation.NotRealNameAccount"),
     
    // CAM authentication failed.
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied");
     
    private String value;
    private CynosdbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

