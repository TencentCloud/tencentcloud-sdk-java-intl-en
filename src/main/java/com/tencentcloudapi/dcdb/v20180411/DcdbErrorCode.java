package com.tencentcloudapi.dcdb.v20180411;
public enum DcdbErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Failed to add the security group information of an instance.
     FAILEDOPERATION_ADDINSTANCEINFOFAILED("FailedOperation.AddInstanceInfoFailed"),
     
    // Failed to apply for VIP
     FAILEDOPERATION_APPLYVIPFAILED("FailedOperation.ApplyVipFailed"),
     
    // Failed to associate the security group.
     FAILEDOPERATION_ASSOCIATESECURITYGROUPSFAILED("FailedOperation.AssociateSecurityGroupsFailed"),
     
    // Authentication failed.
     FAILEDOPERATION_AUTHNOSTRATEGY("FailedOperation.AuthNoStrategy"),
     
    // Failed to clear the security group information of an instance.
     FAILEDOPERATION_CLEARINSTANCEINFOFAILED("FailedOperation.ClearInstanceInfoFailed"),
     
    // Error copying account permissions.
     FAILEDOPERATION_COPYRIGHTERROR("FailedOperation.CopyRightError"),
     
    // Failed to create the flow.
     FAILEDOPERATION_CREATEFLOWFAILED("FailedOperation.CreateFlowFailed"),
     
    // Failed to create an order.
     FAILEDOPERATION_CREATEORDERFAILED("FailedOperation.CreateOrderFailed"),
     
    // Failed to create the account.
     FAILEDOPERATION_CREATEUSERFAILED("FailedOperation.CreateUserFailed"),
     
    // Failed to delete the account.
     FAILEDOPERATION_DELETEUSERFAILED("FailedOperation.DeleteUserFailed"),
     
    // Failed to unassociate the security group.
     FAILEDOPERATION_DISASSOCIATESECURITYGROUPSFAILED("FailedOperation.DisassociateSecurityGroupsFailed"),
     
    // Failed to query the security group details
     FAILEDOPERATION_GETSECURITYGROUPDETAILFAILED("FailedOperation.GetSecurityGroupDetailFailed"),
     
    // Refund is not supported for the instance
     FAILEDOPERATION_INSTANCECANNOTRETURN("FailedOperation.InstanceCanNotReturn"),
     
    // Instance refund failed
     FAILEDOPERATION_INSTANCERETURNFAILED("FailedOperation.InstanceReturnFailed"),
     
    // Failed to modify account permissions.
     FAILEDOPERATION_MODIFYRIGHTFAILED("FailedOperation.ModifyRightFailed"),
     
    // Failed to modify account permissions
     FAILEDOPERATION_MODIFYUSERCONFIGFAILED("FailedOperation.ModifyUserConfigFailed"),
     
    // Failed to isolate the instance
     FAILEDOPERATION_OSSISOLATEINSTANCEFAILED("FailedOperation.OssIsolateInstanceFailed"),
     
    // Failed to request the backend API.
     FAILEDOPERATION_OSSOPERATIONFAILED("FailedOperation.OssOperationFailed"),
     
    // Failed to make order payment.
     FAILEDOPERATION_PAYFAILED("FailedOperation.PayFailed"),
     
    // Failed to reset the account password.
     FAILEDOPERATION_RESETPASSWORDFAILED("FailedOperation.ResetPasswordFailed"),
     
    // Failed to update the security group
     FAILEDOPERATION_SGCHANGEVIP("FailedOperation.SGChangeVip"),
     
    // Failed to set a rule.
     FAILEDOPERATION_SETRULELOCATIONFAILED("FailedOperation.SetRuleLocationFailed"),
     
    // Failed to publish security group rules
     FAILEDOPERATION_SETSVCLOCATIONFAILED("FailedOperation.SetSvcLocationFailed"),
     
    // Either tag key/value verification or tag API authentication failed.
     FAILEDOPERATION_TAGDRYRUNERROR("FailedOperation.TagDryRunError"),
     
    // Insufficient tags
     FAILEDOPERATION_TAGQUOTAEXCEEDLIMIT("FailedOperation.TagQuotaExceedLimit"),
     
    // Failed to update the security group information of an instance.
     FAILEDOPERATION_UPDATEINSTANCEINFOFAILED("FailedOperation.UpdateInstanceInfoFailed"),
     
    // Unverified user.
     FAILEDOPERATION_USERNOTAUTHED("FailedOperation.UserNotAuthed"),
     
    // VIP can’t be the same.
     FAILEDOPERATION_VIPNOTCHANGE("FailedOperation.VipNotChange"),
     
    // Failed to add service to VPC
     FAILEDOPERATION_VPCADDSERVICEFAILED("FailedOperation.VpcAddServiceFailed"),
     
    // Abnormal public network status
     FAILEDOPERATION_WANSTATUSABNORMAL("FailedOperation.WanStatusAbnormal"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // CAM authentication request failed.
     INTERNALERROR_CAMAUTHFAILED("InternalError.CamAuthFailed"),
     
    // Failed to verify the VIP status
     INTERNALERROR_CHECKVIPSTATUSFAILED("InternalError.CheckVipStatusFailed"),
     
    // Invalid COS instance address configuration.
     INTERNALERROR_COSCONFIGURATION("InternalError.CosConfiguration"),
     
    // Backup filename signature failed.
     INTERNALERROR_COSSIGNURL("InternalError.CosSignUrl"),
     
    // Failed to create a process
     INTERNALERROR_CREATEFLOWERROR("InternalError.CreateFlowError"),
     
    // Failed to create a task workflow.
     INTERNALERROR_CREATEFLOWFAILED("InternalError.CreateFlowFailed"),
     
    // No database data has changed.
     INTERNALERROR_DBROWSAFFECTEDERROR("InternalError.DBRowsAffectedError"),
     
    // Failed to query the database.
     INTERNALERROR_DBOPERATIONFAILED("InternalError.DbOperationFailed"),
     
    // Failed to query the information of a dedicated cluster.
     INTERNALERROR_FENCEERROR("InternalError.FenceError"),
     
    // Failed to get database instance parameters.
     INTERNALERROR_GETDBCONFIGFAILED("InternalError.GetDbConfigFailed"),
     
    // Failed to get database list.
     INTERNALERROR_GETDBLISTFAILED("InternalError.GetDbListFailed"),
     
    // Failed to get the database objects.
     INTERNALERROR_GETDBOBJECTFAILED("InternalError.GetDbObjectFailed"),
     
    // Failed to get the instance details.
     INTERNALERROR_GETINSTANCEDETAILFAILED("InternalError.GetInstanceDetailFailed"),
     
    // Failed to get the instance information.
     INTERNALERROR_GETINSTANCEINFOFAILED("InternalError.GetInstanceInfoFailed"),
     
    // Failed to get the current permissions of the account.
     INTERNALERROR_GETRIGHTFAILED("InternalError.GetRightFailed"),
     
    // Failed to query security group details.
     INTERNALERROR_GETSECURITYGROUPDETAILFAILED("InternalError.GetSecurityGroupDetailFailed"),
     
    // Failed to query slow query logs.
     INTERNALERROR_GETSLOWLOGFAILED("InternalError.GetSlowLogFailed"),
     
    // Failed to query the VPC subnet information.
     INTERNALERROR_GETSUBNETFAILED("InternalError.GetSubnetFailed"),
     
    // Failed to get the table information.
     INTERNALERROR_GETTABLEINFOFAILED("InternalError.GetTableInfoFailed"),
     
    // Failed to get the list of accounts.
     INTERNALERROR_GETUSERLISTFAILED("InternalError.GetUserListFailed"),
     
    // Failed to get the number of security groups
     INTERNALERROR_GETUSERSGCOUNTFAILED("InternalError.GetUserSGCountFailed"),
     
    // Failed to query the security group quota of the user.
     INTERNALERROR_GETUSGQUOTAERROR("InternalError.GetUsgQuotaError"),
     
    // Failed to query the VPC information.
     INTERNALERROR_GETVPCFAILED("InternalError.GetVpcFailed"),
     
    // Internal system error.
     INTERNALERROR_INNERSYSTEMERROR("InternalError.InnerSystemError"),
     
    // Failed to insert data into the database.
     INTERNALERROR_INSERTFAIL("InternalError.InsertFail"),
     
    // You have no permission to operate this instance.
     INTERNALERROR_INSTANCEOPERATEPERMISSIONERROR("InternalError.InstanceOperatePermissionError"),
     
    // The maximum number of security groups with which a single instance can associate has been reached.
     INTERNALERROR_INSTANCESGOVERLIMITERROR("InternalError.InstanceSGOverLimitError"),
     
    // The number of resources returned is inconsistent with the number specified in the request of querying instance information.
     INTERNALERROR_LISTINSTANCERESPRESOURCECOUNTNOTMATCHERROR("InternalError.ListInstanceRespResourceCountNotMatchError"),
     
    // An error occurred when querying instance information.
     INTERNALERROR_LISTINSTANCESERROR("InternalError.ListInstancesError"),
     
    // Database operation failed.
     INTERNALERROR_OPERATEDATABASEFAILED("InternalError.OperateDatabaseFailed"),
     
    // An error occurred when reading data from the database.
     INTERNALERROR_QUERYDATABASEFAILED("InternalError.QueryDatabaseFailed"),
     
    // Failed to query the order information.
     INTERNALERROR_QUERYORDERFAILED("InternalError.QueryOrderFailed"),
     
    // Failed to query the price
     INTERNALERROR_QUERYPRICEFAILED("InternalError.QueryPriceFailed"),
     
    // An error occurred when reading data from the database.
     INTERNALERROR_READDATABASEFAILED("InternalError.ReadDatabaseFailed"),
     
    // Invalid rollback time
     INTERNALERROR_RETREATETIME("InternalError.RetreateTime"),
     
    // Route not found.
     INTERNALERROR_ROUTENOTFOUND("InternalError.RouteNotFound"),
     
    // The security group policy of the resource failed to take effect.
     INTERNALERROR_SETSVCLOCATIONFAILED("InternalError.SetSvcLocationFailed"),
     
    // Failed to update the database.
     INTERNALERROR_UPDATEDATABASEFAILED("InternalError.UpdateDatabaseFailed"),
     
    // VPC operation failed
     INTERNALERROR_VPCOPERATIONFAILED("InternalError.VpcOperationFailed"),
     
    // Public network operation failed.
     INTERNALERROR_WANSERVICEFAILED("InternalError.WanServiceFailed"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The password contains invalid characters.
     INVALIDPARAMETER_CHARACTERERROR("InvalidParameter.CharacterError"),
     
    // Failed to verify input parameters.
     INVALIDPARAMETER_CHECKPARAMNOTPASS("InvalidParameter.CheckParamNotPass"),
     
    // The order ID to be queried is not specified.
     INVALIDPARAMETER_DEALNAMENOTGIVEN("InvalidParameter.DealNameNotGiven"),
     
    // The specified task information was not found.
     INVALIDPARAMETER_FLOWNOTFOUND("InvalidParameter.FlowNotFound"),
     
    // An error occurred while verifying parameter validity.
     INVALIDPARAMETER_GENERICPARAMETERERROR("InvalidParameter.GenericParameterError"),
     
    // Invalid parameters.
     INVALIDPARAMETER_ILLEGALPARAMETERERROR("InvalidParameter.IllegalParameterError"),
     
    // Incorrect time parameter.
     INVALIDPARAMETER_ILLEGALTIME("InvalidParameter.IllegalTime"),
     
    // Failed to find the requested instance.
     INVALIDPARAMETER_INSTANCENOTFOUND("InvalidParameter.InstanceNotFound"),
     
    // The API doesn’t support instances of this payment mode
     INVALIDPARAMETER_NOTSUPPORTEDPAYMODE("InvalidParameter.NotSupportedPayMode"),
     
    // You have no permission to manipulate this API or resource.
     INVALIDPARAMETER_PERMISSIONDENIED("InvalidParameter.PermissionDenied"),
     
    // Security group validity test failed.
     INVALIDPARAMETER_SGCHECKFAIL("InvalidParameter.SGCheckFail"),
     
    // No purchasable specifications found
     INVALIDPARAMETER_SPECNOTFOUND("InvalidParameter.SpecNotFound"),
     
    // The specified VPC subnet was not found.
     INVALIDPARAMETER_SUBNETNOTFOUND("InvalidParameter.SubnetNotFound"),
     
    // The SNAT subnet doesn’t support applying for IPs.
     INVALIDPARAMETER_SUBNETUNAVAILABLE("InvalidParameter.SubnetUnavailable"),
     
    // VIP is not in the subnet.
     INVALIDPARAMETER_VIPNOTINSUBNET("InvalidParameter.VipNotInSubnet"),
     
    // VIP is in use.
     INVALIDPARAMETER_VIPUSED("InvalidParameter.VipUsed"),
     
    // The specified VPC was not found.
     INVALIDPARAMETER_VPCNOTFOUND("InvalidParameter.VpcNotFound"),
     
    // Vport is in use.
     INVALIDPARAMETER_VPORTUSED("InvalidParameter.VportUsed"),
     
    // Incorrect AZ information.
     INVALIDPARAMETER_ZONEIDILLEGAL("InvalidParameter.ZoneIdIllegal"),
     
    // The account to be created already exists.
     INVALIDPARAMETERVALUE_ACCOUNTALREADYEXISTS("InvalidParameterValue.AccountAlreadyExists"),
     
    // The instance does not support this sync mode.
     INVALIDPARAMETERVALUE_BADSYNCMODE("InvalidParameterValue.BadSyncMode"),
     
    // The specified permission could not be granted to this account.
     INVALIDPARAMETERVALUE_BADUSERRIGHT("InvalidParameterValue.BadUserRight"),
     
    // Invalid account type.
     INVALIDPARAMETERVALUE_BADUSERTYPE("InvalidParameterValue.BadUserType"),
     
    // The dedicated cluster to which the database instance belongs was not found.
     INVALIDPARAMETERVALUE_ILLEGALEXCLUSTERID("InvalidParameterValue.IllegalExclusterID"),
     
    // An error occurred while initializing database instance parameters.
     INVALIDPARAMETERVALUE_ILLEGALINITPARAM("InvalidParameterValue.IllegalInitParam"),
     
    // The number of products exceeds the upper limit.
     INVALIDPARAMETERVALUE_ILLEGALQUANTITY("InvalidParameterValue.IllegalQuantity"),
     
    // Incorrect permission parameter
     INVALIDPARAMETERVALUE_ILLEGALRIGHTPARAM("InvalidParameterValue.IllegalRightParam"),
     
    // The specified AZ was not found.
     INVALIDPARAMETERVALUE_ILLEGALZONE("InvalidParameterValue.IllegalZone"),
     
    // Parameter input error
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUEERROR("InvalidParameterValue.InvalidParameterValueError"),
     
    // The specification information of the database instance was not found.
     INVALIDPARAMETERVALUE_SPECIDILLEGAL("InvalidParameterValue.SpecIdIllegal"),
     
    // Operations by a system user are not allowed.
     INVALIDPARAMETERVALUE_SUPERUSERFORBIDDEN("InvalidParameterValue.SuperUserForbidden"),
     
    // The deployment mode does not support setting the sync mode.
     INVALIDPARAMETERVALUE_SYNCMODENOTALLOWED("InvalidParameterValue.SyncModeNotAllowed"),
     
    // Insufficient resources 
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The specified account does not exist.
     RESOURCENOTFOUND_ACCOUNTDOESNOTEXIST("ResourceNotFound.AccountDoesNotExist"),
     
    // The instance doesn’t exist.
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
    // The specified database instance was not found.
     RESOURCENOTFOUND_NOINSTANCEFOUND("ResourceNotFound.NoInstanceFound"),
     
    // Failed to find the configuration of the product associated with the security group.
     RESOURCENOTFOUND_PRODUCTCONFIGNOTEXISTEDERROR("ResourceNotFound.ProductConfigNotExistedError"),
     
    // Incorrect instance status. Unable to initialize.
     RESOURCEUNAVAILABLE_BADINSTANCESTATUS("ResourceUnavailable.BadInstanceStatus"),
     
    // An error occurred while calling COS APIs.
     RESOURCEUNAVAILABLE_COSAPIFAILED("ResourceUnavailable.CosApiFailed"),
     
    // Abnormal dedicated cluster status
     RESOURCEUNAVAILABLE_EXCLUSTERSTATUSABNORMAL("ResourceUnavailable.ExclusterStatusAbnormal"),
     
    // The database instance has been dropped.
     RESOURCEUNAVAILABLE_INSTANCEALREADYDELETED("ResourceUnavailable.InstanceAlreadyDeleted"),
     
    // The database instance has been locked. Operations are not allowed.
     RESOURCEUNAVAILABLE_INSTANCEHASBEENLOCKED("ResourceUnavailable.InstanceHasBeenLocked"),
     
    // Incorrect database instance status. Operations are not allowed.
     RESOURCEUNAVAILABLE_INSTANCESTATUSABNORMAL("ResourceUnavailable.InstanceStatusAbnormal"),
     
    // Failed to verify the security group
     RESOURCEUNAVAILABLE_SGCHECKFAIL("ResourceUnavailable.SGCheckFail"),
     
    // You have no permission to manipulate this API or resource.
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied"),
     
    // This database version is not supported.
     UNSUPPORTEDOPERATION_DBVERSIONNOTSUPPORTED("UnsupportedOperation.DbVersionNotSupported"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION_INVALIDOPERATION("UnsupportedOperation.InvalidOperation"),
     
    // The proxy program is too old. Please contact customer service for upgrade and try again.
     UNSUPPORTEDOPERATION_OLDPROXYVERSION("UnsupportedOperation.OldProxyVersion");
     
    private String value;
    private DcdbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

