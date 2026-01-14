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

public class AigcVideoTaskInput extends AbstractModel {

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
    * File information of the input video for the AIGC video generation task. 
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * The media file ID used as the end frame to generate video. 
    */
    @SerializedName("LastFrameFileId")
    @Expose
    private String LastFrameFileId;

    /**
    * Prompt content for video generation. 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Prevent the model from generating video prompts.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
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
    * Specifies the output media file configuration for the video task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoOutputConfig OutputConfig;

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
     * Get File information of the input video for the AIGC video generation task.  
     * @return FileInfos File information of the input video for the AIGC video generation task. 
     */
    public AigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set File information of the input video for the AIGC video generation task. 
     * @param FileInfos File information of the input video for the AIGC video generation task. 
     */
    public void setFileInfos(AigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get The media file ID used as the end frame to generate video.  
     * @return LastFrameFileId The media file ID used as the end frame to generate video. 
     */
    public String getLastFrameFileId() {
        return this.LastFrameFileId;
    }

    /**
     * Set The media file ID used as the end frame to generate video. 
     * @param LastFrameFileId The media file ID used as the end frame to generate video. 
     */
    public void setLastFrameFileId(String LastFrameFileId) {
        this.LastFrameFileId = LastFrameFileId;
    }

    /**
     * Get Prompt content for video generation.  
     * @return Prompt Prompt content for video generation. 
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Prompt content for video generation. 
     * @param Prompt Prompt content for video generation. 
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Prevent the model from generating video prompts. 
     * @return NegativePrompt Prevent the model from generating video prompts.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Prevent the model from generating video prompts.
     * @param NegativePrompt Prevent the model from generating video prompts.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>. 
     * @return EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     * @param EnhancePrompt Whether to optimize Prompt content automatically. when Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
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
     * Get Specifies the output media file configuration for the video task. 
     * @return OutputConfig Specifies the output media file configuration for the video task.
     */
    public AigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Specifies the output media file configuration for the video task.
     * @param OutputConfig Specifies the output media file configuration for the video task.
     */
    public void setOutputConfig(AigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public AigcVideoTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInput(AigcVideoTaskInput source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.LastFrameFileId != null) {
            this.LastFrameFileId = new String(source.LastFrameFileId);
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
            this.OutputConfig = new AigcVideoOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "LastFrameFileId", this.LastFrameFileId);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamSimple(map, prefix + "GenerationMode", this.GenerationMode);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

