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
    private static String service = "dayu";
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
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateBasicDDoSAlarmThreshold", CreateBasicDDoSAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an IP to an Anti-DDoS Pro instance, which supports both single IP instances and multi-IP instances. It should be noted that this API is async; therefore, if a binding/unbinding operation is in progress, new binding/unbinding operations cannot be initiated.
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
     *This API is used to add an access frequency control rule for CC protection.
     * @param req CreateCCFrequencyRulesRequest
     * @return CreateCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCFrequencyRulesResponse CreateCCFrequencyRules(CreateCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCFrequencyRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCCFrequencyRules", CreateCCFrequencyRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a custom CC policy.
     * @param req CreateCCSelfDefinePolicyRequest
     * @return CreateCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCSelfDefinePolicyResponse CreateCCSelfDefinePolicy(CreateCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCSelfDefinePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCCSelfDefinePolicy", CreateCCSelfDefinePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add an advanced DDoS policy.
     * @param req CreateDDoSPolicyRequest
     * @return CreateDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSPolicyResponse CreateDDoSPolicy(CreateDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDDoSPolicy", CreateDDoSPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a policy scenario.
     * @param req CreateDDoSPolicyCaseRequest
     * @return CreateDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSPolicyCaseResponse CreateDDoSPolicyCase(CreateDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSPolicyCaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDDoSPolicyCase", CreateDDoSPolicyCaseResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to rename a resource instance, which supports single IP instances, multi-IP instances, Anti-DDoS Advanced, and Anti-DDoS Ultimate.
     * @param req CreateInstanceNameRequest
     * @return CreateInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNameResponse CreateInstanceName(CreateInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateInstanceName", CreateInstanceNameResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to upload layer-4 health check configuration.
     * @param req CreateL4HealthConfigRequest
     * @return CreateL4HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4HealthConfigResponse CreateL4HealthConfig(CreateL4HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4HealthConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL4HealthConfig", CreateL4HealthConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a layer-4 forwarding rule.
     * @param req CreateL4RulesRequest
     * @return CreateL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4RulesResponse CreateL4Rules(CreateL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL4Rules", CreateL4RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a custom frequency control rule for layer-7 CC access (it works in the IP + Host dimension and does not support specific URIs). As it has been disused, please call the new `CreateCCFrequencyRules` API, which supports both IP + Host and URI.
     * @param req CreateL7CCRuleRequest
     * @return CreateL7CCRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7CCRuleResponse CreateL7CCRule(CreateL7CCRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7CCRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL7CCRule", CreateL7CCRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to upload layer-7 health check configuration.
     * @param req CreateL7HealthConfigRequest
     * @return CreateL7HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7HealthConfigResponse CreateL7HealthConfig(CreateL7HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7HealthConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL7HealthConfig", CreateL7HealthConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to configure a certificate for a layer-7 forwarding rule.
     * @param req CreateL7RuleCertRequest
     * @return CreateL7RuleCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RuleCertResponse CreateL7RuleCert(CreateL7RuleCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RuleCertResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL7RuleCert", CreateL7RuleCertResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a layer-7 (website) forwarding rule.
     * @param req CreateL7RulesRequest
     * @return CreateL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesResponse CreateL7Rules(CreateL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL7Rules", CreateL7RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to upload layer-7 forwarding rules in batches.
     * @param req CreateL7RulesUploadRequest
     * @return CreateL7RulesUploadResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesUploadResponse CreateL7RulesUpload(CreateL7RulesUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesUploadResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateL7RulesUpload", CreateL7RulesUploadResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to switch to the real server in Anti-DDoS Ultimate.
     * @param req CreateNetReturnRequest
     * @return CreateNetReturnResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetReturnResponse CreateNetReturn(CreateNetReturnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetReturnResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetReturn", CreateNetReturnResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch upload Layer-7 forwarding rules.
     * @param req CreateNewL7RulesUploadRequest
     * @return CreateNewL7RulesUploadResponse
     * @throws TencentCloudSDKException
     */
    public CreateNewL7RulesUploadResponse CreateNewL7RulesUpload(CreateNewL7RulesUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNewL7RulesUploadResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNewL7RulesUpload", CreateNewL7RulesUploadResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unblock an IP.
     * @param req CreateUnblockIpRequest
     * @return CreateUnblockIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnblockIpResponse CreateUnblockIp(CreateUnblockIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUnblockIpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateUnblockIp", CreateUnblockIpResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an access frequency control rule for CC protection.
     * @param req DeleteCCFrequencyRulesRequest
     * @return DeleteCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCFrequencyRulesResponse DeleteCCFrequencyRules(DeleteCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCFrequencyRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCCFrequencyRules", DeleteCCFrequencyRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a custom CC policy.
     * @param req DeleteCCSelfDefinePolicyRequest
     * @return DeleteCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCSelfDefinePolicyResponse DeleteCCSelfDefinePolicy(DeleteCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCSelfDefinePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCCSelfDefinePolicy", DeleteCCSelfDefinePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an advanced DDoS protection policy.
     * @param req DeleteDDoSPolicyRequest
     * @return DeleteDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSPolicyResponse DeleteDDoSPolicy(DeleteDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDDoSPolicy", DeleteDDoSPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a policy scenario.
     * @param req DeleteDDoSPolicyCaseRequest
     * @return DeleteDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSPolicyCaseResponse DeleteDDoSPolicyCase(DeleteDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSPolicyCaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDDoSPolicyCase", DeleteDDoSPolicyCaseResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete one or more layer-4 forwarding rules.
     * @param req DeleteL4RulesRequest
     * @return DeleteL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4RulesResponse DeleteL4Rules(DeleteL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL4RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteL4Rules", DeleteL4RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete one or more layer-7 forwarding rules.
     * @param req DeleteL7RulesRequest
     * @return DeleteL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7RulesResponse DeleteL7Rules(DeleteL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL7RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteL7Rules", DeleteL7RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get operation logs.
     * @param req DescribeActionLogRequest
     * @return DescribeActionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActionLogResponse DescribeActionLog(DescribeActionLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeActionLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeActionLog", DescribeActionLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the maximum number of layer-7 rules that can be added for Anti-DDoS Advanced.

     * @param req DescribeBGPIPL7RuleMaxCntRequest
     * @return DescribeBGPIPL7RuleMaxCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBGPIPL7RuleMaxCntResponse DescribeBGPIPL7RuleMaxCnt(DescribeBGPIPL7RuleMaxCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBGPIPL7RuleMaxCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBGPIPL7RuleMaxCnt", DescribeBGPIPL7RuleMaxCntResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to provide business forwarding metric data of Anti-DDoS services.
     * @param req DescribeBaradDataRequest
     * @return DescribeBaradDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaradDataResponse DescribeBaradData(DescribeBaradDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaradDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBaradData", DescribeBaradDataResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the CC protection threshold of Anti-DDoS Basic.
     * @param req DescribeBasicCCThresholdRequest
     * @return DescribeBasicCCThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicCCThresholdResponse DescribeBasicCCThreshold(DescribeBasicCCThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicCCThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBasicCCThreshold", DescribeBasicCCThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the blackhole threshold of Anti-DDoS Basic.
     * @param req DescribeBasicDeviceThresholdRequest
     * @return DescribeBasicDeviceThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDeviceThresholdResponse DescribeBasicDeviceThreshold(DescribeBasicDeviceThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicDeviceThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBasicDeviceThreshold", DescribeBasicDeviceThresholdResponse.class);
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
     *This API is used to get the alarm notification threshold set for CC attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req DescribeCCAlarmThresholdRequest
     * @return DescribeCCAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCAlarmThresholdResponse DescribeCCAlarmThreshold(DescribeCCAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCAlarmThreshold", DescribeCCAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the CC attack event list.
     * @param req DescribeCCEvListRequest
     * @return DescribeCCEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCEvListResponse DescribeCCEvList(DescribeCCEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCEvListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCEvList", DescribeCCEvListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get an access frequency control rule for CC protection.
     * @param req DescribeCCFrequencyRulesRequest
     * @return DescribeCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCFrequencyRulesResponse DescribeCCFrequencyRules(DescribeCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCFrequencyRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCFrequencyRules", DescribeCCFrequencyRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the CC IP blocklist/allowlist.
     * @param req DescribeCCIpAllowDenyRequest
     * @return DescribeCCIpAllowDenyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCIpAllowDenyResponse DescribeCCIpAllowDeny(DescribeCCIpAllowDenyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCIpAllowDenyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCIpAllowDeny", DescribeCCIpAllowDenyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a custom CC policy.
     * @param req DescribeCCSelfDefinePolicyRequest
     * @return DescribeCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCSelfDefinePolicyResponse DescribeCCSelfDefinePolicy(DescribeCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCSelfDefinePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCSelfDefinePolicy", DescribeCCSelfDefinePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get CC attack metric data, including total requests peak (QPS) and attack requests (QPS).
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
     *This API is used to get the CC URL allowlist.
     * @param req DescribeCCUrlAllowRequest
     * @return DescribeCCUrlAllowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCUrlAllowResponse DescribeCCUrlAllow(DescribeCCUrlAllowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCUrlAllowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCCUrlAllow", DescribeCCUrlAllowResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the alarm notification threshold set for DDoS attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req DescribeDDoSAlarmThresholdRequest
     * @return DescribeDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAlarmThresholdResponse DescribeDDoSAlarmThreshold(DescribeDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSAlarmThreshold", DescribeDDoSAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the geographical distribution map of DDoS attack source IPs. It supports display by global regions and Chinese provinces.
     * @param req DescribeDDoSAttackIPRegionMapRequest
     * @return DescribeDDoSAttackIPRegionMapResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackIPRegionMapResponse DescribeDDoSAttackIPRegionMap(DescribeDDoSAttackIPRegionMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackIPRegionMapResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSAttackIPRegionMap", DescribeDDoSAttackIPRegionMapResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack source list.
     * @param req DescribeDDoSAttackSourceRequest
     * @return DescribeDDoSAttackSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackSourceResponse DescribeDDoSAttackSource(DescribeDDoSAttackSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackSourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSAttackSource", DescribeDDoSAttackSourceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack proportion analysis.
     * @param req DescribeDDoSCountRequest
     * @return DescribeDDoSCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSCountResponse DescribeDDoSCount(DescribeDDoSCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSCount", DescribeDDoSCountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS protection status (temporarily disabled status). It is supported for Anti-DDoS Basic, single IP instance, multi-IP instance, Anti-DDoS Advanced, and Anti-DDoS Ultimate. It is used to query whether DDoS protection is temporarily disabled, and if yes, return parameters such as temporary disablement duration.
     * @param req DescribeDDoSDefendStatusRequest
     * @return DescribeDDoSDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSDefendStatusResponse DescribeDDoSDefendStatus(DescribeDDoSDefendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSDefendStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSDefendStatus", DescribeDDoSDefendStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get details of a specific DDoS attack.
     * @param req DescribeDDoSEvInfoRequest
     * @return DescribeDDoSEvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSEvInfoResponse DescribeDDoSEvInfo(DescribeDDoSEvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSEvInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSEvInfo", DescribeDDoSEvInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack event list.
     * @param req DescribeDDoSEvListRequest
     * @return DescribeDDoSEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSEvListResponse DescribeDDoSEvList(DescribeDDoSEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSEvListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSEvList", DescribeDDoSEvListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a DDoS IP attack log.
     * @param req DescribeDDoSIpLogRequest
     * @return DescribeDDoSIpLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSIpLogResponse DescribeDDoSIpLog(DescribeDDoSIpLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSIpLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSIpLog", DescribeDDoSIpLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack proportion analysis for an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetCountRequest
     * @return DescribeDDoSNetCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetCountResponse DescribeDDoSNetCount(DescribeDDoSNetCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSNetCount", DescribeDDoSNetCountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack event details of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetEvInfoRequest
     * @return DescribeDDoSNetEvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetEvInfoResponse DescribeDDoSNetEvInfo(DescribeDDoSNetEvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetEvInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSNetEvInfo", DescribeDDoSNetEvInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack event list of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetEvListRequest
     * @return DescribeDDoSNetEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetEvListResponse DescribeDDoSNetEvList(DescribeDDoSNetEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetEvListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSNetEvList", DescribeDDoSNetEvListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS IP attack logs of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetIpLogRequest
     * @return DescribeDDoSNetIpLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetIpLogResponse DescribeDDoSNetIpLog(DescribeDDoSNetIpLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetIpLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSNetIpLog", DescribeDDoSNetIpLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the DDoS attack metric data of an Anti-DDoS Ultimate resource.
     * @param req DescribeDDoSNetTrendRequest
     * @return DescribeDDoSNetTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetTrendResponse DescribeDDoSNetTrend(DescribeDDoSNetTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSNetTrend", DescribeDDoSNetTrendResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get an advanced DDoS policy.
     * @param req DescribeDDoSPolicyRequest
     * @return DescribeDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSPolicyResponse DescribeDDoSPolicy(DescribeDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSPolicy", DescribeDDoSPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the data of DDoS attack traffic bandwidth and attack packet rate.
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
     *This API is used to count the number of days of Anti-DDoS resource use and number of DDoS attacks defended against.
     * @param req DescribeDDoSUsedStatisRequest
     * @return DescribeDDoSUsedStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSUsedStatisResponse DescribeDDoSUsedStatis(DescribeDDoSUsedStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSUsedStatisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDDoSUsedStatis", DescribeDDoSUsedStatisResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the Tencent Cloud asset information corresponding to an IP of a single IP instance or multi-IP instance, which is supported only for IPs of single IP instances and multi-IP instances.
     * @param req DescribeIPProductInfoRequest
     * @return DescribeIPProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPProductInfoResponse DescribeIPProductInfo(DescribeIPProductInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPProductInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIPProductInfo", DescribeIPProductInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the guarantee package list.
     * @param req DescribeInsurePacksRequest
     * @return DescribeInsurePacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsurePacksResponse DescribeInsurePacks(DescribeInsurePacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInsurePacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInsurePacks", DescribeInsurePacksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the blocked IP list.
     * @param req DescribeIpBlockListRequest
     * @return DescribeIpBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpBlockListResponse DescribeIpBlockList(DescribeIpBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpBlockListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIpBlockList", DescribeIpBlockListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the IP unblocking records.
     * @param req DescribeIpUnBlockListRequest
     * @return DescribeIpUnBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpUnBlockListResponse DescribeIpUnBlockList(DescribeIpUnBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpUnBlockListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIpUnBlockList", DescribeIpUnBlockListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the layer-4 health check configuration.
     * @param req DescribeL4HealthConfigRequest
     * @return DescribeL4HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4HealthConfigResponse DescribeL4HealthConfig(DescribeL4HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4HealthConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeL4HealthConfig", DescribeL4HealthConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the exception result of a layer-4 forwarding rule health check.
     * @param req DescribeL4RulesErrHealthRequest
     * @return DescribeL4RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4RulesErrHealthResponse DescribeL4RulesErrHealth(DescribeL4RulesErrHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4RulesErrHealthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeL4RulesErrHealth", DescribeL4RulesErrHealthResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the layer-7 health check configuration.
     * @param req DescribeL7HealthConfigRequest
     * @return DescribeL7HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7HealthConfigResponse DescribeL7HealthConfig(DescribeL7HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7HealthConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeL7HealthConfig", DescribeL7HealthConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the product overview statistics. It is supported for Anti-DDoS Pro, Anti-DDoS Advanced, and Anti-DDoS Ultimate.
     * @param req DescribePackIndexRequest
     * @return DescribePackIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackIndexResponse DescribePackIndex(DescribePackIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePackIndex", DescribePackIndexResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to download the PCAP packet of an attack event.
     * @param req DescribePcapRequest
     * @return DescribePcapResponse
     * @throws TencentCloudSDKException
     */
    public DescribePcapResponse DescribePcap(DescribePcapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePcapResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePcap", DescribePcapResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the policy scenario.
     * @param req DescribePolicyCaseRequest
     * @return DescribePolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyCaseResponse DescribePolicyCase(DescribePolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyCaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePolicyCase", DescribePolicyCaseResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the IP list of a resource.
     * @param req DescribeResIpListRequest
     * @return DescribeResIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResIpListResponse DescribeResIpList(DescribeResIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResIpListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeResIpList", DescribeResIpListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the resource list.
     * @param req DescribeResourceListRequest
     * @return DescribeResourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceListResponse DescribeResourceList(DescribeResourceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeResourceList", DescribeResourceListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the number of rules of a resource.
     * @param req DescribeRuleSetsRequest
     * @return DescribeRuleSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleSetsResponse DescribeRuleSets(DescribeRuleSetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleSetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRuleSets", DescribeRuleSetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Get scheduling domain name list
     * @param req DescribeSchedulingDomainListRequest
     * @return DescribeSchedulingDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulingDomainListResponse DescribeSchedulingDomainList(DescribeSchedulingDomainListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulingDomainListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSchedulingDomainList", DescribeSchedulingDomainListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the security statistics of the current month.
     * @param req DescribeSecIndexRequest
     * @return DescribeSecIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecIndexResponse DescribeSecIndex(DescribeSecIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecIndex", DescribeSecIndexResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the intermediate IP range. It is supported for Anti-DDoS Advanced and Anti-DDoS Ultimate.
     * @param req DescribeSourceIpSegmentRequest
     * @return DescribeSourceIpSegmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIpSegmentResponse DescribeSourceIpSegment(DescribeSourceIpSegmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSourceIpSegmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSourceIpSegment", DescribeSourceIpSegmentResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the business forwarding statistics, including forwarded traffic and packet forwarding rate.
     * @param req DescribeTransmitStatisRequest
     * @return DescribeTransmitStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTransmitStatisResponse DescribeTransmitStatis(DescribeTransmitStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTransmitStatisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTransmitStatis", DescribeTransmitStatisResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the number of blackhole unblockings.
     * @param req DescribeUnBlockStatisRequest
     * @return DescribeUnBlockStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnBlockStatisResponse DescribeUnBlockStatis(DescribeUnBlockStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnBlockStatisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUnBlockStatis", DescribeUnBlockStatisResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a layer-4 forwarding rule.
     * @param req DescribleL4RulesRequest
     * @return DescribleL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleL4RulesResponse DescribleL4Rules(DescribleL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleL4RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribleL4Rules", DescribleL4RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a layer-7 forwarding rule.
     * @param req DescribleL7RulesRequest
     * @return DescribleL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleL7RulesResponse DescribleL7Rules(DescribleL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleL7RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribleL7Rules", DescribleL7RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the number of resource instances in a region.
     * @param req DescribleRegionCountRequest
     * @return DescribleRegionCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribleRegionCountResponse DescribleRegionCount(DescribleRegionCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleRegionCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribleRegionCount", DescribleRegionCountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set the alarm notification threshold for CC attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req ModifyCCAlarmThresholdRequest
     * @return ModifyCCAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCAlarmThresholdResponse ModifyCCAlarmThreshold(ModifyCCAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCAlarmThreshold", ModifyCCAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an access frequency control rule for CC protection.
     * @param req ModifyCCFrequencyRulesRequest
     * @return ModifyCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCFrequencyRulesResponse ModifyCCFrequencyRules(ModifyCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCFrequencyRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCFrequencyRules", ModifyCCFrequencyRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable an access frequency control rule for CC protection.
     * @param req ModifyCCFrequencyRulesStatusRequest
     * @return ModifyCCFrequencyRulesStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCFrequencyRulesStatusResponse ModifyCCFrequencyRulesStatus(ModifyCCFrequencyRulesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCFrequencyRulesStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCFrequencyRulesStatus", ModifyCCFrequencyRulesStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable CC domain name protection.
     * @param req ModifyCCHostProtectionRequest
     * @return ModifyCCHostProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCHostProtectionResponse ModifyCCHostProtection(ModifyCCHostProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCHostProtectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCHostProtection", ModifyCCHostProtectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add/remove a CC IP to/from the blocklist/allowlist.
     * @param req ModifyCCIpAllowDenyRequest
     * @return ModifyCCIpAllowDenyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCIpAllowDenyResponse ModifyCCIpAllowDeny(ModifyCCIpAllowDenyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCIpAllowDenyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCIpAllowDeny", ModifyCCIpAllowDenyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify CC protection level.
     * @param req ModifyCCLevelRequest
     * @return ModifyCCLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCLevelResponse ModifyCCLevel(ModifyCCLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCLevelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCLevel", ModifyCCLevelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable a custom CC policy.
     * @param req ModifyCCPolicySwitchRequest
     * @return ModifyCCPolicySwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCPolicySwitchResponse ModifyCCPolicySwitch(ModifyCCPolicySwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCPolicySwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCPolicySwitch", ModifyCCPolicySwitchResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a custom CC policy.
     * @param req ModifyCCSelfDefinePolicyRequest
     * @return ModifyCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCSelfDefinePolicyResponse ModifyCCSelfDefinePolicy(ModifyCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCSelfDefinePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCSelfDefinePolicy", ModifyCCSelfDefinePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the CC protection threshold.
     * @param req ModifyCCThresholdRequest
     * @return ModifyCCThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCThresholdResponse ModifyCCThreshold(ModifyCCThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCThreshold", ModifyCCThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add/remove a CC URL to/from the allowlist.
     * @param req ModifyCCUrlAllowRequest
     * @return ModifyCCUrlAllowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCUrlAllowResponse ModifyCCUrlAllow(ModifyCCUrlAllowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCUrlAllowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCCUrlAllow", ModifyCCUrlAllowResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to read or modify DDoS AI protection status.
     * @param req ModifyDDoSAIStatusRequest
     * @return ModifyDDoSAIStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSAIStatusResponse ModifyDDoSAIStatus(ModifyDDoSAIStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSAIStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSAIStatus", ModifyDDoSAIStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set the alarm notification threshold for DDoS attacks in Anti-DDoS Pro, Anti-DDoS Advanced, Anti-DDoS Ultimate, and Chess Shield.
     * @param req ModifyDDoSAlarmThresholdRequest
     * @return ModifyDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSAlarmThresholdResponse ModifyDDoSAlarmThreshold(ModifyDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSAlarmThreshold", ModifyDDoSAlarmThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable DDoS. It can disable DDoS protection for a period of time, which will be automatically enabled after the period of time elapses.
     * @param req ModifyDDoSDefendStatusRequest
     * @return ModifyDDoSDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSDefendStatusResponse ModifyDDoSDefendStatus(ModifyDDoSDefendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSDefendStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSDefendStatus", ModifyDDoSDefendStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to read or modify DDoS protection level.
     * @param req ModifyDDoSLevelRequest
     * @return ModifyDDoSLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSLevelResponse ModifyDDoSLevel(ModifyDDoSLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSLevelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSLevel", ModifyDDoSLevelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an advanced DDoS policy.
     * @param req ModifyDDoSPolicyRequest
     * @return ModifyDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyResponse ModifyDDoSPolicy(ModifyDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSPolicy", ModifyDDoSPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a policy scenario.
     * @param req ModifyDDoSPolicyCaseRequest
     * @return ModifyDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyCaseResponse ModifyDDoSPolicyCase(ModifyDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyCaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSPolicyCase", ModifyDDoSPolicyCaseResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to rename an advanced DDoS policy.
     * @param req ModifyDDoSPolicyNameRequest
     * @return ModifyDDoSPolicyNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyNameResponse ModifyDDoSPolicyName(ModifyDDoSPolicyNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSPolicyName", ModifyDDoSPolicyNameResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable DDoS protection, which is only supported for Anti-DDoS Basic.
     * @param req ModifyDDoSSwitchRequest
     * @return ModifyDDoSSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSSwitchResponse ModifyDDoSSwitch(ModifyDDoSSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSSwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSSwitch", ModifyDDoSSwitchResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the DDoS cleansing threshold.
     * @param req ModifyDDoSThresholdRequest
     * @return ModifyDDoSThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSThresholdResponse ModifyDDoSThreshold(ModifyDDoSThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSThresholdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSThreshold", ModifyDDoSThresholdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add, delete, enable, or disable a watermark key.
     * @param req ModifyDDoSWaterKeyRequest
     * @return ModifyDDoSWaterKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSWaterKeyResponse ModifyDDoSWaterKey(ModifyDDoSWaterKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSWaterKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDDoSWaterKey", ModifyDDoSWaterKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the elastic protection threshold.
     * @param req ModifyElasticLimitRequest
     * @return ModifyElasticLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyElasticLimitResponse ModifyElasticLimit(ModifyElasticLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyElasticLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyElasticLimit", ModifyElasticLimitResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the health check parameters of a layer-4 forwarding rule. It is supported for Anti-DDoS Advanced and Anti-DDoS Ultimate.
     * @param req ModifyL4HealthRequest
     * @return ModifyL4HealthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4HealthResponse ModifyL4Health(ModifyL4HealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4HealthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyL4Health", ModifyL4HealthResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the session persistence of a layer-4 forwarding rule. It is supported for Anti-DDoS Advanced and Anti-DDoS Ultimate.
     * @param req ModifyL4KeepTimeRequest
     * @return ModifyL4KeepTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4KeepTimeResponse ModifyL4KeepTime(ModifyL4KeepTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4KeepTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyL4KeepTime", ModifyL4KeepTimeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a layer-4 forwarding rule.
     * @param req ModifyL4RulesRequest
     * @return ModifyL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4RulesResponse ModifyL4Rules(ModifyL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyL4Rules", ModifyL4RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the layer-7 forwarding rules.
     * @param req ModifyL7RulesRequest
     * @return ModifyL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7RulesResponse ModifyL7Rules(ModifyL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7RulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyL7Rules", ModifyL7RulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to switch a client to the real server and set the switch duration when the client is under attack or blocked.
     * @param req ModifyNetReturnSwitchRequest
     * @return ModifyNetReturnSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetReturnSwitchResponse ModifyNetReturnSwitch(ModifyNetReturnSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetReturnSwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNetReturnSwitch", ModifyNetReturnSwitchResponse.class);
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
     *This API is used to modify layer-4 forwarding rules.
     * @param req ModifyNewL4RuleRequest
     * @return ModifyNewL4RuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNewL4RuleResponse ModifyNewL4Rule(ModifyNewL4RuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNewL4RuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNewL4Rule", ModifyNewL4RuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an advanced DDoS policy to an instance.
     * @param req ModifyResBindDDoSPolicyRequest
     * @return ModifyResBindDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResBindDDoSPolicyResponse ModifyResBindDDoSPolicy(ModifyResBindDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResBindDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyResBindDDoSPolicy", ModifyResBindDDoSPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable or disable auto-renewal for a resource.
     * @param req ModifyResourceRenewFlagRequest
     * @return ModifyResourceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceRenewFlagResponse ModifyResourceRenewFlag(ModifyResourceRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyResourceRenewFlag", ModifyResourceRenewFlagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
