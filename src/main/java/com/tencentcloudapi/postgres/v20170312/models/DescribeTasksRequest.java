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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * Query by task ID. the FlowId and TaskId returned in other cloud apis are equivalent.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Query by database instance ID.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Earliest start time of the task, such as 2024-08-23 00:00:00. default shows data within the last 180 days.
    */
    @SerializedName("MinStartTime")
    @Expose
    private String MinStartTime;

    /**
    * Latest start time of the task, such as 2024-08-23 00:00:00, defaults to the current time.
    */
    @SerializedName("MaxStartTime")
    @Expose
    private String MaxStartTime;

    /**
    * Number of results displayed per page. value range 1-100. default 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset, starting from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field, supports StartTime and EndTime. defaults to StartTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Specifies the sorting method, including ascending: `asc` and descending: `desc`. defaults to `desc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Query by task ID. the FlowId and TaskId returned in other cloud apis are equivalent. 
     * @return TaskId Query by task ID. the FlowId and TaskId returned in other cloud apis are equivalent.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Query by task ID. the FlowId and TaskId returned in other cloud apis are equivalent.
     * @param TaskId Query by task ID. the FlowId and TaskId returned in other cloud apis are equivalent.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Query by database instance ID. 
     * @return DBInstanceId Query by database instance ID.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Query by database instance ID.
     * @param DBInstanceId Query by database instance ID.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Earliest start time of the task, such as 2024-08-23 00:00:00. default shows data within the last 180 days. 
     * @return MinStartTime Earliest start time of the task, such as 2024-08-23 00:00:00. default shows data within the last 180 days.
     */
    public String getMinStartTime() {
        return this.MinStartTime;
    }

    /**
     * Set Earliest start time of the task, such as 2024-08-23 00:00:00. default shows data within the last 180 days.
     * @param MinStartTime Earliest start time of the task, such as 2024-08-23 00:00:00. default shows data within the last 180 days.
     */
    public void setMinStartTime(String MinStartTime) {
        this.MinStartTime = MinStartTime;
    }

    /**
     * Get Latest start time of the task, such as 2024-08-23 00:00:00, defaults to the current time. 
     * @return MaxStartTime Latest start time of the task, such as 2024-08-23 00:00:00, defaults to the current time.
     */
    public String getMaxStartTime() {
        return this.MaxStartTime;
    }

    /**
     * Set Latest start time of the task, such as 2024-08-23 00:00:00, defaults to the current time.
     * @param MaxStartTime Latest start time of the task, such as 2024-08-23 00:00:00, defaults to the current time.
     */
    public void setMaxStartTime(String MaxStartTime) {
        this.MaxStartTime = MaxStartTime;
    }

    /**
     * Get Number of results displayed per page. value range 1-100. default 20. 
     * @return Limit Number of results displayed per page. value range 1-100. default 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results displayed per page. value range 1-100. default 20.
     * @param Limit Number of results displayed per page. value range 1-100. default 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset, starting from 0. 
     * @return Offset Data offset, starting from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset, starting from 0.
     * @param Offset Data offset, starting from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field, supports StartTime and EndTime. defaults to StartTime. 
     * @return OrderBy Sorting field, supports StartTime and EndTime. defaults to StartTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field, supports StartTime and EndTime. defaults to StartTime.
     * @param OrderBy Sorting field, supports StartTime and EndTime. defaults to StartTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Specifies the sorting method, including ascending: `asc` and descending: `desc`. defaults to `desc`. 
     * @return OrderByType Specifies the sorting method, including ascending: `asc` and descending: `desc`. defaults to `desc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Specifies the sorting method, including ascending: `asc` and descending: `desc`. defaults to `desc`.
     * @param OrderByType Specifies the sorting method, including ascending: `asc` and descending: `desc`. defaults to `desc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.MinStartTime != null) {
            this.MinStartTime = new String(source.MinStartTime);
        }
        if (source.MaxStartTime != null) {
            this.MaxStartTime = new String(source.MaxStartTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "MinStartTime", this.MinStartTime);
        this.setParamSimple(map, prefix + "MaxStartTime", this.MaxStartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

