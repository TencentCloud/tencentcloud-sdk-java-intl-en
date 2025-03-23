package com.tencentcloudapi.controlcenter.v20230110;
public enum ControlcenterErrorCode {
    // Required baseline item in Account Factory is not configured.
     FAILEDOPERATION_AFREQUIREDITEMNOTSELECT("FailedOperation.AFRequiredItemNotSelect"),
     
    // The number of accounts to which baselines are applied in Account Factory exceeds the limit.
     FAILEDOPERATION_ACCOUNTFACTORYMEMBERUINNUMEXCEED("FailedOperation.AccountFactoryMemberUinNumExceed"),
     
    // The user is deploying account baseline. It cannot be deployed repeatedly.
     FAILEDOPERATION_ACCOUNTFACTORYTASKISDEPLOYING("FailedOperation.AccountFactoryTaskIsDeploying"),
     
    // Control Center service is not enabled.
     FAILEDOPERATION_CONTROLCENTERNOTOPEN("FailedOperation.ControlCenterNotOpen"),
     
    // Database operation exception.
     FAILEDOPERATION_DBOPERATIONERROR("FailedOperation.DBOperationError"),
     
    // The feature item to depend on is not deployed.
     FAILEDOPERATION_DEPENDONITEMNOTDEPLOY("FailedOperation.DependOnItemNotDeploy"),
     
    // Remote call failed.
     FAILEDOPERATION_REMOTECALLERROR("FailedOperation.RemoteCallError"),
     
    // User baseline configuration data does not exist.
     RESOURCENOTFOUND_ACCOUNTFACTORYBASELINENOTEXIST("ResourceNotFound.AccountFactoryBaselineNotExist"),
     
    // The baseline item deployed by the user is not configured.
     RESOURCENOTFOUND_ACCOUNTFACTORYITEMNOTCONFIG("ResourceNotFound.AccountFactoryItemNotConfig"),
     
    // Account Factory baseline does not exist.
     RESOURCENOTFOUND_ACCOUNTFACTORYITEMNOTEXIST("ResourceNotFound.AccountFactoryItemNotExist");
     
    private String value;
    private ControlcenterErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

