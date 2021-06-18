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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFileInfo extends AbstractModel{

    /**
    * Snapshot file ID used for rollback
    */
    @SerializedName("SnapshotId")
    @Expose
    private Long SnapshotId;

    /**
    * Snapshot file name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Snapshot file size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Snapshot backup start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Snapshot backup end time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Backup type. snapshot: snapshot backup; timepoint: time point backup
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Back mode. auto: auto backup; manual: manual backup
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Backup file status. success: backup succeeded; fail: backup failed; creating: creating backup file; deleting: deleting backup file
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * Backup file time
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
     * Get Snapshot file ID used for rollback 
     * @return SnapshotId Snapshot file ID used for rollback
     */
    public Long getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot file ID used for rollback
     * @param SnapshotId Snapshot file ID used for rollback
     */
    public void setSnapshotId(Long SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Snapshot file name 
     * @return FileName Snapshot file name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Snapshot file name
     * @param FileName Snapshot file name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Snapshot file size 
     * @return FileSize Snapshot file size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Snapshot file size
     * @param FileSize Snapshot file size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Snapshot backup start time 
     * @return StartTime Snapshot backup start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Snapshot backup start time
     * @param StartTime Snapshot backup start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Snapshot backup end time 
     * @return FinishTime Snapshot backup end time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Snapshot backup end time
     * @param FinishTime Snapshot backup end time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Backup type. snapshot: snapshot backup; timepoint: time point backup 
     * @return BackupType Backup type. snapshot: snapshot backup; timepoint: time point backup
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. snapshot: snapshot backup; timepoint: time point backup
     * @param BackupType Backup type. snapshot: snapshot backup; timepoint: time point backup
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Back mode. auto: auto backup; manual: manual backup 
     * @return BackupMethod Back mode. auto: auto backup; manual: manual backup
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Back mode. auto: auto backup; manual: manual backup
     * @param BackupMethod Back mode. auto: auto backup; manual: manual backup
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Backup file status. success: backup succeeded; fail: backup failed; creating: creating backup file; deleting: deleting backup file 
     * @return BackupStatus Backup file status. success: backup succeeded; fail: backup failed; creating: creating backup file; deleting: deleting backup file
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set Backup file status. success: backup succeeded; fail: backup failed; creating: creating backup file; deleting: deleting backup file
     * @param BackupStatus Backup file status. success: backup succeeded; fail: backup failed; creating: creating backup file; deleting: deleting backup file
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get Backup file time 
     * @return SnapshotTime Backup file time
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set Backup file time
     * @param SnapshotTime Backup file time
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    public BackupFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFileInfo(BackupFileInfo source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new Long(source.SnapshotId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);

    }
}

