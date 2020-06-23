/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    private static String endpoint = "apigateway.tencentcloudapi.com";
    private static String version = "2018-08-08";

    public ApigatewayClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApigatewayClient(Credential credential, String region, ClientProfile profile) {
        super(ApigatewayClient.endpoint, ApigatewayClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind a usage plan to a service environment.
After you publish a service to an environment, if the API requires authentication and can be called only when it is bound to a usage plan, you can use this API to bind a usage plan to the specified environment.
Currently, a usage plan can be bound to an API; however, under the same service, usage plans bound to a service and usage plans bound to an API cannot coexist. Therefore, in an environment to which a service-level usage plan has already been bound, please use the `DemoteServiceUsagePlan` API to demote it.
     * @param req BindEnvironmentRequest
     * @return BindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public BindEnvironmentResponse BindEnvironment(BindEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEnvironmentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindEnvironmentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindEnvironment"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an IP policy to an API.
     * @param req BindIPStrategyRequest
     * @return BindIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public BindIPStrategyResponse BindIPStrategy(BindIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a key to a usage plan.
You can bind a key to a usage plan and bind the usage plan to an environment where a service is published, so that callers can use the key to call APIs in the service. You can use this API to bind a key to a usage plan.
     * @param req BindSecretIdsRequest
     * @return BindSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public BindSecretIdsResponse BindSecretIds(BindSecretIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindSecretIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindSecretIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindSecretIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a custom domain name to a service.
Each service in API Gateway provides a default domain name for users to call. If you want to use your own domain name, you can bind a custom domain name to the target service. After getting the ICP filing and configuring the CNAME record between the custom and default domain names, you can directly call the custom domain name.
     * @param req BindSubDomainRequest
     * @return BindSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public BindSubDomainResponse BindSubDomain(BindSubDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindSubDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindSubDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindSubDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an API. Before creating an API, you need to create a service, as each API belongs to a certain service.
     * @param req CreateApiRequest
     * @return CreateApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiResponse CreateApi(CreateApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an API key pair.
     * @param req CreateApiKeyRequest
     * @return CreateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiKeyResponse CreateApiKey(CreateApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a service IP policy.
     * @param req CreateIPStrategyRequest
     * @return CreateIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateIPStrategyResponse CreateIPStrategy(CreateIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a service.
The maximum unit in API Gateway is service. Multiple APIs can be created in one service, and each service has a default domain name for users to call. You can also bind your own custom domain name to a service.
     * @param req CreateServiceRequest
     * @return CreateServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceResponse CreateService(CreateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a usage plan.
To use API Gateway, you need to create a usage plan and bind it to a service environment.
     * @param req CreateUsagePlanRequest
     * @return CreateUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsagePlanResponse CreateUsagePlan(CreateUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a created API.
     * @param req DeleteApiRequest
     * @return DeleteApiResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiResponse DeleteApi(DeleteApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an API key pair.
     * @param req DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiKeyResponse DeleteApiKey(DeleteApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a service IP policy.
     * @param req DeleteIPStrategyRequest
     * @return DeleteIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIPStrategyResponse DeleteIPStrategy(DeleteIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a service in API Gateway.
     * @param req DeleteServiceRequest
     * @return DeleteServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceResponse DeleteService(DeleteServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom domain name mapping in a service environment.
You can use this API if you use a custom domain name and custom mapping. Please note that if you delete all mappings in all environments, a failure will be returned when this API is called.
     * @param req DeleteServiceSubDomainMappingRequest
     * @return DeleteServiceSubDomainMappingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceSubDomainMappingResponse DeleteServiceSubDomainMapping(DeleteServiceSubDomainMappingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceSubDomainMappingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceSubDomainMappingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceSubDomainMapping"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a usage plan.
     * @param req DeleteUsagePlanRequest
     * @return DeleteUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsagePlanResponse DeleteUsagePlan(DeleteUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to demote a usage plan of a service in an environment to the API level.
 
This operation will be denied if there are no APIs under the service.
This operation will also be denied if the current environment has not been published.
     * @param req DemoteServiceUsagePlanRequest
     * @return DemoteServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DemoteServiceUsagePlanResponse DemoteServiceUsagePlan(DemoteServiceUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DemoteServiceUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DemoteServiceUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DemoteServiceUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of an API deployed in API Gateway.
     * @param req DescribeApiRequest
     * @return DescribeApiResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiResponse DescribeApi(DescribeApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to display the throttling policies bound to an API.
     * @param req DescribeApiEnvironmentStrategyRequest
     * @return DescribeApiEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiEnvironmentStrategyResponse DescribeApiEnvironmentStrategy(DescribeApiEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a key.
After creating an API key, you can query its details by using this API.
     * @param req DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyResponse DescribeApiKey(DescribeApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of API usage plans in a service.
To make authentication and throttling for a service take effect, you need to bind a usage plan to it. This API is used to query all usage plans bound to a service and APIs under it.
     * @param req DescribeApiUsagePlanRequest
     * @return DescribeApiUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiUsagePlanResponse DescribeApiUsagePlan(DescribeApiUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search for logs.
     * @param req DescribeLogSearchRequest
     * @return DescribeLogSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSearchResponse DescribeLogSearch(DescribeLogSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogSearchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogSearchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLogSearch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a service, such as its description, domain name, protocol, creation time, and releases.
     * @param req DescribeServiceRequest
     * @return DescribeServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceResponse DescribeService(DescribeServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of environments under a service. All environments and their statuses under the queried service will be returned.
     * @param req DescribeServiceEnvironmentListRequest
     * @return DescribeServiceEnvironmentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentListResponse DescribeServiceEnvironmentList(DescribeServiceEnvironmentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceEnvironmentListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceEnvironmentList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the release history in a service environment.
A service can only be used when it is published to an environment after creation. This API is used to query the release history in an environment under a service.
     * @param req DescribeServiceEnvironmentReleaseHistoryRequest
     * @return DescribeServiceEnvironmentReleaseHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentReleaseHistoryResponse DescribeServiceEnvironmentReleaseHistory(DescribeServiceEnvironmentReleaseHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceEnvironmentReleaseHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentReleaseHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceEnvironmentReleaseHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to display a service throttling policy.
     * @param req DescribeServiceEnvironmentStrategyRequest
     * @return DescribeServiceEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentStrategyResponse DescribeServiceEnvironmentStrategy(DescribeServiceEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of all published versions under a service.
A service is generally published on several versions. This API can be used to query the published versions.
     * @param req DescribeServiceReleaseVersionRequest
     * @return DescribeServiceReleaseVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceReleaseVersionResponse DescribeServiceReleaseVersion(DescribeServiceReleaseVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceReleaseVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceReleaseVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceReleaseVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the path mappings of a custom domain name.
In API Gateway, you can bind a custom domain name to a service and map its paths. You can customize different path mappings to up to 3 environments under the service. This API is used to query the list of path mappings of a custom domain name bound to a service.
     * @param req DescribeServiceSubDomainMappingsRequest
     * @return DescribeServiceSubDomainMappingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceSubDomainMappingsResponse DescribeServiceSubDomainMappings(DescribeServiceSubDomainMappingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceSubDomainMappingsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceSubDomainMappingsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceSubDomainMappings"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of custom domain names.
In API Gateway, you can bind custom domain names to a service for service call. This API is used to query the list of custom domain names bound to a service.
     * @param req DescribeServiceSubDomainsRequest
     * @return DescribeServiceSubDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceSubDomainsResponse DescribeServiceSubDomains(DescribeServiceSubDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceSubDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceSubDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceSubDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of usage plans in a service.
To make authentication and throttling for a service take effect, you need to bind a usage plan to it. This API is used to query all usage plans bound to a service.
     * @param req DescribeServiceUsagePlanRequest
     * @return DescribeServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceUsagePlanResponse DescribeServiceUsagePlan(DescribeServiceUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a usage plan, such as its name, QPS, creation time, and bound environment.
     * @param req DescribeUsagePlanRequest
     * @return DescribeUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanResponse DescribeUsagePlan(DescribeUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of environments bound to a usage plan.
After binding a usage plan to environments, you can use this API to query all service environments bound to the usage plan.
     * @param req DescribeUsagePlanEnvironmentsRequest
     * @return DescribeUsagePlanEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanEnvironmentsResponse DescribeUsagePlanEnvironments(DescribeUsagePlanEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlanEnvironmentsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanEnvironmentsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlanEnvironments"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of keys bound to a usage plan.
In API Gateway, a usage plan can be bound to multiple key pairs. You can use this API to query the list of keys bound to it.
     * @param req DescribeUsagePlanSecretIdsRequest
     * @return DescribeUsagePlanSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanSecretIdsResponse DescribeUsagePlanSecretIds(DescribeUsagePlanSecretIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlanSecretIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanSecretIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlanSecretIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable an API key.
     * @param req DisableApiKeyRequest
     * @return DisableApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableApiKeyResponse DisableApiKey(DisableApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a disabled API key.
     * @param req EnableApiKeyRequest
     * @return EnableApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableApiKeyResponse EnableApiKey(EnableApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to automatically generate API documents and SDKs. One document and one SDK will be generated for each environment under each service, respectively.
     * @param req GenerateApiDocumentRequest
     * @return GenerateApiDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApiDocumentResponse GenerateApiDocument(GenerateApiDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateApiDocumentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateApiDocumentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GenerateApiDocument"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an API. You can call this API to edit/modify a configured API. The modified API takes effect only after its service is published to the corresponding environment again.
     * @param req ModifyApiRequest
     * @return ModifyApiResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiResponse ModifyApi(ModifyApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an API throttling policy.
     * @param req ModifyApiEnvironmentStrategyRequest
     * @return ModifyApiEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiEnvironmentStrategyResponse ModifyApiEnvironmentStrategy(ModifyApiEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApiEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to incrementally update an API and mainly called by programs (different from `ModifyApi`, which requires that full API parameters be passed in and is suitable for use in the console).
     * @param req ModifyApiIncrementRequest
     * @return ModifyApiIncrementResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiIncrementResponse ModifyApiIncrement(ModifyApiIncrementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiIncrementResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiIncrementResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApiIncrement"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a service IP policy.
     * @param req ModifyIPStrategyRequest
     * @return ModifyIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIPStrategyResponse ModifyIPStrategy(ModifyIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the relevant information of a service. After a service is created, its name, description, and service type can be modified.
     * @param req ModifyServiceRequest
     * @return ModifyServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceResponse ModifyService(ModifyServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a service throttling policy.
     * @param req ModifyServiceEnvironmentStrategyRequest
     * @return ModifyServiceEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceEnvironmentStrategyResponse ModifyServiceEnvironmentStrategy(ModifyServiceEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyServiceEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the path mapping in the custom domain name settings of a service. The path mapping rule can be modified before it is bound to the custom domain name.
     * @param req ModifySubDomainRequest
     * @return ModifySubDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubDomainResponse ModifySubDomain(ModifySubDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the name, description, and QPS of a usage plan.
     * @param req ModifyUsagePlanRequest
     * @return ModifyUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsagePlanResponse ModifyUsagePlan(ModifyUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to publish a service.
An API Gateway service can only be called when it is published to an environment and takes effect after creation. This API is used to publish a service to an environment such as the `release` environment.
     * @param req ReleaseServiceRequest
     * @return ReleaseServiceResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseServiceResponse ReleaseService(ReleaseServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a usage plan from a specified environment.
     * @param req UnBindEnvironmentRequest
     * @return UnBindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public UnBindEnvironmentResponse UnBindEnvironment(UnBindEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindEnvironmentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindEnvironmentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindEnvironment"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind an IP policy from a service.
     * @param req UnBindIPStrategyRequest
     * @return UnBindIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UnBindIPStrategyResponse UnBindIPStrategy(UnBindIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a key from a usage plan.
     * @param req UnBindSecretIdsRequest
     * @return UnBindSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public UnBindSecretIdsResponse UnBindSecretIds(UnBindSecretIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindSecretIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindSecretIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindSecretIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a custom domain name.
After binding a custom domain name to a service by using API Gateway, you can use this API to unbind it.
     * @param req UnBindSubDomainRequest
     * @return UnBindSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public UnBindSubDomainResponse UnBindSubDomain(UnBindSubDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindSubDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindSubDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindSubDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deactivate a service.
Only after a service is published to an environment can its APIs be called. You can call this API to deactivate a service in the release environment. Once deactivated, the service cannot be called.
     * @param req UnReleaseServiceRequest
     * @return UnReleaseServiceResponse
     * @throws TencentCloudSDKException
     */
    public UnReleaseServiceResponse UnReleaseService(UnReleaseServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnReleaseServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnReleaseServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnReleaseService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a created API key pair.
     * @param req UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to switch the running version of a service published in an environment to a specified version. After you create a service by using API Gateway and publish it to an environment, multiple versions will be generated during development. In this case, you can call this API to switch versions.
     * @param req UpdateServiceRequest
     * @return UpdateServiceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServiceResponse UpdateService(UpdateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
