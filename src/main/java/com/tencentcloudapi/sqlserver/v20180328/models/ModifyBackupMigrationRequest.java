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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupMigrationRequest extends AbstractModel {

    /**
    * ID of imported target instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup import task ID, which is returned through the API CreateBackupMigration
    */
    @SerializedName("BackupMigrationId")
    @Expose
    private String BackupMigrationId;

    /**
    * Task name
    */
    @SerializedName("MigrationName")
    @Expose
    private String MigrationName;

    /**
    * Migration task restoration type: FULL,FULL_LOG,FULL_DIFF
    */
    @SerializedName("RecoveryType")
    @Expose
    private String RecoveryType;

    /**
    * COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * If the UploadType is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
    */
    @SerializedName("BackupFiles")
    @Expose
    private String [] BackupFiles;

    /**
    * Name set of databases to be renamed
    */
    @SerializedName("DBRename")
    @Expose
    private RenameRestoreDatabase [] DBRename;

    /**
     * Get ID of imported target instance 
     * @return InstanceId ID of imported target instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of imported target instance
     * @param InstanceId ID of imported target instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup import task ID, which is returned through the API CreateBackupMigration 
     * @return BackupMigrationId Backup import task ID, which is returned through the API CreateBackupMigration
     */
    public String getBackupMigrationId() {
        return this.BackupMigrationId;
    }

    /**
     * Set Backup import task ID, which is returned through the API CreateBackupMigration
     * @param BackupMigrationId Backup import task ID, which is returned through the API CreateBackupMigration
     */
    public void setBackupMigrationId(String BackupMigrationId) {
        this.BackupMigrationId = BackupMigrationId;
    }

    /**
     * Get Task name 
     * @return MigrationName Task name
     */
    public String getMigrationName() {
        return this.MigrationName;
    }

    /**
     * Set Task name
     * @param MigrationName Task name
     */
    public void setMigrationName(String MigrationName) {
        this.MigrationName = MigrationName;
    }

    /**
     * Get Migration task restoration type: FULL,FULL_LOG,FULL_DIFF 
     * @return RecoveryType Migration task restoration type: FULL,FULL_LOG,FULL_DIFF
     */
    public String getRecoveryType() {
        return this.RecoveryType;
    }

    /**
     * Set Migration task restoration type: FULL,FULL_LOG,FULL_DIFF
     * @param RecoveryType Migration task restoration type: FULL,FULL_LOG,FULL_DIFF
     */
    public void setRecoveryType(String RecoveryType) {
        this.RecoveryType = RecoveryType;
    }

    /**
     * Get COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user. 
     * @return UploadType COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
     * @param UploadType COS_URL: the backup is stored in user’s Cloud Object Storage, with URL provided. COS_UPLOAD: the backup is stored in the application’s Cloud Object Storage and needs to be uploaded by the user.
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get If the UploadType is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases. 
     * @return BackupFiles If the UploadType is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
     */
    public String [] getBackupFiles() {
        return this.BackupFiles;
    }

    /**
     * Set If the UploadType is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
     * @param BackupFiles If the UploadType is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
     */
    public void setBackupFiles(String [] BackupFiles) {
        this.BackupFiles = BackupFiles;
    }

    /**
     * Get Name set of databases to be renamed 
     * @return DBRename Name set of databases to be renamed
     */
    public RenameRestoreDatabase [] getDBRename() {
        return this.DBRename;
    }

    /**
     * Set Name set of databases to be renamed
     * @param DBRename Name set of databases to be renamed
     */
    public void setDBRename(RenameRestoreDatabase [] DBRename) {
        this.DBRename = DBRename;
    }

    public ModifyBackupMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupMigrationRequest(ModifyBackupMigrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
        if (source.MigrationName != null) {
            this.MigrationName = new String(source.MigrationName);
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
        if (source.DBRename != null) {
            this.DBRename = new RenameRestoreDatabase[source.DBRename.length];
            for (int i = 0; i < source.DBRename.length; i++) {
                this.DBRename[i] = new RenameRestoreDatabase(source.DBRename[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamSimple(map, prefix + "MigrationName", this.MigrationName);
        this.setParamSimple(map, prefix + "RecoveryType", this.RecoveryType);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);
        this.setParamArrayObj(map, prefix + "DBRename.", this.DBRename);

    }
}

