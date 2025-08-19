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

public class CreateEmbedTokenRequest extends AbstractModel {

    /**
    * Shares the project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
    */
    @SerializedName("Intention")
    @Expose
    private String Intention;

    /**
    * "page" indicates embedding a page, "panel" indicates embedding the entire dashboard, and "project" is used for ChatBI embedding.
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * Expiration time. Unit: minutes. Maximum value: 240 (namely, 4 hours). Default value: 240.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Alternate field.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * User enterprise ID (only used for multi-user).
    */
    @SerializedName("UserCorpId")
    @Expose
    private String UserCorpId;

    /**
    * User ID (only used for multi-user).
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Access count limit (range: 1-99999). Leave empty to disable access restrictions.
    */
    @SerializedName("TicketNum")
    @Expose
    private Long TicketNum;

    /**
    * Global filter parameters: Applies to all report filter criteria. Should be formatted as a JSON string.
** Currently, only character-type page parameters can be bound to global parameters.
**
[
    {
"ParamKey": "name", page parameter name.
"JoinType": "AND", // connection method. Currently, only AND is supported.
        "WhereList": [
            {
"Operator": "-neq", // operator. Refer to the following instructions.
"Value": [ action value. For a single-value array, only one value is passed.
                    "zZWJMD",
                    "ZzVGHX",
"Hunan province".
"Hebei province".
                ]
            }
        ]
    },
    {
        "ParamKey": "genderParam",
        "JoinType": "AND",
        "WhereList": [
            {
                "Operator": "-neq",
                "Value": [
"Male".
                ]
            }
        ]
    }
]



Currently supported operators.
 -neq not equal to != operator.
 -eq equal to = operator.
 -is in operator.

    */
    @SerializedName("GlobalParam")
    @Expose
    private String GlobalParam;

    /**
    * 100: no user bound. Create 1 token at a time. UserCorpId and UserId are optional. ChatBI embedding is not supported.
200: single token per user. Create 1 token at a time. UserCorpId and UserId required.
300: multiple tokens per user. Create multiple tokens at a time. UserCorpId and UserId required.
    */
    @SerializedName("TokenType")
    @Expose
    private Long TokenType;

    /**
    * The number of tokens created at one time.
    */
    @SerializedName("TokenNum")
    @Expose
    private Long TokenNum;

    /**
    * Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
    */
    @SerializedName("ConfigParam")
    @Expose
    private String ConfigParam;

    /**
     * Get Shares the project ID. 
     * @return ProjectId Shares the project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Shares the project ID.
     * @param ProjectId Shares the project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI. 
     * @return PageId Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.
     * @param PageId Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding. 
     * @return Intention "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
     */
    public String getIntention() {
        return this.Intention;
    }

    /**
     * Set "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
     * @param Intention "embed" indicates page dashboard embedding, and "chatBIEmbed" indicates ChatBI embedding.
     */
    public void setIntention(String Intention) {
        this.Intention = Intention;
    }

    /**
     * Get "page" indicates embedding a page, "panel" indicates embedding the entire dashboard, and "project" is used for ChatBI embedding. 
     * @return Scope "page" indicates embedding a page, "panel" indicates embedding the entire dashboard, and "project" is used for ChatBI embedding.
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set "page" indicates embedding a page, "panel" indicates embedding the entire dashboard, and "project" is used for ChatBI embedding.
     * @param Scope "page" indicates embedding a page, "panel" indicates embedding the entire dashboard, and "project" is used for ChatBI embedding.
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Expiration time. Unit: minutes. Maximum value: 240 (namely, 4 hours). Default value: 240. 
     * @return ExpireTime Expiration time. Unit: minutes. Maximum value: 240 (namely, 4 hours). Default value: 240.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time. Unit: minutes. Maximum value: 240 (namely, 4 hours). Default value: 240.
     * @param ExpireTime Expiration time. Unit: minutes. Maximum value: 240 (namely, 4 hours). Default value: 240.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Alternate field. 
     * @return ExtraParam Alternate field.
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set Alternate field.
     * @param ExtraParam Alternate field.
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get User enterprise ID (only used for multi-user). 
     * @return UserCorpId User enterprise ID (only used for multi-user).
     */
    public String getUserCorpId() {
        return this.UserCorpId;
    }

