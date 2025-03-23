package com.tencentcloudapi.cdc.v20201214;
public enum CdcErrorCode {
    // Failed to bind CDC with VPC.
     FAILEDOPERATION_CDCBINDVPCFAIL("FailedOperation.CdcBindVpcFail"),
     
    // Failed to delete the site.
     FAILEDOPERATION_FAILDELETESITE("FailedOperation.FailDeleteSite"),
     
    // The model is not supported currently.
     INVALIDPARAMETER_INSTANCETYPENOTSUPPORT("InvalidParameter.InstanceTypeNotSupport"),
     
    // The parameter value is invalid.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The returned value of ccdb is not 0.
     INVALIDPARAMETERVALUE_INVALIDAPPIDFORMAT("InvalidParameterValue.InvalidAppIdFormat"),
     
    // The COS size of CDC is incorrect.
     INVALIDPARAMETERVALUE_INVALIDVALUEDEDICATEDCLUSTERCOSSIZE("InvalidParameterValue.InvalidValueDedicatedClusterCosSize"),
     
    // The CBS size is incorrect. It must be an integral multiple of 40.
     INVALIDPARAMETERVALUE_INVALIDVALUEDEDICATEDCLUSTERDATASTEPSIZE("InvalidParameterValue.InvalidValueDedicatedClusterDataStepSize"),
     
    // The region is invalid.
     INVALIDPARAMETERVALUE_INVALIDVALUEREGION("InvalidParameterValue.InvalidValueRegion"),
     
    // Exceeds the size limit.
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // The Region ID is invalid.
     INVALIDPARAMETERVALUE_REGION("InvalidParameterValue.Region"),
     
    // The parameter name is too long.
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
    // The zone and region do not match.
     INVALIDPARAMETERVALUE_ZONEMISMATCHREGION("InvalidParameterValue.ZoneMismatchRegion"),
     
    // The current AZ is not supported.
     INVALIDPARAMETERVALUE_ZONENOTSUPPORTED("InvalidParameterValue.ZoneNotSupported"),
     
    // Parameters are missing.
     MISSINGPARAMETER("MissingParameter"),
     
    // Enter at least one input parameter.
     MISSINGPARAMETER_ATLEASTONE("MissingParameter.AtLeastOne"),
     
    // The capacity of cloud hard disk is insufficient.
     RESOURCEINSUFFICIENT_CLOUDDISKUNAVAILABLE("ResourceInsufficient.CloudDiskUnavailable"),
     
    // The resource is not found.
     RESOURCENOTFOUND_INVALIDDEDICATEDCLUSTERID("ResourceNotFound.InvalidDedicatedClusterId"),
     
    // Please check whether the resource ID exists.
     RESOURCENOTFOUND_INVALIDDEDICATEDCLUSTERORDERID("ResourceNotFound.InvalidDedicatedClusterOrderId"),
     
    // The resource is not found.
     RESOURCENOTFOUND_INVALIDDEDICATEDCLUSTERTYPEID("ResourceNotFound.InvalidDedicatedClusterTypeId"),
     
    // The site equipment room is invalid.
     RESOURCENOTFOUND_INVALIDSITEID("ResourceNotFound.InvalidSiteId"),
     
    // Non-CUSTOMER type app id is not supported.
     UNSUPPORTEDOPERATION_NONCUSTOMERAPPIDNOTSUPPORT("UnsupportedOperation.NonCustomerAppIdNotSupport");
     
    private String value;
    private CdcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

