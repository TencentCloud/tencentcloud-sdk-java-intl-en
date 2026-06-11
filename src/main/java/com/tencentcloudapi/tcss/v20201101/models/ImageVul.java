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
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * viewpoint validation program ID
    */
    @SerializedName("POCID")
    @Expose
    private String POCID;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Component Information
    */
    @SerializedName("Components")
    @Expose
    private ComponentsInfo [] Components;

    /**
    * category
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
    private String Level;

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
    * Refer
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * defense solution
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
    * CVSS Score
    */
    @SerializedName("CvssScore")
    @Expose
    private String CvssScore;

    /**
    * CVSS information.
    */
    @SerializedName("CvssVector")
    @Expose
    private String CvssVector;

    /**
    * Whether repair is suggested.
    */
    @SerializedName("IsSuggest")
    @Expose
    private String IsSuggest;

    /**
    * Repair Version Number
    */
    @SerializedName("FixedVersions")
    @Expose
    private String FixedVersions;

    /**
    * Vulnerability Tag: "CanBeFixed", "DynamicLevelPoc", and "DynamicLevelExp"
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * Component name.
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Component version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Attack Heat 0-3
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * Image Layer Information List
    */
    @SerializedName("LayerInfos")
    @Expose
    private ImageVulLayerInfo [] LayerInfos;

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
     * Get viewpoint validation program ID 
     * @return POCID viewpoint validation program ID
     */
    public String getPOCID() {
        return this.POCID;
    }

    /**
     * Set viewpoint validation program ID
     * @param POCID viewpoint validation program ID
     */
    public void setPOCID(String POCID) {
        this.POCID = POCID;
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
     * Get Component Information 
     * @return Components Component Information
     */
    public ComponentsInfo [] getComponents() {
        return this.Components;
    }

    /**
     * Set Component Information
     * @param Components Component Information
     */
    public void setComponents(ComponentsInfo [] Components) {
        this.Components = Components;
    }

    /**
     * Get category 
     * @return Category category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set category
     * @param Category category
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
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(String Level) {
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
     * Get Refer 
     * @return Reference Refer
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Refer
     * @param Reference Refer
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get defense solution 
     * @return DefenseSolution defense solution
     */
    public String getDefenseSolution() {
        return this.DefenseSolution;
    }

    /**
     * Set defense solution
     * @param DefenseSolution defense solution
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
     * Get CVSS Score 
     * @return CvssScore CVSS Score
     */
    public String getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS Score
     * @param CvssScore CVSS Score
     */
    public void setCvssScore(String CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get CVSS information. 
     * @return CvssVector CVSS information.
     */
    public String getCvssVector() {
        return this.CvssVector;
    }

    /**
     * Set CVSS information.
     * @param CvssVector CVSS information.
     */
    public void setCvssVector(String CvssVector) {
        this.CvssVector = CvssVector;
    }

    /**
     * Get Whether repair is suggested. 
     * @return IsSuggest Whether repair is suggested.
     */
    public String getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set Whether repair is suggested.
     * @param IsSuggest Whether repair is suggested.
     */
    public void setIsSuggest(String IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get Repair Version Number 
     * @return FixedVersions Repair Version Number
     */
    public String getFixedVersions() {
        return this.FixedVersions;
    }

    /**
     * Set Repair Version Number
     * @param FixedVersions Repair Version Number
     */
    public void setFixedVersions(String FixedVersions) {
        this.FixedVersions = FixedVersions;
    }

    /**
     * Get Vulnerability Tag: "CanBeFixed", "DynamicLevelPoc", and "DynamicLevelExp" 
     * @return Tag Vulnerability Tag: "CanBeFixed", "DynamicLevelPoc", and "DynamicLevelExp"
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Vulnerability Tag: "CanBeFixed", "DynamicLevelPoc", and "DynamicLevelExp"
     * @param Tag Vulnerability Tag: "CanBeFixed", "DynamicLevelPoc", and "DynamicLevelExp"
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Component name. 
     * @return Component Component name.
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component name.
     * @param Component Component name.
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Component version 
     * @return Version Component version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version
     * @param Version Component version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Attack Heat 0-3 
     * @return AttackLevel Attack Heat 0-3
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set Attack Heat 0-3
     * @param AttackLevel Attack Heat 0-3
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get Image Layer Information List 
     * @return LayerInfos Image Layer Information List
     */
    public ImageVulLayerInfo [] getLayerInfos() {
        return this.LayerInfos;
    }

    /**
     * Set Image Layer Information List
     * @param LayerInfos Image Layer Information List
     */
    public void setLayerInfos(ImageVulLayerInfo [] LayerInfos) {
        this.LayerInfos = LayerInfos;
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
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.LayerInfos != null) {
            this.LayerInfos = new ImageVulLayerInfo[source.LayerInfos.length];
            for (int i = 0; i < source.LayerInfos.length; i++) {
                this.LayerInfos[i] = new ImageVulLayerInfo(source.LayerInfos[i]);
            }
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
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamArrayObj(map, prefix + "LayerInfos.", this.LayerInfos);

    }
}

