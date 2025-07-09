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

public class TaskInnerInfo extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Cycle Type 0: Crontab Type, 1: minutes, 2: Hour, 3: Days, 4: Weekly, 5: Month, 6: One-time, 7: User-driven, 10: Elastic Cycle (Week), 11: Elastic Cycle (Month), 12: Year, 13: Instant Trigger (Instant Type), isolated from normal cyclic scheduling tasks
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * Real Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RealWorkflowId")
    @Expose
    private String RealWorkflowId;

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
     * Get Task Name 
     * @return TaskName Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name
     * @param TaskName Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get Cycle Type 0: Crontab Type, 1: minutes, 2: Hour, 3: Days, 4: Weekly, 5: Month, 6: One-time, 7: User-driven, 10: Elastic Cycle (Week), 11: Elastic Cycle (Month), 12: Year, 13: Instant Trigger (Instant Type), isolated from normal cyclic scheduling tasks 
     * @return CycleType Cycle Type 0: Crontab Type, 1: minutes, 2: Hour, 3: Days, 4: Weekly, 5: Month, 6: One-time, 7: User-driven, 10: Elastic Cycle (Week), 11: Elastic Cycle (Month), 12: Year, 13: Instant Trigger (Instant Type), isolated from normal cyclic scheduling tasks
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Cycle Type 0: Crontab Type, 1: minutes, 2: Hour, 3: Days, 4: Weekly, 5: Month, 6: One-time, 7: User-driven, 10: Elastic Cycle (Week), 11: Elastic Cycle (Month), 12: Year, 13: Instant Trigger (Instant Type), isolated from normal cyclic scheduling tasks
     * @param CycleType Cycle Type 0: Crontab Type, 1: minutes, 2: Hour, 3: Days, 4: Weekly, 5: Month, 6: One-time, 7: User-driven, 10: Elastic Cycle (Week), 11: Elastic Cycle (Month), 12: Year, 13: Instant Trigger (Instant Type), isolated from normal cyclic scheduling tasks
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualTaskId Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualTaskId Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualFlag Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualFlag Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get Real Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RealWorkflowId Real Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set Real Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RealWorkflowId Real Task Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRealWorkflowId(String RealWorkflowId) {
        this.RealWorkflowId = RealWorkflowId;
    }

    public TaskInnerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInnerInfo(TaskInnerInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.RealWorkflowId != null) {
            this.RealWorkflowId = new String(source.RealWorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "RealWorkflowId", this.RealWorkflowId);

    }
}

