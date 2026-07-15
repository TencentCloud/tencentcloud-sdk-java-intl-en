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

public class AddOnAudio extends AbstractModel {

    /**
    * <p>Audio file input information. Note: (1) Supported audio stream encoding formats: AAC, AC3, EAC3, FLAC, Opus, and MP3. (2) If the segment type set in the adaptive bitrate streaming template is TS, the audio stream encoding format cannot be FLAC.</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>Audio track name, such as Chinese or English. Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
    */
    @SerializedName("AudioName")
    @Expose
    private String AudioName;

    /**
    * <p>Audio track language, such as chi or eng. This follows the ISO 639-2 standard.</p>
    */
    @SerializedName("AudioLanguage")
    @Expose
    private String AudioLanguage;

    /**
    * <p>Default audio track. When set to true, the current audio is designated as the default audio track. A maximum of 1 default audio track can be specified.</p><p>Default value: false.</p>
    */
    @SerializedName("DefaultTrack")
    @Expose
    private Boolean DefaultTrack;

    /**
     * Get <p>Audio file input information. Note: (1) Supported audio stream encoding formats: AAC, AC3, EAC3, FLAC, Opus, and MP3. (2) If the segment type set in the adaptive bitrate streaming template is TS, the audio stream encoding format cannot be FLAC.</p> 
     * @return InputInfo <p>Audio file input information. Note: (1) Supported audio stream encoding formats: AAC, AC3, EAC3, FLAC, Opus, and MP3. (2) If the segment type set in the adaptive bitrate streaming template is TS, the audio stream encoding format cannot be FLAC.</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>Audio file input information. Note: (1) Supported audio stream encoding formats: AAC, AC3, EAC3, FLAC, Opus, and MP3. (2) If the segment type set in the adaptive bitrate streaming template is TS, the audio stream encoding format cannot be FLAC.</p>
     * @param InputInfo <p>Audio file input information. Note: (1) Supported audio stream encoding formats: AAC, AC3, EAC3, FLAC, Opus, and MP3. (2) If the segment type set in the adaptive bitrate streaming template is TS, the audio stream encoding format cannot be FLAC.</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>Audio track name, such as Chinese or English. Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p> 
     * @return AudioName <p>Audio track name, such as Chinese or English. Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
     */
    public String getAudioName() {
        return this.AudioName;
    }

    /**
     * Set <p>Audio track name, such as Chinese or English. Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
     * @param AudioName <p>Audio track name, such as Chinese or English. Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
     */
    public void setAudioName(String AudioName) {
        this.AudioName = AudioName;
    }

    /**
     * Get <p>Audio track language, such as chi or eng. This follows the ISO 639-2 standard.</p> 
     * @return AudioLanguage <p>Audio track language, such as chi or eng. This follows the ISO 639-2 standard.</p>
     */
    public String getAudioLanguage() {
        return this.AudioLanguage;
    }

    /**
     * Set <p>Audio track language, such as chi or eng. This follows the ISO 639-2 standard.</p>
     * @param AudioLanguage <p>Audio track language, such as chi or eng. This follows the ISO 639-2 standard.</p>
     */
    public void setAudioLanguage(String AudioLanguage) {
        this.AudioLanguage = AudioLanguage;
    }

    /**
     * Get <p>Default audio track. When set to true, the current audio is designated as the default audio track. A maximum of 1 default audio track can be specified.</p><p>Default value: false.</p> 
     * @return DefaultTrack <p>Default audio track. When set to true, the current audio is designated as the default audio track. A maximum of 1 default audio track can be specified.</p><p>Default value: false.</p>
     */
    public Boolean getDefaultTrack() {
        return this.DefaultTrack;
    }

    /**
     * Set <p>Default audio track. When set to true, the current audio is designated as the default audio track. A maximum of 1 default audio track can be specified.</p><p>Default value: false.</p>
     * @param DefaultTrack <p>Default audio track. When set to true, the current audio is designated as the default audio track. A maximum of 1 default audio track can be specified.</p><p>Default value: false.</p>
     */
    public void setDefaultTrack(Boolean DefaultTrack) {
        this.DefaultTrack = DefaultTrack;
    }

    public AddOnAudio() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnAudio(AddOnAudio source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.AudioName != null) {
            this.AudioName = new String(source.AudioName);
        }
        if (source.AudioLanguage != null) {
            this.AudioLanguage = new String(source.AudioLanguage);
        }
        if (source.DefaultTrack != null) {
            this.DefaultTrack = new Boolean(source.DefaultTrack);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "AudioName", this.AudioName);
        this.setParamSimple(map, prefix + "AudioLanguage", this.AudioLanguage);
        this.setParamSimple(map, prefix + "DefaultTrack", this.DefaultTrack);

    }
}

