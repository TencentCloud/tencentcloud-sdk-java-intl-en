package com.tencentcloudapi.gwlb.v20240906;
public enum GwlbErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* FailedOperation.ResourceInOperating */
     FAILEDOPERATION_RESOURCEINOPERATING("FailedOperation.ResourceInOperating"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.FormatError */
     INVALIDPARAMETER_FORMATERROR("InvalidParameter.FormatError"),
     
     /* InvalidParameter.RegionNotFound */
     INVALIDPARAMETER_REGIONNOTFOUND("InvalidParameter.RegionNotFound"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The same value exists. */
     INVALIDPARAMETERVALUE_DUPLICATE("InvalidParameterValue.Duplicate"),
     
     /* InvalidParameterValue.Length */
     INVALIDPARAMETERVALUE_LENGTH("InvalidParameterValue.Length"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private GwlbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

