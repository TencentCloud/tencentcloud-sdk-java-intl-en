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

public class RedisNode extends AbstractModel{

    /**
    * The number of keys on a node
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * Distribution of node slots
    */
    @SerializedName("Slot")
    @Expose
    private String Slot;

    /**
    * Node ID
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
     * Get The number of keys on a node 
     * @return Keys The number of keys on a node
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set The number of keys on a node
     * @param Keys The number of keys on a node
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Distribution of node slots 
     * @return Slot Distribution of node slots
     */
    public String getSlot() {
        return this.Slot;
    }

    /**
     * Set Distribution of node slots
     * @param Slot Distribution of node slots
     */
    public void setSlot(String Slot) {
        this.Slot = Slot;
    }

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Slot", this.Slot);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

