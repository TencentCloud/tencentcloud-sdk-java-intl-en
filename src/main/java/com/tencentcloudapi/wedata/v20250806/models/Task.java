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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * Describes the basic attributes of the task.
    */
    @SerializedName("TaskBaseAttribute")
    @Expose
    private TaskBaseAttribute TaskBaseAttribute;

    /**
    * Task configurations.

    */
    @SerializedName("TaskConfiguration")
    @Expose
    private TaskConfiguration TaskConfiguration;

    /**
    * Specifies task scheduling configuration.

    */
    @SerializedName("TaskSchedulerConfiguration")
    @Expose
    private TaskSchedulerConfiguration TaskSchedulerConfiguration;

    /**
     * Get Describes the basic attributes of the task. 
     * @return TaskBaseAttribute Describes the basic attributes of the task.
     */
    public TaskBaseAttribute getTaskBaseAttribute() {
        return this.TaskBaseAttribute;
    }

    /**
     * Set Describes the basic attributes of the task.
     * @param TaskBaseAttribute Describes the basic attributes of the task.
     */
    public void setTaskBaseAttribute(TaskBaseAttribute TaskBaseAttribute) {
        this.TaskBaseAttribute = TaskBaseAttribute;
    }

    /**
     * Get Task configurations.
 
     * @return TaskConfiguration Task configurations.

     */
    public TaskConfiguration getTaskConfiguration() {
        return this.TaskConfiguration;
    }

    /**
     * Set Task configurations.

     * @param TaskConfiguration Task configurations.

     */
    public void setTaskConfiguration(TaskConfiguration TaskConfiguration) {
        this.TaskConfiguration = TaskConfiguration;
    }

    /**
     * Get Specifies task scheduling configuration.
 
     * @return TaskSchedulerConfiguration Specifies task scheduling configuration.

     */
    public TaskSchedulerConfiguration getTaskSchedulerConfiguration() {
        return this.TaskSchedulerConfiguration;
    }

    /**
     * Set Specifies task scheduling configuration.

     * @param TaskSchedulerConfiguration Specifies task scheduling configuration.

     */
    public void setTaskSchedulerConfiguration(TaskSchedulerConfiguration TaskSchedulerConfiguration) {
        this.TaskSchedulerConfiguration = TaskSchedulerConfiguration;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.TaskBaseAttribute != null) {
            this.TaskBaseAttribute = new TaskBaseAttribute(source.TaskBaseAttribute);
        }
        if (source.TaskConfiguration != null) {
            this.TaskConfiguration = new TaskConfiguration(source.TaskConfiguration);
        }
        if (source.TaskSchedulerConfiguration != null) {
            this.TaskSchedulerConfiguration = new TaskSchedulerConfiguration(source.TaskSchedulerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskBaseAttribute.", this.TaskBaseAttribute);
        this.setParamObj(map, prefix + "TaskConfiguration.", this.TaskConfiguration);
        this.setParamObj(map, prefix + "TaskSchedulerConfiguration.", this.TaskSchedulerConfiguration);

    }
}

