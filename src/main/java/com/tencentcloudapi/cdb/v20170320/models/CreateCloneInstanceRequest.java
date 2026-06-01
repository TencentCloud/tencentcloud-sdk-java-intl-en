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

public class CreateCloneInstanceRequest extends AbstractModel {

    /**
    * <p>Clone source instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>If necessary, specify this value when cloning an instance and rolling back to a specified time. The time format is yyyy-mm-dd hh:mm:ss.<br>Note: This parameter and the SpecifiedBackupId parameter require a choice between the two for configuration.</p>
    */
    @SerializedName("SpecifiedRollbackTime")
    @Expose
    private String SpecifiedRollbackTime;

    /**
    * <p>If necessary to clone an instance and roll back to a designated backup set, specify this value as the Id of the backup file. Please use <a href="/document/api/236/15842">query data backup file list</a>.</p><p>If it is a clone of a two-node, three-node, or four-node instance, the backup file is a physical backup. If it is a clone of a single-node or cloud disk edition instance, the backup file is a snapshot backup.</p>
    */
    @SerializedName("SpecifiedBackupId")
    @Expose
    private Long SpecifiedBackupId;

    /**
    * <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Instance memory size, unit: MB, must not be less than the clone source instance. Default is same as the source instance.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance disk size, unit: GB, must not be less than the clone source instance. Default is same as the source instance.</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Name of the newly generated clone instance. Support input of up to 60 characters.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Security group parameters. Use the API <a href="https://www.tencentcloud.com/document/api/236/15850?from_cn_redirect=1">Query Project Security Group Information</a> to query security group details of a certain project.</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>Tag information of the instance.</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * <p>Instance Cpu cores, must not be less than the clone source instance. Default is same as the source instance.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

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
    * <p>The AZ information of the newly generated clone instance standby 1 is the same as the source instance Zone by default.</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>AZ information of standby 2, empty by default. Specify this parameter when you clone a strong sync primary instance.</p>
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * <p>Clone instance type. Supported values include: "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk. If not specified, it defaults to general-purpose instance.</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Number of nodes in the new clone instance.</p><p>To clone a three-node instance, set this value to 3 or specify the BackupZone parameter. To clone a dual-node instance, set this value to 2. By default, a dual-node instance is cloned. To clone a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>Placement group ID.</p>
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * <p>Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include required parameters, request format, and service limits. If the check fails, return the corresponding error code; if the check passes, return RequestId. Default false: Send a normal request and create the instance directly after passing the check.</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Financial Enclosure ID.</p>
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * <p>Project ID. Default project ID 0.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Payment type. Valid values: PRE_PAID (prepaid, also known as yearly/monthly subscription) and USED_PAID (pay-as-you-go). Default billing mode is pay-as-you-go.</p>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>Instance duration, required when PayType is PRE_PAID, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Topology configuration for cloud disk edition nodes.</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>Original instance region. Required when importing a remote backup, for example: ap-guangzhou</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>Offsite data backup id</p>
    */
    @SerializedName("SpecifiedSubBackupId")
    @Expose
    private Long SpecifiedSubBackupId;

    /**
    * <p>The AZ information of the newly generated clone instance primary database is the same as the source instance Zone by default.</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>The AZ information of the newly generated clone instance's primary database defaults to the same as the source instance's Zone.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>AZ information of standby 3, empty by default. Specify this parameter when you proceed to purchase a four-node primary instance.</p>
    */
    @SerializedName("FourthZone")
    @Expose
    private String FourthZone;

    /**
     * Get <p>Clone source instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p> 
     * @return InstanceId <p>Clone source instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Clone source instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     * @param InstanceId <p>Clone source instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>If necessary, specify this value when cloning an instance and rolling back to a specified time. The time format is yyyy-mm-dd hh:mm:ss.<br>Note: This parameter and the SpecifiedBackupId parameter require a choice between the two for configuration.</p> 
     * @return SpecifiedRollbackTime <p>If necessary, specify this value when cloning an instance and rolling back to a specified time. The time format is yyyy-mm-dd hh:mm:ss.<br>Note: This parameter and the SpecifiedBackupId parameter require a choice between the two for configuration.</p>
     */
    public String getSpecifiedRollbackTime() {
        return this.SpecifiedRollbackTime;
    }

