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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 100. Maximum value: 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter as detailed below:
<li> task-instance-type - String - Required: No - (Filter) Filter by task instance state. (SUBMITTED: submitted; PENDING: pending; RUNNABLE: runnable; STARTING: starting; RUNNING: running; SUCCEED: succeeded; FAILED: failed; FAILED_INTERRUPTED: instance retained after failure).</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Instance ID 
     * @return JobId Instance ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Instance ID
     * @param JobId Instance ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Task name 
     * @return TaskName Task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name
     * @param TaskName Task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 100. Maximum value: 1,000. 
     * @return Limit Number of returned results. Default value: 100. Maximum value: 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 100. Maximum value: 1,000.
     * @param Limit Number of returned results. Default value: 100. Maximum value: 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter as detailed below:
<li> task-instance-type - String - Required: No - (Filter) Filter by task instance state. (SUBMITTED: submitted; PENDING: pending; RUNNABLE: runnable; STARTING: starting; RUNNING: running; SUCCEED: succeeded; FAILED: failed; FAILED_INTERRUPTED: instance retained after failure).</li> 
     * @return Filters Filter as detailed below:
<li> task-instance-type - String - Required: No - (Filter) Filter by task instance state. (SUBMITTED: submitted; PENDING: pending; RUNNABLE: runnable; STARTING: starting; RUNNING: running; SUCCEED: succeeded; FAILED: failed; FAILED_INTERRUPTED: instance retained after failure).</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter as detailed below:
<li> task-instance-type - String - Required: No - (Filter) Filter by task instance state. (SUBMITTED: submitted; PENDING: pending; RUNNABLE: runnable; STARTING: starting; RUNNING: running; SUCCEED: succeeded; FAILED: failed; FAILED_INTERRUPTED: instance retained after failure).</li>
     * @param Filters Filter as detailed below:
<li> task-instance-type - String - Required: No - (Filter) Filter by task instance state. (SUBMITTED: submitted; PENDING: pending; RUNNABLE: runnable; STARTING: starting; RUNNING: running; SUCCEED: succeeded; FAILED: failed; FAILED_INTERRUPTED: instance retained after failure).</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

