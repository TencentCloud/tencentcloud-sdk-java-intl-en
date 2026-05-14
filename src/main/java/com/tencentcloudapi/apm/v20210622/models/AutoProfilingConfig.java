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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoProfilingConfig extends AbstractModel {

    /**
    * Auto CPU profiling task switch
    */
    @SerializedName("CpuProfilingEnable")
    @Expose
    private Boolean CpuProfilingEnable;

    /**
    * Auto memory profiling task switch
    */
    @SerializedName("MemoryProfilingEnable")
    @Expose
    private Boolean MemoryProfilingEnable;

    /**
    * Auto CPU profiling task threshold
    */
    @SerializedName("CpuProfilingThreshold")
    @Expose
    private Long CpuProfilingThreshold;

    /**
    * Automated memory profiling task threshold
    */
    @SerializedName("MemoryProfilingThreshold")
    @Expose
    private Long MemoryProfilingThreshold;

    /**
    * CPU auto profiling task duration
    */
    @SerializedName("CpuProfilingDuration")
    @Expose
    private Long CpuProfilingDuration;

    /**
    * Memory auto profiling task duration
    */
    @SerializedName("MemoryProfilingDuration")
    @Expose
    private Long MemoryProfilingDuration;

    /**
     * Get Auto CPU profiling task switch 
     * @return CpuProfilingEnable Auto CPU profiling task switch
     */
    public Boolean getCpuProfilingEnable() {
        return this.CpuProfilingEnable;
    }

    /**
     * Set Auto CPU profiling task switch
     * @param CpuProfilingEnable Auto CPU profiling task switch
     */
    public void setCpuProfilingEnable(Boolean CpuProfilingEnable) {
        this.CpuProfilingEnable = CpuProfilingEnable;
    }

    /**
     * Get Auto memory profiling task switch 
     * @return MemoryProfilingEnable Auto memory profiling task switch
     */
    public Boolean getMemoryProfilingEnable() {
        return this.MemoryProfilingEnable;
    }

    /**
     * Set Auto memory profiling task switch
     * @param MemoryProfilingEnable Auto memory profiling task switch
     */
    public void setMemoryProfilingEnable(Boolean MemoryProfilingEnable) {
        this.MemoryProfilingEnable = MemoryProfilingEnable;
    }

    /**
     * Get Auto CPU profiling task threshold 
     * @return CpuProfilingThreshold Auto CPU profiling task threshold
     */
    public Long getCpuProfilingThreshold() {
        return this.CpuProfilingThreshold;
    }

    /**
     * Set Auto CPU profiling task threshold
     * @param CpuProfilingThreshold Auto CPU profiling task threshold
     */
    public void setCpuProfilingThreshold(Long CpuProfilingThreshold) {
        this.CpuProfilingThreshold = CpuProfilingThreshold;
    }

    /**
     * Get Automated memory profiling task threshold 
     * @return MemoryProfilingThreshold Automated memory profiling task threshold
     */
    public Long getMemoryProfilingThreshold() {
        return this.MemoryProfilingThreshold;
    }

    /**
     * Set Automated memory profiling task threshold
     * @param MemoryProfilingThreshold Automated memory profiling task threshold
     */
    public void setMemoryProfilingThreshold(Long MemoryProfilingThreshold) {
        this.MemoryProfilingThreshold = MemoryProfilingThreshold;
    }

    /**
     * Get CPU auto profiling task duration 
     * @return CpuProfilingDuration CPU auto profiling task duration
     */
    public Long getCpuProfilingDuration() {
        return this.CpuProfilingDuration;
    }

    /**
     * Set CPU auto profiling task duration
     * @param CpuProfilingDuration CPU auto profiling task duration
     */
    public void setCpuProfilingDuration(Long CpuProfilingDuration) {
        this.CpuProfilingDuration = CpuProfilingDuration;
    }

    /**
     * Get Memory auto profiling task duration 
     * @return MemoryProfilingDuration Memory auto profiling task duration
     */
    public Long getMemoryProfilingDuration() {
        return this.MemoryProfilingDuration;
    }

    /**
     * Set Memory auto profiling task duration
     * @param MemoryProfilingDuration Memory auto profiling task duration
     */
    public void setMemoryProfilingDuration(Long MemoryProfilingDuration) {
        this.MemoryProfilingDuration = MemoryProfilingDuration;
    }

    public AutoProfilingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoProfilingConfig(AutoProfilingConfig source) {
        if (source.CpuProfilingEnable != null) {
            this.CpuProfilingEnable = new Boolean(source.CpuProfilingEnable);
        }
        if (source.MemoryProfilingEnable != null) {
            this.MemoryProfilingEnable = new Boolean(source.MemoryProfilingEnable);
        }
        if (source.CpuProfilingThreshold != null) {
            this.CpuProfilingThreshold = new Long(source.CpuProfilingThreshold);
        }
        if (source.MemoryProfilingThreshold != null) {
            this.MemoryProfilingThreshold = new Long(source.MemoryProfilingThreshold);
        }
        if (source.CpuProfilingDuration != null) {
            this.CpuProfilingDuration = new Long(source.CpuProfilingDuration);
        }
        if (source.MemoryProfilingDuration != null) {
            this.MemoryProfilingDuration = new Long(source.MemoryProfilingDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuProfilingEnable", this.CpuProfilingEnable);
        this.setParamSimple(map, prefix + "MemoryProfilingEnable", this.MemoryProfilingEnable);
        this.setParamSimple(map, prefix + "CpuProfilingThreshold", this.CpuProfilingThreshold);
        this.setParamSimple(map, prefix + "MemoryProfilingThreshold", this.MemoryProfilingThreshold);
        this.setParamSimple(map, prefix + "CpuProfilingDuration", this.CpuProfilingDuration);
        this.setParamSimple(map, prefix + "MemoryProfilingDuration", this.MemoryProfilingDuration);

    }
}

