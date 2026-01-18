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

public class ModifyApplicationConfigRequest extends AbstractModel {

    /**
    * Superapp ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Superapp configuration ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Package name: corresponds to packageName on Android and bundleId on iOS
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
     * Get Superapp ID 
     * @return ApplicationId Superapp ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID
     * @param ApplicationId Superapp ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
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

    /**
     * Get Package name: corresponds to packageName on Android and bundleId on iOS 
     * @return AppKey Package name: corresponds to packageName on Android and bundleId on iOS
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set Package name: corresponds to packageName on Android and bundleId on iOS
     * @param AppKey Package name: corresponds to packageName on Android and bundleId on iOS
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

    public ModifyApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationConfigRequest(ModifyApplicationConfigRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.AppURL != null) {
            this.AppURL = new String(source.AppURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppURL", this.AppURL);

    }
}

