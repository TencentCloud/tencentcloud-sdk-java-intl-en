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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppAccountInfo extends AbstractModel{

    /**
    * Account ID.
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * Account name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * User information list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserList")
    @Expose
    private LinkUserInfo [] UserList;

    /**
    * Description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
     * Get Account ID. 
     * @return AccountId Account ID.
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set Account ID.
     * @param AccountId Account ID.
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get Account name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccountName Account name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccountName Account name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get User information list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserList User information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LinkUserInfo [] getUserList() {
        return this.UserList;
    }

    /**
     * Set User information list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserList User information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserList(LinkUserInfo [] UserList) {
        this.UserList = UserList;
    }

    /**
     * Get Description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedDate Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedDate Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public AppAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAccountInfo(AppAccountInfo source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.UserList != null) {
            this.UserList = new LinkUserInfo[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new LinkUserInfo(source.UserList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

