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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceCloneRequest extends AbstractModel {

    /**
    * Specifies the SdkAppId of TRTC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Sound clone name. only digits, letters, and underscores are allowed with a maximum of 36 characters.
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * The reference audio for voice cloning must be a base64 string of a 16k mono wav file with length between 10–180 seconds.
    */
    @SerializedName("PromptAudio")
    @Expose
    private String PromptAudio;

    /**
    * API key for TTS.
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * Reference text for voice cloning. specifies the text corresponding to the reference audio.
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * TTS model: flow_01_turbo, flow_01_ex.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Language parameter, empty by default. see: (ISO 639-1).
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
     * Get Specifies the SdkAppId of TRTC. 
     * @return SdkAppId Specifies the SdkAppId of TRTC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Specifies the SdkAppId of TRTC.
     * @param SdkAppId Specifies the SdkAppId of TRTC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Sound clone name. only digits, letters, and underscores are allowed with a maximum of 36 characters. 
     * @return VoiceName Sound clone name. only digits, letters, and underscores are allowed with a maximum of 36 characters.
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set Sound clone name. only digits, letters, and underscores are allowed with a maximum of 36 characters.
     * @param VoiceName Sound clone name. only digits, letters, and underscores are allowed with a maximum of 36 characters.
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get The reference audio for voice cloning must be a base64 string of a 16k mono wav file with length between 10–180 seconds. 
     * @return PromptAudio The reference audio for voice cloning must be a base64 string of a 16k mono wav file with length between 10–180 seconds.
     */
    public String getPromptAudio() {
        return this.PromptAudio;
    }

    /**
     * Set The reference audio for voice cloning must be a base64 string of a 16k mono wav file with length between 10–180 seconds.
     * @param PromptAudio The reference audio for voice cloning must be a base64 string of a 16k mono wav file with length between 10–180 seconds.
     */
    public void setPromptAudio(String PromptAudio) {
        this.PromptAudio = PromptAudio;
    }

    /**
     * Get API key for TTS. 
     * @return APIKey API key for TTS.
     * @deprecated
     */
    @Deprecated
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set API key for TTS.
     * @param APIKey API key for TTS.
     * @deprecated
     */
    @Deprecated
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get Reference text for voice cloning. specifies the text corresponding to the reference audio. 
     * @return PromptText Reference text for voice cloning. specifies the text corresponding to the reference audio.
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set Reference text for voice cloning. specifies the text corresponding to the reference audio.
     * @param PromptText Reference text for voice cloning. specifies the text corresponding to the reference audio.
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get TTS model: flow_01_turbo, flow_01_ex. 
     * @return Model TTS model: flow_01_turbo, flow_01_ex.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set TTS model: flow_01_turbo, flow_01_ex.
     * @param Model TTS model: flow_01_turbo, flow_01_ex.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Language parameter, empty by default. see: (ISO 639-1). 
     * @return Language Language parameter, empty by default. see: (ISO 639-1).
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Language parameter, empty by default. see: (ISO 639-1).
     * @param Language Language parameter, empty by default. see: (ISO 639-1).
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public VoiceCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceCloneRequest(VoiceCloneRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.PromptAudio != null) {
            this.PromptAudio = new String(source.PromptAudio);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "PromptAudio", this.PromptAudio);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Language", this.Language);

    }
}

