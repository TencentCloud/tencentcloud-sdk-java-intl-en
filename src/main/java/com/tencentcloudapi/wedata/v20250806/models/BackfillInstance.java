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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackfillInstance extends AbstractModel {

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies the instance data time.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Execution status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Start time.


    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.


    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Execution duration.


    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

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
     * Get Specifies the instance data time. 
     * @return CurRunDate Specifies the instance data time.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Specifies the instance data time.
     * @param CurRunDate Specifies the instance data time.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Execution status. 
     * @return State Execution status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Execution status.
     * @param State Execution status.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Start time.

 
     * @return StartTime Start time.


     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.


     * @param StartTime Start time.


     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time.

 
     * @return EndTime End time.


     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.


     * @param EndTime End time.


     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Execution duration.

 
     * @return CostTime Execution duration.


     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Execution duration.


     * @param CostTime Execution duration.


     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    public BackfillInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackfillInstance(BackfillInstance source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

