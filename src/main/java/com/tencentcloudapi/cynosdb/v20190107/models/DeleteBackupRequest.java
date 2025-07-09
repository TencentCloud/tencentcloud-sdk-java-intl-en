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

public class DeleteBackupRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Backup file ID. This field is used by legacy versions and thus not recommended.
    */
    @SerializedName("SnapshotIdList")
    @Expose
    private Long [] SnapshotIdList;

    /**
    * Backup file ID. This field is recommended.
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

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
     * Get Backup file ID. This field is used by legacy versions and thus not recommended. 
     * @return SnapshotIdList Backup file ID. This field is used by legacy versions and thus not recommended.
     */
    public Long [] getSnapshotIdList() {
        return this.SnapshotIdList;
    }

    /**
     * Set Backup file ID. This field is used by legacy versions and thus not recommended.
     * @param SnapshotIdList Backup file ID. This field is used by legacy versions and thus not recommended.
     */
    public void setSnapshotIdList(Long [] SnapshotIdList) {
        this.SnapshotIdList = SnapshotIdList;
    }

    /**
     * Get Backup file ID. This field is recommended. 
     * @return BackupIds Backup file ID. This field is recommended.
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set Backup file ID. This field is recommended.
     * @param BackupIds Backup file ID. This field is recommended.
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    public DeleteBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupRequest(DeleteBackupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SnapshotIdList != null) {
            this.SnapshotIdList = new Long[source.SnapshotIdList.length];
            for (int i = 0; i < source.SnapshotIdList.length; i++) {
                this.SnapshotIdList[i] = new Long(source.SnapshotIdList[i]);
            }
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SnapshotIdList.", this.SnapshotIdList);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);

    }
}

