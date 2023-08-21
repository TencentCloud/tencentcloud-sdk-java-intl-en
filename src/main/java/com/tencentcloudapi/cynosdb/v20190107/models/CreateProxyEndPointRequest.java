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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyEndPointRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * VPC ID, which is the same as that of the cluster by defaultu200d.
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * VPCe subnet ID, which is the same as that of the cluster by default.
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Whether to enable connection pool. Valid value: `yes` (enable), `no` u200d(disable).
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * Connection pool threshold in seconds
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * Array of security group IDs
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * VIP information
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Weight mode. 
Valid values: `system` (system-assigned), `custom` (custom).
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to automatically add read-only instance. Valid value: `yes`, `no`.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * Whether to enable failover
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * Consistency type. Valid values: 
`eventual`, `global`, `session`.
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * Read-write attribute. Valid values: 
`READWRITE`, `READONLY`.
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * Consistency timeout period
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

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
    * Instance weight
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

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
     * Get VPC ID, which is the same as that of the cluster by defaultu200d. 
     * @return UniqueVpcId VPC ID, which is the same as that of the cluster by defaultu200d.
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set VPC ID, which is the same as that of the cluster by defaultu200d.
     * @param UniqueVpcId VPC ID, which is the same as that of the cluster by defaultu200d.
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get VPCe subnet ID, which is the same as that of the cluster by default. 
     * @return UniqueSubnetId VPCe subnet ID, which is the same as that of the cluster by default.
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set VPCe subnet ID, which is the same as that of the cluster by default.
     * @param UniqueSubnetId VPCe subnet ID, which is the same as that of the cluster by default.
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool) 
     * @return ConnectionPoolType Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
     * @param ConnectionPoolType Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Whether to enable connection pool. Valid value: `yes` (enable), `no` u200d(disable). 
     * @return OpenConnectionPool Whether to enable connection pool. Valid value: `yes` (enable), `no` u200d(disable).
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set Whether to enable connection pool. Valid value: `yes` (enable), `no` u200d(disable).
     * @param OpenConnectionPool Whether to enable connection pool. Valid value: `yes` (enable), `no` u200d(disable).
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get Connection pool threshold in seconds 
     * @return ConnectionPoolTimeOut Connection pool threshold in seconds
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set Connection pool threshold in seconds
     * @param ConnectionPoolTimeOut Connection pool threshold in seconds
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get Array of security group IDs 
     * @return SecurityGroupIds Array of security group IDs
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Array of security group IDs
     * @param SecurityGroupIds Array of security group IDs
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get VIP information 
     * @return Vip VIP information
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP information
     * @param Vip VIP information
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Weight mode. 
Valid values: `system` (system-assigned), `custom` (custom). 
     * @return WeightMode Weight mode. 
Valid values: `system` (system-assigned), `custom` (custom).
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Weight mode. 
Valid values: `system` (system-assigned), `custom` (custom).
     * @param WeightMode Weight mode. 
Valid values: `system` (system-assigned), `custom` (custom).
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
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
     * Get Consistency type. Valid values: 
`eventual`, `global`, `session`. 
     * @return ConsistencyType Consistency type. Valid values: 
`eventual`, `global`, `session`.
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set Consistency type. Valid values: 
`eventual`, `global`, `session`.
     * @param ConsistencyType Consistency type. Valid values: 
`eventual`, `global`, `session`.
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get Read-write attribute. Valid values: 
`READWRITE`, `READONLY`. 
     * @return RwType Read-write attribute. Valid values: 
`READWRITE`, `READONLY`.
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set Read-write attribute. Valid values: 
`READWRITE`, `READONLY`.
     * @param RwType Read-write attribute. Valid values: 
`READWRITE`, `READONLY`.
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
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
     * Get Instance weight 
     * @return InstanceWeights Instance weight
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set Instance weight
     * @param InstanceWeights Instance weight
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

