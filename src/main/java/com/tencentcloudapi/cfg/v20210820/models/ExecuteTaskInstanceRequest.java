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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteTaskInstanceRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task action ID
    */
    @SerializedName("TaskActionId")
    @Expose
    private Long TaskActionId;

    /**
    * Task action instance ID
    */
    @SerializedName("TaskInstanceIds")
    @Expose
    private Long [] TaskInstanceIds;

    /**
    * Whether to operate on the entire task
    */
    @SerializedName("IsOperateAll")
    @Expose
    private Boolean IsOperateAll;

    /**
    * Operation type (1: start; 2: execute; 3: skip; 5: retry)
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Action group ID
    */
    @SerializedName("TaskGroupId")
    @Expose
    private Long TaskGroupId;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task action ID 
     * @return TaskActionId Task action ID
     */
    public Long getTaskActionId() {
        return this.TaskActionId;
    }

    /**
     * Set Task action ID
     * @param TaskActionId Task action ID
     */
    public void setTaskActionId(Long TaskActionId) {
        this.TaskActionId = TaskActionId;
    }

    /**
     * Get Task action instance ID 
     * @return TaskInstanceIds Task action instance ID
     */
    public Long [] getTaskInstanceIds() {
        return this.TaskInstanceIds;
    }

    /**
     * Set Task action instance ID
     * @param TaskInstanceIds Task action instance ID
     */
    public void setTaskInstanceIds(Long [] TaskInstanceIds) {
        this.TaskInstanceIds = TaskInstanceIds;
    }

    /**
     * Get Whether to operate on the entire task 
     * @return IsOperateAll Whether to operate on the entire task
     */
    public Boolean getIsOperateAll() {
        return this.IsOperateAll;
    }

    /**
     * Set Whether to operate on the entire task
     * @param IsOperateAll Whether to operate on the entire task
     */
    public void setIsOperateAll(Boolean IsOperateAll) {
        this.IsOperateAll = IsOperateAll;
    }

    /**
     * Get Operation type (1: start; 2: execute; 3: skip; 5: retry) 
     * @return ActionType Operation type (1: start; 2: execute; 3: skip; 5: retry)
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Operation type (1: start; 2: execute; 3: skip; 5: retry)
     * @param ActionType Operation type (1: start; 2: execute; 3: skip; 5: retry)
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Action group ID 
     * @return TaskGroupId Action group ID
     */
    public Long getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set Action group ID
     * @param TaskGroupId Action group ID
     */
    public void setTaskGroupId(Long TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    public ExecuteTaskInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteTaskInstanceRequest(ExecuteTaskInstanceRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskActionId != null) {
            this.TaskActionId = new Long(source.TaskActionId);
        }
        if (source.TaskInstanceIds != null) {
            this.TaskInstanceIds = new Long[source.TaskInstanceIds.length];
            for (int i = 0; i < source.TaskInstanceIds.length; i++) {
                this.TaskInstanceIds[i] = new Long(source.TaskInstanceIds[i]);
            }
        }
        if (source.IsOperateAll != null) {
            this.IsOperateAll = new Boolean(source.IsOperateAll);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.TaskGroupId != null) {
            this.TaskGroupId = new Long(source.TaskGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskActionId", this.TaskActionId);
        this.setParamArraySimple(map, prefix + "TaskInstanceIds.", this.TaskInstanceIds);
        this.setParamSimple(map, prefix + "IsOperateAll", this.IsOperateAll);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "TaskGroupId", this.TaskGroupId);

    }
}

