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

public class DescribeBaseBackupsRequest extends AbstractModel {

    /**
    * Minimum end time of a backup in the format of `2018-01-01 00:00:00`. It is 7 days ago by default.
    */
    @SerializedName("MinFinishTime")
    @Expose
    private String MinFinishTime;

    /**
    * Maximum end time of a backup in the format of `2018-01-01 00:00:00`. It is the current time by default.
    */
    @SerializedName("MaxFinishTime")
    @Expose
    private String MaxFinishTime;

    /**
    * Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
base-backup-id: filter by backup set id (in string format).
db-instance-status: filter by instance status (in string format). valid values refer to the DBInstanceStatus field in the DBInstance structure (https://www.tencentcloud.com/document/product/409/16778#dbinstance).
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
    * Data offset, which starts from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Specifies the sorting field, supports StartTime, FinishTime, and Size. default value: StartTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method, including ascending: `asc` and descending: `desc`. the default value is `desc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Minimum end time of a backup in the format of `2018-01-01 00:00:00`. It is 7 days ago by default. 
     * @return MinFinishTime Minimum end time of a backup in the format of `2018-01-01 00:00:00`. It is 7 days ago by default.
     */
    public String getMinFinishTime() {
        return this.MinFinishTime;
    }

    /**
     * Set Minimum end time of a backup in the format of `2018-01-01 00:00:00`. It is 7 days ago by default.
     * @param MinFinishTime Minimum end time of a backup in the format of `2018-01-01 00:00:00`. It is 7 days ago by default.
     */
    public void setMinFinishTime(String MinFinishTime) {
        this.MinFinishTime = MinFinishTime;
    }

    /**
     * Get Maximum end time of a backup in the format of `2018-01-01 00:00:00`. It is the current time by default. 
     * @return MaxFinishTime Maximum end time of a backup in the format of `2018-01-01 00:00:00`. It is the current time by default.
     */
    public String getMaxFinishTime() {
        return this.MaxFinishTime;
    }

    /**
     * Set Maximum end time of a backup in the format of `2018-01-01 00:00:00`. It is the current time by default.
     * @param MaxFinishTime Maximum end time of a backup in the format of `2018-01-01 00:00:00`. It is the current time by default.
     */
    public void setMaxFinishTime(String MaxFinishTime) {
        this.MaxFinishTime = MaxFinishTime;
    }

    /**
     * Get Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
base-backup-id: filter by backup set id (in string format).
db-instance-status: filter by instance status (in string format). valid values refer to the DBInstanceStatus field in the DBInstance structure (https://www.tencentcloud.com/document/product/409/16778#dbinstance). 
     * @return Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
base-backup-id: filter by backup set id (in string format).
db-instance-status: filter by instance status (in string format). valid values refer to the DBInstanceStatus field in the DBInstance structure (https://www.tencentcloud.com/document/product/409/16778#dbinstance).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
base-backup-id: filter by backup set id (in string format).
db-instance-status: filter by instance status (in string format). valid values refer to the DBInstanceStatus field in the DBInstance structure (https://www.tencentcloud.com/document/product/409/16778#dbinstance).
     * @param Filters Query using one or more filter criteria. filter criteria currently supported include:.
db-instance-id: filter by instance id (string type).
db-instance-name: specifies the instance name to filter by, supports fuzzy matching (string type).
db-instance-ip: specifies the instance VPC ip for filtering (string type).
base-backup-id: filter by backup set id (in string format).
db-instance-status: filter by instance status (in string format). valid values refer to the DBInstanceStatus field in the DBInstance structure (https://www.tencentcloud.com/document/product/409/16778#dbinstance).
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
     * Get Specifies the sorting field, supports StartTime, FinishTime, and Size. default value: StartTime. 
     * @return OrderBy Specifies the sorting field, supports StartTime, FinishTime, and Size. default value: StartTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Specifies the sorting field, supports StartTime, FinishTime, and Size. default value: StartTime.
     * @param OrderBy Specifies the sorting field, supports StartTime, FinishTime, and Size. default value: StartTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method, including ascending: `asc` and descending: `desc`. the default value is `desc`. 
     * @return OrderByType Sorting method, including ascending: `asc` and descending: `desc`. the default value is `desc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method, including ascending: `asc` and descending: `desc`. the default value is `desc`.
     * @param OrderByType Sorting method, including ascending: `asc` and descending: `desc`. the default value is `desc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBaseBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaseBackupsRequest(DescribeBaseBackupsRequest source) {
        if (source.MinFinishTime != null) {
            this.MinFinishTime = new String(source.MinFinishTime);
        }
        if (source.MaxFinishTime != null) {
            this.MaxFinishTime = new String(source.MaxFinishTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "MinFinishTime", this.MinFinishTime);
        this.setParamSimple(map, prefix + "MaxFinishTime", this.MaxFinishTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

