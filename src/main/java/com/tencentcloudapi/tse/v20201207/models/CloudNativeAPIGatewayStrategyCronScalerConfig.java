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

public class CloudNativeAPIGatewayStrategyCronScalerConfig extends AbstractModel {

    /**
    * Enable scheduled scaling
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Scheduled scaling configuration parameter list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private CloudNativeAPIGatewayStrategyCronScalerConfigParam [] Params;

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
    * Auto scaling policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get Enable scheduled scaling
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enabled Enable scheduled scaling
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Enable scheduled scaling
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enabled Enable scheduled scaling
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Scheduled scaling configuration parameter list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Params Scheduled scaling configuration parameter list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CloudNativeAPIGatewayStrategyCronScalerConfigParam [] getParams() {
        return this.Params;
    }

    /**
     * Set Scheduled scaling configuration parameter list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Params Scheduled scaling configuration parameter list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParams(CloudNativeAPIGatewayStrategyCronScalerConfigParam [] Params) {
        this.Params = Params;
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
     * Get Auto scaling policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Auto scaling policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Auto scaling policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Auto scaling policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public CloudNativeAPIGatewayStrategyCronScalerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyCronScalerConfig(CloudNativeAPIGatewayStrategyCronScalerConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Params != null) {
            this.Params = new CloudNativeAPIGatewayStrategyCronScalerConfigParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new CloudNativeAPIGatewayStrategyCronScalerConfigParam(source.Params[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

