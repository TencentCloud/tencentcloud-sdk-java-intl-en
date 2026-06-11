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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostInfo extends AbstractModel {

    /**
    * <p>Host ID.</p>
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * <p>Host IP address, which is the private IP address.</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>Business group.</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>Docker version.</p>
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * <p>Docker file system type.</p>
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * <p>Number of images.</p>
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * <p>Number of containers.</p>
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * <p>Agent running status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Whether it is containerd.</p>
    */
    @SerializedName("IsContainerd")
    @Expose
    private Boolean IsContainerd;

    /**
    * <p>Server source: one of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server;</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>Public IP address.</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Host UUID.</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * <p>Project.</p>
    */
    @SerializedName("Project")
    @Expose
    private ProjectInfo Project;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster access status.</p>
    */
    @SerializedName("ClusterAccessedStatus")
    @Expose
    private String ClusterAccessedStatus;

    /**
    * <p>Cluster access sub-status.</p><p>Enumeration values:</p><ul><li>AccessedSubNone: none</li><li>AccessedSubUninstallException: uninstallation exception</li><li>AccessedSubTimeout: access timeout</li><li>AccessedSubUninstallTimeout: uninstallation timeout</li><li>AccessedSubResourceException: cluster component check exception, including Deployment and DaemonSet</li><li>AccessedSubCAMPermissionDenied: insufficient CAM permissions</li></ul>
    */
    @SerializedName("ClusterAccessedSubStatus")
    @Expose
    private String ClusterAccessedSubStatus;

    /**
    * <p>Detailed description of the failure reason.</p>
    */
    @SerializedName("ClusterAccessedErrorReason")
    @Expose
    private String ClusterAccessedErrorReason;

    /**
    * <p>Billable cores.</p>
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * <p>Protection status:<br>Defended<br>Undefended</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>Number of cores.</p>
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * <p>Last online time.</p>
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
     * Get <p>Host ID.</p> 
     * @return HostID <p>Host ID.</p>
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set <p>Host ID.</p>
     * @param HostID <p>Host ID.</p>
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get <p>Host IP address, which is the private IP address.</p> 
     * @return HostIP <p>Host IP address, which is the private IP address.</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>Host IP address, which is the private IP address.</p>
     * @param HostIP <p>Host IP address, which is the private IP address.</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>Host name.</p> 
     * @return HostName <p>Host name.</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>Host name.</p>
     * @param HostName <p>Host name.</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>Business group.</p> 
     * @return Group <p>Business group.</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>Business group.</p>
     * @param Group <p>Business group.</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>Docker version.</p> 
     * @return DockerVersion <p>Docker version.</p>
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set <p>Docker version.</p>
     * @param DockerVersion <p>Docker version.</p>
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get <p>Docker file system type.</p> 
     * @return DockerFileSystemDriver <p>Docker file system type.</p>
     */
    public String getDockerFileSystemDriver() {
        return this.DockerFileSystemDriver;
    }

    /**
     * Set <p>Docker file system type.</p>
     * @param DockerFileSystemDriver <p>Docker file system type.</p>
     */
    public void setDockerFileSystemDriver(String DockerFileSystemDriver) {
        this.DockerFileSystemDriver = DockerFileSystemDriver;
    }

    /**
     * Get <p>Number of images.</p> 
     * @return ImageCnt <p>Number of images.</p>
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set <p>Number of images.</p>
     * @param ImageCnt <p>Number of images.</p>
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get <p>Number of containers.</p> 
     * @return ContainerCnt <p>Number of containers.</p>
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set <p>Number of containers.</p>
     * @param ContainerCnt <p>Number of containers.</p>
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get <p>Agent running status.</p> 
     * @return Status <p>Agent running status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Agent running status.</p>
     * @param Status <p>Agent running status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Whether it is containerd.</p> 
     * @return IsContainerd <p>Whether it is containerd.</p>
     */
    public Boolean getIsContainerd() {
        return this.IsContainerd;
    }

    /**
     * Set <p>Whether it is containerd.</p>
     * @param IsContainerd <p>Whether it is containerd.</p>
     */
    public void setIsContainerd(Boolean IsContainerd) {
        this.IsContainerd = IsContainerd;
    }

    /**
     * Get <p>Server source: one of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server;</p> 
     * @return MachineType <p>Server source: one of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server;</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>Server source: one of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server;</p>
     * @param MachineType <p>Server source: one of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server;</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>Public IP address.</p> 
     * @return PublicIp <p>Public IP address.</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public IP address.</p>
     * @param PublicIp <p>Public IP address.</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Host UUID.</p> 
     * @return Uuid <p>Host UUID.</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Host UUID.</p>
     * @param Uuid <p>Host UUID.</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceID <p>Host instance ID.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceID <p>Host instance ID.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Region ID.</p> 
     * @return RegionID <p>Region ID.</p>
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set <p>Region ID.</p>
     * @param RegionID <p>Region ID.</p>
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get <p>Project.</p> 
     * @return Project <p>Project.</p>
     */
    public ProjectInfo getProject() {
        return this.Project;
    }

    /**
     * Set <p>Project.</p>
     * @param Project <p>Project.</p>
     */
    public void setProject(ProjectInfo Project) {
        this.Project = Project;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterID <p>Cluster ID.</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterID <p>Cluster ID.</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
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

    /**
     * Get <p>Cluster access status.</p> 
     * @return ClusterAccessedStatus <p>Cluster access status.</p>
     */
    public String getClusterAccessedStatus() {
        return this.ClusterAccessedStatus;
    }

    /**
     * Set <p>Cluster access status.</p>
     * @param ClusterAccessedStatus <p>Cluster access status.</p>
     */
    public void setClusterAccessedStatus(String ClusterAccessedStatus) {
        this.ClusterAccessedStatus = ClusterAccessedStatus;
    }

    /**
     * Get <p>Cluster access sub-status.</p><p>Enumeration values:</p><ul><li>AccessedSubNone: none</li><li>AccessedSubUninstallException: uninstallation exception</li><li>AccessedSubTimeout: access timeout</li><li>AccessedSubUninstallTimeout: uninstallation timeout</li><li>AccessedSubResourceException: cluster component check exception, including Deployment and DaemonSet</li><li>AccessedSubCAMPermissionDenied: insufficient CAM permissions</li></ul> 
     * @return ClusterAccessedSubStatus <p>Cluster access sub-status.</p><p>Enumeration values:</p><ul><li>AccessedSubNone: none</li><li>AccessedSubUninstallException: uninstallation exception</li><li>AccessedSubTimeout: access timeout</li><li>AccessedSubUninstallTimeout: uninstallation timeout</li><li>AccessedSubResourceException: cluster component check exception, including Deployment and DaemonSet</li><li>AccessedSubCAMPermissionDenied: insufficient CAM permissions</li></ul>
     */
    public String getClusterAccessedSubStatus() {
        return this.ClusterAccessedSubStatus;
    }

    /**
     * Set <p>Cluster access sub-status.</p><p>Enumeration values:</p><ul><li>AccessedSubNone: none</li><li>AccessedSubUninstallException: uninstallation exception</li><li>AccessedSubTimeout: access timeout</li><li>AccessedSubUninstallTimeout: uninstallation timeout</li><li>AccessedSubResourceException: cluster component check exception, including Deployment and DaemonSet</li><li>AccessedSubCAMPermissionDenied: insufficient CAM permissions</li></ul>
     * @param ClusterAccessedSubStatus <p>Cluster access sub-status.</p><p>Enumeration values:</p><ul><li>AccessedSubNone: none</li><li>AccessedSubUninstallException: uninstallation exception</li><li>AccessedSubTimeout: access timeout</li><li>AccessedSubUninstallTimeout: uninstallation timeout</li><li>AccessedSubResourceException: cluster component check exception, including Deployment and DaemonSet</li><li>AccessedSubCAMPermissionDenied: insufficient CAM permissions</li></ul>
     */
    public void setClusterAccessedSubStatus(String ClusterAccessedSubStatus) {
        this.ClusterAccessedSubStatus = ClusterAccessedSubStatus;
    }

    /**
     * Get <p>Detailed description of the failure reason.</p> 
     * @return ClusterAccessedErrorReason <p>Detailed description of the failure reason.</p>
     */
    public String getClusterAccessedErrorReason() {
        return this.ClusterAccessedErrorReason;
    }

    /**
     * Set <p>Detailed description of the failure reason.</p>
     * @param ClusterAccessedErrorReason <p>Detailed description of the failure reason.</p>
     */
    public void setClusterAccessedErrorReason(String ClusterAccessedErrorReason) {
        this.ClusterAccessedErrorReason = ClusterAccessedErrorReason;
    }

    /**
     * Get <p>Billable cores.</p> 
     * @return ChargeCoresCnt <p>Billable cores.</p>
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set <p>Billable cores.</p>
     * @param ChargeCoresCnt <p>Billable cores.</p>
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get <p>Protection status:<br>Defended<br>Undefended</p> 
     * @return DefendStatus <p>Protection status:<br>Defended<br>Undefended</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>Protection status:<br>Defended<br>Undefended</p>
     * @param DefendStatus <p>Protection status:<br>Defended<br>Undefended</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>Number of cores.</p> 
     * @return CoresCnt <p>Number of cores.</p>
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set <p>Number of cores.</p>
     * @param CoresCnt <p>Number of cores.</p>
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get <p>Last online time.</p> 
     * @return LastOnlineTime <p>Last online time.</p>
     */
    public String getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set <p>Last online time.</p>
     * @param LastOnlineTime <p>Last online time.</p>
     */
    public void setLastOnlineTime(String LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
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
        if (source.ClusterAccessedSubStatus != null) {
            this.ClusterAccessedSubStatus = new String(source.ClusterAccessedSubStatus);
        }
        if (source.ClusterAccessedErrorReason != null) {
            this.ClusterAccessedErrorReason = new String(source.ClusterAccessedErrorReason);
        }
        if (source.ChargeCoresCnt != null) {
            this.ChargeCoresCnt = new Long(source.ChargeCoresCnt);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
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
        this.setParamSimple(map, prefix + "ClusterAccessedSubStatus", this.ClusterAccessedSubStatus);
        this.setParamSimple(map, prefix + "ClusterAccessedErrorReason", this.ClusterAccessedErrorReason);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);

    }
}

