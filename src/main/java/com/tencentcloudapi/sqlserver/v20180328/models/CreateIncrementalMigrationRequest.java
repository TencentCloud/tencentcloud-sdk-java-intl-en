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

public class CreateIncrementalMigrationRequest extends AbstractModel{

    /**
    * ID of imported target instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup import task ID, which is returned through the API CreateBackupMigration.
    */
    @SerializedName("BackupMigrationId")
    @Expose
    private String BackupMigrationId;

    /**
    * Incremental backup file. If the UploadType of a full backup file is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
    */
    @SerializedName("BackupFiles")
    @Expose
    private String [] BackupFiles;

    /**
    * Whether restoration is required. No: not required. Yes: required. Not required by default.
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

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
     * Get Backup import task ID, which is returned through the API CreateBackupMigration. 
     * @return BackupMigrationId Backup import task ID, which is returned through the API CreateBackupMigration.
     */
    public String getBackupMigrationId() {
        return this.BackupMigrationId;
    }

    /**
     * Set Backup import task ID, which is returned through the API CreateBackupMigration.
     * @param BackupMigrationId Backup import task ID, which is returned through the API CreateBackupMigration.
     */
    public void setBackupMigrationId(String BackupMigrationId) {
        this.BackupMigrationId = BackupMigrationId;
    }

    /**
     * Get Incremental backup file. If the UploadType of a full backup file is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases. 
     * @return BackupFiles Incremental backup file. If the UploadType of a full backup file is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
     */
    public String [] getBackupFiles() {
        return this.BackupFiles;
    }

    /**
     * Set Incremental backup file. If the UploadType of a full backup file is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
     * @param BackupFiles Incremental backup file. If the UploadType of a full backup file is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
     */
    public void setBackupFiles(String [] BackupFiles) {
        this.BackupFiles = BackupFiles;
    }

    /**
     * Get Whether restoration is required. No: not required. Yes: required. Not required by default. 
     * @return IsRecovery Whether restoration is required. No: not required. Yes: required. Not required by default.
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set Whether restoration is required. No: not required. Yes: required. Not required by default.
     * @param IsRecovery Whether restoration is required. No: not required. Yes: required. Not required by default.
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);

    }
}

