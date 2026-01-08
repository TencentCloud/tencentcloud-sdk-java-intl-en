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
    * Model Name. Currently supported models include: Hunyuan,GEM,Qwen.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Specify the version number of a particular model. By default, the system utilizes the currently supported stable version of the model.  
1. GEM, available options [2.5, 3.0].

    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 
Generate a description of the image. (Note: The maximum supported length is 1000 characters.) This parameter is mandatory when no reference image is provided.

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
    * 
Supports single image input by default. Models supporting multi-image input include GEM (up to 3 images).  
Recommended image size should be under 7MB, with support for JPEG, PNG, and WebP formats.

    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcImageInfo [] ImageInfos;

    /**
    * Used to pass additional parameters.
    */
    @SerializedName("ExtraParameters")
    @Expose
    private AigcImageExtraParam ExtraParameters;

    /**
    * The output files will be stored in the specified COS bucket. Note: COS service must be activated, and the MPS_QcsRole needs to be created and properly authorized.
    */
    @SerializedName("StoreCosParam")
    @Expose
    private AigcStoreCosParam StoreCosParam;

    /**
    * Interface operator name.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Model Name. Currently supported models include: Hunyuan,GEM,Qwen. 
     * @return ModelName Model Name. Currently supported models include: Hunyuan,GEM,Qwen.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model Name. Currently supported models include: Hunyuan,GEM,Qwen.
     * @param ModelName Model Name. Currently supported models include: Hunyuan,GEM,Qwen.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Specify the version number of a particular model. By default, the system utilizes the currently supported stable version of the model.  
1. GEM, available options [2.5, 3.0].
 
     * @return ModelVersion Specify the version number of a particular model. By default, the system utilizes the currently supported stable version of the model.  
1. GEM, available options [2.5, 3.0].

     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Specify the version number of a particular model. By default, the system utilizes the currently supported stable version of the model.  
1. GEM, available options [2.5, 3.0].

     * @param ModelVersion Specify the version number of a particular model. By default, the system utilizes the currently supported stable version of the model.  
1. GEM, available options [2.5, 3.0].

     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 
Generate a description of the image. (Note: The maximum supported length is 1000 characters.) This parameter is mandatory when no reference image is provided.
 
     * @return Prompt 
Generate a description of the image. (Note: The maximum supported length is 1000 characters.) This parameter is mandatory when no reference image is provided.

     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 
Generate a description of the image. (Note: The maximum supported length is 1000 characters.) This parameter is mandatory when no reference image is provided.

     * @param Prompt 
Generate a description of the image. (Note: The maximum supported length is 1000 characters.) This parameter is mandatory when no reference image is provided.

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
     * Get 
Supports single image input by default. Models supporting multi-image input include GEM (up to 3 images).  
Recommended image size should be under 7MB, with support for JPEG, PNG, and WebP formats.
 
     * @return ImageInfos 
Supports single image input by default. Models supporting multi-image input include GEM (up to 3 images).  
Recommended image size should be under 7MB, with support for JPEG, PNG, and WebP formats.

     */
    public AigcImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set 
Supports single image input by default. Models supporting multi-image input include GEM (up to 3 images).  
Recommended image size should be under 7MB, with support for JPEG, PNG, and WebP formats.

     * @param ImageInfos 
Supports single image input by default. Models supporting multi-image input include GEM (up to 3 images).  
Recommended image size should be under 7MB, with support for JPEG, PNG, and WebP formats.

     */
    public void setImageInfos(AigcImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get Used to pass additional parameters. 
     * @return ExtraParameters Used to pass additional parameters.
     */
    public AigcImageExtraParam getExtraParameters() {
        return this.ExtraParameters;
    }

    /**
     * Set Used to pass additional parameters.
     * @param ExtraParameters Used to pass additional parameters.
     */
    public void setExtraParameters(AigcImageExtraParam ExtraParameters) {
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

