package com.tencentcloudapi.ckafka.v20190819;
public enum CkafkaErrorCode {
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The instance does not exist.
     INVALIDPARAMETERVALUE_INSTANCENOTEXIST("InvalidParameterValue.InstanceNotExist"),
     
    // The parameter already exists.
     INVALIDPARAMETERVALUE_REPETITIONVALUE("InvalidParameterValue.RepetitionValue"),
     
    // Invalid subnet ID.
     INVALIDPARAMETERVALUE_SUBNETIDINVALID("InvalidParameterValue.SubnetIdInvalid"),
     
    // The subnet is not in the zone.
     INVALIDPARAMETERVALUE_SUBNETNOTBELONGTOZONE("InvalidParameterValue.SubnetNotBelongToZone"),
     
    // Invalid VPC ID.
     INVALIDPARAMETERVALUE_VPCIDINVALID("InvalidParameterValue.VpcIdInvalid"),
     
    // The value of the `Action` parameter is incorrect.
     INVALIDPARAMETERVALUE_WRONGACTION("InvalidParameterValue.WrongAction"),
     
    // The zone is not supported.
     INVALIDPARAMETERVALUE_ZONENOTSUPPORT("InvalidParameterValue.ZoneNotSupport"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // The batch instance deletion limit is reached.
     UNSUPPORTEDOPERATION_BATCHDELINSTANCELIMIT("UnsupportedOperation.BatchDelInstanceLimit"),
     
    // Oss rejected the operation.
     UNSUPPORTEDOPERATION_OSSREJECT("UnsupportedOperation.OssReject");
     
    private String value;
    private CkafkaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

