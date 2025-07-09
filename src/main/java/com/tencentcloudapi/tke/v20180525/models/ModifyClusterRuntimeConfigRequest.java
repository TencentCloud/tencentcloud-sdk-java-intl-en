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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterRuntimeConfigRequest extends AbstractModel {

    /**
    * Cluster ID, required
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * This field is required when it is required to modify the runtime version based on another K8S version. For example, in scenarios where conflicts occur during upgrade verification.
    */
    @SerializedName("DstK8SVersion")
    @Expose
    private String DstK8SVersion;

    /**
    * This field is required when it is required to modify the runtime of a cluster.
    */
    @SerializedName("ClusterRuntimeConfig")
    @Expose
    private RuntimeConfig ClusterRuntimeConfig;

    /**
    * This field is required when it is required to modify the runtime of a node pool, specifying the part to be modified.
    */
    @SerializedName("NodePoolRuntimeConfig")
    @Expose
    private NodePoolRuntime [] NodePoolRuntimeConfig;

    /**
     * Get Cluster ID, required 
     * @return ClusterId Cluster ID, required
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, required
     * @param ClusterId Cluster ID, required
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get This field is required when it is required to modify the runtime version based on another K8S version. For example, in scenarios where conflicts occur during upgrade verification. 
     * @return DstK8SVersion This field is required when it is required to modify the runtime version based on another K8S version. For example, in scenarios where conflicts occur during upgrade verification.
     */
    public String getDstK8SVersion() {
        return this.DstK8SVersion;
    }

    /**
     * Set This field is required when it is required to modify the runtime version based on another K8S version. For example, in scenarios where conflicts occur during upgrade verification.
     * @param DstK8SVersion This field is required when it is required to modify the runtime version based on another K8S version. For example, in scenarios where conflicts occur during upgrade verification.
     */
    public void setDstK8SVersion(String DstK8SVersion) {
        this.DstK8SVersion = DstK8SVersion;
    }

    /**
     * Get This field is required when it is required to modify the runtime of a cluster. 
     * @return ClusterRuntimeConfig This field is required when it is required to modify the runtime of a cluster.
     */
    public RuntimeConfig getClusterRuntimeConfig() {
        return this.ClusterRuntimeConfig;
    }

    /**
     * Set This field is required when it is required to modify the runtime of a cluster.
     * @param ClusterRuntimeConfig This field is required when it is required to modify the runtime of a cluster.
     */
    public void setClusterRuntimeConfig(RuntimeConfig ClusterRuntimeConfig) {
        this.ClusterRuntimeConfig = ClusterRuntimeConfig;
    }

    /**
     * Get This field is required when it is required to modify the runtime of a node pool, specifying the part to be modified. 
     * @return NodePoolRuntimeConfig This field is required when it is required to modify the runtime of a node pool, specifying the part to be modified.
     */
    public NodePoolRuntime [] getNodePoolRuntimeConfig() {
        return this.NodePoolRuntimeConfig;
    }

    /**
     * Set This field is required when it is required to modify the runtime of a node pool, specifying the part to be modified.
     * @param NodePoolRuntimeConfig This field is required when it is required to modify the runtime of a node pool, specifying the part to be modified.
     */
    public void setNodePoolRuntimeConfig(NodePoolRuntime [] NodePoolRuntimeConfig) {
        this.NodePoolRuntimeConfig = NodePoolRuntimeConfig;
    }

    public ModifyClusterRuntimeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterRuntimeConfigRequest(ModifyClusterRuntimeConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DstK8SVersion != null) {
            this.DstK8SVersion = new String(source.DstK8SVersion);
        }
        if (source.ClusterRuntimeConfig != null) {
            this.ClusterRuntimeConfig = new RuntimeConfig(source.ClusterRuntimeConfig);
        }
        if (source.NodePoolRuntimeConfig != null) {
            this.NodePoolRuntimeConfig = new NodePoolRuntime[source.NodePoolRuntimeConfig.length];
            for (int i = 0; i < source.NodePoolRuntimeConfig.length; i++) {
                this.NodePoolRuntimeConfig[i] = new NodePoolRuntime(source.NodePoolRuntimeConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DstK8SVersion", this.DstK8SVersion);
        this.setParamObj(map, prefix + "ClusterRuntimeConfig.", this.ClusterRuntimeConfig);
        this.setParamArrayObj(map, prefix + "NodePoolRuntimeConfig.", this.NodePoolRuntimeConfig);

    }
}

