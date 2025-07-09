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

public class DescribeCCRuleListRequest extends AbstractModel {

    /**
    * Domain name of the API to be queried
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Capacity
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Currently supports sorting by ts_version
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Filter array. A name can be one of the following values: RuleID, ParamName, Url, Action, Method, Source, and Status.
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * asc or desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Domain name of the API to be queried 
     * @return Domain Domain name of the API to be queried
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the API to be queried
     * @param Domain Domain name of the API to be queried
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Capacity 
     * @return Limit Capacity
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Capacity
     * @param Limit Capacity
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Currently supports sorting by ts_version 
     * @return By Currently supports sorting by ts_version
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Currently supports sorting by ts_version
     * @param By Currently supports sorting by ts_version
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Filter array. A name can be one of the following values: RuleID, ParamName, Url, Action, Method, Source, and Status. 
     * @return Filters Filter array. A name can be one of the following values: RuleID, ParamName, Url, Action, Method, Source, and Status.
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter array. A name can be one of the following values: RuleID, ParamName, Url, Action, Method, Source, and Status.
     * @param Filters Filter array. A name can be one of the following values: RuleID, ParamName, Url, Action, Method, Source, and Status.
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get asc or desc 
     * @return Order asc or desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set asc or desc
     * @param Order asc or desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeCCRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCRuleListRequest(DescribeCCRuleListRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

