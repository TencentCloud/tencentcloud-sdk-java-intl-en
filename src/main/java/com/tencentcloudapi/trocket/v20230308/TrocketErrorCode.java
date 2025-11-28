package com.tencentcloudapi.trocket.v20230308;
public enum TrocketErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Instance not ready. Please try again later. */
     FAILEDOPERATION_INSTANCENOTREADY("FailedOperation.InstanceNotReady"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Access point does not exist. */
     RESOURCENOTFOUND_ENDPOINT("ResourceNotFound.Endpoint"),
     
     /* Consumer group does not exist. Please check and try again. */
     RESOURCENOTFOUND_GROUP("ResourceNotFound.Group"),
     
     /* The instance does not exist. */
     RESOURCENOTFOUND_INSTANCE("ResourceNotFound.Instance"),
     
     /* Message does not exist. */
     RESOURCENOTFOUND_MESSAGE("ResourceNotFound.Message"),
     
     /* Migration task does not exist. Please check and try again. */
     RESOURCENOTFOUND_MIGRATIONTASK("ResourceNotFound.MigrationTask"),
     
     /* Role does not exist. Please check and try again. */
     RESOURCENOTFOUND_ROLE("ResourceNotFound.Role"),
     
     /* Topic does not exist. Please check and try again. */
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* The number of instance topics cannot be adjusted below the used quota. */
     UNSUPPORTEDOPERATION_INSTANCETOPICNUMDOWNGRADE("UnsupportedOperation.InstanceTopicNumDowngrade"),
     
     /* Resource already exists. Please check and try again. */
     UNSUPPORTEDOPERATION_RESOURCEALREADYEXISTS("UnsupportedOperation.ResourceAlreadyExists");
     
    private String value;
    private TrocketErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

