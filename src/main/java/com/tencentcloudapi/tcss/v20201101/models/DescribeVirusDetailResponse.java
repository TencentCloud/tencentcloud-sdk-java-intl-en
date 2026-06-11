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

public class DescribeVirusDetailResponse extends AbstractModel {

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
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Trojan File Size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Trojan file path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Latest creation time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Virus name
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Risk Level: RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, and RISK_NOTICE
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Container id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Process md5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * Process id
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * Process parameter
    */
    @SerializedName("ProcessArgv")
    @Expose
    private String ProcessArgv;

    /**
    * Process chain
    */
    @SerializedName("ProcessChan")
    @Expose
    private String ProcessChan;

    /**
    * Process Group
    */
    @SerializedName("ProcessAccountGroup")
    @Expose
    private String ProcessAccountGroup;

    /**
    * process initiator
    */
    @SerializedName("ProcessStartAccount")
    @Expose
    private String ProcessStartAccount;

    /**
    * Process file permission
    */
    @SerializedName("ProcessFileAuthority")
    @Expose
    private String ProcessFileAuthority;

    /**
    * Source. 0: One-Click Scan; 1: Scheduled Scan; 2: Real-Time Monitoring
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

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
    * Remarks
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * Risk File Name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File MD5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Event type
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Cluster name.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

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
    * Failed sub-status
FILE_NOT_FOUND: File not found
FILE_ABNORMAL: File abnormality
FILE_ABNORMAL_DEAL_RECOVER: File abnormality when recovering file
BACKUP FILE NOT FOUND
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

    /**
    * Private IP address
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Public IP address
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * Parent Process Startup User
    */
    @SerializedName("PProcessStartUser")
    @Expose
    private String PProcessStartUser;

    /**
    * Parent process user group
    */
    @SerializedName("PProcessUserGroup")
    @Expose
    private String PProcessUserGroup;

    /**
    * Parent process path
    */
    @SerializedName("PProcessPath")
    @Expose
    private String PProcessPath;

    /**
    * Parent Process Command Line Parameters
    */
    @SerializedName("PProcessParam")
    @Expose
    private String PProcessParam;

    /**
    * Ancestor Process Startup User
    */
    @SerializedName("AncestorProcessStartUser")
    @Expose
    private String AncestorProcessStartUser;

    /**
    * Ancestor Process User Group
    */
    @SerializedName("AncestorProcessUserGroup")
    @Expose
    private String AncestorProcessUserGroup;

    /**
    * Ancestor process path
    */
    @SerializedName("AncestorProcessPath")
    @Expose
    private String AncestorProcessPath;

    /**
    * Ancestor Process Command Line Parameters
    */
    @SerializedName("AncestorProcessParam")
    @Expose
    private String AncestorProcessParam;

    /**
    * Last Time for Event Handling
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * Container isolation status
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Container Isolation Sub-status
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
    * detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: TI
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * File Access Time
    */
    @SerializedName("FileAccessTime")
    @Expose
    private String FileAccessTime;

    /**
    * File Modification Time
    */
    @SerializedName("FileModifyTime")
    @Expose
    private String FileModifyTime;

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
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

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
    * UID of the node
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * Node type. Values: `NORMAL` (general node), `SUPER` (super node).
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Workload type
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * Container status.
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Trojan File Size 
     * @return Size Trojan File Size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Trojan File Size
     * @param Size Trojan File Size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Trojan file path 
     * @return FilePath Trojan file path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Trojan file path
     * @param FilePath Trojan file path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Latest creation time 
     * @return ModifyTime Latest creation time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Latest creation time
     * @param ModifyTime Latest creation time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get Container id 
     * @return ContainerId Container id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container id
     * @param ContainerId Container id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host ID 
     * @return HostId Host ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host ID
     * @param HostId Host ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Process path 
     * @return ProcessPath Process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
     * @param ProcessPath Process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Process md5 
     * @return ProcessMd5 Process md5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set Process md5
     * @param ProcessMd5 Process md5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get Process id 
     * @return ProcessId Process id
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set Process id
     * @param ProcessId Process id
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get Process parameter 
     * @return ProcessArgv Process parameter
     */
    public String getProcessArgv() {
        return this.ProcessArgv;
    }

    /**
     * Set Process parameter
     * @param ProcessArgv Process parameter
     */
    public void setProcessArgv(String ProcessArgv) {
        this.ProcessArgv = ProcessArgv;
    }

