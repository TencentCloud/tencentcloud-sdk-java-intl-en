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

public class RWInfos extends AbstractModel{

    /**
    * Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("InstCount")
    @Expose
    private Long InstCount;

    /**
    * Assignment mode of read/write weights
Valid values: `system` (auto-assigned), `custom`
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to remove delayed read-only instances from the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * The minimum number of read-only instances allowed by the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * Delay threshold
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Whether to enable failover
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * Whether to automatically add newly created read-only instances to the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * Information of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("RWInstInfo")
    @Expose
    private RWInstanceInfo [] RWInstInfo;

    /**
     * Get Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return InstCount Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getInstCount() {
        return this.InstCount;
    }

    /**
     * Set Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param InstCount Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setInstCount(Long InstCount) {
        this.InstCount = InstCount;
    }

    /**
     * Get Assignment mode of read/write weights
Valid values: `system` (auto-assigned), `custom`
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return WeightMode Assignment mode of read/write weights
Valid values: `system` (auto-assigned), `custom`
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Assignment mode of read/write weights
Valid values: `system` (auto-assigned), `custom`
Note: this field may return `null`, indicating that no valid value can be found.
     * @param WeightMode Assignment mode of read/write weights
Valid values: `system` (auto-assigned), `custom`
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to remove delayed read-only instances from the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return IsKickOut Whether to remove delayed read-only instances from the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set Whether to remove delayed read-only instances from the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param IsKickOut Whether to remove delayed read-only instances from the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get The minimum number of read-only instances allowed by the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return MinCount The minimum number of read-only instances allowed by the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set The minimum number of read-only instances allowed by the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param MinCount The minimum number of read-only instances allowed by the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get Delay threshold
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return MaxDelay Delay threshold
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set Delay threshold
Note: this field may return `null`, indicating that no valid value can be found.
     * @param MaxDelay Delay threshold
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Whether to enable failover
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return FailOver Whether to enable failover
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover
Note: this field may return `null`, indicating that no valid value can be found.
     * @param FailOver Whether to enable failover
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to automatically add newly created read-only instances to the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return AutoAddRo Whether to automatically add newly created read-only instances to the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add newly created read-only instances to the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param AutoAddRo Whether to automatically add newly created read-only instances to the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Information of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return RWInstInfo Information of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public RWInstanceInfo [] getRWInstInfo() {
        return this.RWInstInfo;
    }

    /**
     * Set Information of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param RWInstInfo Information of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setRWInstInfo(RWInstanceInfo [] RWInstInfo) {
        this.RWInstInfo = RWInstInfo;
    }

    public RWInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RWInfos(RWInfos source) {
        if (source.InstCount != null) {
            this.InstCount = new Long(source.InstCount);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.IsKickOut != null) {
            this.IsKickOut = new Boolean(source.IsKickOut);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.RWInstInfo != null) {
            this.RWInstInfo = new RWInstanceInfo[source.RWInstInfo.length];
            for (int i = 0; i < source.RWInstInfo.length; i++) {
                this.RWInstInfo[i] = new RWInstanceInfo(source.RWInstInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstCount", this.InstCount);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamArrayObj(map, prefix + "RWInstInfo.", this.RWInstInfo);

    }
}

