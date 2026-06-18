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
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset Name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Asset type
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
    * Cloud Defense Status
    */
    @SerializedName("CFWStatus")
    @Expose
    private Long CFWStatus;

    /**
    * Asset creation time
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
    * Public IP Type
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

    /**
    * vpc
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
    * appid
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
    * Name
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Core
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * On-Cloud
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
    * Inbound bandwidth
    */
    @SerializedName("InBandwidth")
    @Expose
    private String InBandwidth;

    /**
    * Outbound bandwidth
    */
    @SerializedName("OutBandwidth")
    @Expose
    private String OutBandwidth;

    /**
    * Inbound traffic
    */
    @SerializedName("InFlow")
    @Expose
    private String InFlow;

    /**
    * outbound traffic
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
    * Port risk
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
    * weak password
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
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * EIP Primary Key
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * Member ID information
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * risk service exposure
    */
    @SerializedName("RiskExposure")
    @Expose
    private Long RiskExposure;

    /**
    * New Asset or Not. 1: New
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * Asset Authentication Status. 0-Pending Authentication; 1-Authentication Succeeded; 2-Authentication in Progress; 3+-Authentication Failed.
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

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
     * Get Asset Name 
     * @return AssetName Asset Name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset Name
     * @param AssetName Asset Name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
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
     * Get Cloud Defense Status 
     * @return CFWStatus Cloud Defense Status
     */
    public Long getCFWStatus() {
        return this.CFWStatus;
    }

    /**
     * Set Cloud Defense Status
     * @param CFWStatus Cloud Defense Status
     */
    public void setCFWStatus(Long CFWStatus) {
        this.CFWStatus = CFWStatus;
    }

    /**
     * Get Asset creation time 
     * @return AssetCreateTime Asset creation time
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset creation time
     * @param AssetCreateTime Asset creation time
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
     * Get Public IP Type 
     * @return PublicIpType Public IP Type
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set Public IP Type
     * @param PublicIpType Public IP Type
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
    }

    /**
     * Get vpc 
     * @return VpcId vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc
     * @param VpcId vpc
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
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
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
     * Get Name 
     * @return NickName Name
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Name
     * @param NickName Name
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Core 
     * @return IsCore Core
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Core
     * @param IsCore Core
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get On-Cloud 
     * @return IsCloud On-Cloud
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set On-Cloud
     * @param IsCloud On-Cloud
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
     * Get Inbound bandwidth 
     * @return InBandwidth Inbound bandwidth
     */
    public String getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set Inbound bandwidth
     * @param InBandwidth Inbound bandwidth
     */
    public void setInBandwidth(String InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get Outbound bandwidth 
     * @return OutBandwidth Outbound bandwidth
     */
    public String getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set Outbound bandwidth
     * @param OutBandwidth Outbound bandwidth
     */
    public void setOutBandwidth(String OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get Inbound traffic 
     * @return InFlow Inbound traffic
     */
    public String getInFlow() {
        return this.InFlow;
    }

    /**
     * Set Inbound traffic
     * @param InFlow Inbound traffic
     */
    public void setInFlow(String InFlow) {
        this.InFlow = InFlow;
    }

    /**
     * Get outbound traffic 
     * @return OutFlow outbound traffic
     */
    public String getOutFlow() {
        return this.OutFlow;
    }

    /**
     * Set outbound traffic
     * @param OutFlow outbound traffic
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
     * Get Port risk 
     * @return PortRisk Port risk
     */
    public Long getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set Port risk
     * @param PortRisk Port risk
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
     * Get weak password 
     * @return WeakPassword weak password
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set weak password
     * @param WeakPassword weak password
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
     * Get EIP Primary Key 
     * @return AddressId EIP Primary Key
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP Primary Key
     * @param AddressId EIP Primary Key
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
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
     * Get risk service exposure 
     * @return RiskExposure risk service exposure
     */
    public Long getRiskExposure() {
        return this.RiskExposure;
    }

    /**
     * Set risk service exposure
     * @param RiskExposure risk service exposure
     */
    public void setRiskExposure(Long RiskExposure) {
        this.RiskExposure = RiskExposure;
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
     * Get Asset Authentication Status. 0-Pending Authentication; 1-Authentication Succeeded; 2-Authentication in Progress; 3+-Authentication Failed. 
     * @return VerifyStatus Asset Authentication Status. 0-Pending Authentication; 1-Authentication Succeeded; 2-Authentication in Progress; 3+-Authentication Failed.
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set Asset Authentication Status. 0-Pending Authentication; 1-Authentication Succeeded; 2-Authentication in Progress; 3+-Authentication Failed.
     * @param VerifyStatus Asset Authentication Status. 0-Pending Authentication; 1-Authentication Succeeded; 2-Authentication in Progress; 3+-Authentication Failed.
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

