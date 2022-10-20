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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafGroupDetail extends AbstractModel{

    /**
    * ID of the rule type.
    */
    @SerializedName("RuleTypeId")
    @Expose
    private Long RuleTypeId;

    /**
    * The rule type.
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * Description of the rule type.
    */
    @SerializedName("RuleTypeDesc")
    @Expose
    private String RuleTypeDesc;

    /**
    * List of rules.
    */
    @SerializedName("WafGroupRules")
    @Expose
    private WafGroupRule [] WafGroupRules;

    /**
    * The rule level.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * The rule action.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get ID of the rule type. 
     * @return RuleTypeId ID of the rule type.
     */
    public Long getRuleTypeId() {
        return this.RuleTypeId;
    }

    /**
     * Set ID of the rule type.
     * @param RuleTypeId ID of the rule type.
     */
    public void setRuleTypeId(Long RuleTypeId) {
        this.RuleTypeId = RuleTypeId;
    }

    /**
     * Get The rule type. 
     * @return RuleTypeName The rule type.
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set The rule type.
     * @param RuleTypeName The rule type.
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get Description of the rule type. 
     * @return RuleTypeDesc Description of the rule type.
     */
    public String getRuleTypeDesc() {
        return this.RuleTypeDesc;
    }

    /**
     * Set Description of the rule type.
     * @param RuleTypeDesc Description of the rule type.
     */
    public void setRuleTypeDesc(String RuleTypeDesc) {
        this.RuleTypeDesc = RuleTypeDesc;
    }

    /**
     * Get List of rules. 
     * @return WafGroupRules List of rules.
     */
    public WafGroupRule [] getWafGroupRules() {
        return this.WafGroupRules;
    }

    /**
     * Set List of rules.
     * @param WafGroupRules List of rules.
     */
    public void setWafGroupRules(WafGroupRule [] WafGroupRules) {
        this.WafGroupRules = WafGroupRules;
    }

    /**
     * Get The rule level. 
     * @return Level The rule level.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set The rule level.
     * @param Level The rule level.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get The rule action. 
     * @return Action The rule action.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The rule action.
     * @param Action The rule action.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public WafGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroupDetail(WafGroupDetail source) {
        if (source.RuleTypeId != null) {
            this.RuleTypeId = new Long(source.RuleTypeId);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.RuleTypeDesc != null) {
            this.RuleTypeDesc = new String(source.RuleTypeDesc);
        }
        if (source.WafGroupRules != null) {
            this.WafGroupRules = new WafGroupRule[source.WafGroupRules.length];
            for (int i = 0; i < source.WafGroupRules.length; i++) {
                this.WafGroupRules[i] = new WafGroupRule(source.WafGroupRules[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTypeId", this.RuleTypeId);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "RuleTypeDesc", this.RuleTypeDesc);
        this.setParamArrayObj(map, prefix + "WafGroupRules.", this.WafGroupRules);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

