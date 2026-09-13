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

public class DescribeTeamListInfoResp extends AbstractModel {

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Admin user ID.</p>
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * <p>Admin account.</p>
    */
    @SerializedName("AdminUserAccount")
    @Expose
    private String AdminUserAccount;

    /**
    * <p>Admin username.</p>
    */
    @SerializedName("AdminUserName")
    @Expose
    private String AdminUserName;

    /**
    * <p>Number of team members.</p>
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * <p>Team registration link.</p>
    */
    @SerializedName("RegisterLink")
    @Expose
    private String RegisterLink;

    /**
    * <p>Team role types.</p>
    */
    @SerializedName("TeamRoleTypeList")
    @Expose
    private Long [] TeamRoleTypeList;

    /**
    * <p>Associated team ID.</p>
    */
    @SerializedName("RelatedTeamId")
    @Expose
    private Long RelatedTeamId;

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
    * <p>Information of multiple team admin users.</p>
    */
    @SerializedName("AdminUsers")
    @Expose
    private TeamAdminUserInfo [] AdminUsers;

    /**
     * Get <p>Team ID.</p> 
     * @return TeamId <p>Team ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Team ID.</p>
     * @param TeamId <p>Team ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

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
     * Get <p>Admin user ID.</p> 
     * @return AdminUserId <p>Admin user ID.</p>
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set <p>Admin user ID.</p>
     * @param AdminUserId <p>Admin user ID.</p>
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get <p>Admin account.</p> 
     * @return AdminUserAccount <p>Admin account.</p>
     */
    public String getAdminUserAccount() {
        return this.AdminUserAccount;
    }

    /**
     * Set <p>Admin account.</p>
     * @param AdminUserAccount <p>Admin account.</p>
     */
    public void setAdminUserAccount(String AdminUserAccount) {
        this.AdminUserAccount = AdminUserAccount;
    }

    /**
     * Get <p>Admin username.</p> 
     * @return AdminUserName <p>Admin username.</p>
     */
    public String getAdminUserName() {
        return this.AdminUserName;
    }

    /**
     * Set <p>Admin username.</p>
     * @param AdminUserName <p>Admin username.</p>
     */
    public void setAdminUserName(String AdminUserName) {
        this.AdminUserName = AdminUserName;
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
     * Get <p>Team role types.</p> 
     * @return TeamRoleTypeList <p>Team role types.</p>
     */
    public Long [] getTeamRoleTypeList() {
        return this.TeamRoleTypeList;
    }

    /**
     * Set <p>Team role types.</p>
     * @param TeamRoleTypeList <p>Team role types.</p>
     */
    public void setTeamRoleTypeList(Long [] TeamRoleTypeList) {
        this.TeamRoleTypeList = TeamRoleTypeList;
    }

    /**
     * Get <p>Associated team ID.</p> 
     * @return RelatedTeamId <p>Associated team ID.</p>
     */
    public Long getRelatedTeamId() {
        return this.RelatedTeamId;
    }

    /**
     * Set <p>Associated team ID.</p>
     * @param RelatedTeamId <p>Associated team ID.</p>
     */
    public void setRelatedTeamId(Long RelatedTeamId) {
        this.RelatedTeamId = RelatedTeamId;
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
     * Get <p>Information of multiple team admin users.</p> 
     * @return AdminUsers <p>Information of multiple team admin users.</p>
     */
    public TeamAdminUserInfo [] getAdminUsers() {
        return this.AdminUsers;
    }

    /**
     * Set <p>Information of multiple team admin users.</p>
     * @param AdminUsers <p>Information of multiple team admin users.</p>
     */
    public void setAdminUsers(TeamAdminUserInfo [] AdminUsers) {
        this.AdminUsers = AdminUsers;
    }

    public DescribeTeamListInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTeamListInfoResp(DescribeTeamListInfoResp source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.AdminUserAccount != null) {
            this.AdminUserAccount = new String(source.AdminUserAccount);
        }
        if (source.AdminUserName != null) {
            this.AdminUserName = new String(source.AdminUserName);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.RegisterLink != null) {
            this.RegisterLink = new String(source.RegisterLink);
        }
        if (source.TeamRoleTypeList != null) {
            this.TeamRoleTypeList = new Long[source.TeamRoleTypeList.length];
            for (int i = 0; i < source.TeamRoleTypeList.length; i++) {
                this.TeamRoleTypeList[i] = new Long(source.TeamRoleTypeList[i]);
            }
        }
        if (source.RelatedTeamId != null) {
            this.RelatedTeamId = new Long(source.RelatedTeamId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AdminUsers != null) {
            this.AdminUsers = new TeamAdminUserInfo[source.AdminUsers.length];
            for (int i = 0; i < source.AdminUsers.length; i++) {
                this.AdminUsers[i] = new TeamAdminUserInfo(source.AdminUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "AdminUserAccount", this.AdminUserAccount);
        this.setParamSimple(map, prefix + "AdminUserName", this.AdminUserName);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "RegisterLink", this.RegisterLink);
        this.setParamArraySimple(map, prefix + "TeamRoleTypeList.", this.TeamRoleTypeList);
        this.setParamSimple(map, prefix + "RelatedTeamId", this.RelatedTeamId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "AdminUsers.", this.AdminUsers);

    }
}

