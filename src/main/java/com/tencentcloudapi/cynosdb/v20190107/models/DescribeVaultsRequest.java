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

public class DescribeVaultsRequest extends AbstractModel {

    /**
    * Safe ID list for precise filtering
    */
    @SerializedName("VaultIds")
    @Expose
    private String [] VaultIds;

    /**
    * Safe name, used for fuzzy filtering
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * Status list of safe for filtering
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Number of items per page, range (0,100], default 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Range: [0,+∞). Default is 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method, available values: desc, asc, DESC, ASC
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Safe ID list for precise filtering 
     * @return VaultIds Safe ID list for precise filtering
     */
    public String [] getVaultIds() {
        return this.VaultIds;
    }

    /**
     * Set Safe ID list for precise filtering
     * @param VaultIds Safe ID list for precise filtering
     */
    public void setVaultIds(String [] VaultIds) {
        this.VaultIds = VaultIds;
    }

    /**
     * Get Safe name, used for fuzzy filtering 
     * @return VaultName Safe name, used for fuzzy filtering
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set Safe name, used for fuzzy filtering
     * @param VaultName Safe name, used for fuzzy filtering
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get Status list of safe for filtering 
     * @return Status Status list of safe for filtering
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Status list of safe for filtering
     * @param Status Status list of safe for filtering
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Number of items per page, range (0,100], default 100 
     * @return Limit Number of items per page, range (0,100], default 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page, range (0,100], default 100
     * @param Limit Number of items per page, range (0,100], default 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Range: [0,+∞). Default is 0 
     * @return Offset Offset. Range: [0,+∞). Default is 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Range: [0,+∞). Default is 0
     * @param Offset Offset. Range: [0,+∞). Default is 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime 
     * @return OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
     * @param OrderBy Sorting field. Available values: VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method, available values: desc, asc, DESC, ASC 
     * @return OrderByType Sorting method, available values: desc, asc, DESC, ASC
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method, available values: desc, asc, DESC, ASC
     * @param OrderByType Sorting method, available values: desc, asc, DESC, ASC
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeVaultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVaultsRequest(DescribeVaultsRequest source) {
        if (source.VaultIds != null) {
            this.VaultIds = new String[source.VaultIds.length];
            for (int i = 0; i < source.VaultIds.length; i++) {
                this.VaultIds[i] = new String(source.VaultIds[i]);
            }
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VaultIds.", this.VaultIds);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

