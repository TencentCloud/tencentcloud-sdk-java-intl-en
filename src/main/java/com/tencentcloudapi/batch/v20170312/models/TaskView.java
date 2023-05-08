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

public class TaskView extends AbstractModel{

    /**
    * Task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task status
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * Start time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
     * Get Task status 
     * @return TaskState Task status
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set Task status
     * @param TaskState Task status
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get Start time 
     * @return CreateTime Start time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Start time
     * @param CreateTime Start time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EndTime End time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return `null`, indicating that no valid value was found.
     * @param EndTime End time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public TaskView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskView(TaskView source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskState != null) {
            this.TaskState = new String(source.TaskState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

