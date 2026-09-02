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

public class DescribeSkillScanAlertDetailResponse extends AbstractModel {

    /**
    * <p>Alarm record ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Tenant AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Host UUID</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>Host IP address</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>Instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>Skill name</p>
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * <p>Skill file path</p>
    */
    @SerializedName("SkillPath")
    @Expose
    private String SkillPath;

    /**
    * <p>Skill application scope</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>Skill version number</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>SHA256 hash of file content<br>Parameter format: sha256:&lt;64-digit hex&gt;</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>Risk level<br>Enumeration values:<br>malicious: Malicious<br>suspicious: Suspicious</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Security score<br>Value range: [0, 100]</p>
    */
    @SerializedName("SecurityScore")
    @Expose
    private Long SecurityScore;

    /**
    * <p>Main matched rule ID</p>
    */
    @SerializedName("PrimaryRuleID")
    @Expose
    private String PrimaryRuleID;

    /**
    * <p>Detection engine version number</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * <p>Processing status<br>Enumeration values:<br>0: unprocessed<br>1: processed<br>2: ignored<br>3: trusted</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Alarm level<br>Enumeration values:<br>high: High risk<br>medium: Medium risk</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>First detection time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Skill feature description (engine real-time query return)</p>
    */
    @SerializedName("SkillDescription")
    @Expose
    private String SkillDescription;

    /**
    * <p>Comprehensive risk abstract summarizing the primary risks/attack chains identified in this detection (query in real time via engine). Returns copywriting in English when Language=en-US is passed.</p>
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * <p>Handling suggestions (real-time query by engine)</p>
    */
    @SerializedName("Mitigation")
    @Expose
    private String Mitigation;

    /**
    * <p>Skill capacity tag list (returned by engine real-time query)</p>
    */
    @SerializedName("CapabilityTags")
    @Expose
    private SkillCapabilityTag [] CapabilityTags;

    /**
    * <p>Fusion rule directory list (returned by engine query in real time)</p>
    */
    @SerializedName("RuleCatalog")
    @Expose
    private SkillRuleCatalogItem [] RuleCatalog;

    /**
    * <p>Scan result details list (returned by engine query in real time)</p>
    */
    @SerializedName("ScanItems")
    @Expose
    private SkillScanEngineResult [] ScanItems;

    /**
    * <p>Detection report link (returned by real-time query from the engine)</p>
    */
    @SerializedName("ReportURL")
    @Expose
    private String ReportURL;

    /**
    * <p>Scan complete time (returned by the engine in real-time query)<br>Parameter format: ISO8601 format</p>
    */
    @SerializedName("ScannedAt")
    @Expose
    private String ScannedAt;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Alarm record ID</p> 
     * @return ID <p>Alarm record ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Alarm record ID</p>
     * @param ID <p>Alarm record ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Tenant AppID</p> 
     * @return AppID <p>Tenant AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Tenant AppID</p>
     * @param AppID <p>Tenant AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Host UUID</p> 
     * @return UUID <p>Host UUID</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>Host UUID</p>
     * @param UUID <p>Host UUID</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>Host IP address</p> 
     * @return HostIP <p>Host IP address</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>Host IP address</p>
     * @param HostIP <p>Host IP address</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>Instance ID<br>Parameter format: such as ins-xxxxxxxx</p> 
     * @return InstanceID <p>Instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
     * @param InstanceID <p>Instance ID<br>Parameter format: such as ins-xxxxxxxx</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p> 
     * @return BelongAssetType <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     * @param BelongAssetType <p>Asset type affiliation<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>Skill name</p> 
     * @return SkillName <p>Skill name</p>
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set <p>Skill name</p>
     * @param SkillName <p>Skill name</p>
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get <p>Skill file path</p> 
     * @return SkillPath <p>Skill file path</p>
     */
    public String getSkillPath() {
        return this.SkillPath;
    }

    /**
     * Set <p>Skill file path</p>
     * @param SkillPath <p>Skill file path</p>
     */
    public void setSkillPath(String SkillPath) {
        this.SkillPath = SkillPath;
    }

    /**
     * Get <p>Skill application scope</p> 
     * @return Scope <p>Skill application scope</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Skill application scope</p>
     * @param Scope <p>Skill application scope</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Skill version number</p> 
     * @return Version <p>Skill version number</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Skill version number</p>
     * @param Version <p>Skill version number</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>SHA256 hash of file content<br>Parameter format: sha256:&lt;64-digit hex&gt;</p> 
     * @return ContentHash <p>SHA256 hash of file content<br>Parameter format: sha256:&lt;64-digit hex&gt;</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>SHA256 hash of file content<br>Parameter format: sha256:&lt;64-digit hex&gt;</p>
     * @param ContentHash <p>SHA256 hash of file content<br>Parameter format: sha256:&lt;64-digit hex&gt;</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>Risk level<br>Enumeration values:<br>malicious: Malicious<br>suspicious: Suspicious</p> 
     * @return RiskLevel <p>Risk level<br>Enumeration values:<br>malicious: Malicious<br>suspicious: Suspicious</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level<br>Enumeration values:<br>malicious: Malicious<br>suspicious: Suspicious</p>
     * @param RiskLevel <p>Risk level<br>Enumeration values:<br>malicious: Malicious<br>suspicious: Suspicious</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Security score<br>Value range: [0, 100]</p> 
     * @return SecurityScore <p>Security score<br>Value range: [0, 100]</p>
     */
    public Long getSecurityScore() {
        return this.SecurityScore;
    }

