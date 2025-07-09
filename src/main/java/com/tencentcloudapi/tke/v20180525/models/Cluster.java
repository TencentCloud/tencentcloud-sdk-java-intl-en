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

public class Cluster extends AbstractModel {

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
    * Cluster description
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * Cluster version. The default value is 1.10.5.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Cluster operating system. centOS 7.2x86_64 or ubuntu 16.04.1 LTSx86_64. Default value: ubuntu 16.04.1 LTSx86_64
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * Cluster type. Managed cluster: MANAGED_CLUSTER; Self-deployed cluster: INDEPENDENT_CLUSTER.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster network-related parameters
    */
    @SerializedName("ClusterNetworkSettings")
    @Expose
    private ClusterNetworkSettings ClusterNetworkSettings;

    /**
    * Current number of nodes in the cluster
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * ID of the project to which the cluster belongs
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Tag description list.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * Cluster status. Values: `Trading` (Preparing), `Creating`, `Running`, `Deleting`, `Idling` (Idle), `Recovering`, `Scaling`, `Upgrading` (Upgrading the cluster), `WaittingForConnect` (Pending registration), `Pause` (Cluster upgrade paused), `NodeUpgrading` (Upgrading the node), `RuntimeUpgrading` (Upgrading the node runtime), `MasterScaling` (Scaling Master), `ClusterLevelUpgrading` (Adjusting cluster specification level), `ResourceIsolate` (Isolating), `ResourceIsolated` (Isolated), `ResourceReverse` (Overdue payment made. Recovering the cluster), and `Abnormal`.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * Cluster attributes (including a map of different cluster attributes, with attribute fields including NodeNameType (lan-ip mode and hostname mode, with lan-ip mode as default))
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * Number of primary nodes currently in the cluster
    */
    @SerializedName("ClusterMaterNodeNum")
    @Expose
    private Long ClusterMaterNodeNum;

    /**
    * ID of the image used by the cluster
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Container image tag
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * Runtime environment of the cluster. Values can be `docker` or `containerd`.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * Creation time
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Whether Deletion Protection is enabled
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * Specifies whether the cluster supports external nodes.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EnableExternalNode")
    @Expose
    private Boolean EnableExternalNode;

    /**
    * Cluster models. It’s valid for managed clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * The target cluster model for auto-upgrade
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * Whether to enable qGPU Sharing
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * Runtime version
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * Number of current etcd in the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterEtcdNodeNum")
    @Expose
    private Long ClusterEtcdNodeNum;

    /**
    * CDC Id
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

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
     * Get Cluster operating system. centOS 7.2x86_64 or ubuntu 16.04.1 LTSx86_64. Default value: ubuntu 16.04.1 LTSx86_64 
     * @return ClusterOs Cluster operating system. centOS 7.2x86_64 or ubuntu 16.04.1 LTSx86_64. Default value: ubuntu 16.04.1 LTSx86_64
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set Cluster operating system. centOS 7.2x86_64 or ubuntu 16.04.1 LTSx86_64. Default value: ubuntu 16.04.1 LTSx86_64
     * @param ClusterOs Cluster operating system. centOS 7.2x86_64 or ubuntu 16.04.1 LTSx86_64. Default value: ubuntu 16.04.1 LTSx86_64
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get Cluster type. Managed cluster: MANAGED_CLUSTER; Self-deployed cluster: INDEPENDENT_CLUSTER. 
     * @return ClusterType Cluster type. Managed cluster: MANAGED_CLUSTER; Self-deployed cluster: INDEPENDENT_CLUSTER.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Managed cluster: MANAGED_CLUSTER; Self-deployed cluster: INDEPENDENT_CLUSTER.
     * @param ClusterType Cluster type. Managed cluster: MANAGED_CLUSTER; Self-deployed cluster: INDEPENDENT_CLUSTER.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster network-related parameters 
     * @return ClusterNetworkSettings Cluster network-related parameters
     */
    public ClusterNetworkSettings getClusterNetworkSettings() {
        return this.ClusterNetworkSettings;
    }

    /**
     * Set Cluster network-related parameters
     * @param ClusterNetworkSettings Cluster network-related parameters
     */
    public void setClusterNetworkSettings(ClusterNetworkSettings ClusterNetworkSettings) {
        this.ClusterNetworkSettings = ClusterNetworkSettings;
    }

