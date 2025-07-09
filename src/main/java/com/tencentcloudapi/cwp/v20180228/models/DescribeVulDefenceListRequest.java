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

public class DescribeVulDefenceListRequest extends AbstractModel {

    /**
    * Filtering criteria: Level; Keywords
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Data offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Data limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting method (case insensitive): asc for ascending order; desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting column (strictly equal): PublishTime for release time
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filtering criteria: Level; Keywords 
     * @return Filters Filtering criteria: Level; Keywords
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria: Level; Keywords
     * @param Filters Filtering criteria: Level; Keywords
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data offset 
     * @return Offset Data offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset
     * @param Offset Data offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Data limit 
     * @return Limit Data limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Data limit
     * @param Limit Data limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting method (case insensitive): asc for ascending order; desc for descending order 
     * @return Order Sorting method (case insensitive): asc for ascending order; desc for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method (case insensitive): asc for ascending order; desc for descending order
     * @param Order Sorting method (case insensitive): asc for ascending order; desc for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting column (strictly equal): PublishTime for release time 
     * @return By Sorting column (strictly equal): PublishTime for release time
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting column (strictly equal): PublishTime for release time
     * @param By Sorting column (strictly equal): PublishTime for release time
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulDefenceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceListRequest(DescribeVulDefenceListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

