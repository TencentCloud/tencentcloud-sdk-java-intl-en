package com.tencentcloudapi.ga2.v20250115;
public enum Ga2ErrorCode {
     /* Asynchronous task ID does not exist. */
     INVALIDPARAMETERVALUE_TASKNOTFOUND("InvalidParameterValue.TaskNotFound");
     
    private String value;
    private Ga2ErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

