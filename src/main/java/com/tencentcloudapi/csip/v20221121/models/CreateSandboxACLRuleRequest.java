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

public class CreateSandboxACLRuleRequest extends AbstractModel {

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
INFO: Notification.
LOW: low-risk
MEDIUM: Medium risk
HIGH: HIGH risk
CRITICAL: Critical
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * Effective scope
Input limitation: if EffectScope.EffectType is INCLUDE, EffectAssets must be non-empty.
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * Initial status
Enumeration values:
ON: enable
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
    * List of referenced system rule IDs
Input limit: up to 100; provide at least one of this parameter and UserRuleContent
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * Content of user-defined rules
Input parameter limit: up to 100 sub-rules; provide at least one of this parameter or SystemRuleIDList.
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxACLRuleContentItem [] UserRuleContent;

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
INFO: Notification.
LOW: low-risk
MEDIUM: Medium risk
HIGH: HIGH risk
CRITICAL: Critical 
     * @return Level Rule level
Enumeration values:
INFO: Notification.
LOW: low-risk
MEDIUM: Medium risk
HIGH: HIGH risk
CRITICAL: Critical
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Rule level
Enumeration values:
INFO: Notification.
LOW: low-risk
MEDIUM: Medium risk
HIGH: HIGH risk
CRITICAL: Critical
     * @param Level Rule level
Enumeration values:
INFO: Notification.
LOW: low-risk
MEDIUM: Medium risk
HIGH: HIGH risk
CRITICAL: Critical
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container 
     * @return BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
     * @param BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get Effective scope
Input limitation: if EffectScope.EffectType is INCLUDE, EffectAssets must be non-empty. 
     * @return EffectScope Effective scope
Input limitation: if EffectScope.EffectType is INCLUDE, EffectAssets must be non-empty.
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Effective scope
Input limitation: if EffectScope.EffectType is INCLUDE, EffectAssets must be non-empty.
     * @param EffectScope Effective scope
Input limitation: if EffectScope.EffectType is INCLUDE, EffectAssets must be non-empty.
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get Initial status
Enumeration values:
ON: enable
OFF: disabled. 
     * @return Status Initial status
Enumeration values:
ON: enable
OFF: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Initial status
Enumeration values:
ON: enable
OFF: disabled.
     * @param Status Initial status
Enumeration values:
ON: enable
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

    /**
     * Get List of referenced system rule IDs
Input limit: up to 100; provide at least one of this parameter and UserRuleContent 
     * @return SystemRuleIDList List of referenced system rule IDs
Input limit: up to 100; provide at least one of this parameter and UserRuleContent
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set List of referenced system rule IDs
Input limit: up to 100; provide at least one of this parameter and UserRuleContent
     * @param SystemRuleIDList List of referenced system rule IDs
Input limit: up to 100; provide at least one of this parameter and UserRuleContent
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get Content of user-defined rules
Input parameter limit: up to 100 sub-rules; provide at least one of this parameter or SystemRuleIDList. 
     * @return UserRuleContent Content of user-defined rules
Input parameter limit: up to 100 sub-rules; provide at least one of this parameter or SystemRuleIDList.
     */
    public TrafficSandboxACLRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set Content of user-defined rules
Input parameter limit: up to 100 sub-rules; provide at least one of this parameter or SystemRuleIDList.
     * @param UserRuleContent Content of user-defined rules
Input parameter limit: up to 100 sub-rules; provide at least one of this parameter or SystemRuleIDList.
     */
    public void setUserRuleContent(TrafficSandboxACLRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    public CreateSandboxACLRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxACLRuleRequest(CreateSandboxACLRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);

    }
}

