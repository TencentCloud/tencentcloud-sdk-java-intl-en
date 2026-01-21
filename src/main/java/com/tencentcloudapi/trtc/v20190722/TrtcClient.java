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
package com.tencentcloudapi.trtc.v20190722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trtc.v20190722.models.*;

public class TrtcClient extends AbstractClient{
    private static String endpoint = "trtc.intl.tencentcloudapi.com";
    private static String service = "trtc";
    private static String version = "2019-07-22";

    public TrtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrtcClient(Credential credential, String region, ClientProfile profile) {
        super(TrtcClient.endpoint, TrtcClient.version, credential, region, profile);
    }

    /**
     *This API is used to provide service for server-side robot control.
     * @param req ControlAIConversationRequest
     * @return ControlAIConversationResponse
     * @throws TencentCloudSDKException
     */
    public ControlAIConversationResponse ControlAIConversation(ControlAIConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlAIConversation", ControlAIConversationResponse.class);
    }

    /**
     *API description:
This API is used to enable the cloud moderation feature to complete audio and video slicing, video frame extraction, and audio stream recording in the room, and submit them to the specified moderation supplier for completing the moderation.

This API is used to achieve the following goals:
* This API is used to specify the moderation parameters (ModerationParams) to specify the detailed parameters required for moderation.
* This API is used to specify the storage parameter (SliceStorageParams) to specify the cloud storage you want to upload the file complying with the moderation policy to. Currently, Tencent Cloud Object Storage (COS) and third-party AWS are supported.
     * @param req CreateCloudModerationRequest
     * @return CreateCloudModerationResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudModerationResponse CreateCloudModeration(CreateCloudModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudModeration", CreateCloudModerationResponse.class);
    }

    /**
     *API description:
This API is used to start an on-cloud recording task. It records the audio and video streams in a room and saves them to the specified cloud storage. You can use this API to record the streams in a room separately, or you can mix the streams first and then record the mixed stream.

You can use this API to perform the following operations:
* Specify the anchors whose streams you want or do not want to record by using the `RecordParams` parameter
* Specify the storage service you want to save recording files to by using the `StorageParams` parameter. Currently, you can save recording files to Tencent Cloud VOD or COS.
* Specify transcoding settings for mixed-stream recording, including video resolution, video bitrate, frame rate, and audio quality, by using `MixTranscodeParams`
* Specify the layout of different videos in mixed-stream recording mode or select an auto-arranged layout template

Key concepts:
* Single-stream recording: Record the audio and video of each subscribed user (`UserId`) in a room and save the recording files to the storage you specify.
Mixed-stream recording: Mix the audios and videos of subscribed users (`UserId`) in a room, record the mixed stream, and save the recording files to the storage you specify. After a recording task ends, you can go to the VOD console (https://console.tencentcloud.com/vod/media) or [COS console](https://console.cloud.tencent.com/cos/bucket) to view the recording files.
     * @param req CreateCloudRecordingRequest
     * @return CreateCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudRecordingResponse CreateCloudRecording(CreateCloudRecordingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudRecording", CreateCloudRecordingResponse.class);
    }

    /**
     *API description:
This API is used to enable the cloud slicing feature, completing audio and video slicing tasks in the room, and uploading them to the specified cloud storage.
This API is used to achieve the following goals:
* This API is used to specify the slicing parameter (SliceParams) to define the blocklist or allowlist of the anchors that require slicing.
* This API is used to specify the storage parameter (SliceStorageParams) to specify the cloud storage you want to upload to. Currently, Tencent Cloud Object Storage (COS) and third-party AWS are supported.
     * @param req CreateCloudSliceTaskRequest
     * @return CreateCloudSliceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudSliceTaskResponse CreateCloudSliceTask(CreateCloudSliceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudSliceTask", CreateCloudSliceTaskResponse.class);
    }

    /**
     *This API is used to stop submission for moderation after the cloud moderation task is successfully started.
     * @param req DeleteCloudModerationRequest
     * @return DeleteCloudModerationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudModerationResponse DeleteCloudModeration(DeleteCloudModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudModeration", DeleteCloudModerationResponse.class);
    }

    /**
     *This API is used to stop a recording task. If a task is stopped successfully, but the uploading of recording files has not completed, the backend will continue to upload the files and will notify you via a callback when the upload is completed.
     * @param req DeleteCloudRecordingRequest
     * @return DeleteCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudRecordingResponse DeleteCloudRecording(DeleteCloudRecordingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudRecording", DeleteCloudRecordingResponse.class);
    }

    /**
     *This API is used to stop the slicing task after it is started. Successfully stopping the slicing does not mean that all files are fully transmitted; if the transmission is not completed, the backend will continue to upload files. After the upload is successful, a notification is sent to the customer, prompting that all files have been transmitted, through the event callback.
     * @param req DeleteCloudSliceTaskRequest
     * @return DeleteCloudSliceTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudSliceTaskResponse DeleteCloudSliceTask(DeleteCloudSliceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudSliceTask", DeleteCloudSliceTaskResponse.class);
    }

    /**
     *Describe the AI conversation task status
     * @param req DescribeAIConversationRequest
     * @return DescribeAIConversationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIConversationResponse DescribeAIConversation(DescribeAIConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIConversation", DescribeAIConversationResponse.class);
    }

    /**
     *Describe AI transcription task status
     * @param req DescribeAITranscriptionRequest
     * @return DescribeAITranscriptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITranscriptionResponse DescribeAITranscription(DescribeAITranscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAITranscription", DescribeAITranscriptionResponse.class);
    }

    /**
     *This API (the old `DescribeCallDetail`) is used to query the user list and call quality data of a specified time range in the last 14 days. If `DataType` is not null, the data of up to six users during a period of up to one hour can be queried (the period can start and end on different days). If `DataType` is null, the data of up to 100 users can be returned per page (the value of `PageSize` cannot exceed 100). Six users are queried by default. The period queried cannot exceed four hours. This API is used to query call quality and is not recommended for billing purposes.
**Note**:
1. You can use this API to query historical data or for reconciliation purposes, but we do not recommend you use it for crucial business logic.
2. If you need to call this API, please upgrade the monitoring dashboard version to "Standard". For more details, please refer to: https://trtc.io/document/54481?product=pricing.
     * @param req DescribeCallDetailInfoRequest
     * @return DescribeCallDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallDetailInfoResponse DescribeCallDetailInfo(DescribeCallDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallDetailInfo", DescribeCallDetailInfoResponse.class);
    }

    /**
     *This API is used to query the status of the moderation task and information about the subscription blocklist and allowlist after the task is started, which is valid only when the task is in progress. An error will be returned if the task is exited.
     * @param req DescribeCloudModerationRequest
     * @return DescribeCloudModerationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudModerationResponse DescribeCloudModeration(DescribeCloudModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudModeration", DescribeCloudModerationResponse.class);
    }

    /**
     *This API is used to query the status of a recording task after it starts. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned.
If a recording file is being uploaded to VOD, the response parameter `StorageFileList` will not contain the information of the recording file. Please listen for the recording file callback to get the information.
     * @param req DescribeCloudRecordingRequest
     * @return DescribeCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRecordingResponse DescribeCloudRecording(DescribeCloudRecordingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRecording", DescribeCloudRecordingResponse.class);
    }

    /**
     *This API is used to query the status of the slicing task after it is started, which is valid only when the task is in progress. An error will be returned if the task is exited.
     * @param req DescribeCloudSliceTaskRequest
     * @return DescribeCloudSliceTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudSliceTaskResponse DescribeCloudSliceTask(DescribeCloudSliceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudSliceTask", DescribeCloudSliceTaskResponse.class);
    }

    /**
     *This API is used to query your usage of TRTC’s On-Cloud MixTranscoding service.
- If the period queried is one day or shorter, the statistics returned are on a five-minute basis. If the period queried is longer than one day, the statistics returned are on a daily basis.
- The period queried per request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- You can use this API to query your historical usage or to reconcile data, but we do not recommend you use it for crucial business logic.
- The rate limit of this API is five calls per second.
     * @param req DescribeMixTranscodingUsageRequest
     * @return DescribeMixTranscodingUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMixTranscodingUsageResponse DescribeMixTranscodingUsage(DescribeMixTranscodingUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMixTranscodingUsage", DescribeMixTranscodingUsageResponse.class);
    }

    /**
     *This API is used to query your TRTC recording usage.
- If the period queried is one day or shorter, the statistics returned are on a five-minute basis. If the period queried is longer than one day, the statistics returned are on a daily basis.
- The period queried per request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- You can use this API to query your historical usage or to reconcile data, but we do not recommend you use it for crucial business logic.
- The rate limit of this API is five calls per second.
     * @param req DescribeRecordingUsageRequest
     * @return DescribeRecordingUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingUsageResponse DescribeRecordingUsage(DescribeRecordingUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordingUsage", DescribeRecordingUsageResponse.class);
    }

    /**
     *This API is used to query your usage of TRTC’s relay to CDN service.
- If the period queried is one day or shorter, the statistics returned are on a five-minute basis. If the period queried is longer than one day, the statistics returned are on a daily basis.
- The period queried per request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- You can use this API to query your historical usage or to reconcile data, but we do not recommend you use it for crucial business logic.
- The rate limit of this API is five calls per second.
     * @param req DescribeRelayUsageRequest
     * @return DescribeRelayUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelayUsageResponse DescribeRelayUsage(DescribeRelayUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelayUsage", DescribeRelayUsageResponse.class);
    }

    /**
     *This API (the old `DescribeRoomInformation`) is used to query the rooms of an application (`SDKAppID`) in the last 14 days. Up to 100 records can be returned per call (10 are returned by default).
**Note**:
1. You can use this API to query historical data or for reconciliation purposes, but we do not recommend you use it for crucial business logic.
2. If you need to call this API, please upgrade the monitoring dashboard version to "Standard". For more details, please refer to: https://trtc.io/document/54481
     * @param req DescribeRoomInfoRequest
     * @return DescribeRoomInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomInfoResponse DescribeRoomInfo(DescribeRoomInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoomInfo", DescribeRoomInfoResponse.class);
    }

    /**
     *This API (the old `DescribeHistoryScale`) is used to query the daily number of rooms and users of an application (`SDKAppID`) in the last 14 days. Data for the current day cannot be queried.
     * @param req DescribeScaleInfoRequest
     * @return DescribeScaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScaleInfoResponse DescribeScaleInfo(DescribeScaleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScaleInfo", DescribeScaleInfoResponse.class);
    }

    /**
     *You can query the status of the Relay task.
     * @param req DescribeStreamIngestRequest
     * @return DescribeStreamIngestResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamIngestResponse DescribeStreamIngest(DescribeStreamIngestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamIngest", DescribeStreamIngestResponse.class);
    }

    /**
     *Query TRTC Monitoring Dashboard - Data Dashboard Quality Metrics (including the following metrics)
joinSuccessRate: Join channel success rate.
joinSuccessIn5sRate: Join channel success rate within 5s.
audioFreezeRate: Audio stutter rate.
videoFreezeRate: Video stutter rate.
networkDelay: Lag rate.
Note:
1. To call the API, you need to activate the monitoring dashboard Standard Edition and Premium Edition, the monitoring dashboard Free Edition does not support calling. Monitoring dashboard version features and billing overview: https://trtc.io/document/54481.
2. The query time range depends on the monitoring dashboard function version, premium edition can query the last 30 days.
     * @param req DescribeTRTCMarketQualityDataRequest
     * @return DescribeTRTCMarketQualityDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTRTCMarketQualityDataResponse DescribeTRTCMarketQualityData(DescribeTRTCMarketQualityDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTRTCMarketQualityData", DescribeTRTCMarketQualityDataResponse.class);
    }

    /**
     *Query TRTC Monitoring Dashboard - Data Dashboard Scale Metrics (will return userCount, roomCount, peakCurrentUsers, peakCurrentChannels)
- userCount: number of users in the call,
- roomCount: number of rooms in the call, counted as one call channel from the time a user joins the channel to the time all users leave the channel.
- peakCurrentChannels: peak number of channels online at the same time.
- peakCurrentUsers: peak number of users online at the same time.
Note:
1. To call the interface, you need to activate the monitoring dashboard Standard Edition and Premium Edition, the monitoring dashboard Free Edition does not support calling, for monitoring dashboard version features and billing overview: https://trtc.io/document/54481.
2. The query time range depends on the monitoring dashboard function version, premium edition can query up to 60 days.
     * @param req DescribeTRTCMarketScaleDataRequest
     * @return DescribeTRTCMarketScaleDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTRTCMarketScaleDataResponse DescribeTRTCMarketScaleData(DescribeTRTCMarketScaleDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTRTCMarketScaleData", DescribeTRTCMarketScaleDataResponse.class);
    }

    /**
     *Query TRTC Monitoring Dashboard - Real-Time Monitoring Quality Metrics (return the following metrics)
 -Video stutter rate
 -Audio stutter rate
 Note:
 1. To call the API, you need to activate the Monitoring Dashboard Standard Edition and Premium Edition. The Monitoring Dashboard Free Edition does not support calling. For monitoring dashboard version features and billing overview, please visit: https://trtc.io/document/54481.
 2. The query time range depends on the monitoring dashboard function version. The premium edition can query up to 1 hours
     * @param req DescribeTRTCRealTimeQualityDataRequest
     * @return DescribeTRTCRealTimeQualityDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTRTCRealTimeQualityDataResponse DescribeTRTCRealTimeQualityData(DescribeTRTCRealTimeQualityDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTRTCRealTimeQualityData", DescribeTRTCRealTimeQualityDataResponse.class);
    }

    /**
     *Query TRTC Monitoring Dashboard - Real-Time Monitoring Scale Metrics (the following metrics will be returned) -userCount (Online users) -roomCount (Online rooms) Note: 1. To call the interface, you need to activate the monitoring dashboard Standard Edition and Premium Edition, the monitoring dashboard Free Edition does not support calling. For monitoring dashboard version features and billing overview, please visit: https://trtc.io/document/54481. 2. The query time range depends on the function version of the monitoring dashboard. The premium edition can query the last 1 hours
     * @param req DescribeTRTCRealTimeScaleDataRequest
     * @return DescribeTRTCRealTimeScaleDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTRTCRealTimeScaleDataResponse DescribeTRTCRealTimeScaleData(DescribeTRTCRealTimeScaleDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTRTCRealTimeScaleData", DescribeTRTCRealTimeScaleDataResponse.class);
    }

    /**
     *This API is used to query usage data grouped by room.
- The queried period cannot exceed 24 hours. If the period spans two different days, the data returned may not be accurate due to a delay in data collection. You can make multiple calls to query the usage on different days.
- You can use this API to query your historical usage or to reconcile data, but we do not recommend you use it for crucial business logic.
- The rate limit of this API is one call every 15 seconds.
     * @param req DescribeTrtcRoomUsageRequest
     * @return DescribeTrtcRoomUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrtcRoomUsageResponse DescribeTrtcRoomUsage(DescribeTrtcRoomUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrtcRoomUsage", DescribeTrtcRoomUsageResponse.class);
    }

    /**
     *This API is used to query your TRTC audio/video duration.
- If the period queried is one day or shorter, the statistics returned are on a five-minute basis. If the period queried is longer than one day, the statistics returned are on a daily basis.
- The period queried per request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- You can use this API to query your historical usage or to reconcile data, but we do not recommend you use it for crucial business logic.
- The rate limit of this API is five calls per second.
     * @param req DescribeTrtcUsageRequest
     * @return DescribeTrtcUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrtcUsageResponse DescribeTrtcUsage(DescribeTrtcUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrtcUsage", DescribeTrtcUsageResponse.class);
    }

    /**
     *This API (the old `DescribeAbnormalEvent`) is used to query up to 20 random abnormal user experiences of an application (`SDKAppID`) in the last 14 days. The start and end time can be on two different days, but they cannot be more than one hour apart.
For details about the error events, see https://intl.cloud.tencent.com/document/product/647/44916?from_cn_redirect=1
**Note**:
1. You can use this API to query historical data or for reconciliation purposes, but we do not recommend you use it for crucial business logic.
2. If you need to call this API, please upgrade the monitoring dashboard version to "Standard". For more details, please refer to: https://www.tencentcloud.com/document/product/647/54481.
     * @param req DescribeUnusualEventRequest
     * @return DescribeUnusualEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnusualEventResponse DescribeUnusualEvent(DescribeUnusualEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnusualEvent", DescribeUnusualEventResponse.class);
    }

    /**
     *This API (the old `DescribeDetailEvent`) is used to query the events of a call in the last 14 days, including user entry and exit, turning the camera on/off, etc.
**Note**:
1. You can use this API to query historical data or for reconciliation purposes, but we do not recommend you use it for crucial business logic.
2. If you need to call this API, please upgrade the monitoring dashboard version to "Standard". For more details, please refer to: https://trtc.io/document/54481?product=pricing.
     * @param req DescribeUserEventRequest
     * @return DescribeUserEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserEventResponse DescribeUserEvent(DescribeUserEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserEvent", DescribeUserEventResponse.class);
    }

    /**
     *This API (the old `DescribeUserInformation`) is used to query the user list of a specified time range (up to four hours) in the last 14 days. The data of up to 100 users can be returned per page (six are returned by default).
**Note**:
1. You can use this API to query historical data or for reconciliation purposes, but we do not recommend you use it for crucial business logic.
2. If you need to call this API, please upgrade the monitoring dashboard version to "Standard". For more details, please refer to: https://trtc.io/document/60214?product=pricing.
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserInfo", DescribeUserInfoResponse.class);
    }

    /**
     *Queries the status of a web-page recording task
     * @param req DescribeWebRecordRequest
     * @return DescribeWebRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebRecordResponse DescribeWebRecord(DescribeWebRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebRecord", DescribeWebRecordResponse.class);
    }

    /**
     *This API is used to remove all users from a room and dismiss the room. It supports all platforms. For Android, iOS, Windows, and macOS, the TRTC SDK needs to be upgraded to v6.6 or above.
     * @param req DismissRoomRequest
     * @return DismissRoomResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomResponse DismissRoom(DismissRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DismissRoom", DismissRoomResponse.class);
    }

    /**
     *This API is used to remove all users from a room and close the room. It works on all platforms. For Android, iOS, Windows, and macOS, you need to update the TRTC SDK to version 6.6 or above.
     * @param req DismissRoomByStrRoomIdRequest
     * @return DismissRoomByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomByStrRoomIdResponse DismissRoomByStrRoomId(DismissRoomByStrRoomIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DismissRoomByStrRoomId", DismissRoomByStrRoomIdResponse.class);
    }

    /**
     *This API is used to update the subscription blocklist and allowlist after the cloud moderation task is successfully started.
     * @param req ModifyCloudModerationRequest
     * @return ModifyCloudModerationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudModerationResponse ModifyCloudModeration(ModifyCloudModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudModeration", ModifyCloudModerationResponse.class);
    }

    /**
     *This API is used to modify a recording task. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned. You need to specify all the parameters for each request instead of just the ones you want to modify.
     * @param req ModifyCloudRecordingRequest
     * @return ModifyCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudRecordingResponse ModifyCloudRecording(ModifyCloudRecordingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudRecording", ModifyCloudRecordingResponse.class);
    }

    /**
     *This API is used to update the slicing task after it is started. It can be used to update the allowlist or blocklist for the specified subscription stream.
     * @param req ModifyCloudSliceTaskRequest
     * @return ModifyCloudSliceTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudSliceTaskResponse ModifyCloudSliceTask(ModifyCloudSliceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudSliceTask", ModifyCloudSliceTaskResponse.class);
    }

    /**
     *This API is used to remove a user from a room. It is applicable to scenarios where the anchor, room owner, or admin wants to kick out a user. It supports all platforms. For Android, iOS, Windows, and macOS, the TRTC SDK needs to be upgraded to v6.6 or above.
     * @param req RemoveUserRequest
     * @return RemoveUserResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserResponse RemoveUser(RemoveUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveUser", RemoveUserResponse.class);
    }

    /**
     *This API is used to remove a user from a room. It allows the anchor, room owner, or admin to kick out a user, and works on all platforms. For Android, iOS, Windows, and macOS, you need to update the TRTC SDK to version 6.6 or above.
     * @param req RemoveUserByStrRoomIdRequest
     * @return RemoveUserByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserByStrRoomIdResponse RemoveUserByStrRoomId(RemoveUserByStrRoomIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveUserByStrRoomId", RemoveUserByStrRoomIdResponse.class);
    }

    /**
     *This API is used to disable or enable the audio and video of a user. It can be used by an anchor, room owner, or admin to block or unblock a user. It supports platforms including Android, iOS, Windows, macOS, web, and WeChat Mini Program. Use this API if the room ID is a number.
     * @param req SetUserBlockedRequest
     * @return SetUserBlockedResponse
     * @throws TencentCloudSDKException
     */
    public SetUserBlockedResponse SetUserBlocked(SetUserBlockedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetUserBlocked", SetUserBlockedResponse.class);
    }

