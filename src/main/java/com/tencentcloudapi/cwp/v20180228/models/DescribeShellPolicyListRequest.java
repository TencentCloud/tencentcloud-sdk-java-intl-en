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

public class DescribeShellPolicyListRequest extends AbstractModel {

    /**
    * Maximum number of entries. Default value: 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter parameters
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting column: [UpdateTime].
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Maximum number of entries. Default value: 10. 
     * @return Limit Maximum number of entries. Default value: 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries. Default value: 10.
     * @param Limit Maximum number of entries. Default value: 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter parameters 
     * @return Filters Filter parameters
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
     * @param Filters Filter parameters
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting Method: [ASC: Ascending Order, DESC: Descending Order] 
     * @return Order Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     * @param Order Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting column: [UpdateTime]. 
     * @return By Sorting column: [UpdateTime].
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting column: [UpdateTime].
     * @param By Sorting column: [UpdateTime].
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeShellPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShellPolicyListRequest(DescribeShellPolicyListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

