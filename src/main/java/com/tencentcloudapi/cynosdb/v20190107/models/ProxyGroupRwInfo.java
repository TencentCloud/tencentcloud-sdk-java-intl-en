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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupRwInfo extends AbstractModel {

    /**
    * Consistency type. Valid values: `eventual` (eventual consistency), `session` (session consistency), `global` (global consistency).
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * Consistency timeout period
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * Weight mode. Valid values: `system` (auto-assigned), `custom`.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to enable failover
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Whether to automatically add read-only instance. Valid value: `yes`, `no`.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * Instance weight array
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * Whether to enable read-write node. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * Read/write attribute. Valid values: `READWRITE`, `READONLY`.
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * Transaction split
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * Connection mode. Valid values: `balance`, `nearby`.
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
     * Get Consistency type. Valid values: `eventual` (eventual consistency), `session` (session consistency), `global` (global consistency). 
     * @return ConsistencyType Consistency type. Valid values: `eventual` (eventual consistency), `session` (session consistency), `global` (global consistency).
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set Consistency type. Valid values: `eventual` (eventual consistency), `session` (session consistency), `global` (global consistency).
     * @param ConsistencyType Consistency type. Valid values: `eventual` (eventual consistency), `session` (session consistency), `global` (global consistency).
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get Consistency timeout period 
     * @return ConsistencyTimeOut Consistency timeout period
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set Consistency timeout period
     * @param ConsistencyTimeOut Consistency timeout period
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get Weight mode. Valid values: `system` (auto-assigned), `custom`. 
     * @return WeightMode Weight mode. Valid values: `system` (auto-assigned), `custom`.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Weight mode. Valid values: `system` (auto-assigned), `custom`.
     * @param WeightMode Weight mode. Valid values: `system` (auto-assigned), `custom`.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to enable failover 
     * @return FailOver Whether to enable failover
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover
     * @param FailOver Whether to enable failover
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to automatically add read-only instance. Valid value: `yes`, `no`. 
     * @return AutoAddRo Whether to automatically add read-only instance. Valid value: `yes`, `no`.
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add read-only instance. Valid value: `yes`, `no`.
     * @param AutoAddRo Whether to automatically add read-only instance. Valid value: `yes`, `no`.
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Instance weight array 
     * @return InstanceWeights Instance weight array
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set Instance weight array
     * @param InstanceWeights Instance weight array
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get Whether to enable read-write node. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OpenRw Whether to enable read-write node. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set Whether to enable read-write node. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OpenRw Whether to enable read-write node. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get Read/write attribute. Valid values: `READWRITE`, `READONLY`. 
     * @return RwType Read/write attribute. Valid values: `READWRITE`, `READONLY`.
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set Read/write attribute. Valid values: `READWRITE`, `READONLY`.
     * @param RwType Read/write attribute. Valid values: `READWRITE`, `READONLY`.
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get Transaction split 
     * @return TransSplit Transaction split
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set Transaction split
     * @param TransSplit Transaction split
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get Connection mode. Valid values: `balance`, `nearby`. 
     * @return AccessMode Connection mode. Valid values: `balance`, `nearby`.
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Connection mode. Valid values: `balance`, `nearby`.
     * @param AccessMode Connection mode. Valid values: `balance`, `nearby`.
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    public ProxyGroupRwInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupRwInfo(ProxyGroupRwInfo source) {
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new Long(source.ConsistencyTimeOut);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
        }
        if (source.OpenRw != null) {
            this.OpenRw = new String(source.OpenRw);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);

    }
}

