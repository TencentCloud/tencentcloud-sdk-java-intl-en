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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAssetVO extends AbstractModel {

    /**
    * Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetId")
    @Expose
    private String [] AssetId;

    /**
    * Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetName")
    @Expose
    private String [] AssetName;

    /**
    * Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetType")
    @Expose
    private String [] AssetType;

    /**
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * WAF status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WAFStatus")
    @Expose
    private Long WAFStatus;

    /**
    * Asset creation time
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Appid
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Account name
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
    * Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * Network access
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * Network interception
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
    * Outbound peak bandwidth
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
    * Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Resolved IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SeverIp")
    @Expose
    private String [] SeverIp;

    /**
    * Bot access requests
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotCount")
    @Expose
    private Long BotCount;

    /**
    * Weak password risks
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
    * The type of associated instances.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Member ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * CC attacks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CCAttack")
    @Expose
    private Long CCAttack;

    /**
    * Web attack
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebAttack")
    @Expose
    private Long WebAttack;

    /**
    * Services exposed to risks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceRisk")
    @Expose
    private Long ServiceRisk;

    /**
    * Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * Random third-level domain name of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyDomain")
    @Expose
    private String VerifyDomain;

    /**
    * TXT record of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyTXTRecord")
    @Expose
    private String VerifyTXTRecord;

    /**
    * Ownership verification status of the asset. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3`: TXT record verification failed; `4`: Human verification failed.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

    /**
    * Bot access data
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotAccessCount")
    @Expose
    private Long BotAccessCount;

    /**
     * Get Asset ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetId(String [] AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetName(String [] AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetType(String [] AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get WAF status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WAFStatus WAF status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWAFStatus() {
        return this.WAFStatus;
    }

    /**
     * Set WAF status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WAFStatus WAF status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWAFStatus(Long WAFStatus) {
        this.WAFStatus = WAFStatus;
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
     * Get Appid
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AppId Appid
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Appid
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AppId Appid
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Uin Account ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Uin Account ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Account name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NickName Account name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NickName Account name
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
     * Get Network attacks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Attack Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Attack Network attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get Network access
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Access Network access
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set Network access
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Access Network access
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get Network interception
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Intercept Network interception
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIntercept() {
        return this.Intercept;
    }

    /**
     * Set Network interception
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Intercept Network interception
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
     * Get Outbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutBandwidth Outbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set Outbound peak bandwidth
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutBandwidth Outbound peak bandwidth
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
     * Get Domain name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SubDomain Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SubDomain Domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Resolved IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SeverIp Resolved IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String [] getSeverIp() {
        return this.SeverIp;
    }

    /**
     * Set Resolved IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SeverIp Resolved IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSeverIp(String [] SeverIp) {
        this.SeverIp = SeverIp;
    }

    /**
     * Get Bot access requests
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return BotCount Bot access requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getBotCount() {
        return this.BotCount;
    }

    /**
     * Set Bot access requests
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param BotCount Bot access requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setBotCount(Long BotCount) {
        this.BotCount = BotCount;
    }

    /**
     * Get Weak password risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WeakPassword Weak password risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set Weak password risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WeakPassword Weak password risks
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
     * Get The type of associated instances.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SourceType The type of associated instances.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set The type of associated instances.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SourceType The type of associated instances.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
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
     * Get CC attacks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CCAttack CC attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getCCAttack() {
        return this.CCAttack;
    }

    /**
     * Set CC attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CCAttack CC attacks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCCAttack(Long CCAttack) {
        this.CCAttack = CCAttack;
    }

    /**
     * Get Web attack
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WebAttack Web attack
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWebAttack() {
        return this.WebAttack;
    }

    /**
     * Set Web attack
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WebAttack Web attack
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWebAttack(Long WebAttack) {
        this.WebAttack = WebAttack;
    }

    /**
     * Get Services exposed to risks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ServiceRisk Services exposed to risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getServiceRisk() {
        return this.ServiceRisk;
    }

    /**
     * Set Services exposed to risks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ServiceRisk Services exposed to risks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setServiceRisk(Long ServiceRisk) {
        this.ServiceRisk = ServiceRisk;
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
     * Get Random third-level domain name of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VerifyDomain Random third-level domain name of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVerifyDomain() {
        return this.VerifyDomain;
    }

    /**
     * Set Random third-level domain name of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VerifyDomain Random third-level domain name of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVerifyDomain(String VerifyDomain) {
        this.VerifyDomain = VerifyDomain;
    }

    /**
     * Get TXT record of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VerifyTXTRecord TXT record of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVerifyTXTRecord() {
        return this.VerifyTXTRecord;
    }

    /**
     * Set TXT record of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VerifyTXTRecord TXT record of the asset pending ownership verification
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVerifyTXTRecord(String VerifyTXTRecord) {
        this.VerifyTXTRecord = VerifyTXTRecord;
    }

    /**
     * Get Ownership verification status of the asset. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3`: TXT record verification failed; `4`: Human verification failed.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VerifyStatus Ownership verification status of the asset. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3`: TXT record verification failed; `4`: Human verification failed.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set Ownership verification status of the asset. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3`: TXT record verification failed; `4`: Human verification failed.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VerifyStatus Ownership verification status of the asset. `0`: Pending verification; `1`: Verified; `2`: Verifying; `3`: TXT record verification failed; `4`: Human verification failed.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * Get Bot access data
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return BotAccessCount Bot access data
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getBotAccessCount() {
        return this.BotAccessCount;
    }

    /**
     * Set Bot access data
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param BotAccessCount Bot access data
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setBotAccessCount(Long BotAccessCount) {
        this.BotAccessCount = BotAccessCount;
    }

    public DomainAssetVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAssetVO(DomainAssetVO source) {
        if (source.AssetId != null) {
            this.AssetId = new String[source.AssetId.length];
            for (int i = 0; i < source.AssetId.length; i++) {
                this.AssetId[i] = new String(source.AssetId[i]);
            }
        }
        if (source.AssetName != null) {
            this.AssetName = new String[source.AssetName.length];
            for (int i = 0; i < source.AssetName.length; i++) {
                this.AssetName[i] = new String(source.AssetName[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String[source.AssetType.length];
            for (int i = 0; i < source.AssetType.length; i++) {
                this.AssetType[i] = new String(source.AssetType[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.WAFStatus != null) {
            this.WAFStatus = new Long(source.WAFStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
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
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.SeverIp != null) {
            this.SeverIp = new String[source.SeverIp.length];
            for (int i = 0; i < source.SeverIp.length; i++) {
                this.SeverIp[i] = new String(source.SeverIp[i]);
            }
        }
        if (source.BotCount != null) {
            this.BotCount = new Long(source.BotCount);
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
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.CCAttack != null) {
            this.CCAttack = new Long(source.CCAttack);
        }
        if (source.WebAttack != null) {
            this.WebAttack = new Long(source.WebAttack);
        }
        if (source.ServiceRisk != null) {
            this.ServiceRisk = new Long(source.ServiceRisk);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.VerifyDomain != null) {
            this.VerifyDomain = new String(source.VerifyDomain);
        }
        if (source.VerifyTXTRecord != null) {
            this.VerifyTXTRecord = new String(source.VerifyTXTRecord);
        }
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
        }
        if (source.BotAccessCount != null) {
            this.BotAccessCount = new Long(source.BotAccessCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetId.", this.AssetId);
        this.setParamArraySimple(map, prefix + "AssetName.", this.AssetName);
        this.setParamArraySimple(map, prefix + "AssetType.", this.AssetType);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "WAFStatus", this.WAFStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);
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
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamArraySimple(map, prefix + "SeverIp.", this.SeverIp);
        this.setParamSimple(map, prefix + "BotCount", this.BotCount);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "WebContentRisk", this.WebContentRisk);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "CCAttack", this.CCAttack);
        this.setParamSimple(map, prefix + "WebAttack", this.WebAttack);
        this.setParamSimple(map, prefix + "ServiceRisk", this.ServiceRisk);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "VerifyDomain", this.VerifyDomain);
        this.setParamSimple(map, prefix + "VerifyTXTRecord", this.VerifyTXTRecord);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "BotAccessCount", this.BotAccessCount);

    }
}

