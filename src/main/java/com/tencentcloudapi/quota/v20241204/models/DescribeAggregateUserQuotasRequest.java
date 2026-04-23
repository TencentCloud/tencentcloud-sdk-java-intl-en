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
package com.tencentcloudapi.quota.v20241204.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggregateUserQuotasRequest extends AbstractModel {

    /**
    * Member account. Can be empty. If empty, query the current account list.
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
    * sort
    */
    @SerializedName("Sort")
    @Expose
    private Sort [] Sort;

    /**
    * Product ID
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Quota dimension
    */
    @SerializedName("QuotaDimensions")
    @Expose
    private QuotaDimension [] QuotaDimensions;

    /**
     * Get Member account. Can be empty. If empty, query the current account list. 
     * @return MemberUins Member account. Can be empty. If empty, query the current account list.
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set Member account. Can be empty. If empty, query the current account list.
     * @param MemberUins Member account. Can be empty. If empty, query the current account list.
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get limit 
     * @return Limit limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit
     * @param Limit limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get offset 
     * @return Offset offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset
     * @param Offset offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter 
     * @return Filter Filter
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter
     * @param Filter Filter
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get sort 
     * @return Sort sort
     */
    public Sort [] getSort() {
        return this.Sort;
    }

    /**
     * Set sort
     * @param Sort sort
     */
    public void setSort(Sort [] Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Product ID 
     * @return ProductId Product ID
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID
     * @param ProductId Product ID
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Quota dimension 
     * @return QuotaDimensions Quota dimension
     */
    public QuotaDimension [] getQuotaDimensions() {
        return this.QuotaDimensions;
    }

    /**
     * Set Quota dimension
     * @param QuotaDimensions Quota dimension
     */
    public void setQuotaDimensions(QuotaDimension [] QuotaDimensions) {
        this.QuotaDimensions = QuotaDimensions;
    }

    public DescribeAggregateUserQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggregateUserQuotasRequest(DescribeAggregateUserQuotasRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Sort[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new Sort(source.Sort[i]);
            }
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.QuotaDimensions != null) {
            this.QuotaDimensions = new QuotaDimension[source.QuotaDimensions.length];
            for (int i = 0; i < source.QuotaDimensions.length; i++) {
                this.QuotaDimensions[i] = new QuotaDimension(source.QuotaDimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArrayObj(map, prefix + "QuotaDimensions.", this.QuotaDimensions);

    }
}

