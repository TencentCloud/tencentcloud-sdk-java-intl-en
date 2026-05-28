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

public class InstanceInfo extends AbstractModel {

    /**
    * <p>Number of compute nodes</p>
    */
    @SerializedName("ComputeNodeNum")
    @Expose
    private Long ComputeNodeNum;

    /**
    * <p>Region</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Creating an Instance Version</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateVersion")
    @Expose
    private String CreateVersion;

    /**
    * <p>Initialize instance parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitParams")
    @Expose
    private InstanceParam [] InitParams;

    /**
    * <p>Instance status: creating, created, initializing, running, modifying, isolating, isolated, destroying, destroyed</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Number of storage nodes</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>cpu cores of the computing node</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Character type vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Computing node mem, in GB</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>Subnet IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Character type subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Subnet port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Node disk capacity (unit: GB)</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>Instance Creation Time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Region of the instance</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Status description in Chinese of the instance</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>CPU cores of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MCCpu")
    @Expose
    private Long MCCpu;

    /**
    * <p>CPU size of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MCMem")
    @Expose
    private Long MCMem;

    /**
    * <p>CPU cores of the computing node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComputerNodeCpu")
    @Expose
    private Long ComputerNodeCpu;

    /**
    * <p>Compute node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComputerNodeMem")
    @Expose
    private Long ComputerNodeMem;

    /**
    * <p>CPU cores of the storage node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>Storage node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>Number of control nodes</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MCNum")
    @Expose
    private Long MCNum;

    /**
    * <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Payment mode, 0 pay-as-you-go; 1 annual/monthly subscription</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>User tag, inner: internal user; external: external user</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountTag")
    @Expose
    private String AccountTag;

    /**
    * <p>Instance Architecture Type, separate: decoupled architecture; hyper: peer-to-peer architecture</p>
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
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DestroyedAt")
    @Expose
    private String DestroyedAt;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedFrom")
    @Expose
    private String IsolatedFrom;

    /**
    * <p>1</p>
Note: This field may return null, indicating that no valid values can be obtained.
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
    * <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>AZ information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Instance node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nodes")
    @Expose
    private InstanceNode [] Nodes;

    /**
    * <p>Whether binlog is on</p>
    */
    @SerializedName("BinlogStatus")
    @Expose
    private Long BinlogStatus;

    /**
    * <p>Number of cdc node cores</p>
    */
    @SerializedName("CdcNodeCpu")
    @Expose
    private Long CdcNodeCpu;

    /**
    * <p>cdc node memory size</p>
    */
    @SerializedName("CdcNodeMem")
    @Expose
    private Long CdcNodeMem;

    /**
    * <p>Number of cdc nodes</p>
    */
    @SerializedName("CdcNodeNum")
    @Expose
    private Long CdcNodeNum;

    /**
    * <p>az mode. 1: Single az, 2: Multi-az non-primary az mode, 3: Multi-az primary az mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StandbyFlag")
    @Expose
    private Long StandbyFlag;

    /**
    * <p>Number of connected standby instances (Valid only when StandbyFlag == 2)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StandbySecondaryNum")
    @Expose
    private Long StandbySecondaryNum;

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
    * <p>Columnar node disk capacity (unit: GB)</p>
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
    * <p>Exclusive flags, 1: Primary instance (dedicated), 2: Primary instance, 3: Disaster recovery instance, 4: Disaster recovery instance (dedicated)</p>
    */
    @SerializedName("InstanceCategory")
    @Expose
    private Long InstanceCategory;

    /**
    * <p>dbdc-xxxxx</p>
    */
    @SerializedName("ExclusiveClusterId")
    @Expose
    private String ExclusiveClusterId;

    /**
    * <p>Compatible mode</p>
    */
    @SerializedName("SQLMode")
    @Expose
    private String SQLMode;

    /**
    * <p>Instance mode</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

    /**
    * <p>Instance delivery platform</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Auto-scaling configuration</p>
    */
    @SerializedName("AutoScaleConfig")
    @Expose
    private AutoScalingConfig AutoScaleConfig;

    /**
    * <p>Analytical engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analytical engine mode</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>Analysis engine relationship information</p>
    */
    @SerializedName("AnalysisRelationInfos")
    @Expose
    private AnalysisRelationInfo [] AnalysisRelationInfos;

    /**
     * Get <p>Number of compute nodes</p> 
     * @return ComputeNodeNum <p>Number of compute nodes</p>
     * @deprecated
     */
    @Deprecated
    public Long getComputeNodeNum() {
        return this.ComputeNodeNum;
    }

