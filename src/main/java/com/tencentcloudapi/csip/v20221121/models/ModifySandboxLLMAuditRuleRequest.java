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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySandboxLLMAuditRuleRequest extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Rule name
Input parameter limit: length 1-128
Default value: no modification if not passed
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: medium-risk
HIGH: high risk
CRITICAL: Critical
Default value: no modification if not passed
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Referenced LLM audit system rule ID list (string)
Input parameter limit: if not passed, it means no modification; if passed, it overwrites all values, length 1-1000; each element length 1-128.
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private String [] SystemRuleIDList;

    /**
    * Effective scope
Default value: no modification if not passed
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
Default value: no modification if not passed
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: no modification if not passed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Rule ID 
     * @return ID Rule ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Rule ID
     * @param ID Rule ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Rule name
Input parameter limit: length 1-128
Default value: no modification if not passed 
     * @return RuleName Rule name
Input parameter limit: length 1-128
Default value: no modification if not passed
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
Input parameter limit: length 1-128
Default value: no modification if not passed
     * @param RuleName Rule name
Input parameter limit: length 1-128
Default value: no modification if not passed
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: medium-risk
HIGH: high risk
CRITICAL: Critical
Default value: no modification if not passed 
     * @return Level Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: medium-risk
HIGH: high risk
CRITICAL: Critical
Default value: no modification if not passed
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: medium-risk
HIGH: high risk
CRITICAL: Critical
Default value: no modification if not passed
     * @param Level Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: medium-risk
HIGH: high risk
CRITICAL: Critical
Default value: no modification if not passed
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Referenced LLM audit system rule ID list (string)
Input parameter limit: if not passed, it means no modification; if passed, it overwrites all values, length 1-1000; each element length 1-128. 
     * @return SystemRuleIDList Referenced LLM audit system rule ID list (string)
Input parameter limit: if not passed, it means no modification; if passed, it overwrites all values, length 1-1000; each element length 1-128.
     */
    public String [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set Referenced LLM audit system rule ID list (string)
Input parameter limit: if not passed, it means no modification; if passed, it overwrites all values, length 1-1000; each element length 1-128.
     * @param SystemRuleIDList Referenced LLM audit system rule ID list (string)
Input parameter limit: if not passed, it means no modification; if passed, it overwrites all values, length 1-1000; each element length 1-128.
     */
    public void setSystemRuleIDList(String [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get Effective scope
Default value: no modification if not passed 
     * @return EffectScope Effective scope
Default value: no modification if not passed
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Effective scope
Default value: no modification if not passed
     * @param EffectScope Effective scope
Default value: no modification if not passed
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
Default value: no modification if not passed 
     * @return RuleAction Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
Default value: no modification if not passed
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
Default value: no modification if not passed
     * @param RuleAction Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
Default value: no modification if not passed
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: no modification if not passed 
     * @return Status Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: no modification if not passed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: no modification if not passed
     * @param Status Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: no modification if not passed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxLLMAuditRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxLLMAuditRuleRequest(ModifySandboxLLMAuditRuleRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.SystemRuleIDList != null) {
            this.SystemRuleIDList = new String[source.SystemRuleIDList.length];
            for (int i = 0; i < source.SystemRuleIDList.length; i++) {
                this.SystemRuleIDList[i] = new String(source.SystemRuleIDList[i]);
            }
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

