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
    * 
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("TargetDuration")
    @Expose
    private Float TargetDuration;

    /**
    * 
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * Get  
     * @return SourceMedia 
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 
     * @param SourceMedia 
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get  
     * @return SourceMediaStartTime 
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set 
     * @param SourceMediaStartTime 
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return TargetDuration 
     */
    public Float getTargetDuration() {
        return this.TargetDuration;
    }

    /**
     * Set 
     * @param TargetDuration 
     */
    public void setTargetDuration(Float TargetDuration) {
        this.TargetDuration = TargetDuration;
    }

    /**
     * Get  
     * @return AudioOperations 
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set 
     * @param AudioOperations 
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

