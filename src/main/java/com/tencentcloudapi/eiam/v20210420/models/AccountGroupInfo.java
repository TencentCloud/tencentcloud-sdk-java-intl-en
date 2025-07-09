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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountGroupInfo extends AbstractModel {

    /**
    * Account group ID.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * Account group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Remarks.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
     * Get Account group ID. 
     * @return AccountGroupId Account group ID.
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID.
     * @param AccountGroupId Account group ID.
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get Account group name. 
     * @return GroupName Account group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Account group name.
     * @param GroupName Account group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Remarks. 
     * @return Description Remarks.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks.
     * @param Description Remarks.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time. 
     * @return CreatedDate Creation time.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Creation time.
     * @param CreatedDate Creation time.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public AccountGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountGroupInfo(AccountGroupInfo source) {
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
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
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

