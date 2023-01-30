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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRegistryNamespaceListRequest extends AbstractModel{

    /**
    * Initial offset of the query. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned by the query. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query filter. The `Name` field can be "Namespace".
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
     * Get Initial offset of the query. Default value: `0`. 
     * @return Offset Initial offset of the query. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Initial offset of the query. Default value: `0`.
     * @param Offset Initial offset of the query. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned by the query. Default value: `10`. Maximum value: `100`. 
     * @return Limit Number of results to be returned by the query. Default value: `10`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned by the query. Default value: `10`. Maximum value: `100`.
     * @param Limit Number of results to be returned by the query. Default value: `10`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query filter. The `Name` field can be "Namespace". 
     * @return Filters Query filter. The `Name` field can be "Namespace".
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter. The `Name` field can be "Namespace".
     * @param Filters Query filter. The `Name` field can be "Namespace".
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImageRegistryNamespaceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRegistryNamespaceListRequest(DescribeImageRegistryNamespaceListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

