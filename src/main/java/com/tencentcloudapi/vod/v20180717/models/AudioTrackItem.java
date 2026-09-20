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

public class AudioTrackItem extends AbstractModel {

    /**
    * Media material source of the audio clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as anti-leech) is enabled, the URL needs to carry access control parameters (such as an anti-leech signature).
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * The start time of the audio clip in the material file, in seconds. 0 means to capture from the start position of the material. Default value: 0.
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * Duration of the audio clip in seconds. Defaults to the length of the material itself, which means the entire material is captured.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Target duration of the audio clip in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the audio clip will be fast-forwarded or slowed down so that the duration of the output segment equals TargetDuration.</li>
    */
    @SerializedName("TargetDuration")
    @Expose
    private Float TargetDuration;

    /**
    * Operation performed on the audio clip, such as volume adjustment.
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * Get Media material source of the audio clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as anti-leech) is enabled, the URL needs to carry access control parameters (such as an anti-leech signature). 
     * @return SourceMedia Media material source of the audio clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as anti-leech) is enabled, the URL needs to carry access control parameters (such as an anti-leech signature).
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set Media material source of the audio clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as anti-leech) is enabled, the URL needs to carry access control parameters (such as an anti-leech signature).
     * @param SourceMedia Media material source of the audio clip, which can be:
<li>Media file ID for VOD;</li>
<li>Download URL of other media files.</li>
Note: When using the download URL of another media file as the material source and access control (such as anti-leech) is enabled, the URL needs to carry access control parameters (such as an anti-leech signature).
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get The start time of the audio clip in the material file, in seconds. 0 means to capture from the start position of the material. Default value: 0. 
     * @return SourceMediaStartTime The start time of the audio clip in the material file, in seconds. 0 means to capture from the start position of the material. Default value: 0.
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set The start time of the audio clip in the material file, in seconds. 0 means to capture from the start position of the material. Default value: 0.
     * @param SourceMediaStartTime The start time of the audio clip in the material file, in seconds. 0 means to capture from the start position of the material. Default value: 0.
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get Duration of the audio clip in seconds. Defaults to the length of the material itself, which means the entire material is captured. 
     * @return Duration Duration of the audio clip in seconds. Defaults to the length of the material itself, which means the entire material is captured.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of the audio clip in seconds. Defaults to the length of the material itself, which means the entire material is captured.
     * @param Duration Duration of the audio clip in seconds. Defaults to the length of the material itself, which means the entire material is captured.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Target duration of the audio clip in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the audio clip will be fast-forwarded or slowed down so that the duration of the output segment equals TargetDuration.</li> 
     * @return TargetDuration Target duration of the audio clip in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the audio clip will be fast-forwarded or slowed down so that the duration of the output segment equals TargetDuration.</li>
     */
    public Float getTargetDuration() {
        return this.TargetDuration;
    }

    /**
     * Set Target duration of the audio clip in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the audio clip will be fast-forwarded or slowed down so that the duration of the output segment equals TargetDuration.</li>
     * @param TargetDuration Target duration of the audio clip in seconds.
<li>If TargetDuration is not specified or set to 0, it means the target duration is the same as Duration;</li>
<li>When TargetDuration is set to a value more than 0, the audio clip will be fast-forwarded or slowed down so that the duration of the output segment equals TargetDuration.</li>
     */
    public void setTargetDuration(Float TargetDuration) {
        this.TargetDuration = TargetDuration;
    }

    /**
     * Get Operation performed on the audio clip, such as volume adjustment. 
     * @return AudioOperations Operation performed on the audio clip, such as volume adjustment.
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set Operation performed on the audio clip, such as volume adjustment.
     * @param AudioOperations Operation performed on the audio clip, such as volume adjustment.
     */
    public void setAudioOperations(AudioTransform [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    public AudioTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTrackItem(AudioTrackItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.SourceMediaStartTime != null) {
            this.SourceMediaStartTime = new Float(source.SourceMediaStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.TargetDuration != null) {
            this.TargetDuration = new Float(source.TargetDuration);
        }
        if (source.AudioOperations != null) {
            this.AudioOperations = new AudioTransform[source.AudioOperations.length];
            for (int i = 0; i < source.AudioOperations.length; i++) {
                this.AudioOperations[i] = new AudioTransform(source.AudioOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TargetDuration", this.TargetDuration);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

