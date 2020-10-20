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

public class Cluster extends AbstractModel{

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
    * Cluster status (Running, Creating, or Abnormal)
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
     * Get Cluster status (Running, Creating, or Abnormal) 
     * @return ClusterStatus Cluster status (Running, Creating, or Abnormal)
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status (Running, Creating, or Abnormal)
     * @param ClusterStatus Cluster status (Running, Creating, or Abnormal)
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

    }
}

