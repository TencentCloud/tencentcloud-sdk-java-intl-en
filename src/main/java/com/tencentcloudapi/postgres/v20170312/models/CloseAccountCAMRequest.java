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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseAccountCAMRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Account name of the CAM service to be disabled.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Specifies the new password necessary to log on to this account after CAM is disabled.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Indicates whether the password is encrypted.
    */
    @SerializedName("PasswordEncrypt")
    @Expose
    private Boolean PasswordEncrypt;

    /**
     * Get Instance ID. 
     * @return DBInstanceId Instance ID.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID.
     * @param DBInstanceId Instance ID.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Account name of the CAM service to be disabled. 
     * @return UserName Account name of the CAM service to be disabled.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Account name of the CAM service to be disabled.
     * @param UserName Account name of the CAM service to be disabled.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Specifies the new password necessary to log on to this account after CAM is disabled. 
     * @return Password Specifies the new password necessary to log on to this account after CAM is disabled.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Specifies the new password necessary to log on to this account after CAM is disabled.
     * @param Password Specifies the new password necessary to log on to this account after CAM is disabled.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Indicates whether the password is encrypted. 
     * @return PasswordEncrypt Indicates whether the password is encrypted.
     */
    public Boolean getPasswordEncrypt() {
        return this.PasswordEncrypt;
    }

    /**
     * Set Indicates whether the password is encrypted.
     * @param PasswordEncrypt Indicates whether the password is encrypted.
     */
    public void setPasswordEncrypt(Boolean PasswordEncrypt) {
        this.PasswordEncrypt = PasswordEncrypt;
    }

    public CloseAccountCAMRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseAccountCAMRequest(CloseAccountCAMRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PasswordEncrypt != null) {
            this.PasswordEncrypt = new Boolean(source.PasswordEncrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordEncrypt", this.PasswordEncrypt);

    }
}

