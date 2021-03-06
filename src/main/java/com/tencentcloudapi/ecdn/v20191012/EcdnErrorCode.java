package com.tencentcloudapi.ecdn.v20191012;
public enum EcdnErrorCode {
    // Failed to update the domain name configuration. Please try again or contact customer service for assistance.
     FAILEDOPERATION_ECDNCONFIGERROR("FailedOperation.EcdnConfigError"),
     
    // Internal configuration service error. Please try again later or contact the customer service for assistance.
     INTERNALERROR_ECDNCONFIGERROR("InternalError.EcdnConfigError"),
     
    // Internal data error. Please submit a ticket for troubleshooting.
     INTERNALERROR_ECDNDBERROR("InternalError.EcdnDbError"),
     
    // System error. Please submit a ticket for troubleshooting.
     INTERNALERROR_ECDNSYSTEMERROR("InternalError.EcdnSystemError"),
     
    // The tag key does not exist.
     INVALIDPARAMETER_ECDNCAMTAGKEYNOTEXIST("InvalidParameter.EcdnCamTagKeyNotExist"),
     
    // Unable to resolve the certificate information.
     INVALIDPARAMETER_ECDNCERTNOCERTINFO("InvalidParameter.EcdnCertNoCertInfo"),
     
    // Invalid domain name status.
     INVALIDPARAMETER_ECDNDOMAININVALIDSTATUS("InvalidParameter.EcdnDomainInvalidStatus"),
     
    // Internal API error. Please submit a ticket for troubleshooting.
     INVALIDPARAMETER_ECDNINTERFACEERROR("InvalidParameter.EcdnInterfaceError"),
     
    // Invalid `Area` parameter. Please see the sample parameters in the documentation.
     INVALIDPARAMETER_ECDNINVALIDPARAMAREA("InvalidParameter.EcdnInvalidParamArea"),
     
    // Invalid statistical granularity. Please see the sample statistical analysis in the documentation.
     INVALIDPARAMETER_ECDNINVALIDPARAMINTERVAL("InvalidParameter.EcdnInvalidParamInterval"),
     
    // Parameter error. Please see the sample parameters in the documentation.
     INVALIDPARAMETER_ECDNPARAMERROR("InvalidParameter.EcdnParamError"),
     
    // Wildcard domain names are not supported for purging.
     INVALIDPARAMETER_ECDNPURGEWILDCARDNOTALLOWED("InvalidParameter.EcdnPurgeWildcardNotAllowed"),
     
    // This domain name binds too many tag keys.
     INVALIDPARAMETER_ECDNRESOURCEMANYTAGKEY("InvalidParameter.EcdnResourceManyTagKey"),
     
    // Invalid date. Please see the sample date in the documentation.
     INVALIDPARAMETER_ECDNSTATINVALIDDATE("InvalidParameter.EcdnStatInvalidDate"),
     
    // Invalid statistical type. Please see the sample statistical analysis in the documentation.
     INVALIDPARAMETER_ECDNSTATINVALIDMETRIC("InvalidParameter.EcdnStatInvalidMetric"),
     
    // Invalid tag key.
     INVALIDPARAMETER_ECDNTAGKEYINVALID("InvalidParameter.EcdnTagKeyInvalid"),
     
    // The tag key does not exist.
     INVALIDPARAMETER_ECDNTAGKEYNOTEXIST("InvalidParameter.EcdnTagKeyNotExist"),
     
    // The tag key has too many values.
     INVALIDPARAMETER_ECDNTAGKEYTOOMANYVALUE("InvalidParameter.EcdnTagKeyTooManyValue"),
     
    // Invalid tag value.
     INVALIDPARAMETER_ECDNTAGVALUEINVALID("InvalidParameter.EcdnTagValueInvalid"),
     
    // The URL length exceeds the limit.
     INVALIDPARAMETER_ECDNURLEXCEEDLENGTH("InvalidParameter.EcdnUrlExceedLength"),
     
    // This user has too many tag keys.
     INVALIDPARAMETER_ECDNUSERTOOMANYTAGKEY("InvalidParameter.EcdnUserTooManyTagKey"),
     
    // Parameter error
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
    // Domain name operations are too frequent.
     LIMITEXCEEDED_ECDNDOMAINOPTOOOFTEN("LimitExceeded.EcdnDomainOpTooOften"),
     
    // The number of directories to be purged exceeded the limit on one request.
     LIMITEXCEEDED_ECDNPURGEPATHEXCEEDBATCHLIMIT("LimitExceeded.EcdnPurgePathExceedBatchLimit"),
     
    // The number of directories to be purged exceeded the daily limit.
     LIMITEXCEEDED_ECDNPURGEPATHEXCEEDDAYLIMIT("LimitExceeded.EcdnPurgePathExceedDayLimit"),
     
