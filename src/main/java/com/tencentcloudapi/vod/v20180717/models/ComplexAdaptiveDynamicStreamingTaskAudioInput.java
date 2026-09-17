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

public class ComplexAdaptiveDynamicStreamingTaskAudioInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 
    */
    @SerializedName("AudioTrackIdx")
    @Expose
    private Long AudioTrackIdx;

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * @return Default 
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 
     * @param Default 
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get  
     * @return AudioTrackIdx 
     */
    public Long getAudioTrackIdx() {
        return this.AudioTrackIdx;
    }

    /**
     * Set 
     * @param AudioTrackIdx 
     */
    public void setAudioTrackIdx(Long AudioTrackIdx) {
        this.AudioTrackIdx = AudioTrackIdx;
    }

    public ComplexAdaptiveDynamicStreamingTaskAudioInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput(ComplexAdaptiveDynamicStreamingTaskAudioInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.AudioTrackIdx != null) {
            this.AudioTrackIdx = new Long(source.AudioTrackIdx);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "AudioTrackIdx", this.AudioTrackIdx);

    }
}

