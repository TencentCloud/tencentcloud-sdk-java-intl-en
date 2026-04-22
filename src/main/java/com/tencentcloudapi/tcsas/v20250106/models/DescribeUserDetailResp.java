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

public class DescribeUserDetailResp extends AbstractModel {

    /**
    * User iD.
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
    * User account
1 - super admin 2 - platform admin 3 - ordinary member. not passing indicates all.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * User name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get User iD. 
     * @return UserId User iD.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User iD.
     * @param UserId User iD.
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
     * Get User account
1 - super admin 2 - platform admin 3 - ordinary member. not passing indicates all. 
     * @return AccountType User account
1 - super admin 2 - platform admin 3 - ordinary member. not passing indicates all.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set User account
1 - super admin 2 - platform admin 3 - ordinary member. not passing indicates all.
     * @param AccountType User account
1 - super admin 2 - platform admin 3 - ordinary member. not passing indicates all.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
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

    public DescribeUserDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserDetailResp(DescribeUserDetailResp source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserAccount", this.UserAccount);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

