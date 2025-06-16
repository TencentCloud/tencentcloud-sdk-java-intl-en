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

public class DescribeReferRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Quota ID
    */
    @SerializedName("ReferBizIds")
    @Expose
    private String [] ReferBizIds;

    /**
    * Log in to the user's root account (required in the integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Login user sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get Application ID 
     * @return BotBizId Application ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID
     * @param BotBizId Application ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Quota ID 
     * @return ReferBizIds Quota ID
     */
    public String [] getReferBizIds() {
        return this.ReferBizIds;
    }

    /**
     * Set Quota ID
     * @param ReferBizIds Quota ID
     */
    public void setReferBizIds(String [] ReferBizIds) {
        this.ReferBizIds = ReferBizIds;
    }

    /**
     * Get Log in to the user's root account (required in the integrator mode). 
     * @return LoginUin Log in to the user's root account (required in the integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Log in to the user's root account (required in the integrator mode).
     * @param LoginUin Log in to the user's root account (required in the integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Login user sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Login user sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Login user sub-account (required in integrator mode).
     * @param LoginSubAccountUin Login user sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public DescribeReferRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReferRequest(DescribeReferRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.ReferBizIds != null) {
            this.ReferBizIds = new String[source.ReferBizIds.length];
            for (int i = 0; i < source.ReferBizIds.length; i++) {
                this.ReferBizIds[i] = new String(source.ReferBizIds[i]);
            }
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "ReferBizIds.", this.ReferBizIds);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

