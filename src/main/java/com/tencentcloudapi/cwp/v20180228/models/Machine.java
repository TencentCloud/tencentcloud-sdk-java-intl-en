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

public class Machine extends AbstractModel {

    /**
    * <p>Host name.</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Host operating system.</p>
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * <p>Host status. <li>OFFLINE: Offline</li> <li>ONLINE: Online</li> <li>SHUTDOWN: Shut down</li> <li>UNINSTALLED: Unprotected</li></p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>ONLINE: Protected; OFFLINE: Offline; UNINSTALLED: Not installed</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>RUNNING: Running; STOPED: Shut down; EXPIRED: Pending reclamation</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>CWP Uuid. Returns an empty string if the client is offline long-term.</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Unique Uuid of a CVM or BM machine.</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Number of vulnerabilities.</p>
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * <p>Host IP.</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>Whether the host is Pro Edition.</p><li>true: Yes</li><li>false: No</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * <p>Host public IP.</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>Host status.</p><li>POSTPAY: Postpaid (pay-as-you-go)</li><li>PREPAY: Prepaid (monthly or yearly subscription)</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Number of trojans.</p>
    */
    @SerializedName("MalwareNum")
    @Expose
    private Long MalwareNum;

    /**
    * <p>Tag information</p>
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * <p>Number of baseline risks.</p>
    */
    @SerializedName("BaselineNum")
    @Expose
    private Long BaselineNum;

    /**
    * <p>Number of network risks.</p>
    */
    @SerializedName("CyberAttackNum")
    @Expose
    private Long CyberAttackNum;

    /**
    * <p>Risk status.</p><li>SAFE: Safe</li><li>RISK: Risk</li><li>UNKNOWN: Unknown</li>
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * <p>Number of intrusion events</p>
    */
    @SerializedName("InvasionNum")
    @Expose
    private Long InvasionNum;

    /**
    * <p>Region information</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>Instance status. TERMINATED_PRO_VERSION: terminated.</p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * <p>Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized</p>
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Whether the asset scanning API is available. 0: No; 1: Yes</p>
    */
    @SerializedName("HasAssetScan")
    @Expose
    private Long HasAssetScan;

    /**
    * <p>Machine zone type. CVM: Cloud Virtual Machine; BM: Blackstone; ECM: Edge Computing Machine; LH: Lighthouse; Other: Hybrid cloud zone</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>Kernel version</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>Protection edition: BASIC_VERSION: Basic Edition; PRO_VERSION: Pro Edition; Flagship: Ultimate Edition; GENERAL_DISCOUNT: Lighthouse Edition</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>Cloud tag information</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * <p>Whether the host was added within the last 15 days. 0: No; 1: Yes</p>
    */
    @SerializedName("IsAddedOnTheFifteen")
    @Expose
    private Long IsAddedOnTheFifteen;

    /**
    * <p>Host IP list</p>
    */
    @SerializedName("IpList")
    @Expose
    private String IpList;

