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
    * <p>Document link for video generation.</p><p>Supported document types: pdf, pptx, docx, png, jpg<br>Document count limit: 3<br>Document size limit: 10MB<br>Document page limit: 100</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String [] FileUrl;

    /**
    * <p>Prompt information for video generation.</p><p>Prompt length limit: 2,000 characters.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Document-to-video model name</p><p>Default value: Wand</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Document-to-video model version number</p><p>Default value: 1.0</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>Aspect ratio of the generated video.</p><p>Enumeration values: </p><ul><li>16:9: 16:9</li><li>9:16: 9:16</li><li>1:1: 1:1</li></ul><p>Default value: 16:9</p>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>Language of the generated video.</p><p>Enumeration values: </p><ul><li>zh: Chinese</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li><li>ru: Russian</li><li>fr: French</li><li>es: Spanish</li><li>de: German</li></ul><p>Default value: zh</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Video duration for reference.</p><p>This is not an exact duration; it serves as a reference for the LLM only.</p><p>Range: [15, 1200]</p><p>Unit: second</p>
    */
    @SerializedName("ReferenceDuration")
    @Expose
    private Long ReferenceDuration;

    /**
    * <p>Whether the AI dubbing feature is enabled.</p><p>Default value: false</p>
    */
    @SerializedName("EnableTTS")
    @Expose
    private Boolean EnableTTS;

    /**
    * <p>Voice ID. Valid only when AI dubbing feature is enabled.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get <p>Document link for video generation.</p><p>Supported document types: pdf, pptx, docx, png, jpg<br>Document count limit: 3<br>Document size limit: 10MB<br>Document page limit: 100</p> 
     * @return FileUrl <p>Document link for video generation.</p><p>Supported document types: pdf, pptx, docx, png, jpg<br>Document count limit: 3<br>Document size limit: 10MB<br>Document page limit: 100</p>
     */
    public String [] getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>Document link for video generation.</p><p>Supported document types: pdf, pptx, docx, png, jpg<br>Document count limit: 3<br>Document size limit: 10MB<br>Document page limit: 100</p>
     * @param FileUrl <p>Document link for video generation.</p><p>Supported document types: pdf, pptx, docx, png, jpg<br>Document count limit: 3<br>Document size limit: 10MB<br>Document page limit: 100</p>
     */
    public void setFileUrl(String [] FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>Prompt information for video generation.</p><p>Prompt length limit: 2,000 characters.</p> 
     * @return Prompt <p>Prompt information for video generation.</p><p>Prompt length limit: 2,000 characters.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt information for video generation.</p><p>Prompt length limit: 2,000 characters.</p>
     * @param Prompt <p>Prompt information for video generation.</p><p>Prompt length limit: 2,000 characters.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Document-to-video model name</p><p>Default value: Wand</p> 
     * @return ModelName <p>Document-to-video model name</p><p>Default value: Wand</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Document-to-video model name</p><p>Default value: Wand</p>
     * @param ModelName <p>Document-to-video model name</p><p>Default value: Wand</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Document-to-video model version number</p><p>Default value: 1.0</p> 
     * @return ModelVersion <p>Document-to-video model version number</p><p>Default value: 1.0</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>Document-to-video model version number</p><p>Default value: 1.0</p>
     * @param ModelVersion <p>Document-to-video model version number</p><p>Default value: 1.0</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>Aspect ratio of the generated video.</p><p>Enumeration values: </p><ul><li>16:9: 16:9</li><li>9:16: 9:16</li><li>1:1: 1:1</li></ul><p>Default value: 16:9</p> 
     * @return Ratio <p>Aspect ratio of the generated video.</p><p>Enumeration values: </p><ul><li>16:9: 16:9</li><li>9:16: 9:16</li><li>1:1: 1:1</li></ul><p>Default value: 16:9</p>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>Aspect ratio of the generated video.</p><p>Enumeration values: </p><ul><li>16:9: 16:9</li><li>9:16: 9:16</li><li>1:1: 1:1</li></ul><p>Default value: 16:9</p>
     * @param Ratio <p>Aspect ratio of the generated video.</p><p>Enumeration values: </p><ul><li>16:9: 16:9</li><li>9:16: 9:16</li><li>1:1: 1:1</li></ul><p>Default value: 16:9</p>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>Language of the generated video.</p><p>Enumeration values: </p><ul><li>zh: Chinese</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li><li>ru: Russian</li><li>fr: French</li><li>es: Spanish</li><li>de: German</li></ul><p>Default value: zh</p> 
     * @return Language <p>Language of the generated video.</p><p>Enumeration values: </p><ul><li>zh: Chinese</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li><li>ru: Russian</li><li>fr: French</li><li>es: Spanish</li><li>de: German</li></ul><p>Default value: zh</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Language of the generated video.</p><p>Enumeration values: </p><ul><li>zh: Chinese</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li><li>ru: Russian</li><li>fr: French</li><li>es: Spanish</li><li>de: German</li></ul><p>Default value: zh</p>
     * @param Language <p>Language of the generated video.</p><p>Enumeration values: </p><ul><li>zh: Chinese</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li><li>ru: Russian</li><li>fr: French</li><li>es: Spanish</li><li>de: German</li></ul><p>Default value: zh</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Video duration for reference.</p><p>This is not an exact duration; it serves as a reference for the LLM only.</p><p>Range: [15, 1200]</p><p>Unit: second</p> 
     * @return ReferenceDuration <p>Video duration for reference.</p><p>This is not an exact duration; it serves as a reference for the LLM only.</p><p>Range: [15, 1200]</p><p>Unit: second</p>
     */
    public Long getReferenceDuration() {
        return this.ReferenceDuration;
    }

    /**
     * Set <p>Video duration for reference.</p><p>This is not an exact duration; it serves as a reference for the LLM only.</p><p>Range: [15, 1200]</p><p>Unit: second</p>
     * @param ReferenceDuration <p>Video duration for reference.</p><p>This is not an exact duration; it serves as a reference for the LLM only.</p><p>Range: [15, 1200]</p><p>Unit: second</p>
     */
    public void setReferenceDuration(Long ReferenceDuration) {
        this.ReferenceDuration = ReferenceDuration;
    }

    /**
     * Get <p>Whether the AI dubbing feature is enabled.</p><p>Default value: false</p> 
     * @return EnableTTS <p>Whether the AI dubbing feature is enabled.</p><p>Default value: false</p>
     */
    public Boolean getEnableTTS() {
        return this.EnableTTS;
    }

    /**
     * Set <p>Whether the AI dubbing feature is enabled.</p><p>Default value: false</p>
     * @param EnableTTS <p>Whether the AI dubbing feature is enabled.</p><p>Default value: false</p>
     */
    public void setEnableTTS(Boolean EnableTTS) {
        this.EnableTTS = EnableTTS;
    }

    /**
     * Get <p>Voice ID. Valid only when AI dubbing feature is enabled.</p> 
     * @return VoiceId <p>Voice ID. Valid only when AI dubbing feature is enabled.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice ID. Valid only when AI dubbing feature is enabled.</p>
     * @param VoiceId <p>Voice ID. Valid only when AI dubbing feature is enabled.</p>
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

