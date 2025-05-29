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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttributeLabelRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Attribute ID.
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * Quantity loaded each time. 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Log in to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Log in to user's sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * Query a label or similar labels.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * The label ID of the scroll loading cursor.
    */
    @SerializedName("LastLabelBizId")
    @Expose
    private String LastLabelBizId;

    /**
    * Query scope: 
all (or leave it blank): standard words and similar words 
standard: standard words 
similar: similar words
    */
    @SerializedName("QueryScope")
    @Expose
    private String QueryScope;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Attribute ID. 
     * @return AttributeBizId Attribute ID.
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set Attribute ID.
     * @param AttributeBizId Attribute ID.
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get Quantity loaded each time.  
     * @return Limit Quantity loaded each time. 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity loaded each time. 
     * @param Limit Quantity loaded each time. 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log in to user's root account (required in integrator mode). 
     * @return LoginUin Log in to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Log in to user's root account (required in integrator mode).
     * @param LoginUin Log in to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Log in to user's sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Log in to user's sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Log in to user's sub-account (required in integrator mode).
     * @param LoginSubAccountUin Log in to user's sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get Query a label or similar labels. 
     * @return Query Query a label or similar labels.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query a label or similar labels.
     * @param Query Query a label or similar labels.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get The label ID of the scroll loading cursor. 
     * @return LastLabelBizId The label ID of the scroll loading cursor.
     */
    public String getLastLabelBizId() {
        return this.LastLabelBizId;
    }

    /**
     * Set The label ID of the scroll loading cursor.
     * @param LastLabelBizId The label ID of the scroll loading cursor.
     */
    public void setLastLabelBizId(String LastLabelBizId) {
        this.LastLabelBizId = LastLabelBizId;
    }

    /**
     * Get Query scope: 
all (or leave it blank): standard words and similar words 
standard: standard words 
similar: similar words 
     * @return QueryScope Query scope: 
all (or leave it blank): standard words and similar words 
standard: standard words 
similar: similar words
     */
    public String getQueryScope() {
        return this.QueryScope;
    }

    /**
     * Set Query scope: 
all (or leave it blank): standard words and similar words 
standard: standard words 
similar: similar words
     * @param QueryScope Query scope: 
all (or leave it blank): standard words and similar words 
standard: standard words 
similar: similar words
     */
    public void setQueryScope(String QueryScope) {
        this.QueryScope = QueryScope;
    }

    public DescribeAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttributeLabelRequest(DescribeAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.LastLabelBizId != null) {
            this.LastLabelBizId = new String(source.LastLabelBizId);
        }
        if (source.QueryScope != null) {
            this.QueryScope = new String(source.QueryScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "LastLabelBizId", this.LastLabelBizId);
        this.setParamSimple(map, prefix + "QueryScope", this.QueryScope);

    }
}

