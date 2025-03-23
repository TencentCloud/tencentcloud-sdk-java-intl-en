package com.tencentcloudapi.cls.v20201016;
public enum ClsErrorCode {
    // CAM signature/authentication error.
     AUTHFAILURE("AuthFailure"),
     
    // Request unauthorized.
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The alarm notification template has already been bound to an alarm policy.
     FAILEDOPERATION_BINDEDALARM("FailedOperation.BindedAlarm"),
     
    // No corresponding prefix files in the bucket. Please use the correct bucket, file prefix, and compression method.
     FAILEDOPERATION_BUCKETNOFILE("FailedOperation.BucketNoFile"),
     
    // File decompression failed. Please choose the correct compression method.
     FAILEDOPERATION_DECOMPRESSFILE("FailedOperation.DecompressFile"),
     
    // Failed to download file. Please try again later.
     FAILEDOPERATION_DOWNLOADFILE("FailedOperation.DownLoadFile"),
     
    // Failed to get the file list. Please try again later.
     FAILEDOPERATION_GETLISTFILE("FailedOperation.GetListFile"),
     
    // The number of searched logs has reached the upper limit.
     FAILEDOPERATION_GETLOGREACHLIMIT("FailedOperation.GetlogReachLimit"),
     
    // IA storage does not support key-value or tag index configuration.
     FAILEDOPERATION_INVALIDINDEXRULEFORSEARCHLOW("FailedOperation.InValidIndexRuleForSearchLow"),
     
    // The alarm policy is exceptional. Please check whether all the log topic IDs exist.
     FAILEDOPERATION_INVALIDALARM("FailedOperation.InvalidAlarm"),
     
    // The search cursor is invalid or does not exist.
     FAILEDOPERATION_INVALIDCONTEXT("FailedOperation.InvalidContext"),
     
    // The offline storage period cannot be less than 7 days.
     FAILEDOPERATION_INVALIDPERIOD("FailedOperation.InvalidPeriod"),
     
    // The same logset already exists.
     FAILEDOPERATION_LOGSETCONFLICT("FailedOperation.LogsetConflict"),
     
    // There are log topics under the logset.
     FAILEDOPERATION_LOGSETNOTEMPTY("FailedOperation.LogsetNotEmpty"),
     
    // Invalid `Content`.
     FAILEDOPERATION_MISSINGCONTENT("FailedOperation.MissingContent"),
     
    // The modified lifecycle is prohibited.
     FAILEDOPERATION_PERIODMODIFYFORBIDDEN("FailedOperation.PeriodModifyForbidden"),
     
    // File preview failed. Please try again later.
     FAILEDOPERATION_PREVIEWFILE("FailedOperation.PreviewFile"),
     
    // The query statement failed to run.
     FAILEDOPERATION_QUERYERROR("FailedOperation.QueryError"),
     
    // Failed to read file content. Please make sure the file is readable.
     FAILEDOPERATION_READFILE("FailedOperation.ReadFile"),
     
    // The read QPS exceeds the limit.
     FAILEDOPERATION_READQPSLIMIT("FailedOperation.ReadQpsLimit"),
     
    // The query timed out.
     FAILEDOPERATION_SEARCHTIMEOUT("FailedOperation.SearchTimeout"),
     
    // Shipping task retry is not allowed.
     FAILEDOPERATION_SHIPPERTASKNOTTORETRY("FailedOperation.ShipperTaskNotToRetry"),
     
    // An error occurred while parsing the query statement.
     FAILEDOPERATION_SYNTAXERROR("FailedOperation.SyntaxError"),
     
    // The frequency of tag service requests is limited.
     FAILEDOPERATION_TAGQPSLIMIT("FailedOperation.TagQpsLimit"),
     
    // Operation timed out
     FAILEDOPERATION_TIMEOUT("FailedOperation.Timeout"),
     
    // The log topic has been disabled.
     FAILEDOPERATION_TOPICCLOSED("FailedOperation.TopicClosed"),
     
    // The topic is being created.
     FAILEDOPERATION_TOPICCREATING("FailedOperation.TopicCreating"),
     
    // The log topic has been isolated.
     FAILEDOPERATION_TOPICISOLATED("FailedOperation.TopicIsolated"),
     
    // The write QPS exceeds the limit.
     FAILEDOPERATION_WRITEQPSLIMIT("FailedOperation.WriteQpsLimit"),
     
