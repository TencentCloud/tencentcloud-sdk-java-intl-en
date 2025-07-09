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
    * Instance ID
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
    * Backup remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * Backup file size in KB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * Backup start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup end time
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
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
     * Get Backup remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupDesc Backup remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set Backup remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupDesc Backup remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get Backup file size in KB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupSize Backup file size in KB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set Backup file size in KB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupSize Backup file size in KB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get Backup start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Backup start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Backup start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Backup end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backup end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Backup end time
Note: This field may return null, indicating that no valid values can be obtained.
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

    }
}

