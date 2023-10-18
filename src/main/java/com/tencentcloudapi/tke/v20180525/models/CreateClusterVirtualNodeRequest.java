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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterVirtualNodeRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Node pool
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Subnet
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * List of subnet IDs (this parameter and `SubnetId` are mutually exclusive)
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * List of virtual nodes
    */
    @SerializedName("VirtualNodes")
    @Expose
    private VirtualNodeSpec [] VirtualNodes;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Node pool 
     * @return NodePoolId Node pool
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Node pool
     * @param NodePoolId Node pool
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Subnet 
     * @return SubnetId Subnet
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet
     * @param SubnetId Subnet
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get List of subnet IDs (this parameter and `SubnetId` are mutually exclusive) 
     * @return SubnetIds List of subnet IDs (this parameter and `SubnetId` are mutually exclusive)
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set List of subnet IDs (this parameter and `SubnetId` are mutually exclusive)
     * @param SubnetIds List of subnet IDs (this parameter and `SubnetId` are mutually exclusive)
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get List of virtual nodes 
     * @return VirtualNodes List of virtual nodes
     */
    public VirtualNodeSpec [] getVirtualNodes() {
        return this.VirtualNodes;
    }

    /**
     * Set List of virtual nodes
     * @param VirtualNodes List of virtual nodes
     */
    public void setVirtualNodes(VirtualNodeSpec [] VirtualNodes) {
        this.VirtualNodes = VirtualNodes;
    }

    public CreateClusterVirtualNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterVirtualNodeRequest(CreateClusterVirtualNodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.VirtualNodes != null) {
            this.VirtualNodes = new VirtualNodeSpec[source.VirtualNodes.length];
            for (int i = 0; i < source.VirtualNodes.length; i++) {
                this.VirtualNodes[i] = new VirtualNodeSpec(source.VirtualNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "VirtualNodes.", this.VirtualNodes);

    }
}

