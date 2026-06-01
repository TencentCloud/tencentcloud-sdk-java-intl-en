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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRotationPasswordRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance account name with password rotation disabled, such as root
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Disable the domain name of the instance account with password rotation, such as%
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The latest password of the instance account after disabling password rotation
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * If the input is not null, the password is encrypted.
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. 
     * @return InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     * @param InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance account name with password rotation disabled, such as root 
     * @return User Instance account name with password rotation disabled, such as root
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Instance account name with password rotation disabled, such as root
     * @param User Instance account name with password rotation disabled, such as root
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Disable the domain name of the instance account with password rotation, such as% 
     * @return Host Disable the domain name of the instance account with password rotation, such as%
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Disable the domain name of the instance account with password rotation, such as%
     * @param Host Disable the domain name of the instance account with password rotation, such as%
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The latest password of the instance account after disabling password rotation 
     * @return Password The latest password of the instance account after disabling password rotation
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The latest password of the instance account after disabling password rotation
     * @param Password The latest password of the instance account after disabling password rotation
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get If the input is not null, the password is encrypted. 
     * @return EncryptMethod If the input is not null, the password is encrypted.
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set If the input is not null, the password is encrypted.
     * @param EncryptMethod If the input is not null, the password is encrypted.
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    public DeleteRotationPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRotationPasswordRequest(DeleteRotationPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);

    }
}

