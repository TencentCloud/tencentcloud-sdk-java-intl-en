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

public class DescribeOwaspRulesRequest extends AbstractModel {

    /**
    * Domain to be queried
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Page number, defaults to 0.
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
    * Specifies the field used to sort. valid values: RuleId, UpdateTime.
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
    * Specifies the criteria, support rule ID, rule type, rule description, CVE ID, rule Status, and threat level.
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
     * Get Page number, defaults to 0. 
     * @return Offset Page number, defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number, defaults to 0.
     * @param Offset Page number, defaults to 0.
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
     * Get Specifies the field used to sort. valid values: RuleId, UpdateTime. 
     * @return By Specifies the field used to sort. valid values: RuleId, UpdateTime.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Specifies the field used to sort. valid values: RuleId, UpdateTime.
     * @param By Specifies the field used to sort. valid values: RuleId, UpdateTime.
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
     * Get Specifies the criteria, support rule ID, rule type, rule description, CVE ID, rule Status, and threat level. 
     * @return Filters Specifies the criteria, support rule ID, rule type, rule description, CVE ID, rule Status, and threat level.
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Specifies the criteria, support rule ID, rule type, rule description, CVE ID, rule Status, and threat level.
     * @param Filters Specifies the criteria, support rule ID, rule type, rule description, CVE ID, rule Status, and threat level.
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeOwaspRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOwaspRulesRequest(DescribeOwaspRulesRequest source) {
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

