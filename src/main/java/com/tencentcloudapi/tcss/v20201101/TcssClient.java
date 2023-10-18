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
package com.tencentcloudapi.tcss.v20201101;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcss.v20201101.models.*;

public class TcssClient extends AbstractClient{
    private static String endpoint = "tcss.tencentcloudapi.com";
    private static String service = "tcss";
    private static String version = "2020-11-01";
    
    public TcssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcssClient(Credential credential, String region, ClientProfile profile) {
        super(TcssClient.endpoint, TcssClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a task to add and publish a network policy in the container network.
     * @param req AddAndPublishNetworkFirewallPolicyDetailRequest
     * @return AddAndPublishNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAndPublishNetworkFirewallPolicyDetailResponse AddAndPublishNetworkFirewallPolicyDetail(AddAndPublishNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAndPublishNetworkFirewallPolicyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddAndPublishNetworkFirewallPolicyDetail", AddAndPublishNetworkFirewallPolicyDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to configure and publish a YAML network policy in the container network.
     * @param req AddAndPublishNetworkFirewallPolicyYamlDetailRequest
     * @return AddAndPublishNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAndPublishNetworkFirewallPolicyYamlDetailResponse AddAndPublishNetworkFirewallPolicyYamlDetail(AddAndPublishNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAndPublishNetworkFirewallPolicyYamlDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddAndPublishNetworkFirewallPolicyYamlDetail", AddAndPublishNetworkFirewallPolicyYamlDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add the details of an image repository.
     * @param req AddAssetImageRegistryRegistryDetailRequest
     * @return AddAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAssetImageRegistryRegistryDetailResponse AddAssetImageRegistryRegistryDetail(AddAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddAssetImageRegistryRegistryDetail", AddAssetImageRegistryRegistryDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to ignore the specified asset IDs and check item IDs so as to hide the assets contained in the specified check items.
`AddCompliancePolicyItemToWhitelist` is the reference API. Except for the input field, others should be the same, and if not, it may be due to the definition.
     * @param req AddComplianceAssetPolicySetToWhitelistRequest
     * @return AddComplianceAssetPolicySetToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddComplianceAssetPolicySetToWhitelistResponse AddComplianceAssetPolicySetToWhitelist(AddComplianceAssetPolicySetToWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddComplianceAssetPolicySetToWhitelistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddComplianceAssetPolicySetToWhitelist", AddComplianceAssetPolicySetToWhitelistResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to ignore the specified asset IDs and check item IDs so as to hide the assets contained in the specified check items.
`AddCompliancePolicyItemToWhitelist` is the reference API. Except for the input field, others should be the same, and if not, it may be due to the definition.
     * @param req AddCompliancePolicyAssetSetToWhitelistRequest
     * @return AddCompliancePolicyAssetSetToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePolicyAssetSetToWhitelistResponse AddCompliancePolicyAssetSetToWhitelist(AddCompliancePolicyAssetSetToWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCompliancePolicyAssetSetToWhitelistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddCompliancePolicyAssetSetToWhitelist", AddCompliancePolicyAssetSetToWhitelistResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add the specified check item IDs to the allowlist so as to hide the failure result.
     * @param req AddCompliancePolicyItemToWhitelistRequest
     * @return AddCompliancePolicyItemToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePolicyItemToWhitelistResponse AddCompliancePolicyItemToWhitelist(AddCompliancePolicyItemToWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCompliancePolicyItemToWhitelistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddCompliancePolicyItemToWhitelist", AddCompliancePolicyItemToWhitelistResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit an abnormal process policy at runtime.
     * @param req AddEditAbnormalProcessRuleRequest
     * @return AddEditAbnormalProcessRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditAbnormalProcessRuleResponse AddEditAbnormalProcessRule(AddEditAbnormalProcessRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditAbnormalProcessRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEditAbnormalProcessRule", AddEditAbnormalProcessRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit an access control policy at runtime.
     * @param req AddEditAccessControlRuleRequest
     * @return AddEditAccessControlRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditAccessControlRuleResponse AddEditAccessControlRule(AddEditAccessControlRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditAccessControlRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEditAccessControlRule", AddEditAccessControlRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit an automatic licensing rule for local images.
     * @param req AddEditImageAutoAuthorizedRuleRequest
     * @return AddEditImageAutoAuthorizedRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditImageAutoAuthorizedRuleResponse AddEditImageAutoAuthorizedRule(AddEditImageAutoAuthorizedRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditImageAutoAuthorizedRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEditImageAutoAuthorizedRule", AddEditImageAutoAuthorizedRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit an allowed reverse shell at runtime.
     * @param req AddEditReverseShellWhiteListRequest
     * @return AddEditReverseShellWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEditReverseShellWhiteListResponse AddEditReverseShellWhiteList(AddEditReverseShellWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditReverseShellWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEditReverseShellWhiteList", AddEditReverseShellWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit an allowed high-risk syscall at runtime.
     * @param req AddEditRiskSyscallWhiteListRequest
     * @return AddEditRiskSyscallWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEditRiskSyscallWhiteListResponse AddEditRiskSyscallWhiteList(AddEditRiskSyscallWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditRiskSyscallWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEditRiskSyscallWhiteList", AddEditRiskSyscallWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit an alert policy.
     * @param req AddEditWarningRulesRequest
     * @return AddEditWarningRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddEditWarningRulesResponse AddEditWarningRules(AddEditWarningRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditWarningRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEditWarningRules", AddEditWarningRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add an allowed escape.
     * @param req AddEscapeWhiteListRequest
     * @return AddEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEscapeWhiteListResponse AddEscapeWhiteList(AddEscapeWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEscapeWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddEscapeWhiteList", AddEscapeWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add ignored vulnerabilities in a vulnerability scan.
     * @param req AddIgnoreVulRequest
     * @return AddIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public AddIgnoreVulResponse AddIgnoreVul(AddIgnoreVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddIgnoreVulResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddIgnoreVul", AddIgnoreVulResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to add a network policy in the container network.
     * @param req AddNetworkFirewallPolicyDetailRequest
     * @return AddNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddNetworkFirewallPolicyDetailResponse AddNetworkFirewallPolicyDetail(AddNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddNetworkFirewallPolicyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddNetworkFirewallPolicyDetail", AddNetworkFirewallPolicyDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to add a YAML network policy in the container network.
     * @param req AddNetworkFirewallPolicyYamlDetailRequest
     * @return AddNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddNetworkFirewallPolicyYamlDetailResponse AddNetworkFirewallPolicyYamlDetail(AddNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddNetworkFirewallPolicyYamlDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddNetworkFirewallPolicyYamlDetail", AddNetworkFirewallPolicyYamlDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to check a YAML network policy in the container network.
     * @param req CheckNetworkFirewallPolicyYamlRequest
     * @return CheckNetworkFirewallPolicyYamlResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetworkFirewallPolicyYamlResponse CheckNetworkFirewallPolicyYaml(CheckNetworkFirewallPolicyYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckNetworkFirewallPolicyYamlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckNetworkFirewallPolicyYaml", CheckNetworkFirewallPolicyYamlResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check whether an image repository name is duplicated.
     * @param req CheckRepeatAssetImageRegistryRequest
     * @return CheckRepeatAssetImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public CheckRepeatAssetImageRegistryResponse CheckRepeatAssetImageRegistry(CheckRepeatAssetImageRegistryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckRepeatAssetImageRegistryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckRepeatAssetImageRegistry", CheckRepeatAssetImageRegistryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to confirm a network policy in the container network.
     * @param req ConfirmNetworkFirewallPolicyRequest
     * @return ConfirmNetworkFirewallPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmNetworkFirewallPolicyResponse ConfirmNetworkFirewallPolicy(ConfirmNetworkFirewallPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConfirmNetworkFirewallPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ConfirmNetworkFirewallPolicy", ConfirmNetworkFirewallPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export abnormal process rules.
     * @param req CreateAbnormalProcessRulesExportJobRequest
     * @return CreateAbnormalProcessRulesExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAbnormalProcessRulesExportJobResponse CreateAbnormalProcessRulesExportJob(CreateAbnormalProcessRulesExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAbnormalProcessRulesExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAbnormalProcessRulesExportJob", CreateAbnormalProcessRulesExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export file tampering detection rules.
     * @param req CreateAccessControlsRuleExportJobRequest
     * @return CreateAccessControlsRuleExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessControlsRuleExportJobResponse CreateAccessControlsRuleExportJob(CreateAccessControlsRuleExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccessControlsRuleExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAccessControlsRuleExportJob", CreateAccessControlsRuleExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an image scan task for an image repository.
     * @param req CreateAssetImageRegistryScanTaskRequest
     * @return CreateAssetImageRegistryScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageRegistryScanTaskResponse CreateAssetImageRegistryScanTask(CreateAssetImageRegistryScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageRegistryScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAssetImageRegistryScanTask", CreateAssetImageRegistryScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a quick image scan task for an image repository.
     * @param req CreateAssetImageRegistryScanTaskOneKeyRequest
     * @return CreateAssetImageRegistryScanTaskOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageRegistryScanTaskOneKeyResponse CreateAssetImageRegistryScanTaskOneKey(CreateAssetImageRegistryScanTaskOneKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageRegistryScanTaskOneKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAssetImageRegistryScanTaskOneKey", CreateAssetImageRegistryScanTaskOneKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set an image scan.
     * @param req CreateAssetImageScanSettingRequest
     * @return CreateAssetImageScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageScanSettingResponse CreateAssetImageScanSetting(CreateAssetImageScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageScanSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAssetImageScanSetting", CreateAssetImageScanSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an image scan task.
     * @param req CreateAssetImageScanTaskRequest
     * @return CreateAssetImageScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageScanTaskResponse CreateAssetImageScanTask(CreateAssetImageScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAssetImageScanTask", CreateAssetImageScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export the list of trojans in a local image.
     * @param req CreateAssetImageVirusExportJobRequest
     * @return CreateAssetImageVirusExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageVirusExportJobResponse CreateAssetImageVirusExportJob(CreateAssetImageVirusExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageVirusExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAssetImageVirusExportJob", CreateAssetImageVirusExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to install the check component and create a defender.
     * @param req CreateCheckComponentRequest
     * @return CreateCheckComponentResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckComponentResponse CreateCheckComponent(CreateCheckComponentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCheckComponentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCheckComponent", CreateCheckComponentResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a cluster check task to check it for risk items.
     * @param req CreateClusterCheckTaskRequest
     * @return CreateClusterCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterCheckTaskResponse CreateClusterCheckTask(CreateClusterCheckTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterCheckTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateClusterCheckTask", CreateClusterCheckTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a compliance check task for another check triggered at the asset level.
     * @param req CreateComplianceTaskRequest
     * @return CreateComplianceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplianceTaskResponse CreateComplianceTask(CreateComplianceTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateComplianceTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateComplianceTask", CreateComplianceTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of components in a local image.
     * @param req CreateComponentExportJobRequest
     * @return CreateComponentExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateComponentExportJobResponse CreateComponentExportJob(CreateComponentExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateComponentExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateComponentExportJob", CreateComponentExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export vulnerabilities that can be prevented.
     * @param req CreateDefenceVulExportJobRequest
     * @return CreateDefenceVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefenceVulExportJobResponse CreateDefenceVulExportJob(CreateDefenceVulExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefenceVulExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDefenceVulExportJob", CreateDefenceVulExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export emergency vulnerabilities.
     * @param req CreateEmergencyVulExportJobRequest
     * @return CreateEmergencyVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmergencyVulExportJobResponse CreateEmergencyVulExportJob(CreateEmergencyVulExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmergencyVulExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateEmergencyVulExportJob", CreateEmergencyVulExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to asynchronously export escape events.
     * @param req CreateEscapeEventsExportJobRequest
     * @return CreateEscapeEventsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEscapeEventsExportJobResponse CreateEscapeEventsExportJob(CreateEscapeEventsExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEscapeEventsExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateEscapeEventsExportJob", CreateEscapeEventsExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export the allowlist of escapes.
     * @param req CreateEscapeWhiteListExportJobRequest
     * @return CreateEscapeWhiteListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEscapeWhiteListExportJobResponse CreateEscapeWhiteListExportJob(CreateEscapeWhiteListExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEscapeWhiteListExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateEscapeWhiteListExportJob", CreateEscapeWhiteListExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export security compliance information.
     * @param req CreateExportComplianceStatusListJobRequest
     * @return CreateExportComplianceStatusListJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportComplianceStatusListJobResponse CreateExportComplianceStatusListJob(CreateExportComplianceStatusListJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExportComplianceStatusListJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateExportComplianceStatusListJob", CreateExportComplianceStatusListJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export the list of servers.
     * @param req CreateHostExportJobRequest
     * @return CreateHostExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostExportJobResponse CreateHostExportJob(CreateHostExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHostExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateHostExportJob", CreateHostExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an image export task.
     * @param req CreateImageExportJobRequest
     * @return CreateImageExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageExportJobResponse CreateImageExportJob(CreateImageExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateImageExportJob", CreateImageExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create K8sApi abnormal event export jobs.
     * @param req CreateK8sApiAbnormalEventExportJobRequest
     * @return CreateK8sApiAbnormalEventExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateK8sApiAbnormalEventExportJobResponse CreateK8sApiAbnormalEventExportJob(CreateK8sApiAbnormalEventExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateK8sApiAbnormalEventExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateK8sApiAbnormalEventExportJob", CreateK8sApiAbnormalEventExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export rules of K8sApi exceptions. 
     * @param req CreateK8sApiAbnormalRuleExportJobRequest
     * @return CreateK8sApiAbnormalRuleExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateK8sApiAbnormalRuleExportJobResponse CreateK8sApiAbnormalRuleExportJob(CreateK8sApiAbnormalRuleExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateK8sApiAbnormalRuleExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateK8sApiAbnormalRuleExportJob", CreateK8sApiAbnormalRuleExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create K8sApi abnormal event rules.
     * @param req CreateK8sApiAbnormalRuleInfoRequest
     * @return CreateK8sApiAbnormalRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateK8sApiAbnormalRuleInfoResponse CreateK8sApiAbnormalRuleInfo(CreateK8sApiAbnormalRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateK8sApiAbnormalRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateK8sApiAbnormalRuleInfo", CreateK8sApiAbnormalRuleInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to distribute a refresh task in the container network cluster.
     * @param req CreateNetworkFirewallClusterRefreshRequest
     * @return CreateNetworkFirewallClusterRefreshResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallClusterRefreshResponse CreateNetworkFirewallClusterRefresh(CreateNetworkFirewallClusterRefreshRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkFirewallClusterRefreshResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkFirewallClusterRefresh", CreateNetworkFirewallClusterRefreshResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to sync a network policy from the container network cluster.
     * @param req CreateNetworkFirewallPolicyDiscoverRequest
     * @return CreateNetworkFirewallPolicyDiscoverResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallPolicyDiscoverResponse CreateNetworkFirewallPolicyDiscover(CreateNetworkFirewallPolicyDiscoverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkFirewallPolicyDiscoverResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkFirewallPolicyDiscover", CreateNetworkFirewallPolicyDiscoverResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to publish a network policy in the container network.
     * @param req CreateNetworkFirewallPublishRequest
     * @return CreateNetworkFirewallPublishResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallPublishResponse CreateNetworkFirewallPublish(CreateNetworkFirewallPublishRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkFirewallPublishResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkFirewallPublish", CreateNetworkFirewallPublishResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to revoke a network policy in the container network.
     * @param req CreateNetworkFirewallUndoPublishRequest
     * @return CreateNetworkFirewallUndoPublishResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallUndoPublishResponse CreateNetworkFirewallUndoPublish(CreateNetworkFirewallUndoPublishRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkFirewallUndoPublishResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkFirewallUndoPublish", CreateNetworkFirewallUndoPublishResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create or edit the upper limit for elastic billing.
     * @param req CreateOrModifyPostPayCoresRequest
     * @return CreateOrModifyPostPayCoresResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrModifyPostPayCoresResponse CreateOrModifyPostPayCores(CreateOrModifyPostPayCoresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrModifyPostPayCoresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateOrModifyPostPayCores", CreateOrModifyPostPayCoresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to asynchronously export abnormal process events.
     * @param req CreateProcessEventsExportJobRequest
     * @return CreateProcessEventsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessEventsExportJobResponse CreateProcessEventsExportJob(CreateProcessEventsExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProcessEventsExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateProcessEventsExportJob", CreateProcessEventsExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to distribute a task to refresh the asset information.
     * @param req CreateRefreshTaskRequest
     * @return CreateRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRefreshTaskResponse CreateRefreshTask(CreateRefreshTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRefreshTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRefreshTask", CreateRefreshTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export malicious request events.
     * @param req CreateRiskDnsEventExportJobRequest
     * @return CreateRiskDnsEventExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskDnsEventExportJobResponse CreateRiskDnsEventExportJob(CreateRiskDnsEventExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRiskDnsEventExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRiskDnsEventExportJob", CreateRiskDnsEventExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a search template.
     * @param req CreateSearchTemplateRequest
     * @return CreateSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchTemplateResponse CreateSearchTemplate(CreateSearchTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSearchTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSearchTemplate", CreateSearchTemplateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export system vulnerabilities.
     * @param req CreateSystemVulExportJobRequest
     * @return CreateSystemVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSystemVulExportJobResponse CreateSystemVulExportJob(CreateSystemVulExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSystemVulExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSystemVulExportJob", CreateSystemVulExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to perform another virus scan at runtime.
     * @param req CreateVirusScanAgainRequest
     * @return CreateVirusScanAgainResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirusScanAgainResponse CreateVirusScanAgain(CreateVirusScanAgainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVirusScanAgainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVirusScanAgain", CreateVirusScanAgainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to perform a quick virus scan at runtime.
     * @param req CreateVirusScanTaskRequest
     * @return CreateVirusScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirusScanTaskResponse CreateVirusScanTask(CreateVirusScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVirusScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVirusScanTask", CreateVirusScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export containers affected by vulnerabilities.
     * @param req CreateVulContainerExportJobRequest
     * @return CreateVulContainerExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulContainerExportJobResponse CreateVulContainerExportJob(CreateVulContainerExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulContainerExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVulContainerExportJob", CreateVulContainerExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an exploit prevention event export task.
     * @param req CreateVulDefenceEventExportJobRequest
     * @return CreateVulDefenceEventExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulDefenceEventExportJobResponse CreateVulDefenceEventExportJob(CreateVulDefenceEventExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulDefenceEventExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVulDefenceEventExportJob", CreateVulDefenceEventExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export servers with exploit prevention enabled.
     * @param req CreateVulDefenceHostExportJobRequest
     * @return CreateVulDefenceHostExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulDefenceHostExportJobResponse CreateVulDefenceHostExportJob(CreateVulDefenceHostExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulDefenceHostExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVulDefenceHostExportJob", CreateVulDefenceHostExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of vulnerabilities in a local image.
     * @param req CreateVulExportJobRequest
     * @return CreateVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulExportJobResponse CreateVulExportJob(CreateVulExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVulExportJob", CreateVulExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export images affected by vulnerabilities.
     * @param req CreateVulImageExportJobRequest
     * @return CreateVulImageExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulImageExportJobResponse CreateVulImageExportJob(CreateVulImageExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulImageExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVulImageExportJob", CreateVulImageExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a vulnerability scan task.
     * @param req CreateVulScanTaskRequest
     * @return CreateVulScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulScanTaskResponse CreateVulScanTask(CreateVulScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVulScanTask", CreateVulScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to export web vulnerabilities.
     * @param req CreateWebVulExportJobRequest
     * @return CreateWebVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebVulExportJobResponse CreateWebVulExportJob(CreateWebVulExportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWebVulExportJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateWebVulExportJob", CreateWebVulExportJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an abnormal process policy at runtime.
     * @param req DeleteAbnormalProcessRulesRequest
     * @return DeleteAbnormalProcessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAbnormalProcessRulesResponse DeleteAbnormalProcessRules(DeleteAbnormalProcessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAbnormalProcessRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAbnormalProcessRules", DeleteAbnormalProcessRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an access control policy at runtime.
     * @param req DeleteAccessControlRulesRequest
     * @return DeleteAccessControlRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessControlRulesResponse DeleteAccessControlRules(DeleteAccessControlRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessControlRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAccessControlRules", DeleteAccessControlRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unignore the specified asset IDs and check item IDs so as to show the assets contained in the specified check items.
`AddCompliancePolicyAssetSetToWhitelist` is the reference API. Except for the input field, others should be the same, and if not, it may be due to the definition.
     * @param req DeleteComplianceAssetPolicySetFromWhitelistRequest
     * @return DeleteComplianceAssetPolicySetFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteComplianceAssetPolicySetFromWhitelistResponse DeleteComplianceAssetPolicySetFromWhitelist(DeleteComplianceAssetPolicySetFromWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteComplianceAssetPolicySetFromWhitelistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteComplianceAssetPolicySetFromWhitelist", DeleteComplianceAssetPolicySetFromWhitelistResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unignore the specified asset IDs and check item IDs so as to show the assets contained in the specified check items.
     * @param req DeleteCompliancePolicyAssetSetFromWhitelistRequest
     * @return DeleteCompliancePolicyAssetSetFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePolicyAssetSetFromWhitelistResponse DeleteCompliancePolicyAssetSetFromWhitelist(DeleteCompliancePolicyAssetSetFromWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCompliancePolicyAssetSetFromWhitelistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCompliancePolicyAssetSetFromWhitelist", DeleteCompliancePolicyAssetSetFromWhitelistResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to remove the specified check item from the allowlist.
     * @param req DeleteCompliancePolicyItemFromWhitelistRequest
     * @return DeleteCompliancePolicyItemFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePolicyItemFromWhitelistResponse DeleteCompliancePolicyItemFromWhitelist(DeleteCompliancePolicyItemFromWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCompliancePolicyItemFromWhitelistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCompliancePolicyItemFromWhitelist", DeleteCompliancePolicyItemFromWhitelistResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an allowed escape.
     * @param req DeleteEscapeWhiteListRequest
     * @return DeleteEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEscapeWhiteListResponse DeleteEscapeWhiteList(DeleteEscapeWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEscapeWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteEscapeWhiteList", DeleteEscapeWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unignore vulnerabilities in a vulnerability scan.
     * @param req DeleteIgnoreVulRequest
     * @return DeleteIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIgnoreVulResponse DeleteIgnoreVul(DeleteIgnoreVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIgnoreVulResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteIgnoreVul", DeleteIgnoreVulResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a K8sApi abnormal event rules.
     * @param req DeleteK8sApiAbnormalRuleRequest
     * @return DeleteK8sApiAbnormalRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteK8sApiAbnormalRuleResponse DeleteK8sApiAbnormalRule(DeleteK8sApiAbnormalRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteK8sApiAbnormalRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteK8sApiAbnormalRule", DeleteK8sApiAbnormalRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to uninstall the agent.
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMachine", DeleteMachineResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to delete a network policy in the container network.
     * @param req DeleteNetworkFirewallPolicyDetailRequest
     * @return DeleteNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkFirewallPolicyDetailResponse DeleteNetworkFirewallPolicyDetail(DeleteNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkFirewallPolicyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNetworkFirewallPolicyDetail", DeleteNetworkFirewallPolicyDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a reverse shell event at runtime.
     * @param req DeleteReverseShellEventsRequest
     * @return DeleteReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellEventsResponse DeleteReverseShellEvents(DeleteReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReverseShellEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteReverseShellEvents", DeleteReverseShellEventsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an allowed reverse shell at runtime.
     * @param req DeleteReverseShellWhiteListsRequest
     * @return DeleteReverseShellWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellWhiteListsResponse DeleteReverseShellWhiteLists(DeleteReverseShellWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReverseShellWhiteListsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteReverseShellWhiteLists", DeleteReverseShellWhiteListsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a high-risk syscall event at runtime.
     * @param req DeleteRiskSyscallEventsRequest
     * @return DeleteRiskSyscallEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskSyscallEventsResponse DeleteRiskSyscallEvents(DeleteRiskSyscallEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRiskSyscallEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRiskSyscallEvents", DeleteRiskSyscallEventsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an allowed high-risk syscall at runtime.
     * @param req DeleteRiskSyscallWhiteListsRequest
     * @return DeleteRiskSyscallWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskSyscallWhiteListsResponse DeleteRiskSyscallWhiteLists(DeleteRiskSyscallWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRiskSyscallWhiteListsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRiskSyscallWhiteLists", DeleteRiskSyscallWhiteListsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a search template.
     * @param req DeleteSearchTemplateRequest
     * @return DeleteSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSearchTemplateResponse DeleteSearchTemplate(DeleteSearchTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSearchTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSearchTemplate", DeleteSearchTemplateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the current canary configuration of the user.
     * @param req DescribeABTestConfigRequest
     * @return DescribeABTestConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeABTestConfigResponse DescribeABTestConfig(DescribeABTestConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeABTestConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeABTestConfig", DescribeABTestConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an abnormal process event at runtime.
     * @param req DescribeAbnormalProcessDetailRequest
     * @return DescribeAbnormalProcessDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessDetailResponse DescribeAbnormalProcessDetail(DescribeAbnormalProcessDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessDetail", DescribeAbnormalProcessDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of pending abnormal process events.
     * @param req DescribeAbnormalProcessEventTendencyRequest
     * @return DescribeAbnormalProcessEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventTendencyResponse DescribeAbnormalProcessEventTendency(DescribeAbnormalProcessEventTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessEventTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessEventTendency", DescribeAbnormalProcessEventTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of abnormal process events at runtime.
     * @param req DescribeAbnormalProcessEventsRequest
     * @return DescribeAbnormalProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventsResponse DescribeAbnormalProcessEvents(DescribeAbnormalProcessEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessEvents", DescribeAbnormalProcessEventsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query and export the list of abnormal process events at runtime.
     * @param req DescribeAbnormalProcessEventsExportRequest
     * @return DescribeAbnormalProcessEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventsExportResponse DescribeAbnormalProcessEventsExport(DescribeAbnormalProcessEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessEventsExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessEventsExport", DescribeAbnormalProcessEventsExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to count the number of pending abnormal process events at each severity level.
     * @param req DescribeAbnormalProcessLevelSummaryRequest
     * @return DescribeAbnormalProcessLevelSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessLevelSummaryResponse DescribeAbnormalProcessLevelSummary(DescribeAbnormalProcessLevelSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessLevelSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessLevelSummary", DescribeAbnormalProcessLevelSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an abnormal process policy at runtime.
     * @param req DescribeAbnormalProcessRuleDetailRequest
     * @return DescribeAbnormalProcessRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRuleDetailResponse DescribeAbnormalProcessRuleDetail(DescribeAbnormalProcessRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessRuleDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessRuleDetail", DescribeAbnormalProcessRuleDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of abnormal process policies at runtime.
     * @param req DescribeAbnormalProcessRulesRequest
     * @return DescribeAbnormalProcessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRulesResponse DescribeAbnormalProcessRules(DescribeAbnormalProcessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessRules", DescribeAbnormalProcessRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query and export the list of abnormal process policies at runtime.
     * @param req DescribeAbnormalProcessRulesExportRequest
     * @return DescribeAbnormalProcessRulesExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRulesExportResponse DescribeAbnormalProcessRulesExport(DescribeAbnormalProcessRulesExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessRulesExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAbnormalProcessRulesExport", DescribeAbnormalProcessRulesExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an access control event at runtime.
     * @param req DescribeAccessControlDetailRequest
     * @return DescribeAccessControlDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlDetailResponse DescribeAccessControlDetail(DescribeAccessControlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccessControlDetail", DescribeAccessControlDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of access control events at runtime.
     * @param req DescribeAccessControlEventsRequest
     * @return DescribeAccessControlEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlEventsResponse DescribeAccessControlEvents(DescribeAccessControlEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccessControlEvents", DescribeAccessControlEventsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of access control events at runtime.
     * @param req DescribeAccessControlEventsExportRequest
     * @return DescribeAccessControlEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlEventsExportResponse DescribeAccessControlEventsExport(DescribeAccessControlEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlEventsExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccessControlEventsExport", DescribeAccessControlEventsExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an access control policy at runtime.
     * @param req DescribeAccessControlRuleDetailRequest
     * @return DescribeAccessControlRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRuleDetailResponse DescribeAccessControlRuleDetail(DescribeAccessControlRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlRuleDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccessControlRuleDetail", DescribeAccessControlRuleDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of access control policies at runtime.
     * @param req DescribeAccessControlRulesRequest
     * @return DescribeAccessControlRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRulesResponse DescribeAccessControlRules(DescribeAccessControlRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccessControlRules", DescribeAccessControlRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of access control policies at runtime.
     * @param req DescribeAccessControlRulesExportRequest
     * @return DescribeAccessControlRulesExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRulesExportResponse DescribeAccessControlRulesExport(DescribeAccessControlRulesExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlRulesExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccessControlRulesExport", DescribeAccessControlRulesExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get and return the number of affected clusters.
     * @param req DescribeAffectedClusterCountRequest
     * @return DescribeAffectedClusterCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedClusterCountResponse DescribeAffectedClusterCount(DescribeAffectedClusterCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAffectedClusterCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAffectedClusterCount", DescribeAffectedClusterCountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query affected node types and return the node list.
     * @param req DescribeAffectedNodeListRequest
     * @return DescribeAffectedNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedNodeListResponse DescribeAffectedNodeList(DescribeAffectedNodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAffectedNodeListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAffectedNodeList", DescribeAffectedNodeListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query affected workload types and return the workload list.
     * @param req DescribeAffectedWorkloadListRequest
     * @return DescribeAffectedWorkloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedWorkloadListResponse DescribeAffectedWorkloadList(DescribeAffectedWorkloadListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAffectedWorkloadListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAffectedWorkloadList", DescribeAffectedWorkloadListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query parallel container installation commands.
     * @param req DescribeAgentDaemonSetCmdRequest
     * @return DescribeAgentDaemonSetCmdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDaemonSetCmdResponse DescribeAgentDaemonSetCmd(DescribeAgentDaemonSetCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentDaemonSetCmdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAgentDaemonSetCmd", DescribeAgentDaemonSetCmdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query agent installation commands.
     * @param req DescribeAgentInstallCommandRequest
     * @return DescribeAgentInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallCommandResponse DescribeAgentInstallCommand(DescribeAgentInstallCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentInstallCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAgentInstallCommand", DescribeAgentInstallCommandResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of application services.
     * @param req DescribeAssetAppServiceListRequest
     * @return DescribeAssetAppServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppServiceListResponse DescribeAssetAppServiceList(DescribeAssetAppServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetAppServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetAppServiceList", DescribeAssetAppServiceListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of clusters.
     * @param req DescribeAssetClusterListRequest
     * @return DescribeAssetClusterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetClusterListResponse DescribeAssetClusterList(DescribeAssetClusterListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetClusterListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetClusterList", DescribeAssetClusterListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of container components.
     * @param req DescribeAssetComponentListRequest
     * @return DescribeAssetComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetComponentListResponse DescribeAssetComponentList(DescribeAssetComponentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetComponentListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetComponentList", DescribeAssetComponentListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of a container.
     * @param req DescribeAssetContainerDetailRequest
     * @return DescribeAssetContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetContainerDetailResponse DescribeAssetContainerDetail(DescribeAssetContainerDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetContainerDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetContainerDetail", DescribeAssetContainerDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of containers.
     * @param req DescribeAssetContainerListRequest
     * @return DescribeAssetContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetContainerListResponse DescribeAssetContainerList(DescribeAssetContainerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetContainerListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetContainerList", DescribeAssetContainerListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of database services.
     * @param req DescribeAssetDBServiceListRequest
     * @return DescribeAssetDBServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDBServiceListResponse DescribeAssetDBServiceList(DescribeAssetDBServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDBServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetDBServiceList", DescribeAssetDBServiceListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a server.
     * @param req DescribeAssetHostDetailRequest
     * @return DescribeAssetHostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostDetailResponse DescribeAssetHostDetail(DescribeAssetHostDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetHostDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetHostDetail", DescribeAssetHostDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of servers.
     * @param req DescribeAssetHostListRequest
     * @return DescribeAssetHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostListResponse DescribeAssetHostList(DescribeAssetHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetHostList", DescribeAssetHostListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of rules bound to images, including runtime access control and abnormal process rules.
     * @param req DescribeAssetImageBindRuleInfoRequest
     * @return DescribeAssetImageBindRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageBindRuleInfoResponse DescribeAssetImageBindRuleInfo(DescribeAssetImageBindRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageBindRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageBindRuleInfo", DescribeAssetImageBindRuleInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an image.
     * @param req DescribeAssetImageDetailRequest
     * @return DescribeAssetImageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageDetailResponse DescribeAssetImageDetail(DescribeAssetImageDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageDetail", DescribeAssetImageDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the servers associated with an image.
     * @param req DescribeAssetImageHostListRequest
     * @return DescribeAssetImageHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageHostListResponse DescribeAssetImageHostList(DescribeAssetImageHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageHostList", DescribeAssetImageHostListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of images.
     * @param req DescribeAssetImageListRequest
     * @return DescribeAssetImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageListResponse DescribeAssetImageList(DescribeAssetImageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageList", DescribeAssetImageListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of images.
     * @param req DescribeAssetImageListExportRequest
     * @return DescribeAssetImageListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageListExportResponse DescribeAssetImageListExport(DescribeAssetImageListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageListExport", DescribeAssetImageListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to view the update progress of the assets in an image repository.
     * @param req DescribeAssetImageRegistryAssetStatusRequest
     * @return DescribeAssetImageRegistryAssetStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryAssetStatusResponse DescribeAssetImageRegistryAssetStatus(DescribeAssetImageRegistryAssetStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryAssetStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryAssetStatus", DescribeAssetImageRegistryAssetStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the image repository details.
     * @param req DescribeAssetImageRegistryDetailRequest
     * @return DescribeAssetImageRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryDetailResponse DescribeAssetImageRegistryDetail(DescribeAssetImageRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryDetail", DescribeAssetImageRegistryDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of image repositories.
     * @param req DescribeAssetImageRegistryListRequest
     * @return DescribeAssetImageRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryListResponse DescribeAssetImageRegistryList(DescribeAssetImageRegistryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryList", DescribeAssetImageRegistryListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of images for an image repository.
     * @param req DescribeAssetImageRegistryListExportRequest
     * @return DescribeAssetImageRegistryListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryListExportResponse DescribeAssetImageRegistryListExport(DescribeAssetImageRegistryListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryListExport", DescribeAssetImageRegistryListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to view the details of an image repository.
     * @param req DescribeAssetImageRegistryRegistryDetailRequest
     * @return DescribeAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRegistryDetailResponse DescribeAssetImageRegistryRegistryDetail(DescribeAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryRegistryDetail", DescribeAssetImageRegistryRegistryDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of image registries.
     * @param req DescribeAssetImageRegistryRegistryListRequest
     * @return DescribeAssetImageRegistryRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRegistryListResponse DescribeAssetImageRegistryRegistryList(DescribeAssetImageRegistryRegistryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRegistryListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryRegistryList", DescribeAssetImageRegistryRegistryListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of image high-risk behaviors of an image repository.
     * @param req DescribeAssetImageRegistryRiskInfoListRequest
     * @return DescribeAssetImageRegistryRiskInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRiskInfoListResponse DescribeAssetImageRegistryRiskInfoList(DescribeAssetImageRegistryRiskInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRiskInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryRiskInfoList", DescribeAssetImageRegistryRiskInfoListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of sensitive data for an image repository.
     * @param req DescribeAssetImageRegistryRiskListExportRequest
     * @return DescribeAssetImageRegistryRiskListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRiskListExportResponse DescribeAssetImageRegistryRiskListExport(DescribeAssetImageRegistryRiskListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRiskListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryRiskListExport", DescribeAssetImageRegistryRiskListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the quick image scanning status of an image repository.
     * @param req DescribeAssetImageRegistryScanStatusOneKeyRequest
     * @return DescribeAssetImageRegistryScanStatusOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryScanStatusOneKeyResponse DescribeAssetImageRegistryScanStatusOneKey(DescribeAssetImageRegistryScanStatusOneKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryScanStatusOneKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryScanStatusOneKey", DescribeAssetImageRegistryScanStatusOneKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the image statistics of an image repository.
     * @param req DescribeAssetImageRegistrySummaryRequest
     * @return DescribeAssetImageRegistrySummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistrySummaryResponse DescribeAssetImageRegistrySummary(DescribeAssetImageRegistrySummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistrySummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistrySummary", DescribeAssetImageRegistrySummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of viruses and trojans in an image repository.
     * @param req DescribeAssetImageRegistryVirusListRequest
     * @return DescribeAssetImageRegistryVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVirusListResponse DescribeAssetImageRegistryVirusList(DescribeAssetImageRegistryVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVirusListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryVirusList", DescribeAssetImageRegistryVirusListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of trojan information for an image repository.
     * @param req DescribeAssetImageRegistryVirusListExportRequest
     * @return DescribeAssetImageRegistryVirusListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVirusListExportResponse DescribeAssetImageRegistryVirusListExport(DescribeAssetImageRegistryVirusListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVirusListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryVirusListExport", DescribeAssetImageRegistryVirusListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of image vulnerabilities of an image repository
     * @param req DescribeAssetImageRegistryVulListRequest
     * @return DescribeAssetImageRegistryVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVulListResponse DescribeAssetImageRegistryVulList(DescribeAssetImageRegistryVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryVulList", DescribeAssetImageRegistryVulListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of vulnerabilities for an image repository.
     * @param req DescribeAssetImageRegistryVulListExportRequest
     * @return DescribeAssetImageRegistryVulListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVulListExportResponse DescribeAssetImageRegistryVulListExport(DescribeAssetImageRegistryVulListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVulListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRegistryVulListExport", DescribeAssetImageRegistryVulListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of risks in an image.
     * @param req DescribeAssetImageRiskListRequest
     * @return DescribeAssetImageRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRiskListResponse DescribeAssetImageRiskList(DescribeAssetImageRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRiskList", DescribeAssetImageRiskListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of risks in an image.
     * @param req DescribeAssetImageRiskListExportRequest
     * @return DescribeAssetImageRiskListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRiskListExportResponse DescribeAssetImageRiskListExport(DescribeAssetImageRiskListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRiskListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageRiskListExport", DescribeAssetImageRiskListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the image scan settings.
     * @param req DescribeAssetImageScanSettingRequest
     * @return DescribeAssetImageScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanSettingResponse DescribeAssetImageScanSetting(DescribeAssetImageScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageScanSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageScanSetting", DescribeAssetImageScanSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the image scanning status.
     * @param req DescribeAssetImageScanStatusRequest
     * @return DescribeAssetImageScanStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanStatusResponse DescribeAssetImageScanStatus(DescribeAssetImageScanStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageScanStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageScanStatus", DescribeAssetImageScanStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the ID of a running quick image scan task.
     * @param req DescribeAssetImageScanTaskRequest
     * @return DescribeAssetImageScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanTaskResponse DescribeAssetImageScanTask(DescribeAssetImageScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageScanTask", DescribeAssetImageScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the brief information list of an image.
     * @param req DescribeAssetImageSimpleListRequest
     * @return DescribeAssetImageSimpleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageSimpleListResponse DescribeAssetImageSimpleList(DescribeAssetImageSimpleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageSimpleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageSimpleList", DescribeAssetImageSimpleListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of viruses in an image.
     * @param req DescribeAssetImageVirusListRequest
     * @return DescribeAssetImageVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVirusListResponse DescribeAssetImageVirusList(DescribeAssetImageVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVirusListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageVirusList", DescribeAssetImageVirusListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of trojans in an image.
     * @param req DescribeAssetImageVirusListExportRequest
     * @return DescribeAssetImageVirusListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVirusListExportResponse DescribeAssetImageVirusListExport(DescribeAssetImageVirusListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVirusListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageVirusListExport", DescribeAssetImageVirusListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of vulnerabilities in an image.
     * @param req DescribeAssetImageVulListRequest
     * @return DescribeAssetImageVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVulListResponse DescribeAssetImageVulList(DescribeAssetImageVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageVulList", DescribeAssetImageVulListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of vulnerabilities in an image.
     * @param req DescribeAssetImageVulListExportRequest
     * @return DescribeAssetImageVulListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVulListExportResponse DescribeAssetImageVulListExport(DescribeAssetImageVulListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVulListExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetImageVulListExport", DescribeAssetImageVulListExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of occupied ports.
     * @param req DescribeAssetPortListRequest
     * @return DescribeAssetPortListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortListResponse DescribeAssetPortList(DescribeAssetPortListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPortListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetPortList", DescribeAssetPortListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of processes.
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetProcessListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetProcessList", DescribeAssetProcessListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the statistics of containers and images under an account.
     * @param req DescribeAssetSummaryRequest
     * @return DescribeAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSummaryResponse DescribeAssetSummary(DescribeAssetSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetSummary", DescribeAssetSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the last asset sync time.
     * @param req DescribeAssetSyncLastTimeRequest
     * @return DescribeAssetSyncLastTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncLastTimeResponse DescribeAssetSyncLastTime(DescribeAssetSyncLastTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetSyncLastTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetSyncLastTime", DescribeAssetSyncLastTimeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of web services.
     * @param req DescribeAssetWebServiceListRequest
     * @return DescribeAssetWebServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceListResponse DescribeAssetWebServiceList(DescribeAssetWebServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssetWebServiceList", DescribeAssetWebServiceListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the servers licensed according to an automatic licensing rule.
     * @param req DescribeAutoAuthorizedRuleHostRequest
     * @return DescribeAutoAuthorizedRuleHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoAuthorizedRuleHostResponse DescribeAutoAuthorizedRuleHost(DescribeAutoAuthorizedRuleHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoAuthorizedRuleHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAutoAuthorizedRuleHost", DescribeAutoAuthorizedRuleHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query all check items and return the total number and list of check items.
     * @param req DescribeCheckItemListRequest
     * @return DescribeCheckItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckItemListResponse DescribeCheckItemList(DescribeCheckItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckItemListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCheckItemList", DescribeCheckItemListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a cluster.
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the overview of cluster assets.
     * @param req DescribeClusterSummaryRequest
     * @return DescribeClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSummaryResponse DescribeClusterSummary(DescribeClusterSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeClusterSummary", DescribeClusterSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an asset.
     * @param req DescribeComplianceAssetDetailInfoRequest
     * @return DescribeComplianceAssetDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetDetailInfoResponse DescribeComplianceAssetDetailInfo(DescribeComplianceAssetDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetDetailInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceAssetDetailInfo", DescribeComplianceAssetDetailInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of assets of a certain type.
     * @param req DescribeComplianceAssetListRequest
     * @return DescribeComplianceAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetListResponse DescribeComplianceAssetList(DescribeComplianceAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceAssetList", DescribeComplianceAssetListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of check items of an asset.
     * @param req DescribeComplianceAssetPolicyItemListRequest
     * @return DescribeComplianceAssetPolicyItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetPolicyItemListResponse DescribeComplianceAssetPolicyItemList(DescribeComplianceAssetPolicyItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetPolicyItemListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceAssetPolicyItemList", DescribeComplianceAssetPolicyItemListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of scheduled tasks.
     * @param req DescribeCompliancePeriodTaskListRequest
     * @return DescribeCompliancePeriodTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePeriodTaskListResponse DescribeCompliancePeriodTaskList(DescribeCompliancePeriodTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompliancePeriodTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCompliancePeriodTaskList", DescribeCompliancePeriodTaskListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to apply the asset level in the "check item + asset" two-level structure.
     * @param req DescribeCompliancePolicyItemAffectedAssetListRequest
     * @return DescribeCompliancePolicyItemAffectedAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePolicyItemAffectedAssetListResponse DescribeCompliancePolicyItemAffectedAssetList(DescribeCompliancePolicyItemAffectedAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompliancePolicyItemAffectedAssetListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCompliancePolicyItemAffectedAssetList", DescribeCompliancePolicyItemAffectedAssetListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to apply the check item level in the "check item + asset" two-level structure.
     * @param req DescribeCompliancePolicyItemAffectedSummaryRequest
     * @return DescribeCompliancePolicyItemAffectedSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePolicyItemAffectedSummaryResponse DescribeCompliancePolicyItemAffectedSummary(DescribeCompliancePolicyItemAffectedSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompliancePolicyItemAffectedSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCompliancePolicyItemAffectedSummary", DescribeCompliancePolicyItemAffectedSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the aggregate information of the pass rate at the asset level, the first level in the "asset + check item" two-level structure.
     * @param req DescribeComplianceScanFailedAssetListRequest
     * @return DescribeComplianceScanFailedAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceScanFailedAssetListResponse DescribeComplianceScanFailedAssetList(DescribeComplianceScanFailedAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceScanFailedAssetListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceScanFailedAssetList", DescribeComplianceScanFailedAssetListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the aggregated information of the asset pass rate in the last task.
     * @param req DescribeComplianceTaskAssetSummaryRequest
     * @return DescribeComplianceTaskAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceTaskAssetSummaryResponse DescribeComplianceTaskAssetSummary(DescribeComplianceTaskAssetSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceTaskAssetSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceTaskAssetSummary", DescribeComplianceTaskAssetSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of aggregated information of check items identified in the last task in line with the "check item + asset" two-level structure.
     * @param req DescribeComplianceTaskPolicyItemSummaryListRequest
     * @return DescribeComplianceTaskPolicyItemSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceTaskPolicyItemSummaryListResponse DescribeComplianceTaskPolicyItemSummaryList(DescribeComplianceTaskPolicyItemSummaryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceTaskPolicyItemSummaryListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceTaskPolicyItemSummaryList", DescribeComplianceTaskPolicyItemSummaryListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the allowlist.
     * @param req DescribeComplianceWhitelistItemListRequest
     * @return DescribeComplianceWhitelistItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceWhitelistItemListResponse DescribeComplianceWhitelistItemList(DescribeComplianceWhitelistItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceWhitelistItemListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComplianceWhitelistItemList", DescribeComplianceWhitelistItemListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the asset overview.
     * @param req DescribeContainerAssetSummaryRequest
     * @return DescribeContainerAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerAssetSummaryResponse DescribeContainerAssetSummary(DescribeContainerAssetSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerAssetSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeContainerAssetSummary", DescribeContainerAssetSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the overview of pending events.
     * @param req DescribeContainerSecEventSummaryRequest
     * @return DescribeContainerSecEventSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerSecEventSummaryResponse DescribeContainerSecEventSummary(DescribeContainerSecEventSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerSecEventSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeContainerSecEventSummary", DescribeContainerSecEventSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the aggregation result of the ES field.
     * @param req DescribeESAggregationsRequest
     * @return DescribeESAggregationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAggregationsResponse DescribeESAggregations(DescribeESAggregationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeESAggregationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeESAggregations", DescribeESAggregationsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of ES query files.
     * @param req DescribeESHitsRequest
     * @return DescribeESHitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESHitsResponse DescribeESHits(DescribeESHitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeESHitsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeESHits", DescribeESHitsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of emergency vulnerabilities.
     * @param req DescribeEmergencyVulListRequest
     * @return DescribeEmergencyVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyVulListResponse DescribeEmergencyVulList(DescribeEmergencyVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEmergencyVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEmergencyVulList", DescribeEmergencyVulListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a container escape event.
     * @param req DescribeEscapeEventDetailRequest
     * @return DescribeEscapeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventDetailResponse DescribeEscapeEventDetail(DescribeEscapeEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeEventDetail", DescribeEscapeEventDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of container escape events.
     * @param req DescribeEscapeEventInfoRequest
     * @return DescribeEscapeEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventInfoResponse DescribeEscapeEventInfo(DescribeEscapeEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeEventInfo", DescribeEscapeEventInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of pending escape events.
     * @param req DescribeEscapeEventTendencyRequest
     * @return DescribeEscapeEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventTendencyResponse DescribeEscapeEventTendency(DescribeEscapeEventTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeEventTendency", DescribeEscapeEventTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the types of container escape events and the number of pending events.
     * @param req DescribeEscapeEventTypeSummaryRequest
     * @return DescribeEscapeEventTypeSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventTypeSummaryResponse DescribeEscapeEventTypeSummary(DescribeEscapeEventTypeSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventTypeSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeEventTypeSummary", DescribeEscapeEventTypeSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of container escape events.
     * @param req DescribeEscapeEventsExportRequest
     * @return DescribeEscapeEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventsExportResponse DescribeEscapeEventsExport(DescribeEscapeEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventsExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeEventsExport", DescribeEscapeEventsExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of a container escape scan rule.
     * @param req DescribeEscapeRuleInfoRequest
     * @return DescribeEscapeRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeRuleInfoResponse DescribeEscapeRuleInfo(DescribeEscapeRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeRuleInfo", DescribeEscapeRuleInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the container escape security status.
     * @param req DescribeEscapeSafeStateRequest
     * @return DescribeEscapeSafeStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeSafeStateResponse DescribeEscapeSafeState(DescribeEscapeSafeStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeSafeStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeSafeState", DescribeEscapeSafeStateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the allowlist of escapes.
     * @param req DescribeEscapeWhiteListRequest
     * @return DescribeEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeWhiteListResponse DescribeEscapeWhiteList(DescribeEscapeWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEscapeWhiteList", DescribeEscapeWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the URL to download the result of an exportation task.
     * @param req DescribeExportJobDownloadURLRequest
     * @return DescribeExportJobDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobDownloadURLResponse DescribeExportJobDownloadURL(DescribeExportJobDownloadURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportJobDownloadURLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeExportJobDownloadURL", DescribeExportJobDownloadURLResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the export job management list.
     * @param req DescribeExportJobManageListRequest
     * @return DescribeExportJobManageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobManageListResponse DescribeExportJobManageList(DescribeExportJobManageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportJobManageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeExportJobManageList", DescribeExportJobManageListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the result of an export task.
     * @param req DescribeExportJobResultRequest
     * @return DescribeExportJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobResultResponse DescribeExportJobResult(DescribeExportJobResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportJobResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeExportJobResult", DescribeExportJobResultResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the image licensing information.
     * @param req DescribeImageAuthorizedInfoRequest
     * @return DescribeImageAuthorizedInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAuthorizedInfoResponse DescribeImageAuthorizedInfo(DescribeImageAuthorizedInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageAuthorizedInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageAuthorizedInfo", DescribeImageAuthorizedInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of automatic image licensing results.
     * @param req DescribeImageAutoAuthorizedLogListRequest
     * @return DescribeImageAutoAuthorizedLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAutoAuthorizedLogListResponse DescribeImageAutoAuthorizedLogList(DescribeImageAutoAuthorizedLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageAutoAuthorizedLogListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageAutoAuthorizedLogList", DescribeImageAutoAuthorizedLogListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query an automatic licensing rule for local images.
     * @param req DescribeImageAutoAuthorizedRuleRequest
     * @return DescribeImageAutoAuthorizedRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAutoAuthorizedRuleResponse DescribeImageAutoAuthorizedRule(DescribeImageAutoAuthorizedRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageAutoAuthorizedRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageAutoAuthorizedRule", DescribeImageAutoAuthorizedRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of automatic image licensing tasks.
     * @param req DescribeImageAutoAuthorizedTaskListRequest
     * @return DescribeImageAutoAuthorizedTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAutoAuthorizedTaskListResponse DescribeImageAutoAuthorizedTaskList(DescribeImageAutoAuthorizedTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageAutoAuthorizedTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageAutoAuthorizedTaskList", DescribeImageAutoAuthorizedTaskListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of components in an local image.
     * @param req DescribeImageComponentListRequest
     * @return DescribeImageComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageComponentListResponse DescribeImageComponentList(DescribeImageComponentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageComponentListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageComponentList", DescribeImageComponentListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of namespaces for an image repository.
     * @param req DescribeImageRegistryNamespaceListRequest
     * @return DescribeImageRegistryNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryNamespaceListResponse DescribeImageRegistryNamespaceList(DescribeImageRegistryNamespaceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRegistryNamespaceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageRegistryNamespaceList", DescribeImageRegistryNamespaceListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to view a scheduled task of an image repository.
     * @param req DescribeImageRegistryTimingScanTaskRequest
     * @return DescribeImageRegistryTimingScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryTimingScanTaskResponse DescribeImageRegistryTimingScanTask(DescribeImageRegistryTimingScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRegistryTimingScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageRegistryTimingScanTask", DescribeImageRegistryTimingScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the overview of local image risks.
     * @param req DescribeImageRiskSummaryRequest
     * @return DescribeImageRiskSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRiskSummaryResponse DescribeImageRiskSummary(DescribeImageRiskSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRiskSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageRiskSummary", DescribeImageRiskSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of local image risks.
     * @param req DescribeImageRiskTendencyRequest
     * @return DescribeImageRiskTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRiskTendencyResponse DescribeImageRiskTendency(DescribeImageRiskTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRiskTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageRiskTendency", DescribeImageRiskTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of all images.
     * @param req DescribeImageSimpleListRequest
     * @return DescribeImageSimpleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSimpleListResponse DescribeImageSimpleList(DescribeImageSimpleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSimpleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageSimpleList", DescribeImageSimpleListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the index list.
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIndexList", DescribeIndexListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query check reports.
     * @param req DescribeInspectionReportRequest
     * @return DescribeInspectionReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInspectionReportResponse DescribeInspectionReport(DescribeInspectionReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInspectionReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInspectionReport", DescribeInspectionReportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Querying details of a K8s API exception event
     * @param req DescribeK8sApiAbnormalEventInfoRequest
     * @return DescribeK8sApiAbnormalEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalEventInfoResponse DescribeK8sApiAbnormalEventInfo(DescribeK8sApiAbnormalEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalEventInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalEventInfo", DescribeK8sApiAbnormalEventInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the K8sApi abnormal event list.
     * @param req DescribeK8sApiAbnormalEventListRequest
     * @return DescribeK8sApiAbnormalEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalEventListResponse DescribeK8sApiAbnormalEventList(DescribeK8sApiAbnormalEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalEventListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalEventList", DescribeK8sApiAbnormalEventListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query K8sApi abnormal request rule details.
     * @param req DescribeK8sApiAbnormalRuleInfoRequest
     * @return DescribeK8sApiAbnormalRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalRuleInfoResponse DescribeK8sApiAbnormalRuleInfo(DescribeK8sApiAbnormalRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalRuleInfo", DescribeK8sApiAbnormalRuleInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to the K8sApi abnormal request rule list.
     * @param req DescribeK8sApiAbnormalRuleListRequest
     * @return DescribeK8sApiAbnormalRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalRuleListResponse DescribeK8sApiAbnormalRuleList(DescribeK8sApiAbnormalRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalRuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalRuleList", DescribeK8sApiAbnormalRuleListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query rules for K8s API exceptions. 
     * @param req DescribeK8sApiAbnormalRuleScopeListRequest
     * @return DescribeK8sApiAbnormalRuleScopeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalRuleScopeListResponse DescribeK8sApiAbnormalRuleScopeList(DescribeK8sApiAbnormalRuleScopeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalRuleScopeListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalRuleScopeList", DescribeK8sApiAbnormalRuleScopeListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the statistics of K8sApi abnormal events.
     * @param req DescribeK8sApiAbnormalSummaryRequest
     * @return DescribeK8sApiAbnormalSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalSummaryResponse DescribeK8sApiAbnormalSummary(DescribeK8sApiAbnormalSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalSummary", DescribeK8sApiAbnormalSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of K8sApi abnormal events.
     * @param req DescribeK8sApiAbnormalTendencyRequest
     * @return DescribeK8sApiAbnormalTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalTendencyResponse DescribeK8sApiAbnormalTendency(DescribeK8sApiAbnormalTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeK8sApiAbnormalTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeK8sApiAbnormalTendency", DescribeK8sApiAbnormalTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the statistics of the log search usage.
     * @param req DescribeLogStorageStatisticRequest
     * @return DescribeLogStorageStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageStatisticResponse DescribeLogStorageStatistic(DescribeLogStorageStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogStorageStatisticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLogStorageStatistic", DescribeLogStorageStatisticResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of cluster policy audits.
     * @param req DescribeNetworkFirewallAuditRecordRequest
     * @return DescribeNetworkFirewallAuditRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallAuditRecordResponse DescribeNetworkFirewallAuditRecord(DescribeNetworkFirewallAuditRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallAuditRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallAuditRecord", DescribeNetworkFirewallAuditRecordResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of clusters.
     * @param req DescribeNetworkFirewallClusterListRequest
     * @return DescribeNetworkFirewallClusterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallClusterListResponse DescribeNetworkFirewallClusterList(DescribeNetworkFirewallClusterListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallClusterListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallClusterList", DescribeNetworkFirewallClusterListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the progress of the asset query task in the container network.
     * @param req DescribeNetworkFirewallClusterRefreshStatusRequest
     * @return DescribeNetworkFirewallClusterRefreshStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallClusterRefreshStatusResponse DescribeNetworkFirewallClusterRefreshStatus(DescribeNetworkFirewallClusterRefreshStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallClusterRefreshStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallClusterRefreshStatus", DescribeNetworkFirewallClusterRefreshStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of cluster network namespace labels.
     * @param req DescribeNetworkFirewallNamespaceLabelListRequest
     * @return DescribeNetworkFirewallNamespaceLabelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallNamespaceLabelListResponse DescribeNetworkFirewallNamespaceLabelList(DescribeNetworkFirewallNamespaceLabelListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallNamespaceLabelListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallNamespaceLabelList", DescribeNetworkFirewallNamespaceLabelListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query cluster network Pod labels.
     * @param req DescribeNetworkFirewallPodLabelsListRequest
     * @return DescribeNetworkFirewallPodLabelsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPodLabelsListResponse DescribeNetworkFirewallPodLabelsList(DescribeNetworkFirewallPodLabelsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallPodLabelsListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallPodLabelsList", DescribeNetworkFirewallPodLabelsListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to view the details of a policy in the container network cluster.
     * @param req DescribeNetworkFirewallPolicyDetailRequest
     * @return DescribeNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyDetailResponse DescribeNetworkFirewallPolicyDetail(DescribeNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallPolicyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallPolicyDetail", DescribeNetworkFirewallPolicyDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the progress of a network policy sync task in the container network.
     * @param req DescribeNetworkFirewallPolicyDiscoverRequest
     * @return DescribeNetworkFirewallPolicyDiscoverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyDiscoverResponse DescribeNetworkFirewallPolicyDiscover(DescribeNetworkFirewallPolicyDiscoverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallPolicyDiscoverResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallPolicyDiscover", DescribeNetworkFirewallPolicyDiscoverResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of cluster network policies.
     * @param req DescribeNetworkFirewallPolicyListRequest
     * @return DescribeNetworkFirewallPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyListResponse DescribeNetworkFirewallPolicyList(DescribeNetworkFirewallPolicyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallPolicyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallPolicyList", DescribeNetworkFirewallPolicyListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the execution status of a network policy in the container network.
     * @param req DescribeNetworkFirewallPolicyStatusRequest
     * @return DescribeNetworkFirewallPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyStatusResponse DescribeNetworkFirewallPolicyStatus(DescribeNetworkFirewallPolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallPolicyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallPolicyStatus", DescribeNetworkFirewallPolicyStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to view the details of a YAML network policy in the container network cluster.
     * @param req DescribeNetworkFirewallPolicyYamlDetailRequest
     * @return DescribeNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyYamlDetailResponse DescribeNetworkFirewallPolicyYamlDetail(DescribeNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkFirewallPolicyYamlDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkFirewallPolicyYamlDetail", DescribeNetworkFirewallPolicyYamlDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the latest list of vulnerabilities.
     * @param req DescribeNewestVulRequest
     * @return DescribeNewestVulResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewestVulResponse DescribeNewestVul(DescribeNewestVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewestVulResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNewestVul", DescribeNewestVulResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the pay-as-you-go billing details.
     * @param req DescribePostPayDetailRequest
     * @return DescribePostPayDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostPayDetailResponse DescribePostPayDetail(DescribePostPayDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePostPayDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePostPayDetail", DescribePostPayDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check whether the Pro Edition needs to be purchased.
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProVersionInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeProVersionInfo", DescribeProVersionInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query promotions.
     * @param req DescribePromotionActivityRequest
     * @return DescribePromotionActivityResponse
     * @throws TencentCloudSDKException
     */
    public DescribePromotionActivityResponse DescribePromotionActivity(DescribePromotionActivityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePromotionActivityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePromotionActivity", DescribePromotionActivityResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the public key.
     * @param req DescribePublicKeyRequest
     * @return DescribePublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicKeyResponse DescribePublicKey(DescribePublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePublicKey", DescribePublicKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check whether TCSS is purchased.
     * @param req DescribePurchaseStateInfoRequest
     * @return DescribePurchaseStateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurchaseStateInfoResponse DescribePurchaseStateInfo(DescribePurchaseStateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurchaseStateInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePurchaseStateInfo", DescribePurchaseStateInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a refresh task.
     * @param req DescribeRefreshTaskRequest
     * @return DescribeRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRefreshTaskResponse DescribeRefreshTask(DescribeRefreshTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRefreshTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRefreshTask", DescribeRefreshTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a reverse shell event at runtime.
     * @param req DescribeReverseShellDetailRequest
     * @return DescribeReverseShellDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellDetailResponse DescribeReverseShellDetail(DescribeReverseShellDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReverseShellDetail", DescribeReverseShellDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of reverse shell events at runtime.
     * @param req DescribeReverseShellEventsRequest
     * @return DescribeReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsResponse DescribeReverseShellEvents(DescribeReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReverseShellEvents", DescribeReverseShellEventsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query and export the list of reverse shell events at runtime.
     * @param req DescribeReverseShellEventsExportRequest
     * @return DescribeReverseShellEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsExportResponse DescribeReverseShellEventsExport(DescribeReverseShellEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellEventsExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReverseShellEventsExport", DescribeReverseShellEventsExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of the allowlist of reverse shells at runtime.
     * @param req DescribeReverseShellWhiteListDetailRequest
     * @return DescribeReverseShellWhiteListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellWhiteListDetailResponse DescribeReverseShellWhiteListDetail(DescribeReverseShellWhiteListDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellWhiteListDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReverseShellWhiteListDetail", DescribeReverseShellWhiteListDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the allowlist of reverse shells at runtime.
     * @param req DescribeReverseShellWhiteListsRequest
     * @return DescribeReverseShellWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellWhiteListsResponse DescribeReverseShellWhiteLists(DescribeReverseShellWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellWhiteListsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReverseShellWhiteLists", DescribeReverseShellWhiteListsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of risk items identified in the last task and filter them by special field.
     * @param req DescribeRiskListRequest
     * @return DescribeRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskListResponse DescribeRiskList(DescribeRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskList", DescribeRiskListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a high-risk syscall event.
     * @param req DescribeRiskSyscallDetailRequest
     * @return DescribeRiskSyscallDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallDetailResponse DescribeRiskSyscallDetail(DescribeRiskSyscallDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskSyscallDetail", DescribeRiskSyscallDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of high-risk syscalls at runtime.
     * @param req DescribeRiskSyscallEventsRequest
     * @return DescribeRiskSyscallEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallEventsResponse DescribeRiskSyscallEvents(DescribeRiskSyscallEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskSyscallEvents", DescribeRiskSyscallEventsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of high-risk syscalls at runtime.
     * @param req DescribeRiskSyscallEventsExportRequest
     * @return DescribeRiskSyscallEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallEventsExportResponse DescribeRiskSyscallEventsExport(DescribeRiskSyscallEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallEventsExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskSyscallEventsExport", DescribeRiskSyscallEventsExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of names of high-risk syscalls at runtime.
     * @param req DescribeRiskSyscallNamesRequest
     * @return DescribeRiskSyscallNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallNamesResponse DescribeRiskSyscallNames(DescribeRiskSyscallNamesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallNamesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskSyscallNames", DescribeRiskSyscallNamesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of the allowlist of high-risk syscalls at runtime.
     * @param req DescribeRiskSyscallWhiteListDetailRequest
     * @return DescribeRiskSyscallWhiteListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallWhiteListDetailResponse DescribeRiskSyscallWhiteListDetail(DescribeRiskSyscallWhiteListDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallWhiteListDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskSyscallWhiteListDetail", DescribeRiskSyscallWhiteListDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the allowlist of high-risk syscalls at runtime.
     * @param req DescribeRiskSyscallWhiteListsRequest
     * @return DescribeRiskSyscallWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallWhiteListsResponse DescribeRiskSyscallWhiteLists(DescribeRiskSyscallWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallWhiteListsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRiskSyscallWhiteLists", DescribeRiskSyscallWhiteListsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of vulnerabilities ignored in a scan.
     * @param req DescribeScanIgnoreVulListRequest
     * @return DescribeScanIgnoreVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanIgnoreVulListResponse DescribeScanIgnoreVulList(DescribeScanIgnoreVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanIgnoreVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeScanIgnoreVulList", DescribeScanIgnoreVulListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of ES query files.
     * @param req DescribeSearchExportListRequest
     * @return DescribeSearchExportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchExportListResponse DescribeSearchExportList(DescribeSearchExportListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchExportListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSearchExportList", DescribeSearchExportListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get historical search records.
     * @param req DescribeSearchLogsRequest
     * @return DescribeSearchLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchLogsResponse DescribeSearchLogs(DescribeSearchLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSearchLogs", DescribeSearchLogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of search templates.
     * @param req DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchTemplatesResponse DescribeSearchTemplates(DescribeSearchTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSearchTemplates", DescribeSearchTemplatesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of security events at runtime.
     * @param req DescribeSecEventsTendencyRequest
     * @return DescribeSecEventsTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecEventsTendencyResponse DescribeSecEventsTendency(DescribeSecEventsTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecEventsTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecEventsTendency", DescribeSecEventsTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a security log alert message.
     * @param req DescribeSecLogAlertMsgRequest
     * @return DescribeSecLogAlertMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogAlertMsgResponse DescribeSecLogAlertMsg(DescribeSecLogAlertMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogAlertMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogAlertMsg", DescribeSecLogAlertMsgResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the settings of security log cleanup.
     * @param req DescribeSecLogCleanSettingInfoRequest
     * @return DescribeSecLogCleanSettingInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogCleanSettingInfoResponse DescribeSecLogCleanSettingInfo(DescribeSecLogCleanSettingInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogCleanSettingInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogCleanSettingInfo", DescribeSecLogCleanSettingInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the options of security log delivery to CLS.
     * @param req DescribeSecLogDeliveryClsOptionsRequest
     * @return DescribeSecLogDeliveryClsOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryClsOptionsResponse DescribeSecLogDeliveryClsOptions(DescribeSecLogDeliveryClsOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogDeliveryClsOptionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogDeliveryClsOptions", DescribeSecLogDeliveryClsOptionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the settings of security log delivery to CLS.
     * @param req DescribeSecLogDeliveryClsSettingRequest
     * @return DescribeSecLogDeliveryClsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryClsSettingResponse DescribeSecLogDeliveryClsSetting(DescribeSecLogDeliveryClsSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogDeliveryClsSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogDeliveryClsSetting", DescribeSecLogDeliveryClsSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the options of security log delivery to Kafka.
     * @param req DescribeSecLogDeliveryKafkaOptionsRequest
     * @return DescribeSecLogDeliveryKafkaOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryKafkaOptionsResponse DescribeSecLogDeliveryKafkaOptions(DescribeSecLogDeliveryKafkaOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogDeliveryKafkaOptionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogDeliveryKafkaOptions", DescribeSecLogDeliveryKafkaOptionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the settings of security log delivery to Kafka.
     * @param req DescribeSecLogDeliveryKafkaSettingRequest
     * @return DescribeSecLogDeliveryKafkaSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryKafkaSettingResponse DescribeSecLogDeliveryKafkaSetting(DescribeSecLogDeliveryKafkaSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogDeliveryKafkaSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogDeliveryKafkaSetting", DescribeSecLogDeliveryKafkaSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of accessed security log objects.
     * @param req DescribeSecLogJoinObjectListRequest
     * @return DescribeSecLogJoinObjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogJoinObjectListResponse DescribeSecLogJoinObjectList(DescribeSecLogJoinObjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogJoinObjectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogJoinObjectList", DescribeSecLogJoinObjectListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of security log access types.
     * @param req DescribeSecLogJoinTypeListRequest
     * @return DescribeSecLogJoinTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogJoinTypeListResponse DescribeSecLogJoinTypeList(DescribeSecLogJoinTypeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogJoinTypeListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogJoinTypeList", DescribeSecLogJoinTypeListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the UIN of a Kafka security log.
     * @param req DescribeSecLogKafkaUINRequest
     * @return DescribeSecLogKafkaUINResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogKafkaUINResponse DescribeSecLogKafkaUIN(DescribeSecLogKafkaUINRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogKafkaUINResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogKafkaUIN", DescribeSecLogKafkaUINResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of the security log product.
     * @param req DescribeSecLogVasInfoRequest
     * @return DescribeSecLogVasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogVasInfoResponse DescribeSecLogVasInfo(DescribeSecLogVasInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecLogVasInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecLogVasInfo", DescribeSecLogVasInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of vulnerabilities that can be prevented
     * @param req DescribeSupportDefenceVulRequest
     * @return DescribeSupportDefenceVulResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportDefenceVulResponse DescribeSupportDefenceVul(DescribeSupportDefenceVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupportDefenceVulResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSupportDefenceVul", DescribeSupportDefenceVulResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of system vulnerabilities.
     * @param req DescribeSystemVulListRequest
     * @return DescribeSystemVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemVulListResponse DescribeSystemVulList(DescribeSystemVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSystemVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSystemVulList", DescribeSystemVulListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the overview of a check result and return the number of affected nodes in the last seven days.
     * @param req DescribeTaskResultSummaryRequest
     * @return DescribeTaskResultSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultSummaryResponse DescribeTaskResultSummary(DescribeTaskResultSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTaskResultSummary", DescribeTaskResultSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the TCSS overview.
     * @param req DescribeTcssSummaryRequest
     * @return DescribeTcssSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTcssSummaryResponse DescribeTcssSummary(DescribeTcssSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTcssSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTcssSummary", DescribeTcssSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of daily unlicensed cores.
     * @param req DescribeUnauthorizedCoresTendencyRequest
     * @return DescribeUnauthorizedCoresTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnauthorizedCoresTendencyResponse DescribeUnauthorizedCoresTendency(DescribeUnauthorizedCoresTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnauthorizedCoresTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUnauthorizedCoresTendency", DescribeUnauthorizedCoresTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of an unfinished asset refreshing task.
     * @param req DescribeUnfinishRefreshTaskRequest
     * @return DescribeUnfinishRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnfinishRefreshTaskResponse DescribeUnfinishRefreshTask(DescribeUnfinishRefreshTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnfinishRefreshTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUnfinishRefreshTask", DescribeUnfinishRefreshTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of a cluster on the Security Dashboard and Cluster Security pages.
     * @param req DescribeUserClusterRequest
     * @return DescribeUserClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClusterResponse DescribeUserCluster(DescribeUserClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserCluster", DescribeUserClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of the required value-added service.
     * @param req DescribeValueAddedSrvInfoRequest
     * @return DescribeValueAddedSrvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeValueAddedSrvInfoResponse DescribeValueAddedSrvInfo(DescribeValueAddedSrvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeValueAddedSrvInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeValueAddedSrvInfo", DescribeValueAddedSrvInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an automatically isolated trojan sample.
     * @param req DescribeVirusAutoIsolateSampleDetailRequest
     * @return DescribeVirusAutoIsolateSampleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSampleDetailResponse DescribeVirusAutoIsolateSampleDetail(DescribeVirusAutoIsolateSampleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusAutoIsolateSampleDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusAutoIsolateSampleDetail", DescribeVirusAutoIsolateSampleDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the download URL of an automatically isolated trojan sample.
     * @param req DescribeVirusAutoIsolateSampleDownloadURLRequest
     * @return DescribeVirusAutoIsolateSampleDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSampleDownloadURLResponse DescribeVirusAutoIsolateSampleDownloadURL(DescribeVirusAutoIsolateSampleDownloadURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusAutoIsolateSampleDownloadURLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusAutoIsolateSampleDownloadURL", DescribeVirusAutoIsolateSampleDownloadURLResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of automatically isolated trojan samples.
     * @param req DescribeVirusAutoIsolateSampleListRequest
     * @return DescribeVirusAutoIsolateSampleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSampleListResponse DescribeVirusAutoIsolateSampleList(DescribeVirusAutoIsolateSampleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusAutoIsolateSampleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusAutoIsolateSampleList", DescribeVirusAutoIsolateSampleListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the settings of automatic trojan isolation.
     * @param req DescribeVirusAutoIsolateSettingRequest
     * @return DescribeVirusAutoIsolateSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSettingResponse DescribeVirusAutoIsolateSetting(DescribeVirusAutoIsolateSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusAutoIsolateSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusAutoIsolateSetting", DescribeVirusAutoIsolateSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of a trojan file at runtime.
     * @param req DescribeVirusDetailRequest
     * @return DescribeVirusDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusDetailResponse DescribeVirusDetail(DescribeVirusDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusDetail", DescribeVirusDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of trojan events.
     * @param req DescribeVirusEventTendencyRequest
     * @return DescribeVirusEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusEventTendencyResponse DescribeVirusEventTendency(DescribeVirusEventTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusEventTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusEventTendency", DescribeVirusEventTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of virus scanning events at runtime.
     * @param req DescribeVirusListRequest
     * @return DescribeVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusListResponse DescribeVirusList(DescribeVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusList", DescribeVirusListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the estimated timeout period of a quick trojan scan.
     * @param req DescribeVirusManualScanEstimateTimeoutRequest
     * @return DescribeVirusManualScanEstimateTimeoutResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusManualScanEstimateTimeoutResponse DescribeVirusManualScanEstimateTimeout(DescribeVirusManualScanEstimateTimeoutRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusManualScanEstimateTimeoutResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusManualScanEstimateTimeout", DescribeVirusManualScanEstimateTimeoutResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the real-time monitoring settings of virus scanning at runtime.
     * @param req DescribeVirusMonitorSettingRequest
     * @return DescribeVirusMonitorSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusMonitorSettingResponse DescribeVirusMonitorSetting(DescribeVirusMonitorSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusMonitorSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusMonitorSetting", DescribeVirusMonitorSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the download URL of a trojan sample.
     * @param req DescribeVirusSampleDownloadUrlRequest
     * @return DescribeVirusSampleDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusSampleDownloadUrlResponse DescribeVirusSampleDownloadUrl(DescribeVirusSampleDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusSampleDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusSampleDownloadUrl", DescribeVirusSampleDownloadUrlResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query virus scanning settings at runtime.
     * @param req DescribeVirusScanSettingRequest
     * @return DescribeVirusScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanSettingResponse DescribeVirusScanSetting(DescribeVirusScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusScanSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusScanSetting", DescribeVirusScanSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the status of a virus scanning task at runtime.
     * @param req DescribeVirusScanTaskStatusRequest
     * @return DescribeVirusScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanTaskStatusResponse DescribeVirusScanTaskStatus(DescribeVirusScanTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusScanTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusScanTaskStatus", DescribeVirusScanTaskStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the timeout settings of a file scan at runtime.
     * @param req DescribeVirusScanTimeoutSettingRequest
     * @return DescribeVirusScanTimeoutSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanTimeoutSettingResponse DescribeVirusScanTimeoutSetting(DescribeVirusScanTimeoutSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusScanTimeoutSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusScanTimeoutSetting", DescribeVirusScanTimeoutSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trojan overview at runtime.
     * @param req DescribeVirusSummaryRequest
     * @return DescribeVirusSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusSummaryResponse DescribeVirusSummary(DescribeVirusSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusSummary", DescribeVirusSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of virus scanning tasks at runtime.
     * @param req DescribeVirusTaskListRequest
     * @return DescribeVirusTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusTaskListResponse DescribeVirusTaskList(DescribeVirusTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVirusTaskList", DescribeVirusTaskListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of containers affected by vulnerabilities.
     * @param req DescribeVulContainerListRequest
     * @return DescribeVulContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulContainerListResponse DescribeVulContainerList(DescribeVulContainerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulContainerListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulContainerList", DescribeVulContainerListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of exploit prevention events.
     * @param req DescribeVulDefenceEventRequest
     * @return DescribeVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventResponse DescribeVulDefenceEvent(DescribeVulDefenceEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDefenceEvent", DescribeVulDefenceEventResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of an exploit prevention event.
     * @param req DescribeVulDefenceEventDetailRequest
     * @return DescribeVulDefenceEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventDetailResponse DescribeVulDefenceEventDetail(DescribeVulDefenceEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceEventDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDefenceEventDetail", DescribeVulDefenceEventDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of exploit prevention events.
     * @param req DescribeVulDefenceEventTendencyRequest
     * @return DescribeVulDefenceEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventTendencyResponse DescribeVulDefenceEventTendency(DescribeVulDefenceEventTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceEventTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDefenceEventTendency", DescribeVulDefenceEventTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of servers with exploit prevention enabled.
     * @param req DescribeVulDefenceHostRequest
     * @return DescribeVulDefenceHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceHostResponse DescribeVulDefenceHost(DescribeVulDefenceHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDefenceHost", DescribeVulDefenceHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of exploit prevention plugins.
     * @param req DescribeVulDefencePluginRequest
     * @return DescribeVulDefencePluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginResponse DescribeVulDefencePlugin(DescribeVulDefencePluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefencePluginResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDefencePlugin", DescribeVulDefencePluginResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the exploit prevention settings.
     * @param req DescribeVulDefenceSettingRequest
     * @return DescribeVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceSettingResponse DescribeVulDefenceSetting(DescribeVulDefenceSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDefenceSetting", DescribeVulDefenceSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query vulnerability details.
     * @param req DescribeVulDetailRequest
     * @return DescribeVulDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDetailResponse DescribeVulDetail(DescribeVulDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulDetail", DescribeVulDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of local images ignored in a vulnerability scan.
     * @param req DescribeVulIgnoreLocalImageListRequest
     * @return DescribeVulIgnoreLocalImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulIgnoreLocalImageListResponse DescribeVulIgnoreLocalImageList(DescribeVulIgnoreLocalImageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulIgnoreLocalImageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulIgnoreLocalImageList", DescribeVulIgnoreLocalImageListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of repository images ignored in a vulnerability scan.
     * @param req DescribeVulIgnoreRegistryImageListRequest
     * @return DescribeVulIgnoreRegistryImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulIgnoreRegistryImageListResponse DescribeVulIgnoreRegistryImageList(DescribeVulIgnoreRegistryImageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulIgnoreRegistryImageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulIgnoreRegistryImageList", DescribeVulIgnoreRegistryImageListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of images affected by vulnerabilities.
     * @param req DescribeVulImageListRequest
     * @return DescribeVulImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulImageListResponse DescribeVulImageList(DescribeVulImageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulImageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulImageList", DescribeVulImageListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the statistics of images affected by vulnerabilities.
     * @param req DescribeVulImageSummaryRequest
     * @return DescribeVulImageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulImageSummaryResponse DescribeVulImageSummary(DescribeVulImageSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulImageSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulImageSummary", DescribeVulImageSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the numbers of images affected by emergency vulnerabilities at each severity level.
     * @param req DescribeVulLevelImageSummaryRequest
     * @return DescribeVulLevelImageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelImageSummaryResponse DescribeVulLevelImageSummary(DescribeVulLevelImageSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulLevelImageSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulLevelImageSummary", DescribeVulLevelImageSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the numbers of vulnerabilities at each severity level.
     * @param req DescribeVulLevelSummaryRequest
     * @return DescribeVulLevelSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelSummaryResponse DescribeVulLevelSummary(DescribeVulLevelSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulLevelSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulLevelSummary", DescribeVulLevelSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to count the number of licensed but not scanned images on the vulnerability scanning page.
     * @param req DescribeVulScanAuthorizedImageSummaryRequest
     * @return DescribeVulScanAuthorizedImageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanAuthorizedImageSummaryResponse DescribeVulScanAuthorizedImageSummary(DescribeVulScanAuthorizedImageSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulScanAuthorizedImageSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulScanAuthorizedImageSummary", DescribeVulScanAuthorizedImageSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of a vulnerability scan task.
     * @param req DescribeVulScanInfoRequest
     * @return DescribeVulScanInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanInfoResponse DescribeVulScanInfo(DescribeVulScanInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulScanInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulScanInfo", DescribeVulScanInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of local images in a vulnerability scan task.
     * @param req DescribeVulScanLocalImageListRequest
     * @return DescribeVulScanLocalImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanLocalImageListResponse DescribeVulScanLocalImageList(DescribeVulScanLocalImageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulScanLocalImageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulScanLocalImageList", DescribeVulScanLocalImageListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the overview of vulnerability risks.
     * @param req DescribeVulSummaryRequest
     * @return DescribeVulSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulSummaryResponse DescribeVulSummary(DescribeVulSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulSummary", DescribeVulSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the trend of critical and high-risk vulnerabilities in local and repository images.
     * @param req DescribeVulTendencyRequest
     * @return DescribeVulTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTendencyResponse DescribeVulTendency(DescribeVulTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulTendencyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulTendency", DescribeVulTendencyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of top vulnerabilities.
     * @param req DescribeVulTopRankingRequest
     * @return DescribeVulTopRankingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTopRankingResponse DescribeVulTopRanking(DescribeVulTopRankingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulTopRankingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulTopRanking", DescribeVulTopRankingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of alert policies.
     * @param req DescribeWarningRulesRequest
     * @return DescribeWarningRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningRulesResponse DescribeWarningRules(DescribeWarningRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWarningRules", DescribeWarningRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of web application vulnerabilities.
     * @param req DescribeWebVulListRequest
     * @return DescribeWebVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebVulListResponse DescribeWebVulList(DescribeWebVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWebVulList", DescribeWebVulListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the list of virus scanning events at runtime.
     * @param req ExportVirusListRequest
     * @return ExportVirusListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVirusListResponse ExportVirusList(ExportVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVirusListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ExportVirusList", ExportVirusListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to initialize the compliance baseline environment and create necessary data and options.
     * @param req InitializeUserComplianceEnvironmentRequest
     * @return InitializeUserComplianceEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public InitializeUserComplianceEnvironmentResponse InitializeUserComplianceEnvironment(InitializeUserComplianceEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitializeUserComplianceEnvironmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "InitializeUserComplianceEnvironment", InitializeUserComplianceEnvironmentResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of an abnormal process policy at runtime.
     * @param req ModifyAbnormalProcessRuleStatusRequest
     * @return ModifyAbnormalProcessRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAbnormalProcessRuleStatusResponse ModifyAbnormalProcessRuleStatus(ModifyAbnormalProcessRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAbnormalProcessRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAbnormalProcessRuleStatus", ModifyAbnormalProcessRuleStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of an abnormal process event.
     * @param req ModifyAbnormalProcessStatusRequest
     * @return ModifyAbnormalProcessStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAbnormalProcessStatusResponse ModifyAbnormalProcessStatus(ModifyAbnormalProcessStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAbnormalProcessStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAbnormalProcessStatus", ModifyAbnormalProcessStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of an access control policy at runtime, i.e., enable or disable it.
     * @param req ModifyAccessControlRuleStatusRequest
     * @return ModifyAccessControlRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessControlRuleStatusResponse ModifyAccessControlRuleStatus(ModifyAccessControlRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessControlRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAccessControlRuleStatus", ModifyAccessControlRuleStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of an access control event at runtime.
     * @param req ModifyAccessControlStatusRequest
     * @return ModifyAccessControlStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessControlStatusResponse ModifyAccessControlStatus(ModifyAccessControlStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessControlStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAccessControlStatus", ModifyAccessControlStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to refresh server assets.
     * @param req ModifyAssetRequest
     * @return ModifyAssetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetResponse ModifyAsset(ModifyAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAsset", ModifyAssetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to stop an image scan task for an image repository.
     * @param req ModifyAssetImageRegistryScanStopRequest
     * @return ModifyAssetImageRegistryScanStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageRegistryScanStopResponse ModifyAssetImageRegistryScanStop(ModifyAssetImageRegistryScanStopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetImageRegistryScanStopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAssetImageRegistryScanStop", ModifyAssetImageRegistryScanStopResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to stop a quick image scan task for an image repository.
     * @param req ModifyAssetImageRegistryScanStopOneKeyRequest
     * @return ModifyAssetImageRegistryScanStopOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageRegistryScanStopOneKeyResponse ModifyAssetImageRegistryScanStopOneKey(ModifyAssetImageRegistryScanStopOneKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetImageRegistryScanStopOneKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAssetImageRegistryScanStopOneKey", ModifyAssetImageRegistryScanStopOneKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to stop an image scan.
     * @param req ModifyAssetImageScanStopRequest
     * @return ModifyAssetImageScanStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageScanStopResponse ModifyAssetImageScanStop(ModifyAssetImageScanStopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetImageScanStopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAssetImageScanStop", ModifyAssetImageScanStopResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the settings of a scheduled task, including the check cycle and the status of the compliance benchmark.
     * @param req ModifyCompliancePeriodTaskRequest
     * @return ModifyCompliancePeriodTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompliancePeriodTaskResponse ModifyCompliancePeriodTask(ModifyCompliancePeriodTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCompliancePeriodTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCompliancePeriodTask", ModifyCompliancePeriodTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to isolate a container.
     * @param req ModifyContainerNetStatusRequest
     * @return ModifyContainerNetStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContainerNetStatusResponse ModifyContainerNetStatus(ModifyContainerNetStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyContainerNetStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyContainerNetStatus", ModifyContainerNetStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of a container escape scan event.
     * @param req ModifyEscapeEventStatusRequest
     * @return ModifyEscapeEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeEventStatusResponse ModifyEscapeEventStatus(ModifyEscapeEventStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEscapeEventStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyEscapeEventStatus", ModifyEscapeEventStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the information of a container escape scan rule.
     * @param req ModifyEscapeRuleRequest
     * @return ModifyEscapeRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeRuleResponse ModifyEscapeRule(ModifyEscapeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEscapeRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyEscapeRule", ModifyEscapeRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an allowed escape.
     * @param req ModifyEscapeWhiteListRequest
     * @return ModifyEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeWhiteListResponse ModifyEscapeWhiteList(ModifyEscapeWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEscapeWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyEscapeWhiteList", ModifyEscapeWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch license images to be scanned (v2.0).
     * @param req ModifyImageAuthorizedRequest
     * @return ModifyImageAuthorizedResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAuthorizedResponse ModifyImageAuthorized(ModifyImageAuthorizedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageAuthorizedResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyImageAuthorized", ModifyImageAuthorizedResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the status of K8sApi exception events.
     * @param req ModifyK8sApiAbnormalEventStatusRequest
     * @return ModifyK8sApiAbnormalEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyK8sApiAbnormalEventStatusResponse ModifyK8sApiAbnormalEventStatus(ModifyK8sApiAbnormalEventStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyK8sApiAbnormalEventStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyK8sApiAbnormalEventStatus", ModifyK8sApiAbnormalEventStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the information of K8sApi abnormal rules.
     * @param req ModifyK8sApiAbnormalRuleInfoRequest
     * @return ModifyK8sApiAbnormalRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyK8sApiAbnormalRuleInfoResponse ModifyK8sApiAbnormalRuleInfo(ModifyK8sApiAbnormalRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyK8sApiAbnormalRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyK8sApiAbnormalRuleInfo", ModifyK8sApiAbnormalRuleInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the status of K8sApi abnormal event rules.
     * @param req ModifyK8sApiAbnormalRuleStatusRequest
     * @return ModifyK8sApiAbnormalRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyK8sApiAbnormalRuleStatusResponse ModifyK8sApiAbnormalRuleStatus(ModifyK8sApiAbnormalRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyK8sApiAbnormalRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyK8sApiAbnormalRuleStatus", ModifyK8sApiAbnormalRuleStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of a reverse shell event.
     * @param req ModifyReverseShellStatusRequest
     * @return ModifyReverseShellStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReverseShellStatusResponse ModifyReverseShellStatus(ModifyReverseShellStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyReverseShellStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyReverseShellStatus", ModifyReverseShellStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of a high-risk syscall event.
     * @param req ModifyRiskSyscallStatusRequest
     * @return ModifyRiskSyscallStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskSyscallStatusResponse ModifyRiskSyscallStatus(ModifyRiskSyscallStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRiskSyscallStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRiskSyscallStatus", ModifyRiskSyscallStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the settings of security log cleanup.
     * @param req ModifySecLogCleanSettingInfoRequest
     * @return ModifySecLogCleanSettingInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogCleanSettingInfoResponse ModifySecLogCleanSettingInfo(ModifySecLogCleanSettingInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecLogCleanSettingInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecLogCleanSettingInfo", ModifySecLogCleanSettingInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the configuration of security log delivery to CLS.
     * @param req ModifySecLogDeliveryClsSettingRequest
     * @return ModifySecLogDeliveryClsSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogDeliveryClsSettingResponse ModifySecLogDeliveryClsSetting(ModifySecLogDeliveryClsSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecLogDeliveryClsSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecLogDeliveryClsSetting", ModifySecLogDeliveryClsSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the settings of security log delivery to Kafka.
     * @param req ModifySecLogDeliveryKafkaSettingRequest
     * @return ModifySecLogDeliveryKafkaSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogDeliveryKafkaSettingResponse ModifySecLogDeliveryKafkaSetting(ModifySecLogDeliveryKafkaSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecLogDeliveryKafkaSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecLogDeliveryKafkaSetting", ModifySecLogDeliveryKafkaSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an accessed security log object.
     * @param req ModifySecLogJoinObjectsRequest
     * @return ModifySecLogJoinObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogJoinObjectsResponse ModifySecLogJoinObjects(ModifySecLogJoinObjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecLogJoinObjectsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecLogJoinObjects", ModifySecLogJoinObjectsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the security log access status.
     * @param req ModifySecLogJoinStateRequest
     * @return ModifySecLogJoinStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogJoinStateResponse ModifySecLogJoinState(ModifySecLogJoinStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecLogJoinStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecLogJoinState", ModifySecLogJoinStateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the UIN of a Kafka security log.
     * @param req ModifySecLogKafkaUINRequest
     * @return ModifySecLogKafkaUINResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogKafkaUINResponse ModifySecLogKafkaUIN(ModifySecLogKafkaUINRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecLogKafkaUINResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecLogKafkaUIN", ModifySecLogKafkaUINResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable/disable automatic trojan sample isolation.
     * @param req ModifyVirusAutoIsolateExampleSwitchRequest
     * @return ModifyVirusAutoIsolateExampleSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusAutoIsolateExampleSwitchResponse ModifyVirusAutoIsolateExampleSwitch(ModifyVirusAutoIsolateExampleSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusAutoIsolateExampleSwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVirusAutoIsolateExampleSwitch", ModifyVirusAutoIsolateExampleSwitchResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the settings of automatic trojan isolation.
     * @param req ModifyVirusAutoIsolateSettingRequest
     * @return ModifyVirusAutoIsolateSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusAutoIsolateSettingResponse ModifyVirusAutoIsolateSetting(ModifyVirusAutoIsolateSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusAutoIsolateSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVirusAutoIsolateSetting", ModifyVirusAutoIsolateSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the status of a trojan file at runtime.
     * @param req ModifyVirusFileStatusRequest
     * @return ModifyVirusFileStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusFileStatusResponse ModifyVirusFileStatus(ModifyVirusFileStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusFileStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVirusFileStatus", ModifyVirusFileStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the real-time monitoring settings of virus scanning at runtime.
     * @param req ModifyVirusMonitorSettingRequest
     * @return ModifyVirusMonitorSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusMonitorSettingResponse ModifyVirusMonitorSetting(ModifyVirusMonitorSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusMonitorSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVirusMonitorSetting", ModifyVirusMonitorSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update virus scanning settings at runtime.
     * @param req ModifyVirusScanSettingRequest
     * @return ModifyVirusScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusScanSettingResponse ModifyVirusScanSetting(ModifyVirusScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusScanSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVirusScanSetting", ModifyVirusScanSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the timeout settings of a file scan at runtime.
     * @param req ModifyVirusScanTimeoutSettingRequest
     * @return ModifyVirusScanTimeoutSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusScanTimeoutSettingResponse ModifyVirusScanTimeoutSetting(ModifyVirusScanTimeoutSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusScanTimeoutSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVirusScanTimeoutSetting", ModifyVirusScanTimeoutSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the status of an exploit prevention event.
     * @param req ModifyVulDefenceEventStatusRequest
     * @return ModifyVulDefenceEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceEventStatusResponse ModifyVulDefenceEventStatus(ModifyVulDefenceEventStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVulDefenceEventStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVulDefenceEventStatus", ModifyVulDefenceEventStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to edit the exploit prevention settings.
     * @param req ModifyVulDefenceSettingRequest
     * @return ModifyVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceSettingResponse ModifyVulDefenceSetting(ModifyVulDefenceSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVulDefenceSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVulDefenceSetting", ModifyVulDefenceSettingResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to activate TCSS trial.
     * @param req OpenTcssTrialRequest
     * @return OpenTcssTrialResponse
     * @throws TencentCloudSDKException
     */
    public OpenTcssTrialResponse OpenTcssTrial(OpenTcssTrialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenTcssTrialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "OpenTcssTrial", OpenTcssTrialResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the details of an image repository.
     * @param req RemoveAssetImageRegistryRegistryDetailRequest
     * @return RemoveAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAssetImageRegistryRegistryDetailResponse RemoveAssetImageRegistryRegistryDetail(RemoveAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RemoveAssetImageRegistryRegistryDetail", RemoveAssetImageRegistryRegistryDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to license an image to be scanned.
     * @param req RenewImageAuthorizeStateRequest
     * @return RenewImageAuthorizeStateResponse
     * @throws TencentCloudSDKException
     */
    public RenewImageAuthorizeStateResponse RenewImageAuthorizeState(RenewImageAuthorizeStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewImageAuthorizeStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RenewImageAuthorizeState", RenewImageAuthorizeStateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to reset a security log topic.
     * @param req ResetSecLogTopicConfigRequest
     * @return ResetSecLogTopicConfigResponse
     * @throws TencentCloudSDKException
     */
    public ResetSecLogTopicConfigResponse ResetSecLogTopicConfig(ResetSecLogTopicConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetSecLogTopicConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetSecLogTopicConfig", ResetSecLogTopicConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check the specified asset again.
     * @param req ScanComplianceAssetsRequest
     * @return ScanComplianceAssetsResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceAssetsResponse ScanComplianceAssets(ScanComplianceAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanComplianceAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ScanComplianceAssets", ScanComplianceAssetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check the specified asset again with the specified check item and return the ID of the created compliance check task.
     * @param req ScanComplianceAssetsByPolicyItemRequest
     * @return ScanComplianceAssetsByPolicyItemResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceAssetsByPolicyItemResponse ScanComplianceAssetsByPolicyItem(ScanComplianceAssetsByPolicyItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanComplianceAssetsByPolicyItemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ScanComplianceAssetsByPolicyItem", ScanComplianceAssetsByPolicyItemResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check all the assets of the specified check item again and return the ID of the created compliance check task.
     * @param req ScanCompliancePolicyItemsRequest
     * @return ScanCompliancePolicyItemsResponse
     * @throws TencentCloudSDKException
     */
    public ScanCompliancePolicyItemsResponse ScanCompliancePolicyItems(ScanCompliancePolicyItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanCompliancePolicyItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ScanCompliancePolicyItems", ScanCompliancePolicyItemsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check all the failed check items of the specified asset again and return the ID of the created compliance check task.
     * @param req ScanComplianceScanFailedAssetsRequest
     * @return ScanComplianceScanFailedAssetsResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceScanFailedAssetsResponse ScanComplianceScanFailedAssets(ScanComplianceScanFailedAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanComplianceScanFailedAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ScanComplianceScanFailedAssets", ScanComplianceScanFailedAssetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set the check mode and automatic check.
     * @param req SetCheckModeRequest
     * @return SetCheckModeResponse
     * @throws TencentCloudSDKException
     */
    public SetCheckModeResponse SetCheckMode(SetCheckModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCheckModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SetCheckMode", SetCheckModeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to stop a trojan scan task at runtime.
     * @param req StopVirusScanTaskRequest
     * @return StopVirusScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVirusScanTaskResponse StopVirusScanTask(StopVirusScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopVirusScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "StopVirusScanTask", StopVirusScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to stop a vulnerability scan task.
     * @param req StopVulScanTaskRequest
     * @return StopVulScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVulScanTaskResponse StopVulScanTask(StopVulScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopVulScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "StopVulScanTask", StopVulScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable/disable automatic licensing for local images.
     * @param req SwitchImageAutoAuthorizedRuleRequest
     * @return SwitchImageAutoAuthorizedRuleResponse
     * @throws TencentCloudSDKException
     */
    public SwitchImageAutoAuthorizedRuleResponse SwitchImageAutoAuthorizedRule(SwitchImageAutoAuthorizedRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchImageAutoAuthorizedRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SwitchImageAutoAuthorizedRule", SwitchImageAutoAuthorizedRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to refresh the assets in an image repository.
     * @param req SyncAssetImageRegistryAssetRequest
     * @return SyncAssetImageRegistryAssetResponse
     * @throws TencentCloudSDKException
     */
    public SyncAssetImageRegistryAssetResponse SyncAssetImageRegistryAsset(SyncAssetImageRegistryAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncAssetImageRegistryAssetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SyncAssetImageRegistryAsset", SyncAssetImageRegistryAssetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to update and publish a network policy in the container network.
     * @param req UpdateAndPublishNetworkFirewallPolicyDetailRequest
     * @return UpdateAndPublishNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAndPublishNetworkFirewallPolicyDetailResponse UpdateAndPublishNetworkFirewallPolicyDetail(UpdateAndPublishNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAndPublishNetworkFirewallPolicyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateAndPublishNetworkFirewallPolicyDetail", UpdateAndPublishNetworkFirewallPolicyDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to update and publish a YAML network policy in the container network.
     * @param req UpdateAndPublishNetworkFirewallPolicyYamlDetailRequest
     * @return UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse UpdateAndPublishNetworkFirewallPolicyYamlDetail(UpdateAndPublishNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateAndPublishNetworkFirewallPolicyYamlDetail", UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the details of an image repository.
     * @param req UpdateAssetImageRegistryRegistryDetailRequest
     * @return UpdateAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssetImageRegistryRegistryDetailResponse UpdateAssetImageRegistryRegistryDetail(UpdateAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateAssetImageRegistryRegistryDetail", UpdateAssetImageRegistryRegistryDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a scheduled task for an image repository.
     * @param req UpdateImageRegistryTimingScanTaskRequest
     * @return UpdateImageRegistryTimingScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageRegistryTimingScanTaskResponse UpdateImageRegistryTimingScanTask(UpdateImageRegistryTimingScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateImageRegistryTimingScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateImageRegistryTimingScanTask", UpdateImageRegistryTimingScanTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to update a network policy in the container network.
     * @param req UpdateNetworkFirewallPolicyDetailRequest
     * @return UpdateNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNetworkFirewallPolicyDetailResponse UpdateNetworkFirewallPolicyDetail(UpdateNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateNetworkFirewallPolicyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateNetworkFirewallPolicyDetail", UpdateNetworkFirewallPolicyDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to update a YAML network policy in the container network.
     * @param req UpdateNetworkFirewallPolicyYamlDetailRequest
     * @return UpdateNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNetworkFirewallPolicyYamlDetailResponse UpdateNetworkFirewallPolicyYamlDetail(UpdateNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateNetworkFirewallPolicyYamlDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateNetworkFirewallPolicyYamlDetail", UpdateNetworkFirewallPolicyYamlDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
