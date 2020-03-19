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

public class DescribeTableGroupsRequest extends AbstractModel{

    /**
    * ID of the cluster where a table group resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Table group ID list
    */
    @SerializedName("TableGroupIds")
    @Expose
    private String [] TableGroupIds;

    /**
    * Filter. Valid values: TableGroupName, TableGroupId
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Query list offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results in query list
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ID of the cluster where a table group resides 
     * @return ClusterId ID of the cluster where a table group resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where a table group resides
     * @param ClusterId ID of the cluster where a table group resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Table group ID list 
     * @return TableGroupIds Table group ID list
     */
    public String [] getTableGroupIds() {
        return this.TableGroupIds;
    }

    /**
     * Set Table group ID list
     * @param TableGroupIds Table group ID list
     */
    public void setTableGroupIds(String [] TableGroupIds) {
        this.TableGroupIds = TableGroupIds;
    }

    /**
     * Get Filter. Valid values: TableGroupName, TableGroupId 
     * @return Filters Filter. Valid values: TableGroupName, TableGroupId
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Valid values: TableGroupName, TableGroupId
     * @param Filters Filter. Valid values: TableGroupName, TableGroupId
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query list offset 
     * @return Offset Query list offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query list offset
     * @param Offset Query list offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results in query list 
     * @return Limit Number of returned results in query list
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results in query list
     * @param Limit Number of returned results in query list
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

