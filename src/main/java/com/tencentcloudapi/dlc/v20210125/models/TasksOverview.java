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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TasksOverview extends AbstractModel{

    /**
    * The number of tasks in queue.
    */
    @SerializedName("TaskQueuedCount")
    @Expose
    private Long TaskQueuedCount;

    /**
    * The number of initialized tasks.
    */
    @SerializedName("TaskInitCount")
    @Expose
    private Long TaskInitCount;

    /**
    * The number of tasks in progress.
    */
    @SerializedName("TaskRunningCount")
    @Expose
    private Long TaskRunningCount;

    /**
    * The total number of tasks in this time range.
    */
    @SerializedName("TotalTaskCount")
    @Expose
    private Long TotalTaskCount;

    /**
     * Get The number of tasks in queue. 
     * @return TaskQueuedCount The number of tasks in queue.
     */
    public Long getTaskQueuedCount() {
        return this.TaskQueuedCount;
    }

    /**
     * Set The number of tasks in queue.
     * @param TaskQueuedCount The number of tasks in queue.
     */
    public void setTaskQueuedCount(Long TaskQueuedCount) {
        this.TaskQueuedCount = TaskQueuedCount;
    }

    /**
     * Get The number of initialized tasks. 
     * @return TaskInitCount The number of initialized tasks.
     */
    public Long getTaskInitCount() {
        return this.TaskInitCount;
    }

    /**
     * Set The number of initialized tasks.
     * @param TaskInitCount The number of initialized tasks.
     */
    public void setTaskInitCount(Long TaskInitCount) {
        this.TaskInitCount = TaskInitCount;
    }

    /**
     * Get The number of tasks in progress. 
     * @return TaskRunningCount The number of tasks in progress.
     */
    public Long getTaskRunningCount() {
        return this.TaskRunningCount;
    }

    /**
     * Set The number of tasks in progress.
     * @param TaskRunningCount The number of tasks in progress.
     */
    public void setTaskRunningCount(Long TaskRunningCount) {
        this.TaskRunningCount = TaskRunningCount;
    }

    /**
     * Get The total number of tasks in this time range. 
     * @return TotalTaskCount The total number of tasks in this time range.
     */
    public Long getTotalTaskCount() {
        return this.TotalTaskCount;
    }

    /**
     * Set The total number of tasks in this time range.
     * @param TotalTaskCount The total number of tasks in this time range.
     */
    public void setTotalTaskCount(Long TotalTaskCount) {
        this.TotalTaskCount = TotalTaskCount;
    }

    public TasksOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TasksOverview(TasksOverview source) {
        if (source.TaskQueuedCount != null) {
            this.TaskQueuedCount = new Long(source.TaskQueuedCount);
        }
        if (source.TaskInitCount != null) {
            this.TaskInitCount = new Long(source.TaskInitCount);
        }
        if (source.TaskRunningCount != null) {
            this.TaskRunningCount = new Long(source.TaskRunningCount);
        }
        if (source.TotalTaskCount != null) {
            this.TotalTaskCount = new Long(source.TotalTaskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskQueuedCount", this.TaskQueuedCount);
        this.setParamSimple(map, prefix + "TaskInitCount", this.TaskInitCount);
        this.setParamSimple(map, prefix + "TaskRunningCount", this.TaskRunningCount);
        this.setParamSimple(map, prefix + "TotalTaskCount", this.TotalTaskCount);

    }
}