    /**
     * Set <p>If necessary, specify this value when cloning an instance and rolling back to a specified time. The time format is yyyy-mm-dd hh:mm:ss.<br>Note: This parameter and the SpecifiedBackupId parameter require a choice between the two for configuration.</p>
     * @param SpecifiedRollbackTime <p>If necessary, specify this value when cloning an instance and rolling back to a specified time. The time format is yyyy-mm-dd hh:mm:ss.<br>Note: This parameter and the SpecifiedBackupId parameter require a choice between the two for configuration.</p>
     */
    public void setSpecifiedRollbackTime(String SpecifiedRollbackTime) {
        this.SpecifiedRollbackTime = SpecifiedRollbackTime;
    }

    /**
     * Get <p>If necessary to clone an instance and roll back to a designated backup set, specify this value as the Id of the backup file. Please use <a href="/document/api/236/15842">query data backup file list</a>.</p><p>If it is a clone of a two-node, three-node, or four-node instance, the backup file is a physical backup. If it is a clone of a single-node or cloud disk edition instance, the backup file is a snapshot backup.</p> 
     * @return SpecifiedBackupId <p>If necessary to clone an instance and roll back to a designated backup set, specify this value as the Id of the backup file. Please use <a href="/document/api/236/15842">query data backup file list</a>.</p><p>If it is a clone of a two-node, three-node, or four-node instance, the backup file is a physical backup. If it is a clone of a single-node or cloud disk edition instance, the backup file is a snapshot backup.</p>
     */
    public Long getSpecifiedBackupId() {
        return this.SpecifiedBackupId;
    }

    /**
     * Set <p>If necessary to clone an instance and roll back to a designated backup set, specify this value as the Id of the backup file. Please use <a href="/document/api/236/15842">query data backup file list</a>.</p><p>If it is a clone of a two-node, three-node, or four-node instance, the backup file is a physical backup. If it is a clone of a single-node or cloud disk edition instance, the backup file is a snapshot backup.</p>
     * @param SpecifiedBackupId <p>If necessary to clone an instance and roll back to a designated backup set, specify this value as the Id of the backup file. Please use <a href="/document/api/236/15842">query data backup file list</a>.</p><p>If it is a clone of a two-node, three-node, or four-node instance, the backup file is a physical backup. If it is a clone of a single-node or cloud disk edition instance, the backup file is a snapshot backup.</p>
     */
    public void setSpecifiedBackupId(Long SpecifiedBackupId) {
        this.SpecifiedBackupId = SpecifiedBackupId;
    }

