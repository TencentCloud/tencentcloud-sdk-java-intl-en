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

public class AssetProcessBaseInfo extends AbstractModel {

    /**
    * Host private IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Host public IP address
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
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Process description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Process path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

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
    * Startup time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Startup parameter
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Process TTY
    */
    @SerializedName("Tty")
    @Expose
    private String Tty;

    /**
    * Process version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Process user group
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
    * Process status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Digital signature. 0: no; 1: yes; 999: null (Windows only).
    */
    @SerializedName("HasSign")
    @Expose
    private Long HasSign;

    /**
    * Whether to install the package. 0: no; 1: yes; 999: null (Linux only).
    */
    @SerializedName("InstallByPackage")
    @Expose
    private Long InstallByPackage;

    /**
    * Software package name
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

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
    * Whether new [0: no|1: yes]
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
     * Get Host private IP address 
     * @return MachineIp Host private IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Host private IP address
     * @param MachineIp Host private IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
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
     * @return Name Process name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Process name
     * @param Name Process name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Process description 
     * @return Desc Process description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Process description
     * @param Desc Process description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Process path 
     * @return Path Process path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Process path
     * @param Path Process path
     */
    public void setPath(String Path) {
        this.Path = Path;
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
     * Get Startup time 
     * @return StartTime Startup time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Startup time
     * @param StartTime Startup time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Startup parameter 
     * @return Param Startup parameter
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Startup parameter
     * @param Param Startup parameter
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Process TTY 
     * @return Tty Process TTY
     */
    public String getTty() {
        return this.Tty;
    }

    /**
     * Set Process TTY
     * @param Tty Process TTY
     */
    public void setTty(String Tty) {
        this.Tty = Tty;
    }

    /**
     * Get Process version 
     * @return Version Process version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Process version
     * @param Version Process version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Process user group 
     * @return GroupName Process user group
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Process user group
     * @param GroupName Process user group
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
     * Get Process status 
     * @return Status Process status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Process status
     * @param Status Process status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Digital signature. 0: no; 1: yes; 999: null (Windows only). 
     * @return HasSign Digital signature. 0: no; 1: yes; 999: null (Windows only).
     */
    public Long getHasSign() {
        return this.HasSign;
    }

    /**
     * Set Digital signature. 0: no; 1: yes; 999: null (Windows only).
     * @param HasSign Digital signature. 0: no; 1: yes; 999: null (Windows only).
     */
    public void setHasSign(Long HasSign) {
        this.HasSign = HasSign;
    }

    /**
     * Get Whether to install the package. 0: no; 1: yes; 999: null (Linux only). 
     * @return InstallByPackage Whether to install the package. 0: no; 1: yes; 999: null (Linux only).
     */
    public Long getInstallByPackage() {
        return this.InstallByPackage;
    }

    /**
     * Set Whether to install the package. 0: no; 1: yes; 999: null (Linux only).
     * @param InstallByPackage Whether to install the package. 0: no; 1: yes; 999: null (Linux only).
     */
    public void setInstallByPackage(Long InstallByPackage) {
        this.InstallByPackage = InstallByPackage;
    }

    /**
     * Get Software package name 
     * @return PackageName Software package name
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Software package name
     * @param PackageName Software package name
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
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
     * Get Whether new [0: no|1: yes] 
     * @return IsNew Whether new [0: no|1: yes]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether new [0: no|1: yes]
     * @param IsNew Whether new [0: no|1: yes]
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

    public AssetProcessBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetProcessBaseInfo(AssetProcessBaseInfo source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        if (source.Tty != null) {
            this.Tty = new String(source.Tty);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.HasSign != null) {
            this.HasSign = new Long(source.HasSign);
        }
        if (source.InstallByPackage != null) {
            this.InstallByPackage = new Long(source.InstallByPackage);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Tty", this.Tty);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Ppid", this.Ppid);
        this.setParamSimple(map, prefix + "ParentProcessName", this.ParentProcessName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "HasSign", this.HasSign);
        this.setParamSimple(map, prefix + "InstallByPackage", this.InstallByPackage);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

