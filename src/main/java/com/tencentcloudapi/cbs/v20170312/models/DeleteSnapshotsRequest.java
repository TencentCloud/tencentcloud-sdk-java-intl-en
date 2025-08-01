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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSnapshotsRequest extends AbstractModel {

    /**
    * List of IDs of snapshots to be deleted, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * Whether to forcibly delete the image associated with the snapshot
    */
    @SerializedName("DeleteBindImages")
    @Expose
    private Boolean DeleteBindImages;

    /**
     * Get List of IDs of snapshots to be deleted, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1). 
     * @return SnapshotIds List of IDs of snapshots to be deleted, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set List of IDs of snapshots to be deleted, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
     * @param SnapshotIds List of IDs of snapshots to be deleted, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get Whether to forcibly delete the image associated with the snapshot 
     * @return DeleteBindImages Whether to forcibly delete the image associated with the snapshot
     */
    public Boolean getDeleteBindImages() {
        return this.DeleteBindImages;
    }

    /**
     * Set Whether to forcibly delete the image associated with the snapshot
     * @param DeleteBindImages Whether to forcibly delete the image associated with the snapshot
     */
    public void setDeleteBindImages(Boolean DeleteBindImages) {
        this.DeleteBindImages = DeleteBindImages;
    }

    public DeleteSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSnapshotsRequest(DeleteSnapshotsRequest source) {
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
        }
        if (source.DeleteBindImages != null) {
            this.DeleteBindImages = new Boolean(source.DeleteBindImages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamSimple(map, prefix + "DeleteBindImages", this.DeleteBindImages);

    }
}

