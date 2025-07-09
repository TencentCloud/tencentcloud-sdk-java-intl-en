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

public class ScreenMachine extends AbstractModel {

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
    * Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Status of a host on the large screen. 0: agent not installed; 1: offline; 2: offline - risky; 3: offline - critical;
4: device installed - normal; 5: device installed - normal and of either Pro Edition or Ultimate Edition; 6: device installed - risky (network attack events > 0);
7: device installed - risky (network attack events > 0) and of either Pro Edition or Ultimate Edition; 8: device installed - critical (intrusion detection events > 0);
9: device installed - critical (intrusion detection events > 0) and of either Pro Edition or Ultimate Edition
    */
    @SerializedName("MachineStatus")
    @Expose
    private Long MachineStatus;

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
    * Public IP address of the host
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

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
    * Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * CPU load status
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * Number of CPU cores
    */
    @SerializedName("CpuSize")
    @Expose
    private Float CpuSize;

    /**
    * Hard disk utilization (%)
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * Hard disk capacity (GB)
    */
    @SerializedName("DiskSize")
    @Expose
    private Float DiskSize;

    /**
    * Memory utilization (%)
    */
    @SerializedName("MemLoad")
    @Expose
    private String MemLoad;

    /**
    * Memory capacity (GB)
    */
    @SerializedName("MemSize")
    @Expose
    private Float MemSize;

    /**
    * Kernel version
    */
    @SerializedName("CoreVersion")
    @Expose
    private String CoreVersion;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

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
     * Get Status of a host on the large screen. 0: agent not installed; 1: offline; 2: offline - risky; 3: offline - critical;
4: device installed - normal; 5: device installed - normal and of either Pro Edition or Ultimate Edition; 6: device installed - risky (network attack events > 0);
7: device installed - risky (network attack events > 0) and of either Pro Edition or Ultimate Edition; 8: device installed - critical (intrusion detection events > 0);
9: device installed - critical (intrusion detection events > 0) and of either Pro Edition or Ultimate Edition 
     * @return MachineStatus Status of a host on the large screen. 0: agent not installed; 1: offline; 2: offline - risky; 3: offline - critical;
4: device installed - normal; 5: device installed - normal and of either Pro Edition or Ultimate Edition; 6: device installed - risky (network attack events > 0);
7: device installed - risky (network attack events > 0) and of either Pro Edition or Ultimate Edition; 8: device installed - critical (intrusion detection events > 0);
9: device installed - critical (intrusion detection events > 0) and of either Pro Edition or Ultimate Edition
     */
    public Long getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Status of a host on the large screen. 0: agent not installed; 1: offline; 2: offline - risky; 3: offline - critical;
4: device installed - normal; 5: device installed - normal and of either Pro Edition or Ultimate Edition; 6: device installed - risky (network attack events > 0);
7: device installed - risky (network attack events > 0) and of either Pro Edition or Ultimate Edition; 8: device installed - critical (intrusion detection events > 0);
9: device installed - critical (intrusion detection events > 0) and of either Pro Edition or Ultimate Edition
     * @param MachineStatus Status of a host on the large screen. 0: agent not installed; 1: offline; 2: offline - risky; 3: offline - critical;
4: device installed - normal; 5: device installed - normal and of either Pro Edition or Ultimate Edition; 6: device installed - risky (network attack events > 0);
7: device installed - risky (network attack events > 0) and of either Pro Edition or Ultimate Edition; 8: device installed - critical (intrusion detection events > 0);
9: device installed - critical (intrusion detection events > 0) and of either Pro Edition or Ultimate Edition
     */
    public void setMachineStatus(Long MachineStatus) {
        this.MachineStatus = MachineStatus;
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
     * Get Public IP address of the host 
     * @return MachineWanIp Public IP address of the host
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address of the host
     * @param MachineWanIp Public IP address of the host
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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
     * Get CPU load status 
     * @return CpuLoad CPU load status
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set CPU load status
     * @param CpuLoad CPU load status
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get Number of CPU cores 
     * @return CpuSize Number of CPU cores
     */
    public Float getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set Number of CPU cores
     * @param CpuSize Number of CPU cores
     */
    public void setCpuSize(Float CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get Hard disk utilization (%) 
     * @return DiskLoad Hard disk utilization (%)
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set Hard disk utilization (%)
     * @param DiskLoad Hard disk utilization (%)
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get Hard disk capacity (GB) 
     * @return DiskSize Hard disk capacity (GB)
     */
    public Float getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Hard disk capacity (GB)
     * @param DiskSize Hard disk capacity (GB)
     */
    public void setDiskSize(Float DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Memory utilization (%) 
     * @return MemLoad Memory utilization (%)
     */
    public String getMemLoad() {
        return this.MemLoad;
    }

    /**
     * Set Memory utilization (%)
     * @param MemLoad Memory utilization (%)
     */
    public void setMemLoad(String MemLoad) {
        this.MemLoad = MemLoad;
    }

    /**
     * Get Memory capacity (GB) 
     * @return MemSize Memory capacity (GB)
     */
    public Float getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory capacity (GB)
     * @param MemSize Memory capacity (GB)
     */
    public void setMemSize(Float MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Kernel version 
     * @return CoreVersion Kernel version
     */
    public String getCoreVersion() {
        return this.CoreVersion;
    }

    /**
     * Set Kernel version
     * @param CoreVersion Kernel version
     */
    public void setCoreVersion(String CoreVersion) {
        this.CoreVersion = CoreVersion;
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

    public ScreenMachine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenMachine(ScreenMachine source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new Long(source.MachineStatus);
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
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
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
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Float(source.CpuSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Float(source.DiskSize);
        }
        if (source.MemLoad != null) {
            this.MemLoad = new String(source.MemLoad);
        }
        if (source.MemSize != null) {
            this.MemSize = new Float(source.MemSize);
        }
        if (source.CoreVersion != null) {
            this.CoreVersion = new String(source.CoreVersion);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "BaselineNum", this.BaselineNum);
        this.setParamSimple(map, prefix + "CyberAttackNum", this.CyberAttackNum);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);
        this.setParamSimple(map, prefix + "InvasionNum", this.InvasionNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MemLoad", this.MemLoad);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "CoreVersion", this.CoreVersion);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

