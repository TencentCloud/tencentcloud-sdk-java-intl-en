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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetUserPasswordRequest extends AbstractModel {

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Host IP, IP range ending with % to denote permission for all IPs in the range
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * New password, required length 8-32, include at least two of English, digits and symbols.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Encryption password
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Host IP, IP range ending with % to denote permission for all IPs in the range 
     * @return Host Host IP, IP range ending with % to denote permission for all IPs in the range
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host IP, IP range ending with % to denote permission for all IPs in the range
     * @param Host Host IP, IP range ending with % to denote permission for all IPs in the range
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get New password, required length 8-32, include at least two of English, digits and symbols. 
     * @return Password New password, required length 8-32, include at least two of English, digits and symbols.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New password, required length 8-32, include at least two of English, digits and symbols.
     * @param Password New password, required length 8-32, include at least two of English, digits and symbols.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Encryption password 
     * @return EncryptedPassword Encryption password
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set Encryption password
     * @param EncryptedPassword Encryption password
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    public ResetUserPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetUserPasswordRequest(ResetUserPasswordRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);

    }
}

