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
    * Filename.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Backup time
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * redoLogId
    */
    @SerializedName("RedoLogId")
    @Expose
    private Long RedoLogId;

    /**
    * Cross-Region information.
    */
    @SerializedName("RedoCrossRegions")
    @Expose
    private BackupRegionAndIds [] RedoCrossRegions;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Completion time.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Safe info
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * Backup delivery status
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * Encryption key
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * Key region for encryption
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
     * Get Filename. 
     * @return FileName Filename.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename.
     * @param FileName Filename.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size 
     * @return FileSize File size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size
     * @param FileSize File size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Backup time 
     * @return BackupTime Backup time
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Backup time
     * @param BackupTime Backup time
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get redoLogId 
     * @return RedoLogId redoLogId
     */
    public Long getRedoLogId() {
        return this.RedoLogId;
    }

    /**
     * Set redoLogId
     * @param RedoLogId redoLogId
     */
    public void setRedoLogId(Long RedoLogId) {
        this.RedoLogId = RedoLogId;
    }

    /**
     * Get Cross-Region information. 
     * @return RedoCrossRegions Cross-Region information.
     */
    public BackupRegionAndIds [] getRedoCrossRegions() {
        return this.RedoCrossRegions;
    }

    /**
     * Set Cross-Region information.
     * @param RedoCrossRegions Cross-Region information.
     */
    public void setRedoCrossRegions(BackupRegionAndIds [] RedoCrossRegions) {
        this.RedoCrossRegions = RedoCrossRegions;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Completion time. 
     * @return FinishTime Completion time.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Completion time.
     * @param FinishTime Completion time.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Safe info 
     * @return VaultInfos Safe info
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set Safe info
     * @param VaultInfos Safe info
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get Backup delivery status 
     * @return CopyStatus Backup delivery status
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set Backup delivery status
     * @param CopyStatus Backup delivery status
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get Encryption key 
     * @return EncryptKeyId Encryption key
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set Encryption key
     * @param EncryptKeyId Encryption key
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get Key region for encryption 
     * @return EncryptRegion Key region for encryption
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set Key region for encryption
     * @param EncryptRegion Key region for encryption
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

