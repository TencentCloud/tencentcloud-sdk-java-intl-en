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

public class AnimatedGraphicTaskInput extends AbstractModel {

    /**
    * Video-to-GIF conversion template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Start time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it starts from the beginning of the video.</li>
<li>When the value is greater than 0 (assuming n), it means starting from the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means starting from the position n seconds before the video ends.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Termination time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it will last until the end of a video.</li>
<li>When the value is greater than 0 (assuming n), it means to terminate at the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means the video will terminate n seconds before the end.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Video-to-GIF conversion template ID. 
     * @return Definition Video-to-GIF conversion template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Video-to-GIF conversion template ID.
     * @param Definition Video-to-GIF conversion template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Start time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it starts from the beginning of the video.</li>
<li>When the value is greater than 0 (assuming n), it means starting from the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means starting from the position n seconds before the video ends.</li> 
     * @return StartTimeOffset Start time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it starts from the beginning of the video.</li>
<li>When the value is greater than 0 (assuming n), it means starting from the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means starting from the position n seconds before the video ends.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it starts from the beginning of the video.</li>
<li>When the value is greater than 0 (assuming n), it means starting from the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means starting from the position n seconds before the video ends.</li>
     * @param StartTimeOffset Start time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it starts from the beginning of the video.</li>
<li>When the value is greater than 0 (assuming n), it means starting from the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means starting from the position n seconds before the video ends.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Termination time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it will last until the end of a video.</li>
<li>When the value is greater than 0 (assuming n), it means to terminate at the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means the video will terminate n seconds before the end.</li> 
     * @return EndTimeOffset Termination time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it will last until the end of a video.</li>
<li>When the value is greater than 0 (assuming n), it means to terminate at the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means the video will terminate n seconds before the end.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Termination time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it will last until the end of a video.</li>
<li>When the value is greater than 0 (assuming n), it means to terminate at the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means the video will terminate n seconds before the end.</li>
     * @param EndTimeOffset Termination time offset of the GIF in the video, in seconds.
<li>If not set or set to 0, it will last until the end of a video.</li>
<li>When the value is greater than 0 (assuming n), it means to terminate at the nth second of the video;</li>
<li>When the value is less than 0 (assuming -n), it means the video will terminate n seconds before the end.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public AnimatedGraphicTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnimatedGraphicTaskInput(AnimatedGraphicTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