    /**
     * Get <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.</p> 
     * @return UniqVpcId <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.</p>
     * @param UniqVpcId <p>VPC ID. Please use <a href="/document/api/215/15778">Querying VPC List</a>.</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.</p> 
     * @return UniqSubnetId <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.</p>
     * @param UniqSubnetId <p>Subnet ID in the private network. If UniqVpcId is set up, UniqSubnetId is required. Please use <a href="/document/api/215/15784">query subnet list</a>.</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Instance memory size, unit: MB, must not be less than the clone source instance. Default is same as the source instance.</p> 
     * @return Memory <p>Instance memory size, unit: MB, must not be less than the clone source instance. Default is same as the source instance.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Instance memory size, unit: MB, must not be less than the clone source instance. Default is same as the source instance.</p>
     * @param Memory <p>Instance memory size, unit: MB, must not be less than the clone source instance. Default is same as the source instance.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance disk size, unit: GB, must not be less than the clone source instance. Default is same as the source instance.</p> 
     * @return Volume <p>Instance disk size, unit: GB, must not be less than the clone source instance. Default is same as the source instance.</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Instance disk size, unit: GB, must not be less than the clone source instance. Default is same as the source instance.</p>
     * @param Volume <p>Instance disk size, unit: GB, must not be less than the clone source instance. Default is same as the source instance.</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Name of the newly generated clone instance. Support input of up to 60 characters.</p> 
     * @return InstanceName <p>Name of the newly generated clone instance. Support input of up to 60 characters.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Name of the newly generated clone instance. Support input of up to 60 characters.</p>
     * @param InstanceName <p>Name of the newly generated clone instance. Support input of up to 60 characters.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>Instance Cpu cores, must not be less than the clone source instance. Default is same as the source instance.</p> 
     * @return Cpu <p>Instance Cpu cores, must not be less than the clone source instance. Default is same as the source instance.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Instance Cpu cores, must not be less than the clone source instance. Default is same as the source instance.</p>
     * @param Cpu <p>Instance Cpu cores, must not be less than the clone source instance. Default is same as the source instance.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
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
     * Get <p>The AZ information of the newly generated clone instance standby 1 is the same as the source instance Zone by default.</p> 
     * @return SlaveZone <p>The AZ information of the newly generated clone instance standby 1 is the same as the source instance Zone by default.</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>The AZ information of the newly generated clone instance standby 1 is the same as the source instance Zone by default.</p>
     * @param SlaveZone <p>The AZ information of the newly generated clone instance standby 1 is the same as the source instance Zone by default.</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>AZ information of standby 2, empty by default. Specify this parameter when you clone a strong sync primary instance.</p> 
     * @return BackupZone <p>AZ information of standby 2, empty by default. Specify this parameter when you clone a strong sync primary instance.</p>
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set <p>AZ information of standby 2, empty by default. Specify this parameter when you clone a strong sync primary instance.</p>
     * @param BackupZone <p>AZ information of standby 2, empty by default. Specify this parameter when you clone a strong sync primary instance.</p>
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get <p>Clone instance type. Supported values include: "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk. If not specified, it defaults to general-purpose instance.</p> 
     * @return DeviceType <p>Clone instance type. Supported values include: "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk. If not specified, it defaults to general-purpose instance.</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Clone instance type. Supported values include: "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk. If not specified, it defaults to general-purpose instance.</p>
     * @param DeviceType <p>Clone instance type. Supported values include: "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk. If not specified, it defaults to general-purpose instance.</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Number of nodes in the new clone instance.</p><p>To clone a three-node instance, set this value to 3 or specify the BackupZone parameter. To clone a dual-node instance, set this value to 2. By default, a dual-node instance is cloned. To clone a four-node instance, set this value to 4 or specify the FourthZone parameter.</p> 
     * @return InstanceNodes <p>Number of nodes in the new clone instance.</p><p>To clone a three-node instance, set this value to 3 or specify the BackupZone parameter. To clone a dual-node instance, set this value to 2. By default, a dual-node instance is cloned. To clone a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>Number of nodes in the new clone instance.</p><p>To clone a three-node instance, set this value to 3 or specify the BackupZone parameter. To clone a dual-node instance, set this value to 2. By default, a dual-node instance is cloned. To clone a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
     * @param InstanceNodes <p>Number of nodes in the new clone instance.</p><p>To clone a three-node instance, set this value to 3 or specify the BackupZone parameter. To clone a dual-node instance, set this value to 2. By default, a dual-node instance is cloned. To clone a four-node instance, set this value to 4 or specify the FourthZone parameter.</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
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
     * Get <p>Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include required parameters, request format, and service limits. If the check fails, return the corresponding error code; if the check passes, return RequestId. Default false: Send a normal request and create the instance directly after passing the check.</p> 
     * @return DryRun <p>Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include required parameters, request format, and service limits. If the check fails, return the corresponding error code; if the check passes, return RequestId. Default false: Send a normal request and create the instance directly after passing the check.</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include required parameters, request format, and service limits. If the check fails, return the corresponding error code; if the check passes, return RequestId. Default false: Send a normal request and create the instance directly after passing the check.</p>
     * @param DryRun <p>Whether to only pre-check this request. true: Send a check request without creating an instance. Check items include required parameters, request format, and service limits. If the check fails, return the corresponding error code; if the check passes, return RequestId. Default false: Send a normal request and create the instance directly after passing the check.</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
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
     * Get <p>Project ID. Default project ID 0.</p> 
     * @return ProjectId <p>Project ID. Default project ID 0.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. Default project ID 0.</p>
     * @param ProjectId <p>Project ID. Default project ID 0.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Payment type. Valid values: PRE_PAID (prepaid, also known as yearly/monthly subscription) and USED_PAID (pay-as-you-go). Default billing mode is pay-as-you-go.</p> 
     * @return PayType <p>Payment type. Valid values: PRE_PAID (prepaid, also known as yearly/monthly subscription) and USED_PAID (pay-as-you-go). Default billing mode is pay-as-you-go.</p>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>Payment type. Valid values: PRE_PAID (prepaid, also known as yearly/monthly subscription) and USED_PAID (pay-as-you-go). Default billing mode is pay-as-you-go.</p>
     * @param PayType <p>Payment type. Valid values: PRE_PAID (prepaid, also known as yearly/monthly subscription) and USED_PAID (pay-as-you-go). Default billing mode is pay-as-you-go.</p>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>Instance duration, required when PayType is PRE_PAID, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p> 
     * @return Period <p>Instance duration, required when PayType is PRE_PAID, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Instance duration, required when PayType is PRE_PAID, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     * @param Period <p>Instance duration, required when PayType is PRE_PAID, measurement unit: month, optional values include [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Topology configuration for cloud disk edition nodes.</p> 
     * @return ClusterTopology <p>Topology configuration for cloud disk edition nodes.</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>Topology configuration for cloud disk edition nodes.</p>
     * @param ClusterTopology <p>Topology configuration for cloud disk edition nodes.</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>Original instance region. Required when importing a remote backup, for example: ap-guangzhou</p> 
     * @return SrcRegion <p>Original instance region. Required when importing a remote backup, for example: ap-guangzhou</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>Original instance region. Required when importing a remote backup, for example: ap-guangzhou</p>
     * @param SrcRegion <p>Original instance region. Required when importing a remote backup, for example: ap-guangzhou</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>Offsite data backup id</p> 
     * @return SpecifiedSubBackupId <p>Offsite data backup id</p>
     */
    public Long getSpecifiedSubBackupId() {
        return this.SpecifiedSubBackupId;
    }

