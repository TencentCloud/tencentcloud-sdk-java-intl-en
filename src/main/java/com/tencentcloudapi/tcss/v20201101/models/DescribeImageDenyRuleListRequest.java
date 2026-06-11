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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageDenyRuleListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>RuleType - String - required: no - rule type RULE_RISK: risk, RULE_PRIVILEGE: privilege</li>
<li>EffectStatus- String - Required: No - Effective status IN_THE_TEST: Observing, IN_EFFECT: Active.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>Status - string - required: no - enabled Status: 0: enabled, 1: disabled.</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort Mode: DESC, ACS
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort field
EffectTime: Effective time; UpdateTime: Update time
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Top-positioning of Enabled Rules. true: Yes; false: No
    */
    @SerializedName("TopTurnOn")
    @Expose
    private Boolean TopTurnOn;

    /**
     * Get Filter criteria
<li>RuleType - String - required: no - rule type RULE_RISK: risk, RULE_PRIVILEGE: privilege</li>
<li>EffectStatus- String - Required: No - Effective status IN_THE_TEST: Observing, IN_EFFECT: Active.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>Status - string - required: no - enabled Status: 0: enabled, 1: disabled.</li> 
     * @return Filters Filter criteria
<li>RuleType - String - required: no - rule type RULE_RISK: risk, RULE_PRIVILEGE: privilege</li>
<li>EffectStatus- String - Required: No - Effective status IN_THE_TEST: Observing, IN_EFFECT: Active.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>Status - string - required: no - enabled Status: 0: enabled, 1: disabled.</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>RuleType - String - required: no - rule type RULE_RISK: risk, RULE_PRIVILEGE: privilege</li>
<li>EffectStatus- String - Required: No - Effective status IN_THE_TEST: Observing, IN_EFFECT: Active.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>Status - string - required: no - enabled Status: 0: enabled, 1: disabled.</li>
     * @param Filters Filter criteria
<li>RuleType - String - required: no - rule type RULE_RISK: risk, RULE_PRIVILEGE: privilege</li>
<li>EffectStatus- String - Required: No - Effective status IN_THE_TEST: Observing, IN_EFFECT: Active.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>Status - string - required: no - enabled Status: 0: enabled, 1: disabled.</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort Mode: DESC, ACS 
     * @return Order Sort Mode: DESC, ACS
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort Mode: DESC, ACS
     * @param Order Sort Mode: DESC, ACS
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort field
EffectTime: Effective time; UpdateTime: Update time 
     * @return By Sort field
EffectTime: Effective time; UpdateTime: Update time
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort field
EffectTime: Effective time; UpdateTime: Update time
     * @param By Sort field
EffectTime: Effective time; UpdateTime: Update time
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Top-positioning of Enabled Rules. true: Yes; false: No 
     * @return TopTurnOn Top-positioning of Enabled Rules. true: Yes; false: No
     */
    public Boolean getTopTurnOn() {
        return this.TopTurnOn;
    }

    /**
     * Set Top-positioning of Enabled Rules. true: Yes; false: No
     * @param TopTurnOn Top-positioning of Enabled Rules. true: Yes; false: No
     */
    public void setTopTurnOn(Boolean TopTurnOn) {
        this.TopTurnOn = TopTurnOn;
    }

    public DescribeImageDenyRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageDenyRuleListRequest(DescribeImageDenyRuleListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.TopTurnOn != null) {
            this.TopTurnOn = new Boolean(source.TopTurnOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "TopTurnOn", this.TopTurnOn);

    }
}

