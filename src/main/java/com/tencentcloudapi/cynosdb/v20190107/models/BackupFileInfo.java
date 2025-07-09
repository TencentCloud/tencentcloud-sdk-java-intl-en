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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFileInfo extends AbstractModel {

    /**
    * Snapshot file ID, which is deprecated. You need to use `BackupId`.
    */
    @SerializedName("SnapshotId")
    @Expose
    private Long SnapshotId;

    /**
    * Backup file name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Backup file size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Backup start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup end time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
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
    * Backup ID.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Specifies the snapshot type. valid values: full (full snapshot); increment (incremental snapshot).
    */
    @SerializedName("SnapShotType")
    @Expose
    private String SnapShotType;

    /**
    * Specifies the remark of the backup file.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get Snapshot file ID, which is deprecated. You need to use `BackupId`. 
     * @return SnapshotId Snapshot file ID, which is deprecated. You need to use `BackupId`.
     */
    public Long getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot file ID, which is deprecated. You need to use `BackupId`.
     * @param SnapshotId Snapshot file ID, which is deprecated. You need to use `BackupId`.
     */
    public void setSnapshotId(Long SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Backup file name 
     * @return FileName Backup file name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Backup file name
     * @param FileName Backup file name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Backup file size 
     * @return FileSize Backup file size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Backup file size
     * @param FileSize Backup file size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Backup start time 
     * @return StartTime Backup start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup start time
     * @param StartTime Backup start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup end time 
     * @return FinishTime Backup end time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Backup end time
     * @param FinishTime Backup end time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup). 
     * @return BackupType Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
     * @param BackupType Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
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

    /**
     * Get Backup ID. 
     * @return BackupId Backup ID.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup ID.
     * @param BackupId Backup ID.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Specifies the snapshot type. valid values: full (full snapshot); increment (incremental snapshot). 
     * @return SnapShotType Specifies the snapshot type. valid values: full (full snapshot); increment (incremental snapshot).
     */
    public String getSnapShotType() {
        return this.SnapShotType;
    }

    /**
     * Set Specifies the snapshot type. valid values: full (full snapshot); increment (incremental snapshot).
     * @param SnapShotType Specifies the snapshot type. valid values: full (full snapshot); increment (incremental snapshot).
     */
    public void setSnapShotType(String SnapShotType) {
        this.SnapShotType = SnapShotType;
    }

    /**
     * Get Specifies the remark of the backup file. 
     * @return BackupName Specifies the remark of the backup file.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Specifies the remark of the backup file.
     * @param BackupName Specifies the remark of the backup file.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
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
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.SnapShotType != null) {
            this.SnapShotType = new String(source.SnapShotType);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
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
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "SnapShotType", this.SnapShotType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

