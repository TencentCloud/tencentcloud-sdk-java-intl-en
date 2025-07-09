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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIsolatedInstancesRequest extends AbstractModel {

    /**
    * Number of returned results. the default value is 20. the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Record offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. valid values:.
<Li>CREATETIME: creation time</li>.
<li> PERIODENDTIME: expiration time</li>.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting type. value range:.
<Li>ASC: specifies ascending sort.</li>.
<li> DESC: sorts in descending order. </li>.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Search criteria. when multiple filters exist, the relationship between filters is logical AND.
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
    * Engine type: currently supports "MYSQL", "POSTGRESQL".
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
     * Get Number of returned results. the default value is 20. the maximum value is 100. 
     * @return Limit Number of returned results. the default value is 20. the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. the default value is 20. the maximum value is 100.
     * @param Limit Number of returned results. the default value is 20. the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Record offset. default value: 0. 
     * @return Offset Record offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. default value: 0.
     * @param Offset Record offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. valid values:.
<Li>CREATETIME: creation time</li>.
<li> PERIODENDTIME: expiration time</li>. 
     * @return OrderBy Sorting field. valid values:.
<Li>CREATETIME: creation time</li>.
<li> PERIODENDTIME: expiration time</li>.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. valid values:.
<Li>CREATETIME: creation time</li>.
<li> PERIODENDTIME: expiration time</li>.
     * @param OrderBy Sorting field. valid values:.
<Li>CREATETIME: creation time</li>.
<li> PERIODENDTIME: expiration time</li>.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting type. value range:.
<Li>ASC: specifies ascending sort.</li>.
<li> DESC: sorts in descending order. </li>. 
     * @return OrderByType Sorting type. value range:.
<Li>ASC: specifies ascending sort.</li>.
<li> DESC: sorts in descending order. </li>.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting type. value range:.
<Li>ASC: specifies ascending sort.</li>.
<li> DESC: sorts in descending order. </li>.
     * @param OrderByType Sorting type. value range:.
<Li>ASC: specifies ascending sort.</li>.
<li> DESC: sorts in descending order. </li>.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Search criteria. when multiple filters exist, the relationship between filters is logical AND. 
     * @return Filters Search criteria. when multiple filters exist, the relationship between filters is logical AND.
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Search criteria. when multiple filters exist, the relationship between filters is logical AND.
     * @param Filters Search criteria. when multiple filters exist, the relationship between filters is logical AND.
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Engine type: currently supports "MYSQL", "POSTGRESQL". 
     * @return DbType Engine type: currently supports "MYSQL", "POSTGRESQL".
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Engine type: currently supports "MYSQL", "POSTGRESQL".
     * @param DbType Engine type: currently supports "MYSQL", "POSTGRESQL".
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    public DescribeIsolatedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIsolatedInstancesRequest(DescribeIsolatedInstancesRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new QueryFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryFilter(source.Filters[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DbType", this.DbType);

    }
}

