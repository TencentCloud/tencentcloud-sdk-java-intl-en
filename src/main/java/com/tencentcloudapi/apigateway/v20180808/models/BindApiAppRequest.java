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

public class BindApiAppRequest extends AbstractModel{

    /**
    * Unique ID of the application to be bound.
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * Environment to be bound.
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Unique ID of the service to be bound.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique ID of the API to be bound.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
     * Get Unique ID of the application to be bound. 
     * @return ApiAppId Unique ID of the application to be bound.
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set Unique ID of the application to be bound.
     * @param ApiAppId Unique ID of the application to be bound.
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get Environment to be bound. 
     * @return Environment Environment to be bound.
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment to be bound.
     * @param Environment Environment to be bound.
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Unique ID of the service to be bound. 
     * @return ServiceId Unique ID of the service to be bound.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be bound.
     * @param ServiceId Unique ID of the service to be bound.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique ID of the API to be bound. 
     * @return ApiId Unique ID of the API to be bound.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique ID of the API to be bound.
     * @param ApiId Unique ID of the API to be bound.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    public BindApiAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiAppRequest(BindApiAppRequest source) {
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);

    }
}

