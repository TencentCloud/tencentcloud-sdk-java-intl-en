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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspEventDetail extends AbstractModel {

    /**
    * Vulnerability Event ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Machine QUuid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Asset tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostTags")
    @Expose
    private String [] HostTags;

    /**
    * First Attack Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * Application attack type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackTypeName")
    @Expose
    private String AttackTypeName;

    /**
    * Application Attack Type id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackType")
    @Expose
    private Long AttackType;

    /**
    * Request URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Attack count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * City of the attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Port under attack
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackPort")
    @Expose
    private Long AttackPort;

    /**
    * Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Repair method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Request content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkPayload")
    @Expose
    private String NetworkPayload;

    /**
    * Node name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Container name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * container id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Container running status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Pod name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Process id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Associated Process Main Class Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * Stack information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StackTrace")
    @Expose
    private String StackTrace;

    /**
    * Vulnerability ID-Related Event Details (JSON array format, unique to RASP)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RaspDetail")
    @Expose
    private String RaspDetail;

    /**
    * Intrusion Status: 1 Attack Event, 2 Successful Defense
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
     * Get Vulnerability Event ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Vulnerability Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Vulnerability Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Machine QUuid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Machine QUuid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine QUuid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Machine QUuid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Alias host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Alias host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Private IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIp Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateIp Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Asset tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostTags Asset tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getHostTags() {
        return this.HostTags;
    }

    /**
     * Set Asset tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostTags Asset tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostTags(String [] HostTags) {
        this.HostTags = HostTags;
    }

    /**
     * Get First Attack Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime First Attack Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First Attack Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime First Attack Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last attack time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MergeTime Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MergeTime Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get Application attack type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackTypeName Application attack type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackTypeName() {
        return this.AttackTypeName;
    }

    /**
     * Set Application attack type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackTypeName Application attack type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackTypeName(String AttackTypeName) {
        this.AttackTypeName = AttackTypeName;
    }

    /**
     * Get Application Attack Type id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackType Application Attack Type id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Application Attack Type id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackType Application Attack Type id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackType(Long AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Request URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Request URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Request URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Request URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Attack count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Attack count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Attack count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Attack count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get CVE ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CveId CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CveId CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get Attack source IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceIp Attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceIp Attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get City of the attack source IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return City City of the attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City of the attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param City City of the attack source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Port under attack
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackPort Port under attack
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackPort() {
        return this.AttackPort;
    }

    /**
     * Set Port under attack
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackPort Port under attack
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackPort(Long AttackPort) {
        this.AttackPort = AttackPort;
    }

    /**
     * Get Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Vulnerability description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Repair method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fix Repair method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Repair method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fix Repair method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Request content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkPayload Request content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkPayload() {
        return this.NetworkPayload;
    }

    /**
     * Set Request content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkPayload Request content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkPayload(String NetworkPayload) {
        this.NetworkPayload = NetworkPayload;
    }

    /**
     * Get Node name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeName Node name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeName Node name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeId Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeId Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Container name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerName Container name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerName Container name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get container id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerId container id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set container id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerId container id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Container running status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerStatus Container running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container running status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerStatus Container running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get Container isolation status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerNetStatus Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerNetStatus Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get Image ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageId Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageId Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageName Image Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageName Image Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Pod name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodName Pod name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodName Pod name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodIp podip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodIp podip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Cluster name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterName Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Process id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pid Process id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pid Process id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Associated Process Main Class Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MainClass Associated Process Main Class Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Associated Process Main Class Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MainClass Associated Process Main Class Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get Stack information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StackTrace Stack information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStackTrace() {
        return this.StackTrace;
    }

    /**
     * Set Stack information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StackTrace Stack information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStackTrace(String StackTrace) {
        this.StackTrace = StackTrace;
    }

    /**
     * Get Vulnerability ID-Related Event Details (JSON array format, unique to RASP)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RaspDetail Vulnerability ID-Related Event Details (JSON array format, unique to RASP)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRaspDetail() {
        return this.RaspDetail;
    }

    /**
     * Set Vulnerability ID-Related Event Details (JSON array format, unique to RASP)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RaspDetail Vulnerability ID-Related Event Details (JSON array format, unique to RASP)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRaspDetail(String RaspDetail) {
        this.RaspDetail = RaspDetail;
    }

    /**
     * Get Intrusion Status: 1 Attack Event, 2 Successful Defense 
     * @return EventType Intrusion Status: 1 Attack Event, 2 Successful Defense
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Intrusion Status: 1 Attack Event, 2 Successful Defense
     * @param EventType Intrusion Status: 1 Attack Event, 2 Successful Defense
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    public RaspEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspEventDetail(RaspEventDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.HostTags != null) {
            this.HostTags = new String[source.HostTags.length];
            for (int i = 0; i < source.HostTags.length; i++) {
                this.HostTags[i] = new String(source.HostTags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.AttackTypeName != null) {
            this.AttackTypeName = new String(source.AttackTypeName);
        }
        if (source.AttackType != null) {
            this.AttackType = new Long(source.AttackType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.AttackPort != null) {
            this.AttackPort = new Long(source.AttackPort);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.NetworkPayload != null) {
            this.NetworkPayload = new String(source.NetworkPayload);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.StackTrace != null) {
            this.StackTrace = new String(source.StackTrace);
        }
        if (source.RaspDetail != null) {
            this.RaspDetail = new String(source.RaspDetail);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamArraySimple(map, prefix + "HostTags.", this.HostTags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "AttackTypeName", this.AttackTypeName);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AttackPort", this.AttackPort);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "NetworkPayload", this.NetworkPayload);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "StackTrace", this.StackTrace);
        this.setParamSimple(map, prefix + "RaspDetail", this.RaspDetail);
        this.setParamSimple(map, prefix + "EventType", this.EventType);

    }
}

