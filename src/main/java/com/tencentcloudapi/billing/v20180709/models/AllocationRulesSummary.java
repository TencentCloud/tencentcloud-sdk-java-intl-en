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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationRulesSummary extends AbstractModel {

    /**
    * Add new sharing rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the sharing rule policy type. the enumeration values are as follows:.
1 - custom sharing proportion. 
2 - proportional allocation.
3 - allocation by proportion.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Sharing rule expression.
    */
    @SerializedName("RuleDetail")
    @Expose
    private AllocationRuleExpression RuleDetail;

    /**
    * Sharing proportion expression, allocation by proportion not passed.
    */
    @SerializedName("RatioDetail")
    @Expose
    private AllocationRationExpression [] RatioDetail;

    /**
     * Get Add new sharing rule name. 
     * @return Name Add new sharing rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Add new sharing rule name.
     * @param Name Add new sharing rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the sharing rule policy type. the enumeration values are as follows:.
1 - custom sharing proportion. 
2 - proportional allocation.
3 - allocation by proportion. 
     * @return Type Specifies the sharing rule policy type. the enumeration values are as follows:.
1 - custom sharing proportion. 
2 - proportional allocation.
3 - allocation by proportion.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Specifies the sharing rule policy type. the enumeration values are as follows:.
1 - custom sharing proportion. 
2 - proportional allocation.
3 - allocation by proportion.
     * @param Type Specifies the sharing rule policy type. the enumeration values are as follows:.
1 - custom sharing proportion. 
2 - proportional allocation.
3 - allocation by proportion.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Sharing rule expression. 
     * @return RuleDetail Sharing rule expression.
     */
    public AllocationRuleExpression getRuleDetail() {
        return this.RuleDetail;
    }

    /**
     * Set Sharing rule expression.
     * @param RuleDetail Sharing rule expression.
     */
    public void setRuleDetail(AllocationRuleExpression RuleDetail) {
        this.RuleDetail = RuleDetail;
    }

    /**
     * Get Sharing proportion expression, allocation by proportion not passed. 
     * @return RatioDetail Sharing proportion expression, allocation by proportion not passed.
     */
    public AllocationRationExpression [] getRatioDetail() {
        return this.RatioDetail;
    }

    /**
     * Set Sharing proportion expression, allocation by proportion not passed.
     * @param RatioDetail Sharing proportion expression, allocation by proportion not passed.
     */
    public void setRatioDetail(AllocationRationExpression [] RatioDetail) {
        this.RatioDetail = RatioDetail;
    }

    public AllocationRulesSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationRulesSummary(AllocationRulesSummary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RuleDetail != null) {
            this.RuleDetail = new AllocationRuleExpression(source.RuleDetail);
        }
        if (source.RatioDetail != null) {
            this.RatioDetail = new AllocationRationExpression[source.RatioDetail.length];
            for (int i = 0; i < source.RatioDetail.length; i++) {
                this.RatioDetail[i] = new AllocationRationExpression(source.RatioDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "RuleDetail.", this.RuleDetail);
        this.setParamArrayObj(map, prefix + "RatioDetail.", this.RatioDetail);

    }
}

