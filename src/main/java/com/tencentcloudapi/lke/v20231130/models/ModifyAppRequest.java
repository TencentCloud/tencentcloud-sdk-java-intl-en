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

public class ModifyAppRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Basic application configuration.
    */
    @SerializedName("BaseConfig")
    @Expose
    private BaseConfig BaseConfig;

    /**
    * Application configuration.
    */
    @SerializedName("AppConfig")
    @Expose
    private AppConfig AppConfig;

    /**
    * Login to user's sub-account (required in integrator mode).	
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

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
     * Get Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction. 
     * @return AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     * @param AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Basic application configuration. 
     * @return BaseConfig Basic application configuration.
     */
    public BaseConfig getBaseConfig() {
        return this.BaseConfig;
    }

    /**
     * Set Basic application configuration.
     * @param BaseConfig Basic application configuration.
     */
    public void setBaseConfig(BaseConfig BaseConfig) {
        this.BaseConfig = BaseConfig;
    }

    /**
     * Get Application configuration. 
     * @return AppConfig Application configuration.
     */
    public AppConfig getAppConfig() {
        return this.AppConfig;
    }

    /**
     * Set Application configuration.
     * @param AppConfig Application configuration.
     */
    public void setAppConfig(AppConfig AppConfig) {
        this.AppConfig = AppConfig;
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

    public ModifyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppRequest(ModifyAppRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.BaseConfig != null) {
            this.BaseConfig = new BaseConfig(source.BaseConfig);
        }
        if (source.AppConfig != null) {
            this.AppConfig = new AppConfig(source.AppConfig);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamObj(map, prefix + "BaseConfig.", this.BaseConfig);
        this.setParamObj(map, prefix + "AppConfig.", this.AppConfig);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

