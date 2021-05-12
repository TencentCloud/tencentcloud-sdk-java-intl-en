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

public class ApiKeysStatus extends AbstractModel{

    /**
    * Number of eligible API keys.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API key list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiKeySet")
    @Expose
    private ApiKey [] ApiKeySet;

    /**
     * Get Number of eligible API keys.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of eligible API keys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible API keys.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of eligible API keys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API key list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiKeySet API key list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApiKey [] getApiKeySet() {
        return this.ApiKeySet;
    }

    /**
     * Set API key list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiKeySet API key list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiKeySet(ApiKey [] ApiKeySet) {
        this.ApiKeySet = ApiKeySet;
    }

    public ApiKeysStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKeysStatus(ApiKeysStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiKeySet != null) {
            this.ApiKeySet = new ApiKey[source.ApiKeySet.length];
            for (int i = 0; i < source.ApiKeySet.length; i++) {
                this.ApiKeySet[i] = new ApiKey(source.ApiKeySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiKeySet.", this.ApiKeySet);

    }
}

