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

public class ApiEnvironmentStrategyStataus extends AbstractModel{

    /**
    * Number of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiEnvironmentStrategySet")
    @Expose
    private ApiEnvironmentStrategy [] ApiEnvironmentStrategySet;

    /**
     * Get Number of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiEnvironmentStrategySet List of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApiEnvironmentStrategy [] getApiEnvironmentStrategySet() {
        return this.ApiEnvironmentStrategySet;
    }

    /**
     * Set List of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiEnvironmentStrategySet List of throttling policies bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiEnvironmentStrategySet(ApiEnvironmentStrategy [] ApiEnvironmentStrategySet) {
        this.ApiEnvironmentStrategySet = ApiEnvironmentStrategySet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiEnvironmentStrategySet.", this.ApiEnvironmentStrategySet);

    }
}

