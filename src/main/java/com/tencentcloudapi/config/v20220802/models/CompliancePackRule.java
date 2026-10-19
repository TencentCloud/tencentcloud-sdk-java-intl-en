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

public class CompliancePackRule extends AbstractModel {

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Risk level.</p>
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
    * <p>Rule ID</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Preset rule identifier</p>
    */
    @SerializedName("ManagedRuleIdentifier")
    @Expose
    private String ManagedRuleIdentifier;

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * <p>Compliance package ID.</p>
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

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
     * Get <p>Risk level.</p> 
     * @return RiskLevel <p>Risk level.</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level.</p>
     * @param RiskLevel <p>Risk level.</p>
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
     * Get <p>Rule ID</p> 
     * @return Identifier <p>Rule ID</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>Rule ID</p>
     * @param Identifier <p>Rule ID</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Preset rule identifier</p> 
     * @return ManagedRuleIdentifier <p>Preset rule identifier</p>
     */
    public String getManagedRuleIdentifier() {
        return this.ManagedRuleIdentifier;
    }

    /**
     * Set <p>Preset rule identifier</p>
     * @param ManagedRuleIdentifier <p>Preset rule identifier</p>
     */
    public void setManagedRuleIdentifier(String ManagedRuleIdentifier) {
        this.ManagedRuleIdentifier = ManagedRuleIdentifier;
    }

    /**
     * Get <p>Rule ID.</p> 
     * @return ConfigRuleId <p>Rule ID.</p>
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param ConfigRuleId <p>Rule ID.</p>
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get <p>Compliance package ID.</p> 
     * @return CompliancePackId <p>Compliance package ID.</p>
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set <p>Compliance package ID.</p>
     * @param CompliancePackId <p>Compliance package ID.</p>
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    public CompliancePackRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePackRule(CompliancePackRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ManagedRuleIdentifier != null) {
            this.ManagedRuleIdentifier = new String(source.ManagedRuleIdentifier);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ManagedRuleIdentifier", this.ManagedRuleIdentifier);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);

    }
}

