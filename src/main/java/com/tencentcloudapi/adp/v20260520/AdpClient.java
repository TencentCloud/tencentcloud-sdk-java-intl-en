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
package com.tencentcloudapi.adp.v20260520;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.adp.v20260520.models.*;

public class AdpClient extends AbstractClient{
    private static String endpoint = "adp.intl.tencentcloudapi.com";
    private static String service = "adp";
    private static String version = "2026-05-20";

    public AdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AdpClient(Credential credential, String region, ClientProfile profile) {
        super(AdpClient.endpoint, AdpClient.version, credential, region, profile);
    }

    /**
     *Tool call triggered by a user in the MCP App iframe.
     * @param req CallMCPToolRequest
     * @return CallMCPToolResponse
     * @throws TencentCloudSDKException
     */
    public CallMCPToolResponse CallMCPTool(CallMCPToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallMCPTool", CallMCPToolResponse.class);
    }

    /**
     *Validate tags
     * @param req CheckLabelRequest
     * @return CheckLabelResponse
     * @throws TencentCloudSDKException
     */
    public CheckLabelResponse CheckLabel(CheckLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckLabel", CheckLabelResponse.class);
    }

    /**
     *This API is used to replicate an Agent. Currently only support claw mode.
     * @param req CopyAgentFromAppRequest
     * @return CopyAgentFromAppResponse
     * @throws TencentCloudSDKException
     */
    public CopyAgentFromAppResponse CopyAgentFromApp(CopyAgentFromAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyAgentFromApp", CopyAgentFromAppResponse.class);
    }

    /**
     *Copy an application
     * @param req CopyAppRequest
     * @return CopyAppResponse
     * @throws TencentCloudSDKException
     */
    public CopyAppResponse CopyApp(CopyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyApp", CopyAppResponse.class);
    }

    /**
     *This API is used to create an Agent. Currently only support claw mode.
     * @param req CreateAgentRequest
     * @return CreateAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentResponse CreateAgent(CreateAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgent", CreateAgentResponse.class);
    }

    /**
     *This API is used to create an application.
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApp", CreateAppResponse.class);
    }

    /**
     *CreateAppTrigger
     * @param req CreateAppTriggerRequest
     * @return CreateAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppTriggerResponse CreateAppTrigger(CreateAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAppTrigger", CreateAppTriggerResponse.class);
    }

    /**
     *Create a category
     * @param req CreateCategoryRequest
     * @return CreateCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateCategoryResponse CreateCategory(CreateCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCategory", CreateCategoryResponse.class);
    }

    /**
     *Create a channel (distinguish B-end application release channels from C-end IM channels by scene)
     * @param req CreateChannelRequest
     * @return CreateChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelResponse CreateChannel(CreateChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChannel", CreateChannelResponse.class);
    }

    /**
     *Create session
     * @param req CreateConversationRequest
     * @return CreateConversationResponse
     * @throws TencentCloudSDKException
     */
    public CreateConversationResponse CreateConversation(CreateConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConversation", CreateConversationResponse.class);
    }

    /**
     *This API is used to create a knowledge base.
     * @param req CreateKBRequest
     * @return CreateKBResponse
     * @throws TencentCloudSDKException
     */
    public CreateKBResponse CreateKB(CreateKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKB", CreateKBResponse.class);
    }

    /**
     *Create a tag
     * @param req CreateLabelRequest
     * @return CreateLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateLabelResponse CreateLabel(CreateLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLabel", CreateLabelResponse.class);
    }

    /**
     *This API is used to create a message record category, with support for specifying the category name and parent category. A ParentId of 0 indicates a level-1 category.
     * @param req CreateMsgRecordCategoryRequest
     * @return CreateMsgRecordCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateMsgRecordCategoryResponse CreateMsgRecordCategory(CreateMsgRecordCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMsgRecordCategory", CreateMsgRecordCategoryResponse.class);
    }

    /**
     *This API is used to query plugin details.
     * @param req CreatePluginRequest
     * @return CreatePluginResponse
     * @throws TencentCloudSDKException
     */
    public CreatePluginResponse CreatePlugin(CreatePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlugin", CreatePluginResponse.class);
    }

    /**
     *Create a QA generation task
     * @param req CreateQAGenerationTaskRequest
     * @return CreateQAGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateQAGenerationTaskResponse CreateQAGenerationTask(CreateQAGenerationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQAGenerationTask", CreateQAGenerationTaskResponse.class);
    }

    /**
     *Batch create QA
     * @param req CreateQAListRequest
     * @return CreateQAListResponse
     * @throws TencentCloudSDKException
     */
    public CreateQAListResponse CreateQAList(CreateQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQAList", CreateQAListResponse.class);
    }

