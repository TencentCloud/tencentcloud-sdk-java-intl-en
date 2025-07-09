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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Credentials extends AbstractModel {

    /**
    * Access Key ID.
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Secret Access Key.
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
    * The session token length depends on the binding policy and is no longer than 4096 bytes.
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * The expiration time of the credentials.
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
     * Get Access Key ID. 
     * @return AccessKeyId Access Key ID.
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set Access Key ID.
     * @param AccessKeyId Access Key ID.
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Secret Access Key. 
     * @return SecretAccessKey Secret Access Key.
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set Secret Access Key.
     * @param SecretAccessKey Secret Access Key.
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    /**
     * Get The session token length depends on the binding policy and is no longer than 4096 bytes. 
     * @return SessionToken The session token length depends on the binding policy and is no longer than 4096 bytes.
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set The session token length depends on the binding policy and is no longer than 4096 bytes.
     * @param SessionToken The session token length depends on the binding policy and is no longer than 4096 bytes.
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get The expiration time of the credentials. 
     * @return Expiration The expiration time of the credentials.
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set The expiration time of the credentials.
     * @param Expiration The expiration time of the credentials.
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }

    public Credentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Credentials(Credentials source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

