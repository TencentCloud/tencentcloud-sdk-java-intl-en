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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLLMContentRuleRequest extends AbstractModel {

    /**
    * <p>Name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Priority.</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>Rule switch.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Detection scope. 1: Inbound. 2: Outbound. 3: Inbound and outbound.</p>
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * <p>Detection content matching.</p>
    */
    @SerializedName("RuleItem")
    @Expose
    private RuleItem [] RuleItem;

    /**
    * <p>Matching condition.</p>
    */
    @SerializedName("Options")
    @Expose
    private LLMOptionsItem [] Options;

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Action. monitor: Observe. Intercept: Intercept.</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>Response prompt content.</p>
    */
    @SerializedName("ResponseText")
    @Expose
    private String ResponseText;

    /**
    * <p>Session ID for which the rule is to be enabled.</p>
    */
    @SerializedName("SessionApplied")
    @Expose
    private String [] SessionApplied;

    /**
    * <p>Rule ID. Enter 0 when adding a rule.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Interception page id.</p>
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * <p>Detection content and/or expression. Defaults to and.</p>
    */
    @SerializedName("ContentLogicalOp")
    @Expose
    private String ContentLogicalOp;

    /**
    * <p>Instance id. Required.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Response type. 1: Built-in trusted model security response. 2: Custom response, which takes effect when ActionType=reply.</p><p>Valid values:</p><ul><li>1: Built-in trusted model security response</li><li>2: Custom response, which takes effect when ActionType=reply</li></ul>
    */
    @SerializedName("ReplyType")
    @Expose
    private Long ReplyType;

    /**
    * <p>Custom response template.</p>
    */
    @SerializedName("CustomReplyRuleId")
    @Expose
    private String CustomReplyRuleId;

    /**
    * <p>Modality type. 0: Text (default). 1: Image.</p><p>Valid values:</p><ul><li>0: Text</li><li>1: Image</li></ul>
    */
    @SerializedName("ModalType")
    @Expose
    private Long ModalType;

    /**
    * <p>Rule category. black: Regular rule (default). white: Allowlist rule. If this parameter is left empty, the black category is used. When this parameter is set to white, ActionType can only be set to pass, and RuleItem supports allowlist matching fields (Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist; Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard).</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Effective scope of the allowlist rule: a list of multiple serviceId/domain values (used when Category=white), indicating the domains/serviceIds to which the allowlist rule applies. This field is not used for blocklist rules.</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>List of module types for which the allowlist takes effect (used when Category=white), indicating the protection modules to which the allowlist rule applies (pass) after a match. Valid values: 2: Compute resource consumption rule; 3: Custom protection rule; 4: ToolCall protection; 5: Prompt attack protection; 6: Content compliance detection; 7: Sensitive data detection.</p>
    */
    @SerializedName("AppliedModules")
    @Expose
    private Long [] AppliedModules;

    /**
    * <p>Severity. critical: Critical. high: High. medium: Medium (default). low: Low. When this rule is matched, the risk level is displayed in attack logs based on this parameter. If this parameter is not passed or is left empty, the medium severity is used.</p><p>Valid values:</p><ul><li>critical: Critical</li><li>high: High</li><li>medium: Medium (default)</li><li>low: Low</li></ul>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
     * Get <p>Name.</p> 
     * @return Name <p>Name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p>
     * @param Name <p>Name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Priority.</p> 
     * @return Priority <p>Priority.</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>Priority.</p>
     * @param Priority <p>Priority.</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>Rule switch.</p> 
     * @return Status <p>Rule switch.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Rule switch.</p>
     * @param Status <p>Rule switch.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Detection scope. 1: Inbound. 2: Outbound. 3: Inbound and outbound.</p> 
     * @return CheckType <p>Detection scope. 1: Inbound. 2: Outbound. 3: Inbound and outbound.</p>
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Detection scope. 1: Inbound. 2: Outbound. 3: Inbound and outbound.</p>
     * @param CheckType <p>Detection scope. 1: Inbound. 2: Outbound. 3: Inbound and outbound.</p>
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Detection content matching.</p> 
     * @return RuleItem <p>Detection content matching.</p>
     */
    public RuleItem [] getRuleItem() {
        return this.RuleItem;
    }

    /**
     * Set <p>Detection content matching.</p>
     * @param RuleItem <p>Detection content matching.</p>
     */
    public void setRuleItem(RuleItem [] RuleItem) {
        this.RuleItem = RuleItem;
    }

    /**
     * Get <p>Matching condition.</p> 
     * @return Options <p>Matching condition.</p>
     */
    public LLMOptionsItem [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>Matching condition.</p>
     * @param Options <p>Matching condition.</p>
     */
    public void setOptions(LLMOptionsItem [] Options) {
        this.Options = Options;
    }

    /**
     * Get <p>Domain name.</p> 
     * @return Domain <p>Domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Domain <p>Domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Action. monitor: Observe. Intercept: Intercept.</p> 
     * @return ActionType <p>Action. monitor: Observe. Intercept: Intercept.</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>Action. monitor: Observe. Intercept: Intercept.</p>
     * @param ActionType <p>Action. monitor: Observe. Intercept: Intercept.</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>Response prompt content.</p> 
     * @return ResponseText <p>Response prompt content.</p>
     */
    public String getResponseText() {
        return this.ResponseText;
    }

    /**
     * Set <p>Response prompt content.</p>
     * @param ResponseText <p>Response prompt content.</p>
     */
    public void setResponseText(String ResponseText) {
        this.ResponseText = ResponseText;
    }

    /**
     * Get <p>Session ID for which the rule is to be enabled.</p> 
     * @return SessionApplied <p>Session ID for which the rule is to be enabled.</p>
     */
    public String [] getSessionApplied() {
        return this.SessionApplied;
    }

    /**
     * Set <p>Session ID for which the rule is to be enabled.</p>
     * @param SessionApplied <p>Session ID for which the rule is to be enabled.</p>
     */
    public void setSessionApplied(String [] SessionApplied) {
        this.SessionApplied = SessionApplied;
    }

    /**
     * Get <p>Rule ID. Enter 0 when adding a rule.</p> 
     * @return RuleId <p>Rule ID. Enter 0 when adding a rule.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Rule ID. Enter 0 when adding a rule.</p>
     * @param RuleId <p>Rule ID. Enter 0 when adding a rule.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Interception page id.</p> 
     * @return PageId <p>Interception page id.</p>
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set <p>Interception page id.</p>
     * @param PageId <p>Interception page id.</p>
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get <p>Detection content and/or expression. Defaults to and.</p> 
     * @return ContentLogicalOp <p>Detection content and/or expression. Defaults to and.</p>
     */
    public String getContentLogicalOp() {
        return this.ContentLogicalOp;
    }

    /**
     * Set <p>Detection content and/or expression. Defaults to and.</p>
     * @param ContentLogicalOp <p>Detection content and/or expression. Defaults to and.</p>
     */
    public void setContentLogicalOp(String ContentLogicalOp) {
        this.ContentLogicalOp = ContentLogicalOp;
    }

    /**
     * Get <p>Instance id. Required.</p> 
     * @return InstanceId <p>Instance id. Required.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id. Required.</p>
     * @param InstanceId <p>Instance id. Required.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Response type. 1: Built-in trusted model security response. 2: Custom response, which takes effect when ActionType=reply.</p><p>Valid values:</p><ul><li>1: Built-in trusted model security response</li><li>2: Custom response, which takes effect when ActionType=reply</li></ul> 
     * @return ReplyType <p>Response type. 1: Built-in trusted model security response. 2: Custom response, which takes effect when ActionType=reply.</p><p>Valid values:</p><ul><li>1: Built-in trusted model security response</li><li>2: Custom response, which takes effect when ActionType=reply</li></ul>
     */
    public Long getReplyType() {
        return this.ReplyType;
    }

    /**
     * Set <p>Response type. 1: Built-in trusted model security response. 2: Custom response, which takes effect when ActionType=reply.</p><p>Valid values:</p><ul><li>1: Built-in trusted model security response</li><li>2: Custom response, which takes effect when ActionType=reply</li></ul>
     * @param ReplyType <p>Response type. 1: Built-in trusted model security response. 2: Custom response, which takes effect when ActionType=reply.</p><p>Valid values:</p><ul><li>1: Built-in trusted model security response</li><li>2: Custom response, which takes effect when ActionType=reply</li></ul>
     */
    public void setReplyType(Long ReplyType) {
        this.ReplyType = ReplyType;
    }

    /**
     * Get <p>Custom response template.</p> 
     * @return CustomReplyRuleId <p>Custom response template.</p>
     */
    public String getCustomReplyRuleId() {
        return this.CustomReplyRuleId;
    }

    /**
     * Set <p>Custom response template.</p>
     * @param CustomReplyRuleId <p>Custom response template.</p>
     */
    public void setCustomReplyRuleId(String CustomReplyRuleId) {
        this.CustomReplyRuleId = CustomReplyRuleId;
    }

    /**
     * Get <p>Modality type. 0: Text (default). 1: Image.</p><p>Valid values:</p><ul><li>0: Text</li><li>1: Image</li></ul> 
     * @return ModalType <p>Modality type. 0: Text (default). 1: Image.</p><p>Valid values:</p><ul><li>0: Text</li><li>1: Image</li></ul>
     */
    public Long getModalType() {
        return this.ModalType;
    }

    /**
     * Set <p>Modality type. 0: Text (default). 1: Image.</p><p>Valid values:</p><ul><li>0: Text</li><li>1: Image</li></ul>
     * @param ModalType <p>Modality type. 0: Text (default). 1: Image.</p><p>Valid values:</p><ul><li>0: Text</li><li>1: Image</li></ul>
     */
    public void setModalType(Long ModalType) {
        this.ModalType = ModalType;
    }

    /**
     * Get <p>Rule category. black: Regular rule (default). white: Allowlist rule. If this parameter is left empty, the black category is used. When this parameter is set to white, ActionType can only be set to pass, and RuleItem supports allowlist matching fields (Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist; Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard).</p> 
     * @return Category <p>Rule category. black: Regular rule (default). white: Allowlist rule. If this parameter is left empty, the black category is used. When this parameter is set to white, ActionType can only be set to pass, and RuleItem supports allowlist matching fields (Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist; Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard).</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Rule category. black: Regular rule (default). white: Allowlist rule. If this parameter is left empty, the black category is used. When this parameter is set to white, ActionType can only be set to pass, and RuleItem supports allowlist matching fields (Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist; Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard).</p>
     * @param Category <p>Rule category. black: Regular rule (default). white: Allowlist rule. If this parameter is left empty, the black category is used. When this parameter is set to white, ActionType can only be set to pass, and RuleItem supports allowlist matching fields (Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist; Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard).</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Effective scope of the allowlist rule: a list of multiple serviceId/domain values (used when Category=white), indicating the domains/serviceIds to which the allowlist rule applies. This field is not used for blocklist rules.</p> 
     * @return Domains <p>Effective scope of the allowlist rule: a list of multiple serviceId/domain values (used when Category=white), indicating the domains/serviceIds to which the allowlist rule applies. This field is not used for blocklist rules.</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>Effective scope of the allowlist rule: a list of multiple serviceId/domain values (used when Category=white), indicating the domains/serviceIds to which the allowlist rule applies. This field is not used for blocklist rules.</p>
     * @param Domains <p>Effective scope of the allowlist rule: a list of multiple serviceId/domain values (used when Category=white), indicating the domains/serviceIds to which the allowlist rule applies. This field is not used for blocklist rules.</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>List of module types for which the allowlist takes effect (used when Category=white), indicating the protection modules to which the allowlist rule applies (pass) after a match. Valid values: 2: Compute resource consumption rule; 3: Custom protection rule; 4: ToolCall protection; 5: Prompt attack protection; 6: Content compliance detection; 7: Sensitive data detection.</p> 
     * @return AppliedModules <p>List of module types for which the allowlist takes effect (used when Category=white), indicating the protection modules to which the allowlist rule applies (pass) after a match. Valid values: 2: Compute resource consumption rule; 3: Custom protection rule; 4: ToolCall protection; 5: Prompt attack protection; 6: Content compliance detection; 7: Sensitive data detection.</p>
     */
    public Long [] getAppliedModules() {
        return this.AppliedModules;
    }

    /**
     * Set <p>List of module types for which the allowlist takes effect (used when Category=white), indicating the protection modules to which the allowlist rule applies (pass) after a match. Valid values: 2: Compute resource consumption rule; 3: Custom protection rule; 4: ToolCall protection; 5: Prompt attack protection; 6: Content compliance detection; 7: Sensitive data detection.</p>
     * @param AppliedModules <p>List of module types for which the allowlist takes effect (used when Category=white), indicating the protection modules to which the allowlist rule applies (pass) after a match. Valid values: 2: Compute resource consumption rule; 3: Custom protection rule; 4: ToolCall protection; 5: Prompt attack protection; 6: Content compliance detection; 7: Sensitive data detection.</p>
     */
    public void setAppliedModules(Long [] AppliedModules) {
        this.AppliedModules = AppliedModules;
    }

    /**
     * Get <p>Severity. critical: Critical. high: High. medium: Medium (default). low: Low. When this rule is matched, the risk level is displayed in attack logs based on this parameter. If this parameter is not passed or is left empty, the medium severity is used.</p><p>Valid values:</p><ul><li>critical: Critical</li><li>high: High</li><li>medium: Medium (default)</li><li>low: Low</li></ul> 
     * @return RiskLevel <p>Severity. critical: Critical. high: High. medium: Medium (default). low: Low. When this rule is matched, the risk level is displayed in attack logs based on this parameter. If this parameter is not passed or is left empty, the medium severity is used.</p><p>Valid values:</p><ul><li>critical: Critical</li><li>high: High</li><li>medium: Medium (default)</li><li>low: Low</li></ul>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Severity. critical: Critical. high: High. medium: Medium (default). low: Low. When this rule is matched, the risk level is displayed in attack logs based on this parameter. If this parameter is not passed or is left empty, the medium severity is used.</p><p>Valid values:</p><ul><li>critical: Critical</li><li>high: High</li><li>medium: Medium (default)</li><li>low: Low</li></ul>
     * @param RiskLevel <p>Severity. critical: Critical. high: High. medium: Medium (default). low: Low. When this rule is matched, the risk level is displayed in attack logs based on this parameter. If this parameter is not passed or is left empty, the medium severity is used.</p><p>Valid values:</p><ul><li>critical: Critical</li><li>high: High</li><li>medium: Medium (default)</li><li>low: Low</li></ul>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    public ModifyLLMContentRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMContentRuleRequest(ModifyLLMContentRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.RuleItem != null) {
            this.RuleItem = new RuleItem[source.RuleItem.length];
            for (int i = 0; i < source.RuleItem.length; i++) {
                this.RuleItem[i] = new RuleItem(source.RuleItem[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new LLMOptionsItem[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new LLMOptionsItem(source.Options[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResponseText != null) {
            this.ResponseText = new String(source.ResponseText);
        }
        if (source.SessionApplied != null) {
            this.SessionApplied = new String[source.SessionApplied.length];
            for (int i = 0; i < source.SessionApplied.length; i++) {
                this.SessionApplied[i] = new String(source.SessionApplied[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.ContentLogicalOp != null) {
            this.ContentLogicalOp = new String(source.ContentLogicalOp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReplyType != null) {
            this.ReplyType = new Long(source.ReplyType);
        }
        if (source.CustomReplyRuleId != null) {
            this.CustomReplyRuleId = new String(source.CustomReplyRuleId);
        }
        if (source.ModalType != null) {
            this.ModalType = new Long(source.ModalType);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.AppliedModules != null) {
            this.AppliedModules = new Long[source.AppliedModules.length];
            for (int i = 0; i < source.AppliedModules.length; i++) {
                this.AppliedModules[i] = new Long(source.AppliedModules[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamArrayObj(map, prefix + "RuleItem.", this.RuleItem);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResponseText", this.ResponseText);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ContentLogicalOp", this.ContentLogicalOp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReplyType", this.ReplyType);
        this.setParamSimple(map, prefix + "CustomReplyRuleId", this.CustomReplyRuleId);
        this.setParamSimple(map, prefix + "ModalType", this.ModalType);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "AppliedModules.", this.AppliedModules);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