    // The write traffic exceeds the limit.
     FAILEDOPERATION_WRITETRAFFICLIMIT("FailedOperation.WriteTrafficLimit"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // DB Error.
     INTERNALERROR_DBERROR("InternalError.DbError"),
     
    // Illegal role.
     INTERNALERROR_ILLEGALROLE("InternalError.IllegalRole"),
     
    // Retrieval error
     INTERNALERROR_SEARCHERROR("InternalError.SearchError"),
     
    // Retrieval failed
     INTERNALERROR_SEARCHFAILED("InternalError.SearchFailed"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The alarm policy already exists.
     INVALIDPARAMETER_ALARMCONFLICT("InvalidParameter.AlarmConflict"),
     
    // The alarm notification template already exists.
     INVALIDPARAMETER_ALARMNOTICECONFLICT("InvalidParameter.AlarmNoticeConflict"),
     
    // The same collection configuration rule already exists.
     INVALIDPARAMETER_CONFIGCONFLICT("InvalidParameter.ConfigConflict"),
     
    // Invalid `Content`.
     INVALIDPARAMETER_CONTENT("InvalidParameter.Content"),
     
    // There is a data processing task conflict.
     INVALIDPARAMETER_DATAFROMTASKCONFLICT("InvalidParameter.DataFromTaskConflict"),
     
    // The data processing task does not exist.
     INVALIDPARAMETER_DATAFROMTASKNOTEXIST("InvalidParameter.DataFromTaskNotExist"),
     
    // The unique key of database conflicts.
     INVALIDPARAMETER_DBDUPLICATION("InvalidParameter.DbDuplication"),
     
    // The export job already exists.
     INVALIDPARAMETER_EXPORTCONFLICT("InvalidParameter.ExportConflict"),
     
    // IA storage does not support key-value or tag index configuration.
     INVALIDPARAMETER_INVALIDINDEXRULEFORSEARCHLOW("InvalidParameter.InValidIndexRuleForSearchLow"),
     
    // An index rule already exists for the specified log topic.
     INVALIDPARAMETER_INDEXCONFLICT("InvalidParameter.IndexConflict"),
     
    // The data processing statement is invalid.
     INVALIDPARAMETER_INVALIDETLCONTENT("InvalidParameter.InvalidEtlContent"),
     
    // The same logset already exists.
     INVALIDPARAMETER_LOGSETCONFLICT("InvalidParameter.LogsetConflict"),
     
    // The same machine group already exists.
     INVALIDPARAMETER_MACHINEGROUPCONFLICT("InvalidParameter.MachineGroupConflict"),
     
    // Parameter error.
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // Shipping rule naming conflict.
     INVALIDPARAMETER_SHIPPERCONFLICT("InvalidParameter.ShipperConflict"),
     
    // There is already a log topic with the same name in the specified logset.
     INVALIDPARAMETER_TOPICCONFLICT("InvalidParameter.TopicConflict"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The quota limit has been reached.
     LIMITEXCEEDED("LimitExceeded"),
     
    // The collection rule configuration exceeds the maximum value limit.
     LIMITEXCEEDED_CONFIG("LimitExceeded.Config"),
     
    // The number of log export tasks has exceeded the limit.
     LIMITEXCEEDED_EXPORT("LimitExceeded.Export"),
     
    // Index operations exceed the frequency limit.
     LIMITEXCEEDED_INDEXOPERATING("LimitExceeded.IndexOperating"),
     
    // The number of concurrent queries exceeds the limit, which is 15 per topic.
     LIMITEXCEEDED_LOGSEARCH("LimitExceeded.LogSearch"),
     
    // The log size exceeds the limit.
     LIMITEXCEEDED_LOGSIZE("LimitExceeded.LogSize"),
     
    // The number of logsets exceeds the limit.
     LIMITEXCEEDED_LOGSET("LimitExceeded.Logset"),
     
    // The number of machine groups exceeds the limit.
     LIMITEXCEEDED_MACHINEGROUP("LimitExceeded.MachineGroup"),
     
    // The number of machine group IPs exceeds the limit.
     LIMITEXCEEDED_MACHINEGROUPIP("LimitExceeded.MachineGroupIp"),
     
    // The number of machine group labels exceeds the limit.
     LIMITEXCEEDED_MACHINEGROUPIPLABELS("LimitExceeded.MachineGroupIpLabels"),
     
    // The number of partitions exceeds the limit.
     LIMITEXCEEDED_PARTITION("LimitExceeded.Partition"),
     
    // Record exceeds limit
     LIMITEXCEEDED_RECORDOUTOFLIMIT("LimitExceeded.RecordOutOfLimit"),
     
    // Out of search memory.
     LIMITEXCEEDED_SEARCHRESOURCES("LimitExceeded.SearchResources"),
     
    // The number of logs returned by the search API exceeds the upper limit (20 MB).
     LIMITEXCEEDED_SEARCHRESULTTOOLARGE("LimitExceeded.SearchResultTooLarge"),
     
    // The number of shipping rules exceeds the limit.
     LIMITEXCEEDED_SHIPPER("LimitExceeded.Shipper"),
     
    // The number of tags exceeds the limit.
     LIMITEXCEEDED_TAG("LimitExceeded.Tag"),
     
    // The number of log topics exceeds the limit.
     LIMITEXCEEDED_TOPIC("LimitExceeded.Topic"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // ACL verification failed.
     OPERATIONDENIED_ACLFAILED("OperationDenied.ACLFailed"),
     
    // The account has been terminated.
     OPERATIONDENIED_ACCOUNTDESTROY("OperationDenied.AccountDestroy"),
     
    // The account has overdue payments.
     OPERATIONDENIED_ACCOUNTISOLATE("OperationDenied.AccountIsolate"),
     
    // The account does not exist.
     OPERATIONDENIED_ACCOUNTNOTEXISTS("OperationDenied.AccountNotExists"),
     
    // IA storage does not support alarms.
     OPERATIONDENIED_ALARMNOTSUPPORTFORSEARCHLOW("OperationDenied.AlarmNotSupportForSearchLow"),
     
    // The analysis feature is not enabled for the field.
     OPERATIONDENIED_ANALYSISSWITCHCLOSE("OperationDenied.AnalysisSwitchClose"),
     
    // New syntax is not supported.
     OPERATIONDENIED_NEWSYNTAXNOTSUPPORTED("OperationDenied.NewSyntaxNotSupported"),
     
    // The notification template is bound to an alarm and cannot be deleted.
     OPERATIONDENIED_NOTICEHASALARM("OperationDenied.NoticeHasAlarm"),
     
    // The operation is not supported in IA storage.
     OPERATIONDENIED_OPERATIONNOTSUPPORTINSEARCHLOW("OperationDenied.OperationNotSupportInSearchLow"),
     
    // A data processing task is bound to this topic.
     OPERATIONDENIED_TOPICHASDATAFORMTASK("OperationDenied.TopicHasDataFormTask"),
     
    // The topic is bound to a function for shipping.
     OPERATIONDENIED_TOPICHASDELIVERFUNCTION("OperationDenied.TopicHasDeliverFunction"),
     
    // Unable to delete this topic because an external data source is configured for it.
     OPERATIONDENIED_TOPICHASEXTERNALDATASOURCECONFIG("OperationDenied.TopicHasExternalDatasourceConfig"),
     
    // The topic is bound to the `scheduleSql` job.
     OPERATIONDENIED_TOPICHASSCHEDULESQLTASK("OperationDenied.TopicHasScheduleSqlTask"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The agent version does not exist.
     RESOURCENOTFOUND_AGENTVERSIONNOTEXIST("ResourceNotFound.AgentVersionNotExist"),
     
    // The alarm policy does not exist.
     RESOURCENOTFOUND_ALARMNOTEXIST("ResourceNotFound.AlarmNotExist"),
     
    // The alarm notification template does not exist.
     RESOURCENOTFOUND_ALARMNOTICENOTEXIST("ResourceNotFound.AlarmNoticeNotExist"),
     
    // The specified collection rule configuration does not exist.
     RESOURCENOTFOUND_CONFIGNOTEXIST("ResourceNotFound.ConfigNotExist"),
     
    // Data processing task does not exist.
     RESOURCENOTFOUND_DATAFROMTASKNOTEXIST("ResourceNotFound.DataFromTaskNotExist"),
     
    // The log export does not exist.
     RESOURCENOTFOUND_EXPORTNOTEXIST("ResourceNotFound.ExportNotExist"),
     
    // The index does not exist.
     RESOURCENOTFOUND_INDEXNOTEXIST("ResourceNotFound.IndexNotExist"),
     
    // The specified logset does not exist.
     RESOURCENOTFOUND_LOGSETNOTEXIST("ResourceNotFound.LogsetNotExist"),
     
    // The machine group does not exist.
     RESOURCENOTFOUND_MACHINEGROUPNOTEXIST("ResourceNotFound.MachineGroupNotExist"),
     
    // The partition does not exist.
     RESOURCENOTFOUND_PARTITIONNOTEXIST("ResourceNotFound.PartitionNotExist"),
     
    // Record does not exist
     RESOURCENOTFOUND_RECORDNOTEXIST("ResourceNotFound.RecordNotExist"),
     
    // The shipping rule does not exist.
     RESOURCENOTFOUND_SHIPPERNOTEXIST("ResourceNotFound.ShipperNotExist"),
     
    // The shipping task does not exist.
     RESOURCENOTFOUND_SHIPPERTASKNOTEXIST("ResourceNotFound.ShipperTaskNotExist"),
     
    // The log topic does not exist.
     RESOURCENOTFOUND_TOPICNOTEXIST("ResourceNotFound.TopicNotExist"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter error.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private ClsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

