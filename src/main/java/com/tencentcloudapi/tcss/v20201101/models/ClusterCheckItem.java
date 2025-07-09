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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCheckItem extends AbstractModel {

    /**
    * Unique ID of the check item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckItemId")
    @Expose
    private Long CheckItemId;

    /**
    * Name of the risk item
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Detailed description of the check item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemDetail")
    @Expose
    private String ItemDetail;

    /**
    * Severity. Valid values: `Serious` (critical); `High` (high); `Middle` (medium); `Hint` (prompt).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Check target and risky target. Valid values: `Runc`, `Kubelet`, `Containerd`, `Pods`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskTarget")
    @Expose
    private String RiskTarget;

    /**
    * Risk type. Valid values: `CVERisk` (vulnerability risk); `ConfigRisk` (configuration risk).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * Risk type of the check item. Valid values: `PrivilegePromotion` (privilege escalation); `RefuseService` (service rejected); `DirectoryEscape` (directory traversal); `UnauthorizedAccess` (unauthorized access); `PrivilegeAndAccessControl` (permissions, privileges, and access controls); `SensitiveInfoLeak` (sensitive data leakage).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskAttribute")
    @Expose
    private String RiskAttribute;

    /**
    * Risk characteristic and tag. Valid values: `ExistEXP` (an EXP exists); `ExistPOC` (a POC exists); `NoNeedReboot` (restart not required); `ServerRestart` (service restart); `RemoteInfoLeak` (remote information leakage); `RemoteRefuseService` (remote denial of service); `RemoteExploit` (remote exploit); `RemoteExecute` (remote execution).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskProperty")
    @Expose
    private String RiskProperty;

    /**
    * CVE No.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVENumber")
    @Expose
    private String CVENumber;

    /**
    * Disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscoverTime")
    @Expose
    private String DiscoverTime;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * CVSS information, which is used for drawing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVSS")
    @Expose
    private String CVSS;

    /**
    * CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVSSScore")
    @Expose
    private String CVSSScore;

    /**
    * Reference link
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelateLink")
    @Expose
    private String RelateLink;

    /**
    * Affected type. Valid values: `Node`, `Workload`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectedType")
    @Expose
    private String AffectedType;

    /**
    * Affected version information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectedVersion")
    @Expose
    private String AffectedVersion;

    /**
    * Number of ignored assets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoredAssetNum")
    @Expose
    private Long IgnoredAssetNum;

    /**
    * Whether to ignore the check item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsIgnored")
    @Expose
    private Boolean IsIgnored;

    /**
    * Impact assessment
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskAssessment")
    @Expose
    private String RiskAssessment;

    /**
     * Get Unique ID of the check item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckItemId Unique ID of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckItemId() {
        return this.CheckItemId;
    }

    /**
     * Set Unique ID of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckItemId Unique ID of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckItemId(Long CheckItemId) {
        this.CheckItemId = CheckItemId;
    }

    /**
     * Get Name of the risk item 
     * @return Name Name of the risk item
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the risk item
     * @param Name Name of the risk item
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Detailed description of the check item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemDetail Detailed description of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getItemDetail() {
        return this.ItemDetail;
    }

    /**
     * Set Detailed description of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemDetail Detailed description of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemDetail(String ItemDetail) {
        this.ItemDetail = ItemDetail;
    }

    /**
     * Get Severity. Valid values: `Serious` (critical); `High` (high); `Middle` (medium); `Hint` (prompt).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Severity. Valid values: `Serious` (critical); `High` (high); `Middle` (medium); `Hint` (prompt).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Severity. Valid values: `Serious` (critical); `High` (high); `Middle` (medium); `Hint` (prompt).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Severity. Valid values: `Serious` (critical); `High` (high); `Middle` (medium); `Hint` (prompt).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Check target and risky target. Valid values: `Runc`, `Kubelet`, `Containerd`, `Pods`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskTarget Check target and risky target. Valid values: `Runc`, `Kubelet`, `Containerd`, `Pods`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskTarget() {
        return this.RiskTarget;
    }

    /**
     * Set Check target and risky target. Valid values: `Runc`, `Kubelet`, `Containerd`, `Pods`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskTarget Check target and risky target. Valid values: `Runc`, `Kubelet`, `Containerd`, `Pods`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskTarget(String RiskTarget) {
        this.RiskTarget = RiskTarget;
    }

    /**
     * Get Risk type. Valid values: `CVERisk` (vulnerability risk); `ConfigRisk` (configuration risk).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskType Risk type. Valid values: `CVERisk` (vulnerability risk); `ConfigRisk` (configuration risk).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set Risk type. Valid values: `CVERisk` (vulnerability risk); `ConfigRisk` (configuration risk).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskType Risk type. Valid values: `CVERisk` (vulnerability risk); `ConfigRisk` (configuration risk).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get Risk type of the check item. Valid values: `PrivilegePromotion` (privilege escalation); `RefuseService` (service rejected); `DirectoryEscape` (directory traversal); `UnauthorizedAccess` (unauthorized access); `PrivilegeAndAccessControl` (permissions, privileges, and access controls); `SensitiveInfoLeak` (sensitive data leakage).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskAttribute Risk type of the check item. Valid values: `PrivilegePromotion` (privilege escalation); `RefuseService` (service rejected); `DirectoryEscape` (directory traversal); `UnauthorizedAccess` (unauthorized access); `PrivilegeAndAccessControl` (permissions, privileges, and access controls); `SensitiveInfoLeak` (sensitive data leakage).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskAttribute() {
        return this.RiskAttribute;
    }

    /**
     * Set Risk type of the check item. Valid values: `PrivilegePromotion` (privilege escalation); `RefuseService` (service rejected); `DirectoryEscape` (directory traversal); `UnauthorizedAccess` (unauthorized access); `PrivilegeAndAccessControl` (permissions, privileges, and access controls); `SensitiveInfoLeak` (sensitive data leakage).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskAttribute Risk type of the check item. Valid values: `PrivilegePromotion` (privilege escalation); `RefuseService` (service rejected); `DirectoryEscape` (directory traversal); `UnauthorizedAccess` (unauthorized access); `PrivilegeAndAccessControl` (permissions, privileges, and access controls); `SensitiveInfoLeak` (sensitive data leakage).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskAttribute(String RiskAttribute) {
        this.RiskAttribute = RiskAttribute;
    }

    /**
     * Get Risk characteristic and tag. Valid values: `ExistEXP` (an EXP exists); `ExistPOC` (a POC exists); `NoNeedReboot` (restart not required); `ServerRestart` (service restart); `RemoteInfoLeak` (remote information leakage); `RemoteRefuseService` (remote denial of service); `RemoteExploit` (remote exploit); `RemoteExecute` (remote execution).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskProperty Risk characteristic and tag. Valid values: `ExistEXP` (an EXP exists); `ExistPOC` (a POC exists); `NoNeedReboot` (restart not required); `ServerRestart` (service restart); `RemoteInfoLeak` (remote information leakage); `RemoteRefuseService` (remote denial of service); `RemoteExploit` (remote exploit); `RemoteExecute` (remote execution).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskProperty() {
        return this.RiskProperty;
    }

    /**
     * Set Risk characteristic and tag. Valid values: `ExistEXP` (an EXP exists); `ExistPOC` (a POC exists); `NoNeedReboot` (restart not required); `ServerRestart` (service restart); `RemoteInfoLeak` (remote information leakage); `RemoteRefuseService` (remote denial of service); `RemoteExploit` (remote exploit); `RemoteExecute` (remote execution).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskProperty Risk characteristic and tag. Valid values: `ExistEXP` (an EXP exists); `ExistPOC` (a POC exists); `NoNeedReboot` (restart not required); `ServerRestart` (service restart); `RemoteInfoLeak` (remote information leakage); `RemoteRefuseService` (remote denial of service); `RemoteExploit` (remote exploit); `RemoteExecute` (remote execution).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskProperty(String RiskProperty) {
        this.RiskProperty = RiskProperty;
    }

    /**
     * Get CVE No.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVENumber CVE No.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCVENumber() {
        return this.CVENumber;
    }

    /**
     * Set CVE No.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVENumber CVE No.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVENumber(String CVENumber) {
        this.CVENumber = CVENumber;
    }

    /**
     * Get Disclosure time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiscoverTime Disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiscoverTime() {
        return this.DiscoverTime;
    }

    /**
     * Set Disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiscoverTime Disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscoverTime(String DiscoverTime) {
        this.DiscoverTime = DiscoverTime;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Solution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Solution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get CVSS information, which is used for drawing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVSS CVSS information, which is used for drawing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS information, which is used for drawing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVSS CVSS information, which is used for drawing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVSS(String CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get CVSS score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVSSScore CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCVSSScore() {
        return this.CVSSScore;
    }

    /**
     * Set CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVSSScore CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVSSScore(String CVSSScore) {
        this.CVSSScore = CVSSScore;
    }

    /**
     * Get Reference link
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RelateLink Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRelateLink() {
        return this.RelateLink;
    }

    /**
     * Set Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RelateLink Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRelateLink(String RelateLink) {
        this.RelateLink = RelateLink;
    }

    /**
     * Get Affected type. Valid values: `Node`, `Workload`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AffectedType Affected type. Valid values: `Node`, `Workload`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAffectedType() {
        return this.AffectedType;
    }

    /**
     * Set Affected type. Valid values: `Node`, `Workload`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AffectedType Affected type. Valid values: `Node`, `Workload`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAffectedType(String AffectedType) {
        this.AffectedType = AffectedType;
    }

    /**
     * Get Affected version information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AffectedVersion Affected version information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAffectedVersion() {
        return this.AffectedVersion;
    }

    /**
     * Set Affected version information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AffectedVersion Affected version information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAffectedVersion(String AffectedVersion) {
        this.AffectedVersion = AffectedVersion;
    }

    /**
     * Get Number of ignored assets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IgnoredAssetNum Number of ignored assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIgnoredAssetNum() {
        return this.IgnoredAssetNum;
    }

    /**
     * Set Number of ignored assets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IgnoredAssetNum Number of ignored assets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIgnoredAssetNum(Long IgnoredAssetNum) {
        this.IgnoredAssetNum = IgnoredAssetNum;
    }

    /**
     * Get Whether to ignore the check item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsIgnored Whether to ignore the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsIgnored() {
        return this.IsIgnored;
    }

    /**
     * Set Whether to ignore the check item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsIgnored Whether to ignore the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsIgnored(Boolean IsIgnored) {
        this.IsIgnored = IsIgnored;
    }

    /**
     * Get Impact assessment
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskAssessment Impact assessment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskAssessment() {
        return this.RiskAssessment;
    }

    /**
     * Set Impact assessment
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskAssessment Impact assessment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskAssessment(String RiskAssessment) {
        this.RiskAssessment = RiskAssessment;
    }

    public ClusterCheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCheckItem(ClusterCheckItem source) {
        if (source.CheckItemId != null) {
            this.CheckItemId = new Long(source.CheckItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ItemDetail != null) {
            this.ItemDetail = new String(source.ItemDetail);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskTarget != null) {
            this.RiskTarget = new String(source.RiskTarget);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RiskAttribute != null) {
            this.RiskAttribute = new String(source.RiskAttribute);
        }
        if (source.RiskProperty != null) {
            this.RiskProperty = new String(source.RiskProperty);
        }
        if (source.CVENumber != null) {
            this.CVENumber = new String(source.CVENumber);
        }
        if (source.DiscoverTime != null) {
            this.DiscoverTime = new String(source.DiscoverTime);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.CVSS != null) {
            this.CVSS = new String(source.CVSS);
        }
        if (source.CVSSScore != null) {
            this.CVSSScore = new String(source.CVSSScore);
        }
        if (source.RelateLink != null) {
            this.RelateLink = new String(source.RelateLink);
        }
        if (source.AffectedType != null) {
            this.AffectedType = new String(source.AffectedType);
        }
        if (source.AffectedVersion != null) {
            this.AffectedVersion = new String(source.AffectedVersion);
        }
        if (source.IgnoredAssetNum != null) {
            this.IgnoredAssetNum = new Long(source.IgnoredAssetNum);
        }
        if (source.IsIgnored != null) {
            this.IsIgnored = new Boolean(source.IsIgnored);
        }
        if (source.RiskAssessment != null) {
            this.RiskAssessment = new String(source.RiskAssessment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckItemId", this.CheckItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ItemDetail", this.ItemDetail);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskTarget", this.RiskTarget);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RiskAttribute", this.RiskAttribute);
        this.setParamSimple(map, prefix + "RiskProperty", this.RiskProperty);
        this.setParamSimple(map, prefix + "CVENumber", this.CVENumber);
        this.setParamSimple(map, prefix + "DiscoverTime", this.DiscoverTime);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "CVSSScore", this.CVSSScore);
        this.setParamSimple(map, prefix + "RelateLink", this.RelateLink);
        this.setParamSimple(map, prefix + "AffectedType", this.AffectedType);
        this.setParamSimple(map, prefix + "AffectedVersion", this.AffectedVersion);
        this.setParamSimple(map, prefix + "IgnoredAssetNum", this.IgnoredAssetNum);
        this.setParamSimple(map, prefix + "IsIgnored", this.IsIgnored);
        this.setParamSimple(map, prefix + "RiskAssessment", this.RiskAssessment);

    }
}

