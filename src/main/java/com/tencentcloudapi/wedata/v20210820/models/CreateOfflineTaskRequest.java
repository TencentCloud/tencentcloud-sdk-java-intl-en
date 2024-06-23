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

public class CreateOfflineTaskRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Interval, optional, default is 1. Not null. Default is 1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Delayed Execution Time, in minutes
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Task End Data Time. Not Empty. Default to Current Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Remarks
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * Current date
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Keep it consistent with the previous call to the scheduling interface 27
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Time Specification, for monthly tasks specify days like 1,3, then enter 1,3. Not Empty. Default "" Monthly Task: For specific days like "1,3", specifying the end of the month cannot be combined with specific dates, can only be "L"
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Distinguish between canvas and form
    */
    @SerializedName("TaskMode")
    @Expose
    private String TaskMode;

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
     * Get Interval, optional, default is 1. Not null. Default is 1 
     * @return CycleStep Interval, optional, default is 1. Not null. Default is 1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Interval, optional, default is 1. Not null. Default is 1
     * @param CycleStep Interval, optional, default is 1. Not null. Default is 1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Delayed Execution Time, in minutes 
     * @return DelayTime Delayed Execution Time, in minutes
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delayed Execution Time, in minutes
     * @param DelayTime Delayed Execution Time, in minutes
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Task End Data Time. Not Empty. Default to Current Time 
     * @return EndTime Task End Data Time. Not Empty. Default to Current Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task End Data Time. Not Empty. Default to Current Time
     * @param EndTime Task End Data Time. Not Empty. Default to Current Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Remarks 
     * @return Notes Remarks
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set Remarks
     * @param Notes Remarks
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get Current date 
     * @return StartTime Current date
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Current date
     * @param StartTime Current date
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get Keep it consistent with the previous call to the scheduling interface 27 
     * @return TypeId Keep it consistent with the previous call to the scheduling interface 27
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Keep it consistent with the previous call to the scheduling interface 27
     * @param TypeId Keep it consistent with the previous call to the scheduling interface 27
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Time Specification, for monthly tasks specify days like 1,3, then enter 1,3. Not Empty. Default "" Monthly Task: For specific days like "1,3", specifying the end of the month cannot be combined with specific dates, can only be "L" 
     * @return TaskAction Time Specification, for monthly tasks specify days like 1,3, then enter 1,3. Not Empty. Default "" Monthly Task: For specific days like "1,3", specifying the end of the month cannot be combined with specific dates, can only be "L"
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Time Specification, for monthly tasks specify days like 1,3, then enter 1,3. Not Empty. Default "" Monthly Task: For specific days like "1,3", specifying the end of the month cannot be combined with specific dates, can only be "L"
     * @param TaskAction Time Specification, for monthly tasks specify days like 1,3, then enter 1,3. Not Empty. Default "" Monthly Task: For specific days like "1,3", specifying the end of the month cannot be combined with specific dates, can only be "L"
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Distinguish between canvas and form 
     * @return TaskMode Distinguish between canvas and form
     */
    public String getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Distinguish between canvas and form
     * @param TaskMode Distinguish between canvas and form
     */
    public void setTaskMode(String TaskMode) {
        this.TaskMode = TaskMode;
    }

    public CreateOfflineTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOfflineTaskRequest(CreateOfflineTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new String(source.TaskMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);

    }
}

