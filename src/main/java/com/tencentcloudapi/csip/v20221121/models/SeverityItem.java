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

public class SeverityItem extends AbstractModel {

    /**
    * Risk level
Enumeration values:
critical: severe
high: high risk
Medium: medium risk
low: low-risk
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * Risk level name in Chinese
    */
    @SerializedName("SeverityName")
    @Expose
    private String SeverityName;

    /**
    * Number of risks at this level
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * Points deducted per time.
    */
    @SerializedName("DeductPerItem")
    @Expose
    private Long DeductPerItem;

    /**
    * Severity deduction limit
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * Actual point deduction
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
     * Get Risk level
Enumeration values:
critical: severe
high: high risk
Medium: medium risk
low: low-risk 
     * @return Severity Risk level
Enumeration values:
critical: severe
high: high risk
Medium: medium risk
low: low-risk
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set Risk level
Enumeration values:
critical: severe
high: high risk
Medium: medium risk
low: low-risk
     * @param Severity Risk level
Enumeration values:
critical: severe
high: high risk
Medium: medium risk
low: low-risk
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get Risk level name in Chinese 
     * @return SeverityName Risk level name in Chinese
     */
    public String getSeverityName() {
        return this.SeverityName;
    }

    /**
     * Set Risk level name in Chinese
     * @param SeverityName Risk level name in Chinese
     */
    public void setSeverityName(String SeverityName) {
        this.SeverityName = SeverityName;
    }

    /**
     * Get Number of risks at this level 
     * @return RiskCount Number of risks at this level
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Number of risks at this level
     * @param RiskCount Number of risks at this level
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
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

    /**
     * Get Severity deduction limit 
     * @return MaxDeductScore Severity deduction limit
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set Severity deduction limit
     * @param MaxDeductScore Severity deduction limit
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get Actual point deduction 
     * @return DeductScore Actual point deduction
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set Actual point deduction
     * @param DeductScore Actual point deduction
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    public SeverityItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeverityItem(SeverityItem source) {
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.SeverityName != null) {
            this.SeverityName = new String(source.SeverityName);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.DeductPerItem != null) {
            this.DeductPerItem = new Long(source.DeductPerItem);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "SeverityName", this.SeverityName);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "DeductPerItem", this.DeductPerItem);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);

    }
}

