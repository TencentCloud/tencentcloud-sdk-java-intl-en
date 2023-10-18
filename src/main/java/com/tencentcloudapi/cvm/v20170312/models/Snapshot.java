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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot extends AbstractModel {

    /**
    * Snapshot ID.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Type of the cloud disk used to create the snapshot. Valid values:
SYSTEM_DISK: system disk
DATA_DISK: data disk
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Size of the cloud disk used to create the snapshot; unit: GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get Snapshot ID. 
     * @return SnapshotId Snapshot ID.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID.
     * @param SnapshotId Snapshot ID.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Type of the cloud disk used to create the snapshot. Valid values:
SYSTEM_DISK: system disk
DATA_DISK: data disk 
     * @return DiskUsage Type of the cloud disk used to create the snapshot. Valid values:
SYSTEM_DISK: system disk
DATA_DISK: data disk
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Type of the cloud disk used to create the snapshot. Valid values:
SYSTEM_DISK: system disk
DATA_DISK: data disk
     * @param DiskUsage Type of the cloud disk used to create the snapshot. Valid values:
SYSTEM_DISK: system disk
DATA_DISK: data disk
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Size of the cloud disk used to create the snapshot; unit: GB. 
     * @return DiskSize Size of the cloud disk used to create the snapshot; unit: GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Size of the cloud disk used to create the snapshot; unit: GB.
     * @param DiskSize Size of the cloud disk used to create the snapshot; unit: GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public Snapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Snapshot(Snapshot source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

