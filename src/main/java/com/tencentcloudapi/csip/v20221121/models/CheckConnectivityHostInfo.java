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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckConnectivityHostInfo extends AbstractModel {

    /**
    * <p>Host ID.</p>
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * <p>Host ip address</p>
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * <p>host name</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>docker version</p>
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * <p>docker file system type</p>
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Whether it is a container.</p>
    */
    @SerializedName("IsContainerd")
    @Expose
    private Boolean IsContainerd;

    /**
    * <p>Specific host types.</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>Public ip address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Host UUID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>id of the region where the host is located</p>
    */
    @SerializedName("HostRegionId")
    @Expose
    private Long HostRegionId;

    /**
    * <p>Host region</p>
    */
    @SerializedName("HostRegion")
    @Expose
    private String HostRegion;

    /**
    * <p>Cluster belonging project</p>
    */
    @SerializedName("Project")
    @Expose
    private ProjectInfo Project;

    /**
    * <p>Cluster tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>Host ID.</p> 
     * @return HostId <p>Host ID.</p>
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set <p>Host ID.</p>
     * @param HostId <p>Host ID.</p>
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get <p>Host ip address</p> 
     * @return HostIp <p>Host ip address</p>
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set <p>Host ip address</p>
     * @param HostIp <p>Host ip address</p>
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get <p>host name</p> 
     * @return HostName <p>host name</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>host name</p>
     * @param HostName <p>host name</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>docker version</p> 
     * @return DockerVersion <p>docker version</p>
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set <p>docker version</p>
     * @param DockerVersion <p>docker version</p>
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get <p>docker file system type</p> 
     * @return DockerFileSystemDriver <p>docker file system type</p>
     */
    public String getDockerFileSystemDriver() {
        return this.DockerFileSystemDriver;
    }

    /**
     * Set <p>docker file system type</p>
     * @param DockerFileSystemDriver <p>docker file system type</p>
     */
    public void setDockerFileSystemDriver(String DockerFileSystemDriver) {
        this.DockerFileSystemDriver = DockerFileSystemDriver;
    }

    /**
     * Get <p>Status.</p> 
     * @return Status <p>Status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.</p>
     * @param Status <p>Status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Whether it is a container.</p> 
     * @return IsContainerd <p>Whether it is a container.</p>
     */
    public Boolean getIsContainerd() {
        return this.IsContainerd;
    }

    /**
     * Set <p>Whether it is a container.</p>
     * @param IsContainerd <p>Whether it is a container.</p>
     */
    public void setIsContainerd(Boolean IsContainerd) {
        this.IsContainerd = IsContainerd;
    }

    /**
     * Get <p>Specific host types.</p> 
     * @return MachineType <p>Specific host types.</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>Specific host types.</p>
     * @param MachineType <p>Specific host types.</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>Public ip address</p> 
     * @return PublicIp <p>Public ip address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public ip address</p>
     * @param PublicIp <p>Public ip address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Host UUID</p> 
     * @return Uuid <p>Host UUID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Host UUID</p>
     * @param Uuid <p>Host UUID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>id of the region where the host is located</p> 
     * @return HostRegionId <p>id of the region where the host is located</p>
     */
    public Long getHostRegionId() {
        return this.HostRegionId;
    }

    /**
     * Set <p>id of the region where the host is located</p>
     * @param HostRegionId <p>id of the region where the host is located</p>
     */
    public void setHostRegionId(Long HostRegionId) {
        this.HostRegionId = HostRegionId;
    }

    /**
     * Get <p>Host region</p> 
     * @return HostRegion <p>Host region</p>
     */
    public String getHostRegion() {
        return this.HostRegion;
    }

    /**
     * Set <p>Host region</p>
     * @param HostRegion <p>Host region</p>
     */
    public void setHostRegion(String HostRegion) {
        this.HostRegion = HostRegion;
    }

    /**
     * Get <p>Cluster belonging project</p> 
     * @return Project <p>Cluster belonging project</p>
     */
    public ProjectInfo getProject() {
        return this.Project;
    }

    /**
     * Set <p>Cluster belonging project</p>
     * @param Project <p>Cluster belonging project</p>
     */
    public void setProject(ProjectInfo Project) {
        this.Project = Project;
    }

    /**
     * Get <p>Cluster tag</p> 
     * @return Tags <p>Cluster tag</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Cluster tag</p>
     * @param Tags <p>Cluster tag</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public CheckConnectivityHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckConnectivityHostInfo(CheckConnectivityHostInfo source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.DockerFileSystemDriver != null) {
            this.DockerFileSystemDriver = new String(source.DockerFileSystemDriver);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HostRegionId != null) {
            this.HostRegionId = new Long(source.HostRegionId);
        }
        if (source.HostRegion != null) {
            this.HostRegion = new String(source.HostRegion);
        }
        if (source.Project != null) {
            this.Project = new ProjectInfo(source.Project);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "DockerFileSystemDriver", this.DockerFileSystemDriver);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsContainerd", this.IsContainerd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HostRegionId", this.HostRegionId);
        this.setParamSimple(map, prefix + "HostRegion", this.HostRegion);
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

