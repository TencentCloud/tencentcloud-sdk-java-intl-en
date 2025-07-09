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

public class IpAssetListVO extends AbstractModel {

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
    * CFW status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFWStatus")
    @Expose
    private Long CFWStatus;

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
    * Public IP type
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

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
    * appid
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
    * Name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Whether it's a critical asset
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Whether it's a cloud asset
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

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
    * Inbound bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * Outbound bandwidthtraffic peak bandwidth (bps)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * Inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * Outbound traffic
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
    * Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * Weak passwords
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WeakPassword")
    @Expose
    private Long WeakPassword;

    /**
    * Content risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebContentRisk")
    @Expose
    private Long WebContentRisk;

    /**
    * Tags
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * EIP ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * Member ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * Risk exposure
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskExposure")
    @Expose
    private Long RiskExposure;

    /**
    * Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * Asset ownership verification status. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3` and above: Verification failed
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

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
     * Get CFW status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CFWStatus CFW status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getCFWStatus() {
        return this.CFWStatus;
    }

    /**
     * Set CFW status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CFWStatus CFW status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCFWStatus(Long CFWStatus) {
        this.CFWStatus = CFWStatus;
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
     * Get Public IP type
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PublicIpType Public IP type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set Public IP type
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PublicIpType Public IP type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
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
     * Get appid
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppId appid
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppId appid
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
     * Get Name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NickName Name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NickName Name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
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
     * Get Whether it's a cloud asset
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsCloud Whether it's a cloud asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set Whether it's a cloud asset
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsCloud Whether it's a cloud asset
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
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
     * Get Inbound bandwidth
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InBandwidth Inbound bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set Inbound bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InBandwidth Inbound bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get Outbound bandwidthtraffic peak bandwidth (bps)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutBandwidth Outbound bandwidthtraffic peak bandwidth (bps)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set Outbound bandwidthtraffic peak bandwidth (bps)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutBandwidth Outbound bandwidthtraffic peak bandwidth (bps)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get Inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InFlow Inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set Inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InFlow Inbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get Outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutFlow Outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set Outbound traffic
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutFlow Outbound traffic
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
     * Get Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ConfigurationRisk Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ConfigurationRisk Configuration risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ScanTask Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ScanTask Scan tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get Weak passwords
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WeakPassword Weak passwords
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set Weak passwords
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WeakPassword Weak passwords
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWeakPassword(Long WeakPassword) {
        this.WeakPassword = WeakPassword;
    }

    /**
     * Get Content risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WebContentRisk Content risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWebContentRisk() {
        return this.WebContentRisk;
    }

    /**
     * Set Content risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WebContentRisk Content risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWebContentRisk(Long WebContentRisk) {
        this.WebContentRisk = WebContentRisk;
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
     * Get EIP ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AddressId EIP ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AddressId EIP ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
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
     * Get Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsNewAsset Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsNewAsset Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    /**
     * Get Asset ownership verification status. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3` and above: Verification failed
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VerifyStatus Asset ownership verification status. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3` and above: Verification failed
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set Asset ownership verification status. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3` and above: Verification failed
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VerifyStatus Asset ownership verification status. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3` and above: Verification failed
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    public IpAssetListVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpAssetListVO(IpAssetListVO source) {
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
        if (source.CFWStatus != null) {
            this.CFWStatus = new Long(source.CFWStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PublicIpType != null) {
            this.PublicIpType = new Long(source.PublicIpType);
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
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsCloud != null) {
            this.IsCloud = new Long(source.IsCloud);
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
        if (source.WeakPassword != null) {
            this.WeakPassword = new Long(source.WeakPassword);
        }
        if (source.WebContentRisk != null) {
            this.WebContentRisk = new Long(source.WebContentRisk);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.RiskExposure != null) {
            this.RiskExposure = new Long(source.RiskExposure);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
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
        this.setParamSimple(map, prefix + "CFWStatus", this.CFWStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PublicIpType", this.PublicIpType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Intercept", this.Intercept);
        this.setParamSimple(map, prefix + "InBandwidth", this.InBandwidth);
        this.setParamSimple(map, prefix + "OutBandwidth", this.OutBandwidth);
        this.setParamSimple(map, prefix + "InFlow", this.InFlow);
        this.setParamSimple(map, prefix + "OutFlow", this.OutFlow);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "PortRisk", this.PortRisk);
        this.setParamSimple(map, prefix + "VulnerabilityRisk", this.VulnerabilityRisk);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "WebContentRisk", this.WebContentRisk);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "RiskExposure", this.RiskExposure);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);

    }
}

