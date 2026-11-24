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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewMCPTokenRequest extends AbstractModel {

    /**
    * <p>TokenId</p>
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * <p>Token expiration time</p><p>Value range: [0, 2592000]</p><p>Default value: 86400</p><p>Unit: seconds. If not specified, the default is 1 day. The new expiration time is the current time plus ExpireSeconds.</p>
    */
    @SerializedName("ExpireSeconds")
    @Expose
    private Long ExpireSeconds;

    /**
     * Get <p>TokenId</p> 
     * @return TokenId <p>TokenId</p>
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set <p>TokenId</p>
     * @param TokenId <p>TokenId</p>
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get <p>Token expiration time</p><p>Value range: [0, 2592000]</p><p>Default value: 86400</p><p>Unit: seconds. If not specified, the default is 1 day. The new expiration time is the current time plus ExpireSeconds.</p> 
     * @return ExpireSeconds <p>Token expiration time</p><p>Value range: [0, 2592000]</p><p>Default value: 86400</p><p>Unit: seconds. If not specified, the default is 1 day. The new expiration time is the current time plus ExpireSeconds.</p>
     */
    public Long getExpireSeconds() {
        return this.ExpireSeconds;
    }

    /**
     * Set <p>Token expiration time</p><p>Value range: [0, 2592000]</p><p>Default value: 86400</p><p>Unit: seconds. If not specified, the default is 1 day. The new expiration time is the current time plus ExpireSeconds.</p>
     * @param ExpireSeconds <p>Token expiration time</p><p>Value range: [0, 2592000]</p><p>Default value: 86400</p><p>Unit: seconds. If not specified, the default is 1 day. The new expiration time is the current time plus ExpireSeconds.</p>
     */
    public void setExpireSeconds(Long ExpireSeconds) {
        this.ExpireSeconds = ExpireSeconds;
    }

    public RenewMCPTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewMCPTokenRequest(RenewMCPTokenRequest source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.ExpireSeconds != null) {
            this.ExpireSeconds = new Long(source.ExpireSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "ExpireSeconds", this.ExpireSeconds);

    }
}

