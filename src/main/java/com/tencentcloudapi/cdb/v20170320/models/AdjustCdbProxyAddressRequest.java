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

public class AdjustCdbProxyAddressRequest extends AbstractModel{

    /**
    * Proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`.
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * Least read-only instances. Minimum value:  `0`
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * The delay threshold. Minimum value:  `0`
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Whether to enable failover. Valid values: `true`, `false`.
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * Whether it is read-only. Valid values: `true`, `false`.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * Address ID of the proxy group
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * Whether to enable transaction splitting. Valid values: `true`, `false`.
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * Whether to enable the connection pool
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * Assignment of read/write weights If `system` is passed in for `WeightMode`, only the default weight assigned by the system will take effect.
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
     * Get Proxy group ID 
     * @return ProxyGroupId Proxy group ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID
     * @param ProxyGroupId Proxy group ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. 
     * @return WeightMode Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
     * @param WeightMode Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`. 
     * @return IsKickOut Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`.
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`.
     * @param IsKickOut Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`.
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get Least read-only instances. Minimum value:  `0` 
     * @return MinCount Least read-only instances. Minimum value:  `0`
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set Least read-only instances. Minimum value:  `0`
     * @param MinCount Least read-only instances. Minimum value:  `0`
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get The delay threshold. Minimum value:  `0` 
     * @return MaxDelay The delay threshold. Minimum value:  `0`
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set The delay threshold. Minimum value:  `0`
     * @param MaxDelay The delay threshold. Minimum value:  `0`
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Whether to enable failover. Valid values: `true`, `false`. 
     * @return FailOver Whether to enable failover. Valid values: `true`, `false`.
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover. Valid values: `true`, `false`.
     * @param FailOver Whether to enable failover. Valid values: `true`, `false`.
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. 
     * @return AutoAddRo Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
     * @param AutoAddRo Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Whether it is read-only. Valid values: `true`, `false`. 
     * @return ReadOnly Whether it is read-only. Valid values: `true`, `false`.
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Whether it is read-only. Valid values: `true`, `false`.
     * @param ReadOnly Whether it is read-only. Valid values: `true`, `false`.
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Address ID of the proxy group 
     * @return ProxyAddressId Address ID of the proxy group
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set Address ID of the proxy group
     * @param ProxyAddressId Address ID of the proxy group
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get Whether to enable transaction splitting. Valid values: `true`, `false`. 
     * @return TransSplit Whether to enable transaction splitting. Valid values: `true`, `false`.
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set Whether to enable transaction splitting. Valid values: `true`, `false`.
     * @param TransSplit Whether to enable transaction splitting. Valid values: `true`, `false`.
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get Whether to enable the connection pool 
     * @return ConnectionPool Whether to enable the connection pool
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set Whether to enable the connection pool
     * @param ConnectionPool Whether to enable the connection pool
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get Assignment of read/write weights If `system` is passed in for `WeightMode`, only the default weight assigned by the system will take effect. 
     * @return ProxyAllocation Assignment of read/write weights If `system` is passed in for `WeightMode`, only the default weight assigned by the system will take effect.
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set Assignment of read/write weights If `system` is passed in for `WeightMode`, only the default weight assigned by the system will take effect.
     * @param ProxyAllocation Assignment of read/write weights If `system` is passed in for `WeightMode`, only the default weight assigned by the system will take effect.
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    public AdjustCdbProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustCdbProxyAddressRequest(AdjustCdbProxyAddressRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
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
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyAllocation[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyAllocation(source.ProxyAllocation[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);

    }
}

