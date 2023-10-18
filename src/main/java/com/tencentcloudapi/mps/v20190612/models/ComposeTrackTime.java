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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeTrackTime extends AbstractModel {

    /**
    * The time when the element starts on the track.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates the time when 3.5 seconds of the video elapses.</li>
Note: If this parameter is not specified, the start time will be the end time of the previous element. Therefore, you can also use the placeholder parameter `ComposeEmptyItem` to configure the start time.
    */
    @SerializedName("Start")
    @Expose
    private String Start;

    /**
    * The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` means 3.5 seconds.</li>
The default value is the material duration, which is determined by `EndTime` and `StartTime` of `ComposeSourceMedia`. If `ComposeSourceMedia` is not specified, the duration will be 1 second.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get The time when the element starts on the track.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates the time when 3.5 seconds of the video elapses.</li>
Note: If this parameter is not specified, the start time will be the end time of the previous element. Therefore, you can also use the placeholder parameter `ComposeEmptyItem` to configure the start time. 
     * @return Start The time when the element starts on the track.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates the time when 3.5 seconds of the video elapses.</li>
Note: If this parameter is not specified, the start time will be the end time of the previous element. Therefore, you can also use the placeholder parameter `ComposeEmptyItem` to configure the start time.
     */
    public String getStart() {
        return this.Start;
    }

    /**
     * Set The time when the element starts on the track.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates the time when 3.5 seconds of the video elapses.</li>
Note: If this parameter is not specified, the start time will be the end time of the previous element. Therefore, you can also use the placeholder parameter `ComposeEmptyItem` to configure the start time.
     * @param Start The time when the element starts on the track.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` indicates the time when 3.5 seconds of the video elapses.</li>
Note: If this parameter is not specified, the start time will be the end time of the previous element. Therefore, you can also use the placeholder parameter `ComposeEmptyItem` to configure the start time.
     */
    public void setStart(String Start) {
        this.Start = Start;
    }

    /**
     * Get The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` means 3.5 seconds.</li>
The default value is the material duration, which is determined by `EndTime` and `StartTime` of `ComposeSourceMedia`. If `ComposeSourceMedia` is not specified, the duration will be 1 second. 
     * @return Duration The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` means 3.5 seconds.</li>
The default value is the material duration, which is determined by `EndTime` and `StartTime` of `ComposeSourceMedia`. If `ComposeSourceMedia` is not specified, the duration will be 1 second.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` means 3.5 seconds.</li>
The default value is the material duration, which is determined by `EndTime` and `StartTime` of `ComposeSourceMedia`. If `ComposeSourceMedia` is not specified, the duration will be 1 second.
     * @param Duration The element duration.
<li>The value of this parameter ends with `s`, which means seconds. For example, `3.5s` means 3.5 seconds.</li>
The default value is the material duration, which is determined by `EndTime` and `StartTime` of `ComposeSourceMedia`. If `ComposeSourceMedia` is not specified, the duration will be 1 second.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public ComposeTrackTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeTrackTime(ComposeTrackTime source) {
        if (source.Start != null) {
            this.Start = new String(source.Start);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

