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

public class RestoreStatus extends AbstractModel {

    /**
    * Recover the task ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * Recover the task tag
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Recover the task timestamp
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Recover the database where the task is located
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Recover the task status
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Whether to allow import during recovery
    */
    @SerializedName("AllowLoad")
    @Expose
    private Boolean AllowLoad;

    /**
    * Number of replicas
    */
    @SerializedName("ReplicationNum")
    @Expose
    private String ReplicationNum;

    /**
    * Number of replicas
    */
    @SerializedName("ReplicaAllocation")
    @Expose
    private String ReplicaAllocation;

    /**
    * Recover object
    */
    @SerializedName("RestoreObjects")
    @Expose
    private String RestoreObjects;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Metadata preparation time
    */
    @SerializedName("MetaPreparedTime")
    @Expose
    private String MetaPreparedTime;

    /**
    * Snapshot end time
    */
    @SerializedName("SnapshotFinishedTime")
    @Expose
    private String SnapshotFinishedTime;

    /**
    * Download end time
    */
    @SerializedName("DownloadFinishedTime")
    @Expose
    private String DownloadFinishedTime;

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
    * Operation timeout period
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Whether to maintain the number of replicas in the source table
    */
    @SerializedName("ReserveReplica")
    @Expose
    private Boolean ReserveReplica;

    /**
    * Whether to maintain dynamic partitions in the source table
    */
    @SerializedName("ReserveDynamicPartitionEnable")
    @Expose
    private Boolean ReserveDynamicPartitionEnable;

    /**
    * Backup instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupJobId")
    @Expose
    private Long BackupJobId;

    /**
    * ID of the snapshot corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get Recover the task ID 
     * @return JobId Recover the task ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set Recover the task ID
     * @param JobId Recover the task ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Recover the task tag 
     * @return Label Recover the task tag
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Recover the task tag
     * @param Label Recover the task tag
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Recover the task timestamp 
     * @return Timestamp Recover the task timestamp
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Recover the task timestamp
     * @param Timestamp Recover the task timestamp
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Recover the database where the task is located 
     * @return DbName Recover the database where the task is located
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Recover the database where the task is located
     * @param DbName Recover the database where the task is located
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Recover the task status 
     * @return State Recover the task status
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Recover the task status
     * @param State Recover the task status
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Whether to allow import during recovery 
     * @return AllowLoad Whether to allow import during recovery
     */
    public Boolean getAllowLoad() {
        return this.AllowLoad;
    }

    /**
     * Set Whether to allow import during recovery
     * @param AllowLoad Whether to allow import during recovery
     */
    public void setAllowLoad(Boolean AllowLoad) {
        this.AllowLoad = AllowLoad;
    }

    /**
     * Get Number of replicas 
     * @return ReplicationNum Number of replicas
     */
    public String getReplicationNum() {
        return this.ReplicationNum;
    }

    /**
     * Set Number of replicas
     * @param ReplicationNum Number of replicas
     */
    public void setReplicationNum(String ReplicationNum) {
        this.ReplicationNum = ReplicationNum;
    }

    /**
     * Get Number of replicas 
     * @return ReplicaAllocation Number of replicas
     */
    public String getReplicaAllocation() {
        return this.ReplicaAllocation;
    }

    /**
     * Set Number of replicas
     * @param ReplicaAllocation Number of replicas
     */
    public void setReplicaAllocation(String ReplicaAllocation) {
        this.ReplicaAllocation = ReplicaAllocation;
    }

    /**
     * Get Recover object 
     * @return RestoreObjects Recover object
     */
    public String getRestoreObjects() {
        return this.RestoreObjects;
    }