    /**
     * Set <p>Security score<br>Value range: [0, 100]</p>
     * @param SecurityScore <p>Security score<br>Value range: [0, 100]</p>
     */
    public void setSecurityScore(Long SecurityScore) {
        this.SecurityScore = SecurityScore;
    }

    /**
     * Get <p>Main matched rule ID</p> 
     * @return PrimaryRuleID <p>Main matched rule ID</p>
     */
    public String getPrimaryRuleID() {
        return this.PrimaryRuleID;
    }

    /**
     * Set <p>Main matched rule ID</p>
     * @param PrimaryRuleID <p>Main matched rule ID</p>
     */
    public void setPrimaryRuleID(String PrimaryRuleID) {
        this.PrimaryRuleID = PrimaryRuleID;
    }

    /**
     * Get <p>Detection engine version number</p> 
     * @return EngineVersion <p>Detection engine version number</p>
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Detection engine version number</p>
     * @param EngineVersion <p>Detection engine version number</p>
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Processing status<br>Enumeration values:<br>0: unprocessed<br>1: processed<br>2: ignored<br>3: trusted</p> 
     * @return Status <p>Processing status<br>Enumeration values:<br>0: unprocessed<br>1: processed<br>2: ignored<br>3: trusted</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Processing status<br>Enumeration values:<br>0: unprocessed<br>1: processed<br>2: ignored<br>3: trusted</p>
     * @param Status <p>Processing status<br>Enumeration values:<br>0: unprocessed<br>1: processed<br>2: ignored<br>3: trusted</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Alarm level<br>Enumeration values:<br>high: High risk<br>medium: Medium risk</p> 
     * @return Level <p>Alarm level<br>Enumeration values:<br>high: High risk<br>medium: Medium risk</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm level<br>Enumeration values:<br>high: High risk<br>medium: Medium risk</p>
     * @param Level <p>Alarm level<br>Enumeration values:<br>high: High risk<br>medium: Medium risk</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>First detection time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return CreateTime <p>First detection time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>First detection time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param CreateTime <p>First detection time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Skill feature description (engine real-time query return)</p> 
     * @return SkillDescription <p>Skill feature description (engine real-time query return)</p>
     */
    public String getSkillDescription() {
        return this.SkillDescription;
    }

    /**
     * Set <p>Skill feature description (engine real-time query return)</p>
     * @param SkillDescription <p>Skill feature description (engine real-time query return)</p>
     */
    public void setSkillDescription(String SkillDescription) {
        this.SkillDescription = SkillDescription;
    }

    /**
     * Get <p>Comprehensive risk abstract summarizing the primary risks/attack chains identified in this detection (query in real time via engine). Returns copywriting in English when Language=en-US is passed.</p> 
     * @return RiskDescription <p>Comprehensive risk abstract summarizing the primary risks/attack chains identified in this detection (query in real time via engine). Returns copywriting in English when Language=en-US is passed.</p>
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set <p>Comprehensive risk abstract summarizing the primary risks/attack chains identified in this detection (query in real time via engine). Returns copywriting in English when Language=en-US is passed.</p>
     * @param RiskDescription <p>Comprehensive risk abstract summarizing the primary risks/attack chains identified in this detection (query in real time via engine). Returns copywriting in English when Language=en-US is passed.</p>
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get <p>Handling suggestions (real-time query by engine)</p> 
     * @return Mitigation <p>Handling suggestions (real-time query by engine)</p>
     */
    public String getMitigation() {
        return this.Mitigation;
    }

    /**
     * Set <p>Handling suggestions (real-time query by engine)</p>
     * @param Mitigation <p>Handling suggestions (real-time query by engine)</p>
     */
    public void setMitigation(String Mitigation) {
        this.Mitigation = Mitigation;
    }

    /**
     * Get <p>Skill capacity tag list (returned by engine real-time query)</p> 
     * @return CapabilityTags <p>Skill capacity tag list (returned by engine real-time query)</p>
     */
    public SkillCapabilityTag [] getCapabilityTags() {
        return this.CapabilityTags;
    }

    /**
     * Set <p>Skill capacity tag list (returned by engine real-time query)</p>
     * @param CapabilityTags <p>Skill capacity tag list (returned by engine real-time query)</p>
     */
    public void setCapabilityTags(SkillCapabilityTag [] CapabilityTags) {
        this.CapabilityTags = CapabilityTags;
    }

