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
     ** This API is used to apply for uploading a media file (and cover file) to VOD and obtain the metadata of file storage (including upload path and upload signature) for subsequent use by the uploading API.
* For the detailed upload process, please see [Overview of Upload from Client](https://intl.cloud.tencent.com/document/product/266/9759?from_cn_redirect=1).
     * @param req ApplyUploadRequest
     * @return ApplyUploadResponse
     * @throws TencentCloudSDKException
     */
    public ApplyUploadResponse ApplyUpload(ApplyUploadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyUpload", ApplyUploadResponse.class);
    }

    /**
     *This API is used to associate/disassociate subtitles with/from a media file of a specific adaptive bitrate streaming template ID.
     * @param req AttachMediaSubtitlesRequest
     * @return AttachMediaSubtitlesResponse
     * @throws TencentCloudSDKException
     */
    public AttachMediaSubtitlesResponse AttachMediaSubtitles(AttachMediaSubtitlesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachMediaSubtitles", AttachMediaSubtitlesResponse.class);
    }

    /**
     *Clone CDN Domain.
     * @param req CloneCDNDomainRequest
     * @return CloneCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public CloneCDNDomainResponse CloneCDNDomain(CloneCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneCDNDomain", CloneCDNDomainResponse.class);
    }

    /**
     *This API is used to confirm the result of uploading a media file (and cover file) to VOD, store the media information, and return the playback address and ID of the file.
     * @param req CommitUploadRequest
     * @return CommitUploadResponse
     * @throws TencentCloudSDKException
     */
    public CommitUploadResponse CommitUpload(CommitUploadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitUpload", CommitUploadResponse.class);
    }

    /**
     *This API is used to compose a media file. You can use it to do the following:

1. **Rotation/Flipping**: Rotate a video or image by a specific angle or flip a video or image.
2. **Audio control**: Increase/Lower the volume of an audio/video file or mute an audio/video file.
3. **Overlaying**: Overlay videos/images in a specified sequence to achieve the picture-in-picture effect.
4. **Audio mixing**: Mix the audios of audio/video files.
5 **Audio extraction**: Extract audio from a video.
6. **Clipping**: Clip segments from audio/video files according to a specified start and end time.
7. **Splicing**: Splice videos/audios/images in a specified sequence.
8. **Transition**: Add transition effects between video segments or images that are spliced together.

The output file is in MP4 or MP3 format. In the callback for media composition, the event type is [ComposeMediaComplete](https://intl.cloud.tencent.com/document/product/266/43000?from_cn_redirect=1).
     * @param req ComposeMediaRequest
     * @return ComposeMediaResponse
     * @throws TencentCloudSDKException
     */
    public ComposeMediaResponse ComposeMedia(ComposeMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ComposeMedia", ComposeMediaResponse.class);
    }

    /**
     ** After the `PullEvents` API is called to get an event, this API must be called to confirm that the message has been received;
* After the event handler is obtained, the validity period of waiting for confirmation is 30 seconds. If the wait exceeds 30 seconds, a parameter error will be reported (4000);
* For more information, please see the [reliable callback](https://intl.cloud.tencent.com/document/product/266/33779?from_cn_redirect=1#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83) of event notification.
     * @param req ConfirmEventsRequest
     * @return ConfirmEventsResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmEventsResponse ConfirmEvents(ConfirmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmEvents", ConfirmEventsResponse.class);
    }

    /**
     *Create a user-defined audio and video content analysis template. Maximum quantity: 50. HLS format not supported currently.
     * @param req CreateAIAnalysisTemplateRequest
     * @return CreateAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAnalysisTemplateResponse CreateAIAnalysisTemplate(CreateAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIAnalysisTemplate", CreateAIAnalysisTemplateResponse.class);
    }

    /**
     *This API is used to create a custom video content recognition template. Up to 50 templates can be created.
     * @param req CreateAIRecognitionTemplateRequest
     * @return CreateAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIRecognitionTemplateResponse CreateAIRecognitionTemplate(CreateAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIRecognitionTemplate", CreateAIRecognitionTemplateResponse.class);
    }

    /**
     *This API is used to create an adaptive bitrate streaming template. Up to 100 templates can be created.
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
     *This API is used to create a Token for invoking AIGC API. After creation, there is a delay in data sync. It becomes queryable or deletable after about 30 seconds.
     * @param req CreateAigcApiTokenRequest
     * @return CreateAigcApiTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcApiTokenResponse CreateAigcApiToken(CreateAigcApiTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcApiToken", CreateAigcApiTokenResponse.class);
    }

    /**
     *This API is used to create AIGC voice replication. Note that calling this API will incur fees. See the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
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
     *Call this API to target a specified model and perform subject creation.
     * @param req CreateAigcCustomElementRequest
     * @return CreateAigcCustomElementResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcCustomElementResponse CreateAigcCustomElement(CreateAigcCustomElementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcCustomElement", CreateAigcCustomElementResponse.class);
    }

    /**
     *This API is used to create custom voice types for AIGC.
     * @param req CreateAigcCustomVoiceRequest
     * @return CreateAigcCustomVoiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcCustomVoiceResponse CreateAigcCustomVoice(CreateAigcCustomVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcCustomVoice", CreateAigcCustomVoiceResponse.class);
    }

    /**
     *This API is used to generate AIGC images. The default limit is 1 concurrent processing. API calls will occur actual fee. Refer to the VOD AIGC image generation billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#9c4dc6ff-4b3f-4b25-bf2d-393889dfb9ac). The feature settlement mode is pay-as-you-go. Daily billing customers will be billed on the second day for usage on the day. Monthly billing customers will be billed on the 1st of the next month for usage in the previous month.
     * @param req CreateAigcImageTaskRequest
     * @return CreateAigcImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcImageTaskResponse CreateAigcImageTask(CreateAigcImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcImageTask", CreateAigcImageTaskResponse.class);
    }

    /**
     *This API is used to create AIGC custom subjects (Vidu). Note that calling this API may incur fees. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
     * @param req CreateAigcSubjectRequest
     * @return CreateAigcSubjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcSubjectResponse CreateAigcSubject(CreateAigcSubjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcSubject", CreateAigcSubjectResponse.class);
    }

    /**
     *This API is used to generate AIGC videos. API calls will occur actual fee. Refer to the video-on-demand [AIGC video generation billing documentation](https://www.tencentcloud.com/zh/document/product/266/14666#96b3b59a-f9e1-49e9-966a-bedb70a4bf12). The feature settlement mode is [pay-as-you-go](https://www.tencentcloud.com/document/product/266/2838?from_cn_redirect=1). Daily billing customers will be charged on the second day for usage on the day, while monthly billing customers will be billed on the 1st of the next month for usage in the previous month.
     * @param req CreateAigcVideoRedrawTaskRequest
     * @return CreateAigcVideoRedrawTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcVideoRedrawTaskResponse CreateAigcVideoRedrawTask(CreateAigcVideoRedrawTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcVideoRedrawTask", CreateAigcVideoRedrawTaskResponse.class);
    }

    /**
     *This API is used to generate AIGC videos. The default limit is 1 concurrent processing. API calls will incur actual fees. Refer to the VOD AIGC video generation billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12). The feature settlement mode is pay-as-you-go. Daily billing customers will be charged on the second day for usage on the day, while monthly settlement customers will be billed on the 1st of the next month for usage in the previous month.
     * @param req CreateAigcVideoTaskRequest
     * @return CreateAigcVideoTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAigcVideoTaskResponse CreateAigcVideoTask(CreateAigcVideoTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAigcVideoTask", CreateAigcVideoTaskResponse.class);
    }

    /**
     *This API is used to create a custom animated image generating template. Up to 16 templates can be created.
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
     *This API is used for adding domain names to VOD. A user can add up to 20 domain names. 1. After the domain name is added successfully, VOD will carry out the deployment of the domain name. It takes approximately 2 minutes for the domain name to change from the deployment status to the online status.
     * @param req CreateCDNDomainRequest
     * @return CreateCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateCDNDomainResponse CreateCDNDomain(CreateCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCDNDomain", CreateCDNDomainResponse.class);
    }

    /**
     ** This API is used to categorize media assets for management;
* It does not affect the categories of existing media assets. If you want to modify the category of a media asset, call the [ModifyMediaInfo](https://intl.cloud.tencent.com/document/product/266/31762?from_cn_redirect=1) API.
* There can be up to 4 levels of categories.
* One category can have up to 500 subcategories under it.
     * @param req CreateClassRequest
     * @return CreateClassResponse
     * @throws TencentCloudSDKException
     */
    public CreateClassResponse CreateClass(CreateClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClass", CreateClassResponse.class);
    }

    /**
     *Initiate complex adaptive bitstream processing. Features include:
1. Output HLS and DASH adaptive bitrate streams based on the specified template.
2. The content protection solution for adaptive bitrate streams is available in unencrypted, Widevine, or FairPlay.
3. Support adding opening and ending segments.
4. The output adaptive bitrate stream can include multilingual audio streams, each language comes from a different media file.
5. The output adaptive bitrate stream can include multilingual subtitles.

Notes:
1. When using the opening scene, the video stream in the media needs to align with the audio stream, otherwise will cause out-of-sync audio and video in the output content;
2. If the output adaptive bitrate stream needs to include the audio of the main media, then the FileId of the main media must be specified in the AudioSet parameter.
3. To use subtitles, you must first add them to the main media. You can add subtitles through the ModifyMediaInfo API or the audio and video details page in the console.
4. Not currently supported: top speed Codec, watermark.
     * @param req CreateComplexAdaptiveDynamicStreamingTaskRequest
     * @return CreateComplexAdaptiveDynamicStreamingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplexAdaptiveDynamicStreamingTaskResponse CreateComplexAdaptiveDynamicStreamingTask(CreateComplexAdaptiveDynamicStreamingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComplexAdaptiveDynamicStreamingTask", CreateComplexAdaptiveDynamicStreamingTaskResponse.class);
    }

    /**
     *We have <font color=red>stopped updating</font> this API. Our new moderation templates can moderate audio/video as well as images. For details, see [CreateReviewTemplate](https://intl.cloud.tencent.com/document/api/266/84391?from_cn_redirect=1).
This API is used to create a custom audio/video moderation template. Up to 50 templates can be created in total.
     * @param req CreateContentReviewTemplateRequest
     * @return CreateContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentReviewTemplateResponse CreateContentReviewTemplate(CreateContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContentReviewTemplate", CreateContentReviewTemplateResponse.class);
    }

    /**
     *This API is used for generating a subdomain resolution, prompting the customer to add it to the domain name resolution, used for wildcard domain and domain name retrieval verification of ownership.
     * @param req CreateDomainVerifyRecordRequest
     * @return CreateDomainVerifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainVerifyRecordResponse CreateDomainVerifyRecord(CreateDomainVerifyRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainVerifyRecord", CreateDomainVerifyRecordResponse.class);
    }

    /**
     *Create enhance media template.
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
-The maximum supported template quantity is 100.
     * @param req CreateHeadTailTemplateRequest
     * @return CreateHeadTailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateHeadTailTemplateResponse CreateHeadTailTemplate(CreateHeadTailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHeadTailTemplate", CreateHeadTailTemplateResponse.class);
    }

    /**
     *This API is used to create a custom image processing template. A template can include at most 10 operations, for example, crop-scale-crop-blur-scale-crop-scale-crop-blur-scale. You can have up to 16 image processing templates.
     * @param req CreateImageProcessingTemplateRequest
     * @return CreateImageProcessingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageProcessingTemplateResponse CreateImageProcessingTemplate(CreateImageProcessingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageProcessingTemplate", CreateImageProcessingTemplateResponse.class);
    }

    /**
     *This API is used to create a custom image sprite generating template. Up to 16 templates can be created.
     * @param req CreateImageSpriteTemplateRequest
     * @return CreateImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSpriteTemplateResponse CreateImageSpriteTemplate(CreateImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageSpriteTemplate", CreateImageSpriteTemplateResponse.class);
    }

    /**
     *Create Just In Time Transcode Template.
     * @param req CreateJustInTimeTranscodeTemplateRequest
     * @return CreateJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateJustInTimeTranscodeTemplateResponse CreateJustInTimeTranscodeTemplate(CreateJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJustInTimeTranscodeTemplate", CreateJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *Create a large model comprehend template
     * @param req CreateLLMComprehendTemplateRequest
     * @return CreateLLMComprehendTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLLMComprehendTemplateResponse CreateLLMComprehendTemplate(CreateLLMComprehendTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLLMComprehendTemplate", CreateLLMComprehendTemplateResponse.class);
    }

    /**
     *This API is used to create a custom template for partial features of the ProcessMediaByMPS API.
When creating a template, you need to fill in MPS-related parameters in JSON format into the MPSCreateTemplateParams parameter. For specific task parameter configuration methods, refer to the MPS task template related documentation.
Currently supported MPS features: create custom template.
1. [Audio and video enhancement](https://www.tencentcloud.com/document/product/862/118703?from_cn_redirect=1).
2. [Media AI](https://www.tencentcloud.com/document/product/1041/54517)

Task Template created by this method
Template management is still done on the VOD platform.
2. The feature is currently in closed beta testing. If needed, you can contact us for support.
     * @param req CreateMPSTemplateRequest
     * @return CreateMPSTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateMPSTemplateResponse CreateMPSTemplate(CreateMPSTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMPSTemplate", CreateMPSTemplateResponse.class);
    }

    /**
     *This API is used to create samples for using facial features positioning and other technologies to perform video processing operations such as content recognition and inappropriate information recognition.
     * @param req CreatePersonSampleRequest
     * @return CreatePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonSampleResponse CreatePersonSample(CreatePersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePersonSample", CreatePersonSampleResponse.class);
    }

    /**
     *This API is used to create a custom task flow template. Up to 50 templates can be created.
     * @param req CreateProcedureTemplateRequest
     * @return CreateProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcedureTemplateResponse CreateProcedureTemplate(CreateProcedureTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProcedureTemplate", CreateProcedureTemplateResponse.class);
    }

    /**
     *Create a user-customized image processing template asynchronously. Maximum quantity: 50. HLS format not supported currently.
     * @param req CreateProcessImageAsyncTemplateRequest
     * @return CreateProcessImageAsyncTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessImageAsyncTemplateResponse CreateProcessImageAsyncTemplate(CreateProcessImageAsyncTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProcessImageAsyncTemplate", CreateProcessImageAsyncTemplateResponse.class);
    }

    /**
     *Creates media quality inspection template.
     * @param req CreateQualityInspectTemplateRequest
     * @return CreateQualityInspectTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateQualityInspectTemplateResponse CreateQualityInspectTemplate(CreateQualityInspectTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQualityInspectTemplate", CreateQualityInspectTemplateResponse.class);
    }

    /**
     *Create rebuild media template.
     * @param req CreateRebuildMediaTemplateRequest
     * @return CreateRebuildMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateRebuildMediaTemplateResponse CreateRebuildMediaTemplate(CreateRebuildMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRebuildMediaTemplate", CreateRebuildMediaTemplateResponse.class);
    }

    /**
     *This API is used to create a custom moderation template. Up to 50 templates can be created in total.
> The templates can only be used by the APIs [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) and [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1).
     * @param req CreateReviewTemplateRequest
     * @return CreateReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateReviewTemplateResponse CreateReviewTemplate(CreateReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReviewTemplate", CreateReviewTemplateResponse.class);
    }

    /**
     *This API is used to create a playlist. You can create at most 100 playlists.
For each video on the list, you can either use the original file or a transcoding file.
The files must be in HLS format. Preferably, they should have the same bitrate and resolution.
     * @param req CreateRoundPlayRequest
     * @return CreateRoundPlayResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoundPlayResponse CreateRoundPlay(CreateRoundPlayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoundPlay", CreateRoundPlayResponse.class);
    }

    /**
     *This API is used to create a custom sampled screencapturing template. Up to 16 templates can be created.
     * @param req CreateSampleSnapshotTemplateRequest
     * @return CreateSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSampleSnapshotTemplateResponse CreateSampleSnapshotTemplate(CreateSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSampleSnapshotTemplate", CreateSampleSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to generate scenario-based AIGC images. <b>This interface is in beta. If you need to use it, please contact us. API calls will incur actual fees.</b>
     * @param req CreateSceneAigcImageTaskRequest
     * @return CreateSceneAigcImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSceneAigcImageTaskResponse CreateSceneAigcImageTask(CreateSceneAigcImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSceneAigcImageTask", CreateSceneAigcImageTaskResponse.class);
    }

    /**
     *This API is used to generate scenario-based AIGC images. API calls will occur actual fee.
     * @param req CreateSceneAigcVideoTaskRequest
     * @return CreateSceneAigcVideoTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSceneAigcVideoTaskResponse CreateSceneAigcVideoTask(CreateSceneAigcVideoTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSceneAigcVideoTask", CreateSceneAigcVideoTaskResponse.class);
    }

    /**
     *This API is used to create a custom time point screencapturing template. Up to 16 templates can be created.
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
  1. When you activate VOD, the system will enable storage for you in certain regions. If you need to store data in another region, you can use this API to enable storage in that region.
  2. You can use the `DescribeStorageRegions` API to query all supported storage regions and the regions you have storage access to currently.
     * @param req CreateStorageRegionRequest
     * @return CreateStorageRegionResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageRegionResponse CreateStorageRegion(CreateStorageRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorageRegion", CreateStorageRegionResponse.class);
    }

    /**
     *This API is used to create a VOD subapplication.
     * @param req CreateSubAppIdRequest
     * @return CreateSubAppIdResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubAppIdResponse CreateSubAppId(CreateSubAppIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubAppId", CreateSubAppIdResponse.class);
    }

    /**
     *We have <font color='red'>stopped updating</font> this API. Currently, you no longer need a player configuration to use player signatures. For details, see [Player Signature](https://intl.cloud.tencent.com/document/product/266/45554?from_cn_redirect=1).
This API is used to create a player configuration. Up to 100 configurations can be created.
     * @param req CreateSuperPlayerConfigRequest
     * @return CreateSuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateSuperPlayerConfigResponse CreateSuperPlayerConfig(CreateSuperPlayerConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSuperPlayerConfig", CreateSuperPlayerConfigResponse.class);
    }

    /**
     *This API is used to create a custom transcoding template. Up to 100 templates can be created.
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTranscodeTemplate", CreateTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to add an acceleration domain name to VOD. One user can add up to 20 domain names.
1. After a domain name is added, VOD will deploy it, and it takes about 2 minutes for the domain name status to change from `Deploying` to `Online`.
     * @param req CreateVodDomainRequest
     * @return CreateVodDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateVodDomainResponse CreateVodDomain(CreateVodDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVodDomain", CreateVodDomainResponse.class);
    }

    /**
     *This API is used to create a custom watermarking template. Up to 1,000 templates can be created.
     * @param req CreateWatermarkTemplateRequest
     * @return CreateWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWatermarkTemplateResponse CreateWatermarkTemplate(CreateWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWatermarkTemplate", CreateWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to create keyword samples in batches for using OCR and ASR technologies to perform video processing operations such as content recognition and inappropriate information recognition.
     * @param req CreateWordSamplesRequest
     * @return CreateWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public CreateWordSamplesResponse CreateWordSamples(CreateWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWordSamples", CreateWordSamplesResponse.class);
    }

    /**
     *This API is used to delete a custom video content analysis template.

Note: templates with an ID below 10000 are preset and cannot be deleted.
     * @param req DeleteAIAnalysisTemplateRequest
     * @return DeleteAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisTemplateResponse DeleteAIAnalysisTemplate(DeleteAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIAnalysisTemplate", DeleteAIAnalysisTemplateResponse.class);
    }

    /**
     *This API is used to delete a custom video content recognition template.
     * @param req DeleteAIRecognitionTemplateRequest
     * @return DeleteAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIRecognitionTemplateResponse DeleteAIRecognitionTemplate(DeleteAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIRecognitionTemplate", DeleteAIRecognitionTemplateResponse.class);
    }

    /**
     *This API is used to delete an adaptive bitrate streaming template.
     * @param req DeleteAdaptiveDynamicStreamingTemplateRequest
     * @return DeleteAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAdaptiveDynamicStreamingTemplateResponse DeleteAdaptiveDynamicStreamingTemplate(DeleteAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAdaptiveDynamicStreamingTemplate", DeleteAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *This API is used to delete the senior custom AIGC subject.
     * @param req DeleteAigcAdvancedCustomElementRequest
     * @return DeleteAigcAdvancedCustomElementResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAigcAdvancedCustomElementResponse DeleteAigcAdvancedCustomElement(DeleteAigcAdvancedCustomElementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAigcAdvancedCustomElement", DeleteAigcAdvancedCustomElementResponse.class);
    }

    /**
     *Delete an AIGC API Token.
     * @param req DeleteAigcApiTokenRequest
     * @return DeleteAigcApiTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAigcApiTokenResponse DeleteAigcApiToken(DeleteAigcApiTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAigcApiToken", DeleteAigcApiTokenResponse.class);
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
     *Delete CDN Domain
     * @param req DeleteCDNDomainRequest
     * @return DeleteCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCDNDomainResponse DeleteCDNDomain(DeleteCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCDNDomain", DeleteCDNDomainResponse.class);
    }

    /**
     ** A category can be deleted only if it has no subcategories and associated media files;
* Otherwise, [delete the media files](https://intl.cloud.tencent.com/document/product/266/31764?from_cn_redirect=1) and subcategories first before deleting the category.
     * @param req DeleteClassRequest
     * @return DeleteClassResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClassResponse DeleteClass(DeleteClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClass", DeleteClassResponse.class);
    }

    /**
     *We have <font color=red>stopped updating</font> this API. Our new moderation templates can moderate audio/video as well as images. For details, see [DeleteReviewTemplate](https://intl.cloud.tencent.com/document/api/266/84390?from_cn_redirect=1).
This API is used to delete a custom audio/video moderation template.
     * @param req DeleteContentReviewTemplateRequest
     * @return DeleteContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentReviewTemplateResponse DeleteContentReviewTemplate(DeleteContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContentReviewTemplate", DeleteContentReviewTemplateResponse.class);
    }

    /**
     *Delete Enhance Media template
     * @param req DeleteEnhanceMediaTemplateRequest
     * @return DeleteEnhanceMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnhanceMediaTemplateResponse DeleteEnhanceMediaTemplate(DeleteEnhanceMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnhanceMediaTemplate", DeleteEnhanceMediaTemplateResponse.class);
    }

    /**
     *Delete HeadTail Template
     * @param req DeleteHeadTailTemplateRequest
     * @return DeleteHeadTailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHeadTailTemplateResponse DeleteHeadTailTemplate(DeleteHeadTailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHeadTailTemplate", DeleteHeadTailTemplateResponse.class);
    }

    /**
     *This API is used to delete an image processing template.
     * @param req DeleteImageProcessingTemplateRequest
     * @return DeleteImageProcessingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageProcessingTemplateResponse DeleteImageProcessingTemplate(DeleteImageProcessingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageProcessingTemplate", DeleteImageProcessingTemplateResponse.class);
    }

    /**
     *This API is used to delete an image sprite generating template.
     * @param req DeleteImageSpriteTemplateRequest
     * @return DeleteImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSpriteTemplateResponse DeleteImageSpriteTemplate(DeleteImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageSpriteTemplate", DeleteImageSpriteTemplateResponse.class);
    }

    /**
     *Delete Just In Time Transcode Template.
     * @param req DeleteJustInTimeTranscodeTemplateRequest
     * @return DeleteJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJustInTimeTranscodeTemplateResponse DeleteJustInTimeTranscodeTemplate(DeleteJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJustInTimeTranscodeTemplate", DeleteJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to delete a user's customized large model parsing template.

Note: Template IDs below 10000 are system-preset templates and cannot be deleted.
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
     ** This API is used to delete a media file and its processed files, such as the transcoded video files, image sprites, screenshots, and videos for publishing on WeChat.
* You can delete the original files, transcoded video files, and videos for publishing on WeChat, etc. of videos with specified IDs.
* Note: after the original file of a video is deleted, you cannot transcode the video, publish it on WeChat, or perform other operations on it.
     * @param req DeleteMediaRequest
     * @return DeleteMediaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaResponse DeleteMedia(DeleteMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMedia", DeleteMediaResponse.class);
    }

    /**
     *This API is used to delete samples according to sample IDs.
     * @param req DeletePersonSampleRequest
     * @return DeletePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonSampleResponse DeletePersonSample(DeletePersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePersonSample", DeletePersonSampleResponse.class);
    }

    /**
     *Delete user-created task flow templates.
     * @param req DeleteProcedureTemplateRequest
     * @return DeleteProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProcedureTemplateResponse DeleteProcedureTemplate(DeleteProcedureTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProcedureTemplate", DeleteProcedureTemplateResponse.class);
    }

    /**
     *This API is used to delete a user-customized image async processing template.

Note: Template IDs below 10000 are system-preset templates and cannot be deleted.
     * @param req DeleteProcessImageAsyncTemplateRequest
     * @return DeleteProcessImageAsyncTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProcessImageAsyncTemplateResponse DeleteProcessImageAsyncTemplate(DeleteProcessImageAsyncTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProcessImageAsyncTemplate", DeleteProcessImageAsyncTemplateResponse.class);
    }

    /**
     *Deletes media quality inspection template.
     * @param req DeleteQualityInspectTemplateRequest
     * @return DeleteQualityInspectTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQualityInspectTemplateResponse DeleteQualityInspectTemplate(DeleteQualityInspectTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQualityInspectTemplate", DeleteQualityInspectTemplateResponse.class);
    }

    /**
     *Delete rebuild media template.
     * @param req DeleteRebuildMediaTemplateRequest
     * @return DeleteRebuildMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRebuildMediaTemplateResponse DeleteRebuildMediaTemplate(DeleteRebuildMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRebuildMediaTemplate", DeleteRebuildMediaTemplateResponse.class);
    }

    /**
     *This API is used to delete a custom moderation template.
> The templates can only be used by the APIs [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) and [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1).
     * @param req DeleteReviewTemplateRequest
     * @return DeleteReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReviewTemplateResponse DeleteReviewTemplate(DeleteReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReviewTemplate", DeleteReviewTemplateResponse.class);
    }

    /**
     *This API is used to delete a playlist.
     * @param req DeleteRoundPlayRequest
     * @return DeleteRoundPlayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoundPlayResponse DeleteRoundPlay(DeleteRoundPlayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoundPlay", DeleteRoundPlayResponse.class);
    }

    /**
     *This API is used to delete a custom sampled screencapturing template.
     * @param req DeleteSampleSnapshotTemplateRequest
     * @return DeleteSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSampleSnapshotTemplateResponse DeleteSampleSnapshotTemplate(DeleteSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSampleSnapshotTemplate", DeleteSampleSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to delete a custom time point screencapturing template.
     * @param req DeleteSnapshotByTimeOffsetTemplateRequest
     * @return DeleteSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotByTimeOffsetTemplateResponse DeleteSnapshotByTimeOffsetTemplate(DeleteSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate", DeleteSnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *We have <font color='red'>stopped updating</font> this API. Currently, you no longer need a player configuration to use player signatures. For details, see [Player Signature](https://intl.cloud.tencent.com/document/product/266/45554?from_cn_redirect=1).
This API is used to delete a player configuration.  
*Note: Preset player configurations cannot be deleted.*
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
     *This API is used to delete an acceleration domain name from VOD.
1. Before deleting a domain name, disable its acceleration in all regions.
     * @param req DeleteVodDomainRequest
     * @return DeleteVodDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVodDomainResponse DeleteVodDomain(DeleteVodDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVodDomain", DeleteVodDomainResponse.class);
    }

    /**
     *This API is used to delete a custom watermarking template.
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
     *This API is used to get the list of video content analysis templates based on unique template ID. The returned result includes all eligible custom and [preset video content analysis templates](https://intl.cloud.tencent.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E5.88.86.E6.9E.90.E6.A8.A1.E6.9D.BF).
     * @param req DescribeAIAnalysisTemplatesRequest
     * @return DescribeAIAnalysisTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisTemplatesResponse DescribeAIAnalysisTemplates(DescribeAIAnalysisTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisTemplates", DescribeAIAnalysisTemplatesResponse.class);
    }

    /**
     *This API is used to get the list of video content recognition templates based on unique template ID. The return result includes all eligible custom and [preset video content recognition templates](https://intl.cloud.tencent.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E8.AF.86.E5.88.AB.E6.A8.A1.E6.9D.BF).
     * @param req DescribeAIRecognitionTemplatesRequest
     * @return DescribeAIRecognitionTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIRecognitionTemplatesResponse DescribeAIRecognitionTemplates(DescribeAIRecognitionTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIRecognitionTemplates", DescribeAIRecognitionTemplatesResponse.class);
    }

    /**
     *This API is used to query the list of transcoding to adaptive bitrate streaming templates and supports paged queries by filters.
     * @param req DescribeAdaptiveDynamicStreamingTemplatesRequest
     * @return DescribeAdaptiveDynamicStreamingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdaptiveDynamicStreamingTemplatesResponse DescribeAdaptiveDynamicStreamingTemplates(DescribeAdaptiveDynamicStreamingTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdaptiveDynamicStreamingTemplates", DescribeAdaptiveDynamicStreamingTemplatesResponse.class);
    }

    /**
     *This API is used to retrieve an advanced custom AIGC subject.
     * @param req DescribeAigcAdvancedCustomElementsRequest
     * @return DescribeAigcAdvancedCustomElementsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcAdvancedCustomElementsResponse DescribeAigcAdvancedCustomElements(DescribeAigcAdvancedCustomElementsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcAdvancedCustomElements", DescribeAigcAdvancedCustomElementsResponse.class);
    }

    /**
     *Query the AIGC API Token list. There is a delay in data sync after creation or deletion. The latest data is queryable after about 30 seconds.
     * @param req DescribeAigcApiTokensRequest
     * @return DescribeAigcApiTokensResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcApiTokensResponse DescribeAigcApiTokens(DescribeAigcApiTokensRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcApiTokens", DescribeAigcApiTokensResponse.class);
    }

    /**
     *This API is used to obtain AIGC face information. Note that calling this API will incur face recognition fees. Refer to the billing documentation (https://www.tencentcloud.com/document/product/266/95125?from_cn_redirect=1#96b3b59a-f9e1-49e9-966a-bedb70a4bf12).
     * @param req DescribeAigcFaceInfoRequest
     * @return DescribeAigcFaceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcFaceInfoResponse DescribeAigcFaceInfo(DescribeAigcFaceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcFaceInfo", DescribeAigcFaceInfoResponse.class);
    }

    /**
     *This API is used to return statistical information of AIGC within a specified time range.
1. AIGC stats from the last 365 days can be queried.
   2. The query time span should not exceed 90 days.
3. If the query time span exceeds 1 day, return data with day-level granularity. Otherwise, return data with 5-minute granularity.
     * @param req DescribeAigcUsageDataRequest
     * @return DescribeAigcUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAigcUsageDataResponse DescribeAigcUsageData(DescribeAigcUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAigcUsageData", DescribeAigcUsageDataResponse.class);
    }

    /**
     ** This API is used to get the information of all categories.
     * @param req DescribeAllClassRequest
     * @return DescribeAllClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllClassResponse DescribeAllClass(DescribeAllClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllClass", DescribeAllClassResponse.class);
    }

    /**
     *This API is used to query the list of animated image generating templates and supports paged queries by filters.
     * @param req DescribeAnimatedGraphicsTemplatesRequest
     * @return DescribeAnimatedGraphicsTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnimatedGraphicsTemplatesResponse DescribeAnimatedGraphicsTemplates(DescribeAnimatedGraphicsTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAnimatedGraphicsTemplates", DescribeAnimatedGraphicsTemplatesResponse.class);
    }

    /**
     *Query user-customized digital watermark templates.
     * @param req DescribeBlindWatermarkTemplatesRequest
     * @return DescribeBlindWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlindWatermarkTemplatesResponse DescribeBlindWatermarkTemplates(DescribeBlindWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlindWatermarkTemplates", DescribeBlindWatermarkTemplatesResponse.class);
    }

    /**
     *Describe CDN Domains
     * @param req DescribeCDNDomainsRequest
     * @return DescribeCDNDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNDomainsResponse DescribeCDNDomains(DescribeCDNDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCDNDomains", DescribeCDNDomainsResponse.class);
    }

    /**
     *This API is used to query CDN bandwidth, traffic volume and stats of on-demand domain names.
* The start time and end time of the query should not exceed a 90-day span.
* You can query data from different service regions.
Data support within the Chinese mainland allows querying stats by specified region and carrier.
Playback statistics only target VOD domains (EdgeOne domain name distribution is not included).
     * @param req DescribeCDNStatDetailsRequest
     * @return DescribeCDNStatDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNStatDetailsResponse DescribeCDNStatDetails(DescribeCDNStatDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCDNStatDetails", DescribeCDNStatDetailsResponse.class);
    }

    /**
     *This API is used to query traffic, bandwidth and stats of video-on-demand (VOD) CDN.
1. The system side reserves CDN usage data for 13 months. You can query the most recent 365 days of usage data through the API. If needed, contact us to call historical usage data exceeding 365 days.
   2. The query time span should not exceed 90 days.
3. You can specify the time granularity of usage data, which supports 5 minutes, 1 hour, and 1 day.
4. Traffic volume is the total traffic within the query time granularity, and bandwidth is the peak bandwidth within the query time granularity.
5. Playback statistics only target VOD domains (EdgeOne domain name distribution is not included).
     * @param req DescribeCDNUsageDataRequest
     * @return DescribeCDNUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDNUsageDataResponse DescribeCDNUsageData(DescribeCDNUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCDNUsageData", DescribeCDNUsageDataResponse.class);
    }

    /**
     *Query the download URL of the access log for the CDN (exclude EdgeOne origin back to VOD domain) of the on-demand domain name.
1. You can query the log download links for CDN in the most recent 30 days.
2. By default, CDN creates a log file per hour. If no CDN access occurs in an hour, it does not generate a log file.    
3. The CDN log download link is with a validity of 24 hours.
     * @param req DescribeCdnLogsRequest
     * @return DescribeCdnLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnLogsResponse DescribeCdnLogs(DescribeCdnLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdnLogs", DescribeCdnLogsResponse.class);
    }

    /**
     *This interface returns client upload acceleration statistics within the query time range. 
 1. You can query the client upload acceleration statistics in the last 365 days. 
 2. The query time span does not exceed 90 days. 
 3. If the query time span exceeds 1 day, data with day granularity will be returned. Otherwise, data with 5-minute granularity will be returned.
     * @param req DescribeClientUploadAccelerationUsageDataRequest
     * @return DescribeClientUploadAccelerationUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientUploadAccelerationUsageDataResponse DescribeClientUploadAccelerationUsageData(DescribeClientUploadAccelerationUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientUploadAccelerationUsageData", DescribeClientUploadAccelerationUsageDataResponse.class);
    }

    /**
     *We have <font color=red>stopped updating</font> this API. Our new moderation templates can moderate audio/video as well as images. For details, see [DescribeReviewTemplates](https://intl.cloud.tencent.com/document/api/266/84389?from_cn_redirect=1).
This API is used to get the information of custom and [preset](https://intl.cloud.tencent.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.A7.86.E9.A2.91.E5.86.85.E5.AE.B9.E5.AE.A1.E6.A0.B8.E6.A8.A1.E6.9D.BF) audio/video moderation templates based on template IDs.
     * @param req DescribeContentReviewTemplatesRequest
     * @return DescribeContentReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentReviewTemplatesResponse DescribeContentReviewTemplates(DescribeContentReviewTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentReviewTemplates", DescribeContentReviewTemplatesResponse.class);
    }

    /**
     *Query current playlist of the round play.
     * @param req DescribeCurrentPlaylistRequest
     * @return DescribeCurrentPlaylistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentPlaylistResponse DescribeCurrentPlaylist(DescribeCurrentPlaylistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentPlaylist", DescribeCurrentPlaylistResponse.class);
    }

    /**
     *This API is used to query the download address of the playback statistics file.
* You can query the download links for playback statistics from the past one year, with the time span between the start date and end date no more than 90 days.
VOD analyzes and processes CDN request logs from the previous day to generate playback statistics files.
The playback statistics file contains statistical information such as the number of plays and total traffic of media files.
Play count statistics description:
1. HLS file: Count playback times when accessing M3U8 files; do not count playback times when accessing TS files.
2. Other files (such as MP4 files): The number of plays is not counted when the playback request has a range parameter and the start parameter is not equal to 0. In other cases, the number of plays is counted.
* Playback device statistics: If a playback request includes the UserAgent parameter and the UserAgent contains identification such as Android or iPhone, it will be counted as mobile playback. Otherwise, it will be counted as PC playback.
Playback statistics only target VOD domains (EdgeOne domain name distribution is not included).
     * @param req DescribeDailyPlayStatFileListRequest
     * @return DescribeDailyPlayStatFileListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDailyPlayStatFileListResponse DescribeDailyPlayStatFileList(DescribeDailyPlayStatFileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDailyPlayStatFileList", DescribeDailyPlayStatFileListResponse.class);
    }

    /**
     *This API is used to query DRM key information.
     * @param req DescribeDrmKeyProviderInfoRequest
     * @return DescribeDrmKeyProviderInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrmKeyProviderInfoResponse DescribeDrmKeyProviderInfo(DescribeDrmKeyProviderInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrmKeyProviderInfo", DescribeDrmKeyProviderInfoResponse.class);
    }

    /**
     *Describe Enhance Media Templates.
     * @param req DescribeEnhanceMediaTemplatesRequest
     * @return DescribeEnhanceMediaTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnhanceMediaTemplatesResponse DescribeEnhanceMediaTemplates(DescribeEnhanceMediaTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnhanceMediaTemplates", DescribeEnhanceMediaTemplatesResponse.class);
    }

    /**
     *Tencent Cloud Video on Demand (VOD) provides customers with services such as media upload, media management, and media processing. During the execution process or when execution ends, VOD also offers various event notifications to help developers monitor service processing status and proceed with next business operations.

Developers can use this interface to query the current configuration of event notification receiving method, recipient address and which events have enabled callback notification.

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
     *This API is used to get file attributes asynchronously.
- Currently, this API can only get the MD5 hash of a file.
- If the file queried is in HLS or DASH format, the attributes of the index file will be returned.
     * @param req DescribeFileAttributesRequest
     * @return DescribeFileAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileAttributesResponse DescribeFileAttributes(DescribeFileAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileAttributes", DescribeFileAttributesResponse.class);
    }

    /**
     *Describe HeadTail Templates.
     * @param req DescribeHeadTailTemplatesRequest
     * @return DescribeHeadTailTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHeadTailTemplatesResponse DescribeHeadTailTemplates(DescribeHeadTailTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHeadTailTemplates", DescribeHeadTailTemplatesResponse.class);
    }

    /**
     *This API is used to query image processing templates. You can specify the filters as well as the offset to start returning records from.
     * @param req DescribeImageProcessingTemplatesRequest
     * @return DescribeImageProcessingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageProcessingTemplatesResponse DescribeImageProcessingTemplates(DescribeImageProcessingTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageProcessingTemplates", DescribeImageProcessingTemplatesResponse.class);
    }

    /**
     *This interface returns the image review usage information used every day within the query time range.
   1. You can query the image review statistics for the last 365 days.
   2. The query time span does not exceed 90 days.
   3. If the query time span exceeds 1 day, data with a granularity of days will be returned. Otherwise, data with a granularity of 5 minutes will be returned.
     * @param req DescribeImageReviewUsageDataRequest
     * @return DescribeImageReviewUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageReviewUsageDataResponse DescribeImageReviewUsageData(DescribeImageReviewUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageReviewUsageData", DescribeImageReviewUsageDataResponse.class);
    }

    /**
     *This API is used to query the list of image sprite generating templates and supports paged queries by filters.
     * @param req DescribeImageSpriteTemplatesRequest
     * @return DescribeImageSpriteTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSpriteTemplatesResponse DescribeImageSpriteTemplates(DescribeImageSpriteTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSpriteTemplates", DescribeImageSpriteTemplatesResponse.class);
    }

    /**
     *Describe Just In Time Transcode Templates.
     * @param req DescribeJustInTimeTranscodeTemplatesRequest
     * @return DescribeJustInTimeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJustInTimeTranscodeTemplatesResponse DescribeJustInTimeTranscodeTemplates(DescribeJustInTimeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJustInTimeTranscodeTemplates", DescribeJustInTimeTranscodeTemplatesResponse.class);
    }

    /**
     *This API is used to obtain the template detail list based on the Template Unique Identifier of the large model comprehend template. The returned results include all eligible customized large model parsing templates.
     * @param req DescribeLLMComprehendTemplatesRequest
     * @return DescribeLLMComprehendTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLLMComprehendTemplatesResponse DescribeLLMComprehendTemplates(DescribeLLMComprehendTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLLMComprehendTemplates", DescribeLLMComprehendTemplatesResponse.class);
    }

    /**
     *This interface returns information about the number of license requests per day within the query time range.
   1. You can query the license request statistics in the last 365 days.
   2. The query time span does not exceed 90 days.
   3. If the query time span exceeds 1 day, data with a granularity of days will be returned. Otherwise, data with a granularity of 5 minutes will be returned.
     * @param req DescribeLicenseUsageDataRequest
     * @return DescribeLicenseUsageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseUsageDataResponse DescribeLicenseUsageData(DescribeLicenseUsageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseUsageData", DescribeLicenseUsageDataResponse.class);
    }

    /**
     *Retrieve user-customized MPS task templates.
When querying the template list, require MPS related parameters to be filled in MPSDescribeTemplateParams in JSON format. For task parameter configuration method, refer to MPS task template document description.
     * @param req DescribeMPSTemplatesRequest
     * @return DescribeMPSTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMPSTemplatesResponse DescribeMPSTemplates(DescribeMPSTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMPSTemplates", DescribeMPSTemplatesResponse.class);
    }

    /**
     *1. This API is used to get the information of multiple media files. Specifically, the information returned is as follows:
    1. `basicInfo`: Basic information including the file name, category, playback URL, and thumbnail.
    2. `metaData`: Metadata including the file size, duration, video stream information, and audio stream information.
    3. `transcodeInfo`: Transcoding information including the URLs, video stream parameters, and audio stream parameters of transcoding outputs.
    4. `animatedGraphicsInfo`: The information of the animated images (such as GIF images) generated.
    5. `sampleSnapshotInfo`: The information of the sampled screenshots generated.
    6. `imageSpriteInfo`: The information of the image sprites generated.
    7. `snapshotByTimeOffsetInfo`: The information of the time point screenshots generated.
    8. `keyFrameDescInfo`: The video timestamp information.
    9. `adaptiveDynamicStreamingInfo`: Adaptive bitrate information including the specifications, encryption type, and formats of the streams.
    10. `reviewInfo`: Moderation details for audio/video content and thumbnails.
2. You can specify what information to return.
     * @param req DescribeMediaInfosRequest
     * @return DescribeMediaInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaInfosResponse DescribeMediaInfos(DescribeMediaInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaInfos", DescribeMediaInfosResponse.class);
    }

    /**
     *This API is used to query playback statistics of media files by specified time granularity.
* Playback statistics from the past one year can be queried.
* The time granularity is hourly, and the span between end time and start time cannot exceed 7 days.
* The time granularity is day, and the span between the end time and start time is up to 90 days.
Playback statistics only target VOD domains (EdgeOne domain name distribution is not included).
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
1. The data system reserves video processing usage for 13 months. You can use the interface to query the most recent 365 days of usage data. If needed, contact us to call historical usage data exceeding 365 days.
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
     *This API is used to query the information of samples and supports paginated queries by sample ID, name, and tag.
     * @param req DescribePersonSamplesRequest
     * @return DescribePersonSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonSamplesResponse DescribePersonSamples(DescribePersonSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePersonSamples", DescribePersonSamplesResponse.class);
    }

    /**
     *This API is used to get the list of task flow template details by task flow template name.
     * @param req DescribeProcedureTemplatesRequest
     * @return DescribeProcedureTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcedureTemplatesResponse DescribeProcedureTemplates(DescribeProcedureTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcedureTemplates", DescribeProcedureTemplatesResponse.class);
    }

    /**
     *This API is used to obtain the template details list of image asynchronous processing based on the Template Unique Identifier. The returned results include ALL eligible user-customized image asynchronous processing templates.
     * @param req DescribeProcessImageAsyncTemplatesRequest
     * @return DescribeProcessImageAsyncTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessImageAsyncTemplatesResponse DescribeProcessImageAsyncTemplates(DescribeProcessImageAsyncTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessImageAsyncTemplates", DescribeProcessImageAsyncTemplatesResponse.class);
    }

    /**
     *Get media quality inspection Template List.
     * @param req DescribeQualityInspectTemplatesRequest
     * @return DescribeQualityInspectTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityInspectTemplatesResponse DescribeQualityInspectTemplates(DescribeQualityInspectTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityInspectTemplates", DescribeQualityInspectTemplatesResponse.class);
    }

    /**
     *Describe Rebuild Media Templates
     * @param req DescribeRebuildMediaTemplatesRequest
     * @return DescribeRebuildMediaTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebuildMediaTemplatesResponse DescribeRebuildMediaTemplates(DescribeRebuildMediaTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRebuildMediaTemplates", DescribeRebuildMediaTemplatesResponse.class);
    }

    /**
     *<b>This API is disused and replaced by [DescribeMediaProcessUsageData](https://intl.cloud.tencent.com/document/product/266/41464?from_cn_redirect=1).</b>

This API returns the video content duration for intelligent recognition in seconds per day within the queried period.

1. The API is used to query statistics on the video content duration for intelligent recognition in the last 365 days.
2. The query period is up to 90 days.
     * @param req DescribeReviewDetailsRequest
     * @return DescribeReviewDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReviewDetailsResponse DescribeReviewDetails(DescribeReviewDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReviewDetails", DescribeReviewDetailsResponse.class);
    }

    /**
     *This API is used to get the information of moderation templates.
> The templates can only be used by the APIs [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) and [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1).
     * @param req DescribeReviewTemplatesRequest
     * @return DescribeReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReviewTemplatesResponse DescribeReviewTemplates(DescribeReviewTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReviewTemplates", DescribeReviewTemplatesResponse.class);
    }

    /**
     *This API is used to query playlists.
     * @param req DescribeRoundPlaysRequest
     * @return DescribeRoundPlaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoundPlaysResponse DescribeRoundPlays(DescribeRoundPlaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoundPlays", DescribeRoundPlaysResponse.class);
    }

    /**
     *This API is used to query the list of sampled screencapturing templates and supports paged queries by filters.
     * @param req DescribeSampleSnapshotTemplatesRequest
     * @return DescribeSampleSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleSnapshotTemplatesResponse DescribeSampleSnapshotTemplates(DescribeSampleSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleSnapshotTemplates", DescribeSampleSnapshotTemplatesResponse.class);
    }

    /**
     *This API is used to query the list of time point screencapturing templates and supports paged queries by filters.
     * @param req DescribeSnapshotByTimeOffsetTemplatesRequest
     * @return DescribeSnapshotByTimeOffsetTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotByTimeOffsetTemplatesResponse DescribeSnapshotByTimeOffsetTemplates(DescribeSnapshotByTimeOffsetTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates", DescribeSnapshotByTimeOffsetTemplatesResponse.class);
    }

    /**
     *This API is used to query the storage capacity usage and number of files.
     * @param req DescribeStorageDataRequest
     * @return DescribeStorageDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageDataResponse DescribeStorageData(DescribeStorageDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageData", DescribeStorageDataResponse.class);
    }

    /**
     *This API is used to query the VOD storage space used within a specified time range. The measurement unit is byte.
1. The system side reserves storage usage data for 13 months. You can be queried usage data within the most recent 365 days through the API. If needed to call historical usage data exceeding 365 days, contact us.
2. The query time span should not exceed 90 days.
3. The query span at a minute granularity should not exceed 7 days.
     * @param req DescribeStorageDetailsRequest
     * @return DescribeStorageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageDetailsResponse DescribeStorageDetails(DescribeStorageDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageDetails", DescribeStorageDetailsResponse.class);
    }

    /**
     *This API is used to query the following information:
  1. All supported storage regions.
  2. The regions you have storage access to currently.
  3. The default storage region.
     * @param req DescribeStorageRegionsRequest
     * @return DescribeStorageRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageRegionsResponse DescribeStorageRegions(DescribeStorageRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageRegions", DescribeStorageRegionsResponse.class);
    }

    /**
     *This API is used to query the list of the primary application and subapplications of the current account.
     * @param req DescribeSubAppIdsRequest
     * @return DescribeSubAppIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAppIdsResponse DescribeSubAppIds(DescribeSubAppIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubAppIds", DescribeSubAppIdsResponse.class);
    }

    /**
     *We have <font color='red'>stopped updating</font> this API. Currently, you no longer need a player configuration to use player signatures. For details, see [Player Signature](https://intl.cloud.tencent.com/document/product/266/45554?from_cn_redirect=1).
This API is used to query player configurations. It supports pagination.
     * @param req DescribeSuperPlayerConfigsRequest
     * @return DescribeSuperPlayerConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuperPlayerConfigsResponse DescribeSuperPlayerConfigs(DescribeSuperPlayerConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSuperPlayerConfigs", DescribeSuperPlayerConfigsResponse.class);
    }

    /**
     *This API is used to query the details of execution status and result of a task submitted in the last 3 days by task ID.
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetail", DescribeTaskDetailResponse.class);
    }

    /**
     ** This API is used to query the task list;
* If there are many data entries in the list, one single call of the API may not be able to pull the entire list. The `ScrollToken` parameter can be used to pull the list in batches;
* Only tasks in the last three days (72 hours) can be queried.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *This API is used to get the list of transcoding templates based on unique template ID. The return result includes all eligible custom and [preset transcoding templates](https://intl.cloud.tencent.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     * @param req DescribeTranscodeTemplatesRequest
     * @return DescribeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTemplatesResponse DescribeTranscodeTemplates(DescribeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTranscodeTemplates", DescribeTranscodeTemplatesResponse.class);
    }

    /**
     *This API is used to query the list of VOD domain names.
     * @param req DescribeVodDomainsRequest
     * @return DescribeVodDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVodDomainsResponse DescribeVodDomains(DescribeVodDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVodDomains", DescribeVodDomainsResponse.class);
    }

    /**
     *This API is used to query custom watermarking templates and supports paged queries by filters.
     * @param req DescribeWatermarkTemplatesRequest
     * @return DescribeWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWatermarkTemplatesResponse DescribeWatermarkTemplates(DescribeWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWatermarkTemplates", DescribeWatermarkTemplatesResponse.class);
    }

    /**
     *This API is used to perform paginated queries of keyword sample information by use case, keyword, and tag.
     * @param req DescribeWordSamplesRequest
     * @return DescribeWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWordSamplesResponse DescribeWordSamples(DescribeWordSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWordSamples", DescribeWordSamplesResponse.class);
    }

    /**
     *Edit the video (cut, splice, etc.) to generate a new video. The editing functions include:

1. Edit a file in the VOD video to generate a new video;
2. Splice multiple files to generate a new video;
3. Edit multiple files and then splice them to generate a new video;
4. Directly generate a new video for a stream;
5. Edit a stream to generate a new video. Video;
6. Splice multiple streams to generate a new video;
7. Clip and then splice multiple streams to generate a new video. 

For the generated new video, you can also specify whether the generated video needs to execute the task flow. 

>When editing or splicing live streams, please make sure to do so after the stream is over. Otherwise the resulting video may be incomplete. 

If event notification is used, the type of event notification is [Video editing completed](https://intl.cloud.tencent.com/document/product/266/33794?from_cn_redirect=1).
     * @param req EditMediaRequest
     * @return EditMediaResponse
     * @throws TencentCloudSDKException
     */
    public EditMediaResponse EditMedia(EditMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditMedia", EditMediaResponse.class);
    }

    /**
     *Enhance Media By Template.
     * @param req EnhanceMediaByTemplateRequest
     * @return EnhanceMediaByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceMediaByTemplateResponse EnhanceMediaByTemplate(EnhanceMediaByTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnhanceMediaByTemplate", EnhanceMediaByTemplateResponse.class);
    }

    /**
     *Initiate a Remaster task for audio and video media in VOD
     * @param req EnhanceMediaQualityRequest
     * @return EnhanceMediaQualityResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceMediaQualityResponse EnhanceMediaQuality(EnhanceMediaQualityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnhanceMediaQuality", EnhanceMediaQualityResponse.class);
    }

    /**
     *This API is only used in special scenarios of custom development. Unless requested by VOD customer service, please do not call it.
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
     *If you need source tracing for piracy, refer to ghost watermark (https://www.tencentcloud.com/document/product/266/94228?from_cn_redirect=1).
     * @param req ExtractCopyRightWatermarkRequest
     * @return ExtractCopyRightWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ExtractCopyRightWatermarkResponse ExtractCopyRightWatermark(ExtractCopyRightWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExtractCopyRightWatermark", ExtractCopyRightWatermarkResponse.class);
    }

    /**
     *If you need source tracing for piracy, ghost watermark (https://www.tencentcloud.com/document/product/266/94228?from_cn_redirect=1) is recommended.
     * @param req ExtractTraceWatermarkRequest
     * @return ExtractTraceWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ExtractTraceWatermarkResponse ExtractTraceWatermark(ExtractTraceWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExtractTraceWatermark", ExtractTraceWatermarkResponse.class);
    }

    /**
     *This API is used to implement quick splice and quick editing for HLS videos in VOD, generating new media in HLS format.

Quickly splice or edit the generated video to generate a new FileId and perform solidification. After successful solidification, the new video file exists independent of the original input video and is not impacted by the deletion of the original video.

<font color='red'>Note:</font> Enable reception of editing solidification event notifications through the ModifyEventConfig API. After successful solidification, you will receive an event notification of PersistenceComplete type. Before receiving this event notification, you should not perform operations such as delete or downgrade on the original input video, otherwise exceptions may occur during playback of the generated video from splicing and clipping.
     * @param req FastEditMediaRequest
     * @return FastEditMediaResponse
     * @throws TencentCloudSDKException
     */
    public FastEditMediaResponse FastEditMedia(FastEditMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FastEditMedia", FastEditMediaResponse.class);
    }

    /**
     *After media blocking is enabled, all URLs for accessing various resources (raw file, transcoding output file, screenshot, etc.) will return 403 except for vod console preview.
The unblock operation takes effect across the entire network in approximately 5-10 minutes.
* Note: Banned media can only operate standard storage and infrequent storage media. Infrequent storage media must be stored for at least 30 days. Early deletion or changing the storage class will still be billed for 30 days. If infrequent storage media is banned and its infrequent access storage period is less than 30 days, early deletion billing will occur. Meanwhile, the infrequent access storage duration of the banned media will restart from the current system time. If the media is deleted or its storage class is changed within 30 days, early deletion billing will also occur. For example: Media 001 has been in infrequent storage for 10 days. At this point, if 001 is banned, the infrequent storage billing will still be calculated for 30 days (early deletion billing duration is 30 - 10 = 20 days). After the ban, the infrequent access storage duration of 001 restarts. If 001 is deleted on the 5th day after the ban, the infrequent storage billing will also be calculated for 30 days (early deletion billing duration is 30 - 5 = 25 days). The actual infrequent access storage duration of 001 is 10 + 5 = 15 days, while the infrequent storage billing duration is 10 + 20 (early deletion billing) + 5 + 25 (early deletion billing) = 60 days.
     * @param req ForbidMediaDistributionRequest
     * @return ForbidMediaDistributionResponse
     * @throws TencentCloudSDKException
     */
    public ForbidMediaDistributionResponse ForbidMediaDistribution(ForbidMediaDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidMediaDistribution", ForbidMediaDistributionResponse.class);
    }

    /**
     *Operate the current play list . Supported operations include:<li> Insert: Insert a playing program into the current playlist.</li><li> Delete: Remove a playing program from the playlist.</li>
     * @param req HandleCurrentPlaylistRequest
     * @return HandleCurrentPlaylistResponse
     * @throws TencentCloudSDKException
     */
    public HandleCurrentPlaylistResponse HandleCurrentPlaylist(HandleCurrentPlaylistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleCurrentPlaylist", HandleCurrentPlaylistResponse.class);
    }

    /**
     *This API is used to import AI analysis results into the knowledge base.
     * @param req ImportMediaKnowledgeRequest
     * @return ImportMediaKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public ImportMediaKnowledgeResponse ImportMediaKnowledge(ImportMediaKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportMediaKnowledge", ImportMediaKnowledgeResponse.class);
    }

    /**
     *Initiate media quality inspection task.
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

This API is available only in "FileID+Path mode".
     * @param req ListFilesRequest
     * @return ListFilesResponse
     * @throws TencentCloudSDKException
     */
    public ListFilesResponse ListFiles(ListFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFiles", ListFilesResponse.class);
    }

    /**
     *Live stream clipping refers to the process where, during a live stream (not yet ended), customers can select a segment from past live stream content to generate a new video (HLS format) in real time. Developers can instantly share it or preserve it for long-term storage.

Tencent Cloud Video on Demand (VOD) supports two instant editing modes:
- Clip Curing: Save the edited video as an independent video with an independent FileId; applicable to scenes where highlights are ** saved for a long time **;
- Clip not cured: The resulting video clip is attached to the live recording file and has no separate FileId; applicable to scenes where highlights are ** temporarily shared **.

Note:
-Using the live stream clipping functionality is the premise for the target live stream to enable the [time-shifted playback feature](https://www.tencentcloud.com/document/product/267/57281).
-Live stream clipping is performed based on the m3u8 file generated by live recording generation, so its minimum editing precision is a ts slice, and second-level or more precise editing precision cannot be achieved.
-Since there may be stream interruptions during live streaming, the actual video duration generated by editing might differ from the expected duration. For example, if a live stream is edited for the time interval from 2018-09-20T10:30:00Z to 2018-09-20T10:40:00Z and stream interruption occurred during this interval, the duration of the returned media asset files will be less than 10 minutes. In such cases, you can perceive this through the output parameter <a href="#p_segmentset">SegmentSet</a>.

### Edit solidification
Clipping persistence means saving the edited video as an independent video (with an independent FileId). Its lifecycle is not subject to the original live recorded video (even if the original recorded video is deleted, the clipping result will not be impacted). It can also be post-processed, such as transcoding or publishing on WeChat.

For example: A complete football match may last for over 2 hr, and the customer can store the original video for 2 months to save costs. However, for the highlight reel from live stream clipping, you can specify longer storage. You can also perform additional on-demand operations like transcoding and publishing on WeChat separately for the highlight reel. In this case, choose the live stream clipping and solidification solution.

The advantage of edit solidification is that its lifecycle is independent of the original recorded video, allowing separate management and long-term preservation.

<font color='red'>Note:</font> If you specify solidification when editing, enable reception of editing solidification event notifications through the ModifyEventConfig API. After successful solidification, you will receive a PersistenceComplete event notification. Upon receiving this event notification, you should not perform operations like deletion or cooling on the live video recording, otherwise exceptions may occur during playback of the generated video.

### Editing is not solidified
Non-solidified editing means the resulting m3u8 file shares the same TS segments with the live video recording. The generated video is not an independent and complete video (it has no standalone FileId, only a playback URL), and its valid period is consistent with the full video of the live recording. Once the live recording is deleted, it will lead to the video clip being unplayable.

Editing is not solidified. Since the clipping result is not an independent video, it will not be included in video management of on-demand media assets (for example, the total number of videos in the console will not count this video clip). It is also unable to perform any video processing operations such as transcoding or publishing on WeChat targeting this video clip separately.

The advantage of not curing clips is that they are "lightweight" and do not incur additional storage overhead. However, its shortcomings are that its life cycle is the same as that of the original recorded video, and it is impossible to further transcode and other Media Processing Service.
     * @param req LiveRealTimeClipRequest
     * @return LiveRealTimeClipResponse
     * @throws TencentCloudSDKException
     */
    public LiveRealTimeClipResponse LiveRealTimeClip(LiveRealTimeClipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LiveRealTimeClip", LiveRealTimeClipResponse.class);
    }

    /**
     *This API is used to manage initiated tasks.
     * @param req ManageTaskRequest
     * @return ManageTaskResponse
     * @throws TencentCloudSDKException
     */
    public ManageTaskResponse ManageTask(ManageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageTask", ManageTaskResponse.class);
    }

    /**
     *This API is used to modify a custom video content analysis template.

Note: templates with an ID below 10000 are preset and cannot be modified.
     * @param req ModifyAIAnalysisTemplateRequest
     * @return ModifyAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIAnalysisTemplateResponse ModifyAIAnalysisTemplate(ModifyAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAIAnalysisTemplate", ModifyAIAnalysisTemplateResponse.class);
    }

    /**
     *This API is used to modify a custom video content recognition template.
     * @param req ModifyAIRecognitionTemplateRequest
     * @return ModifyAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIRecognitionTemplateResponse ModifyAIRecognitionTemplate(ModifyAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAIRecognitionTemplate", ModifyAIRecognitionTemplateResponse.class);
    }

    /**
     *This API is used to modify an adaptive bitrate streaming template.
     * @param req ModifyAdaptiveDynamicStreamingTemplateRequest
     * @return ModifyAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdaptiveDynamicStreamingTemplateResponse ModifyAdaptiveDynamicStreamingTemplate(ModifyAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAdaptiveDynamicStreamingTemplate", ModifyAdaptiveDynamicStreamingTemplateResponse.class);
    }

    /**
     *This API is used to modify a custom animated image generating template.
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
     *Modify CDN Domain Config.
     * @param req ModifyCDNDomainConfigRequest
     * @return ModifyCDNDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCDNDomainConfigResponse ModifyCDNDomainConfig(ModifyCDNDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCDNDomainConfig", ModifyCDNDomainConfigResponse.class);
    }

    /**
     *This API is used to modify the category of a media file.
     * @param req ModifyClassRequest
     * @return ModifyClassResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClassResponse ModifyClass(ModifyClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClass", ModifyClassResponse.class);
    }

    /**
     *We have <font color=red>stopped updating</font> this API. Our new moderation templates can moderate audio/video as well as images. For details, see [ModifyReviewTemplate](https://intl.cloud.tencent.com/document/api/266/84388?from_cn_redirect=1).
This API is used to modify a custom audio/video moderation template.
     * @param req ModifyContentReviewTemplateRequest
     * @return ModifyContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentReviewTemplateResponse ModifyContentReviewTemplate(ModifyContentReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContentReviewTemplate", ModifyContentReviewTemplateResponse.class);
    }

    /**
     *This API is used to set the default storage region. A file will be stored in the default region if no region is specified for file upload.
     * @param req ModifyDefaultStorageRegionRequest
     * @return ModifyDefaultStorageRegionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultStorageRegionResponse ModifyDefaultStorageRegion(ModifyDefaultStorageRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDefaultStorageRegion", ModifyDefaultStorageRegionResponse.class);
    }

    /**
     *Modify enhance media template.
     * @param req ModifyEnhanceMediaTemplateRequest
     * @return ModifyEnhanceMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnhanceMediaTemplateResponse ModifyEnhanceMediaTemplate(ModifyEnhanceMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnhanceMediaTemplate", ModifyEnhanceMediaTemplateResponse.class);
    }

    /**
     *Tencent Cloud VOD provides customers with media upload, media management, media processing and other services. During or at the end of the execution of these services, Tencent Cloud On-Demand also provides various corresponding event notifications to facilitate developers to perceive the service processing status and Do the next business operation. 

Developers can achieve this by calling this interface:
- Set the type of callback notification received. Currently, there is [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948) and [reliable notification based on message queue](https://www.tencentcloud.com/document/product/266/33948) two types. 
- For [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948), you can set the address of the 3.0 format callback. For the description of 3.0 format callback, see [Historical Format Callback](https://intl.cloud.tencent.com/document/product/266/33796?from_cn_redirect=1). 
- Select settings to receive or ignore notification events for specific event services.
     * @param req ModifyEventConfigRequest
     * @return ModifyEventConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEventConfigResponse ModifyEventConfig(ModifyEventConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEventConfig", ModifyEventConfigResponse.class);
    }

    /**
     *Modify HeadTail Template.
     * @param req ModifyHeadTailTemplateRequest
     * @return ModifyHeadTailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHeadTailTemplateResponse ModifyHeadTailTemplate(ModifyHeadTailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHeadTailTemplate", ModifyHeadTailTemplateResponse.class);
    }

    /**
     *This API is used to modify a custom image sprite generating template.
     * @param req ModifyImageSpriteTemplateRequest
     * @return ModifyImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSpriteTemplateResponse ModifyImageSpriteTemplate(ModifyImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageSpriteTemplate", ModifyImageSpriteTemplateResponse.class);
    }

    /**
     *Modify Just In Time Transcode Template.
     * @param req ModifyJustInTimeTranscodeTemplateRequest
     * @return ModifyJustInTimeTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJustInTimeTranscodeTemplateResponse ModifyJustInTimeTranscodeTemplate(ModifyJustInTimeTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJustInTimeTranscodeTemplate", ModifyJustInTimeTranscodeTemplateResponse.class);
    }

    /**
     *Modify the parsing template of a large model
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
When modifying a template, require filling in MPS related parameters in JSON format into the MPSModifyTemplateParams parameter. For specific task parameter configuration methods, refer to the MPS task template document description.
     * @param req ModifyMPSTemplateRequest
     * @return ModifyMPSTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMPSTemplateResponse ModifyMPSTemplate(ModifyMPSTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMPSTemplate", ModifyMPSTemplateResponse.class);
    }

    /**
     *This API is used to modify the attributes of a media file, including category, name, description, tag, expiration time, timestamp information, video thumbnail, and subtitle information.
     * @param req ModifyMediaInfoRequest
     * @return ModifyMediaInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaInfoResponse ModifyMediaInfo(ModifyMediaInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMediaInfo", ModifyMediaInfoResponse.class);
    }

    /**
     *This API is used to modify the storage class of media files.
If the current storage class is STANDARD, it can be changed to one of the following classes:
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP ARCHIVE</li>
If the current storage class is STANDARD_IA, it can be changed to one of the following classes:
<li>STANDARD</li>
<li>ARCHIVE</li>
<li>DEEP ARCHIVE</li>
If the current storage class is ARCHIVE, it can be changed to the following class:
<li>STANDARD</li>
If the current storage class is DEEP ARCHIVE, it can be changed to the following class:
<li>STANDARD</li>
     * @param req ModifyMediaStorageClassRequest
     * @return ModifyMediaStorageClassResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaStorageClassResponse ModifyMediaStorageClass(ModifyMediaStorageClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMediaStorageClass", ModifyMediaStorageClassResponse.class);
    }

    /**
     *This API is used to modify sample information according to the sample ID. You can modify the name and description, add, delete, and reset facial features or tags. Leave at least one image after deleting facial features. To leave no image, please use the reset operation.
     * @param req ModifyPersonSampleRequest
     * @return ModifyPersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonSampleResponse ModifyPersonSample(ModifyPersonSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPersonSample", ModifyPersonSampleResponse.class);
    }

    /**
     *This API is used to modify a user-customized image asynchronous processing template.

Note: Template IDs below 10000 are system-preset templates and not allowed to be modified.
     * @param req ModifyProcessImageAsyncTemplateRequest
     * @return ModifyProcessImageAsyncTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProcessImageAsyncTemplateResponse ModifyProcessImageAsyncTemplate(ModifyProcessImageAsyncTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProcessImageAsyncTemplate", ModifyProcessImageAsyncTemplateResponse.class);
    }

    /**
     *Modifies media quality inspection template.
     * @param req ModifyQualityInspectTemplateRequest
     * @return ModifyQualityInspectTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQualityInspectTemplateResponse ModifyQualityInspectTemplate(ModifyQualityInspectTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQualityInspectTemplate", ModifyQualityInspectTemplateResponse.class);
    }

    /**
     *Modify Rebuild Media Template.
     * @param req ModifyRebuildMediaTemplateRequest
     * @return ModifyRebuildMediaTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRebuildMediaTemplateResponse ModifyRebuildMediaTemplate(ModifyRebuildMediaTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRebuildMediaTemplate", ModifyRebuildMediaTemplateResponse.class);
    }

    /**
     *This API is used to modify a custom moderation template.
> The templates can only be used by the APIs [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) and [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1).
     * @param req ModifyReviewTemplateRequest
     * @return ModifyReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReviewTemplateResponse ModifyReviewTemplate(ModifyReviewTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReviewTemplate", ModifyReviewTemplateResponse.class);
    }

    /**
     *This API is used to modify a playlist.
The modification will only take effect for new playback requests. For ongoing playback, the old playlist will be playable for seven days after the modification.
     * @param req ModifyRoundPlayRequest
     * @return ModifyRoundPlayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoundPlayResponse ModifyRoundPlay(ModifyRoundPlayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoundPlay", ModifyRoundPlayResponse.class);
    }

    /**
     *This API is used to modify a custom sampled screencapturing template.
     * @param req ModifySampleSnapshotTemplateRequest
     * @return ModifySampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleSnapshotTemplateResponse ModifySampleSnapshotTemplate(ModifySampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySampleSnapshotTemplate", ModifySampleSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to modify a custom time point screencapturing template.
     * @param req ModifySnapshotByTimeOffsetTemplateRequest
     * @return ModifySnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotByTimeOffsetTemplateResponse ModifySnapshotByTimeOffsetTemplate(ModifySnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate", ModifySnapshotByTimeOffsetTemplateResponse.class);
    }

    /**
     *This API is used to modify subapplication information, but it is not allowed to modify primary application information.
     * @param req ModifySubAppIdInfoRequest
     * @return ModifySubAppIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubAppIdInfoResponse ModifySubAppIdInfo(ModifySubAppIdInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubAppIdInfo", ModifySubAppIdInfoResponse.class);
    }

    /**
     *This API is used to enable/disable a subapplication. After a subapplication is disabled, its corresponding domain name will be blocked and its access to the console will be restricted.
     * @param req ModifySubAppIdStatusRequest
     * @return ModifySubAppIdStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubAppIdStatusResponse ModifySubAppIdStatus(ModifySubAppIdStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubAppIdStatus", ModifySubAppIdStatusResponse.class);
    }

    /**
     *We have <font color='red'>stopped updating</font> this API. Currently, you no longer need a player configuration to use player signatures. For details, see [Player Signature](https://intl.cloud.tencent.com/document/product/266/45554?from_cn_redirect=1).
This API is used to modify a player configuration.
     * @param req ModifySuperPlayerConfigRequest
     * @return ModifySuperPlayerConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySuperPlayerConfigResponse ModifySuperPlayerConfig(ModifySuperPlayerConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySuperPlayerConfig", ModifySuperPlayerConfigResponse.class);
    }

    /**
     *This API is used to modify a custom transcoding template.
     * @param req ModifyTranscodeTemplateRequest
     * @return ModifyTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTranscodeTemplateResponse ModifyTranscodeTemplate(ModifyTranscodeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTranscodeTemplate", ModifyTranscodeTemplateResponse.class);
    }

    /**
     *This API is used to modify the acceleration region of a domain name on VOD.
1. You can modify acceleration regions of only domain names whose status is `Online`.
     * @param req ModifyVodDomainAccelerateConfigRequest
     * @return ModifyVodDomainAccelerateConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVodDomainAccelerateConfigResponse ModifyVodDomainAccelerateConfig(ModifyVodDomainAccelerateConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVodDomainAccelerateConfig", ModifyVodDomainAccelerateConfigResponse.class);
    }

    /**
     *This API is used to modify domain name settings, such as the hotlink protection configuration.
1. You can modify settings of only domain names whose status is `Online`.
     * @param req ModifyVodDomainConfigRequest
     * @return ModifyVodDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVodDomainConfigResponse ModifyVodDomainConfig(ModifyVodDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVodDomainConfig", ModifyVodDomainConfigResponse.class);
    }

    /**
     *This API is used to modify a custom watermarking template. The watermark type cannot be modified.
     * @param req ModifyWatermarkTemplateRequest
     * @return ModifyWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWatermarkTemplateResponse ModifyWatermarkTemplate(ModifyWatermarkTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWatermarkTemplate", ModifyWatermarkTemplateResponse.class);
    }

    /**
     *This API is used to modify the use case and tag of a keyword. The keyword itself cannot be modified, but you can delete it and create another one if needed.
     * @param req ModifyWordSampleRequest
     * @return ModifyWordSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWordSampleResponse ModifyWordSample(ModifyWordSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWordSample", ModifyWordSampleResponse.class);
    }

    /**
     *This API is used to parse the index file content and return the list of segment files to be uploaded when an HLS video is uploaded. A segment file path must be a relative path of the current directory or subdirectory instead of a URL or absolute path.
     * @param req ParseStreamingManifestRequest
     * @return ParseStreamingManifestResponse
     * @throws TencentCloudSDKException
     */
    public ParseStreamingManifestResponse ParseStreamingManifest(ParseStreamingManifestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseStreamingManifest", ParseStreamingManifestResponse.class);
    }

    /**
     *This API is used to process images.
     * @param req ProcessImageAsyncRequest
     * @return ProcessImageAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ProcessImageAsyncResponse ProcessImageAsync(ProcessImageAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessImageAsync", ProcessImageAsyncResponse.class);
    }

    /**
     *This API is used to initiate processing tasks for audio-video media in on-demand video, with features including:
1. Video transcoding (watermarked);
2. Video-to-GIF.
3. Screenshot taking at specified time points;
4. Sampled screenshot taking;
5. Capture CSS sprites from video.
6. Capture a cover image from the video.
7. Transcoding to adaptive bitrate streaming (and encrypting);
8. Content review (offensive content, unsafe information, inappropriate information). <font color=red>Not recommended</font> to use this API for initiation. Recommended for use: [Audio-Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
9. Content analysis (tag, category, cover, frame tagging), HLS format not supported currently;
10. Content recognition (video intro and outro, human face, full text, text keyword, full speech, speech keyword, object).

If you use event notification, the event notification type is task flow status change (https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1).
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMedia", ProcessMediaResponse.class);
    }

    /**
     *Use the media processing capability of the media processing service to trigger media processing for on-demand video.

Video processing tasks initiated by this method:
Querying the status of tasks and results is still done on the VOD platform. Use [DescribeTaskDetail](https://www.tencentcloud.com/document/product/266/33431?from_cn_redirect=1) or [DescribeTasks](https://www.tencentcloud.com/document/product/266/33430?from_cn_redirect=1) to query tasks.
2. The amount and bills of related features will be provided on the MPS platform. Before using this feature, start by enabling the Media Processing Service (MPS) in the console. For the activation method, refer to the preliminary operations in the integration guide.
     * @param req ProcessMediaByMPSRequest
     * @return ProcessMediaByMPSResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByMPSResponse ProcessMediaByMPS(ProcessMediaByMPSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMediaByMPS", ProcessMediaByMPSResponse.class);
    }

    /**
     *This API is used to start a task flow on a video.
There are two ways to create a task flow template:
1. Create and modify a task flow template in the console;
2. Create a task flow template using the `CreateProcedureTemplate` API.

If event notifications are used, the event type for moderation tasks is [ReviewAudioVideoComplete](https://intl.cloud.tencent.com/document/product/266/81258?from_cn_redirect=1), and that for other tasks is [ProcedureStateChanged](https://intl.cloud.tencent.com/document/product/266/9636?from_cn_redirect=1).
     * @param req ProcessMediaByProcedureRequest
     * @return ProcessMediaByProcedureResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByProcedureResponse ProcessMediaByProcedure(ProcessMediaByProcedureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMediaByProcedure", ProcessMediaByProcedureResponse.class);
    }

    /**
     *This API is <font color='red'>disused</font>, please use [ProcessMedia](https://intl.cloud.tencent.com/document/product/862/37578?from_cn_redirect=1) API of MPS, with the input parameter `InputInfo.UrlInputInfo.Url` set to a video URL.
     * @param req ProcessMediaByUrlRequest
     * @return ProcessMediaByUrlResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaByUrlResponse ProcessMediaByUrl(ProcessMediaByUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMediaByUrl", ProcessMediaByUrlResponse.class);
    }

    /**
     ** This API is used to get event notifications from the business server through [reliable callback](https://intl.cloud.tencent.com/document/product/266/33948).
* The API gets event data through long polling. That is, if there is any unconsumed event on the server, the event notification will be returned to the requester immediately. If there is no unconsumed event on the server, the request will be suspended in the backend until a new event is generated.
* The request can be suspended for up to 5 seconds. It's recommended to set the request timeout period to 10 seconds.
* Event notifications not pulled will be retained for up to 4 days and may be cleared after this period.
* After the API returns an event, the caller must call the [ConfirmEvents](https://intl.cloud.tencent.com/document/product/266/34184) API within <font color="red">30 seconds</font> to confirm that the event notification has been processed. Otherwise, the event notification will be pulled again after <font color="red">30 seconds</font>.
* This API can get up to 16 event notifications at a time.
     * @param req PullEventsRequest
     * @return PullEventsResponse
     * @throws TencentCloudSDKException
     */
    public PullEventsResponse PullEvents(PullEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullEvents", PullEventsResponse.class);
    }

    /**
     *This API is used to pull a video on the internet to the VOD platform.
     * @param req PullUploadRequest
     * @return PullUploadResponse
     * @throws TencentCloudSDKException
     */
    public PullUploadResponse PullUpload(PullUploadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PullUpload", PullUploadResponse.class);
    }

    /**
     *1. This API is used to prefetch a list of specified URLs.
2. The URL domain names must have already been registered with VOD.
3. Up to 20 URLs can be specified in one request.
4. By default, the maximum number of URLs that can be refreshed per day is 10,000.
     * @param req PushUrlCacheRequest
     * @return PushUrlCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlCacheResponse PushUrlCache(PushUrlCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PushUrlCache", PushUrlCacheResponse.class);
    }

    /**
     *Initiate rebuild media
     * @param req RebuildMediaRequest
     * @return RebuildMediaResponse
     * @throws TencentCloudSDKException
     */
    public RebuildMediaResponse RebuildMedia(RebuildMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebuildMedia", RebuildMediaResponse.class);
    }

    /**
     *Rebuild media by template.
     * @param req RebuildMediaByTemplateRequest
     * @return RebuildMediaByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public RebuildMediaByTemplateResponse RebuildMediaByTemplate(RebuildMediaByTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebuildMediaByTemplate", RebuildMediaByTemplateResponse.class);
    }

    /**
     *1. This API is used to purge URLs.
2. The URL domain names must have already been registered with VOD.
3. Up to 20 URLs can be specified in one request.
4. By default, the maximum number of URLs allowed for purge per day is 100,000.
     * @param req RefreshUrlCacheRequest
     * @return RefreshUrlCacheResponse
     * @throws TencentCloudSDKException
     */
    public RefreshUrlCacheResponse RefreshUrlCache(RefreshUrlCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshUrlCache", RefreshUrlCacheResponse.class);
    }

    /**
     *This API is used to remove watermarks from a video.
     * @param req RemoveWatermarkRequest
     * @return RemoveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWatermarkResponse RemoveWatermark(RemoveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveWatermark", RemoveWatermarkResponse.class);
    }

    /**
     *This API is used to modify a custom task flow template.
     * @param req ResetProcedureTemplateRequest
     * @return ResetProcedureTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ResetProcedureTemplateResponse ResetProcedureTemplate(ResetProcedureTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetProcedureTemplate", ResetProcedureTemplateResponse.class);
    }

    /**
     *This API is used to restore files from ARCHIVE or DEEP ARCHIVE. Files stored in ARCHIVE or DEEP ARCHIVE must be restored before they can be accessed. Restored files are available for a limited period of time.
     * @param req RestoreMediaRequest
     * @return RestoreMediaResponse
     * @throws TencentCloudSDKException
     */
    public RestoreMediaResponse RestoreMedia(RestoreMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreMedia", RestoreMediaResponse.class);
    }

    /**
     *This API is used to start a moderation task on a file stored in VOD to detect non-compliant content in images, text, speech, and voice.

If event notifications are used, the event type is [ReviewAudioVideoComplete](https://intl.cloud.tencent.com/document/product/266/81258?from_cn_redirect=1).
     * @param req ReviewAudioVideoRequest
     * @return ReviewAudioVideoResponse
     * @throws TencentCloudSDKException
     */
    public ReviewAudioVideoResponse ReviewAudioVideo(ReviewAudioVideoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReviewAudioVideo", ReviewAudioVideoResponse.class);
    }

    /**
     *This API is used to moderate an image stored in VOD (detect pornographic and terrorist content).><li>The image file must be smaller than 5 MB.</li> ><li>To ensure the accuracy of moderation results, the image resolution must be higher than 256 x 256 px.</li> ><li>The format must be PNG, JPG, JPEG, BMP, GIF, or WEBP.</li>
     * @param req ReviewImageRequest
     * @return ReviewImageResponse
     * @throws TencentCloudSDKException
     */
    public ReviewImageResponse ReviewImage(ReviewImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReviewImage", ReviewImageResponse.class);
    }

    /**
     *Search media information, support multiple conditions filter criteria, and sort returned results, filter, and other features. This includes:
-Specify the file id collection FileIds, return media that matches any ID in the collection.
-Do fuzzy search based on multiple media file Names or Descriptions.
-Search for multiple filename prefixes NamePrefixes.
-Specify the category collection ClassIds (see input parameter), and media that meets any category in the collection will be returned. For example: media categories include movie, TV series, variety shows, among which movie has subcategories such as historical film, action film, romance film. If ClassIds specifies movie, TV series, then all subcategories under movie and TV series will be returned. If ClassIds specifies historical film, action film, then only media under these 2 subcategories will be returned.
-Specify the tag collection Tags (see input parameter), return media that meets any tag in the collection. For example: if a media has tags like ACG, palace drama, or parody remix, and Tags specifies ACG and parody remix, then any media that complies with any one of these two tags will be retrieved.
-Specify the file type set Categories (see input parameter), and return media that meets any type in the collection. For example: file types include Video, Audio, and Image. If Categories specifies Video and Audio, then media compliant with these types will be retrieved.
-Specify the source collection SourceTypes (see input parameter), return media that meets any source in the collection. For example: media sources include Record (live recording service) and Upload. If SourceTypes specifies Record and Upload, media that complies with these sources will be retrieved.
-Specify the file packaging format set MediaTypes (see input parameter), return media that meets any muxing format in the collection. For example: muxing formats include MP4, AVI, MP3. If MediaTypes specifies MP4 and MP3, then media that complies with these muxing formats will be retrieved.
-Specify the file status collection Status (see input parameter), return media that meets any status in the collection. For example: file status includes Normal, SystemForbidden (Platform Ban), Forbidden (Proactive Ban). If Status specifies Normal and Forbidden, media that complies with these states will be retrieved.
-Specify the file review result set ReviewResults (see input parameter), return media that meets any status in the collection. For example: file review results include pass and block. If ReviewResults specifies pass and block, media that complies with these review results will be retrieved.
-Specify the collection of live streaming codes StreamIds (see input parameter) to filter media for live recording.
-Filter media by creation time range of specified media.
-Specify TRTC application ID collection to filter media.
-Specify TRTC room ID collection to filter media.

-The above parameters can be combined in any combination for search. For example: filter media with creation time between 2018-12-01 12:00:00 and 2018-12-08 12:00:00, categorized as movie or TV series, and tagged with palace intrigue and suspense. Note that for any parameter supporting array input, the search logic between its elements is 'OR'. The logical relationship between ALL parameters is 'AND'.

-Allow passage through Filters to control the type of media information returned (default return all information). Selectable inputs include:
1. Basic information (basicInfo): media name, category, playback address, cover image.
2. Meta information (metaData): include size, duration, video stream information, audio stream information.
3. Transcoding result information (transcodeInfo): includes generated media addresses, video stream parameters, audio stream parameters for different specifications.
4. Animated graphics info (animatedGraphicsInfo): The info of animated graphics after video-to-gif conversion, such as gif.
5. Sampled screenshot information (sampleSnapshotInfo): Screenshot information after sampling screenshot taking.
6. Sprite image information (imageSpriteInfo): The sprite image information of the captured sprite image file from the video.
7. Screenshot information at the specified time point (snapshotByTimeOffsetInfo): This API is used to obtain screenshot information after capturing snapshots at specified time points.
8. Video timestamp information (keyFrameDescInfo): The dotting information for video setting.
9. Adaptive Bitrate Streaming information (adaptiveDynamicStreamingInfo): including specification, encryption type, packaging format and other related information.

-Allow sorting the results by creation time and return in pages, using Offset and Limit (see input parameter) to control pagination.

<div id="maxResultsDesc">API return result count limit:</div>

-<b>Both <a href="#p_offset">Offset</a> and <a href="#p_limit">Limit</a> parameters impact the number of pagination query results. Special attention: by default, this interface only returns up to 10 query results when both values are not specified.</b>
-<b>The maximum number of search results supported is 5000. Excess results are no longer supported for querying. If the search result volume is too large, recommend using more granular criteria to reduce the results.</b>

Conditional filtering not recommend
-(Not recommended: Use Names, NamePrefixes, or Descriptions as alternatives) Specify single text Text to do fuzzy search on media file name or description.
-(Not recommended: Use SourceTypes as an alternative) Search for one media file source by specifying SourceType.
-(Not recommended: Use StreamIds as an alternative) Specify single push stream live code StreamId to search for.
-(Not recommended: Use CreateTime instead) Specify single start creation time StartTime to search.
-(Not recommended: Use CreateTime as alternative) Specify single ending creation time EndTime to search.
     * @param req SearchMediaRequest
     * @return SearchMediaResponse
     * @throws TencentCloudSDKException
     */
    public SearchMediaResponse SearchMedia(SearchMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchMedia", SearchMediaResponse.class);
    }

    /**
     *This API is used to conduct semantic search on media using natural language.
     * @param req SearchMediaBySemanticsRequest
     * @return SearchMediaBySemanticsResponse
     * @throws TencentCloudSDKException
     */
    public SearchMediaBySemanticsResponse SearchMediaBySemantics(SearchMediaBySemanticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchMediaBySemantics", SearchMediaBySemanticsResponse.class);
    }

    /**
     *This API is used to configure DRM key information.
     * @param req SetDrmKeyProviderInfoRequest
     * @return SetDrmKeyProviderInfoResponse
     * @throws TencentCloudSDKException
     */
    public SetDrmKeyProviderInfoResponse SetDrmKeyProviderInfo(SetDrmKeyProviderInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDrmKeyProviderInfo", SetDrmKeyProviderInfoResponse.class);
    }

    /**
     *Set Vod Domain Certificate.
     * @param req SetVodDomainCertificateRequest
     * @return SetVodDomainCertificateResponse
     * @throws TencentCloudSDKException
     */
    public SetVodDomainCertificateResponse SetVodDomainCertificate(SetVodDomainCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVodDomainCertificate", SetVodDomainCertificateResponse.class);
    }

    /**
     *This API is used to crop an HLS video by time period and generate a new real-time HLS video. Developers can share it immediately or preserve it for long-term.

Tencent Cloud Video on Demand (VOD) supports two editing modes:
-Edit and save: Save the edited video as an independent video with a standalone FileId. Suitable for scenarios requiring long-term preservation of highlight clips.
-Editing is not solidified: The video obtained by editing is attached to the input file with no standalone FileId. It is suitable for scenarios where highlight clips are temporarily shared.

This API is used to crop based on input m3u8 files, with a minimum editing precision of a ts slice. Second-level or more precise editing precision cannot be achieved.

### Edit solidification
Video clipping persistence refers to saving an edited video as an independent video (with an independent FileId). Its lifecycle is not subject to the original input video (even if the original input video is deleted, the clipping result will not have any impact). It can also be post-processed, such as transcoding or publishing on WeChat.

For example, a complete football match may last for over 2 hours. To save costs, the customer can store the original video for 2 months, but may choose to store the highlight reel for longer. You can also transcode the highlight reel, publish it on WeChat, and perform additional on-demand operations. In this case, you can choose the edit and save solution.

The advantage of edit is that its lifecycle is independent of the original input video, allowing separate management and long-term preservation.

<font color='red'>Note:</font> If you specify solidification when editing, enable reception of editing solidification event notifications via the ModifyEventConfig API. After successful solidification, you will receive a PersistenceComplete event notification. Before receiving this event notification, you should not delete or downgrade the original input video, otherwise exceptions may occur during playback of the generated video.

### Editing is not solidified
Non-solidified editing means the result of editing (m3u8 file) shares the same TS segments with the original input video. The generated video is not an independent and complete video (it has no standalone FileId, only a playback URL), and its valid period is consistent with that of the original input full video. Once the original input video is deleted, it will lead to the video clip being unable to play.

Editing is not solidified. Since the clipping result is not an independent video, it will not be included in video management of on-demand media assets (for example, the total number of videos in the console will not count this video clip) and cannot be targeted for any video processing operations such as transcoding or publishing on WeChat.

The advantage of editing not being solidified is that the editing operation is relatively lightweight and will not generate additional storage overhead. However, the shortcoming is that its lifecycle is the same as the original recorded video, and it is unable to further transcode or perform video processing.
     * @param req SimpleHlsClipRequest
     * @return SimpleHlsClipResponse
     * @throws TencentCloudSDKException
     */
    public SimpleHlsClipResponse SimpleHlsClip(SimpleHlsClipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SimpleHlsClip", SimpleHlsClipResponse.class);
    }

    /**
     *Split the video into strips to generate multiple new videos.
     * @param req SplitMediaRequest
     * @return SplitMediaResponse
     * @throws TencentCloudSDKException
     */
    public SplitMediaResponse SplitMedia(SplitMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SplitMedia", SplitMediaResponse.class);
    }

    /**
     *This API is used for enabling/disabling the CDN acceleration domain.
     * @param req StartCDNDomainRequest
     * @return StartCDNDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartCDNDomainResponse StartCDNDomain(StartCDNDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCDNDomain", StartCDNDomainResponse.class);
    }

    /**
     *This API is used to verify the domain name resolution value.
     * @param req VerifyDomainRecordRequest
     * @return VerifyDomainRecordResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDomainRecordResponse VerifyDomainRecord(VerifyDomainRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyDomainRecord", VerifyDomainRecordResponse.class);
    }

}
