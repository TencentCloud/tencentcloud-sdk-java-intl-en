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

public class AssetUserDetail extends AbstractModel {

    /**
    * Host private IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

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
    * Account status. 0: disabled; 1: enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether there is root permission. 0: no; 1: yes; 999: null (Linux only).
    */
    @SerializedName("IsRoot")
    @Expose
    private Long IsRoot;

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
    * Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only).
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * Whether the account is a domain account. 0: no; 1: yes; 999: null (Windows only).
    */
    @SerializedName("IsDomain")
    @Expose
    private Long IsDomain;

    /**
    * Whether SSH log-in allowed. 1: yes; 0: no; 999: null (Linux only).
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
    * Whether shell log-in allowed. 0: no; 1: yes (Linux only).
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
    * Password locking time (unit: day). -1: never locked; 999: null (Linux only).
    */
    @SerializedName("PasswordLockDays")
    @Expose
    private Long PasswordLockDays;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * User group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Account expiration time
    */
    @SerializedName("DisableTime")
    @Expose
    private String DisableTime;

    /**
    * Last log-in terminal
    */
    @SerializedName("LastLoginTerminal")
    @Expose
    private String LastLoginTerminal;

    /**
    * Last log-in location
    */
    @SerializedName("LastLoginLoc")
    @Expose
    private String LastLoginLoc;

    /**
    * Last log-in IP address
    */
    @SerializedName("LastLoginIp")
    @Expose
    private String LastLoginIp;

    /**
    * Password expiration reminder, in days
    */
    @SerializedName("PasswordWarnDays")
    @Expose
    private Long PasswordWarnDays;

    /**
    * Password change settings. 0: not allowed; 1: allowed.
    */
    @SerializedName("PasswordChangeType")
    @Expose
    private Long PasswordChangeType;

    /**
    * User public key listNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private AssetUserKeyInfo [] Keys;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get Account status. 0: disabled; 1: enabled. 
     * @return Status Account status. 0: disabled; 1: enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Account status. 0: disabled; 1: enabled.
     * @param Status Account status. 0: disabled; 1: enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether there is root permission. 0: no; 1: yes; 999: null (Linux only). 
     * @return IsRoot Whether there is root permission. 0: no; 1: yes; 999: null (Linux only).
     */
    public Long getIsRoot() {
        return this.IsRoot;
    }

    /**
     * Set Whether there is root permission. 0: no; 1: yes; 999: null (Linux only).
     * @param IsRoot Whether there is root permission. 0: no; 1: yes; 999: null (Linux only).
     */
    public void setIsRoot(Long IsRoot) {
        this.IsRoot = IsRoot;
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
     * Get Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only). 
     * @return UserType Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only).
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only).
     * @param UserType Account type. 0: guest user; 1: standard user; 2: administrator user; 999: null (Windows only).
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Whether the account is a domain account. 0: no; 1: yes; 999: null (Windows only). 
     * @return IsDomain Whether the account is a domain account. 0: no; 1: yes; 999: null (Windows only).
     */
    public Long getIsDomain() {
        return this.IsDomain;
    }

    /**
     * Set Whether the account is a domain account. 0: no; 1: yes; 999: null (Windows only).
     * @param IsDomain Whether the account is a domain account. 0: no; 1: yes; 999: null (Windows only).
     */
    public void setIsDomain(Long IsDomain) {
        this.IsDomain = IsDomain;
    }

    /**
     * Get Whether SSH log-in allowed. 1: yes; 0: no; 999: null (Linux only). 
     * @return IsSshLogin Whether SSH log-in allowed. 1: yes; 0: no; 999: null (Linux only).
     */
    public Long getIsSshLogin() {
        return this.IsSshLogin;
    }

    /**
     * Set Whether SSH log-in allowed. 1: yes; 0: no; 999: null (Linux only).
     * @param IsSshLogin Whether SSH log-in allowed. 1: yes; 0: no; 999: null (Linux only).
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
     * Get Whether shell log-in allowed. 0: no; 1: yes (Linux only). 
     * @return ShellLoginStatus Whether shell log-in allowed. 0: no; 1: yes (Linux only).
     */
    public Long getShellLoginStatus() {
        return this.ShellLoginStatus;
    }

    /**
     * Set Whether shell log-in allowed. 0: no; 1: yes (Linux only).
     * @param ShellLoginStatus Whether shell log-in allowed. 0: no; 1: yes (Linux only).
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
     * Get Password locking time (unit: day). -1: never locked; 999: null (Linux only). 
     * @return PasswordLockDays Password locking time (unit: day). -1: never locked; 999: null (Linux only).
     */
    public Long getPasswordLockDays() {
        return this.PasswordLockDays;
    }

    /**
     * Set Password locking time (unit: day). -1: never locked; 999: null (Linux only).
     * @param PasswordLockDays Password locking time (unit: day). -1: never locked; 999: null (Linux only).
     */
    public void setPasswordLockDays(Long PasswordLockDays) {
        this.PasswordLockDays = PasswordLockDays;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get User group name 
     * @return GroupName User group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User group name
     * @param GroupName User group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Account expiration time 
     * @return DisableTime Account expiration time
     */
    public String getDisableTime() {
        return this.DisableTime;
    }

    /**
     * Set Account expiration time
     * @param DisableTime Account expiration time
     */
    public void setDisableTime(String DisableTime) {
        this.DisableTime = DisableTime;
    }

    /**
     * Get Last log-in terminal 
     * @return LastLoginTerminal Last log-in terminal
     */
    public String getLastLoginTerminal() {
        return this.LastLoginTerminal;
    }

    /**
     * Set Last log-in terminal
     * @param LastLoginTerminal Last log-in terminal
     */
    public void setLastLoginTerminal(String LastLoginTerminal) {
        this.LastLoginTerminal = LastLoginTerminal;
    }

    /**
     * Get Last log-in location 
     * @return LastLoginLoc Last log-in location
     */
    public String getLastLoginLoc() {
        return this.LastLoginLoc;
    }

    /**
     * Set Last log-in location
     * @param LastLoginLoc Last log-in location
     */
    public void setLastLoginLoc(String LastLoginLoc) {
        this.LastLoginLoc = LastLoginLoc;
    }

    /**
     * Get Last log-in IP address 
     * @return LastLoginIp Last log-in IP address
     */
    public String getLastLoginIp() {
        return this.LastLoginIp;
    }

    /**
     * Set Last log-in IP address
     * @param LastLoginIp Last log-in IP address
     */
    public void setLastLoginIp(String LastLoginIp) {
        this.LastLoginIp = LastLoginIp;
    }

    /**
     * Get Password expiration reminder, in days 
     * @return PasswordWarnDays Password expiration reminder, in days
     */
    public Long getPasswordWarnDays() {
        return this.PasswordWarnDays;
    }

    /**
     * Set Password expiration reminder, in days
     * @param PasswordWarnDays Password expiration reminder, in days
     */
    public void setPasswordWarnDays(Long PasswordWarnDays) {
        this.PasswordWarnDays = PasswordWarnDays;
    }

    /**
     * Get Password change settings. 0: not allowed; 1: allowed. 
     * @return PasswordChangeType Password change settings. 0: not allowed; 1: allowed.
     */
    public Long getPasswordChangeType() {
        return this.PasswordChangeType;
    }

    /**
     * Set Password change settings. 0: not allowed; 1: allowed.
     * @param PasswordChangeType Password change settings. 0: not allowed; 1: allowed.
     */
    public void setPasswordChangeType(Long PasswordChangeType) {
        this.PasswordChangeType = PasswordChangeType;
    }

    /**
     * Get User public key listNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Keys User public key listNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetUserKeyInfo [] getKeys() {
        return this.Keys;
    }

    /**
     * Set User public key listNote: This field may return null, indicating that no valid values can be obtained.
     * @param Keys User public key listNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(AssetUserKeyInfo [] Keys) {
        this.Keys = Keys;
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

    public AssetUserDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetUserDetail(AssetUserDetail source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
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
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.IsDomain != null) {
            this.IsDomain = new Long(source.IsDomain);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.DisableTime != null) {
            this.DisableTime = new String(source.DisableTime);
        }
        if (source.LastLoginTerminal != null) {
            this.LastLoginTerminal = new String(source.LastLoginTerminal);
        }
        if (source.LastLoginLoc != null) {
            this.LastLoginLoc = new String(source.LastLoginLoc);
        }
        if (source.LastLoginIp != null) {
            this.LastLoginIp = new String(source.LastLoginIp);
        }
        if (source.PasswordWarnDays != null) {
            this.PasswordWarnDays = new Long(source.PasswordWarnDays);
        }
        if (source.PasswordChangeType != null) {
            this.PasswordChangeType = new Long(source.PasswordChangeType);
        }
        if (source.Keys != null) {
            this.Keys = new AssetUserKeyInfo[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new AssetUserKeyInfo(source.Keys[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Gid", this.Gid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsRoot", this.IsRoot);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "IsDomain", this.IsDomain);
        this.setParamSimple(map, prefix + "IsSshLogin", this.IsSshLogin);
        this.setParamSimple(map, prefix + "HomePath", this.HomePath);
        this.setParamSimple(map, prefix + "Shell", this.Shell);
        this.setParamSimple(map, prefix + "ShellLoginStatus", this.ShellLoginStatus);
        this.setParamSimple(map, prefix + "PasswordChangeTime", this.PasswordChangeTime);
        this.setParamSimple(map, prefix + "PasswordDueTime", this.PasswordDueTime);
        this.setParamSimple(map, prefix + "PasswordLockDays", this.PasswordLockDays);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "DisableTime", this.DisableTime);
        this.setParamSimple(map, prefix + "LastLoginTerminal", this.LastLoginTerminal);
        this.setParamSimple(map, prefix + "LastLoginLoc", this.LastLoginLoc);
        this.setParamSimple(map, prefix + "LastLoginIp", this.LastLoginIp);
        this.setParamSimple(map, prefix + "PasswordWarnDays", this.PasswordWarnDays);
        this.setParamSimple(map, prefix + "PasswordChangeType", this.PasswordChangeType);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

