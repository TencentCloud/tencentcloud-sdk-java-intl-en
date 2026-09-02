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

public class CategoryItem extends AbstractModel {

    /**
    * <p>Sub-item ID<br>Enumeration values:<br>vulnerability: Vulnerability governance<br>cloud_config: Cloud product configuration governance<br>system_baseline: System baseline risk<br>intrusion_alert: Intrusion threat alarm<br>cloud_api_alert: Cloud API alarm<br>ai_agent_alert: AI Agent security alarm<br>object_storage_alert: Object storage exception alarm<br>database_alert: Database security alarm<br>protection_config: Recommended protection configuration not enabled<br>edition_coverage: Insufficient Pro/Ultimate edition coverage<br>product_expiry: Product expires within 7 days</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Sub-item name</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>Subclass description</p>
    */
    @SerializedName("CategoryDesc")
    @Expose
    private String CategoryDesc;

    /**
    * <p>Sub-item deduction limit</p>
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * <p>Actual point deduction for sub-items</p>
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
    * <p>Total number of risks</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Level details, sub-items of risk/threat type have values</p>
    */
    @SerializedName("SeverityItems")
    @Expose
    private SeverityItem [] SeverityItems;

    /**
    * <p>Reason for deduction description</p>
    */
    @SerializedName("DeductReason")
    @Expose
    private String DeductReason;

    /**
    * <p>Handling suggestion copywriting</p>
    */
    @SerializedName("ActionText")
    @Expose
    private String ActionText;

    /**
    * <p>Protection configuration detail, returned only for protection configuration dimension sub-items</p>
    */
    @SerializedName("ProtectionDetail")
    @Expose
    private ProtectionDetail ProtectionDetail;

    /**
     * Get <p>Sub-item ID<br>Enumeration values:<br>vulnerability: Vulnerability governance<br>cloud_config: Cloud product configuration governance<br>system_baseline: System baseline risk<br>intrusion_alert: Intrusion threat alarm<br>cloud_api_alert: Cloud API alarm<br>ai_agent_alert: AI Agent security alarm<br>object_storage_alert: Object storage exception alarm<br>database_alert: Database security alarm<br>protection_config: Recommended protection configuration not enabled<br>edition_coverage: Insufficient Pro/Ultimate edition coverage<br>product_expiry: Product expires within 7 days</p> 
     * @return CategoryId <p>Sub-item ID<br>Enumeration values:<br>vulnerability: Vulnerability governance<br>cloud_config: Cloud product configuration governance<br>system_baseline: System baseline risk<br>intrusion_alert: Intrusion threat alarm<br>cloud_api_alert: Cloud API alarm<br>ai_agent_alert: AI Agent security alarm<br>object_storage_alert: Object storage exception alarm<br>database_alert: Database security alarm<br>protection_config: Recommended protection configuration not enabled<br>edition_coverage: Insufficient Pro/Ultimate edition coverage<br>product_expiry: Product expires within 7 days</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Sub-item ID<br>Enumeration values:<br>vulnerability: Vulnerability governance<br>cloud_config: Cloud product configuration governance<br>system_baseline: System baseline risk<br>intrusion_alert: Intrusion threat alarm<br>cloud_api_alert: Cloud API alarm<br>ai_agent_alert: AI Agent security alarm<br>object_storage_alert: Object storage exception alarm<br>database_alert: Database security alarm<br>protection_config: Recommended protection configuration not enabled<br>edition_coverage: Insufficient Pro/Ultimate edition coverage<br>product_expiry: Product expires within 7 days</p>
     * @param CategoryId <p>Sub-item ID<br>Enumeration values:<br>vulnerability: Vulnerability governance<br>cloud_config: Cloud product configuration governance<br>system_baseline: System baseline risk<br>intrusion_alert: Intrusion threat alarm<br>cloud_api_alert: Cloud API alarm<br>ai_agent_alert: AI Agent security alarm<br>object_storage_alert: Object storage exception alarm<br>database_alert: Database security alarm<br>protection_config: Recommended protection configuration not enabled<br>edition_coverage: Insufficient Pro/Ultimate edition coverage<br>product_expiry: Product expires within 7 days</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Sub-item name</p> 
     * @return CategoryName <p>Sub-item name</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>Sub-item name</p>
     * @param CategoryName <p>Sub-item name</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>Subclass description</p> 
     * @return CategoryDesc <p>Subclass description</p>
     */
    public String getCategoryDesc() {
        return this.CategoryDesc;
    }

