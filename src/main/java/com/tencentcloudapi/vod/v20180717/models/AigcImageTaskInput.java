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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcImageTaskInput extends AbstractModel {

    /**
    * Model name.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Model version.
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * Input file of the AIGC image generation task.
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

    /**
    * Prompt for image generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * To prevent the model from generating image prompts. Supports a maximum of 1000 characters.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * Whether to optimize prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li>
    */
    @SerializedName("GenerationMode")
    @Expose
    private String GenerationMode;

    /**
    * Output the result file of the AIGC image generation.
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcImageOutputConfig OutputConfig;

    /**
     * Get Model name. 
     * @return ModelName Model name.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
     * @param ModelName Model name.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Model version. 
     * @return ModelVersion Model version.
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Model version.
     * @param ModelVersion Model version.
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get Input file of the AIGC image generation task. 
     * @return FileInfos Input file of the AIGC image generation task.
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input file of the AIGC image generation task.
     * @param FileInfos Input file of the AIGC image generation task.
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Prompt for image generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty. 
     * @return Prompt Prompt for image generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Prompt for image generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.
     * @param Prompt Prompt for image generation. Supports a maximum of 1000 characters. This parameter is required when FileInfos is empty.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get To prevent the model from generating image prompts. Supports a maximum of 1000 characters. 
     * @return NegativePrompt To prevent the model from generating image prompts. Supports a maximum of 1000 characters.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set To prevent the model from generating image prompts. Supports a maximum of 1000 characters.
     * @param NegativePrompt To prevent the model from generating image prompts. Supports a maximum of 1000 characters.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get Whether to optimize prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li> 
     * @return EnhancePrompt Whether to optimize prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set Whether to optimize prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li>
     * @param EnhancePrompt Whether to optimize prompt content automatically. When enabled, the passed in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: Enable;</li> <li>Disabled: Disable;</li>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li> 
     * @return GenerationMode Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li>
     */
    public String getGenerationMode() {
        return this.GenerationMode;
    }

    /**
     * Set Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li>
     * @param GenerationMode Generation mode. Valid values: <li>Standard: standard mode;</li> <li>Professional: high-quality mode;</li>
     */
    public void setGenerationMode(String GenerationMode) {
        this.GenerationMode = GenerationMode;
    }

    /**
     * Get Output the result file of the AIGC image generation. 
     * @return OutputConfig Output the result file of the AIGC image generation.
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Output the result file of the AIGC image generation.
     * @param OutputConfig Output the result file of the AIGC image generation.
     */
    public void setOutputConfig(AigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public AigcImageTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageTaskInput(AigcImageTaskInput source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new String(source.EnhancePrompt);
        }
        if (source.GenerationMode != null) {
            this.GenerationMode = new String(source.GenerationMode);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcImageOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "GenerationMode", this.GenerationMode);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

