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

public class EscapeEventInfo extends AbstractModel {

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
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Unique event ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Node name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Pod (instance) name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Generation time
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * Event name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Image ID, which is used for redirect.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Container ID, which is used for redirect.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Event solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Event description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * Node IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
    * Server IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

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
    * Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

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
     * Get Status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored). 
     * @return Status Status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
     * @param Status Status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_INGNORE` (ignored).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

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
     * Get Pod (instance) name 
     * @return PodName Pod (instance) name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod (instance) name
     * @param PodName Pod (instance) name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Generation time 
     * @return FoundTime Generation time
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set Generation time
     * @param FoundTime Generation time
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get Event name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount 
     * @return EventName Event name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
     * @param EventName Event name
Host file access escape
Syscall escape
Mount namespace escape
Program privilege escalation escape
Privileged container startup escape
Sensitive path mount
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Image ID, which is used for redirect. 
     * @return ImageId Image ID, which is used for redirect.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID, which is used for redirect.
     * @param ImageId Image ID, which is used for redirect.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Container ID, which is used for redirect. 
     * @return ContainerId Container ID, which is used for redirect.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID, which is used for redirect.
     * @param ContainerId Container ID, which is used for redirect.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Event solution 
     * @return Solution Event solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Event solution
     * @param Solution Event solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Event description 
     * @return Description Event description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event description
     * @param Description Event description
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get Node IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeIP Node IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set Node IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeIP Node IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    /**
     * Get Server IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostID Server IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostID Server IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
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
     * Get Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing. 
     * @return ContainerStatus Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
     * @param ContainerStatus Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    public EscapeEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscapeEventInfo(EscapeEventInfo source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
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
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);

    }
}

