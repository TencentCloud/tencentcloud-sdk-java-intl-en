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
package com.tencentcloudapi.live.v20180801;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.live.v20180801.models.*;

public class LiveClient extends AbstractClient{
    private static String endpoint = "live.tencentcloudapi.com";
    private static String service = "live";
    private static String version = "2018-08-01";
    
    public LiveClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LiveClient(Credential credential, String region, ClientProfile profile) {
        super(LiveClient.endpoint, LiveClient.version, credential, region, profile);
    }

    /**
     *This API is used to set a delay in playing the images of large live streaming events, in case of emergencies.

Note: if you are to set the delay before stream push, set it at least 5 minutes before the push. This API supports configuration only by stream.
     * @param req AddDelayLiveStreamRequest
     * @return AddDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public AddDelayLiveStreamResponse AddDelayLiveStream(AddDelayLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDelayLiveStream", AddDelayLiveStreamResponse.class);
    }

    /**
     *This API is used to add a domain name. Only one domain name can be submitted at a time, and it must have an ICP filing.
     * @param req AddLiveDomainRequest
     * @return AddLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveDomainResponse AddLiveDomain(AddLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLiveDomain", AddLiveDomainResponse.class);
    }

    /**
     *After a watermark is added and a watermark ID is successfully returned, you need to call the [CreateLiveWatermarkRule](https://intl.cloud.tencent.com/document/product/267/32629?from_cn_redirect=1) API to bind the watermark ID to a stream.
After the number of watermarks exceeds the upper limit of 100, to add a new watermark, you must delete an old one first.
     * @param req AddLiveWatermarkRequest
     * @return AddLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveWatermarkResponse AddLiveWatermark(AddLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLiveWatermark", AddLiveWatermarkResponse.class);
    }

    /**
     *This API is used to verify the ownership of a domain.
     * @param req AuthenticateDomainOwnerRequest
     * @return AuthenticateDomainOwnerResponse
     * @throws TencentCloudSDKException
     */
    public AuthenticateDomainOwnerResponse AuthenticateDomainOwner(AuthenticateDomainOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthenticateDomainOwner", AuthenticateDomainOwnerResponse.class);
    }

    /**
     *This API is used to cancel a stream mix. It can be used basically in the same way as `mix_streamv2.cancel_mix_stream`.
     * @param req CancelCommonMixStreamRequest
     * @return CancelCommonMixStreamResponse
     * @throws TencentCloudSDKException
     */
    public CancelCommonMixStreamResponse CancelCommonMixStream(CancelCommonMixStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelCommonMixStream", CancelCommonMixStreamResponse.class);
    }