    /**
     * Get Current number of nodes in the cluster 
     * @return ClusterNodeNum Current number of nodes in the cluster
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set Current number of nodes in the cluster
     * @param ClusterNodeNum Current number of nodes in the cluster
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get ID of the project to which the cluster belongs 
     * @return ProjectId ID of the project to which the cluster belongs
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the cluster belongs
     * @param ProjectId ID of the project to which the cluster belongs
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Tag description list. 
     * @return TagSpecification Tag description list.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Tag description list.
     * @param TagSpecification Tag description list.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Cluster status. Values: `Trading` (Preparing), `Creating`, `Running`, `Deleting`, `Idling` (Idle), `Recovering`, `Scaling`, `Upgrading` (Upgrading the cluster), `WaittingForConnect` (Pending registration), `Pause` (Cluster upgrade paused), `NodeUpgrading` (Upgrading the node), `RuntimeUpgrading` (Upgrading the node runtime), `MasterScaling` (Scaling Master), `ClusterLevelUpgrading` (Adjusting cluster specification level), `ResourceIsolate` (Isolating), `ResourceIsolated` (Isolated), `ResourceReverse` (Overdue payment made. Recovering the cluster), and `Abnormal`. 
     * @return ClusterStatus Cluster status. Values: `Trading` (Preparing), `Creating`, `Running`, `Deleting`, `Idling` (Idle), `Recovering`, `Scaling`, `Upgrading` (Upgrading the cluster), `WaittingForConnect` (Pending registration), `Pause` (Cluster upgrade paused), `NodeUpgrading` (Upgrading the node), `RuntimeUpgrading` (Upgrading the node runtime), `MasterScaling` (Scaling Master), `ClusterLevelUpgrading` (Adjusting cluster specification level), `ResourceIsolate` (Isolating), `ResourceIsolated` (Isolated), `ResourceReverse` (Overdue payment made. Recovering the cluster), and `Abnormal`.
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status. Values: `Trading` (Preparing), `Creating`, `Running`, `Deleting`, `Idling` (Idle), `Recovering`, `Scaling`, `Upgrading` (Upgrading the cluster), `WaittingForConnect` (Pending registration), `Pause` (Cluster upgrade paused), `NodeUpgrading` (Upgrading the node), `RuntimeUpgrading` (Upgrading the node runtime), `MasterScaling` (Scaling Master), `ClusterLevelUpgrading` (Adjusting cluster specification level), `ResourceIsolate` (Isolating), `ResourceIsolated` (Isolated), `ResourceReverse` (Overdue payment made. Recovering the cluster), and `Abnormal`.
     * @param ClusterStatus Cluster status. Values: `Trading` (Preparing), `Creating`, `Running`, `Deleting`, `Idling` (Idle), `Recovering`, `Scaling`, `Upgrading` (Upgrading the cluster), `WaittingForConnect` (Pending registration), `Pause` (Cluster upgrade paused), `NodeUpgrading` (Upgrading the node), `RuntimeUpgrading` (Upgrading the node runtime), `MasterScaling` (Scaling Master), `ClusterLevelUpgrading` (Adjusting cluster specification level), `ResourceIsolate` (Isolating), `ResourceIsolated` (Isolated), `ResourceReverse` (Overdue payment made. Recovering the cluster), and `Abnormal`.
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Cluster attributes (including a map of different cluster attributes, with attribute fields including NodeNameType (lan-ip mode and hostname mode, with lan-ip mode as default)) 
     * @return Property Cluster attributes (including a map of different cluster attributes, with attribute fields including NodeNameType (lan-ip mode and hostname mode, with lan-ip mode as default))
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set Cluster attributes (including a map of different cluster attributes, with attribute fields including NodeNameType (lan-ip mode and hostname mode, with lan-ip mode as default))
     * @param Property Cluster attributes (including a map of different cluster attributes, with attribute fields including NodeNameType (lan-ip mode and hostname mode, with lan-ip mode as default))
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * Get Number of primary nodes currently in the cluster 
     * @return ClusterMaterNodeNum Number of primary nodes currently in the cluster
     */
    public Long getClusterMaterNodeNum() {
        return this.ClusterMaterNodeNum;
    }

    /**
     * Set Number of primary nodes currently in the cluster
     * @param ClusterMaterNodeNum Number of primary nodes currently in the cluster
     */
    public void setClusterMaterNodeNum(Long ClusterMaterNodeNum) {
        this.ClusterMaterNodeNum = ClusterMaterNodeNum;
    }