    /**
     * Set <p>Number of compute nodes</p>
     * @param ComputeNodeNum <p>Number of compute nodes</p>
     * @deprecated
     */
    @Deprecated
    public void setComputeNodeNum(Long ComputeNodeNum) {
        this.ComputeNodeNum = ComputeNodeNum;
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
     * Get <p>Creating an Instance Version</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateVersion <p>Creating an Instance Version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateVersion() {
        return this.CreateVersion;
    }

    /**
     * Set <p>Creating an Instance Version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateVersion <p>Creating an Instance Version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateVersion(String CreateVersion) {
        this.CreateVersion = CreateVersion;
    }

    /**
     * Get <p>Initialize instance parameter</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InitParams <p>Initialize instance parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceParam [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set <p>Initialize instance parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InitParams <p>Initialize instance parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInitParams(InstanceParam [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get <p>Instance status: creating, created, initializing, running, modifying, isolating, isolated, destroying, destroyed</p> 
     * @return Status <p>Instance status: creating, created, initializing, running, modifying, isolating, isolated, destroying, destroyed</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status: creating, created, initializing, running, modifying, isolating, isolated, destroying, destroyed</p>
     * @param Status <p>Instance status: creating, created, initializing, running, modifying, isolating, isolated, destroying, destroyed</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceTags <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceTags <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>cpu cores of the computing node</p> 
     * @return Cpu <p>cpu cores of the computing node</p>
     * @deprecated
     */
    @Deprecated
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu cores of the computing node</p>
     * @param Cpu <p>cpu cores of the computing node</p>
     * @deprecated
     */
    @Deprecated
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
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
     * Get <p>Computing node mem, in GB</p> 
     * @return Mem <p>Computing node mem, in GB</p>
     * @deprecated
     */
    @Deprecated
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Computing node mem, in GB</p>
     * @param Mem <p>Computing node mem, in GB</p>
     * @deprecated
     */
    @Deprecated
    public void setMem(Long Mem) {
        this.Mem = Mem;
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
     * Get <p>Instance Creation Time</p> 
     * @return CreateTime <p>Instance Creation Time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Instance Creation Time</p>
     * @param CreateTime <p>Instance Creation Time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get <p>CPU cores of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MCCpu <p>CPU cores of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getMCCpu() {
        return this.MCCpu;
    }

    /**
     * Set <p>CPU cores of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MCCpu <p>CPU cores of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setMCCpu(Long MCCpu) {
        this.MCCpu = MCCpu;
    }

    /**
     * Get <p>CPU size of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MCMem <p>CPU size of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getMCMem() {
        return this.MCMem;
    }

    /**
     * Set <p>CPU size of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MCMem <p>CPU size of the control node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setMCMem(Long MCMem) {
        this.MCMem = MCMem;
    }

    /**
     * Get <p>CPU cores of the computing node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComputerNodeCpu <p>CPU cores of the computing node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getComputerNodeCpu() {
        return this.ComputerNodeCpu;
    }

    /**
     * Set <p>CPU cores of the computing node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComputerNodeCpu <p>CPU cores of the computing node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setComputerNodeCpu(Long ComputerNodeCpu) {
        this.ComputerNodeCpu = ComputerNodeCpu;
    }

    /**
     * Get <p>Compute node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComputerNodeMem <p>Compute node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getComputerNodeMem() {
        return this.ComputerNodeMem;
    }

    /**
     * Set <p>Compute node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComputerNodeMem <p>Compute node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setComputerNodeMem(Long ComputerNodeMem) {
        this.ComputerNodeMem = ComputerNodeMem;
    }

    /**
     * Get <p>CPU cores of the storage node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageNodeCpu <p>CPU cores of the storage node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>CPU cores of the storage node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageNodeCpu <p>CPU cores of the storage node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>Storage node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageNodeMem <p>Storage node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>Storage node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageNodeMem <p>Storage node memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>Number of control nodes</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MCNum <p>Number of control nodes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getMCNum() {
        return this.MCNum;
    }

    /**
     * Set <p>Number of control nodes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MCNum <p>Number of control nodes</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setMCNum(Long MCNum) {
        this.MCNum = MCNum;
    }

    /**
     * Get <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Payment mode, 0 pay-as-you-go; 1 annual/monthly subscription</p> 
     * @return PayMode <p>Payment mode, 0 pay-as-you-go; 1 annual/monthly subscription</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode, 0 pay-as-you-go; 1 annual/monthly subscription</p>
     * @param PayMode <p>Payment mode, 0 pay-as-you-go; 1 annual/monthly subscription</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>User tag, inner: internal user; external: external user</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountTag <p>User tag, inner: internal user; external: external user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountTag() {
        return this.AccountTag;
    }

    /**
     * Set <p>User tag, inner: internal user; external: external user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountTag <p>User tag, inner: internal user; external: external user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountTag(String AccountTag) {
        this.AccountTag = AccountTag;
    }

    /**
     * Get <p>Instance Architecture Type, separate: decoupled architecture; hyper: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType <p>Instance Architecture Type, separate: decoupled architecture; hyper: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance Architecture Type, separate: decoupled architecture; hyper: peer-to-peer architecture</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType <p>Instance Architecture Type, separate: decoupled architecture; hyper: peer-to-peer architecture</p>
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
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DestroyedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDestroyedAt() {
        return this.DestroyedAt;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DestroyedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDestroyedAt(String DestroyedAt) {
        this.DestroyedAt = DestroyedAt;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireAt <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireAt <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolatedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedFrom <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedFrom() {
        return this.IsolatedFrom;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolatedFrom <p>&quot;0000-00-00 00:00:00&quot;</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedFrom(String IsolatedFrom) {
        this.IsolatedFrom = IsolatedFrom;
    }

    /**
     * Get <p>1</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Replications <p>1</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplications() {
        return this.Replications;
    }

    /**
     * Set <p>1</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Replications <p>1</p>
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubAccountUin <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubAccountUin <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin <p>Account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>AZ information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zones <p>AZ information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>AZ information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zones <p>AZ information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>Instance node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nodes <p>Instance node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>Instance node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nodes <p>Instance node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodes(InstanceNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>Whether binlog is on</p> 
     * @return BinlogStatus <p>Whether binlog is on</p>
     */
    public Long getBinlogStatus() {
        return this.BinlogStatus;
    }

    /**
     * Set <p>Whether binlog is on</p>
     * @param BinlogStatus <p>Whether binlog is on</p>
     */
    public void setBinlogStatus(Long BinlogStatus) {
        this.BinlogStatus = BinlogStatus;
    }

    /**
     * Get <p>Number of cdc node cores</p> 
     * @return CdcNodeCpu <p>Number of cdc node cores</p>
     * @deprecated
     */
    @Deprecated
    public Long getCdcNodeCpu() {
        return this.CdcNodeCpu;
    }

    /**
     * Set <p>Number of cdc node cores</p>
     * @param CdcNodeCpu <p>Number of cdc node cores</p>
     * @deprecated
     */
    @Deprecated
    public void setCdcNodeCpu(Long CdcNodeCpu) {
        this.CdcNodeCpu = CdcNodeCpu;
    }

    /**
     * Get <p>cdc node memory size</p> 
     * @return CdcNodeMem <p>cdc node memory size</p>
     * @deprecated
     */
    @Deprecated
    public Long getCdcNodeMem() {
        return this.CdcNodeMem;
    }

    /**
     * Set <p>cdc node memory size</p>
     * @param CdcNodeMem <p>cdc node memory size</p>
     * @deprecated
     */
    @Deprecated
    public void setCdcNodeMem(Long CdcNodeMem) {
        this.CdcNodeMem = CdcNodeMem;
    }

    /**
     * Get <p>Number of cdc nodes</p> 
     * @return CdcNodeNum <p>Number of cdc nodes</p>
     * @deprecated
     */
    @Deprecated
    public Long getCdcNodeNum() {
        return this.CdcNodeNum;
    }

    /**
     * Set <p>Number of cdc nodes</p>
     * @param CdcNodeNum <p>Number of cdc nodes</p>
     * @deprecated
     */
    @Deprecated
    public void setCdcNodeNum(Long CdcNodeNum) {
        this.CdcNodeNum = CdcNodeNum;
    }

    /**
     * Get <p>az mode. 1: Single az, 2: Multi-az non-primary az mode, 3: Multi-az primary az mode</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AZMode <p>az mode. 1: Single az, 2: Multi-az non-primary az mode, 3: Multi-az primary az mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>az mode. 1: Single az, 2: Multi-az non-primary az mode, 3: Multi-az primary az mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AZMode <p>az mode. 1: Single az, 2: Multi-az non-primary az mode, 3: Multi-az primary az mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StandbyFlag <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStandbyFlag() {
        return this.StandbyFlag;
    }

    /**
     * Set <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StandbyFlag <p>Disaster recovery flag. 1: No disaster recovery relationship; 2: Primary instance for disaster recovery; 3: Disaster Recovery Standby Instance</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStandbyFlag(Long StandbyFlag) {
        this.StandbyFlag = StandbyFlag;
    }

    /**
     * Get <p>Number of connected standby instances (Valid only when StandbyFlag == 2)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StandbySecondaryNum <p>Number of connected standby instances (Valid only when StandbyFlag == 2)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStandbySecondaryNum() {
        return this.StandbySecondaryNum;
    }

    /**
     * Set <p>Number of connected standby instances (Valid only when StandbyFlag == 2)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StandbySecondaryNum <p>Number of connected standby instances (Valid only when StandbyFlag == 2)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStandbySecondaryNum(Long StandbySecondaryNum) {
        this.StandbySecondaryNum = StandbySecondaryNum;
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
     * Get <p>Columnar node disk capacity (unit: GB)</p> 
     * @return ColumnarNodeDisk <p>Columnar node disk capacity (unit: GB)</p>
     */
    public Long getColumnarNodeDisk() {
        return this.ColumnarNodeDisk;
    }

    /**
     * Set <p>Columnar node disk capacity (unit: GB)</p>
     * @param ColumnarNodeDisk <p>Columnar node disk capacity (unit: GB)</p>
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
     * Get <p>Exclusive flags, 1: Primary instance (dedicated), 2: Primary instance, 3: Disaster recovery instance, 4: Disaster recovery instance (dedicated)</p> 
     * @return InstanceCategory <p>Exclusive flags, 1: Primary instance (dedicated), 2: Primary instance, 3: Disaster recovery instance, 4: Disaster recovery instance (dedicated)</p>
     */
    public Long getInstanceCategory() {
        return this.InstanceCategory;
    }

    /**
     * Set <p>Exclusive flags, 1: Primary instance (dedicated), 2: Primary instance, 3: Disaster recovery instance, 4: Disaster recovery instance (dedicated)</p>
     * @param InstanceCategory <p>Exclusive flags, 1: Primary instance (dedicated), 2: Primary instance, 3: Disaster recovery instance, 4: Disaster recovery instance (dedicated)</p>
     */
    public void setInstanceCategory(Long InstanceCategory) {
        this.InstanceCategory = InstanceCategory;
    }

    /**
     * Get <p>dbdc-xxxxx</p> 
     * @return ExclusiveClusterId <p>dbdc-xxxxx</p>
     */
    public String getExclusiveClusterId() {
        return this.ExclusiveClusterId;
    }

    /**
     * Set <p>dbdc-xxxxx</p>
     * @param ExclusiveClusterId <p>dbdc-xxxxx</p>
     */
    public void setExclusiveClusterId(String ExclusiveClusterId) {
        this.ExclusiveClusterId = ExclusiveClusterId;
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
     * Get <p>Instance mode</p> 
     * @return InstanceMode <p>Instance mode</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>Instance mode</p>
     * @param InstanceMode <p>Instance mode</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>Instance delivery platform</p> 
     * @return ClusterId <p>Instance delivery platform</p>
     * @deprecated
     */
    @Deprecated
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Instance delivery platform</p>
     * @param ClusterId <p>Instance delivery platform</p>
     * @deprecated
     */
    @Deprecated
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Auto-scaling configuration</p> 
     * @return AutoScaleConfig <p>Auto-scaling configuration</p>
     */
    public AutoScalingConfig getAutoScaleConfig() {
        return this.AutoScaleConfig;
    }

    /**
     * Set <p>Auto-scaling configuration</p>
     * @param AutoScaleConfig <p>Auto-scaling configuration</p>
     */
    public void setAutoScaleConfig(AutoScalingConfig AutoScaleConfig) {
        this.AutoScaleConfig = AutoScaleConfig;
    }

    /**
     * Get <p>Analytical engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analytical engine mode</li></ul> 
     * @return AnalysisMode <p>Analytical engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analytical engine mode</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>Analytical engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analytical engine mode</li></ul>
     * @param AnalysisMode <p>Analytical engine mode</p><p>Enumeration value:</p><ul><li>libra: LibraDB analytical engine mode</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>Analysis engine relationship information</p> 
     * @return AnalysisRelationInfos <p>Analysis engine relationship information</p>
     */
    public AnalysisRelationInfo [] getAnalysisRelationInfos() {
        return this.AnalysisRelationInfos;
    }

    /**
     * Set <p>Analysis engine relationship information</p>
     * @param AnalysisRelationInfos <p>Analysis engine relationship information</p>
     */
    public void setAnalysisRelationInfos(AnalysisRelationInfo [] AnalysisRelationInfos) {
        this.AnalysisRelationInfos = AnalysisRelationInfos;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.ComputeNodeNum != null) {
            this.ComputeNodeNum = new Long(source.ComputeNodeNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreateVersion != null) {
            this.CreateVersion = new String(source.CreateVersion);
        }
        if (source.InitParams != null) {
            this.InitParams = new InstanceParam[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new InstanceParam(source.InitParams[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.MCCpu != null) {
            this.MCCpu = new Long(source.MCCpu);
        }
        if (source.MCMem != null) {
            this.MCMem = new Long(source.MCMem);
        }
        if (source.ComputerNodeCpu != null) {
            this.ComputerNodeCpu = new Long(source.ComputerNodeCpu);
        }
        if (source.ComputerNodeMem != null) {
            this.ComputerNodeMem = new Long(source.ComputerNodeMem);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.MCNum != null) {
            this.MCNum = new Long(source.MCNum);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.AccountTag != null) {
            this.AccountTag = new String(source.AccountTag);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.DestroyedAt != null) {
            this.DestroyedAt = new String(source.DestroyedAt);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.IsolatedFrom != null) {
            this.IsolatedFrom = new String(source.IsolatedFrom);
        }
        if (source.Replications != null) {
            this.Replications = new Long(source.Replications);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Nodes != null) {
            this.Nodes = new InstanceNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new InstanceNode(source.Nodes[i]);
            }
        }
        if (source.BinlogStatus != null) {
            this.BinlogStatus = new Long(source.BinlogStatus);
        }
        if (source.CdcNodeCpu != null) {
            this.CdcNodeCpu = new Long(source.CdcNodeCpu);
        }
        if (source.CdcNodeMem != null) {
            this.CdcNodeMem = new Long(source.CdcNodeMem);
        }
        if (source.CdcNodeNum != null) {
            this.CdcNodeNum = new Long(source.CdcNodeNum);
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.StandbyFlag != null) {
            this.StandbyFlag = new Long(source.StandbyFlag);
        }
        if (source.StandbySecondaryNum != null) {
            this.StandbySecondaryNum = new Long(source.StandbySecondaryNum);
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
        if (source.InstanceCategory != null) {
            this.InstanceCategory = new Long(source.InstanceCategory);
        }
        if (source.ExclusiveClusterId != null) {
            this.ExclusiveClusterId = new String(source.ExclusiveClusterId);
        }
        if (source.SQLMode != null) {
            this.SQLMode = new String(source.SQLMode);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoScaleConfig != null) {
            this.AutoScaleConfig = new AutoScalingConfig(source.AutoScaleConfig);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComputeNodeNum", this.ComputeNodeNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreateVersion", this.CreateVersion);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "MCCpu", this.MCCpu);
        this.setParamSimple(map, prefix + "MCMem", this.MCMem);
        this.setParamSimple(map, prefix + "ComputerNodeCpu", this.ComputerNodeCpu);
        this.setParamSimple(map, prefix + "ComputerNodeMem", this.ComputerNodeMem);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "MCNum", this.MCNum);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AccountTag", this.AccountTag);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "DestroyedAt", this.DestroyedAt);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "IsolatedFrom", this.IsolatedFrom);
        this.setParamSimple(map, prefix + "Replications", this.Replications);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "BinlogStatus", this.BinlogStatus);
        this.setParamSimple(map, prefix + "CdcNodeCpu", this.CdcNodeCpu);
        this.setParamSimple(map, prefix + "CdcNodeMem", this.CdcNodeMem);
        this.setParamSimple(map, prefix + "CdcNodeNum", this.CdcNodeNum);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "StandbyFlag", this.StandbyFlag);
        this.setParamSimple(map, prefix + "StandbySecondaryNum", this.StandbySecondaryNum);
        this.setParamSimple(map, prefix + "ColumnarNodeCpu", this.ColumnarNodeCpu);
        this.setParamSimple(map, prefix + "ColumnarNodeMem", this.ColumnarNodeMem);
        this.setParamSimple(map, prefix + "ColumnarNodeNum", this.ColumnarNodeNum);
        this.setParamSimple(map, prefix + "ColumnarNodeDisk", this.ColumnarNodeDisk);
        this.setParamSimple(map, prefix + "ColumnarNodeStorageType", this.ColumnarNodeStorageType);
        this.setParamSimple(map, prefix + "InstanceCategory", this.InstanceCategory);
        this.setParamSimple(map, prefix + "ExclusiveClusterId", this.ExclusiveClusterId);
        this.setParamSimple(map, prefix + "SQLMode", this.SQLMode);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "AutoScaleConfig.", this.AutoScaleConfig);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamArrayObj(map, prefix + "AnalysisRelationInfos.", this.AnalysisRelationInfos);

    }
}

