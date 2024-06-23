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

public class DescribeSchedulerRunTimeInstanceCntByStatusRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Cycle Type
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Time Unit e.g.: 12h
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Start Date: 2023-03-02
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Before End Date: 2023-03-20
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task Type
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Person in Charge
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Sort Fields
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * Ascending/Descending Order
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

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
     * Get Cycle Type 
     * @return CycleUnit Cycle Type
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Cycle Type
     * @param CycleUnit Cycle Type
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Time Unit e.g.: 12h 
     * @return TimeUnit Time Unit e.g.: 12h
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time Unit e.g.: 12h
     * @param TimeUnit Time Unit e.g.: 12h
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Start Date: 2023-03-02 
     * @return StartTime Start Date: 2023-03-02
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Date: 2023-03-02
     * @param StartTime Start Date: 2023-03-02
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Before End Date: 2023-03-20 
     * @return EndTime Before End Date: 2023-03-20
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Before End Date: 2023-03-20
     * @param EndTime Before End Date: 2023-03-20
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task Type 
     * @return TaskType Task Type
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type
     * @param TaskType Task Type
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Person in Charge 
     * @return InCharge Person in Charge
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Person in Charge
     * @param InCharge Person in Charge
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
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
     * Get Sort Fields 
     * @return SortItem Sort Fields
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set Sort Fields
     * @param SortItem Sort Fields
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get Ascending/Descending Order 
     * @return SortType Ascending/Descending Order
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Ascending/Descending Order
     * @param SortType Ascending/Descending Order
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    public DescribeSchedulerRunTimeInstanceCntByStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulerRunTimeInstanceCntByStatusRequest(DescribeSchedulerRunTimeInstanceCntByStatusRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

