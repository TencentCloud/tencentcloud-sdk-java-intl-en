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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectUserRole extends AbstractModel {

    /**
    * Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Host Account ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootAccountId")
    @Expose
    private String RootAccountId;

    /**
    * User ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * Username.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Display name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User role object.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Roles")
    @Expose
    private SystemRole [] Roles;

    /**
    * Whether to create.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCreator")
    @Expose
    private Boolean IsCreator;

    /**
    * Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the project leader.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsProjectOwner")
    @Expose
    private Boolean IsProjectOwner;

    /**
    * Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Mailbox.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get Tenant ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Host Account ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RootAccountId Host Account ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRootAccountId() {
        return this.RootAccountId;
    }

    /**
     * Set Host Account ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RootAccountId Host Account ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRootAccountId(String RootAccountId) {
        this.RootAccountId = RootAccountId;
    }

    /**
     * Get User ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserUin User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserUin User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get Username.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Display name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Display name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Display name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get User role object.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Roles User role object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SystemRole [] getRoles() {
        return this.Roles;
    }

    /**
     * Set User role object.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Roles User role object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoles(SystemRole [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get Whether to create.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCreator Whether to create.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsCreator() {
        return this.IsCreator;
    }

    /**
     * Set Whether to create.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCreator Whether to create.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCreator(Boolean IsCreator) {
        this.IsCreator = IsCreator;
    }

    /**
     * Get Creation time.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the project leader.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsProjectOwner Whether the project leader.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsProjectOwner() {
        return this.IsProjectOwner;
    }

    /**
     * Set Whether the project leader.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsProjectOwner Whether the project leader.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsProjectOwner(Boolean IsProjectOwner) {
        this.IsProjectOwner = IsProjectOwner;
    }

    /**
     * Get Mobile number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneNum Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneNum Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Mailbox.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Email Mailbox.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Mailbox.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Email Mailbox.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public ProjectUserRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectUserRole(ProjectUserRole source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.RootAccountId != null) {
            this.RootAccountId = new String(source.RootAccountId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Roles != null) {
            this.Roles = new SystemRole[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new SystemRole(source.Roles[i]);
            }
        }
        if (source.IsCreator != null) {
            this.IsCreator = new Boolean(source.IsCreator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsProjectOwner != null) {
            this.IsProjectOwner = new Boolean(source.IsProjectOwner);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RootAccountId", this.RootAccountId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "IsCreator", this.IsCreator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsProjectOwner", this.IsProjectOwner);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

