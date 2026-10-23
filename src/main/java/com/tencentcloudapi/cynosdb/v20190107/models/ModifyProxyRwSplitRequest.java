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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxyRwSplitRequest extends AbstractModel {

    /**
    * <p>Cluster ID, for example, cynosdbmysql-asd123</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Database Proxy Group ID, for example, cynosdbmysql-proxy-qwe123</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>Consistency type; "eventual"-final consistency, "session"-session consistency, "global"-global consistency</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>Consistency timeout.<br>Value range: 0–1000000 (µs). Setting it to 0 means that if a read-only instance has a delay, causing the consistency policy to fail, the request will wait indefinitely.</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private String ConsistencyTimeOut;

    /**
    * <p>Read-write weight allocation mode; system auto-assignment: "system", custom: "custom"</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>Instance Read-Only Weight.</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>Whether failover is enabled. After a fault occurs on the proxy, the connection address will be routed to the primary instance. Value: "yes", "no"</p>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>Whether to automatically add read-only instance. Parameter Value: "yes", "no"</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>Whether to enable read-write separation.<br>This parameter is deprecated. Set the read-write attribute through RwType.</p>
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * <p>Read-write type:<br>READWRITE,READONLY</p>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>Transaction split.<br>Split reads and writes in a transaction to different instances for execution.</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>Connection mode: <br>nearby, balance</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>Whether to enable connection pool: <br>yes,no</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>Connection pool type: <br>SessionConnectionPool</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>Connection pool time.<br>Optional range: 0–300 (seconds)</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>Whether to treat the libra node as an ordinary RO node</p>
    */
    @SerializedName("ApNodeAsRoNode")
    @Expose
    private Boolean ApNodeAsRoNode;

    /**
    * <p>Whether to forward to other nodes when a libra node fault occurs</p>
    */
    @SerializedName("ApQueryToOtherNode")
    @Expose
    private Boolean ApQueryToOtherNode;

    /**
    * <p>Load balancing mode</p><p>Enumeration values:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
    * <p>Whether to enable full transactional split. In a transaction, split the reads before and after the write to different instances for execution.</p>
    */
    @SerializedName("TransAllSplit")
    @Expose
    private Boolean TransAllSplit;

    /**
     * Get <p>Cluster ID, for example, cynosdbmysql-asd123</p> 
     * @return ClusterId <p>Cluster ID, for example, cynosdbmysql-asd123</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID, for example, cynosdbmysql-asd123</p>
     * @param ClusterId <p>Cluster ID, for example, cynosdbmysql-asd123</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Database Proxy Group ID, for example, cynosdbmysql-proxy-qwe123</p> 
     * @return ProxyGroupId <p>Database Proxy Group ID, for example, cynosdbmysql-proxy-qwe123</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Database Proxy Group ID, for example, cynosdbmysql-proxy-qwe123</p>
     * @param ProxyGroupId <p>Database Proxy Group ID, for example, cynosdbmysql-proxy-qwe123</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>Consistency type; "eventual"-final consistency, "session"-session consistency, "global"-global consistency</p> 
     * @return ConsistencyType <p>Consistency type; "eventual"-final consistency, "session"-session consistency, "global"-global consistency</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>Consistency type; "eventual"-final consistency, "session"-session consistency, "global"-global consistency</p>
     * @param ConsistencyType <p>Consistency type; "eventual"-final consistency, "session"-session consistency, "global"-global consistency</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get <p>Consistency timeout.<br>Value range: 0–1000000 (µs). Setting it to 0 means that if a read-only instance has a delay, causing the consistency policy to fail, the request will wait indefinitely.</p> 
     * @return ConsistencyTimeOut <p>Consistency timeout.<br>Value range: 0–1000000 (µs). Setting it to 0 means that if a read-only instance has a delay, causing the consistency policy to fail, the request will wait indefinitely.</p>
     */
    public String getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set <p>Consistency timeout.<br>Value range: 0–1000000 (µs). Setting it to 0 means that if a read-only instance has a delay, causing the consistency policy to fail, the request will wait indefinitely.</p>
     * @param ConsistencyTimeOut <p>Consistency timeout.<br>Value range: 0–1000000 (µs). Setting it to 0 means that if a read-only instance has a delay, causing the consistency policy to fail, the request will wait indefinitely.</p>
     */
    public void setConsistencyTimeOut(String ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get <p>Read-write weight allocation mode; system auto-assignment: "system", custom: "custom"</p> 
     * @return WeightMode <p>Read-write weight allocation mode; system auto-assignment: "system", custom: "custom"</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>Read-write weight allocation mode; system auto-assignment: "system", custom: "custom"</p>
     * @param WeightMode <p>Read-write weight allocation mode; system auto-assignment: "system", custom: "custom"</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>Instance Read-Only Weight.</p> 
     * @return InstanceWeights <p>Instance Read-Only Weight.</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>Instance Read-Only Weight.</p>
     * @param InstanceWeights <p>Instance Read-Only Weight.</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>Whether failover is enabled. After a fault occurs on the proxy, the connection address will be routed to the primary instance. Value: "yes", "no"</p> 
     * @return FailOver <p>Whether failover is enabled. After a fault occurs on the proxy, the connection address will be routed to the primary instance. Value: "yes", "no"</p>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>Whether failover is enabled. After a fault occurs on the proxy, the connection address will be routed to the primary instance. Value: "yes", "no"</p>
     * @param FailOver <p>Whether failover is enabled. After a fault occurs on the proxy, the connection address will be routed to the primary instance. Value: "yes", "no"</p>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>Whether to automatically add read-only instance. Parameter Value: "yes", "no"</p> 
     * @return AutoAddRo <p>Whether to automatically add read-only instance. Parameter Value: "yes", "no"</p>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>Whether to automatically add read-only instance. Parameter Value: "yes", "no"</p>
     * @param AutoAddRo <p>Whether to automatically add read-only instance. Parameter Value: "yes", "no"</p>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>Whether to enable read-write separation.<br>This parameter is deprecated. Set the read-write attribute through RwType.</p> 
     * @return OpenRw <p>Whether to enable read-write separation.<br>This parameter is deprecated. Set the read-write attribute through RwType.</p>
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set <p>Whether to enable read-write separation.<br>This parameter is deprecated. Set the read-write attribute through RwType.</p>
     * @param OpenRw <p>Whether to enable read-write separation.<br>This parameter is deprecated. Set the read-write attribute through RwType.</p>
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get <p>Read-write type:<br>READWRITE,READONLY</p> 
     * @return RwType <p>Read-write type:<br>READWRITE,READONLY</p>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>Read-write type:<br>READWRITE,READONLY</p>
     * @param RwType <p>Read-write type:<br>READWRITE,READONLY</p>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>Transaction split.<br>Split reads and writes in a transaction to different instances for execution.</p> 
     * @return TransSplit <p>Transaction split.<br>Split reads and writes in a transaction to different instances for execution.</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>Transaction split.<br>Split reads and writes in a transaction to different instances for execution.</p>
     * @param TransSplit <p>Transaction split.<br>Split reads and writes in a transaction to different instances for execution.</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>Connection mode: <br>nearby, balance</p> 
     * @return AccessMode <p>Connection mode: <br>nearby, balance</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Connection mode: <br>nearby, balance</p>
     * @param AccessMode <p>Connection mode: <br>nearby, balance</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>Whether to enable connection pool: <br>yes,no</p> 
     * @return OpenConnectionPool <p>Whether to enable connection pool: <br>yes,no</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>Whether to enable connection pool: <br>yes,no</p>
     * @param OpenConnectionPool <p>Whether to enable connection pool: <br>yes,no</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>Connection pool type: <br>SessionConnectionPool</p> 
     * @return ConnectionPoolType <p>Connection pool type: <br>SessionConnectionPool</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>Connection pool type: <br>SessionConnectionPool</p>
     * @param ConnectionPoolType <p>Connection pool type: <br>SessionConnectionPool</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>Connection pool time.<br>Optional range: 0–300 (seconds)</p> 
     * @return ConnectionPoolTimeOut <p>Connection pool time.<br>Optional range: 0–300 (seconds)</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>Connection pool time.<br>Optional range: 0–300 (seconds)</p>
     * @param ConnectionPoolTimeOut <p>Connection pool time.<br>Optional range: 0–300 (seconds)</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>Whether to treat the libra node as an ordinary RO node</p> 
     * @return ApNodeAsRoNode <p>Whether to treat the libra node as an ordinary RO node</p>
     */
    public Boolean getApNodeAsRoNode() {
        return this.ApNodeAsRoNode;
    }

    /**
     * Set <p>Whether to treat the libra node as an ordinary RO node</p>
     * @param ApNodeAsRoNode <p>Whether to treat the libra node as an ordinary RO node</p>
     */
    public void setApNodeAsRoNode(Boolean ApNodeAsRoNode) {
        this.ApNodeAsRoNode = ApNodeAsRoNode;
    }

    /**
     * Get <p>Whether to forward to other nodes when a libra node fault occurs</p> 
     * @return ApQueryToOtherNode <p>Whether to forward to other nodes when a libra node fault occurs</p>
     */
    public Boolean getApQueryToOtherNode() {
        return this.ApQueryToOtherNode;
    }

    /**
     * Set <p>Whether to forward to other nodes when a libra node fault occurs</p>
     * @param ApQueryToOtherNode <p>Whether to forward to other nodes when a libra node fault occurs</p>
     */
    public void setApQueryToOtherNode(Boolean ApQueryToOtherNode) {
        this.ApQueryToOtherNode = ApQueryToOtherNode;
    }

    /**
     * Get <p>Load balancing mode</p><p>Enumeration values:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul> 
     * @return LoadBalanceMode <p>Load balancing mode</p><p>Enumeration values:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     */
    public String getLoadBalanceMode() {
        return this.LoadBalanceMode;
    }

    /**
     * Set <p>Load balancing mode</p><p>Enumeration values:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     * @param LoadBalanceMode <p>Load balancing mode</p><p>Enumeration values:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     */
    public void setLoadBalanceMode(String LoadBalanceMode) {
        this.LoadBalanceMode = LoadBalanceMode;
    }

    /**
     * Get <p>Whether to enable full transactional split. In a transaction, split the reads before and after the write to different instances for execution.</p> 
     * @return TransAllSplit <p>Whether to enable full transactional split. In a transaction, split the reads before and after the write to different instances for execution.</p>
     */
    public Boolean getTransAllSplit() {
        return this.TransAllSplit;
    }

    /**
     * Set <p>Whether to enable full transactional split. In a transaction, split the reads before and after the write to different instances for execution.</p>
     * @param TransAllSplit <p>Whether to enable full transactional split. In a transaction, split the reads before and after the write to different instances for execution.</p>
     */
    public void setTransAllSplit(Boolean TransAllSplit) {
        this.TransAllSplit = TransAllSplit;
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
        if (source.ApNodeAsRoNode != null) {
            this.ApNodeAsRoNode = new Boolean(source.ApNodeAsRoNode);
        }
        if (source.ApQueryToOtherNode != null) {
            this.ApQueryToOtherNode = new Boolean(source.ApQueryToOtherNode);
        }
        if (source.LoadBalanceMode != null) {
            this.LoadBalanceMode = new String(source.LoadBalanceMode);
        }
        if (source.TransAllSplit != null) {
            this.TransAllSplit = new Boolean(source.TransAllSplit);
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
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);
        this.setParamSimple(map, prefix + "TransAllSplit", this.TransAllSplit);

    }
}

