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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveTasksToFolderRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task Folder ID
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * Task ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Virtual Task ID
    */
    @SerializedName("VirtualTaskIds")
    @Expose
    private String [] VirtualTaskIds;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Task Folder ID 
     * @return TaskFolderId Task Folder ID
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set Task Folder ID
     * @param TaskFolderId Task Folder ID
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get Task ID 
     * @return TaskIds Task ID
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task ID
     * @param TaskIds Task ID
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Virtual Task ID 
     * @return VirtualTaskIds Virtual Task ID
     */
    public String [] getVirtualTaskIds() {
        return this.VirtualTaskIds;
    }

    /**
     * Set Virtual Task ID
     * @param VirtualTaskIds Virtual Task ID
     */
    public void setVirtualTaskIds(String [] VirtualTaskIds) {
        this.VirtualTaskIds = VirtualTaskIds;
    }

    public MoveTasksToFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MoveTasksToFolderRequest(MoveTasksToFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.VirtualTaskIds != null) {
            this.VirtualTaskIds = new String[source.VirtualTaskIds.length];
            for (int i = 0; i < source.VirtualTaskIds.length; i++) {
                this.VirtualTaskIds[i] = new String(source.VirtualTaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArraySimple(map, prefix + "VirtualTaskIds.", this.VirtualTaskIds);

    }
}

