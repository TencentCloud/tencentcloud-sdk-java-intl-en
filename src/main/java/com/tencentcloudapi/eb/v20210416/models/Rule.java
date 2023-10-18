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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rule extends AbstractModel {

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Modification time
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Switch
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Target overview
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Targets")
    @Expose
    private TargetBrief [] Targets;

    /**
    * DLQ rule set by the rule, which may be null
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Modification time 
     * @return ModTime Modification time
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Modification time
     * @param ModTime Modification time
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Switch 
     * @return Enable Switch
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch
     * @param Enable Switch
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Creation time 
     * @return AddTime Creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
     * @param AddTime Creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Target overview
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Targets Target overview
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TargetBrief [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Target overview
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Targets Target overview
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTargets(TargetBrief [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get DLQ rule set by the rule, which may be null
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterConfig DLQ rule set by the rule, which may be null
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set DLQ rule set by the rule, which may be null
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterConfig DLQ rule set by the rule, which may be null
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Targets != null) {
            this.Targets = new TargetBrief[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetBrief(source.Targets[i]);
            }
        }
        if (source.DeadLetterConfig != null) {
            this.DeadLetterConfig = new DeadLetterConfig(source.DeadLetterConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);

    }
}

