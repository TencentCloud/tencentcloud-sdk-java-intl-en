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

public class RiskDnsEvent extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Type of hit policy [-1: unknown|0: system|1: user]
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Name of hit policy
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Protection level [0: basic edition|1: professional edition|2: ultimate edition]
    */
    @SerializedName("ProtectLevel")
    @Expose
    private Long ProtectLevel;

    /**
    * Server ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Public IP address
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Client ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Access domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Tag Features
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Access count
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * Threat description
    */
    @SerializedName("ThreatDesc")
    @Expose
    private String ThreatDesc;

    /**
    * Fixing solution
    */
    @SerializedName("SuggestSolution")
    @Expose
    private String SuggestSolution;

    /**
    * Reference link
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * Processing status [0: pending|2: allowlisted|3: untrusted status|4: processed|5: ignored]
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * Process ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process MD5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * Command line
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * First access time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Last access Time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Host online status [OFFLINE: offline|ONLINE: online|UNKNOWN: unknown]
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * [1:CentOS|2:Debian|3:Gentoo|4:Redhat|5:Ubuntu|6:Windows|7:TencentOS|8:CoreOS|9:FreeBSD|10:SUSE]
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Type of hit policy [-1: unknown|0: system|1: user] 
     * @return PolicyType Type of hit policy [-1: unknown|0: system|1: user]
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Type of hit policy [-1: unknown|0: system|1: user]
     * @param PolicyType Type of hit policy [-1: unknown|0: system|1: user]
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Name of hit policy 
     * @return PolicyName Name of hit policy
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Name of hit policy
     * @param PolicyName Name of hit policy
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Protection level [0: basic edition|1: professional edition|2: ultimate edition] 
     * @return ProtectLevel Protection level [0: basic edition|1: professional edition|2: ultimate edition]
     */
    public Long getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set Protection level [0: basic edition|1: professional edition|2: ultimate edition]
     * @param ProtectLevel Protection level [0: basic edition|1: professional edition|2: ultimate edition]
     */
    public void setProtectLevel(Long ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get Server ID 
     * @return HostId Server ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Server ID
     * @param HostId Server ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
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
     * Get Host IP 
     * @return HostIp Host IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP
     * @param HostIp Host IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Public IP address 
     * @return WanIp Public IP address
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public IP address
     * @param WanIp Public IP address
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Client ID 
     * @return AgentId Client ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Client ID
     * @param AgentId Client ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Access domain name 
     * @return Domain Access domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Access domain name
     * @param Domain Access domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Tag Features 
     * @return Tags Tag Features
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag Features
     * @param Tags Tag Features
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Access count 
     * @return AccessCount Access count
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set Access count
     * @param AccessCount Access count
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get Threat description 
     * @return ThreatDesc Threat description
     */
    public String getThreatDesc() {
        return this.ThreatDesc;
    }

    /**
     * Set Threat description
     * @param ThreatDesc Threat description
     */
    public void setThreatDesc(String ThreatDesc) {
        this.ThreatDesc = ThreatDesc;
    }

    /**
     * Get Fixing solution 
     * @return SuggestSolution Fixing solution
     */
    public String getSuggestSolution() {
        return this.SuggestSolution;
    }

    /**
     * Set Fixing solution
     * @param SuggestSolution Fixing solution
     */
    public void setSuggestSolution(String SuggestSolution) {
        this.SuggestSolution = SuggestSolution;
    }

    /**
     * Get Reference link 
     * @return ReferenceLink Reference link
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set Reference link
     * @param ReferenceLink Reference link
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get Processing status [0: pending|2: allowlisted|3: untrusted status|4: processed|5: ignored] 
     * @return HandleStatus Processing status [0: pending|2: allowlisted|3: untrusted status|4: processed|5: ignored]
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set Processing status [0: pending|2: allowlisted|3: untrusted status|4: processed|5: ignored]
     * @param HandleStatus Processing status [0: pending|2: allowlisted|3: untrusted status|4: processed|5: ignored]
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get Process ID 
     * @return Pid Process ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
     * @param Pid Process ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
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
     * Get Process MD5 
     * @return ProcessMd5 Process MD5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set Process MD5
     * @param ProcessMd5 Process MD5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get Command line 
     * @return CmdLine Command line
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command line
     * @param CmdLine Command line
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get First access time 
     * @return FirstTime First access time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First access time
     * @param FirstTime First access time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Last access Time 
     * @return LastTime Last access Time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last access Time
     * @param LastTime Last access Time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Host online status [OFFLINE: offline|ONLINE: online|UNKNOWN: unknown] 
     * @return HostStatus Host online status [OFFLINE: offline|ONLINE: online|UNKNOWN: unknown]
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set Host online status [OFFLINE: offline|ONLINE: online|UNKNOWN: unknown]
     * @param HostStatus Host online status [OFFLINE: offline|ONLINE: online|UNKNOWN: unknown]
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
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
     * Get [1:CentOS|2:Debian|3:Gentoo|4:Redhat|5:Ubuntu|6:Windows|7:TencentOS|8:CoreOS|9:FreeBSD|10:SUSE] 
     * @return OsType [1:CentOS|2:Debian|3:Gentoo|4:Redhat|5:Ubuntu|6:Windows|7:TencentOS|8:CoreOS|9:FreeBSD|10:SUSE]
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set [1:CentOS|2:Debian|3:Gentoo|4:Redhat|5:Ubuntu|6:Windows|7:TencentOS|8:CoreOS|9:FreeBSD|10:SUSE]
     * @param OsType [1:CentOS|2:Debian|3:Gentoo|4:Redhat|5:Ubuntu|6:Windows|7:TencentOS|8:CoreOS|9:FreeBSD|10:SUSE]
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public RiskDnsEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDnsEvent(RiskDnsEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new Long(source.ProtectLevel);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.ThreatDesc != null) {
            this.ThreatDesc = new String(source.ThreatDesc);
        }
        if (source.SuggestSolution != null) {
            this.SuggestSolution = new String(source.SuggestSolution);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamSimple(map, prefix + "ThreatDesc", this.ThreatDesc);
        this.setParamSimple(map, prefix + "SuggestSolution", this.SuggestSolution);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

