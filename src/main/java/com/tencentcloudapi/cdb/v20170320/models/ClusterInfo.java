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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel {

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node type: primary node and secondary node.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Region.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node type: primary node and secondary node. 
     * @return Role Node type: primary node and secondary node.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node type: primary node and secondary node.
     * @param Role Node type: primary node and secondary node.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Region. 
     * @return Zone Region.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region.
     * @param Zone Region.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

