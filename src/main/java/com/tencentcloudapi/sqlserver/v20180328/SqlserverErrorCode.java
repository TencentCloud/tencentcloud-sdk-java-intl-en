package com.tencentcloudapi.sqlserver.v20180328;
public enum SqlserverErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Failed to access COS.
     FAILEDOPERATION_COSERROR("FailedOperation.CosError"),
     
    // Errors occurred while acquiring uploaded configuration information.
     FAILEDOPERATION_COSPROPERTIESERROR("FailedOperation.CosPropertiesError"),
     
    // Failed to create order.
     FAILEDOPERATION_CREATEORDERFAILED("FailedOperation.CreateOrderFailed"),
     
    // Database error.
     FAILEDOPERATION_DBERROR("FailedOperation.DBError"),
     
    // The operation failed or the network timed out.
     FAILEDOPERATION_GCSERROR("FailedOperation.GcsError"),
     
    // Failed to get VPC information.
     FAILEDOPERATION_GETVPCFAILED("FailedOperation.GetVpcFailed"),
     
    // Locking the backup import task failed.
     FAILEDOPERATION_MIGRATIONLOCKERROR("FailedOperation.MigrationLockError"),
     
    // The operation is not supported.
     FAILEDOPERATION_NOTSUPPORT("FailedOperation.NotSupport"),
     
    // Failed to query order.
     FAILEDOPERATION_QUERYORDERFAILED("FailedOperation.QueryOrderFailed"),
     
    // Billing error. Failed to query price.
     FAILEDOPERATION_QUERYPRICEFAILED("FailedOperation.QueryPriceFailed"),
     
    // Failed to operate the network or the session timed out.
     FAILEDOPERATION_VPCERROR("FailedOperation.VPCError"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // CAM authentication request failed.
     INTERNALERROR_CAMAUTHFAILED("InternalError.CamAuthFailed"),
     
    // COS API error.
     INTERNALERROR_COSERROR("InternalError.CosError"),
     
    // Failed to create flow.
     INTERNALERROR_CREATEFLOWFAILED("InternalError.CreateFlowFailed"),
     
    // Database connection error.
     INTERNALERROR_DBCONNECTERROR("InternalError.DBConnectError"),
     
    // Database error
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // GCS API error.
     INTERNALERROR_GCSERROR("InternalError.GcsError"),
     
    // Errors occurred while acquiring temporary keys.
     INTERNALERROR_STSERROR("InternalError.StsError"),
     
    // System error.
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // Unknown error.
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // VPC error
     INTERNALERROR_VPCERROR("InternalError.VPCError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Input error.
     INVALIDPARAMETER_INPUTILLEGAL("InvalidParameter.InputIllegal"),
     
    // The API does not exist.
     INVALIDPARAMETER_INTERFACENAMENOTFOUND("InvalidParameter.InterfaceNameNotFound"),
     
    // An error occurred while converting parameter assertion.
     INVALIDPARAMETER_PARAMSASSERTFAILED("InvalidParameter.ParamsAssertFailed"),
     
    // Failed to make order payment.
     INVALIDPARAMETER_PAYORDERFAILED("InvalidParameter.PayOrderFailed"),
     
    // The parameter value is invalid.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Account already exists.
     INVALIDPARAMETERVALUE_ACCOUNTEXIST("InvalidParameterValue.AccountExist"),
     
    // The account name is invalid.
     INVALIDPARAMETERVALUE_ACCOUNTNAMEISILLEGAL("InvalidParameterValue.AccountNameIsIllegal"),
     
    // The account name includes restricted contents. 
     INVALIDPARAMETERVALUE_ACCOUNTNAMEISKEYWORDS("InvalidParameterValue.AccountNameIsKeyWords"),
     
    // The account remarks are invalid.
     INVALIDPARAMETERVALUE_ACCOUNTREMARKISILLEGAL("InvalidParameterValue.AccountRemarkIsIllegal"),
     
    // You can only apply for one admin account.
     INVALIDPARAMETERVALUE_ADMINACCOUNTNOTUNIQUE("InvalidParameterValue.AdminAccountNotUnique"),
     
    // The backup name contains invalid characters.
     INVALIDPARAMETERVALUE_BACKUPNAMEISILLEGAL("InvalidParameterValue.BackupNameIsIllegal"),
     
    // Invalid number of purchased instances.
     INVALIDPARAMETERVALUE_BADGOODSNUM("InvalidParameterValue.BadGoodsNum"),
     
    // The database character set is incorrectly set.
     INVALIDPARAMETERVALUE_CHARSETISILLEGAL("InvalidParameterValue.CharsetIsIllegal"),
     
    // Wrong upload path.
     INVALIDPARAMETERVALUE_COSPATHERROR("InvalidParameterValue.CosPathError"),
     
    // Billing type error.
     INVALIDPARAMETERVALUE_COSTTYPENOTSUPPORTED("InvalidParameterValue.CostTypeNotSupported"),
     
    // The database name contains invalid characters.
     INVALIDPARAMETERVALUE_DBCHARILLEGAL("InvalidParameterValue.DBCharIllegal"),
     
    // The database already exists.
     INVALIDPARAMETERVALUE_DBEXIST("InvalidParameterValue.DBExist"),
     
    // The database name cannot contain reserved words.
     INVALIDPARAMETERVALUE_DBNAMEISKEYWRODS("InvalidParameterValue.DBNameIsKeyWrods"),
     
    // The database name is required.
     INVALIDPARAMETERVALUE_DBNAMENOTNULL("InvalidParameterValue.DBNameNotNull"),
     
    // The new database name is the same as the old one.
     INVALIDPARAMETERVALUE_DBNAMESAME("InvalidParameterValue.DBNameSame"),
     
    // The database remarks are invalid.
     INVALIDPARAMETERVALUE_DATABASEREMARKISILLEGAL("InvalidParameterValue.DataBaseRemarkIsIllegal"),
     
    // Invalid parameter. The value of `GRANT` is invalid.
     INVALIDPARAMETERVALUE_GRANTISILLEGAL("InvalidParameterValue.GrantIsIllegal"),
     
    // Invalid region.
     INVALIDPARAMETERVALUE_ILLEGALREGION("InvalidParameterValue.IllegalRegion"),
     
    // Incorrect instance specification information.
     INVALIDPARAMETERVALUE_ILLEGALSPEC("InvalidParameterValue.IllegalSpec"),
     
    // Incorrect AZ ID.
     INVALIDPARAMETERVALUE_ILLEGALZONE("InvalidParameterValue.IllegalZone"),
     
    // The expansion capacity of the instance is lower than the current capacity.
     INVALIDPARAMETERVALUE_INSTANCEEXPANDVOLUMELOW("InvalidParameterValue.InstanceExpandVolumeLow"),
     
    // The instance name contains invalid characters.
     INVALIDPARAMETERVALUE_INSTANCENAMEISILLEGAL("InvalidParameterValue.InstanceNameIsIllegal"),
     
    // The migration name contains invalid characters.
     INVALIDPARAMETERVALUE_MIGRATIONNAMEISILLEGAL("InvalidParameterValue.MigrationNameIsIllegal"),
     
    // Only `enable` and `disable` are valid values.
     INVALIDPARAMETERVALUE_MODIFYTYPEVALUEINVALID("InvalidParameterValue.ModifyTypeValueInvalid"),
     
    // Basic edition instances are not supported.
     INVALIDPARAMETERVALUE_ONCVMTYPENOTSUPPORTED("InvalidParameterValue.OnCvmTypeNotSupported"),
     
    // Incorrect parameter type.
     INVALIDPARAMETERVALUE_PARAMETERTYPEERROR("InvalidParameterValue.ParameterTypeError"),
     
    // The account and password are invalid.
     INVALIDPARAMETERVALUE_PASSWORDISILLEGAL("InvalidParameterValue.PasswordIsIllegal"),
     
    // Incorrect database permission settings.
     INVALIDPARAMETERVALUE_PRIVILEGEISILLEGAL("InvalidParameterValue.PrivilegeIsIllegal"),
     
    // Read-only group name contains invalid characters.
     INVALIDPARAMETERVALUE_ROGROUPNAMEISILLEGAL("InvalidParameterValue.RoGroupNameIsIllegal"),
     
    // Invalid security group ID.
     INVALIDPARAMETERVALUE_SECURITYGROUPIDISILLEGAL("InvalidParameterValue.SecurityGroupIdIsIllegal"),
     
    // The database limit is exceeded.
     LIMITEXCEEDED_TOOMANYDB("LimitExceeded.TooManyDB"),
     
    // Error of missing parameters.
     MISSINGPARAMETER("MissingParameter"),
     
    // An incremental backup import task to be started already exists.
     RESOURCEINUSE_INCREMENTALMIGRATIONEXIST("ResourceInUse.IncrementalMigrationExist"),
     
    // Resource not found.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The account does not exist.
     RESOURCENOTFOUND_ACCOUNTNOTEXIST("ResourceNotFound.AccountNotExist"),
     
    // The backup does not exist.
     RESOURCENOTFOUND_BACKUPNOTFOUND("ResourceNotFound.BackupNotFound"),
     
    // The database does not exist.
     RESOURCENOTFOUND_DBNOTEXIT("ResourceNotFound.DBNotExit"),
     
    // The database does not exist.
     RESOURCENOTFOUND_DBNOTFOUND("ResourceNotFound.DBNotFound"),
     
    // The full backup import task does not exist.
     RESOURCENOTFOUND_FULLBACKUPMIGRATIONNOTEXIST("ResourceNotFound.FullBackupMigrationNotExist"),
     
    // The incremental backup import task does not exist.
     RESOURCENOTFOUND_INCREBACKUPMIGRATIONNOTEXIST("ResourceNotFound.IncreBackupMigrationNotExist"),
     
    // The instance does not exist.
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
    // Parameter not found.
     RESOURCENOTFOUND_PARAMSNOTFOUND("ResourceNotFound.ParamsNotFound"),
     
    // The VPC does not exist.
     RESOURCENOTFOUND_VPCNOTEXIST("ResourceNotFound.VpcNotExist"),
     
    // Invalid account status.
     RESOURCEUNAVAILABLE_ACCOUNTINVALIDSTATUS("ResourceUnavailable.AccountInvalidStatus"),
     
    // The restoration type does not support incremental backup import.
     RESOURCEUNAVAILABLE_BACKUPMIGRATIONRECOVERYTYPEERR("ResourceUnavailable.BackupMigrationRecoveryTypeErr"),
     
    // A wrong status of offline restoration tasks.
     RESOURCEUNAVAILABLE_COSSTATUSERR("ResourceUnavailable.CosStatusErr"),
     
    // Invalid database status.
     RESOURCEUNAVAILABLE_DBINVALIDSTATUS("ResourceUnavailable.DBInvalidStatus"),
     
    // Invalid instance migration region.
     RESOURCEUNAVAILABLE_INSTANCEMIGRATEREGIONILLEGAL("ResourceUnavailable.InstanceMigrateRegionIllegal"),
     
    // Invalid instance migration status.
     RESOURCEUNAVAILABLE_INSTANCEMIGRATESTATUSINVALID("ResourceUnavailable.InstanceMigrateStatusInvalid"),
     
    // Invalid instance status.
     RESOURCEUNAVAILABLE_INSTANCESTATUSINVALID("ResourceUnavailable.InstanceStatusInvalid"),
     
    // Read-Only instances are not supported.
     RESOURCEUNAVAILABLE_NOTSUPPORTROINSTANCE("ResourceUnavailable.NotSupportRoInstance"),
     
    // VPC not found.
     RESOURCEUNAVAILABLE_VPCNOTEXIST("ResourceUnavailable.VpcNotExist"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // CAM authentication error.
     UNAUTHORIZEDOPERATION_PERMISSIONDENIED("UnauthorizedOperation.PermissionDenied"),
     
    // Unknown parameter error
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // The operation is not supported.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Repeated operations are not supported.
     UNSUPPORTEDOPERATION_NOTSUPPORTREPEAT("UnsupportedOperation.NotSupportRepeat"),
     
    // A wrong upload type.
     UNSUPPORTEDOPERATION_UPLOADTYPEERROR("UnsupportedOperation.UploadTypeError");
     
    private String value;
    private SqlserverErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

