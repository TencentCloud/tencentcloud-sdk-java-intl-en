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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Machine extends AbstractModel {

    /**
    * Host name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Host System.
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * CVM or BM Machine Unique UUID.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Host IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * Public IP address of a host
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode  </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Number of Trojans
    */
    @SerializedName("MalwareNum")
    @Expose
    private Long MalwareNum;

    /**
    * Tag information
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Number of baseline risks
    */
    @SerializedName("BaselineNum")
    @Expose
    private Long BaselineNum;

    /**
    * Number of network risks
    */
    @SerializedName("CyberAttackNum")
    @Expose
    private Long CyberAttackNum;

    /**
    * Risk status
<li>SAFE: Safe</li>
<li>RISK: Risk</li>
<li>UNKNOWN: Unknown</li>
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * Number of intrusion events
    */
    @SerializedName("InvasionNum")
    @Expose
    private Long InvasionNum;

    /**
    * Region information
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * Instance status: TERMINATED_PRO_VERSION - terminated
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether there is an available asset scanning API: 0 - no; 1 - yes
    */
    @SerializedName("HasAssetScan")
    @Expose
    private Long HasAssetScan;

    /**
    * Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Kernel version
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Protection version: BASIC_VERSION - Basic Edition; PRO_VERSION - Professional Edition; Flagship - Ultimate Edition; GENERAL_DISCOUNT - Inclusive Edition
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * Whether a host added within the last 15 days: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAddedOnTheFifteen")
    @Expose
    private Long IsAddedOnTheFifteen;

    /**
    * Host IP List
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpList")
    @Expose
    private String IpList;

    /**
    * Network
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Host name. 
     * @return MachineName Host name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name.
     * @param MachineName Host name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Host System. 
     * @return MachineOs Host System.
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set Host System.
     * @param MachineOs Host System.
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li> 
     * @return MachineStatus Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
     * @param MachineStatus Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Yunjing client UUID. If the client is offline for a long time, an empty string is returned. 
     * @return Uuid Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
     * @param Uuid Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get CVM or BM Machine Unique UUID. 
     * @return Quuid CVM or BM Machine Unique UUID.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM or BM Machine Unique UUID.
     * @param Quuid CVM or BM Machine Unique UUID.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VulNum Number of vulnerabilities
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set Number of vulnerabilities
     * @param VulNum Number of vulnerabilities
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get Host IP. 
     * @return MachineIp Host IP.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Host IP.
     * @param MachineIp Host IP.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li> 
     * @return IsProVersion Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
     * @param IsProVersion Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get Public IP address of a host 
     * @return MachineWanIp Public IP address of a host
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address of a host
     * @param MachineWanIp Public IP address of a host
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode  </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li> 
     * @return PayMode Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode  </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode  </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
     * @param PayMode Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode  </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of Trojans 
     * @return MalwareNum Number of Trojans
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set Number of Trojans
     * @param MalwareNum Number of Trojans
     */
    public void setMalwareNum(Long MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * Get Tag information 
     * @return Tag Tag information
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag information
     * @param Tag Tag information
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Number of baseline risks 
     * @return BaselineNum Number of baseline risks
     */
    public Long getBaselineNum() {
        return this.BaselineNum;
    }

    /**
     * Set Number of baseline risks
     * @param BaselineNum Number of baseline risks
     */
    public void setBaselineNum(Long BaselineNum) {
        this.BaselineNum = BaselineNum;
    }

    /**
     * Get Number of network risks 
     * @return CyberAttackNum Number of network risks
     */
    public Long getCyberAttackNum() {
        return this.CyberAttackNum;
    }

    /**
     * Set Number of network risks
     * @param CyberAttackNum Number of network risks
     */
    public void setCyberAttackNum(Long CyberAttackNum) {
        this.CyberAttackNum = CyberAttackNum;
    }

    /**
     * Get Risk status
<li>SAFE: Safe</li>
<li>RISK: Risk</li>
<li>UNKNOWN: Unknown</li> 
     * @return SecurityStatus Risk status
<li>SAFE: Safe</li>
<li>RISK: Risk</li>
<li>UNKNOWN: Unknown</li>
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set Risk status
<li>SAFE: Safe</li>
<li>RISK: Risk</li>
<li>UNKNOWN: Unknown</li>
     * @param SecurityStatus Risk status
<li>SAFE: Safe</li>
<li>RISK: Risk</li>
<li>UNKNOWN: Unknown</li>
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get Number of intrusion events 
     * @return InvasionNum Number of intrusion events
     */
    public Long getInvasionNum() {
        return this.InvasionNum;
    }

    /**
     * Set Number of intrusion events
     * @param InvasionNum Number of intrusion events
     */
    public void setInvasionNum(Long InvasionNum) {
        this.InvasionNum = InvasionNum;
    }

    /**
     * Get Region information 
     * @return RegionInfo Region information
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Region information
     * @param RegionInfo Region information
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get Instance status: TERMINATED_PRO_VERSION - terminated 
     * @return InstanceState Instance status: TERMINATED_PRO_VERSION - terminated
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status: TERMINATED_PRO_VERSION - terminated
     * @param InstanceState Instance status: TERMINATED_PRO_VERSION - terminated
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized 
     * @return LicenseStatus Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized
     * @param LicenseStatus Tamper-proof; authorization status: 1 - authorized; 0 - unauthorized
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether there is an available asset scanning API: 0 - no; 1 - yes 
     * @return HasAssetScan Whether there is an available asset scanning API: 0 - no; 1 - yes
     */
    public Long getHasAssetScan() {
        return this.HasAssetScan;
    }

    /**
     * Set Whether there is an available asset scanning API: 0 - no; 1 - yes
     * @param HasAssetScan Whether there is an available asset scanning API: 0 - no; 1 - yes
     */
    public void setHasAssetScan(Long HasAssetScan) {
        this.HasAssetScan = HasAssetScan;
    }

    /**
     * Get Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone 
     * @return MachineType Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     * @param MachineType Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Kernel version 
     * @return KernelVersion Kernel version
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set Kernel version
     * @param KernelVersion Kernel version
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get Protection version: BASIC_VERSION - Basic Edition; PRO_VERSION - Professional Edition; Flagship - Ultimate Edition; GENERAL_DISCOUNT - Inclusive Edition 
     * @return ProtectType Protection version: BASIC_VERSION - Basic Edition; PRO_VERSION - Professional Edition; Flagship - Ultimate Edition; GENERAL_DISCOUNT - Inclusive Edition
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set Protection version: BASIC_VERSION - Basic Edition; PRO_VERSION - Professional Edition; Flagship - Ultimate Edition; GENERAL_DISCOUNT - Inclusive Edition
     * @param ProtectType Protection version: BASIC_VERSION - Basic Edition; PRO_VERSION - Professional Edition; Flagship - Ultimate Edition; GENERAL_DISCOUNT - Inclusive Edition
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudTags Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudTags Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get Whether a host added within the last 15 days: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAddedOnTheFifteen Whether a host added within the last 15 days: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsAddedOnTheFifteen() {
        return this.IsAddedOnTheFifteen;
    }

    /**
     * Set Whether a host added within the last 15 days: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAddedOnTheFifteen Whether a host added within the last 15 days: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAddedOnTheFifteen(Long IsAddedOnTheFifteen) {
        this.IsAddedOnTheFifteen = IsAddedOnTheFifteen;
    }

    /**
     * Get Host IP List
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpList Host IP List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIpList() {
        return this.IpList;
    }

    /**
     * Set Host IP List
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpList Host IP List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpList(String IpList) {
        this.IpList = IpList;
    }

    /**
     * Get Network
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId Network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId Network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
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

    }
}

