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

public class DescribeStatisticInstanceStatusTrendOpsRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Type Id
    */
    @SerializedName("TaskTypeId")
    @Expose
    private String TaskTypeId;

    /**
    * Time Type
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
    * Task Type Name
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Resource Group ID
    */
    @SerializedName("ExecutionGroupId")
    @Expose
    private String ExecutionGroupId;

    /**
    * Resource Group Name
    */
    @SerializedName("ExecutionGroupName")
    @Expose
    private String ExecutionGroupName;

    /**
    * 1
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 1
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 1
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * D represents days, H represents hours
    */
    @SerializedName("AggregationUnit")
    @Expose
    private String AggregationUnit;

    /**
    * 1
    */
    @SerializedName("AverageWindowSize")
    @Expose
    private Long AverageWindowSize;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

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
     * Get Task Type Id 
     * @return TaskTypeId Task Type Id
     */
    public String getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task Type Id
     * @param TaskTypeId Task Type Id
     */
    public void setTaskTypeId(String TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Time Type 
     * @return TimeType Time Type
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set Time Type
     * @param TimeType Time Type
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get Task Type Name 
     * @return TypeName Task Type Name
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Task Type Name
     * @param TypeName Task Type Name
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Start Time 
     * @return StartTime Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time
     * @param StartTime Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Resource Group ID 
     * @return ExecutionGroupId Resource Group ID
     */
    public String getExecutionGroupId() {
        return this.ExecutionGroupId;
    }

    /**
     * Set Resource Group ID
     * @param ExecutionGroupId Resource Group ID
     */
    public void setExecutionGroupId(String ExecutionGroupId) {
        this.ExecutionGroupId = ExecutionGroupId;
    }

    /**
     * Get Resource Group Name 
     * @return ExecutionGroupName Resource Group Name
     */
    public String getExecutionGroupName() {
        return this.ExecutionGroupName;
    }

    /**
     * Set Resource Group Name
     * @param ExecutionGroupName Resource Group Name
     */
    public void setExecutionGroupName(String ExecutionGroupName) {
        this.ExecutionGroupName = ExecutionGroupName;
    }

    /**
     * Get 1 
     * @return InCharge 1
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 1
     * @param InCharge 1
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 1 
     * @return TaskType 1
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 1
     * @param TaskType 1
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 1 
     * @return StateList 1
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 1
     * @param StateList 1
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get D represents days, H represents hours 
     * @return AggregationUnit D represents days, H represents hours
     */
    public String getAggregationUnit() {
        return this.AggregationUnit;
    }

    /**
     * Set D represents days, H represents hours
     * @param AggregationUnit D represents days, H represents hours
     */
    public void setAggregationUnit(String AggregationUnit) {
        this.AggregationUnit = AggregationUnit;
    }

    /**
     * Get 1 
     * @return AverageWindowSize 1
     */
    public Long getAverageWindowSize() {
        return this.AverageWindowSize;
    }

    /**
     * Set 1
     * @param AverageWindowSize 1
     */
    public void setAverageWindowSize(Long AverageWindowSize) {
        this.AverageWindowSize = AverageWindowSize;
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

    public DescribeStatisticInstanceStatusTrendOpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticInstanceStatusTrendOpsRequest(DescribeStatisticInstanceStatusTrendOpsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new String(source.TaskTypeId);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecutionGroupId != null) {
            this.ExecutionGroupId = new String(source.ExecutionGroupId);
        }
        if (source.ExecutionGroupName != null) {
            this.ExecutionGroupName = new String(source.ExecutionGroupName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
        if (source.AggregationUnit != null) {
            this.AggregationUnit = new String(source.AggregationUnit);
        }
        if (source.AverageWindowSize != null) {
            this.AverageWindowSize = new Long(source.AverageWindowSize);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionGroupId", this.ExecutionGroupId);
        this.setParamSimple(map, prefix + "ExecutionGroupName", this.ExecutionGroupName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamSimple(map, prefix + "AggregationUnit", this.AggregationUnit);
        this.setParamSimple(map, prefix + "AverageWindowSize", this.AverageWindowSize);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

