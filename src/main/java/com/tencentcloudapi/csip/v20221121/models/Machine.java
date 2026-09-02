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

public class Machine extends AbstractModel {

    /**
    * <p>Agent status. Valid values: ONLINE: online; OFFLINE: offline; UNINSTALL: not installed</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Agent version</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>Account AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cloud service provider</p>
    */
    @SerializedName("CloudFromEnum")
    @Expose
    private String CloudFromEnum;

    /**
    * <p>Cloud tag list</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private Tag [] CloudTags;

    /**
    * <p>CSIP protection type. Value: BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition</p>
    */
    @SerializedName("CsipProtectType")
    @Expose
    private String CsipProtectType;

    /**
    * <p>Exposure status</p>
    */
    @SerializedName("ExposedStatus")
    @Expose
    private String ExposedStatus;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Instance status. Value: RUNNING-running, STOPPED-shut down, EXPIRED-pending recycling</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Network Card IP List</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * <p>Whether it is a new host (added within 15 days)</p>
    */
    @SerializedName("IsNew")
    @Expose
    private Boolean IsNew;

    /**
    * <p>Kernel version</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>Last offline time (Unix timestamp).</p>
    */
    @SerializedName("LatestOfflineTime")
    @Expose
    private Long LatestOfflineTime;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Operating system.</p>
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * <p>Public IP address.</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>Payment mode. Valid values: PREPAID: prepaid; POSTPAID: postpaid</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Protection type. Value: NONE: no protection; BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition; PRO_LH: lightweight edition</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>Host unique identifier</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Region information.</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Asset tag list</p>
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * <p>Tag change information</p>
    */
    @SerializedName("TagModifyInfo")
    @Expose
    private AssetTagModifyAssetItem TagModifyInfo;

    /**
    * <p>TAT status. Valid values: ONLINE: online; OFFLINE: offline</p>
    */
    @SerializedName("TatStatus")
    @Expose
    private String TatStatus;

    /**
    * <p>Agent unique ID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
    */
    @SerializedName("ContainerDefendStatus")
    @Expose
    private String ContainerDefendStatus;

    /**
    * <p>Container count</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * <p>Number of cores.</p>
    */
    @SerializedName("CpuCoreCount")
    @Expose
    private Long CpuCoreCount;

    /**
    * <p>Whether migration is supported</p>
    */
    @SerializedName("MigrationRequired")
    @Expose
    private Boolean MigrationRequired;

    /**
    * <p>Whether exposed surface scan is supported</p>
    */
    @SerializedName("IsSupportXSPM")
    @Expose
    private Boolean IsSupportXSPM;

    /**
    * <p>Whether it can be unbound</p>
    */
    @SerializedName("CanUnbind")
    @Expose
    private Boolean CanUnbind;

    /**
     * Get <p>Agent status. Valid values: ONLINE: online; OFFLINE: offline; UNINSTALL: not installed</p> 
     * @return AgentStatus <p>Agent status. Valid values: ONLINE: online; OFFLINE: offline; UNINSTALL: not installed</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>Agent status. Valid values: ONLINE: online; OFFLINE: offline; UNINSTALL: not installed</p>
     * @param AgentStatus <p>Agent status. Valid values: ONLINE: online; OFFLINE: offline; UNINSTALL: not installed</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Agent version</p> 
     * @return AgentVersion <p>Agent version</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>Agent version</p>
     * @param AgentVersion <p>Agent version</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>Account AppId</p> 
     * @return AppId <p>Account AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account AppId</p>
     * @param AppId <p>Account AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cloud service provider</p> 
     * @return CloudFromEnum <p>Cloud service provider</p>
     */
    public String getCloudFromEnum() {
        return this.CloudFromEnum;
    }

    /**
     * Set <p>Cloud service provider</p>
     * @param CloudFromEnum <p>Cloud service provider</p>
     */
    public void setCloudFromEnum(String CloudFromEnum) {
        this.CloudFromEnum = CloudFromEnum;
    }

