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

public class GateWayAsset extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Asset ID.
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
    * VPC IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * VPC id.
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
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Outbound peak bandwidth.
    */
    @SerializedName("OutboundPeakBandwidth")
    @Expose
    private String OutboundPeakBandwidth;

    /**
    * Inbound peak bandwidth.
    */
    @SerializedName("InboundPeakBandwidth")
    @Expose
    private String InboundPeakBandwidth;

    /**
    * Cumulative Outbound Traffic
    */
    @SerializedName("OutboundCumulativeFlow")
    @Expose
    private String OutboundCumulativeFlow;

    /**
    * Cumulative Inbound Traffic
    */
    @SerializedName("InboundCumulativeFlow")
    @Expose
    private String InboundCumulativeFlow;

    /**
    * Network attack.
    */
    @SerializedName("NetworkAttack")
    @Expose
    private Long NetworkAttack;

    /**
    * Expose ports.
    */
    @SerializedName("ExposedPort")
    @Expose
    private Long ExposedPort;

    /**
    * Exposed vulnerability.
    */
    @SerializedName("ExposedVUL")
    @Expose
    private Long ExposedVUL;

    /**
    * Configuration risk.
    */
    @SerializedName("ConfigureRisk")
    @Expose
    private Long ConfigureRisk;

    /**
    * Creation time.


    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of tasks.
    */
    @SerializedName("ScanTask")
    @Expose
    private Long ScanTask;

    /**
    * Last scan time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Nickname.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * IPv6 address
    */
    @SerializedName("AddressIPV6")
    @Expose
    private String AddressIPV6;

    /**
    * Core or Not
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Risk service exposure.
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
    * Gateway Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * TSE's Actual Gateway Region
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * Weak password risk.
    */
    @SerializedName("WeakPasswordRisk")
    @Expose
    private Long WeakPasswordRisk;

    /**
     * Get appid 
     * @return AppId appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get uin 
     * @return Uin uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set uin
     * @param Uin uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Asset ID. 
     * @return AssetId Asset ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID.
     * @param AssetId Asset ID.
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
     * Get VPC IP 
     * @return PrivateIp VPC IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set VPC IP
     * @param PrivateIp VPC IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
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
     * Get VPC id. 
     * @return VpcId VPC id.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC id.
     * @param VpcId VPC id.
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
     * Get Outbound peak bandwidth. 
     * @return OutboundPeakBandwidth Outbound peak bandwidth.
     */
    public String getOutboundPeakBandwidth() {
        return this.OutboundPeakBandwidth;
    }

    /**
     * Set Outbound peak bandwidth.
     * @param OutboundPeakBandwidth Outbound peak bandwidth.
     */
    public void setOutboundPeakBandwidth(String OutboundPeakBandwidth) {
        this.OutboundPeakBandwidth = OutboundPeakBandwidth;
    }

    /**
     * Get Inbound peak bandwidth. 
     * @return InboundPeakBandwidth Inbound peak bandwidth.
     */
    public String getInboundPeakBandwidth() {
        return this.InboundPeakBandwidth;
    }

    /**
     * Set Inbound peak bandwidth.
     * @param InboundPeakBandwidth Inbound peak bandwidth.
     */
    public void setInboundPeakBandwidth(String InboundPeakBandwidth) {
        this.InboundPeakBandwidth = InboundPeakBandwidth;
    }

    /**
     * Get Cumulative Outbound Traffic 
     * @return OutboundCumulativeFlow Cumulative Outbound Traffic
     */
    public String getOutboundCumulativeFlow() {
        return this.OutboundCumulativeFlow;
    }

    /**
     * Set Cumulative Outbound Traffic
     * @param OutboundCumulativeFlow Cumulative Outbound Traffic
     */
    public void setOutboundCumulativeFlow(String OutboundCumulativeFlow) {
        this.OutboundCumulativeFlow = OutboundCumulativeFlow;
    }

    /**
     * Get Cumulative Inbound Traffic 
     * @return InboundCumulativeFlow Cumulative Inbound Traffic
     */
    public String getInboundCumulativeFlow() {
        return this.InboundCumulativeFlow;
    }

    /**
     * Set Cumulative Inbound Traffic
     * @param InboundCumulativeFlow Cumulative Inbound Traffic
     */
    public void setInboundCumulativeFlow(String InboundCumulativeFlow) {
        this.InboundCumulativeFlow = InboundCumulativeFlow;
    }

    /**
     * Get Network attack. 
     * @return NetworkAttack Network attack.
     */
    public Long getNetworkAttack() {
        return this.NetworkAttack;
    }

    /**
     * Set Network attack.
     * @param NetworkAttack Network attack.
     */
    public void setNetworkAttack(Long NetworkAttack) {
        this.NetworkAttack = NetworkAttack;
    }

    /**
     * Get Expose ports. 
     * @return ExposedPort Expose ports.
     */
    public Long getExposedPort() {
        return this.ExposedPort;
    }

    /**
     * Set Expose ports.
     * @param ExposedPort Expose ports.
     */
    public void setExposedPort(Long ExposedPort) {
        this.ExposedPort = ExposedPort;
    }

    /**
     * Get Exposed vulnerability. 
     * @return ExposedVUL Exposed vulnerability.
     */
    public Long getExposedVUL() {
        return this.ExposedVUL;
    }

    /**
     * Set Exposed vulnerability.
     * @param ExposedVUL Exposed vulnerability.
     */
    public void setExposedVUL(Long ExposedVUL) {
        this.ExposedVUL = ExposedVUL;
    }

    /**
     * Get Configuration risk. 
     * @return ConfigureRisk Configuration risk.
     */
    public Long getConfigureRisk() {
        return this.ConfigureRisk;
    }

    /**
     * Set Configuration risk.
     * @param ConfigureRisk Configuration risk.
     */
    public void setConfigureRisk(Long ConfigureRisk) {
        this.ConfigureRisk = ConfigureRisk;
    }

    /**
     * Get Creation time.

 
     * @return CreateTime Creation time.


     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


     * @param CreateTime Creation time.


     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of tasks. 
     * @return ScanTask Number of tasks.
     */
    public Long getScanTask() {
        return this.ScanTask;
    }

    /**
     * Set Number of tasks.
     * @param ScanTask Number of tasks.
     */
    public void setScanTask(Long ScanTask) {
        this.ScanTask = ScanTask;
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
     * Get Nickname. 
     * @return Nick Nickname.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set Nickname.
     * @param Nick Nickname.
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get IPv6 address 
     * @return AddressIPV6 IPv6 address
     */
    public String getAddressIPV6() {
        return this.AddressIPV6;
    }

    /**
     * Set IPv6 address
     * @param AddressIPV6 IPv6 address
     */
    public void setAddressIPV6(String AddressIPV6) {
        this.AddressIPV6 = AddressIPV6;
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
     * Get Gateway Status 
     * @return Status Gateway Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Gateway Status
     * @param Status Gateway Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get TSE's Actual Gateway Region 
     * @return EngineRegion TSE's Actual Gateway Region
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set TSE's Actual Gateway Region
     * @param EngineRegion TSE's Actual Gateway Region
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get Weak password risk. 
     * @return WeakPasswordRisk Weak password risk.
     */
    public Long getWeakPasswordRisk() {
        return this.WeakPasswordRisk;
    }

    /**
     * Set Weak password risk.
     * @param WeakPasswordRisk Weak password risk.
     */
    public void setWeakPasswordRisk(Long WeakPasswordRisk) {
        this.WeakPasswordRisk = WeakPasswordRisk;
    }

    public GateWayAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GateWayAsset(GateWayAsset source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.OutboundPeakBandwidth != null) {
            this.OutboundPeakBandwidth = new String(source.OutboundPeakBandwidth);
        }
        if (source.InboundPeakBandwidth != null) {
            this.InboundPeakBandwidth = new String(source.InboundPeakBandwidth);
        }
        if (source.OutboundCumulativeFlow != null) {
            this.OutboundCumulativeFlow = new String(source.OutboundCumulativeFlow);
        }
        if (source.InboundCumulativeFlow != null) {
            this.InboundCumulativeFlow = new String(source.InboundCumulativeFlow);
        }
        if (source.NetworkAttack != null) {
            this.NetworkAttack = new Long(source.NetworkAttack);
        }
        if (source.ExposedPort != null) {
            this.ExposedPort = new Long(source.ExposedPort);
        }
        if (source.ExposedVUL != null) {
            this.ExposedVUL = new Long(source.ExposedVUL);
        }
        if (source.ConfigureRisk != null) {
            this.ConfigureRisk = new Long(source.ConfigureRisk);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScanTask != null) {
            this.ScanTask = new Long(source.ScanTask);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.AddressIPV6 != null) {
            this.AddressIPV6 = new String(source.AddressIPV6);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.RiskExposure != null) {
            this.RiskExposure = new Long(source.RiskExposure);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.WeakPasswordRisk != null) {
            this.WeakPasswordRisk = new Long(source.WeakPasswordRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "OutboundPeakBandwidth", this.OutboundPeakBandwidth);
        this.setParamSimple(map, prefix + "InboundPeakBandwidth", this.InboundPeakBandwidth);
        this.setParamSimple(map, prefix + "OutboundCumulativeFlow", this.OutboundCumulativeFlow);
        this.setParamSimple(map, prefix + "InboundCumulativeFlow", this.InboundCumulativeFlow);
        this.setParamSimple(map, prefix + "NetworkAttack", this.NetworkAttack);
        this.setParamSimple(map, prefix + "ExposedPort", this.ExposedPort);
        this.setParamSimple(map, prefix + "ExposedVUL", this.ExposedVUL);
        this.setParamSimple(map, prefix + "ConfigureRisk", this.ConfigureRisk);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScanTask", this.ScanTask);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "AddressIPV6", this.AddressIPV6);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "RiskExposure", this.RiskExposure);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "WeakPasswordRisk", this.WeakPasswordRisk);

    }
}

