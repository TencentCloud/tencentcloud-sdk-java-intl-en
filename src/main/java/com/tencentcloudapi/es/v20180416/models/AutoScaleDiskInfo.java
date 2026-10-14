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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScaleDiskInfo extends AbstractModel {

    /**
    * Node type. Valid values: `hotData`, `warmData`.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 0: Percentage-based scale-out; 1: Absolute value-based scale-out
    */
    @SerializedName("ScaleType")
    @Expose
    private Long ScaleType;

    /**
    * Trigger threshold. Unit: %. For example, 80%.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Trigger duration in minutes, for example, 60
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Expansion ratio per time, unit: %, for example, 20%
    */
    @SerializedName("PercentSize")
    @Expose
    private Long PercentSize;

    /**
    * Absolute value-based scale-out, in GB, for example, 100 GB
    */
    @SerializedName("FixSize")
    @Expose
    private Long FixSize;

    /**
    * Capacity limit for scale-out, in GB, for example, 500 GB
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get Node type. Valid values: `hotData`, `warmData`. 
     * @return NodeType Node type. Valid values: `hotData`, `warmData`.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Valid values: `hotData`, `warmData`.
     * @param NodeType Node type. Valid values: `hotData`, `warmData`.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 0: Percentage-based scale-out; 1: Absolute value-based scale-out 
     * @return ScaleType 0: Percentage-based scale-out; 1: Absolute value-based scale-out
     */
    public Long getScaleType() {
        return this.ScaleType;
    }

    /**
     * Set 0: Percentage-based scale-out; 1: Absolute value-based scale-out
     * @param ScaleType 0: Percentage-based scale-out; 1: Absolute value-based scale-out
     */
    public void setScaleType(Long ScaleType) {
        this.ScaleType = ScaleType;
    }

    /**
     * Get Trigger threshold. Unit: %. For example, 80%. 
     * @return Threshold Trigger threshold. Unit: %. For example, 80%.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Trigger threshold. Unit: %. For example, 80%.
     * @param Threshold Trigger threshold. Unit: %. For example, 80%.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Trigger duration in minutes, for example, 60 
     * @return Duration Trigger duration in minutes, for example, 60
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Trigger duration in minutes, for example, 60
     * @param Duration Trigger duration in minutes, for example, 60
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Expansion ratio per time, unit: %, for example, 20% 
     * @return PercentSize Expansion ratio per time, unit: %, for example, 20%
     */
    public Long getPercentSize() {
        return this.PercentSize;
    }

    /**
     * Set Expansion ratio per time, unit: %, for example, 20%
     * @param PercentSize Expansion ratio per time, unit: %, for example, 20%
     */
    public void setPercentSize(Long PercentSize) {
        this.PercentSize = PercentSize;
    }

    /**
     * Get Absolute value-based scale-out, in GB, for example, 100 GB 
     * @return FixSize Absolute value-based scale-out, in GB, for example, 100 GB
     */
    public Long getFixSize() {
        return this.FixSize;
    }

    /**
     * Set Absolute value-based scale-out, in GB, for example, 100 GB
     * @param FixSize Absolute value-based scale-out, in GB, for example, 100 GB
     */
    public void setFixSize(Long FixSize) {
        this.FixSize = FixSize;
    }

    /**
     * Get Capacity limit for scale-out, in GB, for example, 500 GB 
     * @return MaxSize Capacity limit for scale-out, in GB, for example, 500 GB
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Capacity limit for scale-out, in GB, for example, 500 GB
     * @param MaxSize Capacity limit for scale-out, in GB, for example, 500 GB
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public AutoScaleDiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleDiskInfo(AutoScaleDiskInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ScaleType != null) {
            this.ScaleType = new Long(source.ScaleType);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.PercentSize != null) {
            this.PercentSize = new Long(source.PercentSize);
        }
        if (source.FixSize != null) {
            this.FixSize = new Long(source.FixSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ScaleType", this.ScaleType);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "PercentSize", this.PercentSize);
        this.setParamSimple(map, prefix + "FixSize", this.FixSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

