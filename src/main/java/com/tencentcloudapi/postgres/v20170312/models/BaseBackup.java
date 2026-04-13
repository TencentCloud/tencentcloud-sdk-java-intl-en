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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseBackup extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Unique ID of a backup file
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Backup file name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the backup method: physical - physical backup, logical - logical backup.
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Backup mode: automatic - automatic backup, manual - manual backup.
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
    * Backup task status. valid values: init, running, finished, failed, canceled.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Backup set size in bytes
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
    * Backup expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Unique ID of a backup file 
     * @return Id Unique ID of a backup file
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of a backup file
     * @param Id Unique ID of a backup file
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Backup file name. 
     * @return Name Backup file name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Backup file name.
     * @param Name Backup file name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the backup method: physical - physical backup, logical - logical backup. 
     * @return BackupMethod Specifies the backup method: physical - physical backup, logical - logical backup.
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Specifies the backup method: physical - physical backup, logical - logical backup.
     * @param BackupMethod Specifies the backup method: physical - physical backup, logical - logical backup.
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Backup mode: automatic - automatic backup, manual - manual backup. 
     * @return BackupMode Backup mode: automatic - automatic backup, manual - manual backup.
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set Backup mode: automatic - automatic backup, manual - manual backup.
     * @param BackupMode Backup mode: automatic - automatic backup, manual - manual backup.
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    /**
     * Get Backup task status. valid values: init, running, finished, failed, canceled. 
     * @return State Backup task status. valid values: init, running, finished, failed, canceled.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Backup task status. valid values: init, running, finished, failed, canceled.
     * @param State Backup task status. valid values: init, running, finished, failed, canceled.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Backup set size in bytes 
     * @return Size Backup set size in bytes
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Backup set size in bytes
     * @param Size Backup set size in bytes
     */
    public void setSize(Long Size) {
        this.Size = Size;
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
     * Get Backup expiration time 
     * @return ExpireTime Backup expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Backup expiration time
     * @param ExpireTime Backup expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public BaseBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseBackup(BaseBackup source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupMode != null) {
            this.BackupMode = new String(source.BackupMode);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupMode", this.BackupMode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

