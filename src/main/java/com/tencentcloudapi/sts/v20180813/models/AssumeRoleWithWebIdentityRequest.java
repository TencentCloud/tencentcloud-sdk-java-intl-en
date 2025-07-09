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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleWithWebIdentityRequest extends AbstractModel {

    /**
    * Identity provider name
    */
    @SerializedName("ProviderId")
    @Expose
    private String ProviderId;

    /**
    * OIDC token issued by the IdP
    */
    @SerializedName("WebIdentityToken")
    @Expose
    private String WebIdentityToken;

    /**
    * Role access description name
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * Session name
    */
    @SerializedName("RoleSessionName")
    @Expose
    private String RoleSessionName;

    /**
    * The validity period of the temporary credential in seconds. Default value: 7,200s. Maximum value: 43,200s.
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get Identity provider name 
     * @return ProviderId Identity provider name
     */
    public String getProviderId() {
        return this.ProviderId;
    }

    /**
     * Set Identity provider name
     * @param ProviderId Identity provider name
     */
    public void setProviderId(String ProviderId) {
        this.ProviderId = ProviderId;
    }

    /**
     * Get OIDC token issued by the IdP 
     * @return WebIdentityToken OIDC token issued by the IdP
     */
    public String getWebIdentityToken() {
        return this.WebIdentityToken;
    }

    /**
     * Set OIDC token issued by the IdP
     * @param WebIdentityToken OIDC token issued by the IdP
     */
    public void setWebIdentityToken(String WebIdentityToken) {
        this.WebIdentityToken = WebIdentityToken;
    }

    /**
     * Get Role access description name 
     * @return RoleArn Role access description name
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set Role access description name
     * @param RoleArn Role access description name
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get Session name 
     * @return RoleSessionName Session name
     */
    public String getRoleSessionName() {
        return this.RoleSessionName;
    }

    /**
     * Set Session name
     * @param RoleSessionName Session name
     */
    public void setRoleSessionName(String RoleSessionName) {
        this.RoleSessionName = RoleSessionName;
    }

    /**
     * Get The validity period of the temporary credential in seconds. Default value: 7,200s. Maximum value: 43,200s. 
     * @return DurationSeconds The validity period of the temporary credential in seconds. Default value: 7,200s. Maximum value: 43,200s.
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set The validity period of the temporary credential in seconds. Default value: 7,200s. Maximum value: 43,200s.
     * @param DurationSeconds The validity period of the temporary credential in seconds. Default value: 7,200s. Maximum value: 43,200s.
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public AssumeRoleWithWebIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleWithWebIdentityRequest(AssumeRoleWithWebIdentityRequest source) {
        if (source.ProviderId != null) {
            this.ProviderId = new String(source.ProviderId);
        }
        if (source.WebIdentityToken != null) {
            this.WebIdentityToken = new String(source.WebIdentityToken);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.RoleSessionName != null) {
            this.RoleSessionName = new String(source.RoleSessionName);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderId", this.ProviderId);
        this.setParamSimple(map, prefix + "WebIdentityToken", this.WebIdentityToken);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

