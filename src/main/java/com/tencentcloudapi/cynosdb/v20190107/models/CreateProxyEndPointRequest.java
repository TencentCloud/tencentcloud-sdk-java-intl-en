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
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * VPC ID. By default, it remains consistent with the VPC ID of the cluster.
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * Subnet ID of the VPC. By default, it remains consistent with the subnet ID of the cluster.
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Type of connection pool: SessionConnectionPool (session-level connection pool).
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Whether to enable the connection pool.
yes: indicates enabled.
no: indicates not enabled.
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * Threshold of the connection pool: unit (seconds). Valid values: 0 - 300 seconds.
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * Array of bound security group IDs.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The vip information to be bound must correspond to the UniqueVpcId.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Weight mode:
system: system-assigned.
custom: custom.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to automatically add a read-only instance.
yes: indicates automatically adding a read-only instance.
no: indicates not to automatically add a read-only instance.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * Whether to enable failover.
yes: indicates enabled. After it is enabled, when the database proxy encounters faults, the connection address will be routed to the primary instance.
no: indicates not enabled.
Description:
Only when the value of the RwType parameter is READWRITE can this option be configured.
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Consistency Type:
eventual: eventual consistency.
global: global consistency.
session: session consistency.
Description:
Only when the RwType parameter value is READWRITE can this option be configured.
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * Read-Write Attribute:
READWRITE: indicates read/write splitting. Only when this parameter value is READWRITE can the FailOver and ConsistencyType parameters be configured.
READONLY: indicates read-only.
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * The consistency timeout period. Value range: 0 - 1000000 (microseconds). When set to 0, if a read-only instance experiences latency causing the consistency policy to be unsatisfied, the request will wait indefinitely.
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * Whether to enable transaction split. After it is enabled, read and write operations in a transaction are split to different instances for execution.
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * Access mode:
nearby: nearby access.
balance: balanced allocation.
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * Instance weight.
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get VPC ID. By default, it remains consistent with the VPC ID of the cluster. 
     * @return UniqueVpcId VPC ID. By default, it remains consistent with the VPC ID of the cluster.
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set VPC ID. By default, it remains consistent with the VPC ID of the cluster.
     * @param UniqueVpcId VPC ID. By default, it remains consistent with the VPC ID of the cluster.
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get Subnet ID of the VPC. By default, it remains consistent with the subnet ID of the cluster. 
     * @return UniqueSubnetId Subnet ID of the VPC. By default, it remains consistent with the subnet ID of the cluster.
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set Subnet ID of the VPC. By default, it remains consistent with the subnet ID of the cluster.
     * @param UniqueSubnetId Subnet ID of the VPC. By default, it remains consistent with the subnet ID of the cluster.
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Type of connection pool: SessionConnectionPool (session-level connection pool). 
     * @return ConnectionPoolType Type of connection pool: SessionConnectionPool (session-level connection pool).
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Type of connection pool: SessionConnectionPool (session-level connection pool).
     * @param ConnectionPoolType Type of connection pool: SessionConnectionPool (session-level connection pool).
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Whether to enable the connection pool.
yes: indicates enabled.
no: indicates not enabled. 
     * @return OpenConnectionPool Whether to enable the connection pool.
yes: indicates enabled.
no: indicates not enabled.
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set Whether to enable the connection pool.
yes: indicates enabled.
no: indicates not enabled.
     * @param OpenConnectionPool Whether to enable the connection pool.
yes: indicates enabled.
no: indicates not enabled.
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get Threshold of the connection pool: unit (seconds). Valid values: 0 - 300 seconds. 
     * @return ConnectionPoolTimeOut Threshold of the connection pool: unit (seconds). Valid values: 0 - 300 seconds.
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set Threshold of the connection pool: unit (seconds). Valid values: 0 - 300 seconds.
     * @param ConnectionPoolTimeOut Threshold of the connection pool: unit (seconds). Valid values: 0 - 300 seconds.
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get Array of bound security group IDs. 
     * @return SecurityGroupIds Array of bound security group IDs.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Array of bound security group IDs.
     * @param SecurityGroupIds Array of bound security group IDs.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The vip information to be bound must correspond to the UniqueVpcId. 
     * @return Vip The vip information to be bound must correspond to the UniqueVpcId.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set The vip information to be bound must correspond to the UniqueVpcId.
     * @param Vip The vip information to be bound must correspond to the UniqueVpcId.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Weight mode:
system: system-assigned.
custom: custom. 
     * @return WeightMode Weight mode:
system: system-assigned.
custom: custom.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Weight mode:
system: system-assigned.
custom: custom.
     * @param WeightMode Weight mode:
system: system-assigned.
custom: custom.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to automatically add a read-only instance.
yes: indicates automatically adding a read-only instance.
no: indicates not to automatically add a read-only instance. 
     * @return AutoAddRo Whether to automatically add a read-only instance.