    /**
     *This API allows an anchor, room owner, admin to mute/unmute a user. It can be used on platforms including Android, iOS, Windows, macOS, web, and WeChat Mini Program. Use this API when the room ID is a string.
     * @param req SetUserBlockedByStrRoomIdRequest
     * @return SetUserBlockedByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public SetUserBlockedByStrRoomIdResponse SetUserBlockedByStrRoomId(SetUserBlockedByStrRoomIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetUserBlockedByStrRoomId", SetUserBlockedByStrRoomIdResponse.class);
    }

    /**
     *Initiate AI conversation task, where the AI bot enters the TRTC room to engage in AI conversation with specified members in the room. This is suitable for scenarios such as intelligent customer service and AI language teachers. The TRTC AI conversation feature has built-in speech-to-text capabilities , allowing customers to flexibly specify third-party AI model (LLM) services and text-to-speech (TTS) services. For more [feature details](https://cloud.tencent.com/document/product/647/108901).
     * @param req StartAIConversationRequest
     * @return StartAIConversationResponse
     * @throws TencentCloudSDKException
     */
    public StartAIConversationResponse StartAIConversation(StartAIConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAIConversation", StartAIConversationResponse.class);
    }

    /**
     *Initiate the transcription bot. The backend will pull the stream through the bot to perform real-time speech recognition and deliver subtitles and transcription messages. The transcription bot supports two stream pulling modes, controlled by the `TranscriptionMode` field:
- Pull the stream of the entire room.
- Pull the stream of a specific user.

The server delivers subtitles and transcription messages in real-time through TRTC's custom messages, with `CmdId` fixed at 1. The client only needs to listen for the callback of custom messages. For example, see the [C++ callback](https://cloud.tencent.com/document/product/647/79637#4cd82f4edb24992a15a25187089e1565). Other clients, such as Android, Web, etc., can also be found at the same link.
     * @param req StartAITranscriptionRequest
     * @return StartAITranscriptionResponse
     * @throws TencentCloudSDKException
     */
    public StartAITranscriptionResponse StartAITranscription(StartAITranscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAITranscription", StartAITranscriptionResponse.class);
    }

