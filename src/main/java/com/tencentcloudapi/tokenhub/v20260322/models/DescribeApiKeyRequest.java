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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiKeyRequest extends AbstractModel {

    /**
    * Platform type. Currently supported values: maas.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * API Key ID. At least one of this or ApiKey is required. Prioritize ApiKeyId.
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * API key plaintext. At least one of it and ApiKeyId must be imported.
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
     * Get Platform type. Currently supported values: maas. 
     * @return Platform Platform type. Currently supported values: maas.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Platform type. Currently supported values: maas.
     * @param Platform Platform type. Currently supported values: maas.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get API Key ID. At least one of this or ApiKey is required. Prioritize ApiKeyId. 
     * @return ApiKeyId API Key ID. At least one of this or ApiKey is required. Prioritize ApiKeyId.
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set API Key ID. At least one of this or ApiKey is required. Prioritize ApiKeyId.
     * @param ApiKeyId API Key ID. At least one of this or ApiKey is required. Prioritize ApiKeyId.
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get API key plaintext. At least one of it and ApiKeyId must be imported. 
     * @return ApiKey API key plaintext. At least one of it and ApiKeyId must be imported.
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API key plaintext. At least one of it and ApiKeyId must be imported.
     * @param ApiKey API key plaintext. At least one of it and ApiKeyId must be imported.
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    public DescribeApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiKeyRequest(DescribeApiKeyRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);

    }
}

