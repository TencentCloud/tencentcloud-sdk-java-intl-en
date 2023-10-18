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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceTokenResponse extends AbstractModel {

    /**
    * Username
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Access credential
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Expiration timestamp of access credential. It is a string of numbers without unit.
    */
    @SerializedName("ExpTime")
    @Expose
    private Long ExpTime;

    /**
    * Token ID of long-term access credential. It is not available to temporary access credential.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Username
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Username Username
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Username Username
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Access credential 
     * @return Token Access credential
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Access credential
     * @param Token Access credential
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Expiration timestamp of access credential. It is a string of numbers without unit. 
     * @return ExpTime Expiration timestamp of access credential. It is a string of numbers without unit.
     */
    public Long getExpTime() {
        return this.ExpTime;
    }

    /**
     * Set Expiration timestamp of access credential. It is a string of numbers without unit.
     * @param ExpTime Expiration timestamp of access credential. It is a string of numbers without unit.
     */
    public void setExpTime(Long ExpTime) {
        this.ExpTime = ExpTime;
    }

    /**
     * Get Token ID of long-term access credential. It is not available to temporary access credential.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return TokenId Token ID of long-term access credential. It is not available to temporary access credential.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set Token ID of long-term access credential. It is not available to temporary access credential.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param TokenId Token ID of long-term access credential. It is not available to temporary access credential.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateInstanceTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceTokenResponse(CreateInstanceTokenResponse source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpTime != null) {
            this.ExpTime = new Long(source.ExpTime);
        }
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpTime", this.ExpTime);
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

