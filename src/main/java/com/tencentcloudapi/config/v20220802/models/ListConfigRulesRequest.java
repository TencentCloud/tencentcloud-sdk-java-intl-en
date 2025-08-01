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
    * Page limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort type. Descending: desc, Ascending: asc.
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * Risk level

1: High risk.
2: Medium risk.
3: Low risk.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * Rule status
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Evaluation result
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String [] ComplianceResult;

    /**
    * Name of the rule
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get Page limit 
     * @return Limit Page limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page limit
     * @param Limit Page limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort type. Descending: desc, Ascending: asc. 
     * @return OrderType Sort type. Descending: desc, Ascending: asc.
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sort type. Descending: desc, Ascending: asc.
     * @param OrderType Sort type. Descending: desc, Ascending: asc.
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Risk level

1: High risk.
2: Medium risk.
3: Low risk. 
     * @return RiskLevel Risk level

1: High risk.
2: Medium risk.
3: Low risk.
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level

1: High risk.
2: Medium risk.
3: Low risk.
     * @param RiskLevel Risk level

1: High risk.
2: Medium risk.
3: Low risk.
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Rule status 
     * @return State Rule status
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Rule status
     * @param State Rule status
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Evaluation result 
     * @return ComplianceResult Evaluation result
     */
    public String [] getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set Evaluation result
     * @param ComplianceResult Evaluation result
     */
    public void setComplianceResult(String [] ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get Name of the rule 
     * @return RuleName Name of the rule
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Name of the rule
     * @param RuleName Name of the rule
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

