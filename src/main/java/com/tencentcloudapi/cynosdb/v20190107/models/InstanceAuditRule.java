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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditRule extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies whether it is a rule-based audit. true - rule-based audit; false - comprehensive audit.
    */
    @SerializedName("AuditRule")
    @Expose
    private Boolean AuditRule;

    /**
    * Specifies the audit rule details. valid when AuditRule=true.
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
    * Whether it is an audit policy.
    */
    @SerializedName("OldRule")
    @Expose
    private Boolean OldRule;

    /**
    * The rule template details of the instance application.
    */
    @SerializedName("RuleTemplates")
    @Expose
    private RuleTemplateInfo [] RuleTemplates;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies whether it is a rule-based audit. true - rule-based audit; false - comprehensive audit. 
     * @return AuditRule Specifies whether it is a rule-based audit. true - rule-based audit; false - comprehensive audit.
     */
    public Boolean getAuditRule() {
        return this.AuditRule;
    }

    /**
     * Set Specifies whether it is a rule-based audit. true - rule-based audit; false - comprehensive audit.
     * @param AuditRule Specifies whether it is a rule-based audit. true - rule-based audit; false - comprehensive audit.
     */
    public void setAuditRule(Boolean AuditRule) {
        this.AuditRule = AuditRule;
    }

    /**
     * Get Specifies the audit rule details. valid when AuditRule=true. 
     * @return AuditRuleFilters Specifies the audit rule details. valid when AuditRule=true.
     */
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set Specifies the audit rule details. valid when AuditRule=true.
     * @param AuditRuleFilters Specifies the audit rule details. valid when AuditRule=true.
     */
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    /**
     * Get Whether it is an audit policy. 
     * @return OldRule Whether it is an audit policy.
     */
    public Boolean getOldRule() {
        return this.OldRule;
    }

    /**
     * Set Whether it is an audit policy.
     * @param OldRule Whether it is an audit policy.
     */
    public void setOldRule(Boolean OldRule) {
        this.OldRule = OldRule;
    }

    /**
     * Get The rule template details of the instance application. 
     * @return RuleTemplates The rule template details of the instance application.
     */
    public RuleTemplateInfo [] getRuleTemplates() {
        return this.RuleTemplates;
    }

    /**
     * Set The rule template details of the instance application.
     * @param RuleTemplates The rule template details of the instance application.
     */
    public void setRuleTemplates(RuleTemplateInfo [] RuleTemplates) {
        this.RuleTemplates = RuleTemplates;
    }

    public InstanceAuditRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditRule(InstanceAuditRule source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditRule != null) {
            this.AuditRule = new Boolean(source.AuditRule);
        }
        if (source.AuditRuleFilters != null) {
            this.AuditRuleFilters = new AuditRuleFilters[source.AuditRuleFilters.length];
            for (int i = 0; i < source.AuditRuleFilters.length; i++) {
                this.AuditRuleFilters[i] = new AuditRuleFilters(source.AuditRuleFilters[i]);
            }
        }
        if (source.OldRule != null) {
            this.OldRule = new Boolean(source.OldRule);
        }
        if (source.RuleTemplates != null) {
            this.RuleTemplates = new RuleTemplateInfo[source.RuleTemplates.length];
            for (int i = 0; i < source.RuleTemplates.length; i++) {
                this.RuleTemplates[i] = new RuleTemplateInfo(source.RuleTemplates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditRule", this.AuditRule);
        this.setParamArrayObj(map, prefix + "AuditRuleFilters.", this.AuditRuleFilters);
        this.setParamSimple(map, prefix + "OldRule", this.OldRule);
        this.setParamArrayObj(map, prefix + "RuleTemplates.", this.RuleTemplates);

    }
}

