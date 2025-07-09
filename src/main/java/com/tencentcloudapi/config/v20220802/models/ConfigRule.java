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
    * Rule identifier
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Name of the rule

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule parameters
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * Rule trigger condition.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * Resource types supported by rule. The rule only applies to specified resource types.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * Rule ownership tag
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * Rule risk level
1: Low risk
2: Medium risk
3: High risk
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Function corresponding to rule
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ServiceFunction")
    @Expose
    private String ServiceFunction;

    /**
    * Creation time

Format: YYYY-MM-DD h:i:s
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Rule description

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ACTIVE: Enabled
NO_ACTIVE: Disabled
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Compliance: 'COMPLIANT'
'NON_COMPLIANT'
'NOT_APPLICABLE'
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * ["",""]
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
    * Rule evaluation time
Format: YYYY-MM-DD h:i:s

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ConfigRuleInvokedTime")
    @Expose
    private String ConfigRuleInvokedTime;

    /**
    * Rule ID

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * CUSTOMIZE
Managed rule
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * Compliance package ID
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * Trigger Type

Scheduled trigger
Triggered by configuration change
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * Parameter details

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ManageInputParameter")
    @Expose
    private InputParameterForManage [] ManageInputParameter;

    /**
    * Rule name

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * Associated region
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RegionsScope")
    @Expose
    private String [] RegionsScope;

    /**
    * Associate Tag

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    *  The rule is invalid for the specified resource ID, meaning it does not evaluate the resource.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
    * Account group ID

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * Account group name
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * Rule owner user ID
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RuleOwnerId")
    @Expose
    private Long RuleOwnerId;

    /**
    * Trigger methods supported by preset rules
Scheduled trigger
Triggered by configuration change
    */
    @SerializedName("ManageTriggerType")
    @Expose
    private String [] ManageTriggerType;

    /**
     * Get Rule identifier
Note: This field may return null, indicating that no valid value is found. 
     * @return Identifier Rule identifier
Note: This field may return null, indicating that no valid value is found.
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Rule identifier
Note: This field may return null, indicating that no valid value is found.
     * @param Identifier Rule identifier
Note: This field may return null, indicating that no valid value is found.
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Name of the rule

Note: This field may return null, indicating that no valid value is found. 
     * @return RuleName Name of the rule

Note: This field may return null, indicating that no valid value is found.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Name of the rule

Note: This field may return null, indicating that no valid value is found.
     * @param RuleName Name of the rule

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule parameters
Note: This field may return null, indicating that no valid value is found. 
     * @return InputParameter Rule parameters
Note: This field may return null, indicating that no valid value is found.
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set Rule parameters
Note: This field may return null, indicating that no valid value is found.
     * @param InputParameter Rule parameters
Note: This field may return null, indicating that no valid value is found.
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get Rule trigger condition.

Note: This field may return null, indicating that no valid value is found. 
     * @return SourceCondition Rule trigger condition.

Note: This field may return null, indicating that no valid value is found.
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set Rule trigger condition.

Note: This field may return null, indicating that no valid value is found.
     * @param SourceCondition Rule trigger condition.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

    /**
     * Get Resource types supported by rule. The rule only applies to specified resource types.
Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceType Resource types supported by rule. The rule only applies to specified resource types.
Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource types supported by rule. The rule only applies to specified resource types.
Note: This field may return null, indicating that no valid value is found.
     * @param ResourceType Resource types supported by rule. The rule only applies to specified resource types.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Rule ownership tag
Note: This field may return null, indicating that no valid value is found. 
     * @return Labels Rule ownership tag
Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Rule ownership tag
Note: This field may return null, indicating that no valid value is found.
     * @param Labels Rule ownership tag
Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Rule risk level
1: Low risk
2: Medium risk
3: High risk
Note: This field may return null, indicating that no valid value is found. 
     * @return RiskLevel Rule risk level
1: Low risk
2: Medium risk
3: High risk
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Rule risk level
1: Low risk
2: Medium risk
3: High risk
Note: This field may return null, indicating that no valid value is found.
     * @param RiskLevel Rule risk level
1: Low risk
2: Medium risk
3: High risk
Note: This field may return null, indicating that no valid value is found.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Function corresponding to rule
Note: This field may return null, indicating that no valid value is found. 
     * @return ServiceFunction Function corresponding to rule
Note: This field may return null, indicating that no valid value is found.
     */
    public String getServiceFunction() {
        return this.ServiceFunction;
    }

    /**
     * Set Function corresponding to rule
Note: This field may return null, indicating that no valid value is found.
     * @param ServiceFunction Function corresponding to rule
Note: This field may return null, indicating that no valid value is found.
     */
    public void setServiceFunction(String ServiceFunction) {
        this.ServiceFunction = ServiceFunction;
    }

    /**
     * Get Creation time

Format: YYYY-MM-DD h:i:s
Note: This field may return null, indicating that no valid value is found. 
     * @return CreateTime Creation time

Format: YYYY-MM-DD h:i:s
Note: This field may return null, indicating that no valid value is found.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time

Format: YYYY-MM-DD h:i:s
Note: This field may return null, indicating that no valid value is found.
     * @param CreateTime Creation time

Format: YYYY-MM-DD h:i:s
Note: This field may return null, indicating that no valid value is found.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Rule description

Note: This field may return null, indicating that no valid value is found. 
     * @return Description Rule description

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description

Note: This field may return null, indicating that no valid value is found.
     * @param Description Rule description

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ACTIVE: Enabled
NO_ACTIVE: Disabled
Note: This field may return null, indicating that no valid value is found. 
     * @return Status ACTIVE: Enabled
NO_ACTIVE: Disabled
Note: This field may return null, indicating that no valid value is found.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ACTIVE: Enabled
NO_ACTIVE: Disabled
Note: This field may return null, indicating that no valid value is found.
     * @param Status ACTIVE: Enabled
NO_ACTIVE: Disabled
Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Compliance: 'COMPLIANT'
'NON_COMPLIANT'
'NOT_APPLICABLE'
Note: This field may return null, indicating that no valid value is found. 
     * @return ComplianceResult Compliance: 'COMPLIANT'
'NON_COMPLIANT'
'NOT_APPLICABLE'
Note: This field may return null, indicating that no valid value is found.
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set Compliance: 'COMPLIANT'
'NON_COMPLIANT'
'NOT_APPLICABLE'
Note: This field may return null, indicating that no valid value is found.
     * @param ComplianceResult Compliance: 'COMPLIANT'
'NON_COMPLIANT'
'NOT_APPLICABLE'
Note: This field may return null, indicating that no valid value is found.
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get ["",""]
Note: This field may return null, indicating that no valid value is found. 
     * @return Annotation ["",""]
Note: This field may return null, indicating that no valid value is found.
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set ["",""]
Note: This field may return null, indicating that no valid value is found.
     * @param Annotation ["",""]
Note: This field may return null, indicating that no valid value is found.
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    /**
     * Get Rule evaluation time
Format: YYYY-MM-DD h:i:s

Note: This field may return null, indicating that no valid value is found. 
     * @return ConfigRuleInvokedTime Rule evaluation time
Format: YYYY-MM-DD h:i:s

Note: This field may return null, indicating that no valid value is found.
     */
    public String getConfigRuleInvokedTime() {
        return this.ConfigRuleInvokedTime;
    }

    /**
     * Set Rule evaluation time
Format: YYYY-MM-DD h:i:s

Note: This field may return null, indicating that no valid value is found.
     * @param ConfigRuleInvokedTime Rule evaluation time
Format: YYYY-MM-DD h:i:s

Note: This field may return null, indicating that no valid value is found.
     */
    public void setConfigRuleInvokedTime(String ConfigRuleInvokedTime) {
        this.ConfigRuleInvokedTime = ConfigRuleInvokedTime;
    }

    /**
     * Get Rule ID

Note: This field may return null, indicating that no valid value is found. 
     * @return ConfigRuleId Rule ID

Note: This field may return null, indicating that no valid value is found.
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set Rule ID

Note: This field may return null, indicating that no valid value is found.
     * @param ConfigRuleId Rule ID

Note: This field may return null, indicating that no valid value is found.
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get CUSTOMIZE
Managed rule
Note: This field may return null, indicating that no valid value is found. 
     * @return IdentifierType CUSTOMIZE
Managed rule
Note: This field may return null, indicating that no valid value is found.
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set CUSTOMIZE
Managed rule
Note: This field may return null, indicating that no valid value is found.
     * @param IdentifierType CUSTOMIZE
Managed rule
Note: This field may return null, indicating that no valid value is found.
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    /**
     * Get Compliance package ID
Note: This field may return null, indicating that no valid value is found. 
     * @return CompliancePackId Compliance package ID
Note: This field may return null, indicating that no valid value is found.
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set Compliance package ID
Note: This field may return null, indicating that no valid value is found.
     * @param CompliancePackId Compliance package ID
Note: This field may return null, indicating that no valid value is found.
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get Trigger Type

Scheduled trigger
Triggered by configuration change
Note: This field may return null, indicating that no valid value is found. 
     * @return TriggerType Trigger Type

Scheduled trigger
Triggered by configuration change
Note: This field may return null, indicating that no valid value is found.
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger Type

Scheduled trigger
Triggered by configuration change
Note: This field may return null, indicating that no valid value is found.
     * @param TriggerType Trigger Type

Scheduled trigger
Triggered by configuration change
Note: This field may return null, indicating that no valid value is found.
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Parameter details

Note: This field may return null, indicating that no valid value is found. 
     * @return ManageInputParameter Parameter details

Note: This field may return null, indicating that no valid value is found.
     */
    public InputParameterForManage [] getManageInputParameter() {
        return this.ManageInputParameter;
    }

    /**
     * Set Parameter details

Note: This field may return null, indicating that no valid value is found.
     * @param ManageInputParameter Parameter details

Note: This field may return null, indicating that no valid value is found.
     */
    public void setManageInputParameter(InputParameterForManage [] ManageInputParameter) {
        this.ManageInputParameter = ManageInputParameter;
    }

    /**
     * Get Rule name

Note: This field may return null, indicating that no valid value is found. 
     * @return CompliancePackName Rule name

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set Rule name

Note: This field may return null, indicating that no valid value is found.
     * @param CompliancePackName Rule name

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get Associated region
Note: This field may return null, indicating that no valid value is found. 
     * @return RegionsScope Associated region
Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getRegionsScope() {
        return this.RegionsScope;
    }

    /**
     * Set Associated region
Note: This field may return null, indicating that no valid value is found.
     * @param RegionsScope Associated region
Note: This field may return null, indicating that no valid value is found.
     */
    public void setRegionsScope(String [] RegionsScope) {
        this.RegionsScope = RegionsScope;
    }

    /**
     * Get Associate Tag

Note: This field may return null, indicating that no valid value is found. 
     * @return TagsScope Associate Tag

Note: This field may return null, indicating that no valid value is found.
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set Associate Tag

Note: This field may return null, indicating that no valid value is found.
     * @param TagsScope Associate Tag

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get  The rule is invalid for the specified resource ID, meaning it does not evaluate the resource.
Note: This field may return null, indicating that no valid value is found. 
     * @return ExcludeResourceIdsScope  The rule is invalid for the specified resource ID, meaning it does not evaluate the resource.
Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set  The rule is invalid for the specified resource ID, meaning it does not evaluate the resource.
Note: This field may return null, indicating that no valid value is found.
     * @param ExcludeResourceIdsScope  The rule is invalid for the specified resource ID, meaning it does not evaluate the resource.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    /**
     * Get Account group ID

Note: This field may return null, indicating that no valid value is found. 
     * @return AccountGroupId Account group ID

Note: This field may return null, indicating that no valid value is found.
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID

Note: This field may return null, indicating that no valid value is found.
     * @param AccountGroupId Account group ID

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get Account group name
Note: This field may return null, indicating that no valid value is found. 
     * @return AccountGroupName Account group name
Note: This field may return null, indicating that no valid value is found.
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set Account group name
Note: This field may return null, indicating that no valid value is found.
     * @param AccountGroupName Account group name
Note: This field may return null, indicating that no valid value is found.
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get Rule owner user ID
Note: This field may return null, indicating that no valid value is found. 
     * @return RuleOwnerId Rule owner user ID
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getRuleOwnerId() {
        return this.RuleOwnerId;
    }

    /**
     * Set Rule owner user ID
Note: This field may return null, indicating that no valid value is found.
     * @param RuleOwnerId Rule owner user ID
Note: This field may return null, indicating that no valid value is found.
     */
    public void setRuleOwnerId(Long RuleOwnerId) {
        this.RuleOwnerId = RuleOwnerId;
    }

    /**
     * Get Trigger methods supported by preset rules
Scheduled trigger
Triggered by configuration change 
     * @return ManageTriggerType Trigger methods supported by preset rules
Scheduled trigger
Triggered by configuration change
     */
    public String [] getManageTriggerType() {
        return this.ManageTriggerType;
    }

    /**
     * Set Trigger methods supported by preset rules
Scheduled trigger
Triggered by configuration change
     * @param ManageTriggerType Trigger methods supported by preset rules
Scheduled trigger
Triggered by configuration change
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

