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

public class DescribeTasksRequest extends AbstractModel {

    /**
    * Starting value of the task start time.
    */
    @SerializedName("StartTimeBegin")
    @Expose
    private String StartTimeBegin;

    /**
    * End value of the task start time.
    */
    @SerializedName("StartTimeEnd")
    @Expose
    private String StartTimeEnd;

    /**
    * Filtering conditions. Supported fields for searching: "ClusterId", "ClusterName", "InstanceId", "InstanceName", "Status", "TaskId", and "TaskType".
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
    * Length of the list to be queried.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset of the list to be queried.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Starting value of the task start time. 
     * @return StartTimeBegin Starting value of the task start time.
     */
    public String getStartTimeBegin() {
        return this.StartTimeBegin;
    }

    /**
     * Set Starting value of the task start time.
     * @param StartTimeBegin Starting value of the task start time.
     */
    public void setStartTimeBegin(String StartTimeBegin) {
        this.StartTimeBegin = StartTimeBegin;
    }

    /**
     * Get End value of the task start time. 
     * @return StartTimeEnd End value of the task start time.
     */
    public String getStartTimeEnd() {
        return this.StartTimeEnd;
    }

    /**
     * Set End value of the task start time.
     * @param StartTimeEnd End value of the task start time.
     */
    public void setStartTimeEnd(String StartTimeEnd) {
        this.StartTimeEnd = StartTimeEnd;
    }

    /**
     * Get Filtering conditions. Supported fields for searching: "ClusterId", "ClusterName", "InstanceId", "InstanceName", "Status", "TaskId", and "TaskType". 
     * @return Filters Filtering conditions. Supported fields for searching: "ClusterId", "ClusterName", "InstanceId", "InstanceName", "Status", "TaskId", and "TaskType".
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering conditions. Supported fields for searching: "ClusterId", "ClusterName", "InstanceId", "InstanceName", "Status", "TaskId", and "TaskType".
     * @param Filters Filtering conditions. Supported fields for searching: "ClusterId", "ClusterName", "InstanceId", "InstanceName", "Status", "TaskId", and "TaskType".
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Length of the list to be queried. 
     * @return Limit Length of the list to be queried.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Length of the list to be queried.
     * @param Limit Length of the list to be queried.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset of the list to be queried. 
     * @return Offset Offset of the list to be queried.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of the list to be queried.
     * @param Offset Offset of the list to be queried.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.StartTimeBegin != null) {
            this.StartTimeBegin = new String(source.StartTimeBegin);
        }
        if (source.StartTimeEnd != null) {
            this.StartTimeEnd = new String(source.StartTimeEnd);
        }
        if (source.Filters != null) {
            this.Filters = new QueryFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeBegin", this.StartTimeBegin);
        this.setParamSimple(map, prefix + "StartTimeEnd", this.StartTimeEnd);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