    /**
    * <p>Network</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Additional information</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Remarks</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>CWP agent version</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>APPID of the machine</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>CSC paid edition</p>
    */
    @SerializedName("CSIPProtectType")
    @Expose
    private String CSIPProtectType;

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
     * Get <p>Host operating system.</p> 
     * @return MachineOs <p>Host operating system.</p>
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set <p>Host operating system.</p>
     * @param MachineOs <p>Host operating system.</p>
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get <p>Host status. <li>OFFLINE: Offline</li> <li>ONLINE: Online</li> <li>SHUTDOWN: Shut down</li> <li>UNINSTALLED: Unprotected</li></p> 
     * @return MachineStatus <p>Host status. <li>OFFLINE: Offline</li> <li>ONLINE: Online</li> <li>SHUTDOWN: Shut down</li> <li>UNINSTALLED: Unprotected</li></p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>Host status. <li>OFFLINE: Offline</li> <li>ONLINE: Online</li> <li>SHUTDOWN: Shut down</li> <li>UNINSTALLED: Unprotected</li></p>
     * @param MachineStatus <p>Host status. <li>OFFLINE: Offline</li> <li>ONLINE: Online</li> <li>SHUTDOWN: Shut down</li> <li>UNINSTALLED: Unprotected</li></p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>ONLINE: Protected; OFFLINE: Offline; UNINSTALLED: Not installed</p> 
     * @return AgentStatus <p>ONLINE: Protected; OFFLINE: Offline; UNINSTALLED: Not installed</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>ONLINE: Protected; OFFLINE: Offline; UNINSTALLED: Not installed</p>
     * @param AgentStatus <p>ONLINE: Protected; OFFLINE: Offline; UNINSTALLED: Not installed</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>RUNNING: Running; STOPED: Shut down; EXPIRED: Pending reclamation</p> 
     * @return InstanceStatus <p>RUNNING: Running; STOPED: Shut down; EXPIRED: Pending reclamation</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>RUNNING: Running; STOPED: Shut down; EXPIRED: Pending reclamation</p>
     * @param InstanceStatus <p>RUNNING: Running; STOPED: Shut down; EXPIRED: Pending reclamation</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>CWP Uuid. Returns an empty string if the client is offline long-term.</p> 
     * @return Uuid <p>CWP Uuid. Returns an empty string if the client is offline long-term.</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>CWP Uuid. Returns an empty string if the client is offline long-term.</p>
     * @param Uuid <p>CWP Uuid. Returns an empty string if the client is offline long-term.</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Unique Uuid of a CVM or BM machine.</p> 
     * @return Quuid <p>Unique Uuid of a CVM or BM machine.</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Unique Uuid of a CVM or BM machine.</p>
     * @param Quuid <p>Unique Uuid of a CVM or BM machine.</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Number of vulnerabilities.</p> 
     * @return VulNum <p>Number of vulnerabilities.</p>
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set <p>Number of vulnerabilities.</p>
     * @param VulNum <p>Number of vulnerabilities.</p>
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get <p>Host IP.</p> 
     * @return MachineIp <p>Host IP.</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Host IP.</p>
     * @param MachineIp <p>Host IP.</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>Whether the host is Pro Edition.</p><li>true: Yes</li><li>false: No</li> 
     * @return IsProVersion <p>Whether the host is Pro Edition.</p><li>true: Yes</li><li>false: No</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set <p>Whether the host is Pro Edition.</p><li>true: Yes</li><li>false: No</li>
     * @param IsProVersion <p>Whether the host is Pro Edition.</p><li>true: Yes</li><li>false: No</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get <p>Host public IP.</p> 
     * @return MachineWanIp <p>Host public IP.</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>Host public IP.</p>
     * @param MachineWanIp <p>Host public IP.</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>Host status.</p><li>POSTPAY: Postpaid (pay-as-you-go)</li><li>PREPAY: Prepaid (monthly or yearly subscription)</li> 
     * @return PayMode <p>Host status.</p><li>POSTPAY: Postpaid (pay-as-you-go)</li><li>PREPAY: Prepaid (monthly or yearly subscription)</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Host status.</p><li>POSTPAY: Postpaid (pay-as-you-go)</li><li>PREPAY: Prepaid (monthly or yearly subscription)</li>
     * @param PayMode <p>Host status.</p><li>POSTPAY: Postpaid (pay-as-you-go)</li><li>PREPAY: Prepaid (monthly or yearly subscription)</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Number of trojans.</p> 
     * @return MalwareNum <p>Number of trojans.</p>
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set <p>Number of trojans.</p>
     * @param MalwareNum <p>Number of trojans.</p>
     */
    public void setMalwareNum(Long MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * Get <p>Tag information</p> 
     * @return Tag <p>Tag information</p>
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Tag information</p>
     * @param Tag <p>Tag information</p>
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Number of baseline risks.</p> 
     * @return BaselineNum <p>Number of baseline risks.</p>
     */
    public Long getBaselineNum() {
        return this.BaselineNum;
    }

    /**
     * Set <p>Number of baseline risks.</p>
     * @param BaselineNum <p>Number of baseline risks.</p>
     */
    public void setBaselineNum(Long BaselineNum) {
        this.BaselineNum = BaselineNum;
    }

    /**
     * Get <p>Number of network risks.</p> 
     * @return CyberAttackNum <p>Number of network risks.</p>
     */
    public Long getCyberAttackNum() {
        return this.CyberAttackNum;
    }

    /**
     * Set <p>Number of network risks.</p>
     * @param CyberAttackNum <p>Number of network risks.</p>
     */
    public void setCyberAttackNum(Long CyberAttackNum) {
        this.CyberAttackNum = CyberAttackNum;
    }

    /**
     * Get <p>Risk status.</p><li>SAFE: Safe</li><li>RISK: Risk</li><li>UNKNOWN: Unknown</li> 
     * @return SecurityStatus <p>Risk status.</p><li>SAFE: Safe</li><li>RISK: Risk</li><li>UNKNOWN: Unknown</li>
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set <p>Risk status.</p><li>SAFE: Safe</li><li>RISK: Risk</li><li>UNKNOWN: Unknown</li>
     * @param SecurityStatus <p>Risk status.</p><li>SAFE: Safe</li><li>RISK: Risk</li><li>UNKNOWN: Unknown</li>
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get <p>Number of intrusion events</p> 
     * @return InvasionNum <p>Number of intrusion events</p>
     */
    public Long getInvasionNum() {
        return this.InvasionNum;
    }

    /**
     * Set <p>Number of intrusion events</p>
     * @param InvasionNum <p>Number of intrusion events</p>
     */
    public void setInvasionNum(Long InvasionNum) {
        this.InvasionNum = InvasionNum;
    }

    /**
     * Get <p>Region information</p> 
     * @return RegionInfo <p>Region information</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>Region information</p>
     * @param RegionInfo <p>Region information</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>Instance status. TERMINATED_PRO_VERSION: terminated.</p> 
     * @return InstanceState <p>Instance status. TERMINATED_PRO_VERSION: terminated.</p>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>Instance status. TERMINATED_PRO_VERSION: terminated.</p>
     * @param InstanceState <p>Instance status. TERMINATED_PRO_VERSION: terminated.</p>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get <p>Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized</p> 
     * @return LicenseStatus <p>Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized</p>
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set <p>Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized</p>
     * @param LicenseStatus <p>Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized</p>
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
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
     * Get <p>Whether the asset scanning API is available. 0: No; 1: Yes</p> 
     * @return HasAssetScan <p>Whether the asset scanning API is available. 0: No; 1: Yes</p>
     */
    public Long getHasAssetScan() {
        return this.HasAssetScan;
    }

    /**
     * Set <p>Whether the asset scanning API is available. 0: No; 1: Yes</p>
     * @param HasAssetScan <p>Whether the asset scanning API is available. 0: No; 1: Yes</p>
     */
    public void setHasAssetScan(Long HasAssetScan) {
        this.HasAssetScan = HasAssetScan;
    }

    /**
     * Get <p>Machine zone type. CVM: Cloud Virtual Machine; BM: Blackstone; ECM: Edge Computing Machine; LH: Lighthouse; Other: Hybrid cloud zone</p> 
     * @return MachineType <p>Machine zone type. CVM: Cloud Virtual Machine; BM: Blackstone; ECM: Edge Computing Machine; LH: Lighthouse; Other: Hybrid cloud zone</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>Machine zone type. CVM: Cloud Virtual Machine; BM: Blackstone; ECM: Edge Computing Machine; LH: Lighthouse; Other: Hybrid cloud zone</p>
     * @param MachineType <p>Machine zone type. CVM: Cloud Virtual Machine; BM: Blackstone; ECM: Edge Computing Machine; LH: Lighthouse; Other: Hybrid cloud zone</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
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
     * Get <p>Protection edition: BASIC_VERSION: Basic Edition; PRO_VERSION: Pro Edition; Flagship: Ultimate Edition; GENERAL_DISCOUNT: Lighthouse Edition</p> 
     * @return ProtectType <p>Protection edition: BASIC_VERSION: Basic Edition; PRO_VERSION: Pro Edition; Flagship: Ultimate Edition; GENERAL_DISCOUNT: Lighthouse Edition</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>Protection edition: BASIC_VERSION: Basic Edition; PRO_VERSION: Pro Edition; Flagship: Ultimate Edition; GENERAL_DISCOUNT: Lighthouse Edition</p>
     * @param ProtectType <p>Protection edition: BASIC_VERSION: Basic Edition; PRO_VERSION: Pro Edition; Flagship: Ultimate Edition; GENERAL_DISCOUNT: Lighthouse Edition</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>Cloud tag information</p> 
     * @return CloudTags <p>Cloud tag information</p>
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>Cloud tag information</p>
     * @param CloudTags <p>Cloud tag information</p>
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>Whether the host was added within the last 15 days. 0: No; 1: Yes</p> 
     * @return IsAddedOnTheFifteen <p>Whether the host was added within the last 15 days. 0: No; 1: Yes</p>
     */
    public Long getIsAddedOnTheFifteen() {
        return this.IsAddedOnTheFifteen;
    }

    /**
     * Set <p>Whether the host was added within the last 15 days. 0: No; 1: Yes</p>
     * @param IsAddedOnTheFifteen <p>Whether the host was added within the last 15 days. 0: No; 1: Yes</p>
     */
    public void setIsAddedOnTheFifteen(Long IsAddedOnTheFifteen) {
        this.IsAddedOnTheFifteen = IsAddedOnTheFifteen;
    }

    /**
     * Get <p>Host IP list</p> 
     * @return IpList <p>Host IP list</p>
     */
    public String getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>Host IP list</p>
     * @param IpList <p>Host IP list</p>
     */
    public void setIpList(String IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>Network</p> 
     * @return VpcId <p>Network</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Network</p>
     * @param VpcId <p>Network</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Additional information</p> 
     * @return MachineExtraInfo <p>Additional information</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>Additional information</p>
     * @param MachineExtraInfo <p>Additional information</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Remarks</p> 
     * @return Remark <p>Remarks</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks</p>
     * @param Remark <p>Remarks</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>CWP agent version</p> 
     * @return AgentVersion <p>CWP agent version</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>CWP agent version</p>
     * @param AgentVersion <p>CWP agent version</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>APPID of the machine</p> 
     * @return AppId <p>APPID of the machine</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID of the machine</p>
     * @param AppId <p>APPID of the machine</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>CSC paid edition</p> 
     * @return CSIPProtectType <p>CSC paid edition</p>
     */
    public String getCSIPProtectType() {
        return this.CSIPProtectType;
    }

    /**
     * Set <p>CSC paid edition</p>
     * @param CSIPProtectType <p>CSC paid edition</p>
     */
    public void setCSIPProtectType(String CSIPProtectType) {
        this.CSIPProtectType = CSIPProtectType;
    }

    public Machine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Machine(Machine source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.MalwareNum != null) {
            this.MalwareNum = new Long(source.MalwareNum);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.BaselineNum != null) {
            this.BaselineNum = new Long(source.BaselineNum);
        }
        if (source.CyberAttackNum != null) {
            this.CyberAttackNum = new Long(source.CyberAttackNum);
        }
        if (source.SecurityStatus != null) {
            this.SecurityStatus = new String(source.SecurityStatus);
        }
        if (source.InvasionNum != null) {
            this.InvasionNum = new Long(source.InvasionNum);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new Long(source.LicenseStatus);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.HasAssetScan != null) {
            this.HasAssetScan = new Long(source.HasAssetScan);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.IsAddedOnTheFifteen != null) {
            this.IsAddedOnTheFifteen = new Long(source.IsAddedOnTheFifteen);
        }
        if (source.IpList != null) {
            this.IpList = new String(source.IpList);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CSIPProtectType != null) {
            this.CSIPProtectType = new String(source.CSIPProtectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "MalwareNum", this.MalwareNum);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "BaselineNum", this.BaselineNum);
        this.setParamSimple(map, prefix + "CyberAttackNum", this.CyberAttackNum);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);
        this.setParamSimple(map, prefix + "InvasionNum", this.InvasionNum);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "HasAssetScan", this.HasAssetScan);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "IsAddedOnTheFifteen", this.IsAddedOnTheFifteen);
        this.setParamSimple(map, prefix + "IpList", this.IpList);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CSIPProtectType", this.CSIPProtectType);

    }
}