    /**
     *Add new release task
     * @param req CreateReleaseRequest
     * @return CreateReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseResponse CreateRelease(CreateReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRelease", CreateReleaseResponse.class);
    }

    /**
     *This API is used to create a similar question generation task.
     * @param req CreateSimilarQuestionRequest
     * @return CreateSimilarQuestionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSimilarQuestionResponse CreateSimilarQuestion(CreateSimilarQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSimilarQuestion", CreateSimilarQuestionResponse.class);
    }

    /**
     *Creates a skill
     * @param req CreateSkillRequest
     * @return CreateSkillResponse
     * @throws TencentCloudSDKException
     */
    public CreateSkillResponse CreateSkill(CreateSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSkill", CreateSkillResponse.class);
    }

    /**
     *Submit a custom Skill for enterprise-level shared approval (two-segment: submit, approve, callback to create a shared task)
     * @param req CreateSkillShareRequest
     * @return CreateSkillShareResponse
     * @throws TencentCloudSDKException
     */
    public CreateSkillShareResponse CreateSkillShare(CreateSkillShareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSkillShare", CreateSkillShareResponse.class);
    }

    /**
     *Create a space
     * @param req CreateSpaceRequest
     * @return CreateSpaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSpaceResponse CreateSpace(CreateSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSpace", CreateSpaceResponse.class);
    }

    /**
     *This API is used to create parameter variables.
     * @param req CreateVariableRequest
     * @return CreateVariableResponse
     * @throws TencentCloudSDKException
     */
    public CreateVariableResponse CreateVariable(CreateVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVariable", CreateVariableResponse.class);
    }

    /**
     *This API is used to create a WebSocket Token.
     * @param req CreateWebSocketTokenRequest
     * @return CreateWebSocketTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebSocketTokenResponse CreateWebSocketToken(CreateWebSocketTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebSocketToken", CreateWebSocketTokenResponse.class);
    }

    /**
     *This API is used to create an asynchronous running instance of a workflow. After successful creation, the workflow runs asynchronously in the backend. The API returns the workflow running instance ID (WorkflowRunId) and other information. You can call the DescribeWorkflowRun API to query the workflow running details.
Note: Asynchronous execution of a workflow is application-based. The corresponding application configuration must be set to "Single Workflow Mode" before it can be successfully created.
     * @param req CreateWorkflowRunRequest
     * @return CreateWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowRunResponse CreateWorkflowRun(CreateWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowRun", CreateWorkflowRunResponse.class);
    }

    /**
     *Create a workspace credential
     * @param req CreateWorkspaceCredentialRequest
     * @return CreateWorkspaceCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceCredentialResponse CreateWorkspaceCredential(CreateWorkspaceCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceCredential", CreateWorkspaceCredentialResponse.class);
    }

    /**
     *This API is used to delete an Agent.
     * @param req DeleteAgentRequest
     * @return DeleteAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentResponse DeleteAgent(DeleteAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgent", DeleteAgentResponse.class);
    }

    /**
     *This API is used to delete applications
     * @param req DeleteAppRequest
     * @return DeleteAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppResponse DeleteApp(DeleteAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApp", DeleteAppResponse.class);
    }

    /**
     *DeleteAppTrigger
     * @param req DeleteAppTriggerRequest
     * @return DeleteAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppTriggerResponse DeleteAppTrigger(DeleteAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAppTrigger", DeleteAppTriggerResponse.class);
    }

    /**
     *Delete a category
     * @param req DeleteCategoryRequest
     * @return DeleteCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCategoryResponse DeleteCategory(DeleteCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCategory", DeleteCategoryResponse.class);
    }

    /**
     *Delete a channel (scenarios are distinguished by scene)
     * @param req DeleteChannelRequest
     * @return DeleteChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteChannelResponse DeleteChannel(DeleteChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteChannel", DeleteChannelResponse.class);
    }

    /**
     *Delete conversation
     * @param req DeleteConversationRequest
     * @return DeleteConversationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConversationResponse DeleteConversation(DeleteConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConversation", DeleteConversationResponse.class);
    }

    /**
     *Delete documents in batches
     * @param req DeleteDocListRequest
     * @return DeleteDocListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocListResponse DeleteDocList(DeleteDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDocList", DeleteDocListResponse.class);
    }

    /**
     *This API is used to delete the knowledge base.
     * @param req DeleteKBRequest
     * @return DeleteKBResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKBResponse DeleteKB(DeleteKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKB", DeleteKBResponse.class);
    }

    /**
     *Batch deletes tags
     * @param req DeleteLabelListRequest
     * @return DeleteLabelListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLabelListResponse DeleteLabelList(DeleteLabelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLabelList", DeleteLabelListResponse.class);
    }

    /**
     *Deletes a specified message record category
     * @param req DeleteMsgRecordCategoryRequest
     * @return DeleteMsgRecordCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMsgRecordCategoryResponse DeleteMsgRecordCategory(DeleteMsgRecordCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMsgRecordCategory", DeleteMsgRecordCategoryResponse.class);
    }

    /**
     *Modify a plug-in
     * @param req DeletePluginRequest
     * @return DeletePluginResponse
     * @throws TencentCloudSDKException
     */
    public DeletePluginResponse DeletePlugin(DeletePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePlugin", DeletePluginResponse.class);
    }

