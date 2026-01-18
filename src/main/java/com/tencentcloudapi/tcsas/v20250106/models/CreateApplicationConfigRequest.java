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

public class CreateApplicationConfigRequest extends AbstractModel {

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
    * Superapp type. 1: Test; 2: Formal
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * Superapp operating system. 2 Android 3 iOS
    */
    @SerializedName("ApplicationPlatformType")
    @Expose
    private Long ApplicationPlatformType;

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
     * Get Superapp type. 1: Test; 2: Formal 
     * @return ApplicationType Superapp type. 1: Test; 2: Formal
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Superapp type. 1: Test; 2: Formal
     * @param ApplicationType Superapp type. 1: Test; 2: Formal
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Superapp operating system. 2 Android 3 iOS 
     * @return ApplicationPlatformType Superapp operating system. 2 Android 3 iOS
     */
    public Long getApplicationPlatformType() {
        return this.ApplicationPlatformType;
    }

    /**
     * Set Superapp operating system. 2 Android 3 iOS
     * @param ApplicationPlatformType Superapp operating system. 2 Android 3 iOS
     */
    public void setApplicationPlatformType(Long ApplicationPlatformType) {
        this.ApplicationPlatformType = ApplicationPlatformType;
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

    public CreateApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationConfigRequest(CreateApplicationConfigRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.ApplicationPlatformType != null) {
            this.ApplicationPlatformType = new Long(source.ApplicationPlatformType);
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
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ApplicationPlatformType", this.ApplicationPlatformType);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppURL", this.AppURL);

    }
}

