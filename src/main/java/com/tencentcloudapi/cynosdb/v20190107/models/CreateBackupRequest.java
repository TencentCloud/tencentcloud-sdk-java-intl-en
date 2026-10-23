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
    * Backup type. Available values: logic (logical backup); snapshot (physical backup).
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Database to be backed up. This parameter is valid only when BackupType is logic.
    */
    @SerializedName("BackupDatabases")
    @Expose
    private String [] BackupDatabases;

    /**
    * Tables to be backed up. This parameter is valid only when BackupType is logic.
    */
    @SerializedName("BackupTables")
    @Expose
    private DatabaseTables [] BackupTables;

    /**
    * Alias name
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 	Information sent to the safe
    */
    @SerializedName("Vaults")
    @Expose
    private CreateBackupVaultItem [] Vaults;

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
     * Get Backup type. Available values: logic (logical backup); snapshot (physical backup). 
     * @return BackupType Backup type. Available values: logic (logical backup); snapshot (physical backup).
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Available values: logic (logical backup); snapshot (physical backup).
     * @param BackupType Backup type. Available values: logic (logical backup); snapshot (physical backup).
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Database to be backed up. This parameter is valid only when BackupType is logic. 
     * @return BackupDatabases Database to be backed up. This parameter is valid only when BackupType is logic.
     */
    public String [] getBackupDatabases() {
        return this.BackupDatabases;
    }

    /**
     * Set Database to be backed up. This parameter is valid only when BackupType is logic.
     * @param BackupDatabases Database to be backed up. This parameter is valid only when BackupType is logic.
     */
    public void setBackupDatabases(String [] BackupDatabases) {
        this.BackupDatabases = BackupDatabases;
    }

    /**
     * Get Tables to be backed up. This parameter is valid only when BackupType is logic. 
     * @return BackupTables Tables to be backed up. This parameter is valid only when BackupType is logic.
     */
    public DatabaseTables [] getBackupTables() {
        return this.BackupTables;
    }

    /**
     * Set Tables to be backed up. This parameter is valid only when BackupType is logic.
     * @param BackupTables Tables to be backed up. This parameter is valid only when BackupType is logic.
     */
    public void setBackupTables(DatabaseTables [] BackupTables) {
        this.BackupTables = BackupTables;
    }

    /**
     * Get Alias name 
     * @return BackupName Alias name
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Alias name
     * @param BackupName Alias name
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 	Information sent to the safe 
     * @return Vaults 	Information sent to the safe
     */
    public CreateBackupVaultItem [] getVaults() {
        return this.Vaults;
    }

    /**
     * Set 	Information sent to the safe
     * @param Vaults 	Information sent to the safe
     */
    public void setVaults(CreateBackupVaultItem [] Vaults) {
        this.Vaults = Vaults;
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
        if (source.Vaults != null) {
            this.Vaults = new CreateBackupVaultItem[source.Vaults.length];
            for (int i = 0; i < source.Vaults.length; i++) {
                this.Vaults[i] = new CreateBackupVaultItem(source.Vaults[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Vaults.", this.Vaults);

    }
}