    /**
     *Delete QAs in batches
     * @param req DeleteQAListRequest
     * @return DeleteQAListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQAListResponse DeleteQAList(DeleteQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQAList", DeleteQAListResponse.class);
    }

    /**
     *Delete a Custom Skill Authorization: creator ∨ (edit permission ∧ delete permission) Denied scenarios: non-Custom type / shared / in security detection / pending listing approval / pending delisting approval
     * @param req DeleteSkillRequest
     * @return DeleteSkillResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSkillResponse DeleteSkill(DeleteSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSkill", DeleteSkillResponse.class);
    }

    /**
     *Submit a shared Skill delisting approval (v2, two-segment: submit → approve → callback to delist the shared Skill) Authorization: right to erasure Denied scenarios: not shared / pending listing approval / pending delisting approval
     * @param req DeleteSkillShareRequest
     * @return DeleteSkillShareResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSkillShareResponse DeleteSkillShare(DeleteSkillShareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSkillShare", DeleteSkillShareResponse.class);
    }

    /**
     *Delete a space
     * @param req DeleteSpaceRequest
     * @return DeleteSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSpaceResponse DeleteSpace(DeleteSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSpace", DeleteSpaceResponse.class);
    }

    /**
     *Delete a parameter variable
     * @param req DeleteVariableRequest
     * @return DeleteVariableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVariableResponse DeleteVariable(DeleteVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVariable", DeleteVariableResponse.class);
    }

    /**
     *View the employee list of a business
     * @param req DescribeAccountListRequest
     * @return DescribeAccountListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountListResponse DescribeAccountList(DescribeAccountListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountList", DescribeAccountListResponse.class);
    }

    /**
     *Query Agent details
     * @param req DescribeAgentDetailRequest
     * @return DescribeAgentDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDetailResponse DescribeAgentDetail(DescribeAgentDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDetail", DescribeAgentDetailResponse.class);
    }

    /**
     *Get the release preview list of agents under an application
     * @param req DescribeAgentReleasePreviewListRequest
     * @return DescribeAgentReleasePreviewListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentReleasePreviewListResponse DescribeAgentReleasePreviewList(DescribeAgentReleasePreviewListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentReleasePreviewList", DescribeAgentReleasePreviewListResponse.class);
    }

    /**
     *Queries the abstract information list of an Agent.
     * @param req DescribeAgentSummaryListRequest
     * @return DescribeAgentSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentSummaryListResponse DescribeAgentSummaryList(DescribeAgentSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentSummaryList", DescribeAgentSummaryListResponse.class);
    }

    /**
     *This API is used to obtain application information.
     * @param req DescribeAppRequest
     * @return DescribeAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppResponse DescribeApp(DescribeAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApp", DescribeAppResponse.class);
    }

    /**
     *This API is used to query the invocation statistics overview under an application view, including the total number of calls, call success rate, avg duration of total tokens, and avg duration of first tokens. For RAG applications, it also returns the count and proportion of calls for each response method for drawing a pie chart.
     * @param req DescribeAppStatisticsOverviewRequest
     * @return DescribeAppStatisticsOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppStatisticsOverviewResponse DescribeAppStatisticsOverview(DescribeAppStatisticsOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppStatisticsOverview", DescribeAppStatisticsOverviewResponse.class);
    }

    /**
     *Retrieve the abstract list of applications.
     * @param req DescribeAppSummaryListRequest
     * @return DescribeAppSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppSummaryListResponse DescribeAppSummaryList(DescribeAppSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppSummaryList", DescribeAppSummaryListResponse.class);
    }

    /**
     *DescribeAppTrigger
     * @param req DescribeAppTriggerRequest
     * @return DescribeAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerResponse DescribeAppTrigger(DescribeAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTrigger", DescribeAppTriggerResponse.class);
    }

    /**
     *DescribeAppTriggerInstance
     * @param req DescribeAppTriggerInstanceRequest
     * @return DescribeAppTriggerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerInstanceResponse DescribeAppTriggerInstance(DescribeAppTriggerInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTriggerInstance", DescribeAppTriggerInstanceResponse.class);
    }

    /**
     *DescribeAppTriggerRunLogList
     * @param req DescribeAppTriggerRunLogListRequest
     * @return DescribeAppTriggerRunLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerRunLogListResponse DescribeAppTriggerRunLogList(DescribeAppTriggerRunLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTriggerRunLogList", DescribeAppTriggerRunLogListResponse.class);
    }

    /**
     *DescribeAppTriggerSummaryList
     * @param req DescribeAppTriggerSummaryListRequest
     * @return DescribeAppTriggerSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerSummaryListResponse DescribeAppTriggerSummaryList(DescribeAppTriggerSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTriggerSummaryList", DescribeAppTriggerSummaryListResponse.class);
    }

    /**
     *View operation log list
     * @param req DescribeAuditLogListRequest
     * @return DescribeAuditLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogListResponse DescribeAuditLogList(DescribeAuditLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogList", DescribeAuditLogListResponse.class);
    }

    /**
     *This API is used to obtain meta-information of audit logs.
     * @param req DescribeAuditLogMetaRequest
     * @return DescribeAuditLogMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogMetaResponse DescribeAuditLogMeta(DescribeAuditLogMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogMeta", DescribeAuditLogMetaResponse.class);
    }

    /**
     *Query the classification list
     * @param req DescribeCategoryListRequest
     * @return DescribeCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCategoryListResponse DescribeCategoryList(DescribeCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCategoryList", DescribeCategoryListResponse.class);
    }

    /**
     *Query channel details (case-sensitive by scenario)
     * @param req DescribeChannelRequest
     * @return DescribeChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelResponse DescribeChannel(DescribeChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChannel", DescribeChannelResponse.class);
    }

    /**
     *This API is used to obtain the channel list by scenario.
     * @param req DescribeChannelListRequest
     * @return DescribeChannelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelListResponse DescribeChannelList(DescribeChannelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChannelList", DescribeChannelListResponse.class);
    }

    /**
     *Query concurrency overrun details, including QPM/TPM overruns and exclusive concurrency overruns. Return the overrun time, space, app, model, and request content.
     * @param req DescribeConcurrencyLimitDetailListRequest
     * @return DescribeConcurrencyLimitDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrencyLimitDetailListResponse DescribeConcurrencyLimitDetailList(DescribeConcurrencyLimitDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrencyLimitDetailList", DescribeConcurrencyLimitDetailListResponse.class);
    }

    /**
     *Queries the conflict query details
     * @param req DescribeConflictQARequest
     * @return DescribeConflictQAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConflictQAResponse DescribeConflictQA(DescribeConflictQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConflictQA", DescribeConflictQAResponse.class);
    }

    /**
     *Query the conflict list
     * @param req DescribeConflictQASummaryListRequest
     * @return DescribeConflictQASummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConflictQASummaryListResponse DescribeConflictQASummaryList(DescribeConflictQASummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConflictQASummaryList", DescribeConflictQASummaryListResponse.class);
    }

    /**
     *Query resource consumption details, including billing fields such as consumption type, consumption target, consumption scenario, package, and PU consumption.
     * @param req DescribeConsumptionDetailListRequest
     * @return DescribeConsumptionDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumptionDetailListResponse DescribeConsumptionDetailList(DescribeConsumptionDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumptionDetailList", DescribeConsumptionDetailListResponse.class);
    }

    /**
     *View session information.
     * @param req DescribeConversationRequest
     * @return DescribeConversationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationResponse DescribeConversation(DescribeConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversation", DescribeConversationResponse.class);
    }

    /**
     *Get session list.
     * @param req DescribeConversationListRequest
     * @return DescribeConversationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationListResponse DescribeConversationList(DescribeConversationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversationList", DescribeConversationListResponse.class);
    }

    /**
     *Get historical messages of a conversation.
     * @param req DescribeConversationMessageListRequest
     * @return DescribeConversationMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationMessageListResponse DescribeConversationMessageList(DescribeConversationMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversationMessageList", DescribeConversationMessageListResponse.class);
    }

    /**
     *Queries the details of a document.
     * @param req DescribeDocRequest
     * @return DescribeDocResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocResponse DescribeDoc(DescribeDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDoc", DescribeDocResponse.class);
    }

    /**
     *Query the abstract list of a document.
     * @param req DescribeDocSummaryListRequest
     * @return DescribeDocSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocSummaryListResponse DescribeDocSummaryList(DescribeDocSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocSummaryList", DescribeDocSummaryListResponse.class);
    }

    /**
     *Query knowledge base details
     * @param req DescribeKBRequest
     * @return DescribeKBResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBResponse DescribeKB(DescribeKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKB", DescribeKBResponse.class);
    }

    /**
     *Queries the knowledge base list
     * @param req DescribeKBSummaryListRequest
     * @return DescribeKBSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBSummaryListResponse DescribeKBSummaryList(DescribeKBSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKBSummaryList", DescribeKBSummaryListResponse.class);
    }

    /**
     *Queries tag details.
     * @param req DescribeLabelRequest
     * @return DescribeLabelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelResponse DescribeLabel(DescribeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLabel", DescribeLabelResponse.class);
    }

    /**
     *Querying the Tag List
     * @param req DescribeLabelSummaryListRequest
     * @return DescribeLabelSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelSummaryListResponse DescribeLabelSummaryList(DescribeLabelSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLabelSummaryList", DescribeLabelSummaryListResponse.class);
    }

    /**
     *Pull the latest release info (including release time, status, and channel).
     * @param req DescribeLatestReleaseRequest
     * @return DescribeLatestReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLatestReleaseResponse DescribeLatestRelease(DescribeLatestReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLatestRelease", DescribeLatestReleaseResponse.class);
    }

    /**
     *Query the overview KPI card data of dashboards, distinguish resource dashboards from business dashboards by resource_type, and return the KPI metric list of each domain.
     * @param req DescribeMetricOverviewListRequest
     * @return DescribeMetricOverviewListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricOverviewListResponse DescribeMetricOverviewList(DescribeMetricOverviewListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricOverviewList", DescribeMetricOverviewListResponse.class);
    }

    /**
     *Query the model list
     * @param req DescribeModelListRequest
     * @return DescribeModelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelListResponse DescribeModelList(DescribeModelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelList", DescribeModelListResponse.class);
    }

    /**
     *Query the message record category tree of an app, return categories and subcategories, number of records under each category, and operation permissions.
     * @param req DescribeMsgRecordCategoryListRequest
     * @return DescribeMsgRecordCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgRecordCategoryListResponse DescribeMsgRecordCategoryList(DescribeMsgRecordCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsgRecordCategoryList", DescribeMsgRecordCategoryListResponse.class);
    }

    /**
     *This API is used to query the dialogue message record list of an application. It supports filtering by channel type, feedback type, intent, call result, and other conditions, and supports cursor pagination and sorting by creation time.
     * @param req DescribeMsgRecordListRequest
     * @return DescribeMsgRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgRecordListResponse DescribeMsgRecordList(DescribeMsgRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsgRecordList", DescribeMsgRecordListResponse.class);
    }

    /**
     *DescribeNodeBatchRun
     * @param req DescribeNodeBatchRunRequest
     * @return DescribeNodeBatchRunResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeBatchRunResponse DescribeNodeBatchRun(DescribeNodeBatchRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeBatchRun", DescribeNodeBatchRunResponse.class);
    }

    /**
     *View workflow node running details.
     * @param req DescribeNodeRunDetailRequest
     * @return DescribeNodeRunDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeRunDetailResponse DescribeNodeRunDetail(DescribeNodeRunDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeRunDetail", DescribeNodeRunDetailResponse.class);
    }

    /**
     *This API is used to query plugin details.
     * @param req DescribePluginRequest
     * @return DescribePluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginResponse DescribePlugin(DescribePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlugin", DescribePluginResponse.class);
    }

    /**
     *Querying the List of Plugins
     * @param req DescribePluginSummaryListRequest
     * @return DescribePluginSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginSummaryListResponse DescribePluginSummaryList(DescribePluginSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePluginSummaryList", DescribePluginSummaryListResponse.class);
    }

    /**
     *Query QA details
     * @param req DescribeQARequest
     * @return DescribeQAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQAResponse DescribeQA(DescribeQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQA", DescribeQAResponse.class);
    }

    /**
     *Queries the QA list
     * @param req DescribeQASummaryListRequest
     * @return DescribeQASummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQASummaryListResponse DescribeQASummaryList(DescribeQASummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQASummaryList", DescribeQASummaryListResponse.class);
    }

    /**
     *Release record list
     * @param req DescribeReleaseListRequest
     * @return DescribeReleaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseListResponse DescribeReleaseList(DescribeReleaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseList", DescribeReleaseListResponse.class);
    }

    /**
     *Queries a publication task
     * @param req DescribeReleaseSummaryRequest
     * @return DescribeReleaseSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseSummaryResponse DescribeReleaseSummary(DescribeReleaseSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseSummary", DescribeReleaseSummaryResponse.class);
    }

    /**
     *This API is used to obtain user resource package and value-added package usage information.
     * @param req DescribeResourceSummaryRequest
     * @return DescribeResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceSummaryResponse DescribeResourceSummary(DescribeResourceSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceSummary", DescribeResourceSummaryResponse.class);
    }

    /**
     *Query the Skill classification list
     * @param req DescribeSkillCategoryListRequest
     * @return DescribeSkillCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillCategoryListResponse DescribeSkillCategoryList(DescribeSkillCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillCategoryList", DescribeSkillCategoryListResponse.class);
    }

    /**
     *Query skill details
     * @param req DescribeSkillDetailRequest
     * @return DescribeSkillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillDetailResponse DescribeSkillDetail(DescribeSkillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillDetail", DescribeSkillDetailResponse.class);
    }

    /**
     *This API is used to query the list of details where a certain Skill is referenced, grouped by SkillRefType: OpenClaw, cloud agent, or business assistant agent. Authentication: same as DescribeSkillDetail.
     * @param req DescribeSkillReferenceListRequest
     * @return DescribeSkillReferenceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillReferenceListResponse DescribeSkillReferenceList(DescribeSkillReferenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillReferenceList", DescribeSkillReferenceListResponse.class);
    }

    /**
     *Query the Skill list
     * @param req DescribeSkillSummaryListRequest
     * @return DescribeSkillSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillSummaryListResponse DescribeSkillSummaryList(DescribeSkillSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillSummaryList", DescribeSkillSummaryListResponse.class);
    }

    /**
     *This API is used to obtain the space list.
     * @param req DescribeSpaceListRequest
     * @return DescribeSpaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceListResponse DescribeSpaceList(DescribeSpaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceList", DescribeSpaceListResponse.class);
    }

    /**
     *Obtain system variables
     * @param req DescribeSystemVariableListRequest
     * @return DescribeSystemVariableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemVariableListResponse DescribeSystemVariableList(DescribeSystemVariableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemVariableList", DescribeSystemVariableListResponse.class);
    }

    /**
     *This API is used to query time series details of resource invocations, including two types of resources: models and plug-ins. It returns detailed information of each call record in chronological order.
     * @param req DescribeUsageDetailListRequest
     * @return DescribeUsageDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageDetailListResponse DescribeUsageDetailList(DescribeUsageDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageDetailList", DescribeUsageDetailListResponse.class);
    }

    /**
     *This API is used to query aggregated details of resource usage, including three types of resources: models, plug-ins, and platforms. It displays indicators such as call count and Token consumption, aggregated by space or application dimension.
     * @param req DescribeUsageSummaryListRequest
     * @return DescribeUsageSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageSummaryListResponse DescribeUsageSummaryList(DescribeUsageSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageSummaryList", DescribeUsageSummaryListResponse.class);
    }

    /**
     *Get parameter variables
     * @param req DescribeVariableRequest
     * @return DescribeVariableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVariableResponse DescribeVariable(DescribeVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVariable", DescribeVariableResponse.class);
    }

    /**
     *Gets the parameter variable list
     * @param req DescribeVariableListRequest
     * @return DescribeVariableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVariableListResponse DescribeVariableList(DescribeVariableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVariableList", DescribeVariableListResponse.class);
    }

    /**
     *Queries workflow running details.
     * @param req DescribeWorkflowRunRequest
     * @return DescribeWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowRunResponse DescribeWorkflowRun(DescribeWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowRun", DescribeWorkflowRunResponse.class);
    }

    /**
     *Query the list of workflow running instances
     * @param req DescribeWorkflowRunSummaryListRequest
     * @return DescribeWorkflowRunSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowRunSummaryListResponse DescribeWorkflowRunSummaryList(DescribeWorkflowRunSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowRunSummaryList", DescribeWorkflowRunSummaryListResponse.class);
    }

    /**
     *Asynchronously export QAs.
     * @param req ExportQARequest
     * @return ExportQAResponse
     * @throws TencentCloudSDKException
     */
    public ExportQAResponse ExportQA(ExportQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportQA", ExportQAResponse.class);
    }

