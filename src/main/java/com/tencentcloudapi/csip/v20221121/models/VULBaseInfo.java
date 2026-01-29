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

public class VULBaseInfo extends AbstractModel {

    /**
    * Risk level.
High - high risk, middle - medium risk, low - low risk, info - Note.
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
    * Release date.
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Last scan time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

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
    * Description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

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
    * Technology reference.
    */
    @SerializedName("References")
    @Expose
    private String References;

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
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * Attack intensity.
0/1/2/3 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackHeat")
    @Expose
    private Long AttackHeat;

    /**
    * Detection status 0 unscanned 1 scan in progress 2 scan complete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * 1/0 whether compulsory.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * Tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulTag")
    @Expose
    private String [] VulTag;

    /**
    * Support products: "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix" (comma-separated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportProduct")
    @Expose
    private String SupportProduct;

    /**
    * Vulnerability detection task id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Primary key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Vulnerability id old version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PcmgrID")
    @Expose
    private String PcmgrID;

    /**
    * Vulnerability id new version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TvdID")
    @Expose
    private String TvdID;

    /**
     * Get Risk level.
High - high risk, middle - medium risk, low - low risk, info - Note. 
     * @return Level Risk level.
High - high risk, middle - medium risk, low - low risk, info - Note.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level.
High - high risk, middle - medium risk, low - low risk, info - Note.
     * @param Level Risk level.
High - high risk, middle - medium risk, low - low risk, info - Note.
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
     * Get Release date. 
     * @return PublishTime Release date.
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Release date.
     * @param PublishTime Release date.
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
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
     * Get Description 
     * @return Describe Description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Description
     * @param Describe Description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
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
     * Get Technology reference. 
     * @return References Technology reference.
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set Technology reference.
     * @param References Technology reference.
     */
    public void setReferences(String References) {
        this.References = References;
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nick User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nick User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fix Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fix Fixing suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get CVSS score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVSS CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVSS CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get Attack intensity.
0/1/2/3 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackHeat Attack intensity.
0/1/2/3 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackHeat() {
        return this.AttackHeat;
    }

    /**
     * Set Attack intensity.
0/1/2/3 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackHeat Attack intensity.
0/1/2/3 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackHeat(Long AttackHeat) {
        this.AttackHeat = AttackHeat;
    }

    /**
     * Get Detection status 0 unscanned 1 scan in progress 2 scan complete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanStatus Detection status 0 unscanned 1 scan in progress 2 scan complete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Detection status 0 unscanned 1 scan in progress 2 scan complete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanStatus Detection status 0 unscanned 1 scan in progress 2 scan complete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 1/0 whether compulsory.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSuggest 1/0 whether compulsory.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set 1/0 whether compulsory.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSuggest 1/0 whether compulsory.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get Tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulTag Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getVulTag() {
        return this.VulTag;
    }

    /**
     * Set Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulTag Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulTag(String [] VulTag) {
        this.VulTag = VulTag;
    }

    /**
     * Get Support products: "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix" (comma-separated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportProduct Support products: "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix" (comma-separated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupportProduct() {
        return this.SupportProduct;
    }

    /**
     * Set Support products: "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix" (comma-separated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportProduct Support products: "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix" (comma-separated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportProduct(String SupportProduct) {
        this.SupportProduct = SupportProduct;
    }

    /**
     * Get Vulnerability detection task id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Vulnerability detection task id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Vulnerability detection task id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Vulnerability detection task id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Primary key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Index Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Index Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Vulnerability id old version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PcmgrID Vulnerability id old version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPcmgrID() {
        return this.PcmgrID;
    }

    /**
     * Set Vulnerability id old version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PcmgrID Vulnerability id old version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPcmgrID(String PcmgrID) {
        this.PcmgrID = PcmgrID;
    }

    /**
     * Get Vulnerability id new version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TvdID Vulnerability id new version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTvdID() {
        return this.TvdID;
    }

    /**
     * Set Vulnerability id new version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TvdID Vulnerability id new version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTvdID(String TvdID) {
        this.TvdID = TvdID;
    }

    public VULBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULBaseInfo(VULBaseInfo source) {
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new Long(source.AffectAssetCount);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
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
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.References != null) {
            this.References = new String(source.References);
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
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.AttackHeat != null) {
            this.AttackHeat = new Long(source.AttackHeat);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Long(source.IsSuggest);
        }
        if (source.VulTag != null) {
            this.VulTag = new String[source.VulTag.length];
            for (int i = 0; i < source.VulTag.length; i++) {
                this.VulTag[i] = new String(source.VulTag[i]);
            }
        }
        if (source.SupportProduct != null) {
            this.SupportProduct = new String(source.SupportProduct);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.PcmgrID != null) {
            this.PcmgrID = new String(source.PcmgrID);
        }
        if (source.TvdID != null) {
            this.TvdID = new String(source.TvdID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "AttackHeat", this.AttackHeat);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamArraySimple(map, prefix + "VulTag.", this.VulTag);
        this.setParamSimple(map, prefix + "SupportProduct", this.SupportProduct);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "PcmgrID", this.PcmgrID);
        this.setParamSimple(map, prefix + "TvdID", this.TvdID);

    }
}

