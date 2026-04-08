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
    * <p>Model name.<br>Supported models:<br>Hunyuan.<br>GEM.<br>Qwen.</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Specify the model version number. By default, the system uses the supported stable version of the model.</p><ol><li>GEM: [2.5 and 3.0].</li></ol>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Description of the generated image. (Note: Supports up to 1000 characters.) This parameter is required when no reference image is passed in.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.</p>
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
    * <p>Used for inputting image information as a resource for reference. Default support for inputting an image.</p><p>Models supporting multi-image input:</p><ol><li>GEM, supporting up to 3 images as resource input.</li></ol><p>Note:</p><ol><li>Recommended image less than 7M. Limits vary by model.</li><li>Format support: jpeg, png, webp.</li></ol>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcImageInfo [] ImageInfos;

    /**
    * <p>Additional parameters required for the model.</p>
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcImageExtraParam ExtraParameters;

    /**
    * <p>Used to input some special scene parameters required by the model, serialized into a string in Json format. Example: {"size":"2048x2048"}</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
    * <p>COS bucket information for the file result. Note: COS is required and the MPS_QcsRole role needs to be created and authorized.</p>
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * <p>API operator name.</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>Model name.<br>Supported models:<br>Hunyuan.<br>GEM.<br>Qwen.</p> 
     * @return ModelName <p>Model name.<br>Supported models:<br>Hunyuan.<br>GEM.<br>Qwen.</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name.<br>Supported models:<br>Hunyuan.<br>GEM.<br>Qwen.</p>
     * @param ModelName <p>Model name.<br>Supported models:<br>Hunyuan.<br>GEM.<br>Qwen.</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Specify the model version number. By default, the system uses the supported stable version of the model.</p><ol><li>GEM: [2.5 and 3.0].</li></ol> 
     * @return ModelVersion <p>Specify the model version number. By default, the system uses the supported stable version of the model.</p><ol><li>GEM: [2.5 and 3.0].</li></ol>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Specify the model version number. By default, the system uses the supported stable version of the model.</p><ol><li>GEM: [2.5 and 3.0].</li></ol>
     * @param ModelVersion <p>Specify the model version number. By default, the system uses the supported stable version of the model.</p><ol><li>GEM: [2.5 and 3.0].</li></ol>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Description of the generated image. (Note: Supports up to 1000 characters.) This parameter is required when no reference image is passed in.</p> 
     * @return Prompt <p>Description of the generated image. (Note: Supports up to 1000 characters.) This parameter is required when no reference image is passed in.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Description of the generated image. (Note: Supports up to 1000 characters.) This parameter is required when no reference image is passed in.</p>
     * @param Prompt <p>Description of the generated image. (Note: Supports up to 1000 characters.) This parameter is required when no reference image is passed in.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.</p> 
     * @return NegativePrompt <p>Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.</p>
     * @param NegativePrompt <p>Specifies the content you want to prevent the model from generating. Note: Not all models support this. For example: top lighting, bright colors, people, animals, multiple vehicles, and wind.</p>
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
     * Get <p>Used for inputting image information as a resource for reference. Default support for inputting an image.</p><p>Models supporting multi-image input:</p><ol><li>GEM, supporting up to 3 images as resource input.</li></ol><p>Note:</p><ol><li>Recommended image less than 7M. Limits vary by model.</li><li>Format support: jpeg, png, webp.</li></ol> 
     * @return ImageInfos <p>Used for inputting image information as a resource for reference. Default support for inputting an image.</p><p>Models supporting multi-image input:</p><ol><li>GEM, supporting up to 3 images as resource input.</li></ol><p>Note:</p><ol><li>Recommended image less than 7M. Limits vary by model.</li><li>Format support: jpeg, png, webp.</li></ol>
     */
    public AigcImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>Used for inputting image information as a resource for reference. Default support for inputting an image.</p><p>Models supporting multi-image input:</p><ol><li>GEM, supporting up to 3 images as resource input.</li></ol><p>Note:</p><ol><li>Recommended image less than 7M. Limits vary by model.</li><li>Format support: jpeg, png, webp.</li></ol>
     * @param ImageInfos <p>Used for inputting image information as a resource for reference. Default support for inputting an image.</p><p>Models supporting multi-image input:</p><ol><li>GEM, supporting up to 3 images as resource input.</li></ol><p>Note:</p><ol><li>Recommended image less than 7M. Limits vary by model.</li><li>Format support: jpeg, png, webp.</li></ol>
     */
    public void setImageInfos(AigcImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>Additional parameters required for the model.</p> 
     * @return ExtraParameters <p>Additional parameters required for the model.</p>
     */
    public AigcImageExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set <p>Additional parameters required for the model.</p>
     * @param ExtraParameters <p>Additional parameters required for the model.</p>
     */
    public void setExtraParameters(AigcImageExtraParam ExtraParameters) {
        this.ExtraParameters = ExtraParameters;
    }

    /**
     * Get <p>Used to input some special scene parameters required by the model, serialized into a string in Json format. Example: {"size":"2048x2048"}</p> 
     * @return AdditionalParameters <p>Used to input some special scene parameters required by the model, serialized into a string in Json format. Example: {"size":"2048x2048"}</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>Used to input some special scene parameters required by the model, serialized into a string in Json format. Example: {"size":"2048x2048"}</p>
     * @param AdditionalParameters <p>Used to input some special scene parameters required by the model, serialized into a string in Json format. Example: {"size":"2048x2048"}</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
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
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
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
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);
        this.setParamObj(map, prefix + "StoreCosParam.", this.StoreCosParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

