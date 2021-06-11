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

public class ClusterNetworkSettings extends AbstractModel{

    /**
    * CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC's CIDR or the CIDRs of other clusters in the same VPC.
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * Whether to ignore ClusterCIDR conflict errors. It defaults to not ignore.
    */
    @SerializedName("IgnoreClusterCIDRConflict")
    @Expose
    private Boolean IgnoreClusterCIDRConflict;

    /**
    * Maximum number of pods on each node in the cluster. Default value: 256
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * Maximum number of cluster services. Default value: 256
    */
    @SerializedName("MaxClusterServiceNum")
    @Expose
    private Long MaxClusterServiceNum;

    /**
    * Whether IPVS is enabled. Default value: disabled
    */
    @SerializedName("Ipvs")
    @Expose
    private Boolean Ipvs;

    /**
    * Cluster VPC ID, which is required when you create an empty cluster; otherwise, it is automatically set to be consistent with that of the nodes in the cluster
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Whether CNI is enabled for network plugin(s). Default value: enabled
    */
    @SerializedName("Cni")
    @Expose
    private Boolean Cni;

    /**
    * The network mode of service. This parameter is only applicable to ipvs+bpf mode.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("KubeProxyMode")
    @Expose
    private String KubeProxyMode;

    /**
    * The IP range for service assignment. It cannot conflict with the VPC’s CIDR block nor the CIDR blocks of other clusters in the same VPC.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * The container subnet associated with the cluster
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
     * Get CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC's CIDR or the CIDRs of other clusters in the same VPC. 
     * @return ClusterCIDR CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC's CIDR or the CIDRs of other clusters in the same VPC.
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC's CIDR or the CIDRs of other clusters in the same VPC.
     * @param ClusterCIDR CIDR used to assign container and service IPs for the cluster. It cannot conflict with the VPC's CIDR or the CIDRs of other clusters in the same VPC.
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get Whether to ignore ClusterCIDR conflict errors. It defaults to not ignore. 
     * @return IgnoreClusterCIDRConflict Whether to ignore ClusterCIDR conflict errors. It defaults to not ignore.
     */
    public Boolean getIgnoreClusterCIDRConflict() {
        return this.IgnoreClusterCIDRConflict;
    }

    /**
     * Set Whether to ignore ClusterCIDR conflict errors. It defaults to not ignore.
     * @param IgnoreClusterCIDRConflict Whether to ignore ClusterCIDR conflict errors. It defaults to not ignore.
     */
    public void setIgnoreClusterCIDRConflict(Boolean IgnoreClusterCIDRConflict) {
        this.IgnoreClusterCIDRConflict = IgnoreClusterCIDRConflict;
    }

    /**
     * Get Maximum number of pods on each node in the cluster. Default value: 256 
     * @return MaxNodePodNum Maximum number of pods on each node in the cluster. Default value: 256
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set Maximum number of pods on each node in the cluster. Default value: 256
     * @param MaxNodePodNum Maximum number of pods on each node in the cluster. Default value: 256
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get Maximum number of cluster services. Default value: 256 
     * @return MaxClusterServiceNum Maximum number of cluster services. Default value: 256
     */
    public Long getMaxClusterServiceNum() {
        return this.MaxClusterServiceNum;
    }

    /**
     * Set Maximum number of cluster services. Default value: 256
     * @param MaxClusterServiceNum Maximum number of cluster services. Default value: 256
     */
    public void setMaxClusterServiceNum(Long MaxClusterServiceNum) {
        this.MaxClusterServiceNum = MaxClusterServiceNum;
    }

    /**
     * Get Whether IPVS is enabled. Default value: disabled 
     * @return Ipvs Whether IPVS is enabled. Default value: disabled
     */
    public Boolean getIpvs() {
        return this.Ipvs;
    }

    /**
     * Set Whether IPVS is enabled. Default value: disabled
     * @param Ipvs Whether IPVS is enabled. Default value: disabled
     */
    public void setIpvs(Boolean Ipvs) {
        this.Ipvs = Ipvs;
    }

    /**
     * Get Cluster VPC ID, which is required when you create an empty cluster; otherwise, it is automatically set to be consistent with that of the nodes in the cluster 
     * @return VpcId Cluster VPC ID, which is required when you create an empty cluster; otherwise, it is automatically set to be consistent with that of the nodes in the cluster
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Cluster VPC ID, which is required when you create an empty cluster; otherwise, it is automatically set to be consistent with that of the nodes in the cluster
     * @param VpcId Cluster VPC ID, which is required when you create an empty cluster; otherwise, it is automatically set to be consistent with that of the nodes in the cluster
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Whether CNI is enabled for network plugin(s). Default value: enabled 
     * @return Cni Whether CNI is enabled for network plugin(s). Default value: enabled
     */
    public Boolean getCni() {
        return this.Cni;
    }

    /**
     * Set Whether CNI is enabled for network plugin(s). Default value: enabled
     * @param Cni Whether CNI is enabled for network plugin(s). Default value: enabled
     */
    public void setCni(Boolean Cni) {
        this.Cni = Cni;
    }

    /**
     * Get The network mode of service. This parameter is only applicable to ipvs+bpf mode.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return KubeProxyMode The network mode of service. This parameter is only applicable to ipvs+bpf mode.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getKubeProxyMode() {
        return this.KubeProxyMode;
    }

    /**
     * Set The network mode of service. This parameter is only applicable to ipvs+bpf mode.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param KubeProxyMode The network mode of service. This parameter is only applicable to ipvs+bpf mode.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setKubeProxyMode(String KubeProxyMode) {
        this.KubeProxyMode = KubeProxyMode;
    }

    /**
     * Get The IP range for service assignment. It cannot conflict with the VPC’s CIDR block nor the CIDR blocks of other clusters in the same VPC.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ServiceCIDR The IP range for service assignment. It cannot conflict with the VPC’s CIDR block nor the CIDR blocks of other clusters in the same VPC.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set The IP range for service assignment. It cannot conflict with the VPC’s CIDR block nor the CIDR blocks of other clusters in the same VPC.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ServiceCIDR The IP range for service assignment. It cannot conflict with the VPC’s CIDR block nor the CIDR blocks of other clusters in the same VPC.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get The container subnet associated with the cluster
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Subnets The container subnet associated with the cluster
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set The container subnet associated with the cluster
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Subnets The container subnet associated with the cluster
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    public ClusterNetworkSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNetworkSettings(ClusterNetworkSettings source) {
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.IgnoreClusterCIDRConflict != null) {
            this.IgnoreClusterCIDRConflict = new Boolean(source.IgnoreClusterCIDRConflict);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
        if (source.MaxClusterServiceNum != null) {
            this.MaxClusterServiceNum = new Long(source.MaxClusterServiceNum);
        }
        if (source.Ipvs != null) {
            this.Ipvs = new Boolean(source.Ipvs);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Cni != null) {
            this.Cni = new Boolean(source.Cni);
        }
        if (source.KubeProxyMode != null) {
            this.KubeProxyMode = new String(source.KubeProxyMode);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.Subnets != null) {
            this.Subnets = new String[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new String(source.Subnets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "IgnoreClusterCIDRConflict", this.IgnoreClusterCIDRConflict);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamSimple(map, prefix + "MaxClusterServiceNum", this.MaxClusterServiceNum);
        this.setParamSimple(map, prefix + "Ipvs", this.Ipvs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Cni", this.Cni);
        this.setParamSimple(map, prefix + "KubeProxyMode", this.KubeProxyMode);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamArraySimple(map, prefix + "Subnets.", this.Subnets);

    }
}

