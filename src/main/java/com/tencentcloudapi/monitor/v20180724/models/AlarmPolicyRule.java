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

public class AlarmPolicyRule extends AbstractModel{

    /**
    * Metric name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Statistical period in seconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Operator
intelligent = intelligent detection without threshold
eq = equal to
ge = greater than or equal to
gt = greater than
le = less than or equal to
lt = less than
ne = not equal to
day_increase = daily increase
day_decrease = daily decrease
day_wave = daily fluctuation
week_increase = weekly increase
week_decrease = weekly decrease
week_wave = weekly fluctuation
cycle_increase = periodical increase
cycle_decrease = periodical decrease
cycle_wave = periodical fluctuation
re = regex match
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Threshold
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Number of cycles for continuous notification. Valid values: 1 (1 cycle), 2 (2 cycles), and so on.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

    /**
    * Alarm interval in seconds. Valid values: 0 (do not repeat), 300 (alarm once every 5 minutes), 600 (alarm once every 10 minutes), 900 (alarm once every 15 minutes), 1800 (alarm once every 30 minutes), 3600 (alarm once every hour), 7200 (alarm once every 2 hours), 10800 (alarm once every 3 hours), 21600 (alarm once every 6 hours),  43200 (alarm once every 12 hours), 86400 (alarm once every day)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeFrequency")
    @Expose
    private Long NoticeFrequency;

    /**
    * Whether the alarm frequency increases exponentially. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPowerNotice")
    @Expose
    private Long IsPowerNotice;

    /**
    * Filter condition for one single trigger rule
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Filter")
    @Expose
    private AlarmPolicyFilter Filter;

    /**
    * Metric display name, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Unit, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic threshold)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get Metric name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetricName Metric name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetricName Metric name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Statistical period in seconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Period Statistical period in seconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period in seconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Period Statistical period in seconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Operator
intelligent = intelligent detection without threshold
eq = equal to
ge = greater than or equal to
gt = greater than
le = less than or equal to
lt = less than
ne = not equal to
day_increase = daily increase
day_decrease = daily decrease
day_wave = daily fluctuation
week_increase = weekly increase
week_decrease = weekly decrease
week_wave = weekly fluctuation
cycle_increase = periodical increase
cycle_decrease = periodical decrease
cycle_wave = periodical fluctuation
re = regex match
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Operator Operator
intelligent = intelligent detection without threshold
eq = equal to
ge = greater than or equal to
gt = greater than
le = less than or equal to
lt = less than
ne = not equal to
day_increase = daily increase
day_decrease = daily decrease
day_wave = daily fluctuation
week_increase = weekly increase
week_decrease = weekly decrease
week_wave = weekly fluctuation
cycle_increase = periodical increase
cycle_decrease = periodical decrease
cycle_wave = periodical fluctuation
re = regex match
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
intelligent = intelligent detection without threshold
eq = equal to
ge = greater than or equal to
gt = greater than
le = less than or equal to
lt = less than
ne = not equal to
day_increase = daily increase
day_decrease = daily decrease
day_wave = daily fluctuation
week_increase = weekly increase
week_decrease = weekly decrease
week_wave = weekly fluctuation
cycle_increase = periodical increase
cycle_decrease = periodical decrease
cycle_wave = periodical fluctuation
re = regex match
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Operator Operator
intelligent = intelligent detection without threshold
eq = equal to
ge = greater than or equal to
gt = greater than
le = less than or equal to
lt = less than
ne = not equal to
day_increase = daily increase
day_decrease = daily decrease
day_wave = daily fluctuation
week_increase = weekly increase
week_decrease = weekly decrease
week_wave = weekly fluctuation
cycle_increase = periodical increase
cycle_decrease = periodical decrease
cycle_wave = periodical fluctuation
re = regex match
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Threshold
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Value Threshold
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Threshold
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Value Threshold
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Number of cycles for continuous notification. Valid values: 1 (1 cycle), 2 (2 cycles), and so on.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContinuePeriod Number of cycles for continuous notification. Valid values: 1 (1 cycle), 2 (2 cycles), and so on.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set Number of cycles for continuous notification. Valid values: 1 (1 cycle), 2 (2 cycles), and so on.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContinuePeriod Number of cycles for continuous notification. Valid values: 1 (1 cycle), 2 (2 cycles), and so on.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Get Alarm interval in seconds. Valid values: 0 (do not repeat), 300 (alarm once every 5 minutes), 600 (alarm once every 10 minutes), 900 (alarm once every 15 minutes), 1800 (alarm once every 30 minutes), 3600 (alarm once every hour), 7200 (alarm once every 2 hours), 10800 (alarm once every 3 hours), 21600 (alarm once every 6 hours),  43200 (alarm once every 12 hours), 86400 (alarm once every day)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NoticeFrequency Alarm interval in seconds. Valid values: 0 (do not repeat), 300 (alarm once every 5 minutes), 600 (alarm once every 10 minutes), 900 (alarm once every 15 minutes), 1800 (alarm once every 30 minutes), 3600 (alarm once every hour), 7200 (alarm once every 2 hours), 10800 (alarm once every 3 hours), 21600 (alarm once every 6 hours),  43200 (alarm once every 12 hours), 86400 (alarm once every day)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNoticeFrequency() {
        return this.NoticeFrequency;
    }

    /**
     * Set Alarm interval in seconds. Valid values: 0 (do not repeat), 300 (alarm once every 5 minutes), 600 (alarm once every 10 minutes), 900 (alarm once every 15 minutes), 1800 (alarm once every 30 minutes), 3600 (alarm once every hour), 7200 (alarm once every 2 hours), 10800 (alarm once every 3 hours), 21600 (alarm once every 6 hours),  43200 (alarm once every 12 hours), 86400 (alarm once every day)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NoticeFrequency Alarm interval in seconds. Valid values: 0 (do not repeat), 300 (alarm once every 5 minutes), 600 (alarm once every 10 minutes), 900 (alarm once every 15 minutes), 1800 (alarm once every 30 minutes), 3600 (alarm once every hour), 7200 (alarm once every 2 hours), 10800 (alarm once every 3 hours), 21600 (alarm once every 6 hours),  43200 (alarm once every 12 hours), 86400 (alarm once every day)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNoticeFrequency(Long NoticeFrequency) {
        this.NoticeFrequency = NoticeFrequency;
    }

    /**
     * Get Whether the alarm frequency increases exponentially. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsPowerNotice Whether the alarm frequency increases exponentially. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsPowerNotice() {
        return this.IsPowerNotice;
    }

    /**
     * Set Whether the alarm frequency increases exponentially. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsPowerNotice Whether the alarm frequency increases exponentially. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPowerNotice(Long IsPowerNotice) {
        this.IsPowerNotice = IsPowerNotice;
    }

    /**
     * Get Filter condition for one single trigger rule
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Filter Filter condition for one single trigger rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter condition for one single trigger rule
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Filter Filter condition for one single trigger rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilter(AlarmPolicyFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Metric display name, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Metric display name, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Metric display name, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Metric display name, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Unit, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Unit Unit, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Unit Unit, which is used in the output parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic threshold)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic threshold)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic threshold)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RuleType Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic threshold)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);
        this.setParamSimple(map, prefix + "NoticeFrequency", this.NoticeFrequency);
        this.setParamSimple(map, prefix + "IsPowerNotice", this.IsPowerNotice);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

