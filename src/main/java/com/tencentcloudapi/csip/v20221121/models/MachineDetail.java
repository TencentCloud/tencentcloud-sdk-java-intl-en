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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineDetail extends AbstractModel {

    /**
    * <p>Agent status</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Agent version</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>Account AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Asset type name</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>System boot time (Unix timestamp).</p>
    */
    @SerializedName("BootTime")
    @Expose
    private Long BootTime;

    /**
    * <p>Purchase time (Unix timestamp).</p>
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * <p>Cloud service provider</p>
    */
    @SerializedName("CloudFromEnum")
    @Expose
    private String CloudFromEnum;

    /**
    * <p>Cloud tag list</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * <p>Kernel version</p>
    */
    @SerializedName("CoreVersion")
    @Expose
    private String CoreVersion;

    /**
    * <p>CPU info</p>
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * <p>CPU load</p>
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * <p>CPU cores.</p>
    */
    @SerializedName("CpuSize")
    @Expose
    private Long CpuSize;

    /**
    * <p>Device model</p>
    */
    @SerializedName("DeviceVersion")
    @Expose
    private String DeviceVersion;

    /**
    * <p>Disk partition information</p>
    */
    @SerializedName("Disks")
    @Expose
    private DiskPartitionInfo [] Disks;

    /**
    * <p>Expiration time (Unix timestamp).</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Exposure status</p>
    */
    @SerializedName("ExposedStatus")
    @Expose
    private String ExposedStatus;

    /**
    * <p>Installation time (Unix timestamp).</p>
    */
    @SerializedName("InstallTime")
    @Expose
    private Long InstallTime;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Kernel version</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>Last online time (Unix timestamp).</p>
    */
    @SerializedName("LatestLiveTime")
    @Expose
    private Long LatestLiveTime;

    /**
    * <p>Last offline time (Unix timestamp).</p>
    */
    @SerializedName("LatestOfflineTime")
    @Expose
    private Long LatestOfflineTime;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Operating system (cloud collection)</p>
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * <p>Host status</p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>Public IP address.</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>Memory size (MB)</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Memory usage rate</p>
    */
    @SerializedName("MemoryLoad")
    @Expose
    private String MemoryLoad;

    /**
    * <p>ENI information.</p>
    */
    @SerializedName("NetCards")
    @Expose
    private NetworkCardInfo [] NetCards;

    /**
    * <p>Operating system (client collection)</p>
    */
    @SerializedName("OsByAgent")
    @Expose
    private String OsByAgent;

    /**
    * <p>Payment mode</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Days protected</p>
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * <p>Protection type</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>Host unique identifier</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Region information.</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Serial number</p>
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * <p>Asset tag list</p>
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * <p>Tag change information</p>
    */
    @SerializedName("TagModifyInfo")
    @Expose
    private AssetTagModifyAssetItem TagModifyInfo;

    /**
    * <p>Agent unique ID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>VPC CIDR</p>
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>VPC name.</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
    */
    @SerializedName("ContainerDefendStatus")
    @Expose
    private String ContainerDefendStatus;

    /**
    * <p>Cluster visa md5</p>
    */
    @SerializedName("ClusterCaMd5")
    @Expose
    private String ClusterCaMd5;

    /**
    * <p>Container environment info</p>
    */
    @SerializedName("ContainerEnvInfo")
    @Expose
    private ContainerEnvInfo ContainerEnvInfo;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>Agent status</p> 
     * @return AgentStatus <p>Agent status</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>Agent status</p>
     * @param AgentStatus <p>Agent status</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Agent version</p> 
     * @return AgentVersion <p>Agent version</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>Agent version</p>
     * @param AgentVersion <p>Agent version</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>Account AppId</p> 
     * @return AppId <p>Account AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account AppId</p>
     * @param AppId <p>Account AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Asset type name</p> 
     * @return AssetTypeName <p>Asset type name</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>Asset type name</p>
     * @param AssetTypeName <p>Asset type name</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>System boot time (Unix timestamp).</p> 
     * @return BootTime <p>System boot time (Unix timestamp).</p>
     */
    public Long getBootTime() {
        return this.BootTime;
    }

    /**
     * Set <p>System boot time (Unix timestamp).</p>
     * @param BootTime <p>System boot time (Unix timestamp).</p>
     */
    public void setBootTime(Long BootTime) {
        this.BootTime = BootTime;
    }

    /**
     * Get <p>Purchase time (Unix timestamp).</p> 
     * @return BuyTime <p>Purchase time (Unix timestamp).</p>
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set <p>Purchase time (Unix timestamp).</p>
     * @param BuyTime <p>Purchase time (Unix timestamp).</p>
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get <p>Cloud service provider</p> 
     * @return CloudFromEnum <p>Cloud service provider</p>
     */
    public String getCloudFromEnum() {
        return this.CloudFromEnum;
    }

    /**
     * Set <p>Cloud service provider</p>
     * @param CloudFromEnum <p>Cloud service provider</p>
     */
    public void setCloudFromEnum(String CloudFromEnum) {
        this.CloudFromEnum = CloudFromEnum;
    }

    /**
     * Get <p>Cloud tag list</p> 
     * @return CloudTags <p>Cloud tag list</p>
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>Cloud tag list</p>
     * @param CloudTags <p>Cloud tag list</p>
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>Kernel version</p> 
     * @return CoreVersion <p>Kernel version</p>
     */
    public String getCoreVersion() {
        return this.CoreVersion;
    }

    /**
     * Set <p>Kernel version</p>
     * @param CoreVersion <p>Kernel version</p>
     */
    public void setCoreVersion(String CoreVersion) {
        this.CoreVersion = CoreVersion;
    }

    /**
     * Get <p>CPU info</p> 
     * @return Cpu <p>CPU info</p>
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU info</p>
     * @param Cpu <p>CPU info</p>
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>CPU load</p> 
     * @return CpuLoad <p>CPU load</p>
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set <p>CPU load</p>
     * @param CpuLoad <p>CPU load</p>
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get <p>CPU cores.</p> 
     * @return CpuSize <p>CPU cores.</p>
     */
    public Long getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set <p>CPU cores.</p>
     * @param CpuSize <p>CPU cores.</p>
     */
    public void setCpuSize(Long CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get <p>Device model</p> 
     * @return DeviceVersion <p>Device model</p>
     */
    public String getDeviceVersion() {
        return this.DeviceVersion;
    }

    /**
     * Set <p>Device model</p>
     * @param DeviceVersion <p>Device model</p>
     */
    public void setDeviceVersion(String DeviceVersion) {
        this.DeviceVersion = DeviceVersion;
    }

    /**
     * Get <p>Disk partition information</p> 
     * @return Disks <p>Disk partition information</p>
     */
    public DiskPartitionInfo [] getDisks() {
        return this.Disks;
    }

    /**
     * Set <p>Disk partition information</p>
     * @param Disks <p>Disk partition information</p>
     */
    public void setDisks(DiskPartitionInfo [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get <p>Expiration time (Unix timestamp).</p> 
     * @return EndTime <p>Expiration time (Unix timestamp).</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Expiration time (Unix timestamp).</p>
     * @param EndTime <p>Expiration time (Unix timestamp).</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Exposure status</p> 
     * @return ExposedStatus <p>Exposure status</p>
     */
    public String getExposedStatus() {
        return this.ExposedStatus;
    }

    /**
     * Set <p>Exposure status</p>
     * @param ExposedStatus <p>Exposure status</p>
     */
    public void setExposedStatus(String ExposedStatus) {
        this.ExposedStatus = ExposedStatus;
    }

    /**
     * Get <p>Installation time (Unix timestamp).</p> 
     * @return InstallTime <p>Installation time (Unix timestamp).</p>
     */
    public Long getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set <p>Installation time (Unix timestamp).</p>
     * @param InstallTime <p>Installation time (Unix timestamp).</p>
     */
    public void setInstallTime(Long InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceID <p>Instance ID.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceID <p>Instance ID.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Instance status</p> 
     * @return InstanceStatus <p>Instance status</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status</p>
     * @param InstanceStatus <p>Instance status</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Kernel version</p> 
     * @return KernelVersion <p>Kernel version</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>Kernel version</p>
     * @param KernelVersion <p>Kernel version</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>Last online time (Unix timestamp).</p> 
     * @return LatestLiveTime <p>Last online time (Unix timestamp).</p>
     */
    public Long getLatestLiveTime() {
        return this.LatestLiveTime;
    }

    /**
     * Set <p>Last online time (Unix timestamp).</p>
     * @param LatestLiveTime <p>Last online time (Unix timestamp).</p>
     */
    public void setLatestLiveTime(Long LatestLiveTime) {
        this.LatestLiveTime = LatestLiveTime;
    }

    /**
     * Get <p>Last offline time (Unix timestamp).</p> 
     * @return LatestOfflineTime <p>Last offline time (Unix timestamp).</p>
     */
    public Long getLatestOfflineTime() {
        return this.LatestOfflineTime;
    }

    /**
     * Set <p>Last offline time (Unix timestamp).</p>
     * @param LatestOfflineTime <p>Last offline time (Unix timestamp).</p>
     */
    public void setLatestOfflineTime(Long LatestOfflineTime) {
        this.LatestOfflineTime = LatestOfflineTime;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return MachineIp <p>Private IP address.</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param MachineIp <p>Private IP address.</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>Host name.</p> 
     * @return MachineName <p>Host name.</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Host name.</p>
     * @param MachineName <p>Host name.</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Operating system (cloud collection)</p> 
     * @return MachineOs <p>Operating system (cloud collection)</p>
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set <p>Operating system (cloud collection)</p>
     * @param MachineOs <p>Operating system (cloud collection)</p>
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get <p>Host status</p> 
     * @return MachineStatus <p>Host status</p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>Host status</p>
     * @param MachineStatus <p>Host status</p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>Public IP address.</p> 
     * @return MachineWanIp <p>Public IP address.</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>Public IP address.</p>
     * @param MachineWanIp <p>Public IP address.</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>Memory size (MB)</p> 
     * @return MemSize <p>Memory size (MB)</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory size (MB)</p>
     * @param MemSize <p>Memory size (MB)</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Memory usage rate</p> 
     * @return MemoryLoad <p>Memory usage rate</p>
     */
    public String getMemoryLoad() {
        return this.MemoryLoad;
    }

    /**
     * Set <p>Memory usage rate</p>
     * @param MemoryLoad <p>Memory usage rate</p>
     */
    public void setMemoryLoad(String MemoryLoad) {
        this.MemoryLoad = MemoryLoad;
    }

    /**
     * Get <p>ENI information.</p> 
     * @return NetCards <p>ENI information.</p>
     */
    public NetworkCardInfo [] getNetCards() {
        return this.NetCards;
    }

    /**
     * Set <p>ENI information.</p>
     * @param NetCards <p>ENI information.</p>
     */
    public void setNetCards(NetworkCardInfo [] NetCards) {
        this.NetCards = NetCards;
    }

    /**
     * Get <p>Operating system (client collection)</p> 
     * @return OsByAgent <p>Operating system (client collection)</p>
     */
    public String getOsByAgent() {
        return this.OsByAgent;
    }

    /**
     * Set <p>Operating system (client collection)</p>
     * @param OsByAgent <p>Operating system (client collection)</p>
     */
    public void setOsByAgent(String OsByAgent) {
        this.OsByAgent = OsByAgent;
    }

    /**
     * Get <p>Payment mode</p> 
     * @return PayMode <p>Payment mode</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode</p>
     * @param PayMode <p>Payment mode</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Days protected</p> 
     * @return ProtectDays <p>Days protected</p>
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set <p>Days protected</p>
     * @param ProtectDays <p>Days protected</p>
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get <p>Protection type</p> 
     * @return ProtectType <p>Protection type</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>Protection type</p>
     * @param ProtectType <p>Protection type</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>Host unique identifier</p> 
     * @return Quuid <p>Host unique identifier</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host unique identifier</p>
     * @param Quuid <p>Host unique identifier</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Region information.</p> 
     * @return RegionInfo <p>Region information.</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>Region information.</p>
     * @param RegionInfo <p>Region information.</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Serial number</p> 
     * @return SerialNumber <p>Serial number</p>
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set <p>Serial number</p>
     * @param SerialNumber <p>Serial number</p>
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get <p>Asset tag list</p> 
     * @return TagItems <p>Asset tag list</p>
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>Asset tag list</p>
     * @param TagItems <p>Asset tag list</p>
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>Tag change information</p> 
     * @return TagModifyInfo <p>Tag change information</p>
     */
    public AssetTagModifyAssetItem getTagModifyInfo() {
        return this.TagModifyInfo;
    }

    /**
     * Set <p>Tag change information</p>
     * @param TagModifyInfo <p>Tag change information</p>
     */
    public void setTagModifyInfo(AssetTagModifyAssetItem TagModifyInfo) {
        this.TagModifyInfo = TagModifyInfo;
    }

    /**
     * Get <p>Agent unique ID</p> 
     * @return Uuid <p>Agent unique ID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Agent unique ID</p>
     * @param Uuid <p>Agent unique ID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>VPC CIDR</p> 
     * @return VpcCidrBlock <p>VPC CIDR</p>
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set <p>VPC CIDR</p>
     * @param VpcCidrBlock <p>VPC CIDR</p>
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>VPC name.</p> 
     * @return VpcName <p>VPC name.</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>VPC name.</p>
     * @param VpcName <p>VPC name.</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul> 
     * @return NodeType <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
     * @param NodeType <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul> 
     * @return ContainerDefendStatus <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
     */
    public String getContainerDefendStatus() {
        return this.ContainerDefendStatus;
    }

    /**
     * Set <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
     * @param ContainerDefendStatus <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
     */
    public void setContainerDefendStatus(String ContainerDefendStatus) {
        this.ContainerDefendStatus = ContainerDefendStatus;
    }

    /**
     * Get <p>Cluster visa md5</p> 
     * @return ClusterCaMd5 <p>Cluster visa md5</p>
     */
    public String getClusterCaMd5() {
        return this.ClusterCaMd5;
    }

    /**
     * Set <p>Cluster visa md5</p>
     * @param ClusterCaMd5 <p>Cluster visa md5</p>
     */
    public void setClusterCaMd5(String ClusterCaMd5) {
        this.ClusterCaMd5 = ClusterCaMd5;
    }

    /**
     * Get <p>Container environment info</p> 
     * @return ContainerEnvInfo <p>Container environment info</p>
     */
    public ContainerEnvInfo getContainerEnvInfo() {
        return this.ContainerEnvInfo;
    }

    /**
     * Set <p>Container environment info</p>
     * @param ContainerEnvInfo <p>Container environment info</p>
     */
    public void setContainerEnvInfo(ContainerEnvInfo ContainerEnvInfo) {
        this.ContainerEnvInfo = ContainerEnvInfo;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public MachineDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineDetail(MachineDetail source) {
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.BootTime != null) {
            this.BootTime = new Long(source.BootTime);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.CloudFromEnum != null) {
            this.CloudFromEnum = new String(source.CloudFromEnum);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.CoreVersion != null) {
            this.CoreVersion = new String(source.CoreVersion);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Long(source.CpuSize);
        }
        if (source.DeviceVersion != null) {
            this.DeviceVersion = new String(source.DeviceVersion);
        }
        if (source.Disks != null) {
            this.Disks = new DiskPartitionInfo[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new DiskPartitionInfo(source.Disks[i]);
            }
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ExposedStatus != null) {
            this.ExposedStatus = new String(source.ExposedStatus);
        }
        if (source.InstallTime != null) {
            this.InstallTime = new Long(source.InstallTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.LatestLiveTime != null) {
            this.LatestLiveTime = new Long(source.LatestLiveTime);
        }
        if (source.LatestOfflineTime != null) {
            this.LatestOfflineTime = new Long(source.LatestOfflineTime);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemoryLoad != null) {
            this.MemoryLoad = new String(source.MemoryLoad);
        }
        if (source.NetCards != null) {
            this.NetCards = new NetworkCardInfo[source.NetCards.length];
            for (int i = 0; i < source.NetCards.length; i++) {
                this.NetCards[i] = new NetworkCardInfo(source.NetCards[i]);
            }
        }
        if (source.OsByAgent != null) {
            this.OsByAgent = new String(source.OsByAgent);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.TagItems != null) {
            this.TagItems = new MiniTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new MiniTagItem(source.TagItems[i]);
            }
        }
        if (source.TagModifyInfo != null) {
            this.TagModifyInfo = new AssetTagModifyAssetItem(source.TagModifyInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ContainerDefendStatus != null) {
            this.ContainerDefendStatus = new String(source.ContainerDefendStatus);
        }
        if (source.ClusterCaMd5 != null) {
            this.ClusterCaMd5 = new String(source.ClusterCaMd5);
        }
        if (source.ContainerEnvInfo != null) {
            this.ContainerEnvInfo = new ContainerEnvInfo(source.ContainerEnvInfo);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "BootTime", this.BootTime);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "CloudFromEnum", this.CloudFromEnum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "CoreVersion", this.CoreVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "DeviceVersion", this.DeviceVersion);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExposedStatus", this.ExposedStatus);
        this.setParamSimple(map, prefix + "InstallTime", this.InstallTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "LatestLiveTime", this.LatestLiveTime);
        this.setParamSimple(map, prefix + "LatestOfflineTime", this.LatestOfflineTime);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemoryLoad", this.MemoryLoad);
        this.setParamArrayObj(map, prefix + "NetCards.", this.NetCards);
        this.setParamSimple(map, prefix + "OsByAgent", this.OsByAgent);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamObj(map, prefix + "TagModifyInfo.", this.TagModifyInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ContainerDefendStatus", this.ContainerDefendStatus);
        this.setParamSimple(map, prefix + "ClusterCaMd5", this.ClusterCaMd5);
        this.setParamObj(map, prefix + "ContainerEnvInfo.", this.ContainerEnvInfo);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

