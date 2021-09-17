package com.tencentcloudapi.chdfs.v20201112;
public enum ChdfsErrorCode {
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The file system is not empty.
     FAILEDOPERATION_FILESYSTEMNOTEMPTY("FailedOperation.FileSystemNotEmpty"),
     
    // The file system capacity after change is smaller than the currently used capacity.
     FAILEDOPERATION_QUOTALESSTHANCURRENTUSED("FailedOperation.QuotaLessThanCurrentUsed"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Incorrect parameter value: AccessGroupId.
     INVALIDPARAMETERVALUE_INVALIDACCESSGROUPID("InvalidParameterValue.InvalidAccessGroupId"),
     
    // Incorrect parameter value: AccessGroupName.
     INVALIDPARAMETERVALUE_INVALIDACCESSGROUPNAME("InvalidParameterValue.InvalidAccessGroupName"),
     
    // Incorrect parameter value: `Address` of the permission rule.
     INVALIDPARAMETERVALUE_INVALIDACCESSRULEADDRESS("InvalidParameterValue.InvalidAccessRuleAddress"),
     
    // Incorrect parameter value: CapacityQuota.
     INVALIDPARAMETERVALUE_INVALIDCAPACITYQUOTA("InvalidParameterValue.InvalidCapacityQuota"),
     
    // Incorrect parameter value: Description.
     INVALIDPARAMETERVALUE_INVALIDDESCRIPTION("InvalidParameterValue.InvalidDescription"),
     
    // Incorrect parameter value: FileSystemId.
     INVALIDPARAMETERVALUE_INVALIDFILESYSTEMID("InvalidParameterValue.InvalidFileSystemId"),
     
    // Incorrect parameter value: FileSystemName.
     INVALIDPARAMETERVALUE_INVALIDFILESYSTEMNAME("InvalidParameterValue.InvalidFileSystemName"),
     
    // Incorrect parameter value: MountPointId.
     INVALIDPARAMETERVALUE_INVALIDMOUNTPOINTID("InvalidParameterValue.InvalidMountPointId"),
     
    // Incorrect parameter value: MountPointName.
     INVALIDPARAMETERVALUE_INVALIDMOUNTPOINTNAME("InvalidParameterValue.InvalidMountPointName"),
     
    // Incorrect parameter value: VpcId.
     INVALIDPARAMETERVALUE_INVALIDVPCID("InvalidParameterValue.InvalidVpcId"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // The operation was denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The permission group does not exist.
     RESOURCENOTFOUND_ACCESSGROUPNOTEXISTS("ResourceNotFound.AccessGroupNotExists"),
     
    // The permission rule does not exist.
     RESOURCENOTFOUND_ACCESSRULENOTEXISTS("ResourceNotFound.AccessRuleNotExists"),
     
    // The file system does not exist.
     RESOURCENOTFOUND_FILESYSTEMNOTEXISTS("ResourceNotFound.FileSystemNotExists"),
     
    // The mount point does not exist.
     RESOURCENOTFOUND_MOUNTPOINTNOTEXISTS("ResourceNotFound.MountPointNotExists"),
     
    // The VPC does not exist.
     RESOURCENOTFOUND_VPCNOTEXISTS("ResourceNotFound.VpcNotExists"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private ChdfsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

