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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiAppApiInfo extends AbstractModel{

    /**
    * Application name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppName")
    @Expose
    private String ApiAppName;

    /**
    * Application ID
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * API ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * Service ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Binding authorization time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizedTime")
    @Expose
    private String AuthorizedTime;

    /**
    * API region
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiRegion")
    @Expose
    private String ApiRegion;

    /**
    * Authorized binding environment
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
     * Get Application name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppName Application name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAppName() {
        return this.ApiAppName;
    }

    /**
     * Set Application name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppName Application name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppName(String ApiAppName) {
        this.ApiAppName = ApiAppName;
    }

    /**
     * Get Application ID 
     * @return ApiAppId Application ID
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set Application ID
     * @param ApiAppId Application ID
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get API ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiId API ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiId API ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiName API name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiName API name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get Service ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Service ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Service ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Binding authorization time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizedTime Binding authorization time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthorizedTime() {
        return this.AuthorizedTime;
    }

    /**
     * Set Binding authorization time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthorizedTime Binding authorization time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizedTime(String AuthorizedTime) {
        this.AuthorizedTime = AuthorizedTime;
    }

    /**
     * Get API region
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiRegion API region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiRegion() {
        return this.ApiRegion;
    }

    /**
     * Set API region
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiRegion API region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiRegion(String ApiRegion) {
        this.ApiRegion = ApiRegion;
    }

    /**
     * Get Authorized binding environment
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentName Authorized binding environment
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Authorized binding environment
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentName Authorized binding environment
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    public ApiAppApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppApiInfo(ApiAppApiInfo source) {
        if (source.ApiAppName != null) {
            this.ApiAppName = new String(source.ApiAppName);
        }
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.AuthorizedTime != null) {
            this.AuthorizedTime = new String(source.AuthorizedTime);
        }
        if (source.ApiRegion != null) {
            this.ApiRegion = new String(source.ApiRegion);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppName", this.ApiAppName);
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "AuthorizedTime", this.AuthorizedTime);
        this.setParamSimple(map, prefix + "ApiRegion", this.ApiRegion);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);

    }
}

