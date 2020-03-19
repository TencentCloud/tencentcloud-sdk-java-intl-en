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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "DBPrivileges.", this.DBPrivileges);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);

    }
}

