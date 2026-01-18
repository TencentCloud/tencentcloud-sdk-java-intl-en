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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationConfigInfo extends AbstractModel {

    /**
    * Superapp configuration type: 1 Non-production, 2 Production
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * Superapp package name
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * Superapp URL
    */
    @SerializedName("AppURL")
    @Expose
    private String AppURL;

    /**
    * Superapp configuration ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Superapp configuration type: 1 Non-production, 2 Production 
     * @return ApplicationType Superapp configuration type: 1 Non-production, 2 Production
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Superapp configuration type: 1 Non-production, 2 Production
     * @param ApplicationType Superapp configuration type: 1 Non-production, 2 Production
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Superapp package name 
     * @return AppKey Superapp package name
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set Superapp package name
     * @param AppKey Superapp package name
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get Superapp URL 
     * @return AppURL Superapp URL
     */
    public String getAppURL() {
        return this.AppURL;
    }

    /**
     * Set Superapp URL
     * @param AppURL Superapp URL
     */
    public void setAppURL(String AppURL) {
        this.AppURL = AppURL;
    }

    /**
     * Get Superapp configuration ID 
     * @return Id Superapp configuration ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Superapp configuration ID
     * @param Id Superapp configuration ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ApplicationConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationConfigInfo(ApplicationConfigInfo source) {
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.AppURL != null) {
            this.AppURL = new String(source.AppURL);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppURL", this.AppURL);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

