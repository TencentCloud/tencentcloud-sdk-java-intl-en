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
    * <p>Instance memory size. Unit: MB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain creatable memory specifications.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance disk size, unit: GB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the creatable disk range.</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Instance duration, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Instance count. Default value is 1, minimum value 1, maximum value 100.</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>For AZ information, please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">Obtain the Purchasable Specifications of Cloud Databases</a> API to obtain the availability zones where instances can be created.</p><p>If you create a single-node, two-node, three-node, or four-node instance, this parameter is required. Specify an availability zone. If no availability zone is specified, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk-based cluster instance, leave this parameter blank and configure the availability zones for RWNode and read-only nodes with parameter ClusterTopology.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.<br>Description: If you create a cloud disk edition instance, this item is required and must be VPC type. If this item is left blank, the system will select the default VPC by default.</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.<br>Description: If this item is not filled, the system will select the default subnet in the Default VPC.</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Project ID. The default project is used if left empty. When you purchase a read-only instance or disaster recovery instance, the project ID is consistent with the primary instance by default.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Custom port. Supported range: [1024-65535].<br>Description: If this item is left blank, it defaults to 3306.</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Instance type. Supported values include: master - primary instance, dr - disaster recovery instance, ro - read-only instance.<br>Description: Select instance type. master is selected by default if left blank.</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API to query the cloud database instance ID.</p>
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * <p>MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the instance version created.<br>Note: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left blank, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>Set the root account password. The password must contain 8 to 64 characters and at least two of the following: letters, digits, or characters (supported characters: _+-&amp;=!@#$%^*()). You can specify this parameter when purchasing a primary instance. This parameter is invalid when purchasing a read-only instance or disaster recovery instance.</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>Multiple Availability Zones, defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>AZ information of standby database 1.</p><p>For two-node, three-node, or four-node instances, specify this parameter. If not specified, it defaults to the Zone value. For cloud disk edition instances, this parameter is optional. Configure the AZ for read-write and read-only nodes with parameter ClusterTopology. Single-node instances are in a single availability zone, so no need to specify this parameter.</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>Parameter list. The parameter format is ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1. You can query the configurable parameters by referring to <a href="https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1">querying the default configurable parameter list</a>.<br>Description: table Name case sensitivity can be turned on or off by setting the parameter lower_case_table_names. a parameter Value of 0 means enabling, and a Value of 1 means disabling. If not set, the default Value is 0. If you create a MySQL 8.0 edition instance, you need to set the lower_case_table_names parameter when creating the instance to turn on or off table Name case sensitivity. After the instance is created, the parameter cannot be modified, meaning table Name case sensitivity cannot be changed once created. Instances of other database versions support modifying the lower_case_table_names parameter after creation. For the function invocation method to set table Name case sensitivity when creating an instance, please see example 3 in this document.</p>
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * <p>AZ information of standby 2, empty by default.</p><p>Specify this parameter when you proceed to purchase a three-node primary instance or a four-node primary instance.</p>
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * <p>Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Region of the primary instance. This field is required when you purchase a disaster recovery or RO instance.</p>
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * <p>Security group parameters. Use the API <a href="https://www.tencentcloud.com/document/api/236/15850?from_cn_redirect=1">Query Project Security Group Information</a> to query security group details of a certain project.</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>Read-only instance parameter. This parameter is required when you purchase a read-only instance.</p>
    */
    @SerializedName("RoGroup")
    @Expose
    private RoGroup RoGroup;

    /**
    * <p>Instance name. When you purchase multiple instances only once, suffix numbers are used for case-sensitive instance naming. For example, instnaceName=db and goodsNum=3, the instance names are db1, db2, and db3 respectively.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Tag information of the instance.</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * <p>Placement group ID.</p>
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * <p>String used to ensure request idempotency. This string is generated by the customer and must be unique between different requests within 48 hours, with a maximum value of 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Instance isolation type.</p><p>Enumeration values:</p><ul><li><p>UNIVERSAL: General-purpose instance</p></li><li><p>EXCLUSIVE: Dedicated instance</p></li><li><p>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_ULTRA: Premium type of cloud disk edition</p></li><li><p>If this parameter is not specified, it defaults to general-purpose instance.</p></li><li><p>Required if you create a cloud disk edition instance.</p></li><li><p>If you create a single-node instance, fill in this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes equal to 1.</p></li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Parameter template ID.<br>Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, the input ID is invalid and you need to set ParamTemplateType.</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>Array of alarm policy IDs. OriginId returned by the Tencent Cloud observability platform DescribeAlarmPolicy API.</p>
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private Long [] AlarmPolicyList;

    /**
    * <p>Number of instance nodes.</p><p>For RO and single-node instances, the default value is 1. To purchase a three-node instance, set this value to 3 or specify the BackupZone parameter. When purchasing a primary instance without specifying this parameter or the BackupZone parameter, the default value is 2, meaning a dual-node instance will be purchased. To purchase a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>Number of Cpu cores of the instance.</p><p>When multiple Cpu configurations exist for the Memory specification (for example, 64000MB Memory corresponds to 8-core/16-core/32-core), the Cpu parameter must be provided.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Whether to automatically initiate disaster recovery sync. This parameter only takes effect when purchasing a disaster recovery instance. Available values are: 0 - Do not automatically initiate disaster recovery sync; 1 - Automatically initiate disaster recovery sync. The default is 0.</p>
    */
    @SerializedName("AutoSyncFlag")
    @Expose
    private Long AutoSyncFlag;

    /**
    * <p>Financial Enclosure ID.</p>
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * <p>Default parameter template type. Supported values include "HIGH_STABILITY" - HIGH-STABILITY template, "HIGH_PERFORMANCE" - HIGH-PERFORMANCE template.<br>Remark: If you need to use TencentDB for MySQL default parameter template, set up ParamTemplateType.</p>
    */
    @SerializedName("ParamTemplateType")
    @Expose
    private String ParamTemplateType;

    /**
    * <p>Alarm policy name array, such as ["policy-uyoee9wg"]. This parameter is invalid when AlarmPolicyList is not empty.</p>
    */
    @SerializedName("AlarmPolicyIdList")
    @Expose
    private String [] AlarmPolicyIdList;

    /**
    * <p>Whether to perform a pre-check only for this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check fails, return the corresponding error code; if the check passes, return RequestId. false: Send a normal request and create an instance directly after the check passes.<br>Default to false.</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>Specify the IP list of the instance. Only the primary instance is supported. Process by instance sequence. Handle as unspecified if insufficient.</p>
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * <p>The data protection space size of the cloud disk edition instance, in GB, has a setting range of 1 - 10.</p>
    */
    @SerializedName("DataProtectVolume")
    @Expose
    private Long DataProtectVolume;

    /**
    * <p>Topology configuration of cloud disk edition instance nodes.</p><p>If a cloud disk edition instance is purchased, this parameter is required. Set the topology of RW and RO nodes for the cloud disk edition instance. The node scope of RO nodes is 1-5. Set at least 1 RO node.</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>Disk type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instances. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD means enhanced SSD cloud disk, and CLOUD_PREMIUM means high-performance cloud block storage.<br>Note: The supported regions for hard disk types of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For specific support situation, refer to <a href="https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Turn on or off instance destruction protection. on - turn on, off - turn off.</p>
    */
    @SerializedName("DestroyProtect")
    @Expose
    private String DestroyProtect;

    /**
    * <p>AZ information of standby 3, empty by default. Specify this parameter when you proceed to purchase a four-node primary instance.</p>
    */
    @SerializedName("FourthZone")
    @Expose
    private String FourthZone;

    /**
     * Get <p>Instance memory size. Unit: MB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain creatable memory specifications.</p> 
     * @return Memory <p>Instance memory size. Unit: MB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain creatable memory specifications.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Instance memory size. Unit: MB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain creatable memory specifications.</p>
     * @param Memory <p>Instance memory size. Unit: MB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain creatable memory specifications.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance disk size, unit: GB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the creatable disk range.</p> 
     * @return Volume <p>Instance disk size, unit: GB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the creatable disk range.</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Instance disk size, unit: GB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the creatable disk range.</p>
     * @param Volume <p>Instance disk size, unit: GB. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the creatable disk range.</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Instance duration, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p> 
     * @return Period <p>Instance duration, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Instance duration, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     * @param Period <p>Instance duration, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Instance count. Default value is 1, minimum value 1, maximum value 100.</p> 
     * @return GoodsNum <p>Instance count. Default value is 1, minimum value 1, maximum value 100.</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Instance count. Default value is 1, minimum value 1, maximum value 100.</p>
     * @param GoodsNum <p>Instance count. Default value is 1, minimum value 1, maximum value 100.</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>For AZ information, please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">Obtain the Purchasable Specifications of Cloud Databases</a> API to obtain the availability zones where instances can be created.</p><p>If you create a single-node, two-node, three-node, or four-node instance, this parameter is required. Specify an availability zone. If no availability zone is specified, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk-based cluster instance, leave this parameter blank and configure the availability zones for RWNode and read-only nodes with parameter ClusterTopology.</p> 
     * @return Zone <p>For AZ information, please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">Obtain the Purchasable Specifications of Cloud Databases</a> API to obtain the availability zones where instances can be created.</p><p>If you create a single-node, two-node, three-node, or four-node instance, this parameter is required. Specify an availability zone. If no availability zone is specified, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk-based cluster instance, leave this parameter blank and configure the availability zones for RWNode and read-only nodes with parameter ClusterTopology.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>For AZ information, please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">Obtain the Purchasable Specifications of Cloud Databases</a> API to obtain the availability zones where instances can be created.</p><p>If you create a single-node, two-node, three-node, or four-node instance, this parameter is required. Specify an availability zone. If no availability zone is specified, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk-based cluster instance, leave this parameter blank and configure the availability zones for RWNode and read-only nodes with parameter ClusterTopology.</p>
     * @param Zone <p>For AZ information, please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">Obtain the Purchasable Specifications of Cloud Databases</a> API to obtain the availability zones where instances can be created.</p><p>If you create a single-node, two-node, three-node, or four-node instance, this parameter is required. Specify an availability zone. If no availability zone is specified, the system will automatically select one (possibly not the availability zone you want to deploy in). If you create a cloud disk-based cluster instance, leave this parameter blank and configure the availability zones for RWNode and read-only nodes with parameter ClusterTopology.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.<br>Description: If you create a cloud disk edition instance, this item is required and must be VPC type. If this item is left blank, the system will select the default VPC by default.</p> 
     * @return UniqVpcId <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.<br>Description: If you create a cloud disk edition instance, this item is required and must be VPC type. If this item is left blank, the system will select the default VPC by default.</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.<br>Description: If you create a cloud disk edition instance, this item is required and must be VPC type. If this item is left blank, the system will select the default VPC by default.</p>
     * @param UniqVpcId <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.<br>Description: If you create a cloud disk edition instance, this item is required and must be VPC type. If this item is left blank, the system will select the default VPC by default.</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.<br>Description: If this item is not filled, the system will select the default subnet in the Default VPC.</p> 
     * @return UniqSubnetId <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.<br>Description: If this item is not filled, the system will select the default subnet in the Default VPC.</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.<br>Description: If this item is not filled, the system will select the default subnet in the Default VPC.</p>
     * @param UniqSubnetId <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.<br>Description: If this item is not filled, the system will select the default subnet in the Default VPC.</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Project ID. The default project is used if left empty. When you purchase a read-only instance or disaster recovery instance, the project ID is consistent with the primary instance by default.</p> 
     * @return ProjectId <p>Project ID. The default project is used if left empty. When you purchase a read-only instance or disaster recovery instance, the project ID is consistent with the primary instance by default.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. The default project is used if left empty. When you purchase a read-only instance or disaster recovery instance, the project ID is consistent with the primary instance by default.</p>
     * @param ProjectId <p>Project ID. The default project is used if left empty. When you purchase a read-only instance or disaster recovery instance, the project ID is consistent with the primary instance by default.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Custom port. Supported range: [1024-65535].<br>Description: If this item is left blank, it defaults to 3306.</p> 
     * @return Port <p>Custom port. Supported range: [1024-65535].<br>Description: If this item is left blank, it defaults to 3306.</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Custom port. Supported range: [1024-65535].<br>Description: If this item is left blank, it defaults to 3306.</p>
     * @param Port <p>Custom port. Supported range: [1024-65535].<br>Description: If this item is left blank, it defaults to 3306.</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Instance type. Supported values include: master - primary instance, dr - disaster recovery instance, ro - read-only instance.<br>Description: Select instance type. master is selected by default if left blank.</p> 
     * @return InstanceRole <p>Instance type. Supported values include: master - primary instance, dr - disaster recovery instance, ro - read-only instance.<br>Description: Select instance type. master is selected by default if left blank.</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Instance type. Supported values include: master - primary instance, dr - disaster recovery instance, ro - read-only instance.<br>Description: Select instance type. master is selected by default if left blank.</p>
     * @param InstanceRole <p>Instance type. Supported values include: master - primary instance, dr - disaster recovery instance, ro - read-only instance.<br>Description: Select instance type. master is selected by default if left blank.</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API to query the cloud database instance ID.</p> 
     * @return MasterInstanceId <p>Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API to query the cloud database instance ID.</p>
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set <p>Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API to query the cloud database instance ID.</p>
     * @param MasterInstanceId <p>Instance ID, required when purchasing a read-only instance or disaster recovery instance. This field represents the primary instance ID of the read-only instance or disaster recovery instance. Please use the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API to query the cloud database instance ID.</p>
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get <p>MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the instance version created.<br>Note: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left blank, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.</p> 
     * @return EngineVersion <p>MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the instance version created.<br>Note: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left blank, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the instance version created.<br>Note: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left blank, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.</p>
     * @param EngineVersion <p>MySQL version, including 5.5, 5.6, 5.7, and 8.0. Please use the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the instance version created.<br>Note: When creating a non-cloud disk edition instance, specify the instance version as needed (recommend 5.7 or 8.0). If this parameter is left blank, the default value is 8.0. If creating a cloud disk edition instance, this parameter can only be set to 5.7 or 8.0.</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Set the root account password. The password must contain 8 to 64 characters and at least two of the following: letters, digits, or characters (supported characters: _+-&amp;=!@#$%^*()). You can specify this parameter when purchasing a primary instance. This parameter is invalid when purchasing a read-only instance or disaster recovery instance.</p> 
     * @return Password <p>Set the root account password. The password must contain 8 to 64 characters and at least two of the following: letters, digits, or characters (supported characters: _+-&amp;=!@#$%^*()). You can specify this parameter when purchasing a primary instance. This parameter is invalid when purchasing a read-only instance or disaster recovery instance.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Set the root account password. The password must contain 8 to 64 characters and at least two of the following: letters, digits, or characters (supported characters: _+-&amp;=!@#$%^*()). You can specify this parameter when purchasing a primary instance. This parameter is invalid when purchasing a read-only instance or disaster recovery instance.</p>
     * @param Password <p>Set the root account password. The password must contain 8 to 64 characters and at least two of the following: letters, digits, or characters (supported characters: _+-&amp;=!@#$%^*()). You can specify this parameter when purchasing a primary instance. This parameter is invalid when purchasing a read-only instance or disaster recovery instance.</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p> 
     * @return ProtectMode <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     * @param ProtectMode <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>Multiple Availability Zones, defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p> 
     * @return DeployMode <p>Multiple Availability Zones, defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>Multiple Availability Zones, defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
     * @param DeployMode <p>Multiple Availability Zones, defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>AZ information of standby database 1.</p><p>For two-node, three-node, or four-node instances, specify this parameter. If not specified, it defaults to the Zone value. For cloud disk edition instances, this parameter is optional. Configure the AZ for read-write and read-only nodes with parameter ClusterTopology. Single-node instances are in a single availability zone, so no need to specify this parameter.</p> 
     * @return SlaveZone <p>AZ information of standby database 1.</p><p>For two-node, three-node, or four-node instances, specify this parameter. If not specified, it defaults to the Zone value. For cloud disk edition instances, this parameter is optional. Configure the AZ for read-write and read-only nodes with parameter ClusterTopology. Single-node instances are in a single availability zone, so no need to specify this parameter.</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>AZ information of standby database 1.</p><p>For two-node, three-node, or four-node instances, specify this parameter. If not specified, it defaults to the Zone value. For cloud disk edition instances, this parameter is optional. Configure the AZ for read-write and read-only nodes with parameter ClusterTopology. Single-node instances are in a single availability zone, so no need to specify this parameter.</p>
     * @param SlaveZone <p>AZ information of standby database 1.</p><p>For two-node, three-node, or four-node instances, specify this parameter. If not specified, it defaults to the Zone value. For cloud disk edition instances, this parameter is optional. Configure the AZ for read-write and read-only nodes with parameter ClusterTopology. Single-node instances are in a single availability zone, so no need to specify this parameter.</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>Parameter list. The parameter format is ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1. You can query the configurable parameters by referring to <a href="https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1">querying the default configurable parameter list</a>.<br>Description: table Name case sensitivity can be turned on or off by setting the parameter lower_case_table_names. a parameter Value of 0 means enabling, and a Value of 1 means disabling. If not set, the default Value is 0. If you create a MySQL 8.0 edition instance, you need to set the lower_case_table_names parameter when creating the instance to turn on or off table Name case sensitivity. After the instance is created, the parameter cannot be modified, meaning table Name case sensitivity cannot be changed once created. Instances of other database versions support modifying the lower_case_table_names parameter after creation. For the function invocation method to set table Name case sensitivity when creating an instance, please see example 3 in this document.</p> 
     * @return ParamList <p>Parameter list. The parameter format is ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1. You can query the configurable parameters by referring to <a href="https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1">querying the default configurable parameter list</a>.<br>Description: table Name case sensitivity can be turned on or off by setting the parameter lower_case_table_names. a parameter Value of 0 means enabling, and a Value of 1 means disabling. If not set, the default Value is 0. If you create a MySQL 8.0 edition instance, you need to set the lower_case_table_names parameter when creating the instance to turn on or off table Name case sensitivity. After the instance is created, the parameter cannot be modified, meaning table Name case sensitivity cannot be changed once created. Instances of other database versions support modifying the lower_case_table_names parameter after creation. For the function invocation method to set table Name case sensitivity when creating an instance, please see example 3 in this document.</p>
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>Parameter list. The parameter format is ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1. You can query the configurable parameters by referring to <a href="https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1">querying the default configurable parameter list</a>.<br>Description: table Name case sensitivity can be turned on or off by setting the parameter lower_case_table_names. a parameter Value of 0 means enabling, and a Value of 1 means disabling. If not set, the default Value is 0. If you create a MySQL 8.0 edition instance, you need to set the lower_case_table_names parameter when creating the instance to turn on or off table Name case sensitivity. After the instance is created, the parameter cannot be modified, meaning table Name case sensitivity cannot be changed once created. Instances of other database versions support modifying the lower_case_table_names parameter after creation. For the function invocation method to set table Name case sensitivity when creating an instance, please see example 3 in this document.</p>
     * @param ParamList <p>Parameter list. The parameter format is ParamList.0.Name=auto_increment&amp;ParamList.0.Value=1. You can query the configurable parameters by referring to <a href="https://www.tencentcloud.com/document/api/236/32662?from_cn_redirect=1">querying the default configurable parameter list</a>.<br>Description: table Name case sensitivity can be turned on or off by setting the parameter lower_case_table_names. a parameter Value of 0 means enabling, and a Value of 1 means disabling. If not set, the default Value is 0. If you create a MySQL 8.0 edition instance, you need to set the lower_case_table_names parameter when creating the instance to turn on or off table Name case sensitivity. After the instance is created, the parameter cannot be modified, meaning table Name case sensitivity cannot be changed once created. Instances of other database versions support modifying the lower_case_table_names parameter after creation. For the function invocation method to set table Name case sensitivity when creating an instance, please see example 3 in this document.</p>
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>AZ information of standby 2, empty by default.</p><p>Specify this parameter when you proceed to purchase a three-node primary instance or a four-node primary instance.</p> 
     * @return BackupZone <p>AZ information of standby 2, empty by default.</p><p>Specify this parameter when you proceed to purchase a three-node primary instance or a four-node primary instance.</p>
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set <p>AZ information of standby 2, empty by default.</p><p>Specify this parameter when you proceed to purchase a three-node primary instance or a four-node primary instance.</p>
     * @param BackupZone <p>AZ information of standby 2, empty by default.</p><p>Specify this parameter when you proceed to purchase a three-node primary instance or a four-node primary instance.</p>
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get <p>Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.</p> 
     * @return AutoRenewFlag <p>Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.</p>
     * @param AutoRenewFlag <p>Auto-renewal flag. Available values are: 0 - no auto-renewal; 1 - auto-renewal. Default is 0.</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Region of the primary instance. This field is required when you purchase a disaster recovery or RO instance.</p> 
     * @return MasterRegion <p>Region of the primary instance. This field is required when you purchase a disaster recovery or RO instance.</p>
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set <p>Region of the primary instance. This field is required when you purchase a disaster recovery or RO instance.</p>
     * @param MasterRegion <p>Region of the primary instance. This field is required when you purchase a disaster recovery or RO instance.</p>
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get <p>Security group parameters. Use the API <a href="https://www.tencentcloud.com/document/api/236/15850?from_cn_redirect=1">Query Project Security Group Information</a> to query security group details of a certain project.</p> 
     * @return SecurityGroup <p>Security group parameters. Use the API <a href="https://www.tencentcloud.com/document/api/236/15850?from_cn_redirect=1">Query Project Security Group Information</a> to query security group details of a certain project.</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>Security group parameters. Use the API <a href="https://www.tencentcloud.com/document/api/236/15850?from_cn_redirect=1">Query Project Security Group Information</a> to query security group details of a certain project.</p>
     * @param SecurityGroup <p>Security group parameters. Use the API <a href="https://www.tencentcloud.com/document/api/236/15850?from_cn_redirect=1">Query Project Security Group Information</a> to query security group details of a certain project.</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>Read-only instance parameter. This parameter is required when you purchase a read-only instance.</p> 
     * @return RoGroup <p>Read-only instance parameter. This parameter is required when you purchase a read-only instance.</p>
     */
    public RoGroup getRoGroup() {
        return this.RoGroup;
    }

    /**
     * Set <p>Read-only instance parameter. This parameter is required when you purchase a read-only instance.</p>
     * @param RoGroup <p>Read-only instance parameter. This parameter is required when you purchase a read-only instance.</p>
     */
    public void setRoGroup(RoGroup RoGroup) {
        this.RoGroup = RoGroup;
    }

    /**
     * Get <p>Instance name. When you purchase multiple instances only once, suffix numbers are used for case-sensitive instance naming. For example, instnaceName=db and goodsNum=3, the instance names are db1, db2, and db3 respectively.</p> 
     * @return InstanceName <p>Instance name. When you purchase multiple instances only once, suffix numbers are used for case-sensitive instance naming. For example, instnaceName=db and goodsNum=3, the instance names are db1, db2, and db3 respectively.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name. When you purchase multiple instances only once, suffix numbers are used for case-sensitive instance naming. For example, instnaceName=db and goodsNum=3, the instance names are db1, db2, and db3 respectively.</p>
     * @param InstanceName <p>Instance name. When you purchase multiple instances only once, suffix numbers are used for case-sensitive instance naming. For example, instnaceName=db and goodsNum=3, the instance names are db1, db2, and db3 respectively.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Tag information of the instance.</p> 
     * @return ResourceTags <p>Tag information of the instance.</p>
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Tag information of the instance.</p>
     * @param ResourceTags <p>Tag information of the instance.</p>
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Placement group ID.</p> 
     * @return DeployGroupId <p>Placement group ID.</p>
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set <p>Placement group ID.</p>
     * @param DeployGroupId <p>Placement group ID.</p>
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get <p>String used to ensure request idempotency. This string is generated by the customer and must be unique between different requests within 48 hours, with a maximum value of 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p> 
     * @return ClientToken <p>String used to ensure request idempotency. This string is generated by the customer and must be unique between different requests within 48 hours, with a maximum value of 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>String used to ensure request idempotency. This string is generated by the customer and must be unique between different requests within 48 hours, with a maximum value of 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
     * @param ClientToken <p>String used to ensure request idempotency. This string is generated by the customer and must be unique between different requests within 48 hours, with a maximum value of 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Instance isolation type.</p><p>Enumeration values:</p><ul><li><p>UNIVERSAL: General-purpose instance</p></li><li><p>EXCLUSIVE: Dedicated instance</p></li><li><p>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_ULTRA: Premium type of cloud disk edition</p></li><li><p>If this parameter is not specified, it defaults to general-purpose instance.</p></li><li><p>Required if you create a cloud disk edition instance.</p></li><li><p>If you create a single-node instance, fill in this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes equal to 1.</p></li></ul> 
     * @return DeviceType <p>Instance isolation type.</p><p>Enumeration values:</p><ul><li><p>UNIVERSAL: General-purpose instance</p></li><li><p>EXCLUSIVE: Dedicated instance</p></li><li><p>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_ULTRA: Premium type of cloud disk edition</p></li><li><p>If this parameter is not specified, it defaults to general-purpose instance.</p></li><li><p>Required if you create a cloud disk edition instance.</p></li><li><p>If you create a single-node instance, fill in this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes equal to 1.</p></li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance isolation type.</p><p>Enumeration values:</p><ul><li><p>UNIVERSAL: General-purpose instance</p></li><li><p>EXCLUSIVE: Dedicated instance</p></li><li><p>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_ULTRA: Premium type of cloud disk edition</p></li><li><p>If this parameter is not specified, it defaults to general-purpose instance.</p></li><li><p>Required if you create a cloud disk edition instance.</p></li><li><p>If you create a single-node instance, fill in this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes equal to 1.</p></li></ul>
     * @param DeviceType <p>Instance isolation type.</p><p>Enumeration values:</p><ul><li><p>UNIVERSAL: General-purpose instance</p></li><li><p>EXCLUSIVE: Dedicated instance</p></li><li><p>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</p></li><li><p>CLOUD_NATIVE_CLUSTER_ULTRA: Premium type of cloud disk edition</p></li><li><p>If this parameter is not specified, it defaults to general-purpose instance.</p></li><li><p>Required if you create a cloud disk edition instance.</p></li><li><p>If you create a single-node instance, fill in this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes equal to 1.</p></li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Parameter template ID.<br>Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, the input ID is invalid and you need to set ParamTemplateType.</p> 
     * @return ParamTemplateId <p>Parameter template ID.<br>Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, the input ID is invalid and you need to set ParamTemplateType.</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>Parameter template ID.<br>Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, the input ID is invalid and you need to set ParamTemplateType.</p>
     * @param ParamTemplateId <p>Parameter template ID.<br>Remark: If you use a custom parameter template ID, you can input the custom parameter template ID. If you plan to use the default parameter template, the input ID is invalid and you need to set ParamTemplateType.</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>Array of alarm policy IDs. OriginId returned by the Tencent Cloud observability platform DescribeAlarmPolicy API.</p> 
     * @return AlarmPolicyList <p>Array of alarm policy IDs. OriginId returned by the Tencent Cloud observability platform DescribeAlarmPolicy API.</p>
     */
    public Long [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set <p>Array of alarm policy IDs. OriginId returned by the Tencent Cloud observability platform DescribeAlarmPolicy API.</p>
     * @param AlarmPolicyList <p>Array of alarm policy IDs. OriginId returned by the Tencent Cloud observability platform DescribeAlarmPolicy API.</p>
     */
    public void setAlarmPolicyList(Long [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get <p>Number of instance nodes.</p><p>For RO and single-node instances, the default value is 1. To purchase a three-node instance, set this value to 3 or specify the BackupZone parameter. When purchasing a primary instance without specifying this parameter or the BackupZone parameter, the default value is 2, meaning a dual-node instance will be purchased. To purchase a four-node instance, set this value to 4 or specify the FourthZone parameter.</p> 
     * @return InstanceNodes <p>Number of instance nodes.</p><p>For RO and single-node instances, the default value is 1. To purchase a three-node instance, set this value to 3 or specify the BackupZone parameter. When purchasing a primary instance without specifying this parameter or the BackupZone parameter, the default value is 2, meaning a dual-node instance will be purchased. To purchase a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>Number of instance nodes.</p><p>For RO and single-node instances, the default value is 1. To purchase a three-node instance, set this value to 3 or specify the BackupZone parameter. When purchasing a primary instance without specifying this parameter or the BackupZone parameter, the default value is 2, meaning a dual-node instance will be purchased. To purchase a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
     * @param InstanceNodes <p>Number of instance nodes.</p><p>For RO and single-node instances, the default value is 1. To purchase a three-node instance, set this value to 3 or specify the BackupZone parameter. When purchasing a primary instance without specifying this parameter or the BackupZone parameter, the default value is 2, meaning a dual-node instance will be purchased. To purchase a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>Number of Cpu cores of the instance.</p><p>When multiple Cpu configurations exist for the Memory specification (for example, 64000MB Memory corresponds to 8-core/16-core/32-core), the Cpu parameter must be provided.</p> 
     * @return Cpu <p>Number of Cpu cores of the instance.</p><p>When multiple Cpu configurations exist for the Memory specification (for example, 64000MB Memory corresponds to 8-core/16-core/32-core), the Cpu parameter must be provided.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Number of Cpu cores of the instance.</p><p>When multiple Cpu configurations exist for the Memory specification (for example, 64000MB Memory corresponds to 8-core/16-core/32-core), the Cpu parameter must be provided.</p>
     * @param Cpu <p>Number of Cpu cores of the instance.</p><p>When multiple Cpu configurations exist for the Memory specification (for example, 64000MB Memory corresponds to 8-core/16-core/32-core), the Cpu parameter must be provided.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Whether to automatically initiate disaster recovery sync. This parameter only takes effect when purchasing a disaster recovery instance. Available values are: 0 - Do not automatically initiate disaster recovery sync; 1 - Automatically initiate disaster recovery sync. The default is 0.</p> 
     * @return AutoSyncFlag <p>Whether to automatically initiate disaster recovery sync. This parameter only takes effect when purchasing a disaster recovery instance. Available values are: 0 - Do not automatically initiate disaster recovery sync; 1 - Automatically initiate disaster recovery sync. The default is 0.</p>
     */
    public Long getAutoSyncFlag() {
        return this.AutoSyncFlag;
    }

    /**
     * Set <p>Whether to automatically initiate disaster recovery sync. This parameter only takes effect when purchasing a disaster recovery instance. Available values are: 0 - Do not automatically initiate disaster recovery sync; 1 - Automatically initiate disaster recovery sync. The default is 0.</p>
     * @param AutoSyncFlag <p>Whether to automatically initiate disaster recovery sync. This parameter only takes effect when purchasing a disaster recovery instance. Available values are: 0 - Do not automatically initiate disaster recovery sync; 1 - Automatically initiate disaster recovery sync. The default is 0.</p>
     */
    public void setAutoSyncFlag(Long AutoSyncFlag) {
        this.AutoSyncFlag = AutoSyncFlag;
    }

    /**
     * Get <p>Financial Enclosure ID.</p> 
     * @return CageId <p>Financial Enclosure ID.</p>
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set <p>Financial Enclosure ID.</p>
     * @param CageId <p>Financial Enclosure ID.</p>
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get <p>Default parameter template type. Supported values include "HIGH_STABILITY" - HIGH-STABILITY template, "HIGH_PERFORMANCE" - HIGH-PERFORMANCE template.<br>Remark: If you need to use TencentDB for MySQL default parameter template, set up ParamTemplateType.</p> 
     * @return ParamTemplateType <p>Default parameter template type. Supported values include "HIGH_STABILITY" - HIGH-STABILITY template, "HIGH_PERFORMANCE" - HIGH-PERFORMANCE template.<br>Remark: If you need to use TencentDB for MySQL default parameter template, set up ParamTemplateType.</p>
     */
    public String getParamTemplateType() {
        return this.ParamTemplateType;
    }

    /**
     * Set <p>Default parameter template type. Supported values include "HIGH_STABILITY" - HIGH-STABILITY template, "HIGH_PERFORMANCE" - HIGH-PERFORMANCE template.<br>Remark: If you need to use TencentDB for MySQL default parameter template, set up ParamTemplateType.</p>
     * @param ParamTemplateType <p>Default parameter template type. Supported values include "HIGH_STABILITY" - HIGH-STABILITY template, "HIGH_PERFORMANCE" - HIGH-PERFORMANCE template.<br>Remark: If you need to use TencentDB for MySQL default parameter template, set up ParamTemplateType.</p>
     */
    public void setParamTemplateType(String ParamTemplateType) {
        this.ParamTemplateType = ParamTemplateType;
    }

    /**
     * Get <p>Alarm policy name array, such as ["policy-uyoee9wg"]. This parameter is invalid when AlarmPolicyList is not empty.</p> 
     * @return AlarmPolicyIdList <p>Alarm policy name array, such as ["policy-uyoee9wg"]. This parameter is invalid when AlarmPolicyList is not empty.</p>
     */
    public String [] getAlarmPolicyIdList() {
        return this.AlarmPolicyIdList;
    }

    /**
     * Set <p>Alarm policy name array, such as ["policy-uyoee9wg"]. This parameter is invalid when AlarmPolicyList is not empty.</p>
     * @param AlarmPolicyIdList <p>Alarm policy name array, such as ["policy-uyoee9wg"]. This parameter is invalid when AlarmPolicyList is not empty.</p>
     */
    public void setAlarmPolicyIdList(String [] AlarmPolicyIdList) {
        this.AlarmPolicyIdList = AlarmPolicyIdList;
    }

    /**
     * Get <p>Whether to perform a pre-check only for this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check fails, return the corresponding error code; if the check passes, return RequestId. false: Send a normal request and create an instance directly after the check passes.<br>Default to false.</p> 
     * @return DryRun <p>Whether to perform a pre-check only for this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check fails, return the corresponding error code; if the check passes, return RequestId. false: Send a normal request and create an instance directly after the check passes.<br>Default to false.</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to perform a pre-check only for this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check fails, return the corresponding error code; if the check passes, return RequestId. false: Send a normal request and create an instance directly after the check passes.<br>Default to false.</p>
     * @param DryRun <p>Whether to perform a pre-check only for this request. true: Send a check request without creating an instance. Check items include whether required parameters are filled, request format, and service limit. If the check fails, return the corresponding error code; if the check passes, return RequestId. false: Send a normal request and create an instance directly after the check passes.<br>Default to false.</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".</p> 
     * @return EngineType <p>Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".</p>
     * @param EngineType <p>Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>Specify the IP list of the instance. Only the primary instance is supported. Process by instance sequence. Handle as unspecified if insufficient.</p> 
     * @return Vips <p>Specify the IP list of the instance. Only the primary instance is supported. Process by instance sequence. Handle as unspecified if insufficient.</p>
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set <p>Specify the IP list of the instance. Only the primary instance is supported. Process by instance sequence. Handle as unspecified if insufficient.</p>
     * @param Vips <p>Specify the IP list of the instance. Only the primary instance is supported. Process by instance sequence. Handle as unspecified if insufficient.</p>
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get <p>The data protection space size of the cloud disk edition instance, in GB, has a setting range of 1 - 10.</p> 
     * @return DataProtectVolume <p>The data protection space size of the cloud disk edition instance, in GB, has a setting range of 1 - 10.</p>
     */
    public Long getDataProtectVolume() {
        return this.DataProtectVolume;
    }

    /**
     * Set <p>The data protection space size of the cloud disk edition instance, in GB, has a setting range of 1 - 10.</p>
     * @param DataProtectVolume <p>The data protection space size of the cloud disk edition instance, in GB, has a setting range of 1 - 10.</p>
     */
    public void setDataProtectVolume(Long DataProtectVolume) {
        this.DataProtectVolume = DataProtectVolume;
    }

    /**
     * Get <p>Topology configuration of cloud disk edition instance nodes.</p><p>If a cloud disk edition instance is purchased, this parameter is required. Set the topology of RW and RO nodes for the cloud disk edition instance. The node scope of RO nodes is 1-5. Set at least 1 RO node.</p> 
     * @return ClusterTopology <p>Topology configuration of cloud disk edition instance nodes.</p><p>If a cloud disk edition instance is purchased, this parameter is required. Set the topology of RW and RO nodes for the cloud disk edition instance. The node scope of RO nodes is 1-5. Set at least 1 RO node.</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>Topology configuration of cloud disk edition instance nodes.</p><p>If a cloud disk edition instance is purchased, this parameter is required. Set the topology of RW and RO nodes for the cloud disk edition instance. The node scope of RO nodes is 1-5. Set at least 1 RO node.</p>
     * @param ClusterTopology <p>Topology configuration of cloud disk edition instance nodes.</p><p>If a cloud disk edition instance is purchased, this parameter is required. Set the topology of RW and RO nodes for the cloud disk edition instance. The node scope of RO nodes is 1-5. Set at least 1 RO node.</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>Disk type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instances. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD means enhanced SSD cloud disk, and CLOUD_PREMIUM means high-performance cloud block storage.<br>Note: The supported regions for hard disk types of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For specific support situation, refer to <a href="https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1">Regions and Availability Zones</a>.</p> 
     * @return DiskType <p>Disk type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instances. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD means enhanced SSD cloud disk, and CLOUD_PREMIUM means high-performance cloud block storage.<br>Note: The supported regions for hard disk types of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For specific support situation, refer to <a href="https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Disk type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instances. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD means enhanced SSD cloud disk, and CLOUD_PREMIUM means high-performance cloud block storage.<br>Note: The supported regions for hard disk types of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For specific support situation, refer to <a href="https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     * @param DiskType <p>Disk type. This parameter can be specified for single-node (cloud disk edition) or cloud disk edition instances. CLOUD_SSD means SSD Cloud Block Storage, CLOUD_HSSD means enhanced SSD cloud disk, and CLOUD_PREMIUM means high-performance cloud block storage.<br>Note: The supported regions for hard disk types of single-node (cloud disk edition) and cloud disk edition instances vary slightly. For specific support situation, refer to <a href="https://www.tencentcloud.com/document/product/236/8458?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Turn on or off instance destruction protection. on - turn on, off - turn off.</p> 
     * @return DestroyProtect <p>Turn on or off instance destruction protection. on - turn on, off - turn off.</p>
     */
    public String getDestroyProtect() {
        return this.DestroyProtect;
    }

    /**
     * Set <p>Turn on or off instance destruction protection. on - turn on, off - turn off.</p>
     * @param DestroyProtect <p>Turn on or off instance destruction protection. on - turn on, off - turn off.</p>
     */
    public void setDestroyProtect(String DestroyProtect) {
        this.DestroyProtect = DestroyProtect;
    }

    /**
     * Get <p>AZ information of standby 3, empty by default. Specify this parameter when you proceed to purchase a four-node primary instance.</p> 
     * @return FourthZone <p>AZ information of standby 3, empty by default. Specify this parameter when you proceed to purchase a four-node primary instance.</p>
     */
    public String getFourthZone() {
        return this.FourthZone;
    }

    /**
     * Set <p>AZ information of standby 3, empty by default. Specify this parameter when you proceed to purchase a four-node primary instance.</p>
     * @param FourthZone <p>AZ information of standby 3, empty by default. Specify this parameter when you proceed to purchase a four-node primary instance.</p>
     */
    public void setFourthZone(String FourthZone) {
        this.FourthZone = FourthZone;
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
        if (source.FourthZone != null) {
            this.FourthZone = new String(source.FourthZone);
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
        this.setParamSimple(map, prefix + "FourthZone", this.FourthZone);

    }
}

