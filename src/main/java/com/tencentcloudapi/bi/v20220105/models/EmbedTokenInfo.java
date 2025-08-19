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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbedTokenInfo extends AbstractModel {

    /**
    * Information identifier.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Token.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BIToken")
    @Expose
    private String BIToken;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Creator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Updater.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * Update time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * Backup.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * Embedding type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * Expiration time (in minutes), with a maximum value of 240.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * User enterprise ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserCorpId")
    @Expose
    private String UserCorpId;

    /**
    * User ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Access count limit (range: 1–99999). Leave empty to disable access restrictions.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TicketNum")
    @Expose
    private Long TicketNum;

    /**
    * Global parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GlobalParam")
    @Expose
    private String GlobalParam;

    /**
    * "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Intention")
    @Expose
    private String Intention;

    /**
    * 100: no bound user.
200: single token per user.
300: multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TokenType")
    @Expose
    private Long TokenType;

    /**
    * Number of tokens.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TokenNum")
    @Expose
    private Long TokenNum;

    /**
    * Whether it is multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SingleUserMultiToken")
    @Expose
    private Boolean SingleUserMultiToken;

    /**
    * Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigParam")
    @Expose
    private String ConfigParam;

    /**
     * Get Information identifier.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Information identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Information identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Information identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Token.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BIToken Token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBIToken() {
        return this.BIToken;
    }

    /**
     * Set Token.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BIToken Token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBIToken(String BIToken) {
        this.BIToken = BIToken;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Creator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Updater.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedUser Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedUser Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get Update time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Page ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageId Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageId Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Backup.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraParam Backup.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set Backup.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraParam Backup.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get Embedding type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scope Embedding type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set Embedding type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scope Embedding type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Expiration time (in minutes), with a maximum value of 240.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time (in minutes), with a maximum value of 240.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time (in minutes), with a maximum value of 240.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time (in minutes), with a maximum value of 240.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get User enterprise ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserCorpId User enterprise ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserCorpId() {
        return this.UserCorpId;
    }

    /**
     * Set User enterprise ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserCorpId User enterprise ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserCorpId(String UserCorpId) {
        this.UserCorpId = UserCorpId;
    }

    /**
     * Get User ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID (only used for multi-user).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Access count limit (range: 1–99999). Leave empty to disable access restrictions.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TicketNum Access count limit (range: 1–99999). Leave empty to disable access restrictions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTicketNum() {
        return this.TicketNum;
    }

    /**
     * Set Access count limit (range: 1–99999). Leave empty to disable access restrictions.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TicketNum Access count limit (range: 1–99999). Leave empty to disable access restrictions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTicketNum(Long TicketNum) {
        this.TicketNum = TicketNum;
    }

    /**
     * Get Global parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GlobalParam Global parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGlobalParam() {
        return this.GlobalParam;
    }

    /**
     * Set Global parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GlobalParam Global parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGlobalParam(String GlobalParam) {
        this.GlobalParam = GlobalParam;
    }

    /**
     * Get "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Intention "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIntention() {
        return this.Intention;
    }

    /**
     * Set "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Intention "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntention(String Intention) {
        this.Intention = Intention;
    }

    /**
     * Get 100: no bound user.
200: single token per user.
300: multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TokenType 100: no bound user.
200: single token per user.
300: multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTokenType() {
        return this.TokenType;
    }

    /**
     * Set 100: no bound user.
200: single token per user.
300: multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TokenType 100: no bound user.
200: single token per user.
300: multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTokenType(Long TokenType) {
        this.TokenType = TokenType;
    }

    /**
     * Get Number of tokens.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TokenNum Number of tokens.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTokenNum() {
        return this.TokenNum;
    }

    /**
     * Set Number of tokens.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TokenNum Number of tokens.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTokenNum(Long TokenNum) {
        this.TokenNum = TokenNum;
    }

    /**
     * Get Whether it is multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SingleUserMultiToken Whether it is multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSingleUserMultiToken() {
        return this.SingleUserMultiToken;
    }

    /**
     * Set Whether it is multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SingleUserMultiToken Whether it is multiple tokens per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSingleUserMultiToken(Boolean SingleUserMultiToken) {
        this.SingleUserMultiToken = SingleUserMultiToken;
    }

    /**
     * Get Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigParam Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigParam() {
        return this.ConfigParam;
    }

    /**
     * Set Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigParam Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigParam(String ConfigParam) {
        this.ConfigParam = ConfigParam;
    }

    public EmbedTokenInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbedTokenInfo(EmbedTokenInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BIToken != null) {
            this.BIToken = new String(source.BIToken);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.UserCorpId != null) {
            this.UserCorpId = new String(source.UserCorpId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TicketNum != null) {
            this.TicketNum = new Long(source.TicketNum);
        }
        if (source.GlobalParam != null) {
            this.GlobalParam = new String(source.GlobalParam);
        }
        if (source.Intention != null) {
            this.Intention = new String(source.Intention);
        }
        if (source.TokenType != null) {
            this.TokenType = new Long(source.TokenType);
        }
        if (source.TokenNum != null) {
            this.TokenNum = new Long(source.TokenNum);
        }
        if (source.SingleUserMultiToken != null) {
            this.SingleUserMultiToken = new Boolean(source.SingleUserMultiToken);
        }
        if (source.ConfigParam != null) {
            this.ConfigParam = new String(source.ConfigParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BIToken", this.BIToken);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UserCorpId", this.UserCorpId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TicketNum", this.TicketNum);
        this.setParamSimple(map, prefix + "GlobalParam", this.GlobalParam);
        this.setParamSimple(map, prefix + "Intention", this.Intention);
        this.setParamSimple(map, prefix + "TokenType", this.TokenType);
        this.setParamSimple(map, prefix + "TokenNum", this.TokenNum);
        this.setParamSimple(map, prefix + "SingleUserMultiToken", this.SingleUserMultiToken);
        this.setParamSimple(map, prefix + "ConfigParam", this.ConfigParam);

    }
}

