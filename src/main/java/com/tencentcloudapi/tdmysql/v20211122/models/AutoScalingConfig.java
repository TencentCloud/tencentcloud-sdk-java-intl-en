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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingConfig extends AbstractModel {

    /**
    * <p>Minimum value</p>
    */
    @SerializedName("RangeMin")
    @Expose
    private Float RangeMin;

    /**
    * <p>Maximum value</p>
    */
    @SerializedName("RangeMax")
    @Expose
    private Float RangeMax;

    /**
    * <p>Resource type corresponding to the returned range parameter</p><p>Enumeration values:</p><ul><li>cpu: Returns the CPU adjustment return limit. When no mem limit exists, it represents ccu.</li><li>nodecount: Returns the limit range of the number of nodes for horizontal scaling.</li><li>datadisk: Returns the capacity limit range for disk scale-out.</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>Whether upgrade is allowed</p>
    */
    @SerializedName("ScaleUpEnabled")
    @Expose
    private Boolean ScaleUpEnabled;

    /**
    * <p>Whether to allow downgrade</p>
    */
    @SerializedName("ScaleDownEnabled")
    @Expose
    private Boolean ScaleDownEnabled;

    /**
    * <p>Trigger threshold (%)</p>
    */
    @SerializedName("ThresholdPercent")
    @Expose
    private Long ThresholdPercent;

    /**
    * <p>Configuration change step length</p>
    */
    @SerializedName("Step")
    @Expose
    private Float Step;

    /**
     * Get <p>Minimum value</p> 
     * @return RangeMin <p>Minimum value</p>
     */
    public Float getRangeMin() {
        return this.RangeMin;
    }

    /**
     * Set <p>Minimum value</p>
     * @param RangeMin <p>Minimum value</p>
     */
    public void setRangeMin(Float RangeMin) {
        this.RangeMin = RangeMin;
    }

    /**
     * Get <p>Maximum value</p> 
     * @return RangeMax <p>Maximum value</p>
     */
    public Float getRangeMax() {
        return this.RangeMax;
    }

    /**
     * Set <p>Maximum value</p>
     * @param RangeMax <p>Maximum value</p>
     */
    public void setRangeMax(Float RangeMax) {
        this.RangeMax = RangeMax;
    }

    /**
     * Get <p>Resource type corresponding to the returned range parameter</p><p>Enumeration values:</p><ul><li>cpu: Returns the CPU adjustment return limit. When no mem limit exists, it represents ccu.</li><li>nodecount: Returns the limit range of the number of nodes for horizontal scaling.</li><li>datadisk: Returns the capacity limit range for disk scale-out.</li></ul> 
     * @return ResourceType <p>Resource type corresponding to the returned range parameter</p><p>Enumeration values:</p><ul><li>cpu: Returns the CPU adjustment return limit. When no mem limit exists, it represents ccu.</li><li>nodecount: Returns the limit range of the number of nodes for horizontal scaling.</li><li>datadisk: Returns the capacity limit range for disk scale-out.</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Resource type corresponding to the returned range parameter</p><p>Enumeration values:</p><ul><li>cpu: Returns the CPU adjustment return limit. When no mem limit exists, it represents ccu.</li><li>nodecount: Returns the limit range of the number of nodes for horizontal scaling.</li><li>datadisk: Returns the capacity limit range for disk scale-out.</li></ul>
     * @param ResourceType <p>Resource type corresponding to the returned range parameter</p><p>Enumeration values:</p><ul><li>cpu: Returns the CPU adjustment return limit. When no mem limit exists, it represents ccu.</li><li>nodecount: Returns the limit range of the number of nodes for horizontal scaling.</li><li>datadisk: Returns the capacity limit range for disk scale-out.</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>Whether upgrade is allowed</p> 
     * @return ScaleUpEnabled <p>Whether upgrade is allowed</p>
     */
    public Boolean getScaleUpEnabled() {
        return this.ScaleUpEnabled;
    }

    /**
     * Set <p>Whether upgrade is allowed</p>
     * @param ScaleUpEnabled <p>Whether upgrade is allowed</p>
     */
    public void setScaleUpEnabled(Boolean ScaleUpEnabled) {
        this.ScaleUpEnabled = ScaleUpEnabled;
    }

    /**
     * Get <p>Whether to allow downgrade</p> 
     * @return ScaleDownEnabled <p>Whether to allow downgrade</p>
     */
    public Boolean getScaleDownEnabled() {
        return this.ScaleDownEnabled;
    }

    /**
     * Set <p>Whether to allow downgrade</p>
     * @param ScaleDownEnabled <p>Whether to allow downgrade</p>
     */
    public void setScaleDownEnabled(Boolean ScaleDownEnabled) {
        this.ScaleDownEnabled = ScaleDownEnabled;
    }

    /**
     * Get <p>Trigger threshold (%)</p> 
     * @return ThresholdPercent <p>Trigger threshold (%)</p>
     */
    public Long getThresholdPercent() {
        return this.ThresholdPercent;
    }

    /**
     * Set <p>Trigger threshold (%)</p>
     * @param ThresholdPercent <p>Trigger threshold (%)</p>
     */
    public void setThresholdPercent(Long ThresholdPercent) {
        this.ThresholdPercent = ThresholdPercent;
    }

    /**
     * Get <p>Configuration change step length</p> 
     * @return Step <p>Configuration change step length</p>
     */
    public Float getStep() {
        return this.Step;
    }

    /**
     * Set <p>Configuration change step length</p>
     * @param Step <p>Configuration change step length</p>
     */
    public void setStep(Float Step) {
        this.Step = Step;
    }

    public AutoScalingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingConfig(AutoScalingConfig source) {
        if (source.RangeMin != null) {
            this.RangeMin = new Float(source.RangeMin);
        }
        if (source.RangeMax != null) {
            this.RangeMax = new Float(source.RangeMax);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ScaleUpEnabled != null) {
            this.ScaleUpEnabled = new Boolean(source.ScaleUpEnabled);
        }
        if (source.ScaleDownEnabled != null) {
            this.ScaleDownEnabled = new Boolean(source.ScaleDownEnabled);
        }
        if (source.ThresholdPercent != null) {
            this.ThresholdPercent = new Long(source.ThresholdPercent);
        }
        if (source.Step != null) {
            this.Step = new Float(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RangeMin", this.RangeMin);
        this.setParamSimple(map, prefix + "RangeMax", this.RangeMax);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ScaleUpEnabled", this.ScaleUpEnabled);
        this.setParamSimple(map, prefix + "ScaleDownEnabled", this.ScaleDownEnabled);
        this.setParamSimple(map, prefix + "ThresholdPercent", this.ThresholdPercent);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

