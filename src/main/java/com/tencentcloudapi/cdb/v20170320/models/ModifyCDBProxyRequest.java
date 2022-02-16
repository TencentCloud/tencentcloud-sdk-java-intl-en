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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCDBProxyRequest extends AbstractModel{

    /**
    * Unique ID of the database proxy group
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`
    */
    @SerializedName("IsKickout")
    @Expose
    private Boolean IsKickout;

    /**
    * The minimum number of read-only instances allowed by the proxy group
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * Delay threshold. If `IsKickOut` is set to `true`, this parameter is required.
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Assignment mode of read/write weights. Valid values: `system` (auto-assigned), `custom`
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Read-Only weight of an instance
    */
    @SerializedName("RoWeightValues")
    @Expose
    private RoWeight RoWeightValues;

    /**
    * Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * Whether to automatically add newly created read-only instances to the proxy group. Valid values: `true`, `false`
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
     * Get Unique ID of the database proxy group 
     * @return ProxyGroupId Unique ID of the database proxy group
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Unique ID of the database proxy group
     * @param ProxyGroupId Unique ID of the database proxy group
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false` 
     * @return IsKickout Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`
     */
    public Boolean getIsKickout() {
        return this.IsKickout;
    }

    /**
     * Set Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`
     * @param IsKickout Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`
     */
    public void setIsKickout(Boolean IsKickout) {
        this.IsKickout = IsKickout;
    }

    /**
     * Get The minimum number of read-only instances allowed by the proxy group 
     * @return MinCount The minimum number of read-only instances allowed by the proxy group
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set The minimum number of read-only instances allowed by the proxy group
     * @param MinCount The minimum number of read-only instances allowed by the proxy group
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get Delay threshold. If `IsKickOut` is set to `true`, this parameter is required. 
     * @return MaxDelay Delay threshold. If `IsKickOut` is set to `true`, this parameter is required.
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set Delay threshold. If `IsKickOut` is set to `true`, this parameter is required.
     * @param MaxDelay Delay threshold. If `IsKickOut` is set to `true`, this parameter is required.
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Assignment mode of read/write weights. Valid values: `system` (auto-assigned), `custom` 
     * @return WeightMode Assignment mode of read/write weights. Valid values: `system` (auto-assigned), `custom`
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Assignment mode of read/write weights. Valid values: `system` (auto-assigned), `custom`
     * @param WeightMode Assignment mode of read/write weights. Valid values: `system` (auto-assigned), `custom`
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Read-Only weight of an instance 
     * @return RoWeightValues Read-Only weight of an instance
     */
    public RoWeight getRoWeightValues() {
        return this.RoWeightValues;
    }

    /**
     * Set Read-Only weight of an instance
     * @param RoWeightValues Read-Only weight of an instance
     */
    public void setRoWeightValues(RoWeight RoWeightValues) {
        this.RoWeightValues = RoWeightValues;
    }

    /**
     * Get Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false` 
     * @return FailOver Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`
     * @param FailOver Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to automatically add newly created read-only instances to the proxy group. Valid values: `true`, `false` 
     * @return AutoAddRo Whether to automatically add newly created read-only instances to the proxy group. Valid values: `true`, `false`
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add newly created read-only instances to the proxy group. Valid values: `true`, `false`
     * @param AutoAddRo Whether to automatically add newly created read-only instances to the proxy group. Valid values: `true`, `false`
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    public ModifyCDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCDBProxyRequest(ModifyCDBProxyRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.IsKickout != null) {
            this.IsKickout = new Boolean(source.IsKickout);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.RoWeightValues != null) {
            this.RoWeightValues = new RoWeight(source.RoWeightValues);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "IsKickout", this.IsKickout);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamObj(map, prefix + "RoWeightValues.", this.RoWeightValues);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);

    }
}

