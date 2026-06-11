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

public class VirusInfo extends AbstractModel {

    /**
    * File name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Virus name
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

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
    * Container status.
RUNNING: running
Suspend: PAUSED
Stop: STOPPED
CREATED
DESTROYED
RESTARTING
Migrating: REMOVING
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * Image Name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * DEAL_NONE: File pending
DEAL_IGNORE: Already ignored
DEAL_ADD_WHITELIST: Add to whitelist
DEAL_DEL: File deleted
DEAL_ISOLATE: Has been isolated
DEAL_ISOLATING: Isolated
DEAL_ISOLATE_FAILED: Isolation failed
DEAL_RECOVERING: Recovering
DEAL_RECOVER_FAILED: Recovery failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Event description
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * Recommended solution
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Failed sub-status
FILE_NOT_FOUND: File does not exist
FILE_ABNORMAL: abnormal file
FILE_ABNORMAL_DEAL_RECOVER: Abnormal file when recovering file.
BACKUP_FILE_NOT_FOUND: Backup file not found
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
TIMEOUT: Timeout
TOO_MANY: Too many tasks
OFFLINE: Offline
INTERNAL Server Error
VALIDATION: Invalid parameter
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

    /**
    * Network status.
Unisolated  NORMAL
ISOLATED
isolated
Isolation FAILED
RESTORING isolation
Isolation restoration failed RESTORE_FAILED
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * container sub-status
AGENT_OFFLINE
	NODE_DESTROYED
	CONTAINER_EXITED
	"CONTAINER_DESTROYED" //Container destroyed
	SHARED_HOST
	RESOURCE_LIMIT
	"UNKNOW": Unknown
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * Container Isolation Operation Source
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * MD5 Value
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * Risk Level: RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, and RISK_NOTICE
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Name of the pod (instance)
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Node Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Node Type. NORMAL: Common Node; SUPER: Super Node
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Public IP of the node
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Node private network IP
    */
    @SerializedName("InnerIP")
    @Expose
    private String InnerIP;