    /**
     *Favorite a plug-in
     * @param req FavoritePluginRequest
     * @return FavoritePluginResponse
     * @throws TencentCloudSDKException
     */
    public FavoritePluginResponse FavoritePlugin(FavoritePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FavoritePlugin", FavoritePluginResponse.class);
    }

    /**
     *Favorites a skill
     * @param req FavoriteSkillRequest
     * @return FavoriteSkillResponse
     * @throws TencentCloudSDKException
     */
    public FavoriteSkillResponse FavoriteSkill(FavoriteSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FavoriteSkill", FavoriteSkillResponse.class);
    }

    /**
     *Batch imports documents
     * @param req ImportDocListRequest
     * @return ImportDocListResponse
     * @throws TencentCloudSDKException
     */
    public ImportDocListResponse ImportDocList(ImportDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportDocList", ImportDocListResponse.class);
    }

    /**
     *Modify Agent configuration information
     * @param req ModifyAgentRequest
     * @return ModifyAgentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentResponse ModifyAgent(ModifyAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgent", ModifyAgentResponse.class);
    }

    /**
     *Modifies applications
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApp", ModifyAppResponse.class);
    }

    /**
     *ModifyAppTrigger
     * @param req ModifyAppTriggerRequest
     * @return ModifyAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppTriggerResponse ModifyAppTrigger(ModifyAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAppTrigger", ModifyAppTriggerResponse.class);
    }

    /**
     *Modify category
     * @param req ModifyCategoryRequest
     * @return ModifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCategoryResponse ModifyCategory(ModifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCategory", ModifyCategoryResponse.class);
    }

    /**
     *This API is used to modify a channel, including remarks and the callback robot ID of a WeCom chatbot channel.
     * @param req ModifyChannelRequest
     * @return ModifyChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyChannelResponse ModifyChannel(ModifyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyChannel", ModifyChannelResponse.class);
    }

    /**
     *Modify a conflict
     * @param req ModifyConflictQARequest
     * @return ModifyConflictQAResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConflictQAResponse ModifyConflictQA(ModifyConflictQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConflictQA", ModifyConflictQAResponse.class);
    }

    /**
     *Modify session information.
     * @param req ModifyConversationRequest
     * @return ModifyConversationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConversationResponse ModifyConversation(ModifyConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConversation", ModifyConversationResponse.class);
    }

    /**
     *Modify a single document
     * @param req ModifyDocRequest
     * @return ModifyDocResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocResponse ModifyDoc(ModifyDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDoc", ModifyDocResponse.class);
    }

    /**
     *Batch modify documents.
     * @param req ModifyDocListRequest
     * @return ModifyDocListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocListResponse ModifyDocList(ModifyDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDocList", ModifyDocListResponse.class);
    }

    /**
     *This API is used to modify the knowledge base.
     * @param req ModifyKBRequest
     * @return ModifyKBResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKBResponse ModifyKB(ModifyKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKB", ModifyKBResponse.class);
    }

    /**
     *Modify a tag
     * @param req ModifyLabelRequest
     * @return ModifyLabelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLabelResponse ModifyLabel(ModifyLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLabel", ModifyLabelResponse.class);
    }

    /**
     *Modify the name of a specified message record category
     * @param req ModifyMsgRecordCategoryRequest
     * @return ModifyMsgRecordCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMsgRecordCategoryResponse ModifyMsgRecordCategory(ModifyMsgRecordCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMsgRecordCategory", ModifyMsgRecordCategoryResponse.class);
    }

    /**
     *Modify a plug-in
     * @param req ModifyPluginRequest
     * @return ModifyPluginResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPluginResponse ModifyPlugin(ModifyPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlugin", ModifyPluginResponse.class);
    }

    /**
     *Modify single QA
     * @param req ModifyQARequest
     * @return ModifyQAResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAResponse ModifyQA(ModifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQA", ModifyQAResponse.class);
    }

    /**
     *Batch modify QAs
     * @param req ModifyQAListRequest
     * @return ModifyQAListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAListResponse ModifyQAList(ModifyQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQAList", ModifyQAListResponse.class);
    }

    /**
     *Modify a Skill
     * @param req ModifySkillRequest
     * @return ModifySkillResponse
     * @throws TencentCloudSDKException
     */
    public ModifySkillResponse ModifySkill(ModifySkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySkill", ModifySkillResponse.class);
    }

