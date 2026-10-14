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

public class FlowAudio extends AbstractModel {

    /**
    * Frame rate.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Bitrate in bps.
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * Audio Pid.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
     * Get Frame rate. 
     * @return Fps Frame rate.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate.
     * @param Fps Frame rate.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Bitrate in bps. 
     * @return Rate Bitrate in bps.
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set Bitrate in bps.
     * @param Rate Bitrate in bps.
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Audio Pid. 
     * @return Pid Audio Pid.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Audio Pid.
     * @param Pid Audio Pid.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    public FlowAudio() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowAudio(FlowAudio source) {
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

