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

public class CreateProxyRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * VPC ID, which is the same as that of the cluster by defaultu200d.
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * VPC subnet ID, which is the same as that of the cluster by default.
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Number of nodes in the proxy group
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

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
    * Database node information
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

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
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory 
     * @return Mem Memory
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory
     * @param Mem Memory
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
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
     * Get VPC subnet ID, which is the same as that of the cluster by default. 
     * @return UniqueSubnetId VPC subnet ID, which is the same as that of the cluster by default.
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set VPC subnet ID, which is the same as that of the cluster by default.
     * @param UniqueSubnetId VPC subnet ID, which is the same as that of the cluster by default.
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Number of nodes in the proxy group 
     * @return ProxyCount Number of nodes in the proxy group
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set Number of nodes in the proxy group
     * @param ProxyCount Number of nodes in the proxy group
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
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
     * Get Database node information 
     * @return ProxyZones Database node information
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set Database node information
     * @param ProxyZones Database node information
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public CreateProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyRequest(CreateProxyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
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
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

