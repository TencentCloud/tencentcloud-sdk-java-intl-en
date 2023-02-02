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

public class DeleteClusterVirtualNodePoolRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of virtual node pool IDs
    */
    @SerializedName("NodePoolIds")
    @Expose
    private String [] NodePoolIds;

    /**
    * Whether to forcibly delete the nodes with pods. Values: `true`, `false`.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

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
     * Get List of virtual node pool IDs 
     * @return NodePoolIds List of virtual node pool IDs
     */
    public String [] getNodePoolIds() {
        return this.NodePoolIds;
    }

    /**
     * Set List of virtual node pool IDs
     * @param NodePoolIds List of virtual node pool IDs
     */
    public void setNodePoolIds(String [] NodePoolIds) {
        this.NodePoolIds = NodePoolIds;
    }

    /**
     * Get Whether to forcibly delete the nodes with pods. Values: `true`, `false`. 
     * @return Force Whether to forcibly delete the nodes with pods. Values: `true`, `false`.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to forcibly delete the nodes with pods. Values: `true`, `false`.
     * @param Force Whether to forcibly delete the nodes with pods. Values: `true`, `false`.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteClusterVirtualNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterVirtualNodePoolRequest(DeleteClusterVirtualNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolIds != null) {
            this.NodePoolIds = new String[source.NodePoolIds.length];
            for (int i = 0; i < source.NodePoolIds.length; i++) {
                this.NodePoolIds[i] = new String(source.NodePoolIds[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "NodePoolIds.", this.NodePoolIds);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

