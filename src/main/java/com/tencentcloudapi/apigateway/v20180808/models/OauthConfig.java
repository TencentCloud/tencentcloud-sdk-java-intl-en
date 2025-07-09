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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OauthConfig extends AbstractModel {

    /**
    * Public key for user token verification.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Token delivery location.
    */
    @SerializedName("TokenLocation")
    @Expose
    private String TokenLocation;

    /**
    * Redirect address, which is used to guide user logins.
    */
    @SerializedName("LoginRedirectUrl")
    @Expose
    private String LoginRedirectUrl;

    /**
     * Get Public key for user token verification. 
     * @return PublicKey Public key for user token verification.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key for user token verification.
     * @param PublicKey Public key for user token verification.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Token delivery location. 
     * @return TokenLocation Token delivery location.
     */
    public String getTokenLocation() {
        return this.TokenLocation;
    }

    /**
     * Set Token delivery location.
     * @param TokenLocation Token delivery location.
     */
    public void setTokenLocation(String TokenLocation) {
        this.TokenLocation = TokenLocation;
    }

    /**
     * Get Redirect address, which is used to guide user logins. 
     * @return LoginRedirectUrl Redirect address, which is used to guide user logins.
     */
    public String getLoginRedirectUrl() {
        return this.LoginRedirectUrl;
    }

    /**
     * Set Redirect address, which is used to guide user logins.
     * @param LoginRedirectUrl Redirect address, which is used to guide user logins.
     */
    public void setLoginRedirectUrl(String LoginRedirectUrl) {
        this.LoginRedirectUrl = LoginRedirectUrl;
    }

    public OauthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OauthConfig(OauthConfig source) {
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.TokenLocation != null) {
            this.TokenLocation = new String(source.TokenLocation);
        }
        if (source.LoginRedirectUrl != null) {
            this.LoginRedirectUrl = new String(source.LoginRedirectUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "TokenLocation", this.TokenLocation);
        this.setParamSimple(map, prefix + "LoginRedirectUrl", this.LoginRedirectUrl);

    }
}

