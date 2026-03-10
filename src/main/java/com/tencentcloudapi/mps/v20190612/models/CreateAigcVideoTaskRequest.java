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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcVideoTaskRequest extends AbstractModel {

    /**
    * <p>Model name.<br>Supported models:<br>Hunyuan.<br>Hailuo.<br>Kling.<br>Vidu.<br>OS.<br>GV.</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Specific version number of the model. By default, the system uses the supported stable version of the model.</p><ol><li>Hailuo: [02 and 2.3].</li><li>Kling: [2.0, 2.1, 2.5, O1, 2.6, 3.0, and 3.0-Omni].</li><li>Vidu: [q2, q2-pro, q2-turbo, q3-pro, and q3-turbo].</li><li>GV: [3.1].</li><li>OS: [2.0].</li></ol>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Scenario for the generated video.<br>Note: Not all models support scenarios.</p><ol><li>Kling supports motion control (motion_control).</li><li>Mingmou supports landscape-to-portrait conversion (land2port).</li><li>Vidu supports special effect templates (template_effect).</li></ol>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Specifies the content you want to prevent the model from generating.<br>Note: Not all models support this.<br>For example:<br>Top lighting and bright colors.<br>People and animals.<br>Multiple vehicles and wind.</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.</p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * <p>Image URL for video generation. The URL must be accessible from the public network.<br>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different size limits.</li><li>Supported image formats: JPEG and PNG.</li><li>If the OS model is used, the input image dimension should be 1280x720 or 720x1280.</li></ol>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>The model will generate a video using the image of this parameter as the ending frame.<br>Models that support this parameter:</p><ol><li>GV. If the ending frame image is specified, ImageUrl is required as the starting frame.</li><li>Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.</li><li>Vidu. q2-pro and q2-turbo support starting and ending frames.</li></ol><p>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different limits.</li><li>Supported image formats: JPEG and PNG.</li></ol>
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * <p>List of up to 3 asset images, used to describe the images the model should use for video generation.</p><p>Model that supports multiple images:</p><ol><li>GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.</li><li>Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.</li></ol><p>Note:</p><ol><li>The image size cannot exceed 10 MB.</li><li>Supported image formats: JPEG and PNG.</li></ol>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcVideoReferenceImageInfo [] ImageInfos;

    /**
    * <p>Only Kling O1 supports reference video information.<br>This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcVideoReferenceVideoInfo [] VideoInfos;

    /**
    * <p>Duration of the generated video.<br>Note:</p><ol><li>Kling supports 5 and 10 seconds. Default value: 5 seconds.</li><li>The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.</li><li>Vidu supports 1 to 10 seconds.</li><li>GV supports 8 seconds. Default value: 8 seconds.</li><li>OS supports 4, 8, and 12 seconds. Default value: 8 seconds.</li></ol>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>Additional parameters required.</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcVideoExtraParam ExtraParameters;

    /**
    * <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * <p>Special scenario parameters required by the model, formatted as a JSON serialized string.<br>Example:<br>{"camera_control":{"type":"simple"}}.</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>API operator name.</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>Model name.<br>Supported models:<br>Hunyuan.<br>Hailuo.<br>Kling.<br>Vidu.<br>OS.<br>GV.</p> 
     * @return ModelName <p>Model name.<br>Supported models:<br>Hunyuan.<br>Hailuo.<br>Kling.<br>Vidu.<br>OS.<br>GV.</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name.<br>Supported models:<br>Hunyuan.<br>Hailuo.<br>Kling.<br>Vidu.<br>OS.<br>GV.</p>
     * @param ModelName <p>Model name.<br>Supported models:<br>Hunyuan.<br>Hailuo.<br>Kling.<br>Vidu.<br>OS.<br>GV.</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Specific version number of the model. By default, the system uses the supported stable version of the model.</p><ol><li>Hailuo: [02 and 2.3].</li><li>Kling: [2.0, 2.1, 2.5, O1, 2.6, 3.0, and 3.0-Omni].</li><li>Vidu: [q2, q2-pro, q2-turbo, q3-pro, and q3-turbo].</li><li>GV: [3.1].</li><li>OS: [2.0].</li></ol> 
     * @return ModelVersion <p>Specific version number of the model. By default, the system uses the supported stable version of the model.</p><ol><li>Hailuo: [02 and 2.3].</li><li>Kling: [2.0, 2.1, 2.5, O1, 2.6, 3.0, and 3.0-Omni].</li><li>Vidu: [q2, q2-pro, q2-turbo, q3-pro, and q3-turbo].</li><li>GV: [3.1].</li><li>OS: [2.0].</li></ol>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Specific version number of the model. By default, the system uses the supported stable version of the model.</p><ol><li>Hailuo: [02 and 2.3].</li><li>Kling: [2.0, 2.1, 2.5, O1, 2.6, 3.0, and 3.0-Omni].</li><li>Vidu: [q2, q2-pro, q2-turbo, q3-pro, and q3-turbo].</li><li>GV: [3.1].</li><li>OS: [2.0].</li></ol>
     * @param ModelVersion <p>Specific version number of the model. By default, the system uses the supported stable version of the model.</p><ol><li>Hailuo: [02 and 2.3].</li><li>Kling: [2.0, 2.1, 2.5, O1, 2.6, 3.0, and 3.0-Omni].</li><li>Vidu: [q2, q2-pro, q2-turbo, q3-pro, and q3-turbo].</li><li>GV: [3.1].</li><li>OS: [2.0].</li></ol>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Scenario for the generated video.<br>Note: Not all models support scenarios.</p><ol><li>Kling supports motion control (motion_control).</li><li>Mingmou supports landscape-to-portrait conversion (land2port).</li><li>Vidu supports special effect templates (template_effect).</li></ol> 
     * @return SceneType <p>Scenario for the generated video.<br>Note: Not all models support scenarios.</p><ol><li>Kling supports motion control (motion_control).</li><li>Mingmou supports landscape-to-portrait conversion (land2port).</li><li>Vidu supports special effect templates (template_effect).</li></ol>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario for the generated video.<br>Note: Not all models support scenarios.</p><ol><li>Kling supports motion control (motion_control).</li><li>Mingmou supports landscape-to-portrait conversion (land2port).</li><li>Vidu supports special effect templates (template_effect).</li></ol>
     * @param SceneType <p>Scenario for the generated video.<br>Note: Not all models support scenarios.</p><ol><li>Kling supports motion control (motion_control).</li><li>Mingmou supports landscape-to-portrait conversion (land2port).</li><li>Vidu supports special effect templates (template_effect).</li></ol>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p> 
     * @return Prompt <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
     * @param Prompt <p>Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Specifies the content you want to prevent the model from generating.<br>Note: Not all models support this.<br>For example:<br>Top lighting and bright colors.<br>People and animals.<br>Multiple vehicles and wind.</p> 
     * @return NegativePrompt <p>Specifies the content you want to prevent the model from generating.<br>Note: Not all models support this.<br>For example:<br>Top lighting and bright colors.<br>People and animals.<br>Multiple vehicles and wind.</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>Specifies the content you want to prevent the model from generating.<br>Note: Not all models support this.<br>For example:<br>Top lighting and bright colors.<br>People and animals.<br>Multiple vehicles and wind.</p>
     * @param NegativePrompt <p>Specifies the content you want to prevent the model from generating.<br>Note: Not all models support this.<br>For example:<br>Top lighting and bright colors.<br>People and animals.<br>Multiple vehicles and wind.</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.</p> 
     * @return EnhancePrompt <p>The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.</p>
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.</p>
     * @param EnhancePrompt <p>The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.</p>
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>Image URL for video generation. The URL must be accessible from the public network.<br>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different size limits.</li><li>Supported image formats: JPEG and PNG.</li><li>If the OS model is used, the input image dimension should be 1280x720 or 720x1280.</li></ol> 
     * @return ImageUrl <p>Image URL for video generation. The URL must be accessible from the public network.<br>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different size limits.</li><li>Supported image formats: JPEG and PNG.</li><li>If the OS model is used, the input image dimension should be 1280x720 or 720x1280.</li></ol>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>Image URL for video generation. The URL must be accessible from the public network.<br>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different size limits.</li><li>Supported image formats: JPEG and PNG.</li><li>If the OS model is used, the input image dimension should be 1280x720 or 720x1280.</li></ol>
     * @param ImageUrl <p>Image URL for video generation. The URL must be accessible from the public network.<br>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different size limits.</li><li>Supported image formats: JPEG and PNG.</li><li>If the OS model is used, the input image dimension should be 1280x720 or 720x1280.</li></ol>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>The model will generate a video using the image of this parameter as the ending frame.<br>Models that support this parameter:</p><ol><li>GV. If the ending frame image is specified, ImageUrl is required as the starting frame.</li><li>Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.</li><li>Vidu. q2-pro and q2-turbo support starting and ending frames.</li></ol><p>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different limits.</li><li>Supported image formats: JPEG and PNG.</li></ol> 
     * @return LastImageUrl <p>The model will generate a video using the image of this parameter as the ending frame.<br>Models that support this parameter:</p><ol><li>GV. If the ending frame image is specified, ImageUrl is required as the starting frame.</li><li>Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.</li><li>Vidu. q2-pro and q2-turbo support starting and ending frames.</li></ol><p>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different limits.</li><li>Supported image formats: JPEG and PNG.</li></ol>
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set <p>The model will generate a video using the image of this parameter as the ending frame.<br>Models that support this parameter:</p><ol><li>GV. If the ending frame image is specified, ImageUrl is required as the starting frame.</li><li>Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.</li><li>Vidu. q2-pro and q2-turbo support starting and ending frames.</li></ol><p>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different limits.</li><li>Supported image formats: JPEG and PNG.</li></ol>
     * @param LastImageUrl <p>The model will generate a video using the image of this parameter as the ending frame.<br>Models that support this parameter:</p><ol><li>GV. If the ending frame image is specified, ImageUrl is required as the starting frame.</li><li>Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.</li><li>Vidu. q2-pro and q2-turbo support starting and ending frames.</li></ol><p>Note:</p><ol><li>The recommended image size is no more than 10 MB. Different models have different limits.</li><li>Supported image formats: JPEG and PNG.</li></ol>
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get <p>List of up to 3 asset images, used to describe the images the model should use for video generation.</p><p>Model that supports multiple images:</p><ol><li>GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.</li><li>Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.</li></ol><p>Note:</p><ol><li>The image size cannot exceed 10 MB.</li><li>Supported image formats: JPEG and PNG.</li></ol> 
     * @return ImageInfos <p>List of up to 3 asset images, used to describe the images the model should use for video generation.</p><p>Model that supports multiple images:</p><ol><li>GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.</li><li>Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.</li></ol><p>Note:</p><ol><li>The image size cannot exceed 10 MB.</li><li>Supported image formats: JPEG and PNG.</li></ol>
     */
    public AigcVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>List of up to 3 asset images, used to describe the images the model should use for video generation.</p><p>Model that supports multiple images:</p><ol><li>GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.</li><li>Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.</li></ol><p>Note:</p><ol><li>The image size cannot exceed 10 MB.</li><li>Supported image formats: JPEG and PNG.</li></ol>
     * @param ImageInfos <p>List of up to 3 asset images, used to describe the images the model should use for video generation.</p><p>Model that supports multiple images:</p><ol><li>GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.</li><li>Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.</li></ol><p>Note:</p><ol><li>The image size cannot exceed 10 MB.</li><li>Supported image formats: JPEG and PNG.</li></ol>
     */
    public void setImageInfos(AigcVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>Only Kling O1 supports reference video information.<br>This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.</p> 
     * @return VideoInfos <p>Only Kling O1 supports reference video information.<br>This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.</p>
     */
    public AigcVideoReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>Only Kling O1 supports reference video information.<br>This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.</p>
     * @param VideoInfos <p>Only Kling O1 supports reference video information.<br>This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.</p>
     */
    public void setVideoInfos(AigcVideoReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>Duration of the generated video.<br>Note:</p><ol><li>Kling supports 5 and 10 seconds. Default value: 5 seconds.</li><li>The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.</li><li>Vidu supports 1 to 10 seconds.</li><li>GV supports 8 seconds. Default value: 8 seconds.</li><li>OS supports 4, 8, and 12 seconds. Default value: 8 seconds.</li></ol> 
     * @return Duration <p>Duration of the generated video.<br>Note:</p><ol><li>Kling supports 5 and 10 seconds. Default value: 5 seconds.</li><li>The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.</li><li>Vidu supports 1 to 10 seconds.</li><li>GV supports 8 seconds. Default value: 8 seconds.</li><li>OS supports 4, 8, and 12 seconds. Default value: 8 seconds.</li></ol>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Duration of the generated video.<br>Note:</p><ol><li>Kling supports 5 and 10 seconds. Default value: 5 seconds.</li><li>The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.</li><li>Vidu supports 1 to 10 seconds.</li><li>GV supports 8 seconds. Default value: 8 seconds.</li><li>OS supports 4, 8, and 12 seconds. Default value: 8 seconds.</li></ol>
     * @param Duration <p>Duration of the generated video.<br>Note:</p><ol><li>Kling supports 5 and 10 seconds. Default value: 5 seconds.</li><li>The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.</li><li>Vidu supports 1 to 10 seconds.</li><li>GV supports 8 seconds. Default value: 8 seconds.</li><li>OS supports 4, 8, and 12 seconds. Default value: 8 seconds.</li></ol>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Additional parameters required.</p> 
     * @return ExtraParameters <p>Additional parameters required.</p>
     */
    public AigcVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>Additional parameters required.</p>
     * @param ExtraParameters <p>Additional parameters required.</p>
     */
    public void setExtraParameters(AigcVideoExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p> 
     * @return StoreCosParam <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
     * @param StoreCosParam <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get <p>Special scenario parameters required by the model, formatted as a JSON serialized string.<br>Example:<br>{"camera_control":{"type":"simple"}}.</p> 
     * @return AdditionalParameters <p>Special scenario parameters required by the model, formatted as a JSON serialized string.<br>Example:<br>{"camera_control":{"type":"simple"}}.</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>Special scenario parameters required by the model, formatted as a JSON serialized string.<br>Example:<br>{"camera_control":{"type":"simple"}}.</p>
     * @param AdditionalParameters <p>Special scenario parameters required by the model, formatted as a JSON serialized string.<br>Example:<br>{"camera_control":{"type":"simple"}}.</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get <p>API operator name.</p> 
     * @return Operator <p>API operator name.</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>API operator name.</p>
     * @param Operator <p>API operator name.</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoTaskRequest(CreateAigcVideoTaskRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new Boolean(source.EnhancePrompt);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.LastImageUrl != null) {
            this.LastImageUrl = new String(source.LastImageUrl);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcVideoReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcVideoReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcVideoReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcVideoReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcVideoExtraParam(source.ExtraParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "LastImageUrl", this.LastImageUrl);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

