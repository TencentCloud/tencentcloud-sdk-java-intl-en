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

public class DescribeBackupSummariesRequest extends AbstractModel {

    /**
    * The maximum number of results returned per page. Value range: 1-100. Default: `10`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset, which starts from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting field, supports TotalBackupSize - total size of backups, LogBackupSize - size of backup logs, ManualBaseBackupSize - size of manual backup data, AutoBaseBackupSize - size of automatic data backup. if this parameter is not input, no sorting is performed by default.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

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
     * Get Data offset, which starts from 0. 
     * @return Offset Data offset, which starts from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset, which starts from 0.
     * @param Offset Data offset, which starts from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type). 
     * @return Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
     * @param Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field, supports TotalBackupSize - total size of backups, LogBackupSize - size of backup logs, ManualBaseBackupSize - size of manual backup data, AutoBaseBackupSize - size of automatic data backup. if this parameter is not input, no sorting is performed by default. 
     * @return OrderBy Sorting field, supports TotalBackupSize - total size of backups, LogBackupSize - size of backup logs, ManualBaseBackupSize - size of manual backup data, AutoBaseBackupSize - size of automatic data backup. if this parameter is not input, no sorting is performed by default.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field, supports TotalBackupSize - total size of backups, LogBackupSize - size of backup logs, ManualBaseBackupSize - size of manual backup data, AutoBaseBackupSize - size of automatic data backup. if this parameter is not input, no sorting is performed by default.
     * @param OrderBy Sorting field, supports TotalBackupSize - total size of backups, LogBackupSize - size of backup logs, ManualBaseBackupSize - size of manual backup data, AutoBaseBackupSize - size of automatic data backup. if this parameter is not input, no sorting is performed by default.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`. 
     * @return OrderByType Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
     * @param OrderByType Sorting method, including ascending: `asc` and descending: `desc`. the default value is `asc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBackupSummariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupSummariesRequest(DescribeBackupSummariesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

