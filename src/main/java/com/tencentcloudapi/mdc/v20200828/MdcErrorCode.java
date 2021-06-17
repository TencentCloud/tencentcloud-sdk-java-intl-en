package com.tencentcloudapi.mdc.v20200828;
public enum MdcErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The quantity exceeds the limit.
     INVALIDPARAMETER_EXCEEDEDQUANTITYLIMIT("InvalidParameter.ExceededQuantityLimit"),
     
    // Invalid ID.
     INVALIDPARAMETER_ID("InvalidParameter.Id"),
     
    // Invalid input.
     INVALIDPARAMETER_INPUT("InvalidParameter.Input"),
     
    // Invalid maximum bandwidth value.
     INVALIDPARAMETER_MAXBANDWIDTH("InvalidParameter.MaxBandwidth"),
     
    // Invalid `Name`.
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
    // No information found.
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
    // Invalid `Output`.
     INVALIDPARAMETER_OUTPUT("InvalidParameter.Output"),
     
    // 
     INVALIDPARAMETER_OUTPUTGROUPS("InvalidParameter.OutputGroups"),
     
    // 
     INVALIDPARAMETER_OUTPUTID("InvalidParameter.OutputId"),
     
    // Invalid `PageNum`.
     INVALIDPARAMETER_PAGENUM("InvalidParameter.PageNum"),
     
    // Invalid `PageSize`.
     INVALIDPARAMETER_PAGESIZE("InvalidParameter.PageSize"),
     
    // Unexpected status.
     INVALIDPARAMETER_STATE("InvalidParameter.State");
     
    private String value;
    private MdcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

