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

public class IPStrategyApi extends AbstractModel{

    /**
    * Unique API ID.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Custom API name.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API type. Valid values: NORMAL (general API), TSF (microservice API).
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API path, such as `/path`.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API request method, such as `GET`.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Unique ID of another policy bound to API.
    */
    @SerializedName("OtherIPStrategyId")
    @Expose
    private String OtherIPStrategyId;

    /**
    * Environment bound to API.
    */
    @SerializedName("OtherEnvironmentName")
    @Expose
    private String OtherEnvironmentName;

    /**
     * Get Unique API ID. 
     * @return ApiId Unique API ID.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID.
     * @param ApiId Unique API ID.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Custom API name. 
     * @return ApiName Custom API name.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set Custom API name.
     * @param ApiName Custom API name.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API type. Valid values: NORMAL (general API), TSF (microservice API). 
     * @return ApiType API type. Valid values: NORMAL (general API), TSF (microservice API).
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type. Valid values: NORMAL (general API), TSF (microservice API).
     * @param ApiType API type. Valid values: NORMAL (general API), TSF (microservice API).
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API path, such as `/path`. 
     * @return Path API path, such as `/path`.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API path, such as `/path`.
     * @param Path API path, such as `/path`.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API request method, such as `GET`. 
     * @return Method API request method, such as `GET`.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API request method, such as `GET`.
     * @param Method API request method, such as `GET`.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Unique ID of another policy bound to API. 
     * @return OtherIPStrategyId Unique ID of another policy bound to API.
     */
    public String getOtherIPStrategyId() {
        return this.OtherIPStrategyId;
    }

    /**
     * Set Unique ID of another policy bound to API.
     * @param OtherIPStrategyId Unique ID of another policy bound to API.
     */
    public void setOtherIPStrategyId(String OtherIPStrategyId) {
        this.OtherIPStrategyId = OtherIPStrategyId;
    }

    /**
     * Get Environment bound to API. 
     * @return OtherEnvironmentName Environment bound to API.
     */
    public String getOtherEnvironmentName() {
        return this.OtherEnvironmentName;
    }

    /**
     * Set Environment bound to API.
     * @param OtherEnvironmentName Environment bound to API.
     */
    public void setOtherEnvironmentName(String OtherEnvironmentName) {
        this.OtherEnvironmentName = OtherEnvironmentName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "OtherIPStrategyId", this.OtherIPStrategyId);
        this.setParamSimple(map, prefix + "OtherEnvironmentName", this.OtherEnvironmentName);

    }
}

