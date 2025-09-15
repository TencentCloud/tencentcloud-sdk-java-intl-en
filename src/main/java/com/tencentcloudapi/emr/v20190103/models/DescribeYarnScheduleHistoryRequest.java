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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeYarnScheduleHistoryRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Page number.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page size.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Scheduler type. The values are ALL, Capacity Scheduler, and Fair Scheduler.
    */
    @SerializedName("SchedulerType")
    @Expose
    private String SchedulerType;

    /**
    * Task type. 0: waiting; 1: executing; 2: completed; -1: failed; -99: all.
    */
    @SerializedName("TaskState")
    @Expose
    private Long TaskState;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Page number. 
     * @return Limit Page number.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page number.
     * @param Limit Page number.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page size. 
     * @return Offset Page size.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page size.
     * @param Offset Page size.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Scheduler type. The values are ALL, Capacity Scheduler, and Fair Scheduler. 
     * @return SchedulerType Scheduler type. The values are ALL, Capacity Scheduler, and Fair Scheduler.
     */
    public String getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set Scheduler type. The values are ALL, Capacity Scheduler, and Fair Scheduler.
     * @param SchedulerType Scheduler type. The values are ALL, Capacity Scheduler, and Fair Scheduler.
     */
    public void setSchedulerType(String SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get Task type. 0: waiting; 1: executing; 2: completed; -1: failed; -99: all. 
     * @return TaskState Task type. 0: waiting; 1: executing; 2: completed; -1: failed; -99: all.
     */
    public Long getTaskState() {
        return this.TaskState;
    }

    /**
     * Set Task type. 0: waiting; 1: executing; 2: completed; -1: failed; -99: all.
     * @param TaskState Task type. 0: waiting; 1: executing; 2: completed; -1: failed; -99: all.
     */
    public void setTaskState(Long TaskState) {
        this.TaskState = TaskState;
    }

    public DescribeYarnScheduleHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeYarnScheduleHistoryRequest(DescribeYarnScheduleHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SchedulerType != null) {
            this.SchedulerType = new String(source.SchedulerType);
        }
        if (source.TaskState != null) {
            this.TaskState = new Long(source.TaskState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SchedulerType", this.SchedulerType);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);

    }
}

