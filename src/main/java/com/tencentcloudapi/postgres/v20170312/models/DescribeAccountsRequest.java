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

public class DescribeAccountsRequest extends AbstractModel{

    /**
    * Instance ID in the format of postgres-6fego161
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Number of entries returned per page. Default value: 20. Value range: 1-100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number for data return in paged query. Pagination starts from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to sort by creation time or username. Valid values: `createTime` (sort by creation time), `name` (sort by username)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Whether returns are sorted in ascending or descending order. Valid values: `desc` (descending), `asc` (ascending)
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Instance ID in the format of postgres-6fego161 
     * @return DBInstanceId Instance ID in the format of postgres-6fego161
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-6fego161
     * @param DBInstanceId Instance ID in the format of postgres-6fego161
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Number of entries returned per page. Default value: 20. Value range: 1-100. 
     * @return Limit Number of entries returned per page. Default value: 20. Value range: 1-100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per page. Default value: 20. Value range: 1-100.
     * @param Limit Number of entries returned per page. Default value: 20. Value range: 1-100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number for data return in paged query. Pagination starts from 0 
     * @return Offset Page number for data return in paged query. Pagination starts from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number for data return in paged query. Pagination starts from 0
     * @param Offset Page number for data return in paged query. Pagination starts from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether to sort by creation time or username. Valid values: `createTime` (sort by creation time), `name` (sort by username) 
     * @return OrderBy Whether to sort by creation time or username. Valid values: `createTime` (sort by creation time), `name` (sort by username)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Whether to sort by creation time or username. Valid values: `createTime` (sort by creation time), `name` (sort by username)
     * @param OrderBy Whether to sort by creation time or username. Valid values: `createTime` (sort by creation time), `name` (sort by username)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Whether returns are sorted in ascending or descending order. Valid values: `desc` (descending), `asc` (ascending) 
     * @return OrderByType Whether returns are sorted in ascending or descending order. Valid values: `desc` (descending), `asc` (ascending)
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Whether returns are sorted in ascending or descending order. Valid values: `desc` (descending), `asc` (ascending)
     * @param OrderByType Whether returns are sorted in ascending or descending order. Valid values: `desc` (descending), `asc` (ascending)
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

