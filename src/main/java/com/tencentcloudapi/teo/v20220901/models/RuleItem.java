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

public class RuleItem extends AbstractModel {

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name. The name string must be 1 to 255 characters in length.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: disabled. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule content.
    */
    @SerializedName("Rules")
    @Expose
    private Rule [] Rules;

    /**
    * Rule priority. A larger value indicates higher priority. Minimum value: 1.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * Rule tag.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

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
     * Get Rule name. The name string must be 1 to 255 characters in length. 
     * @return RuleName Rule name. The name string must be 1 to 255 characters in length.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. The name string must be 1 to 255 characters in length.
     * @param RuleName Rule name. The name string must be 1 to 255 characters in length.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: disabled. </li> 
     * @return Status Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: disabled. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: disabled. </li>
     * @param Status Rule status. Valid values:
<li> enable: enable; </li>
<li> disable: disabled. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Rule priority. A larger value indicates higher priority. Minimum value: 1. 
     * @return RulePriority Rule priority. A larger value indicates higher priority. Minimum value: 1.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set Rule priority. A larger value indicates higher priority. Minimum value: 1.
     * @param RulePriority Rule priority. A larger value indicates higher priority. Minimum value: 1.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
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

    public RuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleItem(RuleItem source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Rules != null) {
            this.Rules = new Rule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new Rule(source.Rules[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
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
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

