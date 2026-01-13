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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveNodeList extends AbstractModel {

    /**
    * Roles of nodes to be deleted.
 - SECONDARY: Mongod secondary node.
 - READONLY: read-only node.
 - MONGOS: Mongos node.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * IDs of nodes to be deleted. For a sharded cluster instance, specify the names of nodes to be deleted on one shard. Nodes with the same names on other shards will also be deleted.
- Obtaining method: Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to the **Node Management** tab, and obtain the **node ID**.
- Note: For a sharded cluster instance, specify the IDs of nodes on shard 0. For example, cmgo-6hfk\*\*\*\*\_0-node-primary.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * AZ corresponding to the node. For the currently supported AZs, see [Regions and AZs](https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1).
- Single AZ: all nodes are in the same AZ.
- Multiple AZs: The current standard specification involves three AZs. The primary and secondary nodes are not in the same AZ. Note: AZs corresponding to the nodes to be deleted should be specified. After deletion, the number of nodes in any 2 AZs should be larger than that in the third AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Roles of nodes to be deleted.
 - SECONDARY: Mongod secondary node.
 - READONLY: read-only node.
 - MONGOS: Mongos node. 
     * @return Role Roles of nodes to be deleted.
 - SECONDARY: Mongod secondary node.
 - READONLY: read-only node.
 - MONGOS: Mongos node.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Roles of nodes to be deleted.
 - SECONDARY: Mongod secondary node.
 - READONLY: read-only node.
 - MONGOS: Mongos node.
     * @param Role Roles of nodes to be deleted.
 - SECONDARY: Mongod secondary node.
 - READONLY: read-only node.
 - MONGOS: Mongos node.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get IDs of nodes to be deleted. For a sharded cluster instance, specify the names of nodes to be deleted on one shard. Nodes with the same names on other shards will also be deleted.
- Obtaining method: Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to the **Node Management** tab, and obtain the **node ID**.
- Note: For a sharded cluster instance, specify the IDs of nodes on shard 0. For example, cmgo-6hfk\*\*\*\*\_0-node-primary. 
     * @return NodeName IDs of nodes to be deleted. For a sharded cluster instance, specify the names of nodes to be deleted on one shard. Nodes with the same names on other shards will also be deleted.
- Obtaining method: Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to the **Node Management** tab, and obtain the **node ID**.
- Note: For a sharded cluster instance, specify the IDs of nodes on shard 0. For example, cmgo-6hfk\*\*\*\*\_0-node-primary.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set IDs of nodes to be deleted. For a sharded cluster instance, specify the names of nodes to be deleted on one shard. Nodes with the same names on other shards will also be deleted.
- Obtaining method: Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to the **Node Management** tab, and obtain the **node ID**.
- Note: For a sharded cluster instance, specify the IDs of nodes on shard 0. For example, cmgo-6hfk\*\*\*\*\_0-node-primary.
     * @param NodeName IDs of nodes to be deleted. For a sharded cluster instance, specify the names of nodes to be deleted on one shard. Nodes with the same names on other shards will also be deleted.
- Obtaining method: Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to the **Node Management** tab, and obtain the **node ID**.
- Note: For a sharded cluster instance, specify the IDs of nodes on shard 0. For example, cmgo-6hfk\*\*\*\*\_0-node-primary.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get AZ corresponding to the node. For the currently supported AZs, see [Regions and AZs](https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1).
- Single AZ: all nodes are in the same AZ.
- Multiple AZs: The current standard specification involves three AZs. The primary and secondary nodes are not in the same AZ. Note: AZs corresponding to the nodes to be deleted should be specified. After deletion, the number of nodes in any 2 AZs should be larger than that in the third AZ. 
     * @return Zone AZ corresponding to the node. For the currently supported AZs, see [Regions and AZs](https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1).
- Single AZ: all nodes are in the same AZ.
- Multiple AZs: The current standard specification involves three AZs. The primary and secondary nodes are not in the same AZ. Note: AZs corresponding to the nodes to be deleted should be specified. After deletion, the number of nodes in any 2 AZs should be larger than that in the third AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ corresponding to the node. For the currently supported AZs, see [Regions and AZs](https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1).
- Single AZ: all nodes are in the same AZ.
- Multiple AZs: The current standard specification involves three AZs. The primary and secondary nodes are not in the same AZ. Note: AZs corresponding to the nodes to be deleted should be specified. After deletion, the number of nodes in any 2 AZs should be larger than that in the third AZ.
     * @param Zone AZ corresponding to the node. For the currently supported AZs, see [Regions and AZs](https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1).
- Single AZ: all nodes are in the same AZ.
- Multiple AZs: The current standard specification involves three AZs. The primary and secondary nodes are not in the same AZ. Note: AZs corresponding to the nodes to be deleted should be specified. After deletion, the number of nodes in any 2 AZs should be larger than that in the third AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public RemoveNodeList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveNodeList(RemoveNodeList source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

