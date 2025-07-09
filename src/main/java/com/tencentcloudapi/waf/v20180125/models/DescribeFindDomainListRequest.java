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

public class DescribeFindDomainListRequest extends AbstractModel {

    /**
    * Pagination
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Capacity per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Whether to access WAF
    */
    @SerializedName("IsWafDomain")
    @Expose
    private String IsWafDomain;

    /**
    * Sort parameters
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting method
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Pagination 
     * @return Offset Pagination
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination
     * @param Offset Pagination
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Capacity per page 
     * @return Limit Capacity per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Capacity per page
     * @param Limit Capacity per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. 
     * @return Key Filter criteria.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Filter criteria.
     * @param Key Filter criteria.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Whether to access WAF 
     * @return IsWafDomain Whether to access WAF
     */
    public String getIsWafDomain() {
        return this.IsWafDomain;
    }

    /**
     * Set Whether to access WAF
     * @param IsWafDomain Whether to access WAF
     */
    public void setIsWafDomain(String IsWafDomain) {
        this.IsWafDomain = IsWafDomain;
    }

    /**
     * Get Sort parameters 
     * @return By Sort parameters
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort parameters
     * @param By Sort parameters
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting method 
     * @return Order Sorting method
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method
     * @param Order Sorting method
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeFindDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFindDomainListRequest(DescribeFindDomainListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.IsWafDomain != null) {
            this.IsWafDomain = new String(source.IsWafDomain);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "IsWafDomain", this.IsWafDomain);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

