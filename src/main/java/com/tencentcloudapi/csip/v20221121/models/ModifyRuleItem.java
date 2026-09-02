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

public class ModifyRuleItem extends AbstractModel {

    /**
    * Rule type
Enumeration values:
Dimension: dimension-level rule
category: Subitem-level rule
Severity: severity-level rule
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Dimension ID
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * Sub-item ID, category, and severity level are required.
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * severity level. Required.
Enumeration values:
critical: severe
High: high risk
Medium: medium-risk
low: low-risk
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * Deduction limit
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * Points deducted per time.
    */
    @SerializedName("DeductPerItem")
    @Expose
    private Long DeductPerItem;

    /**
     * Get Rule type
Enumeration values:
Dimension: dimension-level rule
category: Subitem-level rule
Severity: severity-level rule 
     * @return RuleType Rule type
Enumeration values:
Dimension: dimension-level rule
category: Subitem-level rule
Severity: severity-level rule
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type
Enumeration values:
Dimension: dimension-level rule
category: Subitem-level rule
Severity: severity-level rule
     * @param RuleType Rule type
Enumeration values:
Dimension: dimension-level rule
category: Subitem-level rule
Severity: severity-level rule
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Dimension ID 
     * @return DimensionId Dimension ID
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set Dimension ID
     * @param DimensionId Dimension ID
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get Sub-item ID, category, and severity level are required. 
     * @return CategoryId Sub-item ID, category, and severity level are required.
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Sub-item ID, category, and severity level are required.
     * @param CategoryId Sub-item ID, category, and severity level are required.
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get severity level. Required.
Enumeration values:
critical: severe
High: high risk
Medium: medium-risk
low: low-risk 
     * @return Severity severity level. Required.
Enumeration values:
critical: severe
High: high risk
Medium: medium-risk
low: low-risk
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set severity level. Required.
Enumeration values:
critical: severe
High: high risk
Medium: medium-risk
low: low-risk
     * @param Severity severity level. Required.
Enumeration values:
critical: severe
High: high risk
Medium: medium-risk
low: low-risk
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get Deduction limit 
     * @return MaxDeductScore Deduction limit
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set Deduction limit
     * @param MaxDeductScore Deduction limit
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get Points deducted per time. 
     * @return DeductPerItem Points deducted per time.
     */
    public Long getDeductPerItem() {
        return this.DeductPerItem;
    }

    /**
     * Set Points deducted per time.
     * @param DeductPerItem Points deducted per time.
     */
    public void setDeductPerItem(Long DeductPerItem) {
        this.DeductPerItem = DeductPerItem;
    }

    public ModifyRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleItem(ModifyRuleItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductPerItem", this.DeductPerItem);

    }
}

