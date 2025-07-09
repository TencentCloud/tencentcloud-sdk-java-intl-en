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

public class DrInstanceOpsDto extends AbstractModel {

    /**
    * Task Source
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
    * Orchestration Space jobId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Task Submission Record Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * Subtask record id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SonRecordId")
    @Expose
    private Long SonRecordId;

    /**
    * Task instance Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * For orchestration space, the task id; for development space, the script id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Script COS address
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * Trial run content
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Task submission time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task start time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Running duration (seconds)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * Trial run status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * For orchestration space, the task name; for development space, the script name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Trial run submitter
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubmitUserName")
    @Expose
    private String SubmitUserName;

    /**
    * Trial run submitter userId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubmitUserId")
    @Expose
    private String SubmitUserId;

    /**
    * Task TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Contains result set
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HasResultSet")
    @Expose
    private Boolean HasResultSet;

    /**
     * Get Task Source
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskSource Task Source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set Task Source
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskSource Task Source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    /**
     * Get Orchestration Space jobId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return JobId Orchestration Space jobId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Orchestration Space jobId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param JobId Orchestration Space jobId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Task Submission Record Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RecordId Task Submission Record Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Task Submission Record Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RecordId Task Submission Record Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Subtask record id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SonRecordId Subtask record id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSonRecordId() {
        return this.SonRecordId;
    }

    /**
     * Set Subtask record id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SonRecordId Subtask record id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSonRecordId(Long SonRecordId) {
        this.SonRecordId = SonRecordId;
    }

    /**
     * Get Task instance Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Task instance Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Task instance Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Task instance Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get For orchestration space, the task id; for development space, the script id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId For orchestration space, the task id; for development space, the script id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set For orchestration space, the task id; for development space, the script id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId For orchestration space, the task id; for development space, the script id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Script COS address
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemotePath Script COS address
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set Script COS address
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemotePath Script COS address
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get Trial run content
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScriptContent Trial run content
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Trial run content
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScriptContent Trial run content
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Task submission time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Task submission time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task submission time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Task submission time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task start time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Task start time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Task start time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Running duration (seconds)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Duration Running duration (seconds)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Running duration (seconds)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Duration Running duration (seconds)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Trial run status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Trial run status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Trial run status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Trial run status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get For orchestration space, the task name; for development space, the script name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName For orchestration space, the task name; for development space, the script name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set For orchestration space, the task name; for development space, the script name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName For orchestration space, the task name; for development space, the script name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Trial run submitter
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubmitUserName Trial run submitter
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubmitUserName() {
        return this.SubmitUserName;
    }

    /**
     * Set Trial run submitter
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubmitUserName Trial run submitter
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmitUserName(String SubmitUserName) {
        this.SubmitUserName = SubmitUserName;
    }

    /**
     * Get Trial run submitter userId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubmitUserId Trial run submitter userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubmitUserId() {
        return this.SubmitUserId;
    }

    /**
     * Set Trial run submitter userId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubmitUserId Trial run submitter userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmitUserId(String SubmitUserId) {
        this.SubmitUserId = SubmitUserId;
    }

    /**
     * Get Task TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskType Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskType Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Contains result set
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HasResultSet Contains result set
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getHasResultSet() {
        return this.HasResultSet;
    }

    /**
     * Set Contains result set
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HasResultSet Contains result set
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHasResultSet(Boolean HasResultSet) {
        this.HasResultSet = HasResultSet;
    }

    public DrInstanceOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrInstanceOpsDto(DrInstanceOpsDto source) {
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.SonRecordId != null) {
            this.SonRecordId = new Long(source.SonRecordId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SubmitUserName != null) {
            this.SubmitUserName = new String(source.SubmitUserName);
        }
        if (source.SubmitUserId != null) {
            this.SubmitUserId = new String(source.SubmitUserId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.HasResultSet != null) {
            this.HasResultSet = new Boolean(source.HasResultSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "SonRecordId", this.SonRecordId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SubmitUserName", this.SubmitUserName);
        this.setParamSimple(map, prefix + "SubmitUserId", this.SubmitUserId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "HasResultSet", this.HasResultSet);

    }
}

