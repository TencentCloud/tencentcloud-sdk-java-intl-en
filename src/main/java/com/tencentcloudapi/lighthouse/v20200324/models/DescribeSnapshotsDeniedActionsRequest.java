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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotsDeniedActionsRequest extends AbstractModel {

    /**
    * Snapshot ID list, which can be queried through `DescribeSnapshots`.
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
     * Get Snapshot ID list, which can be queried through `DescribeSnapshots`. 
     * @return SnapshotIds Snapshot ID list, which can be queried through `DescribeSnapshots`.
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set Snapshot ID list, which can be queried through `DescribeSnapshots`.
     * @param SnapshotIds Snapshot ID list, which can be queried through `DescribeSnapshots`.
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    public DescribeSnapshotsDeniedActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotsDeniedActionsRequest(DescribeSnapshotsDeniedActionsRequest source) {
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
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);

    }
}