yes: indicates automatically adding a read-only instance.
no: indicates not to automatically add a read-only instance.
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add a read-only instance.
yes: indicates automatically adding a read-only instance.
no: indicates not to automatically add a read-only instance.
     * @param AutoAddRo Whether to automatically add a read-only instance.
yes: indicates automatically adding a read-only instance.
no: indicates not to automatically add a read-only instance.
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Whether to enable failover.
yes: indicates enabled. After it is enabled, when the database proxy encounters faults, the connection address will be routed to the primary instance.
no: indicates not enabled.
Description:
Only when the value of the RwType parameter is READWRITE can this option be configured. 
     * @return FailOver Whether to enable failover.
yes: indicates enabled. After it is enabled, when the database proxy encounters faults, the connection address will be routed to the primary instance.
no: indicates not enabled.
Description:
Only when the value of the RwType parameter is READWRITE can this option be configured.
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover.
yes: indicates enabled. After it is enabled, when the database proxy encounters faults, the connection address will be routed to the primary instance.
no: indicates not enabled.
Description:
Only when the value of the RwType parameter is READWRITE can this option be configured.
     * @param FailOver Whether to enable failover.
yes: indicates enabled. After it is enabled, when the database proxy encounters faults, the connection address will be routed to the primary instance.
no: indicates not enabled.
Description:
Only when the value of the RwType parameter is READWRITE can this option be configured.
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Consistency Type:
eventual: eventual consistency.
global: global consistency.
session: session consistency.
Description:
Only when the RwType parameter value is READWRITE can this option be configured. 
     * @return ConsistencyType Consistency Type:
eventual: eventual consistency.
global: global consistency.
session: session consistency.
Description:
Only when the RwType parameter value is READWRITE can this option be configured.
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set Consistency Type:
eventual: eventual consistency.
global: global consistency.
session: session consistency.
Description:
Only when the RwType parameter value is READWRITE can this option be configured.
     * @param ConsistencyType Consistency Type:
eventual: eventual consistency.
global: global consistency.
session: session consistency.
Description:
Only when the RwType parameter value is READWRITE can this option be configured.
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get Read-Write Attribute:
READWRITE: indicates read/write splitting. Only when this parameter value is READWRITE can the FailOver and ConsistencyType parameters be configured.
READONLY: indicates read-only. 
     * @return RwType Read-Write Attribute:
READWRITE: indicates read/write splitting. Only when this parameter value is READWRITE can the FailOver and ConsistencyType parameters be configured.
READONLY: indicates read-only.
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set Read-Write Attribute:
READWRITE: indicates read/write splitting. Only when this parameter value is READWRITE can the FailOver and ConsistencyType parameters be configured.
READONLY: indicates read-only.
     * @param RwType Read-Write Attribute:
READWRITE: indicates read/write splitting. Only when this parameter value is READWRITE can the FailOver and ConsistencyType parameters be configured.
READONLY: indicates read-only.
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get The consistency timeout period. Value range: 0 - 1000000 (microseconds). When set to 0, if a read-only instance experiences latency causing the consistency policy to be unsatisfied, the request will wait indefinitely. 
     * @return ConsistencyTimeOut The consistency timeout period. Value range: 0 - 1000000 (microseconds). When set to 0, if a read-only instance experiences latency causing the consistency policy to be unsatisfied, the request will wait indefinitely.
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set The consistency timeout period. Value range: 0 - 1000000 (microseconds). When set to 0, if a read-only instance experiences latency causing the consistency policy to be unsatisfied, the request will wait indefinitely.
     * @param ConsistencyTimeOut The consistency timeout period. Value range: 0 - 1000000 (microseconds). When set to 0, if a read-only instance experiences latency causing the consistency policy to be unsatisfied, the request will wait indefinitely.
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get Whether to enable transaction split. After it is enabled, read and write operations in a transaction are split to different instances for execution. 
     * @return TransSplit Whether to enable transaction split. After it is enabled, read and write operations in a transaction are split to different instances for execution.
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set Whether to enable transaction split. After it is enabled, read and write operations in a transaction are split to different instances for execution.
     * @param TransSplit Whether to enable transaction split. After it is enabled, read and write operations in a transaction are split to different instances for execution.
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get Access mode:
nearby: nearby access.
balance: balanced allocation. 
     * @return AccessMode Access mode:
nearby: nearby access.
balance: balanced allocation.
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Access mode:
nearby: nearby access.
balance: balanced allocation.
     * @param AccessMode Access mode:
nearby: nearby access.
balance: balanced allocation.
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Instance weight. 
     * @return InstanceWeights Instance weight.
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set Instance weight.
     * @param InstanceWeights Instance weight.
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
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

    }
}

