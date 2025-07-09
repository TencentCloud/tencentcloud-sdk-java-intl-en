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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStatus extends AbstractModel {

    /**
    * Backup task ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * Snapshot name
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Status
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Backup object
    */
    @SerializedName("BackupObjects")
    @Expose
    private String BackupObjects;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Snapshot end time
    */
    @SerializedName("SnapshotFinishedTime")
    @Expose
    private String SnapshotFinishedTime;

    /**
    * Upload end time
    */
    @SerializedName("UploadFinishedTime")
    @Expose
    private String UploadFinishedTime;

    /**
    * End time
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * Unfinished tasks
    */
    @SerializedName("UnfinishedTasks")
    @Expose
    private String UnfinishedTasks;

    /**
    * Progress
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * Error message
    */
    @SerializedName("TaskErrMsg")
    @Expose
    private String TaskErrMsg;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Timeout information
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Backup instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupJobId")
    @Expose
    private Long BackupJobId;

    /**
    * The ID of the snapshoit corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get Backup task ID 
     * @return JobId Backup task ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set Backup task ID
     * @param JobId Backup task ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Snapshot name 
     * @return SnapshotName Snapshot name
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name
     * @param SnapshotName Snapshot name
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Status 
     * @return State Status
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status
     * @param State Status
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Backup object 
     * @return BackupObjects Backup object
     */
    public String getBackupObjects() {
        return this.BackupObjects;
    }

    /**
     * Set Backup object
     * @param BackupObjects Backup object
     */
    public void setBackupObjects(String BackupObjects) {
        this.BackupObjects = BackupObjects;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Snapshot end time 
     * @return SnapshotFinishedTime Snapshot end time
     */
    public String getSnapshotFinishedTime() {
        return this.SnapshotFinishedTime;
    }

    /**
     * Set Snapshot end time
     * @param SnapshotFinishedTime Snapshot end time
     */
    public void setSnapshotFinishedTime(String SnapshotFinishedTime) {
        this.SnapshotFinishedTime = SnapshotFinishedTime;
    }

    /**
     * Get Upload end time 
     * @return UploadFinishedTime Upload end time
     */
    public String getUploadFinishedTime() {
        return this.UploadFinishedTime;
    }

    /**
     * Set Upload end time
     * @param UploadFinishedTime Upload end time
     */
    public void setUploadFinishedTime(String UploadFinishedTime) {
        this.UploadFinishedTime = UploadFinishedTime;
    }

    /**
     * Get End time 
     * @return FinishedTime End time
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set End time
     * @param FinishedTime End time
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get Unfinished tasks 
     * @return UnfinishedTasks Unfinished tasks
     */
    public String getUnfinishedTasks() {
        return this.UnfinishedTasks;
    }

    /**
     * Set Unfinished tasks
     * @param UnfinishedTasks Unfinished tasks
     */
    public void setUnfinishedTasks(String UnfinishedTasks) {
        this.UnfinishedTasks = UnfinishedTasks;
    }

    /**
     * Get Progress 
     * @return Progress Progress
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress
     * @param Progress Progress
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Error message 
     * @return TaskErrMsg Error message
     */
    public String getTaskErrMsg() {
        return this.TaskErrMsg;
    }

    /**
     * Set Error message
     * @param TaskErrMsg Error message
     */
    public void setTaskErrMsg(String TaskErrMsg) {
        this.TaskErrMsg = TaskErrMsg;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Timeout information 
     * @return Timeout Timeout information
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout information
     * @param Timeout Timeout information
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Backup instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupJobId Backup instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupJobId() {
        return this.BackupJobId;
    }

    /**
     * Set Backup instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupJobId Backup instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupJobId(Long BackupJobId) {
        this.BackupJobId = BackupJobId;
    }

    /**
     * Get The ID of the snapshoit corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId The ID of the snapshoit corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The ID of the snapshoit corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId The ID of the snapshoit corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public BackupStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStatus(BackupStatus source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.BackupObjects != null) {
            this.BackupObjects = new String(source.BackupObjects);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SnapshotFinishedTime != null) {
            this.SnapshotFinishedTime = new String(source.SnapshotFinishedTime);
        }
        if (source.UploadFinishedTime != null) {
            this.UploadFinishedTime = new String(source.UploadFinishedTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.UnfinishedTasks != null) {
            this.UnfinishedTasks = new String(source.UnfinishedTasks);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.TaskErrMsg != null) {
            this.TaskErrMsg = new String(source.TaskErrMsg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.BackupJobId != null) {
            this.BackupJobId = new Long(source.BackupJobId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "BackupObjects", this.BackupObjects);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SnapshotFinishedTime", this.SnapshotFinishedTime);
        this.setParamSimple(map, prefix + "UploadFinishedTime", this.UploadFinishedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "UnfinishedTasks", this.UnfinishedTasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskErrMsg", this.TaskErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "BackupJobId", this.BackupJobId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

