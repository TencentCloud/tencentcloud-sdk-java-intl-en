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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppTasksRequest extends AbstractModel {

    /**
    * Spark job ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Paginated query offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paginated query limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Execution instance ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The update start time in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The update end time in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filter by this parameter, which can be `task-state`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Spark job ID 
     * @return JobId Spark job ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Spark job ID
     * @param JobId Spark job ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Paginated query offset 
     * @return Offset Paginated query offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset
     * @param Offset Paginated query offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Paginated query limit 
     * @return Limit Paginated query limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paginated query limit
     * @param Limit Paginated query limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Execution instance ID 
     * @return TaskId Execution instance ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Execution instance ID
     * @param TaskId Execution instance ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The update start time in the format of yyyy-MM-dd HH:mm:ss. 
     * @return StartTime The update start time in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The update start time in the format of yyyy-MM-dd HH:mm:ss.
     * @param StartTime The update start time in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The update end time in the format of yyyy-MM-dd HH:mm:ss. 
     * @return EndTime The update end time in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The update end time in the format of yyyy-MM-dd HH:mm:ss.
     * @param EndTime The update end time in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter by this parameter, which can be `task-state`. 
     * @return Filters Filter by this parameter, which can be `task-state`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter by this parameter, which can be `task-state`.
     * @param Filters Filter by this parameter, which can be `task-state`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSparkAppTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppTasksRequest(DescribeSparkAppTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