    /**
     * Get <p>Cloud tag list</p> 
     * @return CloudTags <p>Cloud tag list</p>
     */
    public Tag [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>Cloud tag list</p>
     * @param CloudTags <p>Cloud tag list</p>
     */
    public void setCloudTags(Tag [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>CSIP protection type. Value: BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition</p> 
     * @return CsipProtectType <p>CSIP protection type. Value: BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition</p>
     */
    public String getCsipProtectType() {
        return this.CsipProtectType;
    }

    /**
     * Set <p>CSIP protection type. Value: BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition</p>
     * @param CsipProtectType <p>CSIP protection type. Value: BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition</p>
     */
    public void setCsipProtectType(String CsipProtectType) {
        this.CsipProtectType = CsipProtectType;
    }

    /**
     * Get <p>Exposure status</p> 
     * @return ExposedStatus <p>Exposure status</p>
     */
    public String getExposedStatus() {
        return this.ExposedStatus;
    }

    /**
     * Set <p>Exposure status</p>
     * @param ExposedStatus <p>Exposure status</p>
     */
    public void setExposedStatus(String ExposedStatus) {
        this.ExposedStatus = ExposedStatus;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceID <p>Instance ID.</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceID <p>Instance ID.</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Instance status. Value: RUNNING-running, STOPPED-shut down, EXPIRED-pending recycling</p> 
     * @return InstanceStatus <p>Instance status. Value: RUNNING-running, STOPPED-shut down, EXPIRED-pending recycling</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status. Value: RUNNING-running, STOPPED-shut down, EXPIRED-pending recycling</p>
     * @param InstanceStatus <p>Instance status. Value: RUNNING-running, STOPPED-shut down, EXPIRED-pending recycling</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Network Card IP List</p> 
     * @return IpList <p>Network Card IP List</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>Network Card IP List</p>
     * @param IpList <p>Network Card IP List</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>Whether it is a new host (added within 15 days)</p> 
     * @return IsNew <p>Whether it is a new host (added within 15 days)</p>
     */
    public Boolean getIsNew() {
        return this.IsNew;
    }

    /**
     * Set <p>Whether it is a new host (added within 15 days)</p>
     * @param IsNew <p>Whether it is a new host (added within 15 days)</p>
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get <p>Kernel version</p> 
     * @return KernelVersion <p>Kernel version</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>Kernel version</p>
     * @param KernelVersion <p>Kernel version</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>Last offline time (Unix timestamp).</p> 
     * @return LatestOfflineTime <p>Last offline time (Unix timestamp).</p>
     */
    public Long getLatestOfflineTime() {
        return this.LatestOfflineTime;
    }

    /**
     * Set <p>Last offline time (Unix timestamp).</p>
     * @param LatestOfflineTime <p>Last offline time (Unix timestamp).</p>
     */
    public void setLatestOfflineTime(Long LatestOfflineTime) {
        this.LatestOfflineTime = LatestOfflineTime;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return MachineIp <p>Private IP address.</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param MachineIp <p>Private IP address.</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>Host name.</p> 
     * @return MachineName <p>Host name.</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Host name.</p>
     * @param MachineName <p>Host name.</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Operating system.</p> 
     * @return MachineOs <p>Operating system.</p>
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set <p>Operating system.</p>
     * @param MachineOs <p>Operating system.</p>
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get <p>Public IP address.</p> 
     * @return MachineWanIp <p>Public IP address.</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>Public IP address.</p>
     * @param MachineWanIp <p>Public IP address.</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>Payment mode. Valid values: PREPAID: prepaid; POSTPAID: postpaid</p> 
     * @return PayMode <p>Payment mode. Valid values: PREPAID: prepaid; POSTPAID: postpaid</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode. Valid values: PREPAID: prepaid; POSTPAID: postpaid</p>
     * @param PayMode <p>Payment mode. Valid values: PREPAID: prepaid; POSTPAID: postpaid</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Protection type. Value: NONE: no protection; BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition; PRO_LH: lightweight edition</p> 
     * @return ProtectType <p>Protection type. Value: NONE: no protection; BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition; PRO_LH: lightweight edition</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>Protection type. Value: NONE: no protection; BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition; PRO_LH: lightweight edition</p>
     * @param ProtectType <p>Protection type. Value: NONE: no protection; BASIC: basic version; PRO: pro edition; ULTIMATE: flagship edition; PRO_LH: lightweight edition</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>Host unique identifier</p> 
     * @return Quuid <p>Host unique identifier</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host unique identifier</p>
     * @param Quuid <p>Host unique identifier</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Region information.</p> 
     * @return RegionInfo <p>Region information.</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>Region information.</p>
     * @param RegionInfo <p>Region information.</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Asset tag list</p> 
     * @return TagItems <p>Asset tag list</p>
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>Asset tag list</p>
     * @param TagItems <p>Asset tag list</p>
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>Tag change information</p> 
     * @return TagModifyInfo <p>Tag change information</p>
     */
    public AssetTagModifyAssetItem getTagModifyInfo() {
        return this.TagModifyInfo;
    }

    /**
     * Set <p>Tag change information</p>
     * @param TagModifyInfo <p>Tag change information</p>
     */
    public void setTagModifyInfo(AssetTagModifyAssetItem TagModifyInfo) {
        this.TagModifyInfo = TagModifyInfo;
    }

    /**
     * Get <p>TAT status. Valid values: ONLINE: online; OFFLINE: offline</p> 
     * @return TatStatus <p>TAT status. Valid values: ONLINE: online; OFFLINE: offline</p>
     */
    public String getTatStatus() {
        return this.TatStatus;
    }

    /**
     * Set <p>TAT status. Valid values: ONLINE: online; OFFLINE: offline</p>
     * @param TatStatus <p>TAT status. Valid values: ONLINE: online; OFFLINE: offline</p>
     */
    public void setTatStatus(String TatStatus) {
        this.TatStatus = TatStatus;
    }

    /**
     * Get <p>Agent unique ID</p> 
     * @return Uuid <p>Agent unique ID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Agent unique ID</p>
     * @param Uuid <p>Agent unique ID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul> 
     * @return NodeType <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
     * @param NodeType <p>Host node type</p><p>Enumeration values:</p><ul><li>NONE: Host node</li><li>CLUSTER: Cluster node</li><li>CONTAINER: Container node</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul> 
     * @return ContainerDefendStatus <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
     */
    public String getContainerDefendStatus() {
        return this.ContainerDefendStatus;
    }

    /**
     * Set <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
     * @param ContainerDefendStatus <p>Container protection status</p><p>Enumeration values:</p><ul><li>Enabled: Enable protection</li><li>Disabled: Disable protection</li><li>Unknown: Unknown</li></ul>
     */
    public void setContainerDefendStatus(String ContainerDefendStatus) {
        this.ContainerDefendStatus = ContainerDefendStatus;
    }

    /**
     * Get <p>Container count</p> 
     * @return ContainerCount <p>Container count</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>Container count</p>
     * @param ContainerCount <p>Container count</p>
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get <p>Number of cores.</p> 
     * @return CpuCoreCount <p>Number of cores.</p>
     */
    public Long getCpuCoreCount() {
        return this.CpuCoreCount;
    }

    /**
     * Set <p>Number of cores.</p>
     * @param CpuCoreCount <p>Number of cores.</p>
     */
    public void setCpuCoreCount(Long CpuCoreCount) {
        this.CpuCoreCount = CpuCoreCount;
    }

    /**
     * Get <p>Whether migration is supported</p> 
     * @return MigrationRequired <p>Whether migration is supported</p>
     */
    public Boolean getMigrationRequired() {
        return this.MigrationRequired;
    }

    /**
     * Set <p>Whether migration is supported</p>
     * @param MigrationRequired <p>Whether migration is supported</p>
     */
    public void setMigrationRequired(Boolean MigrationRequired) {
        this.MigrationRequired = MigrationRequired;
    }

    /**
     * Get <p>Whether exposed surface scan is supported</p> 
     * @return IsSupportXSPM <p>Whether exposed surface scan is supported</p>
     */
    public Boolean getIsSupportXSPM() {
        return this.IsSupportXSPM;
    }

    /**
     * Set <p>Whether exposed surface scan is supported</p>
     * @param IsSupportXSPM <p>Whether exposed surface scan is supported</p>
     */
    public void setIsSupportXSPM(Boolean IsSupportXSPM) {
        this.IsSupportXSPM = IsSupportXSPM;
    }

    /**
     * Get <p>Whether it can be unbound</p> 
     * @return CanUnbind <p>Whether it can be unbound</p>
     */
    public Boolean getCanUnbind() {
        return this.CanUnbind;
    }

    /**
     * Set <p>Whether it can be unbound</p>
     * @param CanUnbind <p>Whether it can be unbound</p>
     */
    public void setCanUnbind(Boolean CanUnbind) {
        this.CanUnbind = CanUnbind;
    }

    public Machine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Machine(Machine source) {
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CloudFromEnum != null) {
            this.CloudFromEnum = new String(source.CloudFromEnum);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tag[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tag(source.CloudTags[i]);
            }
        }
        if (source.CsipProtectType != null) {
            this.CsipProtectType = new String(source.CsipProtectType);
        }
        if (source.ExposedStatus != null) {
            this.ExposedStatus = new String(source.ExposedStatus);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.IsNew != null) {
            this.IsNew = new Boolean(source.IsNew);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.LatestOfflineTime != null) {
            this.LatestOfflineTime = new Long(source.LatestOfflineTime);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagItems != null) {
            this.TagItems = new MiniTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new MiniTagItem(source.TagItems[i]);
            }
        }
        if (source.TagModifyInfo != null) {
            this.TagModifyInfo = new AssetTagModifyAssetItem(source.TagModifyInfo);
        }
        if (source.TatStatus != null) {
            this.TatStatus = new String(source.TatStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ContainerDefendStatus != null) {
            this.ContainerDefendStatus = new String(source.ContainerDefendStatus);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.CpuCoreCount != null) {
            this.CpuCoreCount = new Long(source.CpuCoreCount);
        }
        if (source.MigrationRequired != null) {
            this.MigrationRequired = new Boolean(source.MigrationRequired);
        }
        if (source.IsSupportXSPM != null) {
            this.IsSupportXSPM = new Boolean(source.IsSupportXSPM);
        }
        if (source.CanUnbind != null) {
            this.CanUnbind = new Boolean(source.CanUnbind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CloudFromEnum", this.CloudFromEnum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "CsipProtectType", this.CsipProtectType);
        this.setParamSimple(map, prefix + "ExposedStatus", this.ExposedStatus);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "LatestOfflineTime", this.LatestOfflineTime);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamObj(map, prefix + "TagModifyInfo.", this.TagModifyInfo);
        this.setParamSimple(map, prefix + "TatStatus", this.TatStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ContainerDefendStatus", this.ContainerDefendStatus);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "CpuCoreCount", this.CpuCoreCount);
        this.setParamSimple(map, prefix + "MigrationRequired", this.MigrationRequired);
        this.setParamSimple(map, prefix + "IsSupportXSPM", this.IsSupportXSPM);
        this.setParamSimple(map, prefix + "CanUnbind", this.CanUnbind);

    }
}

