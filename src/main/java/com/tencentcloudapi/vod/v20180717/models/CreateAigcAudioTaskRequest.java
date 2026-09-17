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

public class CreateAigcAudioTaskRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioReferenceVideoInfo [] VideoInfos;

    /**
    * 
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioReferenceAudioInfo [] AudioInfos;

    /**
    * 
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcAudioOutputConfig OutputConfig;

    /**
    * 
    */
    @SerializedName("AdditionalParameters")
    @Expose
    private String AdditionalParameters;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return ModelName 
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 
     * @param ModelName 
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get  
     * @return ModelVersion 
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 
     * @param ModelVersion 
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get  
     * @return SceneType 
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 
     * @param SceneType 
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get  
     * @return Prompt 
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 
     * @param Prompt 
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get  
     * @return VideoInfos 
     */
    public AigcAudioReferenceVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set 
     * @param VideoInfos 
     */
    public void setVideoInfos(AigcAudioReferenceVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get  
     * @return AudioInfos 
     */
    public AigcAudioReferenceAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set 
     * @param AudioInfos 
     */
    public void setAudioInfos(AigcAudioReferenceAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get  
     * @return OutputConfig 
     */
    public AigcAudioOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 
     * @param OutputConfig 
     */
    public void setOutputConfig(AigcAudioOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get  
     * @return AdditionalParameters 
     */
    public String getAdditionalParameters() {
        return this.AdditionalParameters;
    }

    /**
     * Set 
     * @param AdditionalParameters 
     */
    public void setAdditionalParameters(String AdditionalParameters) {
        this.AdditionalParameters = AdditionalParameters;
    }

    public CreateAigcAudioTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioTaskRequest(CreateAigcAudioTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcAudioReferenceVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcAudioReferenceVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcAudioReferenceAudioInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcAudioReferenceAudioInfo(source.AudioInfos[i]);
            }
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "AdditionalParameters", this.AdditionalParameters);

    }
}

