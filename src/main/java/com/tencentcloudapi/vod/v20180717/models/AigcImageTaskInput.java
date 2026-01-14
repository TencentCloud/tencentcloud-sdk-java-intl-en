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
    * File information of the input image for the AIGC image generation task.
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

    /**
    * The prompt content for image generation.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Prevent the model from generating image generation prompts.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * 
    */
    @SerializedName("GenerationMode")
    @Expose
    private String GenerationMode;

    /**
    * Output media file configuration for the task.
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
     * Get File information of the input image for the AIGC image generation task. 
     * @return FileInfos File information of the input image for the AIGC image generation task.
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set File information of the input image for the AIGC image generation task.
     * @param FileInfos File information of the input image for the AIGC image generation task.
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get The prompt content for image generation. 
     * @return Prompt The prompt content for image generation.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set The prompt content for image generation.
     * @param Prompt The prompt content for image generation.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Prevent the model from generating image generation prompts. 
     * @return NegativePrompt Prevent the model from generating image generation prompts.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Prevent the model from generating image generation prompts.
     * @param NegativePrompt Prevent the model from generating image generation prompts.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li> 
     * @return EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
     * @param EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, it will optimize the passed in Prompt automatically to enhance generation quality. valid values: <li>Enabled: turn on;</li> <li>Disabled: turn off;</li>
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get  
     * @return GenerationMode 
     */
    public String getGenerationMode() {
        return this.GenerationMode;
    }

    /**
     * Set 
     * @param GenerationMode 
     */
    public void setGenerationMode(String GenerationMode) {
        this.GenerationMode = GenerationMode;
    }

    /**
     * Get Output media file configuration for the task. 
     * @return OutputConfig Output media file configuration for the task.
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Output media file configuration for the task.
     * @param OutputConfig Output media file configuration for the task.
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

