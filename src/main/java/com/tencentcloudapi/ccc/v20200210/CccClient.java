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
package com.tencentcloudapi.ccc.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ccc.v20200210.models.*;

public class CccClient extends AbstractClient{
    private static String endpoint = "ccc.intl.tencentcloudapi.com";
    private static String service = "ccc";
    private static String version = "2020-02-10";

    public CccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CccClient(Credential credential, String region, ClientProfile profile) {
        super(CccClient.endpoint, CccClient.version, credential, region, profile);
    }

    /**
     *Stop Agent Cruise-style Outbound Call Task
     * @param req AbortAgentCruiseDialingCampaignRequest
     * @return AbortAgentCruiseDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public AbortAgentCruiseDialingCampaignResponse AbortAgentCruiseDialingCampaign(AbortAgentCruiseDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortAgentCruiseDialingCampaign", AbortAgentCruiseDialingCampaignResponse.class);
    }

    /**
     *This API is used to pause the predictive outbound call task.
     * @param req AbortPredictiveDialingCampaignRequest
     * @return AbortPredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public AbortPredictiveDialingCampaignResponse AbortPredictiveDialingCampaign(AbortPredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortPredictiveDialingCampaign", AbortPredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to bind a number to a callback API for incoming calls.
     * @param req BindNumberCallInInterfaceRequest
     * @return BindNumberCallInInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public BindNumberCallInInterfaceResponse BindNumberCallInInterface(BindNumberCallInInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNumberCallInInterface", BindNumberCallInInterfaceResponse.class);
    }

    /**
     *This API is used to bind outbound skill group of number.
     * @param req BindNumberCallOutSkillGroupRequest
     * @return BindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindNumberCallOutSkillGroupResponse BindNumberCallOutSkillGroup(BindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNumberCallOutSkillGroup", BindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *This API is used to bind the agent's skill group.
     * @param req BindStaffSkillGroupListRequest
     * @return BindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public BindStaffSkillGroupListResponse BindStaffSkillGroupList(BindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindStaffSkillGroupList", BindStaffSkillGroupListResponse.class);
    }

    /**
     *This API is used to provide server-side robot control feature.
     * @param req ControlAIConversationRequest
     * @return ControlAIConversationResponse
     * @throws TencentCloudSDKException
     */
    public ControlAIConversationResponse ControlAIConversation(ControlAIConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlAIConversation", ControlAIConversationResponse.class);
    }

    /**
     *Used to create one-time Intelligent Agent outbound calls. You can create a voice Intelligent Agent in the management console - Intelligent Agent Management and perform dialogue process configuration (https://www.tencentcloud.comom/document/product/679/119796?from_cn_redirect=1). This API is used to initiate a single outbound call task with a configured Intelligent Agent. To create batch Intelligent Agent outbound call tasks, refer to the documentation for creating automatic outbound call tasks (https://www.tencentcloud.comom/document/product/679/69194?from_cn_redirect=1).

The feature requires purchase of the Intelligent Agent call package and is only available for own telephone number. For details, refer to the [Intelligent Agent Call Purchase Guide](https://www.tencentcloud.comom/document/product/679/125953?from_cn_redirect=1).
     * @param req CreateAIAgentCallRequest
     * @return CreateAIAgentCallResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAgentCallResponse CreateAIAgentCall(CreateAIAgentCallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIAgentCall", CreateAIAgentCallResponse.class);
    }

    /**
     *This API is used to **call the AI model directly** to trigger a **single** outbound call. It supports configuring the model, prompt content, voice, and all call elements through API parameters.

The feature requires purchase of the Intelligent Agent call package and is only available for own telephone numbers. For details, refer to the Intelligent Agent Call Purchase Guide (https://www.tencentcloud.comom/document/product/679/125953?from_cn_redirect=1).
     * @param req CreateAICallRequest
     * @return CreateAICallResponse
     * @throws TencentCloudSDKException
     */
    public CreateAICallResponse CreateAICall(CreateAICallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAICall", CreateAICallResponse.class);
    }

