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

public class ClusterBasicSettings extends AbstractModel{

    /**
    * Cluster operating system. CentOS 7.2x86_64 or Ubuntu 16.04.1 LTSx86_64. Default value: Ubuntu 16.04.1 LTSx86_64
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * Cluster version. The default value is 1.10.5.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster description
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * VPC ID, in the format of vpc-xxx, which is required when you create an empty managed cluster.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the project to which the new resources in the cluster belong.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Tag description list. This parameter is used to bind a tag to a resource instance. Currently, a tag can only be bound to cluster instances.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * Whether to enable the node’s default security group (default: `No`, Aphla feature)
    */
    @SerializedName("NeedWorkSecurityGroup")
    @Expose
    private Boolean NeedWorkSecurityGroup;

    /**
    * When the Cilium Overlay add-on is selected, TKE will take two IPs from the subnet to create the private network CLB.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Cluster specifications available for managed clusters
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * Auto cluster upgrade for managed clusters
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private AutoUpgradeClusterLevel AutoUpgradeClusterLevel;

    /**
     * Get Cluster operating system. CentOS 7.2x86_64 or Ubuntu 16.04.1 LTSx86_64. Default value: Ubuntu 16.04.1 LTSx86_64 
     * @return ClusterOs Cluster operating system. CentOS 7.2x86_64 or Ubuntu 16.04.1 LTSx86_64. Default value: Ubuntu 16.04.1 LTSx86_64
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set Cluster operating system. CentOS 7.2x86_64 or Ubuntu 16.04.1 LTSx86_64. Default value: Ubuntu 16.04.1 LTSx86_64
     * @param ClusterOs Cluster operating system. CentOS 7.2x86_64 or Ubuntu 16.04.1 LTSx86_64. Default value: Ubuntu 16.04.1 LTSx86_64
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get Cluster version. The default value is 1.10.5. 
     * @return ClusterVersion Cluster version. The default value is 1.10.5.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version. The default value is 1.10.5.
     * @param ClusterVersion Cluster version. The default value is 1.10.5.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
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
     * Get Cluster description 
     * @return ClusterDescription Cluster description
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set Cluster description
     * @param ClusterDescription Cluster description
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    /**
     * Get VPC ID, in the format of vpc-xxx, which is required when you create an empty managed cluster. 
     * @return VpcId VPC ID, in the format of vpc-xxx, which is required when you create an empty managed cluster.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, in the format of vpc-xxx, which is required when you create an empty managed cluster.
     * @param VpcId VPC ID, in the format of vpc-xxx, which is required when you create an empty managed cluster.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the project to which the new resources in the cluster belong. 
     * @return ProjectId ID of the project to which the new resources in the cluster belong.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the new resources in the cluster belong.
     * @param ProjectId ID of the project to which the new resources in the cluster belong.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Tag description list. This parameter is used to bind a tag to a resource instance. Currently, a tag can only be bound to cluster instances. 
     * @return TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance. Currently, a tag can only be bound to cluster instances.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Tag description list. This parameter is used to bind a tag to a resource instance. Currently, a tag can only be bound to cluster instances.
     * @param TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance. Currently, a tag can only be bound to cluster instances.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value) 
     * @return OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     * @param OsCustomizeType Container image tag, `DOCKER_CUSTOMIZE` (container customized tag), `GENERAL` (general tag, default value)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get Whether to enable the node’s default security group (default: `No`, Aphla feature) 
     * @return NeedWorkSecurityGroup Whether to enable the node’s default security group (default: `No`, Aphla feature)
     */
    public Boolean getNeedWorkSecurityGroup() {
        return this.NeedWorkSecurityGroup;
    }

    /**
     * Set Whether to enable the node’s default security group (default: `No`, Aphla feature)
     * @param NeedWorkSecurityGroup Whether to enable the node’s default security group (default: `No`, Aphla feature)
     */
    public void setNeedWorkSecurityGroup(Boolean NeedWorkSecurityGroup) {
        this.NeedWorkSecurityGroup = NeedWorkSecurityGroup;
    }

    /**
     * Get When the Cilium Overlay add-on is selected, TKE will take two IPs from the subnet to create the private network CLB. 
     * @return SubnetId When the Cilium Overlay add-on is selected, TKE will take two IPs from the subnet to create the private network CLB.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set When the Cilium Overlay add-on is selected, TKE will take two IPs from the subnet to create the private network CLB.
     * @param SubnetId When the Cilium Overlay add-on is selected, TKE will take two IPs from the subnet to create the private network CLB.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Cluster specifications available for managed clusters 
     * @return ClusterLevel Cluster specifications available for managed clusters
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set Cluster specifications available for managed clusters
     * @param ClusterLevel Cluster specifications available for managed clusters
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get Auto cluster upgrade for managed clusters 
     * @return AutoUpgradeClusterLevel Auto cluster upgrade for managed clusters
     */
    public AutoUpgradeClusterLevel getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set Auto cluster upgrade for managed clusters
     * @param AutoUpgradeClusterLevel Auto cluster upgrade for managed clusters
     */
    public void setAutoUpgradeClusterLevel(AutoUpgradeClusterLevel AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    public ClusterBasicSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterBasicSettings(ClusterBasicSettings source) {
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDescription != null) {
            this.ClusterDescription = new String(source.ClusterDescription);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.NeedWorkSecurityGroup != null) {
            this.NeedWorkSecurityGroup = new Boolean(source.NeedWorkSecurityGroup);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new AutoUpgradeClusterLevel(source.AutoUpgradeClusterLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "NeedWorkSecurityGroup", this.NeedWorkSecurityGroup);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamObj(map, prefix + "AutoUpgradeClusterLevel.", this.AutoUpgradeClusterLevel);

    }
}

