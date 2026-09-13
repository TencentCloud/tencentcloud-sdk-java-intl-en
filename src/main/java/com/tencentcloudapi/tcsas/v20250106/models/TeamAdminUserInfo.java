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

public class TeamAdminUserInfo extends AbstractModel {

    /**
    * <p>Admin user ID.</p>
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * <p>Admin user account.</p>
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
     * Get <p>Admin user account.</p> 
     * @return AdminUserAccount <p>Admin user account.</p>
     */
    public String getAdminUserAccount() {
        return this.AdminUserAccount;
    }

    /**
     * Set <p>Admin user account.</p>
     * @param AdminUserAccount <p>Admin user account.</p>
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

    public TeamAdminUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TeamAdminUserInfo(TeamAdminUserInfo source) {
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.AdminUserAccount != null) {
            this.AdminUserAccount = new String(source.AdminUserAccount);
        }
        if (source.AdminUserName != null) {
            this.AdminUserName = new String(source.AdminUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "AdminUserAccount", this.AdminUserAccount);
        this.setParamSimple(map, prefix + "AdminUserName", this.AdminUserName);

    }
}

