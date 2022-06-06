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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountCreateInfo extends AbstractModel{

    /**
    * Instance username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Instance password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * List of database permissions
    */
    @SerializedName("DBPrivileges")
    @Expose
    private DBPrivilege [] DBPrivileges;

    /**
    * Account remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether it is an admin account. Default value: no
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
    * Valid values: `win-windows authentication`, `sql-sqlserver authentication`. Default value: `sql-sqlserver authentication`.
    */
    @SerializedName("Authentication")
    @Expose
    private String Authentication;

    /**
     * Get Instance username 
     * @return UserName Instance username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Instance username
     * @param UserName Instance username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Instance password 
     * @return Password Instance password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password
     * @param Password Instance password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get List of database permissions 
     * @return DBPrivileges List of database permissions
     */
    public DBPrivilege [] getDBPrivileges() {
        return this.DBPrivileges;
    }

    /**
     * Set List of database permissions
     * @param DBPrivileges List of database permissions
     */
    public void setDBPrivileges(DBPrivilege [] DBPrivileges) {
        this.DBPrivileges = DBPrivileges;
    }

    /**
     * Get Account remarks 
     * @return Remark Account remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Account remarks
     * @param Remark Account remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether it is an admin account. Default value: no 
     * @return IsAdmin Whether it is an admin account. Default value: no
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set Whether it is an admin account. Default value: no
     * @param IsAdmin Whether it is an admin account. Default value: no
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    /**
     * Get Valid values: `win-windows authentication`, `sql-sqlserver authentication`. Default value: `sql-sqlserver authentication`. 
     * @return Authentication Valid values: `win-windows authentication`, `sql-sqlserver authentication`. Default value: `sql-sqlserver authentication`.
     */
    public String getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Valid values: `win-windows authentication`, `sql-sqlserver authentication`. Default value: `sql-sqlserver authentication`.
     * @param Authentication Valid values: `win-windows authentication`, `sql-sqlserver authentication`. Default value: `sql-sqlserver authentication`.
     */
    public void setAuthentication(String Authentication) {
        this.Authentication = Authentication;
    }

    public AccountCreateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountCreateInfo(AccountCreateInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.DBPrivileges != null) {
            this.DBPrivileges = new DBPrivilege[source.DBPrivileges.length];
            for (int i = 0; i < source.DBPrivileges.length; i++) {
                this.DBPrivileges[i] = new DBPrivilege(source.DBPrivileges[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
        }
        if (source.Authentication != null) {
            this.Authentication = new String(source.Authentication);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "DBPrivileges.", this.DBPrivileges);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);
        this.setParamSimple(map, prefix + "Authentication", this.Authentication);

    }
}

