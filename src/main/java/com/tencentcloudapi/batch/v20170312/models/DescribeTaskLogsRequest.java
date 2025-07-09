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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLogsRequest extends AbstractModel {

    /**
    * Job ID
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
    * Set of task instances
    */
    @SerializedName("TaskInstanceIndexes")
    @Expose
    private Long [] TaskInstanceIndexes;

    /**
    * The start point of query
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of task instances returned
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Job ID 
     * @return JobId Job ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID
     * @param JobId Job ID
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
     * Get Set of task instances 
     * @return TaskInstanceIndexes Set of task instances
     */
    public Long [] getTaskInstanceIndexes() {
        return this.TaskInstanceIndexes;
    }

    /**
     * Set Set of task instances
     * @param TaskInstanceIndexes Set of task instances
     */
    public void setTaskInstanceIndexes(Long [] TaskInstanceIndexes) {
        this.TaskInstanceIndexes = TaskInstanceIndexes;
    }

    /**
     * Get The start point of query 
     * @return Offset The start point of query
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The start point of query
     * @param Offset The start point of query
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of task instances returned 
     * @return Limit Maximum number of task instances returned
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of task instances returned
     * @param Limit Maximum number of task instances returned
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTaskLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLogsRequest(DescribeTaskLogsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceIndexes != null) {
            this.TaskInstanceIndexes = new Long[source.TaskInstanceIndexes.length];
            for (int i = 0; i < source.TaskInstanceIndexes.length; i++) {
                this.TaskInstanceIndexes[i] = new Long(source.TaskInstanceIndexes[i]);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamArraySimple(map, prefix + "TaskInstanceIndexes.", this.TaskInstanceIndexes);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

