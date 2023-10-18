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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisNode extends AbstractModel {

    /**
    * Number of keys on Redis nodes
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * Slot distribution range for Redis node.  Value range:  0-5460.
    */
    @SerializedName("Slot")
    @Expose
    private String Slot;

    /**
    * Node sequence ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Node role
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get Number of keys on Redis nodes 
     * @return Keys Number of keys on Redis nodes
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set Number of keys on Redis nodes
     * @param Keys Number of keys on Redis nodes
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Slot distribution range for Redis node.  Value range:  0-5460. 
     * @return Slot Slot distribution range for Redis node.  Value range:  0-5460.
     */
    public String getSlot() {
        return this.Slot;
    }

    /**
     * Set Slot distribution range for Redis node.  Value range:  0-5460.
     * @param Slot Slot distribution range for Redis node.  Value range:  0-5460.
     */
    public void setSlot(String Slot) {
        this.Slot = Slot;
    }

    /**
     * Get Node sequence ID 
     * @return NodeId Node sequence ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node sequence ID
     * @param NodeId Node sequence ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node status 
     * @return Status Node status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status
     * @param Status Node status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Node role 
     * @return Role Node role
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node role
     * @param Role Node role
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public RedisNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisNode(RedisNode source) {
        if (source.Keys != null) {
            this.Keys = new Long(source.Keys);
        }
        if (source.Slot != null) {
            this.Slot = new String(source.Slot);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Slot", this.Slot);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

