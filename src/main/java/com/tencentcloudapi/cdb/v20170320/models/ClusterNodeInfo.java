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

public class ClusterNodeInfo extends AbstractModel {

    /**
    * node id.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node role.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Node AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Weight of the node
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Node status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get node id. 
     * @return NodeId node id.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set node id.
     * @param NodeId node id.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node role. 
     * @return Role Node role.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node role.
     * @param Role Node role.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Node AZ. 
     * @return Zone Node AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Node AZ.
     * @param Zone Node AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Weight of the node 
     * @return Weight Weight of the node
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of the node
     * @param Weight Weight of the node
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Node status. 
     * @return Status Node status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status.
     * @param Status Node status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ClusterNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNodeInfo(ClusterNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

