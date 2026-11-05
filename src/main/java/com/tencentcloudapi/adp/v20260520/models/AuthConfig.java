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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthConfig extends AbstractModel {

    /**
    * <p>Authorization mode.</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key authentication</li><li>2: CAM authorization</li><li>3: OAuth 2.0 authorization</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>API Key Authorization Configuration</p>
    */
    @SerializedName("ApiKeyAuthConfig")
    @Expose
    private ApiKeyAuthConfig ApiKeyAuthConfig;

    /**
    * <p>CAM Authorization Configuration</p>
    */
    @SerializedName("CamAuthConfig")
    @Expose
    private CamAuthConfig CamAuthConfig;

    /**
    * <p>OAuth 2.0 authorization configuration</p>
    */
    @SerializedName("OAuthConfig")
    @Expose
    private OAuthConfig OAuthConfig;

    /**
    * <p>AccessKey authorization configuration</p>
    */
    @SerializedName("AccessKeyAuthConfig")
    @Expose
    private AccessKeyAuthConfig AccessKeyAuthConfig;

    /**
     * Get <p>Authorization mode.</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key authentication</li><li>2: CAM authorization</li><li>3: OAuth 2.0 authorization</li></ul> 
     * @return AuthType <p>Authorization mode.</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key authentication</li><li>2: CAM authorization</li><li>3: OAuth 2.0 authorization</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>Authorization mode.</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key authentication</li><li>2: CAM authorization</li><li>3: OAuth 2.0 authorization</li></ul>
     * @param AuthType <p>Authorization mode.</p><p>Enumeration values:</p><ul><li>0: No authentication</li><li>1: API Key authentication</li><li>2: CAM authorization</li><li>3: OAuth 2.0 authorization</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>API Key Authorization Configuration</p> 
     * @return ApiKeyAuthConfig <p>API Key Authorization Configuration</p>
     */
    public ApiKeyAuthConfig getApiKeyAuthConfig() {
        return this.ApiKeyAuthConfig;
    }

    /**
     * Set <p>API Key Authorization Configuration</p>
     * @param ApiKeyAuthConfig <p>API Key Authorization Configuration</p>
     */
    public void setApiKeyAuthConfig(ApiKeyAuthConfig ApiKeyAuthConfig) {
        this.ApiKeyAuthConfig = ApiKeyAuthConfig;
    }

    /**
     * Get <p>CAM Authorization Configuration</p> 
     * @return CamAuthConfig <p>CAM Authorization Configuration</p>
     */
    public CamAuthConfig getCamAuthConfig() {
        return this.CamAuthConfig;
    }

    /**
     * Set <p>CAM Authorization Configuration</p>
     * @param CamAuthConfig <p>CAM Authorization Configuration</p>
     */
    public void setCamAuthConfig(CamAuthConfig CamAuthConfig) {
        this.CamAuthConfig = CamAuthConfig;
    }

    /**
     * Get <p>OAuth 2.0 authorization configuration</p> 
     * @return OAuthConfig <p>OAuth 2.0 authorization configuration</p>
     */
    public OAuthConfig getOAuthConfig() {
        return this.OAuthConfig;
    }

    /**
     * Set <p>OAuth 2.0 authorization configuration</p>
     * @param OAuthConfig <p>OAuth 2.0 authorization configuration</p>
     */
    public void setOAuthConfig(OAuthConfig OAuthConfig) {
        this.OAuthConfig = OAuthConfig;
    }

    /**
     * Get <p>AccessKey authorization configuration</p> 
     * @return AccessKeyAuthConfig <p>AccessKey authorization configuration</p>
     */
    public AccessKeyAuthConfig getAccessKeyAuthConfig() {
        return this.AccessKeyAuthConfig;
    }

    /**
     * Set <p>AccessKey authorization configuration</p>
     * @param AccessKeyAuthConfig <p>AccessKey authorization configuration</p>
     */
    public void setAccessKeyAuthConfig(AccessKeyAuthConfig AccessKeyAuthConfig) {
        this.AccessKeyAuthConfig = AccessKeyAuthConfig;
    }

    public AuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthConfig(AuthConfig source) {
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ApiKeyAuthConfig != null) {
            this.ApiKeyAuthConfig = new ApiKeyAuthConfig(source.ApiKeyAuthConfig);
        }
        if (source.CamAuthConfig != null) {
            this.CamAuthConfig = new CamAuthConfig(source.CamAuthConfig);
        }
        if (source.OAuthConfig != null) {
            this.OAuthConfig = new OAuthConfig(source.OAuthConfig);
        }
        if (source.AccessKeyAuthConfig != null) {
            this.AccessKeyAuthConfig = new AccessKeyAuthConfig(source.AccessKeyAuthConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "ApiKeyAuthConfig.", this.ApiKeyAuthConfig);
        this.setParamObj(map, prefix + "CamAuthConfig.", this.CamAuthConfig);
        this.setParamObj(map, prefix + "OAuthConfig.", this.OAuthConfig);
        this.setParamObj(map, prefix + "AccessKeyAuthConfig.", this.AccessKeyAuthConfig);

    }
}

