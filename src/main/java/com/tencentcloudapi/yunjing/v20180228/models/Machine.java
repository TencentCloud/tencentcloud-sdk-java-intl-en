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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Machine extends AbstractModel {

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Server OS.
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * Server status.
<li>OFFLINE: offline</li>
<li>ONLINE: online</li>
<li>MACHINE_STOPPED: shut down</li>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * CWP agent `Uuid`. If the agent is offline for a long time, a null character will be returned.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * CVM or BM instance `Uuid`.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Number of vulnerabilities.
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Server IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Whether the server has enabled CWP Pro.
<li>true: yes</li>
<li>false: no</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * Public IP of server.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Number of trojans.
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
    * Number of baseline risks.
    */
    @SerializedName("BaselineNum")
    @Expose
    private Long BaselineNum;

    /**
    * Number of network risks.
    */
    @SerializedName("CyberAttackNum")
    @Expose
    private Long CyberAttackNum;

    /**
    * Risk status.
<li>SAFE: safe</li>
<li>RISK: at risk</li>
<li>UNKNOWN: unknown</li>
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * Number of intrusions
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
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Server OS. 
     * @return MachineOs Server OS.
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set Server OS.
     * @param MachineOs Server OS.
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get Server status.
<li>OFFLINE: offline</li>
<li>ONLINE: online</li>
<li>MACHINE_STOPPED: shut down</li> 
     * @return MachineStatus Server status.
<li>OFFLINE: offline</li>
<li>ONLINE: online</li>
<li>MACHINE_STOPPED: shut down</li>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Server status.
<li>OFFLINE: offline</li>
<li>ONLINE: online</li>
<li>MACHINE_STOPPED: shut down</li>
     * @param MachineStatus Server status.
<li>OFFLINE: offline</li>
<li>ONLINE: online</li>
<li>MACHINE_STOPPED: shut down</li>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get CWP agent `Uuid`. If the agent is offline for a long time, a null character will be returned. 
     * @return Uuid CWP agent `Uuid`. If the agent is offline for a long time, a null character will be returned.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`. If the agent is offline for a long time, a null character will be returned.
     * @param Uuid CWP agent `Uuid`. If the agent is offline for a long time, a null character will be returned.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get CVM or BM instance `Uuid`. 
     * @return Quuid CVM or BM instance `Uuid`.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM or BM instance `Uuid`.
     * @param Quuid CVM or BM instance `Uuid`.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Number of vulnerabilities. 
     * @return VulNum Number of vulnerabilities.
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set Number of vulnerabilities.
     * @param VulNum Number of vulnerabilities.
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get Server IP. 
     * @return MachineIp Server IP.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Server IP.
     * @param MachineIp Server IP.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Whether the server has enabled CWP Pro.
<li>true: yes</li>
<li>false: no</li> 
     * @return IsProVersion Whether the server has enabled CWP Pro.
<li>true: yes</li>
<li>false: no</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether the server has enabled CWP Pro.
<li>true: yes</li>
<li>false: no</li>
     * @param IsProVersion Whether the server has enabled CWP Pro.
<li>true: yes</li>
<li>false: no</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get Public IP of server. 
     * @return MachineWanIp Public IP of server.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP of server.
     * @param MachineWanIp Public IP of server.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li> 
     * @return PayMode Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
     * @param PayMode Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of trojans. 
     * @return MalwareNum Number of trojans.
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set Number of trojans.
     * @param MalwareNum Number of trojans.
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
     * Get Number of baseline risks. 
     * @return BaselineNum Number of baseline risks.
     */
    public Long getBaselineNum() {
        return this.BaselineNum;
    }

    /**
     * Set Number of baseline risks.
     * @param BaselineNum Number of baseline risks.
     */
    public void setBaselineNum(Long BaselineNum) {
        this.BaselineNum = BaselineNum;
    }

    /**
     * Get Number of network risks. 
     * @return CyberAttackNum Number of network risks.
     */
    public Long getCyberAttackNum() {
        return this.CyberAttackNum;
    }

    /**
     * Set Number of network risks.
     * @param CyberAttackNum Number of network risks.
     */
    public void setCyberAttackNum(Long CyberAttackNum) {
        this.CyberAttackNum = CyberAttackNum;
    }

    /**
     * Get Risk status.
<li>SAFE: safe</li>
<li>RISK: at risk</li>
<li>UNKNOWN: unknown</li> 
     * @return SecurityStatus Risk status.
<li>SAFE: safe</li>
<li>RISK: at risk</li>
<li>UNKNOWN: unknown</li>
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set Risk status.
<li>SAFE: safe</li>
<li>RISK: at risk</li>
<li>UNKNOWN: unknown</li>
     * @param SecurityStatus Risk status.
<li>SAFE: safe</li>
<li>RISK: at risk</li>
<li>UNKNOWN: unknown</li>
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get Number of intrusions 
     * @return InvasionNum Number of intrusions
     */
    public Long getInvasionNum() {
        return this.InvasionNum;
    }

    /**
     * Set Number of intrusions
     * @param InvasionNum Number of intrusions
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

    }
}

