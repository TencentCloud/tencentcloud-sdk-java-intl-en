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
    * Team ID
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Administrator user ID
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * Administrator account
    */
    @SerializedName("AdminUserAccount")
    @Expose
    private String AdminUserAccount;

    /**
    * Administrator username
    */
    @SerializedName("AdminUserName")
    @Expose
    private String AdminUserName;

    /**
    * Number of team members
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * Team registration link
    */
    @SerializedName("RegisterLink")
    @Expose
    private String RegisterLink;

    /**
    * Team permission type
    */
    @SerializedName("TeamRoleTypeList")
    @Expose
    private Long [] TeamRoleTypeList;

    /**
    * Associated team ID
    */
    @SerializedName("RelatedTeamId")
    @Expose
    private Long RelatedTeamId;

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
     * Get Team ID 
     * @return TeamId Team ID
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
     * @param TeamId Team ID
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

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
     * Get Administrator user ID 
     * @return AdminUserId Administrator user ID
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set Administrator user ID
     * @param AdminUserId Administrator user ID
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
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
     * Get Administrator username 
     * @return AdminUserName Administrator username
     */
    public String getAdminUserName() {
        return this.AdminUserName;
    }

    /**
     * Set Administrator username
     * @param AdminUserName Administrator username
     */
    public void setAdminUserName(String AdminUserName) {
        this.AdminUserName = AdminUserName;
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
     * Get Team permission type 
     * @return TeamRoleTypeList Team permission type
     */
    public Long [] getTeamRoleTypeList() {
        return this.TeamRoleTypeList;
    }

    /**
     * Set Team permission type
     * @param TeamRoleTypeList Team permission type
     */
    public void setTeamRoleTypeList(Long [] TeamRoleTypeList) {
        this.TeamRoleTypeList = TeamRoleTypeList;
    }

    /**
     * Get Associated team ID 
     * @return RelatedTeamId Associated team ID
     */
    public Long getRelatedTeamId() {
        return this.RelatedTeamId;
    }

    /**
     * Set Associated team ID
     * @param RelatedTeamId Associated team ID
     */
    public void setRelatedTeamId(Long RelatedTeamId) {
        this.RelatedTeamId = RelatedTeamId;
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

    }
}

