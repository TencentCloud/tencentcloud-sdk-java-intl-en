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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Migration extends AbstractModel{

    /**
    * Backup import task ID or incremental import task ID
    */
    @SerializedName("MigrationId")
    @Expose
    private String MigrationId;

    /**
    * Backup import task name. For an incremental import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrationName")
    @Expose
    private String MigrationName;

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * ID of migrated target instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Migration task restoration type
    */
    @SerializedName("RecoveryType")
    @Expose
    private String RecoveryType;

    /**
    * Backup user upload type. COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * Backup file list, which is determined by UploadType. If the upload type is COS_URL, URL will be saved. If the upload type is COS_UPLOAD, the backup name will be saved.
    */
    @SerializedName("BackupFiles")
    @Expose
    private String [] BackupFiles;

    /**
    * Migration task status. Valid values: `2` (Creation completed), `7` (Importing full backups), `8` (Waiting for incremental backups), `9` (Import success), `10` (Import failure), `12` (Importing incremental backups).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Migration task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Migration task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Migration task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * More information
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Migration detail
    */
    @SerializedName("Detail")
    @Expose
    private MigrationDetail Detail;

    /**
    * Operation allowed in the current status
    */
    @SerializedName("Action")
    @Expose
    private MigrationAction Action;

    /**
    * Whether this is the final restoration. For a full import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

    /**
    * Name set of renamed databases
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBRename")
    @Expose
    private DBRenameRes [] DBRename;

    /**
     * Get Backup import task ID or incremental import task ID 
     * @return MigrationId Backup import task ID or incremental import task ID
     */
    public String getMigrationId() {
        return this.MigrationId;
    }

    /**
     * Set Backup import task ID or incremental import task ID
     * @param MigrationId Backup import task ID or incremental import task ID
     */
    public void setMigrationId(String MigrationId) {
        this.MigrationId = MigrationId;
    }

    /**
     * Get Backup import task name. For an incremental import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained. 
     * @return MigrationName Backup import task name. For an incremental import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     */
    public String getMigrationName() {
        return this.MigrationName;
    }

    /**
     * Set Backup import task name. For an incremental import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     * @param MigrationName Backup import task name. For an incremental import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     */
    public void setMigrationName(String MigrationName) {
        this.MigrationName = MigrationName;
    }

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get ID of migrated target instance 
     * @return InstanceId ID of migrated target instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of migrated target instance
     * @param InstanceId ID of migrated target instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Migration task restoration type 
     * @return RecoveryType Migration task restoration type
     */
    public String getRecoveryType() {
        return this.RecoveryType;
    }

    /**
     * Set Migration task restoration type
     * @param RecoveryType Migration task restoration type
     */
    public void setRecoveryType(String RecoveryType) {
        this.RecoveryType = RecoveryType;
    }

    /**
     * Get Backup user upload type. COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user. 
     * @return UploadType Backup user upload type. COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set Backup user upload type. COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
     * @param UploadType Backup user upload type. COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get Backup file list, which is determined by UploadType. If the upload type is COS_URL, URL will be saved. If the upload type is COS_UPLOAD, the backup name will be saved. 
     * @return BackupFiles Backup file list, which is determined by UploadType. If the upload type is COS_URL, URL will be saved. If the upload type is COS_UPLOAD, the backup name will be saved.
     */
    public String [] getBackupFiles() {
        return this.BackupFiles;
    }

    /**
     * Set Backup file list, which is determined by UploadType. If the upload type is COS_URL, URL will be saved. If the upload type is COS_UPLOAD, the backup name will be saved.
     * @param BackupFiles Backup file list, which is determined by UploadType. If the upload type is COS_URL, URL will be saved. If the upload type is COS_UPLOAD, the backup name will be saved.
     */
    public void setBackupFiles(String [] BackupFiles) {
        this.BackupFiles = BackupFiles;
    }

    /**
     * Get Migration task status. Valid values: `2` (Creation completed), `7` (Importing full backups), `8` (Waiting for incremental backups), `9` (Import success), `10` (Import failure), `12` (Importing incremental backups). 
     * @return Status Migration task status. Valid values: `2` (Creation completed), `7` (Importing full backups), `8` (Waiting for incremental backups), `9` (Import success), `10` (Import failure), `12` (Importing incremental backups).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Migration task status. Valid values: `2` (Creation completed), `7` (Importing full backups), `8` (Waiting for incremental backups), `9` (Import success), `10` (Import failure), `12` (Importing incremental backups).
     * @param Status Migration task status. Valid values: `2` (Creation completed), `7` (Importing full backups), `8` (Waiting for incremental backups), `9` (Import success), `10` (Import failure), `12` (Importing incremental backups).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Migration task creation time 
     * @return CreateTime Migration task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Migration task creation time
     * @param CreateTime Migration task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Migration task start time 
     * @return StartTime Migration task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Migration task start time
     * @param StartTime Migration task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Migration task end time 
     * @return EndTime Migration task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Migration task end time
     * @param EndTime Migration task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get More information 
     * @return Message More information
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set More information
     * @param Message More information
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Migration detail 
     * @return Detail Migration detail
     */
    public MigrationDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set Migration detail
     * @param Detail Migration detail
     */
    public void setDetail(MigrationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Operation allowed in the current status 
     * @return Action Operation allowed in the current status
     */
    public MigrationAction getAction() {
        return this.Action;
    }

    /**
     * Set Operation allowed in the current status
     * @param Action Operation allowed in the current status
     */
    public void setAction(MigrationAction Action) {
        this.Action = Action;
    }

    /**
     * Get Whether this is the final restoration. For a full import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained. 
     * @return IsRecovery Whether this is the final restoration. For a full import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set Whether this is the final restoration. For a full import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     * @param IsRecovery Whether this is the final restoration. For a full import task, this field will be left empty.
Note: this field may return ‘null’, indicating that no valid values can be obtained.
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
    }

    /**
     * Get Name set of renamed databases
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBRename Name set of renamed databases
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DBRenameRes [] getDBRename() {
        return this.DBRename;
    }

    /**
     * Set Name set of renamed databases
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBRename Name set of renamed databases
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBRename(DBRenameRes [] DBRename) {
        this.DBRename = DBRename;
    }

    public Migration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Migration(Migration source) {
        if (source.MigrationId != null) {
            this.MigrationId = new String(source.MigrationId);
        }
        if (source.MigrationName != null) {
            this.MigrationName = new String(source.MigrationName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RecoveryType != null) {
            this.RecoveryType = new String(source.RecoveryType);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.BackupFiles != null) {
            this.BackupFiles = new String[source.BackupFiles.length];
            for (int i = 0; i < source.BackupFiles.length; i++) {
                this.BackupFiles[i] = new String(source.BackupFiles[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Detail != null) {
            this.Detail = new MigrationDetail(source.Detail);
        }
        if (source.Action != null) {
            this.Action = new MigrationAction(source.Action);
        }
        if (source.IsRecovery != null) {
            this.IsRecovery = new String(source.IsRecovery);
        }
        if (source.DBRename != null) {
            this.DBRename = new DBRenameRes[source.DBRename.length];
            for (int i = 0; i < source.DBRename.length; i++) {
                this.DBRename[i] = new DBRenameRes(source.DBRename[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrationId", this.MigrationId);
        this.setParamSimple(map, prefix + "MigrationName", this.MigrationName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RecoveryType", this.RecoveryType);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);
        this.setParamArrayObj(map, prefix + "DBRename.", this.DBRename);

    }
}

