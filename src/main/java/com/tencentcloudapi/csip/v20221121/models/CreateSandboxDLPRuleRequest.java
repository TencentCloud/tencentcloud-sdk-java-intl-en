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

public class CreateSandboxDLPRuleRequest extends AbstractModel {

    /**
    * <p>Rule name<br>Input parameter limit: length 1-128</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Rule action<br>Enumeration value:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>Effective scope</p>
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * <p>Initial status<br>Enumeration values:<br>ON: Enable<br>OFF: Disable</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Referenced system rule ID list<br>Input limit: up to 1000; at least one of this or UserRuleContent must be provided</p>
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * <p>User-defined rule content<br>Input limits: up to 100 sub-rules; import either this or UserRuleInfo. If both are imported at the same time, UserRuleInfo takes precedence</p>
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] UserRuleContent;

    /**
    * <p>Newly-added selectable structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable and at least one must be hit. It will override when passed at the same time as UserRuleContent.</p>
    */
    @SerializedName("UserRuleInfo")
    @Expose
    private TrafficSandboxDLPUserRuleInfo UserRuleInfo;

    /**
     * Get <p>Rule name<br>Input parameter limit: length 1-128</p> 
     * @return RuleName <p>Rule name<br>Input parameter limit: length 1-128</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Rule name<br>Input parameter limit: length 1-128</p>
     * @param RuleName <p>Rule name<br>Input parameter limit: length 1-128</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p> 
     * @return Level <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
     * @param Level <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Rule action<br>Enumeration value:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p> 
     * @return RuleAction <p>Rule action<br>Enumeration value:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>Rule action<br>Enumeration value:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
     * @param RuleAction <p>Rule action<br>Enumeration value:<br>PASS: allowlist<br>BLOCK: block and alarm<br>MONITOR: alarm</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p> 
     * @return BelongAssetType <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     * @param BelongAssetType <p>Affiliated asset type<br>Enumeration values:<br>HOST: Host<br>CONTAINER: Container</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>Effective scope</p> 
     * @return EffectScope <p>Effective scope</p>
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set <p>Effective scope</p>
     * @param EffectScope <p>Effective scope</p>
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get <p>Initial status<br>Enumeration values:<br>ON: Enable<br>OFF: Disable</p> 
     * @return Status <p>Initial status<br>Enumeration values:<br>ON: Enable<br>OFF: Disable</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Initial status<br>Enumeration values:<br>ON: Enable<br>OFF: Disable</p>
     * @param Status <p>Initial status<br>Enumeration values:<br>ON: Enable<br>OFF: Disable</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Referenced system rule ID list<br>Input limit: up to 1000; at least one of this or UserRuleContent must be provided</p> 
     * @return SystemRuleIDList <p>Referenced system rule ID list<br>Input limit: up to 1000; at least one of this or UserRuleContent must be provided</p>
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set <p>Referenced system rule ID list<br>Input limit: up to 1000; at least one of this or UserRuleContent must be provided</p>
     * @param SystemRuleIDList <p>Referenced system rule ID list<br>Input limit: up to 1000; at least one of this or UserRuleContent must be provided</p>
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get <p>User-defined rule content<br>Input limits: up to 100 sub-rules; import either this or UserRuleInfo. If both are imported at the same time, UserRuleInfo takes precedence</p> 
     * @return UserRuleContent <p>User-defined rule content<br>Input limits: up to 100 sub-rules; import either this or UserRuleInfo. If both are imported at the same time, UserRuleInfo takes precedence</p>
     */
    public TrafficSandboxDLPRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set <p>User-defined rule content<br>Input limits: up to 100 sub-rules; import either this or UserRuleInfo. If both are imported at the same time, UserRuleInfo takes precedence</p>
     * @param UserRuleContent <p>User-defined rule content<br>Input limits: up to 100 sub-rules; import either this or UserRuleInfo. If both are imported at the same time, UserRuleInfo takes precedence</p>
     */
    public void setUserRuleContent(TrafficSandboxDLPRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get <p>Newly-added selectable structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable and at least one must be hit. It will override when passed at the same time as UserRuleContent.</p> 
     * @return UserRuleInfo <p>Newly-added selectable structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable and at least one must be hit. It will override when passed at the same time as UserRuleContent.</p>
     */
    public TrafficSandboxDLPUserRuleInfo getUserRuleInfo() {
        return this.UserRuleInfo;
    }

    /**
     * Set <p>Newly-added selectable structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable and at least one must be hit. It will override when passed at the same time as UserRuleContent.</p>
     * @param UserRuleInfo <p>Newly-added selectable structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable and at least one must be hit. It will override when passed at the same time as UserRuleContent.</p>
     */
    public void setUserRuleInfo(TrafficSandboxDLPUserRuleInfo UserRuleInfo) {
        this.UserRuleInfo = UserRuleInfo;
    }

    public CreateSandboxDLPRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxDLPRuleRequest(CreateSandboxDLPRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
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
        if (source.SystemRuleIDList != null) {
            this.SystemRuleIDList = new Long[source.SystemRuleIDList.length];
            for (int i = 0; i < source.SystemRuleIDList.length; i++) {
                this.SystemRuleIDList[i] = new Long(source.SystemRuleIDList[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "UserRuleInfo.", this.UserRuleInfo);

    }
}

