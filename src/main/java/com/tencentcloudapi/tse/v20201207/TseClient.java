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
package com.tencentcloudapi.tse.v20201207;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tse.v20201207.models.*;

public class TseClient extends AbstractClient{
    private static String endpoint = "tse.intl.tencentcloudapi.com";
    private static String service = "tse";
    private static String version = "2020-12-07";

    public TseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TseClient(Credential credential, String region, ClientProfile profile) {
        super(TseClient.endpoint, TseClient.version, credential, region, profile);
    }

    /**
     *Bind auto scaling policies to gateway groupings in batch
     * @param req BindAutoScalerResourceStrategyToGroupsRequest
     * @return BindAutoScalerResourceStrategyToGroupsResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoScalerResourceStrategyToGroupsResponse BindAutoScalerResourceStrategyToGroups(BindAutoScalerResourceStrategyToGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindAutoScalerResourceStrategyToGroups", BindAutoScalerResourceStrategyToGroupsResponse.class);
    }

    /**
     *Disables WAF protection
     * @param req CloseWafProtectionRequest
     * @return CloseWafProtectionResponse
     * @throws TencentCloudSDKException
     */
    public CloseWafProtectionResponse CloseWafProtection(CloseWafProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseWafProtection", CloseWafProtectionResponse.class);
    }

    /**
     *Create AS policy
     * @param req CreateAutoScalerResourceStrategyRequest
     * @return CreateAutoScalerResourceStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalerResourceStrategyResponse CreateAutoScalerResourceStrategy(CreateAutoScalerResourceStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoScalerResourceStrategy", CreateAutoScalerResourceStrategyResponse.class);
    }

    /**
     *Create a cloud native API gateway instance
     * @param req CreateCloudNativeAPIGatewayRequest
     * @return CreateCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayResponse CreateCloudNativeAPIGateway(CreateCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGateway", CreateCloudNativeAPIGatewayResponse.class);
    }

    /**
     *Create a grayscale rule for the cloud-native gateway
     * @param req CreateCloudNativeAPIGatewayCanaryRuleRequest
     * @return CreateCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCanaryRuleResponse CreateCloudNativeAPIGatewayCanaryRule(CreateCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayCanaryRule", CreateCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *This API is used to create a cloud-native gateway certificate
     * @param req CreateCloudNativeAPIGatewayCertificateRequest
     * @return CreateCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCertificateResponse CreateCloudNativeAPIGatewayCertificate(CreateCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayCertificate", CreateCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *Create a public network configuration
     * @param req CreateCloudNativeAPIGatewayPublicNetworkRequest
     * @return CreateCloudNativeAPIGatewayPublicNetworkResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayPublicNetworkResponse CreateCloudNativeAPIGatewayPublicNetwork(CreateCloudNativeAPIGatewayPublicNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayPublicNetwork", CreateCloudNativeAPIGatewayPublicNetworkResponse.class);
    }

    /**
     *This API is used to create a cloud-native gateway route.
     * @param req CreateCloudNativeAPIGatewayRouteRequest
     * @return CreateCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteResponse CreateCloudNativeAPIGatewayRoute(CreateCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayRoute", CreateCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *This API is used to create a cloud-native gateway traffic throttling plugin.
     * @param req CreateCloudNativeAPIGatewayRouteRateLimitRequest
     * @return CreateCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteRateLimitResponse CreateCloudNativeAPIGatewayRouteRateLimit(CreateCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayRouteRateLimit", CreateCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *Create a cloud-native gateway service
     * @param req CreateCloudNativeAPIGatewayServiceRequest
     * @return CreateCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceResponse CreateCloudNativeAPIGatewayService(CreateCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayService", CreateCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *This API is used to create a traffic throttling plugin for a cloud-native gateway
     * @param req CreateCloudNativeAPIGatewayServiceRateLimitRequest
     * @return CreateCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceRateLimitResponse CreateCloudNativeAPIGatewayServiceRateLimit(CreateCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayServiceRateLimit", CreateCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *Create a lane group
     * @param req CreateGovernanceLaneGroupsRequest
     * @return CreateGovernanceLaneGroupsResponse
     * @throws TencentCloudSDKException
     */
    public CreateGovernanceLaneGroupsResponse CreateGovernanceLaneGroups(CreateGovernanceLaneGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGovernanceLaneGroups", CreateGovernanceLaneGroupsResponse.class);
    }

