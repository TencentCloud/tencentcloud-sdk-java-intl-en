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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakageRulesRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Page turning support, read offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paging support, read length limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sort method, asc or desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Filter. The following values are allowed:
RuleId,Match_field,Name,Action,Status
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Page turning support, read offset 
     * @return Offset Page turning support, read offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page turning support, read offset
     * @param Offset Page turning support, read offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Paging support, read length limit 
     * @return Limit Paging support, read length limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paging support, read length limit
     * @param Limit Paging support, read length limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sort method, asc or desc 
     * @return Order Sort method, asc or desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort method, asc or desc
     * @param Order Sort method, asc or desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Filter. The following values are allowed:
RuleId,Match_field,Name,Action,Status 
     * @return Filters Filter. The following values are allowed:
RuleId,Match_field,Name,Action,Status
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. The following values are allowed:
RuleId,Match_field,Name,Action,Status
     * @param Filters Filter. The following values are allowed:
RuleId,Match_field,Name,Action,Status
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAntiInfoLeakageRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakageRulesRequest(DescribeAntiInfoLeakageRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

