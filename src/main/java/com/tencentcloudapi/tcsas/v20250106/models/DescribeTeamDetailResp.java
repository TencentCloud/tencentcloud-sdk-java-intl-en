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
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Team role type. Valid values: 1: Mini program team; 2: Superapp team.</p>
    */
    @SerializedName("TeamRoleType")
    @Expose
    private Long TeamRoleType;

    /**
    * <p>Administrator account.</p>
    */
    @SerializedName("AdminUserAccount")
    @Expose
    private String AdminUserAccount;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Number of team members.</p>
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * <p>Number of bound mini program teams.</p>
    */
    @SerializedName("BindMiniTeamCount")
    @Expose
    private Long BindMiniTeamCount;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("BindTeamName")
    @Expose
    private String BindTeamName;

    /**
    * <p>Team registration link.</p>
    */
    @SerializedName("RegisterLink")
    @Expose
    private String RegisterLink;

    /**
    * <p>Superapp name. Only returned for querying details of mini program teams.</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Team expiration time. 0 indicates no expiration.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>Team status. Valid values: 1: Active; 2: Disabled; 3: Expired.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Administrator name.</p>
    */
    @SerializedName("AdminUserName")
    @Expose
    private String AdminUserName;

    /**
     * Get <p>Team name.</p> 
     * @return TeamName <p>Team name.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param TeamName <p>Team name.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Team role type. Valid values: 1: Mini program team; 2: Superapp team.</p> 
     * @return TeamRoleType <p>Team role type. Valid values: 1: Mini program team; 2: Superapp team.</p>
     */
    public Long getTeamRoleType() {
        return this.TeamRoleType;
    }

    /**
     * Set <p>Team role type. Valid values: 1: Mini program team; 2: Superapp team.</p>
     * @param TeamRoleType <p>Team role type. Valid values: 1: Mini program team; 2: Superapp team.</p>
     */
    public void setTeamRoleType(Long TeamRoleType) {
        this.TeamRoleType = TeamRoleType;
    }

    /**
     * Get <p>Administrator account.</p> 
     * @return AdminUserAccount <p>Administrator account.</p>
     */
    public String getAdminUserAccount() {
        return this.AdminUserAccount;
    }

    /**
     * Set <p>Administrator account.</p>
     * @param AdminUserAccount <p>Administrator account.</p>
     */
    public void setAdminUserAccount(String AdminUserAccount) {
        this.AdminUserAccount = AdminUserAccount;
    }

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Number of team members.</p> 
     * @return MemberCount <p>Number of team members.</p>
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set <p>Number of team members.</p>
     * @param MemberCount <p>Number of team members.</p>
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get <p>Number of bound mini program teams.</p> 
     * @return BindMiniTeamCount <p>Number of bound mini program teams.</p>
     */
    public Long getBindMiniTeamCount() {
        return this.BindMiniTeamCount;
    }

    /**
     * Set <p>Number of bound mini program teams.</p>
     * @param BindMiniTeamCount <p>Number of bound mini program teams.</p>
     */
    public void setBindMiniTeamCount(Long BindMiniTeamCount) {
        this.BindMiniTeamCount = BindMiniTeamCount;
    }

    /**
     * Get <p>Team name.</p> 
     * @return BindTeamName <p>Team name.</p>
     */
    public String getBindTeamName() {
        return this.BindTeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param BindTeamName <p>Team name.</p>
     */
    public void setBindTeamName(String BindTeamName) {
        this.BindTeamName = BindTeamName;
    }

    /**
     * Get <p>Team registration link.</p> 
     * @return RegisterLink <p>Team registration link.</p>
     */
    public String getRegisterLink() {
        return this.RegisterLink;
    }

    /**
     * Set <p>Team registration link.</p>
     * @param RegisterLink <p>Team registration link.</p>
     */
    public void setRegisterLink(String RegisterLink) {
        this.RegisterLink = RegisterLink;
    }

    /**
     * Get <p>Superapp name. Only returned for querying details of mini program teams.</p> 
     * @return ApplicationName <p>Superapp name. Only returned for querying details of mini program teams.</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name. Only returned for querying details of mini program teams.</p>
     * @param ApplicationName <p>Superapp name. Only returned for querying details of mini program teams.</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>Team expiration time. 0 indicates no expiration.</p> 
     * @return ExpireTime <p>Team expiration time. 0 indicates no expiration.</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Team expiration time. 0 indicates no expiration.</p>
     * @param ExpireTime <p>Team expiration time. 0 indicates no expiration.</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Team status. Valid values: 1: Active; 2: Disabled; 3: Expired.</p> 
     * @return Status <p>Team status. Valid values: 1: Active; 2: Disabled; 3: Expired.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Team status. Valid values: 1: Active; 2: Disabled; 3: Expired.</p>
     * @param Status <p>Team status. Valid values: 1: Active; 2: Disabled; 3: Expired.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Administrator name.</p> 
     * @return AdminUserName <p>Administrator name.</p>
     */
    public String getAdminUserName() {
        return this.AdminUserName;
    }

    /**
     * Set <p>Administrator name.</p>
     * @param AdminUserName <p>Administrator name.</p>
     */
    public void setAdminUserName(String AdminUserName) {
        this.AdminUserName = AdminUserName;
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
        if (source.AdminUserName != null) {
            this.AdminUserName = new String(source.AdminUserName);
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
        this.setParamSimple(map, prefix + "AdminUserName", this.AdminUserName);

    }
}