    /**
     *Edit a space
     * @param req ModifySpaceRequest
     * @return ModifySpaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpaceResponse ModifySpace(ModifySpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpace", ModifySpaceResponse.class);
    }

    /**
     *Update parameter variables
     * @param req ModifyVariableRequest
     * @return ModifyVariableResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVariableResponse ModifyVariable(ModifyVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVariable", ModifyVariableResponse.class);
    }

    /**
     *PauseAppTrigger
     * @param req PauseAppTriggerRequest
     * @return PauseAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public PauseAppTriggerResponse PauseAppTrigger(PauseAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseAppTrigger", PauseAppTriggerResponse.class);
    }

    /**
     *This API is used to read MCP UI resources in HTML for frontend iframe to load the MCP App interface.
     * @param req ReadMCPResourceRequest
     * @return ReadMCPResourceResponse
     * @throws TencentCloudSDKException
     */
    public ReadMCPResourceResponse ReadMCPResource(ReadMCPResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReadMCPResource", ReadMCPResourceResponse.class);
    }

    /**
     *This API is used to list a skill.
     * @param req ReleaseSkillRequest
     * @return ReleaseSkillResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseSkillResponse ReleaseSkill(ReleaseSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseSkill", ReleaseSkillResponse.class);
    }

    /**
     *Reset a session
Note: Resetting is not supported for the current Claw mode application session.
     * @param req ResetConversationRequest
     * @return ResetConversationResponse
     * @throws TencentCloudSDKException
     */
    public ResetConversationResponse ResetConversation(ResetConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConversation", ResetConversationResponse.class);
    }

