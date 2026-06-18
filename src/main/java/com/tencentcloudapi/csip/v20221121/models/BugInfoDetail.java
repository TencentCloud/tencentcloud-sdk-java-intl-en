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

public class BugInfoDetail extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * PocId Corresponding to Vulnerability
    */
    @SerializedName("PatchId")
    @Expose
    private String PatchId;

    /**
    * Vulnerability name
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * Vulnerability Severity: High, Middle, Low, Info.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * CVSS Score
    */
    @SerializedName("CVSSScore")
    @Expose
    private String CVSSScore;

    /**
    * CVE ID
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * Vulnerability tag
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Vulnerability Type. 1: Web Application; 2: System Component Vulnerabilities; 3: Configuration Risk.
    */
    @SerializedName("VULCategory")
    @Expose
    private Long VULCategory;

    /**
    * Vulnerability Affected System
    */
    @SerializedName("ImpactOs")
    @Expose
    private String ImpactOs;

    /**
    * Affected component
    */
    @SerializedName("ImpactCOMPENT")
    @Expose
    private String ImpactCOMPENT;

    /**
    * Vulnerability Affected Version
    */
    @SerializedName("ImpactVersion")
    @Expose
    private String ImpactVersion;

    /**
    * Link
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Vulnerability description
    */
    @SerializedName("VULDescribe")
    @Expose
    private String VULDescribe;

    /**
    * Fixing suggestion
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Product Support Status, returned in real time.
    */
    @SerializedName("ProSupport")
    @Expose
    private Long ProSupport;

    /**
    * Published or Not. 0 for No, 1 for Yes.
    */
    @SerializedName("IsPublish")
    @Expose
    private Long IsPublish;

    /**
    * Release time.
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Vulnerability Subcategory
    */
    @SerializedName("SubCategory")
    @Expose
    private String SubCategory;

    /**
     * Get Vulnerability ID 
     * @return Id Vulnerability ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability ID
     * @param Id Vulnerability ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get PocId Corresponding to Vulnerability 
     * @return PatchId PocId Corresponding to Vulnerability
     */
    public String getPatchId() {
        return this.PatchId;
    }

    /**
     * Set PocId Corresponding to Vulnerability
     * @param PatchId PocId Corresponding to Vulnerability
     */
    public void setPatchId(String PatchId) {
        this.PatchId = PatchId;
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
     * Get Vulnerability Severity: High, Middle, Low, Info. 
     * @return Level Vulnerability Severity: High, Middle, Low, Info.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability Severity: High, Middle, Low, Info.
     * @param Level Vulnerability Severity: High, Middle, Low, Info.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get CVSS Score 
     * @return CVSSScore CVSS Score
     */
    public String getCVSSScore() {
        return this.CVSSScore;
    }

    /**
     * Set CVSS Score
     * @param CVSSScore CVSS Score
     */
    public void setCVSSScore(String CVSSScore) {
        this.CVSSScore = CVSSScore;
    }

    /**
     * Get CVE ID 
     * @return CVEId CVE ID
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set CVE ID
     * @param CVEId CVE ID
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get Vulnerability tag 
     * @return Tag Vulnerability tag
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Vulnerability tag
     * @param Tag Vulnerability tag
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Vulnerability Type. 1: Web Application; 2: System Component Vulnerabilities; 3: Configuration Risk. 
     * @return VULCategory Vulnerability Type. 1: Web Application; 2: System Component Vulnerabilities; 3: Configuration Risk.
     */
    public Long getVULCategory() {
        return this.VULCategory;
    }

    /**
     * Set Vulnerability Type. 1: Web Application; 2: System Component Vulnerabilities; 3: Configuration Risk.
     * @param VULCategory Vulnerability Type. 1: Web Application; 2: System Component Vulnerabilities; 3: Configuration Risk.
     */
    public void setVULCategory(Long VULCategory) {
        this.VULCategory = VULCategory;
    }

    /**
     * Get Vulnerability Affected System 
     * @return ImpactOs Vulnerability Affected System
     */
    public String getImpactOs() {
        return this.ImpactOs;
    }

    /**
     * Set Vulnerability Affected System
     * @param ImpactOs Vulnerability Affected System
     */
    public void setImpactOs(String ImpactOs) {
        this.ImpactOs = ImpactOs;
    }

    /**
     * Get Affected component 
     * @return ImpactCOMPENT Affected component
     */
    public String getImpactCOMPENT() {
        return this.ImpactCOMPENT;
    }

    /**
     * Set Affected component
     * @param ImpactCOMPENT Affected component
     */
    public void setImpactCOMPENT(String ImpactCOMPENT) {
        this.ImpactCOMPENT = ImpactCOMPENT;
    }

    /**
     * Get Vulnerability Affected Version 
     * @return ImpactVersion Vulnerability Affected Version
     */
    public String getImpactVersion() {
        return this.ImpactVersion;
    }

    /**
     * Set Vulnerability Affected Version
     * @param ImpactVersion Vulnerability Affected Version
     */
    public void setImpactVersion(String ImpactVersion) {
        this.ImpactVersion = ImpactVersion;
    }

    /**
     * Get Link 
     * @return Reference Link
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Link
     * @param Reference Link
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Vulnerability description 
     * @return VULDescribe Vulnerability description
     */
    public String getVULDescribe() {
        return this.VULDescribe;
    }

    /**
     * Set Vulnerability description
     * @param VULDescribe Vulnerability description
     */
    public void setVULDescribe(String VULDescribe) {
        this.VULDescribe = VULDescribe;
    }

    /**
     * Get Fixing suggestion 
     * @return Fix Fixing suggestion
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing suggestion
     * @param Fix Fixing suggestion
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Product Support Status, returned in real time. 
     * @return ProSupport Product Support Status, returned in real time.
     */
    public Long getProSupport() {
        return this.ProSupport;
    }

    /**
     * Set Product Support Status, returned in real time.
     * @param ProSupport Product Support Status, returned in real time.
     */
    public void setProSupport(Long ProSupport) {
        this.ProSupport = ProSupport;
    }

    /**
     * Get Published or Not. 0 for No, 1 for Yes. 
     * @return IsPublish Published or Not. 0 for No, 1 for Yes.
     */
    public Long getIsPublish() {
        return this.IsPublish;
    }

    /**
     * Set Published or Not. 0 for No, 1 for Yes.
     * @param IsPublish Published or Not. 0 for No, 1 for Yes.
     */
    public void setIsPublish(Long IsPublish) {
        this.IsPublish = IsPublish;
    }

    /**
     * Get Release time. 
     * @return ReleaseTime Release time.
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set Release time.
     * @param ReleaseTime Release time.
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
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
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Vulnerability Subcategory 
     * @return SubCategory Vulnerability Subcategory
     */
    public String getSubCategory() {
        return this.SubCategory;
    }

    /**
     * Set Vulnerability Subcategory
     * @param SubCategory Vulnerability Subcategory
     */
    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    public BugInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BugInfoDetail(BugInfoDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PatchId != null) {
            this.PatchId = new String(source.PatchId);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.CVSSScore != null) {
            this.CVSSScore = new String(source.CVSSScore);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.VULCategory != null) {
            this.VULCategory = new Long(source.VULCategory);
        }
        if (source.ImpactOs != null) {
            this.ImpactOs = new String(source.ImpactOs);
        }
        if (source.ImpactCOMPENT != null) {
            this.ImpactCOMPENT = new String(source.ImpactCOMPENT);
        }
        if (source.ImpactVersion != null) {
            this.ImpactVersion = new String(source.ImpactVersion);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.VULDescribe != null) {
            this.VULDescribe = new String(source.VULDescribe);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.ProSupport != null) {
            this.ProSupport = new Long(source.ProSupport);
        }
        if (source.IsPublish != null) {
            this.IsPublish = new Long(source.IsPublish);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SubCategory != null) {
            this.SubCategory = new String(source.SubCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PatchId", this.PatchId);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVSSScore", this.CVSSScore);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "VULCategory", this.VULCategory);
        this.setParamSimple(map, prefix + "ImpactOs", this.ImpactOs);
        this.setParamSimple(map, prefix + "ImpactCOMPENT", this.ImpactCOMPENT);
        this.setParamSimple(map, prefix + "ImpactVersion", this.ImpactVersion);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "VULDescribe", this.VULDescribe);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "ProSupport", this.ProSupport);
        this.setParamSimple(map, prefix + "IsPublish", this.IsPublish);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SubCategory", this.SubCategory);

    }
}

