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

public class ApiAppInfos extends AbstractModel{

    /**
    * Number of applications
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Application information array
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppSet")
    @Expose
    private ApiAppInfo [] ApiAppSet;

    /**
     * Get Number of applications 
     * @return TotalCount Number of applications
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of applications
     * @param TotalCount Number of applications
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Application information array
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppSet Application information array
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApiAppInfo [] getApiAppSet() {
        return this.ApiAppSet;
    }

    /**
     * Set Application information array
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppSet Application information array
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppSet(ApiAppInfo [] ApiAppSet) {
        this.ApiAppSet = ApiAppSet;
    }

    public ApiAppInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppInfos(ApiAppInfos source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiAppSet != null) {
            this.ApiAppSet = new ApiAppInfo[source.ApiAppSet.length];
            for (int i = 0; i < source.ApiAppSet.length; i++) {
                this.ApiAppSet[i] = new ApiAppInfo(source.ApiAppSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiAppSet.", this.ApiAppSet);

    }
}

