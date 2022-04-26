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

public class ModifyAppAccountRequest extends AbstractModel{

    /**
    * Account ID.
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * Account name. When this parameter is not specified, the name will not be modified.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Account password. When this parameter is not specified, the password will not be changed.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Description. When this parameter is not specified, the description will not be modified.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Account name. When this parameter is not specified, the name will not be modified. 
     * @return AccountName Account name. When this parameter is not specified, the name will not be modified.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name. When this parameter is not specified, the name will not be modified.
     * @param AccountName Account name. When this parameter is not specified, the name will not be modified.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Account password. When this parameter is not specified, the password will not be changed. 
     * @return Password Account password. When this parameter is not specified, the password will not be changed.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password. When this parameter is not specified, the password will not be changed.
     * @param Password Account password. When this parameter is not specified, the password will not be changed.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Description. When this parameter is not specified, the description will not be modified. 
     * @return Description Description. When this parameter is not specified, the description will not be modified.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. When this parameter is not specified, the description will not be modified.
     * @param Description Description. When this parameter is not specified, the description will not be modified.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyAppAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppAccountRequest(ModifyAppAccountRequest source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

