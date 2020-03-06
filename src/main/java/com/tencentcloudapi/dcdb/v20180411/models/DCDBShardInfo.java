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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCDBShardInfo extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * Globally unique shard ID
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;

    /**
    * Status. 0: creating; 1: processing; 2: running; 3: shard not initialized
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * VPC ID in string format
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID in string format
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Expiration time
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Number of nodes. 2: one master and one slave; 3: one master and two slaves
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Storage utilization in %
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * Memory utilization in %
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Float MemoryUsage;

    /**
    * Numeric ID of a shard (this field is obsolete and should not be depended on)
    */
    @SerializedName("ShardId")
    @Expose
    private Long ShardId;

    /**
    * ProductID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Proxy version
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * Master AZ of a shard
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShardMasterZone")
    @Expose
    private String ShardMasterZone;

    /**
    * List of slave AZs of a shard
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShardSlaveZones")
    @Expose
    private String [] ShardSlaveZones;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution 
     * @return ShardSerialId Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution
     * @param ShardSerialId Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get Globally unique shard ID 
     * @return ShardInstanceId Globally unique shard ID
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * Set Globally unique shard ID
     * @param ShardInstanceId Globally unique shard ID
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * Get Status. 0: creating; 1: processing; 2: running; 3: shard not initialized 
     * @return Status Status. 0: creating; 1: processing; 2: running; 3: shard not initialized
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: creating; 1: processing; 2: running; 3: shard not initialized
     * @param Status Status. 0: creating; 1: processing; 2: running; 3: shard not initialized
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status description 
     * @return StatusDesc Status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description
     * @param StatusDesc Status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get VPC ID in string format 
     * @return VpcId VPC ID in string format
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in string format
     * @param VpcId VPC ID in string format
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID in string format 
     * @return SubnetId VPC subnet ID in string format
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in string format
     * @param SubnetId VPC subnet ID in string format
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Memory size in GB 
     * @return Memory Memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB
     * @param Memory Memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage capacity in GB 
     * @return Storage Storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity in GB
     * @param Storage Storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Expiration time 
     * @return PeriodEndTime Expiration time
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time
     * @param PeriodEndTime Expiration time
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Number of nodes. 2: one master and one slave; 3: one master and two slaves 
     * @return NodeCount Number of nodes. 2: one master and one slave; 3: one master and two slaves
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one master and one slave; 3: one master and two slaves
     * @param NodeCount Number of nodes. 2: one master and one slave; 3: one master and two slaves
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Storage utilization in % 
     * @return StorageUsage Storage utilization in %
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set Storage utilization in %
     * @param StorageUsage Storage utilization in %
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get Memory utilization in % 
     * @return MemoryUsage Memory utilization in %
     */
    public Float getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set Memory utilization in %
     * @param MemoryUsage Memory utilization in %
     */
    public void setMemoryUsage(Float MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get Numeric ID of a shard (this field is obsolete and should not be depended on) 
     * @return ShardId Numeric ID of a shard (this field is obsolete and should not be depended on)
     */
    public Long getShardId() {
        return this.ShardId;
    }

    /**
     * Set Numeric ID of a shard (this field is obsolete and should not be depended on)
     * @param ShardId Numeric ID of a shard (this field is obsolete and should not be depended on)
     */
    public void setShardId(Long ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get ProductID 
     * @return Pid ProductID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set ProductID
     * @param Pid ProductID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Proxy version 
     * @return ProxyVersion Proxy version
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set Proxy version
     * @param ProxyVersion Proxy version
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get Billing mode
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Paymode Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Paymode Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get Master AZ of a shard
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ShardMasterZone Master AZ of a shard
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getShardMasterZone() {
        return this.ShardMasterZone;
    }

    /**
     * Set Master AZ of a shard
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ShardMasterZone Master AZ of a shard
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setShardMasterZone(String ShardMasterZone) {
        this.ShardMasterZone = ShardMasterZone;
    }

    /**
     * Get List of slave AZs of a shard
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ShardSlaveZones List of slave AZs of a shard
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getShardSlaveZones() {
        return this.ShardSlaveZones;
    }

    /**
     * Set List of slave AZs of a shard
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ShardSlaveZones List of slave AZs of a shard
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setShardSlaveZones(String [] ShardSlaveZones) {
        this.ShardSlaveZones = ShardSlaveZones;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "ShardMasterZone", this.ShardMasterZone);
        this.setParamArraySimple(map, prefix + "ShardSlaveZones.", this.ShardSlaveZones);

    }
}

