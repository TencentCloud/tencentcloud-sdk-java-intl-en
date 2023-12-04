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

public class DescribeVirusDetailResponse extends AbstractModel {

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Trojan file size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Trojan file path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Last generation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Virus name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Container name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Container ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Server name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Process name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Process MD5
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * Process ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * Process parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessArgv")
    @Expose
    private String ProcessArgv;

    /**
    * Process chain
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessChan")
    @Expose
    private String ProcessChan;

    /**
    * Process group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessAccountGroup")
    @Expose
    private String ProcessAccountGroup;

    /**
    * Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessStartAccount")
    @Expose
    private String ProcessStartAccount;

    /**
    * Process file permission
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessFileAuthority")
    @Expose
    private String ProcessFileAuthority;

    /**
    * Source. Valid values: `0` (quick scan); `1` (scheduled scan); `2` (real-time monitoring).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Event description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * Suspicious file name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Event type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Cluster name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * `DEAL_NONE`: Pending.
`DEAL_IGNORE`: Ignored.
`DEAL_ADD_WHITELIST`: Allowed.
`DEAL_DEL`: Deleted.
`DEAL_ISOLATE`: Isolated.
`DEAL_ISOLATING`: Isolating.
`DEAL_ISOLATE_FAILED`: Isolation failed.
`DEAL_RECOVERING`: Recovering.
`DEAL_RECOVER_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Sub-status of the failure:
`FILE_NOT_FOUND`: The file does not exist.
`FILE_ABNORMAL`: The file is abnormal.
`FILE_ABNORMAL_DEAL_RECOVER`: The file is abnormal when recovered.
`BACKUP_FILE_NOT_FOUND`: The backup file does not exist.
`CONTAINER_NOT_FOUND_DEAL_ISOLATE`: The container does not exist during isolation.
`CONTAINER_NOT_FOUND_DEAL_RECOVER`: The container does not exist during recovery.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

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
    * Parent process initiator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PProcessStartUser")
    @Expose
    private String PProcessStartUser;

    /**
    * User group of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PProcessUserGroup")
    @Expose
    private String PProcessUserGroup;

    /**
    * Path of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PProcessPath")
    @Expose
    private String PProcessPath;

    /**
    * Command line parameters of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PProcessParam")
    @Expose
    private String PProcessParam;

    /**
    * Ancestor process initiator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AncestorProcessStartUser")
    @Expose
    private String AncestorProcessStartUser;

    /**
    * Ancestor process user group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AncestorProcessUserGroup")
    @Expose
    private String AncestorProcessUserGroup;

    /**
    * Ancestor process path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AncestorProcessPath")
    @Expose
    private String AncestorProcessPath;

    /**
    * Command line parameters of the ancestor process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AncestorProcessParam")
    @Expose
    private String AncestorProcessParam;

    /**
    * Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Sub-status of container isolation
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
    * Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * File accessed time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileAccessTime")
    @Expose
    private String FileAccessTime;

    /**
    * File modified time
Note: This field may return null, indicating that no valid values can be obtained.
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
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Image name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageName Image name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageName Image name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Trojan file size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size Trojan file size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Trojan file size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size Trojan file size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Trojan file path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilePath Trojan file path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Trojan file path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilePath Trojan file path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Last generation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Last generation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last generation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Last generation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Virus name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusName Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusName Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Container ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerId Container ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerId Container ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Server name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Server name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Server name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Server ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostId Server ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Server ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostId Server ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Process name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessName Process name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessName Process name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Process path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessPath Process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessPath Process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Process MD5
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessMd5 Process MD5
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set Process MD5
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessMd5 Process MD5
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get Process ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessId Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessId Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get Process parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessArgv Process parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessArgv() {
        return this.ProcessArgv;
    }

    /**
     * Set Process parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessArgv Process parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessArgv(String ProcessArgv) {
        this.ProcessArgv = ProcessArgv;
    }

    /**
     * Get Process chain
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessChan Process chain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessChan() {
        return this.ProcessChan;
    }

    /**
     * Set Process chain
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessChan Process chain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessChan(String ProcessChan) {
        this.ProcessChan = ProcessChan;
    }

    /**
     * Get Process group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessAccountGroup Process group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessAccountGroup() {
        return this.ProcessAccountGroup;
    }

    /**
     * Set Process group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessAccountGroup Process group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessAccountGroup(String ProcessAccountGroup) {
        this.ProcessAccountGroup = ProcessAccountGroup;
    }

    /**
     * Get Process initiator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessStartAccount Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessStartAccount() {
        return this.ProcessStartAccount;
    }

    /**
     * Set Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessStartAccount Process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessStartAccount(String ProcessStartAccount) {
        this.ProcessStartAccount = ProcessStartAccount;
    }

    /**
     * Get Process file permission
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessFileAuthority Process file permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessFileAuthority() {
        return this.ProcessFileAuthority;
    }

    /**
     * Set Process file permission
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessFileAuthority Process file permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessFileAuthority(String ProcessFileAuthority) {
        this.ProcessFileAuthority = ProcessFileAuthority;
    }

    /**
     * Get Source. Valid values: `0` (quick scan); `1` (scheduled scan); `2` (real-time monitoring).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceType Source. Valid values: `0` (quick scan); `1` (scheduled scan); `2` (real-time monitoring).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Source. Valid values: `0` (quick scan); `1` (scheduled scan); `2` (real-time monitoring).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceType Source. Valid values: `0` (quick scan); `1` (scheduled scan); `2` (real-time monitoring).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Event description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HarmDescribe Event description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set Event description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HarmDescribe Event description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuggestScheme Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuggestScheme Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Suspicious file name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileName Suspicious file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Suspicious file name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileName Suspicious file name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMd5 MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMd5 MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get Event type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventType Event type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventType Event type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Cluster name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodName Cluster name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Cluster name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodName Cluster name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get `DEAL_NONE`: Pending.
`DEAL_IGNORE`: Ignored.
`DEAL_ADD_WHITELIST`: Allowed.
`DEAL_DEL`: Deleted.
`DEAL_ISOLATE`: Isolated.
`DEAL_ISOLATING`: Isolating.
`DEAL_ISOLATE_FAILED`: Isolation failed.
`DEAL_RECOVERING`: Recovering.
`DEAL_RECOVER_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status `DEAL_NONE`: Pending.
`DEAL_IGNORE`: Ignored.
`DEAL_ADD_WHITELIST`: Allowed.
`DEAL_DEL`: Deleted.
`DEAL_ISOLATE`: Isolated.
`DEAL_ISOLATING`: Isolating.
`DEAL_ISOLATE_FAILED`: Isolation failed.
`DEAL_RECOVERING`: Recovering.
`DEAL_RECOVER_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set `DEAL_NONE`: Pending.
`DEAL_IGNORE`: Ignored.
`DEAL_ADD_WHITELIST`: Allowed.
`DEAL_DEL`: Deleted.
`DEAL_ISOLATE`: Isolated.
`DEAL_ISOLATING`: Isolating.
`DEAL_ISOLATE_FAILED`: Isolation failed.
`DEAL_RECOVERING`: Recovering.
`DEAL_RECOVER_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status `DEAL_NONE`: Pending.
`DEAL_IGNORE`: Ignored.
`DEAL_ADD_WHITELIST`: Allowed.
`DEAL_DEL`: Deleted.
`DEAL_ISOLATE`: Isolated.
`DEAL_ISOLATING`: Isolating.
`DEAL_ISOLATE_FAILED`: Isolation failed.
`DEAL_RECOVERING`: Recovering.
`DEAL_RECOVER_FAILED`: Recovery failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Sub-status of the failure:
`FILE_NOT_FOUND`: The file does not exist.
`FILE_ABNORMAL`: The file is abnormal.
`FILE_ABNORMAL_DEAL_RECOVER`: The file is abnormal when recovered.
`BACKUP_FILE_NOT_FOUND`: The backup file does not exist.
`CONTAINER_NOT_FOUND_DEAL_ISOLATE`: The container does not exist during isolation.
`CONTAINER_NOT_FOUND_DEAL_RECOVER`: The container does not exist during recovery.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubStatus Sub-status of the failure:
`FILE_NOT_FOUND`: The file does not exist.
`FILE_ABNORMAL`: The file is abnormal.
`FILE_ABNORMAL_DEAL_RECOVER`: The file is abnormal when recovered.
`BACKUP_FILE_NOT_FOUND`: The backup file does not exist.
`CONTAINER_NOT_FOUND_DEAL_ISOLATE`: The container does not exist during isolation.
`CONTAINER_NOT_FOUND_DEAL_RECOVER`: The container does not exist during recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Sub-status of the failure:
`FILE_NOT_FOUND`: The file does not exist.
`FILE_ABNORMAL`: The file is abnormal.
`FILE_ABNORMAL_DEAL_RECOVER`: The file is abnormal when recovered.
`BACKUP_FILE_NOT_FOUND`: The backup file does not exist.
`CONTAINER_NOT_FOUND_DEAL_ISOLATE`: The container does not exist during isolation.
`CONTAINER_NOT_FOUND_DEAL_RECOVER`: The container does not exist during recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubStatus Sub-status of the failure:
`FILE_NOT_FOUND`: The file does not exist.
`FILE_ABNORMAL`: The file is abnormal.
`FILE_ABNORMAL_DEAL_RECOVER`: The file is abnormal when recovered.
`BACKUP_FILE_NOT_FOUND`: The backup file does not exist.
`CONTAINER_NOT_FOUND_DEAL_ISOLATE`: The container does not exist during isolation.
`CONTAINER_NOT_FOUND_DEAL_RECOVER`: The container does not exist during recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
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
     * Get Parent process initiator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PProcessStartUser Parent process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPProcessStartUser() {
        return this.PProcessStartUser;
    }

    /**
     * Set Parent process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PProcessStartUser Parent process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPProcessStartUser(String PProcessStartUser) {
        this.PProcessStartUser = PProcessStartUser;
    }

    /**
     * Get User group of the parent process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PProcessUserGroup User group of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPProcessUserGroup() {
        return this.PProcessUserGroup;
    }

    /**
     * Set User group of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PProcessUserGroup User group of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPProcessUserGroup(String PProcessUserGroup) {
        this.PProcessUserGroup = PProcessUserGroup;
    }

    /**
     * Get Path of the parent process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PProcessPath Path of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPProcessPath() {
        return this.PProcessPath;
    }

    /**
     * Set Path of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PProcessPath Path of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPProcessPath(String PProcessPath) {
        this.PProcessPath = PProcessPath;
    }

    /**
     * Get Command line parameters of the parent process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PProcessParam Command line parameters of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPProcessParam() {
        return this.PProcessParam;
    }

    /**
     * Set Command line parameters of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PProcessParam Command line parameters of the parent process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPProcessParam(String PProcessParam) {
        this.PProcessParam = PProcessParam;
    }

    /**
     * Get Ancestor process initiator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AncestorProcessStartUser Ancestor process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAncestorProcessStartUser() {
        return this.AncestorProcessStartUser;
    }

    /**
     * Set Ancestor process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AncestorProcessStartUser Ancestor process initiator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAncestorProcessStartUser(String AncestorProcessStartUser) {
        this.AncestorProcessStartUser = AncestorProcessStartUser;
    }

    /**
     * Get Ancestor process user group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AncestorProcessUserGroup Ancestor process user group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAncestorProcessUserGroup() {
        return this.AncestorProcessUserGroup;
    }

    /**
     * Set Ancestor process user group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AncestorProcessUserGroup Ancestor process user group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAncestorProcessUserGroup(String AncestorProcessUserGroup) {
        this.AncestorProcessUserGroup = AncestorProcessUserGroup;
    }

    /**
     * Get Ancestor process path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AncestorProcessPath Ancestor process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAncestorProcessPath() {
        return this.AncestorProcessPath;
    }

    /**
     * Set Ancestor process path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AncestorProcessPath Ancestor process path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAncestorProcessPath(String AncestorProcessPath) {
        this.AncestorProcessPath = AncestorProcessPath;
    }

    /**
     * Get Command line parameters of the ancestor process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AncestorProcessParam Command line parameters of the ancestor process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAncestorProcessParam() {
        return this.AncestorProcessParam;
    }

    /**
     * Set Command line parameters of the ancestor process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AncestorProcessParam Command line parameters of the ancestor process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAncestorProcessParam(String AncestorProcessParam) {
        this.AncestorProcessParam = AncestorProcessParam;
    }

    /**
     * Get Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperationTime Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperationTime Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
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
     * Get Sub-status of container isolation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerNetSubStatus Sub-status of container isolation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set Sub-status of container isolation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerNetSubStatus Sub-status of container isolation
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
     * Get Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckPlatform Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckPlatform Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get File accessed time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileAccessTime File accessed time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileAccessTime() {
        return this.FileAccessTime;
    }

    /**
     * Set File accessed time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileAccessTime File accessed time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileAccessTime(String FileAccessTime) {
        this.FileAccessTime = FileAccessTime;
    }

    /**
     * Get File modified time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileModifyTime File modified time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileModifyTime() {
        return this.FileModifyTime;
    }

    /**
     * Set File modified time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileModifyTime File modified time
Note: This field may return null, indicating that no valid values can be obtained.
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

