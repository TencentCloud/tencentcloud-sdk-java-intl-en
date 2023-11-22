package com.tencentcloudapi.mdp.v20200527;
public enum MdpErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid `ActionType`.
     INVALIDPARAMETER_ACTIONTYPE("InvalidParameter.ActionType"),
     
    // Incorrect authentication configuration.
     INVALIDPARAMETER_AUTHINFO("InvalidParameter.AuthInfo"),
     
    // Invalid `CacheInfo` value
     INVALIDPARAMETER_CACHEINFO("InvalidParameter.CacheInfo"),
     
    // Invalid CDN playback domain name.
     INVALIDPARAMETER_CDNDOMAIN("InvalidParameter.CdnDomain"),
     
    // Invalid `ChannelId`.
     INVALIDPARAMETER_CHANNELID("InvalidParameter.ChannelId"),
     
    // The quantity exceeds the limit.
     INVALIDPARAMETER_EXCEEDEDQUANTITYLIMIT("InvalidParameter.ExceededQuantityLimit"),
     
    // Invalid `Id`.
     INVALIDPARAMETER_ID("InvalidParameter.Id"),
     
    // Invalid `LvbDomain`.
     INVALIDPARAMETER_LVBDOMAIN("InvalidParameter.LvbDomain"),
     
    // Invalid name.
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
    // Failed to find the channel/input/output.
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
    // 
     INVALIDPARAMETER_OUTPUTGROUPS("InvalidParameter.OutputGroups"),
     
    // Invalid `PageNum`.
     INVALIDPARAMETER_PAGENUM("InvalidParameter.PageNum"),
     
    // Invalid `PageSize`.
     INVALIDPARAMETER_PAGESIZE("InvalidParameter.PageSize"),
     
    // Invalid `Points` value
     INVALIDPARAMETER_POINTS("InvalidParameter.Points"),
     
    // Invalid protocol.
     INVALIDPARAMETER_PROTOCOL("InvalidParameter.Protocol"),
     
    // 
     INVALIDPARAMETER_SSAIINFO("InvalidParameter.SSAIInfo"),
     
    // Invalid `Url`.
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

