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

public class ModifyIncrementalMigrationRequest extends AbstractModel {

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
    * Incremental backup import task ID, which is returned through the `CreateIncrementalMigration` API.
    */
    @SerializedName("IncrementalMigrationId")
    @Expose
    private String IncrementalMigrationId;

    /**
    * Whether to restore backups. Valid values: `NO`, `YES`. If this parameter is not specified, current settings will be applied.
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

    /**
    * If the UploadType is COS_URL, fill in URL here. If the UploadType is COS_UPLOAD, fill in the name of the backup file here. Only 1 backup file is supported, but a backup file can involve multiple databases.
    */
    @SerializedName("BackupFiles")
    @Expose
    private String [] BackupFiles;

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
     * Get Incremental backup import task ID, which is returned through the `CreateIncrementalMigration` API. 
     * @return IncrementalMigrationId Incremental backup import task ID, which is returned through the `CreateIncrementalMigration` API.
     */
    public String getIncrementalMigrationId() {
        return this.IncrementalMigrationId;
    }

    /**
     * Set Incremental backup import task ID, which is returned through the `CreateIncrementalMigration` API.
     * @param IncrementalMigrationId Incremental backup import task ID, which is returned through the `CreateIncrementalMigration` API.
     */
    public void setIncrementalMigrationId(String IncrementalMigrationId) {
        this.IncrementalMigrationId = IncrementalMigrationId;
    }

    /**
     * Get Whether to restore backups. Valid values: `NO`, `YES`. If this parameter is not specified, current settings will be applied. 
     * @return IsRecovery Whether to restore backups. Valid values: `NO`, `YES`. If this parameter is not specified, current settings will be applied.
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set Whether to restore backups. Valid values: `NO`, `YES`. If this parameter is not specified, current settings will be applied.
     * @param IsRecovery Whether to restore backups. Valid values: `NO`, `YES`. If this parameter is not specified, current settings will be applied.
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
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

    public ModifyIncrementalMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIncrementalMigrationRequest(ModifyIncrementalMigrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
        if (source.IncrementalMigrationId != null) {
            this.IncrementalMigrationId = new String(source.IncrementalMigrationId);
        }
        if (source.IsRecovery != null) {
            this.IsRecovery = new String(source.IsRecovery);
        }
        if (source.BackupFiles != null) {
            this.BackupFiles = new String[source.BackupFiles.length];
            for (int i = 0; i < source.BackupFiles.length; i++) {
                this.BackupFiles[i] = new String(source.BackupFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamSimple(map, prefix + "IncrementalMigrationId", this.IncrementalMigrationId);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);

    }
}

