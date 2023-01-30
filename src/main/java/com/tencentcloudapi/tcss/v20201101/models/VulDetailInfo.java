/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDetailInfo extends AbstractModel{

    /**
    * CVE No.
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Vulnerability type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CategoryType")
    @Expose
    private String CategoryType;

    /**
    * Vulnerability severity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Vulnerability disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * Vulnerability description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CVSS V3 description
    */
    @SerializedName("CVSSV3Desc")
    @Expose
    private String CVSSV3Desc;

    /**
    * Vulnerability fix suggestion
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * Mitigation measure
    */
    @SerializedName("DefenseSolution")
    @Expose
    private String DefenseSolution;

    /**
    * Reference link
    */
    @SerializedName("Reference")
    @Expose
    private String [] Reference;

    /**
    * CVSS V3 score
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * List of components affected by vulnerabilities
    */
    @SerializedName("ComponentList")
    @Expose
    private VulAffectedComponentInfo [] ComponentList;

    /**
    * Number of affected local images
    */
    @SerializedName("LocalImageCount")
    @Expose
    private Long LocalImageCount;

    /**
    * Number of affected containers
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * Number of affected repository images
    */
    @SerializedName("RegistryImageCount")
    @Expose
    private Long RegistryImageCount;

    /**
    * Vulnerability sub-category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Number of affected local images on the latest version
    */
    @SerializedName("LocalNewestImageCount")
    @Expose
    private Long LocalNewestImageCount;

    /**
    * Number of affected repository images on the latest version
    */
    @SerializedName("RegistryNewestImageCount")
    @Expose
    private Long RegistryNewestImageCount;

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceStatus")
    @Expose
    private String DefenceStatus;

    /**
    * Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceScope")
    @Expose
    private String DefenceScope;

    /**
    * Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceHostCount")
    @Expose
    private Long DefenceHostCount;

    /**
    * Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefendedCount")
    @Expose
    private Long DefendedCount;

    /**
    * Whether it is scanned. Valid values: `NOT_SCAN` (not scanned); `SCANNED` (scanned).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
     * Get CVE No. 
     * @return CVEID CVE No.
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE No.
     * @param CVEID CVE No.
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get Vulnerability name 
     * @return Name Vulnerability name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
     * @param Name Vulnerability name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Vulnerability tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Vulnerability type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CategoryType Vulnerability type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set Vulnerability type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CategoryType Vulnerability type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get Vulnerability severity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Vulnerability severity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability severity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Vulnerability severity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Vulnerability disclosure time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubmitTime Vulnerability disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set Vulnerability disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubmitTime Vulnerability disclosure time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get Vulnerability description 
     * @return Description Vulnerability description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vulnerability description
     * @param Description Vulnerability description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CVSS V3 description 
     * @return CVSSV3Desc CVSS V3 description
     */
    public String getCVSSV3Desc() {
        return this.CVSSV3Desc;
    }

    /**
     * Set CVSS V3 description
     * @param CVSSV3Desc CVSS V3 description
     */
    public void setCVSSV3Desc(String CVSSV3Desc) {
        this.CVSSV3Desc = CVSSV3Desc;
    }

    /**
     * Get Vulnerability fix suggestion 
     * @return OfficialSolution Vulnerability fix suggestion
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set Vulnerability fix suggestion
     * @param OfficialSolution Vulnerability fix suggestion
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get Mitigation measure 
     * @return DefenseSolution Mitigation measure
     */
    public String getDefenseSolution() {
        return this.DefenseSolution;
    }

    /**
     * Set Mitigation measure
     * @param DefenseSolution Mitigation measure
     */
    public void setDefenseSolution(String DefenseSolution) {
        this.DefenseSolution = DefenseSolution;
    }

    /**
     * Get Reference link 
     * @return Reference Reference link
     */
    public String [] getReference() {
        return this.Reference;
    }

    /**
     * Set Reference link
     * @param Reference Reference link
     */
    public void setReference(String [] Reference) {
        this.Reference = Reference;
    }

    /**
     * Get CVSS V3 score 
     * @return CVSSV3Score CVSS V3 score
     */
    public Float getCVSSV3Score() {
        return this.CVSSV3Score;
    }

    /**
     * Set CVSS V3 score
     * @param CVSSV3Score CVSS V3 score
     */
    public void setCVSSV3Score(Float CVSSV3Score) {
        this.CVSSV3Score = CVSSV3Score;
    }

    /**
     * Get List of components affected by vulnerabilities 
     * @return ComponentList List of components affected by vulnerabilities
     */
    public VulAffectedComponentInfo [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set List of components affected by vulnerabilities
     * @param ComponentList List of components affected by vulnerabilities
     */
    public void setComponentList(VulAffectedComponentInfo [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    /**
     * Get Number of affected local images 
     * @return LocalImageCount Number of affected local images
     */
    public Long getLocalImageCount() {
        return this.LocalImageCount;
    }

    /**
     * Set Number of affected local images
     * @param LocalImageCount Number of affected local images
     */
    public void setLocalImageCount(Long LocalImageCount) {
        this.LocalImageCount = LocalImageCount;
    }

    /**
     * Get Number of affected containers 
     * @return ContainerCount Number of affected containers
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Number of affected containers
     * @param ContainerCount Number of affected containers
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get Number of affected repository images 
     * @return RegistryImageCount Number of affected repository images
     */
    public Long getRegistryImageCount() {
        return this.RegistryImageCount;
    }

    /**
     * Set Number of affected repository images
     * @param RegistryImageCount Number of affected repository images
     */
    public void setRegistryImageCount(Long RegistryImageCount) {
        this.RegistryImageCount = RegistryImageCount;
    }

    /**
     * Get Vulnerability sub-category 
     * @return Category Vulnerability sub-category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability sub-category
     * @param Category Vulnerability sub-category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Number of affected local images on the latest version 
     * @return LocalNewestImageCount Number of affected local images on the latest version
     */
    public Long getLocalNewestImageCount() {
        return this.LocalNewestImageCount;
    }

    /**
     * Set Number of affected local images on the latest version
     * @param LocalNewestImageCount Number of affected local images on the latest version
     */
    public void setLocalNewestImageCount(Long LocalNewestImageCount) {
        this.LocalNewestImageCount = LocalNewestImageCount;
    }

    /**
     * Get Number of affected repository images on the latest version 
     * @return RegistryNewestImageCount Number of affected repository images on the latest version
     */
    public Long getRegistryNewestImageCount() {
        return this.RegistryNewestImageCount;
    }

    /**
     * Set Number of affected repository images on the latest version
     * @param RegistryNewestImageCount Number of affected repository images on the latest version
     */
    public void setRegistryNewestImageCount(Long RegistryNewestImageCount) {
        this.RegistryNewestImageCount = RegistryNewestImageCount;
    }

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceStatus Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefenceStatus() {
        return this.DefenceStatus;
    }

    /**
     * Set Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceStatus Defense status. Valid values: `NO_DEFENDED`, `DEFENDED`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceStatus(String DefenceStatus) {
        this.DefenceStatus = DefenceStatus;
    }

    /**
     * Get Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceScope Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefenceScope() {
        return this.DefenceScope;
    }

    /**
     * Set Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceScope Scope of servers with exploit prevention enabled. Valid values: `MANUAL` (specified servers); `ALL` (all servers).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceScope(String DefenceScope) {
        this.DefenceScope = DefenceScope;
    }

    /**
     * Get Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceHostCount Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefenceHostCount() {
        return this.DefenceHostCount;
    }

    /**
     * Set Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceHostCount Number of servers with exploit prevention enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceHostCount(Long DefenceHostCount) {
        this.DefenceHostCount = DefenceHostCount;
    }

    /**
     * Get Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefendedCount Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefendedCount() {
        return this.DefendedCount;
    }

    /**
     * Set Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefendedCount Number of attacks defended against
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefendedCount(Long DefendedCount) {
        this.DefendedCount = DefendedCount;
    }

    /**
     * Get Whether it is scanned. Valid values: `NOT_SCAN` (not scanned); `SCANNED` (scanned).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanStatus Whether it is scanned. Valid values: `NOT_SCAN` (not scanned); `SCANNED` (scanned).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Whether it is scanned. Valid values: `NOT_SCAN` (not scanned); `SCANNED` (scanned).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanStatus Whether it is scanned. Valid values: `NOT_SCAN` (not scanned); `SCANNED` (scanned).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    public VulDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDetailInfo(VulDetailInfo source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CVSSV3Desc != null) {
            this.CVSSV3Desc = new String(source.CVSSV3Desc);
        }
        if (source.OfficialSolution != null) {
            this.OfficialSolution = new String(source.OfficialSolution);
        }
        if (source.DefenseSolution != null) {
            this.DefenseSolution = new String(source.DefenseSolution);
        }
        if (source.Reference != null) {
            this.Reference = new String[source.Reference.length];
            for (int i = 0; i < source.Reference.length; i++) {
                this.Reference[i] = new String(source.Reference[i]);
            }
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new VulAffectedComponentInfo[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new VulAffectedComponentInfo(source.ComponentList[i]);
            }
        }
        if (source.LocalImageCount != null) {
            this.LocalImageCount = new Long(source.LocalImageCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.RegistryImageCount != null) {
            this.RegistryImageCount = new Long(source.RegistryImageCount);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.LocalNewestImageCount != null) {
            this.LocalNewestImageCount = new Long(source.LocalNewestImageCount);
        }
        if (source.RegistryNewestImageCount != null) {
            this.RegistryNewestImageCount = new Long(source.RegistryNewestImageCount);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.DefenceStatus != null) {
            this.DefenceStatus = new String(source.DefenceStatus);
        }
        if (source.DefenceScope != null) {
            this.DefenceScope = new String(source.DefenceScope);
        }
        if (source.DefenceHostCount != null) {
            this.DefenceHostCount = new Long(source.DefenceHostCount);
        }
        if (source.DefendedCount != null) {
            this.DefendedCount = new Long(source.DefendedCount);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CVSSV3Desc", this.CVSSV3Desc);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "DefenseSolution", this.DefenseSolution);
        this.setParamArraySimple(map, prefix + "Reference.", this.Reference);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);
        this.setParamSimple(map, prefix + "LocalImageCount", this.LocalImageCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "RegistryImageCount", this.RegistryImageCount);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "LocalNewestImageCount", this.LocalNewestImageCount);
        this.setParamSimple(map, prefix + "RegistryNewestImageCount", this.RegistryNewestImageCount);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "DefenceStatus", this.DefenceStatus);
        this.setParamSimple(map, prefix + "DefenceScope", this.DefenceScope);
        this.setParamSimple(map, prefix + "DefenceHostCount", this.DefenceHostCount);
        this.setParamSimple(map, prefix + "DefendedCount", this.DefendedCount);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);

    }
}

