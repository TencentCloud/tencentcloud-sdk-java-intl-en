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

public class AssetViewVULRiskData extends AbstractModel {

    /**
    * Impact assets.
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - serious.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Asset type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

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
    * Status, 0 unprocessed, 1 tagged, 2 ignored, 3 processed, 4 under disposal, 5 detecting, 6 partially processed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Risk ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User Nickname
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Vulnerability type.
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

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
    * pocid
    */
    @SerializedName("POCId")
    @Expose
    private String POCId;

    /**
    * Scan Source
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Host version.
    */
    @SerializedName("CWPVersion")
    @Expose
    private Long CWPVersion;

    /**
    * Instance UUID
    */
    @SerializedName("InstanceUUID")
    @Expose
    private String InstanceUUID;

    /**
    * Payload
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

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
    * Frontend index id.
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * pcmgrId
    */
    @SerializedName("PCMGRId")
    @Expose
    private String PCMGRId;

    /**
    * Report ID
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Vulnerability Tag.
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
    * Whether the vulnerability is mandatory. 1 for yes, 0 for no.
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * Disposal task ID.
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
    * New vulnerability risk id (same as RiskId in the network-wide vulnerabilities table).
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
    * Is it possible to perform a one-click physical examination, 1 - yes, 0 - not allowed.
    */
    @SerializedName("IsOneClick")
    @Expose
    private Long IsOneClick;

    /**
    * Whether to perform a POC scan. valid values: 0 (not a POC), 1 (POC).
    */
    @SerializedName("IsPOC")
    @Expose
    private Long IsPOC;

    /**
     * Get Impact assets. 
     * @return AffectAsset Impact assets.
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set Impact assets.
     * @param AffectAsset Impact assets.
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
    }

    /**
     * Get Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - serious. 
     * @return Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - serious.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - serious.
     * @param Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - serious.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Asset type. 
     * @return InstanceType Asset type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Asset type.
     * @param InstanceType Asset type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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
     * Get Status, 0 unprocessed, 1 tagged, 2 ignored, 3 processed, 4 under disposal, 5 detecting, 6 partially processed. 
     * @return Status Status, 0 unprocessed, 1 tagged, 2 ignored, 3 processed, 4 under disposal, 5 detecting, 6 partially processed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status, 0 unprocessed, 1 tagged, 2 ignored, 3 processed, 4 under disposal, 5 detecting, 6 partially processed.
     * @param Status Status, 0 unprocessed, 1 tagged, 2 ignored, 3 processed, 4 under disposal, 5 detecting, 6 partially processed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get pocid 
     * @return POCId pocid
     */
    public String getPOCId() {
        return this.POCId;
    }

    /**
     * Set pocid
     * @param POCId pocid
     */
    public void setPOCId(String POCId) {
        this.POCId = POCId;
    }

    /**
     * Get Scan Source 
     * @return From Scan Source
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Scan Source
     * @param From Scan Source
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Host version. 
     * @return CWPVersion Host version.
     */
    public Long getCWPVersion() {
        return this.CWPVersion;
    }

    /**
     * Set Host version.
     * @param CWPVersion Host version.
     */
    public void setCWPVersion(Long CWPVersion) {
        this.CWPVersion = CWPVersion;
    }

    /**
     * Get Instance UUID 
     * @return InstanceUUID Instance UUID
     */
    public String getInstanceUUID() {
        return this.InstanceUUID;
    }

    /**
     * Set Instance UUID
     * @param InstanceUUID Instance UUID
     */
    public void setInstanceUUID(String InstanceUUID) {
        this.InstanceUUID = InstanceUUID;
    }

    /**
     * Get Payload 
     * @return Payload Payload
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Payload
     * @param Payload Payload
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
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
     * Get Frontend index id. 
     * @return Index Frontend index id.
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Frontend index id.
     * @param Index Frontend index id.
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get pcmgrId 
     * @return PCMGRId pcmgrId
     */
    public String getPCMGRId() {
        return this.PCMGRId;
    }

    /**
     * Set pcmgrId
     * @param PCMGRId pcmgrId
     */
    public void setPCMGRId(String PCMGRId) {
        this.PCMGRId = PCMGRId;
    }

