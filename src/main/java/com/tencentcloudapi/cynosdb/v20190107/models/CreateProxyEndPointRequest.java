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

public class CreateProxyEndPointRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>VPC ID.</p>
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * <p>VPC subnet ID.</p>
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * <p>Connection pool Type: SessionConnectionPool (session-level connection pool).</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>Whether the connection pool is enabled.<br>yes: enabled.<br>no: disabled.</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>Connection pool threshold: measurement unit (seconds), optional range: 0 - 300 seconds.</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>Bound security group ID array.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>vip information that should be bound must correspond to UniqueVpcId.</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Weight mode:<br>system: system-assigned.<br>custom: custom.</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>Automatically add read-only instance.<br>yes: means automatically add read-only instance.<br>no: means not automatic add read-only instance.</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>Whether fault migration is enabled.<br>yes: Enable. Once enabled, when a database proxy failure occurs, the connection address will be routed to the primary instance.<br>no: Disabled.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>Consistency type:<br>eventual: Final consistency.<br>global: Global consistency.<br>session: Session consistency.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>Read-write attribute:<br>READWRITE: means read-write separation. When the parameter value is READWRITE, FailOver and ConsistencyType parameters can be set.<br>READONLY: means read-only.</p>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>Consistency timeout. Value ranges from 0 to 1000000 (microseconds). When set to 0, it means the request will wait if the read-only instance fails to satisfy the consistency policy due to latency.</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * <p>Whether to enable transaction split. Once enabled, read and write operations in a transaction are split and executed on different instances.</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>Access mode:<br>nearby: proximity access.<br>balance: balanced allocation.</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>Instance weight.</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>Load balancing mode</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>VPC ID.</p> 
     * @return UniqueVpcId <p>VPC ID.</p>
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set <p>VPC ID.</p>
     * @param UniqueVpcId <p>VPC ID.</p>
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get <p>VPC subnet ID.</p> 
     * @return UniqueSubnetId <p>VPC subnet ID.</p>
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set <p>VPC subnet ID.</p>
     * @param UniqueSubnetId <p>VPC subnet ID.</p>
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get <p>Connection pool Type: SessionConnectionPool (session-level connection pool).</p> 
     * @return ConnectionPoolType <p>Connection pool Type: SessionConnectionPool (session-level connection pool).</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>Connection pool Type: SessionConnectionPool (session-level connection pool).</p>
     * @param ConnectionPoolType <p>Connection pool Type: SessionConnectionPool (session-level connection pool).</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>Whether the connection pool is enabled.<br>yes: enabled.<br>no: disabled.</p> 
     * @return OpenConnectionPool <p>Whether the connection pool is enabled.<br>yes: enabled.<br>no: disabled.</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>Whether the connection pool is enabled.<br>yes: enabled.<br>no: disabled.</p>
     * @param OpenConnectionPool <p>Whether the connection pool is enabled.<br>yes: enabled.<br>no: disabled.</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>Connection pool threshold: measurement unit (seconds), optional range: 0 - 300 seconds.</p> 
     * @return ConnectionPoolTimeOut <p>Connection pool threshold: measurement unit (seconds), optional range: 0 - 300 seconds.</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>Connection pool threshold: measurement unit (seconds), optional range: 0 - 300 seconds.</p>
     * @param ConnectionPoolTimeOut <p>Connection pool threshold: measurement unit (seconds), optional range: 0 - 300 seconds.</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>Bound security group ID array.</p> 
     * @return SecurityGroupIds <p>Bound security group ID array.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Bound security group ID array.</p>
     * @param SecurityGroupIds <p>Bound security group ID array.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>vip information that should be bound must correspond to UniqueVpcId.</p> 
     * @return Vip <p>vip information that should be bound must correspond to UniqueVpcId.</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>vip information that should be bound must correspond to UniqueVpcId.</p>
     * @param Vip <p>vip information that should be bound must correspond to UniqueVpcId.</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Weight mode:<br>system: system-assigned.<br>custom: custom.</p> 
     * @return WeightMode <p>Weight mode:<br>system: system-assigned.<br>custom: custom.</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>Weight mode:<br>system: system-assigned.<br>custom: custom.</p>
     * @param WeightMode <p>Weight mode:<br>system: system-assigned.<br>custom: custom.</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>Automatically add read-only instance.<br>yes: means automatically add read-only instance.<br>no: means not automatic add read-only instance.</p> 
     * @return AutoAddRo <p>Automatically add read-only instance.<br>yes: means automatically add read-only instance.<br>no: means not automatic add read-only instance.</p>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>Automatically add read-only instance.<br>yes: means automatically add read-only instance.<br>no: means not automatic add read-only instance.</p>
     * @param AutoAddRo <p>Automatically add read-only instance.<br>yes: means automatically add read-only instance.<br>no: means not automatic add read-only instance.</p>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>Whether fault migration is enabled.<br>yes: Enable. Once enabled, when a database proxy failure occurs, the connection address will be routed to the primary instance.<br>no: Disabled.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p> 
     * @return FailOver <p>Whether fault migration is enabled.<br>yes: Enable. Once enabled, when a database proxy failure occurs, the connection address will be routed to the primary instance.<br>no: Disabled.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>Whether fault migration is enabled.<br>yes: Enable. Once enabled, when a database proxy failure occurs, the connection address will be routed to the primary instance.<br>no: Disabled.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
     * @param FailOver <p>Whether fault migration is enabled.<br>yes: Enable. Once enabled, when a database proxy failure occurs, the connection address will be routed to the primary instance.<br>no: Disabled.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>Consistency type:<br>eventual: Final consistency.<br>global: Global consistency.<br>session: Session consistency.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p> 
     * @return ConsistencyType <p>Consistency type:<br>eventual: Final consistency.<br>global: Global consistency.<br>session: Session consistency.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>Consistency type:<br>eventual: Final consistency.<br>global: Global consistency.<br>session: Session consistency.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
     * @param ConsistencyType <p>Consistency type:<br>eventual: Final consistency.<br>global: Global consistency.<br>session: Session consistency.<br>Description:<br>This item can be set to only when the RwType parameter value is READWRITE.</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get <p>Read-write attribute:<br>READWRITE: means read-write separation. When the parameter value is READWRITE, FailOver and ConsistencyType parameters can be set.<br>READONLY: means read-only.</p> 
     * @return RwType <p>Read-write attribute:<br>READWRITE: means read-write separation. When the parameter value is READWRITE, FailOver and ConsistencyType parameters can be set.<br>READONLY: means read-only.</p>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>Read-write attribute:<br>READWRITE: means read-write separation. When the parameter value is READWRITE, FailOver and ConsistencyType parameters can be set.<br>READONLY: means read-only.</p>
     * @param RwType <p>Read-write attribute:<br>READWRITE: means read-write separation. When the parameter value is READWRITE, FailOver and ConsistencyType parameters can be set.<br>READONLY: means read-only.</p>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>Consistency timeout. Value ranges from 0 to 1000000 (microseconds). When set to 0, it means the request will wait if the read-only instance fails to satisfy the consistency policy due to latency.</p> 
     * @return ConsistencyTimeOut <p>Consistency timeout. Value ranges from 0 to 1000000 (microseconds). When set to 0, it means the request will wait if the read-only instance fails to satisfy the consistency policy due to latency.</p>
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set <p>Consistency timeout. Value ranges from 0 to 1000000 (microseconds). When set to 0, it means the request will wait if the read-only instance fails to satisfy the consistency policy due to latency.</p>
     * @param ConsistencyTimeOut <p>Consistency timeout. Value ranges from 0 to 1000000 (microseconds). When set to 0, it means the request will wait if the read-only instance fails to satisfy the consistency policy due to latency.</p>
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get <p>Whether to enable transaction split. Once enabled, read and write operations in a transaction are split and executed on different instances.</p> 
     * @return TransSplit <p>Whether to enable transaction split. Once enabled, read and write operations in a transaction are split and executed on different instances.</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>Whether to enable transaction split. Once enabled, read and write operations in a transaction are split and executed on different instances.</p>
     * @param TransSplit <p>Whether to enable transaction split. Once enabled, read and write operations in a transaction are split and executed on different instances.</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>Access mode:<br>nearby: proximity access.<br>balance: balanced allocation.</p> 
     * @return AccessMode <p>Access mode:<br>nearby: proximity access.<br>balance: balanced allocation.</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Access mode:<br>nearby: proximity access.<br>balance: balanced allocation.</p>
     * @param AccessMode <p>Access mode:<br>nearby: proximity access.<br>balance: balanced allocation.</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>Instance weight.</p> 
     * @return InstanceWeights <p>Instance weight.</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>Instance weight.</p>
     * @param InstanceWeights <p>Instance weight.</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>Load balancing mode</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul> 
     * @return LoadBalanceMode <p>Load balancing mode</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     */
    public String getLoadBalanceMode() {
        return this.LoadBalanceMode;
    }

    /**
     * Set <p>Load balancing mode</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     * @param LoadBalanceMode <p>Load balancing mode</p><p>Enumeration value:</p><ul><li>static: Static load</li><li>dynamic: Dynamic load</li></ul>
     */
    public void setLoadBalanceMode(String LoadBalanceMode) {
        this.LoadBalanceMode = LoadBalanceMode;
    }

    public CreateProxyEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyEndPointRequest(CreateProxyEndPointRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new Long(source.ConsistencyTimeOut);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
        }
        if (source.LoadBalanceMode != null) {
            this.LoadBalanceMode = new String(source.LoadBalanceMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);

    }
}

