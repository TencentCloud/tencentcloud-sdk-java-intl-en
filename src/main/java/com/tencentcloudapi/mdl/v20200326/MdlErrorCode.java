package com.tencentcloudapi.mdl.v20200326;
public enum MdlErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Audio/Video transcoding template error
     INVALIDPARAMETER_AVTEMPLATES("InvalidParameter.AVTemplates"),
     
    // `Channel` already associated.
     INVALIDPARAMETER_ALREADYASSOCIATEDCHANNEL("InvalidParameter.AlreadyAssociatedChannel"),
     
    // `Input` already associated.
     INVALIDPARAMETER_ALREADYASSOCIATEDINPUT("InvalidParameter.AlreadyAssociatedInput"),
     
    // Invalid `AttachedInputs`.
     INVALIDPARAMETER_ATTACHEDINPUTS("InvalidParameter.AttachedInputs"),
     
    // Incorrect audio transcoding template.
     INVALIDPARAMETER_AUDIOTEMPLATES("InvalidParameter.AudioTemplates"),
     
    // Channel ID error.
     INVALIDPARAMETER_CHANNELID("InvalidParameter.ChannelId"),
     
    // Invalid `EndTime`.
     INVALIDPARAMETER_ENDTIME("InvalidParameter.EndTime"),
     
    // The quantity exceeds the limit.
     INVALIDPARAMETER_EXCEEDEDQUANTITYLIMIT("InvalidParameter.ExceededQuantityLimit"),
     
    // Invalid `Id`.
     INVALIDPARAMETER_ID("InvalidParameter.Id"),
     
    // Watermark image configuration error.
     INVALIDPARAMETER_IMAGESETTINGS("InvalidParameter.ImageSettings"),
     
    // Invalid `InputSettings`.
     INVALIDPARAMETER_INPUTSETTINGS("InvalidParameter.InputSettings"),
     
    // Invalid `Name`.
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
    // Not found.
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
    // Callback key format error.
     INVALIDPARAMETER_NOTIFYKEY("InvalidParameter.NotifyKey"),
     
    // Callback URL format error.
     INVALIDPARAMETER_NOTIFYURL("InvalidParameter.NotifyUrl"),
     
    // Invalid `OutputGroups`.
     INVALIDPARAMETER_OUTPUTGROUPS("InvalidParameter.OutputGroups"),
     
    // Page number error.
     INVALIDPARAMETER_PAGENUM("InvalidParameter.PageNum"),
     
    // Invalid `Plan` parameter
     INVALIDPARAMETER_PLAN("InvalidParameter.Plan"),
     
    // Invalid `SecurityGroups`.
     INVALIDPARAMETER_SECURITYGROUPS("InvalidParameter.SecurityGroups"),
     
    // Invalid `StartTime`.
     INVALIDPARAMETER_STARTTIME("InvalidParameter.StartTime"),
     
    // Exceptional status.
     INVALIDPARAMETER_STATE("InvalidParameter.State"),
     
    // Incorrect status.
     INVALIDPARAMETER_STATEERROR("InvalidParameter.StateError"),
     
    // Watermark text configuration error.
     INVALIDPARAMETER_TEXTSETTINGS("InvalidParameter.TextSettings"),
     
    // Invalid `Type`.
     INVALIDPARAMETER_TYPE("InvalidParameter.Type"),
     
    // Incorrect video transcoding template.
     INVALIDPARAMETER_VIDEOTEMPLATES("InvalidParameter.VideoTemplates"),
     
    // Invalid `Whitelist`.
     INVALIDPARAMETER_WHITELIST("InvalidParameter.Whitelist");
     
    private String value;
    private MdlErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

