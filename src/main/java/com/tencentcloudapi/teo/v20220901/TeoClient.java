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
package com.tencentcloudapi.teo.v20220901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220901.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-09-01";
    
    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind/unbind a domain name to/from a specific policy template. 
     * @param req BindSecurityTemplateToEntityRequest
     * @return BindSecurityTemplateToEntityResponse
     * @throws TencentCloudSDKException
     */
    public BindSecurityTemplateToEntityResponse BindSecurityTemplateToEntity(BindSecurityTemplateToEntityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSecurityTemplateToEntity", BindSecurityTemplateToEntityResponse.class);
    }

    /**
     *This API is used to bind/unbind a domain name to/from a shared CNAME. It is now only available to beta users.
     * @param req BindSharedCNAMERequest
     * @return BindSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public BindSharedCNAMEResponse BindSharedCNAME(BindSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSharedCNAME", BindSharedCNAMEResponse.class);
    }

    /**
     *This API is used to bind a site to a plan.
     * @param req BindZoneToPlanRequest
     * @return BindZoneToPlanResponse
     * @throws TencentCloudSDKException
     */
    public BindZoneToPlanResponse BindZoneToPlan(BindZoneToPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindZoneToPlan", BindZoneToPlanResponse.class);
    }

    /**
     *This API is used to query the CNAME status of a domain name.
     * @param req CheckCnameStatusRequest
     * @return CheckCnameStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckCnameStatusResponse CheckCnameStatus(CheckCnameStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCnameStatus", CheckCnameStatusResponse.class);
    }

    /**
     *This API is used to create an acceleration domain name. 

For sites connected via the CNAME, if you have not verified the ownership of the domain name, the ownership verification information of the domain name is returned. To verify your ownership of the domain name, see [Ownership Verification](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1).
     * @param req CreateAccelerationDomainRequest
     * @return CreateAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerationDomainResponse CreateAccelerationDomain(CreateAccelerationDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccelerationDomain", CreateAccelerationDomainResponse.class);
    }

    /**
     *This API is used to create an alias domain name.
     * @param req CreateAliasDomainRequest
     * @return CreateAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasDomainResponse CreateAliasDomain(CreateAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAliasDomain", CreateAliasDomainResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version [CreateL4Proxy] (https://intl.cloud.tencent.com/document/product/1552/103417?from_cn_redirect=1).
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxy", CreateApplicationProxyResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [CreateL4ProxyRules] (https://intl.cloud.tencent.com/document/product/1552/103416?from_cn_redirect=1).
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxyRule", CreateApplicationProxyRuleResponse.class);
    }

    /**
     *This API is used to create key-value indexes for relevant delivered log fields in the corresponding Tencent Cloud CLS log topic for a specified real-time log delivery task (task-id). If such indexes have been created in CLS, this API will append indexes through merging.
     * @param req CreateCLSIndexRequest
     * @return CreateCLSIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSIndexResponse CreateCLSIndex(CreateCLSIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSIndex", CreateCLSIndexResponse.class);
    }

    /**
     *This API is used to create a new version for the specified configuration group in version management mode. The version management feature is currently undergoing beta testing and is accessible only to users on the whitelist.
     * @param req CreateConfigGroupVersionRequest
     * @return CreateConfigGroupVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigGroupVersionResponse CreateConfigGroupVersion(CreateConfigGroupVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigGroupVersion", CreateConfigGroupVersionResponse.class);
    }

    /**
     *This API is used to create a custom response page.
     * @param req CreateCustomizeErrorPageRequest
     * @return CreateCustomizeErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomizeErrorPageResponse CreateCustomizeErrorPage(CreateCustomizeErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomizeErrorPage", CreateCustomizeErrorPageResponse.class);
    }

    /**
     *This API is used to create and deploy an edge function to EdgeOne edge nodes.
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunction", CreateFunctionResponse.class);
    }

    /**
     *This API is used to create a trigger rule for an edge function.
     * @param req CreateFunctionRuleRequest
     * @return CreateFunctionRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionRuleResponse CreateFunctionRule(CreateFunctionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunctionRule", CreateFunctionRuleResponse.class);
    }

    /**
     *This API is used to create Layer 4 proxy instances.
     * @param req CreateL4ProxyRequest
     * @return CreateL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ProxyResponse CreateL4Proxy(CreateL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4Proxy", CreateL4ProxyResponse.class);
    }

    /**
     *This API is used to create Layer 4 proxy instance rules, supporting both individual and batch creation.
     * @param req CreateL4ProxyRulesRequest
     * @return CreateL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ProxyRulesResponse CreateL4ProxyRules(CreateL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4ProxyRules", CreateL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to create a LoadBalancer. For details, see [Quickly Create Load Balancers](https://intl.cloud.tencent.com/document/product/1552/104223?from_cn_redirect=1). The load balancing feature is in beta test. If you need to use it, [contact us](https://intl.cloud.tencent.com/online?from_cn_redirect=1-service).
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to create an origin group for easy management. The created origin server group can be used for **adding acceleration domain names** and **layer-4 proxy configuration**.
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOriginGroup", CreateOriginGroupResponse.class);
    }

    /**
     *If you need to use the EdgeOne product, you must create a billing plan through this interface.
> After creating a plan, you need to complete the process of creating a site and binding the plan through [CreateZone](https://intl.cloud.tencent.com/document/product/1552/80719?from_cn_redirect=1), so that the EdgeOne can provide services properly.
     * @param req CreatePlanRequest
     * @return CreatePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanResponse CreatePlan(CreatePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlan", CreatePlanResponse.class);
    }

    /**
     *This API is used to purchase a plan for a new site.
     * @param req CreatePlanForZoneRequest
     * @return CreatePlanForZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanForZoneResponse CreatePlanForZone(CreatePlanForZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlanForZone", CreatePlanForZoneResponse.class);
    }

    /**
     *This API is used to create a pre-warming task.
     * @param req CreatePrefetchTaskRequest
     * @return CreatePrefetchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrefetchTaskResponse CreatePrefetchTask(CreatePrefetchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrefetchTask", CreatePrefetchTaskResponse.class);
    }

    /**
     *When there are resources updated on the origin with the TTL remaining valid, users cannot access the latest resources. In this case, you can purge the cache using this API. There are two methods: <li>Delete: This method deletes the node cache without verification and retrieves the latest resources from the origin when receiving a request.</li><li>Invalidate: This method marks the node cache as invalid and sends a request with the If-None-Match and If-Modified-Since headers to the origin. If the origin responses with 200, the latest resources are retrieved to be cached on the node. If a 304 response is returned, the latest resources are not cached on the node.

</li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1). </li>
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePurgeTask", CreatePurgeTaskResponse.class);
    }

    /**
     *This API is used to create a real-time log delivery task. The following limits apply:
An entity (a Layer 7 domain name or a Layer 4 proxy instance) under the combination of the same data delivery type (LogType) and data delivery area (Area) can be added to only one real-time log delivery task. It is recommended to first query the real-time log delivery task list by entity through the [DescribeRealtimeLogDeliveryTasks](https://intl.cloud.tencent.com/document/product/1552/104110?from_cn_redirect=1) API to check whether the entity has been added to another real-time log delivery task.
     * @param req CreateRealtimeLogDeliveryTaskRequest
     * @return CreateRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRealtimeLogDeliveryTaskResponse CreateRealtimeLogDeliveryTask(CreateRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRealtimeLogDeliveryTask", CreateRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *This API is used to create a rule in the rule engine.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *This API is used to create a security IP group.
     * @param req CreateSecurityIPGroupRequest
     * @return CreateSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityIPGroupResponse CreateSecurityIPGroup(CreateSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityIPGroup", CreateSecurityIPGroupResponse.class);
    }

    /**
     *This API is used to create a shared CNAME. It is now only available to beta users.
     * @param req CreateSharedCNAMERequest
     * @return CreateSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public CreateSharedCNAMEResponse CreateSharedCNAME(CreateSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSharedCNAME", CreateSharedCNAMEResponse.class);
    }

    /**
     *This API is used to create a site. After you create the site, you can connect it to EdgeOne via the CNAME or NS (see [Quick Start](https://intl.cloud.tencent.com/document/product/1552/87601?from_cn_redirect=1)), or connect it without a domain name (see [Quick Access to L4 Proxy Service](https://intl.cloud.tencent.com/document/product/1552/96051?from_cn_redirect=1)).

If there are already EdgeOne plans under the current account, it is recommended to pass in the `PlanId` to bind the site with the plan directly. If `PlanId` is not passed in, the created site is not activated. You need to call [BindZoneToPlan](https://intl.cloud.tencent.com/document/product/1552/83042?from_cn_redirect=1) to bind the site with a plan. To purchase a plan, please go to the EdgeOne console.
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateZone", CreateZoneResponse.class);
    }

    /**
     *This API is used to batch remove accelerated domain names.
     * @param req DeleteAccelerationDomainsRequest
     * @return DeleteAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerationDomainsResponse DeleteAccelerationDomains(DeleteAccelerationDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccelerationDomains", DeleteAccelerationDomainsResponse.class);
    }

    /**
     *This API is used to delete an alias domain name.
     * @param req DeleteAliasDomainRequest
     * @return DeleteAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasDomainResponse DeleteAliasDomain(DeleteAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAliasDomain", DeleteAliasDomainResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [DeleteL4Proxy] (https://intl.cloud.tencent.com/document/product/1552/103415?from_cn_redirect=1).
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxy", DeleteApplicationProxyResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [DeleteL4ProxyRules] (https://intl.cloud.tencent.com/document/product/1552/103414?from_cn_redirect=1).
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxyRule", DeleteApplicationProxyRuleResponse.class);
    }

    /**
     *This API is used to delete a custom response page.
     * @param req DeleteCustomErrorPageRequest
     * @return DeleteCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomErrorPageResponse DeleteCustomErrorPage(DeleteCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomErrorPage", DeleteCustomErrorPageResponse.class);
    }

    /**
     *This API is used to delete an edge function. Once deleted, the function cannot be recovered, and associated trigger rules are also deleted.
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunction", DeleteFunctionResponse.class);
    }

    /**
     *This API is used to delete a trigger rule for an edge function.
     * @param req DeleteFunctionRulesRequest
     * @return DeleteFunctionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionRulesResponse DeleteFunctionRules(DeleteFunctionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunctionRules", DeleteFunctionRulesResponse.class);
    }

    /**
     *This API is used to delete a Layer 4 proxy instance.
     * @param req DeleteL4ProxyRequest
     * @return DeleteL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4ProxyResponse DeleteL4Proxy(DeleteL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL4Proxy", DeleteL4ProxyResponse.class);
    }

    /**
     *This API is used to delete Layer 4 proxy forwarding rules, supporting both individual and batch operation.
     * @param req DeleteL4ProxyRulesRequest
     * @return DeleteL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4ProxyRulesResponse DeleteL4ProxyRules(DeleteL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL4ProxyRules", DeleteL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to delete a LoadBalancer. If the LoadBalancer is referenced by other services (for example, Layer-4 proxy), the LoadBalancer cannot be deleted until the reference relationship is removed. The load balancing feature is in beta test. If you need to use it, [contact us](https://intl.cloud.tencent.com/online?from_cn_redirect=1-service).
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *This API is used to delete an origin group. Note that an origin group can not be deleted if it is referenced by services (e.g. L4 Proxy, domain name service, load balancing, rule engines). 
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOriginGroup", DeleteOriginGroupResponse.class);
    }

    /**
     *This API is used to delete a real-time log delivery task.
     * @param req DeleteRealtimeLogDeliveryTaskRequest
     * @return DeleteRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRealtimeLogDeliveryTaskResponse DeleteRealtimeLogDeliveryTask(DeleteRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRealtimeLogDeliveryTask", DeleteRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *This API is used to batch delete rules from the rule engine.
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRules", DeleteRulesResponse.class);
    }

    /**
     *This API is used to delete a specified security IP group. Note that the security IP group cannot be deleted if it is referenced in a rule.
     * @param req DeleteSecurityIPGroupRequest
     * @return DeleteSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityIPGroupResponse DeleteSecurityIPGroup(DeleteSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityIPGroup", DeleteSecurityIPGroupResponse.class);
    }

    /**
     *This API is used to delete a shared CNAME. It is now only available to beta users.
     * @param req DeleteSharedCNAMERequest
     * @return DeleteSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSharedCNAMEResponse DeleteSharedCNAME(DeleteSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSharedCNAME", DeleteSharedCNAMEResponse.class);
    }

    /**
     *This API is used to delete a site.
     * @param req DeleteZoneRequest
     * @return DeleteZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteZoneResponse DeleteZone(DeleteZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteZone", DeleteZoneResponse.class);
    }

    /**
     *This API is used to release versions in version management mode. Users can deploy the version to either the testing environment or the production environment by specifying the EnvId parameter. The version management feature is currently undergoing beta testing and is accessible only to users on the whitelist.
     * @param req DeployConfigGroupVersionRequest
     * @return DeployConfigGroupVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeployConfigGroupVersionResponse DeployConfigGroupVersion(DeployConfigGroupVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployConfigGroupVersion", DeployConfigGroupVersionResponse.class);
    }

    /**
     *This API is used to query domain name information of a site, including the acceleration domain name, origin, and domain name status. You can query the information of all domain names, or specific domain names by specifying filters information.
     * @param req DescribeAccelerationDomainsRequest
     * @return DescribeAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerationDomainsResponse DescribeAccelerationDomains(DescribeAccelerationDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerationDomains", DescribeAccelerationDomainsResponse.class);
    }

    /**
     *This API is used to query the information of alias domain names.
     * @param req DescribeAliasDomainsRequest
     * @return DescribeAliasDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasDomainsResponse DescribeAliasDomains(DescribeAliasDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAliasDomains", DescribeAliasDomainsResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. In the latest version, this API has been split into two APIs: one for querying the Layer 4 proxy instance list and the other for querying Layer 4 forwarding rules. For details, see [DescribeL4Proxy] (https://intl.cloud.tencent.com/document/product/1552/103413?from_cn_redirect=1) and [DescribeL4ProxyRules] (https://intl.cloud.tencent.com/document/product/1552/103412?from_cn_redirect=1).
     * @param req DescribeApplicationProxiesRequest
     * @return DescribeApplicationProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxiesResponse DescribeApplicationProxies(DescribeApplicationProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationProxies", DescribeApplicationProxiesResponse.class);
    }

    /**
     *This API is used to query plan options available for purchase.
     * @param req DescribeAvailablePlansRequest
     * @return DescribeAvailablePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailablePlansResponse DescribeAvailablePlans(DescribeAvailablePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailablePlans", DescribeAvailablePlansResponse.class);
    }

    /**
     *This API is used to query billing data.
     * @param req DescribeBillingDataRequest
     * @return DescribeBillingDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingDataResponse DescribeBillingData(DescribeBillingDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingData", DescribeBillingDataResponse.class);
    }

    /**
     *This API is used to obtain detailed information about a version in version management mode. The response includes the version ID, description, status, creation time, configuration group information, and the content of the version configuration file. The version management feature is currently undergoing beta testing and is accessible only to users on the whitelist.
     * @param req DescribeConfigGroupVersionDetailRequest
     * @return DescribeConfigGroupVersionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigGroupVersionDetailResponse DescribeConfigGroupVersionDetail(DescribeConfigGroupVersionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigGroupVersionDetail", DescribeConfigGroupVersionDetailResponse.class);
    }

    /**
     *This API is used to query the version list for the specified configuration group in version management mode. The version management feature is currently undergoing beta testing and is accessible only to users on the whitelist.
     * @param req DescribeConfigGroupVersionsRequest
     * @return DescribeConfigGroupVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigGroupVersionsResponse DescribeConfigGroupVersions(DescribeConfigGroupVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigGroupVersions", DescribeConfigGroupVersionsResponse.class);
    }

    /**
     *This API is used to query content management quotas.
     * @param req DescribeContentQuotaRequest
     * @return DescribeContentQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentQuotaResponse DescribeContentQuota(DescribeContentQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentQuota", DescribeContentQuotaResponse.class);
    }

    /**
     *This API is used to query the custom response page list.
     * @param req DescribeCustomErrorPagesRequest
     * @return DescribeCustomErrorPagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomErrorPagesResponse DescribeCustomErrorPages(DescribeCustomErrorPagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomErrorPages", DescribeCustomErrorPagesResponse.class);
    }

    /**
     *This API is used to query the time-series data of DDoS attacks.
     * @param req DescribeDDoSAttackDataRequest
     * @return DescribeDDoSAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackDataResponse DescribeDDoSAttackData(DescribeDDoSAttackDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackData", DescribeDDoSAttackDataResponse.class);
    }

    /**
     *This API is used to query DDoS attack events.
     * @param req DescribeDDoSAttackEventRequest
     * @return DescribeDDoSAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventResponse DescribeDDoSAttackEvent(DescribeDDoSAttackEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackEvent", DescribeDDoSAttackEventResponse.class);
    }

    /**
     *This API is used to query the top-ranked DDoS attack data.
     * @param req DescribeDDoSAttackTopDataRequest
     * @return DescribeDDoSAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackTopDataResponse DescribeDDoSAttackTopData(DescribeDDoSAttackTopDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackTopData", DescribeDDoSAttackTopDataResponse.class);
    }

    /**
     *This API is used to query a list of default certificates.
     * @param req DescribeDefaultCertificatesRequest
     * @return DescribeDefaultCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultCertificatesResponse DescribeDefaultCertificates(DescribeDefaultCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultCertificates", DescribeDefaultCertificatesResponse.class);
    }

    /**
     *This API is used to query the release history of versions in the production or test environment in version management mode. The version management feature is currently undergoing beta testing and is accessible only to users on the whitelist.
     * @param req DescribeDeployHistoryRequest
     * @return DescribeDeployHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployHistoryResponse DescribeDeployHistory(DescribeDeployHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployHistory", DescribeDeployHistoryResponse.class);
    }

    /**
     *This API is used to query environment information in version management mode. The response includes the environment ID, type, and current effective version. The version management feature is currently undergoing beta testing and is accessible only to users on the whitelist.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *This API is used to query the list of trigger rules for an edge function. It supports filtering by rule ID, function ID, rule description, and so on.
     * @param req DescribeFunctionRulesRequest
     * @return DescribeFunctionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionRulesResponse DescribeFunctionRules(DescribeFunctionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionRules", DescribeFunctionRulesResponse.class);
    }

    /**
     *This API is used to query the runtime environment of an edge function, including environment variables.
     * @param req DescribeFunctionRuntimeEnvironmentRequest
     * @return DescribeFunctionRuntimeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionRuntimeEnvironmentResponse DescribeFunctionRuntimeEnvironment(DescribeFunctionRuntimeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionRuntimeEnvironment", DescribeFunctionRuntimeEnvironmentResponse.class);
    }

    /**
     *This API is used to query the list of edge functions. It supports filtering by function ID, name, description, and so on.
     * @param req DescribeFunctionsRequest
     * @return DescribeFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionsResponse DescribeFunctions(DescribeFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctions", DescribeFunctionsResponse.class);
    }

    /**
     *This API is used to query detailed domain name configuration.
     * @param req DescribeHostsSettingRequest
     * @return DescribeHostsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsSettingResponse DescribeHostsSetting(DescribeHostsSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostsSetting", DescribeHostsSettingResponse.class);
    }

    /**
     *This API is used to check if the IP is an EdgeOne IP.
     * @param req DescribeIPRegionRequest
     * @return DescribeIPRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPRegionResponse DescribeIPRegion(DescribeIPRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPRegion", DescribeIPRegionResponse.class);
    }

    /**
     *This API is used to query the verification information of a site.
     * @param req DescribeIdentificationsRequest
     * @return DescribeIdentificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationsResponse DescribeIdentifications(DescribeIdentificationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdentifications", DescribeIdentificationsResponse.class);
    }

    /**
     *This API is used to query a Layer 4 proxy instance list.
     * @param req DescribeL4ProxyRequest
     * @return DescribeL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ProxyResponse DescribeL4Proxy(DescribeL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4Proxy", DescribeL4ProxyResponse.class);
    }

    /**
     *This API is used to query the forwarding rule list under a Layer 4 proxy instance.
     * @param req DescribeL4ProxyRulesRequest
     * @return DescribeL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ProxyRulesResponse DescribeL4ProxyRules(DescribeL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4ProxyRules", DescribeL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to query the LoadBalancer list. The load balancing feature is in beta test. If you need to use it, [contact us](https://intl.cloud.tencent.com/online?from_cn_redirect=1-service).
     * @param req DescribeLoadBalancerListRequest
     * @return DescribeLoadBalancerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerListResponse DescribeLoadBalancerList(DescribeLoadBalancerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerList", DescribeLoadBalancerListResponse.class);
    }

    /**
     *This API is used to obtain a list of origin groups.
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroup", DescribeOriginGroupResponse.class);
    }

    /**
     *This API is used to query the health status of origin server groups under a LoadBalancer. The load balancing feature is in beta test. If you need to use it, [contact us](https://intl.cloud.tencent.com/online?from_cn_redirect=1-service).
     * @param req DescribeOriginGroupHealthStatusRequest
     * @return DescribeOriginGroupHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupHealthStatusResponse DescribeOriginGroupHealthStatus(DescribeOriginGroupHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroupHealthStatus", DescribeOriginGroupHealthStatusResponse.class);
    }

    /**
     *This API is used to query the origin protection configuration.
     * @param req DescribeOriginProtectionRequest
     * @return DescribeOriginProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginProtectionResponse DescribeOriginProtection(DescribeOriginProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginProtection", DescribeOriginProtectionResponse.class);
    }

    /**
     *This API is used to query the time sequence traffic data of the monitoring category in L7. This API is to be discarded. Please use the API <a href="https://intl.cloud.tencent.com/document/product/1552/80648?from_cn_redirect=1">DescribeTimingL7AnalysisData</a>.
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewL7Data", DescribeOverviewL7DataResponse.class);
    }

    /**
     *DescribePrefetchTasks is used to query the submission history and execution progress of preheating tasks. This interface can be used to query the tasks submitted by the CreatePrefetchTasks interface.
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrefetchTasks", DescribePrefetchTasksResponse.class);
    }

    /**
     *DescribePurgeTasks is used to query the submitted URL refreshing and directory refreshing records and execution progress. This interface can be used to query the tasks submitted by the CreatePurgeTasks API.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
    }

    /**
     *This API is used to query the real-time log delivery task list.
     * @param req DescribeRealtimeLogDeliveryTasksRequest
     * @return DescribeRealtimeLogDeliveryTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeLogDeliveryTasksResponse DescribeRealtimeLogDeliveryTasks(DescribeRealtimeLogDeliveryTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealtimeLogDeliveryTasks", DescribeRealtimeLogDeliveryTasksResponse.class);
    }

    /**
     *This API is used to query the rules in the rule engine.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *This API is used to return the list of the settings of the rule engine that can be used for request match and their detailed recommended configuration information.
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesSetting", DescribeRulesSettingResponse.class);
    }

    /**
     *This API is used to query the configuration information of a security IP group, including the ID, name, and content of the security IP group.
     * @param req DescribeSecurityIPGroupRequest
     * @return DescribeSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupResponse DescribeSecurityIPGroup(DescribeSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroup", DescribeSecurityIPGroupResponse.class);
    }

    /**
     *The API is deprecated and will be discontinued on June 30, 2024. Please use the API [DescribeSecurityIPGroup
](https://intl.cloud.tencent.com/document/product/1552/105866?from_cn_redirect=1).

This API is used to query the configuration information of an IP group, including the IP group name, IP group content, and the site the IP group belongs to.
     * @param req DescribeSecurityIPGroupInfoRequest
     * @return DescribeSecurityIPGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupInfoResponse DescribeSecurityIPGroupInfo(DescribeSecurityIPGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroupInfo", DescribeSecurityIPGroupInfoResponse.class);
    }

    /**
     *This API is used to query bindings of a policy template.
     * @param req DescribeSecurityTemplateBindingsRequest
     * @return DescribeSecurityTemplateBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTemplateBindingsResponse DescribeSecurityTemplateBindings(DescribeSecurityTemplateBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityTemplateBindings", DescribeSecurityTemplateBindingsResponse.class);
    }

    /**
     *This API is used to query the list of L4 traffic data recorded over time.
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL4Data", DescribeTimingL4DataResponse.class);
    }

    /**
     *This API is used to query the time series data of the L7 domain name. Note that there is a delay of about 10 minutes for this API. It is recommended to pull data from 10 minutes before the current time.
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7AnalysisData", DescribeTimingL7AnalysisDataResponse.class);
    }

    /**
     *This API is used to query the time series traffic data of the L7 cache analysis. It will be deprecated. Use the <a href="https://intl.cloud.tencent.com/document/product/1552/80648?from_cn_redirect=1">DescribeTimingL7AnalysisData</a> API instead.
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7CacheData", DescribeTimingL7CacheDataResponse.class);
    }

    /**
     *This API is used to query the top N data of the L7 domain name by a specified dimension. Note that there is a delay of about 10 minutes for this API. It is recommended to pull data from 10 minutes before the current time.
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7AnalysisData", DescribeTopL7AnalysisDataResponse.class);
    }

    /**
     *This API is used to query the top N data of the L7 cache analysis. It will be deprecated. Use the <a href="https://intl.cloud.tencent.com/document/product/1552/80646?from_cn_redirect=1"> DescribeTopL7AnalysisData</a> API instead.
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7CacheData", DescribeTopL7CacheDataResponse.class);
    }

    /**
     *This API is used to query the results of site configuration import via API (ImportZoneConfig). This feature only supports the sites in the plans of the Standard Edition and the Enterprise Edition.
     * @param req DescribeZoneConfigImportResultRequest
     * @return DescribeZoneConfigImportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneConfigImportResultResponse DescribeZoneConfigImportResult(DescribeZoneConfigImportResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneConfigImportResult", DescribeZoneConfigImportResultResponse.class);
    }

    /**
     *This API is used to query the site configuration.
     * @param req DescribeZoneSettingRequest
     * @return DescribeZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneSettingResponse DescribeZoneSetting(DescribeZoneSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneSetting", DescribeZoneSettingResponse.class);
    }

    /**
     *This API is used to query the information of sites that you have access to. You can filter sites based on different query criteria.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *To stop billing for your EdgeOne plan, you can use this interface to terminate the billing plan.
> Terminating a billing plan requires the following conditions:
    1. The plan has expired (except for the Enterprise Edition Plan);
    2. All sites under the plan have been either shut down or deleted.

> The site status can be queried through the [Query Site List](https://intl.cloud.tencent.com/document/product/1552/80713?from_cn_redirect=1) interface.
A site can be deactivated by switching the site to a closed status through the [Switch Site Status](https://intl.cloud.tencent.com/document/product/1552/80707?from_cn_redirect=1) interface.
A site can be deleted by using the [Delete Site](https://intl.cloud.tencent.com/document/product/1552/80717?from_cn_redirect=1) interface.
     * @param req DestroyPlanRequest
     * @return DestroyPlanResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPlanResponse DestroyPlan(DestroyPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPlan", DestroyPlanResponse.class);
    }

    /**
     *This API is used to download L4 logs.
     * @param req DownloadL4LogsRequest
     * @return DownloadL4LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL4LogsResponse DownloadL4Logs(DownloadL4LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL4Logs", DownloadL4LogsResponse.class);
    }

    /**
     *This API is used to download L7 logs.
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL7Logs", DownloadL7LogsResponse.class);
    }

    /**
     *This API is used to export site configuration . The exported configuration is used for import via the API (ImportZoneConfig). This feature only supports the sites in the plans of the Standard Edition and the Enterprise Edition.
     * @param req ExportZoneConfigRequest
     * @return ExportZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public ExportZoneConfigResponse ExportZoneConfig(ExportZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportZoneConfig", ExportZoneConfigResponse.class);
    }

    /**
     *This API is used to operate the runtime environment of an edge function. It supports related settings for environment variables.
After the environment variables are set, they can be used in the function code. For details, see [Edge Functions Referencing Environment Variables](https://intl.cloud.tencent.com/document/product/1552/109151?from_cn_redirect=1#0151fd9a-8b0e-407b-ae37-54553a60ded6).
     * @param req HandleFunctionRuntimeEnvironmentRequest
     * @return HandleFunctionRuntimeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public HandleFunctionRuntimeEnvironmentResponse HandleFunctionRuntimeEnvironment(HandleFunctionRuntimeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleFunctionRuntimeEnvironment", HandleFunctionRuntimeEnvironmentResponse.class);
    }

    /**
     *This API is used to verify ownership of the site.
     * @param req IdentifyZoneRequest
     * @return IdentifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public IdentifyZoneResponse IdentifyZone(IdentifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IdentifyZone", IdentifyZoneResponse.class);
    }

    /**
     *This API is used to quickly import site configuration files. After the import is initiated, the API will return the corresponding task ID (TaskId). Users need to use the site configuration import result query API (DescribeZoneConfigImportResult) to obtain the results of this import task. This feature only supports the sites in the plans of the Standard Edition and the Enterprise Edition.
     * @param req ImportZoneConfigRequest
     * @return ImportZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public ImportZoneConfigResponse ImportZoneConfig(ImportZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportZoneConfig", ImportZoneConfigResponse.class);
    }

    /**
     *When the number of sites bound to your plan, the number of rules under "Web Protection - Custom Rules - Precision Matching Policy", or the number of rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module" reaches the plan's quota, you can use this interface to purchase additional quotas.
> This interface only supports the Enterprise Edition Plan.
     * @param req IncreasePlanQuotaRequest
     * @return IncreasePlanQuotaResponse
     * @throws TencentCloudSDKException
     */
    public IncreasePlanQuotaResponse IncreasePlanQuota(IncreasePlanQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IncreasePlanQuota", IncreasePlanQuotaResponse.class);
    }

    /**
     *This API is used to modify an accelerated domain name.
     * @param req ModifyAccelerationDomainRequest
     * @return ModifyAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainResponse ModifyAccelerationDomain(ModifyAccelerationDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerationDomain", ModifyAccelerationDomainResponse.class);
    }

    /**
     *This API is used to batch modify the status of accelerated domains.
     * @param req ModifyAccelerationDomainStatusesRequest
     * @return ModifyAccelerationDomainStatusesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainStatusesResponse ModifyAccelerationDomainStatuses(ModifyAccelerationDomainStatusesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerationDomainStatuses", ModifyAccelerationDomainStatusesResponse.class);
    }

    /**
     *This API is used to modify an alias domain name.
     * @param req ModifyAliasDomainRequest
     * @return ModifyAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainResponse ModifyAliasDomain(ModifyAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAliasDomain", ModifyAliasDomainResponse.class);
    }

    /**
     *This API is used to modify the status of an alias domain name.
     * @param req ModifyAliasDomainStatusRequest
     * @return ModifyAliasDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainStatusResponse ModifyAliasDomainStatus(ModifyAliasDomainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAliasDomainStatus", ModifyAliasDomainStatusResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [ModifyL4Proxy
] (https://intl.cloud.tencent.com/document/product/1552/103411?from_cn_redirect=1).
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxy", ModifyApplicationProxyResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [ModifyL4ProxyRules] (https://intl.cloud.tencent.com/document/product/1552/103410?from_cn_redirect=1).
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRule", ModifyApplicationProxyRuleResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [ModifyL4ProxyRulesStatus
] (https://intl.cloud.tencent.com/document/product/1552/103409?from_cn_redirect=1).
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRuleStatus", ModifyApplicationProxyRuleStatusResponse.class);
    }

    /**
     *This API is on an earlier version. If you want to call it, please switch to the latest version. For details, see [ModifyL4ProxyStatus] (https://intl.cloud.tencent.com/document/product/1552/103408?from_cn_redirect=1).
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyStatus", ModifyApplicationProxyStatusResponse.class);
    }

    /**
     *This API is used to modify a custom response page.
     * @param req ModifyCustomErrorPageRequest
     * @return ModifyCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomErrorPageResponse ModifyCustomErrorPage(ModifyCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomErrorPage", ModifyCustomErrorPageResponse.class);
    }

    /**
     *This API is used to modify an edge function. It supports modifying the function content and description. The function will take effect immediately after modification and redeployment.
     * @param req ModifyFunctionRequest
     * @return ModifyFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionResponse ModifyFunction(ModifyFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunction", ModifyFunctionResponse.class);
    }

    /**
     *This API is used to modify a trigger rule for an edge function. It supports modifying rule conditions, execution functions, and description.
     * @param req ModifyFunctionRuleRequest
     * @return ModifyFunctionRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionRuleResponse ModifyFunctionRule(ModifyFunctionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionRule", ModifyFunctionRuleResponse.class);
    }

    /**
     *This API is used to modify the priority of trigger rules for an edge function.
     * @param req ModifyFunctionRulePriorityRequest
     * @return ModifyFunctionRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionRulePriorityResponse ModifyFunctionRulePriority(ModifyFunctionRulePriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionRulePriority", ModifyFunctionRulePriorityResponse.class);
    }

    /**
     *This API is used to configure the certificate of a site. You can use your own certificate or [apply for a free certificate](https://intl.cloud.tencent.com/document/product/1552/90437?from_cn_redirect=1).
To use an external certificate, upload the certificate to [SSL Certificates Console](https://console.cloud.tencent.com/certoview) first, and then input the certificate ID in this API. For details, see [Deploying Own Certificates to EdgeOne Domains](https://intl.cloud.tencent.com/document/product/1552/88874?from_cn_redirect=1).
 
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostsCertificate", ModifyHostsCertificateResponse.class);
    }

    /**
     *This API is used to modify the configuration of a Layer 4 proxy instance.
     * @param req ModifyL4ProxyRequest
     * @return ModifyL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyResponse ModifyL4Proxy(ModifyL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4Proxy", ModifyL4ProxyResponse.class);
    }

    /**
     *This API is used to modify Layer 4 proxy forwarding rules, supporting both individual and batch modification.
     * @param req ModifyL4ProxyRulesRequest
     * @return ModifyL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyRulesResponse ModifyL4ProxyRules(ModifyL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyRules", ModifyL4ProxyRulesResponse.class);
    }

    /**
     *This API is used to start or stop Layer 4 proxy forwarding rules, supporting both individual and batch operation.
     * @param req ModifyL4ProxyRulesStatusRequest
     * @return ModifyL4ProxyRulesStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyRulesStatusResponse ModifyL4ProxyRulesStatus(ModifyL4ProxyRulesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyRulesStatus", ModifyL4ProxyRulesStatusResponse.class);
    }

    /**
     *This API is used to enable or disable a Layer 4 proxy instance.
     * @param req ModifyL4ProxyStatusRequest
     * @return ModifyL4ProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyStatusResponse ModifyL4ProxyStatus(ModifyL4ProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyStatus", ModifyL4ProxyStatusResponse.class);
    }

    /**
     *This API is used to modify LoadBalancer configuration. The load balancing feature is in beta test. If you need to use it, [contact us](https://intl.cloud.tencent.com/online?from_cn_redirect=1-service).
     * @param req ModifyLoadBalancerRequest
     * @return ModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerResponse ModifyLoadBalancer(ModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancer", ModifyLoadBalancerResponse.class);
    }

    /**
     *This API is used to modify the configuration of an origin group. The original configuration will be overwritten. 
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOriginGroup", ModifyOriginGroupResponse.class);
    }

    /**
     *Modify the plan settings. Currently, only the auto-renewal switch of prepaid plans can be modified.
     * @param req ModifyPlanRequest
     * @return ModifyPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPlanResponse ModifyPlan(ModifyPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlan", ModifyPlanResponse.class);
    }

    /**
     *This API is used to modify the real-time log delivery task configuration. This API has the following restrictions:<li>Does not support modifying the destination type of the real-time log delivery task (TaskType);</li><li>Does not support modifying the data delivery type (LogType);</li><li>Does not support modifying the data delivery area (Area);</li><li>Does not support modifying the detailed destination configuration, such as log set and log topic, when the destination of the original real-time log delivery task is Tencent Cloud CLS.</li>
     * @param req ModifyRealtimeLogDeliveryTaskRequest
     * @return ModifyRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealtimeLogDeliveryTaskResponse ModifyRealtimeLogDeliveryTask(ModifyRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRealtimeLogDeliveryTask", ModifyRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *This API is used to modify a rule in the rule engine.
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *This API is used to modify a security IP group.
     * @param req ModifySecurityIPGroupRequest
     * @return ModifySecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityIPGroupResponse ModifySecurityIPGroup(ModifySecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityIPGroup", ModifySecurityIPGroupResponse.class);
    }

    /**
     *This API is used to modify the web and bot security configurations.
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityPolicy", ModifySecurityPolicyResponse.class);
    }

    /**
     *This API is used to modify a site.
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZone", ModifyZoneResponse.class);
    }

    /**
     *This API is used to modify the site configuration.
     * @param req ModifyZoneSettingRequest
     * @return ModifyZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneSettingResponse ModifyZoneSetting(ModifyZoneSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneSetting", ModifyZoneSettingResponse.class);
    }

    /**
     *This API is used to change the site status.
     * @param req ModifyZoneStatusRequest
     * @return ModifyZoneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneStatusResponse ModifyZoneStatus(ModifyZoneStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneStatus", ModifyZoneStatusResponse.class);
    }

    /**
     *When your plan needs to be extended, you can use this interface to renew it. Plan renewal is only supported for the Personal, Basic, and Standard Editions.
> For cost details, refer to [Plan Fees](https://intl.cloud.tencent.com/document/product/1552/94158?from_cn_redirect=1).
     * @param req RenewPlanRequest
     * @return RenewPlanResponse
     * @throws TencentCloudSDKException
     */
    public RenewPlanResponse RenewPlan(RenewPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewPlan", RenewPlanResponse.class);
    }

    /**
     *When you need features available only in higher-tier plans, you can upgrade your plan through this interface. Upgrades are only supported for Personal and Basic Edition Plans.
> For differences between EdgeOne billing plans, refer to [Comparison of EdgeOne Plans](https://intl.cloud.tencent.com/document/product/1552/94165?from_cn_redirect=1).
For EdgeOne plan upgrade rules and pricing details, refer to [EdgeOne Plan Upgrade Guide](https://intl.cloud.tencent.com/document/product/1552/95291?from_cn_redirect=1).
If your plan needs to upgrade to the Enterprise Edition, [Contact Us](https://intl.cloud.tencent.com/online?from_cn_redirect=1-service).
     * @param req UpgradePlanRequest
     * @return UpgradePlanResponse
     * @throws TencentCloudSDKException
     */
    public UpgradePlanResponse UpgradePlan(UpgradePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradePlan", UpgradePlanResponse.class);
    }

    /**
     *This API is used to verify your ownership of a site or domain name. It's required in the CNAME access mode. After a site is verified, you don't need to verify the ownership again for domain names added to it in the future. For details, see [Ownership Verification](https://intl.cloud.tencent.com/document/product/1552/70789?from_cn_redirect=1).

For sites connected via the NS, you can query whether the NS is successfully switched through this API. For details, see [Modifying DNS Servers](https://intl.cloud.tencent.com/document/product/1552/90452?from_cn_redirect=1).
     * @param req VerifyOwnershipRequest
     * @return VerifyOwnershipResponse
     * @throws TencentCloudSDKException
     */
    public VerifyOwnershipResponse VerifyOwnership(VerifyOwnershipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyOwnership", VerifyOwnershipResponse.class);
    }

}
