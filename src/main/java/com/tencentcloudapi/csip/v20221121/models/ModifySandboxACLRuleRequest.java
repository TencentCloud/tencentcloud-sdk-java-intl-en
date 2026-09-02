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

public class ModifySandboxACLRuleRequest extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Rule name
Input parameter limits: 1-128 in length
Default value: No modification if not specified.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
Default value: No modification if not specified.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * List of referenced system rule IDs.
Input parameter limits: pass an empty array to clear; omit it to skip modification.
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * Content of user-defined rules
Input parameter limits: pass an empty array to clear; omit it to skip modification.
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxACLRuleContentItem [] UserRuleContent;

    /**
    * Effective scope
Default value: No modification if not specified.
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
Default value: No modification if not specified.
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: No modification if not specified.
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
Input parameter limits: 1-128 in length
Default value: No modification if not specified. 
     * @return RuleName Rule name
Input parameter limits: 1-128 in length
Default value: No modification if not specified.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
Input parameter limits: 1-128 in length
Default value: No modification if not specified.
     * @param RuleName Rule name
Input parameter limits: 1-128 in length
Default value: No modification if not specified.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
Default value: No modification if not specified. 
     * @return Level Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
Default value: No modification if not specified.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
Default value: No modification if not specified.
     * @param Level Rule level
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
Default value: No modification if not specified.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get List of referenced system rule IDs.
Input parameter limits: pass an empty array to clear; omit it to skip modification. 
     * @return SystemRuleIDList List of referenced system rule IDs.
Input parameter limits: pass an empty array to clear; omit it to skip modification.
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set List of referenced system rule IDs.
Input parameter limits: pass an empty array to clear; omit it to skip modification.
     * @param SystemRuleIDList List of referenced system rule IDs.
Input parameter limits: pass an empty array to clear; omit it to skip modification.
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get Content of user-defined rules
Input parameter limits: pass an empty array to clear; omit it to skip modification. 
     * @return UserRuleContent Content of user-defined rules
Input parameter limits: pass an empty array to clear; omit it to skip modification.
     */
    public TrafficSandboxACLRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set Content of user-defined rules
Input parameter limits: pass an empty array to clear; omit it to skip modification.
     * @param UserRuleContent Content of user-defined rules
Input parameter limits: pass an empty array to clear; omit it to skip modification.
     */
    public void setUserRuleContent(TrafficSandboxACLRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get Effective scope
Default value: No modification if not specified. 
     * @return EffectScope Effective scope
Default value: No modification if not specified.
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Effective scope
Default value: No modification if not specified.
     * @param EffectScope Effective scope
Default value: No modification if not specified.
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
Default value: No modification if not specified. 
     * @return RuleAction Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
Default value: No modification if not specified.
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
Default value: No modification if not specified.
     * @param RuleAction Rule action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
Default value: No modification if not specified.
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: No modification if not specified. 
     * @return Status Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: No modification if not specified.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: No modification if not specified.
     * @param Status Target Status
Enumeration values:
ON: enable
OFF: disabled.
Default value: No modification if not specified.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxACLRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxACLRuleRequest(ModifySandboxACLRuleRequest source) {
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
            this.SystemRuleIDList = new Long[source.SystemRuleIDList.length];
            for (int i = 0; i < source.SystemRuleIDList.length; i++) {
                this.SystemRuleIDList[i] = new Long(source.SystemRuleIDList[i]);
            }
        }
        if (source.UserRuleContent != null) {
            this.UserRuleContent = new TrafficSandboxACLRuleContentItem[source.UserRuleContent.length];
            for (int i = 0; i < source.UserRuleContent.length; i++) {
                this.UserRuleContent[i] = new TrafficSandboxACLRuleContentItem(source.UserRuleContent[i]);
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
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

