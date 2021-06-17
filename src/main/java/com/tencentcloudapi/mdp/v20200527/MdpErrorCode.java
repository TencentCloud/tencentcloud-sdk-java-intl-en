package com.tencentcloudapi.mdp.v20200527;
public enum MdpErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid `ActionType`.
     INVALIDPARAMETER_ACTIONTYPE("InvalidParameter.ActionType"),
     
    // Incorrect authentication configuration.
     INVALIDPARAMETER_AUTHINFO("InvalidParameter.AuthInfo"),
     
    // The quantity exceeds the limit.
     INVALIDPARAMETER_EXCEEDEDQUANTITYLIMIT("InvalidParameter.ExceededQuantityLimit"),
     
    // Invalid `Id`.
     INVALIDPARAMETER_ID("InvalidParameter.Id"),
     
    // Invalid name.
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
    // Failed to find the channel/input/output.
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
    // Invalid `PageNum`.
     INVALIDPARAMETER_PAGENUM("InvalidParameter.PageNum"),
     
    // Invalid `PageSize`.
     INVALIDPARAMETER_PAGESIZE("InvalidParameter.PageSize"),
     
    // Endpoint error.
     INVALIDPARAMETER_POINTS("InvalidParameter.Points"),
     
    // Invalid protocol.
     INVALIDPARAMETER_PROTOCOL("InvalidParameter.Protocol"),
     
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

