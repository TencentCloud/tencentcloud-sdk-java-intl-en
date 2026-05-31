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

public class DescribeBinlogListByVaultRequest extends AbstractModel {

    /**
    * Safe ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of the backup IDs.
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
    * Backup name list
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * Filename list
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * Number of returned results, range (0,100], default 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Range: [0, INF). Default is 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: createTime.
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
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Safe ID 
     * @return VaultId Safe ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Safe ID
     * @param VaultId Safe ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

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
     * Get List of the backup IDs. 
     * @return BackupIds List of the backup IDs.
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set List of the backup IDs.
     * @param BackupIds List of the backup IDs.
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    /**
     * Get Backup name list 
     * @return BackupNames Backup name list
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set Backup name list
     * @param BackupNames Backup name list
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get Filename list 
     * @return FileNames Filename list
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set Filename list
     * @param FileNames Filename list
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get Number of returned results, range (0,100], default 100 
     * @return Limit Number of returned results, range (0,100], default 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results, range (0,100], default 100
     * @param Limit Number of returned results, range (0,100], default 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Range: [0, INF). Default is 0 
     * @return Offset Offset. Range: [0, INF). Default is 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Range: [0, INF). Default is 0
     * @param Offset Offset. Range: [0, INF). Default is 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: createTime. 
     * @return OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: createTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: createTime.
     * @param OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default: createTime.
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

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribeBinlogListByVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogListByVaultRequest(DescribeBinlogListByVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
        if (source.BackupNames != null) {
            this.BackupNames = new String[source.BackupNames.length];
            for (int i = 0; i < source.BackupNames.length; i++) {
                this.BackupNames[i] = new String(source.BackupNames[i]);
            }
        }
        if (source.FileNames != null) {
            this.FileNames = new String[source.FileNames.length];
            for (int i = 0; i < source.FileNames.length; i++) {
                this.FileNames[i] = new String(source.FileNames[i]);
            }
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

