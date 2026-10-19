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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigRule extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Rule Name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule parameters
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * Rule trigger condition.
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * Resource types supported by the rule. The rule applies only to resources of the specified resource types.
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * Rule tags.
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * Rule risk level.
1: Low risk
2: Medium-risk
3: High-risk
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Function corresponding to the rule.
    */
    @SerializedName("ServiceFunction")
    @Expose
    private String ServiceFunction;

    /**
    * Creation time.
Format: YYYY-MM-DD h:i:s
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Rule description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ACTIVE: enable
NO_ACTIVE: Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Compliant: 'COMPLIANT'
Non-compliance: 'NON_COMPLIANT'
Unable to apply rule: 'NOT_APPLICABLE'
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * ["",""]
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
    * Rule evaluation time
Format: YYYY-MM-DD h:i:s

    */
    @SerializedName("ConfigRuleInvokedTime")
    @Expose
    private String ConfigRuleInvokedTime;

    /**
    * Rule ID
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * CUSTOMIZE: custom rule
SYSTEM: managed rule
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * Compliance package ID.
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * Trigger Type
ScheduledNotification: periodic trigger.
ConfigurationItemChangeNotification: Triggered by a change
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * Parameter details
    */
    @SerializedName("ManageInputParameter")
    @Expose
    private InputParameterForManage [] ManageInputParameter;

    /**
    * Compliance package name
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * Associated regions.
    */
    @SerializedName("RegionsScope")
    @Expose
    private String [] RegionsScope;

    /**
    * Associated tag
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    *  The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
    * Account group ID.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * Account group name.
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * Rule owner user ID.
    */
    @SerializedName("RuleOwnerId")
    @Expose
    private Long RuleOwnerId;

    /**
    * Trigger methods supported by preset rules.
ScheduledNotification: periodic trigger
ConfigurationItemChangeNotification: Triggered by a change
    */
    @SerializedName("ManageTriggerType")
    @Expose
    private String [] ManageTriggerType;

    /**
     * Get Rule ID 
     * @return Identifier Rule ID
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Rule ID
     * @param Identifier Rule ID
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Rule Name 
     * @return RuleName Rule Name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule Name
     * @param RuleName Rule Name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule parameters 
     * @return InputParameter Rule parameters
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set Rule parameters
     * @param InputParameter Rule parameters
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get Rule trigger condition. 
     * @return SourceCondition Rule trigger condition.
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set Rule trigger condition.
     * @param SourceCondition Rule trigger condition.
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

    /**
     * Get Resource types supported by the rule. The rule applies only to resources of the specified resource types. 
     * @return ResourceType Resource types supported by the rule. The rule applies only to resources of the specified resource types.
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource types supported by the rule. The rule applies only to resources of the specified resource types.
     * @param ResourceType Resource types supported by the rule. The rule applies only to resources of the specified resource types.
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Rule tags. 
     * @return Labels Rule tags.
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Rule tags.
     * @param Labels Rule tags.
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Rule risk level.
1: Low risk
2: Medium-risk
3: High-risk 
     * @return RiskLevel Rule risk level.
1: Low risk
2: Medium-risk
3: High-risk
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Rule risk level.
1: Low risk
2: Medium-risk
3: High-risk
     * @param RiskLevel Rule risk level.
1: Low risk
2: Medium-risk
3: High-risk
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Function corresponding to the rule. 
     * @return ServiceFunction Function corresponding to the rule.
     */
    public String getServiceFunction() {
        return this.ServiceFunction;
    }

    /**
     * Set Function corresponding to the rule.
     * @param ServiceFunction Function corresponding to the rule.
     */
    public void setServiceFunction(String ServiceFunction) {
        this.ServiceFunction = ServiceFunction;
    }

    /**
     * Get Creation time.
Format: YYYY-MM-DD h:i:s 
     * @return CreateTime Creation time.
Format: YYYY-MM-DD h:i:s
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Format: YYYY-MM-DD h:i:s
     * @param CreateTime Creation time.
Format: YYYY-MM-DD h:i:s
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Rule description 
     * @return Description Rule description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
     * @param Description Rule description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ACTIVE: enable
NO_ACTIVE: Disabled 
     * @return Status ACTIVE: enable
NO_ACTIVE: Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ACTIVE: enable
NO_ACTIVE: Disabled
     * @param Status ACTIVE: enable
NO_ACTIVE: Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Compliant: 'COMPLIANT'
Non-compliance: 'NON_COMPLIANT'
Unable to apply rule: 'NOT_APPLICABLE' 
     * @return ComplianceResult Compliant: 'COMPLIANT'
Non-compliance: 'NON_COMPLIANT'
Unable to apply rule: 'NOT_APPLICABLE'
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set Compliant: 'COMPLIANT'
Non-compliance: 'NON_COMPLIANT'
Unable to apply rule: 'NOT_APPLICABLE'
     * @param ComplianceResult Compliant: 'COMPLIANT'
Non-compliance: 'NON_COMPLIANT'
Unable to apply rule: 'NOT_APPLICABLE'
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get ["",""] 
     * @return Annotation ["",""]
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set ["",""]
     * @param Annotation ["",""]
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    /**
     * Get Rule evaluation time
Format: YYYY-MM-DD h:i:s
 
     * @return ConfigRuleInvokedTime Rule evaluation time
Format: YYYY-MM-DD h:i:s

     */
    public String getConfigRuleInvokedTime() {
        return this.ConfigRuleInvokedTime;
    }

    /**
     * Set Rule evaluation time
Format: YYYY-MM-DD h:i:s

     * @param ConfigRuleInvokedTime Rule evaluation time
Format: YYYY-MM-DD h:i:s

     */
    public void setConfigRuleInvokedTime(String ConfigRuleInvokedTime) {
        this.ConfigRuleInvokedTime = ConfigRuleInvokedTime;
    }

    /**
     * Get Rule ID 
     * @return ConfigRuleId Rule ID
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set Rule ID
     * @param ConfigRuleId Rule ID
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get CUSTOMIZE: custom rule
SYSTEM: managed rule 
     * @return IdentifierType CUSTOMIZE: custom rule
SYSTEM: managed rule
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set CUSTOMIZE: custom rule
SYSTEM: managed rule
     * @param IdentifierType CUSTOMIZE: custom rule
SYSTEM: managed rule
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    /**
     * Get Compliance package ID. 
     * @return CompliancePackId Compliance package ID.
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set Compliance package ID.
     * @param CompliancePackId Compliance package ID.
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get Trigger Type
ScheduledNotification: periodic trigger.
ConfigurationItemChangeNotification: Triggered by a change 
     * @return TriggerType Trigger Type
ScheduledNotification: periodic trigger.
ConfigurationItemChangeNotification: Triggered by a change
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger Type
ScheduledNotification: periodic trigger.
ConfigurationItemChangeNotification: Triggered by a change
     * @param TriggerType Trigger Type
ScheduledNotification: periodic trigger.
ConfigurationItemChangeNotification: Triggered by a change
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Parameter details 
     * @return ManageInputParameter Parameter details
     */
    public InputParameterForManage [] getManageInputParameter() {
        return this.ManageInputParameter;
    }

    /**
     * Set Parameter details
     * @param ManageInputParameter Parameter details
     */
    public void setManageInputParameter(InputParameterForManage [] ManageInputParameter) {
        this.ManageInputParameter = ManageInputParameter;
    }

    /**
     * Get Compliance package name 
     * @return CompliancePackName Compliance package name
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set Compliance package name
     * @param CompliancePackName Compliance package name
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get Associated regions. 
     * @return RegionsScope Associated regions.
     */
    public String [] getRegionsScope() {
        return this.RegionsScope;
    }

    /**
     * Set Associated regions.
     * @param RegionsScope Associated regions.
     */
    public void setRegionsScope(String [] RegionsScope) {
        this.RegionsScope = RegionsScope;
    }

    /**
     * Get Associated tag 
     * @return TagsScope Associated tag
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set Associated tag
     * @param TagsScope Associated tag
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get  The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource. 
     * @return ExcludeResourceIdsScope  The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set  The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.
     * @param ExcludeResourceIdsScope  The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    /**
     * Get Account group ID. 
     * @return AccountGroupId Account group ID.
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID.
     * @param AccountGroupId Account group ID.
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get Account group name. 
     * @return AccountGroupName Account group name.
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set Account group name.
     * @param AccountGroupName Account group name.
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get Rule owner user ID. 
     * @return RuleOwnerId Rule owner user ID.
     */
    public Long getRuleOwnerId() {
        return this.RuleOwnerId;
    }

    /**
     * Set Rule owner user ID.
     * @param RuleOwnerId Rule owner user ID.
     */
    public void setRuleOwnerId(Long RuleOwnerId) {
        this.RuleOwnerId = RuleOwnerId;
    }

    /**
     * Get Trigger methods supported by preset rules.
ScheduledNotification: periodic trigger
ConfigurationItemChangeNotification: Triggered by a change 
     * @return ManageTriggerType Trigger methods supported by preset rules.
ScheduledNotification: periodic trigger
ConfigurationItemChangeNotification: Triggered by a change
     */
    public String [] getManageTriggerType() {
        return this.ManageTriggerType;
    }

    /**
     * Set Trigger methods supported by preset rules.
ScheduledNotification: periodic trigger
ConfigurationItemChangeNotification: Triggered by a change
     * @param ManageTriggerType Trigger methods supported by preset rules.
ScheduledNotification: periodic trigger
ConfigurationItemChangeNotification: Triggered by a change
     */
    public void setManageTriggerType(String [] ManageTriggerType) {
        this.ManageTriggerType = ManageTriggerType;
    }

    public ConfigRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigRule(ConfigRule source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.SourceCondition != null) {
            this.SourceCondition = new SourceConditionForManage[source.SourceCondition.length];
            for (int i = 0; i < source.SourceCondition.length; i++) {
                this.SourceCondition[i] = new SourceConditionForManage(source.SourceCondition[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ServiceFunction != null) {
            this.ServiceFunction = new String(source.ServiceFunction);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
        if (source.ConfigRuleInvokedTime != null) {
            this.ConfigRuleInvokedTime = new String(source.ConfigRuleInvokedTime);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.IdentifierType != null) {
            this.IdentifierType = new String(source.IdentifierType);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new TriggerType[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new TriggerType(source.TriggerType[i]);
            }
        }
        if (source.ManageInputParameter != null) {
            this.ManageInputParameter = new InputParameterForManage[source.ManageInputParameter.length];
            for (int i = 0; i < source.ManageInputParameter.length; i++) {
                this.ManageInputParameter[i] = new InputParameterForManage(source.ManageInputParameter[i]);
            }
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.RegionsScope != null) {
            this.RegionsScope = new String[source.RegionsScope.length];
            for (int i = 0; i < source.RegionsScope.length; i++) {
                this.RegionsScope[i] = new String(source.RegionsScope[i]);
            }
        }
        if (source.TagsScope != null) {
            this.TagsScope = new Tag[source.TagsScope.length];
            for (int i = 0; i < source.TagsScope.length; i++) {
                this.TagsScope[i] = new Tag(source.TagsScope[i]);
            }
        }
        if (source.ExcludeResourceIdsScope != null) {
            this.ExcludeResourceIdsScope = new String[source.ExcludeResourceIdsScope.length];
            for (int i = 0; i < source.ExcludeResourceIdsScope.length; i++) {
                this.ExcludeResourceIdsScope[i] = new String(source.ExcludeResourceIdsScope[i]);
            }
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.AccountGroupName != null) {
            this.AccountGroupName = new String(source.AccountGroupName);
        }
        if (source.RuleOwnerId != null) {
            this.RuleOwnerId = new Long(source.RuleOwnerId);
        }
        if (source.ManageTriggerType != null) {
            this.ManageTriggerType = new String[source.ManageTriggerType.length];
            for (int i = 0; i < source.ManageTriggerType.length; i++) {
                this.ManageTriggerType[i] = new String(source.ManageTriggerType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamArrayObj(map, prefix + "SourceCondition.", this.SourceCondition);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ServiceFunction", this.ServiceFunction);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);
        this.setParamSimple(map, prefix + "ConfigRuleInvokedTime", this.ConfigRuleInvokedTime);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "IdentifierType", this.IdentifierType);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamArrayObj(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamArrayObj(map, prefix + "ManageInputParameter.", this.ManageInputParameter);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamArraySimple(map, prefix + "RegionsScope.", this.RegionsScope);
        this.setParamArrayObj(map, prefix + "TagsScope.", this.TagsScope);
        this.setParamArraySimple(map, prefix + "ExcludeResourceIdsScope.", this.ExcludeResourceIdsScope);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "AccountGroupName", this.AccountGroupName);
        this.setParamSimple(map, prefix + "RuleOwnerId", this.RuleOwnerId);
        this.setParamArraySimple(map, prefix + "ManageTriggerType.", this.ManageTriggerType);

    }
}

