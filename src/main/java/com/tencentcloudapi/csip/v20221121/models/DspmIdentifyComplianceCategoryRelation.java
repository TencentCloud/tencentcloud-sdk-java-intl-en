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

public class DspmIdentifyComplianceCategoryRelation extends AbstractModel {

    /**
    * <p>Category ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * <p>Category name</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>Parent category ID</p>
    */
    @SerializedName("CategoryParentId")
    @Expose
    private String CategoryParentId;

    /**
    * <p>is leaf node</p>
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * <p>Classification type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>Classification levels</p><p>Unit: level</p>
    */
    @SerializedName("CategoryGrade")
    @Expose
    private Long CategoryGrade;

    /**
    * <p>Associated data item information</p>
    */
    @SerializedName("RuleRelations")
    @Expose
    private DspmIdentifyComplianceRuleRelation [] RuleRelations;

    /**
    * <p>Sub-node information</p>
    */
    @SerializedName("Children")
    @Expose
    private DspmIdentifyComplianceCategoryRelation [] Children;

    /**
     * Get <p>Category ID</p> 
     * @return CategoryId <p>Category ID</p>
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category ID</p>
     * @param CategoryId <p>Category ID</p>
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Category name</p> 
     * @return CategoryName <p>Category name</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>Category name</p>
     * @param CategoryName <p>Category name</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>Parent category ID</p> 
     * @return CategoryParentId <p>Parent category ID</p>
     */
    public String getCategoryParentId() {
        return this.CategoryParentId;
    }

    /**
     * Set <p>Parent category ID</p>
     * @param CategoryParentId <p>Parent category ID</p>
     */
    public void setCategoryParentId(String CategoryParentId) {
        this.CategoryParentId = CategoryParentId;
    }

    /**
     * Get <p>is leaf node</p> 
     * @return IsLeaf <p>is leaf node</p>
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set <p>is leaf node</p>
     * @param IsLeaf <p>is leaf node</p>
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get <p>Classification type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul> 
     * @return CategoryType <p>Classification type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public Long getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set <p>Classification type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     * @param CategoryType <p>Classification type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public void setCategoryType(Long CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get <p>Classification levels</p><p>Unit: level</p> 
     * @return CategoryGrade <p>Classification levels</p><p>Unit: level</p>
     */
    public Long getCategoryGrade() {
        return this.CategoryGrade;
    }

    /**
     * Set <p>Classification levels</p><p>Unit: level</p>
     * @param CategoryGrade <p>Classification levels</p><p>Unit: level</p>
     */
    public void setCategoryGrade(Long CategoryGrade) {
        this.CategoryGrade = CategoryGrade;
    }

    /**
     * Get <p>Associated data item information</p> 
     * @return RuleRelations <p>Associated data item information</p>
     */
    public DspmIdentifyComplianceRuleRelation [] getRuleRelations() {
        return this.RuleRelations;
    }

    /**
     * Set <p>Associated data item information</p>
     * @param RuleRelations <p>Associated data item information</p>
     */
    public void setRuleRelations(DspmIdentifyComplianceRuleRelation [] RuleRelations) {
        this.RuleRelations = RuleRelations;
    }

    /**
     * Get <p>Sub-node information</p> 
     * @return Children <p>Sub-node information</p>
     */
    public DspmIdentifyComplianceCategoryRelation [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>Sub-node information</p>
     * @param Children <p>Sub-node information</p>
     */
    public void setChildren(DspmIdentifyComplianceCategoryRelation [] Children) {
        this.Children = Children;
    }

    public DspmIdentifyComplianceCategoryRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyComplianceCategoryRelation(DspmIdentifyComplianceCategoryRelation source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.CategoryParentId != null) {
            this.CategoryParentId = new String(source.CategoryParentId);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.CategoryGrade != null) {
            this.CategoryGrade = new Long(source.CategoryGrade);
        }
        if (source.RuleRelations != null) {
            this.RuleRelations = new DspmIdentifyComplianceRuleRelation[source.RuleRelations.length];
            for (int i = 0; i < source.RuleRelations.length; i++) {
                this.RuleRelations[i] = new DspmIdentifyComplianceRuleRelation(source.RuleRelations[i]);
            }
        }
        if (source.Children != null) {
            this.Children = new DspmIdentifyComplianceCategoryRelation[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new DspmIdentifyComplianceCategoryRelation(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "CategoryParentId", this.CategoryParentId);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "CategoryGrade", this.CategoryGrade);
        this.setParamArrayObj(map, prefix + "RuleRelations.", this.RuleRelations);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

