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

public class NodePoolOption extends AbstractModel{

    /**
    * Whether to add to the node pool.
    */
    @SerializedName("AddToNodePool")
    @Expose
    private Boolean AddToNodePool;

    /**
    * Node pool ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Whether to inherit the node pool configuration.
    */
    @SerializedName("InheritConfigurationFromNodePool")
    @Expose
    private Boolean InheritConfigurationFromNodePool;

    /**
     * Get Whether to add to the node pool. 
     * @return AddToNodePool Whether to add to the node pool.
     */
    public Boolean getAddToNodePool() {
        return this.AddToNodePool;
    }

    /**
     * Set Whether to add to the node pool.
     * @param AddToNodePool Whether to add to the node pool.
     */
    public void setAddToNodePool(Boolean AddToNodePool) {
        this.AddToNodePool = AddToNodePool;
    }

    /**
     * Get Node pool ID 
     * @return NodePoolId Node pool ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Node pool ID
     * @param NodePoolId Node pool ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Whether to inherit the node pool configuration. 
     * @return InheritConfigurationFromNodePool Whether to inherit the node pool configuration.
     */
    public Boolean getInheritConfigurationFromNodePool() {
        return this.InheritConfigurationFromNodePool;
    }

    /**
     * Set Whether to inherit the node pool configuration.
     * @param InheritConfigurationFromNodePool Whether to inherit the node pool configuration.
     */
    public void setInheritConfigurationFromNodePool(Boolean InheritConfigurationFromNodePool) {
        this.InheritConfigurationFromNodePool = InheritConfigurationFromNodePool;
    }

    public NodePoolOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePoolOption(NodePoolOption source) {
        if (source.AddToNodePool != null) {
            this.AddToNodePool = new Boolean(source.AddToNodePool);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.InheritConfigurationFromNodePool != null) {
            this.InheritConfigurationFromNodePool = new Boolean(source.InheritConfigurationFromNodePool);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddToNodePool", this.AddToNodePool);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "InheritConfigurationFromNodePool", this.InheritConfigurationFromNodePool);

    }
}

