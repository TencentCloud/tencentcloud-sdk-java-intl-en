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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceDetailResponse extends AbstractModel {

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Region</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Character type vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Character type subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Create an instance version</p>
    */
    @SerializedName("CreateVersion")
    @Expose
    private String CreateVersion;

    /**
    * <p>Subnet IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Subnet port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Node disk capacity (unit: GB)</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>Number of storage nodes</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>Initialize instance parameters</p>
    */
    @SerializedName("InitParams")
    @Expose
    private InstanceParam [] InitParams;

    /**
    * <p>Instance tag information.</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Number of storage node replicas</p>
    */
    @SerializedName("Replications")
    @Expose
    private Long Replications;

    /**
    * <p>Number of replicas</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>Character set</p>
    */
    @SerializedName("CharSet")
    @Expose
    private String CharSet;

    /**
    * <p>Node information</p>
    */
    @SerializedName("Node")
    @Expose
    private NodeInfo [] Node;

    /**
    * <p>Region of the instance</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Instance specification</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Status description in Chinese of the instance</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>CPU cores of the storage node</p>
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>Storage node memory size</p>
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>Renewal flag</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Payment mode, 0 pay-as-you-go, 1 prepaid</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Expiration time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * <p>Isolation time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>List of instance node availability zones. Zones[0] refers to the primary AZ</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Disk usage of the largest node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskUsage")
    @Expose
    private Long DiskUsage;

    /**
    * <p>Whether binlog is enabled</p>
    */
    @SerializedName("BinlogStatus")
    @Expose
    private Long BinlogStatus;

    /**
    * <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
    */
    @SerializedName("StandbyFlag")
    @Expose
    private Long StandbyFlag;

    /**
    * <p>cdc node type</p>
    */
    @SerializedName("BinlogType")
    @Expose
    private String BinlogType;

    /**
    * <p>1 means supported, 0 means unsupported</p>
    */
    @SerializedName("TimingModifyInstanceFlag")
    @Expose
    private Long TimingModifyInstanceFlag;

    /**
    * <p>cpu cores of the columnar node</p>
    */
    @SerializedName("ColumnarNodeCpu")
    @Expose
    private Long ColumnarNodeCpu;

    /**
    * <p>Columnar node memory size</p>
    */
    @SerializedName("ColumnarNodeMem")
    @Expose
    private Long ColumnarNodeMem;

    /**
    * <p>Number of columnar nodes</p>
    */
    @SerializedName("ColumnarNodeNum")
    @Expose
    private Long ColumnarNodeNum;

    /**
    * <p>Columnar node disk size</p>
    */
    @SerializedName("ColumnarNodeDisk")
    @Expose
    private Long ColumnarNodeDisk;

    /**
    * <p>Columnar node disk type</p>
    */
    @SerializedName("ColumnarNodeStorageType")
    @Expose
    private String ColumnarNodeStorageType;

    /**
    * <p>Columnar node specification</p>
    */
    @SerializedName("ColumnarNodeSpecCode")
    @Expose
    private String ColumnarNodeSpecCode;

    /**
    * <p>Columnar storage vip</p>
    */
    @SerializedName("ColumnarVip")
    @Expose
    private String ColumnarVip;

    /**
    * <p>Columnar vport</p>
    */
    @SerializedName("ColumnarVport")
    @Expose
    private Long ColumnarVport;

    /**
    * <p>Whether the instance supports columnar storage</p>
    */
    @SerializedName("IsSupportColumnar")
    @Expose
    private Boolean IsSupportColumnar;

    /**
    * <p>Instance type</p>
    */
    @SerializedName("InstanceCategory")
    @Expose
    private Long InstanceCategory;

    /**
    * <p>Compatible mode</p>
    */
    @SerializedName("SQLMode")
    @Expose
    private String SQLMode;

    /**
    * <p>Whether modification of the number of replicas is supported</p>
    */
    @SerializedName("IsSwitchFullReplicationsEnable")
    @Expose
    private Boolean IsSwitchFullReplicationsEnable;

    /**
    * <p>Instance type</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

    /**
    * <p>dumper vip</p>
    */
    @SerializedName("DumperVip")
    @Expose
    private String DumperVip;

    /**
    * <p>dumper vport</p>
    */
    @SerializedName("DumperVport")
    @Expose
    private Long DumperVport;

    /**
    * <p>ccu adjustment range of the svls instance</p>
    */
    @SerializedName("AutoScaleConfig")
    @Expose
    private AutoScalingConfig AutoScaleConfig;

    /**
    * <p>Parameter template id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Parameter template name</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>Instance analysis engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analysis engine instance</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>Analysis engine instance relationship</p>
    */
    @SerializedName("AnalysisRelationInfos")
    @Expose
    private AnalysisRelationInfo [] AnalysisRelationInfos;

    /**
    * <p>Analysis engine instance info</p><p>Cpu, Memory, and Disk reuse top-level fields</p>
    */
    @SerializedName("AnalysisInstanceInfo")
    @Expose
    private AnalysisInstanceInfo AnalysisInstanceInfo;

    /**
    * <p>Maintenance window configuration</p>
    */
    @SerializedName("MaintenanceWindow")
    @Expose
    private MaintenanceWindowInfo MaintenanceWindow;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Region</p> 
     * @return Zone <p>Region</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Region</p>
     * @param Zone <p>Region</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Character type vpcid</p> 
     * @return VpcId <p>Character type vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Character type vpcid</p>
     * @param VpcId <p>Character type vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Character type subnetid</p> 
     * @return SubnetId <p>Character type subnetid</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Character type subnetid</p>
     * @param SubnetId <p>Character type subnetid</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Create an instance version</p> 
     * @return CreateVersion <p>Create an instance version</p>
     */
    public String getCreateVersion() {
        return this.CreateVersion;
    }

    /**
     * Set <p>Create an instance version</p>
     * @param CreateVersion <p>Create an instance version</p>
     */
    public void setCreateVersion(String CreateVersion) {
        this.CreateVersion = CreateVersion;
    }

    /**
     * Get <p>Subnet IP</p> 
     * @return Vip <p>Subnet IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Subnet IP</p>
     * @param Vip <p>Subnet IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Subnet port</p> 
     * @return Vport <p>Subnet port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Subnet port</p>
     * @param Vport <p>Subnet port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Instance status</p> 
     * @return Status <p>Instance status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status</p>
     * @param Status <p>Instance status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Node disk capacity (unit: GB)</p> 
     * @return Disk <p>Node disk capacity (unit: GB)</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>Node disk capacity (unit: GB)</p>
     * @param Disk <p>Node disk capacity (unit: GB)</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>Number of storage nodes</p> 
     * @return StorageNodeNum <p>Number of storage nodes</p>
     */
    public Long getStorageNodeNum() {
        return this.StorageNodeNum;
    }

    /**
     * Set <p>Number of storage nodes</p>
     * @param StorageNodeNum <p>Number of storage nodes</p>
     */
    public void setStorageNodeNum(Long StorageNodeNum) {
        this.StorageNodeNum = StorageNodeNum;
    }

    /**
     * Get <p>Initialize instance parameters</p> 
     * @return InitParams <p>Initialize instance parameters</p>
     */
    public InstanceParam [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set <p>Initialize instance parameters</p>
     * @param InitParams <p>Initialize instance parameters</p>
     */
    public void setInitParams(InstanceParam [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get <p>Instance tag information.</p> 
     * @return ResourceTags <p>Instance tag information.</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Instance tag information.</p>
     * @param ResourceTags <p>Instance tag information.</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Number of storage node replicas</p> 
     * @return Replications <p>Number of storage node replicas</p>
     */
    public Long getReplications() {
        return this.Replications;
    }

    /**
     * Set <p>Number of storage node replicas</p>
     * @param Replications <p>Number of storage node replicas</p>
     */
    public void setReplications(Long Replications) {
        this.Replications = Replications;
    }

    /**
     * Get <p>Number of replicas</p> 
     * @return FullReplications <p>Number of replicas</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>Number of replicas</p>
     * @param FullReplications <p>Number of replicas</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    /**
     * Get <p>Character set</p> 
     * @return CharSet <p>Character set</p>
     */
    public String getCharSet() {
        return this.CharSet;
    }

    /**
     * Set <p>Character set</p>
     * @param CharSet <p>Character set</p>
     */
    public void setCharSet(String CharSet) {
        this.CharSet = CharSet;
    }

    /**
     * Get <p>Node information</p> 
     * @return Node <p>Node information</p>
     */
    public NodeInfo [] getNode() {
        return this.Node;
    }

    /**
     * Set <p>Node information</p>
     * @param Node <p>Node information</p>
     */
    public void setNode(NodeInfo [] Node) {
        this.Node = Node;
    }

    /**
     * Get <p>Region of the instance</p> 
     * @return Region <p>Region of the instance</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region of the instance</p>
     * @param Region <p>Region of the instance</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Instance specification</p> 
     * @return SpecCode <p>Instance specification</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Instance specification</p>
     * @param SpecCode <p>Instance specification</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Status description in Chinese of the instance</p> 
     * @return StatusDesc <p>Status description in Chinese of the instance</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description in Chinese of the instance</p>
     * @param StatusDesc <p>Status description in Chinese of the instance</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>CPU cores of the storage node</p> 
     * @return StorageNodeCpu <p>CPU cores of the storage node</p>
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>CPU cores of the storage node</p>
     * @param StorageNodeCpu <p>CPU cores of the storage node</p>
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>Storage node memory size</p> 
     * @return StorageNodeMem <p>Storage node memory size</p>
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>Storage node memory size</p>
     * @param StorageNodeMem <p>Storage node memory size</p>
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>Renewal flag</p> 
     * @return RenewFlag <p>Renewal flag</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Renewal flag</p>
     * @param RenewFlag <p>Renewal flag</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Payment mode, 0 pay-as-you-go, 1 prepaid</p> 
     * @return PayMode <p>Payment mode, 0 pay-as-you-go, 1 prepaid</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode, 0 pay-as-you-go, 1 prepaid</p>
     * @param PayMode <p>Payment mode, 0 pay-as-you-go, 1 prepaid</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Expiration time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireAt <p>Expiration time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>Expiration time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireAt <p>Expiration time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get <p>Isolation time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedAt <p>Isolation time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>Isolation time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolatedAt <p>Isolation time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
    }

    /**
     * Get <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>List of instance node availability zones. Zones[0] refers to the primary AZ</p> 
     * @return Zones <p>List of instance node availability zones. Zones[0] refers to the primary AZ</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>List of instance node availability zones. Zones[0] refers to the primary AZ</p>
     * @param Zones <p>List of instance node availability zones. Zones[0] refers to the primary AZ</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>Disk usage of the largest node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskUsage <p>Disk usage of the largest node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set <p>Disk usage of the largest node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskUsage <p>Disk usage of the largest node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskUsage(Long DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get <p>Whether binlog is enabled</p> 
     * @return BinlogStatus <p>Whether binlog is enabled</p>
     */
    public Long getBinlogStatus() {
        return this.BinlogStatus;
    }

    /**
     * Set <p>Whether binlog is enabled</p>
     * @param BinlogStatus <p>Whether binlog is enabled</p>
     */
    public void setBinlogStatus(Long BinlogStatus) {
        this.BinlogStatus = BinlogStatus;
    }

    /**
     * Get <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p> 
     * @return AZMode <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
     * @param AZMode <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p> 
     * @return StandbyFlag <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
     */
    public Long getStandbyFlag() {
        return this.StandbyFlag;
    }

    /**
     * Set <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
     * @param StandbyFlag <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
     */
    public void setStandbyFlag(Long StandbyFlag) {
        this.StandbyFlag = StandbyFlag;
    }

    /**
     * Get <p>cdc node type</p> 
     * @return BinlogType <p>cdc node type</p>
     */
    public String getBinlogType() {
        return this.BinlogType;
    }

    /**
     * Set <p>cdc node type</p>
     * @param BinlogType <p>cdc node type</p>
     */
    public void setBinlogType(String BinlogType) {
        this.BinlogType = BinlogType;
    }

    /**
     * Get <p>1 means supported, 0 means unsupported</p> 
     * @return TimingModifyInstanceFlag <p>1 means supported, 0 means unsupported</p>
     */
    public Long getTimingModifyInstanceFlag() {
        return this.TimingModifyInstanceFlag;
    }

    /**
     * Set <p>1 means supported, 0 means unsupported</p>
     * @param TimingModifyInstanceFlag <p>1 means supported, 0 means unsupported</p>
     */
    public void setTimingModifyInstanceFlag(Long TimingModifyInstanceFlag) {
        this.TimingModifyInstanceFlag = TimingModifyInstanceFlag;
    }

    /**
     * Get <p>cpu cores of the columnar node</p> 
     * @return ColumnarNodeCpu <p>cpu cores of the columnar node</p>
     */
    public Long getColumnarNodeCpu() {
        return this.ColumnarNodeCpu;
    }

    /**
     * Set <p>cpu cores of the columnar node</p>
     * @param ColumnarNodeCpu <p>cpu cores of the columnar node</p>
     */
    public void setColumnarNodeCpu(Long ColumnarNodeCpu) {
        this.ColumnarNodeCpu = ColumnarNodeCpu;
    }

    /**
     * Get <p>Columnar node memory size</p> 
     * @return ColumnarNodeMem <p>Columnar node memory size</p>
     */
    public Long getColumnarNodeMem() {
        return this.ColumnarNodeMem;
    }

    /**
     * Set <p>Columnar node memory size</p>
     * @param ColumnarNodeMem <p>Columnar node memory size</p>
     */
    public void setColumnarNodeMem(Long ColumnarNodeMem) {
        this.ColumnarNodeMem = ColumnarNodeMem;
    }

    /**
     * Get <p>Number of columnar nodes</p> 
     * @return ColumnarNodeNum <p>Number of columnar nodes</p>
     */
    public Long getColumnarNodeNum() {
        return this.ColumnarNodeNum;
    }

    /**
     * Set <p>Number of columnar nodes</p>
     * @param ColumnarNodeNum <p>Number of columnar nodes</p>
     */
    public void setColumnarNodeNum(Long ColumnarNodeNum) {
        this.ColumnarNodeNum = ColumnarNodeNum;
    }

    /**
     * Get <p>Columnar node disk size</p> 
     * @return ColumnarNodeDisk <p>Columnar node disk size</p>
     */
    public Long getColumnarNodeDisk() {
        return this.ColumnarNodeDisk;
    }

    /**
     * Set <p>Columnar node disk size</p>
     * @param ColumnarNodeDisk <p>Columnar node disk size</p>
     */
    public void setColumnarNodeDisk(Long ColumnarNodeDisk) {
        this.ColumnarNodeDisk = ColumnarNodeDisk;
    }

    /**
     * Get <p>Columnar node disk type</p> 
     * @return ColumnarNodeStorageType <p>Columnar node disk type</p>
     */
    public String getColumnarNodeStorageType() {
        return this.ColumnarNodeStorageType;
    }

    /**
     * Set <p>Columnar node disk type</p>
     * @param ColumnarNodeStorageType <p>Columnar node disk type</p>
     */
    public void setColumnarNodeStorageType(String ColumnarNodeStorageType) {
        this.ColumnarNodeStorageType = ColumnarNodeStorageType;
    }

    /**
     * Get <p>Columnar node specification</p> 
     * @return ColumnarNodeSpecCode <p>Columnar node specification</p>
     */
    public String getColumnarNodeSpecCode() {
        return this.ColumnarNodeSpecCode;
    }

    /**
     * Set <p>Columnar node specification</p>
     * @param ColumnarNodeSpecCode <p>Columnar node specification</p>
     */
    public void setColumnarNodeSpecCode(String ColumnarNodeSpecCode) {
        this.ColumnarNodeSpecCode = ColumnarNodeSpecCode;
    }

    /**
     * Get <p>Columnar storage vip</p> 
     * @return ColumnarVip <p>Columnar storage vip</p>
     */
    public String getColumnarVip() {
        return this.ColumnarVip;
    }

    /**
     * Set <p>Columnar storage vip</p>
     * @param ColumnarVip <p>Columnar storage vip</p>
     */
    public void setColumnarVip(String ColumnarVip) {
        this.ColumnarVip = ColumnarVip;
    }

    /**
     * Get <p>Columnar vport</p> 
     * @return ColumnarVport <p>Columnar vport</p>
     */
    public Long getColumnarVport() {
        return this.ColumnarVport;
    }

    /**
     * Set <p>Columnar vport</p>
     * @param ColumnarVport <p>Columnar vport</p>
     */
    public void setColumnarVport(Long ColumnarVport) {
        this.ColumnarVport = ColumnarVport;
    }

    /**
     * Get <p>Whether the instance supports columnar storage</p> 
     * @return IsSupportColumnar <p>Whether the instance supports columnar storage</p>
     */
    public Boolean getIsSupportColumnar() {
        return this.IsSupportColumnar;
    }

    /**
     * Set <p>Whether the instance supports columnar storage</p>
     * @param IsSupportColumnar <p>Whether the instance supports columnar storage</p>
     */
    public void setIsSupportColumnar(Boolean IsSupportColumnar) {
        this.IsSupportColumnar = IsSupportColumnar;
    }

    /**
     * Get <p>Instance type</p> 
     * @return InstanceCategory <p>Instance type</p>
     */
    public Long getInstanceCategory() {
        return this.InstanceCategory;
    }

    /**
     * Set <p>Instance type</p>
     * @param InstanceCategory <p>Instance type</p>
     */
    public void setInstanceCategory(Long InstanceCategory) {
        this.InstanceCategory = InstanceCategory;
    }

    /**
     * Get <p>Compatible mode</p> 
     * @return SQLMode <p>Compatible mode</p>
     */
    public String getSQLMode() {
        return this.SQLMode;
    }

    /**
     * Set <p>Compatible mode</p>
     * @param SQLMode <p>Compatible mode</p>
     */
    public void setSQLMode(String SQLMode) {
        this.SQLMode = SQLMode;
    }

    /**
     * Get <p>Whether modification of the number of replicas is supported</p> 
     * @return IsSwitchFullReplicationsEnable <p>Whether modification of the number of replicas is supported</p>
     */
    public Boolean getIsSwitchFullReplicationsEnable() {
        return this.IsSwitchFullReplicationsEnable;
    }

    /**
     * Set <p>Whether modification of the number of replicas is supported</p>
     * @param IsSwitchFullReplicationsEnable <p>Whether modification of the number of replicas is supported</p>
     */
    public void setIsSwitchFullReplicationsEnable(Boolean IsSwitchFullReplicationsEnable) {
        this.IsSwitchFullReplicationsEnable = IsSwitchFullReplicationsEnable;
    }

    /**
     * Get <p>Instance type</p> 
     * @return InstanceMode <p>Instance type</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>Instance type</p>
     * @param InstanceMode <p>Instance type</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>dumper vip</p> 
     * @return DumperVip <p>dumper vip</p>
     */
    public String getDumperVip() {
        return this.DumperVip;
    }

    /**
     * Set <p>dumper vip</p>
     * @param DumperVip <p>dumper vip</p>
     */
    public void setDumperVip(String DumperVip) {
        this.DumperVip = DumperVip;
    }

    /**
     * Get <p>dumper vport</p> 
     * @return DumperVport <p>dumper vport</p>
     */
    public Long getDumperVport() {
        return this.DumperVport;
    }

    /**
     * Set <p>dumper vport</p>
     * @param DumperVport <p>dumper vport</p>
     */
    public void setDumperVport(Long DumperVport) {
        this.DumperVport = DumperVport;
    }

    /**
     * Get <p>ccu adjustment range of the svls instance</p> 
     * @return AutoScaleConfig <p>ccu adjustment range of the svls instance</p>
     */
    public AutoScalingConfig getAutoScaleConfig() {
        return this.AutoScaleConfig;
    }

    /**
     * Set <p>ccu adjustment range of the svls instance</p>
     * @param AutoScaleConfig <p>ccu adjustment range of the svls instance</p>
     */
    public void setAutoScaleConfig(AutoScalingConfig AutoScaleConfig) {
        this.AutoScaleConfig = AutoScaleConfig;
    }

    /**
     * Get <p>Parameter template id</p> 
     * @return TemplateId <p>Parameter template id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Parameter template id</p>
     * @param TemplateId <p>Parameter template id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Parameter template name</p> 
     * @return TemplateName <p>Parameter template name</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>Parameter template name</p>
     * @param TemplateName <p>Parameter template name</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>Instance analysis engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analysis engine instance</li></ul> 
     * @return AnalysisMode <p>Instance analysis engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analysis engine instance</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>Instance analysis engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analysis engine instance</li></ul>
     * @param AnalysisMode <p>Instance analysis engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analysis engine instance</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>Analysis engine instance relationship</p> 
     * @return AnalysisRelationInfos <p>Analysis engine instance relationship</p>
     */
    public AnalysisRelationInfo [] getAnalysisRelationInfos() {
        return this.AnalysisRelationInfos;
    }

    /**
     * Set <p>Analysis engine instance relationship</p>
     * @param AnalysisRelationInfos <p>Analysis engine instance relationship</p>
     */
    public void setAnalysisRelationInfos(AnalysisRelationInfo [] AnalysisRelationInfos) {
        this.AnalysisRelationInfos = AnalysisRelationInfos;
    }

    /**
     * Get <p>Analysis engine instance info</p><p>Cpu, Memory, and Disk reuse top-level fields</p> 
     * @return AnalysisInstanceInfo <p>Analysis engine instance info</p><p>Cpu, Memory, and Disk reuse top-level fields</p>
     */
    public AnalysisInstanceInfo getAnalysisInstanceInfo() {
        return this.AnalysisInstanceInfo;
    }

    /**
     * Set <p>Analysis engine instance info</p><p>Cpu, Memory, and Disk reuse top-level fields</p>
     * @param AnalysisInstanceInfo <p>Analysis engine instance info</p><p>Cpu, Memory, and Disk reuse top-level fields</p>
     */
    public void setAnalysisInstanceInfo(AnalysisInstanceInfo AnalysisInstanceInfo) {
        this.AnalysisInstanceInfo = AnalysisInstanceInfo;
    }

    /**
     * Get <p>Maintenance window configuration</p> 
     * @return MaintenanceWindow <p>Maintenance window configuration</p>
     */
    public MaintenanceWindowInfo getMaintenanceWindow() {
        return this.MaintenanceWindow;
    }

    /**
     * Set <p>Maintenance window configuration</p>
     * @param MaintenanceWindow <p>Maintenance window configuration</p>
     */
    public void setMaintenanceWindow(MaintenanceWindowInfo MaintenanceWindow) {
        this.MaintenanceWindow = MaintenanceWindow;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceDetailResponse(DescribeDBInstanceDetailResponse source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateVersion != null) {
            this.CreateVersion = new String(source.CreateVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.InitParams != null) {
            this.InitParams = new InstanceParam[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new InstanceParam(source.InitParams[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Replications != null) {
            this.Replications = new Long(source.Replications);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.CharSet != null) {
            this.CharSet = new String(source.CharSet);
        }
        if (source.Node != null) {
            this.Node = new NodeInfo[source.Node.length];
            for (int i = 0; i < source.Node.length; i++) {
                this.Node[i] = new NodeInfo(source.Node[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new Long(source.DiskUsage);
        }
        if (source.BinlogStatus != null) {
            this.BinlogStatus = new Long(source.BinlogStatus);
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.StandbyFlag != null) {
            this.StandbyFlag = new Long(source.StandbyFlag);
        }
        if (source.BinlogType != null) {
            this.BinlogType = new String(source.BinlogType);
        }
        if (source.TimingModifyInstanceFlag != null) {
            this.TimingModifyInstanceFlag = new Long(source.TimingModifyInstanceFlag);
        }
        if (source.ColumnarNodeCpu != null) {
            this.ColumnarNodeCpu = new Long(source.ColumnarNodeCpu);
        }
        if (source.ColumnarNodeMem != null) {
            this.ColumnarNodeMem = new Long(source.ColumnarNodeMem);
        }
        if (source.ColumnarNodeNum != null) {
            this.ColumnarNodeNum = new Long(source.ColumnarNodeNum);
        }
        if (source.ColumnarNodeDisk != null) {
            this.ColumnarNodeDisk = new Long(source.ColumnarNodeDisk);
        }
        if (source.ColumnarNodeStorageType != null) {
            this.ColumnarNodeStorageType = new String(source.ColumnarNodeStorageType);
        }
        if (source.ColumnarNodeSpecCode != null) {
            this.ColumnarNodeSpecCode = new String(source.ColumnarNodeSpecCode);
        }
        if (source.ColumnarVip != null) {
            this.ColumnarVip = new String(source.ColumnarVip);
        }
        if (source.ColumnarVport != null) {
            this.ColumnarVport = new Long(source.ColumnarVport);
        }
        if (source.IsSupportColumnar != null) {
            this.IsSupportColumnar = new Boolean(source.IsSupportColumnar);
        }
        if (source.InstanceCategory != null) {
            this.InstanceCategory = new Long(source.InstanceCategory);
        }
        if (source.SQLMode != null) {
            this.SQLMode = new String(source.SQLMode);
        }
        if (source.IsSwitchFullReplicationsEnable != null) {
            this.IsSwitchFullReplicationsEnable = new Boolean(source.IsSwitchFullReplicationsEnable);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
        if (source.DumperVip != null) {
            this.DumperVip = new String(source.DumperVip);
        }
        if (source.DumperVport != null) {
            this.DumperVport = new Long(source.DumperVport);
        }
        if (source.AutoScaleConfig != null) {
            this.AutoScaleConfig = new AutoScalingConfig(source.AutoScaleConfig);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.AnalysisRelationInfos != null) {
            this.AnalysisRelationInfos = new AnalysisRelationInfo[source.AnalysisRelationInfos.length];
            for (int i = 0; i < source.AnalysisRelationInfos.length; i++) {
                this.AnalysisRelationInfos[i] = new AnalysisRelationInfo(source.AnalysisRelationInfos[i]);
            }
        }
        if (source.AnalysisInstanceInfo != null) {
            this.AnalysisInstanceInfo = new AnalysisInstanceInfo(source.AnalysisInstanceInfo);
        }
        if (source.MaintenanceWindow != null) {
            this.MaintenanceWindow = new MaintenanceWindowInfo(source.MaintenanceWindow);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateVersion", this.CreateVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Replications", this.Replications);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "CharSet", this.CharSet);
        this.setParamArrayObj(map, prefix + "Node.", this.Node);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "BinlogStatus", this.BinlogStatus);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "StandbyFlag", this.StandbyFlag);
        this.setParamSimple(map, prefix + "BinlogType", this.BinlogType);
        this.setParamSimple(map, prefix + "TimingModifyInstanceFlag", this.TimingModifyInstanceFlag);
        this.setParamSimple(map, prefix + "ColumnarNodeCpu", this.ColumnarNodeCpu);
        this.setParamSimple(map, prefix + "ColumnarNodeMem", this.ColumnarNodeMem);
        this.setParamSimple(map, prefix + "ColumnarNodeNum", this.ColumnarNodeNum);
        this.setParamSimple(map, prefix + "ColumnarNodeDisk", this.ColumnarNodeDisk);
        this.setParamSimple(map, prefix + "ColumnarNodeStorageType", this.ColumnarNodeStorageType);
        this.setParamSimple(map, prefix + "ColumnarNodeSpecCode", this.ColumnarNodeSpecCode);
        this.setParamSimple(map, prefix + "ColumnarVip", this.ColumnarVip);
        this.setParamSimple(map, prefix + "ColumnarVport", this.ColumnarVport);
        this.setParamSimple(map, prefix + "IsSupportColumnar", this.IsSupportColumnar);
        this.setParamSimple(map, prefix + "InstanceCategory", this.InstanceCategory);
        this.setParamSimple(map, prefix + "SQLMode", this.SQLMode);
        this.setParamSimple(map, prefix + "IsSwitchFullReplicationsEnable", this.IsSwitchFullReplicationsEnable);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);
        this.setParamSimple(map, prefix + "DumperVip", this.DumperVip);
        this.setParamSimple(map, prefix + "DumperVport", this.DumperVport);
        this.setParamObj(map, prefix + "AutoScaleConfig.", this.AutoScaleConfig);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamArrayObj(map, prefix + "AnalysisRelationInfos.", this.AnalysisRelationInfos);
        this.setParamObj(map, prefix + "AnalysisInstanceInfo.", this.AnalysisInstanceInfo);
        this.setParamObj(map, prefix + "MaintenanceWindow.", this.MaintenanceWindow);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

