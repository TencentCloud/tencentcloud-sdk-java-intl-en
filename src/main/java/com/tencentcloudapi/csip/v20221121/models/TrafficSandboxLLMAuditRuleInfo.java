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

public class TrafficSandboxLLMAuditRuleInfo extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule level
Enumeration value:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Rule status
Enumeration value:
ON: enabled.
OFF: disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Asset type of the affiliation
Enumeration value:
HOST: host
CONTAINER: container
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * List of referenced system rules (including system rule names)
    */
    @SerializedName("SystemRuleRefs")
    @Expose
    private TrafficSandboxLLMAuditRuleRef [] SystemRuleRefs;

    /**
    * Effective scope of the rule
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * List of ineffective assets: AI Agent assets in the policy association targets' effective assets where the traffic sandbox plug-in is not installed (TrafficPluginState.InstallStatus is not INSTALLED). Returns the InstanceId / ContainerId and TrafficPluginState of the machines. Returns an empty array if there are no ineffective assets.
    */
    @SerializedName("InactiveAssets")
    @Expose
    private TrafficSandboxInactiveAsset [] InactiveAssets;

    /**
    * Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO 8601 format)
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Rule Action
Enumeration value:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

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
     * Get Rule level
Enumeration value:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical 
     * @return Level Rule level
Enumeration value:
INFO: Notification
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
Enumeration value:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
     * @param Level Rule level
Enumeration value:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Rule status
Enumeration value:
ON: enabled.
OFF: disabled. 
     * @return Status Rule status
Enumeration value:
ON: enabled.
OFF: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status
Enumeration value:
ON: enabled.
OFF: disabled.
     * @param Status Rule status
Enumeration value:
ON: enabled.
OFF: disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Asset type of the affiliation
Enumeration value:
HOST: host
CONTAINER: container 
     * @return BelongAssetType Asset type of the affiliation
Enumeration value:
HOST: host
CONTAINER: container
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set Asset type of the affiliation
Enumeration value:
HOST: host
CONTAINER: container
     * @param BelongAssetType Asset type of the affiliation
Enumeration value:
HOST: host
CONTAINER: container
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get List of referenced system rules (including system rule names) 
     * @return SystemRuleRefs List of referenced system rules (including system rule names)
     */
    public TrafficSandboxLLMAuditRuleRef [] getSystemRuleRefs() {
        return this.SystemRuleRefs;
    }

    /**
     * Set List of referenced system rules (including system rule names)
     * @param SystemRuleRefs List of referenced system rules (including system rule names)
     */
    public void setSystemRuleRefs(TrafficSandboxLLMAuditRuleRef [] SystemRuleRefs) {
        this.SystemRuleRefs = SystemRuleRefs;
    }

    /**
     * Get Effective scope of the rule 
     * @return EffectScope Effective scope of the rule
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Effective scope of the rule
     * @param EffectScope Effective scope of the rule
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get List of ineffective assets: AI Agent assets in the policy association targets' effective assets where the traffic sandbox plug-in is not installed (TrafficPluginState.InstallStatus is not INSTALLED). Returns the InstanceId / ContainerId and TrafficPluginState of the machines. Returns an empty array if there are no ineffective assets. 
     * @return InactiveAssets List of ineffective assets: AI Agent assets in the policy association targets' effective assets where the traffic sandbox plug-in is not installed (TrafficPluginState.InstallStatus is not INSTALLED). Returns the InstanceId / ContainerId and TrafficPluginState of the machines. Returns an empty array if there are no ineffective assets.
     */
    public TrafficSandboxInactiveAsset [] getInactiveAssets() {
        return this.InactiveAssets;
    }

    /**
     * Set List of ineffective assets: AI Agent assets in the policy association targets' effective assets where the traffic sandbox plug-in is not installed (TrafficPluginState.InstallStatus is not INSTALLED). Returns the InstanceId / ContainerId and TrafficPluginState of the machines. Returns an empty array if there are no ineffective assets.
     * @param InactiveAssets List of ineffective assets: AI Agent assets in the policy association targets' effective assets where the traffic sandbox plug-in is not installed (TrafficPluginState.InstallStatus is not INSTALLED). Returns the InstanceId / ContainerId and TrafficPluginState of the machines. Returns an empty array if there are no ineffective assets.
     */
    public void setInactiveAssets(TrafficSandboxInactiveAsset [] InactiveAssets) {
        this.InactiveAssets = InactiveAssets;
    }

    /**
     * Get Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO 8601 format) 
     * @return InsertTime Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO 8601 format)
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO 8601 format)
     * @param InsertTime Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO 8601 format)
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format) 
     * @return UpdateTime Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     * @param UpdateTime Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Rule Action
Enumeration value:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm 
     * @return RuleAction Rule Action
Enumeration value:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Rule Action
Enumeration value:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
     * @param RuleAction Rule Action
Enumeration value:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    public TrafficSandboxLLMAuditRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxLLMAuditRuleInfo(TrafficSandboxLLMAuditRuleInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.SystemRuleRefs != null) {
            this.SystemRuleRefs = new TrafficSandboxLLMAuditRuleRef[source.SystemRuleRefs.length];
            for (int i = 0; i < source.SystemRuleRefs.length; i++) {
                this.SystemRuleRefs[i] = new TrafficSandboxLLMAuditRuleRef(source.SystemRuleRefs[i]);
            }
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
        if (source.InactiveAssets != null) {
            this.InactiveAssets = new TrafficSandboxInactiveAsset[source.InactiveAssets.length];
            for (int i = 0; i < source.InactiveAssets.length; i++) {
                this.InactiveAssets[i] = new TrafficSandboxInactiveAsset(source.InactiveAssets[i]);
            }
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamArrayObj(map, prefix + "SystemRuleRefs.", this.SystemRuleRefs);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamArrayObj(map, prefix + "InactiveAssets.", this.InactiveAssets);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

