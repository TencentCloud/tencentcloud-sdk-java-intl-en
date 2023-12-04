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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostInfo extends AbstractModel {

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Server IP, which is the private IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Project
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Docker version
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * Docker file system type
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * Number of images
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * Number of containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Agent status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether it is Containerd
    */
    @SerializedName("IsContainerd")
    @Expose
    private Boolean IsContainerd;

    /**
    * Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Server instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Region ID
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * Project
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Project")
    @Expose
    private ProjectInfo Project;

    /**
    * Tags
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 
    */
    @SerializedName("ClusterAccessedStatus")
    @Expose
    private String ClusterAccessedStatus;

    /**
     * Get Server ID 
     * @return HostID Server ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server ID
     * @param HostID Server ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Server IP, which is the private IP 
     * @return HostIP Server IP, which is the private IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP, which is the private IP
     * @param HostIP Server IP, which is the private IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Project 
     * @return Group Project
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Project
     * @param Group Project
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Docker version 
     * @return DockerVersion Docker version
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set Docker version
     * @param DockerVersion Docker version
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get Docker file system type 
     * @return DockerFileSystemDriver Docker file system type
     */
    public String getDockerFileSystemDriver() {
        return this.DockerFileSystemDriver;
    }

    /**
     * Set Docker file system type
     * @param DockerFileSystemDriver Docker file system type
     */
    public void setDockerFileSystemDriver(String DockerFileSystemDriver) {
        this.DockerFileSystemDriver = DockerFileSystemDriver;
    }

    /**
     * Get Number of images 
     * @return ImageCnt Number of images
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set Number of images
     * @param ImageCnt Number of images
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get Number of containers 
     * @return ContainerCnt Number of containers
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set Number of containers
     * @param ContainerCnt Number of containers
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get Agent status 
     * @return Status Agent status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status
     * @param Status Agent status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether it is Containerd 
     * @return IsContainerd Whether it is Containerd
     */
    public Boolean getIsContainerd() {
        return this.IsContainerd;
    }

    /**
     * Set Whether it is Containerd
     * @param IsContainerd Whether it is Containerd
     */
    public void setIsContainerd(Boolean IsContainerd) {
        this.IsContainerd = IsContainerd;
    }

    /**
     * Get Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances. 
     * @return MachineType Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
     * @param MachineType Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Server instance ID 
     * @return InstanceID Server instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Server instance ID
     * @param InstanceID Server instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Region ID 
     * @return RegionID Region ID
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set Region ID
     * @param RegionID Region ID
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get Project
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Project Project
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ProjectInfo getProject() {
        return this.Project;
    }

    /**
     * Set Project
Note: This field may return `null`, indicating that no valid value was found.
     * @param Project Project
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setProject(ProjectInfo Project) {
        this.Project = Project;
    }

    /**
     * Get Tags
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tags
Note: This field may return `null`, indicating that no valid value was found.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tags
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get  
     * @return ClusterName 
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 
     * @param ClusterName 
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get  
     * @return ClusterAccessedStatus 
     */
    public String getClusterAccessedStatus() {
        return this.ClusterAccessedStatus;
    }

    /**
     * Set 
     * @param ClusterAccessedStatus 
     */
    public void setClusterAccessedStatus(String ClusterAccessedStatus) {
        this.ClusterAccessedStatus = ClusterAccessedStatus;
    }

    public HostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostInfo(HostInfo source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.DockerFileSystemDriver != null) {
            this.DockerFileSystemDriver = new String(source.DockerFileSystemDriver);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsContainerd != null) {
            this.IsContainerd = new Boolean(source.IsContainerd);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.Project != null) {
            this.Project = new ProjectInfo(source.Project);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterAccessedStatus != null) {
            this.ClusterAccessedStatus = new String(source.ClusterAccessedStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "DockerFileSystemDriver", this.DockerFileSystemDriver);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsContainerd", this.IsContainerd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterAccessedStatus", this.ClusterAccessedStatus);

    }
}

