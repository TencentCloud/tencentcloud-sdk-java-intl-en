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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationBaseInfoRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application program execution path.
    */
    @SerializedName("ApplicationExePath")
    @Expose
    private String ApplicationExePath;

    /**
    * Application process list.
    */
    @SerializedName("ApplicationInterList")
    @Expose
    private String ApplicationInterList;

    /**
    * Application basic data.
    */
    @SerializedName("ApplicationBaseInfo")
    @Expose
    private ApplicationBaseInfo ApplicationBaseInfo;

    /**
    * Application startup parameters.
    */
    @SerializedName("ApplicationParams")
    @Expose
    private String ApplicationParams;

    /**
    * Application name.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application repository information list.
    */
    @SerializedName("ApplicationStores")
    @Expose
    private UserApplicationStore [] ApplicationStores;

    /**
     * Get Application ID. 
     * @return ApplicationId Application ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID.
     * @param ApplicationId Application ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application program execution path. 
     * @return ApplicationExePath Application program execution path.
     */
    public String getApplicationExePath() {
        return this.ApplicationExePath;
    }

    /**
     * Set Application program execution path.
     * @param ApplicationExePath Application program execution path.
     */
    public void setApplicationExePath(String ApplicationExePath) {
        this.ApplicationExePath = ApplicationExePath;
    }

    /**
     * Get Application process list. 
     * @return ApplicationInterList Application process list.
     */
    public String getApplicationInterList() {
        return this.ApplicationInterList;
    }

    /**
     * Set Application process list.
     * @param ApplicationInterList Application process list.
     */
    public void setApplicationInterList(String ApplicationInterList) {
        this.ApplicationInterList = ApplicationInterList;
    }

    /**
     * Get Application basic data. 
     * @return ApplicationBaseInfo Application basic data.
     */
    public ApplicationBaseInfo getApplicationBaseInfo() {
        return this.ApplicationBaseInfo;
    }

    /**
     * Set Application basic data.
     * @param ApplicationBaseInfo Application basic data.
     */
    public void setApplicationBaseInfo(ApplicationBaseInfo ApplicationBaseInfo) {
        this.ApplicationBaseInfo = ApplicationBaseInfo;
    }

    /**
     * Get Application startup parameters. 
     * @return ApplicationParams Application startup parameters.
     */
    public String getApplicationParams() {
        return this.ApplicationParams;
    }

    /**
     * Set Application startup parameters.
     * @param ApplicationParams Application startup parameters.
     */
    public void setApplicationParams(String ApplicationParams) {
        this.ApplicationParams = ApplicationParams;
    }

    /**
     * Get Application name. 
     * @return ApplicationName Application name.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name.
     * @param ApplicationName Application name.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application repository information list. 
     * @return ApplicationStores Application repository information list.
     */
    public UserApplicationStore [] getApplicationStores() {
        return this.ApplicationStores;
    }

    /**
     * Set Application repository information list.
     * @param ApplicationStores Application repository information list.
     */
    public void setApplicationStores(UserApplicationStore [] ApplicationStores) {
        this.ApplicationStores = ApplicationStores;
    }

    public ModifyApplicationBaseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationBaseInfoRequest(ModifyApplicationBaseInfoRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationExePath != null) {
            this.ApplicationExePath = new String(source.ApplicationExePath);
        }
        if (source.ApplicationInterList != null) {
            this.ApplicationInterList = new String(source.ApplicationInterList);
        }
        if (source.ApplicationBaseInfo != null) {
            this.ApplicationBaseInfo = new ApplicationBaseInfo(source.ApplicationBaseInfo);
        }
        if (source.ApplicationParams != null) {
            this.ApplicationParams = new String(source.ApplicationParams);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationStores != null) {
            this.ApplicationStores = new UserApplicationStore[source.ApplicationStores.length];
            for (int i = 0; i < source.ApplicationStores.length; i++) {
                this.ApplicationStores[i] = new UserApplicationStore(source.ApplicationStores[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationExePath", this.ApplicationExePath);
        this.setParamSimple(map, prefix + "ApplicationInterList", this.ApplicationInterList);
        this.setParamObj(map, prefix + "ApplicationBaseInfo.", this.ApplicationBaseInfo);
        this.setParamSimple(map, prefix + "ApplicationParams", this.ApplicationParams);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamArrayObj(map, prefix + "ApplicationStores.", this.ApplicationStores);

    }
}

