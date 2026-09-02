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

public class ModifySandboxDLPRuleRequest extends AbstractModel {

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Rule name<br>Input limit: length 1-128<br>Default value: no modification if not passed</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical<br>Default value: no modification if not passed in</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Rule action<br>Enumeration values:<br>PASS: blocklist<br>BLOCK: block and alarm<br>MONITOR: alarm<br>Default value: no modification if not passed in</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>Referenced system rule ID list<br>Input parameter limit: up to 1000; when passed, overwrites the original collection entirely; if not passed, means no modification</p>
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * <p>User-defined rule content<br>Input parameter limits: when passed in, the entire collection is overwritten (passing an empty array is allowed to clear it); if not passed, no modification is made</p>
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] UserRuleContent;

    /**
    * <p>Structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable, and at least one must be hit. When passed in, it overwrites the original collection as a whole; if not passed, no modification is made. It will override when passed in at the same time as UserRuleContent</p>
    */
    @SerializedName("UserRuleInfo")
    @Expose
    private TrafficSandboxDLPUserRuleInfo UserRuleInfo;

    /**
    * <p>Effective scope<br>Default value: no modification if not passed</p>
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * <p>Target status<br>Enumeration values: <br>ON: Enablement<br>OFF: Disablement<br>Default value: No modification if not passed in</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Rule ID.</p> 
     * @return ID <p>Rule ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param ID <p>Rule ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Rule name<br>Input limit: length 1-128<br>Default value: no modification if not passed</p> 
     * @return RuleName <p>Rule name<br>Input limit: length 1-128<br>Default value: no modification if not passed</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Rule name<br>Input limit: length 1-128<br>Default value: no modification if not passed</p>
     * @param RuleName <p>Rule name<br>Input limit: length 1-128<br>Default value: no modification if not passed</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical<br>Default value: no modification if not passed in</p> 
     * @return Level <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical<br>Default value: no modification if not passed in</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical<br>Default value: no modification if not passed in</p>
     * @param Level <p>Rule level<br>Enumeration values:<br>INFO: notification<br>LOW: low risk<br>MEDIUM: medium risk<br>HIGH: high risk<br>CRITICAL: critical<br>Default value: no modification if not passed in</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Rule action<br>Enumeration values:<br>PASS: blocklist<br>BLOCK: block and alarm<br>MONITOR: alarm<br>Default value: no modification if not passed in</p> 
     * @return RuleAction <p>Rule action<br>Enumeration values:<br>PASS: blocklist<br>BLOCK: block and alarm<br>MONITOR: alarm<br>Default value: no modification if not passed in</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>Rule action<br>Enumeration values:<br>PASS: blocklist<br>BLOCK: block and alarm<br>MONITOR: alarm<br>Default value: no modification if not passed in</p>
     * @param RuleAction <p>Rule action<br>Enumeration values:<br>PASS: blocklist<br>BLOCK: block and alarm<br>MONITOR: alarm<br>Default value: no modification if not passed in</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>Referenced system rule ID list<br>Input parameter limit: up to 1000; when passed, overwrites the original collection entirely; if not passed, means no modification</p> 
     * @return SystemRuleIDList <p>Referenced system rule ID list<br>Input parameter limit: up to 1000; when passed, overwrites the original collection entirely; if not passed, means no modification</p>
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set <p>Referenced system rule ID list<br>Input parameter limit: up to 1000; when passed, overwrites the original collection entirely; if not passed, means no modification</p>
     * @param SystemRuleIDList <p>Referenced system rule ID list<br>Input parameter limit: up to 1000; when passed, overwrites the original collection entirely; if not passed, means no modification</p>
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get <p>User-defined rule content<br>Input parameter limits: when passed in, the entire collection is overwritten (passing an empty array is allowed to clear it); if not passed, no modification is made</p> 
     * @return UserRuleContent <p>User-defined rule content<br>Input parameter limits: when passed in, the entire collection is overwritten (passing an empty array is allowed to clear it); if not passed, no modification is made</p>
     */
    public TrafficSandboxDLPRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set <p>User-defined rule content<br>Input parameter limits: when passed in, the entire collection is overwritten (passing an empty array is allowed to clear it); if not passed, no modification is made</p>
     * @param UserRuleContent <p>User-defined rule content<br>Input parameter limits: when passed in, the entire collection is overwritten (passing an empty array is allowed to clear it); if not passed, no modification is made</p>
     */
    public void setUserRuleContent(TrafficSandboxDLPRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get <p>Structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable, and at least one must be hit. When passed in, it overwrites the original collection as a whole; if not passed, no modification is made. It will override when passed in at the same time as UserRuleContent</p> 
     * @return UserRuleInfo <p>Structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable, and at least one must be hit. When passed in, it overwrites the original collection as a whole; if not passed, no modification is made. It will override when passed in at the same time as UserRuleContent</p>
     */
    public TrafficSandboxDLPUserRuleInfo getUserRuleInfo() {
        return this.UserRuleInfo;
    }

    /**
     * Set <p>Structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable, and at least one must be hit. When passed in, it overwrites the original collection as a whole; if not passed, no modification is made. It will override when passed in at the same time as UserRuleContent</p>
     * @param UserRuleInfo <p>Structured input parameters support 5 detection dimensions (file name/file size/file format/outbound domain name/outbound content). Each dimension is selectable, and at least one must be hit. When passed in, it overwrites the original collection as a whole; if not passed, no modification is made. It will override when passed in at the same time as UserRuleContent</p>
     */
    public void setUserRuleInfo(TrafficSandboxDLPUserRuleInfo UserRuleInfo) {
        this.UserRuleInfo = UserRuleInfo;
    }

    /**
     * Get <p>Effective scope<br>Default value: no modification if not passed</p> 
     * @return EffectScope <p>Effective scope<br>Default value: no modification if not passed</p>
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set <p>Effective scope<br>Default value: no modification if not passed</p>
     * @param EffectScope <p>Effective scope<br>Default value: no modification if not passed</p>
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get <p>Target status<br>Enumeration values: <br>ON: Enablement<br>OFF: Disablement<br>Default value: No modification if not passed in</p> 
     * @return Status <p>Target status<br>Enumeration values: <br>ON: Enablement<br>OFF: Disablement<br>Default value: No modification if not passed in</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Target status<br>Enumeration values: <br>ON: Enablement<br>OFF: Disablement<br>Default value: No modification if not passed in</p>
     * @param Status <p>Target status<br>Enumeration values: <br>ON: Enablement<br>OFF: Disablement<br>Default value: No modification if not passed in</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxDLPRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxDLPRuleRequest(ModifySandboxDLPRuleRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "UserRuleInfo.", this.UserRuleInfo);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

