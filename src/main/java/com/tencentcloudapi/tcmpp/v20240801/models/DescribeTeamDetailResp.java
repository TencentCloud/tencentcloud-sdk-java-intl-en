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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTeamDetailResp extends AbstractModel {

    /**
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Team role type 1-Mini program team 2-Application team
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamRoleType")
    @Expose
    private Long TeamRoleType;

    /**
    * Admin account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminUserAccount")
    @Expose
    private String AdminUserAccount;

    /**
    * Creator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of team members
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * Number of bound mini program teams
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindMiniTeamCount")
    @Expose
    private Long BindMiniTeamCount;

    /**
    * Name of the bound team
    */
    @SerializedName("BindTeamName")
    @Expose
    private String BindTeamName;

    /**
    * Team registration link
    */
    @SerializedName("RegisterLink")
    @Expose
    private String RegisterLink;

    /**
    * Application name. It’s required when querying details of a mini program team.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get Team name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Team role type 1-Mini program team 2-Application team
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamRoleType Team role type 1-Mini program team 2-Application team
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTeamRoleType() {
        return this.TeamRoleType;
    }

    /**
     * Set Team role type 1-Mini program team 2-Application team
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamRoleType Team role type 1-Mini program team 2-Application team
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamRoleType(Long TeamRoleType) {
        this.TeamRoleType = TeamRoleType;
    }

    /**
     * Get Admin account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdminUserAccount Admin account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminUserAccount() {
        return this.AdminUserAccount;
    }

    /**
     * Set Admin account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdminUserAccount Admin account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminUserAccount(String AdminUserAccount) {
        this.AdminUserAccount = AdminUserAccount;
    }

    /**
     * Get Creator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUser Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUser Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of team members
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberCount Number of team members
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Number of team members
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberCount Number of team members
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get Number of bound mini program teams
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindMiniTeamCount Number of bound mini program teams
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBindMiniTeamCount() {
        return this.BindMiniTeamCount;
    }

    /**
     * Set Number of bound mini program teams
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindMiniTeamCount Number of bound mini program teams
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindMiniTeamCount(Long BindMiniTeamCount) {
        this.BindMiniTeamCount = BindMiniTeamCount;
    }

    /**
     * Get Name of the bound team 
     * @return BindTeamName Name of the bound team
     */
    public String getBindTeamName() {
        return this.BindTeamName;
    }

    /**
     * Set Name of the bound team
     * @param BindTeamName Name of the bound team
     */
    public void setBindTeamName(String BindTeamName) {
        this.BindTeamName = BindTeamName;
    }

    /**
     * Get Team registration link 
     * @return RegisterLink Team registration link
     */
    public String getRegisterLink() {
        return this.RegisterLink;
    }

    /**
     * Set Team registration link
     * @param RegisterLink Team registration link
     */
    public void setRegisterLink(String RegisterLink) {
        this.RegisterLink = RegisterLink;
    }

    /**
     * Get Application name. It’s required when querying details of a mini program team. 
     * @return ApplicationName Application name. It’s required when querying details of a mini program team.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name. It’s required when querying details of a mini program team.
     * @param ApplicationName Application name. It’s required when querying details of a mini program team.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public DescribeTeamDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTeamDetailResp(DescribeTeamDetailResp source) {
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.TeamRoleType != null) {
            this.TeamRoleType = new Long(source.TeamRoleType);
        }
        if (source.AdminUserAccount != null) {
            this.AdminUserAccount = new String(source.AdminUserAccount);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.BindMiniTeamCount != null) {
            this.BindMiniTeamCount = new Long(source.BindMiniTeamCount);
        }
        if (source.BindTeamName != null) {
            this.BindTeamName = new String(source.BindTeamName);
        }
        if (source.RegisterLink != null) {
            this.RegisterLink = new String(source.RegisterLink);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TeamRoleType", this.TeamRoleType);
        this.setParamSimple(map, prefix + "AdminUserAccount", this.AdminUserAccount);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "BindMiniTeamCount", this.BindMiniTeamCount);
        this.setParamSimple(map, prefix + "BindTeamName", this.BindTeamName);
        this.setParamSimple(map, prefix + "RegisterLink", this.RegisterLink);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