    /**
     * Get Report ID 
     * @return LogId Report ID
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set Report ID
     * @param LogId Report ID
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Vulnerability Tag. 
     * @return VulTag Vulnerability Tag.
     */
    public String [] getVulTag() {
        return this.VulTag;
    }

    /**
     * Set Vulnerability Tag.
     * @param VulTag Vulnerability Tag.
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
     * Get Whether the vulnerability is mandatory. 1 for yes, 0 for no. 
     * @return IsSuggest Whether the vulnerability is mandatory. 1 for yes, 0 for no.
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set Whether the vulnerability is mandatory. 1 for yes, 0 for no.
     * @param IsSuggest Whether the vulnerability is mandatory. 1 for yes, 0 for no.
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get Disposal task ID. 
     * @return HandleTaskId Disposal task ID.
     */
    public String getHandleTaskId() {
        return this.HandleTaskId;
    }

    /**
     * Set Disposal task ID.
     * @param HandleTaskId Disposal task ID.
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
     * Get New vulnerability risk id (same as RiskId in the network-wide vulnerabilities table). 
     * @return VulRiskId New vulnerability risk id (same as RiskId in the network-wide vulnerabilities table).
     */
    public String getVulRiskId() {
        return this.VulRiskId;
    }

    /**
     * Set New vulnerability risk id (same as RiskId in the network-wide vulnerabilities table).
     * @param VulRiskId New vulnerability risk id (same as RiskId in the network-wide vulnerabilities table).
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
     * Get Is it possible to perform a one-click physical examination, 1 - yes, 0 - not allowed. 
     * @return IsOneClick Is it possible to perform a one-click physical examination, 1 - yes, 0 - not allowed.
     */
    public Long getIsOneClick() {
        return this.IsOneClick;
    }

    /**
     * Set Is it possible to perform a one-click physical examination, 1 - yes, 0 - not allowed.
     * @param IsOneClick Is it possible to perform a one-click physical examination, 1 - yes, 0 - not allowed.
     */
    public void setIsOneClick(Long IsOneClick) {
        this.IsOneClick = IsOneClick;
    }

    /**
     * Get Whether to perform a POC scan. valid values: 0 (not a POC), 1 (POC). 
     * @return IsPOC Whether to perform a POC scan. valid values: 0 (not a POC), 1 (POC).
     */
    public Long getIsPOC() {
        return this.IsPOC;
    }

    /**
     * Set Whether to perform a POC scan. valid values: 0 (not a POC), 1 (POC).
     * @param IsPOC Whether to perform a POC scan. valid values: 0 (not a POC), 1 (POC).
     */
    public void setIsPOC(Long IsPOC) {
        this.IsPOC = IsPOC;
    }

    public AssetViewVULRiskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewVULRiskData(AssetViewVULRiskData source) {
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
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
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.POCId != null) {
            this.POCId = new String(source.POCId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CWPVersion != null) {
            this.CWPVersion = new Long(source.CWPVersion);
        }
        if (source.InstanceUUID != null) {
            this.InstanceUUID = new String(source.InstanceUUID);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.PCMGRId != null) {
            this.PCMGRId = new String(source.PCMGRId);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        if (source.IsPOC != null) {
            this.IsPOC = new Long(source.IsPOC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "POCId", this.POCId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CWPVersion", this.CWPVersion);
        this.setParamSimple(map, prefix + "InstanceUUID", this.InstanceUUID);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "PCMGRId", this.PCMGRId);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "VulTag.", this.VulTag);
        this.setParamSimple(map, prefix + "DisclosureTime", this.DisclosureTime);
        this.setParamSimple(map, prefix + "AttackHeat", this.AttackHeat);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "HandleTaskId", this.HandleTaskId);
        this.setParamSimple(map, prefix + "EngineSource", this.EngineSource);
        this.setParamSimple(map, prefix + "VulRiskId", this.VulRiskId);
        this.setParamSimple(map, prefix + "TvdID", this.TvdID);
        this.setParamSimple(map, prefix + "IsOneClick", this.IsOneClick);
        this.setParamSimple(map, prefix + "IsPOC", this.IsPOC);

    }
}

