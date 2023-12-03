package com.tencentcloudapi.intlpartnersmgt.v20220928;
public enum IntlpartnersmgtErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // FailedOperation.MailIsRegistered
     FAILEDOPERATION_MAILISREGISTERED("FailedOperation.MailIsRegistered"),
     
    // Invalid UIN
     FAILEDOPERATION_UININVALID("FailedOperation.UinInvalid"),
     
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
     
    // Incorrect month value
     INVALIDPARAMETERVALUE_INVALIDMONTH("InvalidParameterValue.InvalidMonth"),
     
    // InvalidParameterValue.MailEmpty
     INVALIDPARAMETERVALUE_MAILEMPTY("InvalidParameterValue.MailEmpty"),
     
    // InvalidParameterValue.PasswordEmpty
     INVALIDPARAMETERVALUE_PASSWORDEMPTY("InvalidParameterValue.PasswordEmpty"),
     
    // InvalidParameterValue.PhoneNumEmpty
     INVALIDPARAMETERVALUE_PHONENUMEMPTY("InvalidParameterValue.PhoneNumEmpty"),
     
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

