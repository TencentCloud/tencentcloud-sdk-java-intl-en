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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Backup type. Valid values: `logic` (logic backup), `snapshot` (physical backup)
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Backup database, which is valid when `BackupType` is `logic`.
    */
    @SerializedName("BackupDatabases")
    @Expose
    private String [] BackupDatabases;

    /**
    * Backup table, which is valid when `BackupType` is `logic`.
    */
    @SerializedName("BackupTables")
    @Expose
    private DatabaseTables [] BackupTables;

    /**
    * Backup name
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Backup type. Valid values: `logic` (logic backup), `snapshot` (physical backup) 
     * @return BackupType Backup type. Valid values: `logic` (logic backup), `snapshot` (physical backup)
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values: `logic` (logic backup), `snapshot` (physical backup)
     * @param BackupType Backup type. Valid values: `logic` (logic backup), `snapshot` (physical backup)
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup database, which is valid when `BackupType` is `logic`. 
     * @return BackupDatabases Backup database, which is valid when `BackupType` is `logic`.
     */
    public String [] getBackupDatabases() {
        return this.BackupDatabases;
    }

    /**
     * Set Backup database, which is valid when `BackupType` is `logic`.
     * @param BackupDatabases Backup database, which is valid when `BackupType` is `logic`.
     */
    public void setBackupDatabases(String [] BackupDatabases) {
        this.BackupDatabases = BackupDatabases;
    }

    /**
     * Get Backup table, which is valid when `BackupType` is `logic`. 
     * @return BackupTables Backup table, which is valid when `BackupType` is `logic`.
     */
    public DatabaseTables [] getBackupTables() {
        return this.BackupTables;
    }

    /**
     * Set Backup table, which is valid when `BackupType` is `logic`.
     * @param BackupTables Backup table, which is valid when `BackupType` is `logic`.
     */
    public void setBackupTables(DatabaseTables [] BackupTables) {
        this.BackupTables = BackupTables;
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

    public CreateBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupRequest(CreateBackupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupDatabases != null) {
            this.BackupDatabases = new String[source.BackupDatabases.length];
            for (int i = 0; i < source.BackupDatabases.length; i++) {
                this.BackupDatabases[i] = new String(source.BackupDatabases[i]);
            }
        }
        if (source.BackupTables != null) {
            this.BackupTables = new DatabaseTables[source.BackupTables.length];
            for (int i = 0; i < source.BackupTables.length; i++) {
                this.BackupTables[i] = new DatabaseTables(source.BackupTables[i]);
            }
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamArraySimple(map, prefix + "BackupDatabases.", this.BackupDatabases);
        this.setParamArrayObj(map, prefix + "BackupTables.", this.BackupTables);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

