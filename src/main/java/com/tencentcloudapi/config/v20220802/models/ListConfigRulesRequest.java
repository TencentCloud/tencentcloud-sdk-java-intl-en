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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListConfigRulesRequest extends AbstractModel {

    /**
    * Number of entries per page.
Valid values: 1-200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
Value range: minimum value is 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting type (rule name).
- desc: descending order.
asc: ascending order.
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * Risk level.
1: High-risk
2: Medium-risk,
3: Low risk.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * Rule Status.
ACTIVE: enable
UN_ACTIVE: Disabled

    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Assessment result.
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String [] ComplianceResult;

    /**
    * Rule Name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get Number of entries per page.
Valid values: 1-200 
     * @return Limit Number of entries per page.
Valid values: 1-200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
Valid values: 1-200
     * @param Limit Number of entries per page.
Valid values: 1-200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset.
Value range: minimum value is 0 
     * @return Offset Offset.
Value range: minimum value is 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
Value range: minimum value is 0
     * @param Offset Offset.
Value range: minimum value is 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting type (rule name).
- desc: descending order.
asc: ascending order. 
     * @return OrderType Sorting type (rule name).
- desc: descending order.
asc: ascending order.
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting type (rule name).
- desc: descending order.
asc: ascending order.
     * @param OrderType Sorting type (rule name).
- desc: descending order.
asc: ascending order.
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Risk level.
1: High-risk
2: Medium-risk,
3: Low risk. 
     * @return RiskLevel Risk level.
1: High-risk
2: Medium-risk,
3: Low risk.
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level.
1: High-risk
2: Medium-risk,
3: Low risk.
     * @param RiskLevel Risk level.
1: High-risk
2: Medium-risk,
3: Low risk.
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Rule Status.
ACTIVE: enable
UN_ACTIVE: Disabled
 
     * @return State Rule Status.
ACTIVE: enable
UN_ACTIVE: Disabled

     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Rule Status.
ACTIVE: enable
UN_ACTIVE: Disabled

     * @param State Rule Status.
ACTIVE: enable
UN_ACTIVE: Disabled

     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Assessment result.
COMPLIANT: compliant
NON_COMPLIANT: non-compliance 
     * @return ComplianceResult Assessment result.
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
     */
    public String [] getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set Assessment result.
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
     * @param ComplianceResult Assessment result.
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
     */
    public void setComplianceResult(String [] ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get Rule Name 
     * @return RuleName Rule Name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule Name
     * @param RuleName Rule Name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public ListConfigRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConfigRulesRequest(ListConfigRulesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long[source.RiskLevel.length];
            for (int i = 0; i < source.RiskLevel.length; i++) {
                this.RiskLevel[i] = new Long(source.RiskLevel[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String[source.ComplianceResult.length];
            for (int i = 0; i < source.ComplianceResult.length; i++) {
                this.ComplianceResult[i] = new String(source.ComplianceResult[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "ComplianceResult.", this.ComplianceResult);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

