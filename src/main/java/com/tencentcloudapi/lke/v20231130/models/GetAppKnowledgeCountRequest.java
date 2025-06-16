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

public class GetAppKnowledgeCountRequest extends AbstractModel {

    /**
    * Type: doc - document; qa - Q&A pair.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Application ID.
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

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
     * Get Type: doc - document; qa - Q&A pair. 
     * @return Type Type: doc - document; qa - Q&A pair.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type: doc - document; qa - Q&A pair.
     * @param Type Type: doc - document; qa - Q&A pair.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Application ID. 
     * @return AppBizId Application ID.
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set Application ID.
     * @param AppBizId Application ID.
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
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

    public GetAppKnowledgeCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAppKnowledgeCountRequest(GetAppKnowledgeCountRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

