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

public class CreateTaskRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The basic attributes of the task.
    */
    @SerializedName("TaskBaseAttribute")
    @Expose
    private CreateTaskBaseAttribute TaskBaseAttribute;

    /**
    * Task configurations.
    */
    @SerializedName("TaskConfiguration")
    @Expose
    private CreateTaskConfiguration TaskConfiguration;

    /**
    * Task scheduling configuration.
    */
    @SerializedName("TaskSchedulerConfiguration")
    @Expose
    private CreateTaskSchedulerConfiguration TaskSchedulerConfiguration;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The basic attributes of the task. 
     * @return TaskBaseAttribute The basic attributes of the task.
     */
    public CreateTaskBaseAttribute getTaskBaseAttribute() {
        return this.TaskBaseAttribute;
    }

    /**
     * Set The basic attributes of the task.
     * @param TaskBaseAttribute The basic attributes of the task.
     */
    public void setTaskBaseAttribute(CreateTaskBaseAttribute TaskBaseAttribute) {
        this.TaskBaseAttribute = TaskBaseAttribute;
    }

    /**
     * Get Task configurations. 
     * @return TaskConfiguration Task configurations.
     */
    public CreateTaskConfiguration getTaskConfiguration() {
        return this.TaskConfiguration;
    }

    /**
     * Set Task configurations.
     * @param TaskConfiguration Task configurations.
     */
    public void setTaskConfiguration(CreateTaskConfiguration TaskConfiguration) {
        this.TaskConfiguration = TaskConfiguration;
    }

    /**
     * Get Task scheduling configuration. 
     * @return TaskSchedulerConfiguration Task scheduling configuration.
     */
    public CreateTaskSchedulerConfiguration getTaskSchedulerConfiguration() {
        return this.TaskSchedulerConfiguration;
    }

    /**
     * Set Task scheduling configuration.
     * @param TaskSchedulerConfiguration Task scheduling configuration.
     */
    public void setTaskSchedulerConfiguration(CreateTaskSchedulerConfiguration TaskSchedulerConfiguration) {
        this.TaskSchedulerConfiguration = TaskSchedulerConfiguration;
    }

    public CreateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskRequest(CreateTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskBaseAttribute != null) {
            this.TaskBaseAttribute = new CreateTaskBaseAttribute(source.TaskBaseAttribute);
        }
        if (source.TaskConfiguration != null) {
            this.TaskConfiguration = new CreateTaskConfiguration(source.TaskConfiguration);
        }
        if (source.TaskSchedulerConfiguration != null) {
            this.TaskSchedulerConfiguration = new CreateTaskSchedulerConfiguration(source.TaskSchedulerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "TaskBaseAttribute.", this.TaskBaseAttribute);
        this.setParamObj(map, prefix + "TaskConfiguration.", this.TaskConfiguration);
        this.setParamObj(map, prefix + "TaskSchedulerConfiguration.", this.TaskSchedulerConfiguration);

    }
}

