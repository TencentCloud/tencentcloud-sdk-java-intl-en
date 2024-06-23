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

public class CreateIntegrationNodeRequest extends AbstractModel {

    /**
    * Integrated Node Information
    */
    @SerializedName("NodeInfo")
    @Expose
    private IntegrationNodeInfo NodeInfo;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Type, 201 for real-time tasks, 202 for offline tasks
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get Integrated Node Information 
     * @return NodeInfo Integrated Node Information
     */
    public IntegrationNodeInfo getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set Integrated Node Information
     * @param NodeInfo Integrated Node Information
     */
    public void setNodeInfo(IntegrationNodeInfo NodeInfo) {
        this.NodeInfo = NodeInfo;
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
     * Get Task Type, 201 for real-time tasks, 202 for offline tasks 
     * @return TaskType Task Type, 201 for real-time tasks, 202 for offline tasks
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type, 201 for real-time tasks, 202 for offline tasks
     * @param TaskType Task Type, 201 for real-time tasks, 202 for offline tasks
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public CreateIntegrationNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrationNodeRequest(CreateIntegrationNodeRequest source) {
        if (source.NodeInfo != null) {
            this.NodeInfo = new IntegrationNodeInfo(source.NodeInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NodeInfo.", this.NodeInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

