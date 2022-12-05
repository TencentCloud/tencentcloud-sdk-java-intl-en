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
        try {
                Type type = new TypeToken<JsonResponseModel<CheckInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CheckInstanceNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckInstanceName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageAccelerationServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImageAccelerationService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImmutableTagRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImmutableTagRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceCustomizedDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceCustomizedDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultipleSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMultipleSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReplicationInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReplicationInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create public network access allowlist policies for an instance.
     * @param req CreateSecurityPoliciesRequest
     * @return CreateSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPoliciesResponse CreateSecurityPolicies(CreateSecurityPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
     *This API is used to create a signature for an image tag.
     * @param req CreateSignatureRequest
     * @return CreateSignatureResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignatureResponse CreateSignature(CreateSignatureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignatureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSignatureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSignature");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSignaturePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSignaturePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTagRetentionExecutionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTagRetentionExecution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTagRetentionRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTagRetentionRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageAccelerateServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageAccelerateService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImmutableTagRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImmutableTagRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceCustomizedDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstanceCustomizedDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMultipleSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMultipleSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReplicationInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReplicationInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRepositoryTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRepositoryTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a public network access allowlist policy of an instance.
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
     *This API is used to delete a namespace signing policy.
     * @param req DeleteSignaturePolicyRequest
     * @return DeleteSignaturePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSignaturePolicyResponse DeleteSignaturePolicy(DeleteSignaturePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSignaturePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSignaturePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSignaturePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTagRetentionRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTagRetentionRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChartDownloadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChartDownloadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExternalEndpointStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExternalEndpointStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGCJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGCJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageAccelerateServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageAccelerateService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageManifestsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageManifests");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImmutableTagRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImmutableTagRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of all instances.
     * @param req DescribeInstanceAllRequest
     * @return DescribeInstanceAllResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAllResponse DescribeInstanceAll(DescribeInstanceAllRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceAllResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceAllResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceAll");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceAllNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceAllNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceCustomizedDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceCustomizedDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInternalEndpointsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInternalEndpoints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplicationInstanceCreateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplicationInstanceCreateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplicationInstanceSyncStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplicationInstanceSyncStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplicationInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplicationInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepositories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagRetentionExecutionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagRetentionExecution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagRetentionExecutionTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagRetentionExecutionTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagRetentionRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagRetentionRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebhookTriggerLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebhookTriggerLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadHelmChartResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadHelmChart");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ManageExternalEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ManageExternalEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ManageInternalEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ManageInternalEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ManageReplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ManageReplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImmutableTagRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyImmutableTagRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTagRetentionRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTagRetentionRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
