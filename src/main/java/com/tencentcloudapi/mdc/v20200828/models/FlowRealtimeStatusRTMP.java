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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowRealtimeStatusRTMP extends AbstractModel {

    /**
    * Video frame rate.
    */
    @SerializedName("VideoFPS")
    @Expose
    private Long VideoFPS;

    /**
    * Audio frame rate.
    */
    @SerializedName("AudioFPS")
    @Expose
    private Long AudioFPS;

    /**
     * Get Video frame rate. 
     * @return VideoFPS Video frame rate.
     */
    public Long getVideoFPS() {
        return this.VideoFPS;
    }

    /**
     * Set Video frame rate.
     * @param VideoFPS Video frame rate.
     */
    public void setVideoFPS(Long VideoFPS) {
        this.VideoFPS = VideoFPS;
    }

    /**
     * Get Audio frame rate. 
     * @return AudioFPS Audio frame rate.
     */
    public Long getAudioFPS() {
        return this.AudioFPS;
    }

    /**
     * Set Audio frame rate.
     * @param AudioFPS Audio frame rate.
     */
    public void setAudioFPS(Long AudioFPS) {
        this.AudioFPS = AudioFPS;
    }

    public FlowRealtimeStatusRTMP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusRTMP(FlowRealtimeStatusRTMP source) {
        if (source.VideoFPS != null) {
            this.VideoFPS = new Long(source.VideoFPS);
        }
        if (source.AudioFPS != null) {
            this.AudioFPS = new Long(source.AudioFPS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoFPS", this.VideoFPS);
        this.setParamSimple(map, prefix + "AudioFPS", this.AudioFPS);

    }
}

