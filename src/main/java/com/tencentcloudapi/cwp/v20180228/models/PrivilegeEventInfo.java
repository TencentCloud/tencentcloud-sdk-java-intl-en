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

public class PrivilegeEventInfo extends AbstractModel {

    /**
    * Data ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Yunjing ID
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
    * Execute commands
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User group
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * Process file permission
    */
    @SerializedName("ProcFilePrivilege")
    @Expose
    private String ProcFilePrivilege;

    /**
    * Parent process name
    */
    @SerializedName("ParentProcName")
    @Expose
    private String ParentProcName;

    /**
    * Parent process username
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
    * Process tree json pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: SSH service IP; ssh_source: log-in source
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

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
    * Machine name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Recommended solution
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Hazard description information
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
    * Permission list (Separate multiple items with |.)
    */
    @SerializedName("NewCaps")
    @Expose
    private String NewCaps;

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
     * Get Data ID 
     * @return Id Data ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Data ID
     * @param Id Data ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Yunjing ID 
     * @return Uuid Yunjing ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Yunjing ID
     * @param Uuid Yunjing ID
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
     * Get Execute commands 
     * @return CmdLine Execute commands
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Execute commands
     * @param CmdLine Execute commands
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User group 
     * @return UserGroup User group
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set User group
     * @param UserGroup User group
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get Process file permission 
     * @return ProcFilePrivilege Process file permission
     */
    public String getProcFilePrivilege() {
        return this.ProcFilePrivilege;
    }

    /**
     * Set Process file permission
     * @param ProcFilePrivilege Process file permission
     */
    public void setProcFilePrivilege(String ProcFilePrivilege) {
        this.ProcFilePrivilege = ProcFilePrivilege;
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
     * Get Parent process username 
     * @return ParentProcUser Parent process username
     */
    public String getParentProcUser() {
        return this.ParentProcUser;
    }

    /**
     * Set Parent process username
     * @param ParentProcUser Parent process username
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
     * Get Process tree json pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: SSH service IP; ssh_source: log-in source 
     * @return PsTree Process tree json pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: SSH service IP; ssh_source: log-in source
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set Process tree json pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: SSH service IP; ssh_source: log-in source
     * @param PsTree Process tree json pid: process ID; exe: file path; account: groups and users to which the process belongs; cmdline: execute commands; ssh_service: SSH service IP; ssh_source: log-in source
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
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
     * Get Machine name 
     * @return MachineName Machine name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Machine name
     * @param MachineName Machine name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
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
     * Get Hazard description information 
     * @return HarmDescribe Hazard description information
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set Hazard description information
     * @param HarmDescribe Hazard description information
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
     * Get Permission list (Separate multiple items with |.) 
     * @return NewCaps Permission list (Separate multiple items with |.)
     */
    public String getNewCaps() {
        return this.NewCaps;
    }

    /**
     * Set Permission list (Separate multiple items with |.)
     * @param NewCaps Permission list (Separate multiple items with |.)
     */
    public void setNewCaps(String NewCaps) {
        this.NewCaps = NewCaps;
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

    public PrivilegeEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeEventInfo(PrivilegeEventInfo source) {
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
        if (source.ProcFilePrivilege != null) {
            this.ProcFilePrivilege = new String(source.ProcFilePrivilege);
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
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
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
        if (source.NewCaps != null) {
            this.NewCaps = new String(source.NewCaps);
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
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "ProcFilePrivilege", this.ProcFilePrivilege);
        this.setParamSimple(map, prefix + "ParentProcName", this.ParentProcName);
        this.setParamSimple(map, prefix + "ParentProcUser", this.ParentProcUser);
        this.setParamSimple(map, prefix + "ParentProcGroup", this.ParentProcGroup);
        this.setParamSimple(map, prefix + "ParentProcPath", this.ParentProcPath);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "NewCaps", this.NewCaps);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

