package com.tencentcloudapi.dms.v20200819;
public enum DmsErrorCode {
     /* COS exception. */
     INTERNALERROR_INTERNALCOSERROR("InternalError.InternalCOSError"),
     
     /* Database service exception. */
     INTERNALERROR_INTERNALDBERROR("InternalError.InternalDBError"),
     
     /* Encryption service exception. */
     INTERNALERROR_INTERNALENCRYPTERROR("InternalError.InternalEncryptError"),
     
     /* Format of the sender name is incorrect. */
     INVALIDPARAMETER_INVALIDFROMNAMEMALFORMED("InvalidParameter.InvalidFromNameMalformed"),
     
     /* Format of the HTML email body is incorrect. */
     INVALIDPARAMETER_INVALIDHTMLCONTENTMALFORMED("InvalidParameter.InvalidHtmlContentMalformed"),
     
     /* Format of the email address is incorrect. */
     INVALIDPARAMETER_INVALIDMAILADDRESSNAMEMALFORMED("InvalidParameter.InvalidMailAddressNameMalformed"),
     
     /* Format of the email body is incorrect. */
     INVALIDPARAMETER_INVALIDMAILCONTENTMALFORMED("InvalidParameter.InvalidMailContentMalformed"),
     
     /* Format of the recipient address is incorrect. */
     INVALIDPARAMETER_INVALIDRECEIVERNAMEMALFORMED("InvalidParameter.InvalidReceiverNameMalformed"),
     
     /* Format of the summary is incorrect. */
     INVALIDPARAMETER_INVALIDSUBJECTMALFORMED("InvalidParameter.InvalidSubjectMalformed"),
     
     /* Format of the email task name is incorrect. */
     INVALIDPARAMETER_INVALIDTASKNAMEMALFORMED("InvalidParameter.InvalidTaskNameMalformed"),
     
     /* Format of the email body set in the template is incorrect. */
     INVALIDPARAMETER_INVALIDTEMPLATECONTENTMALFORMED("InvalidParameter.InvalidTemplateContentMalformed"),
     
     /* Format of the template name is incorrect. */
     INVALIDPARAMETER_INVALIDTEMPLATENAMEMALFORMED("InvalidParameter.InvalidTemplateNameMalformed"),
     
     /* Format of the template variable values is incorrect. */
     INVALIDPARAMETER_INVALIDTEMPLATEVALUEMALFORMED("InvalidParameter.InvalidTemplateValueMalformed"),
     
     /* Format of the plain-text email body is incorrect. */
     INVALIDPARAMETER_INVALIDTEXTCONTENTMALFORMED("InvalidParameter.InvalidTextContentMalformed"),
     
     /* The email task name already exists. */
     RESOURCEINUSE_INVALIDTASKNAMEDUPLICATE("ResourceInUse.InvalidTaskNameDuplicate"),
     
     /* The email address does not exist. */
     RESOURCENOTFOUND_INVALIDMAILADDRESSNOTFOUND("ResourceNotFound.InvalidMailAddressNotFound"),
     
     /* The recipient address does not exist. */
     RESOURCENOTFOUND_INVALIDRECEIVERNOTFOUND("ResourceNotFound.InvalidReceiverNotFound"),
     
     /* The reply-to address does not exist. */
     RESOURCENOTFOUND_INVALIDREPLYNOTFOUND("ResourceNotFound.InvalidReplyNotFound"),
     
     /* The email task does not exist. */
     RESOURCENOTFOUND_INVALIDTASKNAMENOTFOUND("ResourceNotFound.InvalidTaskNameNotFound"),
     
     /* The template does not exist. */
     RESOURCENOTFOUND_INVALIDTEMPLATENOTFOUND("ResourceNotFound.InvalidTemplateNotFound");
     
    private String value;
    private DmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

