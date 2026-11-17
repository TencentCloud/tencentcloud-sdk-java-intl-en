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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillScanQueryData extends AbstractModel {

    /**
    * <p>Detection status: success (detection completed with results), scanning (detection in progress), not_found (no record), or failed (detection failed)</p><p>Valid values:</p><ul><li>success: detection completed with results</li><li>scanning: detection in progress</li><li>not_found: no record</li><li>failed: detection failed</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Skill name, used for page display, result list presentation, and manual analysis</p>
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * <p>Skill description, usually from Skill metadata or instructions, used to help callers understand the purpose of the Skill</p>
    */
    @SerializedName("SkillDescription")
    @Expose
    private String SkillDescription;

    /**
    * <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>Risk level: malicious, suspicious, or benign</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Comprehensive handling suggestion field, located at the top level of data, used to provide overall remediation, mitigation, or manual handling suggestions for this detection result</p>
    */
    @SerializedName("Mitigation")
    @Expose
    private String Mitigation;

    /**
    * <p>Security score (0-100, the higher the score, the more secure)</p><p>Value range: [0, 100]</p>
    */
    @SerializedName("SecurityScore")
    @Expose
    private Long SecurityScore;

    /**
    * <p>Engine version used for this scan</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * <p>List of capability tags of the Skill. The fixed external return format is [{id,name}]. This field describes the capability features or applicable scenarios of the Skill, facilitating retrieval, display, or classification by callers. It is not equivalent to risk tags, nor does it indicate risk level or rule hit results. When lang=en, only name is switched to English, and id remains unchanged</p>
    */
    @SerializedName("CapabilityTags")
    @Expose
    private SkillScanCapabilityTag [] CapabilityTags;

    /**
    * <p>Complete set of fusion rule categories. The key is the fusion rule_id (9xxxx), and the value is the risk category name. It contains all fusion rule categories, allowing callers to display category labels without maintaining a local mapping table. When lang=en is passed, English names are returned. This object is a name mapping table and does not express the priority of primary tags</p>
    */
    @SerializedName("RuleCatalog")
    @Expose
    private SkillRuleCatalogItem [] RuleCatalog;

    /**
    * <p>Scan result details, grouped by sub-engine. Each element contains scan_type (engine type) and rule_list (list of hit rules). The rule_id in the rules uses fusion encoding (9xxxx) and can be cross-referenced with rule_catalog. When lang=en is passed, description returns English text</p>
    */
    @SerializedName("ScanItems")
    @Expose
    private SkillScanItem [] ScanItems;

    /**
    * <p>URL of the comprehensive security audit report. Callers can specify the validity period through report_url_expire_hours. If not passed, a URL with a 1-year validity period is returned by default</p>
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * <p>Scan completion time</p>
    */
    @SerializedName("ScannedAt")
    @Expose
    private String ScannedAt;

    /**
    * <p>Task creation time</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Failure time</p>
    */
    @SerializedName("FailedAt")
    @Expose
    private String FailedAt;

    /**
    * <p>Description of the failure reason</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>Detection status: success (detection completed with results), scanning (detection in progress), not_found (no record), or failed (detection failed)</p><p>Valid values:</p><ul><li>success: detection completed with results</li><li>scanning: detection in progress</li><li>not_found: no record</li><li>failed: detection failed</li></ul> 
     * @return Status <p>Detection status: success (detection completed with results), scanning (detection in progress), not_found (no record), or failed (detection failed)</p><p>Valid values:</p><ul><li>success: detection completed with results</li><li>scanning: detection in progress</li><li>not_found: no record</li><li>failed: detection failed</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Detection status: success (detection completed with results), scanning (detection in progress), not_found (no record), or failed (detection failed)</p><p>Valid values:</p><ul><li>success: detection completed with results</li><li>scanning: detection in progress</li><li>not_found: no record</li><li>failed: detection failed</li></ul>
     * @param Status <p>Detection status: success (detection completed with results), scanning (detection in progress), not_found (no record), or failed (detection failed)</p><p>Valid values:</p><ul><li>success: detection completed with results</li><li>scanning: detection in progress</li><li>not_found: no record</li><li>failed: detection failed</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Skill name, used for page display, result list presentation, and manual analysis</p> 
     * @return SkillName <p>Skill name, used for page display, result list presentation, and manual analysis</p>
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set <p>Skill name, used for page display, result list presentation, and manual analysis</p>
     * @param SkillName <p>Skill name, used for page display, result list presentation, and manual analysis</p>
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get <p>Skill description, usually from Skill metadata or instructions, used to help callers understand the purpose of the Skill</p> 
     * @return SkillDescription <p>Skill description, usually from Skill metadata or instructions, used to help callers understand the purpose of the Skill</p>
     */
    public String getSkillDescription() {
        return this.SkillDescription;
    }

    /**
     * Set <p>Skill description, usually from Skill metadata or instructions, used to help callers understand the purpose of the Skill</p>
     * @param SkillDescription <p>Skill description, usually from Skill metadata or instructions, used to help callers understand the purpose of the Skill</p>
     */
    public void setSkillDescription(String SkillDescription) {
        this.SkillDescription = SkillDescription;
    }

    /**
     * Get <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest</p> 
     * @return ContentHash <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest</p>
     * @param ContentHash <p>SHA256 hash of the ZIP file, in the format of sha256:hex_digest</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>Risk level: malicious, suspicious, or benign</p> 
     * @return RiskLevel <p>Risk level: malicious, suspicious, or benign</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level: malicious, suspicious, or benign</p>
     * @param RiskLevel <p>Risk level: malicious, suspicious, or benign</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Comprehensive handling suggestion field, located at the top level of data, used to provide overall remediation, mitigation, or manual handling suggestions for this detection result</p> 
     * @return Mitigation <p>Comprehensive handling suggestion field, located at the top level of data, used to provide overall remediation, mitigation, or manual handling suggestions for this detection result</p>
     */
    public String getMitigation() {
        return this.Mitigation;
    }

    /**
     * Set <p>Comprehensive handling suggestion field, located at the top level of data, used to provide overall remediation, mitigation, or manual handling suggestions for this detection result</p>
     * @param Mitigation <p>Comprehensive handling suggestion field, located at the top level of data, used to provide overall remediation, mitigation, or manual handling suggestions for this detection result</p>
     */
    public void setMitigation(String Mitigation) {
        this.Mitigation = Mitigation;
    }

    /**
     * Get <p>Security score (0-100, the higher the score, the more secure)</p><p>Value range: [0, 100]</p> 
     * @return SecurityScore <p>Security score (0-100, the higher the score, the more secure)</p><p>Value range: [0, 100]</p>
     */
    public Long getSecurityScore() {
        return this.SecurityScore;
    }

    /**
     * Set <p>Security score (0-100, the higher the score, the more secure)</p><p>Value range: [0, 100]</p>
     * @param SecurityScore <p>Security score (0-100, the higher the score, the more secure)</p><p>Value range: [0, 100]</p>
     */
    public void setSecurityScore(Long SecurityScore) {
        this.SecurityScore = SecurityScore;
    }

    /**
     * Get <p>Engine version used for this scan</p> 
     * @return EngineVersion <p>Engine version used for this scan</p>
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Engine version used for this scan</p>
     * @param EngineVersion <p>Engine version used for this scan</p>
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>List of capability tags of the Skill. The fixed external return format is [{id,name}]. This field describes the capability features or applicable scenarios of the Skill, facilitating retrieval, display, or classification by callers. It is not equivalent to risk tags, nor does it indicate risk level or rule hit results. When lang=en, only name is switched to English, and id remains unchanged</p> 
     * @return CapabilityTags <p>List of capability tags of the Skill. The fixed external return format is [{id,name}]. This field describes the capability features or applicable scenarios of the Skill, facilitating retrieval, display, or classification by callers. It is not equivalent to risk tags, nor does it indicate risk level or rule hit results. When lang=en, only name is switched to English, and id remains unchanged</p>
     */
    public SkillScanCapabilityTag [] getCapabilityTags() {
        return this.CapabilityTags;
    }

    /**
     * Set <p>List of capability tags of the Skill. The fixed external return format is [{id,name}]. This field describes the capability features or applicable scenarios of the Skill, facilitating retrieval, display, or classification by callers. It is not equivalent to risk tags, nor does it indicate risk level or rule hit results. When lang=en, only name is switched to English, and id remains unchanged</p>
     * @param CapabilityTags <p>List of capability tags of the Skill. The fixed external return format is [{id,name}]. This field describes the capability features or applicable scenarios of the Skill, facilitating retrieval, display, or classification by callers. It is not equivalent to risk tags, nor does it indicate risk level or rule hit results. When lang=en, only name is switched to English, and id remains unchanged</p>
     */
    public void setCapabilityTags(SkillScanCapabilityTag [] CapabilityTags) {
        this.CapabilityTags = CapabilityTags;
    }

    /**
     * Get <p>Complete set of fusion rule categories. The key is the fusion rule_id (9xxxx), and the value is the risk category name. It contains all fusion rule categories, allowing callers to display category labels without maintaining a local mapping table. When lang=en is passed, English names are returned. This object is a name mapping table and does not express the priority of primary tags</p> 
     * @return RuleCatalog <p>Complete set of fusion rule categories. The key is the fusion rule_id (9xxxx), and the value is the risk category name. It contains all fusion rule categories, allowing callers to display category labels without maintaining a local mapping table. When lang=en is passed, English names are returned. This object is a name mapping table and does not express the priority of primary tags</p>
     */
    public SkillRuleCatalogItem [] getRuleCatalog() {
        return this.RuleCatalog;
    }

    /**
     * Set <p>Complete set of fusion rule categories. The key is the fusion rule_id (9xxxx), and the value is the risk category name. It contains all fusion rule categories, allowing callers to display category labels without maintaining a local mapping table. When lang=en is passed, English names are returned. This object is a name mapping table and does not express the priority of primary tags</p>
     * @param RuleCatalog <p>Complete set of fusion rule categories. The key is the fusion rule_id (9xxxx), and the value is the risk category name. It contains all fusion rule categories, allowing callers to display category labels without maintaining a local mapping table. When lang=en is passed, English names are returned. This object is a name mapping table and does not express the priority of primary tags</p>
     */
    public void setRuleCatalog(SkillRuleCatalogItem [] RuleCatalog) {
        this.RuleCatalog = RuleCatalog;
    }

    /**
     * Get <p>Scan result details, grouped by sub-engine. Each element contains scan_type (engine type) and rule_list (list of hit rules). The rule_id in the rules uses fusion encoding (9xxxx) and can be cross-referenced with rule_catalog. When lang=en is passed, description returns English text</p> 
     * @return ScanItems <p>Scan result details, grouped by sub-engine. Each element contains scan_type (engine type) and rule_list (list of hit rules). The rule_id in the rules uses fusion encoding (9xxxx) and can be cross-referenced with rule_catalog. When lang=en is passed, description returns English text</p>
     */
    public SkillScanItem [] getScanItems() {
        return this.ScanItems;
    }

    /**
     * Set <p>Scan result details, grouped by sub-engine. Each element contains scan_type (engine type) and rule_list (list of hit rules). The rule_id in the rules uses fusion encoding (9xxxx) and can be cross-referenced with rule_catalog. When lang=en is passed, description returns English text</p>
     * @param ScanItems <p>Scan result details, grouped by sub-engine. Each element contains scan_type (engine type) and rule_list (list of hit rules). The rule_id in the rules uses fusion encoding (9xxxx) and can be cross-referenced with rule_catalog. When lang=en is passed, description returns English text</p>
     */
    public void setScanItems(SkillScanItem [] ScanItems) {
        this.ScanItems = ScanItems;
    }

    /**
     * Get <p>URL of the comprehensive security audit report. Callers can specify the validity period through report_url_expire_hours. If not passed, a URL with a 1-year validity period is returned by default</p> 
     * @return ReportUrl <p>URL of the comprehensive security audit report. Callers can specify the validity period through report_url_expire_hours. If not passed, a URL with a 1-year validity period is returned by default</p>
     */
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set <p>URL of the comprehensive security audit report. Callers can specify the validity period through report_url_expire_hours. If not passed, a URL with a 1-year validity period is returned by default</p>
     * @param ReportUrl <p>URL of the comprehensive security audit report. Callers can specify the validity period through report_url_expire_hours. If not passed, a URL with a 1-year validity period is returned by default</p>
     */
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
    }

    /**
     * Get <p>Scan completion time</p> 
     * @return ScannedAt <p>Scan completion time</p>
     */
    public String getScannedAt() {
        return this.ScannedAt;
    }

    /**
     * Set <p>Scan completion time</p>
     * @param ScannedAt <p>Scan completion time</p>
     */
    public void setScannedAt(String ScannedAt) {
        this.ScannedAt = ScannedAt;
    }

    /**
     * Get <p>Task creation time</p> 
     * @return CreatedAt <p>Task creation time</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Task creation time</p>
     * @param CreatedAt <p>Task creation time</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Failure time</p> 
     * @return FailedAt <p>Failure time</p>
     */
    public String getFailedAt() {
        return this.FailedAt;
    }

    /**
     * Set <p>Failure time</p>
     * @param FailedAt <p>Failure time</p>
     */
    public void setFailedAt(String FailedAt) {
        this.FailedAt = FailedAt;
    }

    /**
     * Get <p>Description of the failure reason</p> 
     * @return Message <p>Description of the failure reason</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Description of the failure reason</p>
     * @param Message <p>Description of the failure reason</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SkillScanQueryData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanQueryData(SkillScanQueryData source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillDescription != null) {
            this.SkillDescription = new String(source.SkillDescription);
        }
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Mitigation != null) {
            this.Mitigation = new String(source.Mitigation);
        }
        if (source.SecurityScore != null) {
            this.SecurityScore = new Long(source.SecurityScore);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.CapabilityTags != null) {
            this.CapabilityTags = new SkillScanCapabilityTag[source.CapabilityTags.length];
            for (int i = 0; i < source.CapabilityTags.length; i++) {
                this.CapabilityTags[i] = new SkillScanCapabilityTag(source.CapabilityTags[i]);
            }
        }
        if (source.RuleCatalog != null) {
            this.RuleCatalog = new SkillRuleCatalogItem[source.RuleCatalog.length];
            for (int i = 0; i < source.RuleCatalog.length; i++) {
                this.RuleCatalog[i] = new SkillRuleCatalogItem(source.RuleCatalog[i]);
            }
        }
        if (source.ScanItems != null) {
            this.ScanItems = new SkillScanItem[source.ScanItems.length];
            for (int i = 0; i < source.ScanItems.length; i++) {
                this.ScanItems[i] = new SkillScanItem(source.ScanItems[i]);
            }
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
        }
        if (source.ScannedAt != null) {
            this.ScannedAt = new String(source.ScannedAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.FailedAt != null) {
            this.FailedAt = new String(source.FailedAt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillDescription", this.SkillDescription);
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Mitigation", this.Mitigation);
        this.setParamSimple(map, prefix + "SecurityScore", this.SecurityScore);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "CapabilityTags.", this.CapabilityTags);
        this.setParamArrayObj(map, prefix + "RuleCatalog.", this.RuleCatalog);
        this.setParamArrayObj(map, prefix + "ScanItems.", this.ScanItems);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "ScannedAt", this.ScannedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FailedAt", this.FailedAt);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

