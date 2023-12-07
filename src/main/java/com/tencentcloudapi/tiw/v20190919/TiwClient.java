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
package com.tencentcloudapi.tiw.v20190919;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiw.v20190919.models.*;

public class TiwClient extends AbstractClient{
    private static String endpoint = "tiw.tencentcloudapi.com";
    private static String service = "tiw";
    private static String version = "2019-09-19";
    
    public TiwClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TiwClient(Credential credential, String region, ClientProfile profile) {
        super(TiwClient.endpoint, TiwClient.version, credential, region, profile);
    }

    /**
     *This API is used to apply for a Tencent Interactive Whiteboard trial (15-day by default).
     * @param req ApplyTiwTrialRequest
     * @return ApplyTiwTrialResponse
     * @throws TencentCloudSDKException
     */
    public ApplyTiwTrialResponse ApplyTiwTrial(ApplyTiwTrialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyTiwTrial", ApplyTiwTrialResponse.class);
    }

    /**
     *This API is used to create a whiteboard application.
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
    }

    /**
     *This API is used to create a whiteboard snapshot task. If a callback URL is provided, the whiteboard snapshot result is sent to the callback URL after the task is complete.
     * @param req CreateSnapshotTaskRequest
     * @return CreateSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotTaskResponse CreateSnapshotTask(CreateSnapshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshotTask", CreateSnapshotTaskResponse.class);
    }

    /**
     *This API is used to create a document transcoding task.
     * @param req CreateTranscodeRequest
     * @return CreateTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeResponse CreateTranscode(CreateTranscodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTranscode", CreateTranscodeResponse.class);
    }

    /**
     *This API is used to create a recording video generation task.
     * @param req CreateVideoGenerationTaskRequest
     * @return CreateVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoGenerationTaskResponse CreateVideoGenerationTask(CreateVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoGenerationTask", CreateVideoGenerationTaskResponse.class);
    }

    /**
     *This API is used to query the information about other cloud products by using the service role.
     * @param req DescribeAPIServiceRequest
     * @return DescribeAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIServiceResponse DescribeAPIService(DescribeAPIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPIService", DescribeAPIServiceResponse.class);
    }

    /**
     *This API is used to query the details of a whiteboard application.
     * @param req DescribeApplicationInfosRequest
     * @return DescribeApplicationInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationInfosResponse DescribeApplicationInfos(DescribeApplicationInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationInfos", DescribeApplicationInfosResponse.class);
    }

    /**
     *This API is used to query the subproduct usage of Tencent Interactive Whiteboard.
     * @param req DescribeApplicationUsageRequest
     * @return DescribeApplicationUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationUsageResponse DescribeApplicationUsage(DescribeApplicationUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationUsage", DescribeApplicationUsageResponse.class);
    }

    /**
     *This API is used to query the logs of a whiteboard application on a client.
     * @param req DescribeBoardSDKLogRequest
     * @return DescribeBoardSDKLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBoardSDKLogResponse DescribeBoardSDKLog(DescribeBoardSDKLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBoardSDKLog", DescribeBoardSDKLogResponse.class);
    }

    /**
     *This API is used to query the instant messaging (IM) applications that are available for creating a whiteboard application.
     * @param req DescribeIMApplicationsRequest
     * @return DescribeIMApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMApplicationsResponse DescribeIMApplications(DescribeIMApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIMApplications", DescribeIMApplicationsResponse.class);
    }

    /**
     *This API is used to query the status and result of a real-time recording task.
     * @param req DescribeOnlineRecordRequest
     * @return DescribeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordResponse DescribeOnlineRecord(DescribeOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOnlineRecord", DescribeOnlineRecordResponse.class);
    }

    /**
     *This API is used to query the real-time recording callback address.
     * @param req DescribeOnlineRecordCallbackRequest
     * @return DescribeOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordCallbackResponse DescribeOnlineRecordCallback(DescribeOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOnlineRecordCallback", DescribeOnlineRecordCallbackResponse.class);
    }

    /**
     *This API is used to query the pay-as-you-go usage of a user.
     * @param req DescribePostpaidUsageRequest
     * @return DescribePostpaidUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpaidUsageResponse DescribePostpaidUsage(DescribePostpaidUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostpaidUsage", DescribePostpaidUsageResponse.class);
    }

    /**
     *This API is used to query the quality data of a whiteboard application.
     * @param req DescribeQualityMetricsRequest
     * @return DescribeQualityMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityMetricsResponse DescribeQualityMetrics(DescribeQualityMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityMetrics", DescribeQualityMetricsResponse.class);
    }

    /**
     *This API is used to query real-time recording tasks by room ID.
     * @param req DescribeRecordSearchRequest
     * @return DescribeRecordSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordSearchResponse DescribeRecordSearch(DescribeRecordSearchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordSearch", DescribeRecordSearchResponse.class);
    }

    /**
     *This API is used to query the rooms of a whiteboard application.
     * @param req DescribeRoomListRequest
     * @return DescribeRoomListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomListResponse DescribeRoomList(DescribeRoomListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoomList", DescribeRoomListResponse.class);
    }

    /**
     *This API is used to query the information about a whiteboard snapshot task.
     * @param req DescribeSnapshotTaskRequest
     * @return DescribeSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotTaskResponse DescribeSnapshotTask(DescribeSnapshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotTask", DescribeSnapshotTaskResponse.class);
    }

    /**
     *This API is used to query the daily billable usage of a whiteboard application.
1. The period queried per request cannot be longer than 31 days.
2. Due to statistics delays and other reasons, you cannot query the usage data of the current day. You can query today's usage after 7:00 tomorrow.

     * @param req DescribeTIWDailyUsageRequest
     * @return DescribeTIWDailyUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTIWDailyUsageResponse DescribeTIWDailyUsage(DescribeTIWDailyUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTIWDailyUsage", DescribeTIWDailyUsageResponse.class);
    }

    /**
     *This API is used to query the daily billable usage by each room of a whiteboard application.
1. The period queried per request cannot be longer than 31 days.
2. Due to statistics delays and other reasons, you cannot query the usage data of the current day. You can query today's usage after 7:00 tomorrow.

     * @param req DescribeTIWRoomDailyUsageRequest
     * @return DescribeTIWRoomDailyUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTIWRoomDailyUsageResponse DescribeTIWRoomDailyUsage(DescribeTIWRoomDailyUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTIWRoomDailyUsage", DescribeTIWRoomDailyUsageResponse.class);
    }

    /**
     *This API is used to query the progress and result of a document transcoding task.
     * @param req DescribeTranscodeRequest
     * @return DescribeTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeResponse DescribeTranscode(DescribeTranscodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscode", DescribeTranscodeResponse.class);
    }

    /**
     *This API is used to query the document transcoding callback address.
     * @param req DescribeTranscodeCallbackRequest
     * @return DescribeTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeCallbackResponse DescribeTranscodeCallback(DescribeTranscodeCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeCallback", DescribeTranscodeCallbackResponse.class);
    }

    /**
     *This API is used to query transcoding tasks by document name.
     * @param req DescribeTranscodeSearchRequest
     * @return DescribeTranscodeSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeSearchResponse DescribeTranscodeSearch(DescribeTranscodeSearchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeSearch", DescribeTranscodeSearchResponse.class);
    }

    /**
     *This API is used to query the summary of subproduct usage within a specified period of time.
     * @param req DescribeUsageSummaryRequest
     * @return DescribeUsageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageSummaryResponse DescribeUsageSummary(DescribeUsageSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageSummary", DescribeUsageSummaryResponse.class);
    }

    /**
     *This API is used to query the users of a whiteboard application.
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserList", DescribeUserListResponse.class);
    }

    /**
     *This API is used to query user resources.
     * @param req DescribeUserResourcesRequest
     * @return DescribeUserResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResourcesResponse DescribeUserResources(DescribeUserResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserResources", DescribeUserResourcesResponse.class);
    }

    /**
     *This API is used to query the Tencent Interactive Whiteboard service status of a user, including the activation status and validity period.

     * @param req DescribeUserStatusRequest
     * @return DescribeUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserStatusResponse DescribeUserStatus(DescribeUserStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserStatus", DescribeUserStatusResponse.class);
    }

    /**
     *This API is used to query the status and result of a recording video generation task.
     * @param req DescribeVideoGenerationTaskRequest
     * @return DescribeVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskResponse DescribeVideoGenerationTask(DescribeVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoGenerationTask", DescribeVideoGenerationTaskResponse.class);
    }

    /**
     *This API is used to query the callback URL for recording video generation.
     * @param req DescribeVideoGenerationTaskCallbackRequest
     * @return DescribeVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskCallbackResponse DescribeVideoGenerationTaskCallback(DescribeVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoGenerationTaskCallback", DescribeVideoGenerationTaskCallbackResponse.class);
    }

    /**
     *This API is used to query the task-related configurations of a whiteboard application, including the bucket and callback URL.
     * @param req DescribeWhiteboardApplicationConfigRequest
     * @return DescribeWhiteboardApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardApplicationConfigResponse DescribeWhiteboardApplicationConfig(DescribeWhiteboardApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardApplicationConfig", DescribeWhiteboardApplicationConfigResponse.class);
    }

    /**
     *This API is used to query the bucket configurations for document transcoding and real-time recording.
     * @param req DescribeWhiteboardBucketConfigRequest
     * @return DescribeWhiteboardBucketConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardBucketConfigResponse DescribeWhiteboardBucketConfig(DescribeWhiteboardBucketConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardBucketConfig", DescribeWhiteboardBucketConfigResponse.class);
    }

    /**
     *This API is used to query the status and result of a whiteboard push task.
     * @param req DescribeWhiteboardPushRequest
     * @return DescribeWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushResponse DescribeWhiteboardPush(DescribeWhiteboardPushRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardPush", DescribeWhiteboardPushResponse.class);
    }

    /**
     *This API is used to query the whiteboard push callback URL.
     * @param req DescribeWhiteboardPushCallbackRequest
     * @return DescribeWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushCallbackResponse DescribeWhiteboardPushCallback(DescribeWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardPushCallback", DescribeWhiteboardPushCallbackResponse.class);
    }

    /**
     *This API is used to query whiteboard push tasks by room ID.
     * @param req DescribeWhiteboardPushSearchRequest
     * @return DescribeWhiteboardPushSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushSearchResponse DescribeWhiteboardPushSearch(DescribeWhiteboardPushSearchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteboardPushSearch", DescribeWhiteboardPushSearchResponse.class);
    }

    /**
     *This API is used to modify a whiteboard application.
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
    }

    /**
     *This API is used to set auto-renewal for a Tencent Interactive Whiteboard monthly feature package.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to modify the task-related configurations of a whiteboard application, including the bucket and callback URL.
     * @param req ModifyWhiteboardApplicationConfigRequest
     * @return ModifyWhiteboardApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWhiteboardApplicationConfigResponse ModifyWhiteboardApplicationConfig(ModifyWhiteboardApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWhiteboardApplicationConfig", ModifyWhiteboardApplicationConfigResponse.class);
    }

    /**
     *This API is used to modify the bucket configurations for document transcoding and real-time recording.
     * @param req ModifyWhiteboardBucketConfigRequest
     * @return ModifyWhiteboardBucketConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWhiteboardBucketConfigResponse ModifyWhiteboardBucketConfig(ModifyWhiteboardBucketConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWhiteboardBucketConfig", ModifyWhiteboardBucketConfigResponse.class);
    }

    /**
     *This API is used to pause real-time recording.
     * @param req PauseOnlineRecordRequest
     * @return PauseOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public PauseOnlineRecordResponse PauseOnlineRecord(PauseOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseOnlineRecord", PauseOnlineRecordResponse.class);
    }

    /**
     *This API is used to resume real-time recording.
     * @param req ResumeOnlineRecordRequest
     * @return ResumeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public ResumeOnlineRecordResponse ResumeOnlineRecord(ResumeOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeOnlineRecord", ResumeOnlineRecordResponse.class);
    }

    /**
     *This API is used to set the real-time recording callback address. For the callback format, please [see here](https://www.tencentcloud.com/document/product/1176/55569).
     * @param req SetOnlineRecordCallbackRequest
     * @return SetOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackResponse SetOnlineRecordCallback(SetOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetOnlineRecordCallback", SetOnlineRecordCallbackResponse.class);
    }

    /**
     *This API is used to set the callback authentication key for real-time recording. For more information, see [Event Notification](https://www.tencentcloud.com/document/product/1176/55569).
     * @param req SetOnlineRecordCallbackKeyRequest
     * @return SetOnlineRecordCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackKeyResponse SetOnlineRecordCallbackKey(SetOnlineRecordCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetOnlineRecordCallbackKey", SetOnlineRecordCallbackKeyResponse.class);
    }

    /**
     *This API is used to set the callback address for document transcoding. For the callback format, please [see here](https://www.tencentcloud.com/document/product/1176/55569).
     * @param req SetTranscodeCallbackRequest
     * @return SetTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackResponse SetTranscodeCallback(SetTranscodeCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTranscodeCallback", SetTranscodeCallbackResponse.class);
    }

    /**
     *This API is used to set the callback authentication key for document transcoding. For more information, see [Event Notification](https://www.tencentcloud.com/document/product/1176/55569).
     * @param req SetTranscodeCallbackKeyRequest
     * @return SetTranscodeCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackKeyResponse SetTranscodeCallbackKey(SetTranscodeCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTranscodeCallbackKey", SetTranscodeCallbackKeyResponse.class);
    }

    /**
     *This API is used to set the callback URL for recording video generation.
     * @param req SetVideoGenerationTaskCallbackRequest
     * @return SetVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackResponse SetVideoGenerationTaskCallback(SetVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVideoGenerationTaskCallback", SetVideoGenerationTaskCallbackResponse.class);
    }

    /**
     *This API is used to set the callback authentication key for recording video generation.
     * @param req SetVideoGenerationTaskCallbackKeyRequest
     * @return SetVideoGenerationTaskCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackKeyResponse SetVideoGenerationTaskCallbackKey(SetVideoGenerationTaskCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVideoGenerationTaskCallbackKey", SetVideoGenerationTaskCallbackKeyResponse.class);
    }

    /**
     *This API is used to set the whiteboard push callback URL. For more information, see [Event Notification](https://www.tencentcloud.com/document/product/1176/55569).
     * @param req SetWhiteboardPushCallbackRequest
     * @return SetWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackResponse SetWhiteboardPushCallback(SetWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWhiteboardPushCallback", SetWhiteboardPushCallbackResponse.class);
    }

    /**
     *This API is used to set the callback authentication key for whiteboard push. For more information, see [Event Notification](https://www.tencentcloud.com/document/product/1176/55569).
     * @param req SetWhiteboardPushCallbackKeyRequest
     * @return SetWhiteboardPushCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackKeyResponse SetWhiteboardPushCallbackKey(SetWhiteboardPushCallbackKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWhiteboardPushCallbackKey", SetWhiteboardPushCallbackKeyResponse.class);
    }

    /**
     *This API is used to start a real-time recording task.
     * @param req StartOnlineRecordRequest
     * @return StartOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartOnlineRecordResponse StartOnlineRecord(StartOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOnlineRecord", StartOnlineRecordResponse.class);
    }

    /**
     *This API is used to start a whiteboard push task.
     * @param req StartWhiteboardPushRequest
     * @return StartWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StartWhiteboardPushResponse StartWhiteboardPush(StartWhiteboardPushRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartWhiteboardPush", StartWhiteboardPushResponse.class);
    }

    /**
     *This API is used to stop real-time recording.
     * @param req StopOnlineRecordRequest
     * @return StopOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopOnlineRecordResponse StopOnlineRecord(StopOnlineRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopOnlineRecord", StopOnlineRecordResponse.class);
    }

    /**
     *This API is used to stop a whiteboard push task.
     * @param req StopWhiteboardPushRequest
     * @return StopWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StopWhiteboardPushResponse StopWhiteboardPush(StopWhiteboardPushRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopWhiteboardPush", StopWhiteboardPushResponse.class);
    }

}
