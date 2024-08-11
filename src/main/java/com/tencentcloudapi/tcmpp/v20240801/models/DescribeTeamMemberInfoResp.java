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

public class DescribeTeamMemberInfoResp extends AbstractModel {

    /**
    * User ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAccount")
    @Expose
    private String UserAccount;

    /**
    * User name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

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
    * Team role name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamRoleName")
    @Expose
    private String TeamRoleName;

    /**
    * Team role ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamRoleId")
    @Expose
    private Long TeamRoleId;

    /**
    * Editable or not
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
     * Get User ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAccount User account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAccount() {
        return this.UserAccount;
    }

    /**
     * Set User account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAccount User account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAccount(String UserAccount) {
        this.UserAccount = UserAccount;
    }

    /**
     * Get User name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName User name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName User name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

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
     * Get Team role name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamRoleName Team role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamRoleName() {
        return this.TeamRoleName;
    }

    /**
     * Set Team role name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamRoleName Team role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamRoleName(String TeamRoleName) {
        this.TeamRoleName = TeamRoleName;
    }

    /**
     * Get Team role ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamRoleId Team role ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTeamRoleId() {
        return this.TeamRoleId;
    }

    /**
     * Set Team role ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamRoleId Team role ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamRoleId(Long TeamRoleId) {
        this.TeamRoleId = TeamRoleId;
    }

    /**
     * Get Editable or not
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanEdit Editable or not
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set Editable or not
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanEdit Editable or not
Note: This field may return null, indicating that no valid values can be obtained.
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

