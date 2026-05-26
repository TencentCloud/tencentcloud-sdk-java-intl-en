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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReadOnlyGroupsRequest extends AbstractModel {

    /**
    * Query using one or more filter criteria. filter criteria currently supported include:.
db-master-instance-id: specifies the primary instance to filter by (in string format).
read-only-group-id: Filter by read-only group ID, type string.
Note: in the filter criteria of this parameter, db-master-instance-id must be specified.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Specifies the number of items per page. default value: 10. maximum value: 99.
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
    * Specifies the sorting basis for queries. currently supports: ROGroupId, CreateTime, Name. default value: CreateTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Specifies the sorting basis type for queries. currently supports: desc, asc. default value: asc.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Query using one or more filter criteria. filter criteria currently supported include:.
db-master-instance-id: specifies the primary instance to filter by (in string format).
read-only-group-id: Filter by read-only group ID, type string.
Note: in the filter criteria of this parameter, db-master-instance-id must be specified. 
     * @return Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-master-instance-id: specifies the primary instance to filter by (in string format).
read-only-group-id: Filter by read-only group ID, type string.
Note: in the filter criteria of this parameter, db-master-instance-id must be specified.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query using one or more filter criteria. filter criteria currently supported include:.
db-master-instance-id: specifies the primary instance to filter by (in string format).
read-only-group-id: Filter by read-only group ID, type string.
Note: in the filter criteria of this parameter, db-master-instance-id must be specified.
     * @param Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-master-instance-id: specifies the primary instance to filter by (in string format).
read-only-group-id: Filter by read-only group ID, type string.
Note: in the filter criteria of this parameter, db-master-instance-id must be specified.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specifies the number of items per page. default value: 10. maximum value: 99. 
     * @return PageSize Specifies the number of items per page. default value: 10. maximum value: 99.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of items per page. default value: 10. maximum value: 99.
     * @param PageSize Specifies the number of items per page. default value: 10. maximum value: 99.
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
     * Get Specifies the sorting basis for queries. currently supports: ROGroupId, CreateTime, Name. default value: CreateTime. 
     * @return OrderBy Specifies the sorting basis for queries. currently supports: ROGroupId, CreateTime, Name. default value: CreateTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Specifies the sorting basis for queries. currently supports: ROGroupId, CreateTime, Name. default value: CreateTime.
     * @param OrderBy Specifies the sorting basis for queries. currently supports: ROGroupId, CreateTime, Name. default value: CreateTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Specifies the sorting basis type for queries. currently supports: desc, asc. default value: asc. 
     * @return OrderByType Specifies the sorting basis type for queries. currently supports: desc, asc. default value: asc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Specifies the sorting basis type for queries. currently supports: desc, asc. default value: asc.
     * @param OrderByType Specifies the sorting basis type for queries. currently supports: desc, asc. default value: asc.
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

