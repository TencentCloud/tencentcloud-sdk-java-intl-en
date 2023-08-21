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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of returned results. Default value: `20`. Maximum value: `100`,
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Record offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Valid values:
<li> CREATETIME: Creation time</li>
<li> PERIODENDTIME: Expiration time</li>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values:
<li> `ASC`: Ascending.</li>
<li> `DESC`: Descending</li>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Filter. If there are more than one filter, the logical relationship between these filters is `AND`.
    */
    @SerializedName("Filters")
    @Expose
    private QueryParamFilter [] Filters;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Number of returned results. Default value: `20`. Maximum value: `100`, 
     * @return Limit Number of returned results. Default value: `20`. Maximum value: `100`,
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: `20`. Maximum value: `100`,
     * @param Limit Number of returned results. Default value: `20`. Maximum value: `100`,
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Record offset. Default value: `0`. 
     * @return Offset Record offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Default value: `0`.
     * @param Offset Record offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Valid values:
<li> CREATETIME: Creation time</li>
<li> PERIODENDTIME: Expiration time</li> 
     * @return OrderBy Sorting field. Valid values:
<li> CREATETIME: Creation time</li>
<li> PERIODENDTIME: Expiration time</li>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values:
<li> CREATETIME: Creation time</li>
<li> PERIODENDTIME: Expiration time</li>
     * @param OrderBy Sorting field. Valid values:
<li> CREATETIME: Creation time</li>
<li> PERIODENDTIME: Expiration time</li>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values:
<li> `ASC`: Ascending.</li>
<li> `DESC`: Descending</li> 
     * @return OrderByType Sorting order. Valid values:
<li> `ASC`: Ascending.</li>
<li> `DESC`: Descending</li>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values:
<li> `ASC`: Ascending.</li>
<li> `DESC`: Descending</li>
     * @param OrderByType Sorting order. Valid values:
<li> `ASC`: Ascending.</li>
<li> `DESC`: Descending</li>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Filter. If there are more than one filter, the logical relationship between these filters is `AND`. 
     * @return Filters Filter. If there are more than one filter, the logical relationship between these filters is `AND`.
     */
    public QueryParamFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. If there are more than one filter, the logical relationship between these filters is `AND`.
     * @param Filters Filter. If there are more than one filter, the logical relationship between these filters is `AND`.
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

