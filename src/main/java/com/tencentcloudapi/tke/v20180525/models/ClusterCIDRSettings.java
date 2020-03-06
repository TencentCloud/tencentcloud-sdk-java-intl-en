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

public class ClusterCIDRSettings extends AbstractModel{

    /**
    * CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC’s CIDR or the CIDRs of other clusters in the same VPC
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * Whether to ignore ClusterCIDR conflict errors, which are not ignored by default
    */
    @SerializedName("IgnoreClusterCIDRConflict")
    @Expose
    private Boolean IgnoreClusterCIDRConflict;

    /**
    * Maximum number of pods on each node in the cluster
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * Maximum number of cluster services
    */
    @SerializedName("MaxClusterServiceNum")
    @Expose
    private Long MaxClusterServiceNum;

    /**
     * Get CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC’s CIDR or the CIDRs of other clusters in the same VPC 
     * @return ClusterCIDR CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC’s CIDR or the CIDRs of other clusters in the same VPC
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC’s CIDR or the CIDRs of other clusters in the same VPC
     * @param ClusterCIDR CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC’s CIDR or the CIDRs of other clusters in the same VPC
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get Whether to ignore ClusterCIDR conflict errors, which are not ignored by default 
     * @return IgnoreClusterCIDRConflict Whether to ignore ClusterCIDR conflict errors, which are not ignored by default
     */
    public Boolean getIgnoreClusterCIDRConflict() {
        return this.IgnoreClusterCIDRConflict;
    }

    /**
     * Set Whether to ignore ClusterCIDR conflict errors, which are not ignored by default
     * @param IgnoreClusterCIDRConflict Whether to ignore ClusterCIDR conflict errors, which are not ignored by default
     */
    public void setIgnoreClusterCIDRConflict(Boolean IgnoreClusterCIDRConflict) {
        this.IgnoreClusterCIDRConflict = IgnoreClusterCIDRConflict;
    }

    /**
     * Get Maximum number of pods on each node in the cluster 
     * @return MaxNodePodNum Maximum number of pods on each node in the cluster
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set Maximum number of pods on each node in the cluster
     * @param MaxNodePodNum Maximum number of pods on each node in the cluster
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get Maximum number of cluster services 
     * @return MaxClusterServiceNum Maximum number of cluster services
     */
    public Long getMaxClusterServiceNum() {
        return this.MaxClusterServiceNum;
    }

    /**
     * Set Maximum number of cluster services
     * @param MaxClusterServiceNum Maximum number of cluster services
     */
    public void setMaxClusterServiceNum(Long MaxClusterServiceNum) {
        this.MaxClusterServiceNum = MaxClusterServiceNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "IgnoreClusterCIDRConflict", this.IgnoreClusterCIDRConflict);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamSimple(map, prefix + "MaxClusterServiceNum", this.MaxClusterServiceNum);

    }
}

