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

public class CreateConversationRequest extends AbstractModel {

    /**
    * <p>Session type. Enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share a link)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>App ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>User Sub-account logged in (required in integrator mode)</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * <p>User Main Account logged in (required in integrator mode)</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * <p>Required when Type=CONVERSATION_TYPE_SHARE. Share code</p>
    */
    @SerializedName("ShareCode")
    @Expose
    private String ShareCode;

    /**
    * <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>Client-side AgentId, available when "modify configuration dynamically in conversation" is enabled in Claw mode</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
     * Get <p>Session type. Enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share a link)</p> 
     * @return Type <p>Session type. Enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share a link)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Session type. Enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share a link)</p>
     * @param Type <p>Session type. Enumeration values: 0-CONVERSATION_TYPE_UNSPECIFIED (unspecified; means all in list query), 1-CONVERSATION_TYPE_VISITOR (visitor trial), 2-CONVERSATION_TYPE_EVALUATION (evaluation), 5-CONVERSATION_TYPE_API (API integration), 10-CONVERSATION_TYPE_WORKFLOW (workflow debugging), 20-CONVERSATION_TYPE_SHARE (share a link)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>App ID</p> 
     * @return AppId <p>App ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>App ID</p>
     * @param AppId <p>App ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Required when Type=CONVERSATION_TYPE_API. Application key</p> 
     * @return AppKey <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
     * @param AppKey <p>Required when Type=CONVERSATION_TYPE_API. Application key</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>User Sub-account logged in (required in integrator mode)</p> 
     * @return LoginSubAccountUin <p>User Sub-account logged in (required in integrator mode)</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>User Sub-account logged in (required in integrator mode)</p>
     * @param LoginSubAccountUin <p>User Sub-account logged in (required in integrator mode)</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get <p>User Main Account logged in (required in integrator mode)</p> 
     * @return LoginUin <p>User Main Account logged in (required in integrator mode)</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>User Main Account logged in (required in integrator mode)</p>
     * @param LoginUin <p>User Main Account logged in (required in integrator mode)</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get <p>Required when Type=CONVERSATION_TYPE_SHARE. Share code</p> 
     * @return ShareCode <p>Required when Type=CONVERSATION_TYPE_SHARE. Share code</p>
     */
    public String getShareCode() {
        return this.ShareCode;
    }

    /**
     * Set <p>Required when Type=CONVERSATION_TYPE_SHARE. Share code</p>
     * @param ShareCode <p>Required when Type=CONVERSATION_TYPE_SHARE. Share code</p>
     */
    public void setShareCode(String ShareCode) {
        this.ShareCode = ShareCode;
    }

    /**
     * Get <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p> 
     * @return UserId <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
     * @param UserId <p>Required when Type=CONVERSATION_TYPE_API. Visitor ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>Client-side AgentId, available when "modify configuration dynamically in conversation" is enabled in Claw mode</p> 
     * @return AgentId <p>Client-side AgentId, available when "modify configuration dynamically in conversation" is enabled in Claw mode</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Client-side AgentId, available when "modify configuration dynamically in conversation" is enabled in Claw mode</p>
     * @param AgentId <p>Client-side AgentId, available when "modify configuration dynamically in conversation" is enabled in Claw mode</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    public CreateConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConversationRequest(CreateConversationRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.ShareCode != null) {
            this.ShareCode = new String(source.ShareCode);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "ShareCode", this.ShareCode);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);

    }
}

