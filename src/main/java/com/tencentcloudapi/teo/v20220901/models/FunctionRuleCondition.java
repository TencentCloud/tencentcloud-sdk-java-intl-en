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

public class FunctionRuleCondition extends AbstractModel {

    /**
    * Condition of a trigger rule for an edge function. This condition is considered met if all items in the list are met.
    */
    @SerializedName("RuleConditions")
    @Expose
    private RuleCondition [] RuleConditions;

    /**
     * Get Condition of a trigger rule for an edge function. This condition is considered met if all items in the list are met. 
     * @return RuleConditions Condition of a trigger rule for an edge function. This condition is considered met if all items in the list are met.
     */
    public RuleCondition [] getRuleConditions() {
        return this.RuleConditions;
    }

    /**
     * Set Condition of a trigger rule for an edge function. This condition is considered met if all items in the list are met.
     * @param RuleConditions Condition of a trigger rule for an edge function. This condition is considered met if all items in the list are met.
     */
    public void setRuleConditions(RuleCondition [] RuleConditions) {
        this.RuleConditions = RuleConditions;
    }

    public FunctionRuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionRuleCondition(FunctionRuleCondition source) {
        if (source.RuleConditions != null) {
            this.RuleConditions = new RuleCondition[source.RuleConditions.length];
            for (int i = 0; i < source.RuleConditions.length; i++) {
                this.RuleConditions[i] = new RuleCondition(source.RuleConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleConditions.", this.RuleConditions);

    }
}

