package com.tencentcloudapi.wedata.v20210820;
public enum WedataErrorCode {
    // CAM Signature/Authentication Error.
     AUTHFAILURE("AuthFailure"),
     
    // Not logged in or login has expired.
     AUTHFAILURE_SIGNATUREEXPIRE("AuthFailure.SignatureExpire"),
     
    // CAM not authorized, please contact the primary account to grant the QcloudWeDataFullAccess policy to this account.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // Dry Run Operation, indicating that the request would be successful, but the DryRun parameter was additionally passed.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation Failure.
     FAILEDOPERATION("FailedOperation"),
     
    // Query data development resource lock status - Current user does not hold the lock
     FAILEDOPERATION_NOLOCK("FailedOperation.NoLock"),
     
    // An internal error occurs.
     INTERNALERROR("InternalError"),
     
    // External System Call Exception.
     INTERNALERROR_CALLSCHEDULERAPIERROR("InternalError.CallSchedulerApiError"),
     
    // Failed to call TencentCloud API.
     INTERNALERROR_INTERNALCALLCLOUDAPIERROR("InternalError.InternalCallCloudApiError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Data Engine Instance does not exist.
     INVALIDPARAMETER_DATAENGINEINSTANCENOTEXISTS("InvalidParameter.DataEngineInstanceNotExists"),
     
    // Duplicate Name.
     INVALIDPARAMETER_DUPLICATENAME("InvalidParameter.DuplicateName"),
     
    // Incorrect Query Filter Parameter.
     INVALIDPARAMETER_INVALIDFILTERPARAMETER("InvalidParameter.InvalidFilterParameter"),
     
    // Rule does not exist.
     INVALIDPARAMETER_RULENOTEXIST("InvalidParameter.RuleNotExist"),
     
    // Rule Template does not exist.
     INVALIDPARAMETER_RULETEMPLATENOTEXIST("InvalidParameter.RuleTemplateNotExist"),
     
    // Service Busy, please try again later.
     INVALIDPARAMETER_SERVICEISBUSY("InvalidParameter.ServiceIsBusy"),
     
    // WeData_QCSRole does not exist, please authorize the service.
     INVALIDPARAMETER_WEDATAROLENOTEXISTS("InvalidParameter.WeDataRoleNotExists"),
     
    // Workspace does not exist.
     INVALIDPARAMETER_WORKSPACENOTEXIST("InvalidParameter.WorkspaceNotExist"),
     
    // Parameter value error.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Quota limit exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing Parameter Error.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation Rejected.
     OPERATIONDENIED("OperationDenied"),
     
    // The user is not in the allowlist.
     OPERATIONDENIED_USERNOTINWHITELISTERROR("OperationDenied.UserNotInWhitelistError"),
     
    // The number of requests exceeded the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // Resource Occupied.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resources.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // Resource Unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Resources sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // Unauthorized Operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // User is not a member of the current project.
     UNAUTHORIZEDOPERATION_USERNOTINPROJECT("UnauthorizedOperation.UserNotInProject"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Operation not supported.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Please configure at least one rule first.
     UNSUPPORTEDOPERATION_NORULEINRULEGROUP("UnsupportedOperation.NoRuleInRuleGroup");
     
    private String value;
    private WedataErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

