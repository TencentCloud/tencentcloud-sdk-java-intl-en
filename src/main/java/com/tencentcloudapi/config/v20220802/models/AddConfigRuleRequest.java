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

public class AddConfigRuleRequest extends AbstractModel {

    /**
    * <p>Rule template ID. The preset rule template is Identifier and the custom rule is the serverless cloud function ARN (region:functionName).</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>Rule template type. Valid values: SYSTEM and CUSTOMIZE.</p>
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Resources supported by the rule.</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * <p>Trigger types, supporting up to two types.</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>Input parameters.</p>
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * <p>Rule description, which is 0–1024 characters in length.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Rule evaluation region scope. The rule only applies to resources in specified regions. Supported regions are those returned by config:ListResourceRegions.</p>
    */
    @SerializedName("RegionsScope")
    @Expose
    private String [] RegionsScope;

    /**
    * <p>Rule evaluation tag scope. The rule only applies to resources bound with specified tags.</p>
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    * <p>The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.</p>
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
     * Get <p>Rule template ID. The preset rule template is Identifier and the custom rule is the serverless cloud function ARN (region:functionName).</p> 
     * @return Identifier <p>Rule template ID. The preset rule template is Identifier and the custom rule is the serverless cloud function ARN (region:functionName).</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>Rule template ID. The preset rule template is Identifier and the custom rule is the serverless cloud function ARN (region:functionName).</p>
     * @param Identifier <p>Rule template ID. The preset rule template is Identifier and the custom rule is the serverless cloud function ARN (region:functionName).</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>Rule template type. Valid values: SYSTEM and CUSTOMIZE.</p> 
     * @return IdentifierType <p>Rule template type. Valid values: SYSTEM and CUSTOMIZE.</p>
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set <p>Rule template type. Valid values: SYSTEM and CUSTOMIZE.</p>
     * @param IdentifierType <p>Rule template type. Valid values: SYSTEM and CUSTOMIZE.</p>
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    /**
     * Get <p>rule name</p> 
     * @return RuleName <p>rule name</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>rule name</p>
     * @param RuleName <p>rule name</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Resources supported by the rule.</p> 
     * @return ResourceType <p>Resources supported by the rule.</p>
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Resources supported by the rule.</p>
     * @param ResourceType <p>Resources supported by the rule.</p>
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>Trigger types, supporting up to two types.</p> 
     * @return TriggerType <p>Trigger types, supporting up to two types.</p>
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger types, supporting up to two types.</p>
     * @param TriggerType <p>Trigger types, supporting up to two types.</p>
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p> 
     * @return RiskLevel <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
     * @param RiskLevel <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Input parameters.</p> 
     * @return InputParameter <p>Input parameters.</p>
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set <p>Input parameters.</p>
     * @param InputParameter <p>Input parameters.</p>
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get <p>Rule description, which is 0–1024 characters in length.</p> 
     * @return Description <p>Rule description, which is 0–1024 characters in length.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Rule description, which is 0–1024 characters in length.</p>
     * @param Description <p>Rule description, which is 0–1024 characters in length.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Rule evaluation region scope. The rule only applies to resources in specified regions. Supported regions are those returned by config:ListResourceRegions.</p> 
     * @return RegionsScope <p>Rule evaluation region scope. The rule only applies to resources in specified regions. Supported regions are those returned by config:ListResourceRegions.</p>
     */
    public String [] getRegionsScope() {
        return this.RegionsScope;
    }

    /**
     * Set <p>Rule evaluation region scope. The rule only applies to resources in specified regions. Supported regions are those returned by config:ListResourceRegions.</p>
     * @param RegionsScope <p>Rule evaluation region scope. The rule only applies to resources in specified regions. Supported regions are those returned by config:ListResourceRegions.</p>
     */
    public void setRegionsScope(String [] RegionsScope) {
        this.RegionsScope = RegionsScope;
    }

    /**
     * Get <p>Rule evaluation tag scope. The rule only applies to resources bound with specified tags.</p> 
     * @return TagsScope <p>Rule evaluation tag scope. The rule only applies to resources bound with specified tags.</p>
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set <p>Rule evaluation tag scope. The rule only applies to resources bound with specified tags.</p>
     * @param TagsScope <p>Rule evaluation tag scope. The rule only applies to resources bound with specified tags.</p>
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get <p>The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.</p> 
     * @return ExcludeResourceIdsScope <p>The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.</p>
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set <p>The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.</p>
     * @param ExcludeResourceIdsScope <p>The rule is invalid for the specified resource ID, meaning that evaluation will not be performed on this resource.</p>
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    public AddConfigRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddConfigRuleRequest(AddConfigRuleRequest source) {
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
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "RegionsScope.", this.RegionsScope);
        this.setParamArrayObj(map, prefix + "TagsScope.", this.TagsScope);
        this.setParamArraySimple(map, prefix + "ExcludeResourceIdsScope.", this.ExcludeResourceIdsScope);

    }
}

