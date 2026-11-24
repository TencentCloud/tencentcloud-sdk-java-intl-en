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

public class MCPTokenInfo extends AbstractModel {

    /**
    * <p>TokenId</p><p>Used to manage Token data. It can be used to extend the validity period of the corresponding Token.</p>
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * <p>Token name (comment)</p>
    */
    @SerializedName("TokenName")
    @Expose
    private String TokenName;

    /**
    * <p>User Id</p><p>This UserId is always used to operate cloud rendering concurrent resources. (If this parameter is empty, no restriction is applied.)</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>Permission scope</p><p>Default value: [&quot;*&quot;]</p><p>Used to specify operation permissions. By default, all permissions are granted.</p>
    */
    @SerializedName("Scopes")
    @Expose
    private String [] Scopes;

    /**
    * <p>Token status</p><p>Valid values:</p><ul><li>ACTIVE: Normal status. The token has not been revoked, but it may not be within its validity period.</li><li>REVOKED: The token has been revoked and is permanently invalid.</li></ul><p>Default value: ACTIVE</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Token creation time</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Token expiration time</p>
    */
    @SerializedName("ExpiresTime")
    @Expose
    private String ExpiresTime;

    /**
     * Get <p>TokenId</p><p>Used to manage Token data. It can be used to extend the validity period of the corresponding Token.</p> 
     * @return TokenId <p>TokenId</p><p>Used to manage Token data. It can be used to extend the validity period of the corresponding Token.</p>
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set <p>TokenId</p><p>Used to manage Token data. It can be used to extend the validity period of the corresponding Token.</p>
     * @param TokenId <p>TokenId</p><p>Used to manage Token data. It can be used to extend the validity period of the corresponding Token.</p>
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get <p>Token name (comment)</p> 
     * @return TokenName <p>Token name (comment)</p>
     */
    public String getTokenName() {
        return this.TokenName;
    }

    /**
     * Set <p>Token name (comment)</p>
     * @param TokenName <p>Token name (comment)</p>
     */
    public void setTokenName(String TokenName) {
        this.TokenName = TokenName;
    }

    /**
     * Get <p>User Id</p><p>This UserId is always used to operate cloud rendering concurrent resources. (If this parameter is empty, no restriction is applied.)</p> 
     * @return UserId <p>User Id</p><p>This UserId is always used to operate cloud rendering concurrent resources. (If this parameter is empty, no restriction is applied.)</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>User Id</p><p>This UserId is always used to operate cloud rendering concurrent resources. (If this parameter is empty, no restriction is applied.)</p>
     * @param UserId <p>User Id</p><p>This UserId is always used to operate cloud rendering concurrent resources. (If this parameter is empty, no restriction is applied.)</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>Permission scope</p><p>Default value: [&quot;*&quot;]</p><p>Used to specify operation permissions. By default, all permissions are granted.</p> 
     * @return Scopes <p>Permission scope</p><p>Default value: [&quot;*&quot;]</p><p>Used to specify operation permissions. By default, all permissions are granted.</p>
     */
    public String [] getScopes() {
        return this.Scopes;
    }

    /**
     * Set <p>Permission scope</p><p>Default value: [&quot;*&quot;]</p><p>Used to specify operation permissions. By default, all permissions are granted.</p>
     * @param Scopes <p>Permission scope</p><p>Default value: [&quot;*&quot;]</p><p>Used to specify operation permissions. By default, all permissions are granted.</p>
     */
    public void setScopes(String [] Scopes) {
        this.Scopes = Scopes;
    }

    /**
     * Get <p>Token status</p><p>Valid values:</p><ul><li>ACTIVE: Normal status. The token has not been revoked, but it may not be within its validity period.</li><li>REVOKED: The token has been revoked and is permanently invalid.</li></ul><p>Default value: ACTIVE</p> 
     * @return Status <p>Token status</p><p>Valid values:</p><ul><li>ACTIVE: Normal status. The token has not been revoked, but it may not be within its validity period.</li><li>REVOKED: The token has been revoked and is permanently invalid.</li></ul><p>Default value: ACTIVE</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Token status</p><p>Valid values:</p><ul><li>ACTIVE: Normal status. The token has not been revoked, but it may not be within its validity period.</li><li>REVOKED: The token has been revoked and is permanently invalid.</li></ul><p>Default value: ACTIVE</p>
     * @param Status <p>Token status</p><p>Valid values:</p><ul><li>ACTIVE: Normal status. The token has not been revoked, but it may not be within its validity period.</li><li>REVOKED: The token has been revoked and is permanently invalid.</li></ul><p>Default value: ACTIVE</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Token creation time</p> 
     * @return CreatedTime <p>Token creation time</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Token creation time</p>
     * @param CreatedTime <p>Token creation time</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Token expiration time</p> 
     * @return ExpiresTime <p>Token expiration time</p>
     */
    public String getExpiresTime() {
        return this.ExpiresTime;
    }

    /**
     * Set <p>Token expiration time</p>
     * @param ExpiresTime <p>Token expiration time</p>
     */
    public void setExpiresTime(String ExpiresTime) {
        this.ExpiresTime = ExpiresTime;
    }

    public MCPTokenInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPTokenInfo(MCPTokenInfo source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.TokenName != null) {
            this.TokenName = new String(source.TokenName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Scopes != null) {
            this.Scopes = new String[source.Scopes.length];
            for (int i = 0; i < source.Scopes.length; i++) {
                this.Scopes[i] = new String(source.Scopes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiresTime != null) {
            this.ExpiresTime = new String(source.ExpiresTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "TokenName", this.TokenName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "Scopes.", this.Scopes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiresTime", this.ExpiresTime);

    }
}

