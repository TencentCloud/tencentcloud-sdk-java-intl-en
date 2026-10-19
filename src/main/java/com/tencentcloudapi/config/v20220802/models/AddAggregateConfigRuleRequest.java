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

public class AddAggregateConfigRuleRequest extends AbstractModel {

    /**
    * Rule template ID. The preset rule template is Identifier, and the custom rule is the serverless cloud function ARN (region:functionName).
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Rule template type. Valid values: SYSTEM and CUSTOMIZE.
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Resources supported by the rule.
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * Trigger types. A maximum of two types are supported.
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * Risk level
1: High-risk.
2: Medium-risk.
3: Low risk.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Account group ID.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * Input parameters
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Associated regions.
    */
    @SerializedName("RegionScope")
    @Expose
    private String [] RegionScope;

    /**
    * Associated tag
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    * Excluded resource ID.
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
     * Get Rule template ID. The preset rule template is Identifier, and the custom rule is the serverless cloud function ARN (region:functionName). 
     * @return Identifier Rule template ID. The preset rule template is Identifier, and the custom rule is the serverless cloud function ARN (region:functionName).
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Rule template ID. The preset rule template is Identifier, and the custom rule is the serverless cloud function ARN (region:functionName).
     * @param Identifier Rule template ID. The preset rule template is Identifier, and the custom rule is the serverless cloud function ARN (region:functionName).
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Rule template type. Valid values: SYSTEM and CUSTOMIZE. 
     * @return IdentifierType Rule template type. Valid values: SYSTEM and CUSTOMIZE.
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set Rule template type. Valid values: SYSTEM and CUSTOMIZE.
     * @param IdentifierType Rule template type. Valid values: SYSTEM and CUSTOMIZE.
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
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
     * Get Resources supported by the rule. 
     * @return ResourceType Resources supported by the rule.
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resources supported by the rule.
     * @param ResourceType Resources supported by the rule.
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Trigger types. A maximum of two types are supported. 
     * @return TriggerType Trigger types. A maximum of two types are supported.
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger types. A maximum of two types are supported.
     * @param TriggerType Trigger types. A maximum of two types are supported.
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Risk level
1: High-risk.
2: Medium-risk.
3: Low risk. 
     * @return RiskLevel Risk level
1: High-risk.
2: Medium-risk.
3: Low risk.
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
1: High-risk.
2: Medium-risk.
3: Low risk.
     * @param RiskLevel Risk level
1: High-risk.
2: Medium-risk.
3: Low risk.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Input parameters 
     * @return InputParameter Input parameters
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set Input parameters
     * @param InputParameter Input parameters
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Associated regions. 
     * @return RegionScope Associated regions.
     */
    public String [] getRegionScope() {
        return this.RegionScope;
    }

    /**
     * Set Associated regions.
     * @param RegionScope Associated regions.
     */
    public void setRegionScope(String [] RegionScope) {
        this.RegionScope = RegionScope;
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
     * Get Excluded resource ID. 
     * @return ExcludeResourceIdsScope Excluded resource ID.
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set Excluded resource ID.
     * @param ExcludeResourceIdsScope Excluded resource ID.
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    public AddAggregateConfigRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAggregateConfigRuleRequest(AddAggregateConfigRuleRequest source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.IdentifierType != null) {
            this.IdentifierType = new String(source.IdentifierType);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new TriggerType[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new TriggerType(source.TriggerType[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RegionScope != null) {
            this.RegionScope = new String[source.RegionScope.length];
            for (int i = 0; i < source.RegionScope.length; i++) {
                this.RegionScope[i] = new String(source.RegionScope[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "IdentifierType", this.IdentifierType);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArrayObj(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "RegionScope.", this.RegionScope);
        this.setParamArrayObj(map, prefix + "TagsScope.", this.TagsScope);
        this.setParamArraySimple(map, prefix + "ExcludeResourceIdsScope.", this.ExcludeResourceIdsScope);

    }
}

