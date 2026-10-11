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

public class ListWorkflowTaskRunsRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Task ID, which can be obtained through the ListWorkflowTasks API. Optional, exact match. Pass at least one of this parameter and WorkflowRunId: if only TaskId is passed, all execution history of the task is queried.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Workflow run ID, which can be obtained through ListWorkflowRuns. Optional, exact match. Pass at least one of this parameter and TaskId: if only WorkflowRunId is passed, all task runs under this workflow run are queried.</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Task ID, which can be obtained through the ListWorkflowTasks API. Optional, exact match. Pass at least one of this parameter and WorkflowRunId: if only TaskId is passed, all execution history of the task is queried.</p> 
     * @return TaskId <p>Task ID, which can be obtained through the ListWorkflowTasks API. Optional, exact match. Pass at least one of this parameter and WorkflowRunId: if only TaskId is passed, all execution history of the task is queried.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID, which can be obtained through the ListWorkflowTasks API. Optional, exact match. Pass at least one of this parameter and WorkflowRunId: if only TaskId is passed, all execution history of the task is queried.</p>
     * @param TaskId <p>Task ID, which can be obtained through the ListWorkflowTasks API. Optional, exact match. Pass at least one of this parameter and WorkflowRunId: if only TaskId is passed, all execution history of the task is queried.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Workflow run ID, which can be obtained through ListWorkflowRuns. Optional, exact match. Pass at least one of this parameter and TaskId: if only WorkflowRunId is passed, all task runs under this workflow run are queried.</p> 
     * @return WorkflowRunId <p>Workflow run ID, which can be obtained through ListWorkflowRuns. Optional, exact match. Pass at least one of this parameter and TaskId: if only WorkflowRunId is passed, all task runs under this workflow run are queried.</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>Workflow run ID, which can be obtained through ListWorkflowRuns. Optional, exact match. Pass at least one of this parameter and TaskId: if only WorkflowRunId is passed, all task runs under this workflow run are queried.</p>
     * @param WorkflowRunId <p>Workflow run ID, which can be obtained through ListWorkflowRuns. Optional, exact match. Pass at least one of this parameter and TaskId: if only WorkflowRunId is passed, all task runs under this workflow run are queried.</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p> 
     * @return PageNumber <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     * @param PageNumber <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p> 
     * @return PageSize <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     * @param PageSize <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListWorkflowTaskRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowTaskRunsRequest(ListWorkflowTaskRunsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

