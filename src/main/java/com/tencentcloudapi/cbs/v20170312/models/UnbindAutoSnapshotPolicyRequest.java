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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * List of cloud disk IDs scheduled snapshot policy to be unbound from.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * ID of scheduled snapshot policy to be unbound.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
     * Get List of cloud disk IDs scheduled snapshot policy to be unbound from. 
     * @return DiskIds List of cloud disk IDs scheduled snapshot policy to be unbound from.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set List of cloud disk IDs scheduled snapshot policy to be unbound from.
     * @param DiskIds List of cloud disk IDs scheduled snapshot policy to be unbound from.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get ID of scheduled snapshot policy to be unbound. 
     * @return AutoSnapshotPolicyId ID of scheduled snapshot policy to be unbound.
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set ID of scheduled snapshot policy to be unbound.
     * @param AutoSnapshotPolicyId ID of scheduled snapshot policy to be unbound.
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    public UnbindAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindAutoSnapshotPolicyRequest(UnbindAutoSnapshotPolicyRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);

    }
}

