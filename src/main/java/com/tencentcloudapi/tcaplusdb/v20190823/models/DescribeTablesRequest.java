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

public class DescribeTablesRequest extends AbstractModel{

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
    * Information list of tables to be queriedu200d. If you need to filter the tables, use the`Filter` parameter.
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

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
     * Get Information list of tables to be queriedu200d. If you need to filter the tables, use the`Filter` parameter. 
     * @return SelectedTables Information list of tables to be queriedu200d. If you need to filter the tables, use the`Filter` parameter.
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set Information list of tables to be queriedu200d. If you need to filter the tables, use the`Filter` parameter.
     * @param SelectedTables Information list of tables to be queriedu200d. If you need to filter the tables, use the`Filter` parameter.
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
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

    public DescribeTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesRequest(DescribeTablesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupIds != null) {
            this.TableGroupIds = new String[source.TableGroupIds.length];
            for (int i = 0; i < source.TableGroupIds.length; i++) {
                this.TableGroupIds[i] = new String(source.TableGroupIds[i]);
            }
        }
        if (source.SelectedTables != null) {
            this.SelectedTables = new SelectedTableInfoNew[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new SelectedTableInfoNew(source.SelectedTables[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "TableGroupIds.", this.TableGroupIds);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

