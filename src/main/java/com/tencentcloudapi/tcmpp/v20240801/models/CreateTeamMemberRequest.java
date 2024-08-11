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

public class CreateTeamMemberRequest extends AbstractModel {

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User account
    */
    @SerializedName("UserAccount")
    @Expose
    private String UserAccount;

    /**
    * Account password. Use CreatePresetKey to get publick key to encrypt the password.
    */
    @SerializedName("UserPassword")
    @Expose
    private String UserPassword;

    /**
    * Team ID
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team role
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * Call CreatePresetKey to get the keyID from RequestId
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get Account password. Use CreatePresetKey to get publick key to encrypt the password. 
     * @return UserPassword Account password. Use CreatePresetKey to get publick key to encrypt the password.
     */
    public String getUserPassword() {
        return this.UserPassword;
    }

    /**
     * Set Account password. Use CreatePresetKey to get publick key to encrypt the password.
     * @param UserPassword Account password. Use CreatePresetKey to get publick key to encrypt the password.
     */
    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
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
     * Get Team role 
     * @return RoleId Team role
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Team role
     * @param RoleId Team role
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Call CreatePresetKey to get the keyID from RequestId 
     * @return KeyId Call CreatePresetKey to get the keyID from RequestId
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Call CreatePresetKey to get the keyID from RequestId
     * @param KeyId Call CreatePresetKey to get the keyID from RequestId
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public CreateTeamMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTeamMemberRequest(CreateTeamMemberRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserAccount != null) {
            this.UserAccount = new String(source.UserAccount);
        }
        if (source.UserPassword != null) {
            this.UserPassword = new String(source.UserPassword);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserAccount", this.UserAccount);
        this.setParamSimple(map, prefix + "UserPassword", this.UserPassword);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

