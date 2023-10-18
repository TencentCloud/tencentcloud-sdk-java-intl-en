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

public class AuditRuleTemplateInfo extends AbstractModel {

    /**
    * Rule template ID
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private String RuleTemplateId;

    /**
    * Rule template name
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * Filter of the rule template
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * Description of a rule template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time of a rule template
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
     * Get Rule template ID 
     * @return RuleTemplateId Rule template ID
     */
    public String getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set Rule template ID
     * @param RuleTemplateId Rule template ID
     */
    public void setRuleTemplateId(String RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get Rule template name 
     * @return RuleTemplateName Rule template name
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set Rule template name
     * @param RuleTemplateName Rule template name
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get Filter of the rule template 
     * @return RuleFilters Filter of the rule template
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set Filter of the rule template
     * @param RuleFilters Filter of the rule template
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get Description of a rule template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description of a rule template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of a rule template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description of a rule template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time of a rule template 
     * @return CreateAt Creation time of a rule template
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set Creation time of a rule template
     * @param CreateAt Creation time of a rule template
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
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

    }
}