    /**
     * Get Process chain 
     * @return ProcessChan Process chain
     */
    public String getProcessChan() {
        return this.ProcessChan;
    }

    /**
     * Set Process chain
     * @param ProcessChan Process chain
     */
    public void setProcessChan(String ProcessChan) {
        this.ProcessChan = ProcessChan;
    }

    /**
     * Get Process Group 
     * @return ProcessAccountGroup Process Group
     */
    public String getProcessAccountGroup() {
        return this.ProcessAccountGroup;
    }

    /**
     * Set Process Group
     * @param ProcessAccountGroup Process Group
     */
    public void setProcessAccountGroup(String ProcessAccountGroup) {
        this.ProcessAccountGroup = ProcessAccountGroup;
    }

    /**
     * Get process initiator 
     * @return ProcessStartAccount process initiator
     */
    public String getProcessStartAccount() {
        return this.ProcessStartAccount;
    }

    /**
     * Set process initiator
     * @param ProcessStartAccount process initiator
     */
    public void setProcessStartAccount(String ProcessStartAccount) {
        this.ProcessStartAccount = ProcessStartAccount;
    }

    /**
     * Get Process file permission 
     * @return ProcessFileAuthority Process file permission
     */
    public String getProcessFileAuthority() {
        return this.ProcessFileAuthority;
    }

    /**
     * Set Process file permission
     * @param ProcessFileAuthority Process file permission
     */
    public void setProcessFileAuthority(String ProcessFileAuthority) {
        this.ProcessFileAuthority = ProcessFileAuthority;
    }

    /**
     * Get Source. 0: One-Click Scan; 1: Scheduled Scan; 2: Real-Time Monitoring 
     * @return SourceType Source. 0: One-Click Scan; 1: Scheduled Scan; 2: Real-Time Monitoring
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Source. 0: One-Click Scan; 1: Scheduled Scan; 2: Real-Time Monitoring
     * @param SourceType Source. 0: One-Click Scan; 1: Scheduled Scan; 2: Real-Time Monitoring
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
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
     * Get Remarks 
     * @return Mark Remarks
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks
     * @param Mark Remarks
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Risk File Name 
     * @return FileName Risk File Name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Risk File Name
     * @param FileName Risk File Name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File MD5 
     * @return FileMd5 File MD5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set File MD5
     * @param FileMd5 File MD5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get Event type 
     * @return EventType Event type
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type
     * @param EventType Event type
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Cluster name. 
     * @return PodName Cluster name.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Cluster name.
     * @param PodName Cluster name.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
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
     * Get Failed sub-status
FILE_NOT_FOUND: File not found
FILE_ABNORMAL: File abnormality
FILE_ABNORMAL_DEAL_RECOVER: File abnormality when recovering file
BACKUP FILE NOT FOUND
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering 
     * @return SubStatus Failed sub-status
FILE_NOT_FOUND: File not found
FILE_ABNORMAL: File abnormality
FILE_ABNORMAL_DEAL_RECOVER: File abnormality when recovering file
BACKUP FILE NOT FOUND
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
     */
    public String getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Failed sub-status
FILE_NOT_FOUND: File not found
FILE_ABNORMAL: File abnormality
FILE_ABNORMAL_DEAL_RECOVER: File abnormality when recovering file
BACKUP FILE NOT FOUND
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
     * @param SubStatus Failed sub-status
FILE_NOT_FOUND: File not found
FILE_ABNORMAL: File abnormality
FILE_ABNORMAL_DEAL_RECOVER: File abnormality when recovering file
BACKUP FILE NOT FOUND
CONTAINER_NOT_FOUND_DEAL_ISOLATE: Container not found in isolation
CONTAINER_NOT_FOUND_DEAL_RECOVER: Container not found when recovering
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get Private IP address 
     * @return HostIP Private IP address
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Private IP address
     * @param HostIP Private IP address
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Public IP address 
     * @return ClientIP Public IP address
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set Public IP address
     * @param ClientIP Public IP address
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get Parent Process Startup User 
     * @return PProcessStartUser Parent Process Startup User
     */
    public String getPProcessStartUser() {
        return this.PProcessStartUser;
    }