    /**
     *ResumeAppTrigger
     * @param req ResumeAppTriggerRequest
     * @return ResumeAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ResumeAppTriggerResponse ResumeAppTrigger(ResumeAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeAppTrigger", ResumeAppTriggerResponse.class);
    }

    /**
     *Resume a workflow asynchronous execution instance that is waiting for input.
     * @param req ResumeWorkflowRunRequest
     * @return ResumeWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public ResumeWorkflowRunResponse ResumeWorkflowRun(ResumeWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeWorkflowRun", ResumeWorkflowRunResponse.class);
    }

    /**
     *Retry publishing (republish after suspension)
     * @param req RetryReleaseRequest
     * @return RetryReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RetryReleaseResponse RetryRelease(RetryReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRelease", RetryReleaseResponse.class);
    }

    /**
     *Roll back a release
     * @param req RollbackReleaseRequest
     * @return RollbackReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RollbackReleaseResponse RollbackRelease(RollbackReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackRelease", RollbackReleaseResponse.class);
    }

    /**
     *RunAppTriggerNow
     * @param req RunAppTriggerNowRequest
     * @return RunAppTriggerNowResponse
     * @throws TencentCloudSDKException
     */
    public RunAppTriggerNowResponse RunAppTriggerNow(RunAppTriggerNowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunAppTriggerNow", RunAppTriggerNowResponse.class);
    }