    /**
     * Set User enterprise ID (only used for multi-user).
     * @param UserCorpId User enterprise ID (only used for multi-user).
     */
    public void setUserCorpId(String UserCorpId) {
        this.UserCorpId = UserCorpId;
    }

    /**
     * Get User ID (only used for multi-user). 
     * @return UserId User ID (only used for multi-user).
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID (only used for multi-user).
     * @param UserId User ID (only used for multi-user).
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Access count limit (range: 1-99999). Leave empty to disable access restrictions. 
     * @return TicketNum Access count limit (range: 1-99999). Leave empty to disable access restrictions.
     */
    public Long getTicketNum() {
        return this.TicketNum;
    }

    /**
     * Set Access count limit (range: 1-99999). Leave empty to disable access restrictions.
     * @param TicketNum Access count limit (range: 1-99999). Leave empty to disable access restrictions.
     */
    public void setTicketNum(Long TicketNum) {
        this.TicketNum = TicketNum;
    }

    /**
     * Get Global filter parameters: Applies to all report filter criteria. Should be formatted as a JSON string.
** Currently, only character-type page parameters can be bound to global parameters.
**
[
    {
"ParamKey": "name", page parameter name.
"JoinType": "AND", // connection method. Currently, only AND is supported.
        "WhereList": [
            {
"Operator": "-neq", // operator. Refer to the following instructions.
"Value": [ action value. For a single-value array, only one value is passed.
                    "zZWJMD",
                    "ZzVGHX",
"Hunan province".
"Hebei province".
                ]
            }
        ]
    },
    {
        "ParamKey": "genderParam",
        "JoinType": "AND",
        "WhereList": [
            {
                "Operator": "-neq",
                "Value": [
"Male".
                ]
            }
        ]
    }
]



Currently supported operators.
 -neq not equal to != operator.
 -eq equal to = operator.
 -is in operator.
 
     * @return GlobalParam Global filter parameters: Applies to all report filter criteria. Should be formatted as a JSON string.
** Currently, only character-type page parameters can be bound to global parameters.
**
[
    {
"ParamKey": "name", page parameter name.
"JoinType": "AND", // connection method. Currently, only AND is supported.
        "WhereList": [
            {
"Operator": "-neq", // operator. Refer to the following instructions.
"Value": [ action value. For a single-value array, only one value is passed.
                    "zZWJMD",
                    "ZzVGHX",
"Hunan province".
"Hebei province".
                ]
            }
        ]
    },
    {
        "ParamKey": "genderParam",
        "JoinType": "AND",
        "WhereList": [
            {
                "Operator": "-neq",
                "Value": [
"Male".
                ]
            }
        ]
    }
]



Currently supported operators.
 -neq not equal to != operator.
 -eq equal to = operator.
 -is in operator.

     */
    public String getGlobalParam() {
        return this.GlobalParam;
    }

    /**
     * Set Global filter parameters: Applies to all report filter criteria. Should be formatted as a JSON string.
** Currently, only character-type page parameters can be bound to global parameters.
**
[
    {
"ParamKey": "name", page parameter name.
"JoinType": "AND", // connection method. Currently, only AND is supported.
        "WhereList": [
            {
"Operator": "-neq", // operator. Refer to the following instructions.
"Value": [ action value. For a single-value array, only one value is passed.
                    "zZWJMD",
                    "ZzVGHX",
"Hunan province".
"Hebei province".
                ]
            }
        ]
    },
    {
        "ParamKey": "genderParam",
        "JoinType": "AND",
        "WhereList": [
            {
                "Operator": "-neq",
                "Value": [
"Male".
                ]
            }
        ]
    }
]



Currently supported operators.
 -neq not equal to != operator.
 -eq equal to = operator.
 -is in operator.

     * @param GlobalParam Global filter parameters: Applies to all report filter criteria. Should be formatted as a JSON string.
** Currently, only character-type page parameters can be bound to global parameters.
**
[
    {
"ParamKey": "name", page parameter name.
"JoinType": "AND", // connection method. Currently, only AND is supported.
        "WhereList": [
            {
"Operator": "-neq", // operator. Refer to the following instructions.
"Value": [ action value. For a single-value array, only one value is passed.
                    "zZWJMD",
                    "ZzVGHX",
"Hunan province".
"Hebei province".
                ]
            }
        ]
    },
    {
        "ParamKey": "genderParam",
        "JoinType": "AND",
        "WhereList": [
            {
                "Operator": "-neq",
                "Value": [
"Male".
                ]
            }
        ]
    }
]



Currently supported operators.
 -neq not equal to != operator.
 -eq equal to = operator.
 -is in operator.

     */
    public void setGlobalParam(String GlobalParam) {
        this.GlobalParam = GlobalParam;
    }

