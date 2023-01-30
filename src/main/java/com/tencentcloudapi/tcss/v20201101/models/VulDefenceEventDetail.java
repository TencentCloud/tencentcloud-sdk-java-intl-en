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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceEventDetail extends AbstractModel{

    /**
    * Vulnerability CVE ID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Intrusion status
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Attacker IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * Region of the attacker IP
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Number of events
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Container ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Processing status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Attacker port
    */
    @SerializedName("SourcePort")
    @Expose
    private String [] SourcePort;

    /**
    * Event ID
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server private IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Server public IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Harm description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Fix suggestion
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * Attack packet
    */
    @SerializedName("NetworkPayload")
    @Expose
    private String NetworkPayload;

    /**
    * Process PID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * Main class name of the process
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
    * Listened account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerAccount")
    @Expose
    private String ServerAccount;

    /**
    * Listened port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerPort")
    @Expose
    private String ServerPort;

    /**
    * Process path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerExe")
    @Expose
    private String ServerExe;

    /**
    * Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerArg")
    @Expose
    private String ServerArg;

    /**
    * Server QUuid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * Isolation status
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * API URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JNDIUrl")
    @Expose
    private String JNDIUrl;

    /**
    * RASP details
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RaspDetail")
    @Expose
    private RaspInfo [] RaspDetail;

    /**
     * Get Vulnerability CVE ID 
     * @return CVEID Vulnerability CVE ID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set Vulnerability CVE ID
     * @param CVEID Vulnerability CVE ID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
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
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Intrusion status 
     * @return EventType Intrusion status
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Intrusion status
     * @param EventType Intrusion status
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Attacker IP 
     * @return SourceIP Attacker IP
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set Attacker IP
     * @param SourceIP Attacker IP
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get Region of the attacker IP 
     * @return City Region of the attacker IP
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set Region of the attacker IP
     * @param City Region of the attacker IP
     */
    public void setCity(String City) {
        this.City = City;
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
     * Get Container ID 
     * @return ContainerID Container ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set Container ID
     * @param ContainerID Container ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
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
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
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
     * Get Processing status 
     * @return Status Processing status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Processing status
     * @param Status Processing status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Attacker port 
     * @return SourcePort Attacker port
     */
    public String [] getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set Attacker port
     * @param SourcePort Attacker port
     */
    public void setSourcePort(String [] SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get Event ID 
     * @return EventID Event ID
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set Event ID
     * @param EventID Event ID
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
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
     * Get Server private IP 
     * @return HostIP Server private IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server private IP
     * @param HostIP Server private IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Server public IP 
     * @return PublicIP Server public IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Server public IP
     * @param PublicIP Server public IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
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
     * Get Harm description 
     * @return Description Harm description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Harm description
     * @param Description Harm description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Fix suggestion 
     * @return OfficialSolution Fix suggestion
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set Fix suggestion
     * @param OfficialSolution Fix suggestion
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get Attack packet 
     * @return NetworkPayload Attack packet
     */
    public String getNetworkPayload() {
        return this.NetworkPayload;
    }

    /**
     * Set Attack packet
     * @param NetworkPayload Attack packet
     */
    public void setNetworkPayload(String NetworkPayload) {
        this.NetworkPayload = NetworkPayload;
    }

    /**
     * Get Process PID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PID Process PID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set Process PID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PID Process PID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get Main class name of the process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MainClass Main class name of the process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Main class name of the process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MainClass Main class name of the process
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
     * Get Listened account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerAccount Listened account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerAccount() {
        return this.ServerAccount;
    }

    /**
     * Set Listened account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerAccount Listened account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerAccount(String ServerAccount) {
        this.ServerAccount = ServerAccount;
    }

    /**
     * Get Listened port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerPort Listened port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerPort() {
        return this.ServerPort;
    }

    /**
     * Set Listened port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerPort Listened port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerPort(String ServerPort) {
        this.ServerPort = ServerPort;
    }

    /**
     * Get Process path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerExe Process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerExe() {
        return this.ServerExe;
    }

    /**
     * Set Process path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerExe Process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerExe(String ServerExe) {
        this.ServerExe = ServerExe;
    }

    /**
     * Get Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerArg Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerArg() {
        return this.ServerArg;
    }

    /**
     * Set Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerArg Process command line parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerArg(String ServerArg) {
        this.ServerArg = ServerArg;
    }

    /**
     * Get Server QUuid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QUUID Server QUuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Server QUuid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QUUID Server QUuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get Isolation status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerNetStatus Isolation status
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
     * Set Isolation status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerNetStatus Isolation status
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerStatus Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerStatus Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get API URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JNDIUrl API URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJNDIUrl() {
        return this.JNDIUrl;
    }

    /**
     * Set API URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JNDIUrl API URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJNDIUrl(String JNDIUrl) {
        this.JNDIUrl = JNDIUrl;
    }

    /**
     * Get RASP details
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RaspDetail RASP details
Note: This field may return `null`, indicating that no valid value was found.
     */
    public RaspInfo [] getRaspDetail() {
        return this.RaspDetail;
    }

    /**
     * Set RASP details
Note: This field may return `null`, indicating that no valid value was found.
     * @param RaspDetail RASP details
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRaspDetail(RaspInfo [] RaspDetail) {
        this.RaspDetail = RaspDetail;
    }

    public VulDefenceEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceEventDetail(VulDefenceEventDetail source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new String[source.SourcePort.length];
            for (int i = 0; i < source.SourcePort.length; i++) {
                this.SourcePort[i] = new String(source.SourcePort[i]);
            }
        }
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OfficialSolution != null) {
            this.OfficialSolution = new String(source.OfficialSolution);
        }
        if (source.NetworkPayload != null) {
            this.NetworkPayload = new String(source.NetworkPayload);
        }
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.StackTrace != null) {
            this.StackTrace = new String(source.StackTrace);
        }
        if (source.ServerAccount != null) {
            this.ServerAccount = new String(source.ServerAccount);
        }
        if (source.ServerPort != null) {
            this.ServerPort = new String(source.ServerPort);
        }
        if (source.ServerExe != null) {
            this.ServerExe = new String(source.ServerExe);
        }
        if (source.ServerArg != null) {
            this.ServerArg = new String(source.ServerArg);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
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
        if (source.JNDIUrl != null) {
            this.JNDIUrl = new String(source.JNDIUrl);
        }
        if (source.RaspDetail != null) {
            this.RaspDetail = new RaspInfo[source.RaspDetail.length];
            for (int i = 0; i < source.RaspDetail.length; i++) {
                this.RaspDetail[i] = new RaspInfo(source.RaspDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SourcePort.", this.SourcePort);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "NetworkPayload", this.NetworkPayload);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "StackTrace", this.StackTrace);
        this.setParamSimple(map, prefix + "ServerAccount", this.ServerAccount);
        this.setParamSimple(map, prefix + "ServerPort", this.ServerPort);
        this.setParamSimple(map, prefix + "ServerExe", this.ServerExe);
        this.setParamSimple(map, prefix + "ServerArg", this.ServerArg);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "JNDIUrl", this.JNDIUrl);
        this.setParamArrayObj(map, prefix + "RaspDetail.", this.RaspDetail);

    }
}

