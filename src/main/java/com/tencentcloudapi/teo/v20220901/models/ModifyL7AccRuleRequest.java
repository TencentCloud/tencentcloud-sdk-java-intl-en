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

public class ModifyL7AccRuleRequest extends AbstractModel {

    /**
    * Zone id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Rules to be modified. you can first obtain the ruleid of the rule to be modified through the describel7accrules api, then pass in the modified rule content. the original rule content will be updated in an overriding manner.
    */
    @SerializedName("Rule")
    @Expose
    private RuleEngineItem Rule;

    /**
     * Get Zone id. 
     * @return ZoneId Zone id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.
     * @param ZoneId Zone id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Rules to be modified. you can first obtain the ruleid of the rule to be modified through the describel7accrules api, then pass in the modified rule content. the original rule content will be updated in an overriding manner. 
     * @return Rule Rules to be modified. you can first obtain the ruleid of the rule to be modified through the describel7accrules api, then pass in the modified rule content. the original rule content will be updated in an overriding manner.
     */
    public RuleEngineItem getRule() {
        return this.Rule;
    }

    /**
     * Set Rules to be modified. you can first obtain the ruleid of the rule to be modified through the describel7accrules api, then pass in the modified rule content. the original rule content will be updated in an overriding manner.
     * @param Rule Rules to be modified. you can first obtain the ruleid of the rule to be modified through the describel7accrules api, then pass in the modified rule content. the original rule content will be updated in an overriding manner.
     */
    public void setRule(RuleEngineItem Rule) {
        this.Rule = Rule;
    }

    public ModifyL7AccRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyL7AccRuleRequest(ModifyL7AccRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Rule != null) {
            this.Rule = new RuleEngineItem(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);

    }
}

