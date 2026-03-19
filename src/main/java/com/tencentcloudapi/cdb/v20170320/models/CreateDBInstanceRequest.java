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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceRequest extends AbstractModel {

    /**
    * Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of instances. Value range: 1-100. Default value: `1`.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * For AZ information, please use the [Obtain the Purchasable Specifications of Cloud Databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to obtain the availability zones that can be created.
Description: If you create a single-node, two-node, or three-node instance, this parameter is required. Specify an availability zone. If you do not specify an availability zone, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk edition instance, leave this parameter empty. Configure the availability zone for the read-write node and read-only node with parameter ClusterTopology.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID. Please use [Querying VPC list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1).
Description: If a cloud disk edition instance is created, this item is required and must be a VPC type. If this item is left blank, the system will select the default VPC.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use [query subnet list](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1).
Description: If this item is left empty, the system will select the default subnet in the Default VPC.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Project ID. If this parameter is left empty, the default project will be used. When you purchase read-only instances and disaster recovery instances, the project ID is the same as that of the source instance by default.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Custom port. Port range: 1024-65535.
Description: If this item is left blank, it defaults to 3306.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance type. Supported values include: master - indicates the primary instance, dr - indicates the disaster recovery instance, ro - indicates the read-only instance.
Description: Select instance type. The master type is selected by default if left empty.
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API to query the cloud database instance ID.
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the [obtain the purchasable specifications of cloud databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to get the version of the instance created.
Description: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left empty, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * The root account password, which can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols `_+-&=!@#$%^*()`. This parameter applies to source instances but not to read-only or disaster recovery instances.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * AZ information of standby database 1.
Description: For two-node and three-node instances, specify this parameter. If not specified, it defaults to the value of Zone. For cloud disk edition instances, this parameter is optional. Configure the availability zone for read-write nodes and read-only nodes with parameter ClusterTopology. Single-node instances are single availability zone and no need to specify this parameter.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Parameter list. The parameter format is ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can query the configurable parameters by default by referring to [Querying the Default Configurable Parameter List](https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1).
Description: table name case sensitivity can be enabled or disabled with parameter lower_case_table_names. A parameter value of 0 means enabling, and 1 means disabling. If not set, the default value is 0. For MySQL 8.0 edition instances, you need to set the lower_case_table_names parameter when creating an instance to turn on or off table name case sensitivity. Once created, the parameter cannot be modified, meaning table name case sensitivity cannot be changed after creation. Other database versions support modifying the lower_case_table_names parameter after the instance is created. For the function invocation method to set table name case sensitivity when creating an instance, please see example 3 in this document.
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
    */
    @SerializedName("RoGroup")
    @Expose
    private RoGroup RoGroup;

    /**
    * Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance tag information
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * Placement group ID
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC_V2" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for cloud disk edition, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced for cloud disk edition. Default to general-purpose instance if not specified.
Description: If a cloud disk edition instance is created, this parameter is required.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Parameter template id.
Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, inputting the parameter template ID is invalid, and you need to set ParamTemplateType.
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Array of alarm policy IDs, which can be obtained through the `OriginId` field in the return value of the `DescribeAlarmPolicy` API of TCOP.
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private Long [] AlarmPolicyList;

    /**
    * The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
    */
    @SerializedName("AutoSyncFlag")
    @Expose
    private Long AutoSyncFlag;

    /**
    * Financial cage ID.
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * Default parameter template type. Supported values include: "HIGH_STABILITY" - high-stability template, "HIGH_PERFORMANCE" - high-performance template.
Remark: If you need to use the TencentDB for MySQL default parameter template, set up ParamTemplateType.
    */
    @SerializedName("ParamTemplateType")
    @Expose
    private String ParamTemplateType;

    /**
    * The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
    */
    @SerializedName("AlarmPolicyIdList")
    @Expose
    private String [] AlarmPolicyIdList;

    /**
    * Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check failed, return the corresponding error code; if the check passed, return RequestId. false: Send a normal request and create the instance directly after passing the check.
Defaults to false.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * Data protection space size of the cloud disk edition instance in GB. Setting range is 1 - 10.
    */
    @SerializedName("DataProtectVolume")
    @Expose
    private Long DataProtectVolume;

    /**
    * Cloud disk edition node topology configuration.
Description: If a cloud disk edition instance is purchased, this parameter is required. Set the RW and RO node topology for the cloud disk edition instance. The RO node scope is 1-5. Set at least 1 RO node.
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * Disk Type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instance. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD refers to enhanced SSD cloud disk, and CLOUD_PREMIUM indicates high-performance cloud block storage.
Description: The supported regions for the hard disk type of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For the specific support situation, refer to [Regions and Availability Zones](https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Turn on or off instance destruction protection. on - enabled, off - disabled.
    */
    @SerializedName("DestroyProtect")
    @Expose
    private String DestroyProtect;

    /**
     * Get Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications. 
     * @return Memory Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
     * @param Memory Instance memory size in MB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported memory specifications.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications. 
     * @return Volume Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
     * @param Volume Instance disk size in GB. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the supported disk specifications.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. 
     * @return Period Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     * @param Period Instance validity period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of instances. Value range: 1-100. Default value: `1`. 
     * @return GoodsNum Number of instances. Value range: 1-100. Default value: `1`.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. Value range: 1-100. Default value: `1`.
     * @param GoodsNum Number of instances. Value range: 1-100. Default value: `1`.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get For AZ information, please use the [Obtain the Purchasable Specifications of Cloud Databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to obtain the availability zones that can be created.
Description: If you create a single-node, two-node, or three-node instance, this parameter is required. Specify an availability zone. If you do not specify an availability zone, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk edition instance, leave this parameter empty. Configure the availability zone for the read-write node and read-only node with parameter ClusterTopology. 
     * @return Zone For AZ information, please use the [Obtain the Purchasable Specifications of Cloud Databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to obtain the availability zones that can be created.
Description: If you create a single-node, two-node, or three-node instance, this parameter is required. Specify an availability zone. If you do not specify an availability zone, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk edition instance, leave this parameter empty. Configure the availability zone for the read-write node and read-only node with parameter ClusterTopology.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set For AZ information, please use the [Obtain the Purchasable Specifications of Cloud Databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to obtain the availability zones that can be created.
Description: If you create a single-node, two-node, or three-node instance, this parameter is required. Specify an availability zone. If you do not specify an availability zone, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk edition instance, leave this parameter empty. Configure the availability zone for the read-write node and read-only node with parameter ClusterTopology.
     * @param Zone For AZ information, please use the [Obtain the Purchasable Specifications of Cloud Databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to obtain the availability zones that can be created.
Description: If you create a single-node, two-node, or three-node instance, this parameter is required. Specify an availability zone. If you do not specify an availability zone, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk edition instance, leave this parameter empty. Configure the availability zone for the read-write node and read-only node with parameter ClusterTopology.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID. Please use [Querying VPC list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1).
Description: If a cloud disk edition instance is created, this item is required and must be a VPC type. If this item is left blank, the system will select the default VPC. 
     * @return UniqVpcId VPC ID. Please use [Querying VPC list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1).
Description: If a cloud disk edition instance is created, this item is required and must be a VPC type. If this item is left blank, the system will select the default VPC.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID. Please use [Querying VPC list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1).
Description: If a cloud disk edition instance is created, this item is required and must be a VPC type. If this item is left blank, the system will select the default VPC.
     * @param UniqVpcId VPC ID. Please use [Querying VPC list](https://www.tencentcloud.com/document/api/215/15778?from_cn_redirect=1).
Description: If a cloud disk edition instance is created, this item is required and must be a VPC type. If this item is left blank, the system will select the default VPC.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use [query subnet list](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1).
Description: If this item is left empty, the system will select the default subnet in the Default VPC. 
     * @return UniqSubnetId Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use [query subnet list](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1).
Description: If this item is left empty, the system will select the default subnet in the Default VPC.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use [query subnet list](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1).
Description: If this item is left empty, the system will select the default subnet in the Default VPC.
     * @param UniqSubnetId Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use [query subnet list](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1).
Description: If this item is left empty, the system will select the default subnet in the Default VPC.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Project ID. If this parameter is left empty, the default project will be used. When you purchase read-only instances and disaster recovery instances, the project ID is the same as that of the source instance by default. 
     * @return ProjectId Project ID. If this parameter is left empty, the default project will be used. When you purchase read-only instances and disaster recovery instances, the project ID is the same as that of the source instance by default.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If this parameter is left empty, the default project will be used. When you purchase read-only instances and disaster recovery instances, the project ID is the same as that of the source instance by default.
     * @param ProjectId Project ID. If this parameter is left empty, the default project will be used. When you purchase read-only instances and disaster recovery instances, the project ID is the same as that of the source instance by default.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Custom port. Port range: 1024-65535.
Description: If this item is left blank, it defaults to 3306. 
     * @return Port Custom port. Port range: 1024-65535.
Description: If this item is left blank, it defaults to 3306.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Custom port. Port range: 1024-65535.
Description: If this item is left blank, it defaults to 3306.
     * @param Port Custom port. Port range: 1024-65535.
Description: If this item is left blank, it defaults to 3306.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance type. Supported values include: master - indicates the primary instance, dr - indicates the disaster recovery instance, ro - indicates the read-only instance.
Description: Select instance type. The master type is selected by default if left empty. 
     * @return InstanceRole Instance type. Supported values include: master - indicates the primary instance, dr - indicates the disaster recovery instance, ro - indicates the read-only instance.
Description: Select instance type. The master type is selected by default if left empty.
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Instance type. Supported values include: master - indicates the primary instance, dr - indicates the disaster recovery instance, ro - indicates the read-only instance.
Description: Select instance type. The master type is selected by default if left empty.
     * @param InstanceRole Instance type. Supported values include: master - indicates the primary instance, dr - indicates the disaster recovery instance, ro - indicates the read-only instance.
Description: Select instance type. The master type is selected by default if left empty.
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API to query the cloud database instance ID. 
     * @return MasterInstanceId Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API to query the cloud database instance ID.
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API to query the cloud database instance ID.
     * @param MasterInstanceId Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API to query the cloud database instance ID.
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the [obtain the purchasable specifications of cloud databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to get the version of the instance created.
Description: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left empty, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0. 
     * @return EngineVersion MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the [obtain the purchasable specifications of cloud databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to get the version of the instance created.
Description: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left empty, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the [obtain the purchasable specifications of cloud databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to get the version of the instance created.
Description: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left empty, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.
     * @param EngineVersion MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the [obtain the purchasable specifications of cloud databases](https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) API to get the version of the instance created.
Description: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left empty, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get The root account password, which can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols `_+-&=!@#$%^*()`. This parameter applies to source instances but not to read-only or disaster recovery instances. 
     * @return Password The root account password, which can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols `_+-&=!@#$%^*()`. This parameter applies to source instances but not to read-only or disaster recovery instances.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The root account password, which can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols `_+-&=!@#$%^*()`. This parameter applies to source instances but not to read-only or disaster recovery instances.
     * @param Password The root account password, which can contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and symbols `_+-&=!@#$%^*()`. This parameter applies to source instances but not to read-only or disaster recovery instances.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`. 
     * @return ProtectMode Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
     * @param ProtectMode Data replication mode. Valid values: `0` (async replication), `1` (semi-sync replication), `2` (strong sync replication). Default value: `0`.
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`. 
     * @return DeployMode Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
     * @param DeployMode Multi-AZ or single-AZ. Valid values: `0` (single-AZ), `1` (multi-AZ). Default value: `0`.
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get AZ information of standby database 1.
Description: For two-node and three-node instances, specify this parameter. If not specified, it defaults to the value of Zone. For cloud disk edition instances, this parameter is optional. Configure the availability zone for read-write nodes and read-only nodes with parameter ClusterTopology. Single-node instances are single availability zone and no need to specify this parameter. 
     * @return SlaveZone AZ information of standby database 1.
Description: For two-node and three-node instances, specify this parameter. If not specified, it defaults to the value of Zone. For cloud disk edition instances, this parameter is optional. Configure the availability zone for read-write nodes and read-only nodes with parameter ClusterTopology. Single-node instances are single availability zone and no need to specify this parameter.
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set AZ information of standby database 1.
Description: For two-node and three-node instances, specify this parameter. If not specified, it defaults to the value of Zone. For cloud disk edition instances, this parameter is optional. Configure the availability zone for read-write nodes and read-only nodes with parameter ClusterTopology. Single-node instances are single availability zone and no need to specify this parameter.
     * @param SlaveZone AZ information of standby database 1.
Description: For two-node and three-node instances, specify this parameter. If not specified, it defaults to the value of Zone. For cloud disk edition instances, this parameter is optional. Configure the availability zone for read-write nodes and read-only nodes with parameter ClusterTopology. Single-node instances are single availability zone and no need to specify this parameter.
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Parameter list. The parameter format is ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can query the configurable parameters by default by referring to [Querying the Default Configurable Parameter List](https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1).
Description: table name case sensitivity can be enabled or disabled with parameter lower_case_table_names. A parameter value of 0 means enabling, and 1 means disabling. If not set, the default value is 0. For MySQL 8.0 edition instances, you need to set the lower_case_table_names parameter when creating an instance to turn on or off table name case sensitivity. Once created, the parameter cannot be modified, meaning table name case sensitivity cannot be changed after creation. Other database versions support modifying the lower_case_table_names parameter after the instance is created. For the function invocation method to set table name case sensitivity when creating an instance, please see example 3 in this document. 
     * @return ParamList Parameter list. The parameter format is ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can query the configurable parameters by default by referring to [Querying the Default Configurable Parameter List](https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1).
Description: table name case sensitivity can be enabled or disabled with parameter lower_case_table_names. A parameter value of 0 means enabling, and 1 means disabling. If not set, the default value is 0. For MySQL 8.0 edition instances, you need to set the lower_case_table_names parameter when creating an instance to turn on or off table name case sensitivity. Once created, the parameter cannot be modified, meaning table name case sensitivity cannot be changed after creation. Other database versions support modifying the lower_case_table_names parameter after the instance is created. For the function invocation method to set table name case sensitivity when creating an instance, please see example 3 in this document.
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set Parameter list. The parameter format is ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can query the configurable parameters by default by referring to [Querying the Default Configurable Parameter List](https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1).
Description: table name case sensitivity can be enabled or disabled with parameter lower_case_table_names. A parameter value of 0 means enabling, and 1 means disabling. If not set, the default value is 0. For MySQL 8.0 edition instances, you need to set the lower_case_table_names parameter when creating an instance to turn on or off table name case sensitivity. Once created, the parameter cannot be modified, meaning table name case sensitivity cannot be changed after creation. Other database versions support modifying the lower_case_table_names parameter after the instance is created. For the function invocation method to set table name case sensitivity when creating an instance, please see example 3 in this document.
     * @param ParamList Parameter list. The parameter format is ParamList.0.Name=auto_increment&ParamList.0.Value=1. You can query the configurable parameters by default by referring to [Querying the Default Configurable Parameter List](https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1).
Description: table name case sensitivity can be enabled or disabled with parameter lower_case_table_names. A parameter value of 0 means enabling, and 1 means disabling. If not set, the default value is 0. For MySQL 8.0 edition instances, you need to set the lower_case_table_names parameter when creating an instance to turn on or off table name case sensitivity. Once created, the parameter cannot be modified, meaning table name case sensitivity cannot be changed after creation. Other database versions support modifying the lower_case_table_names parameter after the instance is created. For the function invocation method to set table name case sensitivity when creating an instance, please see example 3 in this document.
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture. 
     * @return BackupZone Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
     * @param BackupZone Information of replica AZ 2, which is left empty by default. Specify this parameter when purchasing a source instance in the one-source-two-replica architecture.
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0. 
     * @return AutoRenewFlag Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.
     * @param AutoRenewFlag Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance. 
     * @return MasterRegion Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
     * @param MasterRegion Region information of the source instance, which is required when purchasing a read-only or disaster recovery instance.
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project. 
     * @return SecurityGroup Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
     * @param SecurityGroup Security group parameter. You can use the [DescribeProjectSecurityGroups](https://intl.cloud.tencent.com/document/api/236/15850?from_cn_redirect=1) API to query the security group details of a project.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Read-only instance parameter. This parameter must be passed in when purchasing read-only instances. 
     * @return RoGroup Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
     */
    public RoGroup getRoGroup() {
        return this.RoGroup;
    }

    /**
     * Set Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
     * @param RoGroup Read-only instance parameter. This parameter must be passed in when purchasing read-only instances.
     */
    public void setRoGroup(RoGroup RoGroup) {
        this.RoGroup = RoGroup;
    }

    /**
     * Get Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively. 
     * @return InstanceName Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
     * @param InstanceName Instance name. For multiple instances purchased at one time, they will be distinguished by the name suffix number, such as instnaceName=db and goodsNum=3, and their instance names are db1, db2, and db3, respectively.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance tag information 
     * @return ResourceTags Instance tag information
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Instance tag information
     * @param ResourceTags Instance tag information
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Placement group ID 
     * @return DeployGroupId Placement group ID
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set Placement group ID
     * @param DeployGroupId Placement group ID
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. 
     * @return ClientToken A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     * @param ClientToken A string unique in 48 hours, which is supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC_V2" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for cloud disk edition, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced for cloud disk edition. Default to general-purpose instance if not specified.
Description: If a cloud disk edition instance is created, this parameter is required. 
     * @return DeviceType Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC_V2" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for cloud disk edition, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced for cloud disk edition. Default to general-purpose instance if not specified.
Description: If a cloud disk edition instance is created, this parameter is required.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC_V2" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for cloud disk edition, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced for cloud disk edition. Default to general-purpose instance if not specified.
Description: If a cloud disk edition instance is created, this parameter is required.
     * @param DeviceType Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC_V2" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for cloud disk edition, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced for cloud disk edition. Default to general-purpose instance if not specified.
Description: If a cloud disk edition instance is created, this parameter is required.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Parameter template id.
Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, inputting the parameter template ID is invalid, and you need to set ParamTemplateType. 
     * @return ParamTemplateId Parameter template id.
Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, inputting the parameter template ID is invalid, and you need to set ParamTemplateType.
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template id.
Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, inputting the parameter template ID is invalid, and you need to set ParamTemplateType.
     * @param ParamTemplateId Parameter template id.
Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, inputting the parameter template ID is invalid, and you need to set ParamTemplateType.
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Array of alarm policy IDs, which can be obtained through the `OriginId` field in the return value of the `DescribeAlarmPolicy` API of TCOP. 
     * @return AlarmPolicyList Array of alarm policy IDs, which can be obtained through the `OriginId` field in the return value of the `DescribeAlarmPolicy` API of TCOP.
     */
    public Long [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set Array of alarm policy IDs, which can be obtained through the `OriginId` field in the return value of the `DescribeAlarmPolicy` API of TCOP.
     * @param AlarmPolicyList Array of alarm policy IDs, which can be obtained through the `OriginId` field in the return value of the `DescribeAlarmPolicy` API of TCOP.
     */
    public void setAlarmPolicyList(Long [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes. 
     * @return InstanceNodes The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
     * @param InstanceNodes The number of nodes of the instance. To purchase a read-only instance or a basic instance, set this parameter to `1` or leave it empty. To purchase a three-node instance, set this parameter to `3` or specify the `BackupZone` parameter. If the instance to be purchased is a source instance and both `BackupZone` and this parameter are left empty, the value `2` will be used, which indicates the source instance will have two nodes.
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value. 
     * @return Cpu The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
     * @param Cpu The number of the instance CPU cores. If this parameter is left empty, it will be subject to the `Memory` value.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`. 
     * @return AutoSyncFlag Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
     */
    public Long getAutoSyncFlag() {
        return this.AutoSyncFlag;
    }

    /**
     * Set Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
     * @param AutoSyncFlag Whether to automatically start disaster recovery synchronization. This parameter takes effect only for disaster recovery instances. Valid values: `0` (no), `1` (yes). Default value: `0`.
     */
    public void setAutoSyncFlag(Long AutoSyncFlag) {
        this.AutoSyncFlag = AutoSyncFlag;
    }

    /**
     * Get Financial cage ID. 
     * @return CageId Financial cage ID.
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set Financial cage ID.
     * @param CageId Financial cage ID.
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get Default parameter template type. Supported values include: "HIGH_STABILITY" - high-stability template, "HIGH_PERFORMANCE" - high-performance template.
Remark: If you need to use the TencentDB for MySQL default parameter template, set up ParamTemplateType. 
     * @return ParamTemplateType Default parameter template type. Supported values include: "HIGH_STABILITY" - high-stability template, "HIGH_PERFORMANCE" - high-performance template.
Remark: If you need to use the TencentDB for MySQL default parameter template, set up ParamTemplateType.
     */
    public String getParamTemplateType() {
        return this.ParamTemplateType;
    }

    /**
     * Set Default parameter template type. Supported values include: "HIGH_STABILITY" - high-stability template, "HIGH_PERFORMANCE" - high-performance template.
Remark: If you need to use the TencentDB for MySQL default parameter template, set up ParamTemplateType.
     * @param ParamTemplateType Default parameter template type. Supported values include: "HIGH_STABILITY" - high-stability template, "HIGH_PERFORMANCE" - high-performance template.
Remark: If you need to use the TencentDB for MySQL default parameter template, set up ParamTemplateType.
     */
    public void setParamTemplateType(String ParamTemplateType) {
        this.ParamTemplateType = ParamTemplateType;
    }

    /**
     * Get The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid. 
     * @return AlarmPolicyIdList The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
     */
    public String [] getAlarmPolicyIdList() {
        return this.AlarmPolicyIdList;
    }

    /**
     * Set The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
     * @param AlarmPolicyIdList The array of alarm policy names, such as ["policy-uyoee9wg"]. If the `AlarmPolicyList` parameter is specified, this parameter is invalid.
     */
    public void setAlarmPolicyIdList(String [] AlarmPolicyIdList) {
        this.AlarmPolicyIdList = AlarmPolicyIdList;
    }

    /**
     * Get Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check failed, return the corresponding error code; if the check passed, return RequestId. false: Send a normal request and create the instance directly after passing the check.
Defaults to false. 
     * @return DryRun Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check failed, return the corresponding error code; if the check passed, return RequestId. false: Send a normal request and create the instance directly after passing the check.
Defaults to false.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check failed, return the corresponding error code; if the check passed, return RequestId. false: Send a normal request and create the instance directly after passing the check.
Defaults to false.
     * @param DryRun Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check failed, return the corresponding error code; if the check passed, return RequestId. false: Send a normal request and create the instance directly after passing the check.
Defaults to false.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Instance engine type. Valid values: `InnoDB` (default), `RocksDB`. 
     * @return EngineType Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
     * @param EngineType Instance engine type. Valid values: `InnoDB` (default), `RocksDB`.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one. 
     * @return Vips The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
     * @param Vips The list of IPs for sources instances. Only one IP address can be assigned to a single source instance. If all IPs are used up, the system will automatically assign IPs to the remaining source instances that do not have one.
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get Data protection space size of the cloud disk edition instance in GB. Setting range is 1 - 10. 
     * @return DataProtectVolume Data protection space size of the cloud disk edition instance in GB. Setting range is 1 - 10.
     */
    public Long getDataProtectVolume() {
        return this.DataProtectVolume;
    }

    /**
     * Set Data protection space size of the cloud disk edition instance in GB. Setting range is 1 - 10.
     * @param DataProtectVolume Data protection space size of the cloud disk edition instance in GB. Setting range is 1 - 10.
     */
    public void setDataProtectVolume(Long DataProtectVolume) {
        this.DataProtectVolume = DataProtectVolume;
    }

    /**
     * Get Cloud disk edition node topology configuration.
Description: If a cloud disk edition instance is purchased, this parameter is required. Set the RW and RO node topology for the cloud disk edition instance. The RO node scope is 1-5. Set at least 1 RO node. 
     * @return ClusterTopology Cloud disk edition node topology configuration.
Description: If a cloud disk edition instance is purchased, this parameter is required. Set the RW and RO node topology for the cloud disk edition instance. The RO node scope is 1-5. Set at least 1 RO node.
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set Cloud disk edition node topology configuration.
Description: If a cloud disk edition instance is purchased, this parameter is required. Set the RW and RO node topology for the cloud disk edition instance. The RO node scope is 1-5. Set at least 1 RO node.
     * @param ClusterTopology Cloud disk edition node topology configuration.
Description: If a cloud disk edition instance is purchased, this parameter is required. Set the RW and RO node topology for the cloud disk edition instance. The RO node scope is 1-5. Set at least 1 RO node.
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get Disk Type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instance. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD refers to enhanced SSD cloud disk, and CLOUD_PREMIUM indicates high-performance cloud block storage.
Description: The supported regions for the hard disk type of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For the specific support situation, refer to [Regions and Availability Zones](https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1). 
     * @return DiskType Disk Type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instance. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD refers to enhanced SSD cloud disk, and CLOUD_PREMIUM indicates high-performance cloud block storage.
Description: The supported regions for the hard disk type of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For the specific support situation, refer to [Regions and Availability Zones](https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk Type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instance. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD refers to enhanced SSD cloud disk, and CLOUD_PREMIUM indicates high-performance cloud block storage.
Description: The supported regions for the hard disk type of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For the specific support situation, refer to [Regions and Availability Zones](https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1).
     * @param DiskType Disk Type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instance. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD refers to enhanced SSD cloud disk, and CLOUD_PREMIUM indicates high-performance cloud block storage.
Description: The supported regions for the hard disk type of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For the specific support situation, refer to [Regions and Availability Zones](https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Turn on or off instance destruction protection. on - enabled, off - disabled. 
     * @return DestroyProtect Turn on or off instance destruction protection. on - enabled, off - disabled.
     */
    public String getDestroyProtect() {
        return this.DestroyProtect;
    }

    /**
     * Set Turn on or off instance destruction protection. on - enabled, off - disabled.
     * @param DestroyProtect Turn on or off instance destruction protection. on - enabled, off - disabled.
     */
    public void setDestroyProtect(String DestroyProtect) {
        this.DestroyProtect = DestroyProtect;
    }

    public CreateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceRequest(CreateDBInstanceRequest source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamInfo[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamInfo(source.ParamList[i]);
            }
        }
        if (source.BackupZone != null) {
            this.BackupZone = new String(source.BackupZone);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.MasterRegion != null) {
            this.MasterRegion = new String(source.MasterRegion);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.RoGroup != null) {
            this.RoGroup = new RoGroup(source.RoGroup);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new Long[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new Long(source.AlarmPolicyList[i]);
            }
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.AutoSyncFlag != null) {
            this.AutoSyncFlag = new Long(source.AutoSyncFlag);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ParamTemplateType != null) {
            this.ParamTemplateType = new String(source.ParamTemplateType);
        }
        if (source.AlarmPolicyIdList != null) {
            this.AlarmPolicyIdList = new String[source.AlarmPolicyIdList.length];
            for (int i = 0; i < source.AlarmPolicyIdList.length; i++) {
                this.AlarmPolicyIdList[i] = new String(source.AlarmPolicyIdList[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.DataProtectVolume != null) {
            this.DataProtectVolume = new Long(source.DataProtectVolume);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DestroyProtect != null) {
            this.DestroyProtect = new String(source.DestroyProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "MasterRegion", this.MasterRegion);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamObj(map, prefix + "RoGroup.", this.RoGroup);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "AutoSyncFlag", this.AutoSyncFlag);
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ParamTemplateType", this.ParamTemplateType);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIdList.", this.AlarmPolicyIdList);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "DataProtectVolume", this.DataProtectVolume);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DestroyProtect", this.DestroyProtect);

    }
}

