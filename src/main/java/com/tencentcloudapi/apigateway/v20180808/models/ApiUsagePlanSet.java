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

public class ApiUsagePlanSet extends AbstractModel {

    /**
    * Total number of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiUsagePlanList")
    @Expose
    private ApiUsagePlan [] ApiUsagePlanList;

    /**
     * Get Total number of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiUsagePlanList List of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApiUsagePlan [] getApiUsagePlanList() {
        return this.ApiUsagePlanList;
    }

    /**
     * Set List of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiUsagePlanList List of usage plans bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiUsagePlanList(ApiUsagePlan [] ApiUsagePlanList) {
        this.ApiUsagePlanList = ApiUsagePlanList;
    }

    public ApiUsagePlanSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiUsagePlanSet(ApiUsagePlanSet source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiUsagePlanList != null) {
            this.ApiUsagePlanList = new ApiUsagePlan[source.ApiUsagePlanList.length];
            for (int i = 0; i < source.ApiUsagePlanList.length; i++) {
                this.ApiUsagePlanList[i] = new ApiUsagePlan(source.ApiUsagePlanList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiUsagePlanList.", this.ApiUsagePlanList);

    }
}

