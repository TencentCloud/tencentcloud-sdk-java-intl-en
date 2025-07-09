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

public class RunTimeEventBaseInfo extends AbstractModel {

    /**
    * Unique event ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Event discovery time
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * Container ID
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Node name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Status. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Event name:
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
Malicious process startup
File tampering
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event type
   `ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `ESCAPE_SYSCALL`: Syscall escape.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Number of events
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Last generation time
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * Private IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Public IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * Container isolation operation source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Node type. Valid values: `NORMAL` (general node), `SUPER` (super node)
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node subnet ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * Node subnet name
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * Subnet IP range
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Pod IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Pod status
    */
    @SerializedName("PodStatus")
    @Expose
    private String PodStatus;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Unique node ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * uuid
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
     * Get Unique event ID 
     * @return EventId Unique event ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Unique event ID
     * @param EventId Unique event ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Event discovery time 
     * @return FoundTime Event discovery time
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set Event discovery time
     * @param FoundTime Event discovery time
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get Container ID 
     * @return ContainerId Container ID
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID
     * @param ContainerId Container ID
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
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
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Node name 
     * @return NodeName Node name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
     * @param NodeName Node name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Status. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored. 
     * @return Status Status. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
     * @param Status Status. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Event name:
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
Malicious process startup
File tampering 
     * @return EventName Event name:
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
Malicious process startup
File tampering
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name:
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
Malicious process startup
File tampering
     * @param EventName Event name:
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
Malicious process startup
File tampering
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event type
   `ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `ESCAPE_SYSCALL`: Syscall escape. 
     * @return EventType Event type
   `ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `ESCAPE_SYSCALL`: Syscall escape.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type
   `ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `ESCAPE_SYSCALL`: Syscall escape.
     * @param EventType Event type
   `ESCAPE_HOST_ACESS_FILE`: Host file access escape.
   `ESCAPE_MOUNT_NAMESPACE`: Mount namespace escape.
   `ESCAPE_PRIVILEDGE`: Program privilege escalation escape.
   `ESCAPE_PRIVILEDGE_CONTAINER_START`: Privileged container startup escape.
   `ESCAPE_MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `ESCAPE_SYSCALL`: Syscall escape.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Number of events 
     * @return EventCount Number of events
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Number of events
     * @param EventCount Number of events
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get Last generation time 
     * @return LatestFoundTime Last generation time
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set Last generation time
     * @param LatestFoundTime Last generation time
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get Private IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIP Private IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Private IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIP Private IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Public IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIP Public IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set Public IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIP Public IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerNetStatus Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerNetStatus Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerNetSubStatus Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerNetSubStatus Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get Container isolation operation source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerIsolateOperationSrc Container isolation operation source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set Container isolation operation source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerIsolateOperationSrc Container isolation operation source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get Node ID 
     * @return NodeID Node ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set Node ID
     * @param NodeID Node ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Node type. Valid values: `NORMAL` (general node), `SUPER` (super node) 
     * @return NodeType Node type. Valid values: `NORMAL` (general node), `SUPER` (super node)
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Valid values: `NORMAL` (general node), `SUPER` (super node)
     * @param NodeType Node type. Valid values: `NORMAL` (general node), `SUPER` (super node)
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node subnet ID 
     * @return NodeSubNetID Node subnet ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set Node subnet ID
     * @param NodeSubNetID Node subnet ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get Node subnet name 
     * @return NodeSubNetName Node subnet name
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set Node subnet name
     * @param NodeSubNetName Node subnet name
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get Subnet IP range 
     * @return NodeSubNetCIDR Subnet IP range
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set Subnet IP range
     * @param NodeSubNetCIDR Subnet IP range
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
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
     * Get Pod IP 
     * @return PodIP Pod IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod IP
     * @param PodIP Pod IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Pod status 
     * @return PodStatus Pod status
     */
    public String getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set Pod status
     * @param PodStatus Pod status
     */
    public void setPodStatus(String PodStatus) {
        this.PodStatus = PodStatus;
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
     * Get Unique node ID 
     * @return NodeUniqueID Unique node ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set Unique node ID
     * @param NodeUniqueID Unique node ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get uuid 
     * @return HostID uuid
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set uuid
     * @param HostID uuid
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get  
     * @return Namespace 
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 
     * @param Namespace 
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get  
     * @return WorkloadType 
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set 
     * @param WorkloadType 
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    public RunTimeEventBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunTimeEventBaseInfo(RunTimeEventBaseInfo source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ContainerNetSubStatus != null) {
            this.ContainerNetSubStatus = new String(source.ContainerNetSubStatus);
        }
        if (source.ContainerIsolateOperationSrc != null) {
            this.ContainerIsolateOperationSrc = new String(source.ContainerIsolateOperationSrc);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);

    }
}

