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

public class EnhanceConfigForUpdate extends AbstractModel {

    /**
    * Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoEnhance")
    @Expose
    private VideoEnhanceConfig VideoEnhance;

    /**
    * The audio enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioEnhance")
    @Expose
    private AudioEnhanceConfig AudioEnhance;

    /**
     * Get Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoEnhance Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoEnhanceConfig getVideoEnhance() {
        return this.VideoEnhance;
    }

    /**
     * Set Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoEnhance Video enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoEnhance(VideoEnhanceConfig VideoEnhance) {
        this.VideoEnhance = VideoEnhance;
    }

    /**
     * Get The audio enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioEnhance The audio enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AudioEnhanceConfig getAudioEnhance() {
        return this.AudioEnhance;
    }

    /**
     * Set The audio enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioEnhance The audio enhancement configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioEnhance(AudioEnhanceConfig AudioEnhance) {
        this.AudioEnhance = AudioEnhance;
    }

    public EnhanceConfigForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhanceConfigForUpdate(EnhanceConfigForUpdate source) {
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