    /**
     *This API is used to create a management access link.
     * @param req CreateAdminURLRequest
     * @return CreateAdminURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdminURLResponse CreateAdminURL(CreateAdminURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAdminURL", CreateAdminURLResponse.class);
    }

    /**
     *Agent Cruise-style Outbound Call.
     * @param req CreateAgentCruiseDialingCampaignRequest
     * @return CreateAgentCruiseDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentCruiseDialingCampaignResponse CreateAgentCruiseDialingCampaign(CreateAgentCruiseDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentCruiseDialingCampaign", CreateAgentCruiseDialingCampaignResponse.class);
    }

    /**
     *This API is used to create bulk automatic outbound calls. The system will automatically initiate outbound calls to the designated called number list based on task configuration. This API can call the configured Intelligent Agent to perform batch outbound call tasks. You can create a voice Intelligent Agent in the management console-Intelligent Agent Management and configure the dialogue process (https://www.tencentcloud.comom/document/product/679/119796?from_cn_redirect=1). To create a single Intelligent Agent outbound call task, refer to the documentation (https://www.tencentcloud.comom/document/product/679/115681?from_cn_redirect=1).

The feature requires purchase of the Intelligent Agent call package and is only available for own telephone number. For details, refer to the [Intelligent Agent Call Purchase Guide](https://www.tencentcloud.comom/document/product/679/125953?from_cn_redirect=1).
     * @param req CreateAutoCalloutTaskRequest
     * @return CreateAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoCalloutTaskResponse CreateAutoCalloutTask(CreateAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoCalloutTask", CreateAutoCalloutTaskResponse.class);
    }

    /**
     *This API is used to create a new skill group.
     * @param req CreateCCCSkillGroupRequest
     * @return CreateCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCCSkillGroupResponse CreateCCCSkillGroup(CreateCCCSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCCCSkillGroup", CreateCCCSkillGroupResponse.class);
    }

    /**
     *This API is used to create an outbound call session. Currently, only dual calls are supported. That is, first use the platform number to call the agent mobile phone. After the agent answers, then make an outbound call to the user. Moreover, due to ISP frequency restrictions, the agent phone number must be added to the allowlist first to avoid frequency control leading to the failure of the outbound call. Therefore, before calling this API, the following operations have been completed.
1. The agent specified by UserId has already bound the mobile number. https://intl.cloud.tencent.com/document/product/679/76067?from_cn_redirect=1#.E6.AD.A5.E9.AA.A42.EF.BC.9A.E5.AE.8C.E5.96.84.E8.B4.A6.E5.8F.B7.E4.BF.A1.E6.81.AF.
2. The agent's bound mobile number has applied for and passed the outbound call allowlist.
This API is used to make calls. Currently, the agent side can only call the user's mobile phone, so the IsForceMobile field must be true.
4. Do not fill in the mobile number bound to the current UserId for the callee, otherwise it can lead to call failure due to a busy line.
     * @param req CreateCallOutSessionRequest
     * @return CreateCallOutSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCallOutSessionResponse CreateCallOutSession(CreateCallOutSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCallOutSession", CreateCallOutSessionResponse.class);
    }

    /**
     *This API is used to create the telephone account.
     * @param req CreateExtensionRequest
     * @return CreateExtensionResponse
     * @throws TencentCloudSDKException
     */
    public CreateExtensionResponse CreateExtension(CreateExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExtension", CreateExtensionResponse.class);
    }