    /**
     *Create a Cloud Native Gateway Engine group
     * @param req CreateNativeGatewayServerGroupRequest
     * @return CreateNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateNativeGatewayServerGroupResponse CreateNativeGatewayServerGroup(CreateNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNativeGatewayServerGroup", CreateNativeGatewayServerGroupResponse.class);
    }

    /**
     *Create a gateway service source
     * @param req CreateNativeGatewayServiceSourceRequest
     * @return CreateNativeGatewayServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNativeGatewayServiceSourceResponse CreateNativeGatewayServiceSource(CreateNativeGatewayServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNativeGatewayServiceSource", CreateNativeGatewayServiceSourceResponse.class);
    }

    /**
     *Create or edit a cloud-native gateway cross-domain configuration
     * @param req CreateOrModifyCloudNativeAPIGatewayCORSRequest
     * @return CreateOrModifyCloudNativeAPIGatewayCORSResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrModifyCloudNativeAPIGatewayCORSResponse CreateOrModifyCloudNativeAPIGatewayCORS(CreateOrModifyCloudNativeAPIGatewayCORSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrModifyCloudNativeAPIGatewayCORS", CreateOrModifyCloudNativeAPIGatewayCORSResponse.class);
    }

    /**
     *Create a WAF-protected domain name
     * @param req CreateWafDomainsRequest
     * @return CreateWafDomainsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWafDomainsResponse CreateWafDomains(CreateWafDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWafDomains", CreateWafDomainsResponse.class);
    }

    /**
     *Delete AS policy
     * @param req DeleteAutoScalerResourceStrategyRequest
     * @return DeleteAutoScalerResourceStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalerResourceStrategyResponse DeleteAutoScalerResourceStrategy(DeleteAutoScalerResourceStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoScalerResourceStrategy", DeleteAutoScalerResourceStrategyResponse.class);
    }

    /**
     *Delete a cloud native API gateway instance
     * @param req DeleteCloudNativeAPIGatewayRequest
     * @return DeleteCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayResponse DeleteCloudNativeAPIGateway(DeleteCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGateway", DeleteCloudNativeAPIGatewayResponse.class);
    }

    /**
     *This API is used to delete a cloud-native gateway cross-domain plug-in.
     * @param req DeleteCloudNativeAPIGatewayCORSRequest
     * @return DeleteCloudNativeAPIGatewayCORSResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCORSResponse DeleteCloudNativeAPIGatewayCORS(DeleteCloudNativeAPIGatewayCORSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCORS", DeleteCloudNativeAPIGatewayCORSResponse.class);
    }

    /**
     *This API is used to delete the grayscale rule of the cloud-native gateway.
     * @param req DeleteCloudNativeAPIGatewayCanaryRuleRequest
     * @return DeleteCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCanaryRuleResponse DeleteCloudNativeAPIGatewayCanaryRule(DeleteCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCanaryRule", DeleteCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *This API is used to delete a cloud-native gateway cert.
     * @param req DeleteCloudNativeAPIGatewayCertificateRequest
     * @return DeleteCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCertificateResponse DeleteCloudNativeAPIGatewayCertificate(DeleteCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCertificate", DeleteCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *Delete public network configuration
     * @param req DeleteCloudNativeAPIGatewayPublicNetworkRequest
     * @return DeleteCloudNativeAPIGatewayPublicNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayPublicNetworkResponse DeleteCloudNativeAPIGatewayPublicNetwork(DeleteCloudNativeAPIGatewayPublicNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayPublicNetwork", DeleteCloudNativeAPIGatewayPublicNetworkResponse.class);
    }

    /**
     *Delete a cloud-native gateway route
     * @param req DeleteCloudNativeAPIGatewayRouteRequest
     * @return DeleteCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteResponse DeleteCloudNativeAPIGatewayRoute(DeleteCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayRoute", DeleteCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *This API is used to delete a traffic throttling plugin of a cloud-native gateway (Route).
     * @param req DeleteCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteRateLimitResponse DeleteCloudNativeAPIGatewayRouteRateLimit(DeleteCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayRouteRateLimit", DeleteCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *This API is used to delete a cloud-native gateway service.
     * @param req DeleteCloudNativeAPIGatewayServiceRequest
     * @return DeleteCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceResponse DeleteCloudNativeAPIGatewayService(DeleteCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayService", DeleteCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *This API is used to delete the traffic throttling plugin of a cloud-native gateway (Service).
     * @param req DeleteCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceRateLimitResponse DeleteCloudNativeAPIGatewayServiceRateLimit(DeleteCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayServiceRateLimit", DeleteCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *Delete a lane group
     * @param req DeleteGovernanceLaneGroupsRequest
     * @return DeleteGovernanceLaneGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGovernanceLaneGroupsResponse DeleteGovernanceLaneGroups(DeleteGovernanceLaneGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGovernanceLaneGroups", DeleteGovernanceLaneGroupsResponse.class);
    }

    /**
     *Delete a Gateway Instance Group
     * @param req DeleteNativeGatewayServerGroupRequest
     * @return DeleteNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNativeGatewayServerGroupResponse DeleteNativeGatewayServerGroup(DeleteNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNativeGatewayServerGroup", DeleteNativeGatewayServerGroupResponse.class);
    }

    /**
     *Delete a gateway service source instance
     * @param req DeleteNativeGatewayServiceSourceRequest
     * @return DeleteNativeGatewayServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNativeGatewayServiceSourceResponse DeleteNativeGatewayServiceSource(DeleteNativeGatewayServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNativeGatewayServiceSource", DeleteNativeGatewayServiceSourceResponse.class);
    }

    /**
     *Delete a WAF-protected domain name
     * @param req DeleteWafDomainsRequest
     * @return DeleteWafDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWafDomainsResponse DeleteWafDomains(DeleteWafDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWafDomains", DeleteWafDomainsResponse.class);
    }

    /**
     *View AS policy list
     * @param req DescribeAutoScalerResourceStrategiesRequest
     * @return DescribeAutoScalerResourceStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalerResourceStrategiesResponse DescribeAutoScalerResourceStrategies(DescribeAutoScalerResourceStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalerResourceStrategies", DescribeAutoScalerResourceStrategiesResponse.class);
    }

    /**
     *View gateway groupings bound to an auto scaling policy
     * @param req DescribeAutoScalerResourceStrategyBindingGroupsRequest
     * @return DescribeAutoScalerResourceStrategyBindingGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalerResourceStrategyBindingGroupsResponse DescribeAutoScalerResourceStrategyBindingGroups(DescribeAutoScalerResourceStrategyBindingGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalerResourceStrategyBindingGroups", DescribeAutoScalerResourceStrategyBindingGroupsResponse.class);
    }

    /**
     *This API is used to obtain cloud native API gateway instance information.
     * @param req DescribeCloudNativeAPIGatewayRequest
     * @return DescribeCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayResponse DescribeCloudNativeAPIGateway(DescribeCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGateway", DescribeCloudNativeAPIGatewayResponse.class);
    }

    /**
     *Query cloud-native gateway cross-domain configuration
     * @param req DescribeCloudNativeAPIGatewayCORSRequest
     * @return DescribeCloudNativeAPIGatewayCORSResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCORSResponse DescribeCloudNativeAPIGatewayCORS(DescribeCloudNativeAPIGatewayCORSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCORS", DescribeCloudNativeAPIGatewayCORSResponse.class);
    }

    /**
     *Query the grayscale rule list of the cloud-native gateway
     * @param req DescribeCloudNativeAPIGatewayCanaryRulesRequest
     * @return DescribeCloudNativeAPIGatewayCanaryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCanaryRulesResponse DescribeCloudNativeAPIGatewayCanaryRules(DescribeCloudNativeAPIGatewayCanaryRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCanaryRules", DescribeCloudNativeAPIGatewayCanaryRulesResponse.class);
    }

    /**
     *Query the certificate detail of one cloud-native gateway
     * @param req DescribeCloudNativeAPIGatewayCertificateDetailsRequest
     * @return DescribeCloudNativeAPIGatewayCertificateDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCertificateDetailsResponse DescribeCloudNativeAPIGatewayCertificateDetails(DescribeCloudNativeAPIGatewayCertificateDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCertificateDetails", DescribeCloudNativeAPIGatewayCertificateDetailsResponse.class);
    }

    /**
     *Query the certificate list of the cloud-native gateway
     * @param req DescribeCloudNativeAPIGatewayCertificatesRequest
     * @return DescribeCloudNativeAPIGatewayCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCertificatesResponse DescribeCloudNativeAPIGatewayCertificates(DescribeCloudNativeAPIGatewayCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCertificates", DescribeCloudNativeAPIGatewayCertificatesResponse.class);
    }

    /**
     *This API is used to obtain cloud native API gateway instance network configuration information
     * @param req DescribeCloudNativeAPIGatewayConfigRequest
     * @return DescribeCloudNativeAPIGatewayConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayConfigResponse DescribeCloudNativeAPIGatewayConfig(DescribeCloudNativeAPIGatewayConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayConfig", DescribeCloudNativeAPIGatewayConfigResponse.class);
    }

    /**
     *Query cloud native gateway instance information based on public IP address
     * @param req DescribeCloudNativeAPIGatewayInfoByIpRequest
     * @return DescribeCloudNativeAPIGatewayInfoByIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayInfoByIpResponse DescribeCloudNativeAPIGatewayInfoByIp(DescribeCloudNativeAPIGatewayInfoByIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayInfoByIp", DescribeCloudNativeAPIGatewayInfoByIpResponse.class);
    }

    /**
     *This API is used to get a cloud-native gateway node list
     * @param req DescribeCloudNativeAPIGatewayNodesRequest
     * @return DescribeCloudNativeAPIGatewayNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayNodesResponse DescribeCloudNativeAPIGatewayNodes(DescribeCloudNativeAPIGatewayNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayNodes", DescribeCloudNativeAPIGatewayNodesResponse.class);
    }

    /**
     *Retrieve port information of a cloud native API gateway instance
     * @param req DescribeCloudNativeAPIGatewayPortsRequest
     * @return DescribeCloudNativeAPIGatewayPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayPortsResponse DescribeCloudNativeAPIGatewayPorts(DescribeCloudNativeAPIGatewayPortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayPorts", DescribeCloudNativeAPIGatewayPortsResponse.class);
    }

    /**
     *Query the traffic throttling plugin of a cloud-native gateway (Route).
     * @param req DescribeCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRouteRateLimitResponse DescribeCloudNativeAPIGatewayRouteRateLimit(DescribeCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayRouteRateLimit", DescribeCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *Query the routing list of the cloud-native gateway
     * @param req DescribeCloudNativeAPIGatewayRoutesRequest
     * @return DescribeCloudNativeAPIGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRoutesResponse DescribeCloudNativeAPIGatewayRoutes(DescribeCloudNativeAPIGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayRoutes", DescribeCloudNativeAPIGatewayRoutesResponse.class);
    }

    /**
     *This API is used to query the traffic throttling plugin of a cloud-native gateway (Service).
     * @param req DescribeCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServiceRateLimitResponse DescribeCloudNativeAPIGatewayServiceRateLimit(DescribeCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServiceRateLimit", DescribeCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *Query the service list of the cloud-native gateway
     * @param req DescribeCloudNativeAPIGatewayServicesRequest
     * @return DescribeCloudNativeAPIGatewayServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServicesResponse DescribeCloudNativeAPIGatewayServices(DescribeCloudNativeAPIGatewayServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServices", DescribeCloudNativeAPIGatewayServicesResponse.class);
    }

    /**
     *Lightweight query the service list of the cloud-native gateway
     * @param req DescribeCloudNativeAPIGatewayServicesLightRequest
     * @return DescribeCloudNativeAPIGatewayServicesLightResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServicesLightResponse DescribeCloudNativeAPIGatewayServicesLight(DescribeCloudNativeAPIGatewayServicesLightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServicesLight", DescribeCloudNativeAPIGatewayServicesLightResponse.class);
    }

    /**
     *This API is used to query the Upstream list in the service detail of a cloud-native gateway.
     * @param req DescribeCloudNativeAPIGatewayUpstreamRequest
     * @return DescribeCloudNativeAPIGatewayUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayUpstreamResponse DescribeCloudNativeAPIGatewayUpstream(DescribeCloudNativeAPIGatewayUpstreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayUpstream", DescribeCloudNativeAPIGatewayUpstreamResponse.class);
    }

    /**
     *This API is used to obtain the cloud native API gateway instance list.
     * @param req DescribeCloudNativeAPIGatewaysRequest
     * @return DescribeCloudNativeAPIGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaysResponse DescribeCloudNativeAPIGateways(DescribeCloudNativeAPIGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGateways", DescribeCloudNativeAPIGatewaysResponse.class);
    }

    /**
     *Query lane group list
     * @param req DescribeGovernanceLaneGroupsRequest
     * @return DescribeGovernanceLaneGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceLaneGroupsResponse DescribeGovernanceLaneGroups(DescribeGovernanceLaneGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceLaneGroups", DescribeGovernanceLaneGroupsResponse.class);
    }

    /**
     *Query cloud native gateway group information
     * @param req DescribeNativeGatewayServerGroupsRequest
     * @return DescribeNativeGatewayServerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNativeGatewayServerGroupsResponse DescribeNativeGatewayServerGroups(DescribeNativeGatewayServerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNativeGatewayServerGroups", DescribeNativeGatewayServerGroupsResponse.class);
    }

    /**
     *Query the instance list of the gateway service source
     * @param req DescribeNativeGatewayServiceSourcesRequest
     * @return DescribeNativeGatewayServiceSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNativeGatewayServiceSourcesResponse DescribeNativeGatewayServiceSources(DescribeNativeGatewayServiceSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNativeGatewayServiceSources", DescribeNativeGatewayServiceSourcesResponse.class);
    }

    /**
     *This API is used to obtain the service detail of the cloud-native gateway.
     * @param req DescribeOneCloudNativeAPIGatewayServiceRequest
     * @return DescribeOneCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOneCloudNativeAPIGatewayServiceResponse DescribeOneCloudNativeAPIGatewayService(DescribeOneCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOneCloudNativeAPIGatewayService", DescribeOneCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *Query public IP address info
     * @param req DescribePublicAddressConfigRequest
     * @return DescribePublicAddressConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicAddressConfigResponse DescribePublicAddressConfig(DescribePublicAddressConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicAddressConfig", DescribePublicAddressConfigResponse.class);
    }

    /**
     *Query the public network details of a cloud native API gateway instance
     * @param req DescribePublicNetworkRequest
     * @return DescribePublicNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicNetworkResponse DescribePublicNetwork(DescribePublicNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicNetwork", DescribePublicNetworkResponse.class);
    }

    /**
     *This API is used to obtain the health check configuration of the cloud-native gateway service.
     * @param req DescribeUpstreamHealthCheckConfigRequest
     * @return DescribeUpstreamHealthCheckConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpstreamHealthCheckConfigResponse DescribeUpstreamHealthCheckConfig(DescribeUpstreamHealthCheckConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpstreamHealthCheckConfig", DescribeUpstreamHealthCheckConfigResponse.class);
    }

    /**
     *Query a WAF-protected domain name
     * @param req DescribeWafDomainsRequest
     * @return DescribeWafDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafDomainsResponse DescribeWafDomains(DescribeWafDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafDomains", DescribeWafDomainsResponse.class);
    }

    /**
     *Query WAF protection status
     * @param req DescribeWafProtectionRequest
     * @return DescribeWafProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafProtectionResponse DescribeWafProtection(DescribeWafProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafProtection", DescribeWafProtectionResponse.class);
    }

    /**
     *Update AS policy
     * @param req ModifyAutoScalerResourceStrategyRequest
     * @return ModifyAutoScalerResourceStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalerResourceStrategyResponse ModifyAutoScalerResourceStrategy(ModifyAutoScalerResourceStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScalerResourceStrategy", ModifyAutoScalerResourceStrategyResponse.class);
    }

    /**
     *This API is used to modify the basic information of a cloud native API gateway instance.
     * @param req ModifyCloudNativeAPIGatewayRequest
     * @return ModifyCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayResponse ModifyCloudNativeAPIGateway(ModifyCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGateway", ModifyCloudNativeAPIGatewayResponse.class);
    }

    /**
     *Modify the grayscale rule of the cloud-native gateway
     * @param req ModifyCloudNativeAPIGatewayCanaryRuleRequest
     * @return ModifyCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCanaryRuleResponse ModifyCloudNativeAPIGatewayCanaryRule(ModifyCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayCanaryRule", ModifyCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *Update the cloud-native gateway certificate
     * @param req ModifyCloudNativeAPIGatewayCertificateRequest
     * @return ModifyCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCertificateResponse ModifyCloudNativeAPIGatewayCertificate(ModifyCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayCertificate", ModifyCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *This API is used to modify a cloud-native gateway route.
     * @param req ModifyCloudNativeAPIGatewayRouteRequest
     * @return ModifyCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteResponse ModifyCloudNativeAPIGatewayRoute(ModifyCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayRoute", ModifyCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *This API is used to modify the traffic throttling plugin of a cloud-native gateway (Route).
     * @param req ModifyCloudNativeAPIGatewayRouteRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteRateLimitResponse ModifyCloudNativeAPIGatewayRouteRateLimit(ModifyCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayRouteRateLimit", ModifyCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *Modify a cloud-native gateway service
     * @param req ModifyCloudNativeAPIGatewayServiceRequest
     * @return ModifyCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceResponse ModifyCloudNativeAPIGatewayService(ModifyCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayService", ModifyCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *This API is used to modify the traffic throttling plugin of a cloud-native gateway (Service).
     * @param req ModifyCloudNativeAPIGatewayServiceRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceRateLimitResponse ModifyCloudNativeAPIGatewayServiceRateLimit(ModifyCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayServiceRateLimit", ModifyCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *Modify the network configuration of the Konga gateway instance
     * @param req ModifyConsoleNetworkRequest
     * @return ModifyConsoleNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsoleNetworkResponse ModifyConsoleNetwork(ModifyConsoleNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsoleNetwork", ModifyConsoleNetworkResponse.class);
    }

    /**
     *Create a lane group
     * @param req ModifyGovernanceLaneGroupsRequest
     * @return ModifyGovernanceLaneGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernanceLaneGroupsResponse ModifyGovernanceLaneGroups(ModifyGovernanceLaneGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernanceLaneGroups", ModifyGovernanceLaneGroupsResponse.class);
    }

    /**
     *Modify the basic information of a cloud native API gateway instance group
     * @param req ModifyNativeGatewayServerGroupRequest
     * @return ModifyNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNativeGatewayServerGroupResponse ModifyNativeGatewayServerGroup(ModifyNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNativeGatewayServerGroup", ModifyNativeGatewayServerGroupResponse.class);
    }

    /**
     *Modify the gateway service source
     * @param req ModifyNativeGatewayServiceSourceRequest
     * @return ModifyNativeGatewayServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNativeGatewayServiceSourceResponse ModifyNativeGatewayServiceSource(ModifyNativeGatewayServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNativeGatewayServiceSource", ModifyNativeGatewayServiceSourceResponse.class);
    }

    /**
     *Modify the access policy of the Kong cloud native API gateway instance to support allowlist or blocklist.
     * @param req ModifyNetworkAccessStrategyRequest
     * @return ModifyNetworkAccessStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAccessStrategyResponse ModifyNetworkAccessStrategy(ModifyNetworkAccessStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkAccessStrategy", ModifyNetworkAccessStrategyResponse.class);
    }

    /**
     *This API is used to modify the basic information of a cloud native API gateway instance network, such as bandwidth and description, as well as specification upgrade. Only modification of client public network or private network information is supported.
     * @param req ModifyNetworkBasicInfoRequest
     * @return ModifyNetworkBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkBasicInfoResponse ModifyNetworkBasicInfo(ModifyNetworkBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkBasicInfo", ModifyNetworkBasicInfoResponse.class);
    }

    /**
     *Modify the node health status of the upstream instance for the cloud-native gateway
     * @param req ModifyUpstreamNodeStatusRequest
     * @return ModifyUpstreamNodeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUpstreamNodeStatusResponse ModifyUpstreamNodeStatus(ModifyUpstreamNodeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUpstreamNodeStatus", ModifyUpstreamNodeStatusResponse.class);
    }

    /**
     *Enable WAF protection
     * @param req OpenWafProtectionRequest
     * @return OpenWafProtectionResponse
     * @throws TencentCloudSDKException
     */
    public OpenWafProtectionResponse OpenWafProtection(OpenWafProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenWafProtection", OpenWafProtectionResponse.class);
    }

