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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResumeSnapshotInstanceRequest extends AbstractModel {

    /**
    * Snapshot policy IDs
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * Snapshot file ID
    */
    @SerializedName("SnapshotFileId")
    @Expose
    private String SnapshotFileId;

    /**
    * ID of the instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Snapshot policy IDs 
     * @return SnapshotPolicyId Snapshot policy IDs
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set Snapshot policy IDs
     * @param SnapshotPolicyId Snapshot policy IDs
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
    }

    /**
     * Get Snapshot file ID 
     * @return SnapshotFileId Snapshot file ID
     */
    public String getSnapshotFileId() {
        return this.SnapshotFileId;
    }

    /**
     * Set Snapshot file ID
     * @param SnapshotFileId Snapshot file ID
     */
    public void setSnapshotFileId(String SnapshotFileId) {
        this.SnapshotFileId = SnapshotFileId;
    }

    /**
     * Get ID of the instance. 
     * @return InstanceId ID of the instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance.
     * @param InstanceId ID of the instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ResumeSnapshotInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResumeSnapshotInstanceRequest(ResumeSnapshotInstanceRequest source) {
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.SnapshotFileId != null) {
            this.SnapshotFileId = new String(source.SnapshotFileId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "SnapshotFileId", this.SnapshotFileId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

