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
    private static String endpoint = "gaap.tencentcloudapi.com";
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
        JsonResponseModel<AddRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (BindListenerRealServers) is used for the TCP/UDP listener to bind/unbind the origin server.
Note: This API unbinds the previously bound origin servers, and binds the origin servers selected for this call. For example, the previously bound origin servers are A, B and C, and the origin servers selected for this call are C, D and E, then the origin servers bound after this call will be C, D and E.
     * @param req BindListenerRealServersRequest
     * @return BindListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindListenerRealServersResponse BindListenerRealServers(BindListenerRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindListenerRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindListenerRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindListenerRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an origin server to the forwarding rules of layer-7 listeners. Note: This API unbinds all previously bound origin servers before binding those selected.
     * @param req BindRuleRealServersRequest
     * @return BindRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindRuleRealServersResponse BindRuleRealServers(BindRuleRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindRuleRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindRuleRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindRuleRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CheckProxyCreate) is used to query whether an acceleration connection with the specified configuration can be created.
     * @param req CheckProxyCreateRequest
     * @return CheckProxyCreateResponse
     * @throws TencentCloudSDKException
     */
    public CheckProxyCreateResponse CheckProxyCreate(CheckProxyCreateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckProxyCreateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckProxyCreateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckProxyCreate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CloseProxies) is used to disable connections. If disabled, no traffic will be generated, but the basic configuration fee will still be incurred.
     * @param req CloseProxiesRequest
     * @return CloseProxiesResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxiesResponse CloseProxies(CloseProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable security policies.
     * @param req CloseSecurityPolicyRequest
     * @return CloseSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CloseSecurityPolicyResponse CloseSecurityPolicy(CloseSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateCertificate) is used to create the GAAP certificates and configuration files, including basic authentication configuration files, client CA certificates, server SSL certificates, GAAP SSL certificates, and origin server CA certificates.
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCertificateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateDomain) is used to create the access domain name for the HTTP/HTTPS listener. Clients request the backend data by accessing this domain.
This API only supports connections of version 3.0.
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to customize the error code of an error response to the specified domain name.
     * @param req CreateDomainErrorPageInfoRequest
     * @return CreateDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainErrorPageInfoResponse CreateDomainErrorPageInfo(CreateDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainErrorPageInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainErrorPageInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDomainErrorPageInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateHTTPListener) is used to create an HTTP listener in the connection instance.
     * @param req CreateHTTPListenerRequest
     * @return CreateHTTPListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPListenerResponse CreateHTTPListener(CreateHTTPListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHTTPListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHTTPListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateHTTPListener) is used to create an HTTPS listener in the connection instance.
     * @param req CreateHTTPSListenerRequest
     * @return CreateHTTPSListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPSListenerResponse CreateHTTPSListener(CreateHTTPSListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHTTPSListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPSListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHTTPSListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateProxy) is used to create an acceleration connection with specified configuration.
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProxy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateProxyGroup) is used to create a connection group.
     * @param req CreateProxyGroupRequest
     * @return CreateProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupResponse CreateProxyGroup(CreateProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProxyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateProxyGroupDomain) is used to create the connection group domain name, and enable the domain name resolution.
     * @param req CreateProxyGroupDomainRequest
     * @return CreateProxyGroupDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupDomainResponse CreateProxyGroupDomain(CreateProxyGroupDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyGroupDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProxyGroupDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateRule) is used to create the forwarding rules of HTTP/HTTPS listeners.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create security policies.
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add security policy rules.
     * @param req CreateSecurityRulesRequest
     * @return CreateSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityRulesResponse CreateSecurityRules(CreateSecurityRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateTCPListeners) is used to batch create TCP listeners of single connections or connection groups.
     * @param req CreateTCPListenersRequest
     * @return CreateTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateTCPListenersResponse CreateTCPListeners(CreateTCPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTCPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTCPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTCPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateTCPListeners) is used to batch create UDP listeners of single connections or connection groups.
     * @param req CreateUDPListenersRequest
     * @return CreateUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateUDPListenersResponse CreateUDPListeners(CreateUDPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUDPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUDPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUDPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteCertificate) is used to delete certificates.
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCertificateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteDomain) is only applicable to layer-7 listeners. It is used to delete the domain names of this listener, and all the rules under the domain name. All rules bound to the origin server are unbound automatically.
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom error code for a domain name.
     * @param req DeleteDomainErrorPageInfoRequest
     * @return DeleteDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainErrorPageInfoResponse DeleteDomainErrorPageInfo(DeleteDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainErrorPageInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainErrorPageInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDomainErrorPageInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteListeners) is used to batch delete the listeners of a connection or connection group, including layer-4/7 listeners.
     * @param req DeleteListenersRequest
     * @return DeleteListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenersResponse DeleteListeners(DeleteListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteProxyGroup) is used to delete a connection group.
     * @param req DeleteProxyGroupRequest
     * @return DeleteProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProxyGroupResponse DeleteProxyGroup(DeleteProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProxyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProxyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProxyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteRule) is used to delete the forwarding rules of HTTP/HTTPS listeners.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete security policies.
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete security policy rules.
     * @param req DeleteSecurityRulesRequest
     * @return DeleteSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityRulesResponse DeleteSecurityRules(DeleteSecurityRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccessRegions) is used to query acceleration region (client access region).
     * @param req DescribeAccessRegionsRequest
     * @return DescribeAccessRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsResponse DescribeAccessRegions(DescribeAccessRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRegionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccessRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccessRegionsByDestRegion) is used to query the list of the available acceleration regions based on the origin server region.
     * @param req DescribeAccessRegionsByDestRegionRequest
     * @return DescribeAccessRegionsByDestRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsByDestRegionResponse DescribeAccessRegionsByDestRegion(DescribeAccessRegionsByDestRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRegionsByDestRegionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsByDestRegionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccessRegionsByDestRegion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCertificateDetail) is used to query certificate details, including the certificate ID, name, type, content, key, and other information.
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificateDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificateDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCertificates) is used to query the list of available certificates.
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCountryAreaMapping) is used to obtain the country/region code mapping table.
     * @param req DescribeCountryAreaMappingRequest
     * @return DescribeCountryAreaMappingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCountryAreaMappingResponse DescribeCountryAreaMapping(DescribeCountryAreaMappingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCountryAreaMappingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCountryAreaMappingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCountryAreaMapping"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDestRegions) is used to query an origin server region (i.e., the region in which the origin server locates).
     * @param req DescribeDestRegionsRequest
     * @return DescribeDestRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDestRegionsResponse DescribeDestRegions(DescribeDestRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDestRegionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDestRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDestRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the custom error response to a domain name.
     * @param req DescribeDomainErrorPageInfoRequest
     * @return DescribeDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoResponse DescribeDomainErrorPageInfo(DescribeDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainErrorPageInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomainErrorPageInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This is an internal API. It is used to query the information of connections and connection groups from which the statistics can be derived.
     * @param req DescribeGroupAndStatisticsProxyRequest
     * @return DescribeGroupAndStatisticsProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupAndStatisticsProxyResponse DescribeGroupAndStatisticsProxy(DescribeGroupAndStatisticsProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupAndStatisticsProxyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupAndStatisticsProxyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupAndStatisticsProxy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeGroupDomainConfig) is used to obtain the domain name resolution configuration details of a connection group.
     * @param req DescribeGroupDomainConfigRequest
     * @return DescribeGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupDomainConfigResponse DescribeGroupDomainConfig(DescribeGroupDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupDomainConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupDomainConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupDomainConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeHTTPListeners) is used to query HTTP listener information.
     * @param req DescribeHTTPListenersRequest
     * @return DescribeHTTPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPListenersResponse DescribeHTTPListeners(DescribeHTTPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHTTPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHTTPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeHTTPSListeners) is used to query HTTPS listener information.
     * @param req DescribeHTTPSListenersRequest
     * @return DescribeHTTPSListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPSListenersResponse DescribeHTTPSListeners(DescribeHTTPSListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHTTPSListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPSListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHTTPSListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeListenerRealServers) is used to query the origin server list of TCP/UDP listeners, including the list of bound origin servers and origin servers that can be bound.
     * @param req DescribeListenerRealServersRequest
     * @return DescribeListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerRealServersResponse DescribeListenerRealServers(DescribeListenerRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListenerRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeListenerRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query listener statistics, including inbound/outbound bandwidth, inbound/outbound packets, and concurrence data. It supports granularities of 300, 3,600, and 86,400. Default value is the highest within the granularity range.
     * @param req DescribeListenerStatisticsRequest
     * @return DescribeListenerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerStatisticsResponse DescribeListenerStatistics(DescribeListenerStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListenerStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeListenerStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeProxies) is used to query the connection instance list.
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeProxiesStatus) is used to query the connection status list.
     * @param req DescribeProxiesStatusRequest
     * @return DescribeProxiesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesStatusResponse DescribeProxiesStatus(DescribeProxiesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxiesStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxiesStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This is an internal API. It is used to query the information of connections and listeners from which the statistics can be derived.
     * @param req DescribeProxyAndStatisticsListenersRequest
     * @return DescribeProxyAndStatisticsListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyAndStatisticsListenersResponse DescribeProxyAndStatisticsListeners(DescribeProxyAndStatisticsListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyAndStatisticsListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyAndStatisticsListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyAndStatisticsListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeProxyDetail) is used to query connection details.
     * @param req DescribeProxyDetailRequest
     * @return DescribeProxyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyDetailResponse DescribeProxyDetail(DescribeProxyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeProxyGroupDetails) is used to query connection group details.
     * @param req DescribeProxyGroupDetailsRequest
     * @return DescribeProxyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupDetailsResponse DescribeProxyGroupDetails(DescribeProxyGroupDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyGroupDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyGroupDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeProxyGroupList) is used to pull the list of connection groups and the basic information of each connection group.
     * @param req DescribeProxyGroupListRequest
     * @return DescribeProxyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupListResponse DescribeProxyGroupList(DescribeProxyGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query listener statistics, including inbound/outbound bandwidth, inbound/outbound packets, and concurrence data. It supports granularities of 300, 3,600, and 86,400. Default value is the highest within the granularity range.
     * @param req DescribeProxyGroupStatisticsRequest
     * @return DescribeProxyGroupStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupStatisticsResponse DescribeProxyGroupStatistics(DescribeProxyGroupStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyGroupStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyGroupStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query listener statistics, including inbound/outbound bandwidth, inbound/outbound packets, concurrence, packet loss, and latency data. It supports granularities of 300, 3,600, and 86,400. Default value is the highest within the granularity range.
     * @param req DescribeProxyStatisticsRequest
     * @return DescribeProxyStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyStatisticsResponse DescribeProxyStatistics(DescribeProxyStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRealServerStatistics) is used to query the statistics of an origin server’s health check results. Origin server status displayed as 1: normal, or 0: exceptional. The queried origin server must be bound to a listener or rule. The bound listener or rule ID must be specified when querying. This API supports displaying origin server status statistics for the past 1, 3, 6, 12, and 24 hours, with a granularity of 1 minute.
     * @param req DescribeRealServerStatisticsRequest
     * @return DescribeRealServerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServerStatisticsResponse DescribeRealServerStatistics(DescribeRealServerStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServerStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServerStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealServerStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRealServers) is used to query origin server information. It can query all origin server information by project names, and supports fuzzy query by specified IPs or domain names.
     * @param req DescribeRealServersRequest
     * @return DescribeRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersResponse DescribeRealServers(DescribeRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRealServersStatus) is used to query whether an origin server has been bound to a rule or listener.
     * @param req DescribeRealServersStatusRequest
     * @return DescribeRealServersStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersStatusResponse DescribeRealServersStatus(DescribeRealServersStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServersStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealServersStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRegionAndPrice) is used to obtain the origin server regions and the bandwidth price gradient.
     * @param req DescribeRegionAndPriceRequest
     * @return DescribeRegionAndPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionAndPriceResponse DescribeRegionAndPrice(DescribeRegionAndPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionAndPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionAndPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRegionAndPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeResourcesByTag) is used to query corresponding resource information by tags, including connection, connection group, and origin server.
     * @param req DescribeResourcesByTagRequest
     * @return DescribeResourcesByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagResponse DescribeResourcesByTag(DescribeResourcesByTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesByTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourcesByTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRuleRealServers) is used to query forwarding rules-related origin server information, including information of origin servers that can be bound and have been bound.
     * @param req DescribeRuleRealServersRequest
     * @return DescribeRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleRealServersResponse DescribeRuleRealServers(DescribeRuleRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRuleRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRules) is used to query all rule information of a listener, including the domain names, paths, and list of bound origin servers. For version 3.0 connections, this API returns the advanced authentication configuration information of the domain name.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pull the list of rules based on rule ID. It supports pulling 1 to 10 rules at a time.
     * @param req DescribeRulesByRuleIdsRequest
     * @return DescribeRulesByRuleIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByRuleIdsResponse DescribeRulesByRuleIds(DescribeRulesByRuleIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesByRuleIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesByRuleIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRulesByRuleIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain security policy details.
     * @param req DescribeSecurityPolicyDetailRequest
     * @return DescribeSecurityPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyDetailResponse DescribeSecurityPolicyDetail(DescribeSecurityPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityPolicyDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of security rules based on security rule ID. It supports querying 1 to 20 security rules at a time.
     * @param req DescribeSecurityRulesRequest
     * @return DescribeSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRulesResponse DescribeSecurityRules(DescribeSecurityRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTCPListeners) is used to query the TCP listener information of a single connection or connection group.
     * @param req DescribeTCPListenersRequest
     * @return DescribeTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTCPListenersResponse DescribeTCPListeners(DescribeTCPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTCPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTCPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTCPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeUDPListeners) is used to query the UDP listener information of a single connection or connection group.
     * @param req DescribeUDPListenersRequest
     * @return DescribeUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUDPListenersResponse DescribeUDPListeners(DescribeUDPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUDPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUDPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUDPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DestroyProxies) is used to terminate a connection. If terminated, no fees will be incurred.
     * @param req DestroyProxiesRequest
     * @return DestroyProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyProxiesResponse DestroyProxies(DestroyProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceCreateProxy) is used to create the price inquiries of acceleration connections.
     * @param req InquiryPriceCreateProxyRequest
     * @return InquiryPriceCreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateProxyResponse InquiryPriceCreateProxy(InquiryPriceCreateProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateProxyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateProxyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateProxy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyCertificate) is used to modify a domain name certificate of a listener. domain name certificate. This API is only applicable to connections of version 3.0.
     * @param req ModifyCertificateRequest
     * @return ModifyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateResponse ModifyCertificate(ModifyCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyCertificateAttributes) is used to modify certificates, including identification name and certificate content.
     * @param req ModifyCertificateAttributesRequest
     * @return ModifyCertificateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAttributesResponse ModifyCertificateAttributes(ModifyCertificateAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCertificateAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDomain) is used to modify domain names of listeners. For connections of version 3.0, it supports modifying certificates of the domain names.
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyGroupDomainConfig) is used to configure the nearest access domain name of a connection group.
     * @param req ModifyGroupDomainConfigRequest
     * @return ModifyGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupDomainConfigResponse ModifyGroupDomainConfig(ModifyGroupDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupDomainConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupDomainConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGroupDomainConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyHTTPListenerAttribute) is used to modify the HTTP listener configuration information of a connection. Currently only supports modifying listener name.
Note: Grouped connections currently do not support HTTP/HTTPS listeners.
     * @param req ModifyHTTPListenerAttributeRequest
     * @return ModifyHTTPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPListenerAttributeResponse ModifyHTTPListenerAttribute(ModifyHTTPListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHTTPListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHTTPListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyHTTPSListenerAttribute) is used to modify HTTPS listener configurations. It currently do not support connection groups and connections of version 1.0.
     * @param req ModifyHTTPSListenerAttributeRequest
     * @return ModifyHTTPSListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPSListenerAttributeResponse ModifyHTTPSListenerAttribute(ModifyHTTPSListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHTTPSListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPSListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHTTPSListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyProxiesAttribute) is used to modify instance attributes (currently only supports modifying connection name).
     * @param req ModifyProxiesAttributeRequest
     * @return ModifyProxiesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesAttributeResponse ModifyProxiesAttribute(ModifyProxiesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxiesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxiesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyProxiesProject) is used to modify the project to which a connection belongs.
     * @param req ModifyProxiesProjectRequest
     * @return ModifyProxiesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesProjectResponse ModifyProxiesProject(ModifyProxiesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxiesProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxiesProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyProxyConfiguration) is used to modify connection configurations. You can expand or reduce the capacity based on current business requirements. It only supports connections with a Scalarable of 1. Scalarable can be obtained via DescribeProxies API.
     * @param req ModifyProxyConfigurationRequest
     * @return ModifyProxyConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyConfigurationResponse ModifyProxyConfiguration(ModifyProxyConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxyConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxyConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyProxyGroupAttribute) is used to modify connection group attributes. It currently only supports modifying connection group name.
     * @param req ModifyProxyGroupAttributeRequest
     * @return ModifyProxyGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyGroupAttributeResponse ModifyProxyGroupAttribute(ModifyProxyGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxyGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxyGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyRealServerName) is used to modify origin server names.
     * @param req ModifyRealServerNameRequest
     * @return ModifyRealServerNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealServerNameResponse ModifyRealServerName(ModifyRealServerNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRealServerNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRealServerNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRealServerName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyRuleAttribute) is used to modify forwarding rule information, including health check configuration and forwarding policies.
     * @param req ModifyRuleAttributeRequest
     * @return ModifyRuleAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleAttributeResponse ModifyRuleAttribute(ModifyRuleAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRuleAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify security policy rule names.
     * @param req ModifySecurityRuleRequest
     * @return ModifySecurityRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityRuleResponse ModifySecurityRule(ModifySecurityRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySecurityRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyTCPListenerAttribute) is used to modify the TCP listener configuration of a connection instance, including health check configuration and scheduling policies.
     * @param req ModifyTCPListenerAttributeRequest
     * @return ModifyTCPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTCPListenerAttributeResponse ModifyTCPListenerAttribute(ModifyTCPListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTCPListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTCPListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTCPListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyUDPListenerAttribute) is used to modify the UDP listener configuration of a connection instance, including modification of listener names and scheduling policies.
     * @param req ModifyUDPListenerAttributeRequest
     * @return ModifyUDPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUDPListenerAttributeResponse ModifyUDPListenerAttribute(ModifyUDPListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUDPListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUDPListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUDPListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (OpenProxies) is used to enable one or more connections.
     * @param req OpenProxiesRequest
     * @return OpenProxiesResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxiesResponse OpenProxies(OpenProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable security policies.
     * @param req OpenSecurityPolicyRequest
     * @return OpenSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenSecurityPolicyResponse OpenSecurityPolicy(OpenSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the added origin server (server) IP or domain name.
     * @param req RemoveRealServersRequest
     * @return RemoveRealServersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveRealServersResponse RemoveRealServers(RemoveRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (SetAuthentication) is used for the advanced authentication configuration of connections, including authentication methods and their certificates. If only supports connections of version 3.0.
     * @param req SetAuthenticationRequest
     * @return SetAuthenticationResponse
     * @throws TencentCloudSDKException
     */
    public SetAuthenticationResponse SetAuthentication(SetAuthenticationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAuthenticationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetAuthenticationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetAuthentication"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
