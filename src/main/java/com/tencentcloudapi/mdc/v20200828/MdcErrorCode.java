package com.tencentcloudapi.mdc.v20200828;
public enum MdcErrorCode {
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Invalid `EndTime`. */
     INVALIDPARAMETER_ENDTIME("InvalidParameter.EndTime"),
     
     /* The quantity exceeds the limit. */
     INVALIDPARAMETER_EXCEEDEDQUANTITYLIMIT("InvalidParameter.ExceededQuantityLimit"),
     
     /* Invalid ID. */
     INVALIDPARAMETER_ID("InvalidParameter.Id"),
     
     /* Invalid input. */
     INVALIDPARAMETER_INPUT("InvalidParameter.Input"),
     
     /* Invalid `InputOutputId`. */
     INVALIDPARAMETER_INPUTOUTPUTID("InvalidParameter.InputOutputId"),
     
     /* Invalid maximum bandwidth value. */
     INVALIDPARAMETER_MAXBANDWIDTH("InvalidParameter.MaxBandwidth"),
     
     /* Invalid `Name`. */
     INVALIDPARAMETER_NAME("InvalidParameter.Name"),
     
     /* No information found. */
     INVALIDPARAMETER_NOTFOUND("InvalidParameter.NotFound"),
     
     /* Invalid `Output`. */
     INVALIDPARAMETER_OUTPUT("InvalidParameter.Output"),
     
     /* Invalid `OutputGroups` value */
     INVALIDPARAMETER_OUTPUTGROUPS("InvalidParameter.OutputGroups"),
     
     /* Invalid `OutputId`. */
     INVALIDPARAMETER_OUTPUTID("InvalidParameter.OutputId"),
     
     /* Invalid `PageNum`. */
     INVALIDPARAMETER_PAGENUM("InvalidParameter.PageNum"),
     
     /* Invalid `PageSize`. */
     INVALIDPARAMETER_PAGESIZE("InvalidParameter.PageSize"),
     
     /* Invalid `Period`. */
     INVALIDPARAMETER_PERIOD("InvalidParameter.Period"),
     
     /* Invalid `Pipeline`. */
     INVALIDPARAMETER_PIPELINE("InvalidParameter.Pipeline"),
     
     /* Invalid `Protocol`. */
     INVALIDPARAMETER_PROTOCOL("InvalidParameter.Protocol"),
     
     /* Invalid `SortType`. */
     INVALIDPARAMETER_SORTTYPE("InvalidParameter.SortType"),
     
     /* Invalid `StartTime`. */
     INVALIDPARAMETER_STARTTIME("InvalidParameter.StartTime"),
     
     /* Unexpected status. */
     INVALIDPARAMETER_STATE("InvalidParameter.State"),
     
     /* Invalid `Type`. */
     INVALIDPARAMETER_TYPE("InvalidParameter.Type");
     
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

