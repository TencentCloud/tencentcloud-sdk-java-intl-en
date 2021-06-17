package com.tencentcloudapi.ses.v20201002;
public enum SesErrorCode {
    // The attachments are too large. Make sure they do not exceed the size limit for a single attachment and the overall limit for all attachments.
     FAILEDOPERATION_ATTACHCONTENTTOOLARGE("FailedOperation.AttachContentToolarge"),
     
    // The email address is in the blocklist.
     FAILEDOPERATION_EMAILADDRINBLACKLIST("FailedOperation.EmailAddrInBlacklist"),
     
    // The email is too large. Remove some content.
     FAILEDOPERATION_EMAILCONTENTTOOLARGE("FailedOperation.EmailContentToolarge"),
     
    // The number of emails exceeds the daily sending limit.
     FAILEDOPERATION_EXCEEDSENDLIMIT("FailedOperation.ExceedSendLimit"),
     
    // The number of templates exceeds the upper limit.
     FAILEDOPERATION_EXCEEDTEMPLATELIMIT("FailedOperation.ExceedTemplateLimit"),
     
    // You have sent too many emails to the same address in a short period.
     FAILEDOPERATION_FREQUENCYLIMIT("FailedOperation.FrequencyLimit"),
     
    // The email has been blocked temporarily due to high rejection rate.
     FAILEDOPERATION_HIGHREJECTIONRATE("FailedOperation.HighRejectionRate"),
     
    // Incorrect email address.
     FAILEDOPERATION_INCORRECTEMAIL("FailedOperation.IncorrectEmail"),
     
    // Insufficient balance or account in arrears.
     FAILEDOPERATION_INSUFFICIENTBALANCE("FailedOperation.InsufficientBalance"),
     
    // Insufficient emails in plans.
     FAILEDOPERATION_INSUFFICIENTQUOTA("FailedOperation.InsufficientQuota"),
     
    // Unsupported attachment name. Make sure it does not contain special characters. For details, see the attachment description.
     FAILEDOPERATION_INVALIDATTACHNAME("FailedOperation.InvalidAttachName"),
     
    // Reached the query limit (100).
     FAILEDOPERATION_INVALIDLIMIT("FailedOperation.InvalidLimit"),
     
    // Invalid template ID or unavailable template.
     FAILEDOPERATION_INVALIDTEMPLATEID("FailedOperation.InvalidTemplateID"),
     
    // 
     FAILEDOPERATION_MISSINGEMAILCONTENT("FailedOperation.MissingEmailContent"),
     
    // No permission to send an email with attachments.
     FAILEDOPERATION_NOATTACHPERMISSION("FailedOperation.NoAttachPermission"),
     
    // Unable to send because the sender is not verified.
     FAILEDOPERATION_NOTAUTHENTICATEDSENDER("FailedOperation.NotAuthenticatedSender"),
     
    // Cannot query email records for this date. Only data within 90 days can be queried.
     FAILEDOPERATION_NOTSUPPORTDATE("FailedOperation.NotSupportDate"),
     
    // Incorrect protocol. Make sure the protocol is correct.
     FAILEDOPERATION_PROTOCOLCHECKERR("FailedOperation.ProtocolCheckErr"),
     
    // The request has not taken effect. Try again.
     FAILEDOPERATION_SERVICENOTAVAILABLE("FailedOperation.ServiceNotAvailable"),
     
    // The template is too large. Remove some content.
     FAILEDOPERATION_TEMPLATECONTENTTOOLARGE("FailedOperation.TemplateContentToolarge"),
     
    // The email has been blocked temporarily due to violations of rules.
     FAILEDOPERATION_TEMPORARYBLOCKED("FailedOperation.TemporaryBlocked"),
     
    // Too many attachments. A single email supports up to 10 attachments.
     FAILEDOPERATION_TOOMANYATTACHMENTS("FailedOperation.TooManyAttachments"),
     
    // Too many recipients. Set a maximum of 50 recipients at a time.
     FAILEDOPERATION_TOOMANYRECIPIENTS("FailedOperation.TooManyRecipients"),
     