    /**
     * Set Parent Process Startup User
     * @param PProcessStartUser Parent Process Startup User
     */
    public void setPProcessStartUser(String PProcessStartUser) {
        this.PProcessStartUser = PProcessStartUser;
    }

    /**
     * Get Parent process user group 
     * @return PProcessUserGroup Parent process user group
     */
    public String getPProcessUserGroup() {
        return this.PProcessUserGroup;
    }

    /**
     * Set Parent process user group
     * @param PProcessUserGroup Parent process user group
     */
    public void setPProcessUserGroup(String PProcessUserGroup) {
        this.PProcessUserGroup = PProcessUserGroup;
    }

    /**
     * Get Parent process path 
     * @return PProcessPath Parent process path
     */
    public String getPProcessPath() {
        return this.PProcessPath;
    }

    /**
     * Set Parent process path
     * @param PProcessPath Parent process path
     */
    public void setPProcessPath(String PProcessPath) {
        this.PProcessPath = PProcessPath;
    }

    /**
     * Get Parent Process Command Line Parameters 
     * @return PProcessParam Parent Process Command Line Parameters
     */
    public String getPProcessParam() {
        return this.PProcessParam;
    }

    /**
     * Set Parent Process Command Line Parameters
     * @param PProcessParam Parent Process Command Line Parameters
     */
    public void setPProcessParam(String PProcessParam) {
        this.PProcessParam = PProcessParam;
    }

    /**
     * Get Ancestor Process Startup User 
     * @return AncestorProcessStartUser Ancestor Process Startup User
     */
    public String getAncestorProcessStartUser() {
        return this.AncestorProcessStartUser;
    }

    /**
     * Set Ancestor Process Startup User
     * @param AncestorProcessStartUser Ancestor Process Startup User
     */
    public void setAncestorProcessStartUser(String AncestorProcessStartUser) {
        this.AncestorProcessStartUser = AncestorProcessStartUser;
    }

    /**
     * Get Ancestor Process User Group 
     * @return AncestorProcessUserGroup Ancestor Process User Group
     */
    public String getAncestorProcessUserGroup() {
        return this.AncestorProcessUserGroup;
    }

    /**
     * Set Ancestor Process User Group
     * @param AncestorProcessUserGroup Ancestor Process User Group
     */
    public void setAncestorProcessUserGroup(String AncestorProcessUserGroup) {
        this.AncestorProcessUserGroup = AncestorProcessUserGroup;
    }

    /**
     * Get Ancestor process path 
     * @return AncestorProcessPath Ancestor process path
     */
    public String getAncestorProcessPath() {
        return this.AncestorProcessPath;
    }

    /**
     * Set Ancestor process path
     * @param AncestorProcessPath Ancestor process path
     */
    public void setAncestorProcessPath(String AncestorProcessPath) {
        this.AncestorProcessPath = AncestorProcessPath;
    }

    /**
     * Get Ancestor Process Command Line Parameters 
     * @return AncestorProcessParam Ancestor Process Command Line Parameters
     */
    public String getAncestorProcessParam() {
        return this.AncestorProcessParam;
    }

    /**
     * Set Ancestor Process Command Line Parameters
     * @param AncestorProcessParam Ancestor Process Command Line Parameters
     */
    public void setAncestorProcessParam(String AncestorProcessParam) {
        this.AncestorProcessParam = AncestorProcessParam;
    }

    /**
     * Get Last Time for Event Handling 
     * @return OperationTime Last Time for Event Handling
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set Last Time for Event Handling
     * @param OperationTime Last Time for Event Handling
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
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
     * Get Container Isolation Sub-status 
     * @return ContainerNetSubStatus Container Isolation Sub-status
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set Container Isolation Sub-status
     * @param ContainerNetSubStatus Container Isolation Sub-status
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
     * Get detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: TI 
     * @return CheckPlatform detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: TI
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: TI
     * @param CheckPlatform detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: TI
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get File Access Time 
     * @return FileAccessTime File Access Time
     */
    public String getFileAccessTime() {
        return this.FileAccessTime;
    }

    /**
     * Set File Access Time
     * @param FileAccessTime File Access Time
     */
    public void setFileAccessTime(String FileAccessTime) {
        this.FileAccessTime = FileAccessTime;
    }

    /**
     * Get File Modification Time 
     * @return FileModifyTime File Modification Time
     */
    public String getFileModifyTime() {
        return this.FileModifyTime;
    }

