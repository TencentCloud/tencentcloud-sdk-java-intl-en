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

public class AssetUserBaseInfo extends AbstractModel {

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
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Operating System Information
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Account UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Account GID
    */
    @SerializedName("Gid")
    @Expose
    private String Gid;

    /**
    * Account status. 0: disabled; 1: enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether there is root permission. 0: no; 1: yes; 999: null (Linux only)
    */
    @SerializedName("IsRoot")
    @Expose
    private Long IsRoot;

    /**
    * Log-in method. 0: log-in not allowed; 1: only key-based log-in allowed; 2: only password-based log-in allowed; 3: both key-based log-in and password-based log-in allowed; 999: null (Linux only)
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
    * Last log-in time
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
    * Account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Host business group ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only)
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * Whether a domain account. 0: no; 1: yes; 2: no; 999: null (Windows only)
    */
    @SerializedName("IsDomain")
    @Expose
    private Long IsDomain;

    /**
    * Whether there is sudo permissions: 1: yes; 0: No; 999: null (Linux only)
    */
    @SerializedName("IsSudo")
    @Expose
    private Long IsSudo;

    /**
    * Whether ssh log-in allowed. 1: yes; 0: no; 999: null (Linux only)
    */
    @SerializedName("IsSshLogin")
    @Expose
    private Long IsSshLogin;

    /**
    * Home directory
    */
    @SerializedName("HomePath")
    @Expose
    private String HomePath;

    /**
    * Shell path (Linux only)
    */
    @SerializedName("Shell")
    @Expose
    private String Shell;

    /**
    * Whether shell log-in allowed. 0: no; 1: yes (Linux only)
    */
    @SerializedName("ShellLoginStatus")
    @Expose
    private Long ShellLoginStatus;

    /**
    * Password modification time
    */
    @SerializedName("PasswordChangeTime")
    @Expose
    private String PasswordChangeTime;

    /**
    * Password expiration time (Linux only)
    */
    @SerializedName("PasswordDueTime")
    @Expose
    private String PasswordDueTime;

    /**
    * Password locking time (unit: day): -1 - never locked; 999 - null (Linux only)
    */
    @SerializedName("PasswordLockDays")
    @Expose
    private Long PasswordLockDays;

    /**
    * Password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked; 999 - null (Linux only)
    */
    @SerializedName("PasswordStatus")
    @Expose
    private Long PasswordStatus;

    /**
    * Update time
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
     * Get Account UID 
     * @return Uid Account UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Account UID
     * @param Uid Account UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Account GID 
     * @return Gid Account GID
     */
    public String getGid() {
        return this.Gid;
    }

    /**
     * Set Account GID
     * @param Gid Account GID
     */
    public void setGid(String Gid) {
        this.Gid = Gid;
    }

    /**
     * Get Account status. 0: disabled; 1: enabled 
     * @return Status Account status. 0: disabled; 1: enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Account status. 0: disabled; 1: enabled
     * @param Status Account status. 0: disabled; 1: enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether there is root permission. 0: no; 1: yes; 999: null (Linux only) 
     * @return IsRoot Whether there is root permission. 0: no; 1: yes; 999: null (Linux only)
     */
    public Long getIsRoot() {
        return this.IsRoot;
    }

    /**
     * Set Whether there is root permission. 0: no; 1: yes; 999: null (Linux only)
     * @param IsRoot Whether there is root permission. 0: no; 1: yes; 999: null (Linux only)
     */
    public void setIsRoot(Long IsRoot) {
        this.IsRoot = IsRoot;
    }

