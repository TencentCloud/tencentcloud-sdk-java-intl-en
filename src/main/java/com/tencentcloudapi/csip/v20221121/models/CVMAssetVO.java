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
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Protection status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPStatus")
    @Expose
    private Long CWPStatus;

    /**
    * Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * App ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * User name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableArea")
    @Expose
    private String AvailableArea;

    /**
    * Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Subnet ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Subnet name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * UUID of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceUuid")
    @Expose
    private String InstanceUuid;

    /**
    * QUuid of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceQUuid")
    @Expose
    private String InstanceQUuid;

    /**
    * OS name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Number of partitions
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * CPU information
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CPUInfo")
    @Expose
    private String CPUInfo;

    /**
    * CPU size
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CPUSize")
    @Expose
    private Long CPUSize;

    /**
    * CPU load
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CPULoad")
    @Expose
    private String CPULoad;

    /**
    * Memory size
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemorySize")
    @Expose
    private String MemorySize;

    /**
    * Memory load
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryLoad")
    @Expose
    private String MemoryLoad;

    /**
    * Disk size.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * Disk load
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * Number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountCount")
    @Expose
    private String AccountCount;

    /**
    * Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessCount")
    @Expose
    private String ProcessCount;

    /**
    * Number of applications
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppCount")
    @Expose
    private String AppCount;

    /**
    * Number of listened ports.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PortCount")
    @Expose
    private Long PortCount;

    /**
    * Number of network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * Number of network access requests
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * Number of blocked attacks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Intercept")
    @Expose
    private Long Intercept;

    /**
    * Inbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * OutInbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * Total inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * Total outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutFlow")
    @Expose
    private String OutFlow;

    /**
    * Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Proactive malicious outgoing requests
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetWorkOut")
    @Expose
    private Long NetWorkOut;

    /**
    * Port risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PortRisk")
    @Expose
    private Long PortRisk;

    /**
    * Vulnerabilities
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulnerabilityRisk")
    @Expose
    private Long VulnerabilityRisk;

    /**
    * Configuraiton risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Number of scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * Tags
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Member ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * Full name of the operating system
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * Risk exposure
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskExposure")
    @Expose
    private Long RiskExposure;

    /**
    * BAS toolkit status. `0`: Not installed; `1`: Installed; `2`: Offline.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("BASAgentStatus")
    @Expose
    private Long BASAgentStatus;

    /**
    * `1`: New asset; `0`: Not a new asset
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
     * Get Asset ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Protection status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CWPStatus Protection status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getCWPStatus() {
        return this.CWPStatus;
    }

    /**
     * Set Protection status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CWPStatus Protection status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCWPStatus(Long CWPStatus) {
        this.CWPStatus = CWPStatus;
    }

    /**
     * Get Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetCreateTime Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetCreateTime Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get Public IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PublicIp Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PublicIp Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PrivateIp Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PrivateIp Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VpcName VPC name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VpcName VPC name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get App ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppId App ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppId App ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User `uin`
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Uin User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Uin User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get User name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NickName User name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set User name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NickName User name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Availability zone
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AvailableArea Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAvailableArea() {
        return this.AvailableArea;
    }

    /**
     * Set Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AvailableArea Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAvailableArea(String AvailableArea) {
        this.AvailableArea = AvailableArea;
    }

    /**
     * Get Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsCore Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsCore Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get Subnet ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Subnet name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SubnetName Subnet name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SubnetName Subnet name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get UUID of the instance
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InstanceUuid UUID of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInstanceUuid() {
        return this.InstanceUuid;
    }

    /**
     * Set UUID of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InstanceUuid UUID of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInstanceUuid(String InstanceUuid) {
        this.InstanceUuid = InstanceUuid;
    }

    /**
     * Get QUuid of the instance
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InstanceQUuid QUuid of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInstanceQUuid() {
        return this.InstanceQUuid;
    }

    /**
     * Set QUuid of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InstanceQUuid QUuid of the instance
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInstanceQUuid(String InstanceQUuid) {
        this.InstanceQUuid = InstanceQUuid;
    }

    /**
     * Get OS name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OsName OS name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set OS name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OsName OS name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Number of partitions
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PartitionCount Number of partitions
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Number of partitions
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PartitionCount Number of partitions
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get CPU information
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CPUInfo CPU information
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getCPUInfo() {
        return this.CPUInfo;
    }

    /**
     * Set CPU information
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CPUInfo CPU information
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCPUInfo(String CPUInfo) {
        this.CPUInfo = CPUInfo;
    }

    /**
     * Get CPU size
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CPUSize CPU size
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getCPUSize() {
        return this.CPUSize;
    }

    /**
     * Set CPU size
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CPUSize CPU size
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCPUSize(Long CPUSize) {
        this.CPUSize = CPUSize;
    }

    /**
     * Get CPU load
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CPULoad CPU load
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getCPULoad() {
        return this.CPULoad;
    }

    /**
     * Set CPU load
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CPULoad CPU load
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCPULoad(String CPULoad) {
        this.CPULoad = CPULoad;
    }

    /**
     * Get Memory size
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return MemorySize Memory size
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Memory size
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param MemorySize Memory size
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setMemorySize(String MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Memory load
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return MemoryLoad Memory load
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getMemoryLoad() {
        return this.MemoryLoad;
    }

    /**
     * Set Memory load
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param MemoryLoad Memory load
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setMemoryLoad(String MemoryLoad) {
        this.MemoryLoad = MemoryLoad;
    }

    /**
     * Get Disk size.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DiskSize Disk size.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DiskSize Disk size.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk load
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DiskLoad Disk load
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set Disk load
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DiskLoad Disk load
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get Number of accounts
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AccountCount Number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set Number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AccountCount Number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAccountCount(String AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get Number of processes
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ProcessCount Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ProcessCount Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setProcessCount(String ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get Number of applications
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppCount Number of applications
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAppCount() {
        return this.AppCount;
    }

    /**
     * Set Number of applications
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppCount Number of applications
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppCount(String AppCount) {
        this.AppCount = AppCount;
    }

    /**
     * Get Number of listened ports.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PortCount Number of listened ports.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPortCount() {
        return this.PortCount;
    }

    /**
     * Set Number of listened ports.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PortCount Number of listened ports.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPortCount(Long PortCount) {
        this.PortCount = PortCount;
    }

    /**
     * Get Number of network attacks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Attack Number of network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Number of network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Attack Number of network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get Number of network access requests
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Access Number of network access requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set Number of network access requests
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Access Number of network access requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get Number of blocked attacks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Intercept Number of blocked attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIntercept() {
        return this.Intercept;
    }

    /**
     * Set Number of blocked attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Intercept Number of blocked attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIntercept(Long Intercept) {
        this.Intercept = Intercept;
    }

    /**
     * Get Inbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InBandwidth Inbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set Inbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InBandwidth Inbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get OutInbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutBandwidth OutInbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set OutInbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutBandwidth OutInbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get Total inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InFlow Total inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set Total inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InFlow Total inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get Total outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutFlow Total outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set Total outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutFlow Total outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutFlow(String OutFlow) {
        this.OutFlow = OutFlow;
    }

    /**
     * Get Last scan time
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LastScanTime Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LastScanTime Last scan time
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Proactive malicious outgoing requests
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NetWorkOut Proactive malicious outgoing requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getNetWorkOut() {
        return this.NetWorkOut;
    }

    /**
     * Set Proactive malicious outgoing requests
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NetWorkOut Proactive malicious outgoing requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNetWorkOut(Long NetWorkOut) {
        this.NetWorkOut = NetWorkOut;
    }

    /**
     * Get Port risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PortRisk Port risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set Port risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PortRisk Port risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPortRisk(Long PortRisk) {
        this.PortRisk = PortRisk;
    }

    /**
     * Get Vulnerabilities
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VulnerabilityRisk Vulnerabilities
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getVulnerabilityRisk() {
        return this.VulnerabilityRisk;
    }

    /**
     * Set Vulnerabilities
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VulnerabilityRisk Vulnerabilities
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVulnerabilityRisk(Long VulnerabilityRisk) {
        this.VulnerabilityRisk = VulnerabilityRisk;
    }

    /**
     * Get Configuraiton risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ConfigurationRisk Configuraiton risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuraiton risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ConfigurationRisk Configuraiton risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Number of scan tasks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ScanTask Number of scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Number of scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ScanTask Number of scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get Tags
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Tag Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Tag Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Member ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return MemberId Member ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Member ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param MemberId Member ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Full name of the operating system
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Os Full name of the operating system
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set Full name of the operating system
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Os Full name of the operating system
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get Risk exposure
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return RiskExposure Risk exposure
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getRiskExposure() {
        return this.RiskExposure;
    }

    /**
     * Set Risk exposure
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param RiskExposure Risk exposure
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRiskExposure(Long RiskExposure) {
        this.RiskExposure = RiskExposure;
    }

    /**
     * Get BAS toolkit status. `0`: Not installed; `1`: Installed; `2`: Offline.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return BASAgentStatus BAS toolkit status. `0`: Not installed; `1`: Installed; `2`: Offline.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getBASAgentStatus() {
        return this.BASAgentStatus;
    }

    /**
     * Set BAS toolkit status. `0`: Not installed; `1`: Installed; `2`: Offline.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param BASAgentStatus BAS toolkit status. `0`: Not installed; `1`: Installed; `2`: Offline.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setBASAgentStatus(Long BASAgentStatus) {
        this.BASAgentStatus = BASAgentStatus;
    }

    /**
     * Get `1`: New asset; `0`: Not a new asset
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsNewAsset `1`: New asset; `0`: Not a new asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set `1`: New asset; `0`: Not a new asset
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsNewAsset `1`: New asset; `0`: Not a new asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
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

    }
}

