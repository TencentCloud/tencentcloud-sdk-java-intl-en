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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupTotalSize extends AbstractModel {

    /**
    * Total size of full backup, in bytes
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * Incremental backup total size
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * free quota
    */
    @SerializedName("FreeQuota")
    @Expose
    private Long FreeQuota;

    /**
     * Get Total size of full backup, in bytes 
     * @return SnapshotSize Total size of full backup, in bytes
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set Total size of full backup, in bytes
     * @param SnapshotSize Total size of full backup, in bytes
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * Get Incremental backup total size 
     * @return OplogSize Incremental backup total size
     */
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set Incremental backup total size
     * @param OplogSize Incremental backup total size
     */
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get free quota 
     * @return FreeQuota free quota
     */
    public Long getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set free quota
     * @param FreeQuota free quota
     */
    public void setFreeQuota(Long FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    public BackupTotalSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupTotalSize(BackupTotalSize source) {
        if (source.SnapshotSize != null) {
            this.SnapshotSize = new Long(source.SnapshotSize);
        }
        if (source.OplogSize != null) {
            this.OplogSize = new Long(source.OplogSize);
        }
        if (source.FreeQuota != null) {
            this.FreeQuota = new Long(source.FreeQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);

    }
}

