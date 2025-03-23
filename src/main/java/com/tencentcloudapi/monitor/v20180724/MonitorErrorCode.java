package com.tencentcloudapi.monitor.v20180724;
public enum MonitorErrorCode {
    // Error with CAM signature/authentication.
     AUTHFAILURE("AuthFailure"),
     
    // Access authentication failed.
     AUTHFAILURE_ACCESSCAMFAIL("AuthFailure.AccessCAMFail"),
     
    // The request is not authorized. For more information on the authentication, see the CAM documentation.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // DryRun Operation. It means that the request would have succeeded, but the DryRun parameter was used.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Failed to access STS.
     FAILEDOPERATION_ACCESSSTSFAIL("FailedOperation.AccessSTSFail"),
     
    // Failed to access the TKE cluster.
     FAILEDOPERATION_ACCESSTKEFAIL("FailedOperation.AccessTKEFail"),
     
    // Failed to access the tag service.
     FAILEDOPERATION_ACCESSTAGFAIL("FailedOperation.AccessTagFail"),
     
    // For the agent in this status, the operation is not allowed.
     FAILEDOPERATION_AGENTNOTALLOWED("FailedOperation.AgentNotAllowed"),
     
    // The agent version does not support this operation. Upgrade the agent.
     FAILEDOPERATION_AGENTVERSIONNOTSUPPORTED("FailedOperation.AgentVersionNotSupported"),
     
    // There are agents running on this instance.
     FAILEDOPERATION_AGENTSNOTINUNINSTALLSTAGE("FailedOperation.AgentsNotInUninstallStage"),
     
    // Failed to delete the filter rule.
     FAILEDOPERATION_ALERTFILTERRULEDELETEFAILED("FailedOperation.AlertFilterRuleDeleteFailed"),
     
    // Failed to create the alarm policy.
     FAILEDOPERATION_ALERTPOLICYCREATEFAILED("FailedOperation.AlertPolicyCreateFailed"),
     
    // Failed to delete the alarm policy.
     FAILEDOPERATION_ALERTPOLICYDELETEFAILED("FailedOperation.AlertPolicyDeleteFailed"),
     
    // Failed to query the alarm policy.
     FAILEDOPERATION_ALERTPOLICYDESCRIBEFAILED("FailedOperation.AlertPolicyDescribeFailed"),
     
    // Failed to modify the alarm policy.
     FAILEDOPERATION_ALERTPOLICYMODIFYFAILED("FailedOperation.AlertPolicyModifyFailed"),
     
    // Failed to delete the trigger condition.
     FAILEDOPERATION_ALERTTRIGGERRULEDELETEFAILED("FailedOperation.AlertTriggerRuleDeleteFailed"),
     
    // The YAML format is incorrect.
     FAILEDOPERATION_BADYAMLFORMAT("FailedOperation.BadYamlFormat"),
     
    // FailedOperation.ComponentClientCommon
     FAILEDOPERATION_COMPONENTCLIENTCOMMON("FailedOperation.ComponentClientCommon"),
     
    // FailedOperation.ComponentClientHttp
     FAILEDOPERATION_COMPONENTCLIENTHTTP("FailedOperation.ComponentClientHttp"),
     
    // FailedOperation.ComponentClientUnpack
     FAILEDOPERATION_COMPONENTCLIENTUNPACK("FailedOperation.ComponentClientUnpack"),
     
    // Failed to create the instance.
     FAILEDOPERATION_CREATEINSTANCE("FailedOperation.CreateInstance"),
     
    // This account is not allowed to create instances.
     FAILEDOPERATION_CREATEINSTANCELIMITED("FailedOperation.CreateInstanceLimited"),
     
    // The data table field doesn't exist.
     FAILEDOPERATION_DATACOLUMNNOTFOUND("FailedOperation.DataColumnNotFound"),
     
    // Failed to query the data.
     FAILEDOPERATION_DATAQUERYFAILED("FailedOperation.DataQueryFailed"),
     
    // The data table doesn't exist.
     FAILEDOPERATION_DATATABLENOTFOUND("FailedOperation.DataTableNotFound"),
     
    // FailedOperation.Db
     FAILEDOPERATION_DB("FailedOperation.Db"),
     
    // Failed to query the database.
     FAILEDOPERATION_DBQUERYFAILED("FailedOperation.DbQueryFailed"),
     
