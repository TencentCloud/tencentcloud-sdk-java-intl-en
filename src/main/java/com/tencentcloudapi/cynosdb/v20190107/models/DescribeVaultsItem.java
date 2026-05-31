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

public class DescribeVaultsItem extends AbstractModel {

    /**
    * Safe ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Safe name
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * Safe description
    */
    @SerializedName("VaultDescribe")
    @Expose
    private String VaultDescribe;

    /**
    * Encryption key ID.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key region
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * Key type
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * Number of backup files
    */
    @SerializedName("BackupFileCount")
    @Expose
    private Long BackupFileCount;

    /**
    * Total size of backup files (byte)
    */
    @SerializedName("BackupFileSize")
    @Expose
    private Long BackupFileSize;

    /**
    * Binlog file count
    */
    @SerializedName("BinlogFileCount")
    @Expose
    private Long BinlogFileCount;

    /**
    * Total size of the Binlog file (byte)
    */
    @SerializedName("BinlogFileSize")
    @Expose
    private Long BinlogFileSize;

    /**
    * Number of RedoLog files
    */
    @SerializedName("RedoLogFileCount")
    @Expose
    private Long RedoLogFileCount;

    /**
    * Total size of RedoLog files (byte)
    */
    @SerializedName("RedoLogFileSize")
    @Expose
    private Long RedoLogFileSize;

    /**
    * Safe status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Backup retention period (seconds)
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * lock time
    */
    @SerializedName("LockedTime")
    @Expose
    private String LockedTime;

    /**
    * Associated task list
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Safe region
    */
    @SerializedName("VaultRegion")
    @Expose
    private String VaultRegion;

    /**
    * Automatically deliver relationship
    */
    @SerializedName("AutoCopyConfigs")
    @Expose
    private AutoCopyConfig [] AutoCopyConfigs;

    /**
     * Get Safe ID 
     * @return VaultId Safe ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Safe ID
     * @param VaultId Safe ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get Safe name 
     * @return VaultName Safe name
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set Safe name
     * @param VaultName Safe name
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get Safe description 
     * @return VaultDescribe Safe description
     */
    public String getVaultDescribe() {
        return this.VaultDescribe;
    }

    /**
     * Set Safe description
     * @param VaultDescribe Safe description
     */
    public void setVaultDescribe(String VaultDescribe) {
        this.VaultDescribe = VaultDescribe;
    }

    /**
     * Get Encryption key ID. 
     * @return KeyId Encryption key ID.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Encryption key ID.
     * @param KeyId Encryption key ID.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key region 
     * @return KeyRegion Key region
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Key region
     * @param KeyRegion Key region
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get Key type 
     * @return KeyType Key type
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set Key type
     * @param KeyType Key type
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get Number of backup files 
     * @return BackupFileCount Number of backup files
     */
    public Long getBackupFileCount() {
        return this.BackupFileCount;
    }

    /**
     * Set Number of backup files
     * @param BackupFileCount Number of backup files
     */
    public void setBackupFileCount(Long BackupFileCount) {
        this.BackupFileCount = BackupFileCount;
    }

    /**
     * Get Total size of backup files (byte) 
     * @return BackupFileSize Total size of backup files (byte)
     */
    public Long getBackupFileSize() {
        return this.BackupFileSize;
    }

    /**
     * Set Total size of backup files (byte)
     * @param BackupFileSize Total size of backup files (byte)
     */
    public void setBackupFileSize(Long BackupFileSize) {
        this.BackupFileSize = BackupFileSize;
    }

    /**
     * Get Binlog file count 
     * @return BinlogFileCount Binlog file count
     */
    public Long getBinlogFileCount() {
        return this.BinlogFileCount;
    }

    /**
     * Set Binlog file count
     * @param BinlogFileCount Binlog file count
     */
    public void setBinlogFileCount(Long BinlogFileCount) {
        this.BinlogFileCount = BinlogFileCount;
    }

    /**
     * Get Total size of the Binlog file (byte) 
     * @return BinlogFileSize Total size of the Binlog file (byte)
     */
    public Long getBinlogFileSize() {
        return this.BinlogFileSize;
    }

    /**
     * Set Total size of the Binlog file (byte)
     * @param BinlogFileSize Total size of the Binlog file (byte)
     */
    public void setBinlogFileSize(Long BinlogFileSize) {
        this.BinlogFileSize = BinlogFileSize;
    }

    /**
     * Get Number of RedoLog files 
     * @return RedoLogFileCount Number of RedoLog files
     */
    public Long getRedoLogFileCount() {
        return this.RedoLogFileCount;
    }

