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
package com.tencentcloudapi.dayu.v20180709;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dayu.v20180709.models.*;

public class DayuClient extends AbstractClient{
    private static String endpoint = "dayu.tencentcloudapi.com";
    private static String version = "2018-07-09";

    public DayuClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DayuClient(Credential credential, String region, ClientProfile profile) {
        super(DayuClient.endpoint, DayuClient.version, credential, region, profile);
    }

    /**
     *This API is used to set the DDoS alarm threshold for Anti-DDoS Basic, which is only supported for Anti-DDoS Basic.
     * @param req CreateBasicDDoSAlarmThresholdRequest
     * @return CreateBasicDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public CreateBasicDDoSAlarmThresholdResponse CreateBasicDDoSAlarmThreshold(CreateBasicDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBasicDDoSAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBasicDDoSAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateBasicDDoSAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an IP to an Anti-DDoS Pro instance, which supports both single IP instances and multi-IP instances. It should be noted that this API is async; therefore, if a binding/unbinding operation is in progress, new binding/unbinding operations cannot be initiated.
     * @param req CreateBoundIPRequest
     * @return CreateBoundIPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBoundIPResponse CreateBoundIP(CreateBoundIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBoundIPResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBoundIPResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateBoundIP"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add an access frequency control rule for CC protection.
     * @param req CreateCCFrequencyRulesRequest
     * @return CreateCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCFrequencyRulesResponse CreateCCFrequencyRules(CreateCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom CC policy.
     * @param req CreateCCSelfDefinePolicyRequest
     * @return CreateCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCSelfDefinePolicyResponse CreateCCSelfDefinePolicy(CreateCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add an advanced DDoS policy.
     * @param req CreateDDoSPolicyRequest
     * @return CreateDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSPolicyResponse CreateDDoSPolicy(CreateDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a policy scenario.
     * @param req CreateDDoSPolicyCaseRequest
     * @return CreateDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSPolicyCaseResponse CreateDDoSPolicyCase(CreateDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSPolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSPolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDDoSPolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a resource instance, which supports single IP instances, multi-IP instances, Anti-DDoS Advanced, and Anti-DDoS Ultimate.
     * @param req CreateInstanceNameRequest
     * @return CreateInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNameResponse CreateInstanceName(CreateInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstanceName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upload layer-4 health check configuration.
     * @param req CreateL4HealthConfigRequest
     * @return CreateL4HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4HealthConfigResponse CreateL4HealthConfig(CreateL4HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL4HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL4HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a layer-4 forwarding rule.
     * @param req CreateL4RulesRequest
     * @return CreateL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4RulesResponse CreateL4Rules(CreateL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a custom frequency control rule for layer-7 CC access (it works in the IP + Host dimension and does not support specific URIs). As it has been disused, please call the new `CreateCCFrequencyRules` API, which supports both IP + Host and URI.
     * @param req CreateL7CCRuleRequest
     * @return CreateL7CCRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7CCRuleResponse CreateL7CCRule(CreateL7CCRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7CCRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7CCRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7CCRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upload layer-7 health check configuration.
     * @param req CreateL7HealthConfigRequest
     * @return CreateL7HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7HealthConfigResponse CreateL7HealthConfig(CreateL7HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure a certificate for a layer-7 forwarding rule.
     * @param req CreateL7RuleCertRequest
     * @return CreateL7RuleCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RuleCertResponse CreateL7RuleCert(CreateL7RuleCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RuleCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RuleCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7RuleCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a layer-7 (website) forwarding rule.
     * @param req CreateL7RulesRequest
     * @return CreateL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesResponse CreateL7Rules(CreateL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upload layer-7 forwarding rules in batches.
     * @param req CreateL7RulesUploadRequest
     * @return CreateL7RulesUploadResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesUploadResponse CreateL7RulesUpload(CreateL7RulesUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesUploadResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RulesUploadResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7RulesUpload"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to switch to the real server in Anti-DDoS Ultimate.
     * @param req CreateNetReturnRequest
     * @return CreateNetReturnResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetReturnResponse CreateNetReturn(CreateNetReturnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetReturnResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetReturnResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetReturn"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unblock an IP.
     * @param req CreateUnblockIpRequest
     * @return CreateUnblockIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnblockIpResponse CreateUnblockIp(CreateUnblockIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUnblockIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUnblockIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUnblockIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an access frequency control rule for CC protection.
     * @param req DeleteCCFrequencyRulesRequest
     * @return DeleteCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCFrequencyRulesResponse DeleteCCFrequencyRules(DeleteCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom CC policy.
     * @param req DeleteCCSelfDefinePolicyRequest
     * @return DeleteCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCSelfDefinePolicyResponse DeleteCCSelfDefinePolicy(DeleteCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an advanced DDoS protection policy.
     * @param req DeleteDDoSPolicyRequest
     * @return DeleteDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSPolicyResponse DeleteDDoSPolicy(DeleteDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a policy scenario.
     * @param req DeleteDDoSPolicyCaseRequest
     * @return DeleteDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSPolicyCaseResponse DeleteDDoSPolicyCase(DeleteDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSPolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSPolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDDoSPolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more layer-4 forwarding rules.
     * @param req DeleteL4RulesRequest
     * @return DeleteL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4RulesResponse DeleteL4Rules(DeleteL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more layer-7 forwarding rules.
     * @param req DeleteL7RulesRequest
     * @return DeleteL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7RulesResponse DeleteL7Rules(DeleteL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get operation logs.
     * @param req DescribeActionLogRequest
     * @return DescribeActionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActionLogResponse DescribeActionLog(DescribeActionLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeActionLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeActionLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeActionLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the maximum number of layer-7 rules that can be added for Anti-DDoS Advanced.

     * @param req DescribeBGPIPL7RuleMaxCntRequest
     * @return DescribeBGPIPL7RuleMaxCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBGPIPL7RuleMaxCntResponse DescribeBGPIPL7RuleMaxCnt(DescribeBGPIPL7RuleMaxCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBGPIPL7RuleMaxCntResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBGPIPL7RuleMaxCntResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBGPIPL7RuleMaxCnt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to provide business forwarding metric data of Anti-DDoS services.
     * @param req DescribeBaradDataRequest
     * @return DescribeBaradDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaradDataResponse DescribeBaradData(DescribeBaradDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaradDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaradDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBaradData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the CC protection threshold of Anti-DDoS Basic.
     * @param req DescribeBasicCCThresholdRequest
     * @return DescribeBasicCCThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicCCThresholdResponse DescribeBasicCCThreshold(DescribeBasicCCThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicCCThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicCCThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBasicCCThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the blackhole threshold of Anti-DDoS Basic.
     * @param req DescribeBasicDeviceThresholdRequest
     * @return DescribeBasicDeviceThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDeviceThresholdResponse DescribeBasicDeviceThreshold(DescribeBasicDeviceThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicDeviceThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicDeviceThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBasicDeviceThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the alarm notification threshold set for CC attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req DescribeCCAlarmThresholdRequest
     * @return DescribeCCAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCAlarmThresholdResponse DescribeCCAlarmThreshold(DescribeCCAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the CC attack event list.
     * @param req DescribeCCEvListRequest
     * @return DescribeCCEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCEvListResponse DescribeCCEvList(DescribeCCEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCEvListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCEvListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCEvList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get an access frequency control rule for CC protection.
     * @param req DescribeCCFrequencyRulesRequest
     * @return DescribeCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCFrequencyRulesResponse DescribeCCFrequencyRules(DescribeCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the CC IP blocklist/allowlist.
     * @param req DescribeCCIpAllowDenyRequest
     * @return DescribeCCIpAllowDenyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCIpAllowDenyResponse DescribeCCIpAllowDeny(DescribeCCIpAllowDenyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCIpAllowDenyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCIpAllowDenyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCIpAllowDeny"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a custom CC policy.
     * @param req DescribeCCSelfDefinePolicyRequest
     * @return DescribeCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCSelfDefinePolicyResponse DescribeCCSelfDefinePolicy(DescribeCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get CC attack metric data, including total requests peak (QPS) and attack requests (QPS).
     * @param req DescribeCCTrendRequest
     * @return DescribeCCTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCTrendResponse DescribeCCTrend(DescribeCCTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the CC URL allowlist.
     * @param req DescribeCCUrlAllowRequest
     * @return DescribeCCUrlAllowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCUrlAllowResponse DescribeCCUrlAllow(DescribeCCUrlAllowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCUrlAllowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCUrlAllowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCUrlAllow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the alarm notification threshold set for DDoS attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req DescribeDDoSAlarmThresholdRequest
     * @return DescribeDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAlarmThresholdResponse DescribeDDoSAlarmThreshold(DescribeDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the geographical distribution map of DDoS attack source IPs. It supports display by global regions and Chinese provinces.
     * @param req DescribeDDoSAttackIPRegionMapRequest
     * @return DescribeDDoSAttackIPRegionMapResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackIPRegionMapResponse DescribeDDoSAttackIPRegionMap(DescribeDDoSAttackIPRegionMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackIPRegionMapResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackIPRegionMapResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSAttackIPRegionMap"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack source list.
     * @param req DescribeDDoSAttackSourceRequest
     * @return DescribeDDoSAttackSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackSourceResponse DescribeDDoSAttackSource(DescribeDDoSAttackSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackSourceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackSourceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSAttackSource"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack proportion analysis.
     * @param req DescribeDDoSCountRequest
     * @return DescribeDDoSCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSCountResponse DescribeDDoSCount(DescribeDDoSCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSCountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSCountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSCount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS protection status (temporarily disabled status). It is supported for Anti-DDoS Basic, single IP instance, multi-IP instance, Anti-DDoS Advanced, and Anti-DDoS Ultimate. It is used to query whether DDoS protection is temporarily disabled, and if yes, return parameters such as temporary disablement duration.
     * @param req DescribeDDoSDefendStatusRequest
     * @return DescribeDDoSDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSDefendStatusResponse DescribeDDoSDefendStatus(DescribeDDoSDefendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSDefendStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSDefendStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSDefendStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get details of a specific DDoS attack.
     * @param req DescribeDDoSEvInfoRequest
     * @return DescribeDDoSEvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSEvInfoResponse DescribeDDoSEvInfo(DescribeDDoSEvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSEvInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSEvInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSEvInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack event list.
     * @param req DescribeDDoSEvListRequest
     * @return DescribeDDoSEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSEvListResponse DescribeDDoSEvList(DescribeDDoSEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSEvListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSEvListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSEvList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a DDoS IP attack log.
     * @param req DescribeDDoSIpLogRequest
     * @return DescribeDDoSIpLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSIpLogResponse DescribeDDoSIpLog(DescribeDDoSIpLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSIpLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSIpLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSIpLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack proportion analysis for an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetCountRequest
     * @return DescribeDDoSNetCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetCountResponse DescribeDDoSNetCount(DescribeDDoSNetCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetCountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetCountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetCount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack event details of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetEvInfoRequest
     * @return DescribeDDoSNetEvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetEvInfoResponse DescribeDDoSNetEvInfo(DescribeDDoSNetEvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetEvInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetEvInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetEvInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack event list of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetEvListRequest
     * @return DescribeDDoSNetEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetEvListResponse DescribeDDoSNetEvList(DescribeDDoSNetEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetEvListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetEvListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetEvList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS IP attack logs of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetIpLogRequest
     * @return DescribeDDoSNetIpLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetIpLogResponse DescribeDDoSNetIpLog(DescribeDDoSNetIpLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetIpLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetIpLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetIpLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DDoS attack metric data of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetTrendRequest
     * @return DescribeDDoSNetTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetTrendResponse DescribeDDoSNetTrend(DescribeDDoSNetTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get an advanced DDoS policy.
     * @param req DescribeDDoSPolicyRequest
     * @return DescribeDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSPolicyResponse DescribeDDoSPolicy(DescribeDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the data of DDoS attack traffic bandwidth and attack packet rate.
     * @param req DescribeDDoSTrendRequest
     * @return DescribeDDoSTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSTrendResponse DescribeDDoSTrend(DescribeDDoSTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to count the number of days of Anti-DDoS resource use and number of DDoS attacks defended against.
     * @param req DescribeDDoSUsedStatisRequest
     * @return DescribeDDoSUsedStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSUsedStatisResponse DescribeDDoSUsedStatis(DescribeDDoSUsedStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSUsedStatisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSUsedStatisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSUsedStatis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the Tencent Cloud asset information corresponding to an IP of a single IP instance or multi-IP instance, which is supported only for IPs of single IP instances and multi-IP instances.
     * @param req DescribeIPProductInfoRequest
     * @return DescribeIPProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPProductInfoResponse DescribeIPProductInfo(DescribeIPProductInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPProductInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPProductInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIPProductInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the guarantee package list.
     * @param req DescribeInsurePacksRequest
     * @return DescribeInsurePacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsurePacksResponse DescribeInsurePacks(DescribeInsurePacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInsurePacksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInsurePacksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInsurePacks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the blocked IP list.
     * @param req DescribeIpBlockListRequest
     * @return DescribeIpBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpBlockListResponse DescribeIpBlockList(DescribeIpBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpBlockListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpBlockListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpBlockList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the IP unblocking records.
     * @param req DescribeIpUnBlockListRequest
     * @return DescribeIpUnBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpUnBlockListResponse DescribeIpUnBlockList(DescribeIpUnBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpUnBlockListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpUnBlockListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpUnBlockList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to export the layer-4 health check configuration.
     * @param req DescribeL4HealthConfigRequest
     * @return DescribeL4HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4HealthConfigResponse DescribeL4HealthConfig(DescribeL4HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the exception result of a layer-4 forwarding rule health check.
     * @param req DescribeL4RulesErrHealthRequest
     * @return DescribeL4RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4RulesErrHealthResponse DescribeL4RulesErrHealth(DescribeL4RulesErrHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4RulesErrHealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4RulesErrHealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4RulesErrHealth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to export the layer-7 health check configuration.
     * @param req DescribeL7HealthConfigRequest
     * @return DescribeL7HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7HealthConfigResponse DescribeL7HealthConfig(DescribeL7HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the product overview statistics. It is supported for Anti-DDoS Pro, Anti-DDoS Advanced, and Anti-DDoS Ultimate.
     * @param req DescribePackIndexRequest
     * @return DescribePackIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackIndexResponse DescribePackIndex(DescribePackIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackIndexResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackIndexResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePackIndex"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to download the PCAP packet of an attack event.
     * @param req DescribePcapRequest
     * @return DescribePcapResponse
     * @throws TencentCloudSDKException
     */
    public DescribePcapResponse DescribePcap(DescribePcapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePcapResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePcapResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePcap"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the policy scenario.
     * @param req DescribePolicyCaseRequest
     * @return DescribePolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyCaseResponse DescribePolicyCase(DescribePolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the IP list of a resource.
     * @param req DescribeResIpListRequest
     * @return DescribeResIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResIpListResponse DescribeResIpList(DescribeResIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResIpListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResIpListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResIpList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the resource list.
     * @param req DescribeResourceListRequest
     * @return DescribeResourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceListResponse DescribeResourceList(DescribeResourceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the number of rules of a resource.
     * @param req DescribeRuleSetsRequest
     * @return DescribeRuleSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleSetsResponse DescribeRuleSets(DescribeRuleSetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleSetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleSetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRuleSets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Get scheduling domain name list
     * @param req DescribeSchedulingDomainListRequest
     * @return DescribeSchedulingDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulingDomainListResponse DescribeSchedulingDomainList(DescribeSchedulingDomainListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulingDomainListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSchedulingDomainListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSchedulingDomainList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the security statistics of the current month.
     * @param req DescribeSecIndexRequest
     * @return DescribeSecIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecIndexResponse DescribeSecIndex(DescribeSecIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecIndexResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecIndexResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecIndex"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the intermediate IP range. It is supported for Anti-DDoS Advanced and Anti-DDoS Ultimate.
     * @param req DescribeSourceIpSegmentRequest
     * @return DescribeSourceIpSegmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIpSegmentResponse DescribeSourceIpSegment(DescribeSourceIpSegmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSourceIpSegmentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSourceIpSegmentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSourceIpSegment"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the business forwarding statistics, including forwarded traffic and packet forwarding rate.
     * @param req DescribeTransmitStatisRequest
     * @return DescribeTransmitStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTransmitStatisResponse DescribeTransmitStatis(DescribeTransmitStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTransmitStatisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTransmitStatisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTransmitStatis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the number of blackhole unblockings.
     * @param req DescribeUnBlockStatisRequest
     * @return DescribeUnBlockStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnBlockStatisResponse DescribeUnBlockStatis(DescribeUnBlockStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnBlockStatisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnBlockStatisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUnBlockStatis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a layer-4 forwarding rule.
     * @param req DescribleL4RulesRequest
     * @return DescribleL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleL4RulesResponse DescribleL4Rules(DescribleL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a layer-7 forwarding rule.
     * @param req DescribleL7RulesRequest
     * @return DescribleL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleL7RulesResponse DescribleL7Rules(DescribleL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the number of resource instances in a region.
     * @param req DescribleRegionCountRequest
     * @return DescribleRegionCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribleRegionCountResponse DescribleRegionCount(DescribleRegionCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleRegionCountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleRegionCountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleRegionCount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the alarm notification threshold for CC attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req ModifyCCAlarmThresholdRequest
     * @return ModifyCCAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCAlarmThresholdResponse ModifyCCAlarmThreshold(ModifyCCAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an access frequency control rule for CC protection.
     * @param req ModifyCCFrequencyRulesRequest
     * @return ModifyCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCFrequencyRulesResponse ModifyCCFrequencyRules(ModifyCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable an access frequency control rule for CC protection.
     * @param req ModifyCCFrequencyRulesStatusRequest
     * @return ModifyCCFrequencyRulesStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCFrequencyRulesStatusResponse ModifyCCFrequencyRulesStatus(ModifyCCFrequencyRulesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCFrequencyRulesStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCFrequencyRulesStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCFrequencyRulesStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable CC domain name protection.
     * @param req ModifyCCHostProtectionRequest
     * @return ModifyCCHostProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCHostProtectionResponse ModifyCCHostProtection(ModifyCCHostProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCHostProtectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCHostProtectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCHostProtection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add/remove a CC IP to/from the blocklist/allowlist.
     * @param req ModifyCCIpAllowDenyRequest
     * @return ModifyCCIpAllowDenyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCIpAllowDenyResponse ModifyCCIpAllowDeny(ModifyCCIpAllowDenyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCIpAllowDenyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCIpAllowDenyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCIpAllowDeny"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify CC protection level.
     * @param req ModifyCCLevelRequest
     * @return ModifyCCLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCLevelResponse ModifyCCLevel(ModifyCCLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCLevelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCLevelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCLevel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable a custom CC policy.
     * @param req ModifyCCPolicySwitchRequest
     * @return ModifyCCPolicySwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCPolicySwitchResponse ModifyCCPolicySwitch(ModifyCCPolicySwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCPolicySwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCPolicySwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCPolicySwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom CC policy.
     * @param req ModifyCCSelfDefinePolicyRequest
     * @return ModifyCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCSelfDefinePolicyResponse ModifyCCSelfDefinePolicy(ModifyCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the CC protection threshold.
     * @param req ModifyCCThresholdRequest
     * @return ModifyCCThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCThresholdResponse ModifyCCThreshold(ModifyCCThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add/remove a CC URL to/from the allowlist.
     * @param req ModifyCCUrlAllowRequest
     * @return ModifyCCUrlAllowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCUrlAllowResponse ModifyCCUrlAllow(ModifyCCUrlAllowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCUrlAllowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCUrlAllowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCUrlAllow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to read or modify DDoS AI protection status.
     * @param req ModifyDDoSAIStatusRequest
     * @return ModifyDDoSAIStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSAIStatusResponse ModifyDDoSAIStatus(ModifyDDoSAIStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSAIStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSAIStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSAIStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the alarm notification threshold for DDoS attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req ModifyDDoSAlarmThresholdRequest
     * @return ModifyDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSAlarmThresholdResponse ModifyDDoSAlarmThreshold(ModifyDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable DDoS. It can disable DDoS protection for a period of time, which will be automatically enabled after the period of time elapses.
     * @param req ModifyDDoSDefendStatusRequest
     * @return ModifyDDoSDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSDefendStatusResponse ModifyDDoSDefendStatus(ModifyDDoSDefendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSDefendStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSDefendStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSDefendStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to read or modify DDoS protection level.
     * @param req ModifyDDoSLevelRequest
     * @return ModifyDDoSLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSLevelResponse ModifyDDoSLevel(ModifyDDoSLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSLevelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSLevelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSLevel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an advanced DDoS policy.
     * @param req ModifyDDoSPolicyRequest
     * @return ModifyDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyResponse ModifyDDoSPolicy(ModifyDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a policy scenario.
     * @param req ModifyDDoSPolicyCaseRequest
     * @return ModifyDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyCaseResponse ModifyDDoSPolicyCase(ModifyDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSPolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename an advanced DDoS policy.
     * @param req ModifyDDoSPolicyNameRequest
     * @return ModifyDDoSPolicyNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyNameResponse ModifyDDoSPolicyName(ModifyDDoSPolicyNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSPolicyName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable DDoS protection, which is only supported for Anti-DDoS Basic.
     * @param req ModifyDDoSSwitchRequest
     * @return ModifyDDoSSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSSwitchResponse ModifyDDoSSwitch(ModifyDDoSSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSSwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSSwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSSwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the DDoS cleansing threshold.
     * @param req ModifyDDoSThresholdRequest
     * @return ModifyDDoSThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSThresholdResponse ModifyDDoSThreshold(ModifyDDoSThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add, delete, enable, or disable a watermark key.
     * @param req ModifyDDoSWaterKeyRequest
     * @return ModifyDDoSWaterKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSWaterKeyResponse ModifyDDoSWaterKey(ModifyDDoSWaterKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSWaterKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSWaterKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSWaterKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the elastic protection threshold.
     * @param req ModifyElasticLimitRequest
     * @return ModifyElasticLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyElasticLimitResponse ModifyElasticLimit(ModifyElasticLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyElasticLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyElasticLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyElasticLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the health check parameters of a layer-4 forwarding rule. It is supported for Anti-DDoS Advanced and Anti-DDoS Ultimate.
     * @param req ModifyL4HealthRequest
     * @return ModifyL4HealthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4HealthResponse ModifyL4Health(ModifyL4HealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4HealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4HealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4Health"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the session persistence of a layer-4 forwarding rule. It is supported for Anti-DDoS Advanced and Anti-DDoS Ultimate.
     * @param req ModifyL4KeepTimeRequest
     * @return ModifyL4KeepTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4KeepTimeResponse ModifyL4KeepTime(ModifyL4KeepTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4KeepTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4KeepTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4KeepTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a layer-4 forwarding rule.
     * @param req ModifyL4RulesRequest
     * @return ModifyL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4RulesResponse ModifyL4Rules(ModifyL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the layer-7 forwarding rules.
     * @param req ModifyL7RulesRequest
     * @return ModifyL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7RulesResponse ModifyL7Rules(ModifyL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to switch a client to the real server and set the switch duration when the client is under attack or blocked.
     * @param req ModifyNetReturnSwitchRequest
     * @return ModifyNetReturnSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetReturnSwitchResponse ModifyNetReturnSwitch(ModifyNetReturnSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetReturnSwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetReturnSwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetReturnSwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNewDomainRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNewDomainRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify layer-4 forwarding rules.
     * @param req ModifyNewL4RuleRequest
     * @return ModifyNewL4RuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNewL4RuleResponse ModifyNewL4Rule(ModifyNewL4RuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNewL4RuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNewL4RuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNewL4Rule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an advanced DDoS policy to an instance.
     * @param req ModifyResBindDDoSPolicyRequest
     * @return ModifyResBindDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResBindDDoSPolicyResponse ModifyResBindDDoSPolicy(ModifyResBindDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResBindDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResBindDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyResBindDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable auto-renewal for a resource.
     * @param req ModifyResourceRenewFlagRequest
     * @return ModifyResourceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceRenewFlagResponse ModifyResourceRenewFlag(ModifyResourceRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyResourceRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
