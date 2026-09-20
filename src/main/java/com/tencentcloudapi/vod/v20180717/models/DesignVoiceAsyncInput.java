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

public class DesignVoiceAsyncInput extends AbstractModel {

    /**
    * <p>Voice description.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Tone information</p>
    */
    @SerializedName("VoiceSettings")
    @Expose
    private VoiceSettings VoiceSettings;

    /**
    * <p>Trial text.</p>
    */
    @SerializedName("PreviewText")
    @Expose
    private String PreviewText;

    /**
    * <p>Extended parameters in the format of a JSON string.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Voice description.</p> 
     * @return Prompt <p>Voice description.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Voice description.</p>
     * @param Prompt <p>Voice description.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Tone information</p> 
     * @return VoiceSettings <p>Tone information</p>
     */
    public VoiceSettings getVoiceSettings() {
        return this.VoiceSettings;
    }

    /**
     * Set <p>Tone information</p>
     * @param VoiceSettings <p>Tone information</p>
     */
    public void setVoiceSettings(VoiceSettings VoiceSettings) {
        this.VoiceSettings = VoiceSettings;
    }

    /**
     * Get <p>Trial text.</p> 
     * @return PreviewText <p>Trial text.</p>
     */
    public String getPreviewText() {
        return this.PreviewText;
    }

    /**
     * Set <p>Trial text.</p>
     * @param PreviewText <p>Trial text.</p>
     */
    public void setPreviewText(String PreviewText) {
        this.PreviewText = PreviewText;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DesignVoiceAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncInput(DesignVoiceAsyncInput source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.VoiceSettings != null) {
            this.VoiceSettings = new VoiceSettings(source.VoiceSettings);
        }
        if (source.PreviewText != null) {
            this.PreviewText = new String(source.PreviewText);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamObj(map, prefix + "VoiceSettings.", this.VoiceSettings);
        this.setParamSimple(map, prefix + "PreviewText", this.PreviewText);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