    /**
     * Set Recover object
     * @param RestoreObjects Recover object
     */
    public void setRestoreObjects(String RestoreObjects) {
        this.RestoreObjects = RestoreObjects;
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
     * Get Metadata preparation time 
     * @return MetaPreparedTime Metadata preparation time
     */
    public String getMetaPreparedTime() {
        return this.MetaPreparedTime;
    }

    /**
     * Set Metadata preparation time
     * @param MetaPreparedTime Metadata preparation time
     */
    public void setMetaPreparedTime(String MetaPreparedTime) {
        this.MetaPreparedTime = MetaPreparedTime;
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
     * Get Download end time 
     * @return DownloadFinishedTime Download end time
     */
    public String getDownloadFinishedTime() {
        return this.DownloadFinishedTime;
    }

    /**
     * Set Download end time
     * @param DownloadFinishedTime Download end time
     */
    public void setDownloadFinishedTime(String DownloadFinishedTime) {
        this.DownloadFinishedTime = DownloadFinishedTime;
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
     * Get Operation timeout period 
     * @return Timeout Operation timeout period
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Operation timeout period
     * @param Timeout Operation timeout period
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Whether to maintain the number of replicas in the source table 
     * @return ReserveReplica Whether to maintain the number of replicas in the source table
     */
    public Boolean getReserveReplica() {
        return this.ReserveReplica;
    }

    /**
     * Set Whether to maintain the number of replicas in the source table
     * @param ReserveReplica Whether to maintain the number of replicas in the source table
     */
    public void setReserveReplica(Boolean ReserveReplica) {
        this.ReserveReplica = ReserveReplica;
    }

    /**
     * Get Whether to maintain dynamic partitions in the source table 
     * @return ReserveDynamicPartitionEnable Whether to maintain dynamic partitions in the source table
     */
    public Boolean getReserveDynamicPartitionEnable() {
        return this.ReserveDynamicPartitionEnable;
    }

    /**
     * Set Whether to maintain dynamic partitions in the source table
     * @param ReserveDynamicPartitionEnable Whether to maintain dynamic partitions in the source table
     */
    public void setReserveDynamicPartitionEnable(Boolean ReserveDynamicPartitionEnable) {
        this.ReserveDynamicPartitionEnable = ReserveDynamicPartitionEnable;
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
     * Get ID of the snapshot corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId ID of the snapshot corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the snapshot corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId ID of the snapshot corresponding to the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public RestoreStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreStatus(RestoreStatus source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AllowLoad != null) {
            this.AllowLoad = new Boolean(source.AllowLoad);
        }
        if (source.ReplicationNum != null) {
            this.ReplicationNum = new String(source.ReplicationNum);
        }
        if (source.ReplicaAllocation != null) {
            this.ReplicaAllocation = new String(source.ReplicaAllocation);
        }
        if (source.RestoreObjects != null) {
            this.RestoreObjects = new String(source.RestoreObjects);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MetaPreparedTime != null) {
            this.MetaPreparedTime = new String(source.MetaPreparedTime);
        }
        if (source.SnapshotFinishedTime != null) {
            this.SnapshotFinishedTime = new String(source.SnapshotFinishedTime);
        }
        if (source.DownloadFinishedTime != null) {
            this.DownloadFinishedTime = new String(source.DownloadFinishedTime);
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
        if (source.ReserveReplica != null) {
            this.ReserveReplica = new Boolean(source.ReserveReplica);
        }
        if (source.ReserveDynamicPartitionEnable != null) {
            this.ReserveDynamicPartitionEnable = new Boolean(source.ReserveDynamicPartitionEnable);
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
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AllowLoad", this.AllowLoad);
        this.setParamSimple(map, prefix + "ReplicationNum", this.ReplicationNum);
        this.setParamSimple(map, prefix + "ReplicaAllocation", this.ReplicaAllocation);
        this.setParamSimple(map, prefix + "RestoreObjects", this.RestoreObjects);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MetaPreparedTime", this.MetaPreparedTime);
        this.setParamSimple(map, prefix + "SnapshotFinishedTime", this.SnapshotFinishedTime);
        this.setParamSimple(map, prefix + "DownloadFinishedTime", this.DownloadFinishedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "UnfinishedTasks", this.UnfinishedTasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskErrMsg", this.TaskErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ReserveReplica", this.ReserveReplica);
        this.setParamSimple(map, prefix + "ReserveDynamicPartitionEnable", this.ReserveDynamicPartitionEnable);
        this.setParamSimple(map, prefix + "BackupJobId", this.BackupJobId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

