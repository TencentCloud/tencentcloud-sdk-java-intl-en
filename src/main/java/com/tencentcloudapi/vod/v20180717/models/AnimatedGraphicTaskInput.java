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

public class AnimatedGraphicTaskInput extends AbstractModel{

    /**
    * Animated image generating template ID
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Start time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will start at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will start at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will start at the nth second before the end of the video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will end at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will end at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will end at the nth second before the end of the video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Animated image generating template ID 
     * @return Definition Animated image generating template ID
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Animated image generating template ID
     * @param Definition Animated image generating template ID
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Start time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will start at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will start at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will start at the nth second before the end of the video.</li> 
     * @return StartTimeOffset Start time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will start at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will start at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will start at the nth second before the end of the video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will start at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will start at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will start at the nth second before the end of the video.</li>
     * @param StartTimeOffset Start time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will start at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will start at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will start at the nth second before the end of the video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will end at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will end at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will end at the nth second before the end of the video.</li> 
     * @return EndTimeOffset End time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will end at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will end at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will end at the nth second before the end of the video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will end at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will end at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will end at the nth second before the end of the video.</li>
     * @param EndTimeOffset End time offset of an animated image in the video, in seconds.
<li>If this parameter is left empty or set to 0, the animated image will end at the same time as the video.</li>
<li>If this parameter is set to a positive number (n for example), the animated image will end at the nth second of the video.</li>
<li>If this parameter is set to a negative number (-n for example), the animated image will end at the nth second before the end of the video.</li>
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

