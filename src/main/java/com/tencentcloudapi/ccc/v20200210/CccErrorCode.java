package com.tencentcloudapi.ccc.v20200210;
public enum CccErrorCode {
    // Outbound call failure.
     FAILEDOPERATION_CALLOUTFAILED("FailedOperation.CallOutFailed"),
     
    // High-risk users, do not call
     FAILEDOPERATION_CALLEEISBLACKUSER("FailedOperation.CalleeIsBlackUser"),
     
    // Limited outbound called number.
     FAILEDOPERATION_CALLEEISLIMITED("FailedOperation.CalleeIsLimited"),
     
    // Outbound over-frequency caller number.
     FAILEDOPERATION_CALLEROVERFREQUENCY("FailedOperation.CallerOverFrequency"),
     
    // Trigger Default Inbound Rule, Call Blind Spot
     FAILEDOPERATION_CALLOUTRULEBLINDAREA("FailedOperation.CalloutRuleBlindArea"),
     
    // Trigger Default Outbound Rule, Call Volume for Called Party within a Period
     FAILEDOPERATION_CALLOUTRULEMAXCALLCOUNTCALLEEINTERVALTIME("FailedOperation.CalloutRuleMaxCallCountCalleeIntervalTime"),
     
    // Trigger Default Outbound Rule, Daily Maximum Calls for Called Party
     FAILEDOPERATION_CALLOUTRULEMAXCALLCOUNTCALLEEPERDAYAPPID("FailedOperation.CalloutRuleMaxCallCountCalleePerDayAppID"),
     
    // Trigger Default Outbound Rule, Not in Outbound Time
     FAILEDOPERATION_CALLOUTRULENOTWORKTIME("FailedOperation.CalloutRuleNotWorkTime"),
     
    // The current number status cannot be modified.
     FAILEDOPERATION_CURSTATENOTALLOWMODIFY("FailedOperation.CurStateNotAllowModify"),
     
    // Duplicate account.
     FAILEDOPERATION_DUPLICATEDACCOUNT("FailedOperation.DuplicatedAccount"),
     
    // No available outbound call numbers.
     FAILEDOPERATION_NOCALLOUTNUMBER("FailedOperation.NoCallOutNumber"),
     
    // Insufficient permissions.
     FAILEDOPERATION_PERMISSIONDENIED("FailedOperation.PermissionDenied"),
     
    // Agent is busy.
     FAILEDOPERATION_SEATSTATUSBUSY("FailedOperation.SeatStatusBusy"),
     
    // Number of Uploaded Files exceeds the limit
     FAILEDOPERATION_UPLOADFILEOVERFLOW("FailedOperation.UploadFileOverflow"),
     
    // An internal error occurs.
     INTERNALERROR("InternalError"),
     
    // Internal database access failure.
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Duplicate address.
     INVALIDPARAMETER_DUPLICATEADDRESS("InvalidParameter.DuplicateAddress"),
     
    // Duplicate number
     INVALIDPARAMETER_DUPLICATEPHONENUMBER("InvalidParameter.DuplicatePhoneNumber"),
     
    // Duplicate SIP account
     INVALIDPARAMETER_DUPLICATESIPACCOUNT("InvalidParameter.DuplicateSipAccount"),
     
    // Illegal address.
     INVALIDPARAMETER_ILLEGALADDRESS("InvalidParameter.IllegalAddress"),
     
    // Illegal number.
     INVALIDPARAMETER_ILLEGALPHONENUMBER("InvalidParameter.IllegalPhoneNumber"),
     
    // The instance does not exist.
     INVALIDPARAMETER_INSTANCENOTEXIST("InvalidParameter.InstanceNotExist"),
     
    // Invalid address.
     INVALIDPARAMETER_INVALIDADDRESS("InvalidParameter.InvalidAddress"),
     
    // Invalid IP information.
     INVALIDPARAMETER_INVALIDIP("InvalidParameter.InvalidIP"),
     
    // Invalid number
     INVALIDPARAMETER_INVALIDPHONENUMBER("InvalidParameter.InvalidPhoneNumber"),
     
    // Invalid port information.
     INVALIDPARAMETER_INVALIDPORT("InvalidParameter.InvalidPort"),
     
    // Illegal password. (The length should be no less than 8 digits and must contain upper and lower case letters and numbers.)
     INVALIDPARAMETER_SIPACCOUNTPASSWORDFORMAT("InvalidParameter.SipAccountPasswordFormat"),
     
    // Illegal username (only can contain A-Z,a-z, and number)
     INVALIDPARAMETER_SIPACCOUNTUSERFORMAT("InvalidParameter.SipAccountUserFormat"),
     
    // The SIP channel is still in use.
     INVALIDPARAMETER_SIPTRUNKINUSED("InvalidParameter.SipTrunkInUsed"),
     
    // SIP channel information not found
     INVALIDPARAMETER_SIPTRUNKNOTFOUND("InvalidParameter.SipTrunkNotFound"),
     
    // parameter value is invalid.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Account does not exist.
     INVALIDPARAMETERVALUE_ACCOUNTNOTEXIST("InvalidParameterValue.AccountNotExist"),
     
    // The instance does not exist.
     INVALIDPARAMETERVALUE_INSTANCENOTEXIST("InvalidParameterValue.InstanceNotExist"),
     
    // The number has been bound to another account.
     INVALIDPARAMETERVALUE_PHONENUMISBOUNDOTHERACCOUNT("InvalidParameterValue.PhoneNumIsBoundOtherAccount"),
     
    // Skill group error.
     INVALIDPARAMETERVALUE_SKILLGROUPERROR("InvalidParameterValue.SkillGroupError"),
     
    // Skill group already exists.
     INVALIDPARAMETERVALUE_SKILLGROUPEXIST("InvalidParameterValue.SkillGroupExist"),
     
    // Exceeded quota limit.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Package quota exhausted
     LIMITEXCEEDED_BASEPACKAGEEXPIRED("LimitExceeded.BasePackageExpired"),
     
    // Exceeded quantity limit.
     LIMITEXCEEDED_OUTOFCOUNTLIMIT("LimitExceeded.OutOfCountLimit"),
     
    // Not in the allowlist.
     OPERATIONDENIED_NOTINWHITELIST("OperationDenied.NotInWhiteList"),
     
    // The account has been disabled.
     OPERATIONDENIED_UINDISABLED("OperationDenied.UinDisabled"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CccErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

