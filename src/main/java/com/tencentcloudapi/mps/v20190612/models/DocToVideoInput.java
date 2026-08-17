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

public class DocToVideoInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileUrl")
    @Expose
    private String [] FileUrl;

    /**
    * 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

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
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * 
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 
    */
    @SerializedName("ReferenceDuration")
    @Expose
    private Long ReferenceDuration;

    /**
    * 
    */
    @SerializedName("EnableTTS")
    @Expose
    private Boolean EnableTTS;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get  
     * @return FileUrl 
     */
    public String [] getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 
     * @param FileUrl 
     */
    public void setFileUrl(String [] FileUrl) {
        this.FileUrl = FileUrl;
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
     * @return Ratio 
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set 
     * @param Ratio 
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get  
     * @return Language 
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 
     * @param Language 
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get  
     * @return ReferenceDuration 
     */
    public Long getReferenceDuration() {
        return this.ReferenceDuration;
    }

    /**
     * Set 
     * @param ReferenceDuration 
     */
    public void setReferenceDuration(Long ReferenceDuration) {
        this.ReferenceDuration = ReferenceDuration;
    }

    /**
     * Get  
     * @return EnableTTS 
     */
    public Boolean getEnableTTS() {
        return this.EnableTTS;
    }

    /**
     * Set 
     * @param EnableTTS 
     */
    public void setEnableTTS(Boolean EnableTTS) {
        this.EnableTTS = EnableTTS;
    }

    /**
     * Get  
     * @return VoiceId 
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 
     * @param VoiceId 
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    public DocToVideoInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocToVideoInput(DocToVideoInput source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String[source.FileUrl.length];
            for (int i = 0; i < source.FileUrl.length; i++) {
                this.FileUrl[i] = new String(source.FileUrl[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.ReferenceDuration != null) {
            this.ReferenceDuration = new Long(source.ReferenceDuration);
        }
        if (source.EnableTTS != null) {
            this.EnableTTS = new Boolean(source.EnableTTS);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileUrl.", this.FileUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "ReferenceDuration", this.ReferenceDuration);
        this.setParamSimple(map, prefix + "EnableTTS", this.EnableTTS);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

