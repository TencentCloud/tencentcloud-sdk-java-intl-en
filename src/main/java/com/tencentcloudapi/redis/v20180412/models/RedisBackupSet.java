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
    * Backup task ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * Backup type. Valid values:  `1` (Automatic backup in the early morning initiated by the system.) `0`: Manual backup initiated by the user.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Backup status. Valid values:  - `1`: The backup is locked by another process. - `2`: The backup is normal and not locked by any process. - `-1`: The backup is expired. - `3`: The backup is being exported. - `4`: Exported the backup successfully.
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
    * Whether the backup is locked. Valid values:  - `0` (no) - `1` (yes)
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
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * The region where the local backup resides.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Backup end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Backup file type
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Backup file expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

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
     * Get Backup task ID 
     * @return BackupId Backup task ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup task ID
     * @param BackupId Backup task ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup type. Valid values:  `1` (Automatic backup in the early morning initiated by the system.) `0`: Manual backup initiated by the user. 
     * @return BackupType Backup type. Valid values:  `1` (Automatic backup in the early morning initiated by the system.) `0`: Manual backup initiated by the user.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values:  `1` (Automatic backup in the early morning initiated by the system.) `0`: Manual backup initiated by the user.
     * @param BackupType Backup type. Valid values:  `1` (Automatic backup in the early morning initiated by the system.) `0`: Manual backup initiated by the user.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup status. Valid values:  - `1`: The backup is locked by another process. - `2`: The backup is normal and not locked by any process. - `-1`: The backup is expired. - `3`: The backup is being exported. - `4`: Exported the backup successfully. 
     * @return Status Backup status. Valid values:  - `1`: The backup is locked by another process. - `2`: The backup is normal and not locked by any process. - `-1`: The backup is expired. - `3`: The backup is being exported. - `4`: Exported the backup successfully.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Backup status. Valid values:  - `1`: The backup is locked by another process. - `2`: The backup is normal and not locked by any process. - `-1`: The backup is expired. - `3`: The backup is being exported. - `4`: Exported the backup successfully.
     * @param Status Backup status. Valid values:  - `1`: The backup is locked by another process. - `2`: The backup is normal and not locked by any process. - `-1`: The backup is expired. - `3`: The backup is being exported. - `4`: Exported the backup successfully.
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
     * Get Whether the backup is locked. Valid values:  - `0` (no) - `1` (yes) 
     * @return Locked Whether the backup is locked. Valid values:  - `0` (no) - `1` (yes)
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set Whether the backup is locked. Valid values:  - `0` (no) - `1` (yes)
     * @param Locked Whether the backup is locked. Valid values:  - `0` (no) - `1` (yes)
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
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get The region where the local backup resides. 
     * @return Region The region where the local backup resides.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where the local backup resides.
     * @param Region The region where the local backup resides.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Backup end time 
     * @return EndTime Backup end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backup end time
     * @param EndTime Backup end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Backup file type 
     * @return FileType Backup file type
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Backup file type
     * @param FileType Backup file type
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Backup file expiration time 
     * @return ExpireTime Backup file expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Backup file expiration time
     * @param ExpireTime Backup file expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
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

    }
}