    /**
     * Get Log-in method. 0: log-in not allowed; 1: only key-based log-in allowed; 2: only password-based log-in allowed; 3: both key-based log-in and password-based log-in allowed; 999: null (Linux only) 
     * @return LoginType Log-in method. 0: log-in not allowed; 1: only key-based log-in allowed; 2: only password-based log-in allowed; 3: both key-based log-in and password-based log-in allowed; 999: null (Linux only)
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set Log-in method. 0: log-in not allowed; 1: only key-based log-in allowed; 2: only password-based log-in allowed; 3: both key-based log-in and password-based log-in allowed; 999: null (Linux only)
     * @param LoginType Log-in method. 0: log-in not allowed; 1: only key-based log-in allowed; 2: only password-based log-in allowed; 3: both key-based log-in and password-based log-in allowed; 999: null (Linux only)
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get Last log-in time 
     * @return LastLoginTime Last log-in time
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set Last log-in time
     * @param LastLoginTime Last log-in time
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    /**
     * Get Account name 
     * @return Name Account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account name
     * @param Name Account name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only) 
     * @return UserType Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only)
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only)
     * @param UserType Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only)
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Whether a domain account. 0: no; 1: yes; 2: no; 999: null (Windows only) 
     * @return IsDomain Whether a domain account. 0: no; 1: yes; 2: no; 999: null (Windows only)
     */
    public Long getIsDomain() {
        return this.IsDomain;
    }

    /**
     * Set Whether a domain account. 0: no; 1: yes; 2: no; 999: null (Windows only)
     * @param IsDomain Whether a domain account. 0: no; 1: yes; 2: no; 999: null (Windows only)
     */
    public void setIsDomain(Long IsDomain) {
        this.IsDomain = IsDomain;
    }

    /**
     * Get Whether there is sudo permissions: 1: yes; 0: No; 999: null (Linux only) 
     * @return IsSudo Whether there is sudo permissions: 1: yes; 0: No; 999: null (Linux only)
     */
    public Long getIsSudo() {
        return this.IsSudo;
    }

    /**
     * Set Whether there is sudo permissions: 1: yes; 0: No; 999: null (Linux only)
     * @param IsSudo Whether there is sudo permissions: 1: yes; 0: No; 999: null (Linux only)
     */
    public void setIsSudo(Long IsSudo) {
        this.IsSudo = IsSudo;
    }

    /**
     * Get Whether ssh log-in allowed. 1: yes; 0: no; 999: null (Linux only) 
     * @return IsSshLogin Whether ssh log-in allowed. 1: yes; 0: no; 999: null (Linux only)
     */
    public Long getIsSshLogin() {
        return this.IsSshLogin;
    }

    /**
     * Set Whether ssh log-in allowed. 1: yes; 0: no; 999: null (Linux only)
     * @param IsSshLogin Whether ssh log-in allowed. 1: yes; 0: no; 999: null (Linux only)
     */
    public void setIsSshLogin(Long IsSshLogin) {
        this.IsSshLogin = IsSshLogin;
    }

    /**
     * Get Home directory 
     * @return HomePath Home directory
     */
    public String getHomePath() {
        return this.HomePath;
    }

    /**
     * Set Home directory
     * @param HomePath Home directory
     */
    public void setHomePath(String HomePath) {
        this.HomePath = HomePath;
    }

    /**
     * Get Shell path (Linux only) 
     * @return Shell Shell path (Linux only)
     */
    public String getShell() {
        return this.Shell;
    }

    /**
     * Set Shell path (Linux only)
     * @param Shell Shell path (Linux only)
     */
    public void setShell(String Shell) {
        this.Shell = Shell;
    }

    /**
     * Get Whether shell log-in allowed. 0: no; 1: yes (Linux only) 
     * @return ShellLoginStatus Whether shell log-in allowed. 0: no; 1: yes (Linux only)
     */
    public Long getShellLoginStatus() {
        return this.ShellLoginStatus;
    }

    /**
     * Set Whether shell log-in allowed. 0: no; 1: yes (Linux only)
     * @param ShellLoginStatus Whether shell log-in allowed. 0: no; 1: yes (Linux only)
     */
    public void setShellLoginStatus(Long ShellLoginStatus) {
        this.ShellLoginStatus = ShellLoginStatus;
    }

    /**
     * Get Password modification time 
     * @return PasswordChangeTime Password modification time
     */
    public String getPasswordChangeTime() {
        return this.PasswordChangeTime;
    }