    /**
     *SaveWorkflowDebugContext
     * @param req SaveWorkflowDebugContextRequest
     * @return SaveWorkflowDebugContextResponse
     * @throws TencentCloudSDKException
     */
    public SaveWorkflowDebugContextResponse SaveWorkflowDebugContext(SaveWorkflowDebugContextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveWorkflowDebugContext", SaveWorkflowDebugContextResponse.class);
    }

    /**
     *SaveWorkflowToolNodeOutput
     * @param req SaveWorkflowToolNodeOutputRequest
     * @return SaveWorkflowToolNodeOutputResponse
     * @throws TencentCloudSDKException
     */
    public SaveWorkflowToolNodeOutputResponse SaveWorkflowToolNodeOutput(SaveWorkflowToolNodeOutputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveWorkflowToolNodeOutput", SaveWorkflowToolNodeOutputResponse.class);
    }

    /**
     *Knowledge retrieval
     * @param req SearchKnowledgeRequest
     * @return SearchKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public SearchKnowledgeResponse SearchKnowledge(SearchKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchKnowledge", SearchKnowledgeResponse.class);
    }

    /**
     *Batch stop running workflow instances.
     * @param req StopWorkflowRunListRequest
     * @return StopWorkflowRunListResponse
     * @throws TencentCloudSDKException
     */
    public StopWorkflowRunListResponse StopWorkflowRunList(StopWorkflowRunListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopWorkflowRunList", StopWorkflowRunListResponse.class);
    }

    /**
     *Unfavorite a plug-in
     * @param req UnfavoritePluginRequest
     * @return UnfavoritePluginResponse
     * @throws TencentCloudSDKException
     */
    public UnfavoritePluginResponse UnfavoritePlugin(UnfavoritePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnfavoritePlugin", UnfavoritePluginResponse.class);
    }

    /**
     *Unfavorites a skill
     * @param req UnfavoriteSkillRequest
     * @return UnfavoriteSkillResponse
     * @throws TencentCloudSDKException
     */
    public UnfavoriteSkillResponse UnfavoriteSkill(UnfavoriteSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnfavoriteSkill", UnfavoriteSkillResponse.class);
    }

}
