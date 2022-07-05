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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HorizontalAutoscaler extends AbstractModel{

    /**
    * (Optional) Minimum number of instances
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * (Optional) Maximum number of instances
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Metrics (CPU or memory)
    */
    @SerializedName("Metrics")
    @Expose
    private String Metrics;

    /**
    * Threshold (percentage)
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Whether it is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get (Optional) Minimum number of instances 
     * @return MinReplicas (Optional) Minimum number of instances
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set (Optional) Minimum number of instances
     * @param MinReplicas (Optional) Minimum number of instances
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get (Optional) Maximum number of instances 
     * @return MaxReplicas (Optional) Maximum number of instances
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set (Optional) Maximum number of instances
     * @param MaxReplicas (Optional) Maximum number of instances
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Metrics (CPU or memory) 
     * @return Metrics Metrics (CPU or memory)
     */
    public String getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metrics (CPU or memory)
     * @param Metrics Metrics (CPU or memory)
     */
    public void setMetrics(String Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Threshold (percentage) 
     * @return Threshold Threshold (percentage)
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Threshold (percentage)
     * @param Threshold Threshold (percentage)
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Whether it is enabled 
     * @return Enabled Whether it is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether it is enabled
     * @param Enabled Whether it is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public HorizontalAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalAutoscaler(HorizontalAutoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new String(source.Metrics);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