    // Unsupported email type.
     FAILEDOPERATION_UNSUPPORTMAILTYPE("FailedOperation.UnsupportMailType"),
     
    // The feature of sending custom emails is not enabled. Use a template to send emails.
     FAILEDOPERATION_WITHOUTPERMISSION("FailedOperation.WithOutPermission"),
     
    // The format of the `TemplateData` field is incorrect. Make sure it is in JSON format.
     FAILEDOPERATION_WRONGCONTENTJSON("FailedOperation.WrongContentJson"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Incorrect attachment content. Make sure the base64 content is correct.
     INVALIDPARAMETERVALUE_ATTACHCONTENTISWRONG("InvalidParameterValue.AttachContentIsWrong"),
     
    // This sender domain has been created by another Tencent Cloud account.
     INVALIDPARAMETERVALUE_CREATEDBYOTHER("InvalidParameterValue.CreatedByOther"),
     
    // The recipient or sender address is empty. Please check.
     INVALIDPARAMETERVALUE_EMAILADDRESSISNULL("InvalidParameterValue.EmailAddressIsNULL"),
     
    // Incorrect email content. Make sure TEXT/HTML base64 is correct.
     INVALIDPARAMETERVALUE_EMAILCONTENTISWRONG("InvalidParameterValue.EmailContentIsWrong"),
     
    // Invalid email address. Make sure the address format is correct.
     INVALIDPARAMETERVALUE_ILLEGALEMAILADDRESS("InvalidParameterValue.IllegalEmailAddress"),
     
    // Invalid domain value.
     INVALIDPARAMETERVALUE_INVALIDEMAILIDENTITY("InvalidParameterValue.InvalidEmailIdentity"),
     
    // You don’t have the sender address. Check if it exists.
     INVALIDPARAMETERVALUE_NOSUCHSENDER("InvalidParameterValue.NoSuchSender"),
     
    // This sender domain does not exist. Create it first.
     INVALIDPARAMETERVALUE_NOTEXISTDOMAIN("InvalidParameterValue.NotExistDomain"),
     
    // This sender domain already exists. Do not create it again.
     INVALIDPARAMETERVALUE_REPEATCREATION("InvalidParameterValue.RepeatCreation"),
     
    // This email address already exists. Do not create it again.
     INVALIDPARAMETERVALUE_REPEATEMAILADDRESS("InvalidParameterValue.RepeatEmailAddress"),
     
    // The template resource is empty.
     INVALIDPARAMETERVALUE_TEMPLATECONTENTISNULL("InvalidParameterValue.TemplateContentIsNULL"),
     
    // Incorrect template content. Make sure the base64 content is correct.
     INVALIDPARAMETERVALUE_TEMPLATECONTENTISWRONG("InvalidParameterValue.TemplateContentIsWrong"),
     
    // Invalid template name. Make sure the characters and length of the template name are valid.
     INVALIDPARAMETERVALUE_TEMPLATENAMEILLEGAL("InvalidParameterValue.TemplateNameIllegal"),
     
    // Template name cannot be empty.
     INVALIDPARAMETERVALUE_TEMPLATENAMEISNULL("InvalidParameterValue.TemplateNameIsNULL"),
     
    // This template does not exist. Create one first.
     INVALIDPARAMETERVALUE_TEMPLATENOTEXIST("InvalidParameterValue.TemplateNotExist"),
     
    // Incorrect search date. Make sure the date and its format are valid.
     INVALIDPARAMETERVALUE_WRONGDATE("InvalidParameterValue.WrongDate"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // Domain verification failed. Check whether the domain has passed verification.
     OPERATIONDENIED_DOMAINNOTVERIFIED("OperationDenied.DomainNotVerified"),
     
    // The number of sender domains exceeds the upper limit.
     OPERATIONDENIED_EXCEEDDOMAINLIMIT("OperationDenied.ExceedDomainLimit"),
     
    // The number of sender addresses exceeds the upper limit.
     OPERATIONDENIED_EXCEEDSENDERLIMIT("OperationDenied.ExceedSenderLimit"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // Insufficient resources.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private SesErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

