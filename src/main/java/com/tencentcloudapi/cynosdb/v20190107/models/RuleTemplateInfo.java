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

public class RuleTemplateInfo extends AbstractModel {

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
    * The rule content.
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * Alarm level. valid values: 1 (low risk), 2 (medium risk), 3 (high risk).
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Alarm policy. 0 - no alert, 1 - alert.
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private Long AlarmPolicy;

    /**
    * Rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get The rule content. 
     * @return RuleFilters The rule content.
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set The rule content.
     * @param RuleFilters The rule content.
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get Alarm level. valid values: 1 (low risk), 2 (medium risk), 3 (high risk). 
     * @return AlarmLevel Alarm level. valid values: 1 (low risk), 2 (medium risk), 3 (high risk).
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. valid values: 1 (low risk), 2 (medium risk), 3 (high risk).
     * @param AlarmLevel Alarm level. valid values: 1 (low risk), 2 (medium risk), 3 (high risk).
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Alarm policy. 0 - no alert, 1 - alert. 
     * @return AlarmPolicy Alarm policy. 0 - no alert, 1 - alert.
     */
    public Long getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set Alarm policy. 0 - no alert, 1 - alert.
     * @param AlarmPolicy Alarm policy. 0 - no alert, 1 - alert.
     */
    public void setAlarmPolicy(Long AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    /**
     * Get Rule description. 
     * @return Description Rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description.
     * @param Description Rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplateInfo(RuleTemplateInfo source) {
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
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

