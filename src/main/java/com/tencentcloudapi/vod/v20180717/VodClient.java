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
package com.tencentcloudapi.vod.v20180717;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vod.v20180717.models.*;

public class VodClient extends AbstractClient{
    private static String endpoint = "vod.intl.tencentcloudapi.com";
    private static String service = "vod";
    private static String version = "2018-07-17";

    public VodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VodClient(Credential credential, String region, ClientProfile profile) {
        super(VodClient.endpoint, VodClient.version, credential, region, profile);
    }

    /**
     *We strongly recommend that you use the [server-side upload SDK](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1#1.-.E5.8F.91.E8.B5.B7.E4.B8.8A.E4.BC.A0) provided by VOD to upload files. Directly invoking the API for upload is significantly more difficult and involves a much larger workload than using the SDK.
* This API is used to apply for uploading media files (and cover files), get the meta information for uploading files to VOD (including upload path, upload signature, etc.), for subsequent upload APIs.
For the upload process, see [Server-Side Upload Overview](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1).
     * @param req ApplyUploadRequest
     * @return ApplyUploadResponse
     * @throws TencentCloudSDKException
     */
    public ApplyUploadResponse ApplyUpload(ApplyUploadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyUpload", ApplyUploadResponse.class);
    }

    /**
     *Associate a media asset subtitle with the media output file corresponding to the adaptive bitrate streaming template ID (or disassociate it).
     * @param req AttachMediaSubtitlesRequest
     * @return AttachMediaSubtitlesResponse
     * @throws TencentCloudSDKException
     */
    public AttachMediaSubtitlesResponse AttachMediaSubtitles(AttachMediaSubtitlesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachMediaSubtitles", AttachMediaSubtitlesResponse.class);
    }

    /**
     *Clone a CDN domain.
     * @param req CloneCDNDomainRequest
     * @return CloneCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public CloneCDNDomainResponse CloneCDNDomain(CloneCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneCDNDomain", CloneCDNDomainResponse.class);
    }

    /**
     *This API is used to trigger a voice cloning task. It clones a reference audio to generate an exclusive voice, which can be used for subsequent text to speech. Voice cloning is an asynchronous task. The voice ID and audio audition are generated after task completion.
     * @param req CloneVoiceAsyncRequest
     * @return CloneVoiceAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CloneVoiceAsyncResponse CloneVoiceAsync(CloneVoiceAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneVoiceAsync", CloneVoiceAsyncResponse.class);
    }

    /**
     *This API is used to trigger a voice cloning task. It clones a reference audio to generate an exclusive voice, which can be used for subsequent text to speech.
     * @param req CloneVoiceSyncRequest
     * @return CloneVoiceSyncResponse
     * @throws TencentCloudSDKException
     */
    public CloneVoiceSyncResponse CloneVoiceSync(CloneVoiceSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneVoiceSync", CloneVoiceSyncResponse.class);
    }

    /**
     *This API is used to confirm the upload result of media files and cover files to Tencent Cloud VOD, store media information, and return the playback address and file ID.
     * @param req CommitUploadRequest
     * @return CommitUploadResponse
     * @throws TencentCloudSDKException
     */
    public CommitUploadResponse CommitUpload(CommitUploadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitUpload", CommitUploadResponse.class);
    }

    /**
     *This API is used to compose media files to achieve the following effects:

1. **Image rotation**: rotates the image of a video or picture by a certain degree, or flips it in a certain direction.
2. **Audio control**: Increase or reduce the volume of sound in video or audio, or mute the video.
3. **Screen Overlay**: Overlay frames from videos and images in sequence, for example, to achieve a Picture-in-Picture effect.
4. **Audio mixing**: Mix the sound in video and audio together.
5. **Audio extraction**: Extract audio from the video (visuals are not retained).
6. **Crop**: Crop a specified time period from video or audio.
7. **Splicing**: Splice videos, audio, and images in chronological order.
8. **Transitions**: When stitching multiple videos or images, you can add transition effects between paragraphs.

The muxing format of the composed media can be MP4 (video) or MP3 (audio). If event notification is used, the event notification type is video synthesis completed (https://www.tencentcloud.com/document/product/266/43000?from_cn_redirect=1).
     * @param req ComposeMediaRequest
     * @return ComposeMediaResponse
     * @throws TencentCloudSDKException
     */
    public ComposeMediaResponse ComposeMedia(ComposeMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ComposeMedia", ComposeMediaResponse.class);
    }

    /**
     ** Developers call event notification pull to obtain events, and then must call this API to ACK message received.
* After the developer obtains the event handler, the validity time for pending confirmation is 30 seconds. If it exceeds 30 seconds, a parameter error (4000) will be reported.
* For more references on reliable callback of event notification, see [Reliable Callback](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83).
     * @param req ConfirmEventsRequest
     * @return ConfirmEventsResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmEventsResponse ConfirmEvents(ConfirmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmEvents", ConfirmEventsResponse.class);
    }

    /**
     *This API is used to create user-defined audio and video content analysis templates. Maximum number: 50. HLS format is not supported currently.
     * @param req CreateAIAnalysisTemplateRequest
     * @return CreateAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAnalysisTemplateResponse CreateAIAnalysisTemplate(CreateAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIAnalysisTemplate", CreateAIAnalysisTemplateResponse.class);
    }

    /**
     *This API is used to create user-defined audio and video content recognition templates. Maximum number: 50.
     * @param req CreateAIRecognitionTemplateRequest
     * @return CreateAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIRecognitionTemplateResponse CreateAIRecognitionTemplate(CreateAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIRecognitionTemplate", CreateAIRecognitionTemplateResponse.class);
    }

    /**
     *Create an adaptive bitrate streaming template. Max: 100.
     * @param req CreateAdaptiveDynamicStreamingTemplateRequest
     * @return CreateAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdaptiveDynamicStreamingTemplateResponse CreateAdaptiveDynamicStreamingTemplate(CreateAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAdaptiveDynamicStreamingTemplate", CreateAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *This API is used to create an advanced custom AIGC subject.
     * @param req CreateAigcAdvancedCustomElementRequest
     * @return CreateAigcAdvancedCustomElementResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcAdvancedCustomElementResponse CreateAigcAdvancedCustomElement(CreateAigcAdvancedCustomElementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcAdvancedCustomElement", CreateAigcAdvancedCustomElementResponse.class);
    }

    /**
     *This API is used to create a Token for AIGC API calls. Data sync has a delay once created. It can be queried or deleted after about 30 seconds.
     * @param req CreateAigcApiTokenRequest
     * @return CreateAigcApiTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcApiTokenResponse CreateAigcApiToken(CreateAigcApiTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcApiToken", CreateAigcApiTokenResponse.class);
    }

    /**
     *This API is used to create AIGC voice replication. Note that calling this API incurs fees. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
     * @param req CreateAigcAudioCloneRequest
     * @return CreateAigcAudioCloneResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcAudioCloneResponse CreateAigcAudioClone(CreateAigcAudioCloneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcAudioClone", CreateAigcAudioCloneResponse.class);
    }

    /**
     *This API is used to create AI audio generation tasks.
     * @param req CreateAigcAudioTaskRequest
     * @return CreateAigcAudioTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcAudioTaskResponse CreateAigcAudioTask(CreateAigcAudioTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcAudioTask", CreateAigcAudioTaskResponse.class);
    }

    /**
     *Call this API to create a subject for a specified model.
     * @param req CreateAigcCustomElementRequest
     * @return CreateAigcCustomElementResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcCustomElementResponse CreateAigcCustomElement(CreateAigcCustomElementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcCustomElement", CreateAigcCustomElementResponse.class);
    }

    /**
     *This API is used to create AIGC custom voice types. Note that calling this API incurs a fee for creating custom voice types. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#5e5217e8-29fc-467e-ac2d-853648f988b7).
     * @param req CreateAigcCustomVoiceRequest
     * @return CreateAigcCustomVoiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcCustomVoiceResponse CreateAigcCustomVoice(CreateAigcCustomVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcCustomVoice", CreateAigcCustomVoiceResponse.class);
    }

    /**
     *This API is used to create AIGC Hunyuan 3D tasks.
     * @param req CreateAigcHunyuan3DTaskRequest
     * @return CreateAigcHunyuan3DTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcHunyuan3DTaskResponse CreateAigcHunyuan3DTask(CreateAigcHunyuan3DTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcHunyuan3DTask", CreateAigcHunyuan3DTaskResponse.class);
    }

    /**
     *This API is used to generate AIGC images. The default limit is 1 concurrent processing. API calls incur actual fees. Refer to the VOD AIGC image generation billing documentation. The feature uses postpaid settlement mode. For daily billing customers, usage on the day is billed on the second day. For monthly settlement customers, the previous month's usage fees are billed on the 1st of the next month.
     * @param req CreateAigcImageTaskRequest
     * @return CreateAigcImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcImageTaskResponse CreateAigcImageTask(CreateAigcImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcImageTask", CreateAigcImageTaskResponse.class);
    }

    /**
     *This API is used to create and enable AIGC quota configuration. Quota usage starts accumulating from the enablement of the quota feature. Once the quota is reached, AIGC features will no longer be usable.

If the quota is deleted and re-enabled, the amount will be cleared and recalculated.

Since AGC content generation is an asynchronous task, real-time usage data cannot be obtained. Therefore, quota limits may result in some errors, and completely precise control over the set limit cannot be achieved.
     * @param req CreateAigcQuotaRequest
     * @return CreateAigcQuotaResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcQuotaResponse CreateAigcQuota(CreateAigcQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcQuota", CreateAigcQuotaResponse.class);
    }

    /**
     *This API is used to create AIGC custom subjects (Vidu). Note that calling this API incurs fees. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
     * @param req CreateAigcSubjectRequest
     * @return CreateAigcSubjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcSubjectResponse CreateAigcSubject(CreateAigcSubjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcSubject", CreateAigcSubjectResponse.class);
    }

    /**
     *This API is used to generate AIGC videos. API calls incur actual fees. Refer to the VOD AIGC video generation billing documentation. The feature uses postpaid settlement. For daily billing customers, usage on the day is billed on the second day. For monthly billing customers, the previous month's usage fees are billed on the 1st of the next month.
     * @param req CreateAigcVideoRedrawTaskRequest
     * @return CreateAigcVideoRedrawTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcVideoRedrawTaskResponse CreateAigcVideoRedrawTask(CreateAigcVideoRedrawTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcVideoRedrawTask", CreateAigcVideoRedrawTaskResponse.class);
    }

    /**
     *This API is used to generate AIGC videos. The default limit is 1 concurrent processing. API calls incur actual fees. Refer to the VOD AIGC video generation billing documentation. The settlement mode for this feature is pay-as-you-go. For daily billing customers, usage on the day is billed on the second day. For monthly billing customers, the previous month's usage fees are billed on the 1st of the next month.
     * @param req CreateAigcVideoTaskRequest
     * @return CreateAigcVideoTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcVideoTaskResponse CreateAigcVideoTask(CreateAigcVideoTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcVideoTask", CreateAigcVideoTaskResponse.class);
    }

    /**
     *This API is used to create a user-customized animated image generating template. Maximum number: 16.
     * @param req CreateAnimatedGraphicsTemplateRequest
     * @return CreateAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnimatedGraphicsTemplateResponse CreateAnimatedGraphicsTemplate(CreateAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAnimatedGraphicsTemplate", CreateAnimatedGraphicsTemplateResponse.class);
    }

    /**
     *This API is used to create a user-defined digital watermark template.
     * @param req CreateBlindWatermarkTemplateRequest
     * @return CreateBlindWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlindWatermarkTemplateResponse CreateBlindWatermarkTemplate(CreateBlindWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBlindWatermarkTemplate", CreateBlindWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to add domain names to VOD. A user can add up to 20 domain names. After the domain name is successfully added, VOD will deploy the domain. It takes about 2 minutes for the domain to change from the deployment state to the online status.
     * @param req CreateCDNDomainRequest
     * @return CreateCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateCDNDomainResponse CreateCDNDomain(CreateCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCDNDomain", CreateCDNDomainResponse.class);
    }

    /**
     *Create a logset via VOD.
     * @param req CreateCLSLogsetRequest
     * @return CreateCLSLogsetResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSLogsetResponse CreateCLSLogset(CreateCLSLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSLogset", CreateCLSLogsetResponse.class);
    }

    /**
     *This API is used to create a CLS log topic under VOD.
     * @param req CreateCLSTopicRequest
     * @return CreateCLSTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSTopicResponse CreateCLSTopic(CreateCLSTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSTopic", CreateCLSTopicResponse.class);
    }

    /**
     ** Used to categorize and manage media;
* This API does not affect the existing media category. To modify the media category, call the [ModifyMediaInfo](https://www.tencentcloud.com/document/product/266/31762?from_cn_redirect=1) API.
* The classification hierarchy cannot exceed 4 levels.
* The number of subcategories in each category must not exceed 500.
     * @param req CreateClassRequest
     * @return CreateClassResponse
     * @throws TencentCloudSDKException
     */
    public CreateClassResponse CreateClass(CreateClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClass", CreateClassResponse.class);
    }