    /**
     *Create a session associated with IVR. This feature is supported only in the Advanced Version. Currently, it supports inbound and automatic outbound IVR types. Upon receiving the request, TCCC will first attempt to call the callee, then enter the IVR flow.
     * @param req CreateIVRSessionRequest
     * @return CreateIVRSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateIVRSessionResponse CreateIVRSession(CreateIVRSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIVRSession", CreateIVRSessionResponse.class);
    }

    /**
     *Create customer's own number access review
     * @param req CreateOwnNumberApplyRequest
     * @return CreateOwnNumberApplyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOwnNumberApplyResponse CreateOwnNumberApply(CreateOwnNumberApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOwnNumberApply", CreateOwnNumberApplyResponse.class);
    }

    /**
     *This API is used to create the predictive outbound call task.
     * @param req CreatePredictiveDialingCampaignRequest
     * @return CreatePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public CreatePredictiveDialingCampaignResponse CreatePredictiveDialingCampaign(CreatePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePredictiveDialingCampaign", CreatePredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to create the SDK log-in token.
     * @param req CreateSDKLoginTokenRequest
     * @return CreateSDKLoginTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateSDKLoginTokenResponse CreateSDKLoginToken(CreateSDKLoginTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSDKLoginToken", CreateSDKLoginTokenResponse.class);
    }

    /**
     *This API is used to create the customer service account.
     * @param req CreateStaffRequest
     * @return CreateStaffResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaffResponse CreateStaff(CreateStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStaff", CreateStaffResponse.class);
    }

    /**
     *This API is used to create a user data signature.
     * @param req CreateUserSigRequest
     * @return CreateUserSigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSigResponse CreateUserSig(CreateUserSigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserSig", CreateUserSigResponse.class);
    }

    /**
     *This API is used to delete a skill group.
     * @param req DeleteCCCSkillGroupRequest
     * @return DeleteCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCCSkillGroupResponse DeleteCCCSkillGroup(DeleteCCCSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCCSkillGroup", DeleteCCCSkillGroupResponse.class);
    }

    /**
     *This API is used to delete telephone accounts.
     * @param req DeleteExtensionRequest
     * @return DeleteExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExtensionResponse DeleteExtension(DeleteExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExtension", DeleteExtensionResponse.class);
    }

    /**
     *This API is used to delete the predictive outbound call task.
     * @param req DeletePredictiveDialingCampaignRequest
     * @return DeletePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public DeletePredictiveDialingCampaignResponse DeletePredictiveDialingCampaign(DeletePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePredictiveDialingCampaign", DeletePredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to delete the agent information.
     * @param req DeleteStaffRequest
     * @return DeleteStaffResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStaffResponse DeleteStaff(DeleteStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStaff", DeleteStaffResponse.class);
    }

    /**
     *This API is used to query the information list of configured Intelligent Agents under a specified instance (SdkAppId) by paging, including basic information such as Intelligent Agent ID and name.
     * @param req DescribeAIAgentInfoListRequest
     * @return DescribeAIAgentInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAgentInfoListResponse DescribeAIAgentInfoList(DescribeAIAgentInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAgentInfoList", DescribeAIAgentInfoListResponse.class);
    }

    /**
     *This API is used to obtain AI Conversation Analytics results.
     * @param req DescribeAIAnalysisResultRequest
     * @return DescribeAIAnalysisResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisResultResponse DescribeAIAnalysisResult(DescribeAIAnalysisResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisResult", DescribeAIAnalysisResultResponse.class);
    }

    /**
     *This API is used to query specified session's post-call Tag results by Session ID after the Intelligent Agent call session ends. Related post-call Tags need to be configured in advance in the management console. For details, please refer to post-call Tags (https://www.tencentcloud.comom/document/product/679/119800?from_cn_redirect=1).
     * @param req DescribeAICallExtractResultRequest
     * @return DescribeAICallExtractResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAICallExtractResultResponse DescribeAICallExtractResult(DescribeAICallExtractResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAICallExtractResult", DescribeAICallExtractResultResponse.class);
    }

    /**
     *Call this API to query the processing latency detail and stats of specified Session by Session ID within a specific time period. The latency info includes:.
-End-to-end (ETE) delay: Statistics of the overall duration from user voice input to AI returning a complete response.
-ASR latency: statistics of the processing time consumption required for voice input to be recognized as text.
-LLM latency: Statistics of inference latency for AI model to generate text content.
-Text To Speech (TTS) latency: Statistics of text conversion to speech audio synthesis duration.
     * @param req DescribeAILatencyRequest
     * @return DescribeAILatencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAILatencyResponse DescribeAILatency(DescribeAILatencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAILatency", DescribeAILatencyResponse.class);
    }

    /**
     *Query Agent Cruise-style Outbound Call Task
     * @param req DescribeAgentCruiseDialingCampaignRequest
     * @return DescribeAgentCruiseDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentCruiseDialingCampaignResponse DescribeAgentCruiseDialingCampaign(DescribeAgentCruiseDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentCruiseDialingCampaign", DescribeAgentCruiseDialingCampaignResponse.class);
    }

    /**
     *This API is used to query detailed information of an automatic outbound call task by TaskId, including basic configuration, start and end time, name list, execution status, and call status.
This API is usually used together with Create Bulk Automatic Outbound Call Task (https://www.tencentcloud.comom/document/product/679/69194?from_cn_redirect=1) to check whether the task configuration takes effect, the current task status, and real-time progress during execution once created.
     * @param req DescribeAutoCalloutTaskRequest
     * @return DescribeAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTaskResponse DescribeAutoCalloutTask(DescribeAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoCalloutTask", DescribeAutoCalloutTaskResponse.class);
    }

    /**
     *Batch Query Automatic Outbound Call Tasks
     * @param req DescribeAutoCalloutTasksRequest
     * @return DescribeAutoCalloutTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTasksResponse DescribeAutoCalloutTasks(DescribeAutoCalloutTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoCalloutTasks", DescribeAutoCalloutTasksResponse.class);
    }

    /**
     *This API is used to access the user purchasing information list.
     * @param req DescribeCCCBuyInfoListRequest
     * @return DescribeCCCBuyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCCBuyInfoListResponse DescribeCCCBuyInfoList(DescribeCCCBuyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCCBuyInfoList", DescribeCCCBuyInfoListResponse.class);
    }

    /**
     *This API is used to access the inbound real-time data statistical metrics.
     * @param req DescribeCallInMetricsRequest
     * @return DescribeCallInMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallInMetricsResponse DescribeCallInMetrics(DescribeCallInMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallInMetrics", DescribeCallInMetricsResponse.class);
    }

    /**
     *This API is used to access the telephone information.
     * @param req DescribeExtensionRequest
     * @return DescribeExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionResponse DescribeExtension(DescribeExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtension", DescribeExtensionResponse.class);
    }

    /**
     *This API is used to query the telephone list information.
     * @param req DescribeExtensionsRequest
     * @return DescribeExtensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionsResponse DescribeExtensions(DescribeExtensionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtensions", DescribeExtensionsResponse.class);
    }

    /**
     *Query IVR Audio File List Information
     * @param req DescribeIvrAudioListRequest
     * @return DescribeIvrAudioListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIvrAudioListResponse DescribeIvrAudioList(DescribeIvrAudioListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIvrAudioList", DescribeIvrAudioListResponse.class);
    }

    /**
     *This API is used to query the number list.
     * @param req DescribeNumbersRequest
     * @return DescribeNumbersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNumbersResponse DescribeNumbers(DescribeNumbersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNumbers", DescribeNumbersResponse.class);
    }

    /**
     *This API is used to access the current calling session list.
     * @param req DescribePSTNActiveSessionListRequest
     * @return DescribePSTNActiveSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePSTNActiveSessionListResponse DescribePSTNActiveSessionList(DescribePSTNActiveSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePSTNActiveSessionList", DescribePSTNActiveSessionListResponse.class);
    }

    /**
     *This API is used to query the predictive outbound call task.
     * @param req DescribePredictiveDialingCampaignRequest
     * @return DescribePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public DescribePredictiveDialingCampaignResponse DescribePredictiveDialingCampaign(DescribePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePredictiveDialingCampaign", DescribePredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to query the predictive outbound call task list.
     * @param req DescribePredictiveDialingCampaignsRequest
     * @return DescribePredictiveDialingCampaignsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePredictiveDialingCampaignsResponse DescribePredictiveDialingCampaigns(DescribePredictiveDialingCampaignsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePredictiveDialingCampaigns", DescribePredictiveDialingCampaignsResponse.class);
    }

    /**
     *This API is used to query the predictive outbound call list.
     * @param req DescribePredictiveDialingSessionsRequest
     * @return DescribePredictiveDialingSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePredictiveDialingSessionsResponse DescribePredictiveDialingSessions(DescribePredictiveDialingSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePredictiveDialingSessions", DescribePredictiveDialingSessionsResponse.class);
    }

    /**
     *This API is used to access protected phone service records and recordings for both inbound and outbound calls.
     * @param req DescribeProtectedTelCdrRequest
     * @return DescribeProtectedTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectedTelCdrResponse DescribeProtectedTelCdr(DescribeProtectedTelCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectedTelCdr", DescribeProtectedTelCdrResponse.class);
    }

    /**
     *This API is used to query call details for a single call by session id and timestamp after call ends, including caller and contact information, voice recording.
     * @param req DescribeSessionDetailRequest
     * @return DescribeSessionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionDetailResponse DescribeSessionDetail(DescribeSessionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionDetail", DescribeSessionDetailResponse.class);
    }

    /**
     *This API is used to access the skill group information list.
     * @param req DescribeSkillGroupInfoListRequest
     * @return DescribeSkillGroupInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillGroupInfoListResponse DescribeSkillGroupInfoList(DescribeSkillGroupInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillGroupInfoList", DescribeSkillGroupInfoListResponse.class);
    }

    /**
     *This API is used to access the agent information list.
     * @param req DescribeStaffInfoListRequest
     * @return DescribeStaffInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffInfoListResponse DescribeStaffInfoList(DescribeStaffInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffInfoList", DescribeStaffInfoListResponse.class);
    }

    /**
     *This API is used to query agent status history.
     * @param req DescribeStaffStatusHistoryRequest
     * @return DescribeStaffStatusHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffStatusHistoryResponse DescribeStaffStatusHistory(DescribeStaffStatusHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffStatusHistory", DescribeStaffStatusHistoryResponse.class);
    }

    /**
     *This API is used to access the real-time status statistics metrics of the agent.
     * @param req DescribeStaffStatusMetricsRequest
     * @return DescribeStaffStatusMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffStatusMetricsResponse DescribeStaffStatusMetrics(DescribeStaffStatusMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffStatusMetrics", DescribeStaffStatusMetricsResponse.class);
    }

    /**
     *This API is used to access telephone consumption statistics by instance.
     * @param req DescribeTelCallInfoRequest
     * @return DescribeTelCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCallInfoResponse DescribeTelCallInfo(DescribeTelCallInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelCallInfo", DescribeTelCallInfoResponse.class);
    }

    /**
     *This API is used to access phone service records and recordings.
     * @param req DescribeTelCdrRequest
     * @return DescribeTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCdrResponse DescribeTelCdr(DescribeTelCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelCdr", DescribeTelCdrResponse.class);
    }

    /**
     *Pull conversation recording for text information
     * @param req DescribeTelRecordAsrRequest
     * @return DescribeTelRecordAsrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelRecordAsrResponse DescribeTelRecordAsr(DescribeTelRecordAsrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelRecordAsr", DescribeTelRecordAsrResponse.class);
    }

    /**
     *This API is used to access the PSTN session information.
     * @param req DescribeTelSessionRequest
     * @return DescribeTelSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelSessionResponse DescribeTelSession(DescribeTelSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelSession", DescribeTelSessionResponse.class);
    }

    /**
     *This API is used to disable numbers.
     * @param req DisableCCCPhoneNumberRequest
     * @return DisableCCCPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public DisableCCCPhoneNumberResponse DisableCCCPhoneNumber(DisableCCCPhoneNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableCCCPhoneNumber", DisableCCCPhoneNumberResponse.class);
    }

    /**
     *This API is used to force customer service to go offline.
     * @param req ForceMemberOfflineRequest
     * @return ForceMemberOfflineResponse
     * @throws TencentCloudSDKException
     */
    public ForceMemberOfflineResponse ForceMemberOffline(ForceMemberOfflineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForceMemberOffline", ForceMemberOfflineResponse.class);
    }

