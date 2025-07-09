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
    * Source of media material for audio segment, which can be:
<li>ID of VOD media files</li>
<li>Download URL of other media files</li>
Note: when a download URL of other media files is used as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as hotlink protection signature).
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * Start time of audio segment in material file in seconds. Default value: 0, which means to start capturing from the beginning position of the material.
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * Audio segment duration in seconds. By default, the length of the material will be used, which means that the entire material will be captured.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * The target audio duration, in seconds.
<li>If `TargetDuration` is empty or `0`, the target duration is the same as `Duration`.</li>
<li>If `TargetDuration` is a value greater than 0, the playback speed will be changed to make the final audio duration the same as the value of `TargetDuration`.</li>
    */
    @SerializedName("TargetDuration")
    @Expose
    private Float TargetDuration;

    /**
    * Operation on audio segment, such as volume adjustment.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * Get Source of media material for audio segment, which can be:
<li>ID of VOD media files</li>
<li>Download URL of other media files</li>
Note: when a download URL of other media files is used as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as hotlink protection signature). 
     * @return SourceMedia Source of media material for audio segment, which can be:
<li>ID of VOD media files</li>
<li>Download URL of other media files</li>
Note: when a download URL of other media files is used as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as hotlink protection signature).
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set Source of media material for audio segment, which can be:
<li>ID of VOD media files</li>
<li>Download URL of other media files</li>
Note: when a download URL of other media files is used as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as hotlink protection signature).
     * @param SourceMedia Source of media material for audio segment, which can be:
<li>ID of VOD media files</li>
<li>Download URL of other media files</li>
Note: when a download URL of other media files is used as the material source and access control (such as hotlink protection) is enabled, the URL needs to carry access control parameters (such as hotlink protection signature).
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get Start time of audio segment in material file in seconds. Default value: 0, which means to start capturing from the beginning position of the material. 
     * @return SourceMediaStartTime Start time of audio segment in material file in seconds. Default value: 0, which means to start capturing from the beginning position of the material.
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set Start time of audio segment in material file in seconds. Default value: 0, which means to start capturing from the beginning position of the material.
     * @param SourceMediaStartTime Start time of audio segment in material file in seconds. Default value: 0, which means to start capturing from the beginning position of the material.
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get Audio segment duration in seconds. By default, the length of the material will be used, which means that the entire material will be captured. 
     * @return Duration Audio segment duration in seconds. By default, the length of the material will be used, which means that the entire material will be captured.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Audio segment duration in seconds. By default, the length of the material will be used, which means that the entire material will be captured.
     * @param Duration Audio segment duration in seconds. By default, the length of the material will be used, which means that the entire material will be captured.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The target audio duration, in seconds.
<li>If `TargetDuration` is empty or `0`, the target duration is the same as `Duration`.</li>
<li>If `TargetDuration` is a value greater than 0, the playback speed will be changed to make the final audio duration the same as the value of `TargetDuration`.</li> 
     * @return TargetDuration The target audio duration, in seconds.
<li>If `TargetDuration` is empty or `0`, the target duration is the same as `Duration`.</li>
<li>If `TargetDuration` is a value greater than 0, the playback speed will be changed to make the final audio duration the same as the value of `TargetDuration`.</li>
     */
    public Float getTargetDuration() {
        return this.TargetDuration;
    }

    /**
     * Set The target audio duration, in seconds.
<li>If `TargetDuration` is empty or `0`, the target duration is the same as `Duration`.</li>
<li>If `TargetDuration` is a value greater than 0, the playback speed will be changed to make the final audio duration the same as the value of `TargetDuration`.</li>
     * @param TargetDuration The target audio duration, in seconds.
<li>If `TargetDuration` is empty or `0`, the target duration is the same as `Duration`.</li>
<li>If `TargetDuration` is a value greater than 0, the playback speed will be changed to make the final audio duration the same as the value of `TargetDuration`.</li>
     */
    public void setTargetDuration(Float TargetDuration) {
        this.TargetDuration = TargetDuration;
    }

    /**
     * Get Operation on audio segment, such as volume adjustment.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioOperations Operation on audio segment, such as volume adjustment.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set Operation on audio segment, such as volume adjustment.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioOperations Operation on audio segment, such as volume adjustment.
Note: this field may return null, indicating that no valid values can be obtained.
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

