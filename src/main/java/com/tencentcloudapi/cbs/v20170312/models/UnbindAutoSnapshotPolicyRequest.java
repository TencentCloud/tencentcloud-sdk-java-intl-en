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

public class UnbindAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * ID of scheduled snapshot policy to be unbound.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * ID list of cloud disks from which the regular snapshot policy is unbound. specifies this parameter or the InstanceIds parameter. a minimum of one is required.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Instance ID list to unbind the periodic snapshot policy. this parameter or the DiskIds parameter requires a minimum of one input.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

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

    /**
     * Get ID list of cloud disks from which the regular snapshot policy is unbound. specifies this parameter or the InstanceIds parameter. a minimum of one is required. 
     * @return DiskIds ID list of cloud disks from which the regular snapshot policy is unbound. specifies this parameter or the InstanceIds parameter. a minimum of one is required.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID list of cloud disks from which the regular snapshot policy is unbound. specifies this parameter or the InstanceIds parameter. a minimum of one is required.
     * @param DiskIds ID list of cloud disks from which the regular snapshot policy is unbound. specifies this parameter or the InstanceIds parameter. a minimum of one is required.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Instance ID list to unbind the periodic snapshot policy. this parameter or the DiskIds parameter requires a minimum of one input. 
     * @return InstanceIds Instance ID list to unbind the periodic snapshot policy. this parameter or the DiskIds parameter requires a minimum of one input.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list to unbind the periodic snapshot policy. this parameter or the DiskIds parameter requires a minimum of one input.
     * @param InstanceIds Instance ID list to unbind the periodic snapshot policy. this parameter or the DiskIds parameter requires a minimum of one input.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public UnbindAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindAutoSnapshotPolicyRequest(UnbindAutoSnapshotPolicyRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

