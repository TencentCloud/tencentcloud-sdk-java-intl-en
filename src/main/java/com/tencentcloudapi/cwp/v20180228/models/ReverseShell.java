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

public class ReverseShell extends AbstractModel {

    /**
    * ID primary key
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWPP UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Server ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host private IP address
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * Target IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process path
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
    * Command details
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Executing user
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Executing user group
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * Parent process name
    */
    @SerializedName("ParentProcName")
    @Expose
    private String ParentProcName;

    /**
    * Parent process user
    */
    @SerializedName("ParentProcUser")
    @Expose
    private String ParentProcUser;

    /**
    * Parent process user group
    */
    @SerializedName("ParentProcGroup")
    @Expose
    private String ParentProcGroup;

    /**
    * Parent process path
    */
    @SerializedName("ParentProcPath")
    @Expose
    private String ParentProcPath;

    /**
    * Processing status: 0 - pending; 2 - allowlisted; 3 - processed; 4 - ignored
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Occurrence time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Process tree
    */
    @SerializedName("ProcTree")
    @Expose
    private String ProcTree;

    /**
    * Detection method: 0: behavior analysis; 1 command feature detection
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

    /**
    *  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Process ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Threat level: 0 - medium-risk; 1 - high-risk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
     * Get ID primary key 
     * @return Id ID primary key
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID primary key
     * @param Id ID primary key
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWPP UUID 
     * @return Uuid CWPP UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP UUID
     * @param Uuid CWPP UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Server ID 
     * @return Quuid Server ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server ID
     * @param Quuid Server ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host private IP address 
     * @return Hostip Host private IP address
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set Host private IP address
     * @param Hostip Host private IP address
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Get Target IP 
     * @return DstIp Target IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Target IP
     * @param DstIp Target IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get Target port 
     * @return DstPort Target port
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port
     * @param DstPort Target port
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
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
     * @return FullPath Process path
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set Process path
     * @param FullPath Process path
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    /**
     * Get Command details 
     * @return CmdLine Command details
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command details
     * @param CmdLine Command details
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Executing user 
     * @return UserName Executing user
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Executing user
     * @param UserName Executing user
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Executing user group 
     * @return UserGroup Executing user group
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set Executing user group
     * @param UserGroup Executing user group
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get Parent process name 
     * @return ParentProcName Parent process name
     */
    public String getParentProcName() {
        return this.ParentProcName;
    }

    /**
     * Set Parent process name
     * @param ParentProcName Parent process name
     */
    public void setParentProcName(String ParentProcName) {
        this.ParentProcName = ParentProcName;
    }

    /**
     * Get Parent process user 
     * @return ParentProcUser Parent process user
     */
    public String getParentProcUser() {
        return this.ParentProcUser;
    }

    /**
     * Set Parent process user
     * @param ParentProcUser Parent process user
     */
    public void setParentProcUser(String ParentProcUser) {
        this.ParentProcUser = ParentProcUser;
    }

    /**
     * Get Parent process user group 
     * @return ParentProcGroup Parent process user group
     */
    public String getParentProcGroup() {
        return this.ParentProcGroup;
    }

    /**
     * Set Parent process user group
     * @param ParentProcGroup Parent process user group
     */
    public void setParentProcGroup(String ParentProcGroup) {
        this.ParentProcGroup = ParentProcGroup;
    }

    /**
     * Get Parent process path 
     * @return ParentProcPath Parent process path
     */
    public String getParentProcPath() {
        return this.ParentProcPath;
    }

    /**
     * Set Parent process path
     * @param ParentProcPath Parent process path
     */
    public void setParentProcPath(String ParentProcPath) {
        this.ParentProcPath = ParentProcPath;
    }

    /**
     * Get Processing status: 0 - pending; 2 - allowlisted; 3 - processed; 4 - ignored 
     * @return Status Processing status: 0 - pending; 2 - allowlisted; 3 - processed; 4 - ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing status: 0 - pending; 2 - allowlisted; 3 - processed; 4 - ignored
     * @param Status Processing status: 0 - pending; 2 - allowlisted; 3 - processed; 4 - ignored
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Occurrence time 
     * @return CreateTime Occurrence time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Occurrence time
     * @param CreateTime Occurrence time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Server name 
     * @return MachineName Server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
     * @param MachineName Server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Process tree 
     * @return ProcTree Process tree
     */
    public String getProcTree() {
        return this.ProcTree;
    }

    /**
     * Set Process tree
     * @param ProcTree Process tree
     */
    public void setProcTree(String ProcTree) {
        this.ProcTree = ProcTree;
    }

    /**
     * Get Detection method: 0: behavior analysis; 1 command feature detection 
     * @return DetectBy Detection method: 0: behavior analysis; 1 command feature detection
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set Detection method: 0: behavior analysis; 1 command feature detection
     * @param DetectBy Detection method: 0: behavior analysis; 1 command feature detection
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    /**
     * Get  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo  Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Process ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pid Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pid Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Threat level: 0 - medium-risk; 1 - high-risk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Threat level: 0 - medium-risk; 1 - high-risk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Threat level: 0 - medium-risk; 1 - high-risk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Threat level: 0 - medium-risk; 1 - high-risk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    public ReverseShell() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShell(ReverseShell source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.ParentProcName != null) {
            this.ParentProcName = new String(source.ParentProcName);
        }
        if (source.ParentProcUser != null) {
            this.ParentProcUser = new String(source.ParentProcUser);
        }
        if (source.ParentProcGroup != null) {
            this.ParentProcGroup = new String(source.ParentProcGroup);
        }
        if (source.ParentProcPath != null) {
            this.ParentProcPath = new String(source.ParentProcPath);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.ProcTree != null) {
            this.ProcTree = new String(source.ProcTree);
        }
        if (source.DetectBy != null) {
            this.DetectBy = new Long(source.DetectBy);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "ParentProcName", this.ParentProcName);
        this.setParamSimple(map, prefix + "ParentProcUser", this.ParentProcUser);
        this.setParamSimple(map, prefix + "ParentProcGroup", this.ParentProcGroup);
        this.setParamSimple(map, prefix + "ParentProcPath", this.ParentProcPath);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "ProcTree", this.ProcTree);
        this.setParamSimple(map, prefix + "DetectBy", this.DetectBy);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

