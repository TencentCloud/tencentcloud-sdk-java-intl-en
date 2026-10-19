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

public class CompliancePackRuleForManage extends AbstractModel {

    /**
    * <p>Unique rule ID.</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Risk level.</p><p>Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Compliance package rules.</p>
    */
    @SerializedName("CompliancePackRules")
    @Expose
    private CompliancePackRules [] CompliancePackRules;

    /**
    * <p>Rule number information.</p>
    */
    @SerializedName("Control")
    @Expose
    private Control [] Control;

    /**
    * <p>Resource type.</p>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
     * Get <p>Unique rule ID.</p> 
     * @return Identifier <p>Unique rule ID.</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>Unique rule ID.</p>
     * @param Identifier <p>Unique rule ID.</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
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
     * Get <p>Risk level.</p><p>Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p> 
     * @return RiskLevel <p>Risk level.</p><p>Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level.</p><p>Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p>
     * @param RiskLevel <p>Risk level.</p><p>Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Compliance package rules.</p> 
     * @return CompliancePackRules <p>Compliance package rules.</p>
     */
    public CompliancePackRules [] getCompliancePackRules() {
        return this.CompliancePackRules;
    }

    /**
     * Set <p>Compliance package rules.</p>
     * @param CompliancePackRules <p>Compliance package rules.</p>
     */
    public void setCompliancePackRules(CompliancePackRules [] CompliancePackRules) {
        this.CompliancePackRules = CompliancePackRules;
    }

    /**
     * Get <p>Rule number information.</p> 
     * @return Control <p>Rule number information.</p>
     */
    public Control [] getControl() {
        return this.Control;
    }

    /**
     * Set <p>Rule number information.</p>
     * @param Control <p>Rule number information.</p>
     */
    public void setControl(Control [] Control) {
        this.Control = Control;
    }

    /**
     * Get <p>Resource type.</p> 
     * @return ResourceTypes <p>Resource type.</p>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>Resource type.</p>
     * @param ResourceTypes <p>Resource type.</p>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    public CompliancePackRuleForManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePackRuleForManage(CompliancePackRuleForManage source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CompliancePackRules != null) {
            this.CompliancePackRules = new CompliancePackRules[source.CompliancePackRules.length];
            for (int i = 0; i < source.CompliancePackRules.length; i++) {
                this.CompliancePackRules[i] = new CompliancePackRules(source.CompliancePackRules[i]);
            }
        }
        if (source.Control != null) {
            this.Control = new Control[source.Control.length];
            for (int i = 0; i < source.Control.length; i++) {
                this.Control[i] = new Control(source.Control[i]);
            }
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "CompliancePackRules.", this.CompliancePackRules);
        this.setParamArrayObj(map, prefix + "Control.", this.Control);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);

    }
}

