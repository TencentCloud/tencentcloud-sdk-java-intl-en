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
    * Whether to enable auto-backup to COS
    */
    @SerializedName("IsAutoBackup")
    @Expose
    private Boolean IsAutoBackup;

    /**
    * Auto-backup time (accurate down to the hour), such as "22:00"
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Backup snapshot prefix.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Valid values: 0 (Tencent Cloud repository) and 1 (customer repository).
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * Managed snapshot repository name.
    */
    @SerializedName("PaasEsRepository")
    @Expose
    private String PaasEsRepository;

    /**
    * Customer snapshot repository name.
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * COS storage folder directory.
    */
    @SerializedName("CosBasePath")
    @Expose
    private String CosBasePath;

    /**
    * Snapshot storage cycle in days.
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * Auto backup frequency in hours.
    */
    @SerializedName("AutoBackupInterval")
    @Expose
    private Long AutoBackupInterval;

    /**
    * Backup lock. Valid values: 0 (not locked) and 1 (locked).
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * Lock expiration date, such as 2022-12-10T08:34:48.000Z.
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * Lock grace period.
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * Region name for cross-region backup, such as ap-guangzhou.
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
    * Policy name.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Backup index list. If left empty, it means to back up all indexes.
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * 
    */
    @SerializedName("MultiAz")
    @Expose
    private Long MultiAz;

    /**
    * Policy creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Whether to enable auto-backup to COS 
     * @return IsAutoBackup Whether to enable auto-backup to COS
     */
    public Boolean getIsAutoBackup() {
        return this.IsAutoBackup;
    }

    /**
     * Set Whether to enable auto-backup to COS
     * @param IsAutoBackup Whether to enable auto-backup to COS
     */
    public void setIsAutoBackup(Boolean IsAutoBackup) {
        this.IsAutoBackup = IsAutoBackup;
    }

    /**
     * Get Auto-backup time (accurate down to the hour), such as "22:00" 
     * @return BackupTime Auto-backup time (accurate down to the hour), such as "22:00"
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Auto-backup time (accurate down to the hour), such as "22:00"
     * @param BackupTime Auto-backup time (accurate down to the hour), such as "22:00"
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Backup snapshot prefix. 
     * @return SnapshotName Backup snapshot prefix.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Backup snapshot prefix.
     * @param SnapshotName Backup snapshot prefix.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Valid values: 0 (Tencent Cloud repository) and 1 (customer repository). 
     * @return EsRepositoryType Valid values: 0 (Tencent Cloud repository) and 1 (customer repository).
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set Valid values: 0 (Tencent Cloud repository) and 1 (customer repository).
     * @param EsRepositoryType Valid values: 0 (Tencent Cloud repository) and 1 (customer repository).
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get Managed snapshot repository name. 
     * @return PaasEsRepository Managed snapshot repository name.
     */
    public String getPaasEsRepository() {
        return this.PaasEsRepository;
    }

    /**
     * Set Managed snapshot repository name.
     * @param PaasEsRepository Managed snapshot repository name.
     */
    public void setPaasEsRepository(String PaasEsRepository) {
        this.PaasEsRepository = PaasEsRepository;
    }

    /**
     * Get Customer snapshot repository name. 
     * @return UserEsRepository Customer snapshot repository name.
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set Customer snapshot repository name.
     * @param UserEsRepository Customer snapshot repository name.
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get COS storage folder directory. 
     * @return CosBasePath COS storage folder directory.
     */
    public String getCosBasePath() {
        return this.CosBasePath;
    }

    /**
     * Set COS storage folder directory.
     * @param CosBasePath COS storage folder directory.
     */
    public void setCosBasePath(String CosBasePath) {
        this.CosBasePath = CosBasePath;
    }

    /**
     * Get Snapshot storage cycle in days. 
     * @return StorageDuration Snapshot storage cycle in days.
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set Snapshot storage cycle in days.
     * @param StorageDuration Snapshot storage cycle in days.
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get Auto backup frequency in hours. 
     * @return AutoBackupInterval Auto backup frequency in hours.
     */
    public Long getAutoBackupInterval() {
        return this.AutoBackupInterval;
    }

    /**
     * Set Auto backup frequency in hours.
     * @param AutoBackupInterval Auto backup frequency in hours.
     */
    public void setAutoBackupInterval(Long AutoBackupInterval) {
        this.AutoBackupInterval = AutoBackupInterval;
    }

    /**
     * Get Backup lock. Valid values: 0 (not locked) and 1 (locked). 
     * @return CosRetention Backup lock. Valid values: 0 (not locked) and 1 (locked).
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set Backup lock. Valid values: 0 (not locked) and 1 (locked).
     * @param CosRetention Backup lock. Valid values: 0 (not locked) and 1 (locked).
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get Lock expiration date, such as 2022-12-10T08:34:48.000Z. 
     * @return RetainUntilDate Lock expiration date, such as 2022-12-10T08:34:48.000Z.
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set Lock expiration date, such as 2022-12-10T08:34:48.000Z.
     * @param RetainUntilDate Lock expiration date, such as 2022-12-10T08:34:48.000Z.
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get Lock grace period. 
     * @return RetentionGraceTime Lock grace period.
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set Lock grace period.
     * @param RetentionGraceTime Lock grace period.
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get Cross-region backup. Valid values: 0 (disabled) and 1 (enabled). 
     * @return RemoteCos Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).
     * @param RemoteCos Cross-region backup. Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get Region name for cross-region backup, such as ap-guangzhou. 
     * @return RemoteCosRegion Region name for cross-region backup, such as ap-guangzhou.
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set Region name for cross-region backup, such as ap-guangzhou.
     * @param RemoteCosRegion Region name for cross-region backup, such as ap-guangzhou.
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    /**
     * Get Policy name. 
     * @return StrategyName Policy name.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name.
     * @param StrategyName Policy name.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Backup index list. If left empty, it means to back up all indexes. 
     * @return Indices Backup index list. If left empty, it means to back up all indexes.
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set Backup index list. If left empty, it means to back up all indexes.
     * @param Indices Backup index list. If left empty, it means to back up all indexes.
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get  
     * @return MultiAz 
     */
    public Long getMultiAz() {
        return this.MultiAz;
    }

    /**
     * Set 
     * @param MultiAz 
     */
    public void setMultiAz(Long MultiAz) {
        this.MultiAz = MultiAz;
    }

    /**
     * Get Policy creation time. 
     * @return CreateTime Policy creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Policy creation time.
     * @param CreateTime Policy creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

