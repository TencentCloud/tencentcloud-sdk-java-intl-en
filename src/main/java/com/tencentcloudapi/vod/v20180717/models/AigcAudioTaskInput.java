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

public class AigcAudioTaskInput extends AbstractModel {

    /**
    * <p>Model name.</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Model version.</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Scenario type. Values are as follows: <li>When ModelName is Kling, the value motion_control means action control;</li><li>Other ModelName values are not currently supported.</li></p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>Prompt content for video generation. Supports up to 1000 characters. This parameter is required when FileInfos is empty.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Prompt to prevent the model from generating video. Supports up to 1000 characters.</p>
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * <p>Audio content for reference.</p>
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioReferenceAudioInfo [] AudioInfos;

    /**
    * <p>Reference video info.</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioReferenceVideoInfo [] VideoInfos;

    /**
    * <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private Boolean EnhancePrompt;

    /**
    * <p>Output result file output of AIGC image generation.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcAudioOutputConfig OutputConfig;

    /**
    * <p>Additional parameter.</p>
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
     * Get <p>Model name.</p> 
     * @return ModelName <p>Model name.</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name.</p>
     * @param ModelName <p>Model name.</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Model version.</p> 
     * @return ModelVersion <p>Model version.</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Model version.</p>
     * @param ModelVersion <p>Model version.</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Scenario type. Values are as follows: <li>When ModelName is Kling, the value motion_control means action control;</li><li>Other ModelName values are not currently supported.</li></p> 
     * @return SceneType <p>Scenario type. Values are as follows: <li>When ModelName is Kling, the value motion_control means action control;</li><li>Other ModelName values are not currently supported.</li></p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Scenario type. Values are as follows: <li>When ModelName is Kling, the value motion_control means action control;</li><li>Other ModelName values are not currently supported.</li></p>
     * @param SceneType <p>Scenario type. Values are as follows: <li>When ModelName is Kling, the value motion_control means action control;</li><li>Other ModelName values are not currently supported.</li></p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Prompt content for video generation. Supports up to 1000 characters. This parameter is required when FileInfos is empty.</p> 
     * @return Prompt <p>Prompt content for video generation. Supports up to 1000 characters. This parameter is required when FileInfos is empty.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt content for video generation. Supports up to 1000 characters. This parameter is required when FileInfos is empty.</p>
     * @param Prompt <p>Prompt content for video generation. Supports up to 1000 characters. This parameter is required when FileInfos is empty.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Prompt to prevent the model from generating video. Supports up to 1000 characters.</p> 
     * @return NegativePrompt <p>Prompt to prevent the model from generating video. Supports up to 1000 characters.</p>
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set <p>Prompt to prevent the model from generating video. Supports up to 1000 characters.</p>
     * @param NegativePrompt <p>Prompt to prevent the model from generating video. Supports up to 1000 characters.</p>
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get <p>Audio content for reference.</p> 
     * @return AudioInfos <p>Audio content for reference.</p>
     */
    public AigcAudioReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set <p>Audio content for reference.</p>
     * @param AudioInfos <p>Audio content for reference.</p>
     */
    public void setAudioInfos(AigcAudioReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get <p>Reference video info.</p> 
     * @return VideoInfos <p>Reference video info.</p>
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>Reference video info.</p>
     * @param VideoInfos <p>Reference video info.</p>
     */
    public void setVideoInfos(AigcAudioReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p> 
     * @return EnhancePrompt <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public Boolean getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     * @param EnhancePrompt <p>Whether to optimize Prompt content automatically. When Enabled, the passed-in Prompt will be optimized automatically to enhance generation quality. Valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li></p>
     */
    public void setEnhancePrompt(Boolean EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get <p>Output result file output of AIGC image generation.</p> 
     * @return OutputConfig <p>Output result file output of AIGC image generation.</p>
     */
    public AigcAudioOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output result file output of AIGC image generation.</p>
     * @param OutputConfig <p>Output result file output of AIGC image generation.</p>
     */
    public void setOutputConfig(AigcAudioOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>Additional parameter.</p> 
     * @return AdditionalParameters <p>Additional parameter.</p>
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set <p>Additional parameter.</p>
     * @param AdditionalParameters <p>Additional parameter.</p>
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    public AigcAudioTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioTaskInput(AigcAudioTaskInput source) {
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
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcAudioReferenceAudioInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcAudioReferenceAudioInfo(source.AudioInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcAudioReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcAudioReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new Boolean(source.EnhancePrompt);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcAudioOutputConfig(source.OutputConfig);
        }
        if (source.AdditionalParameters != null) {
            this.AdditionalParameters = new String(source.AdditionalParameters);
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
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);

    }
}

