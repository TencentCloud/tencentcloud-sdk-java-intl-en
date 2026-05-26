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
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>The
basic attributes of the task.</p>
    */
    @SerializedName("TaskBaseAttribute")
    @Expose
    private CreateTaskBaseAttribute TaskBaseAttribute;

    /**
    * <p>Task configurations.</p>
    */
    @SerializedName("TaskConfiguration")
    @Expose
    private CreateTaskConfiguration TaskConfiguration;

    /**
    * <p>Task scheduling configuration</p>
    */
    @SerializedName("TaskSchedulerConfiguration")
    @Expose
    private CreateTaskSchedulerConfiguration TaskSchedulerConfiguration;

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>The
basic attributes of the task.</p> 
     * @return TaskBaseAttribute <p>The
basic attributes of the task.</p>
     */
    public CreateTaskBaseAttribute getTaskBaseAttribute() {
        return this.TaskBaseAttribute;
    }

    /**
     * Set <p>The
basic attributes of the task.</p>
     * @param TaskBaseAttribute <p>The
basic attributes of the task.</p>
     */
    public void setTaskBaseAttribute(CreateTaskBaseAttribute TaskBaseAttribute) {
        this.TaskBaseAttribute = TaskBaseAttribute;
    }

    /**
     * Get <p>Task configurations.</p> 
     * @return TaskConfiguration <p>Task configurations.</p>
     */
    public CreateTaskConfiguration getTaskConfiguration() {
        return this.TaskConfiguration;
    }

    /**
     * Set <p>Task configurations.</p>
     * @param TaskConfiguration <p>Task configurations.</p>
     */
    public void setTaskConfiguration(CreateTaskConfiguration TaskConfiguration) {
        this.TaskConfiguration = TaskConfiguration;
    }

    /**
     * Get <p>Task scheduling configuration</p> 
     * @return TaskSchedulerConfiguration <p>Task scheduling configuration</p>
     */
    public CreateTaskSchedulerConfiguration getTaskSchedulerConfiguration() {
        return this.TaskSchedulerConfiguration;
    }

    /**
     * Set <p>Task scheduling configuration</p>
     * @param TaskSchedulerConfiguration <p>Task scheduling configuration</p>
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