    /**
     *Initiate complex adaptive bitstream processing tasks. Features include:
1. Output HLS and DASH adaptive bitrate streams based on the specified adaptive bitrate template;
2. The content protection solution for adaptive bitrate streams is selectable as unencrypted, Widevine, or FairPlay.
3. Support adding opening and ending segments;
4. The output adaptive bitrate stream can contain multilingual audio streams, each language comes from a different media file;
5. The output adaptive bitrate stream can contain multilingual subtitle streams.

Notes:
1. When using an opening scene, the video stream in the opening scene media needs to align with the audio stream; otherwise, it will cause audio and video synchronization issues in the output content.
2. If the output adaptive bitrate stream needs to include the audio of the main media, specify the FileId of the main media in the AudioSet parameter.
3. To use subtitles, add them to the main media first via the ModifyMediaInfo API or the audio and video details page in the console.
4. Top speed Codec and watermark are not currently supported.
     * @param req CreateComplexAdaptiveDynamicStreamingTaskRequest
     * @return CreateComplexAdaptiveDynamicStreamingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplexAdaptiveDynamicStreamingTaskResponse CreateComplexAdaptiveDynamicStreamingTask(CreateComplexAdaptiveDynamicStreamingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComplexAdaptiveDynamicStreamingTask", CreateComplexAdaptiveDynamicStreamingTaskResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version moderation template supports audio/video moderation and image moderation. For details, please see [Create Moderation Template](https://www.tencentcloud.com/document/api/266/84391?from_cn_redirect=1).
This API is used to create a user-customized audio/video moderation template. Up to 50 templates can be created.
     * @param req CreateContentReviewTemplateRequest
     * @return CreateContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentReviewTemplateResponse CreateContentReviewTemplate(CreateContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContentReviewTemplate", CreateContentReviewTemplateResponse.class);
    }

    /**
     *This API is used to generate a subdomain name resolution and prompt the customer to add it to the domain name resolution for wildcard domain name and domain name retrieval ownership verification.
     * @param req CreateDomainVerifyRecordRequest
     * @return CreateDomainVerifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainVerifyRecordResponse CreateDomainVerifyRecord(CreateDomainVerifyRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainVerifyRecord", CreateDomainVerifyRecordResponse.class);
    }

    /**
     *This API is no longer maintained. The new version of the [audio and video quality revival](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
Create an audio and video quality rebirth template.
     * @param req CreateEnhanceMediaTemplateRequest
     * @return CreateEnhanceMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnhanceMediaTemplateResponse CreateEnhanceMediaTemplate(CreateEnhanceMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnhanceMediaTemplate", CreateEnhanceMediaTemplateResponse.class);
    }

    /**
     *This API is used to create a title and trailer template.
-Maximum supported template quantity: 100.
     * @param req CreateHeadTailTemplateRequest
     * @return CreateHeadTailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateHeadTailTemplateResponse CreateHeadTailTemplate(CreateHeadTailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHeadTailTemplate", CreateHeadTailTemplateResponse.class);
    }

    /**
     *Create a user-defined image processing template. Maximum quantity: 16. Supports up to ten operations, for example: crop - thumbnail - crop - blur - thumbnail - crop - thumbnail - crop - blur - thumbnail.
     * @param req CreateImageProcessingTemplateRequest
     * @return CreateImageProcessingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageProcessingTemplateResponse CreateImageProcessingTemplate(CreateImageProcessingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageProcessingTemplate", CreateImageProcessingTemplateResponse.class);
    }

    /**
     *This API is used to create a user-customized image sprite template. Maximum number: 16.
     * @param req CreateImageSpriteTemplateRequest
     * @return CreateImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSpriteTemplateResponse CreateImageSpriteTemplate(CreateImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageSpriteTemplate", CreateImageSpriteTemplateResponse.class);
    }

    /**
     *This API is used to create a just in time transcoding template.
     * @param req CreateJustInTimeTranscodeTemplateRequest
     * @return CreateJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateJustInTimeTranscodeTemplateResponse CreateJustInTimeTranscodeTemplate(CreateJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJustInTimeTranscodeTemplate", CreateJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *Create a knowledge base. This API is used to create a new knowledge base for Intelligent Media Assets. Each user can create up to 20 knowledge bases.
     * @param req CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateKnowledgeBaseResponse CreateKnowledgeBase(CreateKnowledgeBaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKnowledgeBase", CreateKnowledgeBaseResponse.class);
    }

    /**
     *Create a large model parsing template.
     * @param req CreateLLMComprehendTemplateRequest
     * @return CreateLLMComprehendTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLLMComprehendTemplateResponse CreateLLMComprehendTemplate(CreateLLMComprehendTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLLMComprehendTemplate", CreateLLMComprehendTemplateResponse.class);
    }

    /**
     *This API is used to create custom templates for partial features of the ProcessMediaByMPS API.
When creating a template, fill in the MPS related parameters in JSON format in the MPSCreateTemplateParams parameter. For specific task parameter configuration methods, see the MPS task template related documentation.
Currently supported MPS features for creating custom templates:
1. [Audio and video enhancement](https://www.tencentcloud.com/document/product/862/118703?from_cn_redirect=1).
2. [Media AI](https://www.tencentcloud.com/document/product/862/113756?from_cn_redirect=1)

> Template for tasks created with this method:
> 1. Template management is still done in the VOD platform.
> 2. The feature is currently in beta test. If needed, you can contact us for support.
     * @param req CreateMPSTemplateRequest
     * @return CreateMPSTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateMPSTemplateResponse CreateMPSTemplate(CreateMPSTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMPSTemplate", CreateMPSTemplateResponse.class);
    }

    /**
     *This API is used to create material samples for video processing such as content recognition and inappropriate video recognition through facial feature positioning technology.
     * @param req CreatePersonSampleRequest
     * @return CreatePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonSampleResponse CreatePersonSample(CreatePersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePersonSample", CreatePersonSampleResponse.class);
    }

    /**
     *This API is used to create user-defined task flow templates. Template capacity limit: 50.
     * @param req CreateProcedureTemplateRequest
     * @return CreateProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcedureTemplateResponse CreateProcedureTemplate(CreateProcedureTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProcedureTemplate", CreateProcedureTemplateResponse.class);
    }

    /**
     *This API is used to create user-customized image asynchronous processing templates. Maximum number: 50. HLS format is not supported currently.
     * @param req CreateProcessImageAsyncTemplateRequest
     * @return CreateProcessImageAsyncTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessImageAsyncTemplateResponse CreateProcessImageAsyncTemplate(CreateProcessImageAsyncTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProcessImageAsyncTemplate", CreateProcessImageAsyncTemplateResponse.class);
    }

    /**
     *This API is used to create an audio-visual quality inspection template.
     * @param req CreateQualityInspectTemplateRequest
     * @return CreateQualityInspectTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateQualityInspectTemplateResponse CreateQualityInspectTemplate(CreateQualityInspectTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQualityInspectTemplate", CreateQualityInspectTemplateResponse.class);
    }

    /**
     *This API is no longer maintained. The new version of the [audio and video quality revival](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
This API is used to create a video rebirth template.
     * @param req CreateRebuildMediaTemplateRequest
     * @return CreateRebuildMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateRebuildMediaTemplateResponse CreateRebuildMediaTemplate(CreateRebuildMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRebuildMediaTemplate", CreateRebuildMediaTemplateResponse.class);
    }

    /**
     *This API is used to create user-customized moderation templates. Maximum number: 50.
>Template is applicable only to the ReviewAudioVideo (https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) and ReviewImage (https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1) APIs.
     * @param req CreateReviewTemplateRequest
     * @return CreateReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateReviewTemplateResponse CreateReviewTemplate(CreateReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReviewTemplate", CreateReviewTemplateResponse.class);
    }

    /**
     *This API is used to create a carousel playlist. Maximum quantity: 100.
Each file in the carousel playlist can specify a source file or a transcoded file.
The designated file must be in hls format. All playlist files should preferably maintain the same bitrate and resolution.
     * @param req CreateRoundPlayRequest
     * @return CreateRoundPlayResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoundPlayResponse CreateRoundPlay(CreateRoundPlayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoundPlay", CreateRoundPlayResponse.class);
    }

    /**
     *This API is used to create a user-customized sampled screenshot template, with a maximum of 16.
     * @param req CreateSampleSnapshotTemplateRequest
     * @return CreateSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSampleSnapshotTemplateResponse CreateSampleSnapshotTemplate(CreateSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSampleSnapshotTemplate", CreateSampleSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to generate scenario-based AIGC images. API calls incur actual fees. Refer to the VOD AIGC image generation billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#9c4dc6ff-4b3f-4b25-bf2d-393889dfb9ac). The feature uses postpaid settlement. For daily billing customers, usage on the day is billed on the second day. For monthly billing customers, the previous month's usage fees are billed on the 1st of the next month.
     * @param req CreateSceneAigcImageTaskRequest
     * @return CreateSceneAigcImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSceneAigcImageTaskResponse CreateSceneAigcImageTask(CreateSceneAigcImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSceneAigcImageTask", CreateSceneAigcImageTaskResponse.class);
    }

    /**
     *This API is used to generate scenario-based AIGC images. <b>The API is in beta. If needed, please contact us. API calls will incur actual fees.</b>
     * @param req CreateSceneAigcVideoTaskRequest
     * @return CreateSceneAigcVideoTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSceneAigcVideoTaskResponse CreateSceneAigcVideoTask(CreateSceneAigcVideoTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSceneAigcVideoTask", CreateSceneAigcVideoTaskResponse.class);
    }

    /**
     *This API is used to create user-customized specified time point screenshot templates. Maximum quantity: 16.
     * @param req CreateSnapshotByTimeOffsetTemplateRequest
     * @return CreateSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotByTimeOffsetTemplateResponse CreateSnapshotByTimeOffsetTemplate(CreateSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshotByTimeOffsetTemplate", CreateSnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *This API is used to enable storage in a region.
1. When a user enables the VOD service, storage in partial regions is enabled by default. If necessary, the user can use this API to enable storage in other regions.
2. The DescribeStorageRegions API can query all storage regions and opened regions.
     * @param req CreateStorageRegionRequest
     * @return CreateStorageRegionResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageRegionResponse CreateStorageRegion(CreateStorageRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorageRegion", CreateStorageRegionResponse.class);
    }

    /**
     *This API is used to create a VOD application.
     * @param req CreateSubAppIdRequest
     * @return CreateSubAppIdResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubAppIdResponse CreateSubAppId(CreateSubAppIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubAppId", CreateSubAppIdResponse.class);
    }

    /**
     *This API is <font color='red'>no longer maintained</font>. The new version of player signature no longer uses player configuration templates. For details, please see [Player Signature](https://www.tencentcloud.com/document/product/266/45554?from_cn_redirect=1).
This API is used to create player configurations. Maximum number: 100.
     * @param req CreateSuperPlayerConfigRequest
     * @return CreateSuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateSuperPlayerConfigResponse CreateSuperPlayerConfig(CreateSuperPlayerConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSuperPlayerConfig", CreateSuperPlayerConfigResponse.class);
    }

    /**
     *This API is used to create custom transcoding templates. Maximum quantity: 100.
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTranscodeTemplate", CreateTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to add acceleration domain names to VOD. A user can add up to 20 acceleration domain names.
1. After the domain name is successfully added, VOD will deploy the domain name. It takes about 2 minutes for the domain name to change from deployment state to online status.
     * @param req CreateVodDomainRequest
     * @return CreateVodDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateVodDomainResponse CreateVodDomain(CreateVodDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVodDomain", CreateVodDomainResponse.class);
    }

    /**
     *This API is used to create a user-defined watermark template with an upper limit of 1000.
     * @param req CreateWatermarkTemplateRequest
     * @return CreateWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWatermarkTemplateResponse CreateWatermarkTemplate(CreateWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWatermarkTemplate", CreateWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to create keyword samples in batches. Samples are used for video processing such as inappropriate content recognition and content recognition through OCR and ASR technology.
     * @param req CreateWordSamplesRequest
     * @return CreateWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public CreateWordSamplesResponse CreateWordSamples(CreateWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWordSamples", CreateWordSamplesResponse.class);
    }

    /**
     *This API is used to delete a user-defined audio and video content analysis template.

Note: Templates with IDs below 10000 are preset templates and cannot be deleted.
     * @param req DeleteAIAnalysisTemplateRequest
     * @return DeleteAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisTemplateResponse DeleteAIAnalysisTemplate(DeleteAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIAnalysisTemplate", DeleteAIAnalysisTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-defined audio and video content recognition template.
     * @param req DeleteAIRecognitionTemplateRequest
     * @return DeleteAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIRecognitionTemplateResponse DeleteAIRecognitionTemplate(DeleteAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIRecognitionTemplate", DeleteAIRecognitionTemplateResponse.class);
    }

    /**
     *Deletes an adaptive bitrate streaming template
     * @param req DeleteAdaptiveDynamicStreamingTemplateRequest
     * @return DeleteAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAdaptiveDynamicStreamingTemplateResponse DeleteAdaptiveDynamicStreamingTemplate(DeleteAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAdaptiveDynamicStreamingTemplate", DeleteAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *This API is used to delete advanced custom AIGC subjects.
     * @param req DeleteAigcAdvancedCustomElementRequest
     * @return DeleteAigcAdvancedCustomElementResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAigcAdvancedCustomElementResponse DeleteAigcAdvancedCustomElement(DeleteAigcAdvancedCustomElementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAigcAdvancedCustomElement", DeleteAigcAdvancedCustomElementResponse.class);
    }

    /**
     *Deletes an AIGC API Token. The AIGC quota associated with the Token will also be deleted.
     * @param req DeleteAigcApiTokenRequest
     * @return DeleteAigcApiTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAigcApiTokenResponse DeleteAigcApiToken(DeleteAigcApiTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAigcApiToken", DeleteAigcApiTokenResponse.class);
    }

    /**
     *This API is used to delete AIGC quota configurations. Once deleted, AIGC task initiation will no longer be limited.

If the quota is re-enabled after deletion, the amount will be cleared and recalculated.
     * @param req DeleteAigcQuotaRequest
     * @return DeleteAigcQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAigcQuotaResponse DeleteAigcQuota(DeleteAigcQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAigcQuota", DeleteAigcQuotaResponse.class);
    }

    /**
     *This API is used to delete a custom animated image generating template.
     * @param req DeleteAnimatedGraphicsTemplateRequest
     * @return DeleteAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAnimatedGraphicsTemplateResponse DeleteAnimatedGraphicsTemplate(DeleteAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAnimatedGraphicsTemplate", DeleteAnimatedGraphicsTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-defined digital watermark template.
     * @param req DeleteBlindWatermarkTemplateRequest
     * @return DeleteBlindWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlindWatermarkTemplateResponse DeleteBlindWatermarkTemplate(DeleteBlindWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlindWatermarkTemplate", DeleteBlindWatermarkTemplateResponse.class);
    }

    /**
     *Delete a CDN domain
     * @param req DeleteCDNDomainRequest
     * @return DeleteCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCDNDomainResponse DeleteCDNDomain(DeleteCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCDNDomain", DeleteCDNDomainResponse.class);
    }

    /**
     *Delete the log topic enabled for VOD.
     * @param req DeleteCLSTopicRequest
     * @return DeleteCLSTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCLSTopicResponse DeleteCLSTopic(DeleteCLSTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCLSTopic", DeleteCLSTopicResponse.class);
    }

    /**
     ** A category can be deleted only when it has no subcategories and no media association.
* Otherwise, execute [delete media](https://www.tencentcloud.com/document/product/266/31764?from_cn_redirect=1) and subcategories first, then delete the category;
     * @param req DeleteClassRequest
     * @return DeleteClassResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClassResponse DeleteClass(DeleteClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClass", DeleteClassResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of the moderation template supports video moderation and image moderation. For details, please see [Delete Moderation Template](https://www.tencentcloud.com/document/api/266/84390?from_cn_redirect=1).
Delete a user-customized audio/video moderation template.
     * @param req DeleteContentReviewTemplateRequest
     * @return DeleteContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentReviewTemplateResponse DeleteContentReviewTemplate(DeleteContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContentReviewTemplate", DeleteContentReviewTemplateResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of [Audio and Video Quality Rebirth](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) interface uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
This API is used to delete an audio and video quality rebirth template.
     * @param req DeleteEnhanceMediaTemplateRequest
     * @return DeleteEnhanceMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnhanceMediaTemplateResponse DeleteEnhanceMediaTemplate(DeleteEnhanceMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnhanceMediaTemplate", DeleteEnhanceMediaTemplateResponse.class);
    }

    /**
     *This API is used to delete a title and trailer template.
     * @param req DeleteHeadTailTemplateRequest
     * @return DeleteHeadTailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHeadTailTemplateResponse DeleteHeadTailTemplate(DeleteHeadTailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHeadTailTemplate", DeleteHeadTailTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-customized image processing template.
     * @param req DeleteImageProcessingTemplateRequest
     * @return DeleteImageProcessingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageProcessingTemplateResponse DeleteImageProcessingTemplate(DeleteImageProcessingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageProcessingTemplate", DeleteImageProcessingTemplateResponse.class);
    }

    /**
     *This API is used to delete an image sprite template.
     * @param req DeleteImageSpriteTemplateRequest
     * @return DeleteImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSpriteTemplateResponse DeleteImageSpriteTemplate(DeleteImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageSpriteTemplate", DeleteImageSpriteTemplateResponse.class);
    }

    /**
     *This API is used to delete a just in time transcoding template.
     * @param req DeleteJustInTimeTranscodeTemplateRequest
     * @return DeleteJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJustInTimeTranscodeTemplateResponse DeleteJustInTimeTranscodeTemplate(DeleteJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJustInTimeTranscodeTemplate", DeleteJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *Delete a knowledge base.
After the API is called, the knowledge base will be in the "Deleting" status, and the deletion operation will be performed in the backend.
     * @param req DeleteKnowledgeBaseRequest
     * @return DeleteKnowledgeBaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKnowledgeBaseResponse DeleteKnowledgeBase(DeleteKnowledgeBaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKnowledgeBase", DeleteKnowledgeBaseResponse.class);
    }

    /**
     *Delete a customized large model parsing template.

Note: Templates with IDs below 10000 are system-preset templates and cannot be deleted.
     * @param req DeleteLLMComprehendTemplateRequest
     * @return DeleteLLMComprehendTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLLMComprehendTemplateResponse DeleteLLMComprehendTemplate(DeleteLLMComprehendTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLLMComprehendTemplate", DeleteLLMComprehendTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-defined MPS task template.
     * @param req DeleteMPSTemplateRequest
     * @return DeleteMPSTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMPSTemplateResponse DeleteMPSTemplate(DeleteMPSTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMPSTemplate", DeleteMPSTemplateResponse.class);
    }

    /**
     ** Delete media and its corresponding video processing files (raw files, such as transcoded videos, sprite sheets, screenshots, WeChat video releases, etc.);
* You can individually delete the source file, transcoded video, or WeChat video release under a specified video file ID.
* Note: After the original file is deleted, you cannot initiate any video processing operations such as transcoding or WeChat publishing.
     * @param req DeleteMediaRequest
     * @return DeleteMediaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaResponse DeleteMedia(DeleteMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMedia", DeleteMediaResponse.class);
    }

    /**
     *This API is used to delete material samples based on figure IDs.
     * @param req DeletePersonSampleRequest
     * @return DeletePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonSampleResponse DeletePersonSample(DeletePersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePersonSample", DeletePersonSampleResponse.class);
    }

    /**
     *This API is used to delete a user-defined task flow template.
     * @param req DeleteProcedureTemplateRequest
     * @return DeleteProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProcedureTemplateResponse DeleteProcedureTemplate(DeleteProcedureTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProcedureTemplate", DeleteProcedureTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-customized image asynchronous processing template.

Note: Templates with IDs below 10000 are system-preset templates and cannot be deleted.
     * @param req DeleteProcessImageAsyncTemplateRequest
     * @return DeleteProcessImageAsyncTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProcessImageAsyncTemplateResponse DeleteProcessImageAsyncTemplate(DeleteProcessImageAsyncTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProcessImageAsyncTemplate", DeleteProcessImageAsyncTemplateResponse.class);
    }

    /**
     *This API is used to delete an audio-visual quality inspection template.
     * @param req DeleteQualityInspectTemplateRequest
     * @return DeleteQualityInspectTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQualityInspectTemplateResponse DeleteQualityInspectTemplate(DeleteQualityInspectTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQualityInspectTemplate", DeleteQualityInspectTemplateResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of [audio and video quality revival](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
Deletes a video rebirth template.
     * @param req DeleteRebuildMediaTemplateRequest
     * @return DeleteRebuildMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRebuildMediaTemplateResponse DeleteRebuildMediaTemplate(DeleteRebuildMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRebuildMediaTemplate", DeleteRebuildMediaTemplateResponse.class);
    }

    /**
     *Delete a user-customized moderation template.
>Template is applicable only to the ReviewAudioVideo (https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) and ReviewImage (https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1) APIs.
     * @param req DeleteReviewTemplateRequest
     * @return DeleteReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReviewTemplateResponse DeleteReviewTemplate(DeleteReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReviewTemplate", DeleteReviewTemplateResponse.class);
    }

    /**
     *This API is used to delete a carousel playlist.
     * @param req DeleteRoundPlayRequest
     * @return DeleteRoundPlayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoundPlayResponse DeleteRoundPlay(DeleteRoundPlayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoundPlay", DeleteRoundPlayResponse.class);
    }

    /**
     *This API is used to delete a user-customized sampled screenshot template.
     * @param req DeleteSampleSnapshotTemplateRequest
     * @return DeleteSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSampleSnapshotTemplateResponse DeleteSampleSnapshotTemplate(DeleteSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSampleSnapshotTemplate", DeleteSampleSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-customized specified time point screenshot template.
     * @param req DeleteSnapshotByTimeOffsetTemplateRequest
     * @return DeleteSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotByTimeOffsetTemplateResponse DeleteSnapshotByTimeOffsetTemplate(DeleteSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate", DeleteSnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *This API is <font color='red'>no longer maintained</font>. The new version of player signature no longer uses player configuration templates. For details, please see [Player Signature](https://www.tencentcloud.com/document/product/266/45554?from_cn_redirect=1).
This API is used to delete a player configuration.  
*Note: The system preset player configuration cannot be deleted.*
     * @param req DeleteSuperPlayerConfigRequest
     * @return DeleteSuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSuperPlayerConfigResponse DeleteSuperPlayerConfig(DeleteSuperPlayerConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSuperPlayerConfig", DeleteSuperPlayerConfigResponse.class);
    }

    /**
     *This API is used to delete a custom transcoding template.
     * @param req DeleteTranscodeTemplateRequest
     * @return DeleteTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTranscodeTemplateResponse DeleteTranscodeTemplate(DeleteTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTranscodeTemplate", DeleteTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to delete VOD acceleration domains.
1. Before domain deletion, acceleration in all regions must be disabled.
     * @param req DeleteVodDomainRequest
     * @return DeleteVodDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVodDomainResponse DeleteVodDomain(DeleteVodDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVodDomain", DeleteVodDomainResponse.class);
    }

    /**
     *Delete a specified voice by voice ID. This operation cannot be undone, and the voice cannot be used for subsequent APIs. Only voices for this account can be deleted. System preset voices cannot be deleted.

Note: Newly designed or cloned voice types cannot be deleted before activation (not found means non-operational). They are activated only after the new voice type is used for TTS once.
     * @param req DeleteVoiceRequest
     * @return DeleteVoiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVoiceResponse DeleteVoice(DeleteVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVoice", DeleteVoiceResponse.class);
    }

    /**
     *This API is used to delete a user-customized watermark template.
     * @param req DeleteWatermarkTemplateRequest
     * @return DeleteWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWatermarkTemplateResponse DeleteWatermarkTemplate(DeleteWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWatermarkTemplate", DeleteWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to delete keyword samples in batches.
     * @param req DeleteWordSamplesRequest
     * @return DeleteWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWordSamplesResponse DeleteWordSamples(DeleteWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWordSamples", DeleteWordSamplesResponse.class);
    }

    /**
     *This API is used to get the detail list of audio and video content analysis templates based on their unique identifiers. The returned results include all eligible user-defined audio and video content analysis templates and [system preset audio/video content analysis templates](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E5.88.86.E6.9E.90.E6.A8.A1.E6.9D.BF).
     * @param req DescribeAIAnalysisTemplatesRequest
     * @return DescribeAIAnalysisTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisTemplatesResponse DescribeAIAnalysisTemplates(DescribeAIAnalysisTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisTemplates", DescribeAIAnalysisTemplatesResponse.class);
    }

    /**
     *This API is used to get the list of details of audio/video content recognition templates based on their unique IDs. The returned results include all eligible user-defined audio/video content recognition templates and system preset audio/video content recognition templates.
     * @param req DescribeAIRecognitionTemplatesRequest
     * @return DescribeAIRecognitionTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIRecognitionTemplatesResponse DescribeAIRecognitionTemplates(DescribeAIRecognitionTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIRecognitionTemplates", DescribeAIRecognitionTemplatesResponse.class);
    }

    /**
     *This API is used to query adaptive bitrate streaming templates, and the pagination query is supported based on conditions.
     * @param req DescribeAdaptiveDynamicStreamingTemplatesRequest
     * @return DescribeAdaptiveDynamicStreamingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdaptiveDynamicStreamingTemplatesResponse DescribeAdaptiveDynamicStreamingTemplates(DescribeAdaptiveDynamicStreamingTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdaptiveDynamicStreamingTemplates", DescribeAdaptiveDynamicStreamingTemplatesResponse.class);
    }

    /**
     *This API is used to retrieve advanced custom AIGC subjects.
     * @param req DescribeAigcAdvancedCustomElementsRequest
     * @return DescribeAigcAdvancedCustomElementsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcAdvancedCustomElementsResponse DescribeAigcAdvancedCustomElements(DescribeAigcAdvancedCustomElementsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcAdvancedCustomElements", DescribeAigcAdvancedCustomElementsResponse.class);
    }

    /**
     *This API is used to query the list of AIGC API Tokens. Data sync has a delay after creation or deletion. The latest data can be queried after about 30 seconds.
     * @param req DescribeAigcApiTokensRequest
     * @return DescribeAigcApiTokensResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcApiTokensResponse DescribeAigcApiTokens(DescribeAigcApiTokensRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcApiTokens", DescribeAigcApiTokensResponse.class);
    }

    /**
     *This API is used to retrieve AIGC face information. Note that calling this API incurs face recognition fees. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
     * @param req DescribeAigcFaceInfoRequest
     * @return DescribeAigcFaceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcFaceInfoResponse DescribeAigcFaceInfo(DescribeAigcFaceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcFaceInfo", DescribeAigcFaceInfoResponse.class);
    }

    /**
     *This API is used to asynchronously fetch AIGC face information. Note that calling this API incurs face recognition fees. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
     * @param req DescribeAigcFaceInfoAsyncRequest
     * @return DescribeAigcFaceInfoAsyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcFaceInfoAsyncResponse DescribeAigcFaceInfoAsync(DescribeAigcFaceInfoAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcFaceInfoAsync", DescribeAigcFaceInfoAsyncResponse.class);
    }

    /**
     *This API is used to query AIGC quota configurations.
     * @param req DescribeAigcQuotasRequest
     * @return DescribeAigcQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcQuotasResponse DescribeAigcQuotas(DescribeAigcQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcQuotas", DescribeAigcQuotasResponse.class);
    }

    /**
     *This API is used to return AIGC statistical information within a specified time range.
1. AIGC statistical data from the last 365 days can be queried.
   2. The query time span should not exceed 90 days.
3. If the query time span exceeds 1 day, the data returned is at day granularity. Otherwise, the data returned is at 5-minute granularity.
     * @param req DescribeAigcUsageDataRequest
     * @return DescribeAigcUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcUsageDataResponse DescribeAigcUsageData(DescribeAigcUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcUsageData", DescribeAigcUsageDataResponse.class);
    }

    /**
     ** Obtain all classification information of the user.
     * @param req DescribeAllClassRequest
     * @return DescribeAllClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllClassResponse DescribeAllClass(DescribeAllClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllClass", DescribeAllClassResponse.class);
    }

    /**
     *This API is used to query the list of rotating image templates based on conditions with paging.
     * @param req DescribeAnimatedGraphicsTemplatesRequest
     * @return DescribeAnimatedGraphicsTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnimatedGraphicsTemplatesResponse DescribeAnimatedGraphicsTemplates(DescribeAnimatedGraphicsTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAnimatedGraphicsTemplates", DescribeAnimatedGraphicsTemplatesResponse.class);
    }

    /**
     *This API is used to query user-customized digit watermark templates.
     * @param req DescribeBlindWatermarkTemplatesRequest
     * @return DescribeBlindWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlindWatermarkTemplatesResponse DescribeBlindWatermarkTemplates(DescribeBlindWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlindWatermarkTemplates", DescribeBlindWatermarkTemplatesResponse.class);
    }

    /**
     *Queries an on-demand domain name.
     * @param req DescribeCDNDomainsRequest
     * @return DescribeCDNDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNDomainsResponse DescribeCDNDomains(DescribeCDNDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCDNDomains", DescribeCDNDomainsResponse.class);
    }

    /**
     *This API is used to query CDN bandwidth, traffic, and other stats for a VOD domain.
* The time span between the query start time and end time should not exceed 90 days.
* You can query data in different service regions.
* Statistical data support is available for querying specified regions and carriers within the Chinese mainland.
* Playback statistics only target VOD domains, excluding EdgeOne domain distribution.
     * @param req DescribeCDNStatDetailsRequest
     * @return DescribeCDNStatDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNStatDetailsResponse DescribeCDNStatDetails(DescribeCDNStatDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCDNStatDetails", DescribeCDNStatDetailsResponse.class);
    }

    /**
     *This API is used to query VOD CDN traffic, bandwidth, and other stats.
1. CDN usage data is retained on the system side for 13 months. You can only query usage data from the most recent 365 days through the API. To retrieve historical usage data beyond 365 days, contact us.
   2. The query time span should not exceed 90 days.
3. You can specify the time granularity of usage data, supporting 5-minute, 1-hour, and 1-day granularities.
4. Traffic is the total traffic within the query time granularity, and bandwidth is the peak bandwidth within the query time granularity.
5. Playback statistics only target VOD domains, excluding EdgeOne domain distribution.
     * @param req DescribeCDNUsageDataRequest
     * @return DescribeCDNUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNUsageDataResponse DescribeCDNUsageData(DescribeCDNUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCDNUsageData", DescribeCDNUsageDataResponse.class);
    }

    /**
     *Queries CLS log sets created by VOD.
     * @param req DescribeCLSLogsetsRequest
     * @return DescribeCLSLogsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCLSLogsetsResponse DescribeCLSLogsets(DescribeCLSLogsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSLogsets", DescribeCLSLogsetsResponse.class);
    }

    /**
     *Queries the destination topic for log delivery under an on-demand domain name.
     * @param req DescribeCLSPushTargetsRequest
     * @return DescribeCLSPushTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCLSPushTargetsResponse DescribeCLSPushTargets(DescribeCLSPushTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSPushTargets", DescribeCLSPushTargetsResponse.class);
    }

    /**
     *Queries the list of CLS log topics created by VOD.
     * @param req DescribeCLSTopicsRequest
     * @return DescribeCLSTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCLSTopicsResponse DescribeCLSTopics(DescribeCLSTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSTopics", DescribeCLSTopicsResponse.class);
    }

    /**
     *This API is used to query the download URL of CDN access logs for VOD domains, excluding EdgeOne origin-pull to VOD domains.
1. This API is used to query CDN log download links for the most recent 30 days.
2. By default, CDN generates a log file per hour. If there is no CDN access in an hour, no log file is generated.    
3. The CDN log download link has a validity of 24 hours.
     * @param req DescribeCdnLogsRequest
     * @return DescribeCdnLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnLogsResponse DescribeCdnLogs(DescribeCdnLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdnLogs", DescribeCdnLogsResponse.class);
    }

    /**
     *This API returns client upload acceleration statistics within a specified time range.
1. Can query client upload acceleration statistics data for the most recent 365 days.
   2. The query time span should not exceed 90 days.
3. If the query time span exceeds 1 day, the data is returned at a granularity of 1 day. Otherwise, the data is returned at a granularity of 5 minutes.
     * @param req DescribeClientUploadAccelerationUsageDataRequest
     * @return DescribeClientUploadAccelerationUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientUploadAccelerationUsageDataResponse DescribeClientUploadAccelerationUsageData(DescribeClientUploadAccelerationUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientUploadAccelerationUsageData", DescribeClientUploadAccelerationUsageDataResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new moderation template supports audio/video moderation and image moderation. For details, please see [Query Moderation Template List](https://www.tencentcloud.com/document/api/266/84389?from_cn_redirect=1).
This API is used to retrieve the list of details of audio/video moderation templates based on their unique identifiers. The returned results include all eligible custom templates and system preset content review templates (https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF).
     * @param req DescribeContentReviewTemplatesRequest
     * @return DescribeContentReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentReviewTemplatesResponse DescribeContentReviewTemplates(DescribeContentReviewTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentReviewTemplates", DescribeContentReviewTemplatesResponse.class);
    }

    /**
     *Query the carousel current playlist.
     * @param req DescribeCurrentPlaylistRequest
     * @return DescribeCurrentPlaylistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentPlaylistResponse DescribeCurrentPlaylist(DescribeCurrentPlaylistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentPlaylist", DescribeCurrentPlaylistResponse.class);
    }

    /**
     *This API is used to query the daily playback statistics within a specified date range.
* Playback statistics for the past one year can be queried.
* The time span between the start date and end date can be up to 90 days.
* Playback statistics only target VOD domains (i.e., distribution from EdgeOne domain names is not included in playback statistics).
* Due to data delay, you are advised to query the usage data of the previous day after 12:00 noon the next day.
     * @param req DescribeDailyMediaPlayStatRequest
     * @return DescribeDailyMediaPlayStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDailyMediaPlayStatResponse DescribeDailyMediaPlayStat(DescribeDailyMediaPlayStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDailyMediaPlayStat", DescribeDailyMediaPlayStatResponse.class);
    }

    /**
     *This API is used to query daily playback statistics of the Top 100 media files.
* Playback statistics from the past one year can be queried.
* You can query by playback times or traffic volume.
* Statistical description of the number of plays:
1. HLS file: The number of plays is counted when an M3U8 file is accessed, but not when a TS file is accessed.
2. Other files (for example, MP4 files): If a playback request includes the range parameter and the start parameter of range is not equal to 0, the number of plays is not counted. In other cases, the number of plays is counted.
* Playback statistics only target VOD domains (i.e., distribution from EdgeOne domain names is not included in playback statistics).
     * @param req DescribeDailyMostPlayedStatRequest
     * @return DescribeDailyMostPlayedStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDailyMostPlayedStatResponse DescribeDailyMostPlayedStat(DescribeDailyMostPlayedStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDailyMostPlayedStat", DescribeDailyMostPlayedStatResponse.class);
    }

    /**
     *This API is used to query the download address of playback statistics files.
* Can query the playback statistics file download link for the past one year. The time span between the start date and end date of the query is no more than 90 days.
VOD analyzes and processes the CDN request logs of the previous day to generate playback statistics files.
The playback statistics file contains statistical information such as the number of plays and total traffic of media files.
* Statistical description of the number of plays:
1. HLS file: The number of plays is counted when an M3U8 file is accessed, but not when a TS file is accessed.
2. Other files (for example, MP4 files): If a playback request includes the range parameter and the start parameter of range is not equal to 0, the number of plays is not counted. In other cases, the number of plays is counted.
* Statistics of playback devices: If a playback request includes the UserAgent parameter and the UserAgent contains identifiers such as Android or iPhone, it is counted as a mobile playback. Otherwise, it is counted as a PC playback.
* Playback statistics only target VOD domains (i.e., distribution from EdgeOne domain names is not included in playback statistics).
     * @param req DescribeDailyPlayStatFileListRequest
     * @return DescribeDailyPlayStatFileListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDailyPlayStatFileListResponse DescribeDailyPlayStatFileList(DescribeDailyPlayStatFileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDailyPlayStatFileList", DescribeDailyPlayStatFileListResponse.class);
    }

    /**
     *This API is used to query the default distribution configuration.
* Distribution domain name and protocol, i.e., the domain name and protocol in the media file distribution URL. Media files are distributed based on the default distribution configuration.
Playback key, used to calculate player signature.
     * @param req DescribeDefaultDistributionConfigRequest
     * @return DescribeDefaultDistributionConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultDistributionConfigResponse DescribeDefaultDistributionConfig(DescribeDefaultDistributionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultDistributionConfig", DescribeDefaultDistributionConfigResponse.class);
    }

    /**
     *This API is used to query DRM key provider information.
     * @param req DescribeDrmKeyProviderInfoRequest
     * @return DescribeDrmKeyProviderInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrmKeyProviderInfoResponse DescribeDrmKeyProviderInfo(DescribeDrmKeyProviderInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrmKeyProviderInfo", DescribeDrmKeyProviderInfoResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of [audio and video quality revival](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
This API is used to obtain the audio and video quality regeneration template list.
     * @param req DescribeEnhanceMediaTemplatesRequest
     * @return DescribeEnhanceMediaTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnhanceMediaTemplatesResponse DescribeEnhanceMediaTemplates(DescribeEnhanceMediaTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnhanceMediaTemplates", DescribeEnhanceMediaTemplatesResponse.class);
    }

    /**
     *Tencent Cloud Video on Demand (VOD) provides customers with media upload, media management, media processing, and other services. During or after these services are executed, VOD also provides various event notifications, helping developers detect service processing status and perform next business operations.

Developers can use this API to query the current configuration of the event notification receiving method, recipient address, and which events have callback notification enabled.

Default API request rate limit: 100 requests/second.
     * @param req DescribeEventConfigRequest
     * @return DescribeEventConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventConfigResponse DescribeEventConfig(DescribeEventConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventConfig", DescribeEventConfigResponse.class);
    }

    /**
     *Used to get file attributes asynchronously.
-Currently only support getting the Md5 and Sha1 of the source file.
-For HLS or DASH input files, only the attributes of index files are retrieved.
     * @param req DescribeFileAttributesRequest
     * @return DescribeFileAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileAttributesResponse DescribeFileAttributes(DescribeFileAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileAttributes", DescribeFileAttributesResponse.class);
    }

    /**
     *This API is used to search for title and trailer template lists.
     * @param req DescribeHeadTailTemplatesRequest
     * @return DescribeHeadTailTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHeadTailTemplatesResponse DescribeHeadTailTemplates(DescribeHeadTailTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHeadTailTemplates", DescribeHeadTailTemplatesResponse.class);
    }

    /**
     *This API is used to query the list of image processing templates based on conditions with paging.
     * @param req DescribeImageProcessingTemplatesRequest
     * @return DescribeImageProcessingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageProcessingTemplatesResponse DescribeImageProcessingTemplates(DescribeImageProcessingTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageProcessingTemplates", DescribeImageProcessingTemplatesResponse.class);
    }

    /**
     *This API is used to return the daily image review usage information within the specified query time range.
1. Image moderation statistics data from the last 365 days can be queried.
   2. The query time span should not exceed 90 days.
3. If the query time span exceeds 1 day, data at a day granularity is returned. Otherwise, data at a 5-minute granularity is returned.
     * @param req DescribeImageReviewUsageDataRequest
     * @return DescribeImageReviewUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageReviewUsageDataResponse DescribeImageReviewUsageData(DescribeImageReviewUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageReviewUsageData", DescribeImageReviewUsageDataResponse.class);
    }

    /**
     *Query image sprite templates based on conditions with paging.
     * @param req DescribeImageSpriteTemplatesRequest
     * @return DescribeImageSpriteTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSpriteTemplatesResponse DescribeImageSpriteTemplates(DescribeImageSpriteTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSpriteTemplates", DescribeImageSpriteTemplatesResponse.class);
    }

    /**
     *This API is used to search the instant transcoding template list.
     * @param req DescribeJustInTimeTranscodeTemplatesRequest
     * @return DescribeJustInTimeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJustInTimeTranscodeTemplatesResponse DescribeJustInTimeTranscodeTemplates(DescribeJustInTimeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJustInTimeTranscodeTemplates", DescribeJustInTimeTranscodeTemplatesResponse.class);
    }

    /**
     *Queries the knowledge base list. Returns all knowledge base information under the specified user.
     * @param req DescribeKnowledgeBasesRequest
     * @return DescribeKnowledgeBasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeBasesResponse DescribeKnowledgeBases(DescribeKnowledgeBasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeBases", DescribeKnowledgeBasesResponse.class);
    }

    /**
     *According to the unique identifier of the large model parsing template, retrieve the large model parsing template detail list. The returned results include all user-customized large model parsing templates that meet the conditions.
     * @param req DescribeLLMComprehendTemplatesRequest
     * @return DescribeLLMComprehendTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLLMComprehendTemplatesResponse DescribeLLMComprehendTemplates(DescribeLLMComprehendTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLLMComprehendTemplates", DescribeLLMComprehendTemplatesResponse.class);
    }

    /**
     *This API is used to return the daily License request count within the specified query time range.
1. License request count statistics from the last 365 days can be queried.
   2. The query time span should not exceed 90 days.
3. If the query time span exceeds 1 day, data is returned at a daily granularity. Otherwise, data is returned at a 5-minute granularity.
     * @param req DescribeLicenseUsageDataRequest
     * @return DescribeLicenseUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseUsageDataResponse DescribeLicenseUsageData(DescribeLicenseUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseUsageData", DescribeLicenseUsageDataResponse.class);
    }

    /**
     *This API is used to query user-customized media processing service task templates.
To query the template list, fill in the MPS related parameters in MPSDescribeTemplateParams in JSON format. For specific task parameter configuration methods, see the MPS task template documentation.
     * @param req DescribeMPSTemplatesRequest
     * @return DescribeMPSTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMPSTemplatesResponse DescribeMPSTemplates(DescribeMPSTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMPSTemplates", DescribeMPSTemplatesResponse.class);
    }

    /**
     *1. This API can obtain multiple types of info of multiple media files, including:
1. basicInfo: including media name, category, playback address, cover image, etc.
2. Meta information (metaData): including size, duration, video stream information, audio stream information, etc.
3. Transcoding result information (transcodeInfo): including media addresses, video stream parameters, and audio stream parameters of various specifications generated for this media.
4. Animated graphics info (animatedGraphicsInfo): the animated graphics info after converting a video to GIF (for example, gif).
5. sampleSnapshotInfo: Screenshot information after sampling a video.
6. Sprite image information (imageSpriteInfo): the sprite image information after capturing sprite images from a video.
7. snapshotByTimeOffsetInfo: screenshot information after taking screenshots of the video at specified time points.
8. Video timestamp information (keyFrameDescInfo): Dotting information set for the video.
9. Adaptive Bitrate Streaming information (adaptiveDynamicStreamingInfo): including specification, encryption type, packaging format and other related information.
10. Review information (reviewInfo): includes media moderation and media cover review information.
2. You can specify to only return partial information in the response.
     * @param req DescribeMediaInfosRequest
     * @return DescribeMediaInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaInfosResponse DescribeMediaInfos(DescribeMediaInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaInfos", DescribeMediaInfosResponse.class);
    }

    /**
     *This API is used to query playback data of media files by specified time granularity.
* Playback statistics for the past one year can be queried.
Time granularity: hr. The max span between the end time and start time is 7 days.
Time granularity is day, and the maximum span between the end time and start time is 90 days.
* Playback statistics only target VOD domains, excluding EdgeOne domain distribution.
     * @param req DescribeMediaPlayStatDetailsRequest
     * @return DescribeMediaPlayStatDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaPlayStatDetailsResponse DescribeMediaPlayStatDetails(DescribeMediaPlayStatDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaPlayStatDetails", DescribeMediaPlayStatDetailsResponse.class);
    }

    /**
     *This API is used to return the daily video processing usage information within the specified query time range.
1. Video processing usage data is retained for 13 months in the data system. You can only query usage data from the most recent 365 days through the interface. To retrieve historical usage data beyond 365 days, contact us.
   2. The query time span should not exceed 90 days.
     * @param req DescribeMediaProcessUsageDataRequest
     * @return DescribeMediaProcessUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaProcessUsageDataResponse DescribeMediaProcessUsageData(DescribeMediaProcessUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaProcessUsageData", DescribeMediaProcessUsageDataResponse.class);
    }

    /**
     *This API is used to query material sample information by material ID, name, or tag with paging.
     * @param req DescribePersonSamplesRequest
     * @return DescribePersonSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonSamplesResponse DescribePersonSamples(DescribePersonSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePersonSamples", DescribePersonSamplesResponse.class);
    }

    /**
     *This API is used to search the task flow template detail list based on the task flow template name.
     * @param req DescribeProcedureTemplatesRequest
     * @return DescribeProcedureTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcedureTemplatesResponse DescribeProcedureTemplates(DescribeProcedureTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcedureTemplates", DescribeProcedureTemplatesResponse.class);
    }

    /**
     *This API is used to obtain the template details list for asynchronous image processing based on the Template Unique Identifier. The returned results include all eligible user-customized asynchronous image processing templates.
     * @param req DescribeProcessImageAsyncTemplatesRequest
     * @return DescribeProcessImageAsyncTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessImageAsyncTemplatesResponse DescribeProcessImageAsyncTemplates(DescribeProcessImageAsyncTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessImageAsyncTemplates", DescribeProcessImageAsyncTemplatesResponse.class);
    }

    /**
     *This API is used to query the audio and video quality detection template list.
     * @param req DescribeQualityInspectTemplatesRequest
     * @return DescribeQualityInspectTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityInspectTemplatesResponse DescribeQualityInspectTemplates(DescribeQualityInspectTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityInspectTemplates", DescribeQualityInspectTemplatesResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of the [audio and video quality revival](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
This API is used to query the video rebirth template list.
     * @param req DescribeRebuildMediaTemplatesRequest
     * @return DescribeRebuildMediaTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebuildMediaTemplatesResponse DescribeRebuildMediaTemplates(DescribeRebuildMediaTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRebuildMediaTemplates", DescribeRebuildMediaTemplatesResponse.class);
    }

    /**
     *<b>This API is not recommended. Use [DescribeMediaProcessUsageData](https://www.tencentcloud.com/document/product/266/41464?from_cn_redirect=1) as an alternative.</b>

This API is used to return the daily duration data of video content intelligent identification within the specified query time range. Measurement unit: seconds.

1. Intelligent video content identification duration statistics from the last 365 days can be queried.
2. The query time span should not exceed 90 days.
     * @param req DescribeReviewDetailsRequest
     * @return DescribeReviewDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReviewDetailsResponse DescribeReviewDetails(DescribeReviewDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReviewDetails", DescribeReviewDetailsResponse.class);
    }

    /**
     *This API is used to get the moderation template list.
>Template is applicable only to the [ReviewAudioVideo](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) and [ReviewImage](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1) APIs.
     * @param req DescribeReviewTemplatesRequest
     * @return DescribeReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReviewTemplatesResponse DescribeReviewTemplates(DescribeReviewTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReviewTemplates", DescribeReviewTemplatesResponse.class);
    }

    /**
     *This API is used to get the carousel playlist list.
     * @param req DescribeRoundPlaysRequest
     * @return DescribeRoundPlaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoundPlaysResponse DescribeRoundPlays(DescribeRoundPlaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoundPlays", DescribeRoundPlaysResponse.class);
    }

    /**
     *This API is used to query sampled screenshot templates based on conditions with paging.
     * @param req DescribeSampleSnapshotTemplatesRequest
     * @return DescribeSampleSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleSnapshotTemplatesResponse DescribeSampleSnapshotTemplates(DescribeSampleSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleSnapshotTemplates", DescribeSampleSnapshotTemplatesResponse.class);
    }

    /**
     *This API is used to query specified time point screenshot templates based on conditions with paging.
     * @param req DescribeSnapshotByTimeOffsetTemplatesRequest
     * @return DescribeSnapshotByTimeOffsetTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotByTimeOffsetTemplatesResponse DescribeSnapshotByTimeOffsetTemplates(DescribeSnapshotByTimeOffsetTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates", DescribeSnapshotByTimeOffsetTemplatesResponse.class);
    }

    /**
     *Queries storage space usage and number of files.
     * @param req DescribeStorageDataRequest
     * @return DescribeStorageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageDataResponse DescribeStorageData(DescribeStorageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageData", DescribeStorageDataResponse.class);
    }

    /**
     *This API is used to return the VOD storage space used within a specified time range, in bytes.
1. Storage usage data is reserved on the system side for 13 months. You can only query usage data from the most recent 365 days through the API. If you need to retrieve historical usage data beyond 365 days, contact us;
2. The query time span should not exceed 90 days.
3. The query span at a minute granularity should not exceed 7 days;
     * @param req DescribeStorageDetailsRequest
     * @return DescribeStorageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageDetailsResponse DescribeStorageDetails(DescribeStorageDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageDetails", DescribeStorageDetailsResponse.class);
    }

    /**
     *This API is used to:
1. Query the list of all storage campuses available for on-demand activation.
2. Query the list of opened parks.
3. Query the storage campus used by default.
     * @param req DescribeStorageRegionsRequest
     * @return DescribeStorageRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageRegionsResponse DescribeStorageRegions(DescribeStorageRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageRegions", DescribeStorageRegionsResponse.class);
    }

    /**
     *This API is used to get the application list of the current account.
     * @param req DescribeSubAppIdsRequest
     * @return DescribeSubAppIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAppIdsResponse DescribeSubAppIds(DescribeSubAppIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubAppIds", DescribeSubAppIdsResponse.class);
    }

    /**
     *This API is <font color='red'>no longer maintained</font>. The new version of player signature no longer uses player configuration templates. For details, please see [Player Signature](https://www.tencentcloud.com/document/product/266/45554?from_cn_redirect=1).
This API is used to query player configurations based on conditions with paging.
     * @param req DescribeSuperPlayerConfigsRequest
     * @return DescribeSuperPlayerConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuperPlayerConfigsResponse DescribeSuperPlayerConfigs(DescribeSuperPlayerConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSuperPlayerConfigs", DescribeSuperPlayerConfigsResponse.class);
    }

    /**
     *This API is used to query the details of the task execution status and results by task ID (tasks submitted within the last 3 days can be queried).
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetail", DescribeTaskDetailResponse.class);
    }

    /**
     ** This API is used to query the task list.
* When the list contains a large amount of data, a single API call cannot pull the entire list. You can use the ScrollToken parameter to pull in batches.
* Only tasks from the last three days (72 hours) can be queried.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *This API is used to retrieve the transcoding template detail list based on the transcoding template unique identifier. The returned results include all eligible custom templates and [system preset transcoding templates](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     * @param req DescribeTranscodeTemplatesRequest
     * @return DescribeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTemplatesResponse DescribeTranscodeTemplates(DescribeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeTemplates", DescribeTranscodeTemplatesResponse.class);
    }

    /**
     *This API is used to query the list of on-demand video domain names.
     * @param req DescribeVodDomainsRequest
     * @return DescribeVodDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVodDomainsResponse DescribeVodDomains(DescribeVodDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVodDomains", DescribeVodDomainsResponse.class);
    }

    /**
     *Queries the available timbre list under the current account, supporting filtering by optional conditions such as voice ID, type, name, gender, age, language, tag, and scenario.

Note: Newly designed or cloned voice types cannot be queried before activation. They are activated only after the new voice type is used for TTS once.
     * @param req DescribeVoicesRequest
     * @return DescribeVoicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoicesResponse DescribeVoices(DescribeVoicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVoices", DescribeVoicesResponse.class);
    }

    /**
     *This API is used to query user-customized watermark templates, and the pagination query is supported based on conditions.
     * @param req DescribeWatermarkTemplatesRequest
     * @return DescribeWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWatermarkTemplatesResponse DescribeWatermarkTemplates(DescribeWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWatermarkTemplates", DescribeWatermarkTemplatesResponse.class);
    }

    /**
     *This API is used to paging query keyword sample info by scenario, keyword, and tag.
     * @param req DescribeWordSamplesRequest
     * @return DescribeWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWordSamplesResponse DescribeWordSamples(DescribeWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWordSamples", DescribeWordSamplesResponse.class);
    }

    /**
     *This API is used to trigger a voice design task. It generates a custom voice based on a natural language description. You can specify a voice profile at the same time, such as name, gender, age, language, tag, and scenario. If trial text is attached during submission, an audio audition is generated after task completion. Voice design is an asynchronous task. The voice ID is generated after task completion.
     * @param req DesignVoiceAsyncRequest
     * @return DesignVoiceAsyncResponse
     * @throws TencentCloudSDKException
     */
    public DesignVoiceAsyncResponse DesignVoiceAsync(DesignVoiceAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DesignVoiceAsync", DesignVoiceAsyncResponse.class);
    }

