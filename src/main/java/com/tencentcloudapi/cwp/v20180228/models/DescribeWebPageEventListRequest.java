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

public class DescribeWebPageEventListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>EventType - String - required: no - event type</li>
<li>EventStatus - String - required: no - event status</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting method: CreateTime or RestoreTime. Default value: CreateTime.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting method. 0: descending order. 1: ascending order. Default value: 0.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>EventType - String - required: no - event type</li>
<li>EventStatus - String - required: no - event status</li> 
     * @return Filters Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>EventType - String - required: no - event type</li>
<li>EventStatus - String - required: no - event status</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>EventType - String - required: no - event type</li>
<li>EventStatus - String - required: no - event status</li>
     * @param Filters Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>EventType - String - required: no - event type</li>
<li>EventStatus - String - required: no - event status</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting method: CreateTime or RestoreTime. Default value: CreateTime. 
     * @return By Sorting method: CreateTime or RestoreTime. Default value: CreateTime.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting method: CreateTime or RestoreTime. Default value: CreateTime.
     * @param By Sorting method: CreateTime or RestoreTime. Default value: CreateTime.
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting method. 0: descending order. 1: ascending order. Default value: 0. 
     * @return Order Sorting method. 0: descending order. 1: ascending order. Default value: 0.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method. 0: descending order. 1: ascending order. Default value: 0.
     * @param Order Sorting method. 0: descending order. 1: ascending order. Default value: 0.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public DescribeWebPageEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebPageEventListRequest(DescribeWebPageEventListRequest source) {
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
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
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

