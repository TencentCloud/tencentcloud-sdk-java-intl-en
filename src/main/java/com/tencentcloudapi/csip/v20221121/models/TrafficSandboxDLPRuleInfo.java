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

public class TrafficSandboxDLPRuleInfo extends AbstractModel {

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
Enumeration values:
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
Enumeration values:
ON: enable
OFF: disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
    * Snapshot of the referenced system rule content
    */
    @SerializedName("SystemRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] SystemRuleContent;

    /**
    * Content of the user-defined rule
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] UserRuleContent;

    /**
    * Structured view of user rules, returning rule content by detection dimension, making it easy for the frontend to render partitions by file name, file size, file format, outbound domain name, and outbound content. Read-only output fields do not affect Create/Modify input parameters.
    */
    @SerializedName("UserRuleInfo")
    @Expose
    private TrafficSandboxDLPUserRuleInfo UserRuleInfo;

    /**
    * Rule effective scope
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * List of ineffective assets: AI Agent assets in the traffic sandbox plug-in not installed (TrafficPluginState.InstallStatus not INSTALLED) among the policy association targets' effective assets. Returns the InstanceId/ContainerId and TrafficPluginState of the machines. Returns an empty array when there are no ineffective assets.
    */
    @SerializedName("InactiveAssets")
    @Expose
    private TrafficSandboxInactiveAsset [] InactiveAssets;

    /**
    * Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
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
Enumeration values:
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
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical 
     * @return Level Rule level
Enumeration values:
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
Enumeration values:
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: high risk
CRITICAL: Critical
     * @param Level Rule level
Enumeration values:
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
Enumeration values:
ON: enable
OFF: disabled. 
     * @return Status Rule status
Enumeration values:
ON: enable
OFF: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status
Enumeration values:
ON: enable
OFF: disabled.
     * @param Status Rule status
Enumeration values:
ON: enable
OFF: disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Snapshot of the referenced system rule content 
     * @return SystemRuleContent Snapshot of the referenced system rule content
     */
    public TrafficSandboxDLPRuleContentItem [] getSystemRuleContent() {
        return this.SystemRuleContent;
    }

    /**
     * Set Snapshot of the referenced system rule content
     * @param SystemRuleContent Snapshot of the referenced system rule content
     */
    public void setSystemRuleContent(TrafficSandboxDLPRuleContentItem [] SystemRuleContent) {
        this.SystemRuleContent = SystemRuleContent;
    }

    /**
     * Get Content of the user-defined rule 
     * @return UserRuleContent Content of the user-defined rule
     */
    public TrafficSandboxDLPRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set Content of the user-defined rule
     * @param UserRuleContent Content of the user-defined rule
     */
    public void setUserRuleContent(TrafficSandboxDLPRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get Structured view of user rules, returning rule content by detection dimension, making it easy for the frontend to render partitions by file name, file size, file format, outbound domain name, and outbound content. Read-only output fields do not affect Create/Modify input parameters. 
     * @return UserRuleInfo Structured view of user rules, returning rule content by detection dimension, making it easy for the frontend to render partitions by file name, file size, file format, outbound domain name, and outbound content. Read-only output fields do not affect Create/Modify input parameters.
     */
    public TrafficSandboxDLPUserRuleInfo getUserRuleInfo() {
        return this.UserRuleInfo;
    }

    /**
     * Set Structured view of user rules, returning rule content by detection dimension, making it easy for the frontend to render partitions by file name, file size, file format, outbound domain name, and outbound content. Read-only output fields do not affect Create/Modify input parameters.
     * @param UserRuleInfo Structured view of user rules, returning rule content by detection dimension, making it easy for the frontend to render partitions by file name, file size, file format, outbound domain name, and outbound content. Read-only output fields do not affect Create/Modify input parameters.
     */
    public void setUserRuleInfo(TrafficSandboxDLPUserRuleInfo UserRuleInfo) {
        this.UserRuleInfo = UserRuleInfo;
    }

    /**
     * Get Rule effective scope 
     * @return EffectScope Rule effective scope
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Rule effective scope
     * @param EffectScope Rule effective scope
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get List of ineffective assets: AI Agent assets in the traffic sandbox plug-in not installed (TrafficPluginState.InstallStatus not INSTALLED) among the policy association targets' effective assets. Returns the InstanceId/ContainerId and TrafficPluginState of the machines. Returns an empty array when there are no ineffective assets. 
     * @return InactiveAssets List of ineffective assets: AI Agent assets in the traffic sandbox plug-in not installed (TrafficPluginState.InstallStatus not INSTALLED) among the policy association targets' effective assets. Returns the InstanceId/ContainerId and TrafficPluginState of the machines. Returns an empty array when there are no ineffective assets.
     */
    public TrafficSandboxInactiveAsset [] getInactiveAssets() {
        return this.InactiveAssets;
    }

    /**
     * Set List of ineffective assets: AI Agent assets in the traffic sandbox plug-in not installed (TrafficPluginState.InstallStatus not INSTALLED) among the policy association targets' effective assets. Returns the InstanceId/ContainerId and TrafficPluginState of the machines. Returns an empty array when there are no ineffective assets.
     * @param InactiveAssets List of ineffective assets: AI Agent assets in the traffic sandbox plug-in not installed (TrafficPluginState.InstallStatus not INSTALLED) among the policy association targets' effective assets. Returns the InstanceId/ContainerId and TrafficPluginState of the machines. Returns an empty array when there are no ineffective assets.
     */
    public void setInactiveAssets(TrafficSandboxInactiveAsset [] InactiveAssets) {
        this.InactiveAssets = InactiveAssets;
    }

    /**
     * Get Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format) 
     * @return InsertTime Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     * @param InsertTime Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
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
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm 
     * @return RuleAction Rule Action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Rule Action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
     * @param RuleAction Rule Action
Enumeration values:
PASS: allowlist
BLOCK: Block and alarm
MONITOR: alarm
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    public TrafficSandboxDLPRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPRuleInfo(TrafficSandboxDLPRuleInfo source) {
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
        if (source.SystemRuleContent != null) {
            this.SystemRuleContent = new TrafficSandboxDLPRuleContentItem[source.SystemRuleContent.length];
            for (int i = 0; i < source.SystemRuleContent.length; i++) {
                this.SystemRuleContent[i] = new TrafficSandboxDLPRuleContentItem(source.SystemRuleContent[i]);
            }
        }
        if (source.UserRuleContent != null) {
            this.UserRuleContent = new TrafficSandboxDLPRuleContentItem[source.UserRuleContent.length];
            for (int i = 0; i < source.UserRuleContent.length; i++) {
                this.UserRuleContent[i] = new TrafficSandboxDLPRuleContentItem(source.UserRuleContent[i]);
            }
        }
        if (source.UserRuleInfo != null) {
            this.UserRuleInfo = new TrafficSandboxDLPUserRuleInfo(source.UserRuleInfo);
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
        this.setParamArrayObj(map, prefix + "SystemRuleContent.", this.SystemRuleContent);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "UserRuleInfo.", this.UserRuleInfo);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamArrayObj(map, prefix + "InactiveAssets.", this.InactiveAssets);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