    /**
     *This API is used to edit a video, such as clipping and splicing, to generate a new on-demand video. Editing features include:

1) Edit a file in VOD to generate a new video.
2) Splice multiple on-demand files to generate a new video.
3) Edit multiple files in on-demand video and then splice them to generate a new video;
4. Directly generate a new video for one of the streams in VOD;
5. Edit one of the on-demand streams to generate a new video;
6) Splice multiple on-demand streams to generate a new video.
7) Edit multiple streams in VOD and then splice them to generate a new video.

For the generated new video, you can also specify whether to execute task flow on the generated video.

When editing or splicing a live stream, please ensure the stream has ended before operating. Otherwise, the generated video may be incomplete.

If event notification is used, its type is [video editing completed](https://www.tencentcloud.com/document/product/266/33794?from_cn_redirect=1).
     * @param req EditMediaRequest
     * @return EditMediaResponse
     * @throws TencentCloudSDKException
     */
    public EditMediaResponse EditMedia(EditMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditMedia", EditMediaResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. Please use the new version of APIs [audio and video quality revival](https://www.tencentcloud.com/document/api/266/102571?from_cn_redirect=1).
Use a template to initiate audio and video quality revival.
     * @param req EnhanceMediaByTemplateRequest
     * @return EnhanceMediaByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceMediaByTemplateResponse EnhanceMediaByTemplate(EnhanceMediaByTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnhanceMediaByTemplate", EnhanceMediaByTemplateResponse.class);
    }

    /**
     *This API is used to trigger an audio and video quality regeneration task for on-demand audio-video media.
     * @param req EnhanceMediaQualityRequest
     * @return EnhanceMediaQualityResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceMediaQualityResponse EnhanceMediaQuality(EnhanceMediaQualityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnhanceMediaQuality", EnhanceMediaQualityResponse.class);
    }

    /**
     *This API is only used for special scenarios of customized development. Do not call this API unless VOD customer service proactively informs you that you need to use it.
     * @param req ExecuteFunctionRequest
     * @return ExecuteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteFunctionResponse ExecuteFunction(ExecuteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteFunction", ExecuteFunctionResponse.class);
    }

    /**
     *This API is used to initiate a digital watermark extraction task for a video. The extraction result can be queried through DescribeTaskDetail.
     * @param req ExtractBlindWatermarkRequest
     * @return ExtractBlindWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ExtractBlindWatermarkResponse ExtractBlindWatermark(ExtractBlindWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExtractBlindWatermark", ExtractBlindWatermarkResponse.class);
    }

    /**
     *If you need source tracing for piracy, see Ghost Watermark (https://www.tencentcloud.com/document/product/266/94228?from_cn_redirect=1).
     * @param req ExtractCopyRightWatermarkRequest
     * @return ExtractCopyRightWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ExtractCopyRightWatermarkResponse ExtractCopyRightWatermark(ExtractCopyRightWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExtractCopyRightWatermark", ExtractCopyRightWatermarkResponse.class);
    }

    /**
     *If source tracing for piracy is needed, ghost watermark (https://www.tencentcloud.com/document/product/266/94228?from_cn_redirect=1) is recommended.
     * @param req ExtractTraceWatermarkRequest
     * @return ExtractTraceWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ExtractTraceWatermarkResponse ExtractTraceWatermark(ExtractTraceWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExtractTraceWatermark", ExtractTraceWatermarkResponse.class);
    }

    /**
     *Quickly splice and edit HLS videos in VOD to generate new media in HLS format.

Quickly splice or edit the generated video to generate a new FileId and solidify it. After successful solidification, the new video file exists independent of the original input video and is not affected by the deletion of the original video.

<font color='red'>Note:</font> Enable reception of editing solidification event notifications through the ModifyEventConfig API. After successful solidification, you will receive a PersistenceComplete event notification. Before receiving this event notification, you should not delete or transition the original input video to colder storage. Otherwise, playback of the video generated by splicing and clipping may encounter exceptions.
     * @param req FastEditMediaRequest
     * @return FastEditMediaResponse
     * @throws TencentCloudSDKException
     */
    public FastEditMediaResponse FastEditMedia(FastEditMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FastEditMedia", FastEditMediaResponse.class);
    }

    /**
     ** After media blocking, except for VOD console preview, accessing URLs of various video resources (raw files, transcoding output files, screenshots, etc.) for other scenarios will return 403.
It takes about 5 to 10 minutes for the ban/unban operation to take effect across the entire network.
* Note: Media blocking can only be performed on media stored in standard storage and infrequent storage. Media in infrequent storage must be stored for at least 30 days. If deleted early or changed to another storage class, it is still billed for 30 days. If you block media in infrequent storage and its infrequent storage duration is less than 30 days, early deletion fees will occur. At the same time, after blocking, the infrequent storage duration of the media restarts from the current time. If the media is deleted or changed to another storage class before reaching 30 days, early deletion fees will also occur. For example, media 001 has been in infrequent storage for 10 days. If you block 001 at this point, infrequent storage is still billed for 30 days (early deletion billing duration: 30 - 10 = 20 days). After blocking, the infrequent storage duration of 001 restarts. If 001 is deleted on day 5 after blocking, infrequent storage is still billed for 30 days (early deletion billing duration: 30 - 5 = 25 days). The actual infrequent storage duration of 001 is 10 + 5 = 15 days, while the billed infrequent storage duration is 10 + 20 (early deletion billing) + 5 + 25 (early deletion billing) = 60 days.
     * @param req ForbidMediaDistributionRequest
     * @return ForbidMediaDistributionResponse
     * @throws TencentCloudSDKException
     */
    public ForbidMediaDistributionResponse ForbidMediaDistribution(ForbidMediaDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidMediaDistribution", ForbidMediaDistributionResponse.class);
    }

    /**
     *Perform operations on the carousel current playlist. Supported operations: <li> Insert: Insert a program into the current playlist.</li><li> Delete: Delete a program in the playlist.</li>
     * @param req HandleCurrentPlaylistRequest
     * @return HandleCurrentPlaylistResponse
     * @throws TencentCloudSDKException
     */
    public HandleCurrentPlaylistResponse HandleCurrentPlaylist(HandleCurrentPlaylistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleCurrentPlaylist", HandleCurrentPlaylistResponse.class);
    }

    /**
     *Used to import AI analysis results into the knowledge base.
     * @param req ImportMediaKnowledgeRequest
     * @return ImportMediaKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public ImportMediaKnowledgeResponse ImportMediaKnowledge(ImportMediaKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportMediaKnowledge", ImportMediaKnowledgeResponse.class);
    }

    /**
     *This API is used to trigger an audio and video quality inspection task for on-demand audio-video media.
     * @param req InspectMediaQualityRequest
     * @return InspectMediaQualityResponse
     * @throws TencentCloudSDKException
     */
    public InspectMediaQualityResponse InspectMediaQuality(InspectMediaQualityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InspectMediaQuality", InspectMediaQualityResponse.class);
    }

    /**
     *This API is used to list stored file entries under a sub-app.

**This API is only available in "FileID+Path" mode.**
     * @param req ListFilesRequest
     * @return ListFilesResponse
     * @throws TencentCloudSDKException
     */
    public ListFilesResponse ListFiles(ListFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFiles", ListFilesResponse.class);
    }

    /**
     *Live stream clipping refers to generating a new video (HLS format) in real time from a selected segment of the live stream portion during live streaming (when the live stream has not yet ended). Developers can share it immediately or store it for long-term preservation.

Tencent Cloud VOD supports two real-time editing modes:
- Edit and solidify: Save the edited video as a standalone video with an independent FileId. This is suitable for long-term preservation of highlight clips.
- Editing is not solidified: the edited video is attached to the live streaming recording file and has no standalone FileId. It is suitable for scenarios where highlight clips are temporarily shared.

Note:
- The premise for using the live stream clipping feature is that the target live stream has the time shifting and playback (https://www.tencentcloud.com/document/product/267/32742?from_cn_redirect=1) feature enabled.
-Live streaming Instant Editing is based on the m3u8 file generated by live recording, so its minimum editing precision is one ts slicing. Second-level or more precise editing precision cannot be achieved.
-Since stream disconnection may occur during live streaming, the actual video duration generated by editing may differ from the expected duration. For example, if you edit a live stream from 2018-09-20T10:30:00Z to 2018-09-20T10:40:00Z, and stream disconnection occurred during this time interval, the returned media file duration will be less than 10 minutes. In such cases, you can perceive it through the output parameter <a href="#p_segmentset">SegmentSet</a>.

### Edit solidification
Clipping persistence refers to saving the edited video as an independent video with its own FileId. Its lifecycle is not subject to any impact from the original live recorded video. Even if the original recorded video is deleted, the clipping result is not affected. You can also transcode it or publish it on WeChat for post-processing.

For example, a complete football match may have a live recording lasting over 2 hours. For cost savings, the customer can store the original video for 2 months, but can specify longer storage for the highlight reel from live stream clipping. You can also perform additional on-demand operations on the highlight reel separately, such as transcoding and publishing on WeChat. In this case, you can choose the live stream clipping and persistence solution.

The advantage of solidifying editing is that its lifecycle is independent of the original recorded video, and it can be managed separately and preserved long-term.

<font color='red'>Note:</font> If solidification is specified when editing, enable reception of editing solidification event notifications through the ModifyEventConfig API. After successful solidification, you will receive a PersistenceComplete event notification. Before receiving this event notification, you should not delete or archive the live video recording. Otherwise, playback of the generated video may be abnormal.

### Editing is not solidified
Non-solidified editing means that the result of editing (m3u8 file) shares the same TS segments with the live video recording. The generated video is not an independent and complete video (no independent FileId, only a playback URL), and its valid period is consistent with that of the full video of the live recording. Once the live recorded video is deleted, this clip will also become unplayable.

Editing is not solidified. Since the clipping result is not an independent video, it is not included in the video management of on-demand media assets. For example, the total number of videos in the console does not count this clip. It is also unable to separately target this clip for any video processing operation such as transcoding or publishing on WeChat.

The advantage of not solidifying editing is that the editing operation is relatively "lightweight" and will not generate additional storage overhead. However, its shortcoming is that the lifecycle is the same as the original recorded video, and it is unable to further transcode or perform other video processing.
     * @param req LiveRealTimeClipRequest
     * @return LiveRealTimeClipResponse
     * @throws TencentCloudSDKException
     */
    public LiveRealTimeClipResponse LiveRealTimeClip(LiveRealTimeClipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LiveRealTimeClip", LiveRealTimeClipResponse.class);
    }

    /**
     *Manage initiated tasks.
     * @param req ManageTaskRequest
     * @return ManageTaskResponse
     * @throws TencentCloudSDKException
     */
    public ManageTaskResponse ManageTask(ManageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageTask", ManageTaskResponse.class);
    }

    /**
     *This API is used to modify a user-defined audio and video content analysis template.

Note: Templates with IDs below 10000 are preset templates and are not allowed to be modified.
     * @param req ModifyAIAnalysisTemplateRequest
     * @return ModifyAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIAnalysisTemplateResponse ModifyAIAnalysisTemplate(ModifyAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAIAnalysisTemplate", ModifyAIAnalysisTemplateResponse.class);
    }

    /**
     *This API is used to modify a user-defined audio and video content recognition template.
     * @param req ModifyAIRecognitionTemplateRequest
     * @return ModifyAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIRecognitionTemplateResponse ModifyAIRecognitionTemplate(ModifyAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAIRecognitionTemplate", ModifyAIRecognitionTemplateResponse.class);
    }

    /**
     *Modifying an Adaptive Bitrate Streaming Template
     * @param req ModifyAdaptiveDynamicStreamingTemplateRequest
     * @return ModifyAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdaptiveDynamicStreamingTemplateResponse ModifyAdaptiveDynamicStreamingTemplate(ModifyAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAdaptiveDynamicStreamingTemplate", ModifyAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *This API is used to edit AIGC quota configuration. Quota usage starts accumulating when the quota feature is enabled. Once the quota is reached, AIGC features will no longer be usable.

Since AGC content generation is an async task, real-time usage data cannot be obtained. Therefore, quota limits result in some errors, and precise control over the set limit cannot be achieved.
     * @param req ModifyAigcQuotaRequest
     * @return ModifyAigcQuotaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAigcQuotaResponse ModifyAigcQuota(ModifyAigcQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAigcQuota", ModifyAigcQuotaResponse.class);
    }

    /**
     *Modify a custom animated image generating template.
     * @param req ModifyAnimatedGraphicsTemplateRequest
     * @return ModifyAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAnimatedGraphicsTemplateResponse ModifyAnimatedGraphicsTemplate(ModifyAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAnimatedGraphicsTemplate", ModifyAnimatedGraphicsTemplateResponse.class);
    }

    /**
     *This API is used to modify a user-defined digital watermark template. The digital watermark type cannot be modified.
     * @param req ModifyBlindWatermarkTemplateRequest
     * @return ModifyBlindWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlindWatermarkTemplateResponse ModifyBlindWatermarkTemplate(ModifyBlindWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlindWatermarkTemplate", ModifyBlindWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to modify CDN domain configuration.
     * @param req ModifyCDNDomainConfigRequest
     * @return ModifyCDNDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCDNDomainConfigResponse ModifyCDNDomainConfig(ModifyCDNDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCDNDomainConfig", ModifyCDNDomainConfigResponse.class);
    }

    /**
     *Modifies media classification attributes.
     * @param req ModifyClassRequest
     * @return ModifyClassResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClassResponse ModifyClass(ModifyClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClass", ModifyClassResponse.class);
    }

    /**
     *This API is no longer maintained. The new version of the moderation template supports video and image moderation. For details, please see [Modify Moderation Template](https://www.tencentcloud.com/document/API/266/84388?from_cn_redirect=1).
Modify a user-customized audio/video moderation template.
     * @param req ModifyContentReviewTemplateRequest
     * @return ModifyContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentReviewTemplateResponse ModifyContentReviewTemplate(ModifyContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContentReviewTemplate", ModifyContentReviewTemplateResponse.class);
    }

    /**
     *This API is used to modify the default distribution configuration.
* Distribution domain name and distribution protocol, which are the domain name and protocol in the media file distribution URL. Media files are distributed based on the default distribution configuration.
Playback key, used to calculate player signature.
     * @param req ModifyDefaultDistributionConfigRequest
     * @return ModifyDefaultDistributionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultDistributionConfigResponse ModifyDefaultDistributionConfig(ModifyDefaultDistributionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDefaultDistributionConfig", ModifyDefaultDistributionConfigResponse.class);
    }

    /**
     *This API is used to set the default storage region. If no region is specified during file upload, files are uploaded to the default region.
     * @param req ModifyDefaultStorageRegionRequest
     * @return ModifyDefaultStorageRegionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultStorageRegionResponse ModifyDefaultStorageRegion(ModifyDefaultStorageRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDefaultStorageRegion", ModifyDefaultStorageRegionResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of the [audio and video quality revival](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
Modify an audio and video quality rebirth template.
     * @param req ModifyEnhanceMediaTemplateRequest
     * @return ModifyEnhanceMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnhanceMediaTemplateResponse ModifyEnhanceMediaTemplate(ModifyEnhanceMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnhanceMediaTemplate", ModifyEnhanceMediaTemplateResponse.class);
    }

    /**
     *Tencent Cloud VOD provides customers with media upload, media management, media processing, and other services. During or after the execution of these services, Tencent Cloud VOD also provides various event notifications, allowing developers to sense the service processing status and perform the next business operation.

Developers can call this API to:
- Set the type for receiving callback notifications. There are two types: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1) and [Reliable Notification Based on Message Queue](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1).
- For [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1), you can set the address for 3.0 format callback. For details on 3.0 format callback, see [Historical format callback](https://www.tencentcloud.com/document/product/266/33796?from_cn_redirect=1).
-Select receipt or ignore settings for notification events of a specific event service.
     * @param req ModifyEventConfigRequest
     * @return ModifyEventConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEventConfigResponse ModifyEventConfig(ModifyEventConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEventConfig", ModifyEventConfigResponse.class);
    }

    /**
     *Modify a title and trailer template.
     * @param req ModifyHeadTailTemplateRequest
     * @return ModifyHeadTailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHeadTailTemplateResponse ModifyHeadTailTemplate(ModifyHeadTailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHeadTailTemplate", ModifyHeadTailTemplateResponse.class);
    }

    /**
     *Modify a user-customized image sprite template.
     * @param req ModifyImageSpriteTemplateRequest
     * @return ModifyImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSpriteTemplateResponse ModifyImageSpriteTemplate(ModifyImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageSpriteTemplate", ModifyImageSpriteTemplateResponse.class);
    }

    /**
     *Modify an instant transcoding template.
-Note: Once a just in time transcoding template is created, modification is not recommended. If parameter modification is needed, adding a new template is recommended.
     * @param req ModifyJustInTimeTranscodeTemplateRequest
     * @return ModifyJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJustInTimeTranscodeTemplateResponse ModifyJustInTimeTranscodeTemplate(ModifyJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJustInTimeTranscodeTemplate", ModifyJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *Modify a knowledge base. The name and/or description of the knowledge base can be modified. At least one of the Name or Description fields is required.
     * @param req ModifyKnowledgeBaseRequest
     * @return ModifyKnowledgeBaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKnowledgeBaseResponse ModifyKnowledgeBase(ModifyKnowledgeBaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKnowledgeBase", ModifyKnowledgeBaseResponse.class);
    }

    /**
     *Modifies a large model parsing template
     * @param req ModifyLLMComprehendTemplateRequest
     * @return ModifyLLMComprehendTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLLMComprehendTemplateResponse ModifyLLMComprehendTemplate(ModifyLLMComprehendTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLLMComprehendTemplate", ModifyLLMComprehendTemplateResponse.class);
    }

    /**
     *Modify a user-customized MPS task template.
When modifying a template, fill in the MPS related parameters in JSON format into the MPSModifyTemplateParams parameter. For task parameter configuration methods, refer to the MPS task template documentation.
     * @param req ModifyMPSTemplateRequest
     * @return ModifyMPSTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMPSTemplateResponse ModifyMPSTemplate(ModifyMPSTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMPSTemplate", ModifyMPSTemplateResponse.class);
    }

    /**
     *This API is used to modify the attributes of a media file, including category, name, description, tag, expiration time, dotting information, video cover, and subtitle information.
     * @param req ModifyMediaInfoRequest
     * @return ModifyMediaInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaInfoResponse ModifyMediaInfo(ModifyMediaInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMediaInfo", ModifyMediaInfoResponse.class);
    }

    /**
     *Modify the storage type of media files.
When the file storage type is standard storage, it can be modified to the following types:
<li>Infrequent storage</li>
<li>Archive storage</li>
<li>DEEP_ARCHIVE</li>
When the current storage type of a media file is infrequent storage, it can be modified to the following types:
<li>Standard storage</li>
<li>Archive storage</li>
<li>DEEP_ARCHIVE</li>
When the current storage type of a media file is archive storage, it can be modified to the following types:
<li>Standard storage</li>
When the current storage type of a media file is DEEP_ARCHIVE, it can be modified to the following types:
<li>Standard storage</li>
     * @param req ModifyMediaStorageClassRequest
     * @return ModifyMediaStorageClassResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaStorageClassResponse ModifyMediaStorageClass(ModifyMediaStorageClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMediaStorageClass", ModifyMediaStorageClassResponse.class);
    }

    /**
     *This API is used to modify material sample information based on the material ID, including the modification of the name and description, as well as the addition, deletion, and reset of facial features and tags. The deletion of facial features must ensure at least 1 image remains. Otherwise, please use the reset operation.
     * @param req ModifyPersonSampleRequest
     * @return ModifyPersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonSampleResponse ModifyPersonSample(ModifyPersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPersonSample", ModifyPersonSampleResponse.class);
    }

    /**
     *This API is used to modify a user-customized asynchronous image processing template.

Note: Templates with IDs below 10000 are system-preset templates and are not allowed to be modified.
     * @param req ModifyProcessImageAsyncTemplateRequest
     * @return ModifyProcessImageAsyncTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProcessImageAsyncTemplateResponse ModifyProcessImageAsyncTemplate(ModifyProcessImageAsyncTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProcessImageAsyncTemplate", ModifyProcessImageAsyncTemplateResponse.class);
    }

    /**
     *Modifies an audio and video quality detection template.
     * @param req ModifyQualityInspectTemplateRequest
     * @return ModifyQualityInspectTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQualityInspectTemplateResponse ModifyQualityInspectTemplate(ModifyQualityInspectTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQualityInspectTemplate", ModifyQualityInspectTemplateResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. The new version of the [Audio and Video Quality Rebirth](https://www.tencentcloud.com/document/product/266/102571?from_cn_redirect=1) API uses preset templates. For details, see [Audio and Video Quality Rebirth Template](https://www.tencentcloud.com/document/product/266/102586?from_cn_redirect=1#50604b3f-0286-4a10-a3f7-18218116aff7).
Modify a video rebirth template.
     * @param req ModifyRebuildMediaTemplateRequest
     * @return ModifyRebuildMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRebuildMediaTemplateResponse ModifyRebuildMediaTemplate(ModifyRebuildMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRebuildMediaTemplate", ModifyRebuildMediaTemplateResponse.class);
    }

    /**
     *Modify a user-customized moderation template.
>Template is applicable only to the [ReviewAudioVideo](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) and [ReviewImage](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1) APIs.
     * @param req ModifyReviewTemplateRequest
     * @return ModifyReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReviewTemplateResponse ModifyReviewTemplate(ModifyReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReviewTemplate", ModifyReviewTemplateResponse.class);
    }

    /**
     *This API is used to modify a carousel playlist.
After modification, only new playback requests will take effect. Users already playing can still play the original playlist within 7 days.
     * @param req ModifyRoundPlayRequest
     * @return ModifyRoundPlayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoundPlayResponse ModifyRoundPlay(ModifyRoundPlayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoundPlay", ModifyRoundPlayResponse.class);
    }

    /**
     *Modify a custom sampled screenshot template.
     * @param req ModifySampleSnapshotTemplateRequest
     * @return ModifySampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleSnapshotTemplateResponse ModifySampleSnapshotTemplate(ModifySampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySampleSnapshotTemplate", ModifySampleSnapshotTemplateResponse.class);
    }

    /**
     *Modify a user-customized specified time point screenshot template.
     * @param req ModifySnapshotByTimeOffsetTemplateRequest
     * @return ModifySnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotByTimeOffsetTemplateResponse ModifySnapshotByTimeOffsetTemplate(ModifySnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate", ModifySnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *This API is used to change application information, but the default application info is not allowed to be modified.
     * @param req ModifySubAppIdInfoRequest
     * @return ModifySubAppIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubAppIdInfoResponse ModifySubAppIdInfo(ModifySubAppIdInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubAppIdInfo", ModifySubAppIdInfoResponse.class);
    }

    /**
     *This API is used to enable or disable an application. A disabled application will have its corresponding domain blocked and console access restricted.
     * @param req ModifySubAppIdStatusRequest
     * @return ModifySubAppIdStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubAppIdStatusResponse ModifySubAppIdStatus(ModifySubAppIdStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubAppIdStatus", ModifySubAppIdStatusResponse.class);
    }

    /**
     *This API is <font color='red'>no longer maintained</font>. The new version of player signature no longer uses player configuration templates. For details, please see [Player Signature](https://www.tencentcloud.com/document/product/266/45554?from_cn_redirect=1).
This API is used to modify player configurations.
     * @param req ModifySuperPlayerConfigRequest
     * @return ModifySuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySuperPlayerConfigResponse ModifySuperPlayerConfig(ModifySuperPlayerConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySuperPlayerConfig", ModifySuperPlayerConfigResponse.class);
    }

    /**
     *Modify the information of a custom transcoding template.
     * @param req ModifyTranscodeTemplateRequest
     * @return ModifyTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTranscodeTemplateResponse ModifyTranscodeTemplate(ModifyTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTranscodeTemplate", ModifyTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to modify the acceleration region of a vod domain.
1. The acceleration region can be modified only when the domain name deployment state is Online.
     * @param req ModifyVodDomainAccelerateConfigRequest
     * @return ModifyVodDomainAccelerateConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVodDomainAccelerateConfigResponse ModifyVodDomainAccelerateConfig(ModifyVodDomainAccelerateConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVodDomainAccelerateConfig", ModifyVodDomainAccelerateConfigResponse.class);
    }

    /**
     *This API is used to modify domain name configuration, including hotlink protection configuration.
1. The domain name configuration can be modified only when the domain name deployment state is Online.
     * @param req ModifyVodDomainConfigRequest
     * @return ModifyVodDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVodDomainConfigResponse ModifyVodDomainConfig(ModifyVodDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVodDomainConfig", ModifyVodDomainConfigResponse.class);
    }

    /**
     *This API is used to modify a user-defined watermark template. The watermark type cannot be modified.
     * @param req ModifyWatermarkTemplateRequest
     * @return ModifyWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWatermarkTemplateResponse ModifyWatermarkTemplate(ModifyWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWatermarkTemplate", ModifyWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to modify the scenario and tags of a keyword. The keyword itself cannot be modified. If modification is needed, delete and rebuild it.
     * @param req ModifyWordSampleRequest
     * @return ModifyWordSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWordSampleResponse ModifyWordSample(ModifyWordSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWordSample", ModifyWordSampleResponse.class);
    }

    /**
     *When uploading HLS videos, this API parses the index file content and returns a list of shard files to be uploaded. The shard file path must be a relative path in the current directory or subdirectory. It cannot be a URL or an absolute path.
     * @param req ParseStreamingManifestRequest
     * @return ParseStreamingManifestResponse
     * @throws TencentCloudSDKException
     */
    public ParseStreamingManifestResponse ParseStreamingManifest(ParseStreamingManifestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseStreamingManifest", ParseStreamingManifestResponse.class);
    }

    /**
     *This API is used to process image processing tasks.
     * @param req ProcessImageAsyncRequest
     * @return ProcessImageAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ProcessImageAsyncResponse ProcessImageAsync(ProcessImageAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessImageAsync", ProcessImageAsyncResponse.class);
    }

    /**
     *This API is used to initiate processing tasks for audio-video media in VOD, with features including:
1. Video transcoding (watermarked);
2. Animated image generating;
3. Screenshot taking at specified time points;
4. Sampled screenshot taking;
5. Capture CSS sprites for videos;
6. Capture a frame from a video as the cover.
7. Transcoding to adaptive bitrate streaming and encrypting;
8. Content review (offensive content, unsafe information, inappropriate information). It is <font color=red>not recommended</font> to use this API to initiate it. [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1) is recommended.
9. Content analysis (tag, categorization, cover, frame tagging) is not supported for HLS format currently.
10. Content recognition (video intro and outro, human face, full text, text keyword, full speech, speech keyword, object).

If event notification is used, the event notification type is task flow status change (https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1).
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMedia", ProcessMediaResponse.class);
    }

    /**
     *Use the media processing capability of the media processing service (MPS) to initiate media processing for videos in video-on-demand.
Currently supported MPS features:
1. Smart subtitling: This feature supports processing offline audio files, video files, and live streams. It can extract source language captions from videos through ASR speech recognition or OCR text recognition, and implement multilingual translation. View details in the Access Guide (https://www.tencentcloud.com/document/product/266/131210?from_cn_redirect=1).
2. Intelligent erasure: It can blur, mosaic, or seamlessly process elements such as logos, subtitles, human faces, and license plates in video footage, making it easy to spread and share content. The new video generated by this task will be assigned a new FileId and stored in a sub-application of the VOD platform. View details in the Access Guide (https://www.tencentcloud.com/document/product/266/131211?from_cn_redirect=1).
3. AI analysis: This feature supports one-stop translation (https://www.tencentcloud.com/document/product/266/131212?from_cn_redirect=1), highlights (https://www.tencentcloud.com/document/product/266/131213?from_cn_redirect=1), LLM video summary (https://www.tencentcloud.com/document/product/266/131214?from_cn_redirect=1), LLM audio/video understanding (https://www.tencentcloud.com/document/product/266/131215?from_cn_redirect=1), intelligent splitting (https://www.tencentcloud.com/document/product/266/131216?from_cn_redirect=1), intelligent landscape-to-portrait (https://www.tencentcloud.com/document/product/266/131217?from_cn_redirect=1), video deduplication (https://www.tencentcloud.com/document/product/266/131218?from_cn_redirect=1), and other features.


> Video processing task initiated this method:
> 1. Query task status and results on the VOD platform. Use [DescribeTaskDetail](https://www.tencentcloud.com/document/product/266/33431?from_cn_redirect=1) or [DescribeTasks](https://www.tencentcloud.com/document/product/266/33430?from_cn_redirect=1) to query tasks.
> 2. The usage and bills of related features will be provided on the PS platform. Before using this feature, start by enabling Media Processing Service (MPS) in the console. For the activation method, see the preliminary operations in the access documentation.
     * @param req ProcessMediaByMPSRequest
     * @return ProcessMediaByMPSResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByMPSResponse ProcessMediaByMPS(ProcessMediaByMPSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMediaByMPS", ProcessMediaByMPSResponse.class);
    }

    /**
     *Use a task flow template to initiate processing tasks for videos in VOD.
There are two ways to create a task flow template:
1. Create and modify a task flow template in the console;
2. Create a task flow template through the task flow template API.

If event notification is used, the type of event notification for tasks other than audio/video moderation tasks is task flow status change (https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1); the type of event notification for audio/video moderation tasks is audio/video moderation completed (https://www.tencentcloud.com/document/product/266/81258?from_cn_redirect=1).
     * @param req ProcessMediaByProcedureRequest
     * @return ProcessMediaByProcedureResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByProcedureResponse ProcessMediaByProcedure(ProcessMediaByProcedureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMediaByProcedure", ProcessMediaByProcedureResponse.class);
    }

    /**
     *This API is <font color='red'>no longer maintained</font>. Please use the [ProcessMedia](https://www.tencentcloud.com/document/product/862/37578?from_cn_redirect=1) API of MPS and specify the video URL in the input parameter InputInfo.UrlInputInfo.Url.
     * @param req ProcessMediaByUrlRequest
     * @return ProcessMediaByUrlResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByUrlResponse ProcessMediaByUrl(ProcessMediaByUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMediaByUrl", ProcessMediaByUrlResponse.class);
    }

    /**
     ** This API is used for the business server to get event notifications via reliable callback (https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83).
* The API uses long polling mode. If there are unconsumed events on the server, they will be returned to the requester immediately. If there are no unconsumed events, the request will be suspended in the background until a new event occurs.
* The request can be suspended for up to 5 seconds. It is advisable to set the timeout to 10 seconds for the requester;
* Event notifications that are not pulled are retained for up to 4 days. Notifications exceeding this time limit may be purged.
* If this API returns an event, the caller must call the [Confirm Event Notification](https://www.tencentcloud.com/document/product/266/33434?from_cn_redirect=1) API within <font color="red">30 seconds</font> to confirm that the event notification has been processed. Otherwise, the event notification will be pulled again after <font color="red">30 seconds</font>.
* Currently, a maximum of 16 event notifications can be obtained per API call.
     * @param req PullEventsRequest
     * @return PullEventsResponse
     * @throws TencentCloudSDKException
     */
    public PullEventsResponse PullEvents(PullEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullEvents", PullEventsResponse.class);
    }

    /**
     *This API is used to pull a video from the network to the VOD platform.
     * @param req PullUploadRequest
     * @return PullUploadResponse
     * @throws TencentCloudSDKException
     */
    public PullUploadResponse PullUpload(PullUploadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullUpload", PullUploadResponse.class);
    }

    /**
     *1. Preheat a specified URL list.
2. The domain name of the URL must be registered in VOD.
3. A single request can specify up to 20 URLs.
4. The default prefetch quota is 10,000 URLs per day.
     * @param req PushUrlCacheRequest
     * @return PushUrlCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlCacheResponse PushUrlCache(PushUrlCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PushUrlCache", PushUrlCacheResponse.class);
    }

    /**
     *The API is <font color=red>no longer maintained</font>. Please use the new version of APIs [Audio and Video Quality Revival](https://www.tencentcloud.com/document/api/266/102571?from_cn_redirect=1).
This API is used to initiate audio and video quality revival.
     * @param req RebuildMediaRequest
     * @return RebuildMediaResponse
     * @throws TencentCloudSDKException
     */
    public RebuildMediaResponse RebuildMedia(RebuildMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebuildMedia", RebuildMediaResponse.class);
    }

    /**
     *This API is <font color=red>no longer maintained</font>. Please use the new version of APIs [audio and video quality revival](https://www.tencentcloud.com/document/api/266/102571?from_cn_redirect=1).
Use a template to initiate video rebirth.
     * @param req RebuildMediaByTemplateRequest
     * @return RebuildMediaByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public RebuildMediaByTemplateResponse RebuildMediaByTemplate(RebuildMediaByTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebuildMediaByTemplate", RebuildMediaByTemplateResponse.class);
    }

    /**
     *1. Refreshes a specified URL list.
2. The domain name of the URL must be registered in VOD.
3. A maximum of 20 URLs can be specified per request.
4. The default refresh quota is 100,000 URLs per day.
     * @param req RefreshUrlCacheRequest
     * @return RefreshUrlCacheResponse
     * @throws TencentCloudSDKException
     */
    public RefreshUrlCacheResponse RefreshUrlCache(RefreshUrlCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshUrlCache", RefreshUrlCacheResponse.class);
    }

    /**
     *Removes watermarks intelligently
     * @param req RemoveWatermarkRequest
     * @return RemoveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWatermarkResponse RemoveWatermark(RemoveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveWatermark", RemoveWatermarkResponse.class);
    }

    /**
     *Reset the content of the user-defined task flow template.
     * @param req ResetProcedureTemplateRequest
     * @return ResetProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ResetProcedureTemplateResponse ResetProcedureTemplate(ResetProcedureTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetProcedureTemplate", ResetProcedureTemplateResponse.class);
    }

    /**
     *When the storage type of a media file is archive storage or deep archive storage, it is inaccessible. If you need access, call this API to unfreeze it. The unfrozen media file is temporarily accessible and becomes inaccessible after the validity period expires.
     * @param req RestoreMediaRequest
     * @return RestoreMediaResponse
     * @throws TencentCloudSDKException
     */
    public RestoreMediaResponse RestoreMedia(RestoreMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreMedia", RestoreMediaResponse.class);
    }

    /**
     *This API is used to initiate moderation tasks for on-demand audio-video media, intelligently detecting violative content in video footage, text in images, text in speech, and sounds.

If event notification is used, its type is [audio/video moderation completed](https://www.tencentcloud.com/document/product/266/81258?from_cn_redirect=1).
     * @param req ReviewAudioVideoRequest
     * @return ReviewAudioVideoResponse
     * @throws TencentCloudSDKException
     */
    public ReviewAudioVideoResponse ReviewAudioVideo(ReviewAudioVideoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReviewAudioVideo", ReviewAudioVideoResponse.class);
    }

    /**
     *Initiate a review task for image files in on-demand video for offensive, unsafe, and inappropriate information.

<li>Supported image file size: file < 5M;</li>
<li>Supported image file resolution: recommended resolution above 256x256, otherwise review effectiveness may be affected;</li>
<li>Image file formats supported: PNG, JPG, JPEG, BMP, GIF, WEBP.</li>
     * @param req ReviewImageRequest
     * @return ReviewImageResponse
     * @throws TencentCloudSDKException
     */
    public ReviewImageResponse ReviewImage(ReviewImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReviewImage", ReviewImageResponse.class);
    }

    /**
     *This API is used to search media information with multiple filter criteria, sort and filter returned results, and other features. This includes:
-Specify the file ID collection FileIds to return media matching any ID in the collection.
-Do fuzzy search based on multiple media file Names or Descriptions.
-Search by multiple filename prefixes NamePrefixes.
- Specify the category collection ClassIds (see input parameters), and media that meet any category in the collection will be returned. For example, media categories include movies, TV series, and variety shows. The movie category has subcategories such as historical films, action films, and romance films. If ClassIds specifies movies and TV series, all subcategories under movies and TV series will be returned. If ClassIds specifies historical films and action films, only media under these two subcategories will be returned.
- Specify tag collection Tags (see input parameters) to return media that meets any tag in the collection. For example, if media tags include ACG, palace intrigue, and parody remix, and Tags specifies ACG and parody remix, any media that matches either of these two tags will be retrieved.
-Specify a collection of file types in Categories (see input parameters) to return media that meets any type in the collection. For example, file types include Video, Audio, and Image. If Categories specifies Video and Audio, media that meets these types will be retrieved.
-Specify the source collection SourceTypes (see input parameters) to return media that meets any source in the collection. For example, media sources include Record (live recording), Upload, and so on. If SourceTypes specifies Record and Upload, media that meets these sources will be retrieved.
-Specify the file muxing format set MediaTypes (see input parameters), and return media that meet any muxing format in the collection. For example, muxing formats include MP4, AVI, MP3, and so on. If MediaTypes specifies MP4 and MP3, media that comply with these muxing formats will be retrieved.
-Specify the file status collection Status (see input parameters) to return media that meets any status in the collection. For example, file statuses include Normal, SystemForbidden (Platform Ban), and Forbidden (proactive ban). If Status specifies Normal and Forbidden, media that meets these statuses will be retrieved.
-Specify the file moderation result set ReviewResults (see input parameters) to return media that meet any status in the collection. For example, file moderation results include pass and block. If ReviewResults specifies pass and block, media that meet these review results will be retrieved.
-Filter the media of live recording service by the specified collection of live streaming codes StreamIds (see input parameter).
-Filter media by the create time range of the specified media.
-Specify a TRTC application ID collection to filter media.
-Specify a TRTC room ID collection to filter media.

-The above parameters can be combined in any way for search. For example, filter media with a creation time between 2018-12-01 12:00:00 and 2018-12-08 12:00:00, categorized as movie or TV series, and tagged with palace intrigue and suspense. Note that for any parameter that supports array input, the search logic between its elements is "OR". The logical relationship between all parameters is "AND".

-Allow passage of Filters to control the type of media information returned (default return all information). Selectable inputs include:
1. Basic information (basicInfo): including media name, category, playback address, cover image, etc.
2. Meta information (metaData): including size, duration, video stream information, and audio stream information.
3. Transcode result information (transcodeInfo): includes media addresses, video stream parameters, and audio stream parameters of various specifications generated for the transcoded media.
4. animatedGraphicsInfo: The animated graphics info after converting a video to GIF (for example, gif).
5. sampleSnapshotInfo: Screenshot information after video sampling.
6. Sprite image information (imageSpriteInfo): sprite image information after capturing sprite images from a video.
7. snapshotByTimeOffsetInfo: screenshot information after taking screenshots at specified time points.
8. Video timestamp information (keyFrameDescInfo): Dotting information set for the video.
9. Adaptive Bitrate Streaming information (adaptiveDynamicStreamingInfo): includes specification, encryption type, packaging format and other related information.

-Allow sorting results by creation time and return them in pages. Use Offset and Limit (see input parameters) to control pagination.

<div id="maxResultsDesc">API return result count limit:</div>

- <b><a href="#p_offset">Offset</a> and <a href="#p_limit">Limit</a> both parameters impact the number of results per pagination query. Special attention: When both values are not specified, this interface returns up to 10 query results only.</b>
-<b>It supports returning up to 5000 search results. Results beyond this limit are no longer queryable. If the search result volume is too large, use more granular criteria to reduce the search results.</b>

<br>Not recommended conditional filtering:
-(Not recommended: use Names, NamePrefixes, or Descriptions instead) Specify a single Text to do fuzzy search on media file Names or Descriptions.
-(Not recommended: use SourceTypes instead) Specify a single media file source SourceType for search.
-(Not recommended: use StreamIds instead) Specify single push stream live code StreamId for search.
-(Not recommended: use CreateTime instead) Specify a single starting creation time StartTime to search.
-(Not recommended: use CreateTime instead) Specify a single ending creation time EndTime to search.
     * @param req SearchMediaRequest
     * @return SearchMediaResponse
     * @throws TencentCloudSDKException
     */
    public SearchMediaResponse SearchMedia(SearchMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchMedia", SearchMediaResponse.class);
    }

    /**
     *Use natural language to conduct semantic search on media.
     * @param req SearchMediaBySemanticsRequest
     * @return SearchMediaBySemanticsResponse
     * @throws TencentCloudSDKException
     */
    public SearchMediaBySemanticsResponse SearchMediaBySemantics(SearchMediaBySemanticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchMediaBySemantics", SearchMediaBySemanticsResponse.class);
    }

    /**
     *Set a delivery target for the VOD domain in CLS.
     * @param req SetCLSPushTargetRequest
     * @return SetCLSPushTargetResponse
     * @throws TencentCloudSDKException
     */
    public SetCLSPushTargetResponse SetCLSPushTarget(SetCLSPushTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCLSPushTarget", SetCLSPushTargetResponse.class);
    }

    /**
     *Sets DRM key provider information.
     * @param req SetDrmKeyProviderInfoRequest
     * @return SetDrmKeyProviderInfoResponse
     * @throws TencentCloudSDKException
     */
    public SetDrmKeyProviderInfoResponse SetDrmKeyProviderInfo(SetDrmKeyProviderInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDrmKeyProviderInfo", SetDrmKeyProviderInfoResponse.class);
    }

    /**
     *Set the HTTPS certificate for a vod domain.
     * @param req SetVodDomainCertificateRequest
     * @return SetVodDomainCertificateResponse
     * @throws TencentCloudSDKException
     */
    public SetVodDomainCertificateResponse SetVodDomainCertificate(SetVodDomainCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVodDomainCertificate", SetVodDomainCertificateResponse.class);
    }

    /**
     *Crop an HLS video by time period to generate a new HLS video in real time. Developers can share it immediately or store it for long-term preservation.

Tencent Cloud VOD supports two editing modes:
-Edit and save: Save the edited video as an independent video with an independent FileId. This is suitable for long-term preservation of highlights.
- Editing is not solidified: The edited video is attached to the input file and has no standalone FileId. This is suitable for scenarios where highlight clips are shared temporarily.

This API is used to crop an m3u8 file based on input. Its minimum editing precision is one ts slice, so second-level or more precise editing precision cannot be achieved.

### Edit solidification
Editing solidification refers to saving an edited video as an independent video with its own FileId. Its lifecycle is not subject to the original input video. Even if the original input video is deleted, the clipping result is not impacted. You can also transcode it or publish it on WeChat.

For example, a complete football match raw video may last for 2 hours. For cost savings, a customer can store this video for 2 months, but can specify longer storage for the edited "highlights" video. You can also separately transcode the "highlights" video, publish it on WeChat, and perform other additional on-demand operations. In this case, you can choose the edit and solidify solution.

The advantage of edit solidification is that its lifecycle is independent of the original input video, allowing separate management and long-term preservation.

<font color='red'>Note:</font> If solidification is specified when editing, enable reception of editing solidification event notifications through the ModifyEventConfig API. After successful solidification, you will receive a PersistenceComplete event notification. Before receiving this event notification, you should not delete or reduce the storage class of the original input video. Otherwise, playback of the generated video may be abnormal.

### Editing is not solidified
Editing is not solidified, which means the result of editing (m3u8 file) shares the same TS segments with the original input video. The generated video is not an independent and complete video (no independent FileId, only a playback URL), and its valid period is consistent with that of the original input full video. Once the original input video is deleted, the clip will also become unplayable.

Editing is not solidified. Since the clipping result is not an independent video, it is not included in video management of on-demand media assets (for example, the total number of videos in the console does not count this video clip), and no video processing operation such as transcoding or WeChat publishing can be performed on this video clip separately.

The advantage of non-solidified editing is that the editing operation is Relatively "lightweight" and will not generate additional storage overhead. However, its shortcoming is that the lifecycle is identical to the original recorded video, and it is unable to further perform video processing such as transcoding.
     * @param req SimpleHlsClipRequest
     * @return SimpleHlsClipResponse
     * @throws TencentCloudSDKException
     */
    public SimpleHlsClipResponse SimpleHlsClip(SimpleHlsClipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SimpleHlsClip", SimpleHlsClipResponse.class);
    }

    /**
     *This API is used to split an on-demand video and generate multiple new on-demand videos.
     * @param req SplitMediaRequest
     * @return SplitMediaResponse
     * @throws TencentCloudSDKException
     */
    public SplitMediaResponse SplitMedia(SplitMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SplitMedia", SplitMediaResponse.class);
    }

    /**
     *This API is used to enable or disable a CDN acceleration domain name.
     * @param req StartCDNDomainRequest
     * @return StartCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartCDNDomainResponse StartCDNDomain(StartCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCDNDomain", StartCDNDomainResponse.class);
    }

    /**
     *This API is used to initiate a text to speech task, synthesizing text into speech for long text scenarios (up to 200,000 characters). It supports specifying voice tone and synthesis parameters such as speaking rate, volume, pitch, sampling rate, and output format. Text to speech is an asynchronous task, and audio is generated upon completion.
     * @param req TextToSpeechAsyncRequest
     * @return TextToSpeechAsyncResponse
     * @throws TencentCloudSDKException
     */
    public TextToSpeechAsyncResponse TextToSpeechAsync(TextToSpeechAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToSpeechAsync", TextToSpeechAsyncResponse.class);
    }

    /**
     *Initiate a text to speech task to convert text into speech.
     * @param req TextToSpeechSyncRequest
     * @return TextToSpeechSyncResponse
     * @throws TencentCloudSDKException
     */
    public TextToSpeechSyncResponse TextToSpeechSync(TextToSpeechSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToSpeechSync", TextToSpeechSyncResponse.class);
    }

    /**
     *Creates a Token for invoking AIGC APIs. Data sync has a delay once created. It can be queried or deleted after about 30 seconds.
     * @param req UpdateAigcApiTokenRequest
     * @return UpdateAigcApiTokenResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAigcApiTokenResponse UpdateAigcApiToken(UpdateAigcApiTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAigcApiToken", UpdateAigcApiTokenResponse.class);
    }

    /**
     *This API is used to update the profile information of a voice by voice ID, including name, description, gender, age, language, tags, and scenarios, and return the complete voice information after the update. Only voices under this account can be updated. System preset voices do not support update.

Note: Newly designed or cloned voice types cannot be updated before activation. They are activated only after the new voice type is used for TTS once.
     * @param req UpdateVoiceRequest
     * @return UpdateVoiceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateVoiceResponse UpdateVoice(UpdateVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateVoice", UpdateVoiceResponse.class);
    }

    /**
     *This API is used to verify domain name resolution values.
     * @param req VerifyDomainRecordRequest
     * @return VerifyDomainRecordResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDomainRecordResponse VerifyDomainRecord(VerifyDomainRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyDomainRecord", VerifyDomainRecordResponse.class);
    }

}
