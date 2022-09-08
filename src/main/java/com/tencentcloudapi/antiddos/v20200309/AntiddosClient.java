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
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDDoSEipAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDDoSEipAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDDoSEipLoadBalancerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDDoSEipLoadBalancer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBoundIPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBoundIP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCPrecisionPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCCPrecisionPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCReqLimitPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCCReqLimitPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCcBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCcBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCcGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCcGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSAIResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDDoSAI");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultAlarmThresholdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDefaultAlarmThreshold");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIPAlarmThresholdConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIPAlarmThresholdConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RuleCertsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateL7RuleCerts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProtocolBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProtocolBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchedulingDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchedulingDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWaterPrintKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWaterPrintKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCLevelPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCCLevelPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCPrecisionPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCCPrecisionPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCThresholdPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCCThresholdPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCcBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCcBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCcGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCcGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWaterPrintKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWaterPrintKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicDeviceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBasicDeviceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBizTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBizTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCLevelListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCLevelList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCLevelPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCLevelPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCPrecisionPlyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCPrecisionPlyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCThresholdListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCThresholdList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcGeoIPBlockConfigListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcGeoIPBlockConfigList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultAlarmThresholdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultAlarmThreshold");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7RulesBySSLCertIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeL7RulesBySSLCertId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListBGPIPInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListBGPIPInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a list of Anti-DDoS Pro instances.

     * @param req DescribeListBGPInstancesRequest
     * @return DescribeListBGPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPInstancesResponse DescribeListBGPInstances(DescribeListBGPInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBGPInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListBGPInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListBGPInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListDDoSAIResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListDDoSAI");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListIPAlarmConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListIPAlarmConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListPacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListPacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListProtectThresholdConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListProtectThresholdConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListProtocolBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListProtocolBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListSchedulingDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListSchedulingDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOverviewDDoSEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOverviewDDoSEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateDDoSEipAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateDDoSEipAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCPrecisionPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCCPrecisionPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCcBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainUsrNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainUsrName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNewDomainRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNewDomainRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
