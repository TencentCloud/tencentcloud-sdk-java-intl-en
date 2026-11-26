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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Rule name. The string name can contain 1–255 characters.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule content.
    */
    @SerializedName("Rules")
    @Expose
    private Rule [] Rules;

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: Disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule tag.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Rule name. The string name can contain 1–255 characters. 
     * @return RuleName Rule name. The string name can contain 1–255 characters.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. The string name can contain 1–255 characters.
     * @param RuleName Rule name. The string name can contain 1–255 characters.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule content. 
     * @return Rules Rule content.
     */
    public Rule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule content.
     * @param Rules Rule content.
     */
    public void setRules(Rule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Rule ID. 
     * @return RuleId Rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID.
     * @param RuleId Rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: Disabled.</li> 
     * @return Status Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: Disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: Disabled.</li>
     * @param Status Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: Disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule tag. 
     * @return Tags Rule tag.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Rule tag.
     * @param Tags Rule tag.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Rules != null) {
            this.Rules = new Rule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new Rule(source.Rules[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

