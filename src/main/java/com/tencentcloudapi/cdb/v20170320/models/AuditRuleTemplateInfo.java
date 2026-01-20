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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditRuleTemplateInfo extends AbstractModel {

    /**
    * Rule template ID.
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private String RuleTemplateId;

    /**
    * Rule template name.
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * Filter conditions of the rule template.
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * Rule template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule template creation time.
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled.
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private Long AlarmPolicy;

    /**
    * Instances to which this rule template is applied.
    */
    @SerializedName("AffectedInstances")
    @Expose
    private String [] AffectedInstances;

    /**
    * Template status. Valid values: 0 - No task, 1 - modifying.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Template update time.
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
     * Get Rule template ID. 
     * @return RuleTemplateId Rule template ID.
     */
    public String getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set Rule template ID.
     * @param RuleTemplateId Rule template ID.
     */
    public void setRuleTemplateId(String RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get Rule template name. 
     * @return RuleTemplateName Rule template name.
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set Rule template name.
     * @param RuleTemplateName Rule template name.
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get Filter conditions of the rule template. 
     * @return RuleFilters Filter conditions of the rule template.
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set Filter conditions of the rule template.
     * @param RuleFilters Filter conditions of the rule template.
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get Rule template description. 
     * @return Description Rule template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule template description.
     * @param Description Rule template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule template creation time. 
     * @return CreateAt Rule template creation time.
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set Rule template creation time.
     * @param CreateAt Rule template creation time.
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk. 
     * @return AlarmLevel Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk.
     * @param AlarmLevel Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled. 
     * @return AlarmPolicy Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled.
     */
    public Long getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled.
     * @param AlarmPolicy Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled.
     */
    public void setAlarmPolicy(Long AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    /**
     * Get Instances to which this rule template is applied. 
     * @return AffectedInstances Instances to which this rule template is applied.
     */
    public String [] getAffectedInstances() {
        return this.AffectedInstances;
    }

    /**
     * Set Instances to which this rule template is applied.
     * @param AffectedInstances Instances to which this rule template is applied.
     */
    public void setAffectedInstances(String [] AffectedInstances) {
        this.AffectedInstances = AffectedInstances;
    }

    /**
     * Get Template status. Valid values: 0 - No task, 1 - modifying. 
     * @return Status Template status. Valid values: 0 - No task, 1 - modifying.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Template status. Valid values: 0 - No task, 1 - modifying.
     * @param Status Template status. Valid values: 0 - No task, 1 - modifying.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Template update time. 
     * @return UpdateAt Template update time.
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set Template update time.
     * @param UpdateAt Template update time.
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    public AuditRuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditRuleTemplateInfo(AuditRuleTemplateInfo source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new String(source.RuleTemplateId);
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.RuleFilters != null) {
            this.RuleFilters = new RuleFilters[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new RuleFilters(source.RuleFilters[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
        }
        if (source.AffectedInstances != null) {
            this.AffectedInstances = new String[source.AffectedInstances.length];
            for (int i = 0; i < source.AffectedInstances.length; i++) {
                this.AffectedInstances[i] = new String(source.AffectedInstances[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);
        this.setParamArraySimple(map, prefix + "AffectedInstances.", this.AffectedInstances);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);

    }
}

