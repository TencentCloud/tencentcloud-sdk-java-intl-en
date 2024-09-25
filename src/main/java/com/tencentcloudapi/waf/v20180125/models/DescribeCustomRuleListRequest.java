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

public class DescribeCustomRuleListRequest extends AbstractModel {

    /**
    * Domain name
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
    * Filter array. A name can be one of the following: RuleID, RuleName, and Match.
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
    * exp_ts or mod_ts
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Domain name list to query. This parameter is not required on the access control page.
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

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
     * Get Filter array. A name can be one of the following: RuleID, RuleName, and Match. 
     * @return Filters Filter array. A name can be one of the following: RuleID, RuleName, and Match.
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter array. A name can be one of the following: RuleID, RuleName, and Match.
     * @param Filters Filter array. A name can be one of the following: RuleID, RuleName, and Match.
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

    /**
     * Get exp_ts or mod_ts 
     * @return By exp_ts or mod_ts
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set exp_ts or mod_ts
     * @param By exp_ts or mod_ts
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Domain name list to query. This parameter is not required on the access control page. 
     * @return DomainList Domain name list to query. This parameter is not required on the access control page.
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set Domain name list to query. This parameter is not required on the access control page.
     * @param DomainList Domain name list to query. This parameter is not required on the access control page.
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    public DescribeCustomRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomRuleListRequest(DescribeCustomRuleListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

