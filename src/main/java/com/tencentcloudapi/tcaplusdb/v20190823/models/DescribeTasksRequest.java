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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * List of IDs of clusters where the tasks to be queried reside
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * List of IDs of tasks to be queried
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Filter. Valid values: Content, TaskType, Operator, Time
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
     * Get List of IDs of clusters where the tasks to be queried reside 
     * @return ClusterIds List of IDs of clusters where the tasks to be queried reside
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set List of IDs of clusters where the tasks to be queried reside
     * @param ClusterIds List of IDs of clusters where the tasks to be queried reside
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get List of IDs of tasks to be queried 
     * @return TaskIds List of IDs of tasks to be queried
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set List of IDs of tasks to be queried
     * @param TaskIds List of IDs of tasks to be queried
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Filter. Valid values: Content, TaskType, Operator, Time 
     * @return Filters Filter. Valid values: Content, TaskType, Operator, Time
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Valid values: Content, TaskType, Operator, Time
     * @param Filters Filter. Valid values: Content, TaskType, Operator, Time
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

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
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
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

