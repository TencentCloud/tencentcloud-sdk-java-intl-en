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
    * Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution.
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
    * Status. 0: creating; 1: processing; 2: running; 3: shard not initialized.
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
    * Number of nodes. 2: one source and one replica; 3: one source and two replicas
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
    * Numeric shard ID (this field is obsolete and should not be depended on)
    */
    @SerializedName("ShardId")
    @Expose
    private Long ShardId;

    /**
    * Product ID
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * Source AZ of the shard
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShardMasterZone")
    @Expose
    private String ShardMasterZone;

    /**
    * List of replica AZs of the shard
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShardSlaveZones")
    @Expose
    private String [] ShardSlaveZones;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * The value range of shardkey, which includes 64 hash values, such as 0-31 or 32-63.
    */
    @SerializedName("Range")
    @Expose
    private String Range;

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
     * Get Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution. 
     * @return ShardSerialId Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution.
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution.
     * @param ShardSerialId Shard SQL passthrough ID, which is used to pass through SQL statements to the specified shard for execution.
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
     * Get Status. 0: creating; 1: processing; 2: running; 3: shard not initialized. 
     * @return Status Status. 0: creating; 1: processing; 2: running; 3: shard not initialized.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: creating; 1: processing; 2: running; 3: shard not initialized.
     * @param Status Status. 0: creating; 1: processing; 2: running; 3: shard not initialized.
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
     * Get Number of nodes. 2: one source and one replica; 3: one source and two replicas 
     * @return NodeCount Number of nodes. 2: one source and one replica; 3: one source and two replicas
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one source and one replica; 3: one source and two replicas
     * @param NodeCount Number of nodes. 2: one source and one replica; 3: one source and two replicas
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
     * Get Numeric shard ID (this field is obsolete and should not be depended on) 
     * @return ShardId Numeric shard ID (this field is obsolete and should not be depended on)
     */
    public Long getShardId() {
        return this.ShardId;
    }

    /**
     * Set Numeric shard ID (this field is obsolete and should not be depended on)
     * @param ShardId Numeric shard ID (this field is obsolete and should not be depended on)
     */
    public void setShardId(Long ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get Product ID 
     * @return Pid Product ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product ID
     * @param Pid Product ID
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Paymode Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Paymode Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get Source AZ of the shard
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShardMasterZone Source AZ of the shard
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getShardMasterZone() {
        return this.ShardMasterZone;
    }

    /**
     * Set Source AZ of the shard
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShardMasterZone Source AZ of the shard
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShardMasterZone(String ShardMasterZone) {
        this.ShardMasterZone = ShardMasterZone;
    }

    /**
     * Get List of replica AZs of the shard
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShardSlaveZones List of replica AZs of the shard
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getShardSlaveZones() {
        return this.ShardSlaveZones;
    }

    /**
     * Set List of replica AZs of the shard
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShardSlaveZones List of replica AZs of the shard
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShardSlaveZones(String [] ShardSlaveZones) {
        this.ShardSlaveZones = ShardSlaveZones;
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
     * Get The value range of shardkey, which includes 64 hash values, such as 0-31 or 32-63. 
     * @return Range The value range of shardkey, which includes 64 hash values, such as 0-31 or 32-63.
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set The value range of shardkey, which includes 64 hash values, such as 0-31 or 32-63.
     * @param Range The value range of shardkey, which includes 64 hash values, such as 0-31 or 32-63.
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    public DCDBShardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCDBShardInfo(DCDBShardInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
        if (source.ShardInstanceId != null) {
            this.ShardInstanceId = new String(source.ShardInstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageUsage != null) {
            this.StorageUsage = new Float(source.StorageUsage);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new Float(source.MemoryUsage);
        }
        if (source.ShardId != null) {
            this.ShardId = new Long(source.ShardId);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.ShardMasterZone != null) {
            this.ShardMasterZone = new String(source.ShardMasterZone);
        }
        if (source.ShardSlaveZones != null) {
            this.ShardSlaveZones = new String[source.ShardSlaveZones.length];
            for (int i = 0; i < source.ShardSlaveZones.length; i++) {
                this.ShardSlaveZones[i] = new String(source.ShardSlaveZones[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
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
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Range", this.Range);

    }
}

