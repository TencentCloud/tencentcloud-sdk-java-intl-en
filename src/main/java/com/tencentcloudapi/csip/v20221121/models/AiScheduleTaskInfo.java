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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiScheduleTaskInfo extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>ID of the AI scheduled task it belongs to.</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private String ScheduleId;

    /**
    * <p>ID of the trigger that triggers the task.</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>Unique conversation ID of the Agent call.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Execution status.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Agent output result or error detail.</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>Planned trigger time, Unix millisecond timestamp.</p>
    */
    @SerializedName("ScheduledTime")
    @Expose
    private Long ScheduledTime;

    /**
    * <p>Actual start execution time, Unix millisecond timestamp.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Execution completion time, Unix millisecond timestamp.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Creation time, Unix millisecond timestamp.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Update time, Unix millisecond timestamp.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>Scheduled task name</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Scheduled task prompt</p>
    */
    @SerializedName("Prompts")
    @Expose
    private String Prompts;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>ID of the AI scheduled task it belongs to.</p> 
     * @return ScheduleId <p>ID of the AI scheduled task it belongs to.</p>
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>ID of the AI scheduled task it belongs to.</p>
     * @param ScheduleId <p>ID of the AI scheduled task it belongs to.</p>
     */
    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>ID of the trigger that triggers the task.</p> 
     * @return TriggerId <p>ID of the trigger that triggers the task.</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>ID of the trigger that triggers the task.</p>
     * @param TriggerId <p>ID of the trigger that triggers the task.</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>Unique conversation ID of the Agent call.</p> 
     * @return SessionId <p>Unique conversation ID of the Agent call.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Unique conversation ID of the Agent call.</p>
     * @param SessionId <p>Unique conversation ID of the Agent call.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Execution status.</p> 
     * @return Status <p>Execution status.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Execution status.</p>
     * @param Status <p>Execution status.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Agent output result or error detail.</p> 
     * @return Result <p>Agent output result or error detail.</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>Agent output result or error detail.</p>
     * @param Result <p>Agent output result or error detail.</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>Planned trigger time, Unix millisecond timestamp.</p> 
     * @return ScheduledTime <p>Planned trigger time, Unix millisecond timestamp.</p>
     */
    public Long getScheduledTime() {
        return this.ScheduledTime;
    }

    /**
     * Set <p>Planned trigger time, Unix millisecond timestamp.</p>
     * @param ScheduledTime <p>Planned trigger time, Unix millisecond timestamp.</p>
     */
    public void setScheduledTime(Long ScheduledTime) {
        this.ScheduledTime = ScheduledTime;
    }

    /**
     * Get <p>Actual start execution time, Unix millisecond timestamp.</p> 
     * @return StartTime <p>Actual start execution time, Unix millisecond timestamp.</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Actual start execution time, Unix millisecond timestamp.</p>
     * @param StartTime <p>Actual start execution time, Unix millisecond timestamp.</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Execution completion time, Unix millisecond timestamp.</p> 
     * @return EndTime <p>Execution completion time, Unix millisecond timestamp.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Execution completion time, Unix millisecond timestamp.</p>
     * @param EndTime <p>Execution completion time, Unix millisecond timestamp.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Creation time, Unix millisecond timestamp.</p> 
     * @return CreateTime <p>Creation time, Unix millisecond timestamp.</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, Unix millisecond timestamp.</p>
     * @param CreateTime <p>Creation time, Unix millisecond timestamp.</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time, Unix millisecond timestamp.</p> 
     * @return UpdateTime <p>Update time, Unix millisecond timestamp.</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, Unix millisecond timestamp.</p>
     * @param UpdateTime <p>Update time, Unix millisecond timestamp.</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Scheduled task name</p> 
     * @return TaskName <p>Scheduled task name</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Scheduled task name</p>
     * @param TaskName <p>Scheduled task name</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Scheduled task prompt</p> 
     * @return Prompts <p>Scheduled task prompt</p>
     */
    public String getPrompts() {
        return this.Prompts;
    }

    /**
     * Set <p>Scheduled task prompt</p>
     * @param Prompts <p>Scheduled task prompt</p>
     */
    public void setPrompts(String Prompts) {
        this.Prompts = Prompts;
    }

    public AiScheduleTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiScheduleTaskInfo(AiScheduleTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new Long(source.ScheduledTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);

    }
}

