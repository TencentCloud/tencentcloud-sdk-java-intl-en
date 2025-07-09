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

public class ApiAppApiInfos extends AbstractModel {

    /**
    * Quantity
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information array of the API bound to the application
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppApiSet")
    @Expose
    private ApiAppApiInfo [] ApiAppApiSet;

    /**
     * Get Quantity 
     * @return TotalCount Quantity
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Quantity
     * @param TotalCount Quantity
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information array of the API bound to the application
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppApiSet Information array of the API bound to the application
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApiAppApiInfo [] getApiAppApiSet() {
        return this.ApiAppApiSet;
    }

    /**
     * Set Information array of the API bound to the application
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppApiSet Information array of the API bound to the application
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppApiSet(ApiAppApiInfo [] ApiAppApiSet) {
        this.ApiAppApiSet = ApiAppApiSet;
    }

    public ApiAppApiInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppApiInfos(ApiAppApiInfos source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiAppApiSet != null) {
            this.ApiAppApiSet = new ApiAppApiInfo[source.ApiAppApiSet.length];
            for (int i = 0; i < source.ApiAppApiSet.length; i++) {
                this.ApiAppApiSet[i] = new ApiAppApiInfo(source.ApiAppApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiAppApiSet.", this.ApiAppApiSet);

    }
}

