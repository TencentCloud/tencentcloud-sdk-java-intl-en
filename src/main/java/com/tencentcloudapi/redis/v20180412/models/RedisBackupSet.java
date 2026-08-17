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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisBackupSet extends AbstractModel {

    /**
    * <p>Backup start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Backup task ID.</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>Backup type.</p><ul><li>1: Automatic backup initiated by the system in the wee hours.</li><li>0: Manual backup initiated by the user.</li></ul>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>Backup status.</p><ul><li>1: Backup is locked by other processes.</li><li>2: Backup is normal, not locked by any processes.</li><li>-1: Backup has expired.</li><li>3: Backup is being exported.</li><li>4: Backup export successful.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Backup remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Backup lock status.</p><ul><li>0: Unlocked.</li><li>1: Has been locked.</li></ul>
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * <p>Internal field, which can be ignored.</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>Internal field, which can be ignored.</p>
    */
    @SerializedName("FullBackup")
    @Expose
    private Long FullBackup;

    /**
    * <p>Internal field, which can be ignored.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Local backup region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Backup end time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Backup file type.</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>Backup file expiration time.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Whether the backup file is encrypted</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

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
     * Get <p>Backup task ID.</p> 
     * @return BackupId <p>Backup task ID.</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>Backup task ID.</p>
     * @param BackupId <p>Backup task ID.</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>Backup type.</p><ul><li>1: Automatic backup initiated by the system in the wee hours.</li><li>0: Manual backup initiated by the user.</li></ul> 
     * @return BackupType <p>Backup type.</p><ul><li>1: Automatic backup initiated by the system in the wee hours.</li><li>0: Manual backup initiated by the user.</li></ul>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>Backup type.</p><ul><li>1: Automatic backup initiated by the system in the wee hours.</li><li>0: Manual backup initiated by the user.</li></ul>
     * @param BackupType <p>Backup type.</p><ul><li>1: Automatic backup initiated by the system in the wee hours.</li><li>0: Manual backup initiated by the user.</li></ul>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>Backup status.</p><ul><li>1: Backup is locked by other processes.</li><li>2: Backup is normal, not locked by any processes.</li><li>-1: Backup has expired.</li><li>3: Backup is being exported.</li><li>4: Backup export successful.</li></ul> 
     * @return Status <p>Backup status.</p><ul><li>1: Backup is locked by other processes.</li><li>2: Backup is normal, not locked by any processes.</li><li>-1: Backup has expired.</li><li>3: Backup is being exported.</li><li>4: Backup export successful.</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Backup status.</p><ul><li>1: Backup is locked by other processes.</li><li>2: Backup is normal, not locked by any processes.</li><li>-1: Backup has expired.</li><li>3: Backup is being exported.</li><li>4: Backup export successful.</li></ul>
     * @param Status <p>Backup status.</p><ul><li>1: Backup is locked by other processes.</li><li>2: Backup is normal, not locked by any processes.</li><li>-1: Backup has expired.</li><li>3: Backup is being exported.</li><li>4: Backup export successful.</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Backup remarks.</p> 
     * @return Remark <p>Backup remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Backup remarks.</p>
     * @param Remark <p>Backup remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Backup lock status.</p><ul><li>0: Unlocked.</li><li>1: Has been locked.</li></ul> 
     * @return Locked <p>Backup lock status.</p><ul><li>0: Unlocked.</li><li>1: Has been locked.</li></ul>
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set <p>Backup lock status.</p><ul><li>0: Unlocked.</li><li>1: Has been locked.</li></ul>
     * @param Locked <p>Backup lock status.</p><ul><li>0: Unlocked.</li><li>1: Has been locked.</li></ul>
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get <p>Internal field, which can be ignored.</p> 
     * @return BackupSize <p>Internal field, which can be ignored.</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>Internal field, which can be ignored.</p>
     * @param BackupSize <p>Internal field, which can be ignored.</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>Internal field, which can be ignored.</p> 
     * @return FullBackup <p>Internal field, which can be ignored.</p>
     */
    public Long getFullBackup() {
        return this.FullBackup;
    }

    /**
     * Set <p>Internal field, which can be ignored.</p>
     * @param FullBackup <p>Internal field, which can be ignored.</p>
     */
    public void setFullBackup(Long FullBackup) {
        this.FullBackup = FullBackup;
    }

    /**
     * Get <p>Internal field, which can be ignored.</p> 
     * @return InstanceType <p>Internal field, which can be ignored.</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Internal field, which can be ignored.</p>
     * @param InstanceType <p>Internal field, which can be ignored.</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
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

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Local backup region.</p> 
     * @return Region <p>Local backup region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Local backup region.</p>
     * @param Region <p>Local backup region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Backup end time.</p> 
     * @return EndTime <p>Backup end time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Backup end time.</p>
     * @param EndTime <p>Backup end time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Backup file type.</p> 
     * @return FileType <p>Backup file type.</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>Backup file type.</p>
     * @param FileType <p>Backup file type.</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>Backup file expiration time.</p> 
     * @return ExpireTime <p>Backup file expiration time.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Backup file expiration time.</p>
     * @param ExpireTime <p>Backup file expiration time.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Whether the backup file is encrypted</p> 
     * @return Encrypted <p>Whether the backup file is encrypted</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>Whether the backup file is encrypted</p>
     * @param Encrypted <p>Whether the backup file is encrypted</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    public RedisBackupSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisBackupSet(RedisBackupSet source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.FullBackup != null) {
            this.FullBackup = new Long(source.FullBackup);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "FullBackup", this.FullBackup);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);

    }
}

