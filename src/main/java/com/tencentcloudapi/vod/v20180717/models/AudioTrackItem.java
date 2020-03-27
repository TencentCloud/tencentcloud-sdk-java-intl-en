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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTrackItem extends AbstractModel{

    /**
    * Source of media file for audio material, which can be an ID of a VOD file or URL of another file.
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
    * Operation on audio segment, such as volume adjustment.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * Get Source of media file for audio material, which can be an ID of a VOD file or URL of another file. 
     * @return SourceMedia Source of media file for audio material, which can be an ID of a VOD file or URL of another file.
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set Source of media file for audio material, which can be an ID of a VOD file or URL of another file.
     * @param SourceMedia Source of media file for audio material, which can be an ID of a VOD file or URL of another file.
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

