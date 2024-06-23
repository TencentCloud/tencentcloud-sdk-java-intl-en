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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleConfig extends AbstractModel {

    /**
    * Rule IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule Detection Range Type 1. Whole Table  2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Target Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetCondition")
    @Expose
    private String TargetCondition;

    /**
     * Get Rule IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleId Rule IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleId Rule IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule Detection Range Type 1. Whole Table  2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ConditionType Rule Detection Range Type 1. Whole Table  2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set Rule Detection Range Type 1. Whole Table  2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ConditionType Rule Detection Range Type 1. Whole Table  2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
    }

    /**
     * Get Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Condition Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Condition Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Target Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetCondition Target Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetCondition() {
        return this.TargetCondition;
    }

    /**
     * Set Target Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetCondition Target Detection Range Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetCondition(String TargetCondition) {
        this.TargetCondition = TargetCondition;
    }

    public RuleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleConfig(RuleConfig source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ConditionType != null) {
            this.ConditionType = new Long(source.ConditionType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TargetCondition != null) {
            this.TargetCondition = new String(source.TargetCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TargetCondition", this.TargetCondition);

    }
}

