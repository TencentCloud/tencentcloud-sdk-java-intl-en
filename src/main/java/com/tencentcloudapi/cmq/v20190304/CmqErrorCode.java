package com.tencentcloudapi.cmq.v20190304;
public enum CmqErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* The operation is in progress. Please try again later. */
     FAILEDOPERATION_TRYLATER("FailedOperation.TryLater"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* The task ID does not exist. */
     INVALIDPARAMETERVALUE_NOTASKID("InvalidParameterValue.NoTaskId"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* The resource is in use. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* The resource is unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* The resources have been sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private CmqErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