    // Failed to create the database record.
     FAILEDOPERATION_DBRECORDCREATEFAILED("FailedOperation.DbRecordCreateFailed"),
     
    // Failed to delete the database record.
     FAILEDOPERATION_DBRECORDDELETEFAILED("FailedOperation.DbRecordDeleteFailed"),
     
    // FailedOperation.DbRecordNotFound
     FAILEDOPERATION_DBRECORDNOTFOUND("FailedOperation.DbRecordNotFound"),
     
    // Failed to update the database record.
     FAILEDOPERATION_DBRECORDUPDATEFAILED("FailedOperation.DbRecordUpdateFailed"),
     
    // Failed to start the database transaction.
     FAILEDOPERATION_DBTRANSACTIONBEGINFAILED("FailedOperation.DbTransactionBeginFailed"),
     
    // Failed to submit the database transaction.
     FAILEDOPERATION_DBTRANSACTIONCOMMITFAILED("FailedOperation.DbTransactionCommitFailed"),
     
    // Failed to query the service in the request dimension.
     FAILEDOPERATION_DIMQUERYREQUESTFAILED("FailedOperation.DimQueryRequestFailed"),
     
    // The dividend is zero.
     FAILEDOPERATION_DIVISIONBYZERO("FailedOperation.DivisionByZero"),
     
    // Backend service timed out.
     FAILEDOPERATION_DOHTTPTRANSFERFAILED("FailedOperation.DoHTTPTransferFailed"),
     
    // DoTRPCTransferFailed
     FAILEDOPERATION_DOTRPCTRANSFERFAILED("FailedOperation.DoTRPCTransferFailed"),
     
    // Failed to query analysis data.
     FAILEDOPERATION_DRUIDQUERYFAILED("FailedOperation.DruidQueryFailed"),
     
    // The druid table does not exist.
     FAILEDOPERATION_DRUIDTABLENOTFOUND("FailedOperation.DruidTableNotFound"),
     
    // The name already exists.
     FAILEDOPERATION_DUPLICATENAME("FailedOperation.DuplicateName"),
     
    // You have not enabled pay-as-you-go billing for API requests.
     FAILEDOPERATION_ERRNOTOPEN("FailedOperation.ErrNotOpen"),
     
    // You have overdue payments.
     FAILEDOPERATION_ERROWED("FailedOperation.ErrOwed"),
     
    // An error occurred while generating the resource ID.
     FAILEDOPERATION_GENERATEINSTANCEIDFAILED("FailedOperation.GenerateInstanceIDFailed"),
     
    // The instance does not exist.
     FAILEDOPERATION_INSTANCENOTFOUND("FailedOperation.InstanceNotFound"),
     
    // The instance is not running.
     FAILEDOPERATION_INSTANCENOTRUNNING("FailedOperation.InstanceNotRunning"),
     
    // Internal service error.
     FAILEDOPERATION_INTERNALERROR("FailedOperation.InternalError"),
     
    // FailedOperation.KubeClientConf
     FAILEDOPERATION_KUBECLIENTCONF("FailedOperation.KubeClientConf"),
     
    // FailedOperation.KubeCommon
     FAILEDOPERATION_KUBECOMMON("FailedOperation.KubeCommon"),
     
    // The region is unavailable.
     FAILEDOPERATION_REGIONUNAVAILABLE("FailedOperation.RegionUnavailable"),
     
    // The resource already exists.
     FAILEDOPERATION_RESOURCEEXIST("FailedOperation.ResourceExist"),
     
    // The resource does not exist.
     FAILEDOPERATION_RESOURCENOTFOUND("FailedOperation.ResourceNotFound"),
     
    // The resource is being manipulated.
     FAILEDOPERATION_RESOURCEOPERATING("FailedOperation.ResourceOperating"),
     
    // Failed to send the authorization request.
     FAILEDOPERATION_SENDREQUEST("FailedOperation.SendRequest"),
     
    // The service is not enabled and can be used only after being enabled.
     FAILEDOPERATION_SERVICENOTENABLED("FailedOperation.ServiceNotEnabled"),
     
    // There is no access to TKE.
     FAILEDOPERATION_TKECLIENTAUTHFAIL("FailedOperation.TKEClientAuthFail"),
     
    // The TKE endpoint is inaccessible.
     FAILEDOPERATION_TKEENDPOINTSTATUSERROR("FailedOperation.TKEEndpointStatusError"),
     
