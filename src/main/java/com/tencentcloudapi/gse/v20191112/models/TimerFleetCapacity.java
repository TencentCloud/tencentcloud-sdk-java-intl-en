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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerFleetCapacity extends AbstractModel {

    /**
    * ID of the fleet to be bound with the policy
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Desired number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DesiredInstances")
    @Expose
    private Long DesiredInstances;

    /**
    * Minimum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Maximum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Scaling cooldown period, in minutes
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ScalingInterval")
    @Expose
    private Long ScalingInterval;

    /**
    * Scaling type. `1`: manual, `2`: automatic, `0`: undefined
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ScalingType")
    @Expose
    private Long ScalingType;

    /**
    * Configuration of target tracking scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetConfiguration")
    @Expose
    private TargetConfiguration TargetConfiguration;

    /**
     * Get ID of the fleet to be bound with the policy
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FleetId ID of the fleet to be bound with the policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set ID of the fleet to be bound with the policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FleetId ID of the fleet to be bound with the policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Desired number of instances
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DesiredInstances Desired number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDesiredInstances() {
        return this.DesiredInstances;
    }

    /**
     * Set Desired number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DesiredInstances Desired number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDesiredInstances(Long DesiredInstances) {
        this.DesiredInstances = DesiredInstances;
    }

    /**
     * Get Minimum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MinSize Minimum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MinSize Minimum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Maximum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxSize Maximum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxSize Maximum number of instances
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Scaling cooldown period, in minutes
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ScalingInterval Scaling cooldown period, in minutes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getScalingInterval() {
        return this.ScalingInterval;
    }

    /**
     * Set Scaling cooldown period, in minutes
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ScalingInterval Scaling cooldown period, in minutes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setScalingInterval(Long ScalingInterval) {
        this.ScalingInterval = ScalingInterval;
    }

    /**
     * Get Scaling type. `1`: manual, `2`: automatic, `0`: undefined
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ScalingType Scaling type. `1`: manual, `2`: automatic, `0`: undefined
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getScalingType() {
        return this.ScalingType;
    }

    /**
     * Set Scaling type. `1`: manual, `2`: automatic, `0`: undefined
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ScalingType Scaling type. `1`: manual, `2`: automatic, `0`: undefined
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setScalingType(Long ScalingType) {
        this.ScalingType = ScalingType;
    }

    /**
     * Get Configuration of target tracking scaling
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetConfiguration Configuration of target tracking scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.TargetConfiguration;
    }

    /**
     * Set Configuration of target tracking scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TargetConfiguration Configuration of target tracking scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetConfiguration(TargetConfiguration TargetConfiguration) {
        this.TargetConfiguration = TargetConfiguration;
    }

    public TimerFleetCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerFleetCapacity(TimerFleetCapacity source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.DesiredInstances != null) {
            this.DesiredInstances = new Long(source.DesiredInstances);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.ScalingInterval != null) {
            this.ScalingInterval = new Long(source.ScalingInterval);
        }
        if (source.ScalingType != null) {
            this.ScalingType = new Long(source.ScalingType);
        }
        if (source.TargetConfiguration != null) {
            this.TargetConfiguration = new TargetConfiguration(source.TargetConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "DesiredInstances", this.DesiredInstances);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "ScalingInterval", this.ScalingInterval);
        this.setParamSimple(map, prefix + "ScalingType", this.ScalingType);
        this.setParamObj(map, prefix + "TargetConfiguration.", this.TargetConfiguration);

    }
}