    /**
     ***API Description**

This API starts a stream mixing and relaying task. This API mixes multiple audio/video streams from a TRTC room into a single stream, encodes it, and then pushes it to CDN server or publishs it into the TRTC room. It also supports relaying a single stream from a TRTC room directly without transcoding.

After success, the API returns a globally unique TaskID. You will need this TaskId in later operations such as updating or stopping the task.

For more details, refer to the document:  [Feature Description](https://trtc.io/zh/document/47858?product=rtcengine ) and [FAQs](https://trtc.io/zh/document/36058?product=rtcengine&menulabel=core%20sdk&platform=web) .

Note: You can enable the relay to CDN in the console to monitor events under the CDN relay status. For callback details, see: [Relay to CDN Callback Description](https://trtc.io/zh/document/54913?product=rtcengine&menulabel=core%20sdk&platform=web ) .

Starting a relay task may incur the following fees:
MCU stream mixing and transcoding fees: [See Cloud Stream Mixing and Transcoding Pricing](https://trtc.io/zh/document/47631 ) .
     * @param req StartPublishCdnStreamRequest
     * @return StartPublishCdnStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishCdnStreamResponse StartPublishCdnStream(StartPublishCdnStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishCdnStream", StartPublishCdnStreamResponse.class);
    }

    /**
     *Push an online media stream to the TRTC room.
     * @param req StartStreamIngestRequest
     * @return StartStreamIngestResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamIngestResponse StartStreamIngest(StartStreamIngestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStreamIngest", StartStreamIngestResponse.class);
    }

    /**
     *This interface can be used to initiate a web-page recording task. In the interface parameters, specify the recording URL, recording resolution, recording result storage and other parameters. If there are parameter or API logic problems, the result will be returned immediately. If there are page problems, such as the page cannot be accessed, the result will be returned in the callback. Please pay attention.
     * @param req StartWebRecordRequest
     * @return StartWebRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartWebRecordResponse StartWebRecord(StartWebRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartWebRecord", StartWebRecordResponse.class);
    }

    /**
     *Stop AI conversation task
     * @param req StopAIConversationRequest
     * @return StopAIConversationResponse
     * @throws TencentCloudSDKException
     */
    public StopAIConversationResponse StopAIConversation(StopAIConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAIConversation", StopAIConversationResponse.class);
    }

