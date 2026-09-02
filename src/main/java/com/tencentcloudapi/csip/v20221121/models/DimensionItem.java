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

public class DimensionItem extends AbstractModel {

    /**
    * Dimension ID
Enumeration value:
risk_governance: Risk Governance
threat_detection: threat detection
protection configuration
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * Dimension Name
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
    * Dimension deduction limit
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * Actual dimension deduction
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
    * List of subitems
    */
    @SerializedName("Categories")
    @Expose
    private CategoryItem [] Categories;

    /**
     * Get Dimension ID
Enumeration value:
risk_governance: Risk Governance
threat_detection: threat detection
protection configuration 
     * @return DimensionId Dimension ID
Enumeration value:
risk_governance: Risk Governance
threat_detection: threat detection
protection configuration
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set Dimension ID
Enumeration value:
risk_governance: Risk Governance
threat_detection: threat detection
protection configuration
     * @param DimensionId Dimension ID
Enumeration value:
risk_governance: Risk Governance
threat_detection: threat detection
protection configuration
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get Dimension Name 
     * @return DimensionName Dimension Name
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set Dimension Name
     * @param DimensionName Dimension Name
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    /**
     * Get Dimension deduction limit 
     * @return MaxDeductScore Dimension deduction limit
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set Dimension deduction limit
     * @param MaxDeductScore Dimension deduction limit
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get Actual dimension deduction 
     * @return DeductScore Actual dimension deduction
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set Actual dimension deduction
     * @param DeductScore Actual dimension deduction
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    /**
     * Get List of subitems 
     * @return Categories List of subitems
     */
    public CategoryItem [] getCategories() {
        return this.Categories;
    }

    /**
     * Set List of subitems
     * @param Categories List of subitems
     */
    public void setCategories(CategoryItem [] Categories) {
        this.Categories = Categories;
    }

    public DimensionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionItem(DimensionItem source) {
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
        if (source.Categories != null) {
            this.Categories = new CategoryItem[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new CategoryItem(source.Categories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);
        this.setParamArrayObj(map, prefix + "Categories.", this.Categories);

    }
}

