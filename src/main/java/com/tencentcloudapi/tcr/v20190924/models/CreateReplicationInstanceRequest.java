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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReplicationInstanceRequest extends AbstractModel {

    /**
    * Master instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Region ID of the replication instance
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
    * Region name of the replication instance
    */
    @SerializedName("ReplicationRegionName")
    @Expose
    private String ReplicationRegionName;

    /**
    * Whether to sync TCR cloud tags to the COS Bucket
    */
    @SerializedName("SyncTag")
    @Expose
    private Boolean SyncTag;

    /**
     * Get Master instance ID 
     * @return RegistryId Master instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Master instance ID
     * @param RegistryId Master instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Region ID of the replication instance 
     * @return ReplicationRegionId Region ID of the replication instance
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set Region ID of the replication instance
     * @param ReplicationRegionId Region ID of the replication instance
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Get Region name of the replication instance 
     * @return ReplicationRegionName Region name of the replication instance
     */
    public String getReplicationRegionName() {
        return this.ReplicationRegionName;
    }

    /**
     * Set Region name of the replication instance
     * @param ReplicationRegionName Region name of the replication instance
     */
    public void setReplicationRegionName(String ReplicationRegionName) {
        this.ReplicationRegionName = ReplicationRegionName;
    }

    /**
     * Get Whether to sync TCR cloud tags to the COS Bucket 
     * @return SyncTag Whether to sync TCR cloud tags to the COS Bucket
     */
    public Boolean getSyncTag() {
        return this.SyncTag;
    }

    /**
     * Set Whether to sync TCR cloud tags to the COS Bucket
     * @param SyncTag Whether to sync TCR cloud tags to the COS Bucket
     */
    public void setSyncTag(Boolean SyncTag) {
        this.SyncTag = SyncTag;
    }

    public CreateReplicationInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReplicationInstanceRequest(CreateReplicationInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.ReplicationRegionId != null) {
            this.ReplicationRegionId = new Long(source.ReplicationRegionId);
        }
        if (source.ReplicationRegionName != null) {
            this.ReplicationRegionName = new String(source.ReplicationRegionName);
        }
        if (source.SyncTag != null) {
            this.SyncTag = new Boolean(source.SyncTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);
        this.setParamSimple(map, prefix + "ReplicationRegionName", this.ReplicationRegionName);
        this.setParamSimple(map, prefix + "SyncTag", this.SyncTag);

    }
}

