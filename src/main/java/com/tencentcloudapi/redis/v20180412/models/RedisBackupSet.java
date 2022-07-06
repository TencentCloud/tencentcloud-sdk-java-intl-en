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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisBackupSet extends AbstractModel{

    /**
    * Backup start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * Backup type. 1: manual backup initiated by the user; 0: automatic backup in the early morning initiated by the system
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Backup status. 1: backup is locked by another process; 2: backup is normal and not locked by any process; -1: backup has expired; 3: backup is being exported; 4: backup is exported successfully
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Backup remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether a backup is locked. 0: no; 1: yes.
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullBackup")
    @Expose
    private Long FullBackup;

    /**
    * Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

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
     * Get Backup ID 
     * @return BackupId Backup ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup ID
     * @param BackupId Backup ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup type. 1: manual backup initiated by the user; 0: automatic backup in the early morning initiated by the system 
     * @return BackupType Backup type. 1: manual backup initiated by the user; 0: automatic backup in the early morning initiated by the system
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. 1: manual backup initiated by the user; 0: automatic backup in the early morning initiated by the system
     * @param BackupType Backup type. 1: manual backup initiated by the user; 0: automatic backup in the early morning initiated by the system
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup status. 1: backup is locked by another process; 2: backup is normal and not locked by any process; -1: backup has expired; 3: backup is being exported; 4: backup is exported successfully 
     * @return Status Backup status. 1: backup is locked by another process; 2: backup is normal and not locked by any process; -1: backup has expired; 3: backup is being exported; 4: backup is exported successfully
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Backup status. 1: backup is locked by another process; 2: backup is normal and not locked by any process; -1: backup has expired; 3: backup is being exported; 4: backup is exported successfully
     * @param Status Backup status. 1: backup is locked by another process; 2: backup is normal and not locked by any process; -1: backup has expired; 3: backup is being exported; 4: backup is exported successfully
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Backup remarks 
     * @return Remark Backup remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Backup remarks
     * @param Remark Backup remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether a backup is locked. 0: no; 1: yes. 
     * @return Locked Whether a backup is locked. 0: no; 1: yes.
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set Whether a backup is locked. 0: no; 1: yes.
     * @param Locked Whether a backup is locked. 0: no; 1: yes.
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupSize Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupSize Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullBackup Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFullBackup() {
        return this.FullBackup;
    }

    /**
     * Set Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullBackup Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullBackup(Long FullBackup) {
        this.FullBackup = FullBackup;
    }

    /**
     * Get Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Internal field, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
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

    }
}

