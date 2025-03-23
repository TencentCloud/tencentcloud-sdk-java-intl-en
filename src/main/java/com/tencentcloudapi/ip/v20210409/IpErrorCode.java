package com.tencentcloudapi.ip.v20210409;
public enum IpErrorCode {
    // CAM signature/authentication error. Please try again later.
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The email address has already been registered.
     FAILEDOPERATION_MAILISREGISTERED("FailedOperation.MailIsRegistered"),
     
    // Internal error. Please try again later.
     INTERNALERROR("InternalError"),
     
    // Incorrect account type.
     INVALIDPARAMETER_ACCOUNTTYPECONTENTINCORRECT("InvalidParameter.AccountTypeContentIncorrect"),
     
    // Incorrect region content.
     INVALIDPARAMETER_AREACONTENTINCORRECT("InvalidParameter.AreaContentIncorrect"),
     
    // Incorrect region format.
     INVALIDPARAMETER_AREAFORMATINCORRECT("InvalidParameter.AreaFormatIncorrect"),
     
    // Incorrect confirmed password.
     INVALIDPARAMETER_CONFIRMPASSWORDCONTENTINCORRECT("InvalidParameter.ConfirmPasswordContentIncorrect"),
     
    // Incorrect country/region code content.
     INVALIDPARAMETER_COUNTRYCODECONTENTINCORRECT("InvalidParameter.CountryCodeContentIncorrect"),
     
    // Incorrect country/region code format.
     INVALIDPARAMETER_COUNTRYCODEFORMATINCORRECT("InvalidParameter.CountryCodeFormatIncorrect"),
     
    // Incorrect email format.
     INVALIDPARAMETER_MAILFORMATINCORRECT("InvalidParameter.MailFormatIncorrect"),
     
    // Incorrect password content.
     INVALIDPARAMETER_PASSWORDCONTENTINCORRECT("InvalidParameter.PasswordContentIncorrect"),
     
    // Incorrect password format.
     INVALIDPARAMETER_PASSWORDFORMATINCORRECT("InvalidParameter.PasswordFormatIncorrect"),
     
    // Incorrect mobile number format.
     INVALIDPARAMETER_PHONENUMFORMATINCORRECT("InvalidParameter.PhoneNumFormatIncorrect"),
     
    // The account type is required and cannot be left empty.
     INVALIDPARAMETERVALUE_ACCOUNTTYPEEMPTY("InvalidParameterValue.AccountTypeEmpty"),
     
    // The region is required and cannot be left empty.
     INVALIDPARAMETERVALUE_AREAEMPTY("InvalidParameterValue.AreaEmpty"),
     
    // The country/region code is required and cannot be left empty.
     INVALIDPARAMETERVALUE_COUNTRYCODEEMPTY("InvalidParameterValue.CountryCodeEmpty"),
     
    // The email is required and cannot be left empty.
     INVALIDPARAMETERVALUE_MAILEMPTY("InvalidParameterValue.MailEmpty"),
     
    // The password is required and cannot be left empty.
     INVALIDPARAMETERVALUE_PASSWORDEMPTY("InvalidParameterValue.PasswordEmpty"),
     
    // The mobile number is required and cannot be left empty.
     INVALIDPARAMETERVALUE_PHONENUMEMPTY("InvalidParameterValue.PhoneNumEmpty"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private IpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

