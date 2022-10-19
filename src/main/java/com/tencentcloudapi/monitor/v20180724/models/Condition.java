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

public class Condition extends AbstractModel{

    /**
    * Alarm notification frequency.
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm.
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * Detection method.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * Detection value.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * Duration in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContinueTime")
    @Expose
    private String ContinueTime;

    /**
    * Metric ID.
    */
    @SerializedName("MetricID")
    @Expose
    private Long MetricID;

    /**
    * Displayed metric name.
    */
    @SerializedName("MetricDisplayName")
    @Expose
    private String MetricDisplayName;

    /**
    * Statistical period.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Rule ID.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Metric unit.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Whether it is an advanced metric. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * Whether the advance metric feature is enabled. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * Product ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * Get Alarm notification frequency. 
     * @return AlarmNotifyPeriod Alarm notification frequency.
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set Alarm notification frequency.
     * @param AlarmNotifyPeriod Alarm notification frequency.
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm. 
     * @return AlarmNotifyType Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm.
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm.
     * @param AlarmNotifyType Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm.
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get Detection method.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CalcType Detection method.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set Detection method.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CalcType Detection method.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get Detection value.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CalcValue Detection value.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set Detection value.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CalcValue Detection value.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get Duration in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContinueTime Duration in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set Duration in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContinueTime Duration in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContinueTime(String ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Get Metric ID. 
     * @return MetricID Metric ID.
     */
    public Long getMetricID() {
        return this.MetricID;
    }

    /**
     * Set Metric ID.
     * @param MetricID Metric ID.
     */
    public void setMetricID(Long MetricID) {
        this.MetricID = MetricID;
    }

    /**
     * Get Displayed metric name. 
     * @return MetricDisplayName Displayed metric name.
     */
    public String getMetricDisplayName() {
        return this.MetricDisplayName;
    }

    /**
     * Set Displayed metric name.
     * @param MetricDisplayName Displayed metric name.
     */
    public void setMetricDisplayName(String MetricDisplayName) {
        this.MetricDisplayName = MetricDisplayName;
    }

    /**
     * Get Statistical period. 
     * @return Period Statistical period.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period.
     * @param Period Statistical period.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Rule ID. 
     * @return RuleID Rule ID.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID.
     * @param RuleID Rule ID.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Metric unit. 
     * @return Unit Metric unit.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Metric unit.
     * @param Unit Metric unit.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Whether it is an advanced metric. Valid values: `0` (no), `1` (yes). 
     * @return IsAdvanced Whether it is an advanced metric. Valid values: `0` (no), `1` (yes).
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set Whether it is an advanced metric. Valid values: `0` (no), `1` (yes).
     * @param IsAdvanced Whether it is an advanced metric. Valid values: `0` (no), `1` (yes).
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get Whether the advance metric feature is enabled. Valid values: `0` (no), `1` (yes). 
     * @return IsOpen Whether the advance metric feature is enabled. Valid values: `0` (no), `1` (yes).
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set Whether the advance metric feature is enabled. Valid values: `0` (no), `1` (yes).
     * @param IsOpen Whether the advance metric feature is enabled. Valid values: `0` (no), `1` (yes).
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get Product ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductId Product ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductId Product ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public Condition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Condition(Condition source) {
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.CalcType != null) {
            this.CalcType = new String(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new String(source.CalcValue);
        }
        if (source.ContinueTime != null) {
            this.ContinueTime = new String(source.ContinueTime);
        }
        if (source.MetricID != null) {
            this.MetricID = new Long(source.MetricID);
        }
        if (source.MetricDisplayName != null) {
            this.MetricDisplayName = new String(source.MetricDisplayName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.IsAdvanced != null) {
            this.IsAdvanced = new Long(source.IsAdvanced);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Long(source.IsOpen);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "ContinueTime", this.ContinueTime);
        this.setParamSimple(map, prefix + "MetricID", this.MetricID);
        this.setParamSimple(map, prefix + "MetricDisplayName", this.MetricDisplayName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "IsAdvanced", this.IsAdvanced);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

