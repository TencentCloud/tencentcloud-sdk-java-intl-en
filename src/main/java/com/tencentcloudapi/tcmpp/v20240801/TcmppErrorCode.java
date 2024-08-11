package com.tencentcloudapi.tcmpp.v20240801;
public enum TcmppErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // DryRun operation, indicating that the request will be successful, but with an additional DryRun parameter.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Failed to delete: the application is bound with an ongoing approval ticket.
     FAILEDOPERATION_APPALREADYBINDAUDIT("FailedOperation.AppAlreadyBindAudit"),
     
    // Failed to delete: This app is bound to a mini program.
     FAILEDOPERATION_APPALREADYBINDMINIPROGRAM("FailedOperation.AppAlreadyBindMiniProgram"),
     
    // The domain name is already in the blocklist.
     FAILEDOPERATION_EXISTBLACKDOMAIN("FailedOperation.ExistBlackDomain"),
     
    // The team name already exists.
     FAILEDOPERATION_EXISTENTERPRISENAME("FailedOperation.ExistEnterpriseName"),
     
    // Failed to add: The domain name URL already exists. 
     FAILEDOPERATION_EXISTREPEATDOMAINURL("FailedOperation.ExistRepeatDomainUrl"),
     
    // The sensitive API already exists.
     FAILEDOPERATION_EXISTSENSITIVEAPI("FailedOperation.ExistSensitiveAPI"),
     
    // The domain name is already in the allowlist.
     FAILEDOPERATION_EXISTWHITEDOMAIN("FailedOperation.ExistWhiteDomain"),
     
    // Failed to obtain the operation resource.
     FAILEDOPERATION_GETOPERATERESOURCEFAILED("FailedOperation.GetOperateResourceFailed"),
     
    // Invalid team information
     FAILEDOPERATION_INVALIDREQUESTENTERPRISEINFO("FailedOperation.InvalidRequestEnterpriseInfo"),
     
    // User login authentication failed.
     FAILEDOPERATION_LOGINAUTHFAILED("FailedOperation.LoginAuthFailed"),
     
    // Failed to parse the mini program icon.
     FAILEDOPERATION_MINIPROGRAMICONANALYSISFAILED("FailedOperation.MiniProgramIconAnalysisFailed"),
     
    // Unauthorized operation
     FAILEDOPERATION_NOACCESSPERMISSION("FailedOperation.NoAccessPermission"),
     
    // The current team does not have the permission to create applications.
     FAILEDOPERATION_OPERATIONSTEAMNOAPPLICATIONPERMISSION("FailedOperation.OperationsTeamNoApplicationPermission"),
     
    // The current operation team does not have permission to create a mini program.
     FAILEDOPERATION_OPERATIONSTEAMNOMINIPROGRAMPERMISSION("FailedOperation.OperationsTeamNoMiniProgramPermission"),
     
    // The record does not exist.
     FAILEDOPERATION_RECORDNOTFOUND("FailedOperation.RecordNotFound"),
     
    // Failed to parse request parameters.
     FAILEDOPERATION_REQUESTPARAMANALYSISFAILED("FailedOperation.RequestParamAnalysisFailed"),
     
    // The preview version already exists.
     FAILEDOPERATION_SHOWCASEVERSIONALREADYEXIST("FailedOperation.ShowcaseVersionAlreadyExist"),
     
    // System error.
     FAILEDOPERATION_SYSTEMERROR("FailedOperation.SystemError"),
     
    // Internal error
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The application name already exists.
     INVALIDPARAMETERVALUE_APPNAMEALREADYEXIST("InvalidParameterValue.AppNameAlreadyExist"),
     
    // The account already exists.
     INVALIDPARAMETERVALUE_EXISTUSERACCOUNT("InvalidParameterValue.ExistUserAccount"),
     
    // Invalid mini program ID.
     INVALIDPARAMETERVALUE_INVALIDMINIAPPID("InvalidParameterValue.InvalidMiniAppId"),
     
    // Invalid team ID
     INVALIDPARAMETERVALUE_INVALIDTEAMID("InvalidParameterValue.InvalidTeamId"),
     
    // Invalid user
     INVALIDPARAMETERVALUE_INVALIDUSERID("InvalidParameterValue.InvalidUserId"),
     
    // The mini program name already exists.
     INVALIDPARAMETERVALUE_MINIPROGRAMNAMEALREADYEXIST("InvalidParameterValue.MiniProgramNameAlreadyExist"),
     
    // Invalid team type
     INVALIDPARAMETERVALUE_TEAMTYPEMISMATCH("InvalidParameterValue.TeamTypeMismatch"),
     
    // The user is not in the specified team.
     INVALIDPARAMETERVALUE_USERTEAMRELATIONNOTEXIST("InvalidParameterValue.UserTeamRelationNotExist"),
     
    // Missing required parameters.
     MISSINGPARAMETER("MissingParameter"),
     
    // No valid login information found.
     MISSINGPARAMETER_LOGININFONOTFOUND("MissingParameter.LoginInfoNotFound"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // Too frequent requests
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is occupied.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resources.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is not available.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknow parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // The operation is not supported.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TcmppErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

