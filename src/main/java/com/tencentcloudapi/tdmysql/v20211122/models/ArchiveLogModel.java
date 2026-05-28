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

public class ArchiveLogModel extends AbstractModel {

    /**
    * Archivelog ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ArchiveLogId")
    @Expose
    private Long ArchiveLogId;

    /**
    * Backup duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupDuration")
    @Expose
    private Long BackupDuration;

    /**
    * Backup status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * Backup end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Expiration time
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
    * Backup start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get Archivelog ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ArchiveLogId Archivelog ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getArchiveLogId() {
        return this.ArchiveLogId;
    }

    /**
     * Set Archivelog ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ArchiveLogId Archivelog ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArchiveLogId(Long ArchiveLogId) {
        this.ArchiveLogId = ArchiveLogId;
    }

    /**
     * Get Backup duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupDuration Backup duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupDuration() {
        return this.BackupDuration;
    }

    /**
     * Set Backup duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupDuration Backup duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupDuration(Long BackupDuration) {
        this.BackupDuration = BackupDuration;
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
     * Get Expiration time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiredTime Expiration time
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

    public ArchiveLogModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArchiveLogModel(ArchiveLogModel source) {
        if (source.ArchiveLogId != null) {
            this.ArchiveLogId = new Long(source.ArchiveLogId);
        }
        if (source.BackupDuration != null) {
            this.BackupDuration = new Long(source.BackupDuration);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArchiveLogId", this.ArchiveLogId);
        this.setParamSimple(map, prefix + "BackupDuration", this.BackupDuration);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

