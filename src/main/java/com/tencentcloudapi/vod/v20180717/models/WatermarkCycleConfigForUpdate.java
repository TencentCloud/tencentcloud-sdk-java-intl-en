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

public class WatermarkCycleConfigForUpdate extends AbstractModel {

    /**
    * Playback time point of the first occurrence of the watermark in the video. Measurement unit: second.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * Duration of watermark display in a watermark cycle, in seconds.
    */
    @SerializedName("DisplayDuration")
    @Expose
    private Float DisplayDuration;

    /**
    * Duration of a watermark cycle, in seconds.
Set to 0, a watermark will last only one watermark cycle (displayed for DisplayDuration seconds in the entire video).
    */
    @SerializedName("CycleDuration")
    @Expose
    private Float CycleDuration;

    /**
     * Get Playback time point of the first occurrence of the watermark in the video. Measurement unit: second. 
     * @return StartTime Playback time point of the first occurrence of the watermark in the video. Measurement unit: second.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Playback time point of the first occurrence of the watermark in the video. Measurement unit: second.
     * @param StartTime Playback time point of the first occurrence of the watermark in the video. Measurement unit: second.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Duration of watermark display in a watermark cycle, in seconds. 
     * @return DisplayDuration Duration of watermark display in a watermark cycle, in seconds.
     */
    public Float getDisplayDuration() {
        return this.DisplayDuration;
    }

    /**
     * Set Duration of watermark display in a watermark cycle, in seconds.
     * @param DisplayDuration Duration of watermark display in a watermark cycle, in seconds.
     */
    public void setDisplayDuration(Float DisplayDuration) {
        this.DisplayDuration = DisplayDuration;
    }

    /**
     * Get Duration of a watermark cycle, in seconds.
Set to 0, a watermark will last only one watermark cycle (displayed for DisplayDuration seconds in the entire video). 
     * @return CycleDuration Duration of a watermark cycle, in seconds.
Set to 0, a watermark will last only one watermark cycle (displayed for DisplayDuration seconds in the entire video).
     */
    public Float getCycleDuration() {
        return this.CycleDuration;
    }

    /**
     * Set Duration of a watermark cycle, in seconds.
Set to 0, a watermark will last only one watermark cycle (displayed for DisplayDuration seconds in the entire video).
     * @param CycleDuration Duration of a watermark cycle, in seconds.
Set to 0, a watermark will last only one watermark cycle (displayed for DisplayDuration seconds in the entire video).
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

