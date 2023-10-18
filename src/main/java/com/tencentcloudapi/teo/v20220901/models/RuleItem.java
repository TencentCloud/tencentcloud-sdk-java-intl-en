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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleItem extends AbstractModel {

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * The rule name. It is a string that can contain 1–255 characters.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule status. Values:
<li>`enable`: Enabled</li>
<li>`disable`: Disabled</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The rule content.
    */
    @SerializedName("Rules")
    @Expose
    private Rule [] Rules;

    /**
    * The rule priority. The greater the value, the higher the priority. The minimum value is `1`.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * Tag of the rule.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get The rule ID. 
     * @return RuleId The rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
     * @param RuleId The rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The rule name. It is a string that can contain 1–255 characters. 
     * @return RuleName The rule name. It is a string that can contain 1–255 characters.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set The rule name. It is a string that can contain 1–255 characters.
     * @param RuleName The rule name. It is a string that can contain 1–255 characters.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule status. Values:
<li>`enable`: Enabled</li>
<li>`disable`: Disabled</li> 
     * @return Status Rule status. Values:
<li>`enable`: Enabled</li>
<li>`disable`: Disabled</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Values:
<li>`enable`: Enabled</li>
<li>`disable`: Disabled</li>
     * @param Status Rule status. Values:
<li>`enable`: Enabled</li>
<li>`disable`: Disabled</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The rule content. 
     * @return Rules The rule content.
     */
    public Rule [] getRules() {
        return this.Rules;
    }

    /**
     * Set The rule content.
     * @param Rules The rule content.
     */
    public void setRules(Rule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get The rule priority. The greater the value, the higher the priority. The minimum value is `1`. 
     * @return RulePriority The rule priority. The greater the value, the higher the priority. The minimum value is `1`.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set The rule priority. The greater the value, the higher the priority. The minimum value is `1`.
     * @param RulePriority The rule priority. The greater the value, the higher the priority. The minimum value is `1`.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get Tag of the rule. 
     * @return Tags Tag of the rule.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag of the rule.
     * @param Tags Tag of the rule.
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

