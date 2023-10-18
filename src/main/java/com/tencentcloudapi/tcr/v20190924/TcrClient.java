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
package com.tencentcloudapi.tcr.v20190924;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcr.v20190924.models.*;

public class TcrClient extends AbstractClient{
    private static String endpoint = "tcr.tencentcloudapi.com";
    private static String service = "tcr";
    private static String version = "2019-09-24";
    
    public TcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcrClient(Credential credential, String region, ClientProfile profile) {
        super(TcrClient.endpoint, TcrClient.version, credential, region, profile);
    }

    /**
     *This API is used to verify the information of the Enterprise Edition instance.
     * @param req CheckInstanceRequest
     * @return CheckInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstanceResponse CheckInstance(CheckInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckInstance", CheckInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check whether the name of the instance to be created meets the specifications.
     * @param req CheckInstanceNameRequest
     * @return CheckInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstanceNameResponse CheckInstanceName(CheckInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckInstanceNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckInstanceName", CheckInstanceNameResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a custom account.
     * @param req CreateCustomAccountRequest
     * @return CreateCustomAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomAccountResponse CreateCustomAccount(CreateCustomAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCustomAccount", CreateCustomAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an image acceleration service.
     * @param req CreateImageAccelerationServiceRequest
     * @return CreateImageAccelerationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageAccelerationServiceResponse CreateImageAccelerationService(CreateImageAccelerationServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageAccelerationServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateImageAccelerationService", CreateImageAccelerationServiceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create the tag immutability rule.
     * @param req CreateImmutableTagRulesRequest
     * @return CreateImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateImmutableTagRulesResponse CreateImmutableTagRules(CreateImmutableTagRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImmutableTagRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateImmutableTagRules", CreateImmutableTagRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an instance.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a custom domain name.
     * @param req CreateInstanceCustomizedDomainRequest
     * @return CreateInstanceCustomizedDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceCustomizedDomainResponse CreateInstanceCustomizedDomain(CreateInstanceCustomizedDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceCustomizedDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateInstanceCustomizedDomain", CreateInstanceCustomizedDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a temporary or long-term instance access credential.
     * @param req CreateInstanceTokenRequest
     * @return CreateInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceTokenResponse CreateInstanceToken(CreateInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateInstanceToken", CreateInstanceTokenResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create multiple public network access allowlist policies of the TCR instance.
     * @param req CreateMultipleSecurityPolicyRequest
     * @return CreateMultipleSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultipleSecurityPolicyResponse CreateMultipleSecurityPolicy(CreateMultipleSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultipleSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateMultipleSecurityPolicy", CreateMultipleSecurityPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a namespace in an Enterprise Edition instance.
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a replication instance.
     * @param req CreateReplicationInstanceRequest
     * @return CreateReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateReplicationInstanceResponse CreateReplicationInstance(CreateReplicationInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReplicationInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateReplicationInstance", CreateReplicationInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an image repository in an Enterprise Edition instance.
     * @param req CreateRepositoryRequest
     * @return CreateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryResponse CreateRepository(CreateRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRepositoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRepository", CreateRepositoryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a public network access allowlist policy for an instance.
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSecurityPolicy", CreateSecurityPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a service account.
     * @param req CreateServiceAccountRequest
     * @return CreateServiceAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceAccountResponse CreateServiceAccount(CreateServiceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateServiceAccount", CreateServiceAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a signature for an image tag.
     * @param req CreateSignatureRequest
     * @return CreateSignatureResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignatureResponse CreateSignature(CreateSignatureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignatureResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSignature", CreateSignatureResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an image signature policy.
     * @param req CreateSignaturePolicyRequest
     * @return CreateSignaturePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignaturePolicyResponse CreateSignaturePolicy(CreateSignaturePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignaturePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSignaturePolicy", CreateSignaturePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to execute tag retention manually.
     * @param req CreateTagRetentionExecutionRequest
     * @return CreateTagRetentionExecutionResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagRetentionExecutionResponse CreateTagRetentionExecution(CreateTagRetentionExecutionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTagRetentionExecutionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTagRetentionExecution", CreateTagRetentionExecutionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a tag retention rule.
     * @param req CreateTagRetentionRuleRequest
     * @return CreateTagRetentionRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagRetentionRuleResponse CreateTagRetentionRule(CreateTagRetentionRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTagRetentionRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTagRetentionRule", CreateTagRetentionRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a trigger.
     * @param req CreateWebhookTriggerRequest
     * @return CreateWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebhookTriggerResponse CreateWebhookTrigger(CreateWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWebhookTriggerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateWebhookTrigger", CreateWebhookTriggerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a custom account.
     * @param req DeleteCustomAccountRequest
     * @return DeleteCustomAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomAccountResponse DeleteCustomAccount(DeleteCustomAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCustomAccount", DeleteCustomAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the specified image.
     * @param req DeleteImageRequest
     * @return DeleteImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageResponse DeleteImage(DeleteImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteImage", DeleteImageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an image acceleration service.
     * @param req DeleteImageAccelerateServiceRequest
     * @return DeleteImageAccelerateServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageAccelerateServiceResponse DeleteImageAccelerateService(DeleteImageAccelerateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageAccelerateServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteImageAccelerateService", DeleteImageAccelerateServiceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     * This API is used to delete the tag immutability rule.
     * @param req DeleteImmutableTagRulesRequest
     * @return DeleteImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImmutableTagRulesResponse DeleteImmutableTagRules(DeleteImmutableTagRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImmutableTagRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteImmutableTagRules", DeleteImmutableTagRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a TCR Enterprise Edition instance.
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a custom domain name.
     * @param req DeleteInstanceCustomizedDomainRequest
     * @return DeleteInstanceCustomizedDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceCustomizedDomainResponse DeleteInstanceCustomizedDomain(DeleteInstanceCustomizedDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceCustomizedDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteInstanceCustomizedDomain", DeleteInstanceCustomizedDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a long-term access credential.
     * @param req DeleteInstanceTokenRequest
     * @return DeleteInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceTokenResponse DeleteInstanceToken(DeleteInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteInstanceToken", DeleteInstanceTokenResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete multiple public network access allowlist policies of the instance.
     * @param req DeleteMultipleSecurityPolicyRequest
     * @return DeleteMultipleSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMultipleSecurityPolicyResponse DeleteMultipleSecurityPolicy(DeleteMultipleSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMultipleSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMultipleSecurityPolicy", DeleteMultipleSecurityPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a namespace.
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNamespace", DeleteNamespaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a replica instance.
     * @param req DeleteReplicationInstanceRequest
     * @return DeleteReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReplicationInstanceResponse DeleteReplicationInstance(DeleteReplicationInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReplicationInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteReplicationInstance", DeleteReplicationInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an image repository.
     * @param req DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryResponse DeleteRepository(DeleteRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRepositoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRepository", DeleteRepositoryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch delete repository tags in an Enterprise Edition instance.
     * @param req DeleteRepositoryTagsRequest
     * @return DeleteRepositoryTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryTagsResponse DeleteRepositoryTags(DeleteRepositoryTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRepositoryTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRepositoryTags", DeleteRepositoryTagsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a public network access allow policy.

Note: When both `PolicyIndex` and `CidrBlock` are specified, `CidrBlock` takes the higher priority
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSecurityPolicy", DeleteSecurityPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a service account.
     * @param req DeleteServiceAccountRequest
     * @return DeleteServiceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceAccountResponse DeleteServiceAccount(DeleteServiceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteServiceAccount", DeleteServiceAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a namespace signing policy.
     * @param req DeleteSignaturePolicyRequest
     * @return DeleteSignaturePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSignaturePolicyResponse DeleteSignaturePolicy(DeleteSignaturePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSignaturePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSignaturePolicy", DeleteSignaturePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a tag retention rule.
     * @param req DeleteTagRetentionRuleRequest
     * @return DeleteTagRetentionRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagRetentionRuleResponse DeleteTagRetentionRule(DeleteTagRetentionRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTagRetentionRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteTagRetentionRule", DeleteTagRetentionRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a trigger.
     * @param req DeleteWebhookTriggerRequest
     * @return DeleteWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookTriggerResponse DeleteWebhookTrigger(DeleteWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebhookTriggerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteWebhookTrigger", DeleteWebhookTriggerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to return the chart download information in an Enterprise Edition instance.
     * @param req DescribeChartDownloadInfoRequest
     * @return DescribeChartDownloadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChartDownloadInfoResponse DescribeChartDownloadInfo(DescribeChartDownloadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChartDownloadInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeChartDownloadInfo", DescribeChartDownloadInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query custom accounts.
     * @param req DescribeCustomAccountsRequest
     * @return DescribeCustomAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomAccountsResponse DescribeCustomAccounts(DescribeCustomAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomAccounts", DescribeCustomAccountsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the public network access entry status of an instance.
     * @param req DescribeExternalEndpointStatusRequest
     * @return DescribeExternalEndpointStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalEndpointStatusResponse DescribeExternalEndpointStatus(DescribeExternalEndpointStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExternalEndpointStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeExternalEndpointStatus", DescribeExternalEndpointStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the last ten garbage collection (GC) records.
     * @param req DescribeGCJobsRequest
     * @return DescribeGCJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGCJobsResponse DescribeGCJobs(DescribeGCJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGCJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeGCJobs", DescribeGCJobsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the status of an image acceleration service.
     * @param req DescribeImageAccelerateServiceRequest
     * @return DescribeImageAccelerateServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAccelerateServiceResponse DescribeImageAccelerateService(DescribeImageAccelerateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageAccelerateServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageAccelerateService", DescribeImageAccelerateServiceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the manifest information of a container image.
     * @param req DescribeImageManifestsRequest
     * @return DescribeImageManifestsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageManifestsResponse DescribeImageManifests(DescribeImageManifestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageManifestsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImageManifests", DescribeImageManifestsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of image tags or the information of the specified container image.
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to list the tag immutability rule.
     * @param req DescribeImmutableTagRulesRequest
     * @return DescribeImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImmutableTagRulesResponse DescribeImmutableTagRules(DescribeImmutableTagRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImmutableTagRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImmutableTagRules", DescribeImmutableTagRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of all namespaces in an instance.
     * @param req DescribeInstanceAllNamespacesRequest
     * @return DescribeInstanceAllNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAllNamespacesResponse DescribeInstanceAllNamespaces(DescribeInstanceAllNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceAllNamespacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInstanceAllNamespaces", DescribeInstanceAllNamespacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of custom domain names of an instance.
     * @param req DescribeInstanceCustomizedDomainRequest
     * @return DescribeInstanceCustomizedDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceCustomizedDomainResponse DescribeInstanceCustomizedDomain(DescribeInstanceCustomizedDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceCustomizedDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInstanceCustomizedDomain", DescribeInstanceCustomizedDomainResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the current status and process information of an instance.
     * @param req DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStatusResponse DescribeInstanceStatus(DescribeInstanceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInstanceStatus", DescribeInstanceStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of long-term access credentials.
     * @param req DescribeInstanceTokenRequest
     * @return DescribeInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTokenResponse DescribeInstanceToken(DescribeInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInstanceToken", DescribeInstanceTokenResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the instance information.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the VPC URLs for private network access to an instance.
     * @param req DescribeInternalEndpointsRequest
     * @return DescribeInternalEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternalEndpointsResponse DescribeInternalEndpoints(DescribeInternalEndpointsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInternalEndpointsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeInternalEndpoints", DescribeInternalEndpointsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the namespace list or the information of the specified namespace.
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNamespaces", DescribeNamespacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the available regions in TCR.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the task status of creating a replication instance.
     * @param req DescribeReplicationInstanceCreateTasksRequest
     * @return DescribeReplicationInstanceCreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstanceCreateTasksResponse DescribeReplicationInstanceCreateTasks(DescribeReplicationInstanceCreateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplicationInstanceCreateTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReplicationInstanceCreateTasks", DescribeReplicationInstanceCreateTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the synchronization status of a replication instance.
     * @param req DescribeReplicationInstanceSyncStatusRequest
     * @return DescribeReplicationInstanceSyncStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstanceSyncStatusResponse DescribeReplicationInstanceSyncStatus(DescribeReplicationInstanceSyncStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplicationInstanceSyncStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReplicationInstanceSyncStatus", DescribeReplicationInstanceSyncStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of replication instances.
     * @param req DescribeReplicationInstancesRequest
     * @return DescribeReplicationInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstancesResponse DescribeReplicationInstances(DescribeReplicationInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplicationInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeReplicationInstances", DescribeReplicationInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the image repository list or the information of the specified image repository.
     * @param req DescribeRepositoriesRequest
     * @return DescribeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRepositories", DescribeRepositoriesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the public network access allowlist policies of an instance.
     * @param req DescribeSecurityPoliciesRequest
     * @return DescribeSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPoliciesResponse DescribeSecurityPolicies(DescribeSecurityPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityPolicies", DescribeSecurityPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query service accounts.
     * @param req DescribeServiceAccountsRequest
     * @return DescribeServiceAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceAccountsResponse DescribeServiceAccounts(DescribeServiceAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeServiceAccounts", DescribeServiceAccountsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query tag retention execution records.
     * @param req DescribeTagRetentionExecutionRequest
     * @return DescribeTagRetentionExecutionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRetentionExecutionResponse DescribeTagRetentionExecution(DescribeTagRetentionExecutionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagRetentionExecutionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTagRetentionExecution", DescribeTagRetentionExecutionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query tag retention execution tasks.
     * @param req DescribeTagRetentionExecutionTaskRequest
     * @return DescribeTagRetentionExecutionTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRetentionExecutionTaskResponse DescribeTagRetentionExecutionTask(DescribeTagRetentionExecutionTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagRetentionExecutionTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTagRetentionExecutionTask", DescribeTagRetentionExecutionTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query tag retention rules.
     * @param req DescribeTagRetentionRulesRequest
     * @return DescribeTagRetentionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRetentionRulesResponse DescribeTagRetentionRules(DescribeTagRetentionRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagRetentionRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTagRetentionRules", DescribeTagRetentionRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query triggers.
     * @param req DescribeWebhookTriggerRequest
     * @return DescribeWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookTriggerResponse DescribeWebhookTrigger(DescribeWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebhookTriggerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWebhookTrigger", DescribeWebhookTriggerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get trigger logs.
     * @param req DescribeWebhookTriggerLogRequest
     * @return DescribeWebhookTriggerLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookTriggerLogResponse DescribeWebhookTriggerLog(DescribeWebhookTriggerLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebhookTriggerLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWebhookTriggerLog", DescribeWebhookTriggerLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to download a Helm chart in TCR.
     * @param req DownloadHelmChartRequest
     * @return DownloadHelmChartResponse
     * @throws TencentCloudSDKException
     */
    public DownloadHelmChartResponse DownloadHelmChart(DownloadHelmChartRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadHelmChartResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DownloadHelmChart", DownloadHelmChartResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to manage the public network access of an instance.
     * @param req ManageExternalEndpointRequest
     * @return ManageExternalEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ManageExternalEndpointResponse ManageExternalEndpoint(ManageExternalEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageExternalEndpointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ManageExternalEndpoint", ManageExternalEndpointResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to manage VPC URLs for private network access to an instance.
     * @param req ManageInternalEndpointRequest
     * @return ManageInternalEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ManageInternalEndpointResponse ManageInternalEndpoint(ManageInternalEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageInternalEndpointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ManageInternalEndpoint", ManageInternalEndpointResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to manage the instance synchronization rule.
     * @param req ManageReplicationRequest
     * @return ManageReplicationResponse
     * @throws TencentCloudSDKException
     */
    public ManageReplicationResponse ManageReplication(ManageReplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageReplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ManageReplication", ManageReplicationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a custom account.
     * @param req ModifyCustomAccountRequest
     * @return ModifyCustomAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomAccountResponse ModifyCustomAccount(ModifyCustomAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCustomAccount", ModifyCustomAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the tag immutability rule.
     * @param req ModifyImmutableTagRulesRequest
     * @return ModifyImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImmutableTagRulesResponse ModifyImmutableTagRules(ModifyImmutableTagRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImmutableTagRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyImmutableTagRules", ModifyImmutableTagRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update instance information.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the status of the specified long-term access credential in an instance.
     * @param req ModifyInstanceTokenRequest
     * @return ModifyInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTokenResponse ModifyInstanceToken(ModifyInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyInstanceToken", ModifyInstanceTokenResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the information of a namespace. Currently, only the namespace access level can be modified.
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNamespaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNamespace", ModifyNamespaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the information of an image repository. The repository description can be modified.
     * @param req ModifyRepositoryRequest
     * @return ModifyRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryResponse ModifyRepository(ModifyRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRepositoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRepository", ModifyRepositoryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the public network access allowlist of an instance.
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecurityPolicy", ModifySecurityPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a service account.
     * @param req ModifyServiceAccountRequest
     * @return ModifyServiceAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceAccountResponse ModifyServiceAccount(ModifyServiceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyServiceAccount", ModifyServiceAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a tag retention rule.
     * @param req ModifyTagRetentionRuleRequest
     * @return ModifyTagRetentionRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTagRetentionRuleResponse ModifyTagRetentionRule(ModifyTagRetentionRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTagRetentionRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyTagRetentionRule", ModifyTagRetentionRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a trigger.
     * @param req ModifyWebhookTriggerRequest
     * @return ModifyWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookTriggerResponse ModifyWebhookTrigger(ModifyWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebhookTriggerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyWebhookTrigger", ModifyWebhookTriggerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to renew a prepaid instance or change the billing mode from pay-as-you-go billing to monthly subscription billing.
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
