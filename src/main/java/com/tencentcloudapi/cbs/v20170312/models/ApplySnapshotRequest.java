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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplySnapshotRequest extends AbstractModel{

    /**
    * Snapshot ID, which can be queried via [DescribeSnapshots](/document/product/362/15647).
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * ID of the original cloud disk corresponding to the snapshot, which can be queried via the API [DescribeDisks](/document/product/362/16315).
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get Snapshot ID, which can be queried via [DescribeSnapshots](/document/product/362/15647). 
     * @return SnapshotId Snapshot ID, which can be queried via [DescribeSnapshots](/document/product/362/15647).
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID, which can be queried via [DescribeSnapshots](/document/product/362/15647).
     * @param SnapshotId Snapshot ID, which can be queried via [DescribeSnapshots](/document/product/362/15647).
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get ID of the original cloud disk corresponding to the snapshot, which can be queried via the API [DescribeDisks](/document/product/362/16315). 
     * @return DiskId ID of the original cloud disk corresponding to the snapshot, which can be queried via the API [DescribeDisks](/document/product/362/16315).
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the original cloud disk corresponding to the snapshot, which can be queried via the API [DescribeDisks](/document/product/362/16315).
     * @param DiskId ID of the original cloud disk corresponding to the snapshot, which can be queried via the API [DescribeDisks](/document/product/362/16315).
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

