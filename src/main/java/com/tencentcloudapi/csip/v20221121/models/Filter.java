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
    * Query Quantity Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query Offset Position
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort by Ascending or Descending Order. Ascending: asc, Descending: desc.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Fields to Sort
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Filtered Columns and Content
    */
    @SerializedName("Filters")
    @Expose
    private WhereFilter [] Filters;

    /**
    * Can be left blank. Log usage query time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Can be left blank. Log usage query time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Query Quantity Limit 
     * @return Limit Query Quantity Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Query Quantity Limit
     * @param Limit Query Quantity Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query Offset Position 
     * @return Offset Query Offset Position
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query Offset Position
     * @param Offset Query Offset Position
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort by Ascending or Descending Order. Ascending: asc, Descending: desc. 
     * @return Order Sort by Ascending or Descending Order. Ascending: asc, Descending: desc.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort by Ascending or Descending Order. Ascending: asc, Descending: desc.
     * @param Order Sort by Ascending or Descending Order. Ascending: asc, Descending: desc.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Fields to Sort 
     * @return By Fields to Sort
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Fields to Sort
     * @param By Fields to Sort
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Filtered Columns and Content 
     * @return Filters Filtered Columns and Content
     */
    public WhereFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtered Columns and Content
     * @param Filters Filtered Columns and Content
     */
    public void setFilters(WhereFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Can be left blank. Log usage query time. 
     * @return StartTime Can be left blank. Log usage query time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Can be left blank. Log usage query time.
     * @param StartTime Can be left blank. Log usage query time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Can be left blank. Log usage query time. 
     * @return EndTime Can be left blank. Log usage query time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Can be left blank. Log usage query time.
     * @param EndTime Can be left blank. Log usage query time.
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

