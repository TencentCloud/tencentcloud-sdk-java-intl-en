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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Original parameter value.
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * This modification specifies the expected parameter value.
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * Specifies the start time for backend parameter modification.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Specifies the start of effective time for the backend parameter.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * Modification status. valid values: in progress, success, paused.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Operator (normal: user sub UIN).
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Time log.
    */
    @SerializedName("EventLog")
    @Expose
    private String EventLog;

    /**
     * Get Parameter name. 
     * @return ParamName Parameter name.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
     * @param ParamName Parameter name.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Original parameter value. 
     * @return OldValue Original parameter value.
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set Original parameter value.
     * @param OldValue Original parameter value.
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get This modification specifies the expected parameter value. 
     * @return NewValue This modification specifies the expected parameter value.
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set This modification specifies the expected parameter value.
     * @param NewValue This modification specifies the expected parameter value.
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get Specifies the start time for backend parameter modification. 
     * @return ModifyTime Specifies the start time for backend parameter modification.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Specifies the start time for backend parameter modification.
     * @param ModifyTime Specifies the start time for backend parameter modification.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Specifies the start of effective time for the backend parameter. 
     * @return EffectiveTime Specifies the start of effective time for the backend parameter.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Specifies the start of effective time for the backend parameter.
     * @param EffectiveTime Specifies the start of effective time for the backend parameter.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Modification status. valid values: in progress, success, paused. 
     * @return State Modification status. valid values: in progress, success, paused.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Modification status. valid values: in progress, success, paused.
     * @param State Modification status. valid values: in progress, success, paused.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Operator (normal: user sub UIN). 
     * @return Operator Operator (normal: user sub UIN).
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator (normal: user sub UIN).
     * @param Operator Operator (normal: user sub UIN).
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Time log. 
     * @return EventLog Time log.
     */
    public String getEventLog() {
        return this.EventLog;
    }

    /**
     * Set Time log.
     * @param EventLog Time log.
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

