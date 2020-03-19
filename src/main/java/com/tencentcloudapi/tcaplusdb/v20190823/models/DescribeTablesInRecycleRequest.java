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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesInRecycleRequest extends AbstractModel{

    /**
    * ID of the cluster where the table to be queried resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of IDs of the table groups where the table to be queried resides
    */
    @SerializedName("TableGroupIds")
    @Expose
    private String [] TableGroupIds;

    /**
    * Filter. Valid values: TableName, TableInstanceId
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Query result offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned query results
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ID of the cluster where the table to be queried resides 
     * @return ClusterId ID of the cluster where the table to be queried resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where the table to be queried resides
     * @param ClusterId ID of the cluster where the table to be queried resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get List of IDs of the table groups where the table to be queried resides 
     * @return TableGroupIds List of IDs of the table groups where the table to be queried resides
     */
    public String [] getTableGroupIds() {
        return this.TableGroupIds;
    }

    /**
     * Set List of IDs of the table groups where the table to be queried resides
     * @param TableGroupIds List of IDs of the table groups where the table to be queried resides
     */
    public void setTableGroupIds(String [] TableGroupIds) {
        this.TableGroupIds = TableGroupIds;
    }

    /**
     * Get Filter. Valid values: TableName, TableInstanceId 
     * @return Filters Filter. Valid values: TableName, TableInstanceId
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Valid values: TableName, TableInstanceId
     * @param Filters Filter. Valid values: TableName, TableInstanceId
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query result offset 
     * @return Offset Query result offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query result offset
     * @param Offset Query result offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned query results 
     * @return Limit Number of returned query results
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned query results
     * @param Limit Number of returned query results
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "TableGroupIds.", this.TableGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

