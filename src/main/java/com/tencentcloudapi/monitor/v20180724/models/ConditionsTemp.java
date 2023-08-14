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

public class ConditionsTemp extends AbstractModel{

    /**
    * Template name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
     * Get Template name
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return TemplateName Template name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param TemplateName Template name
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Condition Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Condition Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EventCondition Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EventCondition Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    public ConditionsTemp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConditionsTemp(ConditionsTemp source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Condition != null) {
            this.Condition = new AlarmPolicyCondition(source.Condition);
        }
        if (source.EventCondition != null) {
            this.EventCondition = new AlarmPolicyEventCondition(source.EventCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);

    }
}

