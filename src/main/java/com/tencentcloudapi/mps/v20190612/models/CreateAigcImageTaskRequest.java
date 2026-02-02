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

public class CreateAigcImageTaskRequest extends AbstractModel {

    /**
    * Model name.
Supported models:Hunyuan,
GEM,
Qwen.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Specific version number of the model. By default, the system uses the supported stable version of the model.1. GEM: [2.5 and 3.0].
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * Description of the generated image. (Note: A maximum of 1000 characters is supported.) This parameter is required when no reference image is specified.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.
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
    * Reference resource images. By default, one image can be specified.Model that supports multiple images:1. GEM supports up to 3 resource images.Note:1. The recommended image size is less than 7 MB. Different models have different limits.2. Supported image format: JPEG, PNG, and WebP.
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcImageInfo [] ImageInfos;

    /**
    * Additional parameters required for the model.
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcImageExtraParam ExtraParameters;

    /**
    * COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * API operator name.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Model name.
Supported models:Hunyuan,
GEM,
Qwen. 
     * @return ModelName Model name.
Supported models:Hunyuan,
GEM,
Qwen.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
Supported models:Hunyuan,
GEM,
Qwen.
     * @param ModelName Model name.
Supported models:Hunyuan,
GEM,
Qwen.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Specific version number of the model. By default, the system uses the supported stable version of the model.1. GEM: [2.5 and 3.0]. 
     * @return ModelVersion Specific version number of the model. By default, the system uses the supported stable version of the model.1. GEM: [2.5 and 3.0].
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Specific version number of the model. By default, the system uses the supported stable version of the model.1. GEM: [2.5 and 3.0].
     * @param ModelVersion Specific version number of the model. By default, the system uses the supported stable version of the model.1. GEM: [2.5 and 3.0].
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get Description of the generated image. (Note: A maximum of 1000 characters is supported.) This parameter is required when no reference image is specified. 
     * @return Prompt Description of the generated image. (Note: A maximum of 1000 characters is supported.) This parameter is required when no reference image is specified.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Description of the generated image. (Note: A maximum of 1000 characters is supported.) This parameter is required when no reference image is specified.
     * @param Prompt Description of the generated image. (Note: A maximum of 1000 characters is supported.) This parameter is required when no reference image is specified.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind. 
     * @return NegativePrompt Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.
     * @param NegativePrompt Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.
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
     * Get Reference resource images. By default, one image can be specified.Model that supports multiple images:1. GEM supports up to 3 resource images.Note:1. The recommended image size is less than 7 MB. Different models have different limits.2. Supported image format: JPEG, PNG, and WebP. 
     * @return ImageInfos Reference resource images. By default, one image can be specified.Model that supports multiple images:1. GEM supports up to 3 resource images.Note:1. The recommended image size is less than 7 MB. Different models have different limits.2. Supported image format: JPEG, PNG, and WebP.
     */
    public AigcImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set Reference resource images. By default, one image can be specified.Model that supports multiple images:1. GEM supports up to 3 resource images.Note:1. The recommended image size is less than 7 MB. Different models have different limits.2. Supported image format: JPEG, PNG, and WebP.
     * @param ImageInfos Reference resource images. By default, one image can be specified.Model that supports multiple images:1. GEM supports up to 3 resource images.Note:1. The recommended image size is less than 7 MB. Different models have different limits.2. Supported image format: JPEG, PNG, and WebP.
     */
    public void setImageInfos(AigcImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get Additional parameters required for the model. 
     * @return ExtraParameters Additional parameters required for the model.
     */
    public AigcImageExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set Additional parameters required for the model.
     * @param ExtraParameters Additional parameters required for the model.
     */
    public void setExtraParameters(AigcImageExtraParam ExtraParameters) {
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

    public CreateAigcImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcImageTaskRequest(CreateAigcImageTaskRequest source) {
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
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.ExtraParameters != null) {
            this.ExtraParameters = new AigcImageExtraParam(source.ExtraParameters);
        }
        if (source.StoreCosParam != null) {
            this.StoreCosParam = new AigcStoreCosParam(source.StoreCosParam);
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
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamObj(map, prefix + "ExtraParameters.", this.ExtraParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

