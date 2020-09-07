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
    private static String version = "2018-08-01";

    public LiveClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LiveClient(Credential credential, String region, ClientProfile profile) {
        super(LiveClient.endpoint, LiveClient.version, credential, region, profile);
    }

    /**
     *This API is used to set the delay time for a stream.
Note: if you want to set delayed playback before pushing, you need to do so 5 minutes in advance.
Currently, this API only supports stream granularity, and the feature supporting domain name and application granularities will be available in the future.
Use case: for important live streams, you can set delayed playback in advance to avoid contingency issues.

     * @param req AddDelayLiveStreamRequest
     * @return AddDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public AddDelayLiveStreamResponse AddDelayLiveStream(AddDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDelayLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddDelayLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddDelayLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a domain name. Only one domain name can be submitted at a time, and it must have an ICP filing.
     * @param req AddLiveDomainRequest
     * @return AddLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveDomainResponse AddLiveDomain(AddLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLiveDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddLiveDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddLiveDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After a watermark is added and a watermark ID is successfully returned, you need to call the [CreateLiveWatermarkRule](https://intl.cloud.tencent.com/document/product/267/32629?from_cn_redirect=1) API and bind the watermark ID to the stream.
     * @param req AddLiveWatermarkRequest
     * @return AddLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveWatermarkResponse AddLiveWatermark(AddLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a domain name certificate.
Note: you need to call the `CreateLiveCert` API first to add a certificate. After getting the certificate ID, call this API for binding.
     * @param req BindLiveDomainCertRequest
     * @return BindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public BindLiveDomainCertResponse BindLiveDomainCert(BindLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to cancel a stream mix. It can be used basically in the same way as `mix_streamv2.cancel_mix_stream`.
     * @param req CancelCommonMixStreamRequest
     * @return CancelCommonMixStreamResponse
     * @throws TencentCloudSDKException
     */
    public CancelCommonMixStreamResponse CancelCommonMixStream(CancelCommonMixStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelCommonMixStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelCommonMixStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelCommonMixStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateCommonMixStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCommonMixStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCommonMixStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *To create a callback rule, you need to first call the [CreateLiveCallbackTemplate](https://intl.cloud.tencent.com/document/product/267/32637?from_cn_redirect=1) API to create a callback template and bind the returned template ID to the domain name/path.
<br>Callback protocol-related document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param req CreateLiveCallbackRuleRequest
     * @return CreateLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackRuleResponse CreateLiveCallbackRule(CreateLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCallbackRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCallbackRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveCallbackRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After a callback template is created and a template ID is successfully returned, you need to call the [CreateLiveCallbackRule](https://intl.cloud.tencent.com/document/product/267/32638?from_cn_redirect=1) API and bind the template ID to the domain name/path.
<br>Callback protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
Note: at least enter one callback URL.
     * @param req CreateLiveCallbackTemplateRequest
     * @return CreateLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCallbackTemplateResponse CreateLiveCallbackTemplate(CreateLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a certificate.
     * @param req CreateLiveCertRequest
     * @return CreateLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveCertResponse CreateLiveCert(CreateLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *To create a recording rule, you need to first call the [CreateLiveRecordTemplate](https://intl.cloud.tencent.com/document/product/267/32614?from_cn_redirect=1) API to create a recording template and bind the returned template ID to the stream.
<br>Recording-related document: [LVB Recording](https://intl.cloud.tencent.com/document/product/267/32739?from_cn_redirect=1).
     * @param req CreateLiveRecordRuleRequest
     * @return CreateLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordRuleResponse CreateLiveRecordRule(CreateLiveRecordRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecordRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After a recording template is created and a template ID is successfully returned, you need to call the [CreateLiveRecordRule](https://intl.cloud.tencent.com/document/product/267/32615?from_cn_redirect=1) API and bind the template ID to the stream.
<br>Recording-related document: [LVB Recording](https://intl.cloud.tencent.com/document/product/267/32739?from_cn_redirect=1).
     * @param req CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordTemplateResponse CreateLiveRecordTemplate(CreateLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateLiveSnapshotRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveSnapshotRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveSnapshotRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After a screencapturing template is created and a template ID is successfully returned, you need to call the [CreateLiveSnapshotRule](https://intl.cloud.tencent.com/document/product/267/32625?from_cn_redirect=1) API and bind the template ID to the stream.
<br>Screencapturing-related document: [LVB Screencapturing](https://intl.cloud.tencent.com/document/product/267/32737?from_cn_redirect=1).
     * @param req CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveSnapshotTemplateResponse CreateLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *To create a transcoding rule, you need to first call the [CreateLiveTranscodeTemplate](https://intl.cloud.tencent.com/document/product/267/32646?from_cn_redirect=1) API to create a transcoding template and bind the returned template ID to the stream.
<br>Transcoding-related document: [LVB Remuxing and Transcoding](https://intl.cloud.tencent.com/document/product/267/32736?from_cn_redirect=1).
     * @param req CreateLiveTranscodeRuleRequest
     * @return CreateLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeRuleResponse CreateLiveTranscodeRule(CreateLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveTranscodeRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveTranscodeRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveTranscodeRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After a transcoding template is created and a template ID is successfully returned, you need to call the [CreateLiveTranscodeRule](https://intl.cloud.tencent.com/document/product/267/32647?from_cn_redirect=1) API and bind the returned template ID to the stream.
<br>Transcoding-related document: [LVB Remuxing and Transcoding](https://intl.cloud.tencent.com/document/product/267/32736?from_cn_redirect=1).
     * @param req CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveTranscodeTemplateResponse CreateLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *To create a watermarking rule, you need to first call the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API to add a watermark and bind the returned watermark ID to the stream.
     * @param req CreateLiveWatermarkRuleRequest
     * @return CreateLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveWatermarkRuleResponse CreateLiveWatermarkRule(CreateLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveWatermarkRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveWatermarkRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveWatermarkRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a recording task that starts and ends at specified times and records by using the configuration corresponding to a specified recording template ID.
- Prerequisites
1. Recording files are stored on the VOD platform, so if you need to use the recording feature, you must first activate the VOD service.
2. After the recording files are stored, applicable fees (including storage fees and downstream playback traffic fees) will be charged according to the VOD billing mode. For more information, please see the corresponding document.
- Precautions
1. An interruption will end the current recording and generate a recording file. The task will still be valid before the end time expires, and as long as the stream is pushed normally during the period, it will record normally, regardless of whether the push is interrupted or restarted multiple times.
2. Creating recording tasks with overlapping time periods must be avoided. If there are multiple tasks with overlapping time periods for the same stream, the system will start three recording tasks at most to avoid repeated recording.
3. The record of a created recording task will be retained for 3 months on the platform.
4. The current recording task management APIs (CreateRecordTask/StopRecordTask/DeleteRecordTask) are not compatible with the legacy APIs (CreateLiveRecord/StopLiveRecord/DeleteLiveRecord), and they cannot be mixed.
     * @param req CreateRecordTaskRequest
     * @return CreateRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordTaskResponse CreateRecordTask(CreateRecordTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRecordTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a callback rule.
     * @param req DeleteLiveCallbackRuleRequest
     * @return DeleteLiveCallbackRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackRuleResponse DeleteLiveCallbackRule(DeleteLiveCallbackRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCallbackRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCallbackRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveCallbackRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API deletes a callback template.
     * @param req DeleteLiveCallbackTemplateRequest
     * @return DeleteLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCallbackTemplateResponse DeleteLiveCallbackTemplate(DeleteLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a certificate corresponding to the domain name.
     * @param req DeleteLiveCertRequest
     * @return DeleteLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveCertResponse DeleteLiveCert(DeleteLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an added LVB domain name.
     * @param req DeleteLiveDomainRequest
     * @return DeleteLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveDomainResponse DeleteLiveDomain(DeleteLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Note: The `DeleteLiveRecord` API is only used to delete the record of recording tasks but not stop recording or deleting an ongoing recording task. If you need to stop a recording task, please use the [StopLiveRecord](https://intl.cloud.tencent.com/document/product/267/30146?from_cn_redirect=1) API.
     * @param req DeleteLiveRecordRequest
     * @return DeleteLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordResponse DeleteLiveRecord(DeleteLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a recording rule.
     * @param req DeleteLiveRecordRuleRequest
     * @return DeleteLiveRecordRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordRuleResponse DeleteLiveRecordRule(DeleteLiveRecordRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecordRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a recording template.
     * @param req DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordTemplateResponse DeleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a screencapturing rule.
     * @param req DeleteLiveSnapshotRuleRequest
     * @return DeleteLiveSnapshotRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotRuleResponse DeleteLiveSnapshotRule(DeleteLiveSnapshotRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveSnapshotRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveSnapshotRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveSnapshotRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a screencapturing template.
     * @param req DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveSnapshotTemplateResponse DeleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a transcoding rule.
`DomainName+AppName+StreamName+TemplateId` uniquely identifies a single transcoding rule. If you need to delete it, strong match is required. `TemplateId` is required. Even if other parameters are empty, you still need to pass in an empty string to make a strong match.
     * @param req DeleteLiveTranscodeRuleRequest
     * @return DeleteLiveTranscodeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeRuleResponse DeleteLiveTranscodeRule(DeleteLiveTranscodeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveTranscodeRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveTranscodeRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveTranscodeRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a transcoding template.
     * @param req DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveTranscodeTemplateResponse DeleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a watermark.
     * @param req DeleteLiveWatermarkRequest
     * @return DeleteLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkResponse DeleteLiveWatermark(DeleteLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a watermarking rule.
     * @param req DeleteLiveWatermarkRuleRequest
     * @return DeleteLiveWatermarkRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkRuleResponse DeleteLiveWatermarkRule(DeleteLiveWatermarkRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveWatermarkRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveWatermarkRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a recording task configuration. The deletion does not affect running tasks and takes effect only for new pushes.
     * @param req DeleteRecordTaskRequest
     * @return DeleteRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTaskResponse DeleteRecordTask(DeleteRecordTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRecordTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the downstream information of all streams at a specified point in time (at a 1-minute granularity).
     * @param req DescribeAllStreamPlayInfoListRequest
     * @return DescribeAllStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllStreamPlayInfoListResponse DescribeAllStreamPlayInfoList(DescribeAllStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllStreamPlayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllStreamPlayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAllStreamPlayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the data of billable LVB bandwidth and traffic.
     * @param req DescribeBillBandwidthAndFluxListRequest
     * @return DescribeBillBandwidthAndFluxListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillBandwidthAndFluxListResponse DescribeBillBandwidthAndFluxList(DescribeBillBandwidthAndFluxListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillBandwidthAndFluxListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillBandwidthAndFluxListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBillBandwidthAndFluxList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the number of concurrent recording channels, which is applicable to LCB and LVB.
     * @param req DescribeConcurrentRecordStreamNumRequest
     * @return DescribeConcurrentRecordStreamNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrentRecordStreamNumResponse DescribeConcurrentRecordStreamNum(DescribeConcurrentRecordStreamNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConcurrentRecordStreamNumResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConcurrentRecordStreamNumResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConcurrentRecordStreamNum"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the billable bandwidth of live stream relaying in the last 3 months. The query period is up to 31 days.
     * @param req DescribeDeliverBandwidthListRequest
     * @return DescribeDeliverBandwidthListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliverBandwidthListResponse DescribeDeliverBandwidthList(DescribeDeliverBandwidthListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeliverBandwidthListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeliverBandwidthListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeliverBandwidthList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the downstream playback data by district and ISP.
     * @param req DescribeGroupProIspPlayInfoListRequest
     * @return DescribeGroupProIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupProIspPlayInfoListResponse DescribeGroupProIspPlayInfoList(DescribeGroupProIspPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupProIspPlayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupProIspPlayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupProIspPlayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the number of each playback HTTP status code at a 5-minute granularity in a certain period of time.
Note: data can be queried one hour after it is generated. For example, data between 10:00 and 10:59 cannot be queried until 12:00.
     * @param req DescribeHttpStatusInfoListRequest
     * @return DescribeHttpStatusInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHttpStatusInfoListResponse DescribeHttpStatusInfoList(DescribeHttpStatusInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHttpStatusInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHttpStatusInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHttpStatusInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the callback rule list.
     * @param req DescribeLiveCallbackRulesRequest
     * @return DescribeLiveCallbackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackRulesResponse DescribeLiveCallbackRules(DescribeLiveCallbackRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCallbackRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a single callback template.
     * @param req DescribeLiveCallbackTemplateRequest
     * @return DescribeLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplateResponse DescribeLiveCallbackTemplate(DescribeLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the callback template list.
     * @param req DescribeLiveCallbackTemplatesRequest
     * @return DescribeLiveCallbackTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCallbackTemplatesResponse DescribeLiveCallbackTemplates(DescribeLiveCallbackTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCallbackTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCallbackTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCallbackTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get certificate information.
     * @param req DescribeLiveCertRequest
     * @return DescribeLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertResponse DescribeLiveCert(DescribeLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the certificate information list.
     * @param req DescribeLiveCertsRequest
     * @return DescribeLiveCertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveCertsResponse DescribeLiveCerts(DescribeLiveCertsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveCertsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveCertsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveCerts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of delayed playbacks.
     * @param req DescribeLiveDelayInfoListRequest
     * @return DescribeLiveDelayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDelayInfoListResponse DescribeLiveDelayInfoList(DescribeLiveDelayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDelayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDelayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveDelayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the LVB domain name information.
     * @param req DescribeLiveDomainRequest
     * @return DescribeLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainResponse DescribeLiveDomain(DescribeLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the domain name certificate information.
     * @param req DescribeLiveDomainCertRequest
     * @return DescribeLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainCertResponse DescribeLiveDomainCert(DescribeLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the real-time downstream playback data at the domain name level. As it takes certain time to process data, the API queries quasi-real-time data generated 4 minutes ago by default.
     * @param req DescribeLiveDomainPlayInfoListRequest
     * @return DescribeLiveDomainPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainPlayInfoListResponse DescribeLiveDomainPlayInfoList(DescribeLiveDomainPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainPlayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainPlayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveDomainPlayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query domain names by domain name status and type.
     * @param req DescribeLiveDomainsRequest
     * @return DescribeLiveDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveDomainsResponse DescribeLiveDomains(DescribeLiveDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the forbidden stream list.
     * @param req DescribeLiveForbidStreamListRequest
     * @return DescribeLiveForbidStreamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveForbidStreamListResponse DescribeLiveForbidStreamList(DescribeLiveForbidStreamListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveForbidStreamListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveForbidStreamListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveForbidStreamList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the playback authentication key.
     * @param req DescribeLivePlayAuthKeyRequest
     * @return DescribeLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePlayAuthKeyResponse DescribeLivePlayAuthKey(DescribeLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePlayAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePlayAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLivePlayAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the LVB push authentication key.
     * @param req DescribeLivePushAuthKeyRequest
     * @return DescribeLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePushAuthKeyResponse DescribeLivePushAuthKey(DescribeLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePushAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePushAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLivePushAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of recording rules.
     * @param req DescribeLiveRecordRulesRequest
     * @return DescribeLiveRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordRulesResponse DescribeLiveRecordRules(DescribeLiveRecordRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveRecordRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a single recording template.
     * @param req DescribeLiveRecordTemplateRequest
     * @return DescribeLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplateResponse DescribeLiveRecordTemplate(DescribeLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the recording template list.
     * @param req DescribeLiveRecordTemplatesRequest
     * @return DescribeLiveRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordTemplatesResponse DescribeLiveRecordTemplates(DescribeLiveRecordTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveRecordTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the screencapturing rule list.
     * @param req DescribeLiveSnapshotRulesRequest
     * @return DescribeLiveSnapshotRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotRulesResponse DescribeLiveSnapshotRules(DescribeLiveSnapshotRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveSnapshotRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a single screencapturing template.
     * @param req DescribeLiveSnapshotTemplateRequest
     * @return DescribeLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplateResponse DescribeLiveSnapshotTemplate(DescribeLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the screencapturing template list.
     * @param req DescribeLiveSnapshotTemplatesRequest
     * @return DescribeLiveSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveSnapshotTemplatesResponse DescribeLiveSnapshotTemplates(DescribeLiveSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveSnapshotTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveSnapshotTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveSnapshotTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query streaming events.<br>

Note: This API can filter by IsFilter and return the push history.
     * @param req DescribeLiveStreamEventListRequest
     * @return DescribeLiveStreamEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamEventListResponse DescribeLiveStreamEventList(DescribeLiveStreamEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamEventListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamEventListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamEventList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return a list of live streams. It queries the information of live streams after they are pushed successfully.
Note: this API can query up to 20,000 streams. If you want to query more than 20,000 streams, please contact after-sales service.
     * @param req DescribeLiveStreamOnlineListRequest
     * @return DescribeLiveStreamOnlineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineListResponse DescribeLiveStreamOnlineList(DescribeLiveStreamOnlineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamOnlineListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamOnlineListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamOnlineList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return the list of pushed streams. <br>
Note: Up to 10,000 entries can be queried per page. More data can be obtained by adjusting the query time range.
     * @param req DescribeLiveStreamPublishedListRequest
     * @return DescribeLiveStreamPublishedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPublishedListResponse DescribeLiveStreamPublishedList(DescribeLiveStreamPublishedListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamPublishedListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamPublishedListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamPublishedList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the push information of all real-time streams, including client IP, server IP, frame rate, bitrate, domain name, and push start time.
     * @param req DescribeLiveStreamPushInfoListRequest
     * @return DescribeLiveStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPushInfoListResponse DescribeLiveStreamPushInfoList(DescribeLiveStreamPushInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamPushInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamPushInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamPushInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return the stream status such as active, inactive, or forbidden.
     * @param req DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamStateResponse DescribeLiveStreamState(DescribeLiveStreamStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamStateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of transcoding on a specified day or in a specified period of time.
     * @param req DescribeLiveTranscodeDetailInfoRequest
     * @return DescribeLiveTranscodeDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeDetailInfoResponse DescribeLiveTranscodeDetailInfo(DescribeLiveTranscodeDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeDetailInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeDetailInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeDetailInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of transcoding rules.
     * @param req DescribeLiveTranscodeRulesRequest
     * @return DescribeLiveTranscodeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeRulesResponse DescribeLiveTranscodeRules(DescribeLiveTranscodeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a single transcoding template.
     * @param req DescribeLiveTranscodeTemplateRequest
     * @return DescribeLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplateResponse DescribeLiveTranscodeTemplate(DescribeLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the transcoding template list.
     * @param req DescribeLiveTranscodeTemplatesRequest
     * @return DescribeLiveTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveTranscodeTemplatesResponse DescribeLiveTranscodeTemplates(DescribeLiveTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveTranscodeTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveTranscodeTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveTranscodeTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a single watermark.
     * @param req DescribeLiveWatermarkRequest
     * @return DescribeLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkResponse DescribeLiveWatermark(DescribeLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the watermarking rule list.
     * @param req DescribeLiveWatermarkRulesRequest
     * @return DescribeLiveWatermarkRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarkRulesResponse DescribeLiveWatermarkRules(DescribeLiveWatermarkRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarkRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarkRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermarkRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the watermark list.
     * @param req DescribeLiveWatermarksRequest
     * @return DescribeLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarksResponse DescribeLiveWatermarks(DescribeLiveWatermarksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermarks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of downstream playback error codes, i.e., the occurrences of each HTTP error code (4xx and 5xx) at a 1-minute granularity in a certain period of time.


     * @param req DescribePlayErrorCodeDetailInfoListRequest
     * @return DescribePlayErrorCodeDetailInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeDetailInfoListResponse DescribePlayErrorCodeDetailInfoList(DescribePlayErrorCodeDetailInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayErrorCodeDetailInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayErrorCodeDetailInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePlayErrorCodeDetailInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of downstream playback error codes.
     * @param req DescribePlayErrorCodeSumInfoListRequest
     * @return DescribePlayErrorCodeSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayErrorCodeSumInfoListResponse DescribePlayErrorCodeSumInfoList(DescribePlayErrorCodeSumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayErrorCodeSumInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayErrorCodeSumInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePlayErrorCodeSumInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the average traffic per second, total traffic, and number of total requests by country/region, district, and ISP in a certain period of time.
     * @param req DescribeProIspPlaySumInfoListRequest
     * @return DescribeProIspPlaySumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProIspPlaySumInfoListResponse DescribeProIspPlaySumInfoList(DescribeProIspPlaySumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProIspPlaySumInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProIspPlaySumInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProIspPlaySumInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the downstream playback data of a specified ISP in a specified district, including bandwidth, traffic, number of requests, and number of concurrent connections.
     * @param req DescribeProvinceIspPlayInfoListRequest
     * @return DescribeProvinceIspPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProvinceIspPlayInfoListResponse DescribeProvinceIspPlayInfoList(DescribeProvinceIspPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProvinceIspPlayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProvinceIspPlayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProvinceIspPlayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *The API is used to query the number of screenshots as an LVB value-added service.
     * @param req DescribeScreenShotSheetNumListRequest
     * @return DescribeScreenShotSheetNumListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenShotSheetNumListResponse DescribeScreenShotSheetNumList(DescribeScreenShotSheetNumListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenShotSheetNumListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenShotSheetNumListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScreenShotSheetNumList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the playback data of each stream at the day level, including the total traffic.
     * @param req DescribeStreamDayPlayInfoListRequest
     * @return DescribeStreamDayPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamDayPlayInfoListResponse DescribeStreamDayPlayInfoList(DescribeStreamDayPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamDayPlayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamDayPlayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeStreamDayPlayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the playback data. It supports querying the playback details by stream name and aggregated data by playback domain name. Data in the last 4 minutes or so cannot be queried due to delay.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect.
     * @param req DescribeStreamPlayInfoListRequest
     * @return DescribeStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPlayInfoListResponse DescribeStreamPlayInfoList(DescribeStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamPlayInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamPlayInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeStreamPlayInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the upstream push quality data by stream ID, including frame rate, bitrate, elapsed time, and codec of audio and video files.
     * @param req DescribeStreamPushInfoListRequest
     * @return DescribeStreamPushInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPushInfoListResponse DescribeStreamPushInfoList(DescribeStreamPushInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamPushInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamPushInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeStreamPushInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of the top n client IPs in a certain period of time (top 1,000 is supported currently).
     * @param req DescribeTopClientIpSumInfoListRequest
     * @return DescribeTopClientIpSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopClientIpSumInfoListResponse DescribeTopClientIpSumInfoList(DescribeTopClientIpSumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopClientIpSumInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopClientIpSumInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTopClientIpSumInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of the top n domain names or stream IDs in a certain period of time (top 1,000 is supported currently).
     * @param req DescribeVisitTopSumInfoListRequest
     * @return DescribeVisitTopSumInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVisitTopSumInfoListResponse DescribeVisitTopSumInfoList(DescribeVisitTopSumInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVisitTopSumInfoListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVisitTopSumInfoListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVisitTopSumInfoList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disconnect the push connection, which can be resumed.
     * @param req DropLiveStreamRequest
     * @return DropLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DropLiveStreamResponse DropLiveStream(DropLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DropLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DropLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a disabled LVB domain name.
     * @param req EnableLiveDomainRequest
     * @return EnableLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public EnableLiveDomainResponse EnableLiveDomain(EnableLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableLiveDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableLiveDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableLiveDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable an LVB domain name.
     * @param req ForbidLiveDomainRequest
     * @return ForbidLiveDomainResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveDomainResponse ForbidLiveDomain(ForbidLiveDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForbidLiveDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidLiveDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ForbidLiveDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to forbid the push of a specific stream. You can preset a time point to resume the stream.
     * @param req ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveStreamResponse ForbidLiveStream(ForbidLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForbidLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ForbidLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a callback template.
     * @param req ModifyLiveCallbackTemplateRequest
     * @return ModifyLiveCallbackTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCallbackTemplateResponse ModifyLiveCallbackTemplate(ModifyLiveCallbackTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCallbackTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCallbackTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveCallbackTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a certificate.
     * @param req ModifyLiveCertRequest
     * @return ModifyLiveCertResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveCertResponse ModifyLiveCert(ModifyLiveCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the domain name and certificate binding information.
     * @param req ModifyLiveDomainCertRequest
     * @return ModifyLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveDomainCertResponse ModifyLiveDomainCert(ModifyLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the playback authentication key.
     * @param req ModifyLivePlayAuthKeyRequest
     * @return ModifyLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayAuthKeyResponse ModifyLivePlayAuthKey(ModifyLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePlayAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePlayAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePlayAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a playback domain name.
     * @param req ModifyLivePlayDomainRequest
     * @return ModifyLivePlayDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayDomainResponse ModifyLivePlayDomain(ModifyLivePlayDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePlayDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePlayDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePlayDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the LVB push authentication key.
     * @param req ModifyLivePushAuthKeyRequest
     * @return ModifyLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePushAuthKeyResponse ModifyLivePushAuthKey(ModifyLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePushAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePushAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePushAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the recording template configuration.
     * @param req ModifyLiveRecordTemplateRequest
     * @return ModifyLiveRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveRecordTemplateResponse ModifyLiveRecordTemplate(ModifyLiveRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveRecordTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveRecordTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveRecordTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the screencapturing template configuration.
     * @param req ModifyLiveSnapshotTemplateRequest
     * @return ModifyLiveSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveSnapshotTemplateResponse ModifyLiveSnapshotTemplate(ModifyLiveSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the transcoding template configuration.
     * @param req ModifyLiveTranscodeTemplateRequest
     * @return ModifyLiveTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveTranscodeTemplateResponse ModifyLiveTranscodeTemplate(ModifyLiveTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLiveTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume a delayed playback.
     * @param req ResumeDelayLiveStreamRequest
     * @return ResumeDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDelayLiveStreamResponse ResumeDelayLiveStream(ResumeDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeDelayLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeDelayLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeDelayLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume the push of a specific stream.
     * @param req ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeLiveStreamResponse ResumeLiveStream(ResumeLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Note: Recording files are stored on the VOD platform. To use the recording feature, you need to activate a VOD account and ensure that it is available. After the recording files are stored, applicable fees (including storage fees and downstream playback traffic fees) will be charged according to the VOD billing method. For more information, please see the corresponding document.
     * @param req StopLiveRecordRequest
     * @return StopLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopLiveRecordResponse StopLiveRecord(StopLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to end a recording prematurely and terminate the running recording task. After the task is successfully terminated, it will no longer start.
     * @param req StopRecordTaskRequest
     * @return StopRecordTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRecordTaskResponse StopRecordTask(StopRecordTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopRecordTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopRecordTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopRecordTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a domain name certificate.
     * @param req UnBindLiveDomainCertRequest
     * @return UnBindLiveDomainCertResponse
     * @throws TencentCloudSDKException
     */
    public UnBindLiveDomainCertResponse UnBindLiveDomainCert(UnBindLiveDomainCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindLiveDomainCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindLiveDomainCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindLiveDomainCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a watermark.
     * @param req UpdateLiveWatermarkRequest
     * @return UpdateLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLiveWatermarkResponse UpdateLiveWatermark(UpdateLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
