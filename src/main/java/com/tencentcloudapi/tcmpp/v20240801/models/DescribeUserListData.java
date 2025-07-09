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

public class DescribeUserListData extends AbstractModel {

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
    * Associated team
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Teams")
    @Expose
    private String Teams;

    /**
    * Account type. 1: Super administrator; 2: Platform administrator; 3: Ordinary member
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * User name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

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
     * Get Associated team
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Teams Associated team
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getTeams() {
        return this.Teams;
    }

    /**
     * Set Associated team
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Teams Associated team
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setTeams(String Teams) {
        this.Teams = Teams;
    }

    /**
     * Get Account type. 1: Super administrator; 2: Platform administrator; 3: Ordinary member
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountType Account type. 1: Super administrator; 2: Platform administrator; 3: Ordinary member
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type. 1: Super administrator; 2: Platform administrator; 3: Ordinary member
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountType Account type. 1: Super administrator; 2: Platform administrator; 3: Ordinary member
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
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
     * Get Status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeUserListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserListData(DescribeUserListData source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserAccount != null) {
            this.UserAccount = new String(source.UserAccount);
        }
        if (source.Teams != null) {
            this.Teams = new String(source.Teams);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserAccount", this.UserAccount);
        this.setParamSimple(map, prefix + "Teams", this.Teams);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);

    }
}

