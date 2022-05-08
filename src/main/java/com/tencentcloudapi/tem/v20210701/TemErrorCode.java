package com.tencentcloudapi.tem.v20210701;
public enum TemErrorCode {
    // Request timed out
     INTERNALERROR_ACTIONREADTIMEOUT("InternalError.ActionReadTimeout"),
     
    // Failed to create the APM resource
     INTERNALERROR_CREATEAPMRESOURCEERROR("InternalError.CreateApmResourceError"),
     
    // Failed to create the underlayer cluster
     INTERNALERROR_CREATEEKSCLUSTERERROR("InternalError.CreateEksClusterError"),
     
    // Failed to create the service.
     INTERNALERROR_CREATESERVICEERROR("InternalError.CreateServiceError"),
     
    // The server is busy. Retry later.
     INTERNALERROR_DEFAULTINTERNALERROR("InternalError.DefaultInternalError"),
     
    // Failed to invoke the version deployment
     INTERNALERROR_DEPLOYVERSIONERROR("InternalError.DeployVersionError"),
     
    // Failed to query the instance information
     INTERNALERROR_DESCRIBERUNPODLISTERROR("InternalError.DescribeRunPodListError"),
     
    // Failed to query the list of ingress associated with the service.
     INTERNALERROR_DESCRIBESERVICEINGRESSERROR("InternalError.DescribeServiceIngressError"),
     
    // Failed to restart
     INTERNALERROR_RESTARTAPPLICATIONERROR("InternalError.RestartApplicationError"),
     
    // Failed to update the ingress
     INTERNALERROR_UPDATEINGRESSERROR("InternalError.UpdateIngressError"),
     
    // 
     INVALIDPARAMETERVALUE_AUTOSCALERLARGERTHANONE("InvalidParameterValue.AutoScalerLargerThanOne"),
     
    // The version number is invalid.
     INVALIDPARAMETERVALUE_INVALIDDEPLOYVERSION("InvalidParameterValue.InvalidDeployVersion"),
     
    // The environment already exists.
     INVALIDPARAMETERVALUE_NAMESPACEDUPLICATEERROR("InvalidParameterValue.NamespaceDuplicateError"),
     
    // The namespace does not belong to the current account.
     INVALIDPARAMETERVALUE_NAMESPACENOTBELONGTOAPPID("InvalidParameterValue.NamespaceNotBelongToAppid"),
     
    // Failed to create the environment. The upper limit of environment is reached.
     INVALIDPARAMETERVALUE_NAMESPACEREACHMAXIMUM("InvalidParameterValue.NamespaceReachMaximum"),
     
    // Failed to create the environment. The upper limit of environment is reached.
     INVALIDPARAMETERVALUE_NAMESPACERESOURCEREACHMAXIMUM("InvalidParameterValue.NamespaceResourceReachMaximum"),
     
    // Linkage tracing is not available for non-JAVA applications.
     INVALIDPARAMETERVALUE_TRAITSTRACINGNOTSUPPORTED("InvalidParameterValue.TraitsTracingNotSupported"),
     
    // The version must be in lower case.
     INVALIDPARAMETERVALUE_VERSIONLOWERCASE("InvalidParameterValue.VersionLowerCase"),
     
    // The deployment version cannot be empty.
     MISSINGPARAMETER_DEPLOYVERSIONNULL("MissingParameter.DeployVersionNull"),
     
    // The environment ID can not be left empty.
     MISSINGPARAMETER_NAMESPACEIDNULL("MissingParameter.NamespaceIdNull"),
     
    // 
     MISSINGPARAMETER_PKGNAMENULL("MissingParameter.PkgNameNull"),
     
    // The service ID cannot be empty.
     MISSINGPARAMETER_SERVICEIDNULL("MissingParameter.ServiceIdNull"),
     
    // This resource is already bound.
     RESOURCEINUSE_RESOURCEALREADYUSED("ResourceInUse.ResourceAlreadyUsed"),
     
    // The target microservice is offline.
     RESOURCENOTFOUND_MICROSERVICEOFFLINE("ResourceNotFound.MicroserviceOffline"),
     
    // The environment does not exist.
     RESOURCENOTFOUND_NAMESPACENOTFOUND("ResourceNotFound.NamespaceNotFound"),
     
    // The application is not found.
     RESOURCENOTFOUND_SERVICENOTFOUND("ResourceNotFound.ServiceNotFound"),
     
    // No running pod is found.
     RESOURCENOTFOUND_SERVICERUNNINGVERSIONNOTFOUND("ResourceNotFound.ServiceRunningVersionNotFound"),
     
    // The environment corresponding to this version is not found.
     RESOURCENOTFOUND_VERSIONNAMESPACENOTFOUND("ResourceNotFound.VersionNamespaceNotFound"),
     
    // Waiting for the installation of addon
     RESOURCEUNAVAILABLE_WAITFORKRUISE("ResourceUnavailable.WaitForKruise");
     
    private String value;
    private TemErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