    /**
     *This API is used to create a general stream mix. It can be used basically in the same way as the legacy `mix_streamv2.start_mix_stream_advanced` API.
Note: currently, up to 16 streams can be mixed.
Best practice: https://intl.cloud.tencent.com/document/product/267/45566?from_cn_redirect=1
     * @param req CreateCommonMixStreamRequest
     * @return CreateCommonMixStreamResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommonMixStreamResponse CreateCommonMixStream(CreateCommonMixStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCommonMixStream", CreateCommonMixStreamResponse.class);
    }

    /**
     *To create a callback rule, you need to first call the [CreateLiveCallbackTemplate](https://intl.cloud.tencent.com/document/product/267/32637?from_cn_redirect=1) API to create a callback template and bind the returned template ID to the domain name/path.
<br>Callback protocol-related document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param req CreateLiveCallbackRuleRequest
     * @return CreateLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackRuleResponse CreateLiveCallbackRule(CreateLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveCallbackRule", CreateLiveCallbackRuleResponse.class);
    }

    /**
     *This API is used to create a callback template. Up to 50 templates can be created. After the template ID is returned, you need to call the [CreateLiveCallbackRule](https://intl.cloud.tencent.com/document/product/267/32638?from_cn_redirect=1) API to bind the template ID to a domain name/path.
<br>For information about callback protocols, see [How to Receive Event Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
Note: You need to specify at least one callback URL.
     * @param req CreateLiveCallbackTemplateRequest
     * @return CreateLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackTemplateResponse CreateLiveCallbackTemplate(CreateLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveCallbackTemplate", CreateLiveCallbackTemplateResponse.class);
    }

    /**
     *This API is used to create a task to pull streams from video files or an external live streaming source and publish them to a specified destination URL.
Notes:
1. By default, you can have at most 20 stream pulling tasks at a time. You can submit a ticket to raise the limit.
2. Only H.264 and H.265 are supported for video. If the source video is in a different format, please transcode it first.
3. Only AAC is supported for audio. If the source audio is in a different format, please transcode it first.
4. You can enable auto deletion in the console to delete expired tasks automatically.
5. The pull and relay feature is a paid feature. For its billing details, see [Relay](https://intl.cloud.tencent.com/document/product/267/53308?from_cn_redirect=1).
6. CSS is only responsible for pulling and relaying content. Please make sure that your content is authorized and complies with relevant laws and regulations. In case of copyright infringement or violation of laws or regulations, CSS will suspend its service for you and reserves the right to seek legal remedies.
     * @param req CreateLivePullStreamTaskRequest
     * @return CreateLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLivePullStreamTaskResponse CreateLivePullStreamTask(CreateLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLivePullStreamTask", CreateLivePullStreamTaskResponse.class);
    }

    /**
     *- Prerequisites
  1. Recording files are stored on the VOD platform, so if you need to use the recording feature, you must first activate the VOD service.
  2. After the recording files are stored, applicable fees (including storage fees and downstream playback traffic fees) will be charged according to the VOD billing mode. For more information, please see the [corresponding document](https://intl.cloud.tencent.com/document/product/266/2838?from_cn_redirect=1).

- Mode description
  This API supports two recording modes:
  1. Scheduled recording mode **(default mode)**.
    The start time and end time need to be passed in, according to which the recording task will start and end automatically. Before the set end time expires (provided that `StopLiveRecord` is not called to terminate the task prematurely), the recording task is valid and will be started even after the push is interrupted and restarted multiple times.
  2. Real-time video recording mode.
    The start time passed in will be ignored, and recording will be started immediately after the recording task is created. The recording duration can be up to 30 minutes. If the end time passed in is more than 30 minutes after the current time, it will be counted as 30 minutes. Real-time video recording is mainly used for recording highlight scenes, and you are recommended to keep the duration within 5 minutes.

- Precautions
  1. The API call timeout period should be set to more than 3 seconds; otherwise, retries and calls by different start/end time values may result in repeated recording tasks and thus incur additional recording fees.
  2. Subject to the audio and video file formats (FLV/MP4/HLS), the video codec of H.264 and audio codec of AAC are supported.
  3. In order to avoid malicious or unintended frequent API requests, the maximum number of tasks that can be created in scheduled recording mode is limited: up to 4,000 tasks can be created per day (excluding deleted ones), and up to 400 ones can run concurrently. If you need a higher upper limit, please submit a ticket for application.
  4. This calling method does not support recording streams outside Mainland China for the time being.
     * @param req CreateLiveRecordRequest
     * @return CreateLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordResponse CreateLiveRecord(CreateLiveRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveRecord", CreateLiveRecordResponse.class);
    }

    /**
     *To create a recording rule, you need to first call the [CreateLiveRecordTemplate](https://intl.cloud.tencent.com/document/product/267/32614?from_cn_redirect=1) API to create a recording template and bind the returned template ID to the stream.
<br>Recording-related document: [LVB Recording](https://intl.cloud.tencent.com/document/product/267/32739?from_cn_redirect=1).
     * @param req CreateLiveRecordRuleRequest
     * @return CreateLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordRuleResponse CreateLiveRecordRule(CreateLiveRecordRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveRecordRule", CreateLiveRecordRuleResponse.class);
    }

    /**
     *This API is used to create a recording template. You can create up to 50 templates. To use a template, you need to call the [CreateLiveRecordRule](https://intl.cloud.tencent.com/document/product/267/32615?from_cn_redirect=1) API to bind the template ID returned by this API to a stream.
<br>More on recording: [Live Recording](https://intl.cloud.tencent.com/document/product/267/32739?from_cn_redirect=1)
     * @param req CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordTemplateResponse CreateLiveRecordTemplate(CreateLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveRecordTemplate", CreateLiveRecordTemplateResponse.class);
    }

    /**
     *This API is used to create a screencapturing rule. You need to first call the [CreateLiveSnapshotTemplate](https://intl.cloud.tencent.com/document/product/267/32624?from_cn_redirect=1) API to create a screencapturing template to bind the returned template ID to the stream.
<br>Screencapturing document: [LVB Screencapturing](https://intl.cloud.tencent.com/document/product/267/32737?from_cn_redirect=1).
Note: only one screencapturing template can be associated with one domain name.
     * @param req CreateLiveSnapshotRuleRequest
     * @return CreateLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotRuleResponse CreateLiveSnapshotRule(CreateLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveSnapshotRule", CreateLiveSnapshotRuleResponse.class);
    }

    /**
     *This API is used to create a screencapture template. After a template ID is returned, you need to call the [CreateLiveSnapshotRule](https://intl.cloud.tencent.com/document/product/267/32625?from_cn_redirect=1) API to bind the template ID to a stream. You can create up to 50 screencapture templates.
<br>To learn more about the live screencapture feature, see [Live Screencapture](https://intl.cloud.tencent.com/document/product/267/32737?from_cn_redirect=1).
     * @param req CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotTemplateResponse CreateLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveSnapshotTemplate", CreateLiveSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to create a time shifting rule. You need to first call the [CreateLiveTranscodeTemplate](https://intl.cloud.tencent.com/document/product/267/86169?from_cn_redirect=1) API to create a time shifting template, and then call this API to bind the template ID returned to a stream.
<br>More about time shifting: [Time Shifting](https://intl.cloud.tencent.com/document/product/267/86134?from_cn_redirect=1).
     * @param req CreateLiveTimeShiftRuleRequest
     * @return CreateLiveTimeShiftRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTimeShiftRuleResponse CreateLiveTimeShiftRule(CreateLiveTimeShiftRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTimeShiftRule", CreateLiveTimeShiftRuleResponse.class);
    }

    /**
     *This API is used to create a time shifting template.
     * @param req CreateLiveTimeShiftTemplateRequest
     * @return CreateLiveTimeShiftTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTimeShiftTemplateResponse CreateLiveTimeShiftTemplate(CreateLiveTimeShiftTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTimeShiftTemplate", CreateLiveTimeShiftTemplateResponse.class);
    }

    /**
     *This API is used to create a transcoding rule that binds a template ID to a stream. Up to 50 transcoding rules can be created in total. Before you call this API, you need to first call [CreateLiveTranscodeTemplate](https://intl.cloud.tencent.com/document/product/267/32646?from_cn_redirect=1) to get the template ID.
<br>Related document: [Live Remuxing and Transcoding](https://intl.cloud.tencent.com/document/product/267/32736?from_cn_redirect=1).
     * @param req CreateLiveTranscodeRuleRequest
     * @return CreateLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeRuleResponse CreateLiveTranscodeRule(CreateLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTranscodeRule", CreateLiveTranscodeRuleResponse.class);
    }

    /**
     *This API is used to create a transcoding template. Up to 50 transcoding templates can be created in total. To use a template, you need to call [CreateLiveTranscodeRule](https://intl.cloud.tencent.com/document/product/267/32647?from_cn_redirect=1) to bind the template ID returned by this API to a stream.
<br>For more information about transcoding, see [Live Remuxing and Transcoding](https://intl.cloud.tencent.com/document/product/267/32736?from_cn_redirect=1).
     * @param req CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeTemplateResponse CreateLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveTranscodeTemplate", CreateLiveTranscodeTemplateResponse.class);
    }

    /**
     *To create a watermarking rule, you need to first call the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API to add a watermark and bind the returned watermark ID to the stream.
     * @param req CreateLiveWatermarkRuleRequest
     * @return CreateLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveWatermarkRuleResponse CreateLiveWatermarkRule(CreateLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLiveWatermarkRule", CreateLiveWatermarkRuleResponse.class);
    }

    /**
     *This API is used to create a recording task that starts and ends at specific times and records videos according to a specific recording template.
- Prerequisites
1. Because recording files are saved in VOD, you must first activate VOD.
2. Storage and playback traffic fees are charged for storing and playing the videos recorded. For details, see [Purchase Guide](https://intl.cloud.tencent.com/document/product/266/2837).
- Notes
1. If streaming is interrupted, the current recording will stop and a recording file will be generated. When streaming resumes, as long as it’s before the end time of the task, recording will start again.
2. Avoid creating recording tasks with overlapping time periods. If there are multiple tasks with overlapping time periods for the same stream, the system will start three recording tasks at most to avoid repeated recording.
3. Task records are kept for three months by the platform.
4. Do not use the new [CreateRecordTask](https://intl.cloud.tencent.com/document/product/267/45983?from_cn_redirect=1), [StopRecordTask](https://intl.cloud.tencent.com/document/product/267/45981?from_cn_redirect=1), and [DeleteRecordTask] APIs together with the old `CreateLiveRecord`, `StopLiveRecord`, and `DeleteLiveRecord` APIs.
5. Do not create recording tasks and push streams at the same time. After creating a recording task, we recommend you wait at least three seconds before pushing streams.
     * @param req CreateRecordTaskRequest
     * @return CreateRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordTaskResponse CreateRecordTask(CreateRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordTask", CreateRecordTaskResponse.class);
    }

    /**
     *This API is used to create a screencapturing task that has a specific start and end time and takes screenshots according to the template configured.
- Note
1. If the stream is interrupted, screencapturing will stop. However, the task will still be valid before the specified end time, and screencapturing will be performed as required after the stream is resumed.
2. Avoid creating screencapturing tasks with overlapping time periods. The system will execute at most three screencapturing tasks on the same stream at a time.
3. Task records are only kept for three months.
4. The new screencapturing APIs (CreateScreenshotTask/StopScreenshotTask/DeleteScreenshotTask) are not compatible with the legacy ones (CreateLiveInstantSnapshot/StopLiveInstantSnapshot). Do not mix them when you call APIs to manage screencapturing tasks.
5. If you create a screencapturing task and publish the stream at the same time, the task may fail to be executed at the specified time. After creating a screencapturing task, we recommend you wait at least three seconds before publishing the stream.
     * @param req CreateScreenshotTaskRequest
     * @return CreateScreenshotTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScreenshotTaskResponse CreateScreenshotTask(CreateScreenshotTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScreenshotTask", CreateScreenshotTaskResponse.class);
    }

    /**
     *This API is used to delete a callback rule.
     * @param req DeleteLiveCallbackRuleRequest
     * @return DeleteLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackRuleResponse DeleteLiveCallbackRule(DeleteLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveCallbackRule", DeleteLiveCallbackRuleResponse.class);
    }

    /**
     *This API deletes a callback template.
     * @param req DeleteLiveCallbackTemplateRequest
     * @return DeleteLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackTemplateResponse DeleteLiveCallbackTemplate(DeleteLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveCallbackTemplate", DeleteLiveCallbackTemplateResponse.class);
    }

    /**
     *This API is used to delete an added LVB domain name.
     * @param req DeleteLiveDomainRequest
     * @return DeleteLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveDomainResponse DeleteLiveDomain(DeleteLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveDomain", DeleteLiveDomainResponse.class);
    }

    /**
     *This API is used to delete a task created by `CreateLivePullStreamTask`.
Notes:
1. For the `TaskId` request parameter, pass in the task ID returned by the `CreateLivePullStreamTask` API.
2. You can query the ID of a task using the `DescribeLivePullStreamTasks` API.
     * @param req DeleteLivePullStreamTaskRequest
     * @return DeleteLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLivePullStreamTaskResponse DeleteLivePullStreamTask(DeleteLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLivePullStreamTask", DeleteLivePullStreamTaskResponse.class);
    }

    /**
     *Note: The `DeleteLiveRecord` API is only used to delete the record of recording tasks but not stop recording or deleting an ongoing recording task. If you need to stop a recording task, please use the [StopLiveRecord](https://intl.cloud.tencent.com/document/product/267/30146?from_cn_redirect=1) API.
     * @param req DeleteLiveRecordRequest
     * @return DeleteLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordResponse DeleteLiveRecord(DeleteLiveRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveRecord", DeleteLiveRecordResponse.class);
    }

    /**
     *This API is used to delete a recording rule.
     * @param req DeleteLiveRecordRuleRequest
     * @return DeleteLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordRuleResponse DeleteLiveRecordRule(DeleteLiveRecordRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveRecordRule", DeleteLiveRecordRuleResponse.class);
    }

    /**
     *This API is used to delete a recording template.
     * @param req DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordTemplateResponse DeleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveRecordTemplate", DeleteLiveRecordTemplateResponse.class);
    }

    /**
     *This API is used to delete a screencapturing rule.
     * @param req DeleteLiveSnapshotRuleRequest
     * @return DeleteLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotRuleResponse DeleteLiveSnapshotRule(DeleteLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveSnapshotRule", DeleteLiveSnapshotRuleResponse.class);
    }

    /**
     *This API is used to delete a screencapturing template.
     * @param req DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotTemplateResponse DeleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveSnapshotTemplate", DeleteLiveSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to delete a time shifting rule.
     * @param req DeleteLiveTimeShiftRuleRequest
     * @return DeleteLiveTimeShiftRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTimeShiftRuleResponse DeleteLiveTimeShiftRule(DeleteLiveTimeShiftRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTimeShiftRule", DeleteLiveTimeShiftRuleResponse.class);
    }

    /**
     *This API is used to delete a time shifting template.
     * @param req DeleteLiveTimeShiftTemplateRequest
     * @return DeleteLiveTimeShiftTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTimeShiftTemplateResponse DeleteLiveTimeShiftTemplate(DeleteLiveTimeShiftTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTimeShiftTemplate", DeleteLiveTimeShiftTemplateResponse.class);
    }

    /**
     *This API is used to delete a transcoding rule.
`DomainName+AppName+StreamName+TemplateId` uniquely identifies a single transcoding rule. If you need to delete it, strong match is required. `TemplateId` is required. Even if other parameters are empty, you still need to pass in an empty string to make a strong match.
     * @param req DeleteLiveTranscodeRuleRequest
     * @return DeleteLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeRuleResponse DeleteLiveTranscodeRule(DeleteLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTranscodeRule", DeleteLiveTranscodeRuleResponse.class);
    }

    /**
     *This API is used to delete a transcoding template.
     * @param req DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeTemplateResponse DeleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveTranscodeTemplate", DeleteLiveTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to delete a watermark.
     * @param req DeleteLiveWatermarkRequest
     * @return DeleteLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkResponse DeleteLiveWatermark(DeleteLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveWatermark", DeleteLiveWatermarkResponse.class);
    }

    /**
     *This API is used to delete a watermarking rule.
     * @param req DeleteLiveWatermarkRuleRequest
     * @return DeleteLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkRuleResponse DeleteLiveWatermarkRule(DeleteLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLiveWatermarkRule", DeleteLiveWatermarkRuleResponse.class);
    }

    /**
     *This API is used to delete a recording task configuration. The deletion does not affect running tasks and takes effect only for new pushes.
     * @param req DeleteRecordTaskRequest
     * @return DeleteRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTaskResponse DeleteRecordTask(DeleteRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordTask", DeleteRecordTaskResponse.class);
    }

    /**
     *This API is used to get the playback data of all streams at a specified time point (accurate to the minute).
     * @param req DescribeAllStreamPlayInfoListRequest
     * @return DescribeAllStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllStreamPlayInfoListResponse DescribeAllStreamPlayInfoList(DescribeAllStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllStreamPlayInfoList", DescribeAllStreamPlayInfoListResponse.class);
    }

    /**
     *This API is used to query the data of billable LVB bandwidth and traffic.
     * @param req DescribeBillBandwidthAndFluxListRequest
     * @return DescribeBillBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillBandwidthAndFluxListResponse DescribeBillBandwidthAndFluxList(DescribeBillBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillBandwidthAndFluxList", DescribeBillBandwidthAndFluxListResponse.class);
    }

    /**
     *This API is used to query the number of concurrent recording channels, which is applicable to LCB and LVB.
     * @param req DescribeConcurrentRecordStreamNumRequest
     * @return DescribeConcurrentRecordStreamNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrentRecordStreamNumResponse DescribeConcurrentRecordStreamNum(DescribeConcurrentRecordStreamNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrentRecordStreamNum", DescribeConcurrentRecordStreamNumResponse.class);
    }

    /**
     *This API is used to query the billable bandwidth of live stream relaying in the last 3 months. The query period is up to 31 days.
     * @param req DescribeDeliverBandwidthListRequest
     * @return DescribeDeliverBandwidthListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliverBandwidthListResponse DescribeDeliverBandwidthList(DescribeDeliverBandwidthListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeliverBandwidthList", DescribeDeliverBandwidthListResponse.class);
    }

    /**
     *This API is used to query the downstream playback data by district and ISP.
     * @param req DescribeGroupProIspPlayInfoListRequest
     * @return DescribeGroupProIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupProIspPlayInfoListResponse DescribeGroupProIspPlayInfoList(DescribeGroupProIspPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupProIspPlayInfoList", DescribeGroupProIspPlayInfoListResponse.class);
    }

    /**
     *This API is used to query the number of each playback HTTP status code at a 5-minute granularity in a certain period of time.
Note: data can be queried one hour after it is generated. For example, data between 10:00 and 10:59 cannot be queried until 12:00.
     * @param req DescribeHttpStatusInfoListRequest
     * @return DescribeHttpStatusInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHttpStatusInfoListResponse DescribeHttpStatusInfoList(DescribeHttpStatusInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHttpStatusInfoList", DescribeHttpStatusInfoListResponse.class);
    }

    /**
     *This API is used to get the callback rule list.
     * @param req DescribeLiveCallbackRulesRequest
     * @return DescribeLiveCallbackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackRulesResponse DescribeLiveCallbackRules(DescribeLiveCallbackRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCallbackRules", DescribeLiveCallbackRulesResponse.class);
    }

    /**
     *This API is used to get a single callback template.
     * @param req DescribeLiveCallbackTemplateRequest
     * @return DescribeLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplateResponse DescribeLiveCallbackTemplate(DescribeLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCallbackTemplate", DescribeLiveCallbackTemplateResponse.class);
    }

    /**
     *This API is used to get the callback template list.
     * @param req DescribeLiveCallbackTemplatesRequest
     * @return DescribeLiveCallbackTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplatesResponse DescribeLiveCallbackTemplates(DescribeLiveCallbackTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCallbackTemplates", DescribeLiveCallbackTemplatesResponse.class);
    }

    /**
     *This API is used to get certificate information.
     * @param req DescribeLiveCertRequest
     * @return DescribeLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertResponse DescribeLiveCert(DescribeLiveCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCert", DescribeLiveCertResponse.class);
    }

    /**
     *This API is used to get the certificate information list.
     * @param req DescribeLiveCertsRequest
     * @return DescribeLiveCertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertsResponse DescribeLiveCerts(DescribeLiveCertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveCerts", DescribeLiveCertsResponse.class);
    }

    /**
     *This API is used to get the list of delayed playbacks.
     * @param req DescribeLiveDelayInfoListRequest
     * @return DescribeLiveDelayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDelayInfoListResponse DescribeLiveDelayInfoList(DescribeLiveDelayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDelayInfoList", DescribeLiveDelayInfoListResponse.class);
    }

    /**
     *This API is used to query the LVB domain name information.
     * @param req DescribeLiveDomainRequest
     * @return DescribeLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainResponse DescribeLiveDomain(DescribeLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomain", DescribeLiveDomainResponse.class);
    }

    /**
     *This API is used to get the domain name certificate information.
     * @param req DescribeLiveDomainCertRequest
     * @return DescribeLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertResponse DescribeLiveDomainCert(DescribeLiveDomainCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainCert", DescribeLiveDomainCertResponse.class);
    }

    /**
     *This API is used to query domains bound with certificates.
     * @param req DescribeLiveDomainCertBindingsRequest
     * @return DescribeLiveDomainCertBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertBindingsResponse DescribeLiveDomainCertBindings(DescribeLiveDomainCertBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainCertBindings", DescribeLiveDomainCertBindingsResponse.class);
    }

    /**
     *This API is used to query referer allowlist/blocklist configuration of a live streaming domain name.
Referer information is included in HTTP requests. After you enable referer configuration, live streams using RTMP or WebRTC for playback will not authenticate the referer and can be played back normally. To make the referer configuration effective, the HTTP-FLV or HLS protocol is recommended for playback.
     * @param req DescribeLiveDomainRefererRequest
     * @return DescribeLiveDomainRefererResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainRefererResponse DescribeLiveDomainReferer(DescribeLiveDomainRefererRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomainReferer", DescribeLiveDomainRefererResponse.class);
    }

    /**
     *This API is used to query domain names by domain name status and type.
     * @param req DescribeLiveDomainsRequest
     * @return DescribeLiveDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainsResponse DescribeLiveDomains(DescribeLiveDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveDomains", DescribeLiveDomainsResponse.class);
    }

    /**
     *This API is used to get the list of disabled streams.

Note: this API is used for query only and should not be relied too much upon in important business scenarios.
     * @param req DescribeLiveForbidStreamListRequest
     * @return DescribeLiveForbidStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveForbidStreamListResponse DescribeLiveForbidStreamList(DescribeLiveForbidStreamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveForbidStreamList", DescribeLiveForbidStreamListResponse.class);
    }

    /**
     *This API is used to query the playback authentication key.
     * @param req DescribeLivePlayAuthKeyRequest
     * @return DescribeLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePlayAuthKeyResponse DescribeLivePlayAuthKey(DescribeLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePlayAuthKey", DescribeLivePlayAuthKeyResponse.class);
    }

    /**
     *This API is used to query the stream pulling tasks created by `CreateLivePullStreamTask`.
The tasks returned are sorted by last updated time in descending order.
     * @param req DescribeLivePullStreamTasksRequest
     * @return DescribeLivePullStreamTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePullStreamTasksResponse DescribeLivePullStreamTasks(DescribeLivePullStreamTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePullStreamTasks", DescribeLivePullStreamTasksResponse.class);
    }

    /**
     *This API is used to query the LVB push authentication key.
     * @param req DescribeLivePushAuthKeyRequest
     * @return DescribeLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePushAuthKeyResponse DescribeLivePushAuthKey(DescribeLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLivePushAuthKey", DescribeLivePushAuthKeyResponse.class);
    }

    /**
     *This API is used to get the list of recording rules.
     * @param req DescribeLiveRecordRulesRequest
     * @return DescribeLiveRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordRulesResponse DescribeLiveRecordRules(DescribeLiveRecordRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveRecordRules", DescribeLiveRecordRulesResponse.class);
    }

    /**
     *This API is used to get a single recording template.
     * @param req DescribeLiveRecordTemplateRequest
     * @return DescribeLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplateResponse DescribeLiveRecordTemplate(DescribeLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveRecordTemplate", DescribeLiveRecordTemplateResponse.class);
    }

    /**
     *This API is used to get the recording template list.
     * @param req DescribeLiveRecordTemplatesRequest
     * @return DescribeLiveRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplatesResponse DescribeLiveRecordTemplates(DescribeLiveRecordTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveRecordTemplates", DescribeLiveRecordTemplatesResponse.class);
    }

    /**
     *This API is used to get the screencapturing rule list.
     * @param req DescribeLiveSnapshotRulesRequest
     * @return DescribeLiveSnapshotRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotRulesResponse DescribeLiveSnapshotRules(DescribeLiveSnapshotRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveSnapshotRules", DescribeLiveSnapshotRulesResponse.class);
    }

    /**
     *This API is used to get a single screencapturing template.
     * @param req DescribeLiveSnapshotTemplateRequest
     * @return DescribeLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplateResponse DescribeLiveSnapshotTemplate(DescribeLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveSnapshotTemplate", DescribeLiveSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to get the screencapturing template list.
     * @param req DescribeLiveSnapshotTemplatesRequest
     * @return DescribeLiveSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplatesResponse DescribeLiveSnapshotTemplates(DescribeLiveSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveSnapshotTemplates", DescribeLiveSnapshotTemplatesResponse.class);
    }

    /**
     *This API is used to query stream push/interruption events.<br>

Notes:
1. This API is used to query stream push/interruption records, and should not be relied too much upon in important business scenarios.
2. You can use the `IsFilter` parameter of this API to filter and get required push records.
     * @param req DescribeLiveStreamEventListRequest
     * @return DescribeLiveStreamEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamEventListResponse DescribeLiveStreamEventList(DescribeLiveStreamEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamEventList", DescribeLiveStreamEventListResponse.class);
    }

    /**
     *This API is used to get the list of ongoing live streams. It queries the information of live streams after they are pushed successfully. 

Notes:
1. This API is used to query the list of active live streams only, and should not be relied too much upon in important business scenarios.
2. This API can query up to 20,000 streams. To query more streams, please contact our after-sales service team.

     * @param req DescribeLiveStreamOnlineListRequest
     * @return DescribeLiveStreamOnlineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineListResponse DescribeLiveStreamOnlineList(DescribeLiveStreamOnlineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamOnlineList", DescribeLiveStreamOnlineListResponse.class);
    }

    /**
     *This API is used to return the list of pushed streams. <br>
Note: Up to 10,000 entries can be queried per page. More data can be obtained by adjusting the query time range.
     * @param req DescribeLiveStreamPublishedListRequest
     * @return DescribeLiveStreamPublishedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPublishedListResponse DescribeLiveStreamPublishedList(DescribeLiveStreamPublishedListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamPublishedList", DescribeLiveStreamPublishedListResponse.class);
    }

    /**
     *This API is used to query the push information of all real-time streams, including client IP, server IP, frame rate, bitrate, domain name, and push start time.
     * @param req DescribeLiveStreamPushInfoListRequest
     * @return DescribeLiveStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPushInfoListResponse DescribeLiveStreamPushInfoList(DescribeLiveStreamPushInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamPushInfoList", DescribeLiveStreamPushInfoListResponse.class);
    }

    /**
     *This API is used to get the stream status, which may be active, inactive, or disabled.

Notes:
This API allows you to query the status of a stream in real time. Given external factors such as network jitter, note the following when you determine whether a host is online:
1. If possible, use your own logic of stream starting/stopping in a room, such as streaming signaling on the client and the online heartbeat of a host, to determine whether the host is online.
2. If your application does not provide the room management feature, use the following methods to determine whether a host is online:
2.1 Use the [live stream callback](https://intl.cloud.tencent.com/document/product/267/20388?from_cn_redirect=1).
2.2 Call [DescribeLiveStreamOnlineList](https://intl.cloud.tencent.com/document/api/267/20472?from_cn_redirect=1) on a regular basis (interval > 1 min).
2.3 Call this API.
2.4 A host is considered to be online if the result returned by any of the above methods indicates so. If an API call times out or a parsing error occurs, to minimize the impact on your business, CSS will also consider the host online.
     * @param req DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamStateResponse DescribeLiveStreamState(DescribeLiveStreamStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveStreamState", DescribeLiveStreamStateResponse.class);
    }

    /**
     *This API is used to query the time-shift video length, time-shift days, and total time-shift period of push domains. The data returned is on a five-minute basis. You can use it for reconciliation.
     * @param req DescribeLiveTimeShiftBillInfoListRequest
     * @return DescribeLiveTimeShiftBillInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftBillInfoListResponse DescribeLiveTimeShiftBillInfoList(DescribeLiveTimeShiftBillInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftBillInfoList", DescribeLiveTimeShiftBillInfoListResponse.class);
    }

    /**
     *This API is used to query time shifting rules.
     * @param req DescribeLiveTimeShiftRulesRequest
     * @return DescribeLiveTimeShiftRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftRulesResponse DescribeLiveTimeShiftRules(DescribeLiveTimeShiftRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftRules", DescribeLiveTimeShiftRulesResponse.class);
    }

    /**
     *This API is used to query time shifting templates.
     * @param req DescribeLiveTimeShiftTemplatesRequest
     * @return DescribeLiveTimeShiftTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTimeShiftTemplatesResponse DescribeLiveTimeShiftTemplates(DescribeLiveTimeShiftTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTimeShiftTemplates", DescribeLiveTimeShiftTemplatesResponse.class);
    }

    /**
     *This API is used to query the transcoding details of a particular day or a specific time period. Querying may fail if the amount of data queried is too large. In such cases, try shortening the time period.
     * @param req DescribeLiveTranscodeDetailInfoRequest
     * @return DescribeLiveTranscodeDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeDetailInfoResponse DescribeLiveTranscodeDetailInfo(DescribeLiveTranscodeDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeDetailInfo", DescribeLiveTranscodeDetailInfoResponse.class);
    }

    /**
     *This API is used to get the list of transcoding rules.
     * @param req DescribeLiveTranscodeRulesRequest
     * @return DescribeLiveTranscodeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeRulesResponse DescribeLiveTranscodeRules(DescribeLiveTranscodeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeRules", DescribeLiveTranscodeRulesResponse.class);
    }

    /**
     *This API is used to get a single transcoding template.
     * @param req DescribeLiveTranscodeTemplateRequest
     * @return DescribeLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplateResponse DescribeLiveTranscodeTemplate(DescribeLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeTemplate", DescribeLiveTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to get the transcoding template list.
     * @param req DescribeLiveTranscodeTemplatesRequest
     * @return DescribeLiveTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplatesResponse DescribeLiveTranscodeTemplates(DescribeLiveTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeTemplates", DescribeLiveTranscodeTemplatesResponse.class);
    }

    /**
     *This API is used to query transcoding usage. You can use it to query data in the past three months.
Notes:
If the start time and end time are on the same day, the data returned will be on a 5-minute basis.
If the start time and end time are not on the same day or if the data of specified domains is queried, the data returned will be on an hourly basis.
     * @param req DescribeLiveTranscodeTotalInfoRequest
     * @return DescribeLiveTranscodeTotalInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTotalInfoResponse DescribeLiveTranscodeTotalInfo(DescribeLiveTranscodeTotalInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveTranscodeTotalInfo", DescribeLiveTranscodeTotalInfoResponse.class);
    }

    /**
     *This API is used to get the information of a single watermark.
     * @param req DescribeLiveWatermarkRequest
     * @return DescribeLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkResponse DescribeLiveWatermark(DescribeLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveWatermark", DescribeLiveWatermarkResponse.class);
    }

    /**
     *This API is used to get the watermarking rule list.
     * @param req DescribeLiveWatermarkRulesRequest
     * @return DescribeLiveWatermarkRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkRulesResponse DescribeLiveWatermarkRules(DescribeLiveWatermarkRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveWatermarkRules", DescribeLiveWatermarkRulesResponse.class);
    }

    /**
     *This API is used to query the watermark list.
     * @param req DescribeLiveWatermarksRequest
     * @return DescribeLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarksResponse DescribeLiveWatermarks(DescribeLiveWatermarksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLiveWatermarks", DescribeLiveWatermarksResponse.class);
    }

    /**
     *This API is used to query the information of downstream playback error codes, i.e., the occurrences of each HTTP error code (4xx and 5xx) at a 1-minute granularity in a certain period of time.
     * @param req DescribePlayErrorCodeDetailInfoListRequest
     * @return DescribePlayErrorCodeDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeDetailInfoListResponse DescribePlayErrorCodeDetailInfoList(DescribePlayErrorCodeDetailInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlayErrorCodeDetailInfoList", DescribePlayErrorCodeDetailInfoListResponse.class);
    }

    /**
     *This API is used to query the information of downstream playback error codes.
     * @param req DescribePlayErrorCodeSumInfoListRequest
     * @return DescribePlayErrorCodeSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeSumInfoListResponse DescribePlayErrorCodeSumInfoList(DescribePlayErrorCodeSumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlayErrorCodeSumInfoList", DescribePlayErrorCodeSumInfoListResponse.class);
    }

    /**
     *This API is used to query the downstream playback data of a specified ISP in a specified district, including bandwidth, traffic, number of requests, and number of concurrent connections.
     * @param req DescribeProvinceIspPlayInfoListRequest
     * @return DescribeProvinceIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProvinceIspPlayInfoListResponse DescribeProvinceIspPlayInfoList(DescribeProvinceIspPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProvinceIspPlayInfoList", DescribeProvinceIspPlayInfoListResponse.class);
    }

    /**
     *This API is used to retrieve a list of recording tasks that were started and ended within a specified time range. 
- Prerequisites: 
1. This API is only used to query recording tasks created by the CreateRecordTask interface. 
2. It cannot retrieve recording tasks that have been deleted by the DeleteRecordTask interface or tasks that have expired (platform retains for 3 months).
     * @param req DescribeRecordTaskRequest
     * @return DescribeRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTaskResponse DescribeRecordTask(DescribeRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordTask", DescribeRecordTaskResponse.class);
    }

    /**
     *The API is used to query the number of screenshots as an LVB value-added service.
     * @param req DescribeScreenShotSheetNumListRequest
     * @return DescribeScreenShotSheetNumListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenShotSheetNumListResponse DescribeScreenShotSheetNumList(DescribeScreenShotSheetNumListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenShotSheetNumList", DescribeScreenShotSheetNumListResponse.class);
    }

    /**
     *This API is used to query the playback data of each stream at the day level, including the total traffic.
     * @param req DescribeStreamDayPlayInfoListRequest
     * @return DescribeStreamDayPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamDayPlayInfoListResponse DescribeStreamDayPlayInfoList(DescribeStreamDayPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamDayPlayInfoList", DescribeStreamDayPlayInfoListResponse.class);
    }

    /**
     *This API is used to query the playback data. It supports querying the playback details by stream name and aggregated data by playback domain name. Data in the last 4 minutes or so cannot be queried due to delay.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect.
     * @param req DescribeStreamPlayInfoListRequest
     * @return DescribeStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPlayInfoListResponse DescribeStreamPlayInfoList(DescribeStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPlayInfoList", DescribeStreamPlayInfoListResponse.class);
    }

    /**
     *This API is used to get the push data of a stream, including the audio/video frame rate, bitrate, elapsed time, and codec.
     * @param req DescribeStreamPushInfoListRequest
     * @return DescribeStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPushInfoListResponse DescribeStreamPushInfoList(DescribeStreamPushInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPushInfoList", DescribeStreamPushInfoListResponse.class);
    }

    /**
     *This API is used to query the time shifting details of a specific time period (up to 24 hours). You need to call `DescribeTimeShiftStreamList` first to get the request parameters of this API.
     * @param req DescribeTimeShiftRecordDetailRequest
     * @return DescribeTimeShiftRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeShiftRecordDetailResponse DescribeTimeShiftRecordDetail(DescribeTimeShiftRecordDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimeShiftRecordDetail", DescribeTimeShiftRecordDetailResponse.class);
    }

    /**
     *This API is used to query the time shifted streams in a specific time period (up to 24 hours).
     * @param req DescribeTimeShiftStreamListRequest
     * @return DescribeTimeShiftStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeShiftStreamListResponse DescribeTimeShiftStreamList(DescribeTimeShiftStreamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimeShiftStreamList", DescribeTimeShiftStreamListResponse.class);
    }

    /**
     *This API is used to query the information of the top n client IPs in a certain period of time (top 1,000 is supported currently).
     * @param req DescribeTopClientIpSumInfoListRequest
     * @return DescribeTopClientIpSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopClientIpSumInfoListResponse DescribeTopClientIpSumInfoList(DescribeTopClientIpSumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopClientIpSumInfoList", DescribeTopClientIpSumInfoListResponse.class);
    }

    /**
     *This API is used to query the number of transcoding tasks.
     * @param req DescribeTranscodeTaskNumRequest
     * @return DescribeTranscodeTaskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTaskNumResponse DescribeTranscodeTaskNum(DescribeTranscodeTaskNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeTaskNum", DescribeTranscodeTaskNumResponse.class);
    }

    /**
     *This API is used to query the number of LVB upstream channels.
     * @param req DescribeUploadStreamNumsRequest
     * @return DescribeUploadStreamNumsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadStreamNumsResponse DescribeUploadStreamNums(DescribeUploadStreamNumsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadStreamNums", DescribeUploadStreamNumsResponse.class);
    }

    /**
     *This API is used to query the information of the top n domain names or stream IDs in a certain period of time (top 1,000 is supported currently).
     * @param req DescribeVisitTopSumInfoListRequest
     * @return DescribeVisitTopSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVisitTopSumInfoListResponse DescribeVisitTopSumInfoList(DescribeVisitTopSumInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVisitTopSumInfoList", DescribeVisitTopSumInfoListResponse.class);
    }

    /**
     *This API is used to pause a live stream. The stream can be resumed if it is paused.
Note: If you call this API to pause an inactive stream, the request will be considered successful.
     * @param req DropLiveStreamRequest
     * @return DropLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DropLiveStreamResponse DropLiveStream(DropLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropLiveStream", DropLiveStreamResponse.class);
    }

    /**
     *This API is used to enable a disabled LVB domain name.
     * @param req EnableLiveDomainRequest
     * @return EnableLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public EnableLiveDomainResponse EnableLiveDomain(EnableLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableLiveDomain", EnableLiveDomainResponse.class);
    }

    /**
     *This API is used to disable an LVB domain name.
     * @param req ForbidLiveDomainRequest
     * @return ForbidLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveDomainResponse ForbidLiveDomain(ForbidLiveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidLiveDomain", ForbidLiveDomainResponse.class);
    }

    /**
     *This API is used to disable a stream. You can set a time to resume the stream.
Note:
1. As long as the correct stream name is passed in, the stream will be disabled successfully.
2. If you want a stream to be disabled only if the push domain, push path, and stream name match, please submit a ticket.
3. If you have configured domain groups, you must pass in the correct push domain in order to disable a stream.
     * @param req ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveStreamResponse ForbidLiveStream(ForbidLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidLiveStream", ForbidLiveStreamResponse.class);
    }

    /**
     *This API is used to modify a callback template.
     * @param req ModifyLiveCallbackTemplateRequest
     * @return ModifyLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCallbackTemplateResponse ModifyLiveCallbackTemplate(ModifyLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveCallbackTemplate", ModifyLiveCallbackTemplateResponse.class);
    }

    /**
     *This API is used to bind a certificate to multiple playback domains and update the HTTPS configuration of the domains.
If a self-owned certificate is used, it will be automatically uploaded to Tencent Cloud’s SSL Certificate Service.
     * @param req ModifyLiveDomainCertBindingsRequest
     * @return ModifyLiveDomainCertBindingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveDomainCertBindingsResponse ModifyLiveDomainCertBindings(ModifyLiveDomainCertBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveDomainCertBindings", ModifyLiveDomainCertBindingsResponse.class);
    }

    /**
     *This API is used to configure referer allowlist/blocklist of a live streaming domain name.
Referer information is included in HTTP requests. After you enable referer configuration, live streams using RTMP or WebRTC for playback will not authenticate the referer and can be played back normally. To make the referer configuration effective, the HTTP-FLV or HLS protocol is recommended for playback.
     * @param req ModifyLiveDomainRefererRequest
     * @return ModifyLiveDomainRefererResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveDomainRefererResponse ModifyLiveDomainReferer(ModifyLiveDomainRefererRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveDomainReferer", ModifyLiveDomainRefererResponse.class);
    }

    /**
     *This API is used to modify the playback authentication key.
     * @param req ModifyLivePlayAuthKeyRequest
     * @return ModifyLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayAuthKeyResponse ModifyLivePlayAuthKey(ModifyLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePlayAuthKey", ModifyLivePlayAuthKeyResponse.class);
    }

    /**
     *This API is used to modify a playback domain name.
     * @param req ModifyLivePlayDomainRequest
     * @return ModifyLivePlayDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayDomainResponse ModifyLivePlayDomain(ModifyLivePlayDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePlayDomain", ModifyLivePlayDomainResponse.class);
    }

    /**
     *This API is used to modify a stream pulling task. 
1. You cannot modify the destination URL. To publish to a new destination, please create a new task.
2. You cannot modify the source type. To use a different source type, please create a new task.
     * @param req ModifyLivePullStreamTaskRequest
     * @return ModifyLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePullStreamTaskResponse ModifyLivePullStreamTask(ModifyLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePullStreamTask", ModifyLivePullStreamTaskResponse.class);
    }

    /**
     *This API is used to modify the LVB push authentication key.
     * @param req ModifyLivePushAuthKeyRequest
     * @return ModifyLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePushAuthKeyResponse ModifyLivePushAuthKey(ModifyLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLivePushAuthKey", ModifyLivePushAuthKeyResponse.class);
    }

    /**
     *This API is used to modify the recording template configuration.
     * @param req ModifyLiveRecordTemplateRequest
     * @return ModifyLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveRecordTemplateResponse ModifyLiveRecordTemplate(ModifyLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveRecordTemplate", ModifyLiveRecordTemplateResponse.class);
    }

    /**
     *This API is used to modify the screencapturing template configuration.
     * @param req ModifyLiveSnapshotTemplateRequest
     * @return ModifyLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveSnapshotTemplateResponse ModifyLiveSnapshotTemplate(ModifyLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveSnapshotTemplate", ModifyLiveSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to modify a time shifting template.
     * @param req ModifyLiveTimeShiftTemplateRequest
     * @return ModifyLiveTimeShiftTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTimeShiftTemplateResponse ModifyLiveTimeShiftTemplate(ModifyLiveTimeShiftTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveTimeShiftTemplate", ModifyLiveTimeShiftTemplateResponse.class);
    }

    /**
     *This API is used to modify the transcoding template configuration.
     * @param req ModifyLiveTranscodeTemplateRequest
     * @return ModifyLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTranscodeTemplateResponse ModifyLiveTranscodeTemplate(ModifyLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLiveTranscodeTemplate", ModifyLiveTranscodeTemplateResponse.class);
    }

    /**
     *Restart the running live streaming pull task.
     * @param req RestartLivePullStreamTaskRequest
     * @return RestartLivePullStreamTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestartLivePullStreamTaskResponse RestartLivePullStreamTask(RestartLivePullStreamTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartLivePullStreamTask", RestartLivePullStreamTaskResponse.class);
    }

    /**
     *This API is used to cancel the delay setting and recover the real-time display of the live streaming image.
     * @param req ResumeDelayLiveStreamRequest
     * @return ResumeDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDelayLiveStreamResponse ResumeDelayLiveStream(ResumeDelayLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeDelayLiveStream", ResumeDelayLiveStreamResponse.class);
    }

    /**
     *This API is used to resume the push of a specific stream.
     * @param req ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeLiveStreamResponse ResumeLiveStream(ResumeLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeLiveStream", ResumeLiveStreamResponse.class);
    }

    /**
     *Note: Recording files are stored on the VOD platform. To use the recording feature, you need to activate a VOD account and ensure that it is available. After the recording files are stored, applicable fees (including storage fees and downstream playback traffic fees) will be charged according to the VOD billing method. For more information, please see the corresponding document.
     * @param req StopLiveRecordRequest
     * @return StopLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopLiveRecordResponse StopLiveRecord(StopLiveRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLiveRecord", StopLiveRecordResponse.class);
    }

    /**
     *This API is used to terminate an ongoing recording task and generate a recording file.
     * @param req StopRecordTaskRequest
     * @return StopRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRecordTaskResponse StopRecordTask(StopRecordTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRecordTask", StopRecordTaskResponse.class);
    }

    /**
     *This API is used to unbind a domain name certificate.
     * @param req UnBindLiveDomainCertRequest
     * @return UnBindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public UnBindLiveDomainCertResponse UnBindLiveDomainCert(UnBindLiveDomainCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnBindLiveDomainCert", UnBindLiveDomainCertResponse.class);
    }

    /**
     *This API is used to update a watermark.
     * @param req UpdateLiveWatermarkRequest
     * @return UpdateLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLiveWatermarkResponse UpdateLiveWatermark(UpdateLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateLiveWatermark", UpdateLiveWatermarkResponse.class);
    }

}
