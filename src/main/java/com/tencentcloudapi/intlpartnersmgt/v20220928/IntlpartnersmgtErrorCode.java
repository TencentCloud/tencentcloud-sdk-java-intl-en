package com.tencentcloudapi.intlpartnersmgt.v20220928;
public enum IntlpartnersmgtErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The account balance is insufficient.
     FAILEDOPERATION_BALANCEINSUFFICIENT("FailedOperation.BalanceInsufficient"),
     
    // The account is a group account and cannot be bound as a sub-customer.
     FAILEDOPERATION_BINDORGANIZATIONACCOUNT("FailedOperation.BindOrganizationAccount"),
     
    // The sub-customer balance is less than zero.
     FAILEDOPERATION_CLIENTBALANCEISLESSOREQUALZERO("FailedOperation.ClientBalanceIsLessOrEqualZero"),
     
    // The sub-customer has purchased an sp package.
     FAILEDOPERATION_CLIENTBUYSP("FailedOperation.ClientBuySP"),
     
    // The sub-customer has created a shared unit.
     FAILEDOPERATION_CLIENTCREATESHAREUNIT("FailedOperation.ClientCreateShareUnit"),
     
    // The sub-customer has joined a shared unit.
     FAILEDOPERATION_CLIENTJOINSHAREUNIT("FailedOperation.ClientJoinShareUnit"),
     
    // The user has not applied to become a sub-customer.
     FAILEDOPERATION_CLIENTNOTAPPLY("FailedOperation.ClientNotApply"),
     
    // 
     FAILEDOPERATION_EXCEEDMAXBINDCOUNT("FailedOperation.ExceedMaxBindCount"),
     
    // FailedOperation.MailIsRegistered
     FAILEDOPERATION_MAILISREGISTERED("FailedOperation.MailIsRegistered"),
     
    // The number of registered accounts for the current mobile number has reached the maximum limit. Please change the phone number and try again.
     FAILEDOPERATION_PHONEBINDUPPER("FailedOperation.PhoneBindUpper"),
     
    // The interval between sending invitation links is less than three minutes. Please try again later.
     FAILEDOPERATION_SENDMAILLIMIT180("FailedOperation.SendMailLimit180"),
     
    // Verification codes are sent too frequently. Please try again later.
     FAILEDOPERATION_SENDVERIFYCODELIMIT("FailedOperation.SendVerifyCodeLimit"),
     
    // The interval for sending SMS verification codes should be greater than 60 seconds. Please try again later.
     FAILEDOPERATION_SENDVERIFYCODELIMIT60("FailedOperation.SendVerifyCodeLimit60"),
     
    // The primary industry id and secondary industry id do not match.
     FAILEDOPERATION_TRADEINFOINCORRECT("FailedOperation.TradeInfoIncorrect"),
     
    // Tencent cloud ka account cannot become a sub-customer.
     FAILEDOPERATION_UINALREADYKA("FailedOperation.UinAlreadyKA"),
     
    // Invalid UIN
     FAILEDOPERATION_UININVALID("FailedOperation.UinInvalid"),
     
    // UIN is not a reseller.
     FAILEDOPERATION_UINNOTAGENT("FailedOperation.UinNotAgent"),
     
    // UIN is a non-reseller (master reseller, reseller, sub-reseller) account.
     FAILEDOPERATION_UINNOTRESELLER("FailedOperation.UinNotReseller"),
     
    // Incorrect verification code.
     FAILEDOPERATION_VERIFICATIONCODEILLEGAL("FailedOperation.VerificationCodeIllegal"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter
     INVALIDPARAMETER("InvalidParameter"),
     
    // InvalidParameter.AccountTypeContentIncorrect
     INVALIDPARAMETER_ACCOUNTTYPECONTENTINCORRECT("InvalidParameter.AccountTypeContentIncorrect"),
     
    // InvalidParameter.AreaContentIncorrect
     INVALIDPARAMETER_AREACONTENTINCORRECT("InvalidParameter.AreaContentIncorrect"),
     
    // InvalidParameter.AreaFormatIncorrect
     INVALIDPARAMETER_AREAFORMATINCORRECT("InvalidParameter.AreaFormatIncorrect"),
     
    // InvalidParameter.ConfirmPasswordContentIncorrect
     INVALIDPARAMETER_CONFIRMPASSWORDCONTENTINCORRECT("InvalidParameter.ConfirmPasswordContentIncorrect"),
     
    // InvalidParameter.CountryCodeContentIncorrect
     INVALIDPARAMETER_COUNTRYCODECONTENTINCORRECT("InvalidParameter.CountryCodeContentIncorrect"),
     
    // InvalidParameter.CountryCodeFormatIncorrect
     INVALIDPARAMETER_COUNTRYCODEFORMATINCORRECT("InvalidParameter.CountryCodeFormatIncorrect"),
     
    // InvalidParameter.MailFormatIncorrect
     INVALIDPARAMETER_MAILFORMATINCORRECT("InvalidParameter.MailFormatIncorrect"),
     
    // Incorrect page parameter value.
     INVALIDPARAMETER_PAGE("InvalidParameter.Page"),
     
    // InvalidParameter.PasswordContentIncorrect
     INVALIDPARAMETER_PASSWORDCONTENTINCORRECT("InvalidParameter.PasswordContentIncorrect"),
     
    // InvalidParameter.PasswordFormatIncorrect
     INVALIDPARAMETER_PASSWORDFORMATINCORRECT("InvalidParameter.PasswordFormatIncorrect"),
     
    // InvalidParameter.PhoneNumFormatIncorrect
     INVALIDPARAMETER_PHONENUMFORMATINCORRECT("InvalidParameter.PhoneNumFormatIncorrect"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // InvalidParameterValue.AccountTypeEmpty
     INVALIDPARAMETERVALUE_ACCOUNTTYPEEMPTY("InvalidParameterValue.AccountTypeEmpty"),
     
    // InvalidParameterValue.AreaEmpty
     INVALIDPARAMETERVALUE_AREAEMPTY("InvalidParameterValue.AreaEmpty"),
     
    // InvalidParameterValue.CountryCodeEmpty
     INVALIDPARAMETERVALUE_COUNTRYCODEEMPTY("InvalidParameterValue.CountryCodeEmpty"),
     
    // The credit quota has exceeded the limit with the newly allocated quota.
     INVALIDPARAMETERVALUE_CREDITAMOUNTOUTOFRANGE("InvalidParameterValue.CreditAmountOutOfRange"),
     
    // The dimension data entered is incorrect.
     INVALIDPARAMETERVALUE_INVALIDDIMENSION("InvalidParameterValue.InvalidDimension"),
     
    // Incorrect month value
     INVALIDPARAMETERVALUE_INVALIDMONTH("InvalidParameterValue.InvalidMonth"),
     
    // InvalidParameterValue.InvalidUin
     INVALIDPARAMETERVALUE_INVALIDUIN("InvalidParameterValue.InvalidUin"),
     
    // InvalidParameterValue.MailEmpty
     INVALIDPARAMETERVALUE_MAILEMPTY("InvalidParameterValue.MailEmpty"),
     
    // InvalidParameterValue.PasswordEmpty
     INVALIDPARAMETERVALUE_PASSWORDEMPTY("InvalidParameterValue.PasswordEmpty"),
     
    // InvalidParameterValue.PhoneNumEmpty
     INVALIDPARAMETERVALUE_PHONENUMEMPTY("InvalidParameterValue.PhoneNumEmpty"),
     
    // The primary industry id or secondary industry id is empty.
     INVALIDPARAMETERVALUE_TRADEINFOEMPTY("InvalidParameterValue.TradeInfoEmpty"),
     
    // The user has become a sub-customer of another reseller.
     INVALIDPARAMETERVALUE_UINALREADYCLIENT("InvalidParameterValue.UinAlreadyClient"),
     
    // The user is a sub-account.
     INVALIDPARAMETERVALUE_UINISSUBACCOUNT("InvalidParameterValue.UinIsSubAccount"),
     
    // Invalid UinList. Array length value: 1-50.
     INVALIDPARAMETERVALUE_UINLIST("InvalidParameterValue.UinList"),
     
    // The current region does not support creating a Tencent Cloud International account.
     INVALIDPARAMETERVALUE_UNSUPPORTAREA("InvalidParameterValue.UnSupportArea"),
     
    // 
     INVALIDPARAMETERVALUE_VOUCHERAMOUNTOUTOFRANGE("InvalidParameterValue.VoucherAmountOutOfRange"),
     
    // Missing parameter
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // System busy. Please try again later.
     OPERATIONDENIED_SERVICEBUSY("OperationDenied.ServiceBusy"),
     
    // Too many requests.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // The current user is not a customer.
     UNAUTHORIZEDOPERATION_NOTCUSTOMERUIN("UnauthorizedOperation.NotCustomerUin"),
     
    // The current user doesn’t have permission for the operation.
     UNAUTHORIZEDOPERATION_UINNOAUTH("UnauthorizedOperation.UinNoAuth"),
     
    // Unknown parameter
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private IntlpartnersmgtErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

