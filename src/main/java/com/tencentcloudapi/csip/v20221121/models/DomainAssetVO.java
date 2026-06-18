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

public class DomainAssetVO extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String [] AssetId;

    /**
    * Asset Name
    */
    @SerializedName("AssetName")
    @Expose
    private String [] AssetName;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String [] AssetType;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * WAF Status
    */
    @SerializedName("WAFStatus")
    @Expose
    private Long WAFStatus;

    /**
    * Asset Creation Time
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

    /**
    * Appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Account name
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Core or Not
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Whether it is on-cloud asset.
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
    * network attack
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * Network access
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
    * Inbound peak bandwidth
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * Outbound peak bandwidth
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * Cumulative Inbound Traffic
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * Cumulative Outbound Traffic
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
    * port risk
    */
    @SerializedName("PortRisk")
    @Expose
    private Long PortRisk;

    /**
    * Vulnerability risk
    */
    @SerializedName("VulnerabilityRisk")
    @Expose
    private Long VulnerabilityRisk;

    /**
    * Configuration risk
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Scan Task
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * Domain
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Resolve IP
    */
    @SerializedName("SeverIp")
    @Expose
    private String [] SeverIp;

    /**
    * Number of Bot Attacks
    */
    @SerializedName("BotCount")
    @Expose
    private Long BotCount;

    /**
    * Weak password risk
    */
    @SerializedName("WeakPassword")
    @Expose
    private Long WeakPassword;

    /**
    * Content risk
    */
    @SerializedName("WebContentRisk")
    @Expose
    private Long WebContentRisk;

    /**
    * tag
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Associated instance type
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Member ID information
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * CC Attack
    */
    @SerializedName("CCAttack")
    @Expose
    private Long CCAttack;

    /**
    * Web Attack
    */
    @SerializedName("WebAttack")
    @Expose
    private Long WebAttack;

    /**
    * Number of Risk Service Exposures
    */
    @SerializedName("ServiceRisk")
    @Expose
    private Long ServiceRisk;

    /**
    * New Asset or Not. 1: New
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * Random Layer-3 Domain of Assets to Be Recognized
    */
    @SerializedName("VerifyDomain")
    @Expose
    private String VerifyDomain;

    /**
    * TXT Record Content of Pending Confirmation Assets
    */
    @SerializedName("VerifyTXTRecord")
    @Expose
    private String VerifyTXTRecord;

    /**
    * Authentication Status of Assets Pending Recognition. 0: Pending Authentication; 1: Authentication Succeeded; 2: Authentication in Progress; 3: TXT Authentication Failed; 4: Manual Authentication Failed.
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

    /**
    * Bot Access Count
    */
    @SerializedName("BotAccessCount")
    @Expose
    private Long BotAccessCount;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String [] getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String [] AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset Name 
     * @return AssetName Asset Name
     */
    public String [] getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset Name
     * @param AssetName Asset Name
     */
    public void setAssetName(String [] AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String [] getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String [] AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get WAF Status 
     * @return WAFStatus WAF Status
     */
    public Long getWAFStatus() {
        return this.WAFStatus;
    }

    /**
     * Set WAF Status
     * @param WAFStatus WAF Status
     */
    public void setWAFStatus(Long WAFStatus) {
        this.WAFStatus = WAFStatus;
    }

    /**
     * Get Asset Creation Time 
     * @return AssetCreateTime Asset Creation Time
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset Creation Time
     * @param AssetCreateTime Asset Creation Time
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    /**
     * Get Appid 
     * @return AppId Appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Appid
     * @param AppId Appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account ID 
     * @return Uin Account ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account ID
     * @param Uin Account ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Account name 
     * @return NickName Account name
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account name
     * @param NickName Account name
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
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
     * Get Whether it is on-cloud asset. 
     * @return IsCloud Whether it is on-cloud asset.
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set Whether it is on-cloud asset.
     * @param IsCloud Whether it is on-cloud asset.
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get network attack 
     * @return Attack network attack
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set network attack
     * @param Attack network attack
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get Network access 
     * @return Access Network access
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set Network access
     * @param Access Network access
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
     * Get Inbound peak bandwidth 
     * @return InBandwidth Inbound peak bandwidth
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set Inbound peak bandwidth
     * @param InBandwidth Inbound peak bandwidth
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get Outbound peak bandwidth 
     * @return OutBandwidth Outbound peak bandwidth
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set Outbound peak bandwidth
     * @param OutBandwidth Outbound peak bandwidth
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get Cumulative Inbound Traffic 
     * @return InFlow Cumulative Inbound Traffic
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set Cumulative Inbound Traffic
     * @param InFlow Cumulative Inbound Traffic
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get Cumulative Outbound Traffic 
     * @return OutFlow Cumulative Outbound Traffic
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set Cumulative Outbound Traffic
     * @param OutFlow Cumulative Outbound Traffic
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
     * Get port risk 
     * @return PortRisk port risk
     */
    public Long getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set port risk
     * @param PortRisk port risk
     */
    public void setPortRisk(Long PortRisk) {
        this.PortRisk = PortRisk;
    }

    /**
     * Get Vulnerability risk 
     * @return VulnerabilityRisk Vulnerability risk
     */
    public Long getVulnerabilityRisk() {
        return this.VulnerabilityRisk;
    }

    /**
     * Set Vulnerability risk
     * @param VulnerabilityRisk Vulnerability risk
     */
    public void setVulnerabilityRisk(Long VulnerabilityRisk) {
        this.VulnerabilityRisk = VulnerabilityRisk;
    }

    /**
     * Get Configuration risk 
     * @return ConfigurationRisk Configuration risk
     */
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuration risk
     * @param ConfigurationRisk Configuration risk
     */
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Scan Task 
     * @return ScanTask Scan Task
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Scan Task
     * @param ScanTask Scan Task
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
    }

    /**
     * Get Domain 
     * @return SubDomain Domain
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Domain
     * @param SubDomain Domain
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Resolve IP 
     * @return SeverIp Resolve IP
     */
    public String [] getSeverIp() {
        return this.SeverIp;
    }

    /**
     * Set Resolve IP
     * @param SeverIp Resolve IP
     */
    public void setSeverIp(String [] SeverIp) {
        this.SeverIp = SeverIp;
    }

    /**
     * Get Number of Bot Attacks 
     * @return BotCount Number of Bot Attacks
     */
    public Long getBotCount() {
        return this.BotCount;
    }

    /**
     * Set Number of Bot Attacks
     * @param BotCount Number of Bot Attacks
     */
    public void setBotCount(Long BotCount) {
        this.BotCount = BotCount;
    }

    /**
     * Get Weak password risk 
     * @return WeakPassword Weak password risk
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set Weak password risk
     * @param WeakPassword Weak password risk
     */
    public void setWeakPassword(Long WeakPassword) {
        this.WeakPassword = WeakPassword;
    }

    /**
     * Get Content risk 
     * @return WebContentRisk Content risk
     */
    public Long getWebContentRisk() {
        return this.WebContentRisk;
    }

    /**
     * Set Content risk
     * @param WebContentRisk Content risk
     */
    public void setWebContentRisk(Long WebContentRisk) {
        this.WebContentRisk = WebContentRisk;
    }

    /**
     * Get tag 
     * @return Tag tag
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set tag
     * @param Tag tag
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Associated instance type 
     * @return SourceType Associated instance type
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Associated instance type
     * @param SourceType Associated instance type
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Member ID information 
     * @return MemberId Member ID information
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Member ID information
     * @param MemberId Member ID information
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get CC Attack 
     * @return CCAttack CC Attack
     */
    public Long getCCAttack() {
        return this.CCAttack;
    }

    /**
     * Set CC Attack
     * @param CCAttack CC Attack
     */
    public void setCCAttack(Long CCAttack) {
        this.CCAttack = CCAttack;
    }

    /**
     * Get Web Attack 
     * @return WebAttack Web Attack
     */
    public Long getWebAttack() {
        return this.WebAttack;
    }

    /**
     * Set Web Attack
     * @param WebAttack Web Attack
     */
    public void setWebAttack(Long WebAttack) {
        this.WebAttack = WebAttack;
    }

    /**
     * Get Number of Risk Service Exposures 
     * @return ServiceRisk Number of Risk Service Exposures
     */
    public Long getServiceRisk() {
        return this.ServiceRisk;
    }

    /**
     * Set Number of Risk Service Exposures
     * @param ServiceRisk Number of Risk Service Exposures
     */
    public void setServiceRisk(Long ServiceRisk) {
        this.ServiceRisk = ServiceRisk;
    }

    /**
     * Get New Asset or Not. 1: New 
     * @return IsNewAsset New Asset or Not. 1: New
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set New Asset or Not. 1: New
     * @param IsNewAsset New Asset or Not. 1: New
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    /**
     * Get Random Layer-3 Domain of Assets to Be Recognized 
     * @return VerifyDomain Random Layer-3 Domain of Assets to Be Recognized
     */
    public String getVerifyDomain() {
        return this.VerifyDomain;
    }

    /**
     * Set Random Layer-3 Domain of Assets to Be Recognized
     * @param VerifyDomain Random Layer-3 Domain of Assets to Be Recognized
     */
    public void setVerifyDomain(String VerifyDomain) {
        this.VerifyDomain = VerifyDomain;
    }

    /**
     * Get TXT Record Content of Pending Confirmation Assets 
     * @return VerifyTXTRecord TXT Record Content of Pending Confirmation Assets
     */
    public String getVerifyTXTRecord() {
        return this.VerifyTXTRecord;
    }

    /**
     * Set TXT Record Content of Pending Confirmation Assets
     * @param VerifyTXTRecord TXT Record Content of Pending Confirmation Assets
     */
    public void setVerifyTXTRecord(String VerifyTXTRecord) {
        this.VerifyTXTRecord = VerifyTXTRecord;
    }

    /**
     * Get Authentication Status of Assets Pending Recognition. 0: Pending Authentication; 1: Authentication Succeeded; 2: Authentication in Progress; 3: TXT Authentication Failed; 4: Manual Authentication Failed. 
     * @return VerifyStatus Authentication Status of Assets Pending Recognition. 0: Pending Authentication; 1: Authentication Succeeded; 2: Authentication in Progress; 3: TXT Authentication Failed; 4: Manual Authentication Failed.
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set Authentication Status of Assets Pending Recognition. 0: Pending Authentication; 1: Authentication Succeeded; 2: Authentication in Progress; 3: TXT Authentication Failed; 4: Manual Authentication Failed.
     * @param VerifyStatus Authentication Status of Assets Pending Recognition. 0: Pending Authentication; 1: Authentication Succeeded; 2: Authentication in Progress; 3: TXT Authentication Failed; 4: Manual Authentication Failed.
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * Get Bot Access Count 
     * @return BotAccessCount Bot Access Count
     */
    public Long getBotAccessCount() {
        return this.BotAccessCount;
    }

    /**
     * Set Bot Access Count
     * @param BotAccessCount Bot Access Count
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

