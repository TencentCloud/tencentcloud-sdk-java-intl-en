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

public class DescribeAssetHostDetailResponse extends AbstractModel {

    /**
    * TCSS UUID
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Server IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * OS
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Agent version
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * Kernel version
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Docker version
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * Docker API version
    */
    @SerializedName("DockerAPIVersion")
    @Expose
    private String DockerAPIVersion;

    /**
    * Docker version for Go
    */
    @SerializedName("DockerGoVersion")
    @Expose
    private String DockerGoVersion;

    /**
    * Docker file system type
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * Docker root directory
    */
    @SerializedName("DockerRootDir")
    @Expose
    private String DockerRootDir;

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
    * K8s IP
    */
    @SerializedName("K8sMasterIP")
    @Expose
    private String K8sMasterIP;

    /**
    * K8s version
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * kube proxy
    */
    @SerializedName("KubeProxyVersion")
    @Expose
    private String KubeProxyVersion;

    /**
    * Valid values: `UNINSTALL` (not installed); `OFFLINE` (offline); `ONLINE` (defended).
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
    * Server source. Valid values: `TENCENTCLOUD` (Tencent Cloud instance); `OTHERCLOUD` (non-Tencent Cloud instance).
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
    */
    @SerializedName("Project")
    @Expose
    private ProjectInfo Project;

    /**
    * Tags
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TCSS UUID 
     * @return UUID TCSS UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set TCSS UUID
     * @param UUID TCSS UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get Server group 
     * @return Group Server group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Server group
     * @param Group Server group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Server IP 
     * @return HostIP Server IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP
     * @param HostIP Server IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get OS 
     * @return OsName OS
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set OS
     * @param OsName OS
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Agent version 
     * @return AgentVersion Agent version
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set Agent version
     * @param AgentVersion Agent version
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get Kernel version 
     * @return KernelVersion Kernel version
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set Kernel version
     * @param KernelVersion Kernel version
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
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
     * Get Docker API version 
     * @return DockerAPIVersion Docker API version
     */
    public String getDockerAPIVersion() {
        return this.DockerAPIVersion;
    }

    /**
     * Set Docker API version
     * @param DockerAPIVersion Docker API version
     */
    public void setDockerAPIVersion(String DockerAPIVersion) {
        this.DockerAPIVersion = DockerAPIVersion;
    }

    /**
     * Get Docker version for Go 
     * @return DockerGoVersion Docker version for Go
     */
    public String getDockerGoVersion() {
        return this.DockerGoVersion;
    }

    /**
     * Set Docker version for Go
     * @param DockerGoVersion Docker version for Go
     */
    public void setDockerGoVersion(String DockerGoVersion) {
        this.DockerGoVersion = DockerGoVersion;
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
     * Get Docker root directory 
     * @return DockerRootDir Docker root directory
     */
    public String getDockerRootDir() {
        return this.DockerRootDir;
    }

    /**
     * Set Docker root directory
     * @param DockerRootDir Docker root directory
     */
    public void setDockerRootDir(String DockerRootDir) {
        this.DockerRootDir = DockerRootDir;
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
     * Get K8s IP 
     * @return K8sMasterIP K8s IP
     */
    public String getK8sMasterIP() {
        return this.K8sMasterIP;
    }

    /**
     * Set K8s IP
     * @param K8sMasterIP K8s IP
     */
    public void setK8sMasterIP(String K8sMasterIP) {
        this.K8sMasterIP = K8sMasterIP;
    }

    /**
     * Get K8s version 
     * @return K8sVersion K8s version
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set K8s version
     * @param K8sVersion K8s version
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get kube proxy 
     * @return KubeProxyVersion kube proxy
     */
    public String getKubeProxyVersion() {
        return this.KubeProxyVersion;
    }

    /**
     * Set kube proxy
     * @param KubeProxyVersion kube proxy
     */
    public void setKubeProxyVersion(String KubeProxyVersion) {
        this.KubeProxyVersion = KubeProxyVersion;
    }

    /**
     * Get Valid values: `UNINSTALL` (not installed); `OFFLINE` (offline); `ONLINE` (defended). 
     * @return Status Valid values: `UNINSTALL` (not installed); `OFFLINE` (offline); `ONLINE` (defended).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Valid values: `UNINSTALL` (not installed); `OFFLINE` (offline); `ONLINE` (defended).
     * @param Status Valid values: `UNINSTALL` (not installed); `OFFLINE` (offline); `ONLINE` (defended).
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
     * Get Server source. Valid values: `TENCENTCLOUD` (Tencent Cloud instance); `OTHERCLOUD` (non-Tencent Cloud instance). 
     * @return MachineType Server source. Valid values: `TENCENTCLOUD` (Tencent Cloud instance); `OTHERCLOUD` (non-Tencent Cloud instance).
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server source. Valid values: `TENCENTCLOUD` (Tencent Cloud instance); `OTHERCLOUD` (non-Tencent Cloud instance).
     * @param MachineType Server source. Valid values: `TENCENTCLOUD` (Tencent Cloud instance); `OTHERCLOUD` (non-Tencent Cloud instance).
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
     * @return Project Project
     */
    public ProjectInfo getProject() {
        return this.Project;
    }

    /**
     * Set Project
     * @param Project Project
     */
    public void setProject(ProjectInfo Project) {
        this.Project = Project;
    }

    /**
     * Get Tags 
     * @return Tags Tags
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags
     * @param Tags Tags
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetHostDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetHostDetailResponse(DescribeAssetHostDetailResponse source) {
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.DockerAPIVersion != null) {
            this.DockerAPIVersion = new String(source.DockerAPIVersion);
        }
        if (source.DockerGoVersion != null) {
            this.DockerGoVersion = new String(source.DockerGoVersion);
        }
        if (source.DockerFileSystemDriver != null) {
            this.DockerFileSystemDriver = new String(source.DockerFileSystemDriver);
        }
        if (source.DockerRootDir != null) {
            this.DockerRootDir = new String(source.DockerRootDir);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.K8sMasterIP != null) {
            this.K8sMasterIP = new String(source.K8sMasterIP);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.KubeProxyVersion != null) {
            this.KubeProxyVersion = new String(source.KubeProxyVersion);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "DockerAPIVersion", this.DockerAPIVersion);
        this.setParamSimple(map, prefix + "DockerGoVersion", this.DockerGoVersion);
        this.setParamSimple(map, prefix + "DockerFileSystemDriver", this.DockerFileSystemDriver);
        this.setParamSimple(map, prefix + "DockerRootDir", this.DockerRootDir);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "K8sMasterIP", this.K8sMasterIP);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "KubeProxyVersion", this.KubeProxyVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsContainerd", this.IsContainerd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

