package com.tencentcloudapi.vod.v20240718;
public enum VodErrorCode {
     /* The application ID does not match the bucket ID. */
     FAILEDOPERATION_BUCKETIDNOTMATCH("FailedOperation.BucketIdNotMatch"),
     
     /* The incremental migration strategy for the bucket is currently being deployed. */
     FAILEDOPERATION_BUCKETINCREMENTALMIGRATIONSTRATEGYDEPLOYING("FailedOperation.BucketIncrementalMigrationStrategyDeploying"),
     
     /* The number of incremental migration strategies for the bucket is over the limit. */
     FAILEDOPERATION_INCREMENTALMIGRATIONSTRATEGYOVERLIMIT("FailedOperation.IncrementalMigrationStrategyOverLimit"),
     
     /* The storage capacity in this region has exceeded the limit. */
     FAILEDOPERATION_STORAGEREGIONBUCKETOVERLIMIT("FailedOperation.StorageRegionBucketOverLimit"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Invalid filter. */
     INVALIDFILTER("InvalidFilter"),
     
     /* Invalid parameter. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Incorrect parameter value. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Unsupported storage region. */
     INVALIDPARAMETERVALUE_UNSUPPORTEDSTORAGEREGION("InvalidParameterValue.UnsupportedStorageRegion"),
     
     /* The incremental migration strategy was not found. */
     RESOURCENOTFOUND_INCREMENTALMIGRATIONSTRATEGYNOTFOUND("ResourceNotFound.IncrementalMigrationStrategyNotFound"),
     
     /* Application is unauthorized. */
     UNAUTHORIZEDOPERATION_SUBAPP("UnauthorizedOperation.SubApp");
     
    private String value;
    private VodErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

