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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSceneInfo extends AbstractModel {

    /**
    * <p>Analysis interval (seconds): trigger an analysis every few seconds (sliding step length)</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Analysis segment duration (seconds): length of the video window fed into the model at a time, range [5, 12800]</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>Frame sampling rate. Default value: 1. Value range: [0.1, 1]. One frame is sampled every 1/Fps seconds and sent to the model.</p>
    */
    @SerializedName("Fps")
    @Expose
    private Float Fps;

    /**
     * Get <p>Analysis interval (seconds): trigger an analysis every few seconds (sliding step length)</p> 
     * @return Interval <p>Analysis interval (seconds): trigger an analysis every few seconds (sliding step length)</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Analysis interval (seconds): trigger an analysis every few seconds (sliding step length)</p>
     * @param Interval <p>Analysis interval (seconds): trigger an analysis every few seconds (sliding step length)</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Analysis segment duration (seconds): length of the video window fed into the model at a time, range [5, 12800]</p> 
     * @return Duration <p>Analysis segment duration (seconds): length of the video window fed into the model at a time, range [5, 12800]</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Analysis segment duration (seconds): length of the video window fed into the model at a time, range [5, 12800]</p>
     * @param Duration <p>Analysis segment duration (seconds): length of the video window fed into the model at a time, range [5, 12800]</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Frame sampling rate. Default value: 1. Value range: [0.1, 1]. One frame is sampled every 1/Fps seconds and sent to the model.</p> 
     * @return Fps <p>Frame sampling rate. Default value: 1. Value range: [0.1, 1]. One frame is sampled every 1/Fps seconds and sent to the model.</p>
     */
    public Float getFps() {
        return this.Fps;
    }

    /**
     * Set <p>Frame sampling rate. Default value: 1. Value range: [0.1, 1]. One frame is sampled every 1/Fps seconds and sent to the model.</p>
     * @param Fps <p>Frame sampling rate. Default value: 1. Value range: [0.1, 1]. One frame is sampled every 1/Fps seconds and sent to the model.</p>
     */
    public void setFps(Float Fps) {
        this.Fps = Fps;
    }

    public VideoSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSceneInfo(VideoSceneInfo source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Fps != null) {
            this.Fps = new Float(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