    /**
     * Set Password modification time
     * @param PasswordChangeTime Password modification time
     */
    public void setPasswordChangeTime(String PasswordChangeTime) {
        this.PasswordChangeTime = PasswordChangeTime;
    }

    /**
     * Get Password expiration time (Linux only) 
     * @return PasswordDueTime Password expiration time (Linux only)
     */
    public String getPasswordDueTime() {
        return this.PasswordDueTime;
    }

    /**
     * Set Password expiration time (Linux only)
     * @param PasswordDueTime Password expiration time (Linux only)
     */
    public void setPasswordDueTime(String PasswordDueTime) {
        this.PasswordDueTime = PasswordDueTime;
    }

    /**
     * Get Password locking time (unit: day): -1 - never locked; 999 - null (Linux only) 
     * @return PasswordLockDays Password locking time (unit: day): -1 - never locked; 999 - null (Linux only)
     */
    public Long getPasswordLockDays() {
        return this.PasswordLockDays;
    }

    /**
     * Set Password locking time (unit: day): -1 - never locked; 999 - null (Linux only)
     * @param PasswordLockDays Password locking time (unit: day): -1 - never locked; 999 - null (Linux only)
     */
    public void setPasswordLockDays(Long PasswordLockDays) {
        this.PasswordLockDays = PasswordLockDays;
    }

    /**
     * Get Password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked; 999 - null (Linux only) 
     * @return PasswordStatus Password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked; 999 - null (Linux only)
     */
    public Long getPasswordStatus() {
        return this.PasswordStatus;
    }

    /**
     * Set Password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked; 999 - null (Linux only)
     * @param PasswordStatus Password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked; 999 - null (Linux only)
     */
    public void setPasswordStatus(Long PasswordStatus) {
        this.PasswordStatus = PasswordStatus;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
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

    public AssetUserBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetUserBaseInfo(AssetUserBaseInfo source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Gid != null) {
            this.Gid = new String(source.Gid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsRoot != null) {
            this.IsRoot = new Long(source.IsRoot);
        }
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.IsDomain != null) {
            this.IsDomain = new Long(source.IsDomain);
        }
        if (source.IsSudo != null) {
            this.IsSudo = new Long(source.IsSudo);
        }
        if (source.IsSshLogin != null) {
            this.IsSshLogin = new Long(source.IsSshLogin);
        }
        if (source.HomePath != null) {
            this.HomePath = new String(source.HomePath);
        }
        if (source.Shell != null) {
            this.Shell = new String(source.Shell);
        }
        if (source.ShellLoginStatus != null) {
            this.ShellLoginStatus = new Long(source.ShellLoginStatus);
        }
        if (source.PasswordChangeTime != null) {
            this.PasswordChangeTime = new String(source.PasswordChangeTime);
        }
        if (source.PasswordDueTime != null) {
            this.PasswordDueTime = new String(source.PasswordDueTime);
        }
        if (source.PasswordLockDays != null) {
            this.PasswordLockDays = new Long(source.PasswordLockDays);
        }
        if (source.PasswordStatus != null) {
            this.PasswordStatus = new Long(source.PasswordStatus);
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
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Gid", this.Gid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsRoot", this.IsRoot);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "IsDomain", this.IsDomain);
        this.setParamSimple(map, prefix + "IsSudo", this.IsSudo);
        this.setParamSimple(map, prefix + "IsSshLogin", this.IsSshLogin);
        this.setParamSimple(map, prefix + "HomePath", this.HomePath);
        this.setParamSimple(map, prefix + "Shell", this.Shell);
        this.setParamSimple(map, prefix + "ShellLoginStatus", this.ShellLoginStatus);
        this.setParamSimple(map, prefix + "PasswordChangeTime", this.PasswordChangeTime);
        this.setParamSimple(map, prefix + "PasswordDueTime", this.PasswordDueTime);
        this.setParamSimple(map, prefix + "PasswordLockDays", this.PasswordLockDays);
        this.setParamSimple(map, prefix + "PasswordStatus", this.PasswordStatus);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

