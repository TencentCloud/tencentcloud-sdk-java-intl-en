/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeComplianceWhitelistItemListRequest extends AbstractModel {

    /**
    * Initial offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be obtained. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * List of asset types
    */
    @SerializedName("AssetTypeSet")
    @Expose
    private String [] AssetTypeSet;

    /**
    * Query filter
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting order. Valid values: `desc`, `asc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Initial offset. Default value: `0`. 
     * @return Offset Initial offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Initial offset. Default value: `0`.
     * @param Offset Initial offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be obtained. Default value: `10`. Maximum value: `100`. 
     * @return Limit Number of results to be obtained. Default value: `10`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be obtained. Default value: `10`. Maximum value: `100`.
     * @param Limit Number of results to be obtained. Default value: `10`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get List of asset types 
     * @return AssetTypeSet List of asset types
     */
    public String [] getAssetTypeSet() {
        return this.AssetTypeSet;
    }

    /**
     * Set List of asset types
     * @param AssetTypeSet List of asset types
     */
    public void setAssetTypeSet(String [] AssetTypeSet) {
        this.AssetTypeSet = AssetTypeSet;
    }

    /**
     * Get Query filter 
     * @return Filters Query filter
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter
     * @param Filters Query filter
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting order. Valid values: `desc`, `asc`. 
     * @return Order Sorting order. Valid values: `desc`, `asc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Valid values: `desc`, `asc`.
     * @param Order Sorting order. Valid values: `desc`, `asc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeComplianceWhitelistItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceWhitelistItemListRequest(DescribeComplianceWhitelistItemListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AssetTypeSet != null) {
            this.AssetTypeSet = new String[source.AssetTypeSet.length];
            for (int i = 0; i < source.AssetTypeSet.length; i++) {
                this.AssetTypeSet[i] = new String(source.AssetTypeSet[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AssetTypeSet.", this.AssetTypeSet);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

