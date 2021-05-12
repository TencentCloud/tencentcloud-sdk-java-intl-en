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

public class IPStrategysStatus extends AbstractModel{

    /**
    * Number of policies.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Policy list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategySet")
    @Expose
    private IPStrategy [] StrategySet;

    /**
     * Get Number of policies.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of policies.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of policies.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of policies.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Policy list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StrategySet Policy list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IPStrategy [] getStrategySet() {
        return this.StrategySet;
    }

    /**
     * Set Policy list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StrategySet Policy list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategySet(IPStrategy [] StrategySet) {
        this.StrategySet = StrategySet;
    }

    public IPStrategysStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPStrategysStatus(IPStrategysStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StrategySet != null) {
            this.StrategySet = new IPStrategy[source.StrategySet.length];
            for (int i = 0; i < source.StrategySet.length; i++) {
                this.StrategySet[i] = new IPStrategy(source.StrategySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "StrategySet.", this.StrategySet);

    }
}

