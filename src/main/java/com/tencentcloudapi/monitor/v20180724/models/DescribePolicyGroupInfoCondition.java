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

public class DescribePolicyGroupInfoCondition extends AbstractModel{

    /**
    * Metric name.
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
    * Data aggregation period in seconds.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Metric ID.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * Threshold rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Metric unit.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Alarm sending and converging type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * Alarm sending period in seconds. The value <0 indicates that no alarm will be triggered. The value 0 indicates that an alarm is triggered only once. The value >0 indicates that an alarm is triggered at the interval of triggerTime.
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. The value 7 indicates day-on-day increase. The value 8 indicates day-on-day decrease. The value 9 indicates week-on-week increase. The value 10 indicates week-on-week decrease. The value 11 indicates periodical increase. The value 12 indicates periodical decrease.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CalcType")
    @Expose
    private Long CalcType;

    /**
    * Threshold.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CalcValue")
    @Expose
    private String CalcValue;

    /**
    * Duration at which an alarm will be triggered in seconds.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ContinueTime")
    @Expose
    private Long ContinueTime;

    /**
     * Get Metric name. 
     * @return MetricShowName Metric name.
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set Metric name.
     * @param MetricShowName Metric name.
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    /**
     * Get Data aggregation period in seconds. 
     * @return Period Data aggregation period in seconds.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Data aggregation period in seconds.
     * @param Period Data aggregation period in seconds.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Metric ID. 
     * @return MetricId Metric ID.
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set Metric ID.
     * @param MetricId Metric ID.
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get Threshold rule ID. 
     * @return RuleId Threshold rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Threshold rule ID.
     * @param RuleId Threshold rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get Alarm sending and converging type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially. 
     * @return AlarmNotifyType Alarm sending and converging type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set Alarm sending and converging type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
     * @param AlarmNotifyType Alarm sending and converging type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get Alarm sending period in seconds. The value <0 indicates that no alarm will be triggered. The value 0 indicates that an alarm is triggered only once. The value >0 indicates that an alarm is triggered at the interval of triggerTime. 
     * @return AlarmNotifyPeriod Alarm sending period in seconds. The value <0 indicates that no alarm will be triggered. The value 0 indicates that an alarm is triggered only once. The value >0 indicates that an alarm is triggered at the interval of triggerTime.
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set Alarm sending period in seconds. The value <0 indicates that no alarm will be triggered. The value 0 indicates that an alarm is triggered only once. The value >0 indicates that an alarm is triggered at the interval of triggerTime.
     * @param AlarmNotifyPeriod Alarm sending period in seconds. The value <0 indicates that no alarm will be triggered. The value 0 indicates that an alarm is triggered only once. The value >0 indicates that an alarm is triggered at the interval of triggerTime.
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. The value 7 indicates day-on-day increase. The value 8 indicates day-on-day decrease. The value 9 indicates week-on-week increase. The value 10 indicates week-on-week decrease. The value 11 indicates periodical increase. The value 12 indicates periodical decrease.
Note: This field may return null, indicating that no valid value was found. 
     * @return CalcType Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. The value 7 indicates day-on-day increase. The value 8 indicates day-on-day decrease. The value 9 indicates week-on-week increase. The value 10 indicates week-on-week decrease. The value 11 indicates periodical increase. The value 12 indicates periodical decrease.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getCalcType() {
        return this.CalcType;
    }

    /**
     * Set Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. The value 7 indicates day-on-day increase. The value 8 indicates day-on-day decrease. The value 9 indicates week-on-week increase. The value 10 indicates week-on-week decrease. The value 11 indicates periodical increase. The value 12 indicates periodical decrease.
Note: This field may return null, indicating that no valid value was found.
     * @param CalcType Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. The value 7 indicates day-on-day increase. The value 8 indicates day-on-day decrease. The value 9 indicates week-on-week increase. The value 10 indicates week-on-week decrease. The value 11 indicates periodical increase. The value 12 indicates periodical decrease.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCalcType(Long CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get Threshold.
Note: This field may return null, indicating that no valid value was found. 
     * @return CalcValue Threshold.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set Threshold.
Note: This field may return null, indicating that no valid value was found.
     * @param CalcValue Threshold.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCalcValue(String CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get Duration at which an alarm will be triggered in seconds.
Note: This field may return null, indicating that no valid value was found. 
     * @return ContinueTime Duration at which an alarm will be triggered in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getContinueTime() {
        return this.ContinueTime;
    }

    /**
     * Set Duration at which an alarm will be triggered in seconds.
Note: This field may return null, indicating that no valid value was found.
     * @param ContinueTime Duration at which an alarm will be triggered in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setContinueTime(Long ContinueTime) {
        this.ContinueTime = ContinueTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricShowName", this.MetricShowName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "ContinueTime", this.ContinueTime);

    }
}

