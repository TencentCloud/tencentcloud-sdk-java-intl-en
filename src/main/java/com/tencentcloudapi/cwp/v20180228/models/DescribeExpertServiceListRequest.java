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

public class DescribeExpertServiceListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>Keyword - String - whether required: no - filter by keyword</li>
<li>Uuids - String - whether required: no - filter by host ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Number of items to be returned. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting step size
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort method
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: StartTime, EndTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter criteria
<li>Keyword - String - whether required: no - filter by keyword</li>
<li>Uuids - String - whether required: no - filter by host ID</li> 
     * @return Filters Filter criteria
<li>Keyword - String - whether required: no - filter by keyword</li>
<li>Uuids - String - whether required: no - filter by host ID</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Keyword - String - whether required: no - filter by keyword</li>
<li>Uuids - String - whether required: no - filter by host ID</li>
     * @param Filters Filter criteria
<li>Keyword - String - whether required: no - filter by keyword</li>
<li>Uuids - String - whether required: no - filter by host ID</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of items to be returned. The maximum value is 100. 
     * @return Limit Number of items to be returned. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. The maximum value is 100.
     * @param Limit Number of items to be returned. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting step size 
     * @return Offset Sorting step size
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Sorting step size
     * @param Offset Sorting step size
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort method 
     * @return Order Sort method
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort method
     * @param Order Sort method
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: StartTime, EndTime 
     * @return By Sorting field: StartTime, EndTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: StartTime, EndTime
     * @param By Sorting field: StartTime, EndTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeExpertServiceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExpertServiceListRequest(DescribeExpertServiceListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

