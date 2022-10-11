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
        JsonResponseModel<AddRealServersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindListenerRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindListenerRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindRuleRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindRuleRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckProxyCreateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckProxyCreate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable a connection group. Once disabled, the connection group will no longer generate traffic, but the basic connection configuration fees will still be incurred every day.
     * @param req CloseProxyGroupRequest
     * @return CloseProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyGroupResponse CloseProxyGroup(CloseProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProxyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable a security policy.
     * @param req CloseSecurityPolicyRequest
     * @return CloseSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CloseSecurityPolicyResponse CloseSecurityPolicy(CloseSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom header of the HTTP/HTTPS listener. When client requests reach the listener, they will be forwarded to the origin with this custom hearer.
     * @param req CreateCustomHeaderRequest
     * @return CreateCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomHeaderResponse CreateCustomHeader(CreateCustomHeaderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomHeaderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomHeaderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomHeader");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainErrorPageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainErrorPageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHTTPListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPSListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHTTPSListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create/replicate an acceleration connection with the specified configuration. To replicate a connection, the basic configuration parameters need to be set for the new connection, and `ClonedProxyId` is needed to identify the replicated connection.
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxyGroupDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTCPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTCPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUDPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUDPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a certificate.
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainErrorPageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainErrorPageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a security policy.
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the available accelerator region based on the origin server region.
     * @param req DescribeAccessRegionsByDestRegionRequest
     * @return DescribeAccessRegionsByDestRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsByDestRegionResponse DescribeAccessRegionsByDestRegion(DescribeAccessRegionsByDestRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRegionsByDestRegionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsByDestRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessRegionsByDestRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query names of blocked custom headers.
     * @param req DescribeBlackHeaderRequest
     * @return DescribeBlackHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackHeaderResponse DescribeBlackHeader(DescribeBlackHeaderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlackHeaderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlackHeaderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlackHeader");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificateDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCountryAreaMappingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCountryAreaMapping");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of custom headers.
     * @param req DescribeCustomHeaderRequest
     * @return DescribeCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomHeaderResponse DescribeCustomHeader(DescribeCustomHeaderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomHeaderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomHeaderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomHeader");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDestRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDestRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainErrorPageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the corresponding error response by a custom error ID.
     * @param req DescribeDomainErrorPageInfoByIdsRequest
     * @return DescribeDomainErrorPageInfoByIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoByIdsResponse DescribeDomainErrorPageInfoByIds(DescribeDomainErrorPageInfoByIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainErrorPageInfoByIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoByIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainErrorPageInfoByIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupAndStatisticsProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupAndStatisticsProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHTTPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPSListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHTTPSListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListenerRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListenerStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxiesStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyAndStatisticsListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyAndStatisticsListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyGroupDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyGroupStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the statistics of an origin server's health check results. Origin server status is displayed as 1 (normal) or 0 (exceptional). The queried origin server must be bound to a listener or rule, and the ID of the bound listener or rule must be specified for the query. This API supports displaying origin server status statistics at a 1-minute granularity.
     * @param req DescribeRealServerStatisticsRequest
     * @return DescribeRealServerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServerStatisticsResponse DescribeRealServerStatistics(DescribeRealServerStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServerStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServerStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealServerStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query origin server information. It can query all origin servers under the specified project name, and supports fuzzy query by specified IPs or domain names.
     * @param req DescribeRealServersRequest
     * @return DescribeRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersResponse DescribeRealServers(DescribeRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealServersStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionAndPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegionAndPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcesByTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesByRuleIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRulesByRuleIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTCPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTCPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUDPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUDPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify certificate name and content.
     * @param req ModifyCertificateAttributesRequest
     * @return ModifyCertificateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAttributesResponse ModifyCertificateAttributes(ModifyCertificateAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificateAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGroupDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHTTPListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPSListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHTTPSListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxiesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxiesProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxyConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxyGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRealServerNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRealServerName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRuleAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTCPListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTCPListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUDPListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUDPListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable all connections in a connection group.
     * @param req OpenProxyGroupRequest
     * @return OpenProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxyGroupResponse OpenProxyGroup(OpenProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProxyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a security policy.
     * @param req OpenSecurityPolicyRequest
     * @return OpenSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenSecurityPolicyResponse OpenSecurityPolicy(OpenSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetAuthenticationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAuthentication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
