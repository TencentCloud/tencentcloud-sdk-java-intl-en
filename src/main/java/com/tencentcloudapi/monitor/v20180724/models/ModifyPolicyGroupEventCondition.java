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

public class ModifyPolicyGroupEventCondition extends AbstractModel {

    /**
    * Event ID.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Alarm sending and convergence type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private Long AlarmNotifyType;

    /**
    * Alarm sending period in seconds. If the value is less than 0, no alarm will be triggered. If the value is 0, an alarm will be triggered only once. If the value is greater than 0, an alarm will be triggered at the interval of triggerTime.
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private Long AlarmNotifyPeriod;

    /**
    * Rule ID. No filling means new addition while filling in ruleId means to modify existing rules.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Event ID. 
     * @return EventId Event ID.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID.
     * @param EventId Event ID.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Alarm sending and convergence type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially. 
     * @return AlarmNotifyType Alarm sending and convergence type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
     */
    public Long getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set Alarm sending and convergence type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
     * @param AlarmNotifyType Alarm sending and convergence type. The value 0 indicates that alarms are sent consecutively. The value 1 indicates that alarms are sent exponentially.
     */
    public void setAlarmNotifyType(Long AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get Alarm sending period in seconds. If the value is less than 0, no alarm will be triggered. If the value is 0, an alarm will be triggered only once. If the value is greater than 0, an alarm will be triggered at the interval of triggerTime. 
     * @return AlarmNotifyPeriod Alarm sending period in seconds. If the value is less than 0, no alarm will be triggered. If the value is 0, an alarm will be triggered only once. If the value is greater than 0, an alarm will be triggered at the interval of triggerTime.
     */
    public Long getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set Alarm sending period in seconds. If the value is less than 0, no alarm will be triggered. If the value is 0, an alarm will be triggered only once. If the value is greater than 0, an alarm will be triggered at the interval of triggerTime.
     * @param AlarmNotifyPeriod Alarm sending period in seconds. If the value is less than 0, no alarm will be triggered. If the value is 0, an alarm will be triggered only once. If the value is greater than 0, an alarm will be triggered at the interval of triggerTime.
     */
    public void setAlarmNotifyPeriod(Long AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get Rule ID. No filling means new addition while filling in ruleId means to modify existing rules. 
     * @return RuleId Rule ID. No filling means new addition while filling in ruleId means to modify existing rules.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID. No filling means new addition while filling in ruleId means to modify existing rules.
     * @param RuleId Rule ID. No filling means new addition while filling in ruleId means to modify existing rules.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public ModifyPolicyGroupEventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPolicyGroupEventCondition(ModifyPolicyGroupEventCondition source) {
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

