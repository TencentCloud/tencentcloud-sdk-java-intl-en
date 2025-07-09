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

public class UpdateApiAppKeyRequest extends AbstractModel {

    /**
    * Unique application ID.
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * Application Key.
    */
    @SerializedName("ApiAppKey")
    @Expose
    private String ApiAppKey;

    /**
    * Application Secret.
    */
    @SerializedName("ApiAppSecret")
    @Expose
    private String ApiAppSecret;

    /**
     * Get Unique application ID. 
     * @return ApiAppId Unique application ID.
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set Unique application ID.
     * @param ApiAppId Unique application ID.
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get Application Key. 
     * @return ApiAppKey Application Key.
     */
    public String getApiAppKey() {
        return this.ApiAppKey;
    }

    /**
     * Set Application Key.
     * @param ApiAppKey Application Key.
     */
    public void setApiAppKey(String ApiAppKey) {
        this.ApiAppKey = ApiAppKey;
    }

    /**
     * Get Application Secret. 
     * @return ApiAppSecret Application Secret.
     */
    public String getApiAppSecret() {
        return this.ApiAppSecret;
    }

    /**
     * Set Application Secret.
     * @param ApiAppSecret Application Secret.
     */
    public void setApiAppSecret(String ApiAppSecret) {
        this.ApiAppSecret = ApiAppSecret;
    }

    public UpdateApiAppKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApiAppKeyRequest(UpdateApiAppKeyRequest source) {
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiAppKey != null) {
            this.ApiAppKey = new String(source.ApiAppKey);
        }
        if (source.ApiAppSecret != null) {
            this.ApiAppSecret = new String(source.ApiAppSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiAppKey", this.ApiAppKey);
        this.setParamSimple(map, prefix + "ApiAppSecret", this.ApiAppSecret);

    }
}

