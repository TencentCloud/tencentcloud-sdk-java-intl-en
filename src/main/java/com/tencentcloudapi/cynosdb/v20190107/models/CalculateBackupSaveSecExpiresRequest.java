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

public class CalculateBackupSaveSecExpiresRequest extends AbstractModel {

    /**
    * Backup safe ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Backup retention period (seconds). Must be greater than 0.
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * Number of items per page, range (0,100], default 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Range: [0,INF). Default is 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: endTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method, available values: desc, asc, DESC, ASC, default desc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Backup safe ID 
     * @return VaultId Backup safe ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Backup safe ID
     * @param VaultId Backup safe ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get Backup retention period (seconds). Must be greater than 0. 
     * @return BackupSaveSeconds Backup retention period (seconds). Must be greater than 0.
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set Backup retention period (seconds). Must be greater than 0.
     * @param BackupSaveSeconds Backup retention period (seconds). Must be greater than 0.
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    /**
     * Get Number of items per page, range (0,100], default 10 
     * @return Limit Number of items per page, range (0,100], default 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page, range (0,100], default 10
     * @param Limit Number of items per page, range (0,100], default 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Range: [0,INF). Default is 0 
     * @return Offset Offset. Range: [0,INF). Default is 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Range: [0,INF). Default is 0
     * @param Offset Offset. Range: [0,INF). Default is 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: endTime. 
     * @return OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: endTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: endTime.
     * @param OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: endTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method, available values: desc, asc, DESC, ASC, default desc 
     * @return OrderByType Sorting method, available values: desc, asc, DESC, ASC, default desc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method, available values: desc, asc, DESC, ASC, default desc
     * @param OrderByType Sorting method, available values: desc, asc, DESC, ASC, default desc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public CalculateBackupSaveSecExpiresRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CalculateBackupSaveSecExpiresRequest(CalculateBackupSaveSecExpiresRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

