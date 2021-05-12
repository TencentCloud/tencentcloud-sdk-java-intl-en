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

public class WatermarkCycleConfigForUpdate extends AbstractModel{

    /**
    * Playback time point in seconds when a watermark appears in a video for the first time.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * Display duration of a watermark in a watermark cycle in seconds.
    */
    @SerializedName("DisplayDuration")
    @Expose
    private Float DisplayDuration;

    /**
    * Duration of a watermark cycle in seconds.
If 0 is entered, a watermark will last for only one cycle (i.e., visible for `DisplayDuration` seconds throughout the video).
    */
    @SerializedName("CycleDuration")
    @Expose
    private Float CycleDuration;

    /**
     * Get Playback time point in seconds when a watermark appears in a video for the first time. 
     * @return StartTime Playback time point in seconds when a watermark appears in a video for the first time.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Playback time point in seconds when a watermark appears in a video for the first time.
     * @param StartTime Playback time point in seconds when a watermark appears in a video for the first time.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Display duration of a watermark in a watermark cycle in seconds. 
     * @return DisplayDuration Display duration of a watermark in a watermark cycle in seconds.
     */
    public Float getDisplayDuration() {
        return this.DisplayDuration;
    }

    /**
     * Set Display duration of a watermark in a watermark cycle in seconds.
     * @param DisplayDuration Display duration of a watermark in a watermark cycle in seconds.
     */
    public void setDisplayDuration(Float DisplayDuration) {
        this.DisplayDuration = DisplayDuration;
    }

    /**
     * Get Duration of a watermark cycle in seconds.
If 0 is entered, a watermark will last for only one cycle (i.e., visible for `DisplayDuration` seconds throughout the video). 
     * @return CycleDuration Duration of a watermark cycle in seconds.
If 0 is entered, a watermark will last for only one cycle (i.e., visible for `DisplayDuration` seconds throughout the video).
     */
    public Float getCycleDuration() {
        return this.CycleDuration;
    }

    /**
     * Set Duration of a watermark cycle in seconds.
If 0 is entered, a watermark will last for only one cycle (i.e., visible for `DisplayDuration` seconds throughout the video).
     * @param CycleDuration Duration of a watermark cycle in seconds.
If 0 is entered, a watermark will last for only one cycle (i.e., visible for `DisplayDuration` seconds throughout the video).
     */
    public void setCycleDuration(Float CycleDuration) {
        this.CycleDuration = CycleDuration;
    }

    public WatermarkCycleConfigForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkCycleConfigForUpdate(WatermarkCycleConfigForUpdate source) {
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.DisplayDuration != null) {
            this.DisplayDuration = new Float(source.DisplayDuration);
        }
        if (source.CycleDuration != null) {
            this.CycleDuration = new Float(source.CycleDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DisplayDuration", this.DisplayDuration);
        this.setParamSimple(map, prefix + "CycleDuration", this.CycleDuration);

    }
}

