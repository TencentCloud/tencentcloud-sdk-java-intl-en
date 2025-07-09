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

public class CreateHourDCDBInstanceRequest extends AbstractModel {

    /**
    * Shard memory in GB, which can be obtained through the `DescribeShardSpec` API.
  
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * Shard capacity in GB, which can be obtained through the `DescribeShardSpec` API.
  
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * The number of nodes per shard, which can be obtained through the `DescribeShardSpec` API.
  
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
    * The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * The number of instances to be purchased
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID, which is required when `VpcId` is specified
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The number of CPU cores per shard, which can be obtained through the `DescribeShardSpec` API.
  
    */
    @SerializedName("ShardCpu")
    @Expose
    private Long ShardCpu;

    /**
    * Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * AZs to deploy shard nodes. You can specify up to two AZs.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Custom name of the instance
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * Array of tag key-value pairs
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * ID of the instance to be rolled back
    */
    @SerializedName("RollbackInstanceId")
    @Expose
    private String RollbackInstanceId;

    /**
    * Rollback time, such as "2021-11-22 00:00:00".
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * Array of security group IDs (this parameter is compatible with the old parameter `SecurityGroupId`)
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Shard memory in GB, which can be obtained through the `DescribeShardSpec` API.
   
     * @return ShardMemory Shard memory in GB, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set Shard memory in GB, which can be obtained through the `DescribeShardSpec` API.
  
     * @param ShardMemory Shard memory in GB, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get Shard capacity in GB, which can be obtained through the `DescribeShardSpec` API.
   
     * @return ShardStorage Shard capacity in GB, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set Shard capacity in GB, which can be obtained through the `DescribeShardSpec` API.
  
     * @param ShardStorage Shard capacity in GB, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get The number of nodes per shard, which can be obtained through the `DescribeShardSpec` API.
   
     * @return ShardNodeCount The number of nodes per shard, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set The number of nodes per shard, which can be obtained through the `DescribeShardSpec` API.
  
     * @param ShardNodeCount The number of nodes per shard, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    /**
     * Get The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more. 
     * @return ShardCount The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
     * @param ShardCount The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get The number of instances to be purchased 
     * @return Count The number of instances to be purchased
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of instances to be purchased
     * @param Count The number of instances to be purchased
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project. 
     * @return ProjectId Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
     * @param ProjectId Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network. 
     * @return VpcId VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
     * @param VpcId VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, which is required when `VpcId` is specified 
     * @return SubnetId VPC subnet ID, which is required when `VpcId` is specified
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, which is required when `VpcId` is specified
     * @param SubnetId VPC subnet ID, which is required when `VpcId` is specified
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The number of CPU cores per shard, which can be obtained through the `DescribeShardSpec` API.
   
     * @return ShardCpu The number of CPU cores per shard, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public Long getShardCpu() {
        return this.ShardCpu;
    }

    /**
     * Set The number of CPU cores per shard, which can be obtained through the `DescribeShardSpec` API.
  
     * @param ShardCpu The number of CPU cores per shard, which can be obtained through the `DescribeShardSpec` API.
  
     */
    public void setShardCpu(Long ShardCpu) {
        this.ShardCpu = ShardCpu;
    }

    /**
     * Get Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`. 
     * @return DbVersionId Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
     * @param DbVersionId Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get AZs to deploy shard nodes. You can specify up to two AZs. 
     * @return Zones AZs to deploy shard nodes. You can specify up to two AZs.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set AZs to deploy shard nodes. You can specify up to two AZs.
     * @param Zones AZs to deploy shard nodes. You can specify up to two AZs.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
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
     * Get Custom name of the instance 
     * @return InstanceName Custom name of the instance
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Custom name of the instance
     * @param InstanceName Custom name of the instance
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported). 
     * @return Ipv6Flag Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
     * @param Ipv6Flag Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get Array of tag key-value pairs 
     * @return ResourceTags Array of tag key-value pairs
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tag key-value pairs
     * @param ResourceTags Array of tag key-value pairs
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN). 
     * @return DcnRegion If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
     * @param DcnRegion If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
    }

    /**
     * Get If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN). 
     * @return DcnInstanceId If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
     */
    public String getDcnInstanceId() {
        return this.DcnInstanceId;
    }

    /**
     * Set If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
     * @param DcnInstanceId If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated source instance so that the disaster recovery instance can sync data with the source instance over the Data Communication Network (DCN).
     */
    public void setDcnInstanceId(String DcnInstanceId) {
        this.DcnInstanceId = DcnInstanceId;
    }

    /**
     * Get List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2). 
     * @return InitParams List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
     * @param InitParams List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get ID of the instance to be rolled back 
     * @return RollbackInstanceId ID of the instance to be rolled back
     */
    public String getRollbackInstanceId() {
        return this.RollbackInstanceId;
    }

    /**
     * Set ID of the instance to be rolled back
     * @param RollbackInstanceId ID of the instance to be rolled back
     */
    public void setRollbackInstanceId(String RollbackInstanceId) {
        this.RollbackInstanceId = RollbackInstanceId;
    }

    /**
     * Get Rollback time, such as "2021-11-22 00:00:00". 
     * @return RollbackTime Rollback time, such as "2021-11-22 00:00:00".
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set Rollback time, such as "2021-11-22 00:00:00".
     * @param RollbackTime Rollback time, such as "2021-11-22 00:00:00".
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * Get Array of security group IDs (this parameter is compatible with the old parameter `SecurityGroupId`) 
     * @return SecurityGroupIds Array of security group IDs (this parameter is compatible with the old parameter `SecurityGroupId`)
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Array of security group IDs (this parameter is compatible with the old parameter `SecurityGroupId`)
     * @param SecurityGroupIds Array of security group IDs (this parameter is compatible with the old parameter `SecurityGroupId`)
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateHourDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHourDCDBInstanceRequest(CreateHourDCDBInstanceRequest source) {
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ShardCpu != null) {
            this.ShardCpu = new Long(source.ShardCpu);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DcnRegion != null) {
            this.DcnRegion = new String(source.DcnRegion);
        }
        if (source.DcnInstanceId != null) {
            this.DcnInstanceId = new String(source.DcnInstanceId);
        }
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new DBParamValue(source.InitParams[i]);
            }
        }
        if (source.RollbackInstanceId != null) {
            this.RollbackInstanceId = new String(source.RollbackInstanceId);
        }
        if (source.RollbackTime != null) {
            this.RollbackTime = new String(source.RollbackTime);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ShardCpu", this.ShardCpu);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "RollbackInstanceId", this.RollbackInstanceId);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

