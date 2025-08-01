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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BriefNodeInfo extends AbstractModel {

    /**
    * Node ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node role. Valid values: `master`, `slave`
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * The ID of the shard where the node resides
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
     * Get Node ID 
     * @return NodeId Node ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID
     * @param NodeId Node ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node role. Valid values: `master`, `slave` 
     * @return Role Node role. Valid values: `master`, `slave`
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node role. Valid values: `master`, `slave`
     * @param Role Node role. Valid values: `master`, `slave`
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get The ID of the shard where the node resides 
     * @return ShardId The ID of the shard where the node resides
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set The ID of the shard where the node resides
     * @param ShardId The ID of the shard where the node resides
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    public BriefNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BriefNodeInfo(BriefNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);

    }
}

