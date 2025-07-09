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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTeamListInfoResp extends AbstractModel {

    /**
    * Team ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Admin ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * Admin account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminUserAccount")
    @Expose
    private String AdminUserAccount;

    /**
    * Admin username
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminUserName")
    @Expose
    private String AdminUserName;

    /**
    * Number of team members
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Team ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

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
     * Get Admin ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdminUserId Admin ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set Admin ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdminUserId Admin ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
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
     * Get Admin username
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdminUserName Admin username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminUserName() {
        return this.AdminUserName;
    }

    /**
     * Set Admin username
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdminUserName Admin username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminUserName(String AdminUserName) {
        this.AdminUserName = AdminUserName;
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamRoleTypeList Team permission type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getTeamRoleTypeList() {
        return this.TeamRoleTypeList;
    }

    /**
     * Set Team permission type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamRoleTypeList Team permission type
Note: This field may return null, indicating that no valid values can be obtained.
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

    }
}

