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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * POC ID of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PatchId")
    @Expose
    private String PatchId;

    /**
    * Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * Vulnerability severity: `high`, `middle`, `low`, `info`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVSSScore")
    @Expose
    private String CVSSScore;

    /**
    * CVE number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Vulnerability category: `1`: Web application vulnerabilities, `2`: System component vulnerabilities, `3`: Configuration risks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VULCategory")
    @Expose
    private Long VULCategory;

    /**
    * Operating systems affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImpactOs")
    @Expose
    private String ImpactOs;

    /**
    * Components affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImpactCOMPENT")
    @Expose
    private String ImpactCOMPENT;

    /**
    * Versions affected by the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImpactVersion")
    @Expose
    private String ImpactVersion;

    /**
    * Reference information of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VULDescribe")
    @Expose
    private String VULDescribe;

    /**
    * Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Product support status. The real-time status is returned.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProSupport")
    @Expose
    private Long ProSupport;

    /**
    * Specify whether the vulnerability is published as an emergency vulnerability. `1`: Published as an emergency vulnerability; `0`: Not an emergency vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPublish")
    @Expose
    private Long IsPublish;

    /**
    * Disclosure time of the vulnerability. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * The time when the vulnerability is added to the vulnerability database.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last update time of the vulnerability in the database
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Sub-category of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubCategory")
    @Expose
    private String SubCategory;

    /**
     * Get Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get POC ID of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PatchId POC ID of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPatchId() {
        return this.PatchId;
    }

    /**
     * Set POC ID of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PatchId POC ID of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPatchId(String PatchId) {
        this.PatchId = PatchId;
    }

    /**
     * Get Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VULName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VULName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get Vulnerability severity: `high`, `middle`, `low`, `info`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Vulnerability severity: `high`, `middle`, `low`, `info`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability severity: `high`, `middle`, `low`, `info`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Vulnerability severity: `high`, `middle`, `low`, `info`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get CVE number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVEId CVE number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set CVE number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVEId CVE number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tag Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tag Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Vulnerability category: `1`: Web application vulnerabilities, `2`: System component vulnerabilities, `3`: Configuration risks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VULCategory Vulnerability category: `1`: Web application vulnerabilities, `2`: System component vulnerabilities, `3`: Configuration risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVULCategory() {
        return this.VULCategory;
    }

    /**
     * Set Vulnerability category: `1`: Web application vulnerabilities, `2`: System component vulnerabilities, `3`: Configuration risks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VULCategory Vulnerability category: `1`: Web application vulnerabilities, `2`: System component vulnerabilities, `3`: Configuration risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVULCategory(Long VULCategory) {
        this.VULCategory = VULCategory;
    }

    /**
     * Get Operating systems affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImpactOs Operating systems affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImpactOs() {
        return this.ImpactOs;
    }

    /**
     * Set Operating systems affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImpactOs Operating systems affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImpactOs(String ImpactOs) {
        this.ImpactOs = ImpactOs;
    }

    /**
     * Get Components affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImpactCOMPENT Components affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImpactCOMPENT() {
        return this.ImpactCOMPENT;
    }

    /**
     * Set Components affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImpactCOMPENT Components affected by the vulnerability 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImpactCOMPENT(String ImpactCOMPENT) {
        this.ImpactCOMPENT = ImpactCOMPENT;
    }

    /**
     * Get Versions affected by the vulnerability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImpactVersion Versions affected by the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImpactVersion() {
        return this.ImpactVersion;
    }

    /**
     * Set Versions affected by the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImpactVersion Versions affected by the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImpactVersion(String ImpactVersion) {
        this.ImpactVersion = ImpactVersion;
    }

    /**
     * Get Reference information of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reference Reference information of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference information of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reference Reference information of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VULDescribe Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVULDescribe() {
        return this.VULDescribe;
    }

    /**
     * Set Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VULDescribe Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVULDescribe(String VULDescribe) {
        this.VULDescribe = VULDescribe;
    }

    /**
     * Get Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fix Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fix Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Product support status. The real-time status is returned.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProSupport Product support status. The real-time status is returned.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProSupport() {
        return this.ProSupport;
    }

    /**
     * Set Product support status. The real-time status is returned.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProSupport Product support status. The real-time status is returned.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProSupport(Long ProSupport) {
        this.ProSupport = ProSupport;
    }

    /**
     * Get Specify whether the vulnerability is published as an emergency vulnerability. `1`: Published as an emergency vulnerability; `0`: Not an emergency vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPublish Specify whether the vulnerability is published as an emergency vulnerability. `1`: Published as an emergency vulnerability; `0`: Not an emergency vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsPublish() {
        return this.IsPublish;
    }

    /**
     * Set Specify whether the vulnerability is published as an emergency vulnerability. `1`: Published as an emergency vulnerability; `0`: Not an emergency vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPublish Specify whether the vulnerability is published as an emergency vulnerability. `1`: Published as an emergency vulnerability; `0`: Not an emergency vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPublish(Long IsPublish) {
        this.IsPublish = IsPublish;
    }

    /**
     * Get Disclosure time of the vulnerability. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReleaseTime Disclosure time of the vulnerability. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set Disclosure time of the vulnerability. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReleaseTime Disclosure time of the vulnerability. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get The time when the vulnerability is added to the vulnerability database.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The time when the vulnerability is added to the vulnerability database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the vulnerability is added to the vulnerability database.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The time when the vulnerability is added to the vulnerability database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last update time of the vulnerability in the database
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime The last update time of the vulnerability in the database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last update time of the vulnerability in the database
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime The last update time of the vulnerability in the database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Sub-category of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubCategory Sub-category of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubCategory() {
        return this.SubCategory;
    }

    /**
     * Set Sub-category of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubCategory Sub-category of the vulnerability
Note: This field may return null, indicating that no valid values can be obtained.
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

