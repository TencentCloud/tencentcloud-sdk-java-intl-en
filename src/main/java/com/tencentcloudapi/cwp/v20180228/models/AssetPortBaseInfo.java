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

public class AssetPortBaseInfo extends AbstractModel {

    /**
    * Private IP address of the host
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
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Operating System Information
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * Host business group ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Host tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Process version
    */
    @SerializedName("ProcessVersion")
    @Expose
    private String ProcessVersion;

    /**
    * Process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Process ID
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * Running user
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Start parameter
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Process TTY
    */
    @SerializedName("Teletype")
    @Expose
    private String Teletype;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * User group
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Process MD5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Parent process ID
    */
    @SerializedName("Ppid")
    @Expose
    private String Ppid;

    /**
    * Parent process name
    */
    @SerializedName("ParentProcessName")
    @Expose
    private String ParentProcessName;

    /**
    * Port protocol
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Bound IP
    */
    @SerializedName("BindIp")
    @Expose
    private String BindIp;

    /**
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * First collection time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Whether to add [0: no | 1: yes]
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Private IP address of the host 
     * @return MachineIp Private IP address of the host
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP address of the host
     * @param MachineIp Private IP address of the host
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
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Operating System Information 
     * @return OsInfo Operating System Information
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set Operating System Information
     * @param OsInfo Operating System Information
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get Host business group ID 
     * @return ProjectId Host business group ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Host business group ID
     * @param ProjectId Host business group ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Host tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tag Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tag Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
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
     * Get Process version 
     * @return ProcessVersion Process version
     */
    public String getProcessVersion() {
        return this.ProcessVersion;
    }

    /**
     * Set Process version
     * @param ProcessVersion Process version
     */
    public void setProcessVersion(String ProcessVersion) {
        this.ProcessVersion = ProcessVersion;
    }

    /**
     * Get Process path 
     * @return ProcessPath Process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
     * @param ProcessPath Process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Process ID 
     * @return Pid Process ID
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
     * @param Pid Process ID
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Running user 
     * @return User Running user
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Running user
     * @param User Running user
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Start parameter 
     * @return Param Start parameter
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Start parameter
     * @param Param Start parameter
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Process TTY 
     * @return Teletype Process TTY
     */
    public String getTeletype() {
        return this.Teletype;
    }

    /**
     * Set Process TTY
     * @param Teletype Process TTY
     */
    public void setTeletype(String Teletype) {
        this.Teletype = Teletype;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get User group 
     * @return GroupName User group
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User group
     * @param GroupName User group
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Process MD5 
     * @return Md5 Process MD5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Process MD5
     * @param Md5 Process MD5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Parent process ID 
     * @return Ppid Parent process ID
     */
    public String getPpid() {
        return this.Ppid;
    }

    /**
     * Set Parent process ID
     * @param Ppid Parent process ID
     */
    public void setPpid(String Ppid) {
        this.Ppid = Ppid;
    }

    /**
     * Get Parent process name 
     * @return ParentProcessName Parent process name
     */
    public String getParentProcessName() {
        return this.ParentProcessName;
    }

    /**
     * Set Parent process name
     * @param ParentProcessName Parent process name
     */
    public void setParentProcessName(String ParentProcessName) {
        this.ParentProcessName = ParentProcessName;
    }

    /**
     * Get Port protocol 
     * @return Proto Port protocol
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Port protocol
     * @param Proto Port protocol
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Bound IP 
     * @return BindIp Bound IP
     */
    public String getBindIp() {
        return this.BindIp;
    }

    /**
     * Set Bound IP
     * @param BindIp Bound IP
     */
    public void setBindIp(String BindIp) {
        this.BindIp = BindIp;
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
     * Get Data update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get First collection time 
     * @return FirstTime First collection time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First collection time
     * @param FirstTime First collection time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Whether to add [0: no | 1: yes] 
     * @return IsNew Whether to add [0: no | 1: yes]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether to add [0: no | 1: yes]
     * @param IsNew Whether to add [0: no | 1: yes]
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
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

    public AssetPortBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetPortBaseInfo(AssetPortBaseInfo source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessVersion != null) {
            this.ProcessVersion = new String(source.ProcessVersion);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Teletype != null) {
            this.Teletype = new String(source.Teletype);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Ppid != null) {
            this.Ppid = new String(source.Ppid);
        }
        if (source.ParentProcessName != null) {
            this.ParentProcessName = new String(source.ParentProcessName);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.BindIp != null) {
            this.BindIp = new String(source.BindIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessVersion", this.ProcessVersion);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Teletype", this.Teletype);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Ppid", this.Ppid);
        this.setParamSimple(map, prefix + "ParentProcessName", this.ParentProcessName);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "BindIp", this.BindIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

