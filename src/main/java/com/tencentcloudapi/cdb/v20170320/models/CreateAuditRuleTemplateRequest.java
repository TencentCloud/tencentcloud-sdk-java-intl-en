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

public class CreateAuditRuleTemplateRequest extends AbstractModel {

    /**
    * Audit rule.
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * Rule template name. Up to 30 characters are allowed.
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * Rule template description. Up to 200 characters are allowed.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk. Default value: 1.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled. Default value: 0.
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private Long AlarmPolicy;

    /**
     * Get Audit rule. 
     * @return RuleFilters Audit rule.
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set Audit rule.
     * @param RuleFilters Audit rule.
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get Rule template name. Up to 30 characters are allowed. 
     * @return RuleTemplateName Rule template name. Up to 30 characters are allowed.
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set Rule template name. Up to 30 characters are allowed.
     * @param RuleTemplateName Rule template name. Up to 30 characters are allowed.
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get Rule template description. Up to 200 characters are allowed. 
     * @return Description Rule template description. Up to 200 characters are allowed.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule template description. Up to 200 characters are allowed.
     * @param Description Rule template description. Up to 200 characters are allowed.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk. Default value: 1. 
     * @return AlarmLevel Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk. Default value: 1.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk. Default value: 1.
     * @param AlarmLevel Alarm level. Valid values: 1 - Low risk, 2 - Medium risk, 3 - High risk. Default value: 1.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled. Default value: 0. 
     * @return AlarmPolicy Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled. Default value: 0.
     */
    public Long getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled. Default value: 0.
     * @param AlarmPolicy Alarm policy. Valid values: 0 - Alarm disabled, 1 - Alarm enabled. Default value: 0.
     */
    public void setAlarmPolicy(Long AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    public CreateAuditRuleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditRuleTemplateRequest(CreateAuditRuleTemplateRequest source) {
        if (source.RuleFilters != null) {
            this.RuleFilters = new RuleFilters[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new RuleFilters(source.RuleFilters[i]);
            }
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);

    }
}

