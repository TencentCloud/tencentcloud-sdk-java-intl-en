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

public class PrivilegeEscalationProcess extends AbstractModel {

    /**
    * Data ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP ID.
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
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

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
    * Username.
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
    * Process tree
    */
    @SerializedName("ProcTree")
    @Expose
    private String ProcTree;

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
    * Additional information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Process id
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Alarm count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

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
     * Get CWP ID. 
     * @return Uuid CWP ID.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP ID.
     * @param Uuid CWP ID.
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
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
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
     * Get Additional information 
     * @return MachineExtraInfo Additional information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
     * @param MachineExtraInfo Additional information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Process id 
     * @return Pid Process id
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process id
     * @param Pid Process id
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Alarm count 
     * @return Count Alarm count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Alarm count
     * @param Count Alarm count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public PrivilegeEscalationProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeEscalationProcess(PrivilegeEscalationProcess source) {
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
        if (source.ProcTree != null) {
            this.ProcTree = new String(source.ProcTree);
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
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        this.setParamSimple(map, prefix + "ProcTree", this.ProcTree);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

