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
    * 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 
    */
    @SerializedName("VoiceSettings")
    @Expose
    private VoiceSettings VoiceSettings;

    /**
    * 
    */
    @SerializedName("PreviewText")
    @Expose
    private String PreviewText;

    /**
    * 
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

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
     * @return VoiceSettings 
     */
    public VoiceSettings getVoiceSettings() {
        return this.VoiceSettings;
    }

    /**
     * Set 
     * @param VoiceSettings 
     */
    public void setVoiceSettings(VoiceSettings VoiceSettings) {
        this.VoiceSettings = VoiceSettings;
    }

    /**
     * Get  
     * @return PreviewText 
     */
    public String getPreviewText() {
        return this.PreviewText;
    }

    /**
     * Set 
     * @param PreviewText 
     */
    public void setPreviewText(String PreviewText) {
        this.PreviewText = PreviewText;
    }

    /**
     * Get  
     * @return ExtParam 
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set 
     * @param ExtParam 
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

