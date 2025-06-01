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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAllocationRuleRequest extends AbstractModel {

    /**
    * The edited sharing rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Edited sharing rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Public sharing policy types, enumeration values are as follows: 1 - custom sharing proportion 2 - proportional allocation 3 - allocation by proportion.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Edited share rules expression.
    */
    @SerializedName("RuleDetail")
    @Expose
    private AllocationRuleExpression RuleDetail;

    /**
    * Edited sharing proportion expression.
    */
    @SerializedName("RatioDetail")
    @Expose
    private AllocationRationExpression [] RatioDetail;

    /**
    * Month, which is the current month by default if not provided.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get The edited sharing rule ID. 
     * @return RuleId The edited sharing rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The edited sharing rule ID.
     * @param RuleId The edited sharing rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Edited sharing rule name. 
     * @return Name Edited sharing rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Edited sharing rule name.
     * @param Name Edited sharing rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Public sharing policy types, enumeration values are as follows: 1 - custom sharing proportion 2 - proportional allocation 3 - allocation by proportion. 
     * @return Type Public sharing policy types, enumeration values are as follows: 1 - custom sharing proportion 2 - proportional allocation 3 - allocation by proportion.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Public sharing policy types, enumeration values are as follows: 1 - custom sharing proportion 2 - proportional allocation 3 - allocation by proportion.
     * @param Type Public sharing policy types, enumeration values are as follows: 1 - custom sharing proportion 2 - proportional allocation 3 - allocation by proportion.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Edited share rules expression. 
     * @return RuleDetail Edited share rules expression.
     */
    public AllocationRuleExpression getRuleDetail() {
        return this.RuleDetail;
    }

    /**
     * Set Edited share rules expression.
     * @param RuleDetail Edited share rules expression.
     */
    public void setRuleDetail(AllocationRuleExpression RuleDetail) {
        this.RuleDetail = RuleDetail;
    }

    /**
     * Get Edited sharing proportion expression. 
     * @return RatioDetail Edited sharing proportion expression.
     */
    public AllocationRationExpression [] getRatioDetail() {
        return this.RatioDetail;
    }

    /**
     * Set Edited sharing proportion expression.
     * @param RatioDetail Edited sharing proportion expression.
     */
    public void setRatioDetail(AllocationRationExpression [] RatioDetail) {
        this.RatioDetail = RatioDetail;
    }

    /**
     * Get Month, which is the current month by default if not provided. 
     * @return Month Month, which is the current month by default if not provided.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month, which is the current month by default if not provided.
     * @param Month Month, which is the current month by default if not provided.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public ModifyAllocationRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllocationRuleRequest(ModifyAllocationRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
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
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "RuleDetail.", this.RuleDetail);
        this.setParamArrayObj(map, prefix + "RatioDetail.", this.RatioDetail);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

