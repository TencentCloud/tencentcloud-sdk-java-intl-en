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

public class SnapshotByTimeOffsetTaskInput extends AbstractModel {

    /**
    * Time point screencapturing template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The list of screenshot time points. “s” and “%” formats are supported:
<li>When a time point string ends with “s”, its unit is second. For example, “3.5s” means the 3.5th second of the video.</li>
<li>When a time point string ends with “%”, it represents the percentage of the video’s duration. For example, “10%” means that the time point is at the 10% of the video’s entire duration.</li>
    */
    @SerializedName("ExtTimeOffsetSet")
    @Expose
    private String [] ExtTimeOffsetSet;

    /**
    * List of time points for screencapturing in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
     * Get Time point screencapturing template ID. 
     * @return Definition Time point screencapturing template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Time point screencapturing template ID.
     * @param Definition Time point screencapturing template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The list of screenshot time points. “s” and “%” formats are supported:
<li>When a time point string ends with “s”, its unit is second. For example, “3.5s” means the 3.5th second of the video.</li>
<li>When a time point string ends with “%”, it represents the percentage of the video’s duration. For example, “10%” means that the time point is at the 10% of the video’s entire duration.</li> 
     * @return ExtTimeOffsetSet The list of screenshot time points. “s” and “%” formats are supported:
<li>When a time point string ends with “s”, its unit is second. For example, “3.5s” means the 3.5th second of the video.</li>
<li>When a time point string ends with “%”, it represents the percentage of the video’s duration. For example, “10%” means that the time point is at the 10% of the video’s entire duration.</li>
     */
    public String [] getExtTimeOffsetSet() {
        return this.ExtTimeOffsetSet;
    }

    /**
     * Set The list of screenshot time points. “s” and “%” formats are supported:
<li>When a time point string ends with “s”, its unit is second. For example, “3.5s” means the 3.5th second of the video.</li>
<li>When a time point string ends with “%”, it represents the percentage of the video’s duration. For example, “10%” means that the time point is at the 10% of the video’s entire duration.</li>
     * @param ExtTimeOffsetSet The list of screenshot time points. “s” and “%” formats are supported:
<li>When a time point string ends with “s”, its unit is second. For example, “3.5s” means the 3.5th second of the video.</li>
<li>When a time point string ends with “%”, it represents the percentage of the video’s duration. For example, “10%” means that the time point is at the 10% of the video’s entire duration.</li>
     */
    public void setExtTimeOffsetSet(String [] ExtTimeOffsetSet) {
        this.ExtTimeOffsetSet = ExtTimeOffsetSet;
    }

    /**
     * Get List of time points for screencapturing in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TimeOffsetSet List of time points for screencapturing in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * Set List of time points for screencapturing in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TimeOffsetSet List of time points for screencapturing in <font color=red>milliseconds</font>.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
    }

    /**
     * Get List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WatermarkSet List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WatermarkSet List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    public SnapshotByTimeOffsetTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTaskInput(SnapshotByTimeOffsetTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtTimeOffsetSet != null) {
            this.ExtTimeOffsetSet = new String[source.ExtTimeOffsetSet.length];
            for (int i = 0; i < source.ExtTimeOffsetSet.length; i++) {
                this.ExtTimeOffsetSet[i] = new String(source.ExtTimeOffsetSet[i]);
            }
        }
        if (source.TimeOffsetSet != null) {
            this.TimeOffsetSet = new Float[source.TimeOffsetSet.length];
            for (int i = 0; i < source.TimeOffsetSet.length; i++) {
                this.TimeOffsetSet[i] = new Float(source.TimeOffsetSet[i]);
            }
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ExtTimeOffsetSet.", this.ExtTimeOffsetSet);
        this.setParamArraySimple(map, prefix + "TimeOffsetSet.", this.TimeOffsetSet);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);

    }
}