    /**
     * Set <p>Offsite data backup id</p>
     * @param SpecifiedSubBackupId <p>Offsite data backup id</p>
     */
    public void setSpecifiedSubBackupId(Long SpecifiedSubBackupId) {
        this.SpecifiedSubBackupId = SpecifiedSubBackupId;
    }

    /**
     * Get <p>The AZ information of the newly generated clone instance primary database is the same as the source instance Zone by default.</p> 
     * @return MasterZone <p>The AZ information of the newly generated clone instance primary database is the same as the source instance Zone by default.</p>
     * @deprecated
     */
    @Deprecated
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>The AZ information of the newly generated clone instance primary database is the same as the source instance Zone by default.</p>
     * @param MasterZone <p>The AZ information of the newly generated clone instance primary database is the same as the source instance Zone by default.</p>
     * @deprecated
     */
    @Deprecated
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get <p>The AZ information of the newly generated clone instance's primary database defaults to the same as the source instance's Zone.</p> 
     * @return Zone <p>The AZ information of the newly generated clone instance's primary database defaults to the same as the source instance's Zone.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>The AZ information of the newly generated clone instance's primary database defaults to the same as the source instance's Zone.</p>
     * @param Zone <p>The AZ information of the newly generated clone instance's primary database defaults to the same as the source instance's Zone.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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

    public CreateCloneInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloneInstanceRequest(CreateCloneInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpecifiedRollbackTime != null) {
            this.SpecifiedRollbackTime = new String(source.SpecifiedRollbackTime);
        }
        if (source.SpecifiedBackupId != null) {
            this.SpecifiedBackupId = new Long(source.SpecifiedBackupId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
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
        if (source.BackupZone != null) {
            this.BackupZone = new String(source.BackupZone);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SpecifiedSubBackupId != null) {
            this.SpecifiedSubBackupId = new Long(source.SpecifiedSubBackupId);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.FourthZone != null) {
            this.FourthZone = new String(source.FourthZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecifiedRollbackTime", this.SpecifiedRollbackTime);
        this.setParamSimple(map, prefix + "SpecifiedBackupId", this.SpecifiedBackupId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "SpecifiedSubBackupId", this.SpecifiedSubBackupId);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "FourthZone", this.FourthZone);

    }
}

