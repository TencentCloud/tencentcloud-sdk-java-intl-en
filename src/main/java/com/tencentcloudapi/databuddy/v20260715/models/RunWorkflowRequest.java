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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunWorkflowRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Workflow ID, which can be obtained through ListWorkflows. Required</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Running type. Required. Value: 1 ordinary, 2 advanced running</p>
    */
    @SerializedName("RunType")
    @Expose
    private Long RunType;

    /**
    * <p>Custom running parameter filled in when the running type is advanced running</p>
    */
    @SerializedName("AdvancedParams")
    @Expose
    private TaskSchedulingParameterBrief [] AdvancedParams;

    /**
    * <p>This time, the specified task ID set needs to be run, which can be obtained through ListWorkflowTasks. If not passed, all tasks under the workflow run by default.</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * <p>Idempotency token. Optional. Duplicate requests with the same token trigger only once</p>
    */
    @SerializedName("IdempotencyToken")
    @Expose
    private String IdempotencyToken;

    /**
    * <p>Scheduled dispatch time list configuration</p>
    */
    @SerializedName("ScheduledTimeConfig")
    @Expose
    private ScheduledTimeConfig ScheduledTimeConfig;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Workflow ID, which can be obtained through ListWorkflows. Required</p> 
     * @return WorkflowId <p>Workflow ID, which can be obtained through ListWorkflows. Required</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID, which can be obtained through ListWorkflows. Required</p>
     * @param WorkflowId <p>Workflow ID, which can be obtained through ListWorkflows. Required</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Running type. Required. Value: 1 ordinary, 2 advanced running</p> 
     * @return RunType <p>Running type. Required. Value: 1 ordinary, 2 advanced running</p>
     */
    public Long getRunType() {
        return this.RunType;
    }

    /**
     * Set <p>Running type. Required. Value: 1 ordinary, 2 advanced running</p>
     * @param RunType <p>Running type. Required. Value: 1 ordinary, 2 advanced running</p>
     */
    public void setRunType(Long RunType) {
        this.RunType = RunType;
    }

    /**
     * Get <p>Custom running parameter filled in when the running type is advanced running</p> 
     * @return AdvancedParams <p>Custom running parameter filled in when the running type is advanced running</p>
     */
    public TaskSchedulingParameterBrief [] getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set <p>Custom running parameter filled in when the running type is advanced running</p>
     * @param AdvancedParams <p>Custom running parameter filled in when the running type is advanced running</p>
     */
    public void setAdvancedParams(TaskSchedulingParameterBrief [] AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get <p>This time, the specified task ID set needs to be run, which can be obtained through ListWorkflowTasks. If not passed, all tasks under the workflow run by default.</p> 
     * @return TaskIds <p>This time, the specified task ID set needs to be run, which can be obtained through ListWorkflowTasks. If not passed, all tasks under the workflow run by default.</p>
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>This time, the specified task ID set needs to be run, which can be obtained through ListWorkflowTasks. If not passed, all tasks under the workflow run by default.</p>
     * @param TaskIds <p>This time, the specified task ID set needs to be run, which can be obtained through ListWorkflowTasks. If not passed, all tasks under the workflow run by default.</p>
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>Idempotency token. Optional. Duplicate requests with the same token trigger only once</p> 
     * @return IdempotencyToken <p>Idempotency token. Optional. Duplicate requests with the same token trigger only once</p>
     */
    public String getIdempotencyToken() {
        return this.IdempotencyToken;
    }

    /**
     * Set <p>Idempotency token. Optional. Duplicate requests with the same token trigger only once</p>
     * @param IdempotencyToken <p>Idempotency token. Optional. Duplicate requests with the same token trigger only once</p>
     */
    public void setIdempotencyToken(String IdempotencyToken) {
        this.IdempotencyToken = IdempotencyToken;
    }

    /**
     * Get <p>Scheduled dispatch time list configuration</p> 
     * @return ScheduledTimeConfig <p>Scheduled dispatch time list configuration</p>
     */
    public ScheduledTimeConfig getScheduledTimeConfig() {
        return this.ScheduledTimeConfig;
    }

    /**
     * Set <p>Scheduled dispatch time list configuration</p>
     * @param ScheduledTimeConfig <p>Scheduled dispatch time list configuration</p>
     */
    public void setScheduledTimeConfig(ScheduledTimeConfig ScheduledTimeConfig) {
        this.ScheduledTimeConfig = ScheduledTimeConfig;
    }

    public RunWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunWorkflowRequest(RunWorkflowRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RunType != null) {
            this.RunType = new Long(source.RunType);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new TaskSchedulingParameterBrief[source.AdvancedParams.length];
            for (int i = 0; i < source.AdvancedParams.length; i++) {
                this.AdvancedParams[i] = new TaskSchedulingParameterBrief(source.AdvancedParams[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.IdempotencyToken != null) {
            this.IdempotencyToken = new String(source.IdempotencyToken);
        }
        if (source.ScheduledTimeConfig != null) {
            this.ScheduledTimeConfig = new ScheduledTimeConfig(source.ScheduledTimeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamArrayObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "IdempotencyToken", this.IdempotencyToken);
        this.setParamObj(map, prefix + "ScheduledTimeConfig.", this.ScheduledTimeConfig);

    }
}

