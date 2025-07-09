/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.apigateway.v20180808;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apigateway.v20180808.models.*;

public class ApigatewayClient extends AbstractClient{
    private static String endpoint = "apigateway.intl.tencentcloudapi.com";
    private static String service = "apigateway";
    private static String version = "2018-08-08";

    public ApigatewayClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApigatewayClient(Credential credential, String region, ClientProfile profile) {
        super(ApigatewayClient.endpoint, ApigatewayClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind a plugin to an API.
     * @param req AttachPluginRequest
     * @return AttachPluginResponse
     * @throws TencentCloudSDKException
     */
    public AttachPluginResponse AttachPlugin(AttachPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachPlugin", AttachPluginResponse.class);
    }

    /**
     *This API is used to bind an application to an API.
     * @param req BindApiAppRequest
     * @return BindApiAppResponse
     * @throws TencentCloudSDKException
     */
    public BindApiAppResponse BindApiApp(BindApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindApiApp", BindApiAppResponse.class);
    }

    /**
     *This API is used to bind a usage plan to a service or API.
After you publish a service to an environment, if the API requires authentication and can be called only when it is bound to a usage plan, you can use this API to bind a usage plan to the specified environment.
Currently, a usage plan can be bound to an API; however, under the same service, usage plans bound to a service and usage plans bound to an API cannot coexist. Therefore, in an environment to which a service-level usage plan has already been bound, please use the `DemoteServiceUsagePlan` API to degrade it.
     * @param req BindEnvironmentRequest
     * @return BindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public BindEnvironmentResponse BindEnvironment(BindEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindEnvironment", BindEnvironmentResponse.class);
    }

    /**
     *This API is used to bind an IP policy to an API.
     * @param req BindIPStrategyRequest
     * @return BindIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public BindIPStrategyResponse BindIPStrategy(BindIPStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindIPStrategy", BindIPStrategyResponse.class);
    }

    /**
     *This API is used to bind a key to a usage plan.
You can bind a key to a usage plan and bind the usage plan to an environment where a service is published, so that callers can use the key to call APIs in the service. You can use this API to bind a key to a usage plan.
     * @param req BindSecretIdsRequest
     * @return BindSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public BindSecretIdsResponse BindSecretIds(BindSecretIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSecretIds", BindSecretIdsResponse.class);
    }

    /**
     *This API is used to bind a custom domain name to a service.
Each service in API Gateway provides a default domain name for users to call. If you want to use your own domain name, you can bind a custom domain name to the target service. After getting the ICP filing and configuring the CNAME record between the custom and default domain names, you can directly call the custom domain name.
     * @param req BindSubDomainRequest
     * @return BindSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public BindSubDomainResponse BindSubDomain(BindSubDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSubDomain", BindSubDomainResponse.class);
    }

    /**
     *This API is used to build an API document.
     * @param req BuildAPIDocRequest
     * @return BuildAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public BuildAPIDocResponse BuildAPIDoc(BuildAPIDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BuildAPIDoc", BuildAPIDocResponse.class);
    }

    /**
     *This API is used to create an API document.
     * @param req CreateAPIDocRequest
     * @return CreateAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public CreateAPIDocResponse CreateAPIDoc(CreateAPIDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAPIDoc", CreateAPIDocResponse.class);
    }

    /**
     *This API is used to create an API. Before creating an API, you need to create a service, as each API belongs to a certain service.
     * @param req CreateApiRequest
     * @return CreateApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiResponse CreateApi(CreateApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApi", CreateApiResponse.class);
    }

    /**
     *This API is used to create an application.
     * @param req CreateApiAppRequest
     * @return CreateApiAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiAppResponse CreateApiApp(CreateApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiApp", CreateApiAppResponse.class);
    }

    /**
     *This API is used to create an API key pair.
     * @param req CreateApiKeyRequest
     * @return CreateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiKeyResponse CreateApiKey(CreateApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiKey", CreateApiKeyResponse.class);
    }

    /**
     *This API is used to create a service IP policy.
     * @param req CreateIPStrategyRequest
     * @return CreateIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateIPStrategyResponse CreateIPStrategy(CreateIPStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIPStrategy", CreateIPStrategyResponse.class);
    }

    /**
     *This API is used to create an API Gateway plugin.
     * @param req CreatePluginRequest
     * @return CreatePluginResponse
     * @throws TencentCloudSDKException
     */
    public CreatePluginResponse CreatePlugin(CreatePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlugin", CreatePluginResponse.class);
    }

    /**
     *This API is used to create a service.
A service is the biggest usage unit in API Gateway. Each service can contain multiple APIs and one default domain name for invocation. You can also bind your own custom domain name to a service. 
     * @param req CreateServiceRequest
     * @return CreateServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceResponse CreateService(CreateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateService", CreateServiceResponse.class);
    }

    /**
     *This API is used to create an upstream.
     * @param req CreateUpstreamRequest
     * @return CreateUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public CreateUpstreamResponse CreateUpstream(CreateUpstreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUpstream", CreateUpstreamResponse.class);
    }

    /**
     *This API is used to create a usage plan.
To use API Gateway, you need to create a usage plan and bind it to a service environment.
     * @param req CreateUsagePlanRequest
     * @return CreateUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsagePlanResponse CreateUsagePlan(CreateUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUsagePlan", CreateUsagePlanResponse.class);
    }

    /**
     *This API is used to delete an API document.
     * @param req DeleteAPIDocRequest
     * @return DeleteAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAPIDocResponse DeleteAPIDoc(DeleteAPIDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAPIDoc", DeleteAPIDocResponse.class);
    }

    /**
     *This API is used to delete a created API.
     * @param req DeleteApiRequest
     * @return DeleteApiResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiResponse DeleteApi(DeleteApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApi", DeleteApiResponse.class);
    }

    /**
     *This API is used to delete a created application.
     * @param req DeleteApiAppRequest
     * @return DeleteApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiAppResponse DeleteApiApp(DeleteApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApiApp", DeleteApiAppResponse.class);
    }

    /**
     *This API is used to delete an API key pair.
     * @param req DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiKeyResponse DeleteApiKey(DeleteApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApiKey", DeleteApiKeyResponse.class);
    }

    /**
     *This API is used to delete a service IP policy.
     * @param req DeleteIPStrategyRequest
     * @return DeleteIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIPStrategyResponse DeleteIPStrategy(DeleteIPStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIPStrategy", DeleteIPStrategyResponse.class);
    }

    /**
     *This API is used to delete an API Gateway plugin.
     * @param req DeletePluginRequest
     * @return DeletePluginResponse
     * @throws TencentCloudSDKException
     */
    public DeletePluginResponse DeletePlugin(DeletePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePlugin", DeletePluginResponse.class);
    }

    /**
     *This API is used to delete a service in API Gateway.
     * @param req DeleteServiceRequest
     * @return DeleteServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceResponse DeleteService(DeleteServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteService", DeleteServiceResponse.class);
    }

    /**
     *This API is used to delete a custom domain name mapping in a service environment.
You can use this API if you use a custom domain name and custom mapping. Please note that if you delete all mappings in all environments, a failure will be returned when this API is called.
     * @param req DeleteServiceSubDomainMappingRequest
     * @return DeleteServiceSubDomainMappingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceSubDomainMappingResponse DeleteServiceSubDomainMapping(DeleteServiceSubDomainMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceSubDomainMapping", DeleteServiceSubDomainMappingResponse.class);
    }

    /**
     *This API is used to delete an upstream. Note that you can only delete an upstream when it’s not bound with any APIs.
     * @param req DeleteUpstreamRequest
     * @return DeleteUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUpstreamResponse DeleteUpstream(DeleteUpstreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUpstream", DeleteUpstreamResponse.class);
    }

    /**
     *This API is used to delete a usage plan.
     * @param req DeleteUsagePlanRequest
     * @return DeleteUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsagePlanResponse DeleteUsagePlan(DeleteUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsagePlan", DeleteUsagePlanResponse.class);
    }

    /**
     *This API is used to degrade a usage plan of a service in an environment to the API level.
This operation will be denied if there are no APIs under the service.
This operation will also be denied if the current environment has not been published.
     * @param req DemoteServiceUsagePlanRequest
     * @return DemoteServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DemoteServiceUsagePlanResponse DemoteServiceUsagePlan(DemoteServiceUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DemoteServiceUsagePlan", DemoteServiceUsagePlanResponse.class);
    }

    /**
     *This API is used to query the details of an API document.
     * @param req DescribeAPIDocDetailRequest
     * @return DescribeAPIDocDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIDocDetailResponse DescribeAPIDocDetail(DescribeAPIDocDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPIDocDetail", DescribeAPIDocDetailResponse.class);
    }

    /**
     *This API is used to query the list of API documents.
     * @param req DescribeAPIDocsRequest
     * @return DescribeAPIDocsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIDocsResponse DescribeAPIDocs(DescribeAPIDocsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPIDocs", DescribeAPIDocsResponse.class);
    }

    /**
     *This API is used to list all APIs that can use this plugin, no matter whether the API is bound with the plugin.
     * @param req DescribeAllPluginApisRequest
     * @return DescribeAllPluginApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllPluginApisResponse DescribeAllPluginApis(DescribeAllPluginApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllPluginApis", DescribeAllPluginApisResponse.class);
    }

    /**
     *This API (`DescribeApi`) is used to query the details of the APIs users manage via Tencent Cloud API Gateway.
     * @param req DescribeApiRequest
     * @return DescribeApiResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiResponse DescribeApi(DescribeApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApi", DescribeApiResponse.class);
    }

    /**
     *This API is used to search for an application by application ID.
     * @param req DescribeApiAppRequest
     * @return DescribeApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAppResponse DescribeApiApp(DescribeApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiApp", DescribeApiAppResponse.class);
    }

    /**
     *This API is used to query the list of APIs bound to an application.
     * @param req DescribeApiAppBindApisStatusRequest
     * @return DescribeApiAppBindApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAppBindApisStatusResponse DescribeApiAppBindApisStatus(DescribeApiAppBindApisStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiAppBindApisStatus", DescribeApiAppBindApisStatusResponse.class);
    }

    /**
     *This API is used to query the application list.
     * @param req DescribeApiAppsStatusRequest
     * @return DescribeApiAppsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAppsStatusResponse DescribeApiAppsStatus(DescribeApiAppsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiAppsStatus", DescribeApiAppsStatusResponse.class);
    }

    /**
     *This API is used to query the list of applications bound to an API.
     * @param req DescribeApiBindApiAppsStatusRequest
     * @return DescribeApiBindApiAppsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiBindApiAppsStatusResponse DescribeApiBindApiAppsStatus(DescribeApiBindApiAppsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiBindApiAppsStatus", DescribeApiBindApiAppsStatusResponse.class);
    }

    /**
     *This API is used to display the throttling policies bound to an API.
     * @param req DescribeApiEnvironmentStrategyRequest
     * @return DescribeApiEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiEnvironmentStrategyResponse DescribeApiEnvironmentStrategy(DescribeApiEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiEnvironmentStrategy", DescribeApiEnvironmentStrategyResponse.class);
    }

    /**
     *This API is used to query the details of an API deployed at API Gateway.
     * @param req DescribeApiForApiAppRequest
     * @return DescribeApiForApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiForApiAppResponse DescribeApiForApiApp(DescribeApiForApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiForApiApp", DescribeApiForApiAppResponse.class);
    }

    /**
     *This API is used to query the details of a key.
After creating an API key, you can query its details by using this API.
     * @param req DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyResponse DescribeApiKey(DescribeApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiKey", DescribeApiKeyResponse.class);
    }

    /**
     *This API is used to query the information of one or more API keys.
     * @param req DescribeApiKeysStatusRequest
     * @return DescribeApiKeysStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeysStatusResponse DescribeApiKeysStatus(DescribeApiKeysStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiKeysStatus", DescribeApiKeysStatusResponse.class);
    }

    /**
     *This API is used to query the details of API usage plans in a service.
To make authentication and throttling for a service take effect, you need to bind a usage plan to it. This API is used to query all usage plans bound to a service and APIs under it.
     * @param req DescribeApiUsagePlanRequest
     * @return DescribeApiUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiUsagePlanResponse DescribeApiUsagePlan(DescribeApiUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiUsagePlan", DescribeApiUsagePlanResponse.class);
    }

    /**
     *This API is used to view a certain API or the list of all APIs under a service and relevant information.
     * @param req DescribeApisStatusRequest
     * @return DescribeApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApisStatusResponse DescribeApisStatus(DescribeApisStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApisStatus", DescribeApisStatusResponse.class);
    }

    /**
     *Get the list of supported regions for dedicated instances
     * @param req DescribeExclusiveInstanceRegionsRequest
     * @return DescribeExclusiveInstanceRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExclusiveInstanceRegionsResponse DescribeExclusiveInstanceRegions(DescribeExclusiveInstanceRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExclusiveInstanceRegions", DescribeExclusiveInstanceRegionsResponse.class);
    }

    /**
     *This API is used to query IP policy details.
     * @param req DescribeIPStrategyRequest
     * @return DescribeIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategyResponse DescribeIPStrategy(DescribeIPStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPStrategy", DescribeIPStrategyResponse.class);
    }

    /**
     *This API is used to query the list of APIs to which an IP policy can be bound, i.e., the difference set between all APIs under the service and the APIs already bound to the policy.
     * @param req DescribeIPStrategyApisStatusRequest
     * @return DescribeIPStrategyApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategyApisStatusResponse DescribeIPStrategyApisStatus(DescribeIPStrategyApisStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPStrategyApisStatus", DescribeIPStrategyApisStatusResponse.class);
    }

    /**
     *This API is used to query the list of service IP policies.
     * @param req DescribeIPStrategysStatusRequest
     * @return DescribeIPStrategysStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategysStatusResponse DescribeIPStrategysStatus(DescribeIPStrategysStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPStrategysStatus", DescribeIPStrategysStatusResponse.class);
    }

    /**
     *This API is used to obtain the network configuration list of a dedicated instance.
     * @param req DescribeInstancesNetworkConfigRequest
     * @return DescribeInstancesNetworkConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesNetworkConfigResponse DescribeInstancesNetworkConfig(DescribeInstancesNetworkConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesNetworkConfig", DescribeInstancesNetworkConfigResponse.class);
    }

    /**
     *This API is used to search for logs.
     * @param req DescribeLogSearchRequest
     * @return DescribeLogSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSearchResponse DescribeLogSearch(DescribeLogSearchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogSearch", DescribeLogSearchResponse.class);
    }

    /**
     *This API is used to query the plugin details by plugin ID.
     * @param req DescribePluginRequest
     * @return DescribePluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginResponse DescribePlugin(DescribePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlugin", DescribePluginResponse.class);
    }

    /**
     *This API is used to query APIs bound with a specified plugin.
     * @param req DescribePluginApisRequest
     * @return DescribePluginApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginApisResponse DescribePluginApis(DescribePluginApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePluginApis", DescribePluginApisResponse.class);
    }

    /**
     *This API is used to query all plug-ins bound with the API.
     * @param req DescribePluginsByApiRequest
     * @return DescribePluginsByApiResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginsByApiResponse DescribePluginsByApi(DescribePluginsByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePluginsByApi", DescribePluginsByApiResponse.class);
    }

    /**
     *This API is used to query the details of a service, such as its description, domain name, protocol, creation time, and releases.
     * @param req DescribeServiceRequest
     * @return DescribeServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceResponse DescribeService(DescribeServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeService", DescribeServiceResponse.class);
    }

    /**
     *This API is used to query the list of environments under a service. All environments and their statuses under the queried service will be returned.
     * @param req DescribeServiceEnvironmentListRequest
     * @return DescribeServiceEnvironmentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentListResponse DescribeServiceEnvironmentList(DescribeServiceEnvironmentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceEnvironmentList", DescribeServiceEnvironmentListResponse.class);
    }

    /**
     *This API is used to query the release history in a service environment.
A service can only be used when it is published to an environment after creation. This API is used to query the release history in an environment under a service.
     * @param req DescribeServiceEnvironmentReleaseHistoryRequest
     * @return DescribeServiceEnvironmentReleaseHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentReleaseHistoryResponse DescribeServiceEnvironmentReleaseHistory(DescribeServiceEnvironmentReleaseHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceEnvironmentReleaseHistory", DescribeServiceEnvironmentReleaseHistoryResponse.class);
    }

    /**
     *This API is used to display a service throttling policy.
     * @param req DescribeServiceEnvironmentStrategyRequest
     * @return DescribeServiceEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentStrategyResponse DescribeServiceEnvironmentStrategy(DescribeServiceEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceEnvironmentStrategy", DescribeServiceEnvironmentStrategyResponse.class);
    }

    /**
     *This API is used to query the details of a service, such as its description, domain name, and protocol.
     * @param req DescribeServiceForApiAppRequest
     * @return DescribeServiceForApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceForApiAppResponse DescribeServiceForApiApp(DescribeServiceForApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceForApiApp", DescribeServiceForApiAppResponse.class);
    }

    /**
     *This API is used to query the list of all published versions under a service.
A service is generally published on several versions. This API can be used to query the published versions.
     * @param req DescribeServiceReleaseVersionRequest
     * @return DescribeServiceReleaseVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceReleaseVersionResponse DescribeServiceReleaseVersion(DescribeServiceReleaseVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceReleaseVersion", DescribeServiceReleaseVersionResponse.class);
    }

    /**
     *This API is used to query the path mappings of a custom domain name.
In API Gateway, you can bind a custom domain name to a service and map its paths. You can customize different path mappings to up to 3 environments under the service. This API is used to query the list of path mappings of a custom domain name bound to a service.
     * @param req DescribeServiceSubDomainMappingsRequest
     * @return DescribeServiceSubDomainMappingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceSubDomainMappingsResponse DescribeServiceSubDomainMappings(DescribeServiceSubDomainMappingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceSubDomainMappings", DescribeServiceSubDomainMappingsResponse.class);
    }

    /**
     *This API is used to query the list of custom domain names.
In API Gateway, you can bind custom domain names to a service for service call. This API is used to query the list of custom domain names bound to a service.
     * @param req DescribeServiceSubDomainsRequest
     * @return DescribeServiceSubDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceSubDomainsResponse DescribeServiceSubDomains(DescribeServiceSubDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceSubDomains", DescribeServiceSubDomainsResponse.class);
    }

    /**
     *This API is used to query the details of usage plans in a service.
To make authentication and throttling for a service take effect, you need to bind a usage plan to it. This API is used to query all usage plans bound to a service.
     * @param req DescribeServiceUsagePlanRequest
     * @return DescribeServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceUsagePlanResponse DescribeServiceUsagePlan(DescribeServiceUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceUsagePlan", DescribeServiceUsagePlanResponse.class);
    }

    /**
     *This API is used to query the list of one or more services and return relevant domain name, time, and other information.
     * @param req DescribeServicesStatusRequest
     * @return DescribeServicesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServicesStatusResponse DescribeServicesStatus(DescribeServicesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServicesStatus", DescribeServicesStatusResponse.class);
    }

    /**
     *This API is used to query APIs bound with an upstream.
     * @param req DescribeUpstreamBindApisRequest
     * @return DescribeUpstreamBindApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpstreamBindApisResponse DescribeUpstreamBindApis(DescribeUpstreamBindApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpstreamBindApis", DescribeUpstreamBindApisResponse.class);
    }

    /**
     *This API is used to query details of upstreams under the current account.
     * @param req DescribeUpstreamsRequest
     * @return DescribeUpstreamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpstreamsResponse DescribeUpstreams(DescribeUpstreamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpstreams", DescribeUpstreamsResponse.class);
    }

    /**
     *This API is used to query the details of a usage plan, such as its name, QPS, creation time, and bound environment.
     * @param req DescribeUsagePlanRequest
     * @return DescribeUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanResponse DescribeUsagePlan(DescribeUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsagePlan", DescribeUsagePlanResponse.class);
    }

    /**
     *This API is used to query the list of environments bound to a usage plan.
After binding a usage plan to environments, you can use this API to query all service environments bound to the usage plan.
     * @param req DescribeUsagePlanEnvironmentsRequest
     * @return DescribeUsagePlanEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanEnvironmentsResponse DescribeUsagePlanEnvironments(DescribeUsagePlanEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsagePlanEnvironments", DescribeUsagePlanEnvironmentsResponse.class);
    }

    /**
     *This API is used to query the list of keys bound to a usage plan.
In API Gateway, a usage plan can be bound to multiple key pairs. You can use this API to query the list of keys bound to it.
     * @param req DescribeUsagePlanSecretIdsRequest
     * @return DescribeUsagePlanSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanSecretIdsResponse DescribeUsagePlanSecretIds(DescribeUsagePlanSecretIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsagePlanSecretIds", DescribeUsagePlanSecretIdsResponse.class);
    }

    /**
     *This API is used to query the list of usage plans.
     * @param req DescribeUsagePlansStatusRequest
     * @return DescribeUsagePlansStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlansStatusResponse DescribeUsagePlansStatus(DescribeUsagePlansStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsagePlansStatus", DescribeUsagePlansStatusResponse.class);
    }

    /**
     *This API is used to unbind an API from the plugin.
     * @param req DetachPluginRequest
     * @return DetachPluginResponse
     * @throws TencentCloudSDKException
     */
    public DetachPluginResponse DetachPlugin(DetachPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachPlugin", DetachPluginResponse.class);
    }

    /**
     *This API is used to disable an API key.
     * @param req DisableApiKeyRequest
     * @return DisableApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableApiKeyResponse DisableApiKey(DisableApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableApiKey", DisableApiKeyResponse.class);
    }

    /**
     *This API is used to enable a disabled API key.
     * @param req EnableApiKeyRequest
     * @return EnableApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableApiKeyResponse EnableApiKey(EnableApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableApiKey", EnableApiKeyResponse.class);
    }

    /**
     *This API is used to import an OpenAPI to API gateway. 
     * @param req ImportOpenApiRequest
     * @return ImportOpenApiResponse
     * @throws TencentCloudSDKException
     */
    public ImportOpenApiResponse ImportOpenApi(ImportOpenApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportOpenApi", ImportOpenApiResponse.class);
    }

    /**
     *This API is used to modify an API document.
     * @param req ModifyAPIDocRequest
     * @return ModifyAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAPIDocResponse ModifyAPIDoc(ModifyAPIDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAPIDoc", ModifyAPIDocResponse.class);
    }

    /**
     *This API is used to modify an API. You can call this API to edit/modify a configured API. The modified API takes effect only after its service is published to the corresponding environment again.
     * @param req ModifyApiRequest
     * @return ModifyApiResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiResponse ModifyApi(ModifyApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApi", ModifyApiResponse.class);
    }

    /**
     *This API is used to modify a created API.
     * @param req ModifyApiAppRequest
     * @return ModifyApiAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiAppResponse ModifyApiApp(ModifyApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiApp", ModifyApiAppResponse.class);
    }

    /**
     *This API is used to modify an API throttling policy.
     * @param req ModifyApiEnvironmentStrategyRequest
     * @return ModifyApiEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiEnvironmentStrategyResponse ModifyApiEnvironmentStrategy(ModifyApiEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiEnvironmentStrategy", ModifyApiEnvironmentStrategyResponse.class);
    }

    /**
     *This API is used to incrementally update an API and mainly called by programs (different from `ModifyApi`, which requires that full API parameters be passed in and is suitable for use in the console).
     * @param req ModifyApiIncrementRequest
     * @return ModifyApiIncrementResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiIncrementResponse ModifyApiIncrement(ModifyApiIncrementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiIncrement", ModifyApiIncrementResponse.class);
    }

    /**
     *This API is used to modify a service IP policy.
     * @param req ModifyIPStrategyRequest
     * @return ModifyIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIPStrategyResponse ModifyIPStrategy(ModifyIPStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIPStrategy", ModifyIPStrategyResponse.class);
    }

    /**
     *This API is used to modify a plugin.
     * @param req ModifyPluginRequest
     * @return ModifyPluginResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPluginResponse ModifyPlugin(ModifyPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlugin", ModifyPluginResponse.class);
    }

    /**
     *This API is used to modify the relevant information of a service. After a service is created, its name, description, and service type can be modified.
     * @param req ModifyServiceRequest
     * @return ModifyServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceResponse ModifyService(ModifyServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyService", ModifyServiceResponse.class);
    }

    /**
     *This API is used to modify a service throttling policy.
     * @param req ModifyServiceEnvironmentStrategyRequest
     * @return ModifyServiceEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceEnvironmentStrategyResponse ModifyServiceEnvironmentStrategy(ModifyServiceEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceEnvironmentStrategy", ModifyServiceEnvironmentStrategyResponse.class);
    }

    /**
     *This API is used to modify the path mapping in the custom domain name settings of a service. The path mapping rule can be modified before it is bound to the custom domain name.
     * @param req ModifySubDomainRequest
     * @return ModifySubDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubDomainResponse ModifySubDomain(ModifySubDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubDomain", ModifySubDomainResponse.class);
    }

    /**
     *This API is used to modify an upstream.
     * @param req ModifyUpstreamRequest
     * @return ModifyUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUpstreamResponse ModifyUpstream(ModifyUpstreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUpstream", ModifyUpstreamResponse.class);
    }

    /**
     *This API is used to modify the name, description, and QPS of a usage plan.
     * @param req ModifyUsagePlanRequest
     * @return ModifyUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsagePlanResponse ModifyUsagePlan(ModifyUsagePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUsagePlan", ModifyUsagePlanResponse.class);
    }

    /**
     *This API is used to publish a service.
An API Gateway service can only be called when it is published to an environment and takes effect after creation. This API is used to publish a service to an environment such as the `release` environment.
     * @param req ReleaseServiceRequest
     * @return ReleaseServiceResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseServiceResponse ReleaseService(ReleaseServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseService", ReleaseServiceResponse.class);
    }

    /**
     *This API is used to reset the password of an API document.
     * @param req ResetAPIDocPasswordRequest
     * @return ResetAPIDocPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAPIDocPasswordResponse ResetAPIDocPassword(ResetAPIDocPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAPIDocPassword", ResetAPIDocPasswordResponse.class);
    }

    /**
     *This API is used to unbind a usage plan from a specified environment.
     * @param req UnBindEnvironmentRequest
     * @return UnBindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public UnBindEnvironmentResponse UnBindEnvironment(UnBindEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindEnvironment", UnBindEnvironmentResponse.class);
    }

    /**
     *This API is used to unbind an IP policy from a service.
     * @param req UnBindIPStrategyRequest
     * @return UnBindIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UnBindIPStrategyResponse UnBindIPStrategy(UnBindIPStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindIPStrategy", UnBindIPStrategyResponse.class);
    }

    /**
     *This API is used to unbind a key from a usage plan.
     * @param req UnBindSecretIdsRequest
     * @return UnBindSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public UnBindSecretIdsResponse UnBindSecretIds(UnBindSecretIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindSecretIds", UnBindSecretIdsResponse.class);
    }

    /**
     *This API is used to unbind a custom domain name.
After binding a custom domain name to a service by using API Gateway, you can use this API to unbind it.
     * @param req UnBindSubDomainRequest
     * @return UnBindSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public UnBindSubDomainResponse UnBindSubDomain(UnBindSubDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindSubDomain", UnBindSubDomainResponse.class);
    }

    /**
     *This API is used to deactivate a service.
Only after a service is published to an environment can its APIs be called. You can call this API to deactivate a service in the release environment. Once deactivated, the service cannot be called.
     * @param req UnReleaseServiceRequest
     * @return UnReleaseServiceResponse
     * @throws TencentCloudSDKException
     */
    public UnReleaseServiceResponse UnReleaseService(UnReleaseServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnReleaseService", UnReleaseServiceResponse.class);
    }

    /**
     *This API is used to unbind an application from an API.
     * @param req UnbindApiAppRequest
     * @return UnbindApiAppResponse
     * @throws TencentCloudSDKException
     */
    public UnbindApiAppResponse UnbindApiApp(UnbindApiAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindApiApp", UnbindApiAppResponse.class);
    }

    /**
     *This API is used to update an application key.
     * @param req UpdateApiAppKeyRequest
     * @return UpdateApiAppKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiAppKeyResponse UpdateApiAppKey(UpdateApiAppKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApiAppKey", UpdateApiAppKeyResponse.class);
    }

    /**
     *This API is used to update a created API key pair.
     * @param req UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApiKey", UpdateApiKeyResponse.class);
    }

    /**
     *This API is used to switch the running version of a service published in an environment to a specified version. After you create a service by using API Gateway and publish it to an environment, multiple versions will be generated during development. In this case, you can call this API to switch versions.
     * @param req UpdateServiceRequest
     * @return UpdateServiceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServiceResponse UpdateService(UpdateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateService", UpdateServiceResponse.class);
    }

}
