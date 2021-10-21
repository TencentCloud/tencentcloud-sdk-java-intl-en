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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceAccountAuthenticationOptions extends AbstractModel{

    /**
    * service-account-issuer
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * service-account-jwks-uri
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("JWKSURI")
    @Expose
    private String JWKSURI;

    /**
    * If it is set to `true`, a RABC rule is automatically created to allow anonymous users to access `/.well-known/openid-configuration` and `/openid/v1/jwks`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoCreateDiscoveryAnonymousAuth")
    @Expose
    private Boolean AutoCreateDiscoveryAnonymousAuth;

    /**
     * Get service-account-issuer
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Issuer service-account-issuer
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set service-account-issuer
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Issuer service-account-issuer
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get service-account-jwks-uri
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return JWKSURI service-account-jwks-uri
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getJWKSURI() {
        return this.JWKSURI;
    }

    /**
     * Set service-account-jwks-uri
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param JWKSURI service-account-jwks-uri
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setJWKSURI(String JWKSURI) {
        this.JWKSURI = JWKSURI;
    }

    /**
     * Get If it is set to `true`, a RABC rule is automatically created to allow anonymous users to access `/.well-known/openid-configuration` and `/openid/v1/jwks`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoCreateDiscoveryAnonymousAuth If it is set to `true`, a RABC rule is automatically created to allow anonymous users to access `/.well-known/openid-configuration` and `/openid/v1/jwks`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAutoCreateDiscoveryAnonymousAuth() {
        return this.AutoCreateDiscoveryAnonymousAuth;
    }

    /**
     * Set If it is set to `true`, a RABC rule is automatically created to allow anonymous users to access `/.well-known/openid-configuration` and `/openid/v1/jwks`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AutoCreateDiscoveryAnonymousAuth If it is set to `true`, a RABC rule is automatically created to allow anonymous users to access `/.well-known/openid-configuration` and `/openid/v1/jwks`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoCreateDiscoveryAnonymousAuth(Boolean AutoCreateDiscoveryAnonymousAuth) {
        this.AutoCreateDiscoveryAnonymousAuth = AutoCreateDiscoveryAnonymousAuth;
    }

    public ServiceAccountAuthenticationOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceAccountAuthenticationOptions(ServiceAccountAuthenticationOptions source) {
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.JWKSURI != null) {
            this.JWKSURI = new String(source.JWKSURI);
        }
        if (source.AutoCreateDiscoveryAnonymousAuth != null) {
            this.AutoCreateDiscoveryAnonymousAuth = new Boolean(source.AutoCreateDiscoveryAnonymousAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "JWKSURI", this.JWKSURI);
        this.setParamSimple(map, prefix + "AutoCreateDiscoveryAnonymousAuth", this.AutoCreateDiscoveryAnonymousAuth);

    }
}

