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

public class Filter extends AbstractModel {

    /**
    * Max number of returned results
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting order. Values: `asc` (ascending), `desc` (descending).
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Specify the field used for sorting
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Filtered columns and content
    */
    @SerializedName("Filters")
    @Expose
    private WhereFilter [] Filters;

    /**
    * Start time of the query period. 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Max number of returned results 
     * @return Limit Max number of returned results
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Max number of returned results
     * @param Limit Max number of returned results
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query offset 
     * @return Offset Query offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query offset
     * @param Offset Query offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting order. Values: `asc` (ascending), `desc` (descending). 
     * @return Order Sorting order. Values: `asc` (ascending), `desc` (descending).
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Values: `asc` (ascending), `desc` (descending).
     * @param Order Sorting order. Values: `asc` (ascending), `desc` (descending).
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Specify the field used for sorting 
     * @return By Specify the field used for sorting
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Specify the field used for sorting
     * @param By Specify the field used for sorting
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Filtered columns and content 
     * @return Filters Filtered columns and content
     */
    public WhereFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtered columns and content
     * @param Filters Filtered columns and content
     */
    public void setFilters(WhereFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Start time of the query period.  
     * @return StartTime Start time of the query period. 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query period. 
     * @param StartTime Start time of the query period. 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query period. 
     * @return EndTime End time of the query period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query period.
     * @param EndTime End time of the query period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
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
        if (source.Filters != null) {
            this.Filters = new WhereFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new WhereFilter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

