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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManual extends AbstractModel{

    /**
    * Check method.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CalcType")
    @Expose
    private DescribePolicyConditionListConfigManualCalcType CalcType;

    /**
    * Threshold.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CalcValue")
    @Expose
    private DescribePolicyConditionListConfigManualCalcValue CalcValue;

    /**
    * Duration.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ContinueTime")
    @Expose
    private DescribePolicyConditionListConfigManualContinueTime ContinueTime;

    /**
    * Data period.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Period")
    @Expose
    private DescribePolicyConditionListConfigManualPeriod Period;

    /**
    * Number of periods.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PeriodNum")
    @Expose
    private DescribePolicyConditionListConfigManualPeriodNum PeriodNum;

    /**
    * Statistics method.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("StatType")
    @Expose
    private DescribePolicyConditionListConfigManualStatType StatType;

    /**
     * Get Check method.
Note: This field may return null, indicating that no valid value was found. 
     * @return CalcType Check method.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManualCalcType getCalcType() {
        return this.CalcType;
    }

    /**
     * Set Check method.
Note: This field may return null, indicating that no valid value was found.
     * @param CalcType Check method.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCalcType(DescribePolicyConditionListConfigManualCalcType CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get Threshold.
Note: This field may return null, indicating that no valid value was found. 
     * @return CalcValue Threshold.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManualCalcValue getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set Threshold.
Note: This field may return null, indicating that no valid value was found.
     * @param CalcValue Threshold.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCalcValue(DescribePolicyConditionListConfigManualCalcValue CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get Duration.
Note: This field may return null, indicating that no valid value was found. 
     * @return ContinueTime Duration.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManualContinueTime getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set Duration.
Note: This field may return null, indicating that no valid value was found.
     * @param ContinueTime Duration.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setContinueTime(DescribePolicyConditionListConfigManualContinueTime ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Get Data period.
Note: This field may return null, indicating that no valid value was found. 
     * @return Period Data period.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManualPeriod getPeriod() {
        return this.Period;
    }

    /**
     * Set Data period.
Note: This field may return null, indicating that no valid value was found.
     * @param Period Data period.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPeriod(DescribePolicyConditionListConfigManualPeriod Period) {
        this.Period = Period;
    }

    /**
     * Get Number of periods.
Note: This field may return null, indicating that no valid value was found. 
     * @return PeriodNum Number of periods.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManualPeriodNum getPeriodNum() {
        return this.PeriodNum;
    }

    /**
     * Set Number of periods.
Note: This field may return null, indicating that no valid value was found.
     * @param PeriodNum Number of periods.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPeriodNum(DescribePolicyConditionListConfigManualPeriodNum PeriodNum) {
        this.PeriodNum = PeriodNum;
    }

    /**
     * Get Statistics method.
Note: This field may return null, indicating that no valid value was found. 
     * @return StatType Statistics method.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManualStatType getStatType() {
        return this.StatType;
    }

    /**
     * Set Statistics method.
Note: This field may return null, indicating that no valid value was found.
     * @param StatType Statistics method.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setStatType(DescribePolicyConditionListConfigManualStatType StatType) {
        this.StatType = StatType;
    }

    public DescribePolicyConditionListConfigManual() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListConfigManual(DescribePolicyConditionListConfigManual source) {
        if (source.CalcType != null) {
            this.CalcType = new DescribePolicyConditionListConfigManualCalcType(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new DescribePolicyConditionListConfigManualCalcValue(source.CalcValue);
        }
        if (source.ContinueTime != null) {
            this.ContinueTime = new DescribePolicyConditionListConfigManualContinueTime(source.ContinueTime);
        }
        if (source.Period != null) {
            this.Period = new DescribePolicyConditionListConfigManualPeriod(source.Period);
        }
        if (source.PeriodNum != null) {
            this.PeriodNum = new DescribePolicyConditionListConfigManualPeriodNum(source.PeriodNum);
        }
        if (source.StatType != null) {
            this.StatType = new DescribePolicyConditionListConfigManualStatType(source.StatType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CalcType.", this.CalcType);
        this.setParamObj(map, prefix + "CalcValue.", this.CalcValue);
        this.setParamObj(map, prefix + "ContinueTime.", this.ContinueTime);
        this.setParamObj(map, prefix + "Period.", this.Period);
        this.setParamObj(map, prefix + "PeriodNum.", this.PeriodNum);
        this.setParamObj(map, prefix + "StatType.", this.StatType);

    }
}