    /**
     * Get <p>Fusion rule directory list (returned by engine query in real time)</p> 
     * @return RuleCatalog <p>Fusion rule directory list (returned by engine query in real time)</p>
     */
    public SkillRuleCatalogItem [] getRuleCatalog() {
        return this.RuleCatalog;
    }

    /**
     * Set <p>Fusion rule directory list (returned by engine query in real time)</p>
     * @param RuleCatalog <p>Fusion rule directory list (returned by engine query in real time)</p>
     */
    public void setRuleCatalog(SkillRuleCatalogItem [] RuleCatalog) {
        this.RuleCatalog = RuleCatalog;
    }

    /**
     * Get <p>Scan result details list (returned by engine query in real time)</p> 
     * @return ScanItems <p>Scan result details list (returned by engine query in real time)</p>
     */
    public SkillScanEngineResult [] getScanItems() {
        return this.ScanItems;
    }

    /**
     * Set <p>Scan result details list (returned by engine query in real time)</p>
     * @param ScanItems <p>Scan result details list (returned by engine query in real time)</p>
     */
    public void setScanItems(SkillScanEngineResult [] ScanItems) {
        this.ScanItems = ScanItems;
    }

    /**
     * Get <p>Detection report link (returned by real-time query from the engine)</p> 
     * @return ReportURL <p>Detection report link (returned by real-time query from the engine)</p>
     */
    public String getReportURL() {
        return this.ReportURL;
    }

    /**
     * Set <p>Detection report link (returned by real-time query from the engine)</p>
     * @param ReportURL <p>Detection report link (returned by real-time query from the engine)</p>
     */
    public void setReportURL(String ReportURL) {
        this.ReportURL = ReportURL;
    }

    /**
     * Get <p>Scan complete time (returned by the engine in real-time query)<br>Parameter format: ISO8601 format</p> 
     * @return ScannedAt <p>Scan complete time (returned by the engine in real-time query)<br>Parameter format: ISO8601 format</p>
     */
    public String getScannedAt() {
        return this.ScannedAt;
    }

    /**
     * Set <p>Scan complete time (returned by the engine in real-time query)<br>Parameter format: ISO8601 format</p>
     * @param ScannedAt <p>Scan complete time (returned by the engine in real-time query)<br>Parameter format: ISO8601 format</p>
     */
    public void setScannedAt(String ScannedAt) {
        this.ScannedAt = ScannedAt;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSkillScanAlertDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanAlertDetailResponse(DescribeSkillScanAlertDetailResponse source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillPath != null) {
            this.SkillPath = new String(source.SkillPath);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.SecurityScore != null) {
            this.SecurityScore = new Long(source.SecurityScore);
        }
        if (source.PrimaryRuleID != null) {
            this.PrimaryRuleID = new String(source.PrimaryRuleID);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SkillDescription != null) {
            this.SkillDescription = new String(source.SkillDescription);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.Mitigation != null) {
            this.Mitigation = new String(source.Mitigation);
        }
        if (source.CapabilityTags != null) {
            this.CapabilityTags = new SkillCapabilityTag[source.CapabilityTags.length];
            for (int i = 0; i < source.CapabilityTags.length; i++) {
                this.CapabilityTags[i] = new SkillCapabilityTag(source.CapabilityTags[i]);
            }
        }
        if (source.RuleCatalog != null) {
            this.RuleCatalog = new SkillRuleCatalogItem[source.RuleCatalog.length];
            for (int i = 0; i < source.RuleCatalog.length; i++) {
                this.RuleCatalog[i] = new SkillRuleCatalogItem(source.RuleCatalog[i]);
            }
        }
        if (source.ScanItems != null) {
            this.ScanItems = new SkillScanEngineResult[source.ScanItems.length];
            for (int i = 0; i < source.ScanItems.length; i++) {
                this.ScanItems[i] = new SkillScanEngineResult(source.ScanItems[i]);
            }
        }
        if (source.ReportURL != null) {
            this.ReportURL = new String(source.ReportURL);
        }
        if (source.ScannedAt != null) {
            this.ScannedAt = new String(source.ScannedAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillPath", this.SkillPath);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "SecurityScore", this.SecurityScore);
        this.setParamSimple(map, prefix + "PrimaryRuleID", this.PrimaryRuleID);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SkillDescription", this.SkillDescription);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "Mitigation", this.Mitigation);
        this.setParamArrayObj(map, prefix + "CapabilityTags.", this.CapabilityTags);
        this.setParamArrayObj(map, prefix + "RuleCatalog.", this.RuleCatalog);
        this.setParamArrayObj(map, prefix + "ScanItems.", this.ScanItems);
        this.setParamSimple(map, prefix + "ReportURL", this.ReportURL);
        this.setParamSimple(map, prefix + "ScannedAt", this.ScannedAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

