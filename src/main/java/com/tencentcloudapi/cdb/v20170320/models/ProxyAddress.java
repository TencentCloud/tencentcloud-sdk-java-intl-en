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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyAddress extends AbstractModel {

    /**
    * Address ID of the proxy group
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * VPC ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC subnet ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * IP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * Least read-only instances. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * The delay threshold. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * Whether it is read-only. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * Whether to enable transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * Whether to enable failover Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * Whether to enable the connection pool Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Read weight assignment for an instance Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

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
     * Get VPC ID 
     * @return UniqVpcId VPC ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID
     * @param UniqVpcId VPC ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC subnet ID 
     * @return UniqSubnetId VPC subnet ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set VPC subnet ID
     * @param UniqSubnetId VPC subnet ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get IP address 
     * @return Vip IP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP address
     * @param Vip IP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port 
     * @return VPort Port
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Port
     * @param VPort Port
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WeightMode Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param WeightMode Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsKickOut Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsKickOut Whether to remove delayed read-only instances from the proxy group Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get Least read-only instances. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinCount Least read-only instances. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set Least read-only instances. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinCount Least read-only instances. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get The delay threshold. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxDelay The delay threshold. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set The delay threshold. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxDelay The delay threshold. Minimum value:  `0`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoAddRo Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoAddRo Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Whether it is read-only. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadOnly Whether it is read-only. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Whether it is read-only. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadOnly Whether it is read-only. Valid values: `true`, `false`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Whether to enable transaction splitting Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransSplit Whether to enable transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set Whether to enable transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransSplit Whether to enable transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get Whether to enable failover Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailOver Whether to enable failover Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailOver Whether to enable failover Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to enable the connection pool Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConnectionPool Whether to enable the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set Whether to enable the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConnectionPool Whether to enable the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Desc Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Desc Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Read weight assignment for an instance Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyAllocation Read weight assignment for an instance Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set Read weight assignment for an instance Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyAllocation Read weight assignment for an instance Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    public ProxyAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyAddress(ProxyAddress source) {
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
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
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
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
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);

    }
}

