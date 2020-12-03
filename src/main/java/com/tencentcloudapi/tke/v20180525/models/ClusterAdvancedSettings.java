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
    * NodeName type for a node in a cluster (This includes the two forms of **hostname** and **lan-ip**, with the default as **lan-ip**. If **hostname** is used, you need to set the HostName parameter when creating a node, and the InstanceName needs to be the same as the HostName.)
    */
    @SerializedName("NodeNameType")
    @Expose
    private String NodeNameType;

    /**
    * Cluster custom parameter
    */
    @SerializedName("ExtraArgs")
    @Expose
    private ClusterExtraArgs ExtraArgs;

    /**
    * Cluster network type, which can be GR (Global Router) or VPC-CNI. The default value is GR.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Whether a cluster in VPC-CNI mode uses dynamic IP addresses. The default value is FALSE, which indicates that static IP addresses are used.
    */
    @SerializedName("IsNonStaticIpMode")
    @Expose
    private Boolean IsNonStaticIpMode;

    /**
    * Indicates whether to enable cluster deletion protection.
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Cluster network proxy model, which is only used when ipvs-bpf mode is used. At present, TKE cluster supports three network proxy modes including `iptables`, `ipvs` and `ipvs-bpf` and their parameter setting relationships are as follows:
`iptables`: do not set IPVS and KubeProxyMode.
`ipvs` mode: set IPVS to `true` and do not set KubeProxyMode.
`ipvs-bpf`: set KubeProxyMode to `kube-proxy-bpf`.
The following conditions are required to use ipvs-bpf network mode:
1. The cluster version must be v1.14 or later.
2. The system image must be a TKE custom image such as Ubuntu TKE Optimized or Centos TKE Optimized.
    */
    @SerializedName("KubeProxyMode")
    @Expose
    private String KubeProxyMode;

    /**
    * Indicates whether to enable auditing
    */
    @SerializedName("AuditEnabled")
    @Expose
    private Boolean AuditEnabled;

    /**
    * Specifies the ID of logset to which the audit logs are uploaded.
    */
    @SerializedName("AuditLogsetId")
    @Expose
    private String AuditLogsetId;

    /**
    * Specifies the ID of topic to which the audit logs are uploaded.
    */
    @SerializedName("AuditLogTopicId")
    @Expose
    private String AuditLogTopicId;

    /**
    * Specifies whether the VPC CNI type is multi-IP ENI or or independent ENI.
    */
    @SerializedName("VpcCniType")
    @Expose
    private String VpcCniType;

    /**
    * Runtime version
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

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
     * Get NodeName type for a node in a cluster (This includes the two forms of **hostname** and **lan-ip**, with the default as **lan-ip**. If **hostname** is used, you need to set the HostName parameter when creating a node, and the InstanceName needs to be the same as the HostName.) 
     * @return NodeNameType NodeName type for a node in a cluster (This includes the two forms of **hostname** and **lan-ip**, with the default as **lan-ip**. If **hostname** is used, you need to set the HostName parameter when creating a node, and the InstanceName needs to be the same as the HostName.)
     */
    public String getNodeNameType() {
        return this.NodeNameType;
    }

    /**
     * Set NodeName type for a node in a cluster (This includes the two forms of **hostname** and **lan-ip**, with the default as **lan-ip**. If **hostname** is used, you need to set the HostName parameter when creating a node, and the InstanceName needs to be the same as the HostName.)
     * @param NodeNameType NodeName type for a node in a cluster (This includes the two forms of **hostname** and **lan-ip**, with the default as **lan-ip**. If **hostname** is used, you need to set the HostName parameter when creating a node, and the InstanceName needs to be the same as the HostName.)
     */
    public void setNodeNameType(String NodeNameType) {
        this.NodeNameType = NodeNameType;
    }

    /**
     * Get Cluster custom parameter 
     * @return ExtraArgs Cluster custom parameter
     */
    public ClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Cluster custom parameter
     * @param ExtraArgs Cluster custom parameter
     */
    public void setExtraArgs(ClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get Cluster network type, which can be GR (Global Router) or VPC-CNI. The default value is GR. 
     * @return NetworkType Cluster network type, which can be GR (Global Router) or VPC-CNI. The default value is GR.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Cluster network type, which can be GR (Global Router) or VPC-CNI. The default value is GR.
     * @param NetworkType Cluster network type, which can be GR (Global Router) or VPC-CNI. The default value is GR.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Whether a cluster in VPC-CNI mode uses dynamic IP addresses. The default value is FALSE, which indicates that static IP addresses are used. 
     * @return IsNonStaticIpMode Whether a cluster in VPC-CNI mode uses dynamic IP addresses. The default value is FALSE, which indicates that static IP addresses are used.
     */
    public Boolean getIsNonStaticIpMode() {
        return this.IsNonStaticIpMode;
    }

    /**
     * Set Whether a cluster in VPC-CNI mode uses dynamic IP addresses. The default value is FALSE, which indicates that static IP addresses are used.
     * @param IsNonStaticIpMode Whether a cluster in VPC-CNI mode uses dynamic IP addresses. The default value is FALSE, which indicates that static IP addresses are used.
     */
    public void setIsNonStaticIpMode(Boolean IsNonStaticIpMode) {
        this.IsNonStaticIpMode = IsNonStaticIpMode;
    }

    /**
     * Get Indicates whether to enable cluster deletion protection. 
     * @return DeletionProtection Indicates whether to enable cluster deletion protection.
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Indicates whether to enable cluster deletion protection.
     * @param DeletionProtection Indicates whether to enable cluster deletion protection.
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Cluster network proxy model, which is only used when ipvs-bpf mode is used. At present, TKE cluster supports three network proxy modes including `iptables`, `ipvs` and `ipvs-bpf` and their parameter setting relationships are as follows:
`iptables`: do not set IPVS and KubeProxyMode.
`ipvs` mode: set IPVS to `true` and do not set KubeProxyMode.
`ipvs-bpf`: set KubeProxyMode to `kube-proxy-bpf`.
The following conditions are required to use ipvs-bpf network mode:
1. The cluster version must be v1.14 or later.
2. The system image must be a TKE custom image such as Ubuntu TKE Optimized or Centos TKE Optimized. 
     * @return KubeProxyMode Cluster network proxy model, which is only used when ipvs-bpf mode is used. At present, TKE cluster supports three network proxy modes including `iptables`, `ipvs` and `ipvs-bpf` and their parameter setting relationships are as follows:
`iptables`: do not set IPVS and KubeProxyMode.
`ipvs` mode: set IPVS to `true` and do not set KubeProxyMode.
`ipvs-bpf`: set KubeProxyMode to `kube-proxy-bpf`.
The following conditions are required to use ipvs-bpf network mode:
1. The cluster version must be v1.14 or later.
2. The system image must be a TKE custom image such as Ubuntu TKE Optimized or Centos TKE Optimized.
     */
    public String getKubeProxyMode() {
        return this.KubeProxyMode;
    }

    /**
     * Set Cluster network proxy model, which is only used when ipvs-bpf mode is used. At present, TKE cluster supports three network proxy modes including `iptables`, `ipvs` and `ipvs-bpf` and their parameter setting relationships are as follows:
`iptables`: do not set IPVS and KubeProxyMode.
`ipvs` mode: set IPVS to `true` and do not set KubeProxyMode.
`ipvs-bpf`: set KubeProxyMode to `kube-proxy-bpf`.
The following conditions are required to use ipvs-bpf network mode:
1. The cluster version must be v1.14 or later.
2. The system image must be a TKE custom image such as Ubuntu TKE Optimized or Centos TKE Optimized.
     * @param KubeProxyMode Cluster network proxy model, which is only used when ipvs-bpf mode is used. At present, TKE cluster supports three network proxy modes including `iptables`, `ipvs` and `ipvs-bpf` and their parameter setting relationships are as follows:
`iptables`: do not set IPVS and KubeProxyMode.
`ipvs` mode: set IPVS to `true` and do not set KubeProxyMode.
`ipvs-bpf`: set KubeProxyMode to `kube-proxy-bpf`.
The following conditions are required to use ipvs-bpf network mode:
1. The cluster version must be v1.14 or later.
2. The system image must be a TKE custom image such as Ubuntu TKE Optimized or Centos TKE Optimized.
     */
    public void setKubeProxyMode(String KubeProxyMode) {
        this.KubeProxyMode = KubeProxyMode;
    }

    /**
     * Get Indicates whether to enable auditing 
     * @return AuditEnabled Indicates whether to enable auditing
     */
    public Boolean getAuditEnabled() {
        return this.AuditEnabled;
    }

    /**
     * Set Indicates whether to enable auditing
     * @param AuditEnabled Indicates whether to enable auditing
     */
    public void setAuditEnabled(Boolean AuditEnabled) {
        this.AuditEnabled = AuditEnabled;
    }

    /**
     * Get Specifies the ID of logset to which the audit logs are uploaded. 
     * @return AuditLogsetId Specifies the ID of logset to which the audit logs are uploaded.
     */
    public String getAuditLogsetId() {
        return this.AuditLogsetId;
    }

    /**
     * Set Specifies the ID of logset to which the audit logs are uploaded.
     * @param AuditLogsetId Specifies the ID of logset to which the audit logs are uploaded.
     */
    public void setAuditLogsetId(String AuditLogsetId) {
        this.AuditLogsetId = AuditLogsetId;
    }

    /**
     * Get Specifies the ID of topic to which the audit logs are uploaded. 
     * @return AuditLogTopicId Specifies the ID of topic to which the audit logs are uploaded.
     */
    public String getAuditLogTopicId() {
        return this.AuditLogTopicId;
    }

    /**
     * Set Specifies the ID of topic to which the audit logs are uploaded.
     * @param AuditLogTopicId Specifies the ID of topic to which the audit logs are uploaded.
     */
    public void setAuditLogTopicId(String AuditLogTopicId) {
        this.AuditLogTopicId = AuditLogTopicId;
    }

    /**
     * Get Specifies whether the VPC CNI type is multi-IP ENI or or independent ENI. 
     * @return VpcCniType Specifies whether the VPC CNI type is multi-IP ENI or or independent ENI.
     */
    public String getVpcCniType() {
        return this.VpcCniType;
    }

    /**
     * Set Specifies whether the VPC CNI type is multi-IP ENI or or independent ENI.
     * @param VpcCniType Specifies whether the VPC CNI type is multi-IP ENI or or independent ENI.
     */
    public void setVpcCniType(String VpcCniType) {
        this.VpcCniType = VpcCniType;
    }

    /**
     * Get Runtime version 
     * @return RuntimeVersion Runtime version
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set Runtime version
     * @param RuntimeVersion Runtime version
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPVS", this.IPVS);
        this.setParamSimple(map, prefix + "AsEnabled", this.AsEnabled);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "NodeNameType", this.NodeNameType);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "IsNonStaticIpMode", this.IsNonStaticIpMode);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "KubeProxyMode", this.KubeProxyMode);
        this.setParamSimple(map, prefix + "AuditEnabled", this.AuditEnabled);
        this.setParamSimple(map, prefix + "AuditLogsetId", this.AuditLogsetId);
        this.setParamSimple(map, prefix + "AuditLogTopicId", this.AuditLogTopicId);
        this.setParamSimple(map, prefix + "VpcCniType", this.VpcCniType);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);

    }
}

