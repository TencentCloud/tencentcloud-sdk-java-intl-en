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
    * Weight allocation mode.
System Auto-Assignment: "system", Custom: "custom"
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to enable delay removal. Parameter value: "true" | "false"
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * Minimum retention quantity, minimum value: 0.
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * Delay removal threshold, minimum value: 0
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Automatically add RO. Value: "true" | "false"
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * Whether it is read-only. Value: "true" | "false".
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * Whether transaction splitting is enabled
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * Whether fault migration is enabled
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * Whether to enable connection pool
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Read weight distribution of an instance
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
    * Access mode
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * Whether automatic CLB is enabled
    */
    @SerializedName("AutoLoadBalance")
    @Expose
    private Boolean AutoLoadBalance;

    /**
    * Whether to treat libra as a read-only node
    */
    @SerializedName("ApNodeAsRoNode")
    @Expose
    private Boolean ApNodeAsRoNode;

    /**
    * libra node fault, whether to forward to other nodes
    */
    @SerializedName("ApQueryToOtherNode")
    @Expose
    private Boolean ApQueryToOtherNode;

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
     * Get Weight allocation mode.
System Auto-Assignment: "system", Custom: "custom" 
     * @return WeightMode Weight allocation mode.
System Auto-Assignment: "system", Custom: "custom"
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Weight allocation mode.
System Auto-Assignment: "system", Custom: "custom"
     * @param WeightMode Weight allocation mode.
System Auto-Assignment: "system", Custom: "custom"
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to enable delay removal. Parameter value: "true" | "false" 
     * @return IsKickOut Whether to enable delay removal. Parameter value: "true" | "false"
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set Whether to enable delay removal. Parameter value: "true" | "false"
     * @param IsKickOut Whether to enable delay removal. Parameter value: "true" | "false"
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get Minimum retention quantity, minimum value: 0. 
     * @return MinCount Minimum retention quantity, minimum value: 0.
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set Minimum retention quantity, minimum value: 0.
     * @param MinCount Minimum retention quantity, minimum value: 0.
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get Delay removal threshold, minimum value: 0 
     * @return MaxDelay Delay removal threshold, minimum value: 0
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set Delay removal threshold, minimum value: 0
     * @param MaxDelay Delay removal threshold, minimum value: 0
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Automatically add RO. Value: "true" | "false" 
     * @return AutoAddRo Automatically add RO. Value: "true" | "false"
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Automatically add RO. Value: "true" | "false"
     * @param AutoAddRo Automatically add RO. Value: "true" | "false"
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Whether it is read-only. Value: "true" | "false". 
     * @return ReadOnly Whether it is read-only. Value: "true" | "false".
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Whether it is read-only. Value: "true" | "false".
     * @param ReadOnly Whether it is read-only. Value: "true" | "false".
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Whether transaction splitting is enabled 
     * @return TransSplit Whether transaction splitting is enabled
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set Whether transaction splitting is enabled
     * @param TransSplit Whether transaction splitting is enabled
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get Whether fault migration is enabled 
     * @return FailOver Whether fault migration is enabled
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether fault migration is enabled
     * @param FailOver Whether fault migration is enabled
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to enable connection pool 
     * @return ConnectionPool Whether to enable connection pool
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set Whether to enable connection pool
     * @param ConnectionPool Whether to enable connection pool
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Read weight distribution of an instance 
     * @return ProxyAllocation Read weight distribution of an instance
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set Read weight distribution of an instance
     * @param ProxyAllocation Read weight distribution of an instance
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get Access mode 
     * @return AccessMode Access mode
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Access mode
     * @param AccessMode Access mode
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Whether automatic CLB is enabled 
     * @return AutoLoadBalance Whether automatic CLB is enabled
     */
    public Boolean getAutoLoadBalance() {
        return this.AutoLoadBalance;
    }

    /**
     * Set Whether automatic CLB is enabled
     * @param AutoLoadBalance Whether automatic CLB is enabled
     */
    public void setAutoLoadBalance(Boolean AutoLoadBalance) {
        this.AutoLoadBalance = AutoLoadBalance;
    }

    /**
     * Get Whether to treat libra as a read-only node 
     * @return ApNodeAsRoNode Whether to treat libra as a read-only node
     */
    public Boolean getApNodeAsRoNode() {
        return this.ApNodeAsRoNode;
    }

    /**
     * Set Whether to treat libra as a read-only node
     * @param ApNodeAsRoNode Whether to treat libra as a read-only node
     */
    public void setApNodeAsRoNode(Boolean ApNodeAsRoNode) {
        this.ApNodeAsRoNode = ApNodeAsRoNode;
    }

    /**
     * Get libra node fault, whether to forward to other nodes 
     * @return ApQueryToOtherNode libra node fault, whether to forward to other nodes
     */
    public Boolean getApQueryToOtherNode() {
        return this.ApQueryToOtherNode;
    }

    /**
     * Set libra node fault, whether to forward to other nodes
     * @param ApQueryToOtherNode libra node fault, whether to forward to other nodes
     */
    public void setApQueryToOtherNode(Boolean ApQueryToOtherNode) {
        this.ApQueryToOtherNode = ApQueryToOtherNode;
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
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.AutoLoadBalance != null) {
            this.AutoLoadBalance = new Boolean(source.AutoLoadBalance);
        }
        if (source.ApNodeAsRoNode != null) {
            this.ApNodeAsRoNode = new Boolean(source.ApNodeAsRoNode);
        }
        if (source.ApQueryToOtherNode != null) {
            this.ApQueryToOtherNode = new Boolean(source.ApQueryToOtherNode);
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
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "AutoLoadBalance", this.AutoLoadBalance);
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);

    }
}

