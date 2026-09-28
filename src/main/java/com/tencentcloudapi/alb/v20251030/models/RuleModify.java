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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleModify extends AbstractModel {

    /**
    * Action list of the forwarding rule.
    */
    @SerializedName("Actions")
    @Expose
    private RuleAction [] Actions;

    /**
    * List of forward rule conditions.
    */
    @SerializedName("Conditions")
    @Expose
    private RuleCondition [] Conditions;

    /**
    * Priority. A smaller value indicates higher priority. Value range: 1-10000.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Forwarding rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get Action list of the forwarding rule. 
     * @return Actions Action list of the forwarding rule.
     */
    public RuleAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set Action list of the forwarding rule.
     * @param Actions Action list of the forwarding rule.
     */
    public void setActions(RuleAction [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get List of forward rule conditions. 
     * @return Conditions List of forward rule conditions.
     */
    public RuleCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set List of forward rule conditions.
     * @param Conditions List of forward rule conditions.
     */
    public void setConditions(RuleCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Priority. A smaller value indicates higher priority. Value range: 1-10000. 
     * @return Priority Priority. A smaller value indicates higher priority. Value range: 1-10000.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority. A smaller value indicates higher priority. Value range: 1-10000.
     * @param Priority Priority. A smaller value indicates higher priority. Value range: 1-10000.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters. 
     * @return RuleId Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     * @param RuleId Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Forwarding rule name. 
     * @return RuleName Forwarding rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Forwarding rule name.
     * @param RuleName Forwarding rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public RuleModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleModify(RuleModify source) {
        if (source.Actions != null) {
            this.Actions = new RuleAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new RuleAction(source.Actions[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new RuleCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleCondition(source.Conditions[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

