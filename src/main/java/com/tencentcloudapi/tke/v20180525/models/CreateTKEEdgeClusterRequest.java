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

public class CreateTKEEdgeClusterRequest extends AbstractModel{

    /**
    * 
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster Pod CIDR block
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * Cluster service CIDR block
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * Cluster description
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * Cluster advanced settings
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private EdgeClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * Maximum number of Pods on the node
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * Public LB of the TKE Edge cluster
    */
    @SerializedName("PublicLB")
    @Expose
    private EdgeClusterPublicLB PublicLB;

    /**
    * Cluster specification level
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * Whether auto upgrade is supported
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * Cluster billing mode
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Edge cluster version. It is the set of versions of all cluster components.
    */
    @SerializedName("EdgeVersion")
    @Expose
    private String EdgeVersion;

    /**
    * Prefix of the image registry of an edge component
    */
    @SerializedName("RegistryPrefix")
    @Expose
    private String RegistryPrefix;

    /**
    * u200dTags bound with the cluster
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
     * Get  
     * @return K8SVersion 
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set 
     * @param K8SVersion 
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster Pod CIDR block 
     * @return PodCIDR Cluster Pod CIDR block
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set Cluster Pod CIDR block
     * @param PodCIDR Cluster Pod CIDR block
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get Cluster service CIDR block 
     * @return ServiceCIDR Cluster service CIDR block
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set Cluster service CIDR block
     * @param ServiceCIDR Cluster service CIDR block
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get Cluster description 
     * @return ClusterDesc Cluster description
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set Cluster description
     * @param ClusterDesc Cluster description
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get Cluster advanced settings 
     * @return ClusterAdvancedSettings Cluster advanced settings
     */
    public EdgeClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set Cluster advanced settings
     * @param ClusterAdvancedSettings Cluster advanced settings
     */
    public void setClusterAdvancedSettings(EdgeClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get Maximum number of Pods on the node 
     * @return MaxNodePodNum Maximum number of Pods on the node
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set Maximum number of Pods on the node
     * @param MaxNodePodNum Maximum number of Pods on the node
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get Public LB of the TKE Edge cluster 
     * @return PublicLB Public LB of the TKE Edge cluster
     */
    public EdgeClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set Public LB of the TKE Edge cluster
     * @param PublicLB Public LB of the TKE Edge cluster
     */
    public void setPublicLB(EdgeClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get Cluster specification level 
     * @return ClusterLevel Cluster specification level
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set Cluster specification level
     * @param ClusterLevel Cluster specification level
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get Whether auto upgrade is supported 
     * @return AutoUpgradeClusterLevel Whether auto upgrade is supported
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set Whether auto upgrade is supported
     * @param AutoUpgradeClusterLevel Whether auto upgrade is supported
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get Cluster billing mode 
     * @return ChargeType Cluster billing mode
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Cluster billing mode
     * @param ChargeType Cluster billing mode
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Edge cluster version. It is the set of versions of all cluster components. 
     * @return EdgeVersion Edge cluster version. It is the set of versions of all cluster components.
     */
    public String getEdgeVersion() {
        return this.EdgeVersion;
    }

    /**
     * Set Edge cluster version. It is the set of versions of all cluster components.
     * @param EdgeVersion Edge cluster version. It is the set of versions of all cluster components.
     */
    public void setEdgeVersion(String EdgeVersion) {
        this.EdgeVersion = EdgeVersion;
    }

    /**
     * Get Prefix of the image registry of an edge component 
     * @return RegistryPrefix Prefix of the image registry of an edge component
     */
    public String getRegistryPrefix() {
        return this.RegistryPrefix;
    }

    /**
     * Set Prefix of the image registry of an edge component
     * @param RegistryPrefix Prefix of the image registry of an edge component
     */
    public void setRegistryPrefix(String RegistryPrefix) {
        this.RegistryPrefix = RegistryPrefix;
    }

    /**
     * Get u200dTags bound with the cluster 
     * @return TagSpecification u200dTags bound with the cluster
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set u200dTags bound with the cluster
     * @param TagSpecification u200dTags bound with the cluster
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateTKEEdgeClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTKEEdgeClusterRequest(CreateTKEEdgeClusterRequest source) {
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterAdvancedSettings != null) {
            this.ClusterAdvancedSettings = new EdgeClusterAdvancedSettings(source.ClusterAdvancedSettings);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
        if (source.PublicLB != null) {
            this.PublicLB = new EdgeClusterPublicLB(source.PublicLB);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new Boolean(source.AutoUpgradeClusterLevel);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.EdgeVersion != null) {
            this.EdgeVersion = new String(source.EdgeVersion);
        }
        if (source.RegistryPrefix != null) {
            this.RegistryPrefix = new String(source.RegistryPrefix);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EdgeVersion", this.EdgeVersion);
        this.setParamSimple(map, prefix + "RegistryPrefix", this.RegistryPrefix);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

