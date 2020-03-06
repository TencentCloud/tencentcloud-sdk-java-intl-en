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

public class ClusterAdvancedSettings extends AbstractModel{

    /**
    * Whether IPVS is enabled
    */
    @SerializedName("IPVS")
    @Expose
    private Boolean IPVS;

    /**
    * Whether auto-scaling is enabled for nodes in the cluster (Enabling this function is not supported when you create a cluster)
    */
    @SerializedName("AsEnabled")
    @Expose
    private Boolean AsEnabled;

    /**
    * Type of runtime component used by the cluster. The types include "docker" and "containerd". Default value: docker
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 
    */
    @SerializedName("NodeNameType")
    @Expose
    private String NodeNameType;

    /**
     * Get Whether IPVS is enabled 
     * @return IPVS Whether IPVS is enabled
     */
    public Boolean getIPVS() {
        return this.IPVS;
    }

    /**
     * Set Whether IPVS is enabled
     * @param IPVS Whether IPVS is enabled
     */
    public void setIPVS(Boolean IPVS) {
        this.IPVS = IPVS;
    }

    /**
     * Get Whether auto-scaling is enabled for nodes in the cluster (Enabling this function is not supported when you create a cluster) 
     * @return AsEnabled Whether auto-scaling is enabled for nodes in the cluster (Enabling this function is not supported when you create a cluster)
     */
    public Boolean getAsEnabled() {
        return this.AsEnabled;
    }

    /**
     * Set Whether auto-scaling is enabled for nodes in the cluster (Enabling this function is not supported when you create a cluster)
     * @param AsEnabled Whether auto-scaling is enabled for nodes in the cluster (Enabling this function is not supported when you create a cluster)
     */
    public void setAsEnabled(Boolean AsEnabled) {
        this.AsEnabled = AsEnabled;
    }

    /**
     * Get Type of runtime component used by the cluster. The types include "docker" and "containerd". Default value: docker 
     * @return ContainerRuntime Type of runtime component used by the cluster. The types include "docker" and "containerd". Default value: docker
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set Type of runtime component used by the cluster. The types include "docker" and "containerd". Default value: docker
     * @param ContainerRuntime Type of runtime component used by the cluster. The types include "docker" and "containerd". Default value: docker
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get  
     * @return NodeNameType 
     */
    public String getNodeNameType() {
        return this.NodeNameType;
    }

    /**
     * Set 
     * @param NodeNameType 
     */
    public void setNodeNameType(String NodeNameType) {
        this.NodeNameType = NodeNameType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPVS", this.IPVS);
        this.setParamSimple(map, prefix + "AsEnabled", this.AsEnabled);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "NodeNameType", this.NodeNameType);

    }
}

