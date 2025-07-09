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

public class ReverseShellEventInfo extends AbstractModel {

    /**
    * ID primary key
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Yunjing UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host private IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

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
    * User for execution
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User group for execution
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
    * Processing status: 0: pending; 2: allowlisted; 3: processed; 4: ignored
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
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Detection method
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

    /**
    * Process tree json; pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

    /**
    * Recommended solution
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Description
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * Tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Reference link
    */
    @SerializedName("References")
    @Expose
    private String [] References;

    /**
    * Host public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host online status: OFFLINE; ONLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Processing time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

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
     * Get Yunjing UUID 
     * @return Uuid Yunjing UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Yunjing UUID
     * @param Uuid Yunjing UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host ID 
     * @return Quuid Host ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host ID
     * @param Quuid Host ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host private IP address 
     * @return HostIp Host private IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host private IP address
     * @param HostIp Host private IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
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
     * Get User for execution 
     * @return UserName User for execution
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User for execution
     * @param UserName User for execution
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User group for execution 
     * @return UserGroup User group for execution
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set User group for execution
     * @param UserGroup User group for execution
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
     * Get Processing status: 0: pending; 2: allowlisted; 3: processed; 4: ignored 
     * @return Status Processing status: 0: pending; 2: allowlisted; 3: processed; 4: ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing status: 0: pending; 2: allowlisted; 3: processed; 4: ignored
     * @param Status Processing status: 0: pending; 2: allowlisted; 3: processed; 4: ignored
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
     * Get Host name 
     * @return MachineName Host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
     * @param MachineName Host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Detection method 
     * @return DetectBy Detection method
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set Detection method
     * @param DetectBy Detection method
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    /**
     * Get Process tree json; pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PsTree Process tree json; pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set Process tree json; pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PsTree Process tree json; pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: ssh service IP, ssh_source: log-in source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
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
     * Get Description 
     * @return HarmDescribe Description
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set Description
     * @param HarmDescribe Description
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get Tag 
     * @return Tags Tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
     * @param Tags Tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Reference link 
     * @return References Reference link
     */
    public String [] getReferences() {
        return this.References;
    }

    /**
     * Set Reference link
     * @param References Reference link
     */
    public void setReferences(String [] References) {
        this.References = References;
    }

    /**
     * Get Host public IP address 
     * @return MachineWanIp Host public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Host public IP address
     * @param MachineWanIp Host public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Host online status: OFFLINE; ONLINE 
     * @return MachineStatus Host online status: OFFLINE; ONLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host online status: OFFLINE; ONLINE
     * @param MachineStatus Host online status: OFFLINE; ONLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Processing time 
     * @return ModifyTime Processing time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Processing time
     * @param ModifyTime Processing time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public ReverseShellEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellEventInfo(ReverseShellEventInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
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
        if (source.DetectBy != null) {
            this.DetectBy = new Long(source.DetectBy);
        }
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.References != null) {
            this.References = new String[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new String(source.References[i]);
            }
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
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
        this.setParamSimple(map, prefix + "DetectBy", this.DetectBy);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

