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

public class EdgeCluster extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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
    * 
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * Cluster status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster description
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * Cluster creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Edge cluster version
    */
    @SerializedName("EdgeClusterVersion")
    @Expose
    private String EdgeClusterVersion;

    /**
    * Maximum number of Pods on the node
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * Cluster advanced settings
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private EdgeClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * TKE edge cluster level
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Whether to support auto upgrade of cluster spec level
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * Cluster billing mode. Valid values: `POSTPAID_BY_HOUR`, `PREPAID`
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Edge cluster component version 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EdgeVersion")
    @Expose
    private String EdgeVersion;

    /**
    * Tags bound with the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

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
     * Get Cluster status 
     * @return Status Cluster status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status
     * @param Status Cluster status
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Cluster creation time 
     * @return CreatedTime Cluster creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Cluster creation time
     * @param CreatedTime Cluster creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Edge cluster version 
     * @return EdgeClusterVersion Edge cluster version
     */
    public String getEdgeClusterVersion() {
        return this.EdgeClusterVersion;
    }

    /**
     * Set Edge cluster version
     * @param EdgeClusterVersion Edge cluster version
     */
    public void setEdgeClusterVersion(String EdgeClusterVersion) {
        this.EdgeClusterVersion = EdgeClusterVersion;
    }

    /**
     * Get Maximum number of Pods on the node
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxNodePodNum Maximum number of Pods on the node
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set Maximum number of Pods on the node
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param MaxNodePodNum Maximum number of Pods on the node
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get Cluster advanced settings
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterAdvancedSettings Cluster advanced settings
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public EdgeClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set Cluster advanced settings
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterAdvancedSettings Cluster advanced settings
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterAdvancedSettings(EdgeClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get TKE edge cluster level
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Level TKE edge cluster level
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set TKE edge cluster level
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Level TKE edge cluster level
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Whether to support auto upgrade of cluster spec level
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoUpgradeClusterLevel Whether to support auto upgrade of cluster spec level
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set Whether to support auto upgrade of cluster spec level
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AutoUpgradeClusterLevel Whether to support auto upgrade of cluster spec level
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get Cluster billing mode. Valid values: `POSTPAID_BY_HOUR`, `PREPAID`
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ChargeType Cluster billing mode. Valid values: `POSTPAID_BY_HOUR`, `PREPAID`
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Cluster billing mode. Valid values: `POSTPAID_BY_HOUR`, `PREPAID`
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ChargeType Cluster billing mode. Valid values: `POSTPAID_BY_HOUR`, `PREPAID`
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Edge cluster component version 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EdgeVersion Edge cluster component version 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEdgeVersion() {
        return this.EdgeVersion;
    }

    /**
     * Set Edge cluster component version 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EdgeVersion Edge cluster component version 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEdgeVersion(String EdgeVersion) {
        this.EdgeVersion = EdgeVersion;
    }

    /**
     * Get Tags bound with the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TagSpecification Tags bound with the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Tags bound with the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TagSpecification Tags bound with the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public EdgeCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeCluster(EdgeCluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.EdgeClusterVersion != null) {
            this.EdgeClusterVersion = new String(source.EdgeClusterVersion);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
        if (source.ClusterAdvancedSettings != null) {
            this.ClusterAdvancedSettings = new EdgeClusterAdvancedSettings(source.ClusterAdvancedSettings);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "EdgeClusterVersion", this.EdgeClusterVersion);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EdgeVersion", this.EdgeVersion);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

