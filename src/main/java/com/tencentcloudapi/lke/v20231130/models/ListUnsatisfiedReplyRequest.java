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

public class ListUnsatisfiedReplyRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Page number.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Login to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Login to user's sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * User request (question or answer).
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Error type retrieval.
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

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
     * Get Page number. 
     * @return PageNumber Page number.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number.
     * @param PageNumber Page number.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. 
     * @return PageSize Number of items per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page.
     * @param PageSize Number of items per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Login to user's root account (required in integrator mode). 
     * @return LoginUin Login to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Login to user's root account (required in integrator mode).
     * @param LoginUin Login to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Login to user's sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Login to user's sub-account (required in integrator mode).
     * @param LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get User request (question or answer). 
     * @return Query User request (question or answer).
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set User request (question or answer).
     * @param Query User request (question or answer).
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Error type retrieval. 
     * @return Reasons Error type retrieval.
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set Error type retrieval.
     * @param Reasons Error type retrieval.
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    public ListUnsatisfiedReplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUnsatisfiedReplyRequest(ListUnsatisfiedReplyRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);

    }
}

