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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBackup extends AbstractModel {

    /**
    * <p>Whether to enable cos automatic backup</p>
    */
    @SerializedName("IsAutoBackup")
    @Expose
    private Boolean IsAutoBackup;

    /**
    * <p>Automatic backup execution time (accurate to the hour), e.g. "22:00"</p>
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * <p>Backup snapshot prefix</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>0 (Tencent Cloud repository); 1 (customer repository)</p>
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * <p>Managed snapshot repository name.</p>
    */
    @SerializedName("PaasEsRepository")
    @Expose
    private String PaasEsRepository;

    /**
    * <p>Customer snapshot repository name</p>
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * <p>cos storage folder directory</p>
    */
    @SerializedName("CosBasePath")
    @Expose
    private String CosBasePath;

    /**
    * <p>Snapshot storage cycle in days</p>
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * <p>Auto backup frequency in hours.</p>
    */
    @SerializedName("AutoBackupInterval")
    @Expose
    private Long AutoBackupInterval;

    /**
    * <p>Backup lock. Valid values: 0 (not locked) and 1 (locked).</p>
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * <p>Lock expiration date, such as 2022-12-10T08:34:48.000Z.</p>
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * <p>Lock grace period</p>
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * <p>Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).</p>
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * <p>Region name for cross-regional backup, such as ap-guangzhou.</p>
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>Backup index list. If left empty, it means to back up all indexes.</p>
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * <p>cos multi-AZ backup. 0: single AZ; 1: multi-AZ</p>
    */
    @SerializedName("MultiAz")
    @Expose
    private Long MultiAz;

    /**
    * <p>Maximum speed of write to the repository per node max_snapshot_bytes_per_sec, default 40m</p>
    */
    @SerializedName("MaxSnapshotPerSec")
    @Expose
    private String MaxSnapshotPerSec;

    /**
    * <p>Maximum speed of reading the repository per node max_restore_bytes_per_sec. Default is 40m before 710, and default unlimited from 710 onwards</p>
    */
    @SerializedName("MaxRestorePerSec")
    @Expose
    private String MaxRestorePerSec;

    /**
    * <p>Policy creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Whether to enable cos automatic backup</p> 
     * @return IsAutoBackup <p>Whether to enable cos automatic backup</p>
     */
    public Boolean getIsAutoBackup() {
        return this.IsAutoBackup;
    }

    /**
     * Set <p>Whether to enable cos automatic backup</p>
     * @param IsAutoBackup <p>Whether to enable cos automatic backup</p>
     */
    public void setIsAutoBackup(Boolean IsAutoBackup) {
        this.IsAutoBackup = IsAutoBackup;
    }

    /**
     * Get <p>Automatic backup execution time (accurate to the hour), e.g. "22:00"</p> 
     * @return BackupTime <p>Automatic backup execution time (accurate to the hour), e.g. "22:00"</p>
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set <p>Automatic backup execution time (accurate to the hour), e.g. "22:00"</p>
     * @param BackupTime <p>Automatic backup execution time (accurate to the hour), e.g. "22:00"</p>
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get <p>Backup snapshot prefix</p> 
     * @return SnapshotName <p>Backup snapshot prefix</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>Backup snapshot prefix</p>
     * @param SnapshotName <p>Backup snapshot prefix</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>0 (Tencent Cloud repository); 1 (customer repository)</p> 
     * @return EsRepositoryType <p>0 (Tencent Cloud repository); 1 (customer repository)</p>
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set <p>0 (Tencent Cloud repository); 1 (customer repository)</p>
     * @param EsRepositoryType <p>0 (Tencent Cloud repository); 1 (customer repository)</p>
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get <p>Managed snapshot repository name.</p> 
     * @return PaasEsRepository <p>Managed snapshot repository name.</p>
     */
    public String getPaasEsRepository() {
        return this.PaasEsRepository;
    }

    /**
     * Set <p>Managed snapshot repository name.</p>
     * @param PaasEsRepository <p>Managed snapshot repository name.</p>
     */
    public void setPaasEsRepository(String PaasEsRepository) {
        this.PaasEsRepository = PaasEsRepository;
    }

    /**
     * Get <p>Customer snapshot repository name</p> 
     * @return UserEsRepository <p>Customer snapshot repository name</p>
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set <p>Customer snapshot repository name</p>
     * @param UserEsRepository <p>Customer snapshot repository name</p>
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get <p>cos storage folder directory</p> 
     * @return CosBasePath <p>cos storage folder directory</p>
     */
    public String getCosBasePath() {
        return this.CosBasePath;
    }

    /**
     * Set <p>cos storage folder directory</p>
     * @param CosBasePath <p>cos storage folder directory</p>
     */
    public void setCosBasePath(String CosBasePath) {
        this.CosBasePath = CosBasePath;
    }

    /**
     * Get <p>Snapshot storage cycle in days</p> 
     * @return StorageDuration <p>Snapshot storage cycle in days</p>
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set <p>Snapshot storage cycle in days</p>
     * @param StorageDuration <p>Snapshot storage cycle in days</p>
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get <p>Auto backup frequency in hours.</p> 
     * @return AutoBackupInterval <p>Auto backup frequency in hours.</p>
     */
    public Long getAutoBackupInterval() {
        return this.AutoBackupInterval;
    }

    /**
     * Set <p>Auto backup frequency in hours.</p>
     * @param AutoBackupInterval <p>Auto backup frequency in hours.</p>
     */
    public void setAutoBackupInterval(Long AutoBackupInterval) {
        this.AutoBackupInterval = AutoBackupInterval;
    }

    /**
     * Get <p>Backup lock. Valid values: 0 (not locked) and 1 (locked).</p> 
     * @return CosRetention <p>Backup lock. Valid values: 0 (not locked) and 1 (locked).</p>
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set <p>Backup lock. Valid values: 0 (not locked) and 1 (locked).</p>
     * @param CosRetention <p>Backup lock. Valid values: 0 (not locked) and 1 (locked).</p>
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get <p>Lock expiration date, such as 2022-12-10T08:34:48.000Z.</p> 
     * @return RetainUntilDate <p>Lock expiration date, such as 2022-12-10T08:34:48.000Z.</p>
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set <p>Lock expiration date, such as 2022-12-10T08:34:48.000Z.</p>
     * @param RetainUntilDate <p>Lock expiration date, such as 2022-12-10T08:34:48.000Z.</p>
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get <p>Lock grace period</p> 
     * @return RetentionGraceTime <p>Lock grace period</p>
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set <p>Lock grace period</p>
     * @param RetentionGraceTime <p>Lock grace period</p>
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get <p>Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).</p> 
     * @return RemoteCos <p>Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).</p>
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set <p>Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).</p>
     * @param RemoteCos <p>Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).</p>
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get <p>Region name for cross-regional backup, such as ap-guangzhou.</p> 
     * @return RemoteCosRegion <p>Region name for cross-regional backup, such as ap-guangzhou.</p>
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set <p>Region name for cross-regional backup, such as ap-guangzhou.</p>
     * @param RemoteCosRegion <p>Region name for cross-regional backup, such as ap-guangzhou.</p>
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    /**
     * Get <p>Policy name.</p> 
     * @return StrategyName <p>Policy name.</p>
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>Policy name.</p>
     * @param StrategyName <p>Policy name.</p>
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>Backup index list. If left empty, it means to back up all indexes.</p> 
     * @return Indices <p>Backup index list. If left empty, it means to back up all indexes.</p>
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set <p>Backup index list. If left empty, it means to back up all indexes.</p>
     * @param Indices <p>Backup index list. If left empty, it means to back up all indexes.</p>
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get <p>cos multi-AZ backup. 0: single AZ; 1: multi-AZ</p> 
     * @return MultiAz <p>cos multi-AZ backup. 0: single AZ; 1: multi-AZ</p>
     */
    public Long getMultiAz() {
        return this.MultiAz;
    }

    /**
     * Set <p>cos multi-AZ backup. 0: single AZ; 1: multi-AZ</p>
     * @param MultiAz <p>cos multi-AZ backup. 0: single AZ; 1: multi-AZ</p>
     */
    public void setMultiAz(Long MultiAz) {
        this.MultiAz = MultiAz;
    }

    /**
     * Get <p>Maximum speed of write to the repository per node max_snapshot_bytes_per_sec, default 40m</p> 
     * @return MaxSnapshotPerSec <p>Maximum speed of write to the repository per node max_snapshot_bytes_per_sec, default 40m</p>
     */
    public String getMaxSnapshotPerSec() {
        return this.MaxSnapshotPerSec;
    }

    /**
     * Set <p>Maximum speed of write to the repository per node max_snapshot_bytes_per_sec, default 40m</p>
     * @param MaxSnapshotPerSec <p>Maximum speed of write to the repository per node max_snapshot_bytes_per_sec, default 40m</p>
     */
    public void setMaxSnapshotPerSec(String MaxSnapshotPerSec) {
        this.MaxSnapshotPerSec = MaxSnapshotPerSec;
    }

    /**
     * Get <p>Maximum speed of reading the repository per node max_restore_bytes_per_sec. Default is 40m before 710, and default unlimited from 710 onwards</p> 
     * @return MaxRestorePerSec <p>Maximum speed of reading the repository per node max_restore_bytes_per_sec. Default is 40m before 710, and default unlimited from 710 onwards</p>
     */
    public String getMaxRestorePerSec() {
        return this.MaxRestorePerSec;
    }

    /**
     * Set <p>Maximum speed of reading the repository per node max_restore_bytes_per_sec. Default is 40m before 710, and default unlimited from 710 onwards</p>
     * @param MaxRestorePerSec <p>Maximum speed of reading the repository per node max_restore_bytes_per_sec. Default is 40m before 710, and default unlimited from 710 onwards</p>
     */
    public void setMaxRestorePerSec(String MaxRestorePerSec) {
        this.MaxRestorePerSec = MaxRestorePerSec;
    }

    /**
     * Get <p>Policy creation time</p> 
     * @return CreateTime <p>Policy creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Policy creation time</p>
     * @param CreateTime <p>Policy creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public CosBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBackup(CosBackup source) {
        if (source.IsAutoBackup != null) {
            this.IsAutoBackup = new Boolean(source.IsAutoBackup);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.EsRepositoryType != null) {
            this.EsRepositoryType = new Long(source.EsRepositoryType);
        }
        if (source.PaasEsRepository != null) {
            this.PaasEsRepository = new String(source.PaasEsRepository);
        }
        if (source.UserEsRepository != null) {
            this.UserEsRepository = new String(source.UserEsRepository);
        }
        if (source.CosBasePath != null) {
            this.CosBasePath = new String(source.CosBasePath);
        }
        if (source.StorageDuration != null) {
            this.StorageDuration = new Long(source.StorageDuration);
        }
        if (source.AutoBackupInterval != null) {
            this.AutoBackupInterval = new Long(source.AutoBackupInterval);
        }
        if (source.CosRetention != null) {
            this.CosRetention = new Long(source.CosRetention);
        }
        if (source.RetainUntilDate != null) {
            this.RetainUntilDate = new String(source.RetainUntilDate);
        }
        if (source.RetentionGraceTime != null) {
            this.RetentionGraceTime = new Long(source.RetentionGraceTime);
        }
        if (source.RemoteCos != null) {
            this.RemoteCos = new Long(source.RemoteCos);
        }
        if (source.RemoteCosRegion != null) {
            this.RemoteCosRegion = new String(source.RemoteCosRegion);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Indices != null) {
            this.Indices = new String(source.Indices);
        }
        if (source.MultiAz != null) {
            this.MultiAz = new Long(source.MultiAz);
        }
        if (source.MaxSnapshotPerSec != null) {
            this.MaxSnapshotPerSec = new String(source.MaxSnapshotPerSec);
        }
        if (source.MaxRestorePerSec != null) {
            this.MaxRestorePerSec = new String(source.MaxRestorePerSec);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAutoBackup", this.IsAutoBackup);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "EsRepositoryType", this.EsRepositoryType);
        this.setParamSimple(map, prefix + "PaasEsRepository", this.PaasEsRepository);
        this.setParamSimple(map, prefix + "UserEsRepository", this.UserEsRepository);
        this.setParamSimple(map, prefix + "CosBasePath", this.CosBasePath);
        this.setParamSimple(map, prefix + "StorageDuration", this.StorageDuration);
        this.setParamSimple(map, prefix + "AutoBackupInterval", this.AutoBackupInterval);
        this.setParamSimple(map, prefix + "CosRetention", this.CosRetention);
        this.setParamSimple(map, prefix + "RetainUntilDate", this.RetainUntilDate);
        this.setParamSimple(map, prefix + "RetentionGraceTime", this.RetentionGraceTime);
        this.setParamSimple(map, prefix + "RemoteCos", this.RemoteCos);
        this.setParamSimple(map, prefix + "RemoteCosRegion", this.RemoteCosRegion);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "Indices", this.Indices);
        this.setParamSimple(map, prefix + "MultiAz", this.MultiAz);
        this.setParamSimple(map, prefix + "MaxSnapshotPerSec", this.MaxSnapshotPerSec);
        this.setParamSimple(map, prefix + "MaxRestorePerSec", this.MaxRestorePerSec);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

