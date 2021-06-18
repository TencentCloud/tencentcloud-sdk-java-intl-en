package com.tencentcloudapi.cynosdb.v20190107;
public enum CynosdbErrorCode {
    // Failed to create the order and make a payment.
     FAILEDOPERATION_CREATEORDER("FailedOperation.CreateOrder"),
     
    // Insufficient account balance.
     FAILEDOPERATION_INSUFFICIENTBALANCE("FailedOperation.InsufficientBalance"),
     
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
     
    // Failed to query instances by security group.
     INTERNALERROR_LISTINSTANCEFAILED("InternalError.ListInstanceFailed"),
     
    // Unsupported operation.
     INTERNALERROR_OPERATIONNOTSUPPORT("InternalError.OperationNotSupport"),
     
    // Failed to query the database.
     INTERNALERROR_QUERYDATABASEFAILED("InternalError.QueryDatabaseFailed"),
     
    // Internal system error.
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // The current instance cannot be isolated.
     INVALIDPARAMETER_ISOLATENOTALLOWED("InvalidParameter.IsolateNotAllowed"),
     
    // No cluster found.
     INVALIDPARAMETERVALUE_CLUSTERNOTFOUND("InvalidParameterValue.ClusterNotFound"),
     
    // Unsupported instance type.
     INVALIDPARAMETERVALUE_DBTYPENOTFOUND("InvalidParameterValue.DBTypeNotFound"),
     
    // No order ID found.
     INVALIDPARAMETERVALUE_DEALNAMENOTFOUND("InvalidParameterValue.DealNameNotFound"),
     
    // The instance name contains invalid characters.
     INVALIDPARAMETERVALUE_ILLEGALINSTANCENAME("InvalidParameterValue.IllegalInstanceName"),
     
    // Invalid sort by field.
     INVALIDPARAMETERVALUE_ILLEGALORDERBY("InvalidParameterValue.IllegalOrderBy"),
     
    // The password does not meet the requirement.
     INVALIDPARAMETERVALUE_ILLEGALPASSWORD("InvalidParameterValue.IllegalPassword"),
     
    // The instance does not exist.
     INVALIDPARAMETERVALUE_INSTANCENOTFOUND("InvalidParameterValue.InstanceNotFound"),
     
    // Invalid instance version.
     INVALIDPARAMETERVALUE_INVALIDDBVERSION("InvalidParameterValue.InvalidDBVersion"),
     
    // Invalid instance specification.
     INVALIDPARAMETERVALUE_INVALIDSPEC("InvalidParameterValue.InvalidSpec"),
     
    // Incorrect parameter.
     INVALIDPARAMETERVALUE_PARAMERROR("InvalidParameterValue.ParamError"),
     
    // The selected region and AZ are unavailable.
     INVALIDPARAMETERVALUE_REGIONZONEUNAVAILABLE("InvalidParameterValue.RegionZoneUnavailable"),
     
    // No related storage pool found.
     INVALIDPARAMETERVALUE_STORAGEPOOLNOTFOUND("InvalidParameterValue.StoragePoolNotFound"),
     
    // The selected subnet could not be found.
     INVALIDPARAMETERVALUE_SUBNETNOTFOUND("InvalidParameterValue.SubnetNotFound"),
     
    // The selected VPC could not be found.
     INVALIDPARAMETERVALUE_VPCNOTFOUND("InvalidParameterValue.VpcNotFound"),
     
    // The number of instances exceeds the limit.
     LIMITEXCEEDED_USERINSTANCELIMIT("LimitExceeded.UserInstanceLimit"),
     
    // Failed to lock the instance, so the operation cannot be performed temporarily.
     RESOURCEUNAVAILABLE_INSTANCELOCKFAIL("ResourceUnavailable.InstanceLockFail"),
     
    // The instance is exceptional, so the operation cannot be performed temporarily.
     RESOURCEUNAVAILABLE_INSTANCESTATUSABNORMAL("ResourceUnavailable.InstanceStatusAbnormal"),
     
    // Users who haven't completed identity verification cannot make purchases.
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

