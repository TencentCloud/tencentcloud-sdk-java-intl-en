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
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Authentication key.
If this parameter is left empty, the current value will not be modified.
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * Validity period in seconds.
If this parameter is left empty, the current value will not be modified.
    */
    @SerializedName("AuthDelta")
    @Expose
    private Long AuthDelta;

    /**
    * Backup authentication key.
If this parameter is left empty, the current value will not be modified.
    */
    @SerializedName("AuthBackKey")
    @Expose
    private String AuthBackKey;

    /**
     * Get Playback domain name. 
     * @return DomainName Playback domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name.
     * @param DomainName Playback domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified. 
     * @return Enable Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
     * @param Enable Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Authentication key.
If this parameter is left empty, the current value will not be modified. 
     * @return AuthKey Authentication key.
If this parameter is left empty, the current value will not be modified.
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set Authentication key.
If this parameter is left empty, the current value will not be modified.
     * @param AuthKey Authentication key.
If this parameter is left empty, the current value will not be modified.
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get Validity period in seconds.
If this parameter is left empty, the current value will not be modified. 
     * @return AuthDelta Validity period in seconds.
If this parameter is left empty, the current value will not be modified.
     */
    public Long getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * Set Validity period in seconds.
If this parameter is left empty, the current value will not be modified.
     * @param AuthDelta Validity period in seconds.
If this parameter is left empty, the current value will not be modified.
     */
    public void setAuthDelta(Long AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * Get Backup authentication key.
If this parameter is left empty, the current value will not be modified. 
     * @return AuthBackKey Backup authentication key.
If this parameter is left empty, the current value will not be modified.
     */
    public String getAuthBackKey() {
        return this.AuthBackKey;
    }

    /**
     * Set Backup authentication key.
If this parameter is left empty, the current value will not be modified.
     * @param AuthBackKey Backup authentication key.
If this parameter is left empty, the current value will not be modified.
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

