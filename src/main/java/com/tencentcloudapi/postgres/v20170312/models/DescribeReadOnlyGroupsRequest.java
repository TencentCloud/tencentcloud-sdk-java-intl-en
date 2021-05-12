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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReadOnlyGroupsRequest extends AbstractModel{

    /**
    * Filter condition. The primary ID must be specified in the format of `db-master-instance-id` to filter results, or else `null` will be returned.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The number of results per page. Default value: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Specify which page is displayed. Default value: 1 (the first page).
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Sorting criterion. Valid values: `ROGroupId`, `CreateTime`, `Name`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: `desc`, `asc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Filter condition. The primary ID must be specified in the format of `db-master-instance-id` to filter results, or else `null` will be returned. 
     * @return Filters Filter condition. The primary ID must be specified in the format of `db-master-instance-id` to filter results, or else `null` will be returned.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. The primary ID must be specified in the format of `db-master-instance-id` to filter results, or else `null` will be returned.
     * @param Filters Filter condition. The primary ID must be specified in the format of `db-master-instance-id` to filter results, or else `null` will be returned.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The number of results per page. Default value: 10. 
     * @return PageSize The number of results per page. Default value: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of results per page. Default value: 10.
     * @param PageSize The number of results per page. Default value: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Specify which page is displayed. Default value: 1 (the first page). 
     * @return PageNumber Specify which page is displayed. Default value: 1 (the first page).
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Specify which page is displayed. Default value: 1 (the first page).
     * @param PageNumber Specify which page is displayed. Default value: 1 (the first page).
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Sorting criterion. Valid values: `ROGroupId`, `CreateTime`, `Name`. 
     * @return OrderBy Sorting criterion. Valid values: `ROGroupId`, `CreateTime`, `Name`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting criterion. Valid values: `ROGroupId`, `CreateTime`, `Name`.
     * @param OrderBy Sorting criterion. Valid values: `ROGroupId`, `CreateTime`, `Name`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `desc`, `asc`. 
     * @return OrderByType Sorting order. Valid values: `desc`, `asc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: `desc`, `asc`.
     * @param OrderByType Sorting order. Valid values: `desc`, `asc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeReadOnlyGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReadOnlyGroupsRequest(DescribeReadOnlyGroupsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

