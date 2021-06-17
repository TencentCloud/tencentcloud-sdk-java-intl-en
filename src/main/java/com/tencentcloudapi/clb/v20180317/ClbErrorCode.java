package com.tencentcloudapi.clb.v20180317;
public enum ClbErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Exceptional CLB instance status
     FAILEDOPERATION_INVALIDLBSTATUS("FailedOperation.InvalidLBStatus"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Wrong parameter format.
     INVALIDPARAMETER_FORMATERROR("InvalidParameter.FormatError"),
     
    // Wrong CLB instance ID.
     INVALIDPARAMETER_LBIDNOTFOUND("InvalidParameter.LBIdNotFound"),
     
    // Wrong listener ID.
     INVALIDPARAMETER_LISTENERIDNOTFOUND("InvalidParameter.ListenerIdNotFound"),
     
    // Unable to find eligible forwarding rules.
     INVALIDPARAMETER_LOCATIONNOTFOUND("InvalidParameter.LocationNotFound"),
     
    // Listener port checks failed due to port conflicts or other reasons.
     INVALIDPARAMETER_PORTCHECKFAILED("InvalidParameter.PortCheckFailed"),
     
    // Listener protocol checks failed because the protocol used is incompatible with the corresponding operation.
     INVALIDPARAMETER_PROTOCOLCHECKFAILED("InvalidParameter.ProtocolCheckFailed"),
     
    // Invalid region.
     INVALIDPARAMETER_REGIONNOTFOUND("InvalidParameter.RegionNotFound"),
     
    // The forwarding rule has already been bound to a redirection relationship.
     INVALIDPARAMETER_REWRITEALREADYEXIST("InvalidParameter.RewriteAlreadyExist"),
     
    // Some redirection rules do not exist.
     INVALIDPARAMETER_SOMEREWRITENOTFOUND("InvalidParameter.SomeRewriteNotFound"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Duplicate parameter value.
     INVALIDPARAMETERVALUE_DUPLICATE("InvalidParameterValue.Duplicate"),
     
    // Incorrect `Filter` parameter.
     INVALIDPARAMETERVALUE_INVALIDFILTER("InvalidParameterValue.InvalidFilter"),
     
    // Wrong parameter length.
     INVALIDPARAMETERVALUE_LENGTH("InvalidParameterValue.Length"),
     
    // Wrong parameter value range.
     INVALIDPARAMETERVALUE_RANGE("InvalidParameterValue.Range"),
     
    // Quota exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Insufficient resources.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // Resources do not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private ClbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

