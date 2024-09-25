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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakRulesRuleItem extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule Action Type
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Rule creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Detailed Rules
    */
    @SerializedName("Strategies")
    @Expose
    private DescribeAntiInfoLeakRulesStrategyItem [] Strategies;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule status 
     * @return Status Rule status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status
     * @param Status Rule status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule Action Type 
     * @return ActionType Rule Action Type
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Rule Action Type
     * @param ActionType Rule Action Type
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Rule creation time 
     * @return CreateTime Rule creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Rule creation time
     * @param CreateTime Rule creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Detailed Rules 
     * @return Strategies Detailed Rules
     */
    public DescribeAntiInfoLeakRulesStrategyItem [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set Detailed Rules
     * @param Strategies Detailed Rules
     */
    public void setStrategies(DescribeAntiInfoLeakRulesStrategyItem [] Strategies) {
        this.Strategies = Strategies;
    }

    public DescribeAntiInfoLeakRulesRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakRulesRuleItem(DescribeAntiInfoLeakRulesRuleItem source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new DescribeAntiInfoLeakRulesStrategyItem[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new DescribeAntiInfoLeakRulesStrategyItem(source.Strategies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);

    }
}

