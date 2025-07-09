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

public class ServiceEnvironmentStrategyStatus extends AbstractModel {

    /**
    * Number of throttling policies.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Throttling policy list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentList")
    @Expose
    private ServiceEnvironmentStrategy [] EnvironmentList;

    /**
     * Get Number of throttling policies.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of throttling policies.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of throttling policies.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of throttling policies.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Throttling policy list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentList Throttling policy list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ServiceEnvironmentStrategy [] getEnvironmentList() {
        return this.EnvironmentList;
    }

    /**
     * Set Throttling policy list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentList Throttling policy list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentList(ServiceEnvironmentStrategy [] EnvironmentList) {
        this.EnvironmentList = EnvironmentList;
    }

    public ServiceEnvironmentStrategyStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceEnvironmentStrategyStatus(ServiceEnvironmentStrategyStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EnvironmentList != null) {
            this.EnvironmentList = new ServiceEnvironmentStrategy[source.EnvironmentList.length];
            for (int i = 0; i < source.EnvironmentList.length; i++) {
                this.EnvironmentList[i] = new ServiceEnvironmentStrategy(source.EnvironmentList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "EnvironmentList.", this.EnvironmentList);

    }
}