    /**
    * Node Unique ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * Common Node ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Private IP address of the node, which is the same as the value of InnerIP.
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
     * Get File name 
     * @return FileName File name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name
     * @param FileName File name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File path 
     * @return FilePath File path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path
     * @param FilePath File path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Virus name 
     * @return VirusName Virus name
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
     * @param VirusName Virus name
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return ModifyTime Update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
     * @param ModifyTime Update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get Container status.
RUNNING: running
Suspend: PAUSED
Stop: STOPPED
CREATED
DESTROYED
RESTARTING
Migrating: REMOVING 
     * @return ContainerStatus Container status.
RUNNING: running
Suspend: PAUSED
Stop: STOPPED
CREATED
DESTROYED
RESTARTING
Migrating: REMOVING
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container status.
RUNNING: running
Suspend: PAUSED
Stop: STOPPED
CREATED
DESTROYED
RESTARTING
Migrating: REMOVING
     * @param ContainerStatus Container status.
RUNNING: running
Suspend: PAUSED
Stop: STOPPED
CREATED
DESTROYED
RESTARTING
Migrating: REMOVING
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
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
     * Get Image id 
     * @return ImageId Image id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image id
     * @param ImageId Image id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get DEAL_NONE: File pending
DEAL_IGNORE: Already ignored
DEAL_ADD_WHITELIST: Add to whitelist
DEAL_DEL: File deleted
DEAL_ISOLATE: Has been isolated
DEAL_ISOLATING: Isolated
DEAL_ISOLATE_FAILED: Isolation failed
DEAL_RECOVERING: Recovering
DEAL_RECOVER_FAILED: Recovery failed 
     * @return Status DEAL_NONE: File pending
DEAL_IGNORE: Already ignored
DEAL_ADD_WHITELIST: Add to whitelist
DEAL_DEL: File deleted
DEAL_ISOLATE: Has been isolated
DEAL_ISOLATING: Isolated
DEAL_ISOLATE_FAILED: Isolation failed
DEAL_RECOVERING: Recovering
DEAL_RECOVER_FAILED: Recovery failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DEAL_NONE: File pending
DEAL_IGNORE: Already ignored
DEAL_ADD_WHITELIST: Add to whitelist
DEAL_DEL: File deleted
DEAL_ISOLATE: Has been isolated
DEAL_ISOLATING: Isolated
DEAL_ISOLATE_FAILED: Isolation failed
DEAL_RECOVERING: Recovering
DEAL_RECOVER_FAILED: Recovery failed
     * @param Status DEAL_NONE: File pending
DEAL_IGNORE: Already ignored
DEAL_ADD_WHITELIST: Add to whitelist
DEAL_DEL: File deleted
DEAL_ISOLATE: Has been isolated
DEAL_ISOLATING: Isolated
DEAL_ISOLATE_FAILED: Isolation failed
DEAL_RECOVERING: Recovering
DEAL_RECOVER_FAILED: Recovery failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Event description 
     * @return HarmDescribe Event description
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set Event description
     * @param HarmDescribe Event description
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get Recommended solution 
     * @return SuggestScheme Recommended solution
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set Recommended solution
     * @param SuggestScheme Recommended solution
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get Failed sub-status
FILE_NOT_FOUND: File does not exist
FILE_ABNORMAL: abnormal file
FILE_ABNORMAL_DEAL_RECOVER: Abnormal file when recovering file.
BACKUP_FILE_NOT_FOUND: Backup file not found
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
TIMEOUT: Timeout
TOO_MANY: Too many tasks
OFFLINE: Offline
INTERNAL Server Error
VALIDATION: Invalid parameter 
     * @return SubStatus Failed sub-status
FILE_NOT_FOUND: File does not exist
FILE_ABNORMAL: abnormal file
FILE_ABNORMAL_DEAL_RECOVER: Abnormal file when recovering file.
BACKUP_FILE_NOT_FOUND: Backup file not found
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
TIMEOUT: Timeout
TOO_MANY: Too many tasks
OFFLINE: Offline
INTERNAL Server Error
VALIDATION: Invalid parameter
     */
    public String getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Failed sub-status
FILE_NOT_FOUND: File does not exist
FILE_ABNORMAL: abnormal file
FILE_ABNORMAL_DEAL_RECOVER: Abnormal file when recovering file.
BACKUP_FILE_NOT_FOUND: Backup file not found
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
TIMEOUT: Timeout
TOO_MANY: Too many tasks
OFFLINE: Offline
INTERNAL Server Error
VALIDATION: Invalid parameter
     * @param SubStatus Failed sub-status
FILE_NOT_FOUND: File does not exist
FILE_ABNORMAL: abnormal file
FILE_ABNORMAL_DEAL_RECOVER: Abnormal file when recovering file.
BACKUP_FILE_NOT_FOUND: Backup file not found
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
TIMEOUT: Timeout
TOO_MANY: Too many tasks
OFFLINE: Offline
INTERNAL Server Error
VALIDATION: Invalid parameter
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get Network status.
Unisolated  NORMAL
ISOLATED
isolated
Isolation FAILED
RESTORING isolation
Isolation restoration failed RESTORE_FAILED 
     * @return ContainerNetStatus Network status.
Unisolated  NORMAL
ISOLATED
isolated
Isolation FAILED
RESTORING isolation
Isolation restoration failed RESTORE_FAILED
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Network status.
Unisolated  NORMAL
ISOLATED
isolated
Isolation FAILED
RESTORING isolation
Isolation restoration failed RESTORE_FAILED
     * @param ContainerNetStatus Network status.
Unisolated  NORMAL
ISOLATED
isolated
Isolation FAILED
RESTORING isolation
Isolation restoration failed RESTORE_FAILED
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get container sub-status
AGENT_OFFLINE
	NODE_DESTROYED
	CONTAINER_EXITED
	"CONTAINER_DESTROYED" //Container destroyed
	SHARED_HOST
	RESOURCE_LIMIT
	"UNKNOW": Unknown 
     * @return ContainerNetSubStatus container sub-status
AGENT_OFFLINE
	NODE_DESTROYED
	CONTAINER_EXITED
	"CONTAINER_DESTROYED" //Container destroyed
	SHARED_HOST
	RESOURCE_LIMIT
	"UNKNOW": Unknown
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set container sub-status
AGENT_OFFLINE
	NODE_DESTROYED
	CONTAINER_EXITED
	"CONTAINER_DESTROYED" //Container destroyed
	SHARED_HOST
	RESOURCE_LIMIT
	"UNKNOW": Unknown
     * @param ContainerNetSubStatus container sub-status
AGENT_OFFLINE
	NODE_DESTROYED
	CONTAINER_EXITED
	"CONTAINER_DESTROYED" //Container destroyed
	SHARED_HOST
	RESOURCE_LIMIT
	"UNKNOW": Unknown
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get Container Isolation Operation Source 
     * @return ContainerIsolateOperationSrc Container Isolation Operation Source
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set Container Isolation Operation Source
     * @param ContainerIsolateOperationSrc Container Isolation Operation Source
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get MD5 Value 
     * @return MD5 MD5 Value
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set MD5 Value
     * @param MD5 MD5 Value
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get Risk Level: RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, and RISK_NOTICE 
     * @return RiskLevel Risk Level: RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, and RISK_NOTICE
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk Level: RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, and RISK_NOTICE
     * @param RiskLevel Risk Level: RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, and RISK_NOTICE
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence 
     * @return CheckPlatform Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
     * @param CheckPlatform Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
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
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Name of the pod (instance) 
     * @return PodName Name of the pod (instance)
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Name of the pod (instance)
     * @param PodName Name of the pod (instance)
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Node Cluster ID 
     * @return ClusterID Node Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Node Cluster ID
     * @param ClusterID Node Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Node Type. NORMAL: Common Node; SUPER: Super Node 
     * @return NodeType Node Type. NORMAL: Common Node; SUPER: Super Node
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node Type. NORMAL: Common Node; SUPER: Super Node
     * @param NodeType Node Type. NORMAL: Common Node; SUPER: Super Node
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Public IP of the node 
     * @return PublicIP Public IP of the node
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP of the node
     * @param PublicIP Public IP of the node
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Node private network IP 
     * @return InnerIP Node private network IP
     */
    public String getInnerIP() {
        return this.InnerIP;
    }

    /**
     * Set Node private network IP
     * @param InnerIP Node private network IP
     */
    public void setInnerIP(String InnerIP) {
        this.InnerIP = InnerIP;
    }

    /**
     * Get Node Unique ID 
     * @return NodeUniqueID Node Unique ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set Node Unique ID
     * @param NodeUniqueID Node Unique ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get Common Node ID 
     * @return HostID Common Node ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Common Node ID
     * @param HostID Common Node ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
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
     * Get Private IP address of the node, which is the same as the value of InnerIP. 
     * @return HostIP Private IP address of the node, which is the same as the value of InnerIP.
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Private IP address of the node, which is the same as the value of InnerIP.
     * @param HostIP Private IP address of the node, which is the same as the value of InnerIP.
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    public VirusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirusInfo(VirusInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new String(source.SubStatus);
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
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String[source.CheckPlatform.length];
            for (int i = 0; i < source.CheckPlatform.length; i++) {
                this.CheckPlatform[i] = new String(source.CheckPlatform[i]);
            }
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.InnerIP != null) {
            this.InnerIP = new String(source.InnerIP);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "CheckPlatform.", this.CheckPlatform);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "InnerIP", this.InnerIP);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);

    }
}

