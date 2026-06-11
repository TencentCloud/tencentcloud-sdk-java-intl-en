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

public class DescribeUserListData extends AbstractModel {

    /**
    * <p>User ID.</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>User account.</p>
    */
    @SerializedName("UserAccount")
    @Expose
    private String UserAccount;

    /**
    * User account type. Valid values: 1: Super admin; 2: Platform admin; 3: Regular member.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>User name.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status. Valid values: 1: Active; 2: Disabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
     * Get <p>User ID.</p> 
     * @return UserId <p>User ID.</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>User ID.</p>
     * @param UserId <p>User ID.</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>User account.</p> 
     * @return UserAccount <p>User account.</p>
     */
    public String getUserAccount() {
        return this.UserAccount;
    }

    /**
     * Set <p>User account.</p>
     * @param UserAccount <p>User account.</p>
     */
    public void setUserAccount(String UserAccount) {
        this.UserAccount = UserAccount;
    }

    /**
     * Get User account type. Valid values: 1: Super admin; 2: Platform admin; 3: Regular member. 
     * @return AccountType User account type. Valid values: 1: Super admin; 2: Platform admin; 3: Regular member.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set User account type. Valid values: 1: Super admin; 2: Platform admin; 3: Regular member.
     * @param AccountType User account type. Valid values: 1: Super admin; 2: Platform admin; 3: Regular member.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>User name.</p> 
     * @return UserName <p>User name.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>User name.</p>
     * @param UserName <p>User name.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get Status. Valid values: 1: Active; 2: Disabled. 
     * @return Status Status. Valid values: 1: Active; 2: Disabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: 1: Active; 2: Disabled.
     * @param Status Status. Valid values: 1: Active; 2: Disabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);

    }
}

