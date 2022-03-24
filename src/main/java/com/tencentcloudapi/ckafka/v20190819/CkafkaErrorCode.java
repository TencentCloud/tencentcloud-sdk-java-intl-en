package com.tencentcloudapi.ckafka.v20190819;
public enum CkafkaErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // DryRun operation, which means the DryRun parameter is passed in yet the request will still be successful.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Invalid parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The instance does not exist.
     INVALIDPARAMETERVALUE_INSTANCENOTEXIST("InvalidParameterValue.InstanceNotExist"),
     
    // The parameter is required.
     INVALIDPARAMETERVALUE_NOTALLOWEDEMPTY("InvalidParameterValue.NotAllowedEmpty"),
     
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
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // Task paused.
     OPERATIONDENIED_RESOURCETASKPAUSED("OperationDenied.ResourceTaskPaused"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is occupied.
     RESOURCEINUSE("ResourceInUse"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
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

