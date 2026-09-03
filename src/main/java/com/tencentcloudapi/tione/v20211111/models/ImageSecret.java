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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSecret extends AbstractModel {

    /**
    * 
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
     * Get  
     * @return KeyId 
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 
     * @param KeyId 
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get  
     * @return Username 
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 
     * @param Username 
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get  
     * @return Password 
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 
     * @param Password 
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get  
     * @return SecretId 
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 
     * @param SecretId 
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    public ImageSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSecret(ImageSecret source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);

    }
}

