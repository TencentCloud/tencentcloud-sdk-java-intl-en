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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup mode. 0: automatic backup; 1: manual backup
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * Backup name
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Backup remarks.
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * Backup file size. Unit: KB.
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * Backup start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Backup status. 1: backing up; 2: backed up successful
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Backup method. 0: logical backup; 1: physical backup
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * Backup record ID.
    */
    @SerializedName("BackId")
    @Expose
    private Long BackId;

    /**
    * Backup deletion time.
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * Region for cross-region backup.
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup mode. 0: automatic backup; 1: manual backup 
     * @return BackupType Backup mode. 0: automatic backup; 1: manual backup
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup mode. 0: automatic backup; 1: manual backup
     * @param BackupType Backup mode. 0: automatic backup; 1: manual backup
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup name 
     * @return BackupName Backup name
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup name
     * @param BackupName Backup name
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Backup remarks. 
     * @return BackupDesc Backup remarks.
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set Backup remarks.
     * @param BackupDesc Backup remarks.
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get Backup file size. Unit: KB. 
     * @return BackupSize Backup file size. Unit: KB.
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set Backup file size. Unit: KB.
     * @param BackupSize Backup file size. Unit: KB.
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get Backup start time. 
     * @return StartTime Backup start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup start time.
     * @param StartTime Backup start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup end time. 
     * @return EndTime Backup end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backup end time.
     * @param EndTime Backup end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Backup status. 1: backing up; 2: backed up successful 
     * @return Status Backup status. 1: backing up; 2: backed up successful
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Backup status. 1: backing up; 2: backed up successful
     * @param Status Backup status. 1: backing up; 2: backed up successful
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Backup method. 0: logical backup; 1: physical backup 
     * @return BackupMethod Backup method. 0: logical backup; 1: physical backup
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Backup method. 0: logical backup; 1: physical backup
     * @param BackupMethod Backup method. 0: logical backup; 1: physical backup
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Backup record ID. 
     * @return BackId Backup record ID.
     */
    public Long getBackId() {
        return this.BackId;
    }

    /**
     * Set Backup record ID.
     * @param BackId Backup record ID.
     */
    public void setBackId(Long BackId) {
        this.BackId = BackId;
    }

    /**
     * Get Backup deletion time. 
     * @return DeleteTime Backup deletion time.
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Backup deletion time.
     * @param DeleteTime Backup deletion time.
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get Region for cross-region backup. 
     * @return BackupRegion Region for cross-region backup.
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set Region for cross-region backup.
     * @param BackupRegion Region for cross-region backup.
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupDesc != null) {
            this.BackupDesc = new String(source.BackupDesc);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackId != null) {
            this.BackId = new Long(source.BackId);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupDesc", this.BackupDesc);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackId", this.BackId);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);

    }
}