    /**
     * Get ID of the image used by the cluster
Note: this field may return null, indicating that no valid value is obtained. 
     * @return ImageId ID of the image used by the cluster
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set ID of the image used by the cluster
Note: this field may return null, indicating that no valid value is obtained.
     * @param ImageId ID of the image used by the cluster
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Container image tag
Note: This field may return null, indicating that no valid value was found. 
     * @return OsCustomizeType Container image tag
Note: This field may return null, indicating that no valid value was found.
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set Container image tag
Note: This field may return null, indicating that no valid value was found.
     * @param OsCustomizeType Container image tag
Note: This field may return null, indicating that no valid value was found.
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get Runtime environment of the cluster. Values can be `docker` or `containerd`.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return ContainerRuntime Runtime environment of the cluster. Values can be `docker` or `containerd`.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set Runtime environment of the cluster. Values can be `docker` or `containerd`.
Note: this field may return null, indicating that no valid value is obtained.
     * @param ContainerRuntime Runtime environment of the cluster. Values can be `docker` or `containerd`.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid value is obtained. 
     * @return CreatedTime Creation time
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid value is obtained.
     * @param CreatedTime Creation time
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Whether Deletion Protection is enabled
Note: this field may return null, indicating that no valid value is obtained. 
     * @return DeletionProtection Whether Deletion Protection is enabled
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Whether Deletion Protection is enabled
Note: this field may return null, indicating that no valid value is obtained.
     * @param DeletionProtection Whether Deletion Protection is enabled
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get Specifies whether the cluster supports external nodes.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return EnableExternalNode Specifies whether the cluster supports external nodes.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getEnableExternalNode() {
        return this.EnableExternalNode;
    }

    /**
     * Set Specifies whether the cluster supports external nodes.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param EnableExternalNode Specifies whether the cluster supports external nodes.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEnableExternalNode(Boolean EnableExternalNode) {
        this.EnableExternalNode = EnableExternalNode;
    }

    /**
     * Get Cluster models. It’s valid for managed clusters.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterLevel Cluster models. It’s valid for managed clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set Cluster models. It’s valid for managed clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterLevel Cluster models. It’s valid for managed clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get The target cluster model for auto-upgrade
Note: this field may return null, indicating that no valid value is obtained. 
     * @return AutoUpgradeClusterLevel The target cluster model for auto-upgrade
Note: this field may return null, indicating that no valid value is obtained.
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set The target cluster model for auto-upgrade
Note: this field may return null, indicating that no valid value is obtained.
     * @param AutoUpgradeClusterLevel The target cluster model for auto-upgrade
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get Whether to enable qGPU Sharing
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return QGPUShareEnable Whether to enable qGPU Sharing
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set Whether to enable qGPU Sharing
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param QGPUShareEnable Whether to enable qGPU Sharing
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    /**
     * Get Runtime version
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuntimeVersion Runtime version
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set Runtime version
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuntimeVersion Runtime version
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get Number of current etcd in the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterEtcdNodeNum Number of current etcd in the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getClusterEtcdNodeNum() {
        return this.ClusterEtcdNodeNum;
    }

    /**
     * Set Number of current etcd in the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterEtcdNodeNum Number of current etcd in the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterEtcdNodeNum(Long ClusterEtcdNodeNum) {
        this.ClusterEtcdNodeNum = ClusterEtcdNodeNum;
    }

    /**
     * Get CDC Id
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return CdcId CDC Id
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC Id
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param CdcId CDC Id
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDescription != null) {
            this.ClusterDescription = new String(source.ClusterDescription);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterNetworkSettings != null) {
            this.ClusterNetworkSettings = new ClusterNetworkSettings(source.ClusterNetworkSettings);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
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
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
        if (source.ClusterMaterNodeNum != null) {
            this.ClusterMaterNodeNum = new Long(source.ClusterMaterNodeNum);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.EnableExternalNode != null) {
            this.EnableExternalNode = new Boolean(source.EnableExternalNode);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new Boolean(source.AutoUpgradeClusterLevel);
        }
        if (source.QGPUShareEnable != null) {
            this.QGPUShareEnable = new Boolean(source.QGPUShareEnable);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.ClusterEtcdNodeNum != null) {
            this.ClusterEtcdNodeNum = new Long(source.ClusterEtcdNodeNum);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamObj(map, prefix + "ClusterNetworkSettings.", this.ClusterNetworkSettings);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "Property", this.Property);
        this.setParamSimple(map, prefix + "ClusterMaterNodeNum", this.ClusterMaterNodeNum);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "EnableExternalNode", this.EnableExternalNode);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "QGPUShareEnable", this.QGPUShareEnable);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "ClusterEtcdNodeNum", this.ClusterEtcdNodeNum);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

