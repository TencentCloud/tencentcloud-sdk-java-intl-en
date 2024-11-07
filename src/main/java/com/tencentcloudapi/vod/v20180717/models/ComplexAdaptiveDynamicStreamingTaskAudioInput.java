/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Media ID of the input audio file. The first audio stream in the media will be fixed, while video streams and other audio streams (if any) will be ignored.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Audio stream name in the output, supporting up to 16 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The language of the audio stream in the output, supporting up to 16 characters. It must comply with the RFC5646 specification.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Whether to set as the default audio for adaptive bitrate streaming.
<li>YES: Set as the default audio;</li>
<li>NO: Not set as the default audio (default value).</li>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
     * Get Media ID of the input audio file. The first audio stream in the media will be fixed, while video streams and other audio streams (if any) will be ignored. 
     * @return FileId Media ID of the input audio file. The first audio stream in the media will be fixed, while video streams and other audio streams (if any) will be ignored.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media ID of the input audio file. The first audio stream in the media will be fixed, while video streams and other audio streams (if any) will be ignored.
     * @param FileId Media ID of the input audio file. The first audio stream in the media will be fixed, while video streams and other audio streams (if any) will be ignored.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Audio stream name in the output, supporting up to 16 characters. 
     * @return Name Audio stream name in the output, supporting up to 16 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio stream name in the output, supporting up to 16 characters.
     * @param Name Audio stream name in the output, supporting up to 16 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The language of the audio stream in the output, supporting up to 16 characters. It must comply with the RFC5646 specification. 
     * @return Language The language of the audio stream in the output, supporting up to 16 characters. It must comply with the RFC5646 specification.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set The language of the audio stream in the output, supporting up to 16 characters. It must comply with the RFC5646 specification.
     * @param Language The language of the audio stream in the output, supporting up to 16 characters. It must comply with the RFC5646 specification.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Whether to set as the default audio for adaptive bitrate streaming.
<li>YES: Set as the default audio;</li>
<li>NO: Not set as the default audio (default value).</li> 
     * @return Default Whether to set as the default audio for adaptive bitrate streaming.
<li>YES: Set as the default audio;</li>
<li>NO: Not set as the default audio (default value).</li>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Whether to set as the default audio for adaptive bitrate streaming.
<li>YES: Set as the default audio;</li>
<li>NO: Not set as the default audio (default value).</li>
     * @param Default Whether to set as the default audio for adaptive bitrate streaming.
<li>YES: Set as the default audio;</li>
<li>NO: Not set as the default audio (default value).</li>
     */
    public void setDefault(String Default) {
        this.Default = Default;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}

