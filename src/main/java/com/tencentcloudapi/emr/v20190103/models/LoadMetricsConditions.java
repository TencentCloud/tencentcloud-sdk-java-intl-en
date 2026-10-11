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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadMetricsConditions extends AbstractModel {

    /**
    * Rule trigger condition.
    */
    @SerializedName("LoadMetrics")
    @Expose
    private LoadMetricsCondition [] LoadMetrics;

    /**
    * 0: All conditions are met.
1: Any one of the conditions is met.
    */
    @SerializedName("Match")
    @Expose
    private Long Match;

    /**
     * Get Rule trigger condition. 
     * @return LoadMetrics Rule trigger condition.
     */
    public LoadMetricsCondition [] getLoadMetrics() {
        return this.LoadMetrics;
    }

    /**
     * Set Rule trigger condition.
     * @param LoadMetrics Rule trigger condition.
     */
    public void setLoadMetrics(LoadMetricsCondition [] LoadMetrics) {
        this.LoadMetrics = LoadMetrics;
    }

    /**
     * Get 0: All conditions are met.
1: Any one of the conditions is met. 
     * @return Match 0: All conditions are met.
1: Any one of the conditions is met.
     */
    public Long getMatch() {
        return this.Match;
    }

    /**
     * Set 0: All conditions are met.
1: Any one of the conditions is met.
     * @param Match 0: All conditions are met.
1: Any one of the conditions is met.
     */
    public void setMatch(Long Match) {
        this.Match = Match;
    }

    public LoadMetricsConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadMetricsConditions(LoadMetricsConditions source) {
        if (source.LoadMetrics != null) {
            this.LoadMetrics = new LoadMetricsCondition[source.LoadMetrics.length];
            for (int i = 0; i < source.LoadMetrics.length; i++) {
                this.LoadMetrics[i] = new LoadMetricsCondition(source.LoadMetrics[i]);
            }
        }
        if (source.Match != null) {
            this.Match = new Long(source.Match);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LoadMetrics.", this.LoadMetrics);
        this.setParamSimple(map, prefix + "Match", this.Match);

    }
}

