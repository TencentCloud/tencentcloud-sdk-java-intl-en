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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDedicatedClusterDCDBInstanceRequest extends AbstractModel {

    /**
    * Number of created instances
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Shard count
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * Shard memory size in GB
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * Shard disk size in GB
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * UUID of the dedicated cluster
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * (Disused) AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * (Disused) Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * (Disused) Shard model
    */
    @SerializedName("ShardMachine")
    @Expose
    private String ShardMachine;

    /**
    * Number of shard nodes
    */
    @SerializedName("ShardNodeNum")
    @Expose
    private Long ShardNodeNum;

    /**
    * (Disused) Number of node CPU cores. Value range: 1-100.
    */
    @SerializedName("ShardNodeCpu")
    @Expose
    private Long ShardNodeCpu;

    /**
    * (Disused) Node memory size in GB
    */
    @SerializedName("ShardNodeMemory")
    @Expose
    private Long ShardNodeMemory;

    /**
    * (Disused) Node disk size in GB
    */
    @SerializedName("ShardNodeStorage")
    @Expose
    private Long ShardNodeStorage;

    /**
    * Database version
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * List of security group IDs
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * DCN source instance ID
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * Region of DCN source instance
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * Custom instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Tag
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * Whether IPv6 flag is supported. Valid values: `1` (yes), `0` (no).
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * (Disused) Pid, which can be queried by the `DescribeSpecInfo` API.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * List of parameters. Valid values: `character_set_server` (character set; required), `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive), `innodb_page_size` (InnoDB data page; default size: 16 KB), `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync. Default value: `2`).
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * Specified UUID for the source node. If left empty, it will be assigned by the system randomly.
    */
    @SerializedName("MasterHostId")
    @Expose
    private String MasterHostId;

    /**
    * Specified UUID for the replica node. If left empty, it will be assigned by the system randomly.
    */
    @SerializedName("SlaveHostIds")
    @Expose
    private String [] SlaveHostIds;

    /**
    * ID of the source instance to be rolled back
    */
    @SerializedName("RollbackInstanceId")
    @Expose
    private String RollbackInstanceId;

    /**
    * Rollback time
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * 
    */
    @SerializedName("DcnSyncMode")
    @Expose
    private Long DcnSyncMode;

    /**
     * Get Number of created instances 
     * @return GoodsNum Number of created instances
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of created instances
     * @param GoodsNum Number of created instances
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Shard count 
     * @return ShardNum Shard count
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set Shard count
     * @param ShardNum Shard count
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get Shard memory size in GB 
     * @return ShardMemory Shard memory size in GB
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set Shard memory size in GB
     * @param ShardMemory Shard memory size in GB
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get Shard disk size in GB 
     * @return ShardStorage Shard disk size in GB
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set Shard disk size in GB
     * @param ShardStorage Shard disk size in GB
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get UUID of the dedicated cluster 
     * @return ClusterId UUID of the dedicated cluster
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set UUID of the dedicated cluster
     * @param ClusterId UUID of the dedicated cluster
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get (Disused) AZ 
     * @return Zone (Disused) AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set (Disused) AZ
     * @param Zone (Disused) AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get (Disused) Number of CPU cores 
     * @return Cpu (Disused) Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set (Disused) Number of CPU cores
     * @param Cpu (Disused) Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get (Disused) Shard model 
     * @return ShardMachine (Disused) Shard model
     */
    public String getShardMachine() {
        return this.ShardMachine;
    }

    /**
     * Set (Disused) Shard model
     * @param ShardMachine (Disused) Shard model
     */
    public void setShardMachine(String ShardMachine) {
        this.ShardMachine = ShardMachine;
    }

    /**
     * Get Number of shard nodes 
     * @return ShardNodeNum Number of shard nodes
     */
    public Long getShardNodeNum() {
        return this.ShardNodeNum;
    }

    /**
     * Set Number of shard nodes
     * @param ShardNodeNum Number of shard nodes
     */
    public void setShardNodeNum(Long ShardNodeNum) {
        this.ShardNodeNum = ShardNodeNum;
    }

    /**
     * Get (Disused) Number of node CPU cores. Value range: 1-100. 
     * @return ShardNodeCpu (Disused) Number of node CPU cores. Value range: 1-100.
     */
    public Long getShardNodeCpu() {
        return this.ShardNodeCpu;
    }

    /**
     * Set (Disused) Number of node CPU cores. Value range: 1-100.
     * @param ShardNodeCpu (Disused) Number of node CPU cores. Value range: 1-100.
     */
    public void setShardNodeCpu(Long ShardNodeCpu) {
        this.ShardNodeCpu = ShardNodeCpu;
    }

    /**
     * Get (Disused) Node memory size in GB 
     * @return ShardNodeMemory (Disused) Node memory size in GB
     */
    public Long getShardNodeMemory() {
        return this.ShardNodeMemory;
    }

    /**
     * Set (Disused) Node memory size in GB
     * @param ShardNodeMemory (Disused) Node memory size in GB
     */
    public void setShardNodeMemory(Long ShardNodeMemory) {
        this.ShardNodeMemory = ShardNodeMemory;
    }

    /**
     * Get (Disused) Node disk size in GB 
     * @return ShardNodeStorage (Disused) Node disk size in GB
     */
    public Long getShardNodeStorage() {
        return this.ShardNodeStorage;
    }

    /**
     * Set (Disused) Node disk size in GB
     * @param ShardNodeStorage (Disused) Node disk size in GB
     */
    public void setShardNodeStorage(Long ShardNodeStorage) {
        this.ShardNodeStorage = ShardNodeStorage;
    }

    /**
     * Get Database version 
     * @return DbVersionId Database version
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set Database version
     * @param DbVersionId Database version
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupId Security group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupId Security group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get List of security group IDs 
     * @return SecurityGroupIds List of security group IDs
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set List of security group IDs
     * @param SecurityGroupIds List of security group IDs
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get DCN source instance ID 
     * @return DcnInstanceId DCN source instance ID
     */
    public String getDcnInstanceId() {
        return this.DcnInstanceId;
    }

    /**
     * Set DCN source instance ID
     * @param DcnInstanceId DCN source instance ID
     */
    public void setDcnInstanceId(String DcnInstanceId) {
        this.DcnInstanceId = DcnInstanceId;
    }

    /**
     * Get Region of DCN source instance 
     * @return DcnRegion Region of DCN source instance
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set Region of DCN source instance
     * @param DcnRegion Region of DCN source instance
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
    }

    /**
     * Get Custom instance name 
     * @return InstanceName Custom instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Custom instance name
     * @param InstanceName Custom instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Tag 
     * @return ResourceTags Tag
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Tag
     * @param ResourceTags Tag
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Whether IPv6 flag is supported. Valid values: `1` (yes), `0` (no). 
     * @return Ipv6Flag Whether IPv6 flag is supported. Valid values: `1` (yes), `0` (no).
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Whether IPv6 flag is supported. Valid values: `1` (yes), `0` (no).
     * @param Ipv6Flag Whether IPv6 flag is supported. Valid values: `1` (yes), `0` (no).
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get (Disused) Pid, which can be queried by the `DescribeSpecInfo` API. 
     * @return Pid (Disused) Pid, which can be queried by the `DescribeSpecInfo` API.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set (Disused) Pid, which can be queried by the `DescribeSpecInfo` API.
     * @param Pid (Disused) Pid, which can be queried by the `DescribeSpecInfo` API.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get List of parameters. Valid values: `character_set_server` (character set; required), `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive), `innodb_page_size` (InnoDB data page; default size: 16 KB), `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync. Default value: `2`). 
     * @return InitParams List of parameters. Valid values: `character_set_server` (character set; required), `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive), `innodb_page_size` (InnoDB data page; default size: 16 KB), `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync. Default value: `2`).
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set List of parameters. Valid values: `character_set_server` (character set; required), `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive), `innodb_page_size` (InnoDB data page; default size: 16 KB), `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync. Default value: `2`).
     * @param InitParams List of parameters. Valid values: `character_set_server` (character set; required), `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive), `innodb_page_size` (InnoDB data page; default size: 16 KB), `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync. Default value: `2`).
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get Specified UUID for the source node. If left empty, it will be assigned by the system randomly. 
     * @return MasterHostId Specified UUID for the source node. If left empty, it will be assigned by the system randomly.
     */
    public String getMasterHostId() {
        return this.MasterHostId;
    }

    /**
     * Set Specified UUID for the source node. If left empty, it will be assigned by the system randomly.
     * @param MasterHostId Specified UUID for the source node. If left empty, it will be assigned by the system randomly.
     */
    public void setMasterHostId(String MasterHostId) {
        this.MasterHostId = MasterHostId;
    }

    /**
     * Get Specified UUID for the replica node. If left empty, it will be assigned by the system randomly. 
     * @return SlaveHostIds Specified UUID for the replica node. If left empty, it will be assigned by the system randomly.
     */
    public String [] getSlaveHostIds() {
        return this.SlaveHostIds;
    }

    /**
     * Set Specified UUID for the replica node. If left empty, it will be assigned by the system randomly.
     * @param SlaveHostIds Specified UUID for the replica node. If left empty, it will be assigned by the system randomly.
     */
    public void setSlaveHostIds(String [] SlaveHostIds) {
        this.SlaveHostIds = SlaveHostIds;
    }

    /**
     * Get ID of the source instance to be rolled back 
     * @return RollbackInstanceId ID of the source instance to be rolled back
     */
    public String getRollbackInstanceId() {
        return this.RollbackInstanceId;
    }

    /**
     * Set ID of the source instance to be rolled back
     * @param RollbackInstanceId ID of the source instance to be rolled back
     */
    public void setRollbackInstanceId(String RollbackInstanceId) {
        this.RollbackInstanceId = RollbackInstanceId;
    }

    /**
     * Get Rollback time 
     * @return RollbackTime Rollback time
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set Rollback time
     * @param RollbackTime Rollback time
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * Get  
     * @return DcnSyncMode 
     */
    public Long getDcnSyncMode() {
        return this.DcnSyncMode;
    }

    /**
     * Set 
     * @param DcnSyncMode 
     */
    public void setDcnSyncMode(Long DcnSyncMode) {
        this.DcnSyncMode = DcnSyncMode;
    }

    public CreateDedicatedClusterDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterDCDBInstanceRequest(CreateDedicatedClusterDCDBInstanceRequest source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ShardMachine != null) {
            this.ShardMachine = new String(source.ShardMachine);
        }
        if (source.ShardNodeNum != null) {
            this.ShardNodeNum = new Long(source.ShardNodeNum);
        }
        if (source.ShardNodeCpu != null) {
            this.ShardNodeCpu = new Long(source.ShardNodeCpu);
        }
        if (source.ShardNodeMemory != null) {
            this.ShardNodeMemory = new Long(source.ShardNodeMemory);
        }
        if (source.ShardNodeStorage != null) {
            this.ShardNodeStorage = new Long(source.ShardNodeStorage);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.DcnInstanceId != null) {
            this.DcnInstanceId = new String(source.DcnInstanceId);
        }
        if (source.DcnRegion != null) {
            this.DcnRegion = new String(source.DcnRegion);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new DBParamValue(source.InitParams[i]);
            }
        }
        if (source.MasterHostId != null) {
            this.MasterHostId = new String(source.MasterHostId);
        }
        if (source.SlaveHostIds != null) {
            this.SlaveHostIds = new String[source.SlaveHostIds.length];
            for (int i = 0; i < source.SlaveHostIds.length; i++) {
                this.SlaveHostIds[i] = new String(source.SlaveHostIds[i]);
            }
        }
        if (source.RollbackInstanceId != null) {
            this.RollbackInstanceId = new String(source.RollbackInstanceId);
        }
        if (source.RollbackTime != null) {
            this.RollbackTime = new String(source.RollbackTime);
        }
        if (source.DcnSyncMode != null) {
            this.DcnSyncMode = new Long(source.DcnSyncMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ShardMachine", this.ShardMachine);
        this.setParamSimple(map, prefix + "ShardNodeNum", this.ShardNodeNum);
        this.setParamSimple(map, prefix + "ShardNodeCpu", this.ShardNodeCpu);
        this.setParamSimple(map, prefix + "ShardNodeMemory", this.ShardNodeMemory);
        this.setParamSimple(map, prefix + "ShardNodeStorage", this.ShardNodeStorage);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "MasterHostId", this.MasterHostId);
        this.setParamArraySimple(map, prefix + "SlaveHostIds.", this.SlaveHostIds);
        this.setParamSimple(map, prefix + "RollbackInstanceId", this.RollbackInstanceId);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamSimple(map, prefix + "DcnSyncMode", this.DcnSyncMode);

    }
}

