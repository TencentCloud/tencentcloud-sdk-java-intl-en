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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkGroupsRequest extends AbstractModel {

    /**
    * IDs of working groups that are queried. If it is not filled in or is 0, this means no need for filtering.
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * Filter criteria. Only the fuzzy search according to working group names is supported. The key is workgroup-name.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity of returns. It is 20 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting fields, which support the following type: create-time
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting methods; desc means in order; asc means in reverse order; it is asc by default.
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
     * Get IDs of working groups that are queried. If it is not filled in or is 0, this means no need for filtering. 
     * @return WorkGroupId IDs of working groups that are queried. If it is not filled in or is 0, this means no need for filtering.
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set IDs of working groups that are queried. If it is not filled in or is 0, this means no need for filtering.
     * @param WorkGroupId IDs of working groups that are queried. If it is not filled in or is 0, this means no need for filtering.
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get Filter criteria. Only the fuzzy search according to working group names is supported. The key is workgroup-name. 
     * @return Filters Filter criteria. Only the fuzzy search according to working group names is supported. The key is workgroup-name.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. Only the fuzzy search according to working group names is supported. The key is workgroup-name.
     * @param Filters Filter criteria. Only the fuzzy search according to working group names is supported. The key is workgroup-name.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity of returns. It is 20 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 20 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 20 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 20 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting fields, which support the following type: create-time 
     * @return SortBy Sorting fields, which support the following type: create-time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting fields, which support the following type: create-time
     * @param SortBy Sorting fields, which support the following type: create-time
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting methods; desc means in order; asc means in reverse order; it is asc by default. 
     * @return Sorting Sorting methods; desc means in order; asc means in reverse order; it is asc by default.
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set Sorting methods; desc means in order; asc means in reverse order; it is asc by default.
     * @param Sorting Sorting methods; desc means in order; asc means in reverse order; it is asc by default.
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    public DescribeWorkGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkGroupsRequest(DescribeWorkGroupsRequest source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
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
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);

    }
}

