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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebhookReceiverListRequest extends AbstractModel {

    /**
    * Pagination offset.
Valid values: [0, +∞)
Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page
Valid values: [1, 200]
Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria.
Supported filter items:
Name: Fuzzy search by robot name
Type: Robot type. Available values: WEBHOOK (webhook) / SCF (function)
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting field.
Enumeration values:
InsertTime: Creation time
UpdateTime: Update time
Default value: UpdateTime.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting method.
Enumeration values:
asc: Ascending
desc: Descending
Default value: desc
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Pagination offset.
Valid values: [0, +∞)
Default value: 0 
     * @return Offset Pagination offset.
Valid values: [0, +∞)
Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
Valid values: [0, +∞)
Default value: 0
     * @param Offset Pagination offset.
Valid values: [0, +∞)
Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page
Valid values: [1, 200]
Default value: 20 
     * @return Limit Number of results per page
Valid values: [1, 200]
Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
Valid values: [1, 200]
Default value: 20
     * @param Limit Number of results per page
Valid values: [1, 200]
Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria.
Supported filter items:
Name: Fuzzy search by robot name
Type: Robot type. Available values: WEBHOOK (webhook) / SCF (function) 
     * @return Filters Filter criteria.
Supported filter items:
Name: Fuzzy search by robot name
Type: Robot type. Available values: WEBHOOK (webhook) / SCF (function)
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.
Supported filter items:
Name: Fuzzy search by robot name
Type: Robot type. Available values: WEBHOOK (webhook) / SCF (function)
     * @param Filters Filter criteria.
Supported filter items:
Name: Fuzzy search by robot name
Type: Robot type. Available values: WEBHOOK (webhook) / SCF (function)
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field.
Enumeration values:
InsertTime: Creation time
UpdateTime: Update time
Default value: UpdateTime. 
     * @return Order Sorting field.
Enumeration values:
InsertTime: Creation time
UpdateTime: Update time
Default value: UpdateTime.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting field.
Enumeration values:
InsertTime: Creation time
UpdateTime: Update time
Default value: UpdateTime.
     * @param Order Sorting field.
Enumeration values:
InsertTime: Creation time
UpdateTime: Update time
Default value: UpdateTime.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting method.
Enumeration values:
asc: Ascending
desc: Descending
Default value: desc 
     * @return By Sorting method.
Enumeration values:
asc: Ascending
desc: Descending
Default value: desc
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting method.
Enumeration values:
asc: Ascending
desc: Descending
Default value: desc
     * @param By Sorting method.
Enumeration values:
asc: Ascending
desc: Descending
Default value: desc
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeWebhookReceiverListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebhookReceiverListRequest(DescribeWebhookReceiverListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

