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

public class RaspEvent extends AbstractModel {

    /**
    * Vulnerability Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Machine UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Machine QUuid.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * host name
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * CVE ID
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Attack source IP address
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * City of the attack source IP address
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Port under attack
    */
    @SerializedName("AttackPort")
    @Expose
    private Long AttackPort;

    /**
    * First Attack Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last attack time
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * Attack count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Application attack type
    */
    @SerializedName("AttackTypeName")
    @Expose
    private String AttackTypeName;

    /**
    * Application Attack Type id
    */
    @SerializedName("AttackType")
    @Expose
    private Long AttackType;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * container id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Container running status
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * Container isolation status
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image Name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Event details, including poc
    */
    @SerializedName("RaspDetail")
    @Expose
    private String RaspDetail;

    /**
    * regular node: NORMAL
Super node: SUPER
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Event Type 1: Attack Time 2: Successful Defense
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Unique id of a super node
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * poc id
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Request URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * malicious feature
    */
    @SerializedName("Poc")
    @Expose
    private String Poc;

    /**
     * Get Vulnerability Event ID 
     * @return Id Vulnerability Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability Event ID
     * @param Id Vulnerability Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Machine UUID 
     * @return Uuid Machine UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Machine UUID
     * @param Uuid Machine UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Machine QUuid. 
     * @return Quuid Machine QUuid.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine QUuid.
     * @param Quuid Machine QUuid.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get host name 
     * @return Alias host name
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set host name
     * @param Alias host name
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get CVE ID 
     * @return CveId CVE ID
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE ID
     * @param CveId CVE ID
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get Attack source IP address 
     * @return SourceIp Attack source IP address
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Attack source IP address
     * @param SourceIp Attack source IP address
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get City of the attack source IP address 
     * @return City City of the attack source IP address
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City of the attack source IP address
     * @param City City of the attack source IP address
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Port under attack 
     * @return AttackPort Port under attack
     */
    public Long getAttackPort() {
        return this.AttackPort;
    }

    /**
     * Set Port under attack
     * @param AttackPort Port under attack
     */
    public void setAttackPort(Long AttackPort) {
        this.AttackPort = AttackPort;
    }

    /**
     * Get First Attack Time 
     * @return CreateTime First Attack Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First Attack Time
     * @param CreateTime First Attack Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last attack time 
     * @return MergeTime Last attack time
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Last attack time
     * @param MergeTime Last attack time
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get Attack count 
     * @return Count Attack count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Attack count
     * @param Count Attack count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted 
     * @return Status Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
     * @param Status Status 0: pending 1: defended 2: processed 3: ignored 4: deleted 5: allowlisted
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Application attack type 
     * @return AttackTypeName Application attack type
     */
    public String getAttackTypeName() {
        return this.AttackTypeName;
    }

    /**
     * Set Application attack type
     * @param AttackTypeName Application attack type
     */
    public void setAttackTypeName(String AttackTypeName) {
        this.AttackTypeName = AttackTypeName;
    }

    /**
     * Get Application Attack Type id 
     * @return AttackType Application Attack Type id
     */
    public Long getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Application Attack Type id
     * @param AttackType Application Attack Type id
     */
    public void setAttackType(Long AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Node name. 
     * @return NodeName Node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
     * @param NodeName Node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get container id 
     * @return ContainerId container id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set container id
     * @param ContainerId container id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Container running status 
     * @return ContainerStatus Container running status
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container running status
     * @param ContainerStatus Container running status
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get Container isolation status 
     * @return ContainerNetStatus Container isolation status
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Container isolation status
     * @param ContainerNetStatus Container isolation status
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image Name 
     * @return ImageName Image Name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image Name
     * @param ImageName Image Name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Pod name 
     * @return PodName Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
     * @param PodName Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip 
     * @return PodIp podip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
     * @param PodIp podip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Event details, including poc 
     * @return RaspDetail Event details, including poc
     */
    public String getRaspDetail() {
        return this.RaspDetail;
    }

    /**
     * Set Event details, including poc
     * @param RaspDetail Event details, including poc
     */
    public void setRaspDetail(String RaspDetail) {
        this.RaspDetail = RaspDetail;
    }

    /**
     * Get regular node: NORMAL
Super node: SUPER 
     * @return NodeType regular node: NORMAL
Super node: SUPER
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set regular node: NORMAL
Super node: SUPER
     * @param NodeType regular node: NORMAL
Super node: SUPER
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Event Type 1: Attack Time 2: Successful Defense 
     * @return EventType Event Type 1: Attack Time 2: Successful Defense
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Event Type 1: Attack Time 2: Successful Defense
     * @param EventType Event Type 1: Attack Time 2: Successful Defense
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Unique id of a super node 
     * @return NodeUniqueID Unique id of a super node
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set Unique id of a super node
     * @param NodeUniqueID Unique id of a super node
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get poc id 
     * @return PocID poc id
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set poc id
     * @param PocID poc id
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Request URL 
     * @return Url Request URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Request URL
     * @param Url Request URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get malicious feature 
     * @return Poc malicious feature
     */
    public String getPoc() {
        return this.Poc;
    }

    /**
     * Set malicious feature
     * @param Poc malicious feature
     */
    public void setPoc(String Poc) {
        this.Poc = Poc;
    }

    public RaspEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspEvent(RaspEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
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
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AttackTypeName != null) {
            this.AttackTypeName = new String(source.AttackTypeName);
        }
        if (source.AttackType != null) {
            this.AttackType = new Long(source.AttackType);
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
        if (source.RaspDetail != null) {
            this.RaspDetail = new String(source.RaspDetail);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Poc != null) {
            this.Poc = new String(source.Poc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AttackPort", this.AttackPort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttackTypeName", this.AttackTypeName);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
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
        this.setParamSimple(map, prefix + "RaspDetail", this.RaspDetail);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Poc", this.Poc);

    }
}