    // A conflict occurred while updating the TKE resource.
     FAILEDOPERATION_TKERESOURCECONFLICT("FailedOperation.TKEResourceConflict"),
     
    // The AZ is unavailable.
     FAILEDOPERATION_ZONEUNAVAILABLE("FailedOperation.ZoneUnavailable"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Error with the callback.
     INTERNALERROR_CALLBACKFAIL("InternalError.CallbackFail"),
     
    // InternalError.Db
     INTERNALERROR_DB("InternalError.Db"),
     
    // InternalError.DbRecordNotFound
     INTERNALERROR_DBRECORDNOTFOUND("InternalError.DbRecordNotFound"),
     
    // Error with another dependent API.
     INTERNALERROR_DEPENDSAPI("InternalError.DependsApi"),
     
    // Error with the dependent db.
     INTERNALERROR_DEPENDSDB("InternalError.DependsDb"),
     
    // Error with the dependent mq.
     INTERNALERROR_DEPENDSMQ("InternalError.DependsMq"),
     
    // Execution timed out.
     INTERNALERROR_EXETIMEOUT("InternalError.ExeTimeout"),
     
    // InternalError.Param
     INTERNALERROR_PARAM("InternalError.Param"),
     
    // System error.
     INTERNALERROR_SYSTEM("InternalError.System"),
     
    // InternalError.TaskNotFound
     INTERNALERROR_TASKNOTFOUND("InternalError.TaskNotFound"),
     
    // An error occurred while parsing the task result.
     INTERNALERROR_TASKRESULTFORMAT("InternalError.TaskResultFormat"),
     
    // InternalError.UnexpectedInternal
     INTERNALERROR_UNEXPECTEDINTERNAL("InternalError.UnexpectedInternal"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // InvalidParameter.ClusterNotFound
     INVALIDPARAMETER_CLUSTERNOTFOUND("InvalidParameter.ClusterNotFound"),
     
    // The task has already been submitted.
     INVALIDPARAMETER_DUPTASK("InvalidParameter.DupTask"),
     
    // Invalid parameter.
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
    // Invalid parameter.
     INVALIDPARAMETER_INVALIDPARAMETERPARAM("InvalidParameter.InvalidParameterParam"),
     
    // The platform configuration is missing.
     INVALIDPARAMETER_MISSAKSK("InvalidParameter.MissAKSK"),
     
    // InvalidParameter.Param
     INVALIDPARAMETER_PARAM("InvalidParameter.Param"),
     
    // Incorrect parameter.
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // InvalidParameter.PromClusterNotFound
     INVALIDPARAMETER_PROMCLUSTERNOTFOUND("InvalidParameter.PromClusterNotFound"),
     
    // InvalidParameter.PromInstanceNotFound
     INVALIDPARAMETER_PROMINSTANCENOTFOUND("InvalidParameter.PromInstanceNotFound"),
     
    // InvalidParameter.ResourceNotFound
     INVALIDPARAMETER_RESOURCENOTFOUND("InvalidParameter.ResourceNotFound"),
     
    // Error with the platform configuration.
     INVALIDPARAMETER_SECRETIDORSECRETKEYERROR("InvalidParameter.SecretIdOrSecretKeyError"),
     
    // This product doesn't support scan.
     INVALIDPARAMETER_UNSUPPORTEDPRODUCT("InvalidParameter.UnsupportedProduct"),
     
    // The parameter value is incorrect.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The dashboard name already exists.
     INVALIDPARAMETERVALUE_DASHBOARDNAMEEXISTS("InvalidParameterValue.DashboardNameExists"),
     
    // The version does not match.
     INVALIDPARAMETERVALUE_VERSIONMISMATCH("InvalidParameterValue.VersionMismatch"),
     
    // Quota limit is reached.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Quota limit on metrics is reached. Requests containing unregistered metrics are prohibited.
     LIMITEXCEEDED_METRICQUOTAEXCEEDED("LimitExceeded.MetricQuotaExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // ResourceInUse.ResourceExistAlready
     RESOURCEINUSE_RESOURCEEXISTALREADY("ResourceInUse.ResourceExistAlready"),
     
    // Insufficient resources.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource is not found.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The task does not exist.
     RESOURCENOTFOUND_NOTEXISTTASK("ResourceNotFound.NotExistTask"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The resources have been sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private MonitorErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

