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
package com.tencentcloudapi.teo.v20220106;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220106.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.intl.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-01-06";
    
    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *This API is used to verify a certificate.
     * @param req CheckCertificateRequest
     * @return CheckCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CheckCertificateResponse CheckCertificate(CheckCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCertificate", CheckCertificateResponse.class);
    }

    /**
     *This API is used to create an application proxy.
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxy", CreateApplicationProxyResponse.class);
    }

    /**
     *This API is used to create an application proxy rule.
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxyRule", CreateApplicationProxyRuleResponse.class);
    }

    /**
     *This API is used to batch create application proxy rules.
     * @param req CreateApplicationProxyRulesRequest
     * @return CreateApplicationProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRulesResponse CreateApplicationProxyRules(CreateApplicationProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxyRules", CreateApplicationProxyRulesResponse.class);
    }

    /**
     *This API is used to create a custom error page.
     * @param req CreateCustomErrorPageRequest
     * @return CreateCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomErrorPageResponse CreateCustomErrorPage(CreateCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomErrorPage", CreateCustomErrorPageResponse.class);
    }

    /**
     *This API is used to create a DNS record.
     * @param req CreateDnsRecordRequest
     * @return CreateDnsRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateDnsRecordResponse CreateDnsRecord(CreateDnsRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDnsRecord", CreateDnsRecordResponse.class);
    }

    /**
     *This API is used to create a CLB instance.
     * @param req CreateLoadBalancingRequest
     * @return CreateLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancingResponse CreateLoadBalancing(CreateLoadBalancingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancing", CreateLoadBalancingResponse.class);
    }

    /**
     *This API is used to create an origin group.
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOriginGroup", CreateOriginGroupResponse.class);
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
     *This API is used to create a cache purging task.
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePurgeTask", CreatePurgeTaskResponse.class);
    }

    /**
     *This API is used to access a new site.
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateZone", CreateZoneResponse.class);
    }

    /**
     *This API is used to delete an application proxy.
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxy", DeleteApplicationProxyResponse.class);
    }

    /**
     *This API is used to delete an application proxy rule.
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxyRule", DeleteApplicationProxyRuleResponse.class);
    }

    /**
     *This API is used to batch delete DNS records.
     * @param req DeleteDnsRecordsRequest
     * @return DeleteDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDnsRecordsResponse DeleteDnsRecords(DeleteDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDnsRecords", DeleteDnsRecordsResponse.class);
    }

    /**
     *This API is used to delete a CLB instance.
     * @param req DeleteLoadBalancingRequest
     * @return DeleteLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancingResponse DeleteLoadBalancing(DeleteLoadBalancingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancing", DeleteLoadBalancingResponse.class);
    }

    /**
     *This API is used to delete an origin group.
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOriginGroup", DeleteOriginGroupResponse.class);
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
     *This API is used to obtain a list of application proxies.
     * @param req DescribeApplicationProxyRequest
     * @return DescribeApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxyResponse DescribeApplicationProxy(DescribeApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationProxy", DescribeApplicationProxyResponse.class);
    }

    /**
     *This API is used to obtain the details of an application proxy.
     * @param req DescribeApplicationProxyDetailRequest
     * @return DescribeApplicationProxyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxyDetailResponse DescribeApplicationProxyDetail(DescribeApplicationProxyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationProxyDetail", DescribeApplicationProxyDetailResponse.class);
    }

    /**
     *This API is used to query bot attack logs.
     * @param req DescribeBotLogRequest
     * @return DescribeBotLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotLogResponse DescribeBotLog(DescribeBotLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotLog", DescribeBotLogResponse.class);
    }

    /**
     *This API is used to query bot managed rules.
     * @param req DescribeBotManagedRulesRequest
     * @return DescribeBotManagedRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotManagedRulesResponse DescribeBotManagedRules(DescribeBotManagedRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotManagedRules", DescribeBotManagedRulesResponse.class);
    }

    /**
     *This API is used to query the CNAME status of a domain name.
     * @param req DescribeCnameStatusRequest
     * @return DescribeCnameStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCnameStatusResponse DescribeCnameStatus(DescribeCnameStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCnameStatus", DescribeCnameStatusResponse.class);
    }

    /**
     *This API is used to query the DDoS protection configuration.
     * @param req DescribeDDoSPolicyRequest
     * @return DescribeDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSPolicyResponse DescribeDDoSPolicy(DescribeDDoSPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSPolicy", DescribeDDoSPolicyResponse.class);
    }

    /**
     *This API is used to query the DDoS attack data.
     * @param req DescribeDDosAttackDataRequest
     * @return DescribeDDosAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDosAttackDataResponse DescribeDDosAttackData(DescribeDDosAttackDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDosAttackData", DescribeDDosAttackDataResponse.class);
    }

    /**
     *This API is used to query DDoS attack events.
     * @param req DescribeDDosAttackEventRequest
     * @return DescribeDDosAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDosAttackEventResponse DescribeDDosAttackEvent(DescribeDDosAttackEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDosAttackEvent", DescribeDDosAttackEventResponse.class);
    }

    /**
     *This API is used to query DDoS attack event details.
     * @param req DescribeDDosAttackEventDetailRequest
     * @return DescribeDDosAttackEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDosAttackEventDetailResponse DescribeDDosAttackEventDetail(DescribeDDosAttackEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDosAttackEventDetail", DescribeDDosAttackEventDetailResponse.class);
    }

    /**
     *This API is used to query DDoS attack sources.
     * @param req DescribeDDosAttackSourceEventRequest
     * @return DescribeDDosAttackSourceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDosAttackSourceEventResponse DescribeDDosAttackSourceEvent(DescribeDDosAttackSourceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDosAttackSourceEvent", DescribeDDosAttackSourceEventResponse.class);
    }

    /**
     *This API is used to query the top data of DDoS attacks.
     * @param req DescribeDDosAttackTopDataRequest
     * @return DescribeDDosAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDosAttackTopDataResponse DescribeDDosAttackTopData(DescribeDDosAttackTopDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDosAttackTopData", DescribeDDosAttackTopDataResponse.class);
    }

    /**
     *This API is used to query the major DDoS attack event.
     * @param req DescribeDDosMajorAttackEventRequest
     * @return DescribeDDosMajorAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDosMajorAttackEventResponse DescribeDDosMajorAttackEvent(DescribeDDosMajorAttackEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDosMajorAttackEvent", DescribeDDosMajorAttackEventResponse.class);
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
     *This API is used to obtain collected DNS requests.
     * @param req DescribeDnsDataRequest
     * @return DescribeDnsDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsDataResponse DescribeDnsData(DescribeDnsDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDnsData", DescribeDnsDataResponse.class);
    }

    /**
     *This API is used to query DNS records. Paging, sorting and filtering are supported.
     * @param req DescribeDnsRecordsRequest
     * @return DescribeDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsRecordsResponse DescribeDnsRecords(DescribeDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDnsRecords", DescribeDnsRecordsResponse.class);
    }

    /**
     *This API is used to query DNSSEC information.
     * @param req DescribeDnssecRequest
     * @return DescribeDnssecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnssecResponse DescribeDnssec(DescribeDnssecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDnssec", DescribeDnssecResponse.class);
    }

    /**
     *This API is used to query certificates of domain names. Paging, sorting and filtering are supported.
     * @param req DescribeHostsCertificateRequest
     * @return DescribeHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsCertificateResponse DescribeHostsCertificate(DescribeHostsCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostsCertificate", DescribeHostsCertificateResponse.class);
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
     *This API is used to query verification results.
     * @param req DescribeIdentificationRequest
     * @return DescribeIdentificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationResponse DescribeIdentification(DescribeIdentificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdentification", DescribeIdentificationResponse.class);
    }

    /**
     *This API is used to obtain a list of CLB instances.
     * @param req DescribeLoadBalancingRequest
     * @return DescribeLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancingResponse DescribeLoadBalancing(DescribeLoadBalancingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancing", DescribeLoadBalancingResponse.class);
    }

    /**
     *This API is used to query the details of a CLB instance.
     * @param req DescribeLoadBalancingDetailRequest
     * @return DescribeLoadBalancingDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancingDetailResponse DescribeLoadBalancingDetail(DescribeLoadBalancingDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancingDetail", DescribeLoadBalancingDetailResponse.class);
    }

    /**
     *This API is used to get the list of origin groups.
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroup", DescribeOriginGroupResponse.class);
    }

    /**
     *This API is used to get the details of the origin group.
     * @param req DescribeOriginGroupDetailRequest
     * @return DescribeOriginGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupDetailResponse DescribeOriginGroupDetail(DescribeOriginGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroupDetail", DescribeOriginGroupDetailResponse.class);
    }

    /**
     *This API is used to query the layer-7 time series traffic data for monitoring.
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewL7Data", DescribeOverviewL7DataResponse.class);
    }

    /**
     *This API is used to query the pre-warming task status.
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrefetchTasks", DescribePrefetchTasksResponse.class);
    }

    /**
     *This API is used to query the cache purging history.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
    }

    /**
     *This API is used to query the security protection configuration.
     * @param req DescribeSecurityPolicyRequest
     * @return DescribeSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyResponse DescribeSecurityPolicy(DescribeSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicy", DescribeSecurityPolicyResponse.class);
    }

    /**
     *This API is used to query all protected subdomain names.
     * @param req DescribeSecurityPolicyListRequest
     * @return DescribeSecurityPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyListResponse DescribeSecurityPolicyList(DescribeSecurityPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyList", DescribeSecurityPolicyListResponse.class);
    }

    /**
     *This API is used to query managed rules.
     * @param req DescribeSecurityPolicyManagedRulesRequest
     * @return DescribeSecurityPolicyManagedRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyManagedRulesResponse DescribeSecurityPolicyManagedRules(DescribeSecurityPolicyManagedRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyManagedRules", DescribeSecurityPolicyManagedRulesResponse.class);
    }

    /**
     *This API is used to query the details of a managed rule by rule ID.
     * @param req DescribeSecurityPolicyManagedRulesIdRequest
     * @return DescribeSecurityPolicyManagedRulesIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyManagedRulesIdResponse DescribeSecurityPolicyManagedRulesId(DescribeSecurityPolicyManagedRulesIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyManagedRulesId", DescribeSecurityPolicyManagedRulesIdResponse.class);
    }

    /**
     *This API is used to query information of all regions.
     * @param req DescribeSecurityPolicyRegionsRequest
     * @return DescribeSecurityPolicyRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyRegionsResponse DescribeSecurityPolicyRegions(DescribeSecurityPolicyRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyRegions", DescribeSecurityPolicyRegionsResponse.class);
    }

    /**
     *This API is used to query user profiling rules.
     * @param req DescribeSecurityPortraitRulesRequest
     * @return DescribeSecurityPortraitRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPortraitRulesResponse DescribeSecurityPortraitRules(DescribeSecurityPortraitRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPortraitRules", DescribeSecurityPortraitRulesResponse.class);
    }

    /**
     *This API is used to query the layer-4 time series traffic data.
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL4Data", DescribeTimingL4DataResponse.class);
    }

    /**
     *This API is used to query the layer-7 time series traffic data for data analysis.
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7AnalysisData", DescribeTimingL7AnalysisDataResponse.class);
    }

    /**
     *This API is used to query time-series L7 cached data.
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7CacheData", DescribeTimingL7CacheDataResponse.class);
    }

    /**
     *This API is used to query the top traffic data.
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7AnalysisData", DescribeTopL7AnalysisDataResponse.class);
    }

    /**
     *This API is used to query the top-ranked L7 cached data.
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7CacheData", DescribeTopL7CacheDataResponse.class);
    }

    /**
     *This API is used to query web hosting attack events.
     * @param req DescribeWebManagedRulesAttackEventsRequest
     * @return DescribeWebManagedRulesAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesAttackEventsResponse DescribeWebManagedRulesAttackEvents(DescribeWebManagedRulesAttackEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebManagedRulesAttackEvents", DescribeWebManagedRulesAttackEventsResponse.class);
    }

    /**
     *This API is used to query the web hosting rule data.
     * @param req DescribeWebManagedRulesDataRequest
     * @return DescribeWebManagedRulesDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesDataResponse DescribeWebManagedRulesData(DescribeWebManagedRulesDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebManagedRulesData", DescribeWebManagedRulesDataResponse.class);
    }

    /**
     *This API is used to query web hosting logs.
     * @param req DescribeWebManagedRulesLogRequest
     * @return DescribeWebManagedRulesLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesLogResponse DescribeWebManagedRulesLog(DescribeWebManagedRulesLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebManagedRulesLog", DescribeWebManagedRulesLogResponse.class);
    }

    /**
     *This API is used to query the top data of web hosting rules.
     * @param req DescribeWebManagedRulesTopDataRequest
     * @return DescribeWebManagedRulesTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesTopDataResponse DescribeWebManagedRulesTopData(DescribeWebManagedRulesTopDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebManagedRulesTopData", DescribeWebManagedRulesTopDataResponse.class);
    }

    /**
     *This API is used to query web attack events.
     * @param req DescribeWebProtectionAttackEventsRequest
     * @return DescribeWebProtectionAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionAttackEventsResponse DescribeWebProtectionAttackEvents(DescribeWebProtectionAttackEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebProtectionAttackEvents", DescribeWebProtectionAttackEventsResponse.class);
    }

    /**
     *This API is used to query the web protection data.
     * @param req DescribeWebProtectionDataRequest
     * @return DescribeWebProtectionDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionDataResponse DescribeWebProtectionData(DescribeWebProtectionDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebProtectionData", DescribeWebProtectionDataResponse.class);
    }

    /**
     *This API is used to query web protection logs.
     * @param req DescribeWebProtectionLogRequest
     * @return DescribeWebProtectionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionLogResponse DescribeWebProtectionLog(DescribeWebProtectionLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebProtectionLog", DescribeWebProtectionLogResponse.class);
    }

    /**
     *This API is used to query all DDoS mitigation configuration.
     * @param req DescribeZoneDDoSPolicyRequest
     * @return DescribeZoneDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneDDoSPolicyResponse DescribeZoneDDoSPolicy(DescribeZoneDDoSPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneDDoSPolicy", DescribeZoneDDoSPolicyResponse.class);
    }

    /**
     *This API is used to query the details of a site by site ID.
     * @param req DescribeZoneDetailsRequest
     * @return DescribeZoneDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneDetailsResponse DescribeZoneDetails(DescribeZoneDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneDetails", DescribeZoneDetailsResponse.class);
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
     *This API is used to query the list of user sites.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to query layer-7 logs.
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL7Logs", DownloadL7LogsResponse.class);
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
     *This API is used to import DNS records.
     * @param req ImportDnsRecordsRequest
     * @return ImportDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public ImportDnsRecordsResponse ImportDnsRecords(ImportDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportDnsRecords", ImportDnsRecordsResponse.class);
    }

    /**
     *This API is used to modify an application proxy.
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxy", ModifyApplicationProxyResponse.class);
    }

    /**
     *This API is used to modify an application proxy rule.
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRule", ModifyApplicationProxyRuleResponse.class);
    }

    /**
     *This API is used to modify the status of an application proxy rule.
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRuleStatus", ModifyApplicationProxyRuleStatusResponse.class);
    }

    /**
     *This API is used to modify the status of an application proxy.
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyStatus", ModifyApplicationProxyStatusResponse.class);
    }

    /**
     *This API is used to modify DDoS mitigation configuration.
     * @param req ModifyDDoSPolicyRequest
     * @return ModifyDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyResponse ModifyDDoSPolicy(ModifyDDoSPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSPolicy", ModifyDDoSPolicyResponse.class);
    }

    /**
     *This API is used to enable high availability for domain names.
     * @param req ModifyDDoSPolicyHostRequest
     * @return ModifyDDoSPolicyHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyHostResponse ModifyDDoSPolicyHost(ModifyDDoSPolicyHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSPolicyHost", ModifyDDoSPolicyHostResponse.class);
    }

    /**
     *This API is used to modify the status of a default certificate.
     * @param req ModifyDefaultCertificateRequest
     * @return ModifyDefaultCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultCertificateResponse ModifyDefaultCertificate(ModifyDefaultCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDefaultCertificate", ModifyDefaultCertificateResponse.class);
    }

    /**
     *This API is used to modify DNS records.
     * @param req ModifyDnsRecordRequest
     * @return ModifyDnsRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnsRecordResponse ModifyDnsRecord(ModifyDnsRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDnsRecord", ModifyDnsRecordResponse.class);
    }

    /**
     *This API is used to modify the DNSSEC status.
     * @param req ModifyDnssecRequest
     * @return ModifyDnssecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnssecResponse ModifyDnssec(ModifyDnssecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDnssec", ModifyDnssecResponse.class);
    }

    /**
     *This API is used to modify the certificate of a domain name.
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostsCertificate", ModifyHostsCertificateResponse.class);
    }

    /**
     *This API is used to modify a CLB instance.
     * @param req ModifyLoadBalancingRequest
     * @return ModifyLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancingResponse ModifyLoadBalancing(ModifyLoadBalancingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancing", ModifyLoadBalancingResponse.class);
    }

    /**
     *This API is used to modify the status of a CLB instance.
     * @param req ModifyLoadBalancingStatusRequest
     * @return ModifyLoadBalancingStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancingStatusResponse ModifyLoadBalancingStatus(ModifyLoadBalancingStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancingStatus", ModifyLoadBalancingStatusResponse.class);
    }

    /**
     *This API is used to modify an origin group.
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOriginGroup", ModifyOriginGroupResponse.class);
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
     *This API is used to modify the site information.
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZone", ModifyZoneResponse.class);
    }

    /**
     *This API is used to modify the CNAME acceleration status.
     * @param req ModifyZoneCnameSpeedUpRequest
     * @return ModifyZoneCnameSpeedUpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneCnameSpeedUpResponse ModifyZoneCnameSpeedUp(ModifyZoneCnameSpeedUpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneCnameSpeedUp", ModifyZoneCnameSpeedUpResponse.class);
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
     *This API is used to reclaim a site from other users after its ownership is verified.
     * @param req ReclaimZoneRequest
     * @return ReclaimZoneResponse
     * @throws TencentCloudSDKException
     */
    public ReclaimZoneResponse ReclaimZone(ReclaimZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReclaimZone", ReclaimZoneResponse.class);
    }

    /**
     *This API is used to scan resolution records.
     * @param req ScanDnsRecordsRequest
     * @return ScanDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public ScanDnsRecordsResponse ScanDnsRecords(ScanDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanDnsRecords", ScanDnsRecordsResponse.class);
    }

}