    /**
     * Set File Modification Time
     * @param FileModifyTime File Modification Time
     */
    public void setFileModifyTime(String FileModifyTime) {
        this.FileModifyTime = FileModifyTime;
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
     * Get UID of the node 
     * @return NodeUniqueID UID of the node
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set UID of the node
     * @param NodeUniqueID UID of the node
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get Node type. Values: `NORMAL` (general node), `SUPER` (super node). 
     * @return NodeType Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     * @param NodeType Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
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
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Workload type 
     * @return WorkloadType Workload type
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set Workload type
     * @param WorkloadType Workload type
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get Container status. 
     * @return ContainerStatus Container status.
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container status.
     * @param ContainerStatus Container status.
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVirusDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusDetailResponse(DescribeVirusDetailResponse source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ProcessArgv != null) {
            this.ProcessArgv = new String(source.ProcessArgv);
        }
        if (source.ProcessChan != null) {
            this.ProcessChan = new String(source.ProcessChan);
        }
        if (source.ProcessAccountGroup != null) {
            this.ProcessAccountGroup = new String(source.ProcessAccountGroup);
        }
        if (source.ProcessStartAccount != null) {
            this.ProcessStartAccount = new String(source.ProcessStartAccount);
        }
        if (source.ProcessFileAuthority != null) {
            this.ProcessFileAuthority = new String(source.ProcessFileAuthority);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new String(source.SubStatus);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.PProcessStartUser != null) {
            this.PProcessStartUser = new String(source.PProcessStartUser);
        }
        if (source.PProcessUserGroup != null) {
            this.PProcessUserGroup = new String(source.PProcessUserGroup);
        }
        if (source.PProcessPath != null) {
            this.PProcessPath = new String(source.PProcessPath);
        }
        if (source.PProcessParam != null) {
            this.PProcessParam = new String(source.PProcessParam);
        }
        if (source.AncestorProcessStartUser != null) {
            this.AncestorProcessStartUser = new String(source.AncestorProcessStartUser);
        }
        if (source.AncestorProcessUserGroup != null) {
            this.AncestorProcessUserGroup = new String(source.AncestorProcessUserGroup);
        }
        if (source.AncestorProcessPath != null) {
            this.AncestorProcessPath = new String(source.AncestorProcessPath);
        }
        if (source.AncestorProcessParam != null) {
            this.AncestorProcessParam = new String(source.AncestorProcessParam);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
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
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String[source.CheckPlatform.length];
            for (int i = 0; i < source.CheckPlatform.length; i++) {
                this.CheckPlatform[i] = new String(source.CheckPlatform[i]);
            }
        }
        if (source.FileAccessTime != null) {
            this.FileAccessTime = new String(source.FileAccessTime);
        }
        if (source.FileModifyTime != null) {
            this.FileModifyTime = new String(source.FileModifyTime);
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
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessArgv", this.ProcessArgv);
        this.setParamSimple(map, prefix + "ProcessChan", this.ProcessChan);
        this.setParamSimple(map, prefix + "ProcessAccountGroup", this.ProcessAccountGroup);
        this.setParamSimple(map, prefix + "ProcessStartAccount", this.ProcessStartAccount);
        this.setParamSimple(map, prefix + "ProcessFileAuthority", this.ProcessFileAuthority);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "PProcessStartUser", this.PProcessStartUser);
        this.setParamSimple(map, prefix + "PProcessUserGroup", this.PProcessUserGroup);
        this.setParamSimple(map, prefix + "PProcessPath", this.PProcessPath);
        this.setParamSimple(map, prefix + "PProcessParam", this.PProcessParam);
        this.setParamSimple(map, prefix + "AncestorProcessStartUser", this.AncestorProcessStartUser);
        this.setParamSimple(map, prefix + "AncestorProcessUserGroup", this.AncestorProcessUserGroup);
        this.setParamSimple(map, prefix + "AncestorProcessPath", this.AncestorProcessPath);
        this.setParamSimple(map, prefix + "AncestorProcessParam", this.AncestorProcessParam);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamArraySimple(map, prefix + "CheckPlatform.", this.CheckPlatform);
        this.setParamSimple(map, prefix + "FileAccessTime", this.FileAccessTime);
        this.setParamSimple(map, prefix + "FileModifyTime", this.FileModifyTime);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

