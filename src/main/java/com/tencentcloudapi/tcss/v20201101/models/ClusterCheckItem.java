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
    * Unique Check Item ID
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
    * Check Item Details
    */
    @SerializedName("ItemDetail")
    @Expose
    private String ItemDetail;

    /**
    * Threat Level: Serious, High, Medium, Hint
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Check Object and Risk Object: Runc, Kubelet, Containerd, and Pods
    */
    @SerializedName("RiskTarget")
    @Expose
    private String RiskTarget;

    /**
    * Risk Category. CVERisk: Vulnerability Risk; ConfigRisk: Configuration Risk
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * Risk Type of Check Item. PrivilegePromotion: Privilege Promotion; RefuseService: Refuse of Service; DirectoryEscape: Directory Traversal; UnauthorizedAccess: Unauthorized Access; PrivilegeAndAccessControl: Permission and Access Control Issues; SensitiveInfoLeak: Sensitive Information Leakage
    */
    @SerializedName("RiskAttribute")
    @Expose
    private String RiskAttribute;

    /**
    * Risk Characteristics Tag
ExistEXP: With EXP
ExistPOC: With POD
NoNeedReboot: No Need of Reboot
ServerRestart: Service Reboot
RemoteInfoLeak: Remote Information Leakage
RemoteRefuseService: Remote Refuse Service
RemoteExploit: Remote Exploitation
RemoteExecute: Remote Execution
    */
    @SerializedName("RiskProperty")
    @Expose
    private String RiskProperty;

    /**
    * CVE id
    */
    @SerializedName("CVENumber")
    @Expose
    private String CVENumber;

    /**
    * Disclosure time
    */
    @SerializedName("DiscoverTime")
    @Expose
    private String DiscoverTime;

    /**
    * Solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * CVSS Information, Used for Drawing
    */
    @SerializedName("CVSS")
    @Expose
    private String CVSS;

    /**
    * CVSS score
    */
    @SerializedName("CVSSScore")
    @Expose
    private String CVSSScore;

    /**
    * Reference link
    */
    @SerializedName("RelateLink")
    @Expose
    private String RelateLink;

    /**
    * Impact Type: Node or Workload
    */
    @SerializedName("AffectedType")
    @Expose
    private String AffectedType;

    /**
    * Affected Version Information
    */
    @SerializedName("AffectedVersion")
    @Expose
    private String AffectedVersion;

    /**
    * Number of Ignored Assets
    */
    @SerializedName("IgnoredAssetNum")
    @Expose
    private Long IgnoredAssetNum;

    /**
    * Whether to Ignore the Check Item
    */
    @SerializedName("IsIgnored")
    @Expose
    private Boolean IsIgnored;

    /**
    * Affected Critique
    */
    @SerializedName("RiskAssessment")
    @Expose
    private String RiskAssessment;

    /**
     * Get Unique Check Item ID 
     * @return CheckItemId Unique Check Item ID
     */
    public Long getCheckItemId() {
        return this.CheckItemId;
    }

    /**
     * Set Unique Check Item ID
     * @param CheckItemId Unique Check Item ID
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
     * Get Check Item Details 
     * @return ItemDetail Check Item Details
     */
    public String getItemDetail() {
        return this.ItemDetail;
    }

    /**
     * Set Check Item Details
     * @param ItemDetail Check Item Details
     */
    public void setItemDetail(String ItemDetail) {
        this.ItemDetail = ItemDetail;
    }

    /**
     * Get Threat Level: Serious, High, Medium, Hint 
     * @return RiskLevel Threat Level: Serious, High, Medium, Hint
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Threat Level: Serious, High, Medium, Hint
     * @param RiskLevel Threat Level: Serious, High, Medium, Hint
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Check Object and Risk Object: Runc, Kubelet, Containerd, and Pods 
     * @return RiskTarget Check Object and Risk Object: Runc, Kubelet, Containerd, and Pods
     */
    public String getRiskTarget() {
        return this.RiskTarget;
    }

    /**
     * Set Check Object and Risk Object: Runc, Kubelet, Containerd, and Pods
     * @param RiskTarget Check Object and Risk Object: Runc, Kubelet, Containerd, and Pods
     */
    public void setRiskTarget(String RiskTarget) {
        this.RiskTarget = RiskTarget;
    }

    /**
     * Get Risk Category. CVERisk: Vulnerability Risk; ConfigRisk: Configuration Risk 
     * @return RiskType Risk Category. CVERisk: Vulnerability Risk; ConfigRisk: Configuration Risk
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set Risk Category. CVERisk: Vulnerability Risk; ConfigRisk: Configuration Risk
     * @param RiskType Risk Category. CVERisk: Vulnerability Risk; ConfigRisk: Configuration Risk
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get Risk Type of Check Item. PrivilegePromotion: Privilege Promotion; RefuseService: Refuse of Service; DirectoryEscape: Directory Traversal; UnauthorizedAccess: Unauthorized Access; PrivilegeAndAccessControl: Permission and Access Control Issues; SensitiveInfoLeak: Sensitive Information Leakage 
     * @return RiskAttribute Risk Type of Check Item. PrivilegePromotion: Privilege Promotion; RefuseService: Refuse of Service; DirectoryEscape: Directory Traversal; UnauthorizedAccess: Unauthorized Access; PrivilegeAndAccessControl: Permission and Access Control Issues; SensitiveInfoLeak: Sensitive Information Leakage
     */
    public String getRiskAttribute() {
        return this.RiskAttribute;
    }

    /**
     * Set Risk Type of Check Item. PrivilegePromotion: Privilege Promotion; RefuseService: Refuse of Service; DirectoryEscape: Directory Traversal; UnauthorizedAccess: Unauthorized Access; PrivilegeAndAccessControl: Permission and Access Control Issues; SensitiveInfoLeak: Sensitive Information Leakage
     * @param RiskAttribute Risk Type of Check Item. PrivilegePromotion: Privilege Promotion; RefuseService: Refuse of Service; DirectoryEscape: Directory Traversal; UnauthorizedAccess: Unauthorized Access; PrivilegeAndAccessControl: Permission and Access Control Issues; SensitiveInfoLeak: Sensitive Information Leakage
     */
    public void setRiskAttribute(String RiskAttribute) {
        this.RiskAttribute = RiskAttribute;
    }

    /**
     * Get Risk Characteristics Tag
ExistEXP: With EXP
ExistPOC: With POD
NoNeedReboot: No Need of Reboot
ServerRestart: Service Reboot
RemoteInfoLeak: Remote Information Leakage
RemoteRefuseService: Remote Refuse Service
RemoteExploit: Remote Exploitation
RemoteExecute: Remote Execution 
     * @return RiskProperty Risk Characteristics Tag
ExistEXP: With EXP
ExistPOC: With POD
NoNeedReboot: No Need of Reboot
ServerRestart: Service Reboot
RemoteInfoLeak: Remote Information Leakage
RemoteRefuseService: Remote Refuse Service
RemoteExploit: Remote Exploitation
RemoteExecute: Remote Execution
     */
    public String getRiskProperty() {
        return this.RiskProperty;
    }

    /**
     * Set Risk Characteristics Tag
ExistEXP: With EXP
ExistPOC: With POD
NoNeedReboot: No Need of Reboot
ServerRestart: Service Reboot
RemoteInfoLeak: Remote Information Leakage
RemoteRefuseService: Remote Refuse Service
RemoteExploit: Remote Exploitation
RemoteExecute: Remote Execution
     * @param RiskProperty Risk Characteristics Tag
ExistEXP: With EXP
ExistPOC: With POD
NoNeedReboot: No Need of Reboot
ServerRestart: Service Reboot
RemoteInfoLeak: Remote Information Leakage
RemoteRefuseService: Remote Refuse Service
RemoteExploit: Remote Exploitation
RemoteExecute: Remote Execution
     */
    public void setRiskProperty(String RiskProperty) {
        this.RiskProperty = RiskProperty;
    }

    /**
     * Get CVE id 
     * @return CVENumber CVE id
     */
    public String getCVENumber() {
        return this.CVENumber;
    }

    /**
     * Set CVE id
     * @param CVENumber CVE id
     */
    public void setCVENumber(String CVENumber) {
        this.CVENumber = CVENumber;
    }

    /**
     * Get Disclosure time 
     * @return DiscoverTime Disclosure time
     */
    public String getDiscoverTime() {
        return this.DiscoverTime;
    }

    /**
     * Set Disclosure time
     * @param DiscoverTime Disclosure time
     */
    public void setDiscoverTime(String DiscoverTime) {
        this.DiscoverTime = DiscoverTime;
    }

    /**
     * Get Solution 
     * @return Solution Solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
     * @param Solution Solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get CVSS Information, Used for Drawing 
     * @return CVSS CVSS Information, Used for Drawing
     */
    public String getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS Information, Used for Drawing
     * @param CVSS CVSS Information, Used for Drawing
     */
    public void setCVSS(String CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get CVSS score 
     * @return CVSSScore CVSS score
     */
    public String getCVSSScore() {
        return this.CVSSScore;
    }

    /**
     * Set CVSS score
     * @param CVSSScore CVSS score
     */
    public void setCVSSScore(String CVSSScore) {
        this.CVSSScore = CVSSScore;
    }

    /**
     * Get Reference link 
     * @return RelateLink Reference link
     */
    public String getRelateLink() {
        return this.RelateLink;
    }

    /**
     * Set Reference link
     * @param RelateLink Reference link
     */
    public void setRelateLink(String RelateLink) {
        this.RelateLink = RelateLink;
    }

    /**
     * Get Impact Type: Node or Workload 
     * @return AffectedType Impact Type: Node or Workload
     */
    public String getAffectedType() {
        return this.AffectedType;
    }

    /**
     * Set Impact Type: Node or Workload
     * @param AffectedType Impact Type: Node or Workload
     */
    public void setAffectedType(String AffectedType) {
        this.AffectedType = AffectedType;
    }

    /**
     * Get Affected Version Information 
     * @return AffectedVersion Affected Version Information
     */
    public String getAffectedVersion() {
        return this.AffectedVersion;
    }

    /**
     * Set Affected Version Information
     * @param AffectedVersion Affected Version Information
     */
    public void setAffectedVersion(String AffectedVersion) {
        this.AffectedVersion = AffectedVersion;
    }

    /**
     * Get Number of Ignored Assets 
     * @return IgnoredAssetNum Number of Ignored Assets
     */
    public Long getIgnoredAssetNum() {
        return this.IgnoredAssetNum;
    }

    /**
     * Set Number of Ignored Assets
     * @param IgnoredAssetNum Number of Ignored Assets
     */
    public void setIgnoredAssetNum(Long IgnoredAssetNum) {
        this.IgnoredAssetNum = IgnoredAssetNum;
    }

    /**
     * Get Whether to Ignore the Check Item 
     * @return IsIgnored Whether to Ignore the Check Item
     */
    public Boolean getIsIgnored() {
        return this.IsIgnored;
    }

    /**
     * Set Whether to Ignore the Check Item
     * @param IsIgnored Whether to Ignore the Check Item
     */
    public void setIsIgnored(Boolean IsIgnored) {
        this.IsIgnored = IsIgnored;
    }

    /**
     * Get Affected Critique 
     * @return RiskAssessment Affected Critique
     */
    public String getRiskAssessment() {
        return this.RiskAssessment;
    }

    /**
     * Set Affected Critique
     * @param RiskAssessment Affected Critique
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

