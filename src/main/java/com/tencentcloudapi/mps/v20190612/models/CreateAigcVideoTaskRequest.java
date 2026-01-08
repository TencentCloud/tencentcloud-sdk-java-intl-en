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
    * Model Name. Currently supported models include: Hunyuan, Hailuo, Kling, Vidu, OS, GV
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Specify the version number of a particular model. By default, the system uses the currently supported stable version of the model.  
1. Hailuo: Available options [02, 2.3].  
2. Kling: Available options [2.0, 2.1, 2.5, O1, 2.6].  
3. Vidu: Available options [q2, q2-pro, q2-turbo].  
4. GV: Available option [3.1].  
5. OS: Available option [2.0].
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * Generate video description. (Note: Maximum 2000 characters supported). This parameter is mandatory when no images are provided.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Used to specify the content you wish to prevent the model from generating.Note: Supported by select models.Examples:  
Overhead lighting, vibrant colors  
Human figures, animals  
Multiple vehicles, wind
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * The default value is False, where the model strictly adheres to instructions. For optimal results with more refined prompts, setting this parameter to True will automatically optimize the input prompt to enhance generation quality.
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * The URL of the image used to guide video generation, which must be publicly accessible via the internet.  
Notes:  
1. The recommended image size should not exceed 10MB, though size limitations may vary across different models.  
2. Supported image formats: JPEG, PNG.  
3. When using the OS model, the input image dimensions must be either 1280x720 or 720x1280.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The model will utilize the image provided via this parameter as the ending frame for video generation.  
Supported models for this parameter:  
1. GV: When an ending frame image is provided, the ImageUrl parameter must also be specified as the starting frame.  
2. Kling: Under Resolution: 1080P, version 2.1 supports both start&end frames.  
3. Vidu, q2-pro, q2-turbo: Support start&end frames. 
Notes:  
1. It is recommended that the image size does not exceed 10MB, though specific model limitations may vary.  
2. Supported image formats: JPEG, PNG.
    */
    @SerializedName("LastImageUrl")
    @Expose
    private String LastImageUrl;

    /**
    * A list comprising up to three material resource images, utilized to depict the reference images the model will employ for video generation.  
Models supporting multi-image input:  
1. GV: When utilizing multi-image input, neither ImageUrl nor LastImageUrl should be used.  
2. Vidu: Supports video generation with multiple reference images. For model q2, 1-7 images can be provided, with the subject ID specified via ReferenceType within ImageInfos.
Notes:  
1. Each image must not exceed 10MB in size.  
2. Supported image formats: JPEG, PNG.
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcVideoReferenceImageInfo [] ImageInfos;

    /**
    * Duration of generated videos.  
Notes:  
1. Kling supports 5 and 10 seconds. Default: 5 seconds.  
2. Hailuo's standard mode supports 6 and 10 seconds, while other modes only support 6 seconds. Default: 6 seconds.  
3. Vidu supports 1 to 10 seconds.  
4. GV supports 8 seconds. Default: 8 seconds.  
5. OS supports 4, 8, and 12 seconds. Default: 8 seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Used to pass additional parameters.
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcVideoExtraParam ExtraParameters;

    /**
    * The output files will be stored in the specified COS bucket. Note: COS service must be activated, and the MPS_QcsRole needs to be created and properly authorized.
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * 
Used to pass specific scenario parameters required by the model, serialized into a JSON format string. Example: {"camera_control":{"type":"simple"}}
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * Interface operator name.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Model Name. Currently supported models include: Hunyuan, Hailuo, Kling, Vidu, OS, GV 
     * @return ModelName Model Name. Currently supported models include: Hunyuan, Hailuo, Kling, Vidu, OS, GV
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model Name. Currently supported models include: Hunyuan, Hailuo, Kling, Vidu, OS, GV
     * @param ModelName Model Name. Currently supported models include: Hunyuan, Hailuo, Kling, Vidu, OS, GV
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Specify the version number of a particular model. By default, the system uses the currently supported stable version of the model.  
1. Hailuo: Available options [02, 2.3].  
2. Kling: Available options [2.0, 2.1, 2.5, O1, 2.6].  
3. Vidu: Available options [q2, q2-pro, q2-turbo].  
4. GV: Available option [3.1].  
5. OS: Available option [2.0]. 
     * @return ModelVersion Specify the version number of a particular model. By default, the system uses the currently supported stable version of the model.  
1. Hailuo: Available options [02, 2.3].  
2. Kling: Available options [2.0, 2.1, 2.5, O1, 2.6].  
3. Vidu: Available options [q2, q2-pro, q2-turbo].  
4. GV: Available option [3.1].  
5. OS: Available option [2.0].
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Specify the version number of a particular model. By default, the system uses the currently supported stable version of the model.  
1. Hailuo: Available options [02, 2.3].  
2. Kling: Available options [2.0, 2.1, 2.5, O1, 2.6].  
3. Vidu: Available options [q2, q2-pro, q2-turbo].  
4. GV: Available option [3.1].  
5. OS: Available option [2.0].
     * @param ModelVersion Specify the version number of a particular model. By default, the system uses the currently supported stable version of the model.  
1. Hailuo: Available options [02, 2.3].  
2. Kling: Available options [2.0, 2.1, 2.5, O1, 2.6].  
3. Vidu: Available options [q2, q2-pro, q2-turbo].  
4. GV: Available option [3.1].  
5. OS: Available option [2.0].
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get Generate video description. (Note: Maximum 2000 characters supported). This parameter is mandatory when no images are provided. 
     * @return Prompt Generate video description. (Note: Maximum 2000 characters supported). This parameter is mandatory when no images are provided.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Generate video description. (Note: Maximum 2000 characters supported). This parameter is mandatory when no images are provided.
     * @param Prompt Generate video description. (Note: Maximum 2000 characters supported). This parameter is mandatory when no images are provided.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Used to specify the content you wish to prevent the model from generating.Note: Supported by select models.Examples:  
Overhead lighting, vibrant colors  
Human figures, animals  
Multiple vehicles, wind 
     * @return NegativePrompt Used to specify the content you wish to prevent the model from generating.Note: Supported by select models.Examples:  
Overhead lighting, vibrant colors  
Human figures, animals  
Multiple vehicles, wind
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Used to specify the content you wish to prevent the model from generating.Note: Supported by select models.Examples:  
Overhead lighting, vibrant colors  
Human figures, animals  
Multiple vehicles, wind
     * @param NegativePrompt Used to specify the content you wish to prevent the model from generating.Note: Supported by select models.Examples:  
Overhead lighting, vibrant colors  
Human figures, animals  
Multiple vehicles, wind
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get The default value is False, where the model strictly adheres to instructions. For optimal results with more refined prompts, setting this parameter to True will automatically optimize the input prompt to enhance generation quality. 
     * @return EnhancePrompt The default value is False, where the model strictly adheres to instructions. For optimal results with more refined prompts, setting this parameter to True will automatically optimize the input prompt to enhance generation quality.
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set The default value is False, where the model strictly adheres to instructions. For optimal results with more refined prompts, setting this parameter to True will automatically optimize the input prompt to enhance generation quality.
     * @param EnhancePrompt The default value is False, where the model strictly adheres to instructions. For optimal results with more refined prompts, setting this parameter to True will automatically optimize the input prompt to enhance generation quality.
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get The URL of the image used to guide video generation, which must be publicly accessible via the internet.  
Notes:  
1. The recommended image size should not exceed 10MB, though size limitations may vary across different models.  
2. Supported image formats: JPEG, PNG.  
3. When using the OS model, the input image dimensions must be either 1280x720 or 720x1280. 
     * @return ImageUrl The URL of the image used to guide video generation, which must be publicly accessible via the internet.  
Notes:  
1. The recommended image size should not exceed 10MB, though size limitations may vary across different models.  
2. Supported image formats: JPEG, PNG.  
3. When using the OS model, the input image dimensions must be either 1280x720 or 720x1280.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the image used to guide video generation, which must be publicly accessible via the internet.  
Notes:  
1. The recommended image size should not exceed 10MB, though size limitations may vary across different models.  
2. Supported image formats: JPEG, PNG.  
3. When using the OS model, the input image dimensions must be either 1280x720 or 720x1280.
     * @param ImageUrl The URL of the image used to guide video generation, which must be publicly accessible via the internet.  
Notes:  
1. The recommended image size should not exceed 10MB, though size limitations may vary across different models.  
2. Supported image formats: JPEG, PNG.  
3. When using the OS model, the input image dimensions must be either 1280x720 or 720x1280.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The model will utilize the image provided via this parameter as the ending frame for video generation.  
Supported models for this parameter:  
1. GV: When an ending frame image is provided, the ImageUrl parameter must also be specified as the starting frame.  
2. Kling: Under Resolution: 1080P, version 2.1 supports both start&end frames.  
3. Vidu, q2-pro, q2-turbo: Support start&end frames. 
Notes:  
1. It is recommended that the image size does not exceed 10MB, though specific model limitations may vary.  
2. Supported image formats: JPEG, PNG. 
     * @return LastImageUrl The model will utilize the image provided via this parameter as the ending frame for video generation.  
Supported models for this parameter:  
1. GV: When an ending frame image is provided, the ImageUrl parameter must also be specified as the starting frame.  
2. Kling: Under Resolution: 1080P, version 2.1 supports both start&end frames.  
3. Vidu, q2-pro, q2-turbo: Support start&end frames. 
Notes:  
1. It is recommended that the image size does not exceed 10MB, though specific model limitations may vary.  
2. Supported image formats: JPEG, PNG.
     */
    public String getLastImageUrl() {
        return this.LastImageUrl;
    }

    /**
     * Set The model will utilize the image provided via this parameter as the ending frame for video generation.  
Supported models for this parameter:  
1. GV: When an ending frame image is provided, the ImageUrl parameter must also be specified as the starting frame.  
2. Kling: Under Resolution: 1080P, version 2.1 supports both start&end frames.  
3. Vidu, q2-pro, q2-turbo: Support start&end frames. 
Notes:  
1. It is recommended that the image size does not exceed 10MB, though specific model limitations may vary.  
2. Supported image formats: JPEG, PNG.
     * @param LastImageUrl The model will utilize the image provided via this parameter as the ending frame for video generation.  
Supported models for this parameter:  
1. GV: When an ending frame image is provided, the ImageUrl parameter must also be specified as the starting frame.  
2. Kling: Under Resolution: 1080P, version 2.1 supports both start&end frames.  
3. Vidu, q2-pro, q2-turbo: Support start&end frames. 
Notes:  
1. It is recommended that the image size does not exceed 10MB, though specific model limitations may vary.  
2. Supported image formats: JPEG, PNG.
     */
    public void setLastImageUrl(String LastImageUrl) {
        this.LastImageUrl = LastImageUrl;
    }

    /**
     * Get A list comprising up to three material resource images, utilized to depict the reference images the model will employ for video generation.  
Models supporting multi-image input:  
1. GV: When utilizing multi-image input, neither ImageUrl nor LastImageUrl should be used.  
2. Vidu: Supports video generation with multiple reference images. For model q2, 1-7 images can be provided, with the subject ID specified via ReferenceType within ImageInfos.
Notes:  
1. Each image must not exceed 10MB in size.  
2. Supported image formats: JPEG, PNG. 
     * @return ImageInfos A list comprising up to three material resource images, utilized to depict the reference images the model will employ for video generation.  
Models supporting multi-image input:  
1. GV: When utilizing multi-image input, neither ImageUrl nor LastImageUrl should be used.  
2. Vidu: Supports video generation with multiple reference images. For model q2, 1-7 images can be provided, with the subject ID specified via ReferenceType within ImageInfos.
Notes:  
1. Each image must not exceed 10MB in size.  
2. Supported image formats: JPEG, PNG.
     */
    public AigcVideoReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set A list comprising up to three material resource images, utilized to depict the reference images the model will employ for video generation.  
