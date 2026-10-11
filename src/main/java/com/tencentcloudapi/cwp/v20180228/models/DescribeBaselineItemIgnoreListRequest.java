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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineItemIgnoreListRequest extends AbstractModel {

    /**
    * Ignore rule ID.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Limit Entries, 10 by default, up to 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Request offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <li>CategoryId - int64 - Required or Not: No - Rule ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting order [ASC: ascending|DESC: descending]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Optional sorting column [ID]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Ignore rule ID. 
     * @return RuleID Ignore rule ID.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Ignore rule ID.
     * @param RuleID Ignore rule ID.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Limit Entries, 10 by default, up to 100 
     * @return Limit Limit Entries, 10 by default, up to 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit Entries, 10 by default, up to 100
     * @param Limit Limit Entries, 10 by default, up to 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Request offset. Default value: 0. 
     * @return Offset Request offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Request offset. Default value: 0.
     * @param Offset Request offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <li>CategoryId - int64 - Required or Not: No - Rule ID</li> 
     * @return Filters <li>CategoryId - int64 - Required or Not: No - Rule ID</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>CategoryId - int64 - Required or Not: No - Rule ID</li>
     * @param Filters <li>CategoryId - int64 - Required or Not: No - Rule ID</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting order [ASC: ascending|DESC: descending] 
     * @return Order Sorting order [ASC: ascending|DESC: descending]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order [ASC: ascending|DESC: descending]
     * @param Order Sorting order [ASC: ascending|DESC: descending]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Optional sorting column [ID] 
     * @return By Optional sorting column [ID]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Optional sorting column [ID]
     * @param By Optional sorting column [ID]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineItemIgnoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineItemIgnoreListRequest(DescribeBaselineItemIgnoreListRequest source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

