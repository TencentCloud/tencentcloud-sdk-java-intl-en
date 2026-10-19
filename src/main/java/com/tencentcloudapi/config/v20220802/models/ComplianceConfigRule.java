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

public class ComplianceConfigRule extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Rule status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule ID
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * Assessment result
Compliant: 'COMPLIANT'
Non-compliant: 'NON_COMPLIANT'
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * Keyword.
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * Input parameters
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * Parameter format.
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * Rule ID
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Creation method. Valid values: user, compliancePack, and system.
    */
    @SerializedName("CreateByType")
    @Expose
    private String CreateByType;

    /**
    * Rule description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Parameter description
    */
    @SerializedName("ManageInputParameter")
    @Expose
    private InputParameterForManage [] ManageInputParameter;

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
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Rule status 
     * @return Status Rule status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status
     * @param Status Rule status
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Assessment result
Compliant: 'COMPLIANT'
Non-compliant: 'NON_COMPLIANT' 
     * @return ComplianceResult Assessment result
Compliant: 'COMPLIANT'
Non-compliant: 'NON_COMPLIANT'
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set Assessment result
Compliant: 'COMPLIANT'
Non-compliant: 'NON_COMPLIANT'
     * @param ComplianceResult Assessment result
Compliant: 'COMPLIANT'
Non-compliant: 'NON_COMPLIANT'
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get Keyword. 
     * @return Labels Keyword.
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Keyword.
     * @param Labels Keyword.
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
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
     * Get Parameter format. 
     * @return SourceCondition Parameter format.
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set Parameter format.
     * @param SourceCondition Parameter format.
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

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
     * Get Creation method. Valid values: user, compliancePack, and system. 
     * @return CreateByType Creation method. Valid values: user, compliancePack, and system.
     */
    public String getCreateByType() {
        return this.CreateByType;
    }

    /**
     * Set Creation method. Valid values: user, compliancePack, and system.
     * @param CreateByType Creation method. Valid values: user, compliancePack, and system.
     */
    public void setCreateByType(String CreateByType) {
        this.CreateByType = CreateByType;
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
     * Get Parameter description 
     * @return ManageInputParameter Parameter description
     */
    public InputParameterForManage [] getManageInputParameter() {
        return this.ManageInputParameter;
    }

    /**
     * Set Parameter description
     * @param ManageInputParameter Parameter description
     */
    public void setManageInputParameter(InputParameterForManage [] ManageInputParameter) {
        this.ManageInputParameter = ManageInputParameter;
    }

    public ComplianceConfigRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceConfigRule(ComplianceConfigRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
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
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.CreateByType != null) {
            this.CreateByType = new String(source.CreateByType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ManageInputParameter != null) {
            this.ManageInputParameter = new InputParameterForManage[source.ManageInputParameter.length];
            for (int i = 0; i < source.ManageInputParameter.length; i++) {
                this.ManageInputParameter[i] = new InputParameterForManage(source.ManageInputParameter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamArrayObj(map, prefix + "SourceCondition.", this.SourceCondition);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "CreateByType", this.CreateByType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ManageInputParameter.", this.ManageInputParameter);

    }
}

