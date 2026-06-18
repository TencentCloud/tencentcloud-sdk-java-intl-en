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

public class CVMAssetVO extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset name.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Protection status
    */
    @SerializedName("CWPStatus")
    @Expose
    private Long CWPStatus;

    /**
    * Asset creation time.
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC Name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * App ID information
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Nickname.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Availability zone
    */
    @SerializedName("AvailableArea")
    @Expose
    private String AvailableArea;

    /**
    * Core or Not
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Subnet Name
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * CWP Agent UUID.
    */
    @SerializedName("InstanceUuid")
    @Expose
    private String InstanceUuid;

    /**
    * CVM host UUID.
    */
    @SerializedName("InstanceQUuid")
    @Expose
    private String InstanceQUuid;

    /**
    * OS Name
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Partition
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * CPU Information
    */
    @SerializedName("CPUInfo")
    @Expose
    private String CPUInfo;

    /**
    * CPU Size
    */
    @SerializedName("CPUSize")
    @Expose
    private Long CPUSize;

    /**
    * CPU Load
    */
    @SerializedName("CPULoad")
    @Expose
    private String CPULoad;

    /**
    * Memory size.
    */
    @SerializedName("MemorySize")
    @Expose
    private String MemorySize;

    /**
    * Memory Load
    */
    @SerializedName("MemoryLoad")
    @Expose
    private String MemoryLoad;

    /**
    * Hard disk size.
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * Hard Disk Load
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * Number of Accounts
    */
    @SerializedName("AccountCount")
    @Expose
    private String AccountCount;

    /**
    * Number of Processes
    */
    @SerializedName("ProcessCount")
    @Expose
    private String ProcessCount;

    /**
    * Software application.
    */
    @SerializedName("AppCount")
    @Expose
    private String AppCount;

    /**
    * Listening port
    */
    @SerializedName("PortCount")
    @Expose
    private Long PortCount;

    /**
    * Network attack.
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * Network access.
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * Network Interception
    */
    @SerializedName("Intercept")
    @Expose
    private Long Intercept;

    /**
    * Inbound peak bandwidth.
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * Outbound peak bandwidth.
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * Total inbound traffic.
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * Outbound cumulative traffic.
    */
    @SerializedName("OutFlow")
    @Expose
    private String OutFlow;

    /**
    * Last scan time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Malicious outgoing request.
    */
    @SerializedName("NetWorkOut")
    @Expose
    private Long NetWorkOut;

    /**
    * Port risk.
    */
    @SerializedName("PortRisk")
    @Expose
    private Long PortRisk;

    /**
    * Vulnerability risk.
    */
    @SerializedName("VulnerabilityRisk")
    @Expose
    private Long VulnerabilityRisk;

    /**
    * Configuration risk.
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Scan Task Count
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * memberId
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * Full OS Name
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * Risk service exposure.
    */
    @SerializedName("RiskExposure")
    @Expose
    private Long RiskExposure;

    /**
    * Simulated Attack Tool Status. 0 indicates not installed. 1 indicates installed. 2 indicates offline.
    */
    @SerializedName("BASAgentStatus")
    @Expose
    private Long BASAgentStatus;

    /**
    * 1-New Asset; 0-Not a New Asset
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * 0: not installed; 1: install; 2: installing.
    */
    @SerializedName("CVMAgentStatus")
    @Expose
    private Long CVMAgentStatus;

    /**
    * 1: enable 0: not enabled.
    */
    @SerializedName("CVMStatus")
    @Expose
    private Long CVMStatus;

    /**
    * 1: client installed 0: not installed 2: Agentless.
    */
    @SerializedName("DefenseModel")
    @Expose
    private Long DefenseModel;

    /**
    * 1: installed 0: not installed.
    */
    @SerializedName("TatStatus")
    @Expose
    private Long TatStatus;

    /**
    * cpu trend chart.
    */
    @SerializedName("CpuTrend")
    @Expose
    private Element [] CpuTrend;

    /**
    * Memory trend chart.
    */
    @SerializedName("MemoryTrend")
    @Expose
    private Element [] MemoryTrend;

    /**
    * 1: agent online 0: agent offline 2: host offline.
    */
    @SerializedName("AgentStatus")
    @Expose
    private Long AgentStatus;

    /**
    * Number of shutdowns this month.
    */
    @SerializedName("CloseDefenseCount")
    @Expose
    private Long CloseDefenseCount;

    /**
    * Running state.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Security group data.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Physical memory occupied KB.
    */
    @SerializedName("AgentMemRss")
    @Expose
    private Long AgentMemRss;

    /**
    * CPU utilization percentage.
    */
    @SerializedName("AgentCpuPer")
    @Expose
    private Float AgentCpuPer;

    /**
    * Actual appid belonging to cvm.
    */
    @SerializedName("RealAppid")
    @Expose
    private Long RealAppid;

    /**
    * Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * Host protection status enumeration.
0: not installed.
Basic edition protection.
2: inclusive edition protection.
3: protection by pro edition.
4: ultimate edition protection.
5: offline.
6: shutdown.
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * Last offline time.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset name. 
     * @return AssetName Asset name.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name.
     * @param AssetName Asset name.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type. 
     * @return AssetType Asset type.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type.
     * @param AssetType Asset type.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Protection status 
     * @return CWPStatus Protection status
     */
    public Long getCWPStatus() {
        return this.CWPStatus;
    }

    /**
     * Set Protection status
     * @param CWPStatus Protection status
     */
    public void setCWPStatus(Long CWPStatus) {
        this.CWPStatus = CWPStatus;
    }

    /**
     * Get Asset creation time. 
     * @return AssetCreateTime Asset creation time.
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset creation time.
     * @param AssetCreateTime Asset creation time.
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP. 
     * @return PrivateIp Private IP.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP.
     * @param PrivateIp Private IP.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC Name 
     * @return VpcName VPC Name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC Name
     * @param VpcName VPC Name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get App ID information 
     * @return AppId App ID information
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID information
     * @param AppId App ID information
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN 
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Nickname. 
     * @return NickName Nickname.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Nickname.
     * @param NickName Nickname.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Availability zone 
     * @return AvailableArea Availability zone
     */
    public String getAvailableArea() {
        return this.AvailableArea;
    }

    /**
     * Set Availability zone
     * @param AvailableArea Availability zone
     */
    public void setAvailableArea(String AvailableArea) {
        this.AvailableArea = AvailableArea;
    }

    /**
     * Get Core or Not 
     * @return IsCore Core or Not
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Core or Not
     * @param IsCore Core or Not
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
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
     * Get Subnet Name 
     * @return SubnetName Subnet Name
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet Name
     * @param SubnetName Subnet Name
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get CWP Agent UUID. 
     * @return InstanceUuid CWP Agent UUID.
     */
    public String getInstanceUuid() {
        return this.InstanceUuid;
    }

    /**
     * Set CWP Agent UUID.
     * @param InstanceUuid CWP Agent UUID.
     */
    public void setInstanceUuid(String InstanceUuid) {
        this.InstanceUuid = InstanceUuid;
    }

    /**
     * Get CVM host UUID. 
     * @return InstanceQUuid CVM host UUID.
     */
    public String getInstanceQUuid() {
        return this.InstanceQUuid;
    }

    /**
     * Set CVM host UUID.
     * @param InstanceQUuid CVM host UUID.
     */
    public void setInstanceQUuid(String InstanceQUuid) {
        this.InstanceQUuid = InstanceQUuid;
    }

    /**
     * Get OS Name 
     * @return OsName OS Name
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set OS Name
     * @param OsName OS Name
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Partition 
     * @return PartitionCount Partition
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Partition
     * @param PartitionCount Partition
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get CPU Information 
     * @return CPUInfo CPU Information
     */
    public String getCPUInfo() {
        return this.CPUInfo;
    }

    /**
     * Set CPU Information
     * @param CPUInfo CPU Information
     */
    public void setCPUInfo(String CPUInfo) {
        this.CPUInfo = CPUInfo;
    }

    /**
     * Get CPU Size 
     * @return CPUSize CPU Size
     */
    public Long getCPUSize() {
        return this.CPUSize;
    }

    /**
     * Set CPU Size
     * @param CPUSize CPU Size
     */
    public void setCPUSize(Long CPUSize) {
        this.CPUSize = CPUSize;
    }

    /**
     * Get CPU Load 
     * @return CPULoad CPU Load
     */
    public String getCPULoad() {
        return this.CPULoad;
    }

    /**
     * Set CPU Load
     * @param CPULoad CPU Load
     */
    public void setCPULoad(String CPULoad) {
        this.CPULoad = CPULoad;
    }

    /**
     * Get Memory size. 
     * @return MemorySize Memory size.
     */
    public String getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Memory size.
     * @param MemorySize Memory size.
     */
    public void setMemorySize(String MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Memory Load 
     * @return MemoryLoad Memory Load
     */
    public String getMemoryLoad() {
        return this.MemoryLoad;
    }

    /**
     * Set Memory Load
     * @param MemoryLoad Memory Load
     */
    public void setMemoryLoad(String MemoryLoad) {
        this.MemoryLoad = MemoryLoad;
    }

    /**
     * Get Hard disk size. 
     * @return DiskSize Hard disk size.
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Hard disk size.
     * @param DiskSize Hard disk size.
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Hard Disk Load 
     * @return DiskLoad Hard Disk Load
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set Hard Disk Load
     * @param DiskLoad Hard Disk Load
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get Number of Accounts 
     * @return AccountCount Number of Accounts
     */
    public String getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set Number of Accounts
     * @param AccountCount Number of Accounts
     */
    public void setAccountCount(String AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get Number of Processes 
     * @return ProcessCount Number of Processes
     */
    public String getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set Number of Processes
     * @param ProcessCount Number of Processes
     */
    public void setProcessCount(String ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get Software application. 
     * @return AppCount Software application.
     */
    public String getAppCount() {
        return this.AppCount;
    }

    /**
     * Set Software application.
     * @param AppCount Software application.
     */
    public void setAppCount(String AppCount) {
        this.AppCount = AppCount;
    }

    /**
     * Get Listening port 
     * @return PortCount Listening port
     */
    public Long getPortCount() {
        return this.PortCount;
    }

    /**
     * Set Listening port
     * @param PortCount Listening port
     */
    public void setPortCount(Long PortCount) {
        this.PortCount = PortCount;
    }

    /**
     * Get Network attack. 
     * @return Attack Network attack.
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Network attack.
     * @param Attack Network attack.
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get Network access. 
     * @return Access Network access.
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set Network access.
     * @param Access Network access.
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get Network Interception 
     * @return Intercept Network Interception
     */
    public Long getIntercept() {
        return this.Intercept;
    }

    /**
     * Set Network Interception
     * @param Intercept Network Interception
     */
    public void setIntercept(Long Intercept) {
        this.Intercept = Intercept;
    }

    /**
     * Get Inbound peak bandwidth. 
     * @return InBandwidth Inbound peak bandwidth.
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set Inbound peak bandwidth.
     * @param InBandwidth Inbound peak bandwidth.
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get Outbound peak bandwidth. 
     * @return OutBandwidth Outbound peak bandwidth.
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set Outbound peak bandwidth.
     * @param OutBandwidth Outbound peak bandwidth.
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get Total inbound traffic. 
     * @return InFlow Total inbound traffic.
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set Total inbound traffic.
     * @param InFlow Total inbound traffic.
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get Outbound cumulative traffic. 
     * @return OutFlow Outbound cumulative traffic.
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set Outbound cumulative traffic.
     * @param OutFlow Outbound cumulative traffic.
     */
    public void setOutFlow(String OutFlow) {
        this.OutFlow = OutFlow;
    }

    /**
     * Get Last scan time 
     * @return LastScanTime Last scan time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scan time
     * @param LastScanTime Last scan time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Malicious outgoing request. 
     * @return NetWorkOut Malicious outgoing request.
     */
    public Long getNetWorkOut() {
        return this.NetWorkOut;
    }

    /**
     * Set Malicious outgoing request.
     * @param NetWorkOut Malicious outgoing request.
     */
    public void setNetWorkOut(Long NetWorkOut) {
        this.NetWorkOut = NetWorkOut;
    }

    /**
     * Get Port risk. 
     * @return PortRisk Port risk.
     */
    public Long getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set Port risk.
     * @param PortRisk Port risk.
     */
    public void setPortRisk(Long PortRisk) {
        this.PortRisk = PortRisk;
    }

    /**
     * Get Vulnerability risk. 
     * @return VulnerabilityRisk Vulnerability risk.
     */
    public Long getVulnerabilityRisk() {
        return this.VulnerabilityRisk;
    }

    /**
     * Set Vulnerability risk.
     * @param VulnerabilityRisk Vulnerability risk.
     */
    public void setVulnerabilityRisk(Long VulnerabilityRisk) {
        this.VulnerabilityRisk = VulnerabilityRisk;
    }

    /**
     * Get Configuration risk. 
     * @return ConfigurationRisk Configuration risk.
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuration risk.
     * @param ConfigurationRisk Configuration risk.
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Scan Task Count 
     * @return ScanTask Scan Task Count
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Scan Task Count
     * @param ScanTask Scan Task Count
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get memberId 
     * @return MemberId memberId
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set memberId
     * @param MemberId memberId
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Full OS Name 
     * @return Os Full OS Name
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set Full OS Name
     * @param Os Full OS Name
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get Risk service exposure. 
     * @return RiskExposure Risk service exposure.
     */
    public Long getRiskExposure() {
        return this.RiskExposure;
    }

    /**
     * Set Risk service exposure.
     * @param RiskExposure Risk service exposure.
     */
    public void setRiskExposure(Long RiskExposure) {
        this.RiskExposure = RiskExposure;
    }

    /**
     * Get Simulated Attack Tool Status. 0 indicates not installed. 1 indicates installed. 2 indicates offline. 
     * @return BASAgentStatus Simulated Attack Tool Status. 0 indicates not installed. 1 indicates installed. 2 indicates offline.
     */
    public Long getBASAgentStatus() {
        return this.BASAgentStatus;
    }

    /**
     * Set Simulated Attack Tool Status. 0 indicates not installed. 1 indicates installed. 2 indicates offline.
     * @param BASAgentStatus Simulated Attack Tool Status. 0 indicates not installed. 1 indicates installed. 2 indicates offline.
     */
    public void setBASAgentStatus(Long BASAgentStatus) {
        this.BASAgentStatus = BASAgentStatus;
    }

    /**
     * Get 1-New Asset; 0-Not a New Asset 
     * @return IsNewAsset 1-New Asset; 0-Not a New Asset
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set 1-New Asset; 0-Not a New Asset
     * @param IsNewAsset 1-New Asset; 0-Not a New Asset
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    /**
     * Get 0: not installed; 1: install; 2: installing. 
     * @return CVMAgentStatus 0: not installed; 1: install; 2: installing.
     */
    public Long getCVMAgentStatus() {
        return this.CVMAgentStatus;
    }

    /**
     * Set 0: not installed; 1: install; 2: installing.
     * @param CVMAgentStatus 0: not installed; 1: install; 2: installing.
     */
    public void setCVMAgentStatus(Long CVMAgentStatus) {
        this.CVMAgentStatus = CVMAgentStatus;
    }

    /**
     * Get 1: enable 0: not enabled. 
     * @return CVMStatus 1: enable 0: not enabled.
     */
    public Long getCVMStatus() {
        return this.CVMStatus;
    }

    /**
     * Set 1: enable 0: not enabled.
     * @param CVMStatus 1: enable 0: not enabled.
     */
    public void setCVMStatus(Long CVMStatus) {
        this.CVMStatus = CVMStatus;
    }

    /**
     * Get 1: client installed 0: not installed 2: Agentless. 
     * @return DefenseModel 1: client installed 0: not installed 2: Agentless.
     */
    public Long getDefenseModel() {
        return this.DefenseModel;
    }

    /**
     * Set 1: client installed 0: not installed 2: Agentless.
     * @param DefenseModel 1: client installed 0: not installed 2: Agentless.
     */
    public void setDefenseModel(Long DefenseModel) {
        this.DefenseModel = DefenseModel;
    }

    /**
     * Get 1: installed 0: not installed. 
     * @return TatStatus 1: installed 0: not installed.
     */
    public Long getTatStatus() {
        return this.TatStatus;
    }

    /**
     * Set 1: installed 0: not installed.
     * @param TatStatus 1: installed 0: not installed.
     */
    public void setTatStatus(Long TatStatus) {
        this.TatStatus = TatStatus;
    }

    /**
     * Get cpu trend chart. 
     * @return CpuTrend cpu trend chart.
     */
    public Element [] getCpuTrend() {
        return this.CpuTrend;
    }

    /**
     * Set cpu trend chart.
     * @param CpuTrend cpu trend chart.
     */
    public void setCpuTrend(Element [] CpuTrend) {
        this.CpuTrend = CpuTrend;
    }

    /**
     * Get Memory trend chart. 
     * @return MemoryTrend Memory trend chart.
     */
    public Element [] getMemoryTrend() {
        return this.MemoryTrend;
    }

    /**
     * Set Memory trend chart.
     * @param MemoryTrend Memory trend chart.
     */
    public void setMemoryTrend(Element [] MemoryTrend) {
        this.MemoryTrend = MemoryTrend;
    }

    /**
     * Get 1: agent online 0: agent offline 2: host offline. 
     * @return AgentStatus 1: agent online 0: agent offline 2: host offline.
     */
    public Long getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set 1: agent online 0: agent offline 2: host offline.
     * @param AgentStatus 1: agent online 0: agent offline 2: host offline.
     */
    public void setAgentStatus(Long AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get Number of shutdowns this month. 
     * @return CloseDefenseCount Number of shutdowns this month.
     */
    public Long getCloseDefenseCount() {
        return this.CloseDefenseCount;
    }

    /**
     * Set Number of shutdowns this month.
     * @param CloseDefenseCount Number of shutdowns this month.
     */
    public void setCloseDefenseCount(Long CloseDefenseCount) {
        this.CloseDefenseCount = CloseDefenseCount;
    }

    /**
     * Get Running state. 
     * @return InstanceState Running state.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Running state.
     * @param InstanceState Running state.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Security group data. 
     * @return SecurityGroupIds Security group data.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group data.
     * @param SecurityGroupIds Security group data.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Physical memory occupied KB. 
     * @return AgentMemRss Physical memory occupied KB.
     */
    public Long getAgentMemRss() {
        return this.AgentMemRss;
    }

    /**
     * Set Physical memory occupied KB.
     * @param AgentMemRss Physical memory occupied KB.
     */
    public void setAgentMemRss(Long AgentMemRss) {
        this.AgentMemRss = AgentMemRss;
    }

    /**
     * Get CPU utilization percentage. 
     * @return AgentCpuPer CPU utilization percentage.
     */
    public Float getAgentCpuPer() {
        return this.AgentCpuPer;
    }

    /**
     * Set CPU utilization percentage.
     * @param AgentCpuPer CPU utilization percentage.
     */
    public void setAgentCpuPer(Float AgentCpuPer) {
        this.AgentCpuPer = AgentCpuPer;
    }

    /**
     * Get Actual appid belonging to cvm. 
     * @return RealAppid Actual appid belonging to cvm.
     */
    public Long getRealAppid() {
        return this.RealAppid;
    }

    /**
     * Set Actual appid belonging to cvm.
     * @param RealAppid Actual appid belonging to cvm.
     */
    public void setRealAppid(Long RealAppid) {
        this.RealAppid = RealAppid;
    }

    /**
     * Get Cloud asset type: 0: tencent cloud, 1: aws, 2: azure. 
     * @return CloudType Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
     * @param CloudType Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get Host protection status enumeration.
0: not installed.
Basic edition protection.
2: inclusive edition protection.
3: protection by pro edition.
4: ultimate edition protection.
5: offline.
6: shutdown. 
     * @return ProtectStatus Host protection status enumeration.
0: not installed.
Basic edition protection.
2: inclusive edition protection.
3: protection by pro edition.
4: ultimate edition protection.
5: offline.
6: shutdown.
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set Host protection status enumeration.
0: not installed.
Basic edition protection.
2: inclusive edition protection.
3: protection by pro edition.
4: ultimate edition protection.
5: offline.
6: shutdown.
     * @param ProtectStatus Host protection status enumeration.
0: not installed.
Basic edition protection.
2: inclusive edition protection.
3: protection by pro edition.
4: ultimate edition protection.
5: offline.
6: shutdown.
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get Last offline time. 
     * @return OfflineTime Last offline time.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Last offline time.
     * @param OfflineTime Last offline time.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    public CVMAssetVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVMAssetVO(CVMAssetVO source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CWPStatus != null) {
            this.CWPStatus = new Long(source.CWPStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.AvailableArea != null) {
            this.AvailableArea = new String(source.AvailableArea);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.InstanceUuid != null) {
            this.InstanceUuid = new String(source.InstanceUuid);
        }
        if (source.InstanceQUuid != null) {
            this.InstanceQUuid = new String(source.InstanceQUuid);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.CPUInfo != null) {
            this.CPUInfo = new String(source.CPUInfo);
        }
        if (source.CPUSize != null) {
            this.CPUSize = new Long(source.CPUSize);
        }
        if (source.CPULoad != null) {
            this.CPULoad = new String(source.CPULoad);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new String(source.MemorySize);
        }
        if (source.MemoryLoad != null) {
            this.MemoryLoad = new String(source.MemoryLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new String(source.DiskSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new String(source.AccountCount);
        }
        if (source.ProcessCount != null) {
            this.ProcessCount = new String(source.ProcessCount);
        }
        if (source.AppCount != null) {
            this.AppCount = new String(source.AppCount);
        }
        if (source.PortCount != null) {
            this.PortCount = new Long(source.PortCount);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.Intercept != null) {
            this.Intercept = new Long(source.Intercept);
        }
        if (source.InBandwidth != null) {
            this.InBandwidth = new String(source.InBandwidth);
        }
        if (source.OutBandwidth != null) {
            this.OutBandwidth = new String(source.OutBandwidth);
        }
        if (source.InFlow != null) {
            this.InFlow = new String(source.InFlow);
        }
        if (source.OutFlow != null) {
            this.OutFlow = new String(source.OutFlow);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.NetWorkOut != null) {
            this.NetWorkOut = new Long(source.NetWorkOut);
        }
        if (source.PortRisk != null) {
            this.PortRisk = new Long(source.PortRisk);
        }
        if (source.VulnerabilityRisk != null) {
            this.VulnerabilityRisk = new Long(source.VulnerabilityRisk);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.ScanTask != null) {
            this.ScanTask = new Long(source.ScanTask);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.RiskExposure != null) {
            this.RiskExposure = new Long(source.RiskExposure);
        }
        if (source.BASAgentStatus != null) {
            this.BASAgentStatus = new Long(source.BASAgentStatus);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.CVMAgentStatus != null) {
            this.CVMAgentStatus = new Long(source.CVMAgentStatus);
        }
        if (source.CVMStatus != null) {
            this.CVMStatus = new Long(source.CVMStatus);
        }
        if (source.DefenseModel != null) {
            this.DefenseModel = new Long(source.DefenseModel);
        }
        if (source.TatStatus != null) {
            this.TatStatus = new Long(source.TatStatus);
        }
        if (source.CpuTrend != null) {
            this.CpuTrend = new Element[source.CpuTrend.length];
            for (int i = 0; i < source.CpuTrend.length; i++) {
                this.CpuTrend[i] = new Element(source.CpuTrend[i]);
            }
        }
        if (source.MemoryTrend != null) {
            this.MemoryTrend = new Element[source.MemoryTrend.length];
            for (int i = 0; i < source.MemoryTrend.length; i++) {
                this.MemoryTrend[i] = new Element(source.MemoryTrend[i]);
            }
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new Long(source.AgentStatus);
        }
        if (source.CloseDefenseCount != null) {
            this.CloseDefenseCount = new Long(source.CloseDefenseCount);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AgentMemRss != null) {
            this.AgentMemRss = new Long(source.AgentMemRss);
        }
        if (source.AgentCpuPer != null) {
            this.AgentCpuPer = new Float(source.AgentCpuPer);
        }
        if (source.RealAppid != null) {
            this.RealAppid = new Long(source.RealAppid);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CWPStatus", this.CWPStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "AvailableArea", this.AvailableArea);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "InstanceUuid", this.InstanceUuid);
        this.setParamSimple(map, prefix + "InstanceQUuid", this.InstanceQUuid);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "CPUInfo", this.CPUInfo);
        this.setParamSimple(map, prefix + "CPUSize", this.CPUSize);
        this.setParamSimple(map, prefix + "CPULoad", this.CPULoad);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "MemoryLoad", this.MemoryLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "ProcessCount", this.ProcessCount);
        this.setParamSimple(map, prefix + "AppCount", this.AppCount);
        this.setParamSimple(map, prefix + "PortCount", this.PortCount);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Intercept", this.Intercept);
        this.setParamSimple(map, prefix + "InBandwidth", this.InBandwidth);
        this.setParamSimple(map, prefix + "OutBandwidth", this.OutBandwidth);
        this.setParamSimple(map, prefix + "InFlow", this.InFlow);
        this.setParamSimple(map, prefix + "OutFlow", this.OutFlow);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "NetWorkOut", this.NetWorkOut);
        this.setParamSimple(map, prefix + "PortRisk", this.PortRisk);
        this.setParamSimple(map, prefix + "VulnerabilityRisk", this.VulnerabilityRisk);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "RiskExposure", this.RiskExposure);
        this.setParamSimple(map, prefix + "BASAgentStatus", this.BASAgentStatus);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "CVMAgentStatus", this.CVMAgentStatus);
        this.setParamSimple(map, prefix + "CVMStatus", this.CVMStatus);
        this.setParamSimple(map, prefix + "DefenseModel", this.DefenseModel);
        this.setParamSimple(map, prefix + "TatStatus", this.TatStatus);
        this.setParamArrayObj(map, prefix + "CpuTrend.", this.CpuTrend);
        this.setParamArrayObj(map, prefix + "MemoryTrend.", this.MemoryTrend);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "CloseDefenseCount", this.CloseDefenseCount);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "AgentMemRss", this.AgentMemRss);
        this.setParamSimple(map, prefix + "AgentCpuPer", this.AgentCpuPer);
        this.setParamSimple(map, prefix + "RealAppid", this.RealAppid);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);

    }
}