    /**
     *Stop AI Transcription task
     * @param req StopAITranscriptionRequest
     * @return StopAITranscriptionResponse
     * @throws TencentCloudSDKException
     */
    public StopAITranscriptionResponse StopAITranscription(StopAITranscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAITranscription", StopAITranscriptionResponse.class);
    }

    /**
     *This API is used to stop a relaying task.
You can create a relay task before the anchor enters the room. When the relay task is finished, you need to call the stop interface actively. If you do not call the Stop Relay Task Interface, Tencent Cloud will automatically stop the mix relay task when all users participating in the mix have no data uploaded for a period of time exceeding the timeout (AgentParams.MaxIdleTime) set when starting the relay task.
     * @param req StopPublishCdnStreamRequest
     * @return StopPublishCdnStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishCdnStreamResponse StopPublishCdnStream(StopPublishCdnStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPublishCdnStream", StopPublishCdnStreamResponse.class);
    }

    /**
     *Stop a Pull stream Relay task.
     * @param req StopStreamIngestRequest
     * @return StopStreamIngestResponse
     * @throws TencentCloudSDKException
     */
    public StopStreamIngestResponse StopStreamIngest(StopStreamIngestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopStreamIngest", StopStreamIngestResponse.class);
    }

    /**
     *Stop an web-page recording task
     * @param req StopWebRecordRequest
     * @return StopWebRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopWebRecordResponse StopWebRecord(StopWebRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopWebRecord", StopWebRecordResponse.class);
    }

    /**
     *Update AI conversation task parameters
     * @param req UpdateAIConversationRequest
     * @return UpdateAIConversationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAIConversationResponse UpdateAIConversation(UpdateAIConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAIConversation", UpdateAIConversationResponse.class);
    }

    /**
     *This API is used to change the parameters of a relaying task.
Note: For details about how to use this API, see the `StartPublishCdnStream` document.
     * @param req UpdatePublishCdnStreamRequest
     * @return UpdatePublishCdnStreamResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePublishCdnStreamResponse UpdatePublishCdnStream(UpdatePublishCdnStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePublishCdnStream", UpdatePublishCdnStreamResponse.class);
    }

    /**
     *You can update the StreamUrl of the Relay task.
     * @param req UpdateStreamIngestRequest
     * @return UpdateStreamIngestResponse
     * @throws TencentCloudSDKException
     */
    public UpdateStreamIngestResponse UpdateStreamIngest(UpdateStreamIngestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateStreamIngest", UpdateStreamIngestResponse.class);
    }

}
