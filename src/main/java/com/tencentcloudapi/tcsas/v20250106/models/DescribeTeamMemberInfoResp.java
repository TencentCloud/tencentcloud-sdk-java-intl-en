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

public class DescribeTeamMemberInfoResp extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User account
    */
    @SerializedName("UserAccount")
    @Expose
    private String UserAccount;

    /**
    * User name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

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
    * Specifies the team role name.
    */
    @SerializedName("TeamRoleName")
    @Expose
    private String TeamRoleName;

    /**
    * Specifies the team role ID.
    */
    @SerializedName("TeamRoleId")
    @Expose
    private Long TeamRoleId;

    /**
    * Whether it is editable
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User account 
     * @return UserAccount User account
     */
    public String getUserAccount() {
        return this.UserAccount;
    }

    /**
     * Set User account
     * @param UserAccount User account
     */
    public void setUserAccount(String UserAccount) {
        this.UserAccount = UserAccount;
    }

    /**
     * Get User name 
     * @return UserName User name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User name
     * @param UserName User name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

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
     * Get Specifies the team role name. 
     * @return TeamRoleName Specifies the team role name.
     */
    public String getTeamRoleName() {
        return this.TeamRoleName;
    }

    /**
     * Set Specifies the team role name.
     * @param TeamRoleName Specifies the team role name.
     */
    public void setTeamRoleName(String TeamRoleName) {
        this.TeamRoleName = TeamRoleName;
    }

    /**
     * Get Specifies the team role ID. 
     * @return TeamRoleId Specifies the team role ID.
     */
    public Long getTeamRoleId() {
        return this.TeamRoleId;
    }

    /**
     * Set Specifies the team role ID.
     * @param TeamRoleId Specifies the team role ID.
     */
    public void setTeamRoleId(Long TeamRoleId) {
        this.TeamRoleId = TeamRoleId;
    }

    /**
     * Get Whether it is editable 
     * @return CanEdit Whether it is editable
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set Whether it is editable
     * @param CanEdit Whether it is editable
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    public DescribeTeamMemberInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTeamMemberInfoResp(DescribeTeamMemberInfoResp source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserAccount != null) {
            this.UserAccount = new String(source.UserAccount);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.TeamRoleName != null) {
            this.TeamRoleName = new String(source.TeamRoleName);
        }
        if (source.TeamRoleId != null) {
            this.TeamRoleId = new Long(source.TeamRoleId);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserAccount", this.UserAccount);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TeamRoleName", this.TeamRoleName);
        this.setParamSimple(map, prefix + "TeamRoleId", this.TeamRoleId);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);

    }
}

