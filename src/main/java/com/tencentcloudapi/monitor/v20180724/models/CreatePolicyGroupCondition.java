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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyGroupCondition extends AbstractModel {

    /**
    * Metric ID.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

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
    * Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. This parameter is optional if a default comparative type is configured for the metric.
    */
    @SerializedName("CalcType")
    @Expose
    private Long CalcType;

    /**
    * Comparative value. This parameter is optional if the metric has no requirement.
    */
    @SerializedName("CalcValue")
    @Expose
    private Float CalcValue;

    /**
    * Data aggregation period in seconds. This parameter is optional if the metric has a default value.
    */
    @SerializedName("CalcPeriod")
    @Expose
    private Long CalcPeriod;

    /**
    * Number of consecutive periods after which an alarm will be triggered.
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

    /**
    * If a metric is created based on a template, the `RuleId` of the metric in the template must be passed in.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

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
     * Get Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. This parameter is optional if a default comparative type is configured for the metric. 
     * @return CalcType Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. This parameter is optional if a default comparative type is configured for the metric.
     */
    public Long getCalcType() {
        return this.CalcType;
    }

    /**
     * Set Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. This parameter is optional if a default comparative type is configured for the metric.
     * @param CalcType Comparative type. The value 1 indicates greater than. The value 2 indicates greater than or equal to. The value 3 indicates smaller than. The value 4 indicates smaller than or equal to. The value 5 indicates equal to. The value 6 indicates not equal to. This parameter is optional if a default comparative type is configured for the metric.
     */
    public void setCalcType(Long CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get Comparative value. This parameter is optional if the metric has no requirement. 
     * @return CalcValue Comparative value. This parameter is optional if the metric has no requirement.
     */
    public Float getCalcValue() {
        return this.CalcValue;
    }

    /**
     * Set Comparative value. This parameter is optional if the metric has no requirement.
     * @param CalcValue Comparative value. This parameter is optional if the metric has no requirement.
     */
    public void setCalcValue(Float CalcValue) {
        this.CalcValue = CalcValue;
    }

    /**
     * Get Data aggregation period in seconds. This parameter is optional if the metric has a default value. 
     * @return CalcPeriod Data aggregation period in seconds. This parameter is optional if the metric has a default value.
     */
    public Long getCalcPeriod() {
        return this.CalcPeriod;
    }

    /**
     * Set Data aggregation period in seconds. This parameter is optional if the metric has a default value.
     * @param CalcPeriod Data aggregation period in seconds. This parameter is optional if the metric has a default value.
     */
    public void setCalcPeriod(Long CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    /**
     * Get Number of consecutive periods after which an alarm will be triggered. 
     * @return ContinuePeriod Number of consecutive periods after which an alarm will be triggered.
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set Number of consecutive periods after which an alarm will be triggered.
     * @param ContinuePeriod Number of consecutive periods after which an alarm will be triggered.
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Get If a metric is created based on a template, the `RuleId` of the metric in the template must be passed in. 
     * @return RuleId If a metric is created based on a template, the `RuleId` of the metric in the template must be passed in.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set If a metric is created based on a template, the `RuleId` of the metric in the template must be passed in.
     * @param RuleId If a metric is created based on a template, the `RuleId` of the metric in the template must be passed in.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public CreatePolicyGroupCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyGroupCondition(CreatePolicyGroupCondition source) {
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.CalcType != null) {
            this.CalcType = new Long(source.CalcType);
        }
        if (source.CalcValue != null) {
            this.CalcValue = new Float(source.CalcValue);
        }
        if (source.CalcPeriod != null) {
            this.CalcPeriod = new Long(source.CalcPeriod);
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new Long(source.ContinuePeriod);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcValue", this.CalcValue);
        this.setParamSimple(map, prefix + "CalcPeriod", this.CalcPeriod);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

