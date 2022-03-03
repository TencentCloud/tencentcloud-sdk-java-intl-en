package com.tencentcloudapi.sts.v20180813;
public enum StsErrorCode {
    // Invalid key.
     AUTHFAILURE_ACCESSKEYILLEGAL("AuthFailure.AccessKeyIllegal"),
     
    // Database error.
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // Encryption failed.
     INTERNALERROR_ENCRYPTERROR("InternalError.EncryptError"),
     
    // Failed to get the `appid`.
     INTERNALERROR_GETAPPIDERROR("InternalError.GetAppIdError"),
     
    // Failed to get the role.
     INTERNALERROR_GETROLEERROR("InternalError.GetRoleError"),
     
    // Failed to obtain the token.
     INTERNALERROR_GETSEEDTOKENERROR("InternalError.GetSeedTokenError"),
     
    // Invalid role.
     INTERNALERROR_ILLEGALROLE("InternalError.IllegalRole"),
     
    // pb packaging failed.
     INTERNALERROR_PBSERIALIZEERROR("InternalError.PbSerializeError"),
     
    // Internal system error, such as network error.
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // Unknown error.
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // This type of key is not supported.
     INVALIDPARAMETER_ACCESSKEYNOTSUPPORT("InvalidParameter.AccessKeyNotSupport"),
     
    // The account does not exist or is unavailable.
     INVALIDPARAMETER_ACCOUNTNOTAVALIABLE("InvalidParameter.AccountNotAvaliable"),
     
    // The extension policy is too large.
     INVALIDPARAMETER_EXTENDSTRATEGYOVERSIZE("InvalidParameter.ExtendStrategyOverSize"),
     
    // Unauthorized access to the resource.
     INVALIDPARAMETER_GRANTOTHERRESOURCE("InvalidParameter.GrantOtherResource"),
     
    // Frequency limit exceeded.
     INVALIDPARAMETER_OVERLIMIT("InvalidParameter.OverLimit"),
     
    // The expiration time exceeds the threshold.
     INVALIDPARAMETER_OVERTIMEERROR("InvalidParameter.OverTimeError"),
     
    // Invalid parameter.
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // The policy is too long.
     INVALIDPARAMETER_POLICYTOOLONG("InvalidParameter.PolicyTooLong"),
     
    // Six-segment resource description error.
     INVALIDPARAMETER_RESOUCEERROR("InvalidParameter.ResouceError"),
     
    // Policy syntax error.
     INVALIDPARAMETER_STRATEGYFORMATERROR("InvalidParameter.StrategyFormatError"),
     
    // Invalid policy.
     INVALIDPARAMETER_STRATEGYINVALID("InvalidParameter.StrategyInvalid"),
     
    // Invalid temporary code.
     INVALIDPARAMETER_TEMPCODENOTAVALIABLE("InvalidParameter.TempCodeNotAvaliable"),
     
    // The role corresponding to the account does not exist.
     RESOURCENOTFOUND_ROLENOTFOUND("ResourceNotFound.RoleNotFound"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private StsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

