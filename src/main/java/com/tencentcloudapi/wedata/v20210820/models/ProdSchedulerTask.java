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

public class ProdSchedulerTask extends AbstractModel {

    /**
    * Production Scheduling Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Production Scheduling Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Production Scheduling Task Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Production Scheduling Task Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
     * Get Production Scheduling Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Production Scheduling Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Production Scheduling Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Production Scheduling Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Production Scheduling Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Production Scheduling Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Production Scheduling Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Production Scheduling Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Production Scheduling Task Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Production Scheduling Task Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Production Scheduling Task Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Production Scheduling Task Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Production Scheduling Task Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleType Production Scheduling Task Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Production Scheduling Task Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleType Production Scheduling Task Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    public ProdSchedulerTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProdSchedulerTask(ProdSchedulerTask source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);

    }
}