    /**
     *This API is used to hang up the phone.
     * @param req HangUpCallRequest
     * @return HangUpCallResponse
     * @throws TencentCloudSDKException
     */
    public HangUpCallResponse HangUpCall(HangUpCallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HangUpCall", HangUpCallResponse.class);
    }

    /**
     *This API is used to modify telephone accounts (binding skill group, binding agent account).
     * @param req ModifyExtensionRequest
     * @return ModifyExtensionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExtensionResponse ModifyExtension(ModifyExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExtension", ModifyExtensionResponse.class);
    }

    /**
     *Modify customer's own number approval form
     * @param req ModifyOwnNumberApplyRequest
     * @return ModifyOwnNumberApplyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwnNumberApplyResponse ModifyOwnNumberApply(ModifyOwnNumberApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwnNumberApply", ModifyOwnNumberApplyResponse.class);
    }

    /**
     *This API is used to modify the customer service account.
     * @param req ModifyStaffRequest
     * @return ModifyStaffResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStaffResponse ModifyStaff(ModifyStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStaff", ModifyStaffResponse.class);
    }

    /**
     *Modify Agent's Password
     * @param req ModifyStaffPasswordRequest
     * @return ModifyStaffPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStaffPasswordResponse ModifyStaffPassword(ModifyStaffPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStaffPassword", ModifyStaffPasswordResponse.class);
    }

    /**
     *This API is used to suspend an ongoing automatic outbound call task by TaskId. After calling this API, the task will be temporarily interrupted and no longer initiate new outbound call requests; initiated calls are not affected.
A paused task can continue execution via the [Restore Suspended Automatic Outbound Call Task](https://www.tencentcloud.comom/document/product/679/125356?from_cn_redirect=1) API. If needed, refer to [Stop Automatic Outbound Call Task](https://www.tencentcloud.comom/document/product/679/69192?from_cn_redirect=1) to permanently terminate the task.
     * @param req PauseAutoCalloutTaskRequest
     * @return PauseAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public PauseAutoCalloutTaskResponse PauseAutoCalloutTask(PauseAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseAutoCalloutTask", PauseAutoCalloutTaskResponse.class);
    }

    /**
     *This API is used to pause the predictive outbound call task.
     * @param req PausePredictiveDialingCampaignRequest
     * @return PausePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public PausePredictiveDialingCampaignResponse PausePredictiveDialingCampaign(PausePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PausePredictiveDialingCampaign", PausePredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to perform playback for a session in a call with an agent.
     * @param req PlaySoundCallRequest
     * @return PlaySoundCallResponse
     * @throws TencentCloudSDKException
     */
    public PlaySoundCallResponse PlaySoundCall(PlaySoundCallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PlaySoundCall", PlaySoundCallResponse.class);
    }

