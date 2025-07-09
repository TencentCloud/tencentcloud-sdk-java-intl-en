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

public class DescribeReplicationInstanceCreateTasksRequest extends AbstractModel {

    /**
    * Replication instance ID
    */
    @SerializedName("ReplicationRegistryId")
    @Expose
    private String ReplicationRegistryId;

    /**
    * Region ID of the replication instance
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
     * Get Replication instance ID 
     * @return ReplicationRegistryId Replication instance ID
     */
    public String getReplicationRegistryId() {
        return this.ReplicationRegistryId;
    }

    /**
     * Set Replication instance ID
     * @param ReplicationRegistryId Replication instance ID
     */
    public void setReplicationRegistryId(String ReplicationRegistryId) {
        this.ReplicationRegistryId = ReplicationRegistryId;
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

    public DescribeReplicationInstanceCreateTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationInstanceCreateTasksRequest(DescribeReplicationInstanceCreateTasksRequest source) {
        if (source.ReplicationRegistryId != null) {
            this.ReplicationRegistryId = new String(source.ReplicationRegistryId);
        }
        if (source.ReplicationRegionId != null) {
            this.ReplicationRegionId = new Long(source.ReplicationRegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationRegistryId", this.ReplicationRegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);

    }
}

