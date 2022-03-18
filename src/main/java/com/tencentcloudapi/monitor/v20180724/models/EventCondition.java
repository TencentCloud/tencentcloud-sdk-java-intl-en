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

public class EventCondition extends AbstractModel{

    /**
    * Alarm notification frequency.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmNotifyPeriod")
    @Expose
    private String AlarmNotifyPeriod;

    /**
    * Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmNotifyType")
    @Expose
    private String AlarmNotifyType;

    /**
    * Event ID.
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * Displayed event name.
    */
    @SerializedName("EventDisplayName")
    @Expose
    private String EventDisplayName;

    /**
    * Rule ID.
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
     * Get Alarm notification frequency.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AlarmNotifyPeriod Alarm notification frequency.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAlarmNotifyPeriod() {
        return this.AlarmNotifyPeriod;
    }

    /**
     * Set Alarm notification frequency.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AlarmNotifyPeriod Alarm notification frequency.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlarmNotifyPeriod(String AlarmNotifyPeriod) {
        this.AlarmNotifyPeriod = AlarmNotifyPeriod;
    }

    /**
     * Get Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AlarmNotifyType Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAlarmNotifyType() {
        return this.AlarmNotifyType;
    }

    /**
     * Set Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AlarmNotifyType Predefined repeated notification policy. `0`: One-time alarm; `1`: exponential alarm; `2`: consecutive alarm
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlarmNotifyType(String AlarmNotifyType) {
        this.AlarmNotifyType = AlarmNotifyType;
    }

    /**
     * Get Event ID. 
     * @return EventID Event ID.
     */
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set Event ID.
     * @param EventID Event ID.
     */
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get Displayed event name. 
     * @return EventDisplayName Displayed event name.
     */
    public String getEventDisplayName() {
        return this.EventDisplayName;
    }

    /**
     * Set Displayed event name.
     * @param EventDisplayName Displayed event name.
     */
    public void setEventDisplayName(String EventDisplayName) {
        this.EventDisplayName = EventDisplayName;
    }

    /**
     * Get Rule ID. 
     * @return RuleID Rule ID.
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID.
     * @param RuleID Rule ID.
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    public EventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCondition(EventCondition source) {
        if (source.AlarmNotifyPeriod != null) {
            this.AlarmNotifyPeriod = new String(source.AlarmNotifyPeriod);
        }
        if (source.AlarmNotifyType != null) {
            this.AlarmNotifyType = new String(source.AlarmNotifyType);
        }
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.EventDisplayName != null) {
            this.EventDisplayName = new String(source.EventDisplayName);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNotifyPeriod", this.AlarmNotifyPeriod);
        this.setParamSimple(map, prefix + "AlarmNotifyType", this.AlarmNotifyType);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "EventDisplayName", this.EventDisplayName);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);

    }
}

