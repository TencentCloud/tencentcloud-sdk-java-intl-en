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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiEnvironmentStrategy extends AbstractModel {

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
    * API path, such as `/path`.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API method, such as `GET`.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Environment throttling information.
    */
    @SerializedName("EnvironmentStrategySet")
    @Expose
    private EnvironmentStrategy [] EnvironmentStrategySet;

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
     * Get API method, such as `GET`. 
     * @return Method API method, such as `GET`.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API method, such as `GET`.
     * @param Method API method, such as `GET`.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Environment throttling information. 
     * @return EnvironmentStrategySet Environment throttling information.
     */
    public EnvironmentStrategy [] getEnvironmentStrategySet() {
        return this.EnvironmentStrategySet;
    }

    /**
     * Set Environment throttling information.
     * @param EnvironmentStrategySet Environment throttling information.
     */
    public void setEnvironmentStrategySet(EnvironmentStrategy [] EnvironmentStrategySet) {
        this.EnvironmentStrategySet = EnvironmentStrategySet;
    }

    public ApiEnvironmentStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiEnvironmentStrategy(ApiEnvironmentStrategy source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.EnvironmentStrategySet != null) {
            this.EnvironmentStrategySet = new EnvironmentStrategy[source.EnvironmentStrategySet.length];
            for (int i = 0; i < source.EnvironmentStrategySet.length; i++) {
                this.EnvironmentStrategySet[i] = new EnvironmentStrategy(source.EnvironmentStrategySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArrayObj(map, prefix + "EnvironmentStrategySet.", this.EnvironmentStrategySet);

    }
}

