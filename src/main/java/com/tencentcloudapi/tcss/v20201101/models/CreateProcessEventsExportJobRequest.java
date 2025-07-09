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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProcessEventsExportJobRequest extends AbstractModel {

    /**
    * Number of results to be returned. Maximum value: `10000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter parameter - status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: `latest_found_time`.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get Number of results to be returned. Maximum value: `10000`. 
     * @return Limit Number of results to be returned. Maximum value: `10000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Maximum value: `10000`.
     * @param Limit Number of results to be returned. Maximum value: `10000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter parameter - status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored). 
     * @return Filters Filter parameter - status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter - status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
     * @param Filters Filter parameter - status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Valid values: `asc`, `desc`. 
     * @return Order Valid values: `asc`, `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Valid values: `asc`, `desc`.
     * @param Order Valid values: `asc`, `desc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: `latest_found_time`. 
     * @return By Sorting field: `latest_found_time`.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: `latest_found_time`.
     * @param By Sorting field: `latest_found_time`.
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Export field 
     * @return ExportField Export field
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set Export field
     * @param ExportField Export field
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public CreateProcessEventsExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProcessEventsExportJobRequest(CreateProcessEventsExportJobRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
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
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

