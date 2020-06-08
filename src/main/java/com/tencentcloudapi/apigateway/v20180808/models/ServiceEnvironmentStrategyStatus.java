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

public class ServiceEnvironmentStrategyStatus extends AbstractModel{

    /**
    * Throttling policy number.
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
     * Get Throttling policy number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Throttling policy number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Throttling policy number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Throttling policy number.
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "EnvironmentList.", this.EnvironmentList);

    }
}

