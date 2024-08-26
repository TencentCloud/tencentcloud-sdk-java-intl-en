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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel {

    /**
    * Task status. Valid values: InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task type. Valid values:ProvisionRoleConfiguration: Deploy permission configurations.
DeprovisionRoleConfiguration: Undeploy permission configurations.CreateRoleAssignment: Grant authorizations on member accounts.
DeleteRoleAssignment: Remove authorizations on member accounts.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Cause of task failure.
Description.
This parameter is displayed only when the Status is Failed.
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
     * Get Task status. Valid values: InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed. 
     * @return Status Task status. Valid values: InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     * @param Status Task status. Valid values: InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task type. Valid values:ProvisionRoleConfiguration: Deploy permission configurations.
DeprovisionRoleConfiguration: Undeploy permission configurations.CreateRoleAssignment: Grant authorizations on member accounts.
DeleteRoleAssignment: Remove authorizations on member accounts. 
     * @return TaskType Task type. Valid values:ProvisionRoleConfiguration: Deploy permission configurations.
DeprovisionRoleConfiguration: Undeploy permission configurations.CreateRoleAssignment: Grant authorizations on member accounts.
DeleteRoleAssignment: Remove authorizations on member accounts.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. Valid values:ProvisionRoleConfiguration: Deploy permission configurations.
DeprovisionRoleConfiguration: Undeploy permission configurations.CreateRoleAssignment: Grant authorizations on member accounts.
DeleteRoleAssignment: Remove authorizations on member accounts.
     * @param TaskType Task type. Valid values:ProvisionRoleConfiguration: Deploy permission configurations.
DeprovisionRoleConfiguration: Undeploy permission configurations.CreateRoleAssignment: Grant authorizations on member accounts.
DeleteRoleAssignment: Remove authorizations on member accounts.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Cause of task failure.
Description.
This parameter is displayed only when the Status is Failed. 
     * @return FailureReason Cause of task failure.
Description.
This parameter is displayed only when the Status is Failed.
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set Cause of task failure.
Description.
This parameter is displayed only when the Status is Failed.
     * @param FailureReason Cause of task failure.
Description.
This parameter is displayed only when the Status is Failed.
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);

    }
}