Models supporting multi-image input:  
1. GV: When utilizing multi-image input, neither ImageUrl nor LastImageUrl should be used.  
2. Vidu: Supports video generation with multiple reference images. For model q2, 1-7 images can be provided, with the subject ID specified via ReferenceType within ImageInfos.
Notes:  
1. Each image must not exceed 10MB in size.  
2. Supported image formats: JPEG, PNG.
     * @param ImageInfos A list comprising up to three material resource images, utilized to depict the reference images the model will employ for video generation.  
Models supporting multi-image input:  
1. GV: When utilizing multi-image input, neither ImageUrl nor LastImageUrl should be used.  
2. Vidu: Supports video generation with multiple reference images. For model q2, 1-7 images can be provided, with the subject ID specified via ReferenceType within ImageInfos.
Notes:  
1. Each image must not exceed 10MB in size.  
2. Supported image formats: JPEG, PNG.
     */
    public void setImageInfos(AigcVideoReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get Duration of generated videos.  
Notes:  
1. Kling supports 5 and 10 seconds. Default: 5 seconds.  
2. Hailuo's standard mode supports 6 and 10 seconds, while other modes only support 6 seconds. Default: 6 seconds.  
3. Vidu supports 1 to 10 seconds.  
4. GV supports 8 seconds. Default: 8 seconds.  
5. OS supports 4, 8, and 12 seconds. Default: 8 seconds. 
     * @return Duration Duration of generated videos.  
Notes:  
1. Kling supports 5 and 10 seconds. Default: 5 seconds.  
2. Hailuo's standard mode supports 6 and 10 seconds, while other modes only support 6 seconds. Default: 6 seconds.  
3. Vidu supports 1 to 10 seconds.  
4. GV supports 8 seconds. Default: 8 seconds.  
5. OS supports 4, 8, and 12 seconds. Default: 8 seconds.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of generated videos.  
Notes:  
1. Kling supports 5 and 10 seconds. Default: 5 seconds.  
2. Hailuo's standard mode supports 6 and 10 seconds, while other modes only support 6 seconds. Default: 6 seconds.  
3. Vidu supports 1 to 10 seconds.  
4. GV supports 8 seconds. Default: 8 seconds.  
5. OS supports 4, 8, and 12 seconds. Default: 8 seconds.
     * @param Duration Duration of generated videos.  
Notes:  
1. Kling supports 5 and 10 seconds. Default: 5 seconds.  
2. Hailuo's standard mode supports 6 and 10 seconds, while other modes only support 6 seconds. Default: 6 seconds.  
3. Vidu supports 1 to 10 seconds.  
4. GV supports 8 seconds. Default: 8 seconds.  
5. OS supports 4, 8, and 12 seconds. Default: 8 seconds.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Used to pass additional parameters. 
     * @return ExtraParameters Used to pass additional parameters.
     */
    public AigcVideoExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set Used to pass additional parameters.
     * @param ExtraParameters Used to pass additional parameters.
     */
    public void setExtraParameters(AigcVideoExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get The output files will be stored in the specified COS bucket. Note: COS service must be activated, and the MPS_QcsRole needs to be created and properly authorized. 
     * @return StoreCosParam The output files will be stored in the specified COS bucket. Note: COS service must be activated, and the MPS_QcsRole needs to be created and properly authorized.
     */
    public AigcStoreCosParam getStoreCosParam() {
        return this.StoreCosParam;
    }

    /**
     * Set The output files will be stored in the specified COS bucket. Note: COS service must be activated, and the MPS_QcsRole needs to be created and properly authorized.
     * @param StoreCosParam The output files will be stored in the specified COS bucket. Note: COS service must be activated, and the MPS_QcsRole needs to be created and properly authorized.
     */
    public void setStoreCosParam(AigcStoreCosParam StoreCosParam) {
        this.StoreCosParam = StoreCosParam;
    }

    /**
     * Get 
Used to pass specific scenario parameters required by the model, serialized into a JSON format string. Example: {"camera_control":{"type":"simple"}} 
     * @return AdditionalParameters 
Used to pass specific scenario parameters required by the model, serialized into a JSON format string. Example: {"camera_control":{"type":"simple"}}
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set 
Used to pass specific scenario parameters required by the model, serialized into a JSON format string. Example: {"camera_control":{"type":"simple"}}
     * @param AdditionalParameters 
Used to pass specific scenario parameters required by the model, serialized into a JSON format string. Example: {"camera_control":{"type":"simple"}}
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    /**
     * Get Interface operator name. 
     * @return Operator Interface operator name.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Interface operator name.
     * @param Operator Interface operator name.
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

