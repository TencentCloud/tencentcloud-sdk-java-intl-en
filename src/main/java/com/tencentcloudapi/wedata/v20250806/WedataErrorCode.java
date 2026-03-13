package com.tencentcloudapi.wedata.v20250806;
public enum WedataErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* Not logged in or login has expired. */
     AUTHFAILURE_SIGNATUREEXPIRE("AuthFailure.SignatureExpire"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Resource status of the current operation is invalid. */
     FAILEDOPERATION_EXECUTORCLUSTERSTATUSERROR("FailedOperation.ExecutorClusterStatusError"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Missing required parameters or invalid parameters. */
     INTERNALERROR_INVALIDPARAMETER("InternalError.InvalidParameter"),
     
     /* Unknown error. */
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Client ip is unauthorized. */
     INVALIDPARAMETER_CLIENTIPNOTAUTHORIZED("InvalidParameter.ClientIpNotAuthorized"),
     
     /* Incorrect query filter parameter. */
     INVALIDPARAMETER_INVALIDFILTERPARAMETER("InvalidParameter.InvalidFilterParameter"),
     
     /* Illegal parameter. */
     INVALIDPARAMETER_INVALIDPARAMSERROR("InvalidParameter.InvalidParamsError"),
     
     /* Missing Servlet Request Parameter */
     INVALIDPARAMETER_MISSINGREQUESTPARAMETER("InvalidParameter.MissingRequestParameter"),
     
     /* System security quota exceeded. */
     INVALIDPARAMETER_QUOTAEXCEEDERROR("InvalidParameter.QuotaExceedError"),
     
     /* Duplicate project name. */
     INVALIDPARAMETER_WORKSPACENAMEDUPLICATION("InvalidParameter.WorkspaceNameDuplication"),
     
     /* Workspace does not exist. */
     INVALIDPARAMETER_WORKSPACENOTEXIST("InvalidParameter.WorkspaceNotExist"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Invalid parameter. */
     INVALIDPARAMETERVALUE_PARAMILLEGALERROR("InvalidParameterValue.ParamIllegalError"),
     
     /* Alarm rule name is duplicate. */
     INVALIDPARAMETERVALUE_RULENAMEREPEATED("InvalidParameterValue.RuleNameRepeated"),
     
     /* Param Validation Error */
     INVALIDPARAMETERVALUE_VALIDATIONERROR("InvalidParameterValue.ValidationError"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Parameter missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* User not in allowlist. */
     OPERATIONDENIED_USERNOTINWHITELISTERROR("OperationDenied.UserNotInWhitelistError"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* The user is not a member of the current project. */
     UNAUTHORIZEDOPERATION_USERNOTINPROJECT("UnauthorizedOperation.UserNotInProject"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
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

