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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLivePlayAuthKeyRequest extends AbstractModel{

    /**
    * Domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable. 0: disabled; 1: enabled.
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
    * Authentication backkey.
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
     * Get Whether to enable. 0: disabled; 1: enabled. 
     * @return Enable Whether to enable. 0: disabled; 1: enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. 0: disabled; 1: enabled.
     * @param Enable Whether to enable. 0: disabled; 1: enabled.
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
     * Get Authentication backkey. 
     * @return AuthBackKey Authentication backkey.
     */
    public String getAuthBackKey() {
        return this.AuthBackKey;
    }

    /**
     * Set Authentication backkey.
     * @param AuthBackKey Authentication backkey.
     */
    public void setAuthBackKey(String AuthBackKey) {
        this.AuthBackKey = AuthBackKey;
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

