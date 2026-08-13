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

public class EnhanceConfig extends AbstractModel {

    /**
    * Video enhancement configuration.
    */
    @SerializedName("VideoEnhance")
    @Expose
    private VideoEnhanceConfig VideoEnhance;

    /**
    * Audio enhancement configuration.
    */
    @SerializedName("AudioEnhance")
    @Expose
    private AudioEnhanceConfig AudioEnhance;

    /**
     * Get Video enhancement configuration. 
     * @return VideoEnhance Video enhancement configuration.
     */
    public VideoEnhanceConfig getVideoEnhance() {
        return this.VideoEnhance;
    }

    /**
     * Set Video enhancement configuration.
     * @param VideoEnhance Video enhancement configuration.
     */
    public void setVideoEnhance(VideoEnhanceConfig VideoEnhance) {
        this.VideoEnhance = VideoEnhance;
    }

    /**
     * Get Audio enhancement configuration. 
     * @return AudioEnhance Audio enhancement configuration.
     */
    public AudioEnhanceConfig getAudioEnhance() {
        return this.AudioEnhance;
    }

    /**
     * Set Audio enhancement configuration.
     * @param AudioEnhance Audio enhancement configuration.
     */
    public void setAudioEnhance(AudioEnhanceConfig AudioEnhance) {
        this.AudioEnhance = AudioEnhance;
    }

    public EnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhanceConfig(EnhanceConfig source) {
        if (source.VideoEnhance != null) {
            this.VideoEnhance = new VideoEnhanceConfig(source.VideoEnhance);
        }
        if (source.AudioEnhance != null) {
            this.AudioEnhance = new AudioEnhanceConfig(source.AudioEnhance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoEnhance.", this.VideoEnhance);
        this.setParamObj(map, prefix + "AudioEnhance.", this.AudioEnhance);

    }
}

