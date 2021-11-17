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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel{

    /**
    * Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Original parameter value
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * New parameter value in this modification event
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * Start time of parameter modification
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Start time when the modified parameter takes effect
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * Modification status
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Operator (generally, the value is the UIN of a sub-user)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Event log
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EventLog")
    @Expose
    private String EventLog;

    /**
     * Get Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ParamName Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ParamName Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Original parameter value
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OldValue Original parameter value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set Original parameter value
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OldValue Original parameter value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get New parameter value in this modification event
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NewValue New parameter value in this modification event
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set New parameter value in this modification event
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NewValue New parameter value in this modification event
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get Start time of parameter modification
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ModifyTime Start time of parameter modification
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Start time of parameter modification
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ModifyTime Start time of parameter modification
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Start time when the modified parameter takes effect
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EffectiveTime Start time when the modified parameter takes effect
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Start time when the modified parameter takes effect
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EffectiveTime Start time when the modified parameter takes effect
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Modification status
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return State Modification status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Modification status
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param State Modification status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Operator (generally, the value is the UIN of a sub-user)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Operator Operator (generally, the value is the UIN of a sub-user)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator (generally, the value is the UIN of a sub-user)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Operator Operator (generally, the value is the UIN of a sub-user)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Event log
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EventLog Event log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEventLog() {
        return this.EventLog;
    }

    /**
     * Set Event log
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EventLog Event log
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEventLog(String EventLog) {
        this.EventLog = EventLog;
    }

    public EventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventInfo(EventInfo source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.EventLog != null) {
            this.EventLog = new String(source.EventLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "EventLog", this.EventLog);

    }
}

