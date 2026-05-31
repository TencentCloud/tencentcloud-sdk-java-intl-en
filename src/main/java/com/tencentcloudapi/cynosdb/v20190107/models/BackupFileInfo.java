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
    * <p>Snapshot file ID, abandoned, please use BackupId</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private Long SnapshotId;

    /**
    * <p>Backup file name</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Backup file size</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>Backup start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Backup completion time.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Backup type: snapshot, snapshot backup; logic, logical backup</p>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>Backup method: auto, automatic backup; manual, manual backup</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>Backup file status: success: backup successful; fail: backup failed; creating: backup file being created; deleting: backup file deleting</p>
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * <p>Backup file time</p>
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * <p>Backup ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * <p>Snapshot type. Value range: full, full; increment, incremental</p>
    */
    @SerializedName("SnapShotType")
    @Expose
    private String SnapShotType;

    /**
    * <p>Backup file remark</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * <p>Delivery status</p>
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * <p>Key id</p>
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * <p>Key region</p>
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
    * <p>Safe info</p>
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * <p>Backup cycle policy</p>
    */
    @SerializedName("BackupPeriodStrategy")
    @Expose
    private String BackupPeriodStrategy;

    /**
     * Get <p>Snapshot file ID, abandoned, please use BackupId</p> 
     * @return SnapshotId <p>Snapshot file ID, abandoned, please use BackupId</p>
     */
    public Long getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>Snapshot file ID, abandoned, please use BackupId</p>
     * @param SnapshotId <p>Snapshot file ID, abandoned, please use BackupId</p>
     */
    public void setSnapshotId(Long SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>Backup file name</p> 
     * @return FileName <p>Backup file name</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Backup file name</p>
     * @param FileName <p>Backup file name</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Backup file size</p> 
     * @return FileSize <p>Backup file size</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>Backup file size</p>
     * @param FileSize <p>Backup file size</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>Backup start time.</p> 
     * @return StartTime <p>Backup start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Backup start time.</p>
     * @param StartTime <p>Backup start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Backup completion time.</p> 
     * @return FinishTime <p>Backup completion time.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Backup completion time.</p>
     * @param FinishTime <p>Backup completion time.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Backup type: snapshot, snapshot backup; logic, logical backup</p> 
     * @return BackupType <p>Backup type: snapshot, snapshot backup; logic, logical backup</p>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>Backup type: snapshot, snapshot backup; logic, logical backup</p>
     * @param BackupType <p>Backup type: snapshot, snapshot backup; logic, logical backup</p>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>Backup method: auto, automatic backup; manual, manual backup</p> 
     * @return BackupMethod <p>Backup method: auto, automatic backup; manual, manual backup</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>Backup method: auto, automatic backup; manual, manual backup</p>
     * @param BackupMethod <p>Backup method: auto, automatic backup; manual, manual backup</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>Backup file status: success: backup successful; fail: backup failed; creating: backup file being created; deleting: backup file deleting</p> 
     * @return BackupStatus <p>Backup file status: success: backup successful; fail: backup failed; creating: backup file being created; deleting: backup file deleting</p>
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set <p>Backup file status: success: backup successful; fail: backup failed; creating: backup file being created; deleting: backup file deleting</p>
     * @param BackupStatus <p>Backup file status: success: backup successful; fail: backup failed; creating: backup file being created; deleting: backup file deleting</p>
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get <p>Backup file time</p> 
     * @return SnapshotTime <p>Backup file time</p>
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set <p>Backup file time</p>
     * @param SnapshotTime <p>Backup file time</p>
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get <p>Backup ID</p> 
     * @return BackupId <p>Backup ID</p>
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>Backup ID</p>
     * @param BackupId <p>Backup ID</p>
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>Snapshot type. Value range: full, full; increment, incremental</p> 
     * @return SnapShotType <p>Snapshot type. Value range: full, full; increment, incremental</p>
     */
    public String getSnapShotType() {
        return this.SnapShotType;
    }

    /**
     * Set <p>Snapshot type. Value range: full, full; increment, incremental</p>
     * @param SnapShotType <p>Snapshot type. Value range: full, full; increment, incremental</p>
     */
    public void setSnapShotType(String SnapShotType) {
        this.SnapShotType = SnapShotType;
    }

    /**
     * Get <p>Backup file remark</p> 
     * @return BackupName <p>Backup file remark</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>Backup file remark</p>
     * @param BackupName <p>Backup file remark</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get <p>Delivery status</p> 
     * @return CopyStatus <p>Delivery status</p>
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set <p>Delivery status</p>
     * @param CopyStatus <p>Delivery status</p>
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get <p>Key id</p> 
     * @return EncryptKeyId <p>Key id</p>
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set <p>Key id</p>
     * @param EncryptKeyId <p>Key id</p>
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get <p>Key region</p> 
     * @return EncryptRegion <p>Key region</p>
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set <p>Key region</p>
     * @param EncryptRegion <p>Key region</p>
     */
    public void setEncryptRegion(String EncryptRegion) {
        this.EncryptRegion = EncryptRegion;
    }

    /**
     * Get <p>Safe info</p> 
     * @return VaultInfos <p>Safe info</p>
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set <p>Safe info</p>
     * @param VaultInfos <p>Safe info</p>
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get <p>Backup cycle policy</p> 
     * @return BackupPeriodStrategy <p>Backup cycle policy</p>
     */
    public String getBackupPeriodStrategy() {
        return this.BackupPeriodStrategy;
    }

    /**
     * Set <p>Backup cycle policy</p>
     * @param BackupPeriodStrategy <p>Backup cycle policy</p>
     */
    public void setBackupPeriodStrategy(String BackupPeriodStrategy) {
        this.BackupPeriodStrategy = BackupPeriodStrategy;
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
        if (source.CopyStatus != null) {
            this.CopyStatus = new String(source.CopyStatus);
        }
        if (source.EncryptKeyId != null) {
            this.EncryptKeyId = new String(source.EncryptKeyId);
        }
        if (source.EncryptRegion != null) {
            this.EncryptRegion = new String(source.EncryptRegion);
        }
        if (source.VaultInfos != null) {
            this.VaultInfos = new VaultInfo[source.VaultInfos.length];
            for (int i = 0; i < source.VaultInfos.length; i++) {
                this.VaultInfos[i] = new VaultInfo(source.VaultInfos[i]);
            }
        }
        if (source.BackupPeriodStrategy != null) {
            this.BackupPeriodStrategy = new String(source.BackupPeriodStrategy);
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
        this.setParamSimple(map, prefix + "CopyStatus", this.CopyStatus);
        this.setParamSimple(map, prefix + "EncryptKeyId", this.EncryptKeyId);
        this.setParamSimple(map, prefix + "EncryptRegion", this.EncryptRegion);
        this.setParamArrayObj(map, prefix + "VaultInfos.", this.VaultInfos);
        this.setParamSimple(map, prefix + "BackupPeriodStrategy", this.BackupPeriodStrategy);

    }
}