    /**
     *This API is used to reset the telephone register password.
     * @param req ResetExtensionPasswordRequest
     * @return ResetExtensionPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetExtensionPasswordResponse ResetExtensionPassword(ResetExtensionPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetExtensionPassword", ResetExtensionPasswordResponse.class);
    }

    /**
     *This API is used to restore customer service to go live.
     * @param req RestoreMemberOnlineRequest
     * @return RestoreMemberOnlineResponse
     * @throws TencentCloudSDKException
     */
    public RestoreMemberOnlineResponse RestoreMemberOnline(RestoreMemberOnlineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreMemberOnline", RestoreMemberOnlineResponse.class);
    }

    /**
     *This API is used to restore a paused automatic outbound call task by TaskId. This API is suitable for scenarios where you need to continue execution of the remaining outbound call plan after calling Suspend Automatic Outbound Call Task. After a successful call, the task will resume from the paused state and re-initiate incomplete outbound requests.
     * @param req ResumeAutoCalloutTaskRequest
     * @return ResumeAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public ResumeAutoCalloutTaskResponse ResumeAutoCalloutTask(ResumeAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeAutoCalloutTask", ResumeAutoCalloutTaskResponse.class);
    }

    /**
     *This API is used to resume the predictive outbound call task.
     * @param req ResumePredictiveDialingCampaignRequest
     * @return ResumePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public ResumePredictiveDialingCampaignResponse ResumePredictiveDialingCampaign(ResumePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumePredictiveDialingCampaign", ResumePredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to set staff status.
     * @param req SetStaffStatusRequest
     * @return SetStaffStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetStaffStatusResponse SetStaffStatus(SetStaffStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetStaffStatus", SetStaffStatusResponse.class);
    }

    /**
     *This API is used to stop the automatic outbound call task.
     * @param req StopAutoCalloutTaskRequest
     * @return StopAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopAutoCalloutTaskResponse StopAutoCalloutTask(StopAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAutoCalloutTask", StopAutoCalloutTaskResponse.class);
    }

    /**
     *This API is used to transfer a session to an agent in specific scenarios.
     * @param req TransferToManualRequest
     * @return TransferToManualResponse
     * @throws TencentCloudSDKException
     */
    public TransferToManualResponse TransferToManual(TransferToManualRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferToManual", TransferToManualResponse.class);
    }

