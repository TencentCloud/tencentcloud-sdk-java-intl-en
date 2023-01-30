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

public class ImagesVul extends AbstractModel{

    /**
    * Vulnerability ID
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
    * Component
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Category 2
    */
    @SerializedName("CategoryType")
    @Expose
    private String CategoryType;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Description
    */
    @SerializedName("Des")
    @Expose
    private String Des;

    /**
    * Solution
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * Reference
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Defense solution
    */
    @SerializedName("DefenseSolution")
    @Expose
    private String DefenseSolution;

    /**
    * Submission time
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * CVSS V3 score
    */
    @SerializedName("CVSSV3Score")
    @Expose
    private Float CVSSV3Score;

    /**
    * CVSS V3 description
    */
    @SerializedName("CVSSV3Desc")
    @Expose
    private String CVSSV3Desc;

    /**
    * Whether it is of high priority. Valid values: `true` (yes); `false` (no).
    */
    @SerializedName("IsSuggest")
    @Expose
    private Boolean IsSuggest;

    /**
    * Number of the fixed version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixedVersions")
    @Expose
    private String FixedVersions;

    /**
    * Vulnerability tag. Valid values: `CanBeFixed`, `DynamicLevelPoc`, `DynamicLevelExp`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
     * Get Vulnerability ID 
     * @return CVEID Vulnerability ID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set Vulnerability ID
     * @param CVEID Vulnerability ID
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
     * Get Component 
     * @return Component Component
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component
     * @param Component Component
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Version 
     * @return Version Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
     * @param Version Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Category 
     * @return Category Category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category
     * @param Category Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Category 2 
     * @return CategoryType Category 2
     */
    public String getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set Category 2
     * @param CategoryType Category 2
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Description 
     * @return Des Description
     */
    public String getDes() {
        return this.Des;
    }

    /**
     * Set Description
     * @param Des Description
     */
    public void setDes(String Des) {
        this.Des = Des;
    }

    /**
     * Get Solution 
     * @return OfficialSolution Solution
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set Solution
     * @param OfficialSolution Solution
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get Reference 
     * @return Reference Reference
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference
     * @param Reference Reference
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Defense solution 
     * @return DefenseSolution Defense solution
     */
    public String getDefenseSolution() {
        return this.DefenseSolution;
    }

    /**
     * Set Defense solution
     * @param DefenseSolution Defense solution
     */
    public void setDefenseSolution(String DefenseSolution) {
        this.DefenseSolution = DefenseSolution;
    }

    /**
     * Get Submission time 
     * @return SubmitTime Submission time
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set Submission time
     * @param SubmitTime Submission time
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
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
     * Get Whether it is of high priority. Valid values: `true` (yes); `false` (no). 
     * @return IsSuggest Whether it is of high priority. Valid values: `true` (yes); `false` (no).
     */
    public Boolean getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set Whether it is of high priority. Valid values: `true` (yes); `false` (no).
     * @param IsSuggest Whether it is of high priority. Valid values: `true` (yes); `false` (no).
     */
    public void setIsSuggest(Boolean IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get Number of the fixed version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixedVersions Number of the fixed version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFixedVersions() {
        return this.FixedVersions;
    }

    /**
     * Set Number of the fixed version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixedVersions Number of the fixed version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixedVersions(String FixedVersions) {
        this.FixedVersions = FixedVersions;
    }

    /**
     * Get Vulnerability tag. Valid values: `CanBeFixed`, `DynamicLevelPoc`, `DynamicLevelExp`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tag Vulnerability tag. Valid values: `CanBeFixed`, `DynamicLevelPoc`, `DynamicLevelExp`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Vulnerability tag. Valid values: `CanBeFixed`, `DynamicLevelPoc`, `DynamicLevelExp`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tag Vulnerability tag. Valid values: `CanBeFixed`, `DynamicLevelPoc`, `DynamicLevelExp`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    public ImagesVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagesVul(ImagesVul source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Des != null) {
            this.Des = new String(source.Des);
        }
        if (source.OfficialSolution != null) {
            this.OfficialSolution = new String(source.OfficialSolution);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.DefenseSolution != null) {
            this.DefenseSolution = new String(source.DefenseSolution);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.CVSSV3Score != null) {
            this.CVSSV3Score = new Float(source.CVSSV3Score);
        }
        if (source.CVSSV3Desc != null) {
            this.CVSSV3Desc = new String(source.CVSSV3Desc);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Boolean(source.IsSuggest);
        }
        if (source.FixedVersions != null) {
            this.FixedVersions = new String(source.FixedVersions);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Des", this.Des);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "DefenseSolution", this.DefenseSolution);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "CVSSV3Score", this.CVSSV3Score);
        this.setParamSimple(map, prefix + "CVSSV3Desc", this.CVSSV3Desc);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "FixedVersions", this.FixedVersions);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);

    }
}

