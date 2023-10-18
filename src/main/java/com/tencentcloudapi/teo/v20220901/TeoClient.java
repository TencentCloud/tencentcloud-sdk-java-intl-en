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
     *This API is used to bind a site to a plan.
     * @param req BindZoneToPlanRequest
     * @return BindZoneToPlanResponse
     * @throws TencentCloudSDKException
     */
    public BindZoneToPlanResponse BindZoneToPlan(BindZoneToPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindZoneToPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "BindZoneToPlan", BindZoneToPlanResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the CNAME status of a domain name.
     * @param req CheckCnameStatusRequest
     * @return CheckCnameStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckCnameStatusResponse CheckCnameStatus(CheckCnameStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckCnameStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckCnameStatus", CheckCnameStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to connect a domain to EdgeOne.
     * @param req CreateAccelerationDomainRequest
     * @return CreateAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerationDomainResponse CreateAccelerationDomain(CreateAccelerationDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccelerationDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAccelerationDomain", CreateAccelerationDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an alias domain name.
     * @param req CreateAliasDomainRequest
     * @return CreateAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasDomainResponse CreateAliasDomain(CreateAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAliasDomain", CreateAliasDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an application proxy.
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateApplicationProxy", CreateApplicationProxyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an application proxy rule.
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateApplicationProxyRule", CreateApplicationProxyRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an origin group.
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOriginGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateOriginGroup", CreateOriginGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to purchase a plan for a new site.
     * @param req CreatePlanForZoneRequest
     * @return CreatePlanForZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanForZoneResponse CreatePlanForZone(CreatePlanForZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePlanForZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreatePlanForZone", CreatePlanForZoneResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a pre-warming task.
     * @param req CreatePrefetchTaskRequest
     * @return CreatePrefetchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrefetchTaskResponse CreatePrefetchTask(CreatePrefetchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrefetchTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreatePrefetchTask", CreatePrefetchTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *When there are resources updated on the origin with the TTL remaining valid, users cannot access the latest resources. In this case, you can purge the cache using this API. There are two methods: <li>Delete: This method deletes the node cache without verification and retrieves u200dthe latest resources from the origin when receiving a request.</li><li>Invalidate: This method marks the node cache as invalid and sends a request with the If-None-Match and If-Modified-Since headers to the origin. If the origin responses with 200, the latest resources are retrieved to be cached on the node. If a 304 response is returned, the latest resources are not cached on the node.

</li>For more details, see [Cache Purge](https://intl.cloud.tencent.com/document/product/1552/70759?from_cn_redirect=1). </li>
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePurgeTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreatePurgeTask", CreatePurgeTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a rule in the rule engine.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a security IP group.
     * @param req CreateSecurityIPGroupRequest
     * @return CreateSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityIPGroupResponse CreateSecurityIPGroup(CreateSecurityIPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityIPGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSecurityIPGroup", CreateSecurityIPGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to access a new site.
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateZone", CreateZoneResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch remove accelerated domain names.
     * @param req DeleteAccelerationDomainsRequest
     * @return DeleteAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerationDomainsResponse DeleteAccelerationDomains(DeleteAccelerationDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccelerationDomainsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAccelerationDomains", DeleteAccelerationDomainsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an alias domain name.
     * @param req DeleteAliasDomainRequest
     * @return DeleteAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasDomainResponse DeleteAliasDomain(DeleteAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAliasDomain", DeleteAliasDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an application proxy.
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationProxyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteApplicationProxy", DeleteApplicationProxyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an application proxy rule.
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteApplicationProxyRule", DeleteApplicationProxyRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an origin group.
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOriginGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteOriginGroup", DeleteOriginGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch delete rules from the rule engine.
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRules", DeleteRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a specified security IP group. Note that the security IP group cannot be deleted if it is referenced in a rule.
     * @param req DeleteSecurityIPGroupRequest
     * @return DeleteSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityIPGroupResponse DeleteSecurityIPGroup(DeleteSecurityIPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityIPGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSecurityIPGroup", DeleteSecurityIPGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a site.
     * @param req DeleteZoneRequest
     * @return DeleteZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteZoneResponse DeleteZone(DeleteZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteZone", DeleteZoneResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query accelerated domain names. Paging, sorting and filtering are supported.
     * @param req DescribeAccelerationDomainsRequest
     * @return DescribeAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerationDomainsResponse DescribeAccelerationDomains(DescribeAccelerationDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccelerationDomainsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccelerationDomains", DescribeAccelerationDomainsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of alias domain names.
     * @param req DescribeAliasDomainsRequest
     * @return DescribeAliasDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasDomainsResponse DescribeAliasDomains(DescribeAliasDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAliasDomainsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAliasDomains", DescribeAliasDomainsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of application proxies.
     * @param req DescribeApplicationProxiesRequest
     * @return DescribeApplicationProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxiesResponse DescribeApplicationProxies(DescribeApplicationProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationProxiesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeApplicationProxies", DescribeApplicationProxiesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query plan options available for purchase.
     * @param req DescribeAvailablePlansRequest
     * @return DescribeAvailablePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailablePlansResponse DescribeAvailablePlans(DescribeAvailablePlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailablePlansResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAvailablePlans", DescribeAvailablePlansResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query content management quotas.
     * @param req DescribeContentQuotaRequest
     * @return DescribeContentQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentQuotaResponse DescribeContentQuota(DescribeContentQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContentQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeContentQuota", DescribeContentQuotaResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the time-series data of DDoS attacks.
     * @param req DescribeDDoSAttackDataRequest
     * @return DescribeDDoSAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackDataResponse DescribeDDoSAttackData(DescribeDDoSAttackDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSAttackData", DescribeDDoSAttackDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query DDoS attack events.
     * @param req DescribeDDoSAttackEventRequest
     * @return DescribeDDoSAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventResponse DescribeDDoSAttackEvent(DescribeDDoSAttackEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSAttackEvent", DescribeDDoSAttackEventResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the top-ranked DDoS attack data.
     * @param req DescribeDDoSAttackTopDataRequest
     * @return DescribeDDoSAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackTopDataResponse DescribeDDoSAttackTopData(DescribeDDoSAttackTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackTopDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSAttackTopData", DescribeDDoSAttackTopDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a list of default certificates.
     * @param req DescribeDefaultCertificatesRequest
     * @return DescribeDefaultCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultCertificatesResponse DescribeDefaultCertificates(DescribeDefaultCertificatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultCertificatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDefaultCertificates", DescribeDefaultCertificatesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query detailed domain name configuration.
     * @param req DescribeHostsSettingRequest
     * @return DescribeHostsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsSettingResponse DescribeHostsSetting(DescribeHostsSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeHostsSetting", DescribeHostsSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the verification information of a site.
     * @param req DescribeIdentificationsRequest
     * @return DescribeIdentificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationsResponse DescribeIdentifications(DescribeIdentificationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIdentificationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIdentifications", DescribeIdentificationsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain a list of origin groups.
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOriginGroup", DescribeOriginGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the origin protection configuration.
     * @param req DescribeOriginProtectionRequest
     * @return DescribeOriginProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginProtectionResponse DescribeOriginProtection(DescribeOriginProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginProtectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOriginProtection", DescribeOriginProtectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the L7 traffic summary statistics recorded over time.
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewL7DataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOverviewL7Data", DescribeOverviewL7DataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the pre-warming task status.
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrefetchTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePrefetchTasks", DescribePrefetchTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Querying the cache purging history
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the rules in the rule engine.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to return the list of the settings of the rule engine that can be used for request match and their detailed recommended configuration information.
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRulesSetting", DescribeRulesSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of L4 traffic data recorded over time.
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL4DataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTimingL4Data", DescribeTimingL4DataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the L7 data recorded over time.
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTimingL7AnalysisData", DescribeTimingL7AnalysisDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the time-series L7 cached data.
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7CacheDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTimingL7CacheData", DescribeTimingL7CacheDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the top-ranked L7 traffic data.
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTopL7AnalysisData", DescribeTopL7AnalysisDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the cached L7 top-ranked data.
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopL7CacheDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTopL7CacheData", DescribeTopL7CacheDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the site configuration.
     * @param req DescribeZoneSettingRequest
     * @return DescribeZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneSettingResponse DescribeZoneSetting(DescribeZoneSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeZoneSetting", DescribeZoneSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of user sites.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to download L4 logs.
     * @param req DownloadL4LogsRequest
     * @return DownloadL4LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL4LogsResponse DownloadL4Logs(DownloadL4LogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadL4LogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DownloadL4Logs", DownloadL4LogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to download L7 logs.
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadL7LogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DownloadL7Logs", DownloadL7LogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to verify ownership of the site.
     * @param req IdentifyZoneRequest
     * @return IdentifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public IdentifyZoneResponse IdentifyZone(IdentifyZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IdentifyZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "IdentifyZone", IdentifyZoneResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an accelerated domain name.
     * @param req ModifyAccelerationDomainRequest
     * @return ModifyAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainResponse ModifyAccelerationDomain(ModifyAccelerationDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccelerationDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAccelerationDomain", ModifyAccelerationDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch modify the status of accelerated domains.
     * @param req ModifyAccelerationDomainStatusesRequest
     * @return ModifyAccelerationDomainStatusesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainStatusesResponse ModifyAccelerationDomainStatuses(ModifyAccelerationDomainStatusesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccelerationDomainStatusesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAccelerationDomainStatuses", ModifyAccelerationDomainStatusesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an alias domain name.
     * @param req ModifyAliasDomainRequest
     * @return ModifyAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainResponse ModifyAliasDomain(ModifyAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAliasDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAliasDomain", ModifyAliasDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the status of an alias domain name.
     * @param req ModifyAliasDomainStatusRequest
     * @return ModifyAliasDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainStatusResponse ModifyAliasDomainStatus(ModifyAliasDomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAliasDomainStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAliasDomainStatus", ModifyAliasDomainStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an application proxy.
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyApplicationProxy", ModifyApplicationProxyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an application proxy rule.
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyApplicationProxyRule", ModifyApplicationProxyRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the status of an application proxy rule.
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyApplicationProxyRuleStatus", ModifyApplicationProxyRuleStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the status of an application proxy.
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyApplicationProxyStatus", ModifyApplicationProxyStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the certificate of a domain name.
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostsCertificateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyHostsCertificate", ModifyHostsCertificateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an origin group.
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyOriginGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyOriginGroup", ModifyOriginGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a rule in the rule engine.
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a security IP group.
     * @param req ModifySecurityIPGroupRequest
     * @return ModifySecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityIPGroupResponse ModifySecurityIPGroup(ModifySecurityIPGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityIPGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecurityIPGroup", ModifySecurityIPGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the web and bot security configurations.
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecurityPolicy", ModifySecurityPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a site.
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyZone", ModifyZoneResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the site configuration.
     * @param req ModifyZoneSettingRequest
     * @return ModifyZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneSettingResponse ModifyZoneSetting(ModifyZoneSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyZoneSetting", ModifyZoneSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the site status.
     * @param req ModifyZoneStatusRequest
     * @return ModifyZoneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneStatusResponse ModifyZoneStatus(ModifyZoneStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyZoneStatus", ModifyZoneStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
