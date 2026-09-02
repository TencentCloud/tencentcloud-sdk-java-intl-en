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

public class ScoreRuleItem extends AbstractModel {

    /**
    * <p>Rule type<br>Enumeration value:<br>dimension: dimensional rule<br>category: category-level rule<br>severity: severity-level rule</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>Dimension ID</p>
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * <p>Dimension name</p>
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
    * <p>Sub-item ID.</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Sub-item point deduction rule description</p>
    */
    @SerializedName("CategoryDesc")
    @Expose
    private String CategoryDesc;

    /**
    * <p>Sub-item name.</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>Severity<br>Enumeration values:<br>critical: Critical<br>high: High risk<br>medium: Medium risk<br>low: Low risk</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>Deduction limit</p>
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * <p>Points deducted per time.</p>
    */
    @SerializedName("DeductPerItem")
    @Expose
    private Long DeductPerItem;

    /**
    * <p>Whether individual deduction is non-editable (true for sub-items under Protection Configuration Dimension)</p>
    */
    @SerializedName("DeductPerItemDisabled")
    @Expose
    private Boolean DeductPerItemDisabled;

    /**
    * <p>Sorting serial number</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private Long SortOrder;

    /**
     * Get <p>Rule type<br>Enumeration value:<br>dimension: dimensional rule<br>category: category-level rule<br>severity: severity-level rule</p> 
     * @return RuleType <p>Rule type<br>Enumeration value:<br>dimension: dimensional rule<br>category: category-level rule<br>severity: severity-level rule</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Rule type<br>Enumeration value:<br>dimension: dimensional rule<br>category: category-level rule<br>severity: severity-level rule</p>
     * @param RuleType <p>Rule type<br>Enumeration value:<br>dimension: dimensional rule<br>category: category-level rule<br>severity: severity-level rule</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Dimension ID</p> 
     * @return DimensionId <p>Dimension ID</p>
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set <p>Dimension ID</p>
     * @param DimensionId <p>Dimension ID</p>
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get <p>Dimension name</p> 
     * @return DimensionName <p>Dimension name</p>
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set <p>Dimension name</p>
     * @param DimensionName <p>Dimension name</p>
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    /**
     * Get <p>Sub-item ID.</p> 
     * @return CategoryId <p>Sub-item ID.</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Sub-item ID.</p>
     * @param CategoryId <p>Sub-item ID.</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Sub-item point deduction rule description</p> 
     * @return CategoryDesc <p>Sub-item point deduction rule description</p>
     */
    public String getCategoryDesc() {
        return this.CategoryDesc;
    }

    /**
     * Set <p>Sub-item point deduction rule description</p>
     * @param CategoryDesc <p>Sub-item point deduction rule description</p>
     */
    public void setCategoryDesc(String CategoryDesc) {
        this.CategoryDesc = CategoryDesc;
    }

    /**
     * Get <p>Sub-item name.</p> 
     * @return CategoryName <p>Sub-item name.</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>Sub-item name.</p>
     * @param CategoryName <p>Sub-item name.</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>Severity<br>Enumeration values:<br>critical: Critical<br>high: High risk<br>medium: Medium risk<br>low: Low risk</p> 
     * @return Severity <p>Severity<br>Enumeration values:<br>critical: Critical<br>high: High risk<br>medium: Medium risk<br>low: Low risk</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>Severity<br>Enumeration values:<br>critical: Critical<br>high: High risk<br>medium: Medium risk<br>low: Low risk</p>
     * @param Severity <p>Severity<br>Enumeration values:<br>critical: Critical<br>high: High risk<br>medium: Medium risk<br>low: Low risk</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>Deduction limit</p> 
     * @return MaxDeductScore <p>Deduction limit</p>
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set <p>Deduction limit</p>
     * @param MaxDeductScore <p>Deduction limit</p>
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get <p>Points deducted per time.</p> 
     * @return DeductPerItem <p>Points deducted per time.</p>
     */
    public Long getDeductPerItem() {
        return this.DeductPerItem;
    }

    /**
     * Set <p>Points deducted per time.</p>
     * @param DeductPerItem <p>Points deducted per time.</p>
     */
    public void setDeductPerItem(Long DeductPerItem) {
        this.DeductPerItem = DeductPerItem;
    }

    /**
     * Get <p>Whether individual deduction is non-editable (true for sub-items under Protection Configuration Dimension)</p> 
     * @return DeductPerItemDisabled <p>Whether individual deduction is non-editable (true for sub-items under Protection Configuration Dimension)</p>
     */
    public Boolean getDeductPerItemDisabled() {
        return this.DeductPerItemDisabled;
    }

    /**
     * Set <p>Whether individual deduction is non-editable (true for sub-items under Protection Configuration Dimension)</p>
     * @param DeductPerItemDisabled <p>Whether individual deduction is non-editable (true for sub-items under Protection Configuration Dimension)</p>
     */
    public void setDeductPerItemDisabled(Boolean DeductPerItemDisabled) {
        this.DeductPerItemDisabled = DeductPerItemDisabled;
    }

    /**
     * Get <p>Sorting serial number</p> 
     * @return SortOrder <p>Sorting serial number</p>
     */
    public Long getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>Sorting serial number</p>
     * @param SortOrder <p>Sorting serial number</p>
     */
    public void setSortOrder(Long SortOrder) {
        this.SortOrder = SortOrder;
    }

    public ScoreRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreRuleItem(ScoreRuleItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryDesc != null) {
            this.CategoryDesc = new String(source.CategoryDesc);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductPerItem != null) {
            this.DeductPerItem = new Long(source.DeductPerItem);
        }
        if (source.DeductPerItemDisabled != null) {
            this.DeductPerItemDisabled = new Boolean(source.DeductPerItemDisabled);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new Long(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryDesc", this.CategoryDesc);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductPerItem", this.DeductPerItem);
        this.setParamSimple(map, prefix + "DeductPerItemDisabled", this.DeductPerItemDisabled);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

