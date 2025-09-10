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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOwaspWhiteRulesRequest extends AbstractModel {

    /**
    * Domain to be queried
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Paginate, defaults to 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Capacity per page. defaults to 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the field used to sort. valid values: CreateTime (creation time), UpdateTime (update time).
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting method. supports asc, desc.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Filter conditions, support RuleId: whitelist rule ID, Name: rule Name, RuleType: whitelist rule type, Status: rule enabling Status, ValidStatus: rule effective Status, TimerType: effective method, ID: specific whitelist ID, determine whether it is a rule ID or type ID based on RuleType.
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get Domain to be queried 
     * @return Domain Domain to be queried
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain to be queried
     * @param Domain Domain to be queried
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Paginate, defaults to 0. 
     * @return Offset Paginate, defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginate, defaults to 0.
     * @param Offset Paginate, defaults to 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Capacity per page. defaults to 10. 
     * @return Limit Capacity per page. defaults to 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Capacity per page. defaults to 10.
     * @param Limit Capacity per page. defaults to 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the field used to sort. valid values: CreateTime (creation time), UpdateTime (update time). 
     * @return By Specifies the field used to sort. valid values: CreateTime (creation time), UpdateTime (update time).
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Specifies the field used to sort. valid values: CreateTime (creation time), UpdateTime (update time).
     * @param By Specifies the field used to sort. valid values: CreateTime (creation time), UpdateTime (update time).
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting method. supports asc, desc. 
     * @return Order Sorting method. supports asc, desc.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method. supports asc, desc.
     * @param Order Sorting method. supports asc, desc.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Filter conditions, support RuleId: whitelist rule ID, Name: rule Name, RuleType: whitelist rule type, Status: rule enabling Status, ValidStatus: rule effective Status, TimerType: effective method, ID: specific whitelist ID, determine whether it is a rule ID or type ID based on RuleType. 
     * @return Filters Filter conditions, support RuleId: whitelist rule ID, Name: rule Name, RuleType: whitelist rule type, Status: rule enabling Status, ValidStatus: rule effective Status, TimerType: effective method, ID: specific whitelist ID, determine whether it is a rule ID or type ID based on RuleType.
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions, support RuleId: whitelist rule ID, Name: rule Name, RuleType: whitelist rule type, Status: rule enabling Status, ValidStatus: rule effective Status, TimerType: effective method, ID: specific whitelist ID, determine whether it is a rule ID or type ID based on RuleType.
     * @param Filters Filter conditions, support RuleId: whitelist rule ID, Name: rule Name, RuleType: whitelist rule type, Status: rule enabling Status, ValidStatus: rule effective Status, TimerType: effective method, ID: specific whitelist ID, determine whether it is a rule ID or type ID based on RuleType.
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeOwaspWhiteRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOwaspWhiteRulesRequest(DescribeOwaspWhiteRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

