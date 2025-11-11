package com.tencentcloudapi.ckafka.v20190819;
public enum CkafkaErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun operation, which means the DryRun parameter is passed in yet the request will still be successful. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Invalid Filter */
     INVALIDFILTER("InvalidFilter"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* The topic name is duplicate. */
     INVALIDPARAMETER_TOPICEXIST("InvalidParameter.TopicExist"),
     
     /* Invalid parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* The instance does not exist. */
     INVALIDPARAMETERVALUE_INSTANCENOTEXIST("InvalidParameterValue.InstanceNotExist"),
     
     /* The parameter is required. */
     INVALIDPARAMETERVALUE_NOTALLOWEDEMPTY("InvalidParameterValue.NotAllowedEmpty"),
     
     /* The parameter already exists. */
     INVALIDPARAMETERVALUE_REPETITIONVALUE("InvalidParameterValue.RepetitionValue"),
     
     /* Invalid subnet ID. */
     INVALIDPARAMETERVALUE_SUBNETIDINVALID("InvalidParameterValue.SubnetIdInvalid"),
     
     /* The subnet is not in the zone. */
     INVALIDPARAMETERVALUE_SUBNETNOTBELONGTOZONE("InvalidParameterValue.SubnetNotBelongToZone"),
     
     /* Topic name already exists. */
     INVALIDPARAMETERVALUE_TOPICNAMEALREADYEXIST("InvalidParameterValue.TopicNameAlreadyExist"),
     
     /* Invalid VPC ID. */
     INVALIDPARAMETERVALUE_VPCIDINVALID("InvalidParameterValue.VpcIdInvalid"),
     
     /* The value of the `Action` parameter is incorrect. */
     INVALIDPARAMETERVALUE_WRONGACTION("InvalidParameterValue.WrongAction"),
     
     /* The zone is not supported. */
     INVALIDPARAMETERVALUE_ZONENOTSUPPORT("InvalidParameterValue.ZoneNotSupport"),
     
     /* The quota limit has been reached. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* The number of routes exceeds the limit. */
     LIMITEXCEEDED_ROUTEOVERLIMIT("LimitExceeded.RouteOverLimit"),
     
     /* SASL route exceeds the limit. */
     LIMITEXCEEDED_ROUTESASLOVERLIMIT("LimitExceeded.RouteSASLOverLimit"),
     
     /* Missing parameter */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Task paused. */
     OPERATIONDENIED_RESOURCETASKPAUSED("OperationDenied.ResourceTaskPaused"),
     
     /* The number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Insufficient resources. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Disk resources are unavailable on the broker. */
     RESOURCEUNAVAILABLE_KAFKASTORAGEERROR("ResourceUnavailable.KafkaStorageError"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* Unsupported operation. */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* The batch instance deletion limit is reached. */
     UNSUPPORTEDOPERATION_BATCHDELINSTANCELIMIT("UnsupportedOperation.BatchDelInstanceLimit"),
     
     /* Create Topic upon success. the Topic can be deleted after 60s. */
     UNSUPPORTEDOPERATION_FREQUENCYTOPICDELETEOPERATE("UnsupportedOperation.FrequencyTopicDeleteOperate"),
     
     /* Oss rejected the operation. */
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

