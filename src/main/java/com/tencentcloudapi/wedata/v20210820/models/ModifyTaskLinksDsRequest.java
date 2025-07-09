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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskLinksDsRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Parent Task ID
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * Subtask ID
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * Subtask Workflow
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Parent task Workflow
    */
    @SerializedName("RealFromWorkflowId")
    @Expose
    private String RealFromWorkflowId;

    /**
    * Request source, WEB frontend; CLIENT CLIENT.
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * Dependency relationship between parent and child tasks.
Enable all instances that normally depend on the parent task.
    normal_all(1),
normal dependent on parent task first one.
Specifies the normal dependent on parent task, which is the last one (3).
Valid values: normal, any one of dependent on parent tasks (4).
normal dependent on parent task a specified one.
self-Dependency, cannot use.

Invalid dependent parent task for all instances. enable (forward dependency for tomorrow).
    non_normal_all_forward(11),
non-normal dependent on parent task. first one forward (12).
non-normal dependent on parent task, last one.
Not normal, dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task and designates one.

Specifies that all instances dependent on a non-normal parent task are enabled (backward dependency on yesterday).
    non_normal_all_backward(21),
non-normal dependent on parent task. first one backward (22).
Not normal dependent on parent task last one backward.
non-normal dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task.
    */
    @SerializedName("LinkDependencyType")
    @Expose
    private String LinkDependencyType;

    /**
    * Additional attribute information such as branch node and merge node information.
    */
    @SerializedName("LinkExt")
    @Expose
    private String LinkExt;

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
     * Get Parent Task ID 
     * @return TaskFrom Parent Task ID
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set Parent Task ID
     * @param TaskFrom Parent Task ID
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get Subtask ID 
     * @return TaskTo Subtask ID
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set Subtask ID
     * @param TaskTo Subtask ID
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get Subtask Workflow 
     * @return WorkflowId Subtask Workflow
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Subtask Workflow
     * @param WorkflowId Subtask Workflow
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Parent task Workflow 
     * @return RealFromWorkflowId Parent task Workflow
     */
    public String getRealFromWorkflowId() {
        return this.RealFromWorkflowId;
    }

    /**
     * Set Parent task Workflow
     * @param RealFromWorkflowId Parent task Workflow
     */
    public void setRealFromWorkflowId(String RealFromWorkflowId) {
        this.RealFromWorkflowId = RealFromWorkflowId;
    }

    /**
     * Get Request source, WEB frontend; CLIENT CLIENT. 
     * @return RequestFromSource Request source, WEB frontend; CLIENT CLIENT.
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set Request source, WEB frontend; CLIENT CLIENT.
     * @param RequestFromSource Request source, WEB frontend; CLIENT CLIENT.
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get Dependency relationship between parent and child tasks.
Enable all instances that normally depend on the parent task.
    normal_all(1),
normal dependent on parent task first one.
Specifies the normal dependent on parent task, which is the last one (3).
Valid values: normal, any one of dependent on parent tasks (4).
normal dependent on parent task a specified one.
self-Dependency, cannot use.

Invalid dependent parent task for all instances. enable (forward dependency for tomorrow).
    non_normal_all_forward(11),
non-normal dependent on parent task. first one forward (12).
non-normal dependent on parent task, last one.
Not normal, dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task and designates one.

Specifies that all instances dependent on a non-normal parent task are enabled (backward dependency on yesterday).
    non_normal_all_backward(21),
non-normal dependent on parent task. first one backward (22).
Not normal dependent on parent task last one backward.
non-normal dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task. 
     * @return LinkDependencyType Dependency relationship between parent and child tasks.
Enable all instances that normally depend on the parent task.
    normal_all(1),
normal dependent on parent task first one.
Specifies the normal dependent on parent task, which is the last one (3).
Valid values: normal, any one of dependent on parent tasks (4).
normal dependent on parent task a specified one.
self-Dependency, cannot use.

Invalid dependent parent task for all instances. enable (forward dependency for tomorrow).
    non_normal_all_forward(11),
non-normal dependent on parent task. first one forward (12).
non-normal dependent on parent task, last one.
Not normal, dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task and designates one.

Specifies that all instances dependent on a non-normal parent task are enabled (backward dependency on yesterday).
    non_normal_all_backward(21),
non-normal dependent on parent task. first one backward (22).
Not normal dependent on parent task last one backward.
non-normal dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task.
     */
    public String getLinkDependencyType() {
        return this.LinkDependencyType;
    }

    /**
     * Set Dependency relationship between parent and child tasks.
Enable all instances that normally depend on the parent task.
    normal_all(1),
normal dependent on parent task first one.
Specifies the normal dependent on parent task, which is the last one (3).
Valid values: normal, any one of dependent on parent tasks (4).
normal dependent on parent task a specified one.
self-Dependency, cannot use.

Invalid dependent parent task for all instances. enable (forward dependency for tomorrow).
    non_normal_all_forward(11),
non-normal dependent on parent task. first one forward (12).
non-normal dependent on parent task, last one.
Not normal, dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task and designates one.

Specifies that all instances dependent on a non-normal parent task are enabled (backward dependency on yesterday).
    non_normal_all_backward(21),
non-normal dependent on parent task. first one backward (22).
Not normal dependent on parent task last one backward.
non-normal dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task.
     * @param LinkDependencyType Dependency relationship between parent and child tasks.
Enable all instances that normally depend on the parent task.
    normal_all(1),
normal dependent on parent task first one.
Specifies the normal dependent on parent task, which is the last one (3).
Valid values: normal, any one of dependent on parent tasks (4).
normal dependent on parent task a specified one.
self-Dependency, cannot use.

Invalid dependent parent task for all instances. enable (forward dependency for tomorrow).
    non_normal_all_forward(11),
non-normal dependent on parent task. first one forward (12).
non-normal dependent on parent task, last one.
Not normal, dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task and designates one.

Specifies that all instances dependent on a non-normal parent task are enabled (backward dependency on yesterday).
    non_normal_all_backward(21),
non-normal dependent on parent task. first one backward (22).
Not normal dependent on parent task last one backward.
non-normal dependent on parent task, any one.
Specifies a non-normal task that depends on the parent task.
     */
    public void setLinkDependencyType(String LinkDependencyType) {
        this.LinkDependencyType = LinkDependencyType;
    }

    /**
     * Get Additional attribute information such as branch node and merge node information. 
     * @return LinkExt Additional attribute information such as branch node and merge node information.
     */
    public String getLinkExt() {
        return this.LinkExt;
    }

    /**
     * Set Additional attribute information such as branch node and merge node information.
     * @param LinkExt Additional attribute information such as branch node and merge node information.
     */
    public void setLinkExt(String LinkExt) {
        this.LinkExt = LinkExt;
    }

    public ModifyTaskLinksDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskLinksDsRequest(ModifyTaskLinksDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealFromWorkflowId != null) {
            this.RealFromWorkflowId = new String(source.RealFromWorkflowId);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
        if (source.LinkExt != null) {
            this.LinkExt = new String(source.LinkExt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealFromWorkflowId", this.RealFromWorkflowId);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);
        this.setParamSimple(map, prefix + "LinkExt", this.LinkExt);

    }
}

