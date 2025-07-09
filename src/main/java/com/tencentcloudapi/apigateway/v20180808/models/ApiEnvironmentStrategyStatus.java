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

public class ApiEnvironmentStrategyStatus extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 
    */
    @SerializedName("ApiEnvironmentStrategySet")
    @Expose
    private ApiEnvironmentStrategy [] ApiEnvironmentStrategySet;

    /**
     * Get  
     * @return TotalCount 
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 
     * @param TotalCount 
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get  
     * @return ApiEnvironmentStrategySet 
     */
    public ApiEnvironmentStrategy [] getApiEnvironmentStrategySet() {
        return this.ApiEnvironmentStrategySet;
    }

    /**
     * Set 
     * @param ApiEnvironmentStrategySet 
     */
    public void setApiEnvironmentStrategySet(ApiEnvironmentStrategy [] ApiEnvironmentStrategySet) {
        this.ApiEnvironmentStrategySet = ApiEnvironmentStrategySet;
    }

    public ApiEnvironmentStrategyStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiEnvironmentStrategyStatus(ApiEnvironmentStrategyStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiEnvironmentStrategySet != null) {
            this.ApiEnvironmentStrategySet = new ApiEnvironmentStrategy[source.ApiEnvironmentStrategySet.length];
            for (int i = 0; i < source.ApiEnvironmentStrategySet.length; i++) {
                this.ApiEnvironmentStrategySet[i] = new ApiEnvironmentStrategy(source.ApiEnvironmentStrategySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiEnvironmentStrategySet.", this.ApiEnvironmentStrategySet);

    }
}

