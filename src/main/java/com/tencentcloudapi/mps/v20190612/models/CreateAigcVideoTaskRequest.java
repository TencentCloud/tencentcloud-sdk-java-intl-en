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
    * Model name.
Supported models:Hunyuan,
Hailuo,
Kling,
Vidu,
OS,
GV.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Specific version number of the model. By default, the system uses the supported stable version of the model.1. Hailuo: [02 and 2.3].2. Kling: [2.0, 2.1, 2.5, O1, and 2.6].3. Vidu: [q2, q2-pro, and q2-turbo].4. GV: [3.1].5. OS: [2.0].
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * Scenario for the generated video.Note: Not all models support scenarios.1. Kling supports motion control (motion_control).2. Mingmou supports landscape-to-portrait conversion (land2port).3. Vidu supports special effect templates (template_effect).
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Content you want to prevent the model from generating.Note: Not all models support this.For example:Top lighting and bright color.People and animals.Multiple vehicles and wind.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * Image URL for video generation. The URL must be accessible from the public network.Note:1. The recommended image size is no more than 10 MB. Different models have different size limits.2. Supported image formats: JPEG and PNG.3. If the OS model is used, the input image dimension should be 1280x720 or 720x1280.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The model will generate a video using the image of this parameter as the ending frame.Models that support this parameter:1. GV. If the ending frame image is specified, ImageUrl is required as the starting frame.2. Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.3. Vidu. q2-pro and q2-turbo support starting and ending frames.Note:1. The recommended image size is no more than 10 MB. Different models have different limits.2. Supported image formats: JPEG and PNG.
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * List of up to 3 asset images, used to describe the images the model should use for video generation.Model that supports multiple images:1. GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.2. Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.Note:1. The image size cannot exceed 10 MB.2. Supported image formats: JPEG and PNG.
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcVideoReferenceImageInfo [] ImageInfos;

    /**
    * Duration of the generated video.Note:1. Kling supports 5 and 10 seconds. Default value: 5 seconds.2. The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.3. Vidu supports 1 to 10 seconds.4. GV supports 8 seconds. Default value: 8 seconds.5. OS supports 4, 8, and 12 seconds. Default value: 8 seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Additional parameters required.
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcVideoExtraParam ExtraParameters;

    /**
    * COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * Special scenario parameters required by the model, formatted as a JSON serialized string.Example:{\"camera_control\":{\"type\":\"simple\"}}
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * API operator name.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Model name.
Supported models:Hunyuan,
Hailuo,
Kling,
Vidu,
OS,
GV. 
     * @return ModelName Model name.
Supported models:Hunyuan,
Hailuo,
Kling,
Vidu,
OS,
GV.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
Supported models:Hunyuan,
Hailuo,
Kling,
Vidu,
OS,
GV.
     * @param ModelName Model name.
Supported models:Hunyuan,
Hailuo,
Kling,
Vidu,
OS,
GV.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Specific version number of the model. By default, the system uses the supported stable version of the model.1. Hailuo: [02 and 2.3].2. Kling: [2.0, 2.1, 2.5, O1, and 2.6].3. Vidu: [q2, q2-pro, and q2-turbo].4. GV: [3.1].5. OS: [2.0]. 
     * @return ModelVersion Specific version number of the model. By default, the system uses the supported stable version of the model.1. Hailuo: [02 and 2.3].2. Kling: [2.0, 2.1, 2.5, O1, and 2.6].3. Vidu: [q2, q2-pro, and q2-turbo].4. GV: [3.1].5. OS: [2.0].
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Specific version number of the model. By default, the system uses the supported stable version of the model.1. Hailuo: [02 and 2.3].2. Kling: [2.0, 2.1, 2.5, O1, and 2.6].3. Vidu: [q2, q2-pro, and q2-turbo].4. GV: [3.1].5. OS: [2.0].
     * @param ModelVersion Specific version number of the model. By default, the system uses the supported stable version of the model.1. Hailuo: [02 and 2.3].2. Kling: [2.0, 2.1, 2.5, O1, and 2.6].3. Vidu: [q2, q2-pro, and q2-turbo].4. GV: [3.1].5. OS: [2.0].
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get Scenario for the generated video.Note: Not all models support scenarios.1. Kling supports motion control (motion_control).2. Mingmou supports landscape-to-portrait conversion (land2port).3. Vidu supports special effect templates (template_effect). 
     * @return SceneType Scenario for the generated video.Note: Not all models support scenarios.1. Kling supports motion control (motion_control).2. Mingmou supports landscape-to-portrait conversion (land2port).3. Vidu supports special effect templates (template_effect).
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set Scenario for the generated video.Note: Not all models support scenarios.1. Kling supports motion control (motion_control).2. Mingmou supports landscape-to-portrait conversion (land2port).3. Vidu supports special effect templates (template_effect).
     * @param SceneType Scenario for the generated video.Note: Not all models support scenarios.1. Kling supports motion control (motion_control).2. Mingmou supports landscape-to-portrait conversion (land2port).3. Vidu supports special effect templates (template_effect).
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified. 
     * @return Prompt Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.
     * @param Prompt Description of the generated video. (Note: A maximum of 2000 characters is supported.) This parameter is required when no reference image is specified.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Content you want to prevent the model from generating.Note: Not all models support this.For example:Top lighting and bright color.People and animals.Multiple vehicles and wind. 
     * @return NegativePrompt Content you want to prevent the model from generating.Note: Not all models support this.For example:Top lighting and bright color.People and animals.Multiple vehicles and wind.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Content you want to prevent the model from generating.Note: Not all models support this.For example:Top lighting and bright color.People and animals.Multiple vehicles and wind.
     * @param NegativePrompt Content you want to prevent the model from generating.Note: Not all models support this.For example:Top lighting and bright color.People and animals.Multiple vehicles and wind.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality. 
     * @return EnhancePrompt The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.
     * @param EnhancePrompt The default value is False, meaning the model follows instructions strictly. For better results with more nuanced prompts, set this parameter to True to automatically optimize the input prompt and improve generation quality.
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get Image URL for video generation. The URL must be accessible from the public network.Note:1. The recommended image size is no more than 10 MB. Different models have different size limits.2. Supported image formats: JPEG and PNG.3. If the OS model is used, the input image dimension should be 1280x720 or 720x1280. 
     * @return ImageUrl Image URL for video generation. The URL must be accessible from the public network.Note:1. The recommended image size is no more than 10 MB. Different models have different size limits.2. Supported image formats: JPEG and PNG.3. If the OS model is used, the input image dimension should be 1280x720 or 720x1280.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Image URL for video generation. The URL must be accessible from the public network.Note:1. The recommended image size is no more than 10 MB. Different models have different size limits.2. Supported image formats: JPEG and PNG.3. If the OS model is used, the input image dimension should be 1280x720 or 720x1280.
     * @param ImageUrl Image URL for video generation. The URL must be accessible from the public network.Note:1. The recommended image size is no more than 10 MB. Different models have different size limits.2. Supported image formats: JPEG and PNG.3. If the OS model is used, the input image dimension should be 1280x720 or 720x1280.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The model will generate a video using the image of this parameter as the ending frame.Models that support this parameter:1. GV. If the ending frame image is specified, ImageUrl is required as the starting frame.2. Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.3. Vidu. q2-pro and q2-turbo support starting and ending frames.Note:1. The recommended image size is no more than 10 MB. Different models have different limits.2. Supported image formats: JPEG and PNG. 
     * @return LastImageUrl The model will generate a video using the image of this parameter as the ending frame.Models that support this parameter:1. GV. If the ending frame image is specified, ImageUrl is required as the starting frame.2. Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.3. Vidu. q2-pro and q2-turbo support starting and ending frames.Note:1. The recommended image size is no more than 10 MB. Different models have different limits.2. Supported image formats: JPEG and PNG.
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set The model will generate a video using the image of this parameter as the ending frame.Models that support this parameter:1. GV. If the ending frame image is specified, ImageUrl is required as the starting frame.2. Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.3. Vidu. q2-pro and q2-turbo support starting and ending frames.Note:1. The recommended image size is no more than 10 MB. Different models have different limits.2. Supported image formats: JPEG and PNG.
     * @param LastImageUrl The model will generate a video using the image of this parameter as the ending frame.Models that support this parameter:1. GV. If the ending frame image is specified, ImageUrl is required as the starting frame.2. Kling. Version 2.1 supports starting and ending frames with a resolution of 1080P.3. Vidu. q2-pro and q2-turbo support starting and ending frames.Note:1. The recommended image size is no more than 10 MB. Different models have different limits.2. Supported image formats: JPEG and PNG.
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get List of up to 3 asset images, used to describe the images the model should use for video generation.Model that supports multiple images:1. GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.2. Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.Note:1. The image size cannot exceed 10 MB.2. Supported image formats: JPEG and PNG. 
     * @return ImageInfos List of up to 3 asset images, used to describe the images the model should use for video generation.Model that supports multiple images:1. GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.2. Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.Note:1. The image size cannot exceed 10 MB.2. Supported image formats: JPEG and PNG.
     */
    public AigcVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set List of up to 3 asset images, used to describe the images the model should use for video generation.Model that supports multiple images:1. GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.2. Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.Note:1. The image size cannot exceed 10 MB.2. Supported image formats: JPEG and PNG.
     * @param ImageInfos List of up to 3 asset images, used to describe the images the model should use for video generation.Model that supports multiple images:1. GV. If multiple images are specified, ImageUrl and LastImageUrl are unavailable.2. Vidu supports video generation with multiple reference images. The q2 model accepts 1 to 7 images. The ReferenceType in ImageInfos can be used to specify the subject ID for the input.Note:1. The image size cannot exceed 10 MB.2. Supported image formats: JPEG and PNG.
     */
    public void setImageInfos(AigcVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get Duration of the generated video.Note:1. Kling supports 5 and 10 seconds. Default value: 5 seconds.2. The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.3. Vidu supports 1 to 10 seconds.4. GV supports 8 seconds. Default value: 8 seconds.5. OS supports 4, 8, and 12 seconds. Default value: 8 seconds. 
     * @return Duration Duration of the generated video.Note:1. Kling supports 5 and 10 seconds. Default value: 5 seconds.2. The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.3. Vidu supports 1 to 10 seconds.4. GV supports 8 seconds. Default value: 8 seconds.5. OS supports 4, 8, and 12 seconds. Default value: 8 seconds.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of the generated video.Note:1. Kling supports 5 and 10 seconds. Default value: 5 seconds.2. The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.3. Vidu supports 1 to 10 seconds.4. GV supports 8 seconds. Default value: 8 seconds.5. OS supports 4, 8, and 12 seconds. Default value: 8 seconds.
     * @param Duration Duration of the generated video.Note:1. Kling supports 5 and 10 seconds. Default value: 5 seconds.2. The std mode of Hailuo supports 6 and 10 seconds, and other modes support 6 seconds. Default value: 6 seconds.3. Vidu supports 1 to 10 seconds.4. GV supports 8 seconds. Default value: 8 seconds.5. OS supports 4, 8, and 12 seconds. Default value: 8 seconds.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Additional parameters required. 
     * @return ExtraParameters Additional parameters required.
     */
    public AigcVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set Additional parameters required.
     * @param ExtraParameters Additional parameters required.
     */
    public void setExtraParameters(AigcVideoExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized. 
     * @return StoreCosParam COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
     * @param StoreCosParam COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get Special scenario parameters required by the model, formatted as a JSON serialized string.Example:{\"camera_control\":{\"type\":\"simple\"}} 
     * @return AdditionalParameters Special scenario parameters required by the model, formatted as a JSON serialized string.Example:{\"camera_control\":{\"type\":\"simple\"}}
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set Special scenario parameters required by the model, formatted as a JSON serialized string.Example:{\"camera_control\":{\"type\":\"simple\"}}
     * @param AdditionalParameters Special scenario parameters required by the model, formatted as a JSON serialized string.Example:{\"camera_control\":{\"type\":\"simple\"}}
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get API operator name. 
     * @return Operator API operator name.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set API operator name.
     * @param Operator API operator name.
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
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

