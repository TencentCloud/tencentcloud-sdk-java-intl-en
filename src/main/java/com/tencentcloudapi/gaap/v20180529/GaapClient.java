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
package com.tencentcloudapi.gaap.v20180529;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gaap.v20180529.models.*;

public class GaapClient extends AbstractClient{
    private static String endpoint = "gaap.intl.tencentcloudapi.com";
    private static String service = "gaap";
    private static String version = "2018-05-29";
    
    public GaapClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GaapClient(Credential credential, String region, ClientProfile profile) {
        super(GaapClient.endpoint, GaapClient.version, credential, region, profile);
    }

    /**
     *This API is used to add the information of the origin server (server), which supports IP or the domain name.
     * @param req AddRealServersRequest
     * @return AddRealServersResponse
     * @throws TencentCloudSDKException
     */
    public AddRealServersResponse AddRealServers(AddRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRealServers", AddRealServersResponse.class);
    }

    /**
     *This API (BindListenerRealServers) is used for the TCP/UDP listener to bind/unbind the origin server.
Note: This API unbinds the previously bound origin servers, and binds the origin servers selected for this call. For example, the previously bound origin servers are A, B and C, and the origin servers selected for this call are C, D and E, then the origin servers bound after this call will be C, D and E.
     * @param req BindListenerRealServersRequest
     * @return BindListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindListenerRealServersResponse BindListenerRealServers(BindListenerRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindListenerRealServers", BindListenerRealServersResponse.class);
    }

    /**
     *This API is used to bind an origin server to the forwarding rules of layer-7 listeners. Note: This API unbinds all previously bound origin servers before binding those selected.
     * @param req BindRuleRealServersRequest
     * @return BindRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindRuleRealServersResponse BindRuleRealServers(BindRuleRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindRuleRealServers", BindRuleRealServersResponse.class);
    }

    /**
     *This API (CheckProxyCreate) is used to query whether an acceleration connection with the specified configuration can be created.
     * @param req CheckProxyCreateRequest
     * @return CheckProxyCreateResponse
     * @throws TencentCloudSDKException
     */
    public CheckProxyCreateResponse CheckProxyCreate(CheckProxyCreateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckProxyCreate", CheckProxyCreateResponse.class);
    }

