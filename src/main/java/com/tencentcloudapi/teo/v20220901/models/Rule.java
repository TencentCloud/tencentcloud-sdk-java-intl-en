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

public class Rule extends AbstractModel {

    /**
    * Judgment condition for executing the feature.
Note: The feature can be executed if any condition in the array is met.
    */
    @SerializedName("Conditions")
    @Expose
    private RuleAndConditions [] Conditions;

    /**
    * Executed feature. Note: Actions and SubRules cannot be both empty.
    */
    @SerializedName("Actions")
    @Expose
    private Action [] Actions;

    /**
    * Nested rule. Note: SubRules and Actions cannot be both empty.
    */
    @SerializedName("SubRules")
    @Expose
    private SubRuleItem [] SubRules;

    /**
     * Get Judgment condition for executing the feature.
Note: The feature can be executed if any condition in the array is met. 
     * @return Conditions Judgment condition for executing the feature.
Note: The feature can be executed if any condition in the array is met.
     */
    public RuleAndConditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Judgment condition for executing the feature.
Note: The feature can be executed if any condition in the array is met.
     * @param Conditions Judgment condition for executing the feature.
Note: The feature can be executed if any condition in the array is met.
     */
    public void setConditions(RuleAndConditions [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Executed feature. Note: Actions and SubRules cannot be both empty. 
     * @return Actions Executed feature. Note: Actions and SubRules cannot be both empty.
     */
    public Action [] getActions() {
        return this.Actions;
    }

    /**
     * Set Executed feature. Note: Actions and SubRules cannot be both empty.
     * @param Actions Executed feature. Note: Actions and SubRules cannot be both empty.
     */
    public void setActions(Action [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Nested rule. Note: SubRules and Actions cannot be both empty. 
     * @return SubRules Nested rule. Note: SubRules and Actions cannot be both empty.
     */
    public SubRuleItem [] getSubRules() {
        return this.SubRules;
    }

    /**
     * Set Nested rule. Note: SubRules and Actions cannot be both empty.
     * @param SubRules Nested rule. Note: SubRules and Actions cannot be both empty.
     */
    public void setSubRules(SubRuleItem [] SubRules) {
        this.SubRules = SubRules;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.Conditions != null) {
            this.Conditions = new RuleAndConditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleAndConditions(source.Conditions[i]);
            }
        }
        if (source.Actions != null) {
            this.Actions = new Action[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Action(source.Actions[i]);
            }
        }
        if (source.SubRules != null) {
            this.SubRules = new SubRuleItem[source.SubRules.length];
            for (int i = 0; i < source.SubRules.length; i++) {
                this.SubRules[i] = new SubRuleItem(source.SubRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "SubRules.", this.SubRules);

    }
}

