package com.tencentcloudapi.makers.v20261113;
public enum MakersErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* Git authorization has expired. */
     FAILEDOPERATION_GITAUTHEXPIRED("FailedOperation.GitAuthExpired"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value is invalid, or the requested resources do not belong to the current account. */
     INVALIDPARAMETER_SECURITY("InvalidParameter.Security"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* The current plan does not support this operation, or the plan quota limit has been reached. */
     LIMITEXCEEDED_QUOTA("LimitExceeded.Quota"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private MakersErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

