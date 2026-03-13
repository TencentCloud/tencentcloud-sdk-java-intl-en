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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCfsSnapshotRequest extends AbstractModel {

    /**
    * Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Snapshot ID of the file system snapshot that needs to be deleted. specify either the snapshot ID or the ID list, at least one is required.
Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
     * Get Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api. 
     * @return SnapshotId Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
     * @param SnapshotId Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Snapshot ID of the file system snapshot that needs to be deleted. specify either the snapshot ID or the ID list, at least one is required.
Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api. 
     * @return SnapshotIds Snapshot ID of the file system snapshot that needs to be deleted. specify either the snapshot ID or the ID list, at least one is required.
Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set Snapshot ID of the file system snapshot that needs to be deleted. specify either the snapshot ID or the ID list, at least one is required.
Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
     * @param SnapshotIds Snapshot ID of the file system snapshot that needs to be deleted. specify either the snapshot ID or the ID list, at least one is required.
Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.comom/document/api/582/80206?from_cn_redirect=1) api.
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

