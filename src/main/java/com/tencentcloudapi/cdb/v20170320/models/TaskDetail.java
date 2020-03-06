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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetail extends AbstractModel{

    /**
    * Error code.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * ID of an instance task.
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * Instance task progress.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Instance task status. Valid values:
"UNDEFINED" - undefined;
"INITIAL" - initializing;
"RUNNING" - running;
"SUCCEED" - succeeded;
"FAILED" - failed;
"KILLED" - terminated;
"REMOVED" - deleted;
"PAUSED" - paused.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Instance task type. Valid values:
"ROLLBACK" - rolling back a database;
"SQL OPERATION" - performing an SQL operation;
"IMPORT DATA" - importing data;
"MODIFY PARAM" - setting a parameter;
"INITIAL" - initializing a TencentDB instance;
"REBOOT" - restarting a TencentDB instance;
"OPEN GTID" - enabling GTID of a TencentDB instance;
"UPGRADE RO" - upgrading a read-only instance;
"BATCH ROLLBACK" - rolling back databases in batches;
"UPGRADE MASTER" - upgrading a master instance;
"DROP TABLES" - dropping a TencentDB table;
"SWITCH DR TO MASTER" - promoting a disaster recovery instance.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Instance task start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Instance task end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * ID of an instance associated with a task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Async task request ID.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
     * Get Error code. 
     * @return Code Error code.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Error code.
     * @param Code Error code.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get ID of an instance task. 
     * @return JobId ID of an instance task.
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set ID of an instance task.
     * @param JobId ID of an instance task.
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Instance task progress. 
     * @return Progress Instance task progress.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Instance task progress.
     * @param Progress Instance task progress.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Instance task status. Valid values:
"UNDEFINED" - undefined;
"INITIAL" - initializing;
"RUNNING" - running;
"SUCCEED" - succeeded;
"FAILED" - failed;
"KILLED" - terminated;
"REMOVED" - deleted;
"PAUSED" - paused. 
     * @return TaskStatus Instance task status. Valid values:
"UNDEFINED" - undefined;
"INITIAL" - initializing;
"RUNNING" - running;
"SUCCEED" - succeeded;
"FAILED" - failed;
"KILLED" - terminated;
"REMOVED" - deleted;
"PAUSED" - paused.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Instance task status. Valid values:
"UNDEFINED" - undefined;
"INITIAL" - initializing;
"RUNNING" - running;
"SUCCEED" - succeeded;
"FAILED" - failed;
"KILLED" - terminated;
"REMOVED" - deleted;
"PAUSED" - paused.
     * @param TaskStatus Instance task status. Valid values:
"UNDEFINED" - undefined;
"INITIAL" - initializing;
"RUNNING" - running;
"SUCCEED" - succeeded;
"FAILED" - failed;
"KILLED" - terminated;
"REMOVED" - deleted;
"PAUSED" - paused.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Instance task type. Valid values:
"ROLLBACK" - rolling back a database;
"SQL OPERATION" - performing an SQL operation;
"IMPORT DATA" - importing data;
"MODIFY PARAM" - setting a parameter;
"INITIAL" - initializing a TencentDB instance;
"REBOOT" - restarting a TencentDB instance;
"OPEN GTID" - enabling GTID of a TencentDB instance;
"UPGRADE RO" - upgrading a read-only instance;
"BATCH ROLLBACK" - rolling back databases in batches;
"UPGRADE MASTER" - upgrading a master instance;
"DROP TABLES" - dropping a TencentDB table;
"SWITCH DR TO MASTER" - promoting a disaster recovery instance. 
     * @return TaskType Instance task type. Valid values:
"ROLLBACK" - rolling back a database;
"SQL OPERATION" - performing an SQL operation;
"IMPORT DATA" - importing data;
"MODIFY PARAM" - setting a parameter;
"INITIAL" - initializing a TencentDB instance;
"REBOOT" - restarting a TencentDB instance;
"OPEN GTID" - enabling GTID of a TencentDB instance;
"UPGRADE RO" - upgrading a read-only instance;
"BATCH ROLLBACK" - rolling back databases in batches;
"UPGRADE MASTER" - upgrading a master instance;
"DROP TABLES" - dropping a TencentDB table;
"SWITCH DR TO MASTER" - promoting a disaster recovery instance.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Instance task type. Valid values:
"ROLLBACK" - rolling back a database;
"SQL OPERATION" - performing an SQL operation;
"IMPORT DATA" - importing data;
"MODIFY PARAM" - setting a parameter;
"INITIAL" - initializing a TencentDB instance;
"REBOOT" - restarting a TencentDB instance;
"OPEN GTID" - enabling GTID of a TencentDB instance;
"UPGRADE RO" - upgrading a read-only instance;
"BATCH ROLLBACK" - rolling back databases in batches;
"UPGRADE MASTER" - upgrading a master instance;
"DROP TABLES" - dropping a TencentDB table;
"SWITCH DR TO MASTER" - promoting a disaster recovery instance.
     * @param TaskType Instance task type. Valid values:
"ROLLBACK" - rolling back a database;
"SQL OPERATION" - performing an SQL operation;
"IMPORT DATA" - importing data;
"MODIFY PARAM" - setting a parameter;
"INITIAL" - initializing a TencentDB instance;
"REBOOT" - restarting a TencentDB instance;
"OPEN GTID" - enabling GTID of a TencentDB instance;
"UPGRADE RO" - upgrading a read-only instance;
"BATCH ROLLBACK" - rolling back databases in batches;
"UPGRADE MASTER" - upgrading a master instance;
"DROP TABLES" - dropping a TencentDB table;
"SWITCH DR TO MASTER" - promoting a disaster recovery instance.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Instance task start time. 
     * @return StartTime Instance task start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Instance task start time.
     * @param StartTime Instance task start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Instance task end time. 
     * @return EndTime Instance task end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Instance task end time.
     * @param EndTime Instance task end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get ID of an instance associated with a task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceIds ID of an instance associated with a task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID of an instance associated with a task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceIds ID of an instance associated with a task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Async task request ID. 
     * @return AsyncRequestId Async task request ID.
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task request ID.
     * @param AsyncRequestId Async task request ID.
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);

    }
}

