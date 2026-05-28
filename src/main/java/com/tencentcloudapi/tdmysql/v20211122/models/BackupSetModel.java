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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupSetModel extends AbstractModel {

    /**
    * Backup set duration, unit sec
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupDuration")
    @Expose
    private Long BackupDuration;

    /**
    * Backup method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Backup note name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Backup set progress percentage
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupProgress")
    @Expose
    private Float BackupProgress;

    /**
    * Backup set ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupSetId")
    @Expose
    private Long BackupSetId;

    /**
    * Backup status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * Backup set type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Instance version number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Backup end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Transaction commit end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTrxTime")
    @Expose
    private String EndTrxTime;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Backup expiration time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Backup set file size in Byte
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup trigger. 0: autobackup; 1: manual.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManualBackup")
    @Expose
    private Long ManualBackup;

    /**
    * Backup start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get Backup set duration, unit sec
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupDuration Backup set duration, unit sec
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupDuration() {
        return this.BackupDuration;
    }

    /**
     * Set Backup set duration, unit sec
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupDuration Backup set duration, unit sec
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupDuration(Long BackupDuration) {
        this.BackupDuration = BackupDuration;
    }

    /**
     * Get Backup method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupMethod Backup method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Backup method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupMethod Backup method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Backup note name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupName Backup note name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup note name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupName Backup note name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Backup set progress percentage
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupProgress Backup set progress percentage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getBackupProgress() {
        return this.BackupProgress;
    }

    /**
     * Set Backup set progress percentage
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupProgress Backup set progress percentage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupProgress(Float BackupProgress) {
        this.BackupProgress = BackupProgress;
    }

    /**
     * Get Backup set ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupSetId Backup set ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set Backup set ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupSetId Backup set ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupSetId(Long BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get Backup status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupStatus Backup status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set Backup status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupStatus Backup status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get Backup set type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupType Backup set type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup set type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupType Backup set type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Instance version number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBVersion Instance version number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Instance version number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBVersion Instance version number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Backup end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Backup end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backup end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Backup end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Transaction commit end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTrxTime Transaction commit end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTrxTime() {
        return this.EndTrxTime;
    }

    /**
     * Set Transaction commit end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTrxTime Transaction commit end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTrxTime(String EndTrxTime) {
        this.EndTrxTime = EndTrxTime;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Backup expiration time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredTime Backup expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Backup expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiredTime Backup expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Backup file name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileName Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileName Backup file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Backup set file size in Byte
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileSize Backup set file size in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Backup set file size in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileSize Backup set file size in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup trigger. 0: autobackup; 1: manual.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManualBackup Backup trigger. 0: autobackup; 1: manual.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getManualBackup() {
        return this.ManualBackup;
    }

    /**
     * Set Backup trigger. 0: autobackup; 1: manual.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManualBackup Backup trigger. 0: autobackup; 1: manual.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManualBackup(Long ManualBackup) {
        this.ManualBackup = ManualBackup;
    }

    /**
     * Get Backup start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Backup start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Backup start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public BackupSetModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSetModel(BackupSetModel source) {
        if (source.BackupDuration != null) {
            this.BackupDuration = new Long(source.BackupDuration);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupProgress != null) {
            this.BackupProgress = new Float(source.BackupProgress);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new Long(source.BackupSetId);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EndTrxTime != null) {
            this.EndTrxTime = new String(source.EndTrxTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ManualBackup != null) {
            this.ManualBackup = new Long(source.ManualBackup);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupDuration", this.BackupDuration);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupProgress", this.BackupProgress);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EndTrxTime", this.EndTrxTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ManualBackup", this.ManualBackup);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

