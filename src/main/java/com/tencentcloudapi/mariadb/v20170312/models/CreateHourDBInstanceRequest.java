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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHourDBInstanceRequest extends AbstractModel {

    /**
    * AZs to deploy instance nodes. You can specify up to two AZs.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Number of nodes.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage size in GB.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of instances to purchase.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Project ID. If this parameter is not passed in, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Unique ID of the network. If this parameter is not passed in, the classic network will be used.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique ID of the subnet. If `VpcId` is specified, this parameter is required.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * Custom name of the instance.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Security group ID. If this parameter is not passed in, no security groups will be associated when the instance is created.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * Array of tag key-value pairs.
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * List of parameters. Valid values: 
`character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive);
`innodb_page_size` (innoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * ID of the instance to be rolled back, such as “2021-11-22 00:00:00”.
    */
    @SerializedName("RollbackInstanceId")
    @Expose
    private String RollbackInstanceId;

    /**
    * Rollback time.
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
     * Get AZs to deploy instance nodes. You can specify up to two AZs. 
     * @return Zones AZs to deploy instance nodes. You can specify up to two AZs.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set AZs to deploy instance nodes. You can specify up to two AZs.
     * @param Zones AZs to deploy instance nodes. You can specify up to two AZs.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Number of nodes. 
     * @return NodeCount Number of nodes.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes.
     * @param NodeCount Number of nodes.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Memory size in GB. 
     * @return Memory Memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB.
     * @param Memory Memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage size in GB. 
     * @return Storage Storage size in GB.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage size in GB.
     * @param Storage Storage size in GB.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of instances to purchase. 
     * @return Count Number of instances to purchase.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of instances to purchase.
     * @param Count Number of instances to purchase.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Project ID. If this parameter is not passed in, the default project will be used. 
     * @return ProjectId Project ID. If this parameter is not passed in, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If this parameter is not passed in, the default project will be used.
     * @param ProjectId Project ID. If this parameter is not passed in, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Unique ID of the network. If this parameter is not passed in, the classic network will be used. 
     * @return VpcId Unique ID of the network. If this parameter is not passed in, the classic network will be used.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of the network. If this parameter is not passed in, the classic network will be used.
     * @param VpcId Unique ID of the network. If this parameter is not passed in, the classic network will be used.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique ID of the subnet. If `VpcId` is specified, this parameter is required. 
     * @return SubnetId Unique ID of the subnet. If `VpcId` is specified, this parameter is required.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique ID of the subnet. If `VpcId` is specified, this parameter is required.
     * @param SubnetId Unique ID of the subnet. If `VpcId` is specified, this parameter is required.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get Custom name of the instance. 
     * @return InstanceName Custom name of the instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Custom name of the instance.
     * @param InstanceName Custom name of the instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Security group ID. If this parameter is not passed in, no security groups will be associated when the instance is created. 
     * @return SecurityGroupIds Security group ID. If this parameter is not passed in, no security groups will be associated when the instance is created.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID. If this parameter is not passed in, no security groups will be associated when the instance is created.
     * @param SecurityGroupIds Security group ID. If this parameter is not passed in, no security groups will be associated when the instance is created.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
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
     * Get Array of tag key-value pairs. 
     * @return ResourceTags Array of tag key-value pairs.
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tag key-value pairs.
     * @param ResourceTags Array of tag key-value pairs.
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN). 
     * @return DcnRegion If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
     * @param DcnRegion If you create a disaster recovery instance, you need to use this parameter to specify the region of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
    }

    /**
     * Get If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN). 
     * @return DcnInstanceId If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
     */
    public String getDcnInstanceId() {
        return this.DcnInstanceId;
    }

    /**
     * Set If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
     * @param DcnInstanceId If you create a disaster recovery instance, you need to use this parameter to specify the ID of the associated primary instance so that the disaster recovery instance can sync data with the primary instance over the Data Communication Network (DCN).
     */
    public void setDcnInstanceId(String DcnInstanceId) {
        this.DcnInstanceId = DcnInstanceId;
    }

    /**
     * Get List of parameters. Valid values: 
`character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive);
`innodb_page_size` (innoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2). 
     * @return InitParams List of parameters. Valid values: 
`character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive);
`innodb_page_size` (innoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set List of parameters. Valid values: 
`character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive);
`innodb_page_size` (innoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
     * @param InitParams List of parameters. Valid values: 
`character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; 0: case-sensitive; 1: case-insensitive);
`innodb_page_size` (innoDB data page size; default size: 16 KB); `sync_mode` (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: 2).
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get ID of the instance to be rolled back, such as “2021-11-22 00:00:00”. 
     * @return RollbackInstanceId ID of the instance to be rolled back, such as “2021-11-22 00:00:00”.
     */
    public String getRollbackInstanceId() {
        return this.RollbackInstanceId;
    }

    /**
     * Set ID of the instance to be rolled back, such as “2021-11-22 00:00:00”.
     * @param RollbackInstanceId ID of the instance to be rolled back, such as “2021-11-22 00:00:00”.
     */
    public void setRollbackInstanceId(String RollbackInstanceId) {
        this.RollbackInstanceId = RollbackInstanceId;
    }

    /**
     * Get Rollback time. 
     * @return RollbackTime Rollback time.
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set Rollback time.
     * @param RollbackTime Rollback time.
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    public CreateHourDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHourDBInstanceRequest(CreateHourDBInstanceRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
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
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "RollbackInstanceId", this.RollbackInstanceId);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);

    }
}

