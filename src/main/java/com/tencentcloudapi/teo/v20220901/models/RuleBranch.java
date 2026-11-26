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

public class RuleBranch extends AbstractModel {

    /**
    * [Match condition](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d).
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * [Operate](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#c7bd7e02-9247-4a72-b0e4-11c27cadb198).<br>Note: Actions and SubRules cannot be empty at the same time.
    */
    @SerializedName("Actions")
    @Expose
    private RuleEngineAction [] Actions;

    /**
    * Sub-rule list. If there are multiple rules in the list, they are executed in order from top to bottom.<br>Note: SubRules and Actions cannot be empty at the same time. Currently only one level of SubRules is supported.
    */
    @SerializedName("SubRules")
    @Expose
    private RuleEngineSubRule [] SubRules;

    /**
     * Get [Match condition](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d). 
     * @return Condition [Match condition](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d).
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set [Match condition](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d).
     * @param Condition [Match condition](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d).
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get [Operate](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#c7bd7e02-9247-4a72-b0e4-11c27cadb198).<br>Note: Actions and SubRules cannot be empty at the same time. 
     * @return Actions [Operate](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#c7bd7e02-9247-4a72-b0e4-11c27cadb198).<br>Note: Actions and SubRules cannot be empty at the same time.
     */
    public RuleEngineAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set [Operate](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#c7bd7e02-9247-4a72-b0e4-11c27cadb198).<br>Note: Actions and SubRules cannot be empty at the same time.
     * @param Actions [Operate](https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#c7bd7e02-9247-4a72-b0e4-11c27cadb198).<br>Note: Actions and SubRules cannot be empty at the same time.
     */
    public void setActions(RuleEngineAction [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Sub-rule list. If there are multiple rules in the list, they are executed in order from top to bottom.<br>Note: SubRules and Actions cannot be empty at the same time. Currently only one level of SubRules is supported. 
     * @return SubRules Sub-rule list. If there are multiple rules in the list, they are executed in order from top to bottom.<br>Note: SubRules and Actions cannot be empty at the same time. Currently only one level of SubRules is supported.
     */
    public RuleEngineSubRule [] getSubRules() {
        return this.SubRules;
    }

    /**
     * Set Sub-rule list. If there are multiple rules in the list, they are executed in order from top to bottom.<br>Note: SubRules and Actions cannot be empty at the same time. Currently only one level of SubRules is supported.
     * @param SubRules Sub-rule list. If there are multiple rules in the list, they are executed in order from top to bottom.<br>Note: SubRules and Actions cannot be empty at the same time. Currently only one level of SubRules is supported.
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

