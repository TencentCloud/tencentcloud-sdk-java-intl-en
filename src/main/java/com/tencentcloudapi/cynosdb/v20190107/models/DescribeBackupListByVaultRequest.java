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

public class DescribeBackupListByVaultRequest extends AbstractModel {

    /**
    * Safe ID. Its length must be greater than 0.
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * List of the backup file IDs for filtering specific backups.
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
    * Cluster ID, for filtering backups of a specific cluster
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of backup names for exact matching filter criteria
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * Filename list for exact matching filter criteria
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * Pagination quantity. Value range: (0, 100]. Default value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset. Value range: [0, INF). Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default value: createTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method. Available values: desc, asc, DESC, ASC. Default value: desc.
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
     * Get Safe ID. Its length must be greater than 0. 
     * @return VaultId Safe ID. Its length must be greater than 0.
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Safe ID. Its length must be greater than 0.
     * @param VaultId Safe ID. Its length must be greater than 0.
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get List of the backup file IDs for filtering specific backups. 
     * @return BackupIds List of the backup file IDs for filtering specific backups.
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set List of the backup file IDs for filtering specific backups.
     * @param BackupIds List of the backup file IDs for filtering specific backups.
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    /**
     * Get Cluster ID, for filtering backups of a specific cluster 
     * @return ClusterId Cluster ID, for filtering backups of a specific cluster
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, for filtering backups of a specific cluster
     * @param ClusterId Cluster ID, for filtering backups of a specific cluster
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get List of backup names for exact matching filter criteria 
     * @return BackupNames List of backup names for exact matching filter criteria
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set List of backup names for exact matching filter criteria
     * @param BackupNames List of backup names for exact matching filter criteria
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get Filename list for exact matching filter criteria 
     * @return FileNames Filename list for exact matching filter criteria
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set Filename list for exact matching filter criteria
     * @param FileNames Filename list for exact matching filter criteria
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get Pagination quantity. Value range: (0, 100]. Default value: 100. 
     * @return Limit Pagination quantity. Value range: (0, 100]. Default value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination quantity. Value range: (0, 100]. Default value: 100.
     * @param Limit Pagination quantity. Value range: (0, 100]. Default value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. Value range: [0, INF). Default value: 0. 
     * @return Offset Pagination offset. Value range: [0, INF). Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Value range: [0, INF). Default value: 0.
     * @param Offset Pagination offset. Value range: [0, INF). Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default value: createTime 
     * @return OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default value: createTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default value: createTime
     * @param OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime. Default value: createTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method. Available values: desc, asc, DESC, ASC. Default value: desc. 
     * @return OrderByType Sorting method. Available values: desc, asc, DESC, ASC. Default value: desc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method. Available values: desc, asc, DESC, ASC. Default value: desc.
     * @param OrderByType Sorting method. Available values: desc, asc, DESC, ASC. Default value: desc.
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

    public DescribeBackupListByVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupListByVaultRequest(DescribeBackupListByVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

