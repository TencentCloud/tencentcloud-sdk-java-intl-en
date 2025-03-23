package com.tencentcloudapi.teo.v20220106;
public enum TeoErrorCode {
    // DryRun operation, which means the DryRun parameter is passed in yet the request will still be successful.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The certificate does not exist.
     FAILEDOPERATION_CERTIFICATENOTFOUND("FailedOperation.CertificateNotFound"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Server error.
     INTERNALERROR_BACKENDERROR("InternalError.BackendError"),
     
    // Database error.
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // Failed to get configuration
     INTERNALERROR_DOMAINCONFIG("InternalError.DomainConfig"),
     
    // Failed to generate an upload link.
     INTERNALERROR_FAILEDTOGENERATEURL("InternalError.FailedToGenerateUrl"),
     
    // Failed to get the role.
     INTERNALERROR_GETROLEERROR("InternalError.GetRoleError"),
     
    // An unknown error occurred in the backend server.
     INTERNALERROR_PROXYSERVER("InternalError.ProxyServer"),
     
    // Server error.
     INTERNALERROR_QUOTASYSTEM("InternalError.QuotaSystem"),
     
    // The backend routing address is incorrect.
     INTERNALERROR_ROUTEERROR("InternalError.RouteError"),
     
    // Internal system error.
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // Parameter error.
     INVALIDPARAMETER("InvalidParameter"),
     
    // The domain name does not exist or is not belong to this account.
     INVALIDPARAMETER_DOMAINNOTFOUND("InvalidParameter.DomainNotFound"),
     
    // Invalid node cache.
     INVALIDPARAMETER_INVALIDCACHEONLYONSWITCH("InvalidParameter.InvalidCacheOnlyOnSwitch"),
     
    // Incorrect certificate information.
     INVALIDPARAMETER_INVALIDCERTINFO("InvalidParameter.InvalidCertInfo"),
     
    // Invalid client IP request header.
     INVALIDPARAMETER_INVALIDCLIENTIPHEADERNAME("InvalidParameter.InvalidClientIpHeaderName"),
     
    // The package does not support Smart Acceleration.
     INVALIDPARAMETER_INVALIDDYNAMICROUTINEBILLING("InvalidParameter.InvalidDynamicRoutineBilling"),
     
    // Invalid filter field.
     INVALIDPARAMETER_INVALIDFILTERNAME("InvalidParameter.InvalidFilterName"),
     
    // 
     INVALIDPARAMETER_INVALIDFORCEREDIRECTTYPE("InvalidParameter.InvalidForceRedirectType"),
     
    // Invalid origin server.
     INVALIDPARAMETER_INVALIDORIGIN("InvalidParameter.InvalidOrigin"),
     
    // The speciThe plan does not support limiting the max upload size.
     INVALIDPARAMETER_INVALIDPOSTMAXSIZEBILLING("InvalidParameter.InvalidPostMaxSizeBilling"),
     
    // Invalid POST request size.
     INVALIDPARAMETER_INVALIDPOSTSIZEVALUE("InvalidParameter.InvalidPostSizeValue"),
     
    // Invalid request header.
     INVALIDPARAMETER_INVALIDREQUESTHEADERNAME("InvalidParameter.InvalidRequestHeaderName"),
     
    // You have not purchased a plan yet.
     INVALIDPARAMETER_INVALIDRESOURCEIDBILLING("InvalidParameter.InvalidResourceIdBilling"),
     
    // Invalid WebSocket.
     INVALIDPARAMETER_INVALIDWEBSOCKETTIMEOUT("InvalidParameter.InvalidWebSocketTimeout"),
     
    // Parameter error.
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
    // Invalid parameter.
     INVALIDPARAMETER_SECURITY("InvalidParameter.Security"),
     
    // Configuration parameter error.
     INVALIDPARAMETER_SETTINGINVALIDPARAM("InvalidParameter.SettingInvalidParam"),
     
    // Resource error
     INVALIDPARAMETER_TARGET("InvalidParameter.Target"),
     
    // Failed to create the task
     INVALIDPARAMETER_TASKNOTGENERATED("InvalidParameter.TaskNotGenerated"),
     
    // Invalid file upload link.
     INVALIDPARAMETER_UPLOADURL("InvalidParameter.UploadUrl"),
     
    // The site does not exist.
     INVALIDPARAMETER_ZONENOTFOUND("InvalidParameter.ZoneNotFound"),
     
    // It conflicts with existing records.
     INVALIDPARAMETERVALUE_CONFLICTRECORD("InvalidParameterValue.ConflictRecord"),
     
    // DNS records conflict with DNSSEC.
     INVALIDPARAMETERVALUE_CONFLICTWITHDNSSEC("InvalidParameterValue.ConflictWithDNSSEC"),
     
    // This DNS record conflicts with CLB records.
     INVALIDPARAMETERVALUE_CONFLICTWITHLBRECORD("InvalidParameterValue.ConflictWithLBRecord"),
     
    // This DNS record conflicts with NS records.
     INVALIDPARAMETERVALUE_CONFLICTWITHNSRECORD("InvalidParameterValue.ConflictWithNSRecord"),
     
    // Incorrect DNS record
     INVALIDPARAMETERVALUE_INVALIDDNSCONTENT("InvalidParameterValue.InvalidDNSContent"),
     
    // Incorrect DNS CNAME
     INVALIDPARAMETERVALUE_INVALIDDNSNAME("InvalidParameterValue.InvalidDNSName"),
     
    // Incorrect DNS proxied domain name.
     INVALIDPARAMETERVALUE_INVALIDPROXYNAME("InvalidParameterValue.InvalidProxyName"),
     
    // Incorrect DNS proxy
     INVALIDPARAMETERVALUE_INVALIDPROXYORIGIN("InvalidParameterValue.InvalidProxyOrigin"),
     
    // 
     INVALIDPARAMETERVALUE_INVALIDSRVNAME("InvalidParameterValue.InvalidSRVName"),
     
    // This record already exists.
     INVALIDPARAMETERVALUE_RECORDALREADYEXISTS("InvalidParameterValue.RecordAlreadyExists"),
     
    // This record cannot be added.
     INVALIDPARAMETERVALUE_RECORDNOTALLOWED("InvalidParameterValue.RecordNotAllowed"),
     
    // The quota limit has been reached.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Reached the upper limit of resource number
     LIMITEXCEEDED_BATCHQUOTA("LimitExceeded.BatchQuota"),
     
    // Reached the daily upper limit of resource number
     LIMITEXCEEDED_DAILYQUOTA("LimitExceeded.DailyQuota"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The domain name doesn't have an ICP filing number.
     OPERATIONDENIED_DOMAINNOICP("OperationDenied.DomainNoICP"),
     
    // The resource is occupied.
     RESOURCEINUSE("ResourceInUse"),
     
    // The resource has been connected to EdgeOne by another user.
     RESOURCEINUSE_OTHERS("ResourceInUse.Others"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource doesn’t exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The certificate does not exist or is not authorized.
     RESOURCEUNAVAILABLE_CERTNOTFOUND("ResourceUnavailable.CertNotFound"),
     
    // The domain name does not exist or not use a proxy.
     RESOURCEUNAVAILABLE_HOSTNOTFOUND("ResourceUnavailable.HostNotFound"),
     
    // The site does not exist or is not belong to this account.
     RESOURCEUNAVAILABLE_ZONENOTFOUND("ResourceUnavailable.ZoneNotFound"),
     
    // CAM is not authorized.
     UNAUTHORIZEDOPERATION_CAMUNAUTHORIZED("UnauthorizedOperation.CamUnauthorized"),
     
    // Authentication error.
     UNAUTHORIZEDOPERATION_DOMAINEMPTY("UnauthorizedOperation.DomainEmpty"),
     
    // The sub-account is not authorized for the operation. Please get permissions first.
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission");
     
    private String value;
    private TeoErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

