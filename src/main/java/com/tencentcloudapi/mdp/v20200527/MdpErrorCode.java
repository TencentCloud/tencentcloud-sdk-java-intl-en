package com.tencentcloudapi.mdp.v20200527;
public enum MdpErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Failed to obtain SSAI ad configuration. */
     INTERNALERROR_GETSSAICHANNELSFAILED("InternalError.GetSSAIChannelsFailed"),
     
     /* Failed to obtain SSAI ad configuration usage. */
     INTERNALERROR_GETSSAIUSAGEPARTIALFAILED("InternalError.GetSSAIUsagePartialFailed"),
     
     /* Invalid `ActionType`. */
     INVALIDPARAMETER_ACTIONTYPE("InvalidParameter.ActionType"),
     
     /* Incorrect authentication configuration. */
     INVALIDPARAMETER_AUTHINFO("InvalidParameter.AuthInfo"),
     
     /* Invalid `CacheInfo` value */
     INVALIDPARAMETER_CACHEINFO("InvalidParameter.CacheInfo"),
     
     /* Invalid CDN playback domain name. */
     INVALIDPARAMETER_CDNDOMAIN("InvalidParameter.CdnDomain"),
     
     /* Invalid `ChannelId`. */
     INVALIDPARAMETER_CHANNELID("InvalidParameter.ChannelId"),
     
     /* The quantity exceeds the limit. */
     INVALIDPARAMETER_EXCEEDEDQUANTITYLIMIT("InvalidParameter.ExceededQuantityLimit"),
     
     /* Invalid `Id`. */
     INVALIDPARAMETER_ID("InvalidParameter.Id"),
     
     /* The InputFileInfo is invalid. */
     INVALIDPARAMETER_INPUTFILEINFO("InvalidParameter.InputFileInfo"),
     
     /* SSAI channel id is invalid. */
     INVALIDPARAMETER_INVALIDPARAMETERCHANNELID("InvalidParameter.InvalidParameterChannelId"),
     
     /* Invalid `LvbDomain`. */
     INVALIDPARAMETER_LVBDOMAIN("InvalidParameter.LvbDomain"),
     
     /* Invalid name. */
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
     /* Failed to find the VOD remux task. */
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
     /*  */
     INVALIDPARAMETER_OUTPUTGROUPS("InvalidParameter.OutputGroups"),
     
     /* The OutputStorage is invalid. */
     INVALIDPARAMETER_OUTPUTSTORAGE("InvalidParameter.OutputStorage"),
     
     /* Invalid `PageNum`. */
     INVALIDPARAMETER_PAGENUM("InvalidParameter.PageNum"),
     
     /* Invalid `PageSize`. */
     INVALIDPARAMETER_PAGESIZE("InvalidParameter.PageSize"),
     
     /* Invalid `Points` value */
     INVALIDPARAMETER_POINTS("InvalidParameter.Points"),
     
     /* Invalid protocol. */
     INVALIDPARAMETER_PROTOCOL("InvalidParameter.Protocol"),
     
     /* Invalid ad insertion configuration parameters. */
     INVALIDPARAMETER_SSAIINFO("InvalidParameter.SSAIInfo"),
     
     /* VOD remux task state is invalid. */
     INVALIDPARAMETER_STATE("InvalidParameter.State"),
     
     /* VOD remux task type error. */
     INVALIDPARAMETER_TYPE("InvalidParameter.Type"),
     
     /* Invalid `Url`. */
     INVALIDPARAMETER_URL("InvalidParameter.Url");
     
    private String value;
    private MdpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

