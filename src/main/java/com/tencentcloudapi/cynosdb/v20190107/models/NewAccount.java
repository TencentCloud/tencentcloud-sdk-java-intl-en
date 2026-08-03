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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewAccount extends AbstractModel {

    /**
    * <p>Account name, containing letters, digits, and underscores, starting with a letter, ending with a letter or digit, length 1-30</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>host (% or ipv4 address)</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Password. The length range is 8 to 64 characters.</p>
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
    */
    @SerializedName("PasswordRotation")
    @Expose
    private Long PasswordRotation;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Maximum user connections cannot be greater than 10240</p>
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get <p>Account name, containing letters, digits, and underscores, starting with a letter, ending with a letter or digit, length 1-30</p> 
     * @return AccountName <p>Account name, containing letters, digits, and underscores, starting with a letter, ending with a letter or digit, length 1-30</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Account name, containing letters, digits, and underscores, starting with a letter, ending with a letter or digit, length 1-30</p>
     * @param AccountName <p>Account name, containing letters, digits, and underscores, starting with a letter, ending with a letter or digit, length 1-30</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>host (% or ipv4 address)</p> 
     * @return Host <p>host (% or ipv4 address)</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>host (% or ipv4 address)</p>
     * @param Host <p>host (% or ipv4 address)</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Password. The length range is 8 to 64 characters.</p> 
     * @return AccountPassword <p>Password. The length range is 8 to 64 characters.</p>
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set <p>Password. The length range is 8 to 64 characters.</p>
     * @param AccountPassword <p>Password. The length range is 8 to 64 characters.</p>
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p> 
     * @return PasswordRotation <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
     */
    public Long getPasswordRotation() {
        return this.PasswordRotation;
    }

    /**
     * Set <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
     * @param PasswordRotation <p>Whether password rotation is enabled (0: turn off; 1: turn on)</p>
     */
    public void setPasswordRotation(Long PasswordRotation) {
        this.PasswordRotation = PasswordRotation;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Maximum user connections cannot be greater than 10240</p> 
     * @return MaxUserConnections <p>Maximum user connections cannot be greater than 10240</p>
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set <p>Maximum user connections cannot be greater than 10240</p>
     * @param MaxUserConnections <p>Maximum user connections cannot be greater than 10240</p>
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public NewAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewAccount(NewAccount source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.PasswordRotation != null) {
            this.PasswordRotation = new Long(source.PasswordRotation);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "PasswordRotation", this.PasswordRotation);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

