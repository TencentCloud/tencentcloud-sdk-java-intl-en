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

public class ListCompliancePacksRequest extends AbstractModel {

    /**
    * <p>Quantity.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Compliance package name.</p>
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * <p>Compliance package status. Valid values: ACTIVE (active) and NO_ACTIVE (inactive).</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Evaluation status. Valid values: &#39;COMPLIANT&#39 (compliant)<br>&#39;NON_COMPLIANT&#39 (non-compliant)</p>
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String [] ComplianceResult;

    /**
    * <p>Sorting type. Valid values: desc (descending) and asc (ascending).</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>Contains compliance pack rule statistical information</p><p>Enumeration values:</p><ul><li>1: Yes</li></ul>
    */
    @SerializedName("IncludeCompliancePackRuleResult")
    @Expose
    private String IncludeCompliancePackRuleResult;

    /**
     * Get <p>Quantity.</p> 
     * @return Limit <p>Quantity.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Quantity.</p>
     * @param Limit <p>Quantity.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Compliance package name.</p> 
     * @return CompliancePackName <p>Compliance package name.</p>
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set <p>Compliance package name.</p>
     * @param CompliancePackName <p>Compliance package name.</p>
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p> 
     * @return RiskLevel <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
     * @param RiskLevel <p>Risk level. Valid values:<br>1: high-risk<br>2: medium-risk<br>3: low risk</p>
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Compliance package status. Valid values: ACTIVE (active) and NO_ACTIVE (inactive).</p> 
     * @return Status <p>Compliance package status. Valid values: ACTIVE (active) and NO_ACTIVE (inactive).</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Compliance package status. Valid values: ACTIVE (active) and NO_ACTIVE (inactive).</p>
     * @param Status <p>Compliance package status. Valid values: ACTIVE (active) and NO_ACTIVE (inactive).</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Evaluation status. Valid values: &#39;COMPLIANT&#39 (compliant)<br>&#39;NON_COMPLIANT&#39 (non-compliant)</p> 
     * @return ComplianceResult <p>Evaluation status. Valid values: &#39;COMPLIANT&#39 (compliant)<br>&#39;NON_COMPLIANT&#39 (non-compliant)</p>
     */
    public String [] getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set <p>Evaluation status. Valid values: &#39;COMPLIANT&#39 (compliant)<br>&#39;NON_COMPLIANT&#39 (non-compliant)</p>
     * @param ComplianceResult <p>Evaluation status. Valid values: &#39;COMPLIANT&#39 (compliant)<br>&#39;NON_COMPLIANT&#39 (non-compliant)</p>
     */
    public void setComplianceResult(String [] ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get <p>Sorting type. Valid values: desc (descending) and asc (ascending).</p> 
     * @return OrderType <p>Sorting type. Valid values: desc (descending) and asc (ascending).</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sorting type. Valid values: desc (descending) and asc (ascending).</p>
     * @param OrderType <p>Sorting type. Valid values: desc (descending) and asc (ascending).</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Contains compliance pack rule statistical information</p><p>Enumeration values:</p><ul><li>1: Yes</li></ul> 
     * @return IncludeCompliancePackRuleResult <p>Contains compliance pack rule statistical information</p><p>Enumeration values:</p><ul><li>1: Yes</li></ul>
     */
    public String getIncludeCompliancePackRuleResult() {
        return this.IncludeCompliancePackRuleResult;
    }

    /**
     * Set <p>Contains compliance pack rule statistical information</p><p>Enumeration values:</p><ul><li>1: Yes</li></ul>
     * @param IncludeCompliancePackRuleResult <p>Contains compliance pack rule statistical information</p><p>Enumeration values:</p><ul><li>1: Yes</li></ul>
     */
    public void setIncludeCompliancePackRuleResult(String IncludeCompliancePackRuleResult) {
        this.IncludeCompliancePackRuleResult = IncludeCompliancePackRuleResult;
    }

    public ListCompliancePacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCompliancePacksRequest(ListCompliancePacksRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long[source.RiskLevel.length];
            for (int i = 0; i < source.RiskLevel.length; i++) {
                this.RiskLevel[i] = new Long(source.RiskLevel[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String[source.ComplianceResult.length];
            for (int i = 0; i < source.ComplianceResult.length; i++) {
                this.ComplianceResult[i] = new String(source.ComplianceResult[i]);
            }
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.IncludeCompliancePackRuleResult != null) {
            this.IncludeCompliancePackRuleResult = new String(source.IncludeCompliancePackRuleResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ComplianceResult.", this.ComplianceResult);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "IncludeCompliancePackRuleResult", this.IncludeCompliancePackRuleResult);

    }
}

