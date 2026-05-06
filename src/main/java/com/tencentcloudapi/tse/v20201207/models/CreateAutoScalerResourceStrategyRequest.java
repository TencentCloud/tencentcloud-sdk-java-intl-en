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

public class CreateAutoScalerResourceStrategyRequest extends AbstractModel {

    /**
    * Gateway instance ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Policy name.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Policy description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Metric scaling configuration
    */
    @SerializedName("Config")
    @Expose
    private CloudNativeAPIGatewayStrategyAutoScalerConfig Config;

    /**
    * Scheduled scaling configuration list
    */
    @SerializedName("CronScalerConfig")
    @Expose
    private CloudNativeAPIGatewayStrategyCronScalerConfig CronScalerConfig;

    /**
    * Maximum number of nodes
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Scheduled scaling configuration
    */
    @SerializedName("CronConfig")
    @Expose
    private CloudNativeAPIGatewayStrategyCronScalerConfig CronConfig;

    /**
     * Get Gateway instance ID 
     * @return GatewayId Gateway instance ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance ID
     * @param GatewayId Gateway instance ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Policy name. 
     * @return StrategyName Policy name.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name.
     * @param StrategyName Policy name.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Policy description 
     * @return Description Policy description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
     * @param Description Policy description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Metric scaling configuration 
     * @return Config Metric scaling configuration
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Metric scaling configuration
     * @param Config Metric scaling configuration
     */
    public void setConfig(CloudNativeAPIGatewayStrategyAutoScalerConfig Config) {
        this.Config = Config;
    }

    /**
     * Get Scheduled scaling configuration list 
     * @return CronScalerConfig Scheduled scaling configuration list
     * @deprecated
     */
    @Deprecated
    public CloudNativeAPIGatewayStrategyCronScalerConfig getCronScalerConfig() {
        return this.CronScalerConfig;
    }

    /**
     * Set Scheduled scaling configuration list
     * @param CronScalerConfig Scheduled scaling configuration list
     * @deprecated
     */
    @Deprecated
    public void setCronScalerConfig(CloudNativeAPIGatewayStrategyCronScalerConfig CronScalerConfig) {
        this.CronScalerConfig = CronScalerConfig;
    }

    /**
     * Get Maximum number of nodes 
     * @return MaxReplicas Maximum number of nodes
     * @deprecated
     */
    @Deprecated
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set Maximum number of nodes
     * @param MaxReplicas Maximum number of nodes
     * @deprecated
     */
    @Deprecated
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Scheduled scaling configuration 
     * @return CronConfig Scheduled scaling configuration
     */
    public CloudNativeAPIGatewayStrategyCronScalerConfig getCronConfig() {
        return this.CronConfig;
    }

    /**
     * Set Scheduled scaling configuration
     * @param CronConfig Scheduled scaling configuration
     */
    public void setCronConfig(CloudNativeAPIGatewayStrategyCronScalerConfig CronConfig) {
        this.CronConfig = CronConfig;
    }

    public CreateAutoScalerResourceStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoScalerResourceStrategyRequest(CreateAutoScalerResourceStrategyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Config != null) {
            this.Config = new CloudNativeAPIGatewayStrategyAutoScalerConfig(source.Config);
        }
        if (source.CronScalerConfig != null) {
            this.CronScalerConfig = new CloudNativeAPIGatewayStrategyCronScalerConfig(source.CronScalerConfig);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.CronConfig != null) {
            this.CronConfig = new CloudNativeAPIGatewayStrategyCronScalerConfig(source.CronConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "CronScalerConfig.", this.CronScalerConfig);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamObj(map, prefix + "CronConfig.", this.CronConfig);

    }
}

