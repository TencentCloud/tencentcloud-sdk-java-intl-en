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

public class CreateUserRequest extends AbstractModel {

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
    * User account type. 2: Platform administrator; 3: Ordinary member. 
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * Account password. Use CreatePresetKey to get the public key to encrypt the password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get User account type. 2: Platform administrator; 3: Ordinary member.  
     * @return AccountType User account type. 2: Platform administrator; 3: Ordinary member. 
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set User account type. 2: Platform administrator; 3: Ordinary member. 
     * @param AccountType User account type. 2: Platform administrator; 3: Ordinary member. 
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Account password. Use CreatePresetKey to get the public key to encrypt the password. 
     * @return Password Account password. Use CreatePresetKey to get the public key to encrypt the password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password. Use CreatePresetKey to get the public key to encrypt the password.
     * @param Password Account password. Use CreatePresetKey to get the public key to encrypt the password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
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

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.UserAccount != null) {
            this.UserAccount = new String(source.UserAccount);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
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
        this.setParamSimple(map, prefix + "UserAccount", this.UserAccount);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

