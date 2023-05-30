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
        JsonResponseModel<ApplyTiwTrialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyTiwTrialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyTiwTrial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a whiteboard application.
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an offline recording task.
     * @param req CreateOfflineRecordRequest
     * @return CreateOfflineRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineRecordResponse CreateOfflineRecord(CreateOfflineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOfflineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOfflineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOfflineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a whiteboard snapshot task. If a callback URL is provided, the whiteboard snapshot result is sent to the callback URL after the task is complete.
     * @param req CreateSnapshotTaskRequest
     * @return CreateSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotTaskResponse CreateSnapshotTask(CreateSnapshotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshotTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a document transcoding task.
     * @param req CreateTranscodeRequest
     * @return CreateTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeResponse CreateTranscode(CreateTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTranscode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a recording video generation task.
     * @param req CreateVideoGenerationTaskRequest
     * @return CreateVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoGenerationTaskResponse CreateVideoGenerationTask(CreateVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVideoGenerationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVideoGenerationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVideoGenerationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information about other cloud products by using the service role.
     * @param req DescribeAPIServiceRequest
     * @return DescribeAPIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIServiceResponse DescribeAPIService(DescribeAPIServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAPIServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAPIServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAPIService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a whiteboard application.
     * @param req DescribeApplicationInfosRequest
     * @return DescribeApplicationInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationInfosResponse DescribeApplicationInfos(DescribeApplicationInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the subproduct usage of Tencent Interactive Whiteboard.
     * @param req DescribeApplicationUsageRequest
     * @return DescribeApplicationUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationUsageResponse DescribeApplicationUsage(DescribeApplicationUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the logs of a whiteboard application on a client.
     * @param req DescribeBoardSDKLogRequest
     * @return DescribeBoardSDKLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBoardSDKLogResponse DescribeBoardSDKLog(DescribeBoardSDKLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBoardSDKLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBoardSDKLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBoardSDKLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the instant messaging (IM) applications that are available for creating a whiteboard application.
     * @param req DescribeIMApplicationsRequest
     * @return DescribeIMApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMApplicationsResponse DescribeIMApplications(DescribeIMApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIMApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIMApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIMApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information about an offline recording task, including the recording progress and recording result.
     * @param req DescribeOfflineRecordRequest
     * @return DescribeOfflineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineRecordResponse DescribeOfflineRecord(DescribeOfflineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the offline recording callback URL.
     * @param req DescribeOfflineRecordCallbackRequest
     * @return DescribeOfflineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineRecordCallbackResponse DescribeOfflineRecordCallback(DescribeOfflineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status and result of a real-time recording task.
     * @param req DescribeOnlineRecordRequest
     * @return DescribeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordResponse DescribeOnlineRecord(DescribeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the real-time recording callback address.
     * @param req DescribeOnlineRecordCallbackRequest
     * @return DescribeOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordCallbackResponse DescribeOnlineRecordCallback(DescribeOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOnlineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOnlineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the pay-as-you-go usage of a user.
     * @param req DescribePostpaidUsageRequest
     * @return DescribePostpaidUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpaidUsageResponse DescribePostpaidUsage(DescribePostpaidUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePostpaidUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePostpaidUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePostpaidUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the quality data of a whiteboard application.
     * @param req DescribeQualityMetricsRequest
     * @return DescribeQualityMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityMetricsResponse DescribeQualityMetrics(DescribeQualityMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQualityMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQualityMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQualityMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query real-time recording tasks by room ID.
     * @param req DescribeRecordSearchRequest
     * @return DescribeRecordSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordSearchResponse DescribeRecordSearch(DescribeRecordSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordSearchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the rooms of a whiteboard application.
     * @param req DescribeRoomListRequest
     * @return DescribeRoomListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomListResponse DescribeRoomList(DescribeRoomListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoomList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information about a whiteboard snapshot task.
     * @param req DescribeSnapshotTaskRequest
     * @return DescribeSnapshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotTaskResponse DescribeSnapshotTask(DescribeSnapshotTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeTIWDailyUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTIWDailyUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTIWDailyUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeTIWRoomDailyUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTIWRoomDailyUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTIWRoomDailyUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the progress and result of a document transcoding task.
     * @param req DescribeTranscodeRequest
     * @return DescribeTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeResponse DescribeTranscode(DescribeTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the document transcoding callback address.
     * @param req DescribeTranscodeCallbackRequest
     * @return DescribeTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeCallbackResponse DescribeTranscodeCallback(DescribeTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscodeCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query transcoding tasks by document name.
     * @param req DescribeTranscodeSearchRequest
     * @return DescribeTranscodeSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeSearchResponse DescribeTranscodeSearch(DescribeTranscodeSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeSearchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTranscodeSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the summary of subproduct usage within a specified period of time.
     * @param req DescribeUsageSummaryRequest
     * @return DescribeUsageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageSummaryResponse DescribeUsageSummary(DescribeUsageSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsageSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsageSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsageSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the users of a whiteboard application.
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query user resources.
     * @param req DescribeUserResourcesRequest
     * @return DescribeUserResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResourcesResponse DescribeUserResources(DescribeUserResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the Tencent Interactive Whiteboard service status of a user, including the activation status and validity period.

     * @param req DescribeUserStatusRequest
     * @return DescribeUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserStatusResponse DescribeUserStatus(DescribeUserStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status and result of a recording video generation task.
     * @param req DescribeVideoGenerationTaskRequest
     * @return DescribeVideoGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskResponse DescribeVideoGenerationTask(DescribeVideoGenerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoGenerationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoGenerationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoGenerationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the callback URL for recording video generation.
     * @param req DescribeVideoGenerationTaskCallbackRequest
     * @return DescribeVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoGenerationTaskCallbackResponse DescribeVideoGenerationTaskCallback(DescribeVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoGenerationTaskCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoGenerationTaskCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoGenerationTaskCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the task-related configurations of a whiteboard application, including the bucket and callback URL.
     * @param req DescribeWhiteboardApplicationConfigRequest
     * @return DescribeWhiteboardApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardApplicationConfigResponse DescribeWhiteboardApplicationConfig(DescribeWhiteboardApplicationConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardApplicationConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardApplicationConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardApplicationConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the bucket configurations for document transcoding and real-time recording.
     * @param req DescribeWhiteboardBucketConfigRequest
     * @return DescribeWhiteboardBucketConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardBucketConfigResponse DescribeWhiteboardBucketConfig(DescribeWhiteboardBucketConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardBucketConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardBucketConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardBucketConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status and result of a whiteboard push task.
     * @param req DescribeWhiteboardPushRequest
     * @return DescribeWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushResponse DescribeWhiteboardPush(DescribeWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardPushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardPush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the whiteboard push callback URL.
     * @param req DescribeWhiteboardPushCallbackRequest
     * @return DescribeWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushCallbackResponse DescribeWhiteboardPushCallback(DescribeWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardPushCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardPushCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query whiteboard push tasks by room ID.
     * @param req DescribeWhiteboardPushSearchRequest
     * @return DescribeWhiteboardPushSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteboardPushSearchResponse DescribeWhiteboardPushSearch(DescribeWhiteboardPushSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteboardPushSearchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteboardPushSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteboardPushSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a whiteboard application.
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set auto-renewal for a Tencent Interactive Whiteboard monthly feature package.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoRenewFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the task-related configurations of a whiteboard application, including the bucket and callback URL.
     * @param req ModifyWhiteboardApplicationConfigRequest
     * @return ModifyWhiteboardApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWhiteboardApplicationConfigResponse ModifyWhiteboardApplicationConfig(ModifyWhiteboardApplicationConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWhiteboardApplicationConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWhiteboardApplicationConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWhiteboardApplicationConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the bucket configurations for document transcoding and real-time recording.
     * @param req ModifyWhiteboardBucketConfigRequest
     * @return ModifyWhiteboardBucketConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWhiteboardBucketConfigResponse ModifyWhiteboardBucketConfig(ModifyWhiteboardBucketConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWhiteboardBucketConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWhiteboardBucketConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWhiteboardBucketConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pause real-time recording.
     * @param req PauseOnlineRecordRequest
     * @return PauseOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public PauseOnlineRecordResponse PauseOnlineRecord(PauseOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseOnlineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PauseOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume real-time recording.
     * @param req ResumeOnlineRecordRequest
     * @return ResumeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public ResumeOnlineRecordResponse ResumeOnlineRecord(ResumeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeOnlineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the offline recording callback URL.
     * @param req SetOfflineRecordCallbackRequest
     * @return SetOfflineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOfflineRecordCallbackResponse SetOfflineRecordCallback(SetOfflineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOfflineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetOfflineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOfflineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the real-time recording callback address. For the callback format, please [see here](https://intl.cloud.tencent.com/document/product/1137/40258?from_cn_redirect=1).
     * @param req SetOnlineRecordCallbackRequest
     * @return SetOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackResponse SetOnlineRecordCallback(SetOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOnlineRecordCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetOnlineRecordCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOnlineRecordCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the callback authentication key for real-time recording. For more information, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     * @param req SetOnlineRecordCallbackKeyRequest
     * @return SetOnlineRecordCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackKeyResponse SetOnlineRecordCallbackKey(SetOnlineRecordCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOnlineRecordCallbackKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetOnlineRecordCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOnlineRecordCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the callback address for document transcoding. For the callback format, please [see here](https://intl.cloud.tencent.com/document/product/1137/40260?from_cn_redirect=1).
     * @param req SetTranscodeCallbackRequest
     * @return SetTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackResponse SetTranscodeCallback(SetTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTranscodeCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetTranscodeCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTranscodeCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the callback authentication key for document transcoding. For more information, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     * @param req SetTranscodeCallbackKeyRequest
     * @return SetTranscodeCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackKeyResponse SetTranscodeCallbackKey(SetTranscodeCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTranscodeCallbackKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetTranscodeCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTranscodeCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the callback URL for recording video generation.
     * @param req SetVideoGenerationTaskCallbackRequest
     * @return SetVideoGenerationTaskCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackResponse SetVideoGenerationTaskCallback(SetVideoGenerationTaskCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVideoGenerationTaskCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetVideoGenerationTaskCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetVideoGenerationTaskCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the callback authentication key for recording video generation.
     * @param req SetVideoGenerationTaskCallbackKeyRequest
     * @return SetVideoGenerationTaskCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetVideoGenerationTaskCallbackKeyResponse SetVideoGenerationTaskCallbackKey(SetVideoGenerationTaskCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVideoGenerationTaskCallbackKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetVideoGenerationTaskCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetVideoGenerationTaskCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the whiteboard push callback URL. For more information, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     * @param req SetWhiteboardPushCallbackRequest
     * @return SetWhiteboardPushCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackResponse SetWhiteboardPushCallback(SetWhiteboardPushCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWhiteboardPushCallbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetWhiteboardPushCallbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWhiteboardPushCallback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the callback authentication key for whiteboard push. For more information, see [Event Notification](https://intl.cloud.tencent.com/document/product/1137/40257?from_cn_redirect=1).
     * @param req SetWhiteboardPushCallbackKeyRequest
     * @return SetWhiteboardPushCallbackKeyResponse
     * @throws TencentCloudSDKException
     */
    public SetWhiteboardPushCallbackKeyResponse SetWhiteboardPushCallbackKey(SetWhiteboardPushCallbackKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWhiteboardPushCallbackKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetWhiteboardPushCallbackKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWhiteboardPushCallbackKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a real-time recording task.
     * @param req StartOnlineRecordRequest
     * @return StartOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartOnlineRecordResponse StartOnlineRecord(StartOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartOnlineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a whiteboard push task.
     * @param req StartWhiteboardPushRequest
     * @return StartWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StartWhiteboardPushResponse StartWhiteboardPush(StartWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartWhiteboardPushResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartWhiteboardPushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartWhiteboardPush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop real-time recording.
     * @param req StopOnlineRecordRequest
     * @return StopOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopOnlineRecordResponse StopOnlineRecord(StopOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopOnlineRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopOnlineRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopOnlineRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a whiteboard push task.
     * @param req StopWhiteboardPushRequest
     * @return StopWhiteboardPushResponse
     * @throws TencentCloudSDKException
     */
    public StopWhiteboardPushResponse StopWhiteboardPush(StopWhiteboardPushRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopWhiteboardPushResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopWhiteboardPushResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopWhiteboardPush");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
