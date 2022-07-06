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

public class RedisNodeInfo extends AbstractModel{

    /**
    * Node type. 0: master node; 1: replica node
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * ID of the master or replica node, which is not required during instance creation
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * AZ ID of the master or replica node
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * AZ name of the master or replica node
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get Node type. 0: master node; 1: replica node 
     * @return NodeType Node type. 0: master node; 1: replica node
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. 0: master node; 1: replica node
     * @param NodeType Node type. 0: master node; 1: replica node
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get ID of the master or replica node, which is not required during instance creation 
     * @return NodeId ID of the master or replica node, which is not required during instance creation
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set ID of the master or replica node, which is not required during instance creation
     * @param NodeId ID of the master or replica node, which is not required during instance creation
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get AZ ID of the master or replica node 
     * @return ZoneId AZ ID of the master or replica node
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID of the master or replica node
     * @param ZoneId AZ ID of the master or replica node
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ name of the master or replica node 
     * @return ZoneName AZ name of the master or replica node
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name of the master or replica node
     * @param ZoneName AZ name of the master or replica node
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public RedisNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisNodeInfo(RedisNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

