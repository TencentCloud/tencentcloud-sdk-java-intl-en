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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayAuthKeyInfo extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable:
0: disable.
1: enable.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Authentication key.
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * Validity period in seconds.
    */
    @SerializedName("AuthDelta")
    @Expose
    private Long AuthDelta;

    /**
    * Authentication `BackKey`.
    */
    @SerializedName("AuthBackKey")
    @Expose
    private String AuthBackKey;

    /**
     * Get Domain name. 
     * @return DomainName Domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name.
     * @param DomainName Domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to enable:
0: disable.
1: enable. 
     * @return Enable Whether to enable:
0: disable.
1: enable.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable:
0: disable.
1: enable.
     * @param Enable Whether to enable:
0: disable.
1: enable.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Authentication key. 
     * @return AuthKey Authentication key.
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set Authentication key.
     * @param AuthKey Authentication key.
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get Validity period in seconds. 
     * @return AuthDelta Validity period in seconds.
     */
    public Long getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * Set Validity period in seconds.
     * @param AuthDelta Validity period in seconds.
     */
    public void setAuthDelta(Long AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * Get Authentication `BackKey`. 
     * @return AuthBackKey Authentication `BackKey`.
     */
    public String getAuthBackKey() {
        return this.AuthBackKey;
    }

    /**
     * Set Authentication `BackKey`.
     * @param AuthBackKey Authentication `BackKey`.
     */
    public void setAuthBackKey(String AuthBackKey) {
        this.AuthBackKey = AuthBackKey;
    }

    public PlayAuthKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayAuthKeyInfo(PlayAuthKeyInfo source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AuthKey != null) {
            this.AuthKey = new String(source.AuthKey);
        }
        if (source.AuthDelta != null) {
            this.AuthDelta = new Long(source.AuthDelta);
        }
        if (source.AuthBackKey != null) {
            this.AuthBackKey = new String(source.AuthBackKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);
        this.setParamSimple(map, prefix + "AuthDelta", this.AuthDelta);
        this.setParamSimple(map, prefix + "AuthBackKey", this.AuthBackKey);

    }
}

