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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Machine extends AbstractModel{

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
    * 
    */
    @SerializedName("BaselineNum")
    @Expose
    private Long BaselineNum;

    /**
    * 
    */
    @SerializedName("CyberAttackNum")
    @Expose
    private Long CyberAttackNum;

    /**
    * 
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * 
    */
    @SerializedName("InvasionNum")
    @Expose
    private Long InvasionNum;

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
     * Get  
     * @return BaselineNum 
     */
    public Long getBaselineNum() {
        return this.BaselineNum;
    }

    /**
     * Set 
     * @param BaselineNum 
     */
    public void setBaselineNum(Long BaselineNum) {
        this.BaselineNum = BaselineNum;
    }

    /**
     * Get  
     * @return CyberAttackNum 
     */
    public Long getCyberAttackNum() {
        return this.CyberAttackNum;
    }

    /**
     * Set 
     * @param CyberAttackNum 
     */
    public void setCyberAttackNum(Long CyberAttackNum) {
        this.CyberAttackNum = CyberAttackNum;
    }

    /**
     * Get  
     * @return SecurityStatus 
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set 
     * @param SecurityStatus 
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get  
     * @return InvasionNum 
     */
    public Long getInvasionNum() {
        return this.InvasionNum;
    }

    /**
     * Set 
     * @param InvasionNum 
     */
    public void setInvasionNum(Long InvasionNum) {
        this.InvasionNum = InvasionNum;
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

    }
}