    /**
     * Get 100: no user bound. Create 1 token at a time. UserCorpId and UserId are optional. ChatBI embedding is not supported.
200: single token per user. Create 1 token at a time. UserCorpId and UserId required.
300: multiple tokens per user. Create multiple tokens at a time. UserCorpId and UserId required. 
     * @return TokenType 100: no user bound. Create 1 token at a time. UserCorpId and UserId are optional. ChatBI embedding is not supported.
200: single token per user. Create 1 token at a time. UserCorpId and UserId required.
300: multiple tokens per user. Create multiple tokens at a time. UserCorpId and UserId required.
     */
    public Long getTokenType() {
        return this.TokenType;
    }

    /**
     * Set 100: no user bound. Create 1 token at a time. UserCorpId and UserId are optional. ChatBI embedding is not supported.
200: single token per user. Create 1 token at a time. UserCorpId and UserId required.
300: multiple tokens per user. Create multiple tokens at a time. UserCorpId and UserId required.
     * @param TokenType 100: no user bound. Create 1 token at a time. UserCorpId and UserId are optional. ChatBI embedding is not supported.
200: single token per user. Create 1 token at a time. UserCorpId and UserId required.
300: multiple tokens per user. Create multiple tokens at a time. UserCorpId and UserId required.
     */
    public void setTokenType(Long TokenType) {
        this.TokenType = TokenType;
    }

    /**
     * Get The number of tokens created at one time. 
     * @return TokenNum The number of tokens created at one time.
     */
    public Long getTokenNum() {
        return this.TokenNum;
    }

    /**
     * Set The number of tokens created at one time.
     * @param TokenNum The number of tokens created at one time.
     */
    public void setTokenNum(Long TokenNum) {
        this.TokenNum = TokenNum;
    }

    /**
     * Get Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature. 
     * @return ConfigParam Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
     */
    public String getConfigParam() {
        return this.ConfigParam;
    }

    /**
     * Set Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
     * @param ConfigParam Embedded display configurations: Currently for ChatBI embedding scenarios; TableFilter represents data table list filtering, SqlView represents SQL view feature.
     */
    public void setConfigParam(String ConfigParam) {
        this.ConfigParam = ConfigParam;
    }

    public CreateEmbedTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmbedTokenRequest(CreateEmbedTokenRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.Intention != null) {
            this.Intention = new String(source.Intention);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
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
        if (source.TokenType != null) {
            this.TokenType = new Long(source.TokenType);
        }
        if (source.TokenNum != null) {
            this.TokenNum = new Long(source.TokenNum);
        }
        if (source.ConfigParam != null) {
            this.ConfigParam = new String(source.ConfigParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "Intention", this.Intention);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "UserCorpId", this.UserCorpId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TicketNum", this.TicketNum);
        this.setParamSimple(map, prefix + "GlobalParam", this.GlobalParam);
        this.setParamSimple(map, prefix + "TokenType", this.TokenType);
        this.setParamSimple(map, prefix + "TokenNum", this.TokenNum);
        this.setParamSimple(map, prefix + "ConfigParam", this.ConfigParam);

    }
}

