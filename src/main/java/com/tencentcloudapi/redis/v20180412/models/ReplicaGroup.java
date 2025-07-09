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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicaGroup extends AbstractModel {

    /**
    * Node group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Node group name, which is empty for the master node
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Node AZ ID, such as ap-guangzhou-1
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Node group type. master: primary node; replica: replica node.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * List of nodes in the node group
    */
    @SerializedName("RedisNodes")
    @Expose
    private RedisNode [] RedisNodes;

    /**
     * Get Node group ID 
     * @return GroupId Node group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Node group ID
     * @param GroupId Node group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Node group name, which is empty for the master node 
     * @return GroupName Node group name, which is empty for the master node
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Node group name, which is empty for the master node
     * @param GroupName Node group name, which is empty for the master node
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Node AZ ID, such as ap-guangzhou-1 
     * @return ZoneId Node AZ ID, such as ap-guangzhou-1
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Node AZ ID, such as ap-guangzhou-1
     * @param ZoneId Node AZ ID, such as ap-guangzhou-1
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Node group type. master: primary node; replica: replica node. 
     * @return Role Node group type. master: primary node; replica: replica node.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node group type. master: primary node; replica: replica node.
     * @param Role Node group type. master: primary node; replica: replica node.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get List of nodes in the node group 
     * @return RedisNodes List of nodes in the node group
     */
    public RedisNode [] getRedisNodes() {
        return this.RedisNodes;
    }

    /**
     * Set List of nodes in the node group
     * @param RedisNodes List of nodes in the node group
     */
    public void setRedisNodes(RedisNode [] RedisNodes) {
        this.RedisNodes = RedisNodes;
    }

    public ReplicaGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicaGroup(ReplicaGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.RedisNodes != null) {
            this.RedisNodes = new RedisNode[source.RedisNodes.length];
            for (int i = 0; i < source.RedisNodes.length; i++) {
                this.RedisNodes[i] = new RedisNode(source.RedisNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamArrayObj(map, prefix + "RedisNodes.", this.RedisNodes);

    }
}

