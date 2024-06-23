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

public class DescribeDependOpsTasksRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Upstream/Downstream Levels 1-6
    */
    @SerializedName("Deep")
    @Expose
    private Long Deep;

    /**
    * 1: Indicates querying upstream nodes; 0: Indicates querying downstream nodes; 2: Indicates querying both upstream and downstream nodes
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Upstream/Downstream Levels 1-6 
     * @return Deep Upstream/Downstream Levels 1-6
     */
    public Long getDeep() {
        return this.Deep;
    }

    /**
     * Set Upstream/Downstream Levels 1-6
     * @param Deep Upstream/Downstream Levels 1-6
     */
    public void setDeep(Long Deep) {
        this.Deep = Deep;
    }

    /**
     * Get 1: Indicates querying upstream nodes; 0: Indicates querying downstream nodes; 2: Indicates querying both upstream and downstream nodes 
     * @return Up 1: Indicates querying upstream nodes; 0: Indicates querying downstream nodes; 2: Indicates querying both upstream and downstream nodes
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 1: Indicates querying upstream nodes; 0: Indicates querying downstream nodes; 2: Indicates querying both upstream and downstream nodes
     * @param Up 1: Indicates querying upstream nodes; 0: Indicates querying downstream nodes; 2: Indicates querying both upstream and downstream nodes
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

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
     * Get Task Workflow ID 
     * @return WorkflowId Task Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Task Workflow ID
     * @param WorkflowId Task Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public DescribeDependOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDependOpsTasksRequest(DescribeDependOpsTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Deep != null) {
            this.Deep = new Long(source.Deep);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Deep", this.Deep);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

