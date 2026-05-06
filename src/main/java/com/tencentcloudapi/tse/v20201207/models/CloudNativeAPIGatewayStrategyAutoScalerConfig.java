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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyAutoScalerConfig extends AbstractModel {

    /**
    * Maximum number of replicas
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Metric list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metrics")
    @Expose
    private CloudNativeAPIGatewayStrategyAutoScalerConfigMetric [] Metrics;

    /**
    * Whether metric scaling is enabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * Metric configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoScalerId")
    @Expose
    private String AutoScalerId;

    /**
    * Metric scaling behavior configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Behavior")
    @Expose
    private AutoScalerBehavior Behavior;

    /**
     * Get Maximum number of replicas 
     * @return MaxReplicas Maximum number of replicas
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set Maximum number of replicas
     * @param MaxReplicas Maximum number of replicas
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Metric list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Metrics Metric list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfigMetric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metric list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Metrics Metric list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetrics(CloudNativeAPIGatewayStrategyAutoScalerConfigMetric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Whether metric scaling is enabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enabled Whether metric scaling is enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether metric scaling is enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enabled Whether metric scaling is enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Metric configuration ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoScalerId Metric configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getAutoScalerId() {
        return this.AutoScalerId;
    }

    /**
     * Set Metric configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoScalerId Metric configuration ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setAutoScalerId(String AutoScalerId) {
        this.AutoScalerId = AutoScalerId;
    }

    /**
     * Get Metric scaling behavior configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Behavior Metric scaling behavior configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AutoScalerBehavior getBehavior() {
        return this.Behavior;
    }

    /**
     * Set Metric scaling behavior configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Behavior Metric scaling behavior configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBehavior(AutoScalerBehavior Behavior) {
        this.Behavior = Behavior;
    }

    public CloudNativeAPIGatewayStrategyAutoScalerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfig(CloudNativeAPIGatewayStrategyAutoScalerConfig source) {
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new CloudNativeAPIGatewayStrategyAutoScalerConfigMetric[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new CloudNativeAPIGatewayStrategyAutoScalerConfigMetric(source.Metrics[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.AutoScalerId != null) {
            this.AutoScalerId = new String(source.AutoScalerId);
        }
        if (source.Behavior != null) {
            this.Behavior = new AutoScalerBehavior(source.Behavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "AutoScalerId", this.AutoScalerId);
        this.setParamObj(map, prefix + "Behavior.", this.Behavior);

    }
}

