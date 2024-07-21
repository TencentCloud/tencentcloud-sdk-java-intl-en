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

public class ModifyProxyRwSplitRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

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
    private String ConsistencyTimeOut;

    /**
    * Assignment mode of read/write weights. Valid values: `system` (auto-assigned), `custom`
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Read-Only weight of an instance
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`.
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Whether to automatically add read-only instances. Valid values: `true`, `false`
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * Whether to enable read/write separation
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * Read/Write type. Valid values:
`READWRITE`, `READONLY`.
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
    * Connection mode. Valid values:
`nearby`, `balance`.
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * Whether to enable the connection pool. Valid values: 
`yes`, `no`.
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * Connection pool type. Valid values:
`ConnectionPoolType`, `SessionConnectionPool`.
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Connection persistence timeout
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database proxy group ID 
     * @return ProxyGroupId Database proxy group ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database proxy group ID
     * @param ProxyGroupId Database proxy group ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

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
    public String getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set Consistency timeout period
     * @param ConsistencyTimeOut Consistency timeout period
     */
    public void setConsistencyTimeOut(String ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
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
     * @return InstanceWeights Read-Only weight of an instance
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set Read-Only weight of an instance
     * @param InstanceWeights Read-Only weight of an instance
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`. 
     * @return FailOver Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`.
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`.
     * @param FailOver Whether to enable failover. If it is enabled, the connection address will route requests to the source instance in case of proxy failure. Valid values: `true`, `false`.
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to automatically add read-only instances. Valid values: `true`, `false` 
     * @return AutoAddRo Whether to automatically add read-only instances. Valid values: `true`, `false`
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add read-only instances. Valid values: `true`, `false`
     * @param AutoAddRo Whether to automatically add read-only instances. Valid values: `true`, `false`
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Whether to enable read/write separation 
     * @return OpenRw Whether to enable read/write separation
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set Whether to enable read/write separation
     * @param OpenRw Whether to enable read/write separation
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get Read/Write type. Valid values:
`READWRITE`, `READONLY`. 
     * @return RwType Read/Write type. Valid values:
`READWRITE`, `READONLY`.
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set Read/Write type. Valid values:
`READWRITE`, `READONLY`.
     * @param RwType Read/Write type. Valid values:
`READWRITE`, `READONLY`.
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
     * Get Connection mode. Valid values:
`nearby`, `balance`. 
     * @return AccessMode Connection mode. Valid values:
`nearby`, `balance`.
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Connection mode. Valid values:
`nearby`, `balance`.
     * @param AccessMode Connection mode. Valid values:
`nearby`, `balance`.
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Whether to enable the connection pool. Valid values: 
`yes`, `no`. 
     * @return OpenConnectionPool Whether to enable the connection pool. Valid values: 
`yes`, `no`.
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set Whether to enable the connection pool. Valid values: 
`yes`, `no`.
     * @param OpenConnectionPool Whether to enable the connection pool. Valid values: 
`yes`, `no`.
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get Connection pool type. Valid values:
`ConnectionPoolType`, `SessionConnectionPool`. 
     * @return ConnectionPoolType Connection pool type. Valid values:
`ConnectionPoolType`, `SessionConnectionPool`.
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type. Valid values:
`ConnectionPoolType`, `SessionConnectionPool`.
     * @param ConnectionPoolType Connection pool type. Valid values:
`ConnectionPoolType`, `SessionConnectionPool`.
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Connection persistence timeout 
     * @return ConnectionPoolTimeOut Connection persistence timeout
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set Connection persistence timeout
     * @param ConnectionPoolTimeOut Connection persistence timeout
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    public ModifyProxyRwSplitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProxyRwSplitRequest(ModifyProxyRwSplitRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new String(source.ConsistencyTimeOut);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
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
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);

    }
}

