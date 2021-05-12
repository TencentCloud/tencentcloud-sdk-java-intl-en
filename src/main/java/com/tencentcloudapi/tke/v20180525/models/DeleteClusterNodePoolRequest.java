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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterNodePoolRequest extends AbstractModel{

    /**
    * ClusterId of a node pool
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * IDs of node pools to delete
    */
    @SerializedName("NodePoolIds")
    @Expose
    private String [] NodePoolIds;

    /**
    * Indicates whether nodes in a node pool are retained when the node pool is deleted. (The nodes are removed from the cluster. However, the corresponding instances will not be terminated.)
    */
    @SerializedName("KeepInstance")
    @Expose
    private Boolean KeepInstance;

    /**
     * Get ClusterId of a node pool 
     * @return ClusterId ClusterId of a node pool
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ClusterId of a node pool
     * @param ClusterId ClusterId of a node pool
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get IDs of node pools to delete 
     * @return NodePoolIds IDs of node pools to delete
     */
    public String [] getNodePoolIds() {
        return this.NodePoolIds;
    }

    /**
     * Set IDs of node pools to delete
     * @param NodePoolIds IDs of node pools to delete
     */
    public void setNodePoolIds(String [] NodePoolIds) {
        this.NodePoolIds = NodePoolIds;
    }

    /**
     * Get Indicates whether nodes in a node pool are retained when the node pool is deleted. (The nodes are removed from the cluster. However, the corresponding instances will not be terminated.) 
     * @return KeepInstance Indicates whether nodes in a node pool are retained when the node pool is deleted. (The nodes are removed from the cluster. However, the corresponding instances will not be terminated.)
     */
    public Boolean getKeepInstance() {
        return this.KeepInstance;
    }

    /**
     * Set Indicates whether nodes in a node pool are retained when the node pool is deleted. (The nodes are removed from the cluster. However, the corresponding instances will not be terminated.)
     * @param KeepInstance Indicates whether nodes in a node pool are retained when the node pool is deleted. (The nodes are removed from the cluster. However, the corresponding instances will not be terminated.)
     */
    public void setKeepInstance(Boolean KeepInstance) {
        this.KeepInstance = KeepInstance;
    }

    public DeleteClusterNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterNodePoolRequest(DeleteClusterNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolIds != null) {
            this.NodePoolIds = new String[source.NodePoolIds.length];
            for (int i = 0; i < source.NodePoolIds.length; i++) {
                this.NodePoolIds[i] = new String(source.NodePoolIds[i]);
            }
        }
        if (source.KeepInstance != null) {
            this.KeepInstance = new Boolean(source.KeepInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "NodePoolIds.", this.NodePoolIds);
        this.setParamSimple(map, prefix + "KeepInstance", this.KeepInstance);

    }
}

