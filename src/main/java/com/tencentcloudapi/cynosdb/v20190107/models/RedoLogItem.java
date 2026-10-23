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

public class RedoLogItem extends AbstractModel {

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File size</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>Backup time</p>
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * <p>redoLogId</p>
    */
    @SerializedName("RedoLogId")
    @Expose
    private Long RedoLogId;

    /**
    * <p>Cross-regional information</p>
    */
    @SerializedName("RedoCrossRegions")
    @Expose
    private BackupRegionAndIds [] RedoCrossRegions;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Completion time</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Safe information.</p>
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * <p>Backup delivery status</p>
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * <p>Encryption key.</p>
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * <p>Encryption key region</p>
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File size</p> 
     * @return FileSize <p>File size</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size</p>
     * @param FileSize <p>File size</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>Backup time</p> 
     * @return BackupTime <p>Backup time</p>
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set <p>Backup time</p>
     * @param BackupTime <p>Backup time</p>
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get <p>redoLogId</p> 
     * @return RedoLogId <p>redoLogId</p>
     */
    public Long getRedoLogId() {
        return this.RedoLogId;
    }

    /**
     * Set <p>redoLogId</p>
     * @param RedoLogId <p>redoLogId</p>
     */
    public void setRedoLogId(Long RedoLogId) {
        this.RedoLogId = RedoLogId;
    }

    /**
     * Get <p>Cross-regional information</p> 
     * @return RedoCrossRegions <p>Cross-regional information</p>
     */
    public BackupRegionAndIds [] getRedoCrossRegions() {
        return this.RedoCrossRegions;
    }

    /**
     * Set <p>Cross-regional information</p>
     * @param RedoCrossRegions <p>Cross-regional information</p>
     */
    public void setRedoCrossRegions(BackupRegionAndIds [] RedoCrossRegions) {
        this.RedoCrossRegions = RedoCrossRegions;
    }

    /**
     * Get <p>Status.</p> 
     * @return Status <p>Status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.</p>
     * @param Status <p>Status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Completion time</p> 
     * @return FinishTime <p>Completion time</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Completion time</p>
     * @param FinishTime <p>Completion time</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Safe information.</p> 
     * @return VaultInfos <p>Safe information.</p>
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set <p>Safe information.</p>
     * @param VaultInfos <p>Safe information.</p>
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get <p>Backup delivery status</p> 
     * @return CopyStatus <p>Backup delivery status</p>
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set <p>Backup delivery status</p>
     * @param CopyStatus <p>Backup delivery status</p>
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get <p>Encryption key.</p> 
     * @return EncryptKeyId <p>Encryption key.</p>
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set <p>Encryption key.</p>
     * @param EncryptKeyId <p>Encryption key.</p>
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get <p>Encryption key region</p> 
     * @return EncryptRegion <p>Encryption key region</p>
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set <p>Encryption key region</p>
     * @param EncryptRegion <p>Encryption key region</p>
     */
    public void setEncryptRegion(String EncryptRegion) {
        this.EncryptRegion = EncryptRegion;
    }

    public RedoLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedoLogItem(RedoLogItem source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.RedoLogId != null) {
            this.RedoLogId = new Long(source.RedoLogId);
        }
        if (source.RedoCrossRegions != null) {
            this.RedoCrossRegions = new BackupRegionAndIds[source.RedoCrossRegions.length];
            for (int i = 0; i < source.RedoCrossRegions.length; i++) {
                this.RedoCrossRegions[i] = new BackupRegionAndIds(source.RedoCrossRegions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.VaultInfos != null) {
            this.VaultInfos = new VaultInfo[source.VaultInfos.length];
            for (int i = 0; i < source.VaultInfos.length; i++) {
                this.VaultInfos[i] = new VaultInfo(source.VaultInfos[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "RedoLogId", this.RedoLogId);
        this.setParamArrayObj(map, prefix + "RedoCrossRegions.", this.RedoCrossRegions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamArrayObj(map, prefix + "VaultInfos.", this.VaultInfos);
        this.setParamSimple(map, prefix + "CopyStatus", this.CopyStatus);
        this.setParamSimple(map, prefix + "EncryptKeyId", this.EncryptKeyId);
        this.setParamSimple(map, prefix + "EncryptRegion", this.EncryptRegion);

    }
}

