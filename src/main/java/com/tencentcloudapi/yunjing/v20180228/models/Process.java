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

public class Process extends AbstractModel {

    /**
    * Unique ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP agent `UUID`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP of server.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Process `Pid`.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Process `Ppid`.
    */
    @SerializedName("Ppid")
    @Expose
    private Long Ppid;

    /**
    * Process name.
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * OS.
<li>WIN32: Windows 32-bit</li>
<li>WIN64: Windows 64-bit</li>
<li>LINUX32: Linux 32-bit</li>
<li>LINUX64: Linux 64-bit</li>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Process path.
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Unique ID. 
     * @return Id Unique ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID.
     * @param Id Unique ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWP agent `UUID`. 
     * @return Uuid CWP agent `UUID`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `UUID`.
     * @param Uuid CWP agent `UUID`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP of server. 
     * @return MachineIp Private IP of server.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP of server.
     * @param MachineIp Private IP of server.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

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
     * Get Process `Pid`. 
     * @return Pid Process `Pid`.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process `Pid`.
     * @param Pid Process `Pid`.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Process `Ppid`. 
     * @return Ppid Process `Ppid`.
     */
    public Long getPpid() {
        return this.Ppid;
    }

    /**
     * Set Process `Ppid`.
     * @param Ppid Process `Ppid`.
     */
    public void setPpid(Long Ppid) {
        this.Ppid = Ppid;
    }

    /**
     * Get Process name. 
     * @return ProcessName Process name.
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name.
     * @param ProcessName Process name.
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Process username. 
     * @return Username Process username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Process username.
     * @param Username Process username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get OS.
<li>WIN32: Windows 32-bit</li>
<li>WIN64: Windows 64-bit</li>
<li>LINUX32: Linux 32-bit</li>
<li>LINUX64: Linux 64-bit</li> 
     * @return Platform OS.
<li>WIN32: Windows 32-bit</li>
<li>WIN64: Windows 64-bit</li>
<li>LINUX32: Linux 32-bit</li>
<li>LINUX64: Linux 64-bit</li>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set OS.
<li>WIN32: Windows 32-bit</li>
<li>WIN64: Windows 64-bit</li>
<li>LINUX32: Linux 32-bit</li>
<li>LINUX64: Linux 64-bit</li>
     * @param Platform OS.
<li>WIN32: Windows 32-bit</li>
<li>WIN64: Windows 64-bit</li>
<li>LINUX32: Linux 32-bit</li>
<li>LINUX64: Linux 64-bit</li>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Process path. 
     * @return FullPath Process path.
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set Process path.
     * @param FullPath Process path.
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Process() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Process(Process source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Ppid != null) {
            this.Ppid = new Long(source.Ppid);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Ppid", this.Ppid);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

