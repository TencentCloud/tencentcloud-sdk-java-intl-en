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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationTask extends AbstractModel {

    /**
    * Execution activity ID.
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * Execution task ID.
    */
    @SerializedName("InvocationTaskId")
    @Expose
    private String InvocationTaskId;

    /**
    * Command ID.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Execution result.
    */
    @SerializedName("TaskResult")
    @Expose
    private TaskResult TaskResult;

    /**
    * Task start time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Update time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Command details of the execution task.
    */
    @SerializedName("CommandDocument")
    @Expose
    private CommandDocument CommandDocument;

    /**
    * Error message displayed when the execution task fails.
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * Invocation source.

-USER: originate from user invocation.
-INVOKER: originate from scheduled execution.
    */
    @SerializedName("InvocationSource")
    @Expose
    private String InvocationSource;

    /**
    * Name of the executed command.
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
     * Get Execution activity ID. 
     * @return InvocationId Execution activity ID.
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set Execution activity ID.
     * @param InvocationId Execution activity ID.
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get Execution task ID. 
     * @return InvocationTaskId Execution task ID.
     */
    public String getInvocationTaskId() {
        return this.InvocationTaskId;
    }

    /**
     * Set Execution task ID.
     * @param InvocationTaskId Execution task ID.
     */
    public void setInvocationTaskId(String InvocationTaskId) {
        this.InvocationTaskId = InvocationTaskId;
    }

    /**
     * Get Command ID. 
     * @return CommandId Command ID.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Command ID.
     * @param CommandId Command ID.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution). 
     * @return TaskStatus Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
     * @param TaskStatus Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Execution result. 
     * @return TaskResult Execution result.
     */
    public TaskResult getTaskResult() {
        return this.TaskResult;
    }

    /**
     * Set Execution result.
     * @param TaskResult Execution result.
     */
    public void setTaskResult(TaskResult TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * Get Task start time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Task start time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Task start time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time. format: YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Creation time. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return CreatedTime Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param CreatedTime Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return UpdatedTime Update time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Update time. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param UpdatedTime Update time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Command details of the execution task. 
     * @return CommandDocument Command details of the execution task.
     */
    public CommandDocument getCommandDocument() {
        return this.CommandDocument;
    }

    /**
     * Set Command details of the execution task.
     * @param CommandDocument Command details of the execution task.
     */
    public void setCommandDocument(CommandDocument CommandDocument) {
        this.CommandDocument = CommandDocument;
    }

    /**
     * Get Error message displayed when the execution task fails. 
     * @return ErrorInfo Error message displayed when the execution task fails.
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Error message displayed when the execution task fails.
     * @param ErrorInfo Error message displayed when the execution task fails.
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get Invocation source.

-USER: originate from user invocation.
-INVOKER: originate from scheduled execution. 
     * @return InvocationSource Invocation source.

-USER: originate from user invocation.
-INVOKER: originate from scheduled execution.
     */
    public String getInvocationSource() {
        return this.InvocationSource;
    }

    /**
     * Set Invocation source.

-USER: originate from user invocation.
-INVOKER: originate from scheduled execution.
     * @param InvocationSource Invocation source.

-USER: originate from user invocation.
-INVOKER: originate from scheduled execution.
     */
    public void setInvocationSource(String InvocationSource) {
        this.InvocationSource = InvocationSource;
    }

    /**
     * Get Name of the executed command. 
     * @return CommandName Name of the executed command.
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set Name of the executed command.
     * @param CommandName Name of the executed command.
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    public InvocationTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationTask(InvocationTask source) {
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.InvocationTaskId != null) {
            this.InvocationTaskId = new String(source.InvocationTaskId);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskResult != null) {
            this.TaskResult = new TaskResult(source.TaskResult);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.CommandDocument != null) {
            this.CommandDocument = new CommandDocument(source.CommandDocument);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.InvocationSource != null) {
            this.InvocationSource = new String(source.InvocationSource);
        }
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "InvocationTaskId", this.InvocationTaskId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "TaskResult.", this.TaskResult);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamObj(map, prefix + "CommandDocument.", this.CommandDocument);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "InvocationSource", this.InvocationSource);
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);

    }
}

