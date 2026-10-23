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

public class DescribeProxiesRequest extends AbstractModel {

    /**
    * <p>Cluster ID (this parameter is required, for example, cynosdbmysql-2u2mh111).</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Number of returns. Default value: 20. Maximum value: 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Record offset. Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting field. Value range:</p><li> CREATETIME: creation time</li><li> PERIODENDTIME: expiration time</li>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting type. Value range:</p><li> ASC: ascending sort </li><li> DESC: sort in descending order </li>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * <p>Search criteria. If there are multiple Filters, the relationship between them is logical AND.<br>Description: This parameter currently only supports two filter conditions: Status and ProxyGroupId.</p>
    */
    @SerializedName("Filters")
    @Expose
    private QueryParamFilter [] Filters;

    /**
     * Get <p>Cluster ID (this parameter is required, for example, cynosdbmysql-2u2mh111).</p> 
     * @return ClusterId <p>Cluster ID (this parameter is required, for example, cynosdbmysql-2u2mh111).</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID (this parameter is required, for example, cynosdbmysql-2u2mh111).</p>
     * @param ClusterId <p>Cluster ID (this parameter is required, for example, cynosdbmysql-2u2mh111).</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Number of returns. Default value: 20. Maximum value: 100</p> 
     * @return Limit <p>Number of returns. Default value: 20. Maximum value: 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returns. Default value: 20. Maximum value: 100</p>
     * @param Limit <p>Number of returns. Default value: 20. Maximum value: 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Record offset. Default value: 0</p> 
     * @return Offset <p>Record offset. Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Record offset. Default value: 0</p>
     * @param Offset <p>Record offset. Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting field. Value range:</p><li> CREATETIME: creation time</li><li> PERIODENDTIME: expiration time</li> 
     * @return OrderBy <p>Sorting field. Value range:</p><li> CREATETIME: creation time</li><li> PERIODENDTIME: expiration time</li>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field. Value range:</p><li> CREATETIME: creation time</li><li> PERIODENDTIME: expiration time</li>
     * @param OrderBy <p>Sorting field. Value range:</p><li> CREATETIME: creation time</li><li> PERIODENDTIME: expiration time</li>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting type. Value range:</p><li> ASC: ascending sort </li><li> DESC: sort in descending order </li> 
     * @return OrderByType <p>Sorting type. Value range:</p><li> ASC: ascending sort </li><li> DESC: sort in descending order </li>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>Sorting type. Value range:</p><li> ASC: ascending sort </li><li> DESC: sort in descending order </li>
     * @param OrderByType <p>Sorting type. Value range:</p><li> ASC: ascending sort </li><li> DESC: sort in descending order </li>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get <p>Search criteria. If there are multiple Filters, the relationship between them is logical AND.<br>Description: This parameter currently only supports two filter conditions: Status and ProxyGroupId.</p> 
     * @return Filters <p>Search criteria. If there are multiple Filters, the relationship between them is logical AND.<br>Description: This parameter currently only supports two filter conditions: Status and ProxyGroupId.</p>
     */
    public QueryParamFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Search criteria. If there are multiple Filters, the relationship between them is logical AND.<br>Description: This parameter currently only supports two filter conditions: Status and ProxyGroupId.</p>
     * @param Filters <p>Search criteria. If there are multiple Filters, the relationship between them is logical AND.<br>Description: This parameter currently only supports two filter conditions: Status and ProxyGroupId.</p>
     */
    public void setFilters(QueryParamFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeProxiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesRequest(DescribeProxiesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        if (source.Filters != null) {
            this.Filters = new QueryParamFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryParamFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

