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
package com.tencentcloudapi.antiddos.v20200309;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.antiddos.v20200309.models.*;

public class AntiddosClient extends AbstractClient{
    private static String endpoint = "antiddos.tencentcloudapi.com";
    private static String service = "antiddos";
    private static String version = "2020-03-09";
    
    public AntiddosClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AntiddosClient(Credential credential, String region, ClientProfile profile) {
        super(AntiddosClient.endpoint, AntiddosClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind an EIP to an Anti-DDoS Advanced instance or a specified private IP of an ENI.
     * @param req AssociateDDoSEipAddressRequest
     * @return AssociateDDoSEipAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDDoSEipAddressResponse AssociateDDoSEipAddress(AssociateDDoSEipAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDDoSEipAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateDDoSEipAddress", AssociateDDoSEipAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an Anti-DDoS EIP to the specified private IP of a CLB instance.
     * @param req AssociateDDoSEipLoadBalancerRequest
     * @return AssociateDDoSEipLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDDoSEipLoadBalancerResponse AssociateDDoSEipLoadBalancer(AssociateDDoSEipLoadBalancerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDDoSEipLoadBalancerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateDDoSEipLoadBalancer", AssociateDDoSEipLoadBalancerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add an Anti-DDoS IP blocklist/allowlist.
     * @param req CreateBlackWhiteIpListRequest
     * @return CreateBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlackWhiteIpListResponse CreateBlackWhiteIpList(CreateBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateBlackWhiteIpList", CreateBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an IP to an Anti-DDoS Pro instance Both single IP instances and multi-IP instances are available. Note that you should wait until the current binding or unbinding completes before using this async API for new operations.
     * @param req CreateBoundIPRequest
     * @return CreateBoundIPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBoundIPResponse CreateBoundIP(CreateBoundIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBoundIPResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateBoundIP", CreateBoundIPResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a CC precise protection policy.
     * @param req CreateCCPrecisionPolicyRequest
     * @return CreateCCPrecisionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCPrecisionPolicyResponse CreateCCPrecisionPolicy(CreateCCPrecisionPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCPrecisionPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCCPrecisionPolicy", CreateCCPrecisionPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a CC frequency limit policy.
     * @param req CreateCCReqLimitPolicyRequest
     * @return CreateCCReqLimitPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCReqLimitPolicyResponse CreateCCReqLimitPolicy(CreateCCReqLimitPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCReqLimitPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCCReqLimitPolicy", CreateCCReqLimitPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a layer 4 access control list to prevent CC attacks.
     * @param req CreateCcBlackWhiteIpListRequest
     * @return CreateCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcBlackWhiteIpListResponse CreateCcBlackWhiteIpList(CreateCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCcBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCcBlackWhiteIpList", CreateCcBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a regional blocking configuration.
     * @param req CreateCcGeoIPBlockConfigRequest
     * @return CreateCcGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcGeoIPBlockConfigResponse CreateCcGeoIPBlockConfig(CreateCcGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCcGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCcGeoIPBlockConfig", CreateCcGeoIPBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set Anti-DDoS AI protection switches.
     * @param req CreateDDoSAIRequest
     * @return CreateDDoSAIResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSAIResponse CreateDDoSAI(CreateDDoSAIRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSAIResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDDoSAI", CreateDDoSAIResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add an Anti-DDoS region blocking configuration.
     * @param req CreateDDoSGeoIPBlockConfigRequest
     * @return CreateDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSGeoIPBlockConfigResponse CreateDDoSGeoIPBlockConfig(CreateDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDDoSGeoIPBlockConfig", CreateDDoSGeoIPBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add Anti-DDoS access rate limit configurations.
     * @param req CreateDDoSSpeedLimitConfigRequest
     * @return CreateDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSSpeedLimitConfigResponse CreateDDoSSpeedLimitConfig(CreateDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDDoSSpeedLimitConfig", CreateDDoSSpeedLimitConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set the default alarm threshold of an IP.
     * @param req CreateDefaultAlarmThresholdRequest
     * @return CreateDefaultAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultAlarmThresholdResponse CreateDefaultAlarmThreshold(CreateDefaultAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDefaultAlarmThreshold", CreateDefaultAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set the default alarm threshold of an IP.
     * @param req CreateIPAlarmThresholdConfigRequest
     * @return CreateIPAlarmThresholdConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateIPAlarmThresholdConfigResponse CreateIPAlarmThresholdConfig(CreateIPAlarmThresholdConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIPAlarmThresholdConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateIPAlarmThresholdConfig", CreateIPAlarmThresholdConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to configure certificates with layer-7 forwarding rules in a batch for SSL testing.
     * @param req CreateL7RuleCertsRequest
     * @return CreateL7RuleCertsResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RuleCertsResponse CreateL7RuleCerts(CreateL7RuleCertsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RuleCertsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL7RuleCerts", CreateL7RuleCertsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add layer-7 forwarding rules.
     * @param req CreateNewL7RulesRequest
     * @return CreateNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNewL7RulesResponse CreateNewL7Rules(CreateNewL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNewL7RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNewL7Rules", CreateNewL7RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add Anti-DDoS feature filtering rules.
     * @param req CreatePacketFilterConfigRequest
     * @return CreatePacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePacketFilterConfigResponse CreatePacketFilterConfig(CreatePacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreatePacketFilterConfig", CreatePacketFilterConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set Anti-DDoS protocol blocking configurations.
     * @param req CreateProtocolBlockConfigRequest
     * @return CreateProtocolBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtocolBlockConfigResponse CreateProtocolBlockConfig(CreateProtocolBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProtocolBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateProtocolBlockConfig", CreateProtocolBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a domain name for IP scheduling and switching.
     * @param req CreateSchedulingDomainRequest
     * @return CreateSchedulingDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchedulingDomainResponse CreateSchedulingDomain(CreateSchedulingDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchedulingDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSchedulingDomain", CreateSchedulingDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add Anti-DDoS watermark configurations.
     * @param req CreateWaterPrintConfigRequest
     * @return CreateWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateWaterPrintConfigResponse CreateWaterPrintConfig(CreateWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateWaterPrintConfig", CreateWaterPrintConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add Anti-DDoS watermark keys.
     * @param req CreateWaterPrintKeyRequest
     * @return CreateWaterPrintKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWaterPrintKeyResponse CreateWaterPrintKey(CreateWaterPrintKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWaterPrintKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateWaterPrintKey", CreateWaterPrintKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a level-defining policy of CC attacks. 
     * @param req DeleteCCLevelPolicyRequest
     * @return DeleteCCLevelPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCLevelPolicyResponse DeleteCCLevelPolicy(DeleteCCLevelPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCLevelPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCCLevelPolicy", DeleteCCLevelPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a CC precise protection policy.
     * @param req DeleteCCPrecisionPolicyRequest
     * @return DeleteCCPrecisionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCPrecisionPolicyResponse DeleteCCPrecisionPolicy(DeleteCCPrecisionPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCPrecisionPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCCPrecisionPolicy", DeleteCCPrecisionPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a CC cleansing threshold policy.
     * @param req DeleteCCThresholdPolicyRequest
     * @return DeleteCCThresholdPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCThresholdPolicyResponse DeleteCCThresholdPolicy(DeleteCCThresholdPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCThresholdPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCCThresholdPolicy", DeleteCCThresholdPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a layer-4 access control list.
     * @param req DeleteCcBlackWhiteIpListRequest
     * @return DeleteCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcBlackWhiteIpListResponse DeleteCcBlackWhiteIpList(DeleteCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCcBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCcBlackWhiteIpList", DeleteCcBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a regional blocking configuration.
     * @param req DeleteCcGeoIPBlockConfigRequest
     * @return DeleteCcGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcGeoIPBlockConfigResponse DeleteCcGeoIPBlockConfig(DeleteCcGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCcGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCcGeoIPBlockConfig", DeleteCcGeoIPBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete Anti-DDoS region blocking configurations.
     * @param req DeleteDDoSGeoIPBlockConfigRequest
     * @return DeleteDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSGeoIPBlockConfigResponse DeleteDDoSGeoIPBlockConfig(DeleteDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDDoSGeoIPBlockConfig", DeleteDDoSGeoIPBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete Anti-DDoS access rate limit configurations.
     * @param req DeleteDDoSSpeedLimitConfigRequest
     * @return DeleteDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSSpeedLimitConfigResponse DeleteDDoSSpeedLimitConfig(DeleteDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDDoSSpeedLimitConfig", DeleteDDoSSpeedLimitConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete Anti-DDoS feature filtering rules.
     * @param req DeletePacketFilterConfigRequest
     * @return DeletePacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePacketFilterConfigResponse DeletePacketFilterConfig(DeletePacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeletePacketFilterConfig", DeletePacketFilterConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete Anti-DDoS watermark configurations.
     * @param req DeleteWaterPrintConfigRequest
     * @return DeleteWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWaterPrintConfigResponse DeleteWaterPrintConfig(DeleteWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteWaterPrintConfig", DeleteWaterPrintConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete Anti-DDoS watermark keys.
     * @param req DeleteWaterPrintKeyRequest
     * @return DeleteWaterPrintKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWaterPrintKeyResponse DeleteWaterPrintKey(DeleteWaterPrintKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWaterPrintKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteWaterPrintKey", DeleteWaterPrintKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to querying the status of Anti-DDoS IP.
     * @param req DescribeBasicDeviceStatusRequest
     * @return DescribeBasicDeviceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDeviceStatusResponse DescribeBasicDeviceStatus(DescribeBasicDeviceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicDeviceStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBasicDeviceStatus", DescribeBasicDeviceStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain Anti-DDoS Pro traffic data.
     * @param req DescribeBgpBizTrendRequest
     * @return DescribeBgpBizTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBgpBizTrendResponse DescribeBgpBizTrend(DescribeBgpBizTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBgpBizTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBgpBizTrend", DescribeBgpBizTrendResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the statistics on the status codes of business traffic.
     * @param req DescribeBizHttpStatusRequest
     * @return DescribeBizHttpStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizHttpStatusResponse DescribeBizHttpStatus(DescribeBizHttpStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBizHttpStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBizHttpStatus", DescribeBizHttpStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the traffic flow data collected in the specified period.
     * @param req DescribeBizTrendRequest
     * @return DescribeBizTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizTrendResponse DescribeBizTrend(DescribeBizTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBizTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBizTrend", DescribeBizTrendResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get an Anti-DDoS IP blocklist/allowlist.
     * @param req DescribeBlackWhiteIpListRequest
     * @return DescribeBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackWhiteIpListResponse DescribeBlackWhiteIpList(DescribeBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBlackWhiteIpList", DescribeBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Gets the list of CC protection levels
     * @param req DescribeCCLevelListRequest
     * @return DescribeCCLevelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCLevelListResponse DescribeCCLevelList(DescribeCCLevelListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCLevelListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCLevelList", DescribeCCLevelListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used the query a level-defining policy of CC attacks
     * @param req DescribeCCLevelPolicyRequest
     * @return DescribeCCLevelPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCLevelPolicyResponse DescribeCCLevelPolicy(DescribeCCLevelPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCLevelPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCLevelPolicy", DescribeCCLevelPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the list of CC precise protection policies.
     * @param req DescribeCCPrecisionPlyListRequest
     * @return DescribeCCPrecisionPlyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCPrecisionPlyListResponse DescribeCCPrecisionPlyList(DescribeCCPrecisionPlyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCPrecisionPlyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCPrecisionPlyList", DescribeCCPrecisionPlyListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of CC cleansing thresholds.
     * @param req DescribeCCThresholdListRequest
     * @return DescribeCCThresholdListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCThresholdListResponse DescribeCCThresholdList(DescribeCCThresholdListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCThresholdListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCThresholdList", DescribeCCThresholdListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get CC attack data, including total QPS peaks, attack QPS, total number of requests and number of attack requests.
     * @param req DescribeCCTrendRequest
     * @return DescribeCCTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCTrendResponse DescribeCCTrend(DescribeCCTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCTrend", DescribeCCTrendResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the layer-4 access control list.
     * @param req DescribeCcBlackWhiteIpListRequest
     * @return DescribeCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcBlackWhiteIpListResponse DescribeCcBlackWhiteIpList(DescribeCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCcBlackWhiteIpList", DescribeCcBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain a list of regional blocking configurations.
     * @param req DescribeCcGeoIPBlockConfigListRequest
     * @return DescribeCcGeoIPBlockConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcGeoIPBlockConfigListResponse DescribeCcGeoIPBlockConfigList(DescribeCcGeoIPBlockConfigListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcGeoIPBlockConfigListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCcGeoIPBlockConfigList", DescribeCcGeoIPBlockConfigListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get DDoS attack traffic bandwidth and attack packet rate.
     * @param req DescribeDDoSTrendRequest
     * @return DescribeDDoSTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSTrendResponse DescribeDDoSTrend(DescribeDDoSTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSTrend", DescribeDDoSTrendResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the default alarm threshold of an IP.
     * @param req DescribeDefaultAlarmThresholdRequest
     * @return DescribeDefaultAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultAlarmThresholdResponse DescribeDefaultAlarmThreshold(DescribeDefaultAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDefaultAlarmThreshold", DescribeDefaultAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query layer-7 rules matched with certificate IDs.
     * @param req DescribeL7RulesBySSLCertIdRequest
     * @return DescribeL7RulesBySSLCertIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7RulesBySSLCertIdResponse DescribeL7RulesBySSLCertId(DescribeL7RulesBySSLCertIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7RulesBySSLCertIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeL7RulesBySSLCertId", DescribeL7RulesBySSLCertIdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS Advanced instances.

     * @param req DescribeListBGPIPInstancesRequest
     * @return DescribeListBGPIPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPIPInstancesResponse DescribeListBGPIPInstances(DescribeListBGPIPInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBGPIPInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListBGPIPInstances", DescribeListBGPIPInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of Anti-DDoS Pro instances.
     * @param req DescribeListBGPInstancesRequest
     * @return DescribeListBGPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPInstancesResponse DescribeListBGPInstances(DescribeListBGPInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBGPInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListBGPInstances", DescribeListBGPInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS IP blocklists/allowlists.
     * @param req DescribeListBlackWhiteIpListRequest
     * @return DescribeListBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBlackWhiteIpListResponse DescribeListBlackWhiteIpList(DescribeListBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListBlackWhiteIpList", DescribeListBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS AI protection switches.
     * @param req DescribeListDDoSAIRequest
     * @return DescribeListDDoSAIResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSAIResponse DescribeListDDoSAI(DescribeListDDoSAIRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListDDoSAIResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListDDoSAI", DescribeListDDoSAIResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS region blocking configurations.
     * @param req DescribeListDDoSGeoIPBlockConfigRequest
     * @return DescribeListDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSGeoIPBlockConfigResponse DescribeListDDoSGeoIPBlockConfig(DescribeListDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListDDoSGeoIPBlockConfig", DescribeListDDoSGeoIPBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS access rate limit configurations.
     * @param req DescribeListDDoSSpeedLimitConfigRequest
     * @return DescribeListDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSSpeedLimitConfigResponse DescribeListDDoSSpeedLimitConfig(DescribeListDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListDDoSSpeedLimitConfig", DescribeListDDoSSpeedLimitConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of IP alarm threshold configurations.
     * @param req DescribeListIPAlarmConfigRequest
     * @return DescribeListIPAlarmConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListIPAlarmConfigResponse DescribeListIPAlarmConfig(DescribeListIPAlarmConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListIPAlarmConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListIPAlarmConfig", DescribeListIPAlarmConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of forwarding listeners.
     * @param req DescribeListListenerRequest
     * @return DescribeListListenerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListListenerResponse DescribeListListener(DescribeListListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListListenerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListListener", DescribeListListenerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS feature filtering rules.
     * @param req DescribeListPacketFilterConfigRequest
     * @return DescribeListPacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListPacketFilterConfigResponse DescribeListPacketFilterConfig(DescribeListPacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListPacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListPacketFilterConfig", DescribeListPacketFilterConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of protection threshold configurations for AI protection switch, protection level, and CC threshold switch.
     * @param req DescribeListProtectThresholdConfigRequest
     * @return DescribeListProtectThresholdConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListProtectThresholdConfigResponse DescribeListProtectThresholdConfig(DescribeListProtectThresholdConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListProtectThresholdConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListProtectThresholdConfig", DescribeListProtectThresholdConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS protocol blocking configurations.
     * @param req DescribeListProtocolBlockConfigRequest
     * @return DescribeListProtocolBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListProtocolBlockConfigResponse DescribeListProtocolBlockConfig(DescribeListProtocolBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListProtocolBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListProtocolBlockConfig", DescribeListProtocolBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of intelligent scheduling domain names.
     * @param req DescribeListSchedulingDomainRequest
     * @return DescribeListSchedulingDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListSchedulingDomainResponse DescribeListSchedulingDomain(DescribeListSchedulingDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListSchedulingDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListSchedulingDomain", DescribeListSchedulingDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a list of Anti-DDoS watermark configurations.
     * @param req DescribeListWaterPrintConfigRequest
     * @return DescribeListWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListWaterPrintConfigResponse DescribeListWaterPrintConfig(DescribeListWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeListWaterPrintConfig", DescribeListWaterPrintConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain layer-7 forwarding rules.
     * @param req DescribeNewL7RulesRequest
     * @return DescribeNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL7RulesResponse DescribeNewL7Rules(DescribeNewL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewL7RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNewL7Rules", DescribeNewL7RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to getting the exception results of the health check on layer-7 forwarding rules.
     * @param req DescribeNewL7RulesErrHealthRequest
     * @return DescribeNewL7RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL7RulesErrHealthResponse DescribeNewL7RulesErrHealth(DescribeNewL7RulesErrHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewL7RulesErrHealthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNewL7RulesErrHealth", DescribeNewL7RulesErrHealthResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the list of DDoS attacks.
     * @param req DescribeOverviewDDoSEventListRequest
     * @return DescribeOverviewDDoSEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewDDoSEventListResponse DescribeOverviewDDoSEventList(DescribeOverviewDDoSEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewDDoSEventListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOverviewDDoSEventList", DescribeOverviewDDoSEventListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of pending risks at the account level.
     * @param req DescribePendingRiskInfoRequest
     * @return DescribePendingRiskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePendingRiskInfoResponse DescribePendingRiskInfo(DescribePendingRiskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePendingRiskInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePendingRiskInfo", DescribePendingRiskInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind an Anti-DDoS EIP.
     * @param req DisassociateDDoSEipAddressRequest
     * @return DisassociateDDoSEipAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDDoSEipAddressResponse DisassociateDDoSEipAddress(DisassociateDDoSEipAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateDDoSEipAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateDDoSEipAddress", DisassociateDDoSEipAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a CC precise protection policy.
     * @param req ModifyCCPrecisionPolicyRequest
     * @return ModifyCCPrecisionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCPrecisionPolicyResponse ModifyCCPrecisionPolicy(ModifyCCPrecisionPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCPrecisionPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCPrecisionPolicy", ModifyCCPrecisionPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a layer-4 access control list.
     * @param req ModifyCcBlackWhiteIpListRequest
     * @return ModifyCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcBlackWhiteIpListResponse ModifyCcBlackWhiteIpList(ModifyCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCcBlackWhiteIpList", ModifyCcBlackWhiteIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify Anti-DDoS region blocking configurations.
     * @param req ModifyDDoSGeoIPBlockConfigRequest
     * @return ModifyDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSGeoIPBlockConfigResponse ModifyDDoSGeoIPBlockConfig(ModifyDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSGeoIPBlockConfig", ModifyDDoSGeoIPBlockConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify Anti-DDoS access rate limit configurations.
     * @param req ModifyDDoSSpeedLimitConfigRequest
     * @return ModifyDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSSpeedLimitConfigResponse ModifyDDoSSpeedLimitConfig(ModifyDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSSpeedLimitConfig", ModifyDDoSSpeedLimitConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify intelligent scheduling domain names.
     * @param req ModifyDomainUsrNameRequest
     * @return ModifyDomainUsrNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUsrNameResponse ModifyDomainUsrName(ModifyDomainUsrNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainUsrNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDomainUsrName", ModifyDomainUsrNameResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify layer-7 forwarding rules.
     * @param req ModifyNewDomainRulesRequest
     * @return ModifyNewDomainRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNewDomainRulesResponse ModifyNewDomainRules(ModifyNewDomainRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNewDomainRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNewDomainRules", ModifyNewDomainRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify Anti-DDoS feature filtering rules.
     * @param req ModifyPacketFilterConfigRequest
     * @return ModifyPacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPacketFilterConfigResponse ModifyPacketFilterConfig(ModifyPacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyPacketFilterConfig", ModifyPacketFilterConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable Anti-DDoS watermark configurations.
     * @param req SwitchWaterPrintConfigRequest
     * @return SwitchWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public SwitchWaterPrintConfigResponse SwitchWaterPrintConfig(SwitchWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SwitchWaterPrintConfig", SwitchWaterPrintConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
