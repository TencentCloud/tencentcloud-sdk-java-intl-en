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

public class VULViewVULRiskData extends AbstractModel {

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Impact assets.
    */
    @SerializedName("NoHandleCount")
    @Expose
    private Long NoHandleCount;

    /**
    * Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Component.
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Latest Recognition Time
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * First Recognition Time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Number of Affected Assets
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private Long AffectAssetCount;

    /**
    * Risk ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * Scan Source. See API Return Enumeration Type for details.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Front-end Index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Vulnerability type.
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * Vulnerability name
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * cve
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * Vulnerability Payload
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * Vulnerability impact component.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Vulnerability impact version.
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * Risks.
    */
    @SerializedName("VULURL")
    @Expose
    private String VULURL;

    /**
    * User Nickname
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * CVSS score
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * PCMGRId
    */
    @SerializedName("PCMGRId")
    @Expose
    private String PCMGRId;

    /**
    * Vulnerability tag. during searching, emergency mandatory parameter VulTag=SuggestRepair/EMGCVul.
    */
    @SerializedName("VulTag")
    @Expose
    private String [] VulTag;

    /**
    * Vulnerability disclosure time.
    */
    @SerializedName("DisclosureTime")
    @Expose
    private String DisclosureTime;

    /**
    * Attack intensity.
    */
    @SerializedName("AttackHeat")
    @Expose
    private Long AttackHeat;

    /**
    * Whether a mandatory vulnerability: 1 - yes; 0 - no.
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * Disposal task id.
    */
    @SerializedName("HandleTaskId")
    @Expose
    private String HandleTaskId;

    /**
    * Engine source.
    */
    @SerializedName("EngineSource")
    @Expose
    private String EngineSource;

    /**
    * New vulnerability risk id.
    */
    @SerializedName("VulRiskId")
    @Expose
    private String VulRiskId;

    /**
    * New version vulnerability id.
    */
    @SerializedName("TvdID")
    @Expose
    private String TvdID;

    /**
    * Is it possible to perform a one-click physical examination. valid values: 1-yes, 0-not allowed.
    */
    @SerializedName("IsOneClick")
    @Expose
    private Long IsOneClick;

    /**
     * Get Port. 
     * @return Port Port.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Impact assets. 
     * @return NoHandleCount Impact assets.
     */
    public Long getNoHandleCount() {
        return this.NoHandleCount;
    }

    /**
     * Set Impact assets.
     * @param NoHandleCount Impact assets.
     */
    public void setNoHandleCount(Long NoHandleCount) {
        this.NoHandleCount = NoHandleCount;
    }

    /**
     * Get Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical. 
     * @return Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
     * @param Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Component. 
     * @return Component Component.
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component.
     * @param Component Component.
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Latest Recognition Time 
     * @return RecentTime Latest Recognition Time
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set Latest Recognition Time
     * @param RecentTime Latest Recognition Time
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get First Recognition Time 
     * @return FirstTime First Recognition Time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First Recognition Time
     * @param FirstTime First Recognition Time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Number of Affected Assets 
     * @return AffectAssetCount Number of Affected Assets
     */
    public Long getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set Number of Affected Assets
     * @param AffectAssetCount Number of Affected Assets
     */
    public void setAffectAssetCount(Long AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
    }

    /**
     * Get Risk ID 
     * @return RiskId Risk ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set Risk ID
     * @param RiskId Risk ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get Scan Source. See API Return Enumeration Type for details. 
     * @return From Scan Source. See API Return Enumeration Type for details.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Scan Source. See API Return Enumeration Type for details.
     * @param From Scan Source. See API Return Enumeration Type for details.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Front-end Index 
     * @return Index Front-end Index
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Front-end Index
     * @param Index Front-end Index
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Vulnerability type. 
     * @return VULType Vulnerability type.
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set Vulnerability type.
     * @param VULType Vulnerability type.
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get Vulnerability name 
     * @return VULName Vulnerability name
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set Vulnerability name
     * @param VULName Vulnerability name
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get cve 
     * @return CVE cve
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set cve
     * @param CVE cve
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get Vulnerability Payload 
     * @return Payload Vulnerability Payload
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Vulnerability Payload
     * @param Payload Vulnerability Payload
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get Vulnerability impact component. 
     * @return AppName Vulnerability impact component.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Vulnerability impact component.
     * @param AppName Vulnerability impact component.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Vulnerability impact version. 
     * @return AppVersion Vulnerability impact version.
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set Vulnerability impact version.
     * @param AppVersion Vulnerability impact version.
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get Risks. 
     * @return VULURL Risks.
     */
    public String getVULURL() {
        return this.VULURL;
    }

    /**
     * Set Risks.
     * @param VULURL Risks.
     */
    public void setVULURL(String VULURL) {
        this.VULURL = VULURL;
    }

