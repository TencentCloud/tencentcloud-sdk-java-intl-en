package com.tencentcloudapi.csip.v20221121;
public enum CsipErrorCode {
     /* CAM signature/authentication error. */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun operation means the request will be successful, but the DryRun parameter is passed. */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* FailedOperation.APIServerFail */
     FAILEDOPERATION_APISERVERFAIL("FailedOperation.APIServerFail"),
     
     /* FailedOperation.DasbAmountNotEnough */
     FAILEDOPERATION_DASBAMOUNTNOTENOUGH("FailedOperation.DasbAmountNotEnough"),
     
     /* FailedOperation.DasbErrorCode */
     FAILEDOPERATION_DASBERRORCODE("FailedOperation.DasbErrorCode"),
     
     /* FailedOperation.DasbInvalidSecretId */
     FAILEDOPERATION_DASBINVALIDSECRETID("FailedOperation.DasbInvalidSecretId"),
     
     /* FailedOperation.DasbInvalidSecretKey */
     FAILEDOPERATION_DASBINVALIDSECRETKEY("FailedOperation.DasbInvalidSecretKey"),
     
     /* FailedOperation.Export */
     FAILEDOPERATION_EXPORT("FailedOperation.Export"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Invalid Filter */
     INVALIDFILTER("InvalidFilter"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* InvalidParameter.DateRange */
     INVALIDPARAMETER_DATERANGE("InvalidParameter.DateRange"),
     
     /* Decrypt error */
     INVALIDPARAMETER_DECRYPTERROR("InvalidParameter.DecryptError"),
     
     /* InvalidParameter.DuplicateParameters */
     INVALIDPARAMETER_DUPLICATEPARAMETERS("InvalidParameter.DuplicateParameters"),
     
     /* InvalidParameter.IllegalRequest */
     INVALIDPARAMETER_ILLEGALREQUEST("InvalidParameter.IllegalRequest"),
     
     /* InvalidParameter.InstanceNotExist */
     INVALIDPARAMETER_INSTANCENOTEXIST("InvalidParameter.InstanceNotExist"),
     
     /* InvalidParameter.InvalidFormat */
     INVALIDPARAMETER_INVALIDFORMAT("InvalidParameter.InvalidFormat"),
     
     /* InvalidParameter.MissingParameter */
     INVALIDPARAMETER_MISSINGPARAMETER("InvalidParameter.MissingParameter"),
     
     /* InvalidParameter.ParsingError */
     INVALIDPARAMETER_PARSINGERROR("InvalidParameter.ParsingError"),
     
     /* InvalidParameter.RegexRuleError */
     INVALIDPARAMETER_REGEXRULEERROR("InvalidParameter.RegexRuleError"),
     
     /* InvalidParameter.ResourceId */
     INVALIDPARAMETER_RESOURCEID("InvalidParameter.ResourceId"),
     
     /* InvalidParameter.ResourceIdError */
     INVALIDPARAMETER_RESOURCEIDERROR("InvalidParameter.ResourceIdError"),
     
     /* InvalidParameter.ReverShellKeyFieldAllEmpty */
     INVALIDPARAMETER_REVERSHELLKEYFIELDALLEMPTY("InvalidParameter.ReverShellKeyFieldAllEmpty"),
     
     /* InvalidParameter.RuleHostDuplicateErr */
     INVALIDPARAMETER_RULEHOSTDUPLICATEERR("InvalidParameter.RuleHostDuplicateErr"),
     
     /* InvalidParameter.RuleHostipErr */
     INVALIDPARAMETER_RULEHOSTIPERR("InvalidParameter.RuleHostipErr"),
     
     /* InvalidParameter.TopicNotExist */
     INVALIDPARAMETER_TOPICNOTEXIST("InvalidParameter.TopicNotExist"),
     
     /* Invalid parameter combination */
     INVALIDPARAMETERCOMBINATION("InvalidParameterCombination"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* SQL query failed */
     INVALIDPARAMETERVALUE_SQLQUERYFAILED("InvalidParameterValue.SQLQueryFailed"),
     
     /* The quota limit is exceeded. */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* LimitExceeded.AreaQuota */
     LIMITEXCEEDED_AREAQUOTA("LimitExceeded.AreaQuota"),
     
     /* Parameters are missing. */
     MISSINGPARAMETER("MissingParameter"),
     
     /* Operation denied. */
     OPERATIONDENIED("OperationDenied"),
     
     /* Region error. */
     REGIONERROR("RegionError"),
     
     /* Number of requests exceeds the frequency limit. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The resource is occupied. */
     RESOURCEINUSE("ResourceInUse"),
     
     /* Insufficient resources. */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* Insufficient log analysis capacity */
     RESOURCEINSUFFICIENT_LOGANALYSISQUANTITYINSUFFICIENT("ResourceInsufficient.LogAnalysisQuantityInsufficient"),
     
     /* The resource does not exist. */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* Resources are unavailable. */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Resources are sold out. */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* Unauthorized operation. */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* Unauthorized operation on the "Operation Audit" product. */
     UNAUTHORIZEDOPERATION_CLOUDAUDIT("UnauthorizedOperation.CloudAudit"),
     
     /* Unauthorized operation on the "COS" product. */
     UNAUTHORIZEDOPERATION_COS("UnauthorizedOperation.Cos"),
     
     /* UnauthorizedOperation.NoPermission */
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
     /* Unknown parameter error. */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* The operation is not supported. */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private CsipErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

