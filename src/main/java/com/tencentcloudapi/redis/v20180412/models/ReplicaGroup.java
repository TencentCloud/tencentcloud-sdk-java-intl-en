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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicaGroup extends AbstractModel{

    /**
    * Node group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Node group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Node availability zone ID, such as ap-guangzhou-1
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Node group type. Valid values: `master` (master node group), `replica` (replica node group)
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * The list of nodes in a node group
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
     * Get Node group name 
     * @return GroupName Node group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Node group name
     * @param GroupName Node group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Node availability zone ID, such as ap-guangzhou-1 
     * @return ZoneId Node availability zone ID, such as ap-guangzhou-1
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Node availability zone ID, such as ap-guangzhou-1
     * @param ZoneId Node availability zone ID, such as ap-guangzhou-1
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Node group type. Valid values: `master` (master node group), `replica` (replica node group) 
     * @return Role Node group type. Valid values: `master` (master node group), `replica` (replica node group)
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node group type. Valid values: `master` (master node group), `replica` (replica node group)
     * @param Role Node group type. Valid values: `master` (master node group), `replica` (replica node group)
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get The list of nodes in a node group 
     * @return RedisNodes The list of nodes in a node group
     */
    public RedisNode [] getRedisNodes() {
        return this.RedisNodes;
    }

    /**
     * Set The list of nodes in a node group
     * @param RedisNodes The list of nodes in a node group
     */
    public void setRedisNodes(RedisNode [] RedisNodes) {
        this.RedisNodes = RedisNodes;
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

