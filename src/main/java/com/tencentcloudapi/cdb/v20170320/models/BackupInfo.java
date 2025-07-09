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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo extends AbstractModel {

    /**
    * Backup filename
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Backup file size in bytes
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Download address
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * Download address
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Backup subtask ID, which is used when backup files are deleted
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Backup task completion time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Backup task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup method. Valid values: `full` (full backup), `partial` (partial backup).
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
    */
    @SerializedName("Way")
    @Expose
    private String Way;

    /**
    * Manual backup alias
    */
    @SerializedName("ManualBackupName")
    @Expose
    private String ManualBackupName;

    /**
    * Backup retention type. Valid values: `save_mode_regular` (non-archive backup), save_mode_period`(archive backup).
    */
    @SerializedName("SaveMode")
    @Expose
    private String SaveMode;

    /**
    * The region where local backup resides
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Detailed information of remote backups
    */
    @SerializedName("RemoteInfo")
    @Expose
    private RemoteBackupInfo [] RemoteInfo;

    /**
    * Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
    */
    @SerializedName("CosStorageType")
    @Expose
    private Long CosStorageType;

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether the backup file is encrypted. Valid values: `on` (encrypted), `off` (unencrypted).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptionFlag")
    @Expose
    private String EncryptionFlag;

    /**
     * Get Backup filename 
     * @return Name Backup filename
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Backup filename
     * @param Name Backup filename
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Backup file size in bytes 
     * @return Size Backup file size in bytes
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Backup file size in bytes
     * @param Size Backup file size in bytes
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37 
     * @return Date Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
     * @param Date Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Download address 
     * @return IntranetUrl Download address
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set Download address
     * @param IntranetUrl Download address
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get Download address 
     * @return InternetUrl Download address
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set Download address
     * @param InternetUrl Download address
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup). 
     * @return Type Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
     * @param Type Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Backup subtask ID, which is used when backup files are deleted 
     * @return BackupId Backup subtask ID, which is used when backup files are deleted
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup subtask ID, which is used when backup files are deleted
     * @param BackupId Backup subtask ID, which is used when backup files are deleted
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress). 
     * @return Status Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     * @param Status Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Backup task completion time 
     * @return FinishTime Backup task completion time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Backup task completion time
     * @param FinishTime Backup task completion time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value). 
     * @return Creator (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
     * @param Creator (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Backup task start time 
     * @return StartTime Backup task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup task start time
     * @param StartTime Backup task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup method. Valid values: `full` (full backup), `partial` (partial backup). 
     * @return Method Backup method. Valid values: `full` (full backup), `partial` (partial backup).
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Backup method. Valid values: `full` (full backup), `partial` (partial backup).
     * @param Method Backup method. Valid values: `full` (full backup), `partial` (partial backup).
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup). 
     * @return Way Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
     */
    public String getWay() {
        return this.Way;
    }

    /**
     * Set Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
     * @param Way Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
     */
    public void setWay(String Way) {
        this.Way = Way;
    }

    /**
     * Get Manual backup alias 
     * @return ManualBackupName Manual backup alias
     */
    public String getManualBackupName() {
        return this.ManualBackupName;
    }

    /**
     * Set Manual backup alias
     * @param ManualBackupName Manual backup alias
     */
    public void setManualBackupName(String ManualBackupName) {
        this.ManualBackupName = ManualBackupName;
    }

    /**
     * Get Backup retention type. Valid values: `save_mode_regular` (non-archive backup), save_mode_period`(archive backup). 
     * @return SaveMode Backup retention type. Valid values: `save_mode_regular` (non-archive backup), save_mode_period`(archive backup).
     */
    public String getSaveMode() {
        return this.SaveMode;
    }

    /**
     * Set Backup retention type. Valid values: `save_mode_regular` (non-archive backup), save_mode_period`(archive backup).
     * @param SaveMode Backup retention type. Valid values: `save_mode_regular` (non-archive backup), save_mode_period`(archive backup).
     */
    public void setSaveMode(String SaveMode) {
        this.SaveMode = SaveMode;
    }

    /**
     * Get The region where local backup resides 
     * @return Region The region where local backup resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where local backup resides
     * @param Region The region where local backup resides
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Detailed information of remote backups 
     * @return RemoteInfo Detailed information of remote backups
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set Detailed information of remote backups
     * @param RemoteInfo Detailed information of remote backups
     */
    public void setRemoteInfo(RemoteBackupInfo [] RemoteInfo) {
        this.RemoteInfo = RemoteInfo;
    }

    /**
     * Get Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`. 
     * @return CosStorageType Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
     */
    public Long getCosStorageType() {
        return this.CosStorageType;
    }

    /**
     * Set Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
     * @param CosStorageType Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
     */
    public void setCosStorageType(Long CosStorageType) {
        this.CosStorageType = CosStorageType;
    }

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether the backup file is encrypted. Valid values: `on` (encrypted), `off` (unencrypted).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptionFlag Whether the backup file is encrypted. Valid values: `on` (encrypted), `off` (unencrypted).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptionFlag() {
        return this.EncryptionFlag;
    }

    /**
     * Set Whether the backup file is encrypted. Valid values: `on` (encrypted), `off` (unencrypted).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptionFlag Whether the backup file is encrypted. Valid values: `on` (encrypted), `off` (unencrypted).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptionFlag(String EncryptionFlag) {
        this.EncryptionFlag = EncryptionFlag;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.IntranetUrl != null) {
            this.IntranetUrl = new String(source.IntranetUrl);
        }
        if (source.InternetUrl != null) {
            this.InternetUrl = new String(source.InternetUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Way != null) {
            this.Way = new String(source.Way);
        }
        if (source.ManualBackupName != null) {
            this.ManualBackupName = new String(source.ManualBackupName);
        }
        if (source.SaveMode != null) {
            this.SaveMode = new String(source.SaveMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RemoteInfo != null) {
            this.RemoteInfo = new RemoteBackupInfo[source.RemoteInfo.length];
            for (int i = 0; i < source.RemoteInfo.length; i++) {
                this.RemoteInfo[i] = new RemoteBackupInfo(source.RemoteInfo[i]);
            }
        }
        if (source.CosStorageType != null) {
            this.CosStorageType = new Long(source.CosStorageType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EncryptionFlag != null) {
            this.EncryptionFlag = new String(source.EncryptionFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "IntranetUrl", this.IntranetUrl);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Way", this.Way);
        this.setParamSimple(map, prefix + "ManualBackupName", this.ManualBackupName);
        this.setParamSimple(map, prefix + "SaveMode", this.SaveMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "RemoteInfo.", this.RemoteInfo);
        this.setParamSimple(map, prefix + "CosStorageType", this.CosStorageType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EncryptionFlag", this.EncryptionFlag);

    }
}

