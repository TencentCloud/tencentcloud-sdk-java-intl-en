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

public class DeleteBackupVaultRequest extends AbstractModel {

    /**
    * Backup safe ID. The length must be greater than 0.
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Backup file ID list to be deleted, cannot be empty
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
     * Get Backup safe ID. The length must be greater than 0. 
     * @return VaultId Backup safe ID. The length must be greater than 0.
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Backup safe ID. The length must be greater than 0.
     * @param VaultId Backup safe ID. The length must be greater than 0.
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get Backup file ID list to be deleted, cannot be empty 
     * @return BackupIds Backup file ID list to be deleted, cannot be empty
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set Backup file ID list to be deleted, cannot be empty
     * @param BackupIds Backup file ID list to be deleted, cannot be empty
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    public DeleteBackupVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupVaultRequest(DeleteBackupVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);

    }
}

