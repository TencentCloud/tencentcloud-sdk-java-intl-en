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

public class ImageVul extends AbstractModel {

    /**
    * Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * POC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("POCID")
    @Expose
    private String POCID;

    /**
    * Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Component information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Components")
    @Expose
    private ComponentsInfo [] Components;

    /**
    * Category
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Category 2
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CategoryType")
    @Expose
    private String CategoryType;

    /**
    * Risk level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Des")
    @Expose
    private String Des;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * Reference
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Defense solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenseSolution")
    @Expose
    private String DefenseSolution;

    /**
    * Submission time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvssScore")
    @Expose
    private String CvssScore;

    /**
    * CVSS information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvssVector")
    @Expose
    private String CvssVector;

    /**
    * Whether fix is suggested
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSuggest")
    @Expose
    private String IsSuggest;

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
    * Component name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Component version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVEID Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVEID Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get POC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return POCID POC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPOCID() {
        return this.POCID;
    }

    /**
     * Set POC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param POCID POC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPOCID(String POCID) {
        this.POCID = POCID;
    }

    /**
     * Get Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Component information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Components Component information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComponentsInfo [] getComponents() {
        return this.Components;
    }

    /**
     * Set Component information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Components Component information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponents(ComponentsInfo [] Components) {
        this.Components = Components;
    }

    /**
     * Get Category
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Category Category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Category Category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Category 2
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CategoryType Category 2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set Category 2
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CategoryType Category 2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get Risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Des Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDes() {
        return this.Des;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Des Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDes(String Des) {
        this.Des = Des;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OfficialSolution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OfficialSolution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get Reference
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reference Reference
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reference Reference
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Defense solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenseSolution Defense solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefenseSolution() {
        return this.DefenseSolution;
    }

    /**
     * Set Defense solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenseSolution Defense solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenseSolution(String DefenseSolution) {
        this.DefenseSolution = DefenseSolution;
    }

    /**
     * Get Submission time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubmitTime Submission time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set Submission time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubmitTime Submission time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get CVSS score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvssScore CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvssScore CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvssScore(String CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get CVSS information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvssVector CVSS information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCvssVector() {
        return this.CvssVector;
    }

    /**
     * Set CVSS information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvssVector CVSS information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvssVector(String CvssVector) {
        this.CvssVector = CvssVector;
    }

    /**
     * Get Whether fix is suggested
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSuggest Whether fix is suggested
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set Whether fix is suggested
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSuggest Whether fix is suggested
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSuggest(String IsSuggest) {
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

    /**
     * Get Component name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Component Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Component Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Component version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Component version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Component version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public ImageVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVul(ImageVul source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.POCID != null) {
            this.POCID = new String(source.POCID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Components != null) {
            this.Components = new ComponentsInfo[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new ComponentsInfo(source.Components[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        if (source.CvssScore != null) {
            this.CvssScore = new String(source.CvssScore);
        }
        if (source.CvssVector != null) {
            this.CvssVector = new String(source.CvssVector);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new String(source.IsSuggest);
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
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "POCID", this.POCID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Des", this.Des);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "DefenseSolution", this.DefenseSolution);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "CvssVector", this.CvssVector);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "FixedVersions", this.FixedVersions);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