    /**
     *This API is used to unbind the number from the outbound call skill group.
     * @param req UnbindNumberCallOutSkillGroupRequest
     * @return UnbindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public UnbindNumberCallOutSkillGroupResponse UnbindNumberCallOutSkillGroup(UnbindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindNumberCallOutSkillGroup", UnbindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *This API is used to unbind the agent's skill group.
     * @param req UnbindStaffSkillGroupListRequest
     * @return UnbindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public UnbindStaffSkillGroupListResponse UnbindStaffSkillGroupList(UnbindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindStaffSkillGroupList", UnbindStaffSkillGroupListResponse.class);
    }

    /**
     *This API is used to update the skill group.
     * @param req UpdateCCCSkillGroupRequest
     * @return UpdateCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCCCSkillGroupResponse UpdateCCCSkillGroup(UpdateCCCSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCCCSkillGroup", UpdateCCCSkillGroupResponse.class);
    }

    /**
     *This API is used to update the predictive outbound call task before it starts.
     * @param req UpdatePredictiveDialingCampaignRequest
     * @return UpdatePredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePredictiveDialingCampaignResponse UpdatePredictiveDialingCampaign(UpdatePredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePredictiveDialingCampaign", UpdatePredictiveDialingCampaignResponse.class);
    }

    /**
     *Upload audio files used in IVR, with a daily upload limit of 50 files. (It is recommended to use temporary links stored in Tencent Cloud Cos for the audio file URL in the parameters)
     * @param req UploadIvrAudioRequest
     * @return UploadIvrAudioResponse
     * @throws TencentCloudSDKException
     */
    public UploadIvrAudioResponse UploadIvrAudio(UploadIvrAudioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadIvrAudio", UploadIvrAudioResponse.class);
    }

}
