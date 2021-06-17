package com.tencentcloudapi.cloudaudit.v20190319;
public enum CloudauditErrorCode {
    // Duplicate recorder name.
     INVALIDPARAMETERVALUE_RECORDERNAMEREPEAT("InvalidParameterValue.RecorderNameRepeat"),
     
    // The number of resource recorders exceeds the limit.
     LIMITEXCEEDED_RECORDEROVERAMOUNT("LimitExceeded.RecorderOverAmount"),
     
    // Recorder not found.
     RESOURCENOTFOUND_RECORDERNOTFOUND("ResourceNotFound.RecorderNotFound"),
     
    // Resource not found.
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound");
     
    private String value;
    private CloudauditErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

