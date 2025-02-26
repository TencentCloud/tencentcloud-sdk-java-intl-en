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

public class RuleBranch extends AbstractModel {

    /**
    * [Match condition](https://www.tencentcloud.com/document/product/1145/54759).
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * [Operations](Https://Cloud.Tencent.Com/Document/Product/1552/90438#C7bd7e02-9247-4a72-B0e4-11c27cadb198).<Br>Note: actions and subrules cannot both be empty.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Actions")
    @Expose
    private RuleEngineAction [] Actions;

    /**
    * List of sub-rules. multiple rules exist in this list and are executed sequentially from top to bottom.<br>note: subrules and actions cannot both be empty. currently, only one layer of subrules is supported.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("SubRules")
    @Expose
    private RuleEngineSubRule [] SubRules;

    /**
     * Get [Match condition](https://www.tencentcloud.com/document/product/1145/54759). 
     * @return Condition [Match condition](https://www.tencentcloud.com/document/product/1145/54759).
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set [Match condition](https://www.tencentcloud.com/document/product/1145/54759).
     * @param Condition [Match condition](https://www.tencentcloud.com/document/product/1145/54759).
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get [Operations](Https://Cloud.Tencent.Com/Document/Product/1552/90438#C7bd7e02-9247-4a72-B0e4-11c27cadb198).<Br>Note: actions and subrules cannot both be empty.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Actions [Operations](Https://Cloud.Tencent.Com/Document/Product/1552/90438#C7bd7e02-9247-4a72-B0e4-11c27cadb198).<Br>Note: actions and subrules cannot both be empty.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public RuleEngineAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set [Operations](Https://Cloud.Tencent.Com/Document/Product/1552/90438#C7bd7e02-9247-4a72-B0e4-11c27cadb198).<Br>Note: actions and subrules cannot both be empty.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Actions [Operations](Https://Cloud.Tencent.Com/Document/Product/1552/90438#C7bd7e02-9247-4a72-B0e4-11c27cadb198).<Br>Note: actions and subrules cannot both be empty.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setActions(RuleEngineAction [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get List of sub-rules. multiple rules exist in this list and are executed sequentially from top to bottom.<br>note: subrules and actions cannot both be empty. currently, only one layer of subrules is supported.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return SubRules List of sub-rules. multiple rules exist in this list and are executed sequentially from top to bottom.<br>note: subrules and actions cannot both be empty. currently, only one layer of subrules is supported.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public RuleEngineSubRule [] getSubRules() {
        return this.SubRules;
    }

    /**
     * Set List of sub-rules. multiple rules exist in this list and are executed sequentially from top to bottom.<br>note: subrules and actions cannot both be empty. currently, only one layer of subrules is supported.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param SubRules List of sub-rules. multiple rules exist in this list and are executed sequentially from top to bottom.<br>note: subrules and actions cannot both be empty. currently, only one layer of subrules is supported.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setSubRules(RuleEngineSubRule [] SubRules) {
        this.SubRules = SubRules;
    }

    public RuleBranch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleBranch(RuleBranch source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Actions != null) {
            this.Actions = new RuleEngineAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new RuleEngineAction(source.Actions[i]);
            }
        }
        if (source.SubRules != null) {
            this.SubRules = new RuleEngineSubRule[source.SubRules.length];
            for (int i = 0; i < source.SubRules.length; i++) {
                this.SubRules[i] = new RuleEngineSubRule(source.SubRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "SubRules.", this.SubRules);

    }
}

