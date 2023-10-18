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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyGroupEventCondition extends AbstractModel {

    /**
    * Alarm event ID.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

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
    * If a metric is created based on a template, the `RuleId` of the metric in the template must be passed in.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Alarm event ID. 
     * @return EventId Alarm event ID.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Alarm event ID.
     * @param EventId Alarm event ID.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
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

    public CreatePolicyGroupEventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyGroupEventCondition(CreatePolicyGroupEventCondition source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new Long(source.AlarmNotifyType);
        }
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new Long(source.AlarmNotifyPeriod);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

