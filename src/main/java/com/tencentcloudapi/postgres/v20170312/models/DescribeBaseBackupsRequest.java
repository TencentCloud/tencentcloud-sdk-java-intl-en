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
    * Filter instances by using one or more filters. Valid values:  `db-instance-idFilter` (filter by instance ID in string),  `db-instance-name` (filter by instance name in string),  `db-instance-ip` (filter by instance VPC IP address in string),  `base-backup-id` (filter by backup set ID in string), 
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
    * Sorting field. Valid values: `StartTime`, `FinishTime`, `Size`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: `asc` (ascending), `desc` (descending).
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
     * Get Filter instances by using one or more filters. Valid values:  `db-instance-idFilter` (filter by instance ID in string),  `db-instance-name` (filter by instance name in string),  `db-instance-ip` (filter by instance VPC IP address in string),  `base-backup-id` (filter by backup set ID in string),  
     * @return Filters Filter instances by using one or more filters. Valid values:  `db-instance-idFilter` (filter by instance ID in string),  `db-instance-name` (filter by instance name in string),  `db-instance-ip` (filter by instance VPC IP address in string),  `base-backup-id` (filter by backup set ID in string), 
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter instances by using one or more filters. Valid values:  `db-instance-idFilter` (filter by instance ID in string),  `db-instance-name` (filter by instance name in string),  `db-instance-ip` (filter by instance VPC IP address in string),  `base-backup-id` (filter by backup set ID in string), 
     * @param Filters Filter instances by using one or more filters. Valid values:  `db-instance-idFilter` (filter by instance ID in string),  `db-instance-name` (filter by instance name in string),  `db-instance-ip` (filter by instance VPC IP address in string),  `base-backup-id` (filter by backup set ID in string), 
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
     * Get Sorting field. Valid values: `StartTime`, `FinishTime`, `Size`. 
     * @return OrderBy Sorting field. Valid values: `StartTime`, `FinishTime`, `Size`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values: `StartTime`, `FinishTime`, `Size`.
     * @param OrderBy Sorting field. Valid values: `StartTime`, `FinishTime`, `Size`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `asc` (ascending), `desc` (descending). 
     * @return OrderByType Sorting order. Valid values: `asc` (ascending), `desc` (descending).
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: `asc` (ascending), `desc` (descending).
     * @param OrderByType Sorting order. Valid values: `asc` (ascending), `desc` (descending).
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

