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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTeamDetailResp extends AbstractModel {

    /**
    * Team name
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Team role type 1-mini program team 2-application team
    */
    @SerializedName("TeamRoleType")
    @Expose
    private Long TeamRoleType;

    /**
    * Administrator account
    */
    @SerializedName("AdminUserAccount")
    @Expose
    private String AdminUserAccount;

    /**
    * Creator
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of team members
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * Number of bound mini program teams
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
    * Application name. It Is required when querying details of a mini program team.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Team expiration time. 0 means never expire.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Team status. valid values: 1: normal; 2: disabled; 3: expired.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Team name 
     * @return TeamName Team name
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name
     * @param TeamName Team name
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Team role type 1-mini program team 2-application team 
     * @return TeamRoleType Team role type 1-mini program team 2-application team
     */
    public Long getTeamRoleType() {
        return this.TeamRoleType;
    }

    /**
     * Set Team role type 1-mini program team 2-application team
     * @param TeamRoleType Team role type 1-mini program team 2-application team
     */
    public void setTeamRoleType(Long TeamRoleType) {
        this.TeamRoleType = TeamRoleType;
    }

    /**
     * Get Administrator account 
     * @return AdminUserAccount Administrator account
     */
    public String getAdminUserAccount() {
        return this.AdminUserAccount;
    }

    /**
     * Set Administrator account
     * @param AdminUserAccount Administrator account
     */
    public void setAdminUserAccount(String AdminUserAccount) {
        this.AdminUserAccount = AdminUserAccount;
    }

    /**
     * Get Creator 
     * @return CreateUser Creator
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
     * @param CreateUser Creator
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of team members 
     * @return MemberCount Number of team members
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Number of team members
     * @param MemberCount Number of team members
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get Number of bound mini program teams 
     * @return BindMiniTeamCount Number of bound mini program teams
     */
    public Long getBindMiniTeamCount() {
        return this.BindMiniTeamCount;
    }

    /**
     * Set Number of bound mini program teams
     * @param BindMiniTeamCount Number of bound mini program teams
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
     * Get Application name. It Is required when querying details of a mini program team. 
     * @return ApplicationName Application name. It Is required when querying details of a mini program team.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name. It Is required when querying details of a mini program team.
     * @param ApplicationName Application name. It Is required when querying details of a mini program team.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Team expiration time. 0 means never expire. 
     * @return ExpireTime Team expiration time. 0 means never expire.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Team expiration time. 0 means never expire.
     * @param ExpireTime Team expiration time. 0 means never expire.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Team status. valid values: 1: normal; 2: disabled; 3: expired. 
     * @return Status Team status. valid values: 1: normal; 2: disabled; 3: expired.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Team status. valid values: 1: normal; 2: disabled; 3: expired.
     * @param Status Team status. valid values: 1: normal; 2: disabled; 3: expired.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

