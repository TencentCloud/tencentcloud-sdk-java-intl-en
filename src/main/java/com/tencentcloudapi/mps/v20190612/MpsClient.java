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
package com.tencentcloudapi.mps.v20190612;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mps.v20190612.models.*;

public class MpsClient extends AbstractClient{
    private static String endpoint = "mps.tencentcloudapi.com";
    private static String version = "2019-06-12";

    public MpsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MpsClient(Credential credential, String region, ClientProfile profile) {
        super(MpsClient.endpoint, MpsClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a custom content analysis template. Up to 50 templates can be created.
     * @param req CreateAIAnalysisTemplateRequest
     * @return CreateAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIAnalysisTemplateResponse CreateAIAnalysisTemplate(CreateAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAIAnalysisTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAIAnalysisTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAIAnalysisTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom content recognition template. Up to 50 templates can be created.
     * @param req CreateAIRecognitionTemplateRequest
     * @return CreateAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIRecognitionTemplateResponse CreateAIRecognitionTemplate(CreateAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAIRecognitionTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAIRecognitionTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAIRecognitionTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an adaptive bitrate streaming template. Up up to 100 such templates can be created.
     * @param req CreateAdaptiveDynamicStreamingTemplateRequest
     * @return CreateAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdaptiveDynamicStreamingTemplateResponse CreateAdaptiveDynamicStreamingTemplate(CreateAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAdaptiveDynamicStreamingTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAdaptiveDynamicStreamingTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAdaptiveDynamicStreamingTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom animated image generating template. Up to 16 templates can be created.
     * @param req CreateAnimatedGraphicsTemplateRequest
     * @return CreateAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnimatedGraphicsTemplateResponse CreateAnimatedGraphicsTemplate(CreateAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAnimatedGraphicsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom content audit template. Up to 50 templates can be created.
     * @param req CreateContentReviewTemplateRequest
     * @return CreateContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentReviewTemplateResponse CreateContentReviewTemplate(CreateContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateContentReviewTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateContentReviewTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateContentReviewTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom image sprite generating template. Up to 16 templates can be created.
     * @param req CreateImageSpriteTemplateRequest
     * @return CreateImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSpriteTemplateResponse CreateImageSpriteTemplate(CreateImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageSpriteTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a figure sample for video processing operations such as content recognition and audit using the face recognition technology.
     * @param req CreatePersonSampleRequest
     * @return CreatePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonSampleResponse CreatePersonSample(CreatePersonSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePersonSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom sampled screencapturing template. Up to 16 templates can be created.
     * @param req CreateSampleSnapshotTemplateRequest
     * @return CreateSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSampleSnapshotTemplateResponse CreateSampleSnapshotTemplate(CreateSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSampleSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom time point screencapturing template. Up to 16 templates can be created.
     * @param req CreateSnapshotByTimeOffsetTemplateRequest
     * @return CreateSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotByTimeOffsetTemplateResponse CreateSnapshotByTimeOffsetTemplate(CreateSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom transcoding template. Up to 1,000 templates can be created.
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a custom watermarking template. Up to 1,000 templates can be created.
     * @param req CreateWatermarkTemplateRequest
     * @return CreateWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWatermarkTemplateResponse CreateWatermarkTemplate(CreateWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWatermarkTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create keyword samples in batches for video processing operations such as content recognition and audit using the OCR and ASR technologies.
     * @param req CreateWordSamplesRequest
     * @return CreateWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public CreateWordSamplesResponse CreateWordSamples(CreateWordSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWordSamplesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWordSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWordSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set a processing rule for media files uploaded to the specified directory of a COS bucket, including:
1. Video transcoding (with watermark);
2. Animated image generating;
3. Time point screencapturing;
4. Sampled screencapturing;
5. Image sprite generating;
6. Video conversion to adaptive bitrate streaming;
7. Intelligent content audit (detection of porn, terrorism, and politically sensitive information);
8. Intelligent content recognition (face recognition, full text recognition, text keyword recognition, full speech recognition, and speech keyword recognition).

Note: Once successfully created, a workflow is disabled by default and needs to be enabled manually.
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom content analysis template.

Note: templates with an ID below 10000 are preset and cannot be deleted.
     * @param req DeleteAIAnalysisTemplateRequest
     * @return DeleteAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisTemplateResponse DeleteAIAnalysisTemplate(DeleteAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAIAnalysisTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAIAnalysisTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAIAnalysisTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom content recognition template.
     * @param req DeleteAIRecognitionTemplateRequest
     * @return DeleteAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIRecognitionTemplateResponse DeleteAIRecognitionTemplate(DeleteAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAIRecognitionTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAIRecognitionTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAIRecognitionTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an adaptive bitrate streaming template.
     * @param req DeleteAdaptiveDynamicStreamingTemplateRequest
     * @return DeleteAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAdaptiveDynamicStreamingTemplateResponse DeleteAdaptiveDynamicStreamingTemplate(DeleteAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAdaptiveDynamicStreamingTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAdaptiveDynamicStreamingTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAdaptiveDynamicStreamingTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom animated image generating template.
     * @param req DeleteAnimatedGraphicsTemplateRequest
     * @return DeleteAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAnimatedGraphicsTemplateResponse DeleteAnimatedGraphicsTemplate(DeleteAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom content audit template.
     * @param req DeleteContentReviewTemplateRequest
     * @return DeleteContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentReviewTemplateResponse DeleteContentReviewTemplate(DeleteContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteContentReviewTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteContentReviewTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteContentReviewTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an image sprite generating template.
     * @param req DeleteImageSpriteTemplateRequest
     * @return DeleteImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSpriteTemplateResponse DeleteImageSpriteTemplate(DeleteImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageSpriteTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a figure sample based on figure ID.
     * @param req DeletePersonSampleRequest
     * @return DeletePersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonSampleResponse DeletePersonSample(DeletePersonSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePersonSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom sampled screencapturing template.
     * @param req DeleteSampleSnapshotTemplateRequest
     * @return DeleteSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSampleSnapshotTemplateResponse DeleteSampleSnapshotTemplate(DeleteSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSampleSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom time point screencapturing template.
     * @param req DeleteSnapshotByTimeOffsetTemplateRequest
     * @return DeleteSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotByTimeOffsetTemplateResponse DeleteSnapshotByTimeOffsetTemplate(DeleteSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom transcoding template.
     * @param req DeleteTranscodeTemplateRequest
     * @return DeleteTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTranscodeTemplateResponse DeleteTranscodeTemplate(DeleteTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a custom watermarking template.
     * @param req DeleteWatermarkTemplateRequest
     * @return DeleteWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWatermarkTemplateResponse DeleteWatermarkTemplate(DeleteWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWatermarkTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete keyword samples in batches.
     * @param req DeleteWordSamplesRequest
     * @return DeleteWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWordSamplesResponse DeleteWordSamples(DeleteWordSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWordSamplesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWordSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWordSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a workflow. An enabled workflow must be disabled before it can be deleted.
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of content analysis templates based on unique template ID. The returned result includes all eligible custom and preset video content analysis templates.
     * @param req DescribeAIAnalysisTemplatesRequest
     * @return DescribeAIAnalysisTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisTemplatesResponse DescribeAIAnalysisTemplates(DescribeAIAnalysisTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAIAnalysisTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAIAnalysisTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAIAnalysisTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of content recognition templates based on unique template ID. The return result includes all eligible custom and preset content recognition templates.
     * @param req DescribeAIRecognitionTemplatesRequest
     * @return DescribeAIRecognitionTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIRecognitionTemplatesResponse DescribeAIRecognitionTemplates(DescribeAIRecognitionTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAIRecognitionTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAIRecognitionTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAIRecognitionTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of adaptive bitrate streaming templates and supports paginated queries by filters.
     * @param req DescribeAdaptiveDynamicStreamingTemplatesRequest
     * @return DescribeAdaptiveDynamicStreamingTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdaptiveDynamicStreamingTemplatesResponse DescribeAdaptiveDynamicStreamingTemplates(DescribeAdaptiveDynamicStreamingTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAdaptiveDynamicStreamingTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAdaptiveDynamicStreamingTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAdaptiveDynamicStreamingTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of animated image generating templates and supports paged queries by filters.
     * @param req DescribeAnimatedGraphicsTemplatesRequest
     * @return DescribeAnimatedGraphicsTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnimatedGraphicsTemplatesResponse DescribeAnimatedGraphicsTemplates(DescribeAnimatedGraphicsTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAnimatedGraphicsTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of content audit templates based on unique template ID. The return result includes all eligible custom and preset content audit templates.
     * @param req DescribeContentReviewTemplatesRequest
     * @return DescribeContentReviewTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentReviewTemplatesResponse DescribeContentReviewTemplates(DescribeContentReviewTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContentReviewTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContentReviewTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeContentReviewTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of image sprite generating templates and supports paged queries by filters.
     * @param req DescribeImageSpriteTemplatesRequest
     * @return DescribeImageSpriteTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSpriteTemplatesResponse DescribeImageSpriteTemplates(DescribeImageSpriteTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSpriteTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSpriteTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageSpriteTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the metadata of media, such as video image width/height, codec, length, and frame rate.
     * @param req DescribeMediaMetaDataRequest
     * @return DescribeMediaMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaMetaDataResponse DescribeMediaMetaData(DescribeMediaMetaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaMetaDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaMetaDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaMetaData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of figure samples and supports paged queries by figure ID, name, and tag.
     * @param req DescribePersonSamplesRequest
     * @return DescribePersonSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonSamplesResponse DescribePersonSamples(DescribePersonSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonSamplesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersonSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of sampled screencapturing templates and supports paged queries by filters.
     * @param req DescribeSampleSnapshotTemplatesRequest
     * @return DescribeSampleSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleSnapshotTemplatesResponse DescribeSampleSnapshotTemplates(DescribeSampleSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleSnapshotTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleSnapshotTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSampleSnapshotTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of time point screencapturing templates and supports paged queries by filters.
     * @param req DescribeSnapshotByTimeOffsetTemplatesRequest
     * @return DescribeSnapshotByTimeOffsetTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotByTimeOffsetTemplatesResponse DescribeSnapshotByTimeOffsetTemplates(DescribeSnapshotByTimeOffsetTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of execution status and result of a task submitted in the last 3 days by task ID.
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of transcoding templates based on unique template ID. The return result includes all eligible custom and [preset transcoding templates](https://intl.cloud.tencent.com/document/product/266/33476?from_cn_redirect=1#.E9.A2.84.E7.BD.AE.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     * @param req DescribeTranscodeTemplatesRequest
     * @return DescribeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTemplatesResponse DescribeTranscodeTemplates(DescribeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTranscodeTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query custom watermarking templates and supports paged queries by filters.
     * @param req DescribeWatermarkTemplatesRequest
     * @return DescribeWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWatermarkTemplatesResponse DescribeWatermarkTemplates(DescribeWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWatermarkTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWatermarkTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWatermarkTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to perform paged queries of keyword sample information by use case, keyword, and tag.
     * @param req DescribeWordSamplesRequest
     * @return DescribeWordSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWordSamplesResponse DescribeWordSamples(DescribeWordSamplesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWordSamplesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWordSamplesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWordSamples"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of workflow details by workflow ID.
     * @param req DescribeWorkflowsRequest
     * @return DescribeWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowsResponse DescribeWorkflows(DescribeWorkflowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWorkflows"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable a workflow.
     * @param req DisableWorkflowRequest
     * @return DisableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DisableWorkflowResponse DisableWorkflow(DisableWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to edit a video (by clipping, splicing, etc.) to generate a new VOD video. Editing features include:

1. Clipping a file to generate a new video;
2. Splicing multiple files to generate a new video;
3. Clipping multiple files and then splicing the clips to generate a new video.
     * @param req EditMediaRequest
     * @return EditMediaResponse
     * @throws TencentCloudSDKException
     */
    public EditMediaResponse EditMedia(EditMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EditMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EditMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a workflow.
     * @param req EnableWorkflowRequest
     * @return EnableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public EnableWorkflowResponse EnableWorkflow(EnableWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to manage an initiated task.
> Note: currently, you can only terminate an ongoing live stream processing task.
     * @param req ManageTaskRequest
     * @return ManageTaskResponse
     * @throws TencentCloudSDKException
     */
    public ManageTaskResponse ManageTask(ManageTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManageTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManageTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom content analysis template.

Note: templates with an ID below 10000 are preset and cannot be modified.
     * @param req ModifyAIAnalysisTemplateRequest
     * @return ModifyAIAnalysisTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIAnalysisTemplateResponse ModifyAIAnalysisTemplate(ModifyAIAnalysisTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAIAnalysisTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAIAnalysisTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAIAnalysisTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom content recognition template.
     * @param req ModifyAIRecognitionTemplateRequest
     * @return ModifyAIRecognitionTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIRecognitionTemplateResponse ModifyAIRecognitionTemplate(ModifyAIRecognitionTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAIRecognitionTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAIRecognitionTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAIRecognitionTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an adaptive bitrate streaming template.
     * @param req ModifyAdaptiveDynamicStreamingTemplateRequest
     * @return ModifyAdaptiveDynamicStreamingTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdaptiveDynamicStreamingTemplateResponse ModifyAdaptiveDynamicStreamingTemplate(ModifyAdaptiveDynamicStreamingTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAdaptiveDynamicStreamingTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAdaptiveDynamicStreamingTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAdaptiveDynamicStreamingTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom animated image generating template.
     * @param req ModifyAnimatedGraphicsTemplateRequest
     * @return ModifyAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAnimatedGraphicsTemplateResponse ModifyAnimatedGraphicsTemplate(ModifyAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom content audit template.
     * @param req ModifyContentReviewTemplateRequest
     * @return ModifyContentReviewTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentReviewTemplateResponse ModifyContentReviewTemplate(ModifyContentReviewTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyContentReviewTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContentReviewTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyContentReviewTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom image sprite generating template.
     * @param req ModifyImageSpriteTemplateRequest
     * @return ModifyImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSpriteTemplateResponse ModifyImageSpriteTemplate(ModifyImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageSpriteTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify figure sample information based on figure ID, such as modifying the name and description and adding/deleting/resetting a face or tag. There should be at least one image left after the face deletion operation; otherwise, please use the reset operation.
     * @param req ModifyPersonSampleRequest
     * @return ModifyPersonSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonSampleResponse ModifyPersonSample(ModifyPersonSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom sampled screencapturing template.
     * @param req ModifySampleSnapshotTemplateRequest
     * @return ModifySampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleSnapshotTemplateResponse ModifySampleSnapshotTemplate(ModifySampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySampleSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom time point screencapturing template.
     * @param req ModifySnapshotByTimeOffsetTemplateRequest
     * @return ModifySnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotByTimeOffsetTemplateResponse ModifySnapshotByTimeOffsetTemplate(ModifySnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom transcoding template.
     * @param req ModifyTranscodeTemplateRequest
     * @return ModifyTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTranscodeTemplateResponse ModifyTranscodeTemplate(ModifyTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a custom watermarking template. The watermark type cannot be modified.
     * @param req ModifyWatermarkTemplateRequest
     * @return ModifyWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWatermarkTemplateResponse ModifyWatermarkTemplate(ModifyWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWatermarkTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the use case and tag of a keyword. The keyword itself cannot be modified, but you can delete it and create another one if needed.
     * @param req ModifyWordSampleRequest
     * @return ModifyWordSampleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWordSampleResponse ModifyWordSample(ModifyWordSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWordSampleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWordSampleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWordSample"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to parse the content of an MPS live stream processing event notification from the `msgBody` field in the message received from CMQ.
Instead of initiating a video processing task, this API is used to help generate SDKs for various programming languages. You can parse the event notification based on the analytic function of the SDKs.
     * @param req ParseLiveStreamProcessNotificationRequest
     * @return ParseLiveStreamProcessNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseLiveStreamProcessNotificationResponse ParseLiveStreamProcessNotification(ParseLiveStreamProcessNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseLiveStreamProcessNotificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ParseLiveStreamProcessNotificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ParseLiveStreamProcessNotification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to parse the content of an MPS event notification from the `msgBody` field in the message received from CMQ.
Instead of initiating a video processing task, this API is used to help generate SDKs for various programming languages. You can parse the event notification based on the analytic function of the SDKs.
     * @param req ParseNotificationRequest
     * @return ParseNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseNotificationResponse ParseNotification(ParseNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseNotificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ParseNotificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ParseNotification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to initiate a processing task for a live streaming media file, including:

* Intelligent content audit (detection of porn, terrorism, and politically sensitive information in image and porn information in speech);

The live stream processing event notification is written into the specified CMQ queue in real time. You need to obtain the event notification result from CMQ. If a file is output during video processing, it will be written into the specified target bucket.
     * @param req ProcessLiveStreamRequest
     * @return ProcessLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ProcessLiveStreamResponse ProcessLiveStream(ProcessLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to initiate a processing task for media files in COS, including:
1. Video transcoding (with watermark);
2. Animated image generating;
3. Time point screencapturing;
4. Sampled screencapturing;
5. Image sprite generating;
6. Video conversion to adaptive bitrate streaming;
7. Intelligent content audit (detection of porn, terrorism, and politically sensitive information);
8. Intelligent content recognition (face recognition, full text recognition, text keyword recognition, full speech recognition, and speech keyword recognition).
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset an existing workflow that is disabled.
     * @param req ResetWorkflowRequest
     * @return ResetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public ResetWorkflowResponse ResetWorkflow(ResetWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
