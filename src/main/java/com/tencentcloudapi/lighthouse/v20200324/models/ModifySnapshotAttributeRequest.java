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

public class ModifySnapshotAttributeRequest extends AbstractModel {

    /**
    * Snapshot ID, which can be queried through `DescribeSnapshots`.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * New snapshot name, which can contain up to 60 characters.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get Snapshot ID, which can be queried through `DescribeSnapshots`. 
     * @return SnapshotId Snapshot ID, which can be queried through `DescribeSnapshots`.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID, which can be queried through `DescribeSnapshots`.
     * @param SnapshotId Snapshot ID, which can be queried through `DescribeSnapshots`.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get New snapshot name, which can contain up to 60 characters. 
     * @return SnapshotName New snapshot name, which can contain up to 60 characters.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set New snapshot name, which can contain up to 60 characters.
     * @param SnapshotName New snapshot name, which can contain up to 60 characters.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    public ModifySnapshotAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotAttributeRequest(ModifySnapshotAttributeRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

