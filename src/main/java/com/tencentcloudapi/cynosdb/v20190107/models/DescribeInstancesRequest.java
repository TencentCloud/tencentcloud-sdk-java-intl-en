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

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * Number of returns. Default value: 20. Value range: (0, 100].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Record offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Valid values:
<li> CREATETIME: creation time</li>
<li> PERIODENDTIME: Expiration time</li>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting type. Valid values:
<li> ASC: ascending order </li>
<li> DESC: sort in descending order </li>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Search criteria. When multiple filters exist, the relationship between filters is logical AND.
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
    * Engine type. Currently, `MYSQL` is supported.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Instance status. Available values:
creating
running
isolating
isolated
Recovering
offlining
offlined
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance ID list
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Cluster type. Value range: <li> CYNOSDB: transactional cluster </li><li> LIBRADB: analysis cluster </li><li> ALL: all </li>. Defaults to ALL.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get Number of returns. Default value: 20. Value range: (0, 100]. 
     * @return Limit Number of returns. Default value: 20. Value range: (0, 100].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. Default value: 20. Value range: (0, 100].
     * @param Limit Number of returns. Default value: 20. Value range: (0, 100].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Record offset. Default value: 0. 
     * @return Offset Record offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Default value: 0.
     * @param Offset Record offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Valid values:
<li> CREATETIME: creation time</li>
<li> PERIODENDTIME: Expiration time</li> 
     * @return OrderBy Sorting field. Valid values:
<li> CREATETIME: creation time</li>
<li> PERIODENDTIME: Expiration time</li>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values:
<li> CREATETIME: creation time</li>
<li> PERIODENDTIME: Expiration time</li>
     * @param OrderBy Sorting field. Valid values:
<li> CREATETIME: creation time</li>
<li> PERIODENDTIME: Expiration time</li>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting type. Valid values:
<li> ASC: ascending order </li>
<li> DESC: sort in descending order </li> 
     * @return OrderByType Sorting type. Valid values:
<li> ASC: ascending order </li>
<li> DESC: sort in descending order </li>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting type. Valid values:
<li> ASC: ascending order </li>
<li> DESC: sort in descending order </li>
     * @param OrderByType Sorting type. Valid values:
<li> ASC: ascending order </li>
<li> DESC: sort in descending order </li>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Search criteria. When multiple filters exist, the relationship between filters is logical AND. 
     * @return Filters Search criteria. When multiple filters exist, the relationship between filters is logical AND.
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Search criteria. When multiple filters exist, the relationship between filters is logical AND.
     * @param Filters Search criteria. When multiple filters exist, the relationship between filters is logical AND.
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Engine type. Currently, `MYSQL` is supported. 
     * @return DbType Engine type. Currently, `MYSQL` is supported.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Engine type. Currently, `MYSQL` is supported.
     * @param DbType Engine type. Currently, `MYSQL` is supported.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Instance status. Available values:
creating
running
isolating
isolated
Recovering
offlining
offlined 
     * @return Status Instance status. Available values:
creating
running
isolating
isolated
Recovering
offlining
offlined
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Available values:
creating
running
isolating
isolated
Recovering
offlining
offlined
     * @param Status Instance status. Available values:
creating
running
isolating
isolated
Recovering
offlining
offlined
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance ID list 
     * @return InstanceIds Instance ID list
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list
     * @param InstanceIds Instance ID list
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Cluster type. Value range: <li> CYNOSDB: transactional cluster </li><li> LIBRADB: analysis cluster </li><li> ALL: all </li>. Defaults to ALL. 
     * @return ClusterType Cluster type. Value range: <li> CYNOSDB: transactional cluster </li><li> LIBRADB: analysis cluster </li><li> ALL: all </li>. Defaults to ALL.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Value range: <li> CYNOSDB: transactional cluster </li><li> LIBRADB: analysis cluster </li><li> ALL: all </li>. Defaults to ALL.
     * @param ClusterType Cluster type. Value range: <li> CYNOSDB: transactional cluster </li><li> LIBRADB: analysis cluster </li><li> ALL: all </li>. Defaults to ALL.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

