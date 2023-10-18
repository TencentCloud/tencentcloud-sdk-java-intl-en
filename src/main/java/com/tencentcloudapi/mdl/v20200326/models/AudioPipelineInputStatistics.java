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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioPipelineInputStatistics extends AbstractModel {

    /**
    * Audio FPS.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Audio bitrate in bps.
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * Audio `Pid`, which is available only if the input is `rtp/udp`.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
     * Get Audio FPS. 
     * @return Fps Audio FPS.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Audio FPS.
     * @param Fps Audio FPS.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Audio bitrate in bps. 
     * @return Rate Audio bitrate in bps.
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set Audio bitrate in bps.
     * @param Rate Audio bitrate in bps.
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Audio `Pid`, which is available only if the input is `rtp/udp`. 
     * @return Pid Audio `Pid`, which is available only if the input is `rtp/udp`.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Audio `Pid`, which is available only if the input is `rtp/udp`.
     * @param Pid Audio `Pid`, which is available only if the input is `rtp/udp`.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    public AudioPipelineInputStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioPipelineInputStatistics(AudioPipelineInputStatistics source) {
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

