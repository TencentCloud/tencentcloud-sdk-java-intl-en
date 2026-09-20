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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TempCertificate extends AbstractModel {

    /**
    * Temporary security credential Id.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Temporary security credential Key.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Token value.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * The time when the certificate is invalid. Return a Unix timestamp accurate to the second.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get Temporary security credential Id. 
     * @return SecretId Temporary security credential Id.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Temporary security credential Id.
     * @param SecretId Temporary security credential Id.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Temporary security credential Key. 
     * @return SecretKey Temporary security credential Key.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Temporary security credential Key.
     * @param SecretKey Temporary security credential Key.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Token value. 
     * @return Token Token value.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token value.
     * @param Token Token value.
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get The time when the certificate is invalid. Return a Unix timestamp accurate to the second. 
     * @return ExpiredTime The time when the certificate is invalid. Return a Unix timestamp accurate to the second.
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set The time when the certificate is invalid. Return a Unix timestamp accurate to the second.
     * @param ExpiredTime The time when the certificate is invalid. Return a Unix timestamp accurate to the second.
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public TempCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TempCertificate(TempCertificate source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

