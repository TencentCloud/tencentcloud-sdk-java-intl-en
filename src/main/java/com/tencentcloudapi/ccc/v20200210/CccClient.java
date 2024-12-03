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
    private static String endpoint = "ccc.tencentcloudapi.com";
    private static String service = "ccc";
    private static String version = "2020-02-10";
    
    public CccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CccClient(Credential credential, String region, ClientProfile profile) {
        super(CccClient.endpoint, CccClient.version, credential, region, profile);
    }

    /**
     *If you want to stop running agent's individual auto task, then call AbortAgentCruiseDialingCampaign to terminate.
     * @param req AbortAgentCruiseDialingCampaignRequest
     * @return AbortAgentCruiseDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public AbortAgentCruiseDialingCampaignResponse AbortAgentCruiseDialingCampaign(AbortAgentCruiseDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortAgentCruiseDialingCampaign", AbortAgentCruiseDialingCampaignResponse.class);
    }

    /**
     *This API is used to pause predictive dialing campaign
     * @param req AbortPredictiveDialingCampaignRequest
     * @return AbortPredictiveDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public AbortPredictiveDialingCampaignResponse AbortPredictiveDialingCampaign(AbortPredictiveDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortPredictiveDialingCampaign", AbortPredictiveDialingCampaignResponse.class);
    }

    /**
     *This API is used to assign outbound skill group(s) to your number
     * @param req BindNumberCallOutSkillGroupRequest
     * @return BindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindNumberCallOutSkillGroupResponse BindNumberCallOutSkillGroup(BindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNumberCallOutSkillGroup", BindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *This API is used to assign an agent to skill group
     * @param req BindStaffSkillGroupListRequest
     * @return BindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public BindStaffSkillGroupListResponse BindStaffSkillGroupList(BindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindStaffSkillGroupList", BindStaffSkillGroupListResponse.class);
    }

    /**
     *Used to make outbound calls by invoking AI models, limited to the use of proprietary phone numbers. Currently, the Advanced version seats are available for a **limited time** free trial.

Before initiating a call, please ensure your AI model is compatible with OpenAI, Azure, or Minimax protocols, and visit the model provider's website to obtain relevant authentication information. For detailed feature descriptions, please refer to the documentation [Tencent Cloud Contact Center AI Call Platform](https://intl.cloud.tencent.com/document/product/679/112100?from_cn_redirect=1).
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
     *This document shows how to call API to create an individual auto dialing campaign for agent
     * @param req CreateAgentCruiseDialingCampaignRequest
     * @return CreateAgentCruiseDialingCampaignResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentCruiseDialingCampaignResponse CreateAgentCruiseDialingCampaign(CreateAgentCruiseDialingCampaignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentCruiseDialingCampaign", CreateAgentCruiseDialingCampaignResponse.class);
    }

    /**
     *This API is used to create the automatic outbound call task.
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
     *This API is used to create outbound sessions. Currently, only dual call is supported. That is, firstly, please use the platform number to call the agent's cell phone. After the agent answers, then please make outbound calls to the user. Due to ISP frequency restrictions, the agent's phone number must first be added to the allowlist to avoid frequency control which may lead to the failure of the outbound call.
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
     *This API is used to query automatic outbound call task details.
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
     *This API is used to access call detail records by application
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
     *This API is used to modify  customer service / agent account.
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