    /**
     *This API (CloseProxies) is used to disable connections. If disabled, no traffic will be generated, but the basic configuration fee will still be incurred.
     * @param req CloseProxiesRequest
     * @return CloseProxiesResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxiesResponse CloseProxies(CloseProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProxies", CloseProxiesResponse.class);
    }

    /**
     *This API is used to disable a connection group. Once disabled, the connection group will no longer generate traffic, but the basic connection configuration fees will still be incurred every day.
     * @param req CloseProxyGroupRequest
     * @return CloseProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyGroupResponse CloseProxyGroup(CloseProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProxyGroup", CloseProxyGroupResponse.class);
    }

    /**
     *This API is used to disable a security policy.
     * @param req CloseSecurityPolicyRequest
     * @return CloseSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CloseSecurityPolicyResponse CloseSecurityPolicy(CloseSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseSecurityPolicy", CloseSecurityPolicyResponse.class);
    }

    /**
     *This API (CreateCertificate) is used to create the GAAP certificates and configuration files, including basic authentication configuration files, client CA certificates, server SSL certificates, GAAP SSL certificates, and origin server CA certificates.
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificate", CreateCertificateResponse.class);
    }

    /**
     *This API is used to create a custom header of the HTTP/HTTPS listener. When client requests reach the listener, they will be forwarded to the origin with this custom hearer.
     * @param req CreateCustomHeaderRequest
     * @return CreateCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomHeaderResponse CreateCustomHeader(CreateCustomHeaderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomHeader", CreateCustomHeaderResponse.class);
    }

    /**
     *This API (CreateDomain) is used to create the access domain name for the HTTP/HTTPS listener. Clients request the backend data by accessing this domain.
This API only supports connections of version 3.0.
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *This API is used to customize the error code of an error response to the specified domain name.
     * @param req CreateDomainErrorPageInfoRequest
     * @return CreateDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainErrorPageInfoResponse CreateDomainErrorPageInfo(CreateDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainErrorPageInfo", CreateDomainErrorPageInfoResponse.class);
    }

    /**
     *This API (CreateHTTPListener) is used to create an HTTP listener in the connection instance.
     * @param req CreateHTTPListenerRequest
     * @return CreateHTTPListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPListenerResponse CreateHTTPListener(CreateHTTPListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHTTPListener", CreateHTTPListenerResponse.class);
    }

    /**
     *This API (CreateHTTPListener) is used to create an HTTPS listener in the connection instance.
     * @param req CreateHTTPSListenerRequest
     * @return CreateHTTPSListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPSListenerResponse CreateHTTPSListener(CreateHTTPSListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHTTPSListener", CreateHTTPSListenerResponse.class);
    }

    /**
     *This API is used to create/replicate an acceleration connection with the specified configuration. To replicate a connection, the basic configuration parameters need to be set for the new connection, and `ClonedProxyId` is needed to identify the replicated connection.
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxy", CreateProxyResponse.class);
    }

    /**
     *This API (CreateProxyGroup) is used to create a connection group.
     * @param req CreateProxyGroupRequest
     * @return CreateProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupResponse CreateProxyGroup(CreateProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxyGroup", CreateProxyGroupResponse.class);
    }

    /**
     *This API (CreateProxyGroupDomain) is used to create the connection group domain name, and enable the domain name resolution.
     * @param req CreateProxyGroupDomainRequest
     * @return CreateProxyGroupDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupDomainResponse CreateProxyGroupDomain(CreateProxyGroupDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxyGroupDomain", CreateProxyGroupDomainResponse.class);
    }

    /**
     *This API (CreateRule) is used to create the forwarding rules of HTTP/HTTPS listeners.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *This API is used to create security policies.
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityPolicy", CreateSecurityPolicyResponse.class);
    }

    /**
     *This API is used to add security policy rules.
     * @param req CreateSecurityRulesRequest
     * @return CreateSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityRulesResponse CreateSecurityRules(CreateSecurityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityRules", CreateSecurityRulesResponse.class);
    }

    /**
     *This API (CreateTCPListeners) is used to batch create TCP listeners of single connections or connection groups.
     * @param req CreateTCPListenersRequest
     * @return CreateTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateTCPListenersResponse CreateTCPListeners(CreateTCPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTCPListeners", CreateTCPListenersResponse.class);
    }

    /**
     *This API (CreateTCPListeners) is used to batch create UDP listeners of single connections or connection groups.
     * @param req CreateUDPListenersRequest
     * @return CreateUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateUDPListenersResponse CreateUDPListeners(CreateUDPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUDPListeners", CreateUDPListenersResponse.class);
    }

    /**
     *This API is used to delete a certificate.
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCertificate", DeleteCertificateResponse.class);
    }

    /**
     *This API (DeleteDomain) is only applicable to layer-7 listeners. It is used to delete the domain names of this listener, and all the rules under the domain name. All rules bound to the origin server are unbound automatically.
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *This API is used to delete a custom error code for a domain name.
     * @param req DeleteDomainErrorPageInfoRequest
     * @return DeleteDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainErrorPageInfoResponse DeleteDomainErrorPageInfo(DeleteDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainErrorPageInfo", DeleteDomainErrorPageInfoResponse.class);
    }

    /**
     *This API (DeleteListeners) is used to batch delete the listeners of a connection or connection group, including layer-4/7 listeners.
     * @param req DeleteListenersRequest
     * @return DeleteListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenersResponse DeleteListeners(DeleteListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListeners", DeleteListenersResponse.class);
    }

    /**
     *This API (DeleteProxyGroup) is used to delete a connection group.
     * @param req DeleteProxyGroupRequest
     * @return DeleteProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProxyGroupResponse DeleteProxyGroup(DeleteProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProxyGroup", DeleteProxyGroupResponse.class);
    }

    /**
     *This API (DeleteRule) is used to delete the forwarding rules of HTTP/HTTPS listeners.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *This API is used to delete a security policy.
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityPolicy", DeleteSecurityPolicyResponse.class);
    }

    /**
     *This API is used to delete security policy rules.
     * @param req DeleteSecurityRulesRequest
     * @return DeleteSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityRulesResponse DeleteSecurityRules(DeleteSecurityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityRules", DeleteSecurityRulesResponse.class);
    }

    /**
     *This API (DescribeAccessRegions) is used to query acceleration region (client access region).
     * @param req DescribeAccessRegionsRequest
     * @return DescribeAccessRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsResponse DescribeAccessRegions(DescribeAccessRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRegions", DescribeAccessRegionsResponse.class);
    }

    /**
     *This API is used to query the available accelerator region based on the origin server region.
     * @param req DescribeAccessRegionsByDestRegionRequest
     * @return DescribeAccessRegionsByDestRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsByDestRegionResponse DescribeAccessRegionsByDestRegion(DescribeAccessRegionsByDestRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRegionsByDestRegion", DescribeAccessRegionsByDestRegionResponse.class);
    }

    /**
     *This API is used to get a request signature that can prevent parameter tampering in the process of triggering orders, getting quotes, or activating subscription services.
     * @param req DescribeAuthSignatureRequest
     * @return DescribeAuthSignatureResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthSignatureResponse DescribeAuthSignature(DescribeAuthSignatureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthSignature", DescribeAuthSignatureResponse.class);
    }

    /**
     *This API is used to query names of blocked custom headers.
     * @param req DescribeBlackHeaderRequest
     * @return DescribeBlackHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackHeaderResponse DescribeBlackHeader(DescribeBlackHeaderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlackHeader", DescribeBlackHeaderResponse.class);
    }

    /**
     *This API (DescribeCertificateDetail) is used to query certificate details, including the certificate ID, name, type, content, key, and other information.
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateDetail", DescribeCertificateDetailResponse.class);
    }

    /**
     *This API (DescribeCertificates) is used to query the list of available certificates.
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificates", DescribeCertificatesResponse.class);
    }

    /**
     *This API (DescribeCountryAreaMapping) is used to obtain the country/region code mapping table.
     * @param req DescribeCountryAreaMappingRequest
     * @return DescribeCountryAreaMappingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCountryAreaMappingResponse DescribeCountryAreaMapping(DescribeCountryAreaMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCountryAreaMapping", DescribeCountryAreaMappingResponse.class);
    }

    /**
     *This API is used to query the list of custom headers.
     * @param req DescribeCustomHeaderRequest
     * @return DescribeCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomHeaderResponse DescribeCustomHeader(DescribeCustomHeaderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomHeader", DescribeCustomHeaderResponse.class);
    }

    /**
     *This API (DescribeDestRegions) is used to query an origin server region (i.e., the region in which the origin server locates).
     * @param req DescribeDestRegionsRequest
     * @return DescribeDestRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDestRegionsResponse DescribeDestRegions(DescribeDestRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDestRegions", DescribeDestRegionsResponse.class);
    }

    /**
     *This API is used to query the custom error response to a domain name.
     * @param req DescribeDomainErrorPageInfoRequest
     * @return DescribeDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoResponse DescribeDomainErrorPageInfo(DescribeDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainErrorPageInfo", DescribeDomainErrorPageInfoResponse.class);
    }

    /**
     *This API is used to query the corresponding error response by a custom error ID.
     * @param req DescribeDomainErrorPageInfoByIdsRequest
     * @return DescribeDomainErrorPageInfoByIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoByIdsResponse DescribeDomainErrorPageInfoByIds(DescribeDomainErrorPageInfoByIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainErrorPageInfoByIds", DescribeDomainErrorPageInfoByIdsResponse.class);
    }

    /**
     *This is an internal API. It is used to query the information of connections and connection groups from which the statistics can be derived.
     * @param req DescribeGroupAndStatisticsProxyRequest
     * @return DescribeGroupAndStatisticsProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupAndStatisticsProxyResponse DescribeGroupAndStatisticsProxy(DescribeGroupAndStatisticsProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupAndStatisticsProxy", DescribeGroupAndStatisticsProxyResponse.class);
    }

    /**
     *This API (DescribeGroupDomainConfig) is used to obtain the domain name resolution configuration details of a connection group.
     * @param req DescribeGroupDomainConfigRequest
     * @return DescribeGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupDomainConfigResponse DescribeGroupDomainConfig(DescribeGroupDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupDomainConfig", DescribeGroupDomainConfigResponse.class);
    }

    /**
     *This API (DescribeHTTPListeners) is used to query HTTP listener information.
     * @param req DescribeHTTPListenersRequest
     * @return DescribeHTTPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPListenersResponse DescribeHTTPListeners(DescribeHTTPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHTTPListeners", DescribeHTTPListenersResponse.class);
    }

    /**
     *This API (DescribeHTTPSListeners) is used to query HTTPS listener information.
     * @param req DescribeHTTPSListenersRequest
     * @return DescribeHTTPSListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPSListenersResponse DescribeHTTPSListeners(DescribeHTTPSListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHTTPSListeners", DescribeHTTPSListenersResponse.class);
    }

    /**
     *This API (DescribeListenerRealServers) is used to query the origin server list of TCP/UDP listeners, including the list of bound origin servers and origin servers that can be bound.
     * @param req DescribeListenerRealServersRequest
     * @return DescribeListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerRealServersResponse DescribeListenerRealServers(DescribeListenerRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerRealServers", DescribeListenerRealServersResponse.class);
    }

    /**
     *This API is used to query listener statistics, including inbound/outbound bandwidth, inbound/outbound packets, and concurrence data. It supports granularities of 300, 3,600, and 86,400. Default value is the highest within the granularity range.
     * @param req DescribeListenerStatisticsRequest
     * @return DescribeListenerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerStatisticsResponse DescribeListenerStatistics(DescribeListenerStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerStatistics", DescribeListenerStatisticsResponse.class);
    }

    /**
     *This API (DescribeProxies) is used to query the connection instance list.
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxies", DescribeProxiesResponse.class);
    }

    /**
     *This API (DescribeProxiesStatus) is used to query the connection status list.
     * @param req DescribeProxiesStatusRequest
     * @return DescribeProxiesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesStatusResponse DescribeProxiesStatus(DescribeProxiesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxiesStatus", DescribeProxiesStatusResponse.class);
    }

    /**
     *This is an internal API. It is used to query the information of connections and listeners from which the statistics can be derived.
     * @param req DescribeProxyAndStatisticsListenersRequest
     * @return DescribeProxyAndStatisticsListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyAndStatisticsListenersResponse DescribeProxyAndStatisticsListeners(DescribeProxyAndStatisticsListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyAndStatisticsListeners", DescribeProxyAndStatisticsListenersResponse.class);
    }

    /**
     *This API (DescribeProxyDetail) is used to query connection details.
     * @param req DescribeProxyDetailRequest
     * @return DescribeProxyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyDetailResponse DescribeProxyDetail(DescribeProxyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyDetail", DescribeProxyDetailResponse.class);
    }

    /**
     *This API (DescribeProxyGroupDetails) is used to query connection group details.
     * @param req DescribeProxyGroupDetailsRequest
     * @return DescribeProxyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupDetailsResponse DescribeProxyGroupDetails(DescribeProxyGroupDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyGroupDetails", DescribeProxyGroupDetailsResponse.class);
    }

    /**
     *This API (DescribeProxyGroupList) is used to pull the list of connection groups and the basic information of each connection group.
     * @param req DescribeProxyGroupListRequest
     * @return DescribeProxyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupListResponse DescribeProxyGroupList(DescribeProxyGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyGroupList", DescribeProxyGroupListResponse.class);
    }

    /**
     *This API is used to query listener statistics, including inbound/outbound bandwidth, inbound/outbound packets, and concurrence data. It supports granularities of 300, 3,600, and 86,400. Default value is the highest within the granularity range.
     * @param req DescribeProxyGroupStatisticsRequest
     * @return DescribeProxyGroupStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupStatisticsResponse DescribeProxyGroupStatistics(DescribeProxyGroupStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyGroupStatistics", DescribeProxyGroupStatisticsResponse.class);
    }

    /**
     *This API is used to query listener statistics, including inbound/outbound bandwidth, inbound/outbound packets, concurrence, packet loss, and latency data. It supports granularities of 300, 3,600, and 86,400. Default value is the highest within the granularity range.
     * @param req DescribeProxyStatisticsRequest
     * @return DescribeProxyStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyStatisticsResponse DescribeProxyStatistics(DescribeProxyStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyStatistics", DescribeProxyStatisticsResponse.class);
    }

    /**
     *This API is used to query the statistics of an origin server's health check results. Origin server status is displayed as 1 (normal) or 0 (exceptional). The queried origin server must be bound to a listener or rule, and the ID of the bound listener or rule must be specified for the query. This API supports displaying origin server status statistics at a 1-minute granularity.
     * @param req DescribeRealServerStatisticsRequest
     * @return DescribeRealServerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServerStatisticsResponse DescribeRealServerStatistics(DescribeRealServerStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealServerStatistics", DescribeRealServerStatisticsResponse.class);
    }

    /**
     *This API is used to query origin server information. It can query all origin servers under the specified project name, and supports fuzzy query by specified IPs or domain names.
     * @param req DescribeRealServersRequest
     * @return DescribeRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersResponse DescribeRealServers(DescribeRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealServers", DescribeRealServersResponse.class);
    }

    /**
     *This API (DescribeRealServersStatus) is used to query whether an origin server has been bound to a rule or listener.
     * @param req DescribeRealServersStatusRequest
     * @return DescribeRealServersStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersStatusResponse DescribeRealServersStatus(DescribeRealServersStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealServersStatus", DescribeRealServersStatusResponse.class);
    }

    /**
     *This API (DescribeRegionAndPrice) is used to obtain the origin server regions and the bandwidth price gradient.
     * @param req DescribeRegionAndPriceRequest
     * @return DescribeRegionAndPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionAndPriceResponse DescribeRegionAndPrice(DescribeRegionAndPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegionAndPrice", DescribeRegionAndPriceResponse.class);
    }

    /**
     *This API (DescribeResourcesByTag) is used to query corresponding resource information by tags, including connection, connection group, and origin server.
     * @param req DescribeResourcesByTagRequest
     * @return DescribeResourcesByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagResponse DescribeResourcesByTag(DescribeResourcesByTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByTag", DescribeResourcesByTagResponse.class);
    }

    /**
     *This API (DescribeRuleRealServers) is used to query forwarding rules-related origin server information, including information of origin servers that can be bound and have been bound.
     * @param req DescribeRuleRealServersRequest
     * @return DescribeRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleRealServersResponse DescribeRuleRealServers(DescribeRuleRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleRealServers", DescribeRuleRealServersResponse.class);
    }

    /**
     *This API (DescribeRules) is used to query all rule information of a listener, including the domain names, paths, and list of bound origin servers. For version 3.0 connections, this API returns the advanced authentication configuration information of the domain name.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *This API is used to pull the list of rules based on rule ID. It supports pulling 1 to 10 rules at a time.
     * @param req DescribeRulesByRuleIdsRequest
     * @return DescribeRulesByRuleIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByRuleIdsResponse DescribeRulesByRuleIds(DescribeRulesByRuleIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesByRuleIds", DescribeRulesByRuleIdsResponse.class);
    }

    /**
     *This API is used to obtain security policy details.
     * @param req DescribeSecurityPolicyDetailRequest
     * @return DescribeSecurityPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyDetailResponse DescribeSecurityPolicyDetail(DescribeSecurityPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyDetail", DescribeSecurityPolicyDetailResponse.class);
    }

    /**
     *This API is used to query the list of security rules based on security rule ID. It supports querying 1 to 20 security rules at a time.
     * @param req DescribeSecurityRulesRequest
     * @return DescribeSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRulesResponse DescribeSecurityRules(DescribeSecurityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityRules", DescribeSecurityRulesResponse.class);
    }

    /**
     *This API (DescribeTCPListeners) is used to query the TCP listener information of a single connection or connection group.
     * @param req DescribeTCPListenersRequest
     * @return DescribeTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTCPListenersResponse DescribeTCPListeners(DescribeTCPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTCPListeners", DescribeTCPListenersResponse.class);
    }

    /**
     *This API (DescribeUDPListeners) is used to query the UDP listener information of a single connection or connection group.
     * @param req DescribeUDPListenersRequest
     * @return DescribeUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUDPListenersResponse DescribeUDPListeners(DescribeUDPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUDPListeners", DescribeUDPListenersResponse.class);
    }

    /**
     *This API (DestroyProxies) is used to terminate a connection. If terminated, no fees will be incurred.
     * @param req DestroyProxiesRequest
     * @return DestroyProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyProxiesResponse DestroyProxies(DestroyProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyProxies", DestroyProxiesResponse.class);
    }

    /**
     *This API (InquiryPriceCreateProxy) is used to create the price inquiries of acceleration connections.
     * @param req InquiryPriceCreateProxyRequest
     * @return InquiryPriceCreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateProxyResponse InquiryPriceCreateProxy(InquiryPriceCreateProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateProxy", InquiryPriceCreateProxyResponse.class);
    }

    /**
     *This API (ModifyCertificate) is used to modify a domain name certificate of a listener. domain name certificate. This API is only applicable to connections of version 3.0.
     * @param req ModifyCertificateRequest
     * @return ModifyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateResponse ModifyCertificate(ModifyCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificate", ModifyCertificateResponse.class);
    }

    /**
     *This API is used to modify certificate name and content.
     * @param req ModifyCertificateAttributesRequest
     * @return ModifyCertificateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAttributesResponse ModifyCertificateAttributes(ModifyCertificateAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateAttributes", ModifyCertificateAttributesResponse.class);
    }

    /**
     *This API (ModifyDomain) is used to modify domain names of listeners. For connections of version 3.0, it supports modifying certificates of the domain names.
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomain", ModifyDomainResponse.class);
    }

    /**
     *This API (ModifyGroupDomainConfig) is used to configure the nearest access domain name of a connection group.
     * @param req ModifyGroupDomainConfigRequest
     * @return ModifyGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupDomainConfigResponse ModifyGroupDomainConfig(ModifyGroupDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroupDomainConfig", ModifyGroupDomainConfigResponse.class);
    }

    /**
     *This API (ModifyHTTPListenerAttribute) is used to modify the HTTP listener configuration information of a connection. Currently only supports modifying listener name.
Note: Grouped connections currently do not support HTTP/HTTPS listeners.
     * @param req ModifyHTTPListenerAttributeRequest
     * @return ModifyHTTPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPListenerAttributeResponse ModifyHTTPListenerAttribute(ModifyHTTPListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHTTPListenerAttribute", ModifyHTTPListenerAttributeResponse.class);
    }

    /**
     *This API (ModifyHTTPSListenerAttribute) is used to modify HTTPS listener configurations. It currently do not support connection groups and connections of version 1.0.
     * @param req ModifyHTTPSListenerAttributeRequest
     * @return ModifyHTTPSListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPSListenerAttributeResponse ModifyHTTPSListenerAttribute(ModifyHTTPSListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHTTPSListenerAttribute", ModifyHTTPSListenerAttributeResponse.class);
    }

    /**
     *This API (ModifyProxiesAttribute) is used to modify instance attributes (currently only supports modifying connection name).
     * @param req ModifyProxiesAttributeRequest
     * @return ModifyProxiesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesAttributeResponse ModifyProxiesAttribute(ModifyProxiesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxiesAttribute", ModifyProxiesAttributeResponse.class);
    }

    /**
     *This API (ModifyProxiesProject) is used to modify the project to which a connection belongs.
     * @param req ModifyProxiesProjectRequest
     * @return ModifyProxiesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesProjectResponse ModifyProxiesProject(ModifyProxiesProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxiesProject", ModifyProxiesProjectResponse.class);
    }

    /**
     *This API (ModifyProxyConfiguration) is used to modify connection configurations. You can expand or reduce the capacity based on current business requirements. It only supports connections with a Scalarable of 1. Scalarable can be obtained via DescribeProxies API.
     * @param req ModifyProxyConfigurationRequest
     * @return ModifyProxyConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyConfigurationResponse ModifyProxyConfiguration(ModifyProxyConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyConfiguration", ModifyProxyConfigurationResponse.class);
    }

    /**
     *This API (ModifyProxyGroupAttribute) is used to modify connection group attributes. It currently only supports modifying connection group name.
     * @param req ModifyProxyGroupAttributeRequest
     * @return ModifyProxyGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyGroupAttributeResponse ModifyProxyGroupAttribute(ModifyProxyGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyGroupAttribute", ModifyProxyGroupAttributeResponse.class);
    }

    /**
     *This API (ModifyRealServerName) is used to modify origin server names.
     * @param req ModifyRealServerNameRequest
     * @return ModifyRealServerNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealServerNameResponse ModifyRealServerName(ModifyRealServerNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRealServerName", ModifyRealServerNameResponse.class);
    }

    /**
     *This API (ModifyRuleAttribute) is used to modify forwarding rule information, including health check configuration and forwarding policies.
     * @param req ModifyRuleAttributeRequest
     * @return ModifyRuleAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleAttributeResponse ModifyRuleAttribute(ModifyRuleAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleAttribute", ModifyRuleAttributeResponse.class);
    }

    /**
     *This API is used to modify security policy rule names.
     * @param req ModifySecurityRuleRequest
     * @return ModifySecurityRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityRuleResponse ModifySecurityRule(ModifySecurityRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityRule", ModifySecurityRuleResponse.class);
    }

    /**
     *This API (ModifyTCPListenerAttribute) is used to modify the TCP listener configuration of a connection instance, including health check configuration and scheduling policies.
     * @param req ModifyTCPListenerAttributeRequest
     * @return ModifyTCPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTCPListenerAttributeResponse ModifyTCPListenerAttribute(ModifyTCPListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTCPListenerAttribute", ModifyTCPListenerAttributeResponse.class);
    }

    /**
     *This API (ModifyUDPListenerAttribute) is used to modify the UDP listener configuration of a connection instance, including modification of listener names and scheduling policies.
     * @param req ModifyUDPListenerAttributeRequest
     * @return ModifyUDPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUDPListenerAttributeResponse ModifyUDPListenerAttribute(ModifyUDPListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUDPListenerAttribute", ModifyUDPListenerAttributeResponse.class);
    }

    /**
     *This API (OpenProxies) is used to enable one or more connections.
     * @param req OpenProxiesRequest
     * @return OpenProxiesResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxiesResponse OpenProxies(OpenProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenProxies", OpenProxiesResponse.class);
    }

    /**
     *This API is used to enable all connections in a connection group.
     * @param req OpenProxyGroupRequest
     * @return OpenProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxyGroupResponse OpenProxyGroup(OpenProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenProxyGroup", OpenProxyGroupResponse.class);
    }

    /**
     *This API is used to enable a security policy.
     * @param req OpenSecurityPolicyRequest
     * @return OpenSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenSecurityPolicyResponse OpenSecurityPolicy(OpenSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenSecurityPolicy", OpenSecurityPolicyResponse.class);
    }

    /**
     *This API is used to delete the added origin server (server) IP or domain name.
     * @param req RemoveRealServersRequest
     * @return RemoveRealServersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveRealServersResponse RemoveRealServers(RemoveRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveRealServers", RemoveRealServersResponse.class);
    }

    /**
     *This API (SetAuthentication) is used for the advanced authentication configuration of connections, including authentication methods and their certificates. If only supports connections of version 3.0.
     * @param req SetAuthenticationRequest
     * @return SetAuthenticationResponse
     * @throws TencentCloudSDKException
     */
    public SetAuthenticationResponse SetAuthentication(SetAuthenticationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAuthentication", SetAuthenticationResponse.class);
    }

}
