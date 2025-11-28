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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OAuth extends AbstractModel {

    /**
    * Specifies whether to turn on or off authentication.
True: enable.
False: disabled.
Disabled by default.
    */
    @SerializedName("OAuthEnable")
    @Expose
    private Boolean OAuthEnable;

    /**
    * Deny requests or allow when all iaps fail.
BYPASS: specifies the bypass.
REJECT.
Defaults to BYPASS.
    */
    @SerializedName("OAuthFailureStatus")
    @Expose
    private String OAuthFailureStatus;

    /**
     * Get Specifies whether to turn on or off authentication.
True: enable.
False: disabled.
Disabled by default. 
     * @return OAuthEnable Specifies whether to turn on or off authentication.
True: enable.
False: disabled.
Disabled by default.
     */
    public Boolean getOAuthEnable() {
        return this.OAuthEnable;
    }

    /**
     * Set Specifies whether to turn on or off authentication.
True: enable.
False: disabled.
Disabled by default.
     * @param OAuthEnable Specifies whether to turn on or off authentication.
True: enable.
False: disabled.
Disabled by default.
     */
    public void setOAuthEnable(Boolean OAuthEnable) {
        this.OAuthEnable = OAuthEnable;
    }

    /**
     * Get Deny requests or allow when all iaps fail.
BYPASS: specifies the bypass.
REJECT.
Defaults to BYPASS. 
     * @return OAuthFailureStatus Deny requests or allow when all iaps fail.
BYPASS: specifies the bypass.
REJECT.
Defaults to BYPASS.
     */
    public String getOAuthFailureStatus() {
        return this.OAuthFailureStatus;
    }

    /**
     * Set Deny requests or allow when all iaps fail.
BYPASS: specifies the bypass.
REJECT.
Defaults to BYPASS.
     * @param OAuthFailureStatus Deny requests or allow when all iaps fail.
BYPASS: specifies the bypass.
REJECT.
Defaults to BYPASS.
     */
    public void setOAuthFailureStatus(String OAuthFailureStatus) {
        this.OAuthFailureStatus = OAuthFailureStatus;
    }

    public OAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OAuth(OAuth source) {
        if (source.OAuthEnable != null) {
            this.OAuthEnable = new Boolean(source.OAuthEnable);
        }
        if (source.OAuthFailureStatus != null) {
            this.OAuthFailureStatus = new String(source.OAuthFailureStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OAuthEnable", this.OAuthEnable);
        this.setParamSimple(map, prefix + "OAuthFailureStatus", this.OAuthFailureStatus);

    }
}

