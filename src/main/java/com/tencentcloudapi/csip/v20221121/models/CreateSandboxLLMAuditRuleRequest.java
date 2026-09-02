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

public class CreateSandboxLLMAuditRuleRequest extends AbstractModel {

    /**
    * Rule name
Input parameter limit: length 1-128
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule level
Enumeration values:
INFO: notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * Referenced LLM audit system rule ID list (string literal, provided by LLMRules[].RuleID / ToolCallRules[].RuleID returned by DescribeSandboxLLMAuditSystemRuleList)
Input parameter limit: not empty, up to 1000; each element length 1-128.
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private String [] SystemRuleIDList;

    /**
    * Effective scope
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * Initial status
Enumeration values:
ON: enabled.
OFF: disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
     * Get Rule name
Input parameter limit: length 1-128 
     * @return RuleName Rule name
Input parameter limit: length 1-128
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
Input parameter limit: length 1-128
     * @param RuleName Rule name
Input parameter limit: length 1-128
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule level
Enumeration values:
INFO: notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical 
     * @return Level Rule level
Enumeration values:
INFO: notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Rule level
Enumeration values:
INFO: notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
     * @param Level Rule level
Enumeration values:
INFO: notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container 
     * @return BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
     * @param BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get Referenced LLM audit system rule ID list (string literal, provided by LLMRules[].RuleID / ToolCallRules[].RuleID returned by DescribeSandboxLLMAuditSystemRuleList)
Input parameter limit: not empty, up to 1000; each element length 1-128. 
     * @return SystemRuleIDList Referenced LLM audit system rule ID list (string literal, provided by LLMRules[].RuleID / ToolCallRules[].RuleID returned by DescribeSandboxLLMAuditSystemRuleList)
Input parameter limit: not empty, up to 1000; each element length 1-128.
     */
    public String [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set Referenced LLM audit system rule ID list (string literal, provided by LLMRules[].RuleID / ToolCallRules[].RuleID returned by DescribeSandboxLLMAuditSystemRuleList)
Input parameter limit: not empty, up to 1000; each element length 1-128.
     * @param SystemRuleIDList Referenced LLM audit system rule ID list (string literal, provided by LLMRules[].RuleID / ToolCallRules[].RuleID returned by DescribeSandboxLLMAuditSystemRuleList)
Input parameter limit: not empty, up to 1000; each element length 1-128.
     */
    public void setSystemRuleIDList(String [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get Effective scope 
     * @return EffectScope Effective scope
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Effective scope
     * @param EffectScope Effective scope
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get Initial status
Enumeration values:
ON: enabled.
OFF: disabled. 
     * @return Status Initial status
Enumeration values:
ON: enabled.
OFF: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Initial status
Enumeration values:
ON: enabled.
OFF: disabled.
     * @param Status Initial status
Enumeration values:
ON: enabled.
OFF: disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm 
     * @return RuleAction Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
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
     * @param RuleAction Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: Alarm
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    public CreateSandboxLLMAuditRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxLLMAuditRuleRequest(CreateSandboxLLMAuditRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