    /**
     * Set <p>Subclass description</p>
     * @param CategoryDesc <p>Subclass description</p>
     */
    public void setCategoryDesc(String CategoryDesc) {
        this.CategoryDesc = CategoryDesc;
    }

    /**
     * Get <p>Sub-item deduction limit</p> 
     * @return MaxDeductScore <p>Sub-item deduction limit</p>
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set <p>Sub-item deduction limit</p>
     * @param MaxDeductScore <p>Sub-item deduction limit</p>
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get <p>Actual point deduction for sub-items</p> 
     * @return DeductScore <p>Actual point deduction for sub-items</p>
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set <p>Actual point deduction for sub-items</p>
     * @param DeductScore <p>Actual point deduction for sub-items</p>
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    /**
     * Get <p>Total number of risks</p> 
     * @return RiskCount <p>Total number of risks</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Total number of risks</p>
     * @param RiskCount <p>Total number of risks</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Level details, sub-items of risk/threat type have values</p> 
     * @return SeverityItems <p>Level details, sub-items of risk/threat type have values</p>
     */
    public SeverityItem [] getSeverityItems() {
        return this.SeverityItems;
    }

    /**
     * Set <p>Level details, sub-items of risk/threat type have values</p>
     * @param SeverityItems <p>Level details, sub-items of risk/threat type have values</p>
     */
    public void setSeverityItems(SeverityItem [] SeverityItems) {
        this.SeverityItems = SeverityItems;
    }

    /**
     * Get <p>Reason for deduction description</p> 
     * @return DeductReason <p>Reason for deduction description</p>
     */
    public String getDeductReason() {
        return this.DeductReason;
    }

    /**
     * Set <p>Reason for deduction description</p>
     * @param DeductReason <p>Reason for deduction description</p>
     */
    public void setDeductReason(String DeductReason) {
        this.DeductReason = DeductReason;
    }

    /**
     * Get <p>Handling suggestion copywriting</p> 
     * @return ActionText <p>Handling suggestion copywriting</p>
     */
    public String getActionText() {
        return this.ActionText;
    }

    /**
     * Set <p>Handling suggestion copywriting</p>
     * @param ActionText <p>Handling suggestion copywriting</p>
     */
    public void setActionText(String ActionText) {
        this.ActionText = ActionText;
    }

    /**
     * Get <p>Protection configuration detail, returned only for protection configuration dimension sub-items</p> 
     * @return ProtectionDetail <p>Protection configuration detail, returned only for protection configuration dimension sub-items</p>
     */
    public ProtectionDetail getProtectionDetail() {
        return this.ProtectionDetail;
    }

    /**
     * Set <p>Protection configuration detail, returned only for protection configuration dimension sub-items</p>
     * @param ProtectionDetail <p>Protection configuration detail, returned only for protection configuration dimension sub-items</p>
     */
    public void setProtectionDetail(ProtectionDetail ProtectionDetail) {
        this.ProtectionDetail = ProtectionDetail;
    }

    public CategoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryItem(CategoryItem source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.CategoryDesc != null) {
            this.CategoryDesc = new String(source.CategoryDesc);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.SeverityItems != null) {
            this.SeverityItems = new SeverityItem[source.SeverityItems.length];
            for (int i = 0; i < source.SeverityItems.length; i++) {
                this.SeverityItems[i] = new SeverityItem(source.SeverityItems[i]);
            }
        }
        if (source.DeductReason != null) {
            this.DeductReason = new String(source.DeductReason);
        }
        if (source.ActionText != null) {
            this.ActionText = new String(source.ActionText);
        }
        if (source.ProtectionDetail != null) {
            this.ProtectionDetail = new ProtectionDetail(source.ProtectionDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "CategoryDesc", this.CategoryDesc);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamArrayObj(map, prefix + "SeverityItems.", this.SeverityItems);
        this.setParamSimple(map, prefix + "DeductReason", this.DeductReason);
        this.setParamSimple(map, prefix + "ActionText", this.ActionText);
        this.setParamObj(map, prefix + "ProtectionDetail.", this.ProtectionDetail);

    }
}