    /**
     * Set Number of RedoLog files
     * @param RedoLogFileCount Number of RedoLog files
     */
    public void setRedoLogFileCount(Long RedoLogFileCount) {
        this.RedoLogFileCount = RedoLogFileCount;
    }

    /**
     * Get Total size of RedoLog files (byte) 
     * @return RedoLogFileSize Total size of RedoLog files (byte)
     */
    public Long getRedoLogFileSize() {
        return this.RedoLogFileSize;
    }

    /**
     * Set Total size of RedoLog files (byte)
     * @param RedoLogFileSize Total size of RedoLog files (byte)
     */
    public void setRedoLogFileSize(Long RedoLogFileSize) {
        this.RedoLogFileSize = RedoLogFileSize;
    }

    /**
     * Get Safe status 
     * @return Status Safe status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Safe status
     * @param Status Safe status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Backup retention period (seconds) 
     * @return BackupSaveSeconds Backup retention period (seconds)
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set Backup retention period (seconds)
     * @param BackupSaveSeconds Backup retention period (seconds)
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    /**
     * Get lock time 
     * @return LockedTime lock time
     */
    public String getLockedTime() {
        return this.LockedTime;
    }

    /**
     * Set lock time
     * @param LockedTime lock time
     */
    public void setLockedTime(String LockedTime) {
        this.LockedTime = LockedTime;
    }

    /**
     * Get Associated task list 
     * @return Tasks Associated task list
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Associated task list
     * @param Tasks Associated task list
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Safe region 
     * @return VaultRegion Safe region
     */
    public String getVaultRegion() {
        return this.VaultRegion;
    }

    /**
     * Set Safe region
     * @param VaultRegion Safe region
     */
    public void setVaultRegion(String VaultRegion) {
        this.VaultRegion = VaultRegion;
    }

    /**
     * Get Automatically deliver relationship 
     * @return AutoCopyConfigs Automatically deliver relationship
     */
    public AutoCopyConfig [] getAutoCopyConfigs() {
        return this.AutoCopyConfigs;
    }

    /**
     * Set Automatically deliver relationship
     * @param AutoCopyConfigs Automatically deliver relationship
     */
    public void setAutoCopyConfigs(AutoCopyConfig [] AutoCopyConfigs) {
        this.AutoCopyConfigs = AutoCopyConfigs;
    }

    public DescribeVaultsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVaultsItem(DescribeVaultsItem source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.VaultDescribe != null) {
            this.VaultDescribe = new String(source.VaultDescribe);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.BackupFileCount != null) {
            this.BackupFileCount = new Long(source.BackupFileCount);
        }
        if (source.BackupFileSize != null) {
            this.BackupFileSize = new Long(source.BackupFileSize);
        }
        if (source.BinlogFileCount != null) {
            this.BinlogFileCount = new Long(source.BinlogFileCount);
        }
        if (source.BinlogFileSize != null) {
            this.BinlogFileSize = new Long(source.BinlogFileSize);
        }
        if (source.RedoLogFileCount != null) {
            this.RedoLogFileCount = new Long(source.RedoLogFileCount);
        }
        if (source.RedoLogFileSize != null) {
            this.RedoLogFileSize = new Long(source.RedoLogFileSize);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.LockedTime != null) {
            this.LockedTime = new String(source.LockedTime);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.VaultRegion != null) {
            this.VaultRegion = new String(source.VaultRegion);
        }
        if (source.AutoCopyConfigs != null) {
            this.AutoCopyConfigs = new AutoCopyConfig[source.AutoCopyConfigs.length];
            for (int i = 0; i < source.AutoCopyConfigs.length; i++) {
                this.AutoCopyConfigs[i] = new AutoCopyConfig(source.AutoCopyConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "VaultDescribe", this.VaultDescribe);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "BackupFileCount", this.BackupFileCount);
        this.setParamSimple(map, prefix + "BackupFileSize", this.BackupFileSize);
        this.setParamSimple(map, prefix + "BinlogFileCount", this.BinlogFileCount);
        this.setParamSimple(map, prefix + "BinlogFileSize", this.BinlogFileSize);
        this.setParamSimple(map, prefix + "RedoLogFileCount", this.RedoLogFileCount);
        this.setParamSimple(map, prefix + "RedoLogFileSize", this.RedoLogFileSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "LockedTime", this.LockedTime);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "VaultRegion", this.VaultRegion);
        this.setParamArrayObj(map, prefix + "AutoCopyConfigs.", this.AutoCopyConfigs);

    }
}

