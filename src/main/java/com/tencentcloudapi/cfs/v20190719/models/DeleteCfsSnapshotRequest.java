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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCfsSnapshotRequest extends AbstractModel{

    /**
    * File system snapshot ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * The list of the IDs of the file system snapshots to be deleted. At least one of `SnapshotId` and `SnapshotIds` must be specified.
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
     * Get File system snapshot ID 
     * @return SnapshotId File system snapshot ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set File system snapshot ID
     * @param SnapshotId File system snapshot ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get The list of the IDs of the file system snapshots to be deleted. At least one of `SnapshotId` and `SnapshotIds` must be specified. 
     * @return SnapshotIds The list of the IDs of the file system snapshots to be deleted. At least one of `SnapshotId` and `SnapshotIds` must be specified.
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set The list of the IDs of the file system snapshots to be deleted. At least one of `SnapshotId` and `SnapshotIds` must be specified.
     * @param SnapshotIds The list of the IDs of the file system snapshots to be deleted. At least one of `SnapshotId` and `SnapshotIds` must be specified.
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    public DeleteCfsSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCfsSnapshotRequest(DeleteCfsSnapshotRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);

    }
}

