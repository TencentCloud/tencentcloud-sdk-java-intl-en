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
    * 
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Cluster network proxy model
    */
    @SerializedName("KubeProxyMode")
    @Expose
    private String KubeProxyMode;

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
     * Get  
     * @return DeletionProtection 
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 
     * @param DeletionProtection 
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Cluster network proxy model 
     * @return KubeProxyMode Cluster network proxy model
     */
    public String getKubeProxyMode() {
        return this.KubeProxyMode;
    }

    /**
     * Set Cluster network proxy model
     * @param KubeProxyMode Cluster network proxy model
     */
    public void setKubeProxyMode(String KubeProxyMode) {
        this.KubeProxyMode = KubeProxyMode;
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

    }
}