    /**
     * Get User Nickname 
     * @return Nick User Nickname
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User Nickname
     * @param Nick User Nickname
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
     */
    public void setAppId(String AppId) {
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
     * Get Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability. 
     * @return EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     * @param EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get CVSS score 
     * @return CVSS CVSS score
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS score
     * @param CVSS CVSS score
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get PCMGRId 
     * @return PCMGRId PCMGRId
     */
    public String getPCMGRId() {
        return this.PCMGRId;
    }

    /**
     * Set PCMGRId
     * @param PCMGRId PCMGRId
     */
    public void setPCMGRId(String PCMGRId) {
        this.PCMGRId = PCMGRId;
    }

    /**
     * Get Vulnerability tag. during searching, emergency mandatory parameter VulTag=SuggestRepair/EMGCVul. 
     * @return VulTag Vulnerability tag. during searching, emergency mandatory parameter VulTag=SuggestRepair/EMGCVul.
     */
    public String [] getVulTag() {
        return this.VulTag;
    }

    /**
     * Set Vulnerability tag. during searching, emergency mandatory parameter VulTag=SuggestRepair/EMGCVul.
     * @param VulTag Vulnerability tag. during searching, emergency mandatory parameter VulTag=SuggestRepair/EMGCVul.
     */
    public void setVulTag(String [] VulTag) {
        this.VulTag = VulTag;
    }

    /**
     * Get Vulnerability disclosure time. 
     * @return DisclosureTime Vulnerability disclosure time.
     */
    public String getDisclosureTime() {
        return this.DisclosureTime;
    }

    /**
     * Set Vulnerability disclosure time.
     * @param DisclosureTime Vulnerability disclosure time.
     */
    public void setDisclosureTime(String DisclosureTime) {
        this.DisclosureTime = DisclosureTime;
    }

    /**
     * Get Attack intensity. 
     * @return AttackHeat Attack intensity.
     */
    public Long getAttackHeat() {
        return this.AttackHeat;
    }

    /**
     * Set Attack intensity.
     * @param AttackHeat Attack intensity.
     */
    public void setAttackHeat(Long AttackHeat) {
        this.AttackHeat = AttackHeat;
    }

    /**
     * Get Whether a mandatory vulnerability: 1 - yes; 0 - no. 
     * @return IsSuggest Whether a mandatory vulnerability: 1 - yes; 0 - no.
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set Whether a mandatory vulnerability: 1 - yes; 0 - no.
     * @param IsSuggest Whether a mandatory vulnerability: 1 - yes; 0 - no.
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get Disposal task id. 
     * @return HandleTaskId Disposal task id.
     */
    public String getHandleTaskId() {
        return this.HandleTaskId;
    }

    /**
     * Set Disposal task id.
     * @param HandleTaskId Disposal task id.
     */
    public void setHandleTaskId(String HandleTaskId) {
        this.HandleTaskId = HandleTaskId;
    }

    /**
     * Get Engine source. 
     * @return EngineSource Engine source.
     */
    public String getEngineSource() {
        return this.EngineSource;
    }

    /**
     * Set Engine source.
     * @param EngineSource Engine source.
     */
    public void setEngineSource(String EngineSource) {
        this.EngineSource = EngineSource;
    }

    /**
     * Get New vulnerability risk id. 
     * @return VulRiskId New vulnerability risk id.
     */
    public String getVulRiskId() {
        return this.VulRiskId;
    }

    /**
     * Set New vulnerability risk id.
     * @param VulRiskId New vulnerability risk id.
     */
    public void setVulRiskId(String VulRiskId) {
        this.VulRiskId = VulRiskId;
    }

    /**
     * Get New version vulnerability id. 
     * @return TvdID New version vulnerability id.
     */
    public String getTvdID() {
        return this.TvdID;
    }

    /**
     * Set New version vulnerability id.
     * @param TvdID New version vulnerability id.
     */
    public void setTvdID(String TvdID) {
        this.TvdID = TvdID;
    }

    /**
     * Get Is it possible to perform a one-click physical examination. valid values: 1-yes, 0-not allowed. 
     * @return IsOneClick Is it possible to perform a one-click physical examination. valid values: 1-yes, 0-not allowed.
     */
    public Long getIsOneClick() {
        return this.IsOneClick;
    }

    /**
     * Set Is it possible to perform a one-click physical examination. valid values: 1-yes, 0-not allowed.
     * @param IsOneClick Is it possible to perform a one-click physical examination. valid values: 1-yes, 0-not allowed.
     */
    public void setIsOneClick(Long IsOneClick) {
        this.IsOneClick = IsOneClick;
    }

    public VULViewVULRiskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULViewVULRiskData(VULViewVULRiskData source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.NoHandleCount != null) {
            this.NoHandleCount = new Long(source.NoHandleCount);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new Long(source.AffectAssetCount);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.VULURL != null) {
            this.VULURL = new String(source.VULURL);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.PCMGRId != null) {
            this.PCMGRId = new String(source.PCMGRId);
        }
        if (source.VulTag != null) {
            this.VulTag = new String[source.VulTag.length];
            for (int i = 0; i < source.VulTag.length; i++) {
                this.VulTag[i] = new String(source.VulTag[i]);
            }
        }
        if (source.DisclosureTime != null) {
            this.DisclosureTime = new String(source.DisclosureTime);
        }
        if (source.AttackHeat != null) {
            this.AttackHeat = new Long(source.AttackHeat);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Long(source.IsSuggest);
        }
        if (source.HandleTaskId != null) {
            this.HandleTaskId = new String(source.HandleTaskId);
        }
        if (source.EngineSource != null) {
            this.EngineSource = new String(source.EngineSource);
        }
        if (source.VulRiskId != null) {
            this.VulRiskId = new String(source.VulRiskId);
        }
        if (source.TvdID != null) {
            this.TvdID = new String(source.TvdID);
        }
        if (source.IsOneClick != null) {
            this.IsOneClick = new Long(source.IsOneClick);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "NoHandleCount", this.NoHandleCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "PCMGRId", this.PCMGRId);
        this.setParamArraySimple(map, prefix + "VulTag.", this.VulTag);
        this.setParamSimple(map, prefix + "DisclosureTime", this.DisclosureTime);
        this.setParamSimple(map, prefix + "AttackHeat", this.AttackHeat);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "HandleTaskId", this.HandleTaskId);
        this.setParamSimple(map, prefix + "EngineSource", this.EngineSource);
        this.setParamSimple(map, prefix + "VulRiskId", this.VulRiskId);
        this.setParamSimple(map, prefix + "TvdID", this.TvdID);
        this.setParamSimple(map, prefix + "IsOneClick", this.IsOneClick);

    }
}

