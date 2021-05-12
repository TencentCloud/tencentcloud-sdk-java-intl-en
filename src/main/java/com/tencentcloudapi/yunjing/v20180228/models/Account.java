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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel{

    /**
    * Unique ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP agent `Uuid`
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
    * Account name.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Account group.
    */
    @SerializedName("Groups")
    @Expose
    private String Groups;

    /**
    * Account type.
<li>ORDINARY: ordinary account</li>
<li>SUPPER: super admin account</li>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * Account creation time.
    */
    @SerializedName("AccountCreateTime")
    @Expose
    private String AccountCreateTime;

    /**
    * Account last login time.
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

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
     * Get CWP agent `Uuid` 
     * @return Uuid CWP agent `Uuid`
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`
     * @param Uuid CWP agent `Uuid`
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
     * Get Account name. 
     * @return Username Account name.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Account name.
     * @param Username Account name.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Account group. 
     * @return Groups Account group.
     */
    public String getGroups() {
        return this.Groups;
    }

    /**
     * Set Account group.
     * @param Groups Account group.
     */
    public void setGroups(String Groups) {
        this.Groups = Groups;
    }

    /**
     * Get Account type.
<li>ORDINARY: ordinary account</li>
<li>SUPPER: super admin account</li> 
     * @return Privilege Account type.
<li>ORDINARY: ordinary account</li>
<li>SUPPER: super admin account</li>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Account type.
<li>ORDINARY: ordinary account</li>
<li>SUPPER: super admin account</li>
     * @param Privilege Account type.
<li>ORDINARY: ordinary account</li>
<li>SUPPER: super admin account</li>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Account creation time. 
     * @return AccountCreateTime Account creation time.
     */
    public String getAccountCreateTime() {
        return this.AccountCreateTime;
    }

    /**
     * Set Account creation time.
     * @param AccountCreateTime Account creation time.
     */
    public void setAccountCreateTime(String AccountCreateTime) {
        this.AccountCreateTime = AccountCreateTime;
    }

    /**
     * Get Account last login time. 
     * @return LastLoginTime Account last login time.
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set Account last login time.
     * @param LastLoginTime Account last login time.
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
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
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Groups != null) {
            this.Groups = new String(source.Groups);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.AccountCreateTime != null) {
            this.AccountCreateTime = new String(source.AccountCreateTime);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
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
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Groups", this.Groups);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "AccountCreateTime", this.AccountCreateTime);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);

    }
}

