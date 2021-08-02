package com.tencentcloudapi.apigateway.v20180808;
public enum ApigatewayErrorCode {
    // Error with CAM signature/authentication.
     AUTHFAILURE("AuthFailure"),
     
    // `DryRun` Operation. It means that the request would have succeeded, but the `DryRun` parameter was used.
     DRYRUNOPERATION("DryRunOperation"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The custom key already exists.
     FAILEDOPERATION_ACCESSKEYEXIST("FailedOperation.AccessKeyExist"),
     
    // This API has been bound with a usage plan.
     FAILEDOPERATION_APIBINDENVIRONMEN("FailedOperation.ApiBindEnvironmen"),
     
    // The APIs have already been bound to a usage plan. Please unbind them and try again.
     FAILEDOPERATION_APIBINDENVIRONMENT("FailedOperation.ApiBindEnvironment"),
     
    // API error.
     FAILEDOPERATION_APIERROR("FailedOperation.ApiError"),
     
    // The API is being manipulated. Please try again later.
     FAILEDOPERATION_APIINOPERATION("FailedOperation.ApiInOperation"),
     
    // An error occurred while binding a certificate.
     FAILEDOPERATION_CERTIFICATEIDBINDERROR("FailedOperation.CertificateIdBindError"),
     
    // The certificate is an enterprise certificate and waiting to be submitted.
     FAILEDOPERATION_CERTIFICATEIDENTERPRISEWAITSUBMIT("FailedOperation.CertificateIdEnterpriseWaitSubmit"),
     
    // The certificate does not exist or you do not have permission to view it. Please upload a valid certificate in the SSL Certificates Service Console.
     FAILEDOPERATION_CERTIFICATEIDERROR("FailedOperation.CertificateIdError"),
     
    // The certificate has expired. Please upload a valid one.
     FAILEDOPERATION_CERTIFICATEIDEXPIRED("FailedOperation.CertificateIdExpired"),
     
    // The certificate information is empty. Please submit a ticket for assistance.
     FAILEDOPERATION_CERTIFICATEIDINFOERROR("FailedOperation.CertificateIdInfoError"),
     
    // The certificate is under review. Please upload a valid one.
     FAILEDOPERATION_CERTIFICATEIDUNDERVERIFY("FailedOperation.CertificateIdUnderVerify"),
     
    // The certificate is in an unknown status. Please submit a ticket to check its specific status.
     FAILEDOPERATION_CERTIFICATEIDUNKNOWNERROR("FailedOperation.CertificateIdUnknownError"),
     
    // The certificate has been rejected. Please upload a valid one.
     FAILEDOPERATION_CERTIFICATEIDVERIFYFAIL("FailedOperation.CertificateIdVerifyFail"),
     
    // The Apis certificate is empty. Please upload a certificate.
     FAILEDOPERATION_CERTIFICATEISNULL("FailedOperation.CertificateIsNull"),
     
    // API document operation failed.
     FAILEDOPERATION_CODINGERROR("FailedOperation.CodingError"),
     
    // The Apis environment configuration is incorrect.
     FAILEDOPERATION_DEFINEMAPPINGENVIRONMENTERROR("FailedOperation.DefineMappingEnvironmentError"),
     
    // The Apis custom path mapping cannot be empty.
     FAILEDOPERATION_DEFINEMAPPINGNOTNULL("FailedOperation.DefineMappingNotNull"),
     
    // The Apis parameters are repeated.
     FAILEDOPERATION_DEFINEMAPPINGPARAMREPEAT("FailedOperation.DefineMappingParamRepeat"),
     
    // The Apis custom path configuration is incorrect.
     FAILEDOPERATION_DEFINEMAPPINGPATHERROR("FailedOperation.DefineMappingPathError"),
     
    // An error occurred while deleting the custom domain name.
     FAILEDOPERATION_DELETEPATHMAPPINGSETERROR("FailedOperation.DeletePathMappingSetError"),
     
    // The custom domain name of the service is incorrect.
     FAILEDOPERATION_DESCRIBESERVICESUBDOMAINSERROR("FailedOperation.DescribeServiceSubDomainsError"),
     
    // The domain name has been bound to another service.
     FAILEDOPERATION_DOMAINALREADYBINDOTHERSERVICE("FailedOperation.DomainAlreadyBindOtherService"),
     
    // The domain name has already been bound to this service.
     FAILEDOPERATION_DOMAINALREADYBINDSERVICE("FailedOperation.DomainAlreadyBindService"),
     
    // The domain name does not have an ICP filing through Tencent Cloud. Please get the ICP filing before binding the domain name.
     FAILEDOPERATION_DOMAINNEEDBEIAN("FailedOperation.DomainNeedBeian"),
     
    // Failed to unbind the custom domain name, as the domain name is not bound to the service.
     FAILEDOPERATION_DOMAINNOTBINDSERVICE("FailedOperation.DomainNotBindService"),
     
    // The domain name is not configured with a CNAME record resolving to the default domain name, or the resolution has not taken effect yet.
     FAILEDOPERATION_DOMAINRESOLVEERROR("FailedOperation.DomainResolveError"),
     
    // Failed to bind/unbind EventBridge.
     FAILEDOPERATION_EBERROR("FailedOperation.EbError"),
     
    // The domain name format is incorrect.
     FAILEDOPERATION_FORMATERROR("FailedOperation.FormatError"),
     
    // Failed to generate the API documentation.
     FAILEDOPERATION_GENERATEAPIDOCUMENTERROR("FailedOperation.GenerateApiDocumentError"),
     
    // Failed to get the role. Please make sure that relevant API Gateway service APIs have been authorized.
     FAILEDOPERATION_GETROLEERROR("FailedOperation.GetRoleError"),
     
    // The instance does not exist or is invalid.
     FAILEDOPERATION_INSTANCENOTEXIST("FailedOperation.InstanceNotExist"),
     
    // The Apis custom path conflicts with the default path.
     FAILEDOPERATION_ISDEFAULTMAPPING("FailedOperation.IsDefaultMapping"),
     
    // The entered default second-level domain name is incorrect.
     FAILEDOPERATION_NETSUBDOMAINERROR("FailedOperation.NetSubDomainError"),
     
    // An error occurred while setting the path mapping.
     FAILEDOPERATION_PATHMAPPINGSETERROR("FailedOperation.PathMappingSetError"),
     
    // Failed to bind/unbind SCF trigger.
     FAILEDOPERATION_SCFERROR("FailedOperation.ScfError"),
     
    // Service error.
     FAILEDOPERATION_SERVICEERROR("FailedOperation.ServiceError"),
     
    // The service does not exist.
     FAILEDOPERATION_SERVICENOTEXIST("FailedOperation.ServiceNotExist"),
     
    // The custom domain name already uses the default path mapping, so no custom path can be set.
     FAILEDOPERATION_SETCUSTOMPATHMAPPINGERROR("FailedOperation.SetCustomPathMappingError"),
     
    // The custom domain name format is incorrect.
     FAILEDOPERATION_SUBDOMAINFORMATERROR("FailedOperation.SubDomainFormatError"),
     
    // The tag was not bound to the specified service.
     FAILEDOPERATION_TAGBINDSERVICEERROR("FailedOperation.TagBindServiceError"),
     
    // The protocol type is incorrect.
     FAILEDOPERATION_UNKNOWNPROTOCOLTYPEERROR("FailedOperation.UnknownProtocolTypeError"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // API Gateway internal request error. Please try again later. If the problem persists, please contact the smart customer service or submit a ticket.
     INTERNALERROR_APIGWEXCEPTION("InternalError.ApigwException"),
     
    // OSS internal request error. Please try again. If the problem persists, please contact the smart customer service or submit a ticket.
     INTERNALERROR_OSSEXCEPTION("InternalError.OssException"),
     
    // SCF internal request error. Please try again. If the problem persists, please contact the smart customer service or submit a ticket.
     INTERNALERROR_SCFEXCEPTION("InternalError.ScfException"),
     
    // TSF internal request error. Please try again. If the problem persists, please contact the smart customer service or submit a ticket.
     INTERNALERROR_TSFEXCEPTION("InternalError.TsfException"),
     
    // VPC internal request error. Please try again. If the problem persists, please contact the smart customer service or submit a ticket.
     INTERNALERROR_VPCEXCEPTION("InternalError.VpcException"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter format.
     INVALIDPARAMETER_FORMATERROR("InvalidParameter.FormatError"),
     
    // The parameter value is incorrect.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Incorrect key.
     INVALIDPARAMETERVALUE_INVALIDACCESSKEYIDS("InvalidParameterValue.InvalidAccessKeyIds"),
     
    // The API business type passed in must be `OAUTH`.
     INVALIDPARAMETERVALUE_INVALIDAPIBUSINESSTYPE("InvalidParameterValue.InvalidApiBusinessType"),
     
    // 
     INVALIDPARAMETERVALUE_INVALIDAPIIDS("InvalidParameterValue.InvalidApiIds"),
     
    // Invalid API configuration.
     INVALIDPARAMETERVALUE_INVALIDAPIREQUESTCONFIG("InvalidParameterValue.InvalidApiRequestConfig"),
     
    // The API type is incorrect. The microservice API only supports the TSF backend service type.
     INVALIDPARAMETERVALUE_INVALIDAPITYPE("InvalidParameterValue.InvalidApiType"),
     
    // The backend service path configuration is incorrect.
     INVALIDPARAMETERVALUE_INVALIDBACKENDPATH("InvalidParameterValue.InvalidBackendPath"),
     
    // Invalid CLB configuration.
     INVALIDPARAMETERVALUE_INVALIDCLB("InvalidParameterValue.InvalidClb"),
     
    // The constant parameter is invalid.
     INVALIDPARAMETERVALUE_INVALIDCONSTANTPARAMETERS("InvalidParameterValue.InvalidConstantParameters"),
     
    // The parameter value is incorrect.
     INVALIDPARAMETERVALUE_INVALIDFILTERNOTSUPPORTEDNAME("InvalidParameterValue.InvalidFilterNotSupportedName"),
     
    // The `GenLanguage` parameter value is incorrect.
     INVALIDPARAMETERVALUE_INVALIDGENLANGUAGE("InvalidParameterValue.InvalidGenLanguage"),
     
    // The value of the backend address parameter is incorrect.
     INVALIDPARAMETERVALUE_INVALIDIPADDRESS("InvalidParameterValue.InvalidIPAddress"),
     
    // The method is incorrect. For backend services in the WEBSOCKET type, the frontend method should be configured as GET.
     INVALIDPARAMETERVALUE_INVALIDMETHOD("InvalidParameterValue.InvalidMethod"),
     
    // The backend service port is incorrect.
     INVALIDPARAMETERVALUE_INVALIDPORT("InvalidParameterValue.InvalidPort"),
     
    // Invalid protocol type parameter.
     INVALIDPARAMETERVALUE_INVALIDPROCOTOL("InvalidParameterValue.InvalidProcotol"),
     
    // The OAUTH 2.0 API public key parameter is in an incorrect format.
     INVALIDPARAMETERVALUE_INVALIDPUBLICKEY("InvalidParameterValue.InvalidPublicKey"),
     
    // Incorrect region.
     INVALIDPARAMETERVALUE_INVALIDREGION("InvalidParameterValue.InvalidRegion"),
     
    // Invalid request parameter.
     INVALIDPARAMETERVALUE_INVALIDREQUESTPARAMETERS("InvalidParameterValue.InvalidRequestParameters"),
     
    // The SCF API parameters are invalid.
     INVALIDPARAMETERVALUE_INVALIDSCFCONFIG("InvalidParameterValue.InvalidScfConfig"),
     
    // Invalid service configuration.
     INVALIDPARAMETERVALUE_INVALIDSERVICECONFIG("InvalidParameterValue.InvalidServiceConfig"),
     
    // The `ServiceMockReturnMessage` parameter is incorrect.
     INVALIDPARAMETERVALUE_INVALIDSERVICEMOCKRETURNMESSAGE("InvalidParameterValue.InvalidServiceMockReturnMessage"),
     
    // The parameter configuration is incorrect, as the parameter is not configured in the backend parameter configuration list.
     INVALIDPARAMETERVALUE_INVALIDSERVICEPARAM("InvalidParameterValue.InvalidServiceParam"),
     
    // The `ServiceParameters` parameter is incorrect.
     INVALIDPARAMETERVALUE_INVALIDSERVICEPARAMETERS("InvalidParameterValue.InvalidServiceParameters"),
     
    // The backend service type is incorrect. For backend services in WEBSOCKET type, the frontend protocol should be configured as WEBSOCKET.
     INVALIDPARAMETERVALUE_INVALIDSERVICETYPE("InvalidParameterValue.InvalidServiceType"),
     
    // 
     INVALIDPARAMETERVALUE_INVALIDTAGVALUES("InvalidParameterValue.InvalidTagValues"),
     
    // Incorrect configuration of the TSF-type API.
     INVALIDPARAMETERVALUE_INVALIDTSFCONFIG("InvalidParameterValue.InvalidTsfConfig"),
     
    // The URL parameters are invalid.
     INVALIDPARAMETERVALUE_INVALIDURL("InvalidParameterValue.InvalidUrl"),
     
    // The method is incorrect. For backend services in the WEBSOCKET type, the frontend method should be configured as GET.
     INVALIDPARAMETERVALUE_INVALIDWSMETHOD("InvalidParameterValue.InvalidWSMethod"),
     
    // The length of the parameter exceeds the limit.
     INVALIDPARAMETERVALUE_LENGTHEXCEEDED("InvalidParameterValue.LengthExceeded"),
     
    // The number of parameters has reached the limit (100).
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
    // The parameter value is incorrect, as it is not an available option.
     INVALIDPARAMETERVALUE_NOTINOPTIONS("InvalidParameterValue.NotInOptions"),
     
    // There are no modifiable items for the OAuth API.
     INVALIDPARAMETERVALUE_NOTHINGMODIFYFOROAUTH("InvalidParameterValue.NothingModifyForOauth"),
     
    // The backend parameter configuration is incorrect, as the related frontend parameters are not configured.
     INVALIDPARAMETERVALUE_PARAMETERNOTMATCH("InvalidParameterValue.ParameterNotMatch"),
     
    // The number of parameters exceeded limit.
     INVALIDPARAMETERVALUE_PARAMETERVALUELIMITEXCEEDED("InvalidParameterValue.ParameterValueLimitExceeded"),
     
    // The parameter value is incorrect, as it is not within the valid value range.
     INVALIDPARAMETERVALUE_RANGEEXCEEDED("InvalidParameterValue.RangeExceeded"),
     
    // The quota limit is exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // The number of API documents exceeds the limit.
     LIMITEXCEEDED_APIDOCLIMITEXCEEDED("LimitExceeded.APIDocLimitExceeded"),
     
    // The number of APIs exceeds the limit.
     LIMITEXCEEDED_APICOUNTLIMITEXCEEDED("LimitExceeded.ApiCountLimitExceeded"),
     
    // The number of keys exceeds the limit.
     LIMITEXCEEDED_APIKEYCOUNTLIMITEXCEEDED("LimitExceeded.ApiKeyCountLimitExceeded"),
     
    // You can set up to 3 sets of custom path mappings.
     LIMITEXCEEDED_EXCEEDEDDEFINEMAPPINGLIMIT("LimitExceeded.ExceededDefineMappingLimit"),
     
    // The number of bound domain names exceeds the limit. You can bind up to 5 domain names by default.
     LIMITEXCEEDED_EXCEEDEDDOMAINLIMIT("LimitExceeded.ExceededDomainLimit"),
     
    // The number of IP policies exceeds the limit.
     LIMITEXCEEDED_IPSTRATEGYLIMITEXCEEDED("LimitExceeded.IpStrategyLimitExceeded"),
     
    // The request frequency has reached the limit. Please try again later.
     LIMITEXCEEDED_REQUESTLIMITEXCEEDED("LimitExceeded.RequestLimitExceeded"),
     
    // The number of services exceeds the limit. Please delete some services or increase the limit and try again.
     LIMITEXCEEDED_SERVICECOUNTLIMITEXCEEDED("LimitExceeded.ServiceCountLimitExceeded"),
     
    // The number of usage plans exceeds the limit.
     LIMITEXCEEDED_USAGEPLANLIMITEXCEEDED("LimitExceeded.UsagePlanLimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // Operation denied.
     OPERATIONDENIED("OperationDenied"),
     
    // The number of requests exceeds the frequency limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // The resource is in use.
     RESOURCEINUSE("ResourceInUse"),
     
    // Insufficient resource.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The key does not exist.
     RESOURCENOTFOUND_INVALIDACCESSKEYID("ResourceNotFound.InvalidAccessKeyId"),
     
    // Incorrect `ApiId`.
     RESOURCENOTFOUND_INVALIDAPI("ResourceNotFound.InvalidApi"),
     
    // The API document does not exist.
     RESOURCENOTFOUND_INVALIDAPIDOC("ResourceNotFound.InvalidApiDoc"),
     
    // The IP policy does not exist.
     RESOURCENOTFOUND_INVALIDIPSTRATEGY("ResourceNotFound.InvalidIPStrategy"),
     
    // Error with the OAuth service API.
     RESOURCENOTFOUND_INVALIDOAUTHAPI("ResourceNotFound.InvalidOauthApi"),
     
    // The corresponding service is invisible.
     RESOURCENOTFOUND_INVALIDSERVICE("ResourceNotFound.InvalidService"),
     
    // The usage plan does not exist.
     RESOURCENOTFOUND_INVALIDUSAGEPLAN("ResourceNotFound.InvalidUsagePlan"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // The resources have been sold out.
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // The operation is unauthorized.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // You do not have permission to access the resource.
     UNAUTHORIZEDOPERATION_ACCESSRESOURCE("UnauthorizedOperation.AccessResource"),
     
    // The user has not passed identity verification.
     UNAUTHORIZEDOPERATION_UNCERTIFIEDUSER("UnauthorizedOperation.UncertifiedUser"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // The key has already been bound to a usage plan.
     UNSUPPORTEDOPERATION_ALREADYBINDUSAGEPLAN("UnsupportedOperation.AlreadyBindUsagePlan"),
     
    // Cannot force HTTPS when the protocol is HTTP.
     UNSUPPORTEDOPERATION_FORCEHTTPS("UnsupportedOperation.ForceHttps"),
     
    // API error.
     UNSUPPORTEDOPERATION_INVALIDACTION("UnsupportedOperation.InvalidAction"),
     
    // Backend type not supported
     UNSUPPORTEDOPERATION_INVALIDENDPOINTTYPE("UnsupportedOperation.InvalidEndpointType"),
     
    // The service is currently isolated and therefore the operation is not supported.
     UNSUPPORTEDOPERATION_INVALIDSERVICETRADE("UnsupportedOperation.InvalidServiceTrade"),
     
    // The current key status does not support this operation.
     UNSUPPORTEDOPERATION_INVALIDSTATUS("UnsupportedOperation.InvalidStatus"),
     
    // The frontend protocol type cannot be changed.
     UNSUPPORTEDOPERATION_MODIFYPROTOCOL("UnsupportedOperation.ModifyProtocol"),
     
    // The current usage plan is not bound to an environment.
     UNSUPPORTEDOPERATION_NOUSAGEPLANENV("UnsupportedOperation.NoUsagePlanEnv"),
     
    // Network types cannot be reduced.
     UNSUPPORTEDOPERATION_REDUCENETTYPES("UnsupportedOperation.ReduceNetTypes"),
     
    // The resource has been associated. Please disassociate it first.
     UNSUPPORTEDOPERATION_RESOURCEASSOCIATED("UnsupportedOperation.ResourceAssociated"),
     
    // The key has already been bound to a usage plan. Please unbind it and try again.
     UNSUPPORTEDOPERATION_RESOURCEISINUSE("UnsupportedOperation.ResourceIsInUse"),
     
    // The current `Uin` is not in the manual key allowlist.
     UNSUPPORTEDOPERATION_UINNOTINWHITELIST("UnsupportedOperation.UinNotInWhiteList"),
     
    // The key has already been bound to a usage plan.
     UNSUPPORTEDOPERATION_UNSUPPORTEDBINDAPIKEY("UnsupportedOperation.UnsupportedBindApiKey"),
     
    // The environment cannot be bound.
     UNSUPPORTEDOPERATION_UNSUPPORTEDBINDENVIRONMENT("UnsupportedOperation.UnsupportedBindEnvironment"),
     
    // This service is being used and cannot be deleted.
     UNSUPPORTEDOPERATION_UNSUPPORTEDDELETESERVICE("UnsupportedOperation.UnsupportedDeleteService"),
     
    // The environment cannot be unbound, as there are APIs that are not bound to a usage plan.
     UNSUPPORTEDOPERATION_UNSUPPORTEDUNBINDENVIRONMENT("UnsupportedOperation.UnsupportedUnBindEnvironment"),
     
    // The current key status does not support this operation.
     UNSUPPORTEDOPERATION_UNSUPPORTEDUPDATEAPIKEY("UnsupportedOperation.UnsupportedUpdateApiKey"),
     
    // The current plan is in use. Please unbind it and try again.
     UNSUPPORTEDOPERATION_USAGEPLANINUSE("UnsupportedOperation.UsagePlanInUse");
     
    private String value;
    private ApigatewayErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}
