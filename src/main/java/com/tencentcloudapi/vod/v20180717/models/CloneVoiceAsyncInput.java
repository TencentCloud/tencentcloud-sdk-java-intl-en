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

public class CloneVoiceAsyncInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 
    */
    @SerializedName("AudioFileId")
    @Expose
    private String AudioFileId;

    /**
    * 
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * 
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get  
     * @return AudioUrl 
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 
     * @param AudioUrl 
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get  
     * @return AudioFileId 
     */
    public String getAudioFileId() {
        return this.AudioFileId;
    }

    /**
     * Set 
     * @param AudioFileId 
     */
    public void setAudioFileId(String AudioFileId) {
        this.AudioFileId = AudioFileId;
    }

    /**
     * Get  
     * @return LanguageBoost 
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set 
     * @param LanguageBoost 
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
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

    public CloneVoiceAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceAsyncInput(CloneVoiceAsyncInput source) {
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioFileId != null) {
            this.AudioFileId = new String(source.AudioFileId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioFileId", this.AudioFileId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

