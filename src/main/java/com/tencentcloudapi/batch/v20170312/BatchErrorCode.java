package com.tencentcloudapi.batch.v20170312;
public enum BatchErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // An error is returned for the CVM API call.
     INTERNALERROR_CALLCVM("InternalError.CallCvm"),
     
    // The specified filter is not supported.
     INVALIDFILTER("InvalidFilter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Incorrect `Filter` parameter.
     INVALIDPARAMETERVALUE_INVALIDFILTER("InvalidParameterValue.InvalidFilter"),
     
    // The availability zone and the region do not match.
     INVALIDPARAMETERVALUE_INVALIDZONEMISMATCHREGION("InvalidParameterValue.InvalidZoneMismatchRegion"),
     
    // The number of filter parameter values exceeds the limit.
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // The model billing type is not supported by BatchCompute.
     INVALIDPARAMETERVALUE_UNSUPPORTEDBATCHINSTANCECHARGETYPE("InvalidParameterValue.UnsupportedBatchInstanceChargeType"),
     
    // The specified zone does not exist.
     INVALIDZONE_MISMATCHREGION("InvalidZone.MismatchRegion"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private BatchErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