    // The number of URLs to be purged exceeded the limit on one request.
     LIMITEXCEEDED_ECDNPURGEURLEXCEEDBATCHLIMIT("LimitExceeded.EcdnPurgeUrlExceedBatchLimit"),
     
    // The number of URLs to be purged exceeded the daily quota.
     LIMITEXCEEDED_ECDNPURGEURLEXCEEDDAYLIMIT("LimitExceeded.EcdnPurgeUrlExceedDayLimit"),
     
    // The ECDN resource is being manipulated.
     RESOURCEINUSE_ECDNOPINPROGRESS("ResourceInUse.EcdnOpInProgress"),
     
    // This domain name does not exist under the account. Please check and try again.
     RESOURCENOTFOUND_ECDNDOMAINNOTEXISTS("ResourceNotFound.EcdnDomainNotExists"),
     
    // This domain name does not exist under the account. Please check and try again.
     RESOURCENOTFOUND_ECDNHOSTNOTEXISTS("ResourceNotFound.EcdnHostNotExists"),
     
    // The project does not exist.
     RESOURCENOTFOUND_ECDNPROJECTNOTEXISTS("ResourceNotFound.EcdnProjectNotExists"),
     
    // The ECDN service has not been activated. Please activate it first before using this API.
     RESOURCENOTFOUND_ECDNUSERNOTEXISTS("ResourceNotFound.EcdnUserNotExists"),
     
    // The sub-account is unauthorized to query full data.
     UNAUTHORIZEDOPERATION_CDNACCOUNTUNAUTHORIZED("UnauthorizedOperation.CdnAccountUnauthorized"),
     
    // No CAM policy is configured for the sub-account.
     UNAUTHORIZEDOPERATION_CDNCAMUNAUTHORIZED("UnauthorizedOperation.CdnCamUnauthorized"),
     
    // The acceleration domain name is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_CDNDOMAINUNAUTHORIZED("UnauthorizedOperation.CdnDomainUnauthorized"),
     
    // The acceleration domain name is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_CDNHOSTUNAUTHORIZED("UnauthorizedOperation.CdnHostUnauthorized"),
     
    // The sub-account does not have the permission to access the domain name. Please try again after authorization.
     UNAUTHORIZEDOPERATION_CDNNODOMAINUNAUTHORIZED("UnauthorizedOperation.CdnNoDomainUnauthorized"),
     
    // The project is not authorized for the sub-account.
     UNAUTHORIZEDOPERATION_CDNPROJECTUNAUTHORIZED("UnauthorizedOperation.CdnProjectUnauthorized"),
     
    // The acceleration domain name is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_DOMAINNOPERMISSION("UnauthorizedOperation.DomainNoPermission"),
     
    // The acceleration domain name is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_DOMAINSNOPERMISSION("UnauthorizedOperation.DomainsNoPermission"),
     
    // The sub-account is unauthorized to query full data.
     UNAUTHORIZEDOPERATION_ECDNACCOUNTUNAUTHORIZED("UnauthorizedOperation.EcdnAccountUnauthorized"),
     
    // No CAM policy is configured for the sub-account.
     UNAUTHORIZEDOPERATION_ECDNCAMUNAUTHORIZED("UnauthorizedOperation.EcdnCamUnauthorized"),
     
    // The acceleration domain name is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_ECDNDOMAINUNAUTHORIZED("UnauthorizedOperation.EcdnDomainUnauthorized"),
     
    // The acceleration domain name is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_ECDNHOSTUNAUTHORIZED("UnauthorizedOperation.EcdnHostUnauthorized"),
     
    // The sub-account does not have the permission to access the domain name. Please try again after authorization.
     UNAUTHORIZEDOPERATION_ECDNNODOMAINUNAUTHORIZED("UnauthorizedOperation.EcdnNoDomainUnauthorized"),
     
    // The project is not authorized for the sub-account.
     UNAUTHORIZEDOPERATION_ECDNPROJECTUNAUTHORIZED("UnauthorizedOperation.EcdnProjectUnauthorized"),
     
    // The acceleration service has been suspended. Please restart it and try again.
     UNAUTHORIZEDOPERATION_ECDNUSERISSUSPENDED("UnauthorizedOperation.EcdnUserIsSuspended"),
     
    // You are not on the beta allowlist and thus have no permission to use this feature.
     UNAUTHORIZEDOPERATION_ECDNUSERNOWHITELIST("UnauthorizedOperation.EcdnUserNoWhitelist"),
     
    // CAM is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
    // The project is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_PROJECTNOPERMISSION("UnauthorizedOperation.ProjectNoPermission"),
     
    // The project is not authorized for the ECDN sub-account.
     UNAUTHORIZEDOPERATION_PROJECTSNOPERMISSION("UnauthorizedOperation.ProjectsNoPermission");
     
    private String value;
    private EcdnErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