    /**
     *Unbind gateway groupings in batch with auto scaling policy
     * @param req UnbindAutoScalerResourceStrategyFromGroupsRequest
     * @return UnbindAutoScalerResourceStrategyFromGroupsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoScalerResourceStrategyFromGroupsResponse UnbindAutoScalerResourceStrategyFromGroups(UnbindAutoScalerResourceStrategyFromGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindAutoScalerResourceStrategyFromGroups", UnbindAutoScalerResourceStrategyFromGroupsResponse.class);
    }

    /**
     *Modify the certificate information of a cloud-native gateway
     * @param req UpdateCloudNativeAPIGatewayCertificateInfoRequest
     * @return UpdateCloudNativeAPIGatewayCertificateInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewayCertificateInfoResponse UpdateCloudNativeAPIGatewayCertificateInfo(UpdateCloudNativeAPIGatewayCertificateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewayCertificateInfo", UpdateCloudNativeAPIGatewayCertificateInfoResponse.class);
    }

    /**
     *Modify the node specification information of a cloud native API gateway instance, such as node scaling or specification adjustment
     * @param req UpdateCloudNativeAPIGatewaySpecRequest
     * @return UpdateCloudNativeAPIGatewaySpecResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewaySpecResponse UpdateCloudNativeAPIGatewaySpec(UpdateCloudNativeAPIGatewaySpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewaySpec", UpdateCloudNativeAPIGatewaySpecResponse.class);
    }

    /**
     *This API is used to update the health check configuration of the cloud-native gateway.
     * @param req UpdateUpstreamHealthCheckConfigRequest
     * @return UpdateUpstreamHealthCheckConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUpstreamHealthCheckConfigResponse UpdateUpstreamHealthCheckConfig(UpdateUpstreamHealthCheckConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUpstreamHealthCheckConfig", UpdateUpstreamHealthCheckConfigResponse.class);
    }

    /**
     *Refresh the upstream instance list of the gateway, only supported for the IPList service type
     * @param req UpdateUpstreamTargetsRequest
     * @return UpdateUpstreamTargetsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUpstreamTargetsResponse UpdateUpstreamTargets(UpdateUpstreamTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUpstreamTargets", UpdateUpstreamTargetsResponse.class);
    }

}
