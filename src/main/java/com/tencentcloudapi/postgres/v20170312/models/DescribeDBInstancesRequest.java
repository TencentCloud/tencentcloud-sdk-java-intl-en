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

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * Filter instances using one or more criteria. Valid filter names:
db-instance-id: filter by instance ID (the filter value is a string)
db-instance-name: filter by instance name (the filter value is a string)
db-project-id: filter by project ID (the filter value is an integer)
db-pay-mode: filter by billing mode (the filter value is a string)
db-tag-key: filter by tag key (the filter value is a string)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The maximum number of results returned per page. Value range: 1-100. Default: `10`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Pagination offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting order. Valid values: `asc` (ascending), `desc` (descending)
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Filter instances using one or more criteria. Valid filter names:
db-instance-id: filter by instance ID (the filter value is a string)
db-instance-name: filter by instance name (the filter value is a string)
db-project-id: filter by project ID (the filter value is an integer)
db-pay-mode: filter by billing mode (the filter value is a string)
db-tag-key: filter by tag key (the filter value is a string) 
     * @return Filters Filter instances using one or more criteria. Valid filter names:
db-instance-id: filter by instance ID (the filter value is a string)
db-instance-name: filter by instance name (the filter value is a string)
db-project-id: filter by project ID (the filter value is an integer)
db-pay-mode: filter by billing mode (the filter value is a string)
db-tag-key: filter by tag key (the filter value is a string)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter instances using one or more criteria. Valid filter names:
db-instance-id: filter by instance ID (the filter value is a string)
db-instance-name: filter by instance name (the filter value is a string)
db-project-id: filter by project ID (the filter value is an integer)
db-pay-mode: filter by billing mode (the filter value is a string)
db-tag-key: filter by tag key (the filter value is a string)
     * @param Filters Filter instances using one or more criteria. Valid filter names:
db-instance-id: filter by instance ID (the filter value is a string)
db-instance-name: filter by instance name (the filter value is a string)
db-project-id: filter by project ID (the filter value is an integer)
db-pay-mode: filter by billing mode (the filter value is a string)
db-tag-key: filter by tag key (the filter value is a string)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The maximum number of results returned per page. Value range: 1-100. Default: `10` 
     * @return Limit The maximum number of results returned per page. Value range: 1-100. Default: `10`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of results returned per page. Value range: 1-100. Default: `10`
     * @param Limit The maximum number of results returned per page. Value range: 1-100. Default: `10`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime 
     * @return OrderBy Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
     * @param OrderBy Sorting metric, such as instance name or creation time. Valid values: DBInstanceId, CreateTime, Name, EndTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Pagination offset, starting from 0 
     * @return Offset Pagination offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0
     * @param Offset Pagination offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting order. Valid values: `asc` (ascending), `desc` (descending) 
     * @return OrderByType Sorting order. Valid values: `asc` (ascending), `desc` (descending)
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: `asc` (ascending), `desc` (descending)
     * @param OrderByType Sorting order. Valid values: `asc` (ascending), `desc` (descending)
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

