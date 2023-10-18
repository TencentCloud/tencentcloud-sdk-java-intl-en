/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ModifyAuditRuleTemplatesRequest extends AbstractModel {

    /**
    * Audit rule template ID
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * Audit rule after modification
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * New name of the rule template
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * New description of the rule template
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Audit rule template ID 
     * @return RuleTemplateIds Audit rule template ID
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set Audit rule template ID
     * @param RuleTemplateIds Audit rule template ID
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get Audit rule after modification 
     * @return RuleFilters Audit rule after modification
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set Audit rule after modification
     * @param RuleFilters Audit rule after modification
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get New name of the rule template 
     * @return RuleTemplateName New name of the rule template
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set New name of the rule template
     * @param RuleTemplateName New name of the rule template
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get New description of the rule template 
     * @return Description New description of the rule template
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New description of the rule template
     * @param Description New description of the rule template
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyAuditRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuditRuleTemplatesRequest(ModifyAuditRuleTemplatesRequest source) {
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

