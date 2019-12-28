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
    * Backup type. manualBackupInstance: manual backup initiated by user; systemBackupInstance: midnight backup initiated by system
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
    * Whether a backup is locked. 0: no; 1: yes
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

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
     * Get Backup type. manualBackupInstance: manual backup initiated by user; systemBackupInstance: midnight backup initiated by system 
     * @return BackupType Backup type. manualBackupInstance: manual backup initiated by user; systemBackupInstance: midnight backup initiated by system
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. manualBackupInstance: manual backup initiated by user; systemBackupInstance: midnight backup initiated by system
     * @param BackupType Backup type. manualBackupInstance: manual backup initiated by user; systemBackupInstance: midnight backup initiated by system
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
     * Get Whether a backup is locked. 0: no; 1: yes 
     * @return Locked Whether a backup is locked. 0: no; 1: yes
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set Whether a backup is locked. 0: no; 1: yes
     * @param Locked Whether a backup is locked. 0: no; 1: yes
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
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

    }
}

